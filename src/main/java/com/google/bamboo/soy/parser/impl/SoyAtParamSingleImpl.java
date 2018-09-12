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
import com.google.bamboo.soy.elements.impl.AtParamMixin;
import com.google.bamboo.soy.parser.*;
import com.google.bamboo.soy.stubs.AtParamStub;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;

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
