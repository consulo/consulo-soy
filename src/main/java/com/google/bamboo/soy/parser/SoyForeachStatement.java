// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.intellij.psi.PsiElement;
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
