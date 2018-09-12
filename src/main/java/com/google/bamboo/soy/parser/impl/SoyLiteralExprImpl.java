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

public class SoyLiteralExprImpl extends SoyExprImpl implements SoyLiteralExpr {

  public SoyLiteralExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitLiteralExpr(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SoyAnyStringLiteral getAnyStringLiteral() {
    return PsiTreeUtil.getChildOfType(this, SoyAnyStringLiteral.class);
  }

  @Override
  @Nullable
  public SoyProtobufEnum getProtobufEnum() {
    return PsiTreeUtil.getChildOfType(this, SoyProtobufEnum.class);
  }

  @Override
  @Nullable
  public PsiElement getBoolLiteral() {
    return findChildByType(BOOL_LITERAL);
  }

  @Override
  @Nullable
  public PsiElement getFloatLiteral() {
    return findChildByType(FLOAT_LITERAL);
  }

  @Override
  @Nullable
  public PsiElement getIntegerLiteral() {
    return findChildByType(INTEGER_LITERAL);
  }

}
