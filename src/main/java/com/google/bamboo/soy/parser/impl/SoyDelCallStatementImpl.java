// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import java.util.List;
import jakarta.annotation.Nullable;
import jakarta.annotation.Nonnull;

import consulo.language.psi.PsiElementVisitor;
import consulo.language.psi.util.PsiTreeUtil;

import consulo.language.ast.ASTNode;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import com.google.bamboo.soy.parser.*;

public class SoyDelCallStatementImpl extends ASTWrapperPsiElement implements SoyDelCallStatement {

  public SoyDelCallStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitDelCallStatement(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nonnull
  public SoyBeginCall getBeginCall() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, SoyBeginCall.class));
  }

  @Override
  @Nullable
  public SoyEndTag getEndTag() {
    return PsiTreeUtil.getChildOfType(this, SoyEndTag.class);
  }

  @Override
  @Nonnull
  public List<SoyParamListElement> getParamListElementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyParamListElement.class);
  }

  @Override
  @Nullable
  public SoyStatementList getStatementList() {
    return PsiTreeUtil.getChildOfType(this, SoyStatementList.class);
  }

  @Override
  @Nonnull
  public List<SoyUnexpectedStatements> getUnexpectedStatementsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyUnexpectedStatements.class);
  }

}
