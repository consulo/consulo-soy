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

public class SoyIfStatementImpl extends ASTWrapperPsiElement implements SoyIfStatement {

  public SoyIfStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitIfStatement(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nonnull
  public List<SoyBeginElseIf> getBeginElseIfList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyBeginElseIf.class);
  }

  @Override
  @Nonnull
  public SoyBeginIf getBeginIf() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, SoyBeginIf.class));
  }

  @Override
  @Nullable
  public SoyElseTag getElseTag() {
    return PsiTreeUtil.getChildOfType(this, SoyElseTag.class);
  }

  @Override
  @Nullable
  public SoyEndTag getEndTag() {
    return PsiTreeUtil.getChildOfType(this, SoyEndTag.class);
  }

  @Override
  @Nonnull
  public List<SoyStatementList> getStatementListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyStatementList.class);
  }

}
