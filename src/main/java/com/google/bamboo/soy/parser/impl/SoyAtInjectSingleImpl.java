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
import com.google.bamboo.soy.elements.impl.AtInjectMixin;
import com.google.bamboo.soy.parser.*;

public class SoyAtInjectSingleImpl extends AtInjectMixin implements SoyAtInjectSingle {

  public SoyAtInjectSingleImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitAtInjectSingle(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SoyParamDefinitionIdentifier getParamDefinitionIdentifier() {
    return PsiTreeUtil.getChildOfType(this, SoyParamDefinitionIdentifier.class);
  }

  @Override
  @Nullable
  public SoyTypeExpression getTypeExpression() {
    return PsiTreeUtil.getChildOfType(this, SoyTypeExpression.class);
  }

}
