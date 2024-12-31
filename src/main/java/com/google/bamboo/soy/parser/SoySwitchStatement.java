// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import java.util.List;
import jakarta.annotation.Nullable;
import jakarta.annotation.Nonnull;

import com.google.bamboo.soy.elements.ChoiceStatementElement;

public interface SoySwitchStatement extends ChoiceStatementElement {

  @Nonnull
  SoyBeginChoice getBeginChoice();

  @Nonnull
  List<SoyChoiceClause> getChoiceClauseList();

  @Nullable
  SoyEndTag getEndTag();

  @Nullable
  SoyStatementList getStatementList();

  @Nullable
  SoyUnexpectedStatements getUnexpectedStatements();

}
