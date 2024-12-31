// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import java.util.List;
import jakarta.annotation.Nullable;
import jakarta.annotation.Nonnull;

import com.google.bamboo.soy.elements.CallStatementElement;

public interface SoyDirectCallStatement extends CallStatementElement {

  @Nonnull
  SoyBeginCall getBeginCall();

  @Nullable
  SoyEndTag getEndTag();

  @Nonnull
  List<SoyParamListElement> getParamListElementList();

  @Nullable
  SoyStatementList getStatementList();

  @Nonnull
  List<SoyUnexpectedStatements> getUnexpectedStatementsList();

}
