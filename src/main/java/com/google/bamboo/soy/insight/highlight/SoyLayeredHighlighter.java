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

package com.google.bamboo.soy.insight.highlight;

import static com.google.bamboo.soy.parser.SoyTypes.OTHER;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

import com.google.bamboo.soy.SoyLanguage;
import consulo.language.Language;
import consulo.colorScheme.EditorColorsScheme;
import consulo.language.editor.highlight.LayerDescriptor;
import consulo.language.editor.highlight.LayeredLexerEditorHighlighter;
import consulo.virtualFileSystem.fileType.FileType;
import consulo.language.plain.PlainTextFileType;
import consulo.language.editor.highlight.SyntaxHighlighter;
import consulo.language.editor.highlight.SyntaxHighlighterFactory;
import consulo.project.Project;
import consulo.virtualFileSystem.VirtualFile;
import consulo.language.template.TemplateDataLanguageMappings;

public class SoyLayeredHighlighter extends LayeredLexerEditorHighlighter {
  public SoyLayeredHighlighter(
      @Nullable Project project,
      @Nullable VirtualFile virtualFile,
      @Nonnull EditorColorsScheme colors) {
    // Creating main highlighter.
    super(new SoySyntaxHighlighter(), colors);

    // Highlighter for the outer language.
    FileType type = null;
    if (project == null || virtualFile == null) {
      type = PlainTextFileType.INSTANCE;
    } else {
      Language language = TemplateDataLanguageMappings.getInstance(project).getMapping(virtualFile);
      if (language != null) type = language.getAssociatedFileType();
      if (type == null) type = SoyLanguage.getDefaultTemplateLang();
    }

    SyntaxHighlighter outerHighlighter =
        SyntaxHighlighterFactory.getSyntaxHighlighter(type, project, virtualFile);

    registerLayer(OTHER, new LayerDescriptor(outerHighlighter, ""));
  }
}
