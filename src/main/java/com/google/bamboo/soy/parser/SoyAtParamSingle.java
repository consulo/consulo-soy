// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import jakarta.annotation.Nullable;

import com.google.bamboo.soy.elements.AtParamElement;
import com.google.bamboo.soy.stubs.AtParamStub;
import consulo.language.psi.StubBasedPsiElement;

public interface SoyAtParamSingle extends AtParamElement, StubBasedPsiElement<AtParamStub> {

  @Nullable
  SoyParamDefinitionIdentifier getParamDefinitionIdentifier();

  @Nullable
  SoyTypeExpression getTypeExpression();

}
