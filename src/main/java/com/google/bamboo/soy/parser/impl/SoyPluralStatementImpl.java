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
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.google.bamboo.soy.parser.*;

public class SoyPluralStatementImpl extends ASTWrapperPsiElement implements SoyPluralStatement {

  public SoyPluralStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitPluralStatement(this);
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
