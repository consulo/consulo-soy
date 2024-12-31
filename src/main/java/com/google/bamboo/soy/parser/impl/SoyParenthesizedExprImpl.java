// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import jakarta.annotation.Nullable;
import jakarta.annotation.Nonnull;
import consulo.language.ast.ASTNode;
import consulo.language.psi.PsiElementVisitor;
import consulo.language.psi.util.PsiTreeUtil;
import com.google.bamboo.soy.parser.*;

public class SoyParenthesizedExprImpl extends SoyExprImpl implements SoyParenthesizedExpr {

  public SoyParenthesizedExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitParenthesizedExpr(this);
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
