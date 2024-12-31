// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import java.util.List;
import jakarta.annotation.Nullable;
import jakarta.annotation.Nonnull;

import com.google.bamboo.soy.elements.ForeachStatementElement;

public interface SoyForeachStatement extends ForeachStatementElement {

  @Nonnull
  SoyBeginForeach getBeginForeach();

  @Nullable
  SoyEndTag getEndTag();

  @Nullable
  SoyIfEmptyTag getIfEmptyTag();

  @Nonnull
  List<SoyStatementList> getStatementListList();

}
