// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import consulo.language.psi.PsiElement;

import java.util.List;
import jakarta.annotation.Nonnull;

public interface SoyDirective extends PsiElement {

  @Nonnull
  SoyFunctionIdentifier getFunctionIdentifier();

  @Nonnull
  List<SoyLiteralExpr> getLiteralExprList();

}
