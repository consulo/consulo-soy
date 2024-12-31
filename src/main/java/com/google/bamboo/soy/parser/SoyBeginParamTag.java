// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import java.util.List;
import jakarta.annotation.Nullable;
import jakarta.annotation.Nonnull;

import com.google.bamboo.soy.elements.TagElement;

public interface SoyBeginParamTag extends TagElement {

  @Nonnull
  List<SoyAttributeKeyValuePair> getAttributeKeyValuePairList();

  @Nullable
  SoyExpr getExpr();

  @Nullable
  SoyParamSpecificationIdentifier getParamSpecificationIdentifier();

}
