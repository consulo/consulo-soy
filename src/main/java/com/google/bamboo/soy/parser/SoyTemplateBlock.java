// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.intellij.psi.PsiElement;
import com.google.bamboo.soy.elements.TemplateBlockElement;
import com.intellij.psi.StubBasedPsiElement;
import com.google.bamboo.soy.stubs.TemplateBlockStub;

public interface SoyTemplateBlock extends TemplateBlockElement, StubBasedPsiElement<TemplateBlockStub> {

  @Nonnull
  List<SoyAtInjectSingle> getAtInjectSingleList();

  @Nonnull
  List<SoyAtParamSingle> getAtParamSingleList();

  @Nonnull
  SoyBeginTemplate getBeginTemplate();

  @Nullable
  SoyEndTag getEndTag();

  @Nullable
  SoyStatementList getStatementList();

}
