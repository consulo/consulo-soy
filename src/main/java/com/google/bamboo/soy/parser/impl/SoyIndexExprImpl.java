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
import com.google.bamboo.soy.parser.*;

public class SoyIndexExprImpl extends SoyExprImpl implements SoyIndexExpr {

  public SoyIndexExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitIndexExpr(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SoyCommaSeparatedExpressionList getCommaSeparatedExpressionList() {
    return PsiTreeUtil.getChildOfType(this, SoyCommaSeparatedExpressionList.class);
  }

  @Override
  @Nonnull
  public SoyExpr getExpr() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, SoyExpr.class));
  }

}
