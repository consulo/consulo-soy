// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import java.util.List;
import jakarta.annotation.Nullable;
import jakarta.annotation.Nonnull;
import consulo.language.ast.ASTNode;
import consulo.language.psi.PsiElementVisitor;
import consulo.language.psi.util.PsiTreeUtil;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import com.google.bamboo.soy.parser.*;

public class SoySwitchStatementImpl extends ASTWrapperPsiElement implements SoySwitchStatement {

  public SoySwitchStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitSwitchStatement(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nonnull
  public SoyBeginChoice getBeginChoice() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, SoyBeginChoice.class));
  }

  @Override
  @Nonnull
  public List<SoyChoiceClause> getChoiceClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyChoiceClause.class);
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

  @Override
  @Nullable
  public SoyUnexpectedStatements getUnexpectedStatements() {
    return PsiTreeUtil.getChildOfType(this, SoyUnexpectedStatements.class);
  }

}
