// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.google.bamboo.soy.elements.StatementElement;
import com.google.bamboo.soy.elements.TagBlockElement;

public interface SoyIfStatement extends StatementElement, TagBlockElement {

  @Nonnull
  List<SoyBeginElseIf> getBeginElseIfList();

  @Nonnull
  SoyBeginIf getBeginIf();

  @Nullable
  SoyElseTag getElseTag();

  @Nullable
  SoyEndTag getEndTag();

  @Nonnull
  List<SoyStatementList> getStatementListList();

}
