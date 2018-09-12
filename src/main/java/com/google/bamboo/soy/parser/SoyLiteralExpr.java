// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.intellij.psi.PsiElement;

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
