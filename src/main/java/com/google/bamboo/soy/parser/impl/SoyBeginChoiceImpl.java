// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import consulo.language.ast.ASTNode;

import com.google.bamboo.soy.parser.*;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import consulo.language.psi.PsiElementVisitor;
import consulo.language.psi.util.PsiTreeUtil;

public class SoyBeginChoiceImpl extends ASTWrapperPsiElement implements SoyBeginChoice {

  public SoyBeginChoiceImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitBeginChoice(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SoyAttributeKeyValuePair getAttributeKeyValuePair() {
    return PsiTreeUtil.getChildOfType(this, SoyAttributeKeyValuePair.class);
  }

  @Override
  @Nullable
  public SoyExpr getExpr() {
    return PsiTreeUtil.getChildOfType(this, SoyExpr.class);
  }

}
