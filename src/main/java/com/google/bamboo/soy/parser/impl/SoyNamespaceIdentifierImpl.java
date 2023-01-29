// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import javax.annotation.Nonnull;
import consulo.language.ast.ASTNode;

import static com.google.bamboo.soy.parser.SoyTypes.*;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import com.google.bamboo.soy.parser.*;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiElementVisitor;

public class SoyNamespaceIdentifierImpl extends ASTWrapperPsiElement implements SoyNamespaceIdentifier {

  public SoyNamespaceIdentifierImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitNamespaceIdentifier(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nonnull
  public PsiElement getQualifiedIdentifier() {
    return notNullChild(findChildByType(QUALIFIED_IDENTIFIER));
  }

}
