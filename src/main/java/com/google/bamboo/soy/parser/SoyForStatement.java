// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import jakarta.annotation.Nullable;
import jakarta.annotation.Nonnull;

import com.google.bamboo.soy.elements.ForStatementElement;

public interface SoyForStatement extends ForStatementElement {

  @Nonnull
  SoyBeginFor getBeginFor();

  @Nullable
  SoyEndTag getEndTag();

  @Nullable
  SoyStatementList getStatementList();

}
