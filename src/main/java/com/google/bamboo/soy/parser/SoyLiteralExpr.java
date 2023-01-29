// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import javax.annotation.Nullable;

import consulo.language.psi.PsiElement;

public interface SoyLiteralExpr extends SoyExpr {

  @Nullable
  SoyAnyStringLiteral getAnyStringLiteral();

  @Nullable
  SoyProtobufEnum getProtobufEnum();

  @Nullable
  PsiElement getBoolLiteral();

  @Nullable
  PsiElement getFloatLiteral();

  @Nullable
  PsiElement getIntegerLiteral();

}
