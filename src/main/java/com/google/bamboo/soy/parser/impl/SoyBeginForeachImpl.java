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

public class SoyBeginForeachImpl extends ASTWrapperPsiElement implements SoyBeginForeach {

  public SoyBeginForeachImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitBeginForeach(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SoyExpr getExpr() {
    return PsiTreeUtil.getChildOfType(this, SoyExpr.class);
  }

  @Override
  @Nullable
  public SoyVariableDefinitionIdentifier getVariableDefinitionIdentifier() {
    return PsiTreeUtil.getChildOfType(this, SoyVariableDefinitionIdentifier.class);
  }

}
