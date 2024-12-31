// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import jakarta.annotation.Nullable;

import consulo.language.psi.PsiElement;

public interface SoyCompoundType extends PsiElement {

  @Nullable
  SoyListType getListType();

  @Nullable
  SoyMapType getMapType();

  @Nullable
  SoyRecordType getRecordType();

}
