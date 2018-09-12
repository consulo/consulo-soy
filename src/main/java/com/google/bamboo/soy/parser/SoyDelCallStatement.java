// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.intellij.psi.PsiElement;
import com.google.bamboo.soy.elements.CallStatementElement;

public interface SoyDelCallStatement extends CallStatementElement {

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
