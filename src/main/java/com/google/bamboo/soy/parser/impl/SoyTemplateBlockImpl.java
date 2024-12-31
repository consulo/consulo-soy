// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import java.util.List;
import jakarta.annotation.Nullable;
import jakarta.annotation.Nonnull;
import consulo.language.ast.ASTNode;
import consulo.language.psi.PsiElementVisitor;
import consulo.language.psi.util.PsiTreeUtil;
import com.google.bamboo.soy.elements.impl.TemplateBlockMixin;
import com.google.bamboo.soy.parser.*;
import com.google.bamboo.soy.stubs.TemplateBlockStub;
import consulo.language.ast.IElementType;
import consulo.language.psi.stub.IStubElementType;

public class SoyTemplateBlockImpl extends TemplateBlockMixin implements SoyTemplateBlock {

  public SoyTemplateBlockImpl(TemplateBlockStub stub, IStubElementType type) {
    super(stub, type);
  }

  public SoyTemplateBlockImpl(ASTNode node) {
    super(node);
  }

  public SoyTemplateBlockImpl(TemplateBlockStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitTemplateBlock(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nonnull
  public List<SoyAtInjectSingle> getAtInjectSingleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyAtInjectSingle.class);
  }

  @Override
  @Nonnull
  public List<SoyAtParamSingle> getAtParamSingleList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, SoyAtParamSingle.class);
  }

  @Override
  @Nonnull
  public SoyBeginTemplate getBeginTemplate() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, SoyBeginTemplate.class));
  }

  @Override
  @Nullable
  public SoyEndTag getEndTag() {
    return PsiTreeUtil.getChildOfType(this, SoyEndTag.class);
  }

  @Override
  @Nullable
  public SoyStatementList getStatementList() {
    return PsiTreeUtil.getChildOfType(this, SoyStatementList.class);
  }

}
