// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.intellij.psi.PsiElement;
import com.google.bamboo.soy.elements.IdentifierElement;
import com.intellij.psi.PsiReference;

public interface SoyAnyStringLiteral extends IdentifierElement {

  @Nullable
  PsiElement getMultiLineStringLiteral();

  @Nullable
  PsiElement getStringLiteral();

  PsiReference[] getReferences();

}
