// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import java.util.List;
import jakarta.annotation.Nonnull;

import consulo.language.psi.util.PsiTreeUtil;

import com.google.bamboo.soy.parser.*;
import consulo.language.ast.ASTNode;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import consulo.language.psi.PsiElementVisitor;

public class SoyUnexpectedStatementsImpl extends ASTWrapperPsiElement implements SoyUnexpectedStatements {

  public SoyUnexpectedStatementsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitUnexpectedStatements(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nonnull
  public List<SoyCatchallBraces> getCatchallBracesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyCatchallBraces.class);
  }

  @Override
  @Nonnull
  public List<SoyCssStatement> getCssStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyCssStatement.class);
  }

  @Override
  @Nonnull
  public List<SoyDelCallStatement> getDelCallStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyDelCallStatement.class);
  }

  @Override
  @Nonnull
  public List<SoyDirectCallStatement> getDirectCallStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyDirectCallStatement.class);
  }

  @Override
  @Nonnull
  public List<SoyForStatement> getForStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyForStatement.class);
  }

  @Override
  @Nonnull
  public List<SoyForeachStatement> getForeachStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyForeachStatement.class);
  }

  @Override
  @Nonnull
  public List<SoyIfStatement> getIfStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyIfStatement.class);
  }

  @Override
  @Nonnull
  public List<SoyLetCompoundStatement> getLetCompoundStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyLetCompoundStatement.class);
  }

  @Override
  @Nonnull
  public List<SoyLetSingleStatement> getLetSingleStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyLetSingleStatement.class);
  }

  @Override
  @Nonnull
  public List<SoyLiteralStatement> getLiteralStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyLiteralStatement.class);
  }

  @Override
  @Nonnull
  public List<SoyMsgStatement> getMsgStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyMsgStatement.class);
  }

  @Override
  @Nonnull
  public List<SoyPluralStatement> getPluralStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyPluralStatement.class);
  }

  @Override
  @Nonnull
  public List<SoyPrintStatement> getPrintStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyPrintStatement.class);
  }

  @Override
  @Nonnull
  public List<SoySelectStatement> getSelectStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoySelectStatement.class);
  }

  @Override
  @Nonnull
  public List<SoySpecialCharacterStatement> getSpecialCharacterStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoySpecialCharacterStatement.class);
  }

  @Override
  @Nonnull
  public List<SoySwitchStatement> getSwitchStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoySwitchStatement.class);
  }

  @Override
  @Nonnull
  public List<SoyXidStatement> getXidStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyXidStatement.class);
  }

}
