// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import jakarta.annotation.Nullable;
import jakarta.annotation.Nonnull;

import consulo.language.psi.util.PsiTreeUtil;

import com.google.bamboo.soy.parser.*;
import consulo.language.ast.ASTNode;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import consulo.language.psi.PsiElementVisitor;

public class SoyBeginForImpl extends ASTWrapperPsiElement implements SoyBeginFor {

  public SoyBeginForImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitBeginFor(this);
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

  @Override
  @Nullable
  public SoyVariableDefinitionIdentifier getVariableDefinitionIdentifier() {
    return PsiTreeUtil.getChildOfType(this, SoyVariableDefinitionIdentifier.class);
  }

}
