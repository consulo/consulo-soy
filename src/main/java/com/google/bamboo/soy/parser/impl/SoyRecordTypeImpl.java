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

public class SoyRecordTypeImpl extends ASTWrapperPsiElement implements SoyRecordType {

  public SoyRecordTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull SoyVisitor visitor) {
    visitor.visitRecordType(this);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof SoyVisitor) accept((SoyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nonnull
  public List<SoyRecordTypeField> getRecordTypeFieldList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SoyRecordTypeField.class);
  }

}
