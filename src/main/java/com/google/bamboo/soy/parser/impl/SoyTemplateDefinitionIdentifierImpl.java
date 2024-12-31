// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import jakarta.annotation.Nonnull;

import consulo.language.psi.PsiElement;

import static com.google.bamboo.soy.parser.SoyTypes.*;
import com.google.bamboo.soy.elements.impl.TemplateDefinitionMixin;
import com.google.bamboo.soy.parser.*;
import com.google.bamboo.soy.stubs.TemplateDefinitionStub;
import consulo.language.ast.IElementType;
import consulo.language.ast.ASTNode;
import consulo.language.psi.PsiElementVisitor;
import consulo.language.psi.stub.IStubElementType;

public class SoyTemplateDefinitionIdentifierImpl extends TemplateDefinitionMixin implements SoyTemplateDefinitionIdentifier {

  public SoyTemplateDefinitionIdentifierImpl(TemplateDefinitionStub stub, IStubElementType type) {
    super(stub, type);
  }

  public SoyTemplateDefinitionIdentifierImpl(ASTNode node) {
    super(node);
  }

  public SoyTemplateDefinitionIdentifierImpl(TemplateDefinitionStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitTemplateDefinitionIdentifier(this);
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
