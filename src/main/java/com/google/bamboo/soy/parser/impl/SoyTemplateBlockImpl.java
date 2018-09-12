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
import com.google.bamboo.soy.elements.impl.TemplateBlockMixin;
import com.google.bamboo.soy.parser.*;
import com.google.bamboo.soy.stubs.TemplateBlockStub;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;

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
