// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.intellij.psi.PsiElement;
import com.google.bamboo.soy.elements.AtParamElement;
import com.intellij.psi.StubBasedPsiElement;
import com.google.bamboo.soy.stubs.AtParamStub;

public interface SoyAtParamSingle extends AtParamElement, StubBasedPsiElement<AtParamStub> {

  @Nullable
  SoyParamDefinitionIdentifier getParamDefinitionIdentifier();

  @Nullable
  SoyTypeExpression getTypeExpression();

}
