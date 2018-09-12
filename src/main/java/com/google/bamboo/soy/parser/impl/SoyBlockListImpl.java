// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.google.bamboo.soy.parser.SoyTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.google.bamboo.soy.parser.*;

public class SoyBlockListImpl extends ASTWrapperPsiElement implements SoyBlockList {

  public SoyBlockListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitBlockList(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nonnull
  public List<SoyAliasBlock> getAliasBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyAliasBlock.class);
  }

  @Override
  @Nonnull
  public List<SoyCatchallBraces> getCatchallBracesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyCatchallBraces.class);
  }

  @Override
  @Nonnull
  public List<SoyDelegatePackageBlock> getDelegatePackageBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyDelegatePackageBlock.class);
  }

  @Override
  @Nonnull
  public List<SoyNamespaceBlock> getNamespaceBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyNamespaceBlock.class);
  }

  @Override
  @Nonnull
  public List<SoyTemplateBlock> getTemplateBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyTemplateBlock.class);
  }

}
