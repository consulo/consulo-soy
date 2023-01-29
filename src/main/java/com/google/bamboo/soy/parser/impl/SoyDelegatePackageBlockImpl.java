// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.google.bamboo.soy.parser.*;
import consulo.language.ast.ASTNode;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import consulo.language.psi.PsiElementVisitor;
import consulo.language.psi.util.PsiTreeUtil;

public class SoyDelegatePackageBlockImpl extends ASTWrapperPsiElement implements SoyDelegatePackageBlock {

  public SoyDelegatePackageBlockImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitDelegatePackageBlock(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SoyPackageIdentifier getPackageIdentifier() {
    return PsiTreeUtil.getChildOfType(this, SoyPackageIdentifier.class);
  }

}
