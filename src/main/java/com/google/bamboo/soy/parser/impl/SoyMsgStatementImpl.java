// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import consulo.language.psi.PsiElementVisitor;

import com.google.bamboo.soy.parser.*;
import consulo.language.ast.ASTNode;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import consulo.language.psi.util.PsiTreeUtil;

public class SoyMsgStatementImpl extends ASTWrapperPsiElement implements SoyMsgStatement {

  public SoyMsgStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitMsgStatement(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nonnull
  public SoyBeginMsg getBeginMsg() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, SoyBeginMsg.class));
  }

  @Override
  @Nullable
  public SoyEndTag getEndTag() {
    return PsiTreeUtil.getChildOfType(this, SoyEndTag.class);
  }

  @Override
  @Nullable
  public SoyFallbackMsgTag getFallbackMsgTag() {
    return PsiTreeUtil.getChildOfType(this, SoyFallbackMsgTag.class);
  }

  @Override
  @Nonnull
  public List<SoyStatementList> getStatementListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyStatementList.class);
  }

}
