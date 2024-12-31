// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import jakarta.annotation.Nullable;
import jakarta.annotation.Nonnull;

import com.google.bamboo.soy.elements.ChoiceClauseElement;

public interface SoyChoiceClause extends ChoiceClauseElement {

  @Nonnull
  SoyBeginChoiceClause getBeginChoiceClause();

  @Nullable
  SoyStatementList getStatementList();

}
