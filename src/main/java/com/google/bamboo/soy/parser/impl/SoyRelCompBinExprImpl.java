// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import java.util.List;
import javax.annotation.Nonnull;

import consulo.language.psi.PsiElementVisitor;
import consulo.language.psi.util.PsiTreeUtil;
import com.google.bamboo.soy.parser.*;
import consulo.language.ast.ASTNode;

public class SoyRelCompBinExprImpl extends SoyExprImpl implements SoyRelCompBinExpr {

  public SoyRelCompBinExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitRelCompBinExpr(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nonnull
  public List<SoyExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyExpr.class);
  }

}
