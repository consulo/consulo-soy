// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import java.util.List;
import javax.annotation.Nonnull;
import consulo.language.ast.ASTNode;
import consulo.language.psi.PsiElementVisitor;

import consulo.language.impl.psi.ASTWrapperPsiElement;
import com.google.bamboo.soy.parser.*;
import consulo.language.psi.util.PsiTreeUtil;

public class SoyDirectiveImpl extends ASTWrapperPsiElement implements SoyDirective {

  public SoyDirectiveImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitDirective(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nonnull
  public SoyFunctionIdentifier getFunctionIdentifier() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, SoyFunctionIdentifier.class));
  }

  @Override
  @Nonnull
  public List<SoyLiteralExpr> getLiteralExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyLiteralExpr.class);
  }

}
