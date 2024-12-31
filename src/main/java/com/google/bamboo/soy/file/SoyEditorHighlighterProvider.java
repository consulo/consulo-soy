package com.google.bamboo.soy.file;

import com.google.bamboo.soy.insight.highlight.SoyLayeredHighlighter;
import consulo.annotation.component.ExtensionImpl;
import consulo.codeEditor.EditorHighlighter;
import consulo.colorScheme.EditorColorsScheme;
import consulo.language.editor.highlight.EditorHighlighterProvider;
import consulo.project.Project;
import consulo.virtualFileSystem.VirtualFile;
import consulo.virtualFileSystem.fileType.FileType;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

/**
 * @author VISTALL
 * @since 2019-02-26
 */
@ExtensionImpl
public class SoyEditorHighlighterProvider implements EditorHighlighterProvider {
  @Override
  public EditorHighlighter getEditorHighlighter(@Nullable Project project,
                                                @Nonnull FileType fileType,
                                                @Nullable VirtualFile virtualFile,
                                                @Nonnull EditorColorsScheme colors) {
    return new SoyLayeredHighlighter(project, virtualFile, colors);
  }

  @Nonnull
  @Override
  public FileType getFileType() {
    return SoyFileType.INSTANCE;
  }
}
