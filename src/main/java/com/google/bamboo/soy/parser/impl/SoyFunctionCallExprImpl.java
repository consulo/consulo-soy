// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import consulo.language.ast.ASTNode;

import com.google.bamboo.soy.parser.*;
import consulo.language.psi.PsiElementVisitor;
import consulo.language.psi.util.PsiTreeUtil;

public class SoyFunctionCallExprImpl extends SoyExprImpl implements SoyFunctionCallExpr {

  public SoyFunctionCallExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitFunctionCallExpr(this);
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
  public SoyFunctionIdentifier getFunctionIdentifier() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, SoyFunctionIdentifier.class));
  }

}
