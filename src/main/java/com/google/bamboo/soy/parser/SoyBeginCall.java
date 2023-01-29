// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.google.bamboo.soy.elements.TagElement;

public interface SoyBeginCall extends TagElement {

  @Nonnull
  List<SoyAttributeKeyValuePair> getAttributeKeyValuePairList();

  @Nullable
  SoyTemplateReferenceIdentifier getTemplateReferenceIdentifier();

}
