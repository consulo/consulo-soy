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
import com.google.bamboo.soy.elements.impl.TemplateDefinitionMixin;
import com.google.bamboo.soy.parser.*;
import com.google.bamboo.soy.stubs.TemplateDefinitionStub;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;

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
