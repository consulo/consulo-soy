// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import java.util.List;
import javax.annotation.Nonnull;
import consulo.language.ast.ASTNode;
import consulo.language.psi.PsiElementVisitor;

import com.google.bamboo.soy.parser.*;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import consulo.language.psi.util.PsiTreeUtil;

public class SoyBeginMsgImpl extends ASTWrapperPsiElement implements SoyBeginMsg {

  public SoyBeginMsgImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitBeginMsg(this);
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
