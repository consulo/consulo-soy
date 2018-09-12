// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.intellij.psi.PsiElement;

public interface SoyUnexpectedStatements extends PsiElement {

  @Nonnull
  List<SoyCatchallBraces> getCatchallBracesList();

  @Nonnull
  List<SoyCssStatement> getCssStatementList();

  @Nonnull
  List<SoyDelCallStatement> getDelCallStatementList();

  @Nonnull
  List<SoyDirectCallStatement> getDirectCallStatementList();

  @Nonnull
  List<SoyForStatement> getForStatementList();

  @Nonnull
  List<SoyForeachStatement> getForeachStatementList();

  @Nonnull
  List<SoyIfStatement> getIfStatementList();

  @Nonnull
  List<SoyLetCompoundStatement> getLetCompoundStatementList();

  @Nonnull
  List<SoyLetSingleStatement> getLetSingleStatementList();

  @Nonnull
  List<SoyLiteralStatement> getLiteralStatementList();

  @Nonnull
  List<SoyMsgStatement> getMsgStatementList();

  @Nonnull
  List<SoyPluralStatement> getPluralStatementList();

  @Nonnull
  List<SoyPrintStatement> getPrintStatementList();

  @Nonnull
  List<SoySelectStatement> getSelectStatementList();

  @Nonnull
  List<SoySpecialCharacterStatement> getSpecialCharacterStatementList();

  @Nonnull
  List<SoySwitchStatement> getSwitchStatementList();

  @Nonnull
  List<SoyXidStatement> getXidStatementList();

}
