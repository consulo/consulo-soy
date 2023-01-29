// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import javax.annotation.Nullable;

import com.google.bamboo.soy.elements.IdentifierElement;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiReference;

public interface SoyAnyStringLiteral extends IdentifierElement {

  @Nullable
  PsiElement getMultiLineStringLiteral();

  @Nullable
  PsiElement getStringLiteral();

  PsiReference[] getReferences();

}
