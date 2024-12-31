// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import java.util.List;
import jakarta.annotation.Nonnull;
import consulo.language.ast.ASTNode;
import consulo.language.psi.util.PsiTreeUtil;

import com.google.bamboo.soy.parser.*;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import consulo.language.psi.PsiElementVisitor;

public class SoyKeyValueImpl extends ASTWrapperPsiElement implements SoyKeyValue {

  public SoyKeyValueImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitKeyValue(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nonnull
  public List<SoyExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyExpr.class);
  }

}
