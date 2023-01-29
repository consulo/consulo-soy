// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiElementVisitor;

import static com.google.bamboo.soy.parser.SoyTypes.*;

import consulo.language.ast.ASTNode;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import com.google.bamboo.soy.parser.*;

public class SoyFunctionIdentifierImpl extends ASTWrapperPsiElement implements SoyFunctionIdentifier {

  public SoyFunctionIdentifierImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitFunctionIdentifier(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getIdentifierWord() {
    return findChildByType(IDENTIFIER_WORD);
  }

}
