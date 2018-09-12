// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.google.bamboo.soy.parser.SoyTypes.*;
import com.google.bamboo.soy.elements.impl.NamespaceDeclarationMixin;
import com.google.bamboo.soy.parser.*;
import com.google.bamboo.soy.stubs.NamespaceDeclarationStub;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;

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
