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

import consulo.annotation.component.ExtensionImpl;
import consulo.language.Language;
import consulo.language.findUsage.FindUsagesProvider;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiNamedElement;

import jakarta.annotation.Nonnull;

@ExtensionImpl
public class SoyFindUsagesProvider implements FindUsagesProvider {

  @Override
  public boolean canFindUsagesFor(@Nonnull PsiElement psiElement) {
    return psiElement instanceof PsiNamedElement;
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

  @Nonnull
  @Override
  public Language getLanguage() {
    return SoyLanguage.INSTANCE;
  }
}
