// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.google.bamboo.soy.elements.StatementElement;
import com.google.bamboo.soy.elements.TagBlockElement;

public interface SoyLetCompoundStatement extends StatementElement, TagBlockElement {

  @Nonnull
  SoyBeginLet getBeginLet();

  @Nullable
  SoyEndTag getEndTag();

  @Nullable
  SoyStatementList getStatementList();

}
