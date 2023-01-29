// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import consulo.language.psi.PsiElementVisitor;
import consulo.language.psi.util.PsiTreeUtil;
import com.google.bamboo.soy.parser.*;
import consulo.language.ast.ASTNode;

public class SoyUnaryExprImpl extends SoyExprImpl implements SoyUnaryExpr {

  public SoyUnaryExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitUnaryExpr(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SoyExpr getExpr() {
    return PsiTreeUtil.getChildOfType(this, SoyExpr.class);
  }

}
