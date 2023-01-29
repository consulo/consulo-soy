// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import java.util.List;
import javax.annotation.Nonnull;
import consulo.language.ast.ASTNode;
import consulo.language.psi.PsiElementVisitor;
import consulo.language.psi.util.PsiTreeUtil;
import com.google.bamboo.soy.parser.*;

public class SoyNullCheckTernaryExprImpl extends SoyExprImpl implements SoyNullCheckTernaryExpr {

  public SoyNullCheckTernaryExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitNullCheckTernaryExpr(this);
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
