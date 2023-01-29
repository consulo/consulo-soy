// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import consulo.language.psi.PsiElementVisitor;

import consulo.language.ast.ASTNode;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import com.google.bamboo.soy.parser.*;
import consulo.language.psi.util.PsiTreeUtil;

public class SoyCompoundTypeImpl extends ASTWrapperPsiElement implements SoyCompoundType {

  public SoyCompoundTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitCompoundType(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SoyListType getListType() {
    return PsiTreeUtil.getChildOfType(this, SoyListType.class);
  }

  @Override
  @Nullable
  public SoyMapType getMapType() {
    return PsiTreeUtil.getChildOfType(this, SoyMapType.class);
  }

  @Override
  @Nullable
  public SoyRecordType getRecordType() {
    return PsiTreeUtil.getChildOfType(this, SoyRecordType.class);
  }

}
