package com.google.bamboo.soy.insight.structure;

import com.google.bamboo.soy.SoyLanguage;
import com.google.bamboo.soy.file.SoyFile;
import consulo.annotation.component.ExtensionImpl;
import consulo.codeEditor.Editor;
import consulo.fileEditor.structureView.StructureViewBuilder;
import consulo.fileEditor.structureView.StructureViewModel;
import consulo.fileEditor.structureView.TreeBasedStructureViewBuilder;
import consulo.language.Language;
import consulo.language.editor.structureView.PsiStructureViewFactory;
import consulo.language.editor.structureView.TemplateLanguageStructureViewBuilder;
import consulo.language.psi.PsiFile;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * from kotlin
 */
@ExtensionImpl
public class SoyStructureViewFactory implements PsiStructureViewFactory {
  @Nullable
  @Override
  public StructureViewBuilder getStructureViewBuilder(PsiFile psiFile) {
    return new TemplateLanguageStructureViewBuilder(psiFile) {
      @Nullable
      @Override
      protected TreeBasedStructureViewBuilder createMainBuilder(@Nonnull PsiFile psiFile) {
        return new TreeBasedStructureViewBuilder() {
          @Nonnull
          @Override
          public StructureViewModel createStructureViewModel(@Nullable Editor editor) {
            return new SoyStructureViewModel((SoyFile)psiFile, editor);
          }
        };
      }
    };
  }

  @Nonnull
  @Override
  public Language getLanguage() {
    return SoyLanguage.INSTANCE;
  }
}
