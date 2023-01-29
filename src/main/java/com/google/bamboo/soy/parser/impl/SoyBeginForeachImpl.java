// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import consulo.language.ast.ASTNode;
import consulo.language.psi.PsiElementVisitor;

import consulo.language.impl.psi.ASTWrapperPsiElement;
import com.google.bamboo.soy.parser.*;
import consulo.language.psi.util.PsiTreeUtil;

public class SoyBeginForeachImpl extends ASTWrapperPsiElement implements SoyBeginForeach {

  public SoyBeginForeachImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitBeginForeach(this);
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
