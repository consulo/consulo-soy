// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.google.bamboo.soy.parser.*;
import consulo.language.ast.ASTNode;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import consulo.language.psi.PsiElementVisitor;
import consulo.language.psi.util.PsiTreeUtil;

public class SoyUnionTypeImpl extends ASTWrapperPsiElement implements SoyUnionType {

  public SoyUnionTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitUnionType(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SoyCompoundType getCompoundType() {
    return PsiTreeUtil.getChildOfType(this, SoyCompoundType.class);
  }

  @Override
  @Nullable
  public SoyPrimitiveType getPrimitiveType() {
    return PsiTreeUtil.getChildOfType(this, SoyPrimitiveType.class);
  }

  @Override
  @Nullable
  public SoyTypeExpression getTypeExpression() {
    return PsiTreeUtil.getChildOfType(this, SoyTypeExpression.class);
  }

}
