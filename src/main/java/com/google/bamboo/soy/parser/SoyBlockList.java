// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.intellij.psi.PsiElement;

public interface SoyBlockList extends PsiElement {

  @Nonnull
  List<SoyAliasBlock> getAliasBlockList();

  @Nonnull
  List<SoyCatchallBraces> getCatchallBracesList();

  @Nonnull
  List<SoyDelegatePackageBlock> getDelegatePackageBlockList();

  @Nonnull
  List<SoyNamespaceBlock> getNamespaceBlockList();

  @Nonnull
  List<SoyTemplateBlock> getTemplateBlockList();

}
