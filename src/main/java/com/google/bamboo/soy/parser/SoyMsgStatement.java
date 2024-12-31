// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import java.util.List;
import jakarta.annotation.Nullable;
import jakarta.annotation.Nonnull;

import com.google.bamboo.soy.elements.MsgStatementElement;

public interface SoyMsgStatement extends MsgStatementElement {

  @Nonnull
  SoyBeginMsg getBeginMsg();

  @Nullable
  SoyEndTag getEndTag();

  @Nullable
  SoyFallbackMsgTag getFallbackMsgTag();

  @Nonnull
  List<SoyStatementList> getStatementListList();

}
