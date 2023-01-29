// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import consulo.language.ast.ASTNode;
import consulo.language.psi.PsiElementVisitor;
import consulo.language.psi.util.PsiTreeUtil;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import com.google.bamboo.soy.parser.*;

public class SoyAttributeKeyValuePairImpl extends ASTWrapperPsiElement implements SoyAttributeKeyValuePair {

  public SoyAttributeKeyValuePairImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitAttributeKeyValuePair(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SoyAnyStringLiteral getAnyStringLiteral() {
    return PsiTreeUtil.getChildOfType(this, SoyAnyStringLiteral.class);
  }

  @Override
  @Nonnull
  public SoyAttributeNameIdentifier getAttributeNameIdentifier() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, SoyAttributeNameIdentifier.class));
  }

}
