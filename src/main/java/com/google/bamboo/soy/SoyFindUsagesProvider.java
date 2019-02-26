// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.bamboo.soy;

import com.google.bamboo.soy.lexer.SoyLexer;
import com.google.bamboo.soy.parser.SoyTypes;
import com.intellij.lang.cacheBuilder.DefaultWordsScanner;
import com.intellij.lang.cacheBuilder.WordsScanner;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.tree.TokenSet;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class SoyFindUsagesProvider implements FindUsagesProvider {
  @Nullable
  @Override
  public WordsScanner getWordsScanner() {
    return new DefaultWordsScanner(
        new SoyLexer(),
        TokenSet.create(SoyTypes.IDENTIFIER_WORD),
        TokenSet.create(SoyTypes.COMMENT_BLOCK),
        TokenSet.EMPTY);
  }

  @Override
  public boolean canFindUsagesFor(@Nonnull PsiElement psiElement) {
    return psiElement instanceof PsiNamedElement;
  }

  @Nullable
  @Override
  public String getHelpId(@Nonnull PsiElement psiElement) {
    return null;
  }

  @Nonnull
  @Override
  public String getType(@Nonnull PsiElement psiElement) {
    return "";
  }

  @Nonnull
  @Override
  public String getDescriptiveName(@Nonnull PsiElement psiElement) {
    return "";
  }

  @Nonnull
  @Override
  public String getNodeText(@Nonnull PsiElement psiElement, boolean useFullName) {
    return "";
  }
}
