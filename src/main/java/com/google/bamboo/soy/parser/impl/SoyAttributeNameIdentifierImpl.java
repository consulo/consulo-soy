// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import consulo.language.psi.PsiElement;

import static com.google.bamboo.soy.parser.SoyTypes.*;

import consulo.language.ast.ASTNode;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import com.google.bamboo.soy.parser.*;
import consulo.language.psi.PsiElementVisitor;

public class SoyAttributeNameIdentifierImpl extends ASTWrapperPsiElement implements SoyAttributeNameIdentifier {

  public SoyAttributeNameIdentifierImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitAttributeNameIdentifier(this);
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
