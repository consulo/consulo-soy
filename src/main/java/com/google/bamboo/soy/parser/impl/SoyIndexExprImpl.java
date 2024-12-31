// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import jakarta.annotation.Nullable;
import jakarta.annotation.Nonnull;
import consulo.language.ast.ASTNode;

import com.google.bamboo.soy.parser.*;
import consulo.language.psi.PsiElementVisitor;
import consulo.language.psi.util.PsiTreeUtil;

public class SoyIndexExprImpl extends SoyExprImpl implements SoyIndexExpr {

  public SoyIndexExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitIndexExpr(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SoyCommaSeparatedExpressionList getCommaSeparatedExpressionList() {
    return PsiTreeUtil.getChildOfType(this, SoyCommaSeparatedExpressionList.class);
  }

  @Override
  @Nonnull
  public SoyExpr getExpr() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, SoyExpr.class));
  }

}
