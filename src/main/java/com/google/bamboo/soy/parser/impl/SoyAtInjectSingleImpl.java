// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import jakarta.annotation.Nullable;
import jakarta.annotation.Nonnull;
import consulo.language.ast.ASTNode;

import com.google.bamboo.soy.elements.impl.AtInjectMixin;
import com.google.bamboo.soy.parser.*;
import consulo.language.psi.PsiElementVisitor;
import consulo.language.psi.util.PsiTreeUtil;

public class SoyAtInjectSingleImpl extends AtInjectMixin implements SoyAtInjectSingle {

  public SoyAtInjectSingleImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitAtInjectSingle(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SoyParamDefinitionIdentifier getParamDefinitionIdentifier() {
    return PsiTreeUtil.getChildOfType(this, SoyParamDefinitionIdentifier.class);
  }

  @Override
  @Nullable
  public SoyTypeExpression getTypeExpression() {
    return PsiTreeUtil.getChildOfType(this, SoyTypeExpression.class);
  }

}
