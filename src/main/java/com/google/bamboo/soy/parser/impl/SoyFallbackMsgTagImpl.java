// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import java.util.List;
import javax.annotation.Nonnull;

import consulo.language.psi.PsiElementVisitor;

import consulo.language.ast.ASTNode;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import com.google.bamboo.soy.parser.*;
import consulo.language.psi.util.PsiTreeUtil;

public class SoyFallbackMsgTagImpl extends ASTWrapperPsiElement implements SoyFallbackMsgTag {

  public SoyFallbackMsgTagImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitFallbackMsgTag(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nonnull
  public List<SoyAttributeKeyValuePair> getAttributeKeyValuePairList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyAttributeKeyValuePair.class);
  }

}
