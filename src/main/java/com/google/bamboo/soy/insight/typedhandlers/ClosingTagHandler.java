// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.bamboo.soy.insight.typedhandlers;

import com.google.bamboo.soy.elements.TagBlockElement;
import com.google.bamboo.soy.parser.SoyChoiceClause;
import consulo.annotation.component.ExtensionImpl;
import consulo.codeEditor.Editor;
import consulo.document.Document;
import consulo.language.codeStyle.CodeStyleManager;
import consulo.language.editor.action.TypedHandlerDelegate;
import consulo.language.psi.PsiDocumentManager;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiFile;
import consulo.language.psi.util.PsiTreeUtil;
import consulo.project.Project;

import javax.annotation.Nonnull;

/**
 * Automatically inserts a matching closing tag when "{/" is typed.
 */
@ExtensionImpl
public class ClosingTagHandler extends TypedHandlerDelegate {

  private static boolean isMatchForClosingTag(@Nonnull Editor editor, char charTyped) {
    return charTyped == '/'
      && editor.getCaretModel().getOffset() >= 2
      && editor.getDocument().getCharsSequence().charAt(editor.getCaretModel().getOffset() - 2)
      == '{';
  }

  private static void insertClosingTag(@Nonnull Editor editor, int offset, String tag) {
    Document document = editor.getDocument();
    CharSequence charSequence = document.getImmutableCharSequence();
    int startPosition = offset - 1;
    // Consume second left brace if present.
    if (offset > 0 && charSequence.charAt(startPosition - 1) == '{') {
      startPosition--;
    }
    int endPosition = offset;
    // Consume at most 2 right braces if present.
    while (endPosition < charSequence.length() && charSequence.charAt(endPosition) == '}' && endPosition < offset + 2) {
      endPosition++;
    }
    editor.getDocument().replaceString(startPosition, endPosition, tag);
    editor.getCaretModel().moveToOffset(startPosition + tag.length());

  }

  @Nonnull
  @Override
  public Result charTyped(char c, @Nonnull Project project, @Nonnull Editor editor, @Nonnull PsiFile file) {
    if (isMatchForClosingTag(editor, c)) {
      int offset = editor.getCaretModel().getOffset();

      PsiElement el = file.findElementAt(offset - 1);
      TagBlockElement block = (TagBlockElement)PsiTreeUtil
        .findFirstParent(el,
                         parent -> parent instanceof TagBlockElement && !(parent instanceof SoyChoiceClause));
      if (block == null) {
        return Result.CONTINUE;
      }
      String closingTag = block.getOpeningTag().generateClosingTag();
      insertClosingTag(editor, offset, closingTag);
      if (editor.getProject() != null) {
        PsiDocumentManager.getInstance(editor.getProject()).commitDocument(editor.getDocument());
        CodeStyleManager.getInstance(editor.getProject()).reformat(block);
      }
    }

    return Result.CONTINUE;
  }
}
