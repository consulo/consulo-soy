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

package com.google.bamboo.soy.insight.documentation;

import com.google.bamboo.soy.SoyLanguage;
import com.google.bamboo.soy.elements.TagElement;
import com.google.bamboo.soy.parser.SoyTypes;
import consulo.annotation.component.ExtensionImpl;
import consulo.document.Document;
import consulo.document.FileDocumentManager;
import consulo.language.Language;
import consulo.language.editor.documentation.LanguageDocumentationProvider;
import consulo.language.psi.PsiComment;
import consulo.language.psi.PsiElement;
import consulo.language.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.Contract;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@ExtensionImpl
public class SoyDocumentationProvider implements LanguageDocumentationProvider {

  private static int MAX_COMMENT_PREVIEW_LENGTH = 96;

  private static String uncommentify(@Nonnull String docComment) {
    return docComment
        .replaceFirst("^/\\*[\\*\\n\\r\\t ]*", "")
        .replaceAll("[ \\t\\n\\r\\*]*\\*/$", "")
        .replaceAll("\n[\\t\\n\\r\\* ]*", "\n");
  }

  private static String produceCommentPreview(@Nonnull String docComment) {
    String preview = uncommentify(docComment);
    // Drop everything starting from the first @param.
    int firstAtParam = preview.indexOf("@param");
    if (firstAtParam != -1) {
      preview = preview.substring(0, firstAtParam);
    }
    // Drop newlines.
    preview = preview.replaceAll("[\\n\\r\\f\\t ]+", " ");

    if (preview.length() > MAX_COMMENT_PREVIEW_LENGTH) {
      preview = preview.substring(0, Math.min(preview.length(), MAX_COMMENT_PREVIEW_LENGTH));

      int lastSpaceIndex = preview.lastIndexOf(" ");
      // If this comment is entirely without whitespaces then it's a weird one so let's just return
      // with it.
      if (lastSpaceIndex == -1) {
        return preview;
      }

      // If the last space is not at the end of the truncated part, then drop the partial word at
      // end of the preview text.
      if (lastSpaceIndex != preview.length() - 1) {
        preview = preview.substring(0, lastSpaceIndex);
      }

      // If there is any sentence-delimiting punctuation in the preview then let's truncate after
      // the first one.
      Matcher endTokenMatcher = Pattern.compile("[:;.?!]").matcher(preview);
      if (endTokenMatcher.matches()) {
        preview = preview.substring(0, endTokenMatcher.start() + 1);
      }
      preview = preview + " [...]";
    }
    return preview;
  }

  @Contract("null -> false")
  private static boolean isDocComment(PsiElement element) {
    return element instanceof PsiComment
        && ((PsiComment) element).getTokenType().equals(SoyTypes.DOC_COMMENT_BLOCK);
  }

  @Nullable
  private static String getDocCommentForEnclosingTag(PsiElement element) {
    PsiElement parentTag = PsiTreeUtil.findFirstParent(element, TagElement.class::isInstance);
    return PsiTreeUtil.getChildrenOfTypeAsList(parentTag, PsiComment.class)
                                                .stream()
                                                .filter(SoyDocumentationProvider::isDocComment)
                                                .findFirst()
                                                .map(PsiElement::getText)
                                                .orElse(null);
  }

  @Nullable
  @Override
  public String getQuickNavigateInfo(PsiElement element, PsiElement originalElement) {
    Document document =
        FileDocumentManager.getInstance().getDocument(element.getContainingFile().getVirtualFile());
    if (document == null) return "";

    int lineNum = document.getLineNumber(element.getTextOffset()) + 1 /* count starts at zero */;
    String path = element.getContainingFile().getVirtualFile().getName();
    StringBuilder navigateInfo = new StringBuilder("Defined at ");
    navigateInfo.append(path);
    navigateInfo.append(":");
    navigateInfo.append(lineNum);
    String optDoc = getDocCommentForEnclosingTag(element);
    if (optDoc != null) {
      navigateInfo.append("\n");
      navigateInfo.append(produceCommentPreview(optDoc));
    }
    return navigateInfo.toString();
  }

  @Nonnull
  @Override
  public Language getLanguage() {
    return SoyLanguage.INSTANCE;
  }
}
