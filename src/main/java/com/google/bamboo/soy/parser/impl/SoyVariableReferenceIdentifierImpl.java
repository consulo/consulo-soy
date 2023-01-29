// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import consulo.language.ast.ASTNode;
import consulo.language.psi.PsiElementVisitor;

import static com.google.bamboo.soy.parser.SoyTypes.*;
import com.google.bamboo.soy.elements.impl.IdentifierMixin;
import com.google.bamboo.soy.parser.*;
import consulo.language.psi.PsiElement;

public class SoyVariableReferenceIdentifierImpl extends IdentifierMixin implements SoyVariableReferenceIdentifier {

  public SoyVariableReferenceIdentifierImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitVariableReferenceIdentifier(this);
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
