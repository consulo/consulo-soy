// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import jakarta.annotation.Nullable;

import consulo.language.psi.PsiElement;

public interface SoyTypeExpression extends PsiElement {

  @Nullable
  SoyCompoundType getCompoundType();

  @Nullable
  SoyPrimitiveType getPrimitiveType();

  @Nullable
  SoyUnionType getUnionType();

}
