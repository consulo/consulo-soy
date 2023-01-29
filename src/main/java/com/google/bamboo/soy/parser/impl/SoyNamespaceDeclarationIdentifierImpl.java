// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import javax.annotation.Nonnull;
import consulo.language.ast.ASTNode;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiElementVisitor;

import static com.google.bamboo.soy.parser.SoyTypes.*;
import com.google.bamboo.soy.elements.impl.NamespaceDeclarationMixin;
import com.google.bamboo.soy.parser.*;
import com.google.bamboo.soy.stubs.NamespaceDeclarationStub;
import consulo.language.ast.IElementType;
import consulo.language.psi.stub.IStubElementType;

public class SoyNamespaceDeclarationIdentifierImpl extends NamespaceDeclarationMixin implements SoyNamespaceDeclarationIdentifier {

  public SoyNamespaceDeclarationIdentifierImpl(NamespaceDeclarationStub stub, IStubElementType type) {
    super(stub, type);
  }

  public SoyNamespaceDeclarationIdentifierImpl(ASTNode node) {
    super(node);
  }

  public SoyNamespaceDeclarationIdentifierImpl(NamespaceDeclarationStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitNamespaceDeclarationIdentifier(this);
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
