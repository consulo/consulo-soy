// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.google.bamboo.soy.elements.ForStatementElement;

public interface SoyForStatement extends ForStatementElement {

  @Nonnull
  SoyBeginFor getBeginFor();

  @Nullable
  SoyEndTag getEndTag();

  @Nullable
  SoyStatementList getStatementList();

}
