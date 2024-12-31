// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import jakarta.annotation.Nonnull;

import consulo.language.psi.PsiElement;

import static com.google.bamboo.soy.parser.SoyTypes.*;

import com.google.bamboo.soy.parser.*;
import consulo.language.ast.ASTNode;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import consulo.language.psi.PsiElementVisitor;

public class SoyXidStatementImpl extends ASTWrapperPsiElement implements SoyXidStatement {

  public SoyXidStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitXidStatement(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nonnull
  public PsiElement getCssXidIdentifier() {
    return notNullChild(findChildByType(CSS_XID_IDENTIFIER));
  }

}
