// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import java.util.List;
import jakarta.annotation.Nullable;
import jakarta.annotation.Nonnull;

import consulo.language.psi.util.PsiTreeUtil;

import consulo.language.ast.ASTNode;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import com.google.bamboo.soy.parser.*;
import consulo.language.psi.PsiElementVisitor;

public class SoyForeachStatementImpl extends ASTWrapperPsiElement implements SoyForeachStatement {

  public SoyForeachStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitForeachStatement(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nonnull
  public SoyBeginForeach getBeginForeach() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, SoyBeginForeach.class));
  }

  @Override
  @Nullable
  public SoyEndTag getEndTag() {
    return PsiTreeUtil.getChildOfType(this, SoyEndTag.class);
  }

  @Override
  @Nullable
  public SoyIfEmptyTag getIfEmptyTag() {
    return PsiTreeUtil.getChildOfType(this, SoyIfEmptyTag.class);
  }

  @Override
  @Nonnull
  public List<SoyStatementList> getStatementListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyStatementList.class);
  }

}
