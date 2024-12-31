// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import java.util.List;
import jakarta.annotation.Nullable;
import jakarta.annotation.Nonnull;
import consulo.language.ast.ASTNode;
import consulo.language.psi.PsiElementVisitor;

import consulo.language.impl.psi.ASTWrapperPsiElement;
import com.google.bamboo.soy.parser.*;
import consulo.language.psi.util.PsiTreeUtil;

public class SoyPrintStatementImpl extends ASTWrapperPsiElement implements SoyPrintStatement {

  public SoyPrintStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitPrintStatement(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SoyAttributeKeyValuePair getAttributeKeyValuePair() {
    return PsiTreeUtil.getChildOfType(this, SoyAttributeKeyValuePair.class);
  }

  @Override
  @Nonnull
  public List<SoyDirective> getDirectiveList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyDirective.class);
  }

  @Override
  @Nullable
  public SoyExpr getExpr() {
    return PsiTreeUtil.getChildOfType(this, SoyExpr.class);
  }

}
