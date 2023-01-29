// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import java.util.List;
import javax.annotation.Nonnull;

import consulo.language.psi.PsiElementVisitor;
import consulo.language.psi.util.PsiTreeUtil;

import consulo.language.ast.ASTNode;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import com.google.bamboo.soy.parser.*;

public class SoyCommaSeparatedKeyValueListImpl extends ASTWrapperPsiElement implements SoyCommaSeparatedKeyValueList {

  public SoyCommaSeparatedKeyValueListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitCommaSeparatedKeyValueList(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nonnull
  public List<SoyKeyValue> getKeyValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyKeyValue.class);
  }

}
