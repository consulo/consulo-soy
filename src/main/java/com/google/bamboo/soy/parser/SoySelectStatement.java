// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.intellij.psi.PsiElement;
import com.google.bamboo.soy.elements.ChoiceStatementElement;

public interface SoySelectStatement extends ChoiceStatementElement {

  @Nonnull
  SoyBeginChoice getBeginChoice();

  @Nonnull
  List<SoyChoiceClause> getChoiceClauseList();

  @Nullable
  SoyEndTag getEndTag();

  @Nullable
  SoyStatementList getStatementList();

  @Nullable
  SoyUnexpectedStatements getUnexpectedStatements();

}
