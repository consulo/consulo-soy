package com.google.bamboo.soy.insight.structure;

import com.google.bamboo.soy.elements.CallStatementElement;
import com.google.bamboo.soy.elements.ParamElement;
import com.google.bamboo.soy.file.SoyFile;
import com.google.bamboo.soy.parser.SoyLetCompoundStatement;
import com.google.bamboo.soy.parser.SoyLetSingleStatement;
import com.google.bamboo.soy.parser.SoyMsgStatement;
import com.google.bamboo.soy.parser.SoyTemplateBlock;
import consulo.codeEditor.Editor;
import consulo.fileEditor.structureView.StructureViewModel;
import consulo.fileEditor.structureView.StructureViewTreeElement;
import consulo.language.editor.structureView.PsiTreeElementBase;
import consulo.language.editor.structureView.TextEditorBasedStructureViewModel;
import consulo.language.psi.PsiElement;

import jakarta.annotation.Nonnull;

/**
 * from kotlin
 */
public class SoyStructureViewModel extends TextEditorBasedStructureViewModel implements StructureViewModel.ElementInfoProvider {
  protected SoyStructureViewModel(SoyFile file, Editor editor) {
    super(editor, file);
  }

  @Nonnull
  @Override
  public StructureViewTreeElement getRoot() {
    return getTreeElement(getPsiFile());
  }

  static PsiTreeElementBase<?> getTreeElement(PsiElement psiElement) {
    if (psiElement instanceof CallStatementElement) {
      return new CallTreeElement((CallStatementElement)psiElement);
    }
    else if (psiElement instanceof SoyLetCompoundStatement) {
      return new LetCompoundTreeElement((SoyLetCompoundStatement)psiElement);
    }
    else if (psiElement instanceof SoyLetSingleStatement) {
      return new LetSingleTreeElement((SoyLetSingleStatement)psiElement);
    }
    else if (psiElement instanceof ParamElement) {
      return new ParamTreeElement((ParamElement)psiElement);
    }
    else if (psiElement instanceof SoyTemplateBlock) {
      return new TemplateTreeElement((SoyTemplateBlock)psiElement);
    }
    else if (psiElement instanceof SoyFile) {
      return new FileTreeElement((SoyFile)psiElement);
    }
    else if (psiElement instanceof SoyMsgStatement) {
      return new MsgTreeElement((SoyMsgStatement)psiElement);
    }
    else {
      return new BaseTreeElement<>(psiElement);
    }
  }

  @Override
  public boolean isAlwaysShowsPlus(StructureViewTreeElement structureViewTreeElement) {
    return false;
  }

  @Override
  public boolean isAlwaysLeaf(StructureViewTreeElement structureViewTreeElement) {
    return false;
  }
}
