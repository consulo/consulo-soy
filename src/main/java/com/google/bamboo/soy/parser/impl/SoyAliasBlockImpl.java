// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import consulo.language.ast.ASTNode;
import consulo.language.psi.util.PsiTreeUtil;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import com.google.bamboo.soy.parser.*;
import consulo.language.psi.PsiElementVisitor;

public class SoyAliasBlockImpl extends ASTWrapperPsiElement implements SoyAliasBlock {

  public SoyAliasBlockImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitAliasBlock(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SoyAliasIdentifier getAliasIdentifier() {
    return PsiTreeUtil.getChildOfType(this, SoyAliasIdentifier.class);
  }

  @Override
  @Nullable
  public SoyNamespaceIdentifier getNamespaceIdentifier() {
    return PsiTreeUtil.getChildOfType(this, SoyNamespaceIdentifier.class);
  }

}
