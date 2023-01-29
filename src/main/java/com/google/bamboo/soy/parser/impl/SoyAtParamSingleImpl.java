// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import consulo.language.ast.ASTNode;
import consulo.language.ast.IElementType;
import consulo.language.psi.PsiElementVisitor;
import consulo.language.psi.util.PsiTreeUtil;
import com.google.bamboo.soy.elements.impl.AtParamMixin;
import com.google.bamboo.soy.parser.*;
import com.google.bamboo.soy.stubs.AtParamStub;
import consulo.language.psi.stub.IStubElementType;

public class SoyAtParamSingleImpl extends AtParamMixin implements SoyAtParamSingle {

  public SoyAtParamSingleImpl(AtParamStub stub, IStubElementType type) {
    super(stub, type);
  }

  public SoyAtParamSingleImpl(ASTNode node) {
    super(node);
  }

  public SoyAtParamSingleImpl(AtParamStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitAtParamSingle(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SoyParamDefinitionIdentifier getParamDefinitionIdentifier() {
    return PsiTreeUtil.getChildOfType(this, SoyParamDefinitionIdentifier.class);
  }

  @Override
  @Nullable
  public SoyTypeExpression getTypeExpression() {
    return PsiTreeUtil.getChildOfType(this, SoyTypeExpression.class);
  }

}
