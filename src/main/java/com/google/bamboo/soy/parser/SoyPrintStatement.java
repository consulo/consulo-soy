// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.google.bamboo.soy.elements.StatementElement;
import com.google.bamboo.soy.elements.TagElement;

public interface SoyPrintStatement extends StatementElement, TagElement {

  @Nullable
  SoyAttributeKeyValuePair getAttributeKeyValuePair();

  @Nonnull
  List<SoyDirective> getDirectiveList();

  @Nullable
  SoyExpr getExpr();

}
