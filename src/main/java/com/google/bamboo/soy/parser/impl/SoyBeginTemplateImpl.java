// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser.impl;

import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import consulo.language.psi.util.PsiTreeUtil;

import consulo.language.ast.ASTNode;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import com.google.bamboo.soy.parser.*;
import consulo.language.psi.PsiElementVisitor;

public class SoyBeginTemplateImpl extends ASTWrapperPsiElement implements SoyBeginTemplate {

  public SoyBeginTemplateImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitBeginTemplate(this);
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

  @Override
  @Nullable
  public SoyTemplateDefinitionIdentifier getTemplateDefinitionIdentifier() {
    return PsiTreeUtil.getChildOfType(this, SoyTemplateDefinitionIdentifier.class);
  }

}
