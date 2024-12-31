// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import java.util.List;
import jakarta.annotation.Nullable;
import jakarta.annotation.Nonnull;
import consulo.language.ast.ASTNode;
import consulo.language.psi.PsiElementVisitor;
import consulo.language.psi.util.PsiTreeUtil;

import com.google.bamboo.soy.parser.*;
import consulo.language.impl.psi.ASTWrapperPsiElement;

public class SoyDirectCallStatementImpl extends ASTWrapperPsiElement implements SoyDirectCallStatement {

  public SoyDirectCallStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitDirectCallStatement(this);
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
