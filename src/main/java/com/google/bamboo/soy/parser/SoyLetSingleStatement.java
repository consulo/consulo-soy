// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import jakarta.annotation.Nullable;
import jakarta.annotation.Nonnull;

import com.google.bamboo.soy.elements.StatementElement;
import com.google.bamboo.soy.elements.TagElement;

public interface SoyLetSingleStatement extends StatementElement, TagElement {

  @Nullable
  SoyExpr getExpr();

  @Nonnull
  SoyVariableDefinitionIdentifier getVariableDefinitionIdentifier();

}
