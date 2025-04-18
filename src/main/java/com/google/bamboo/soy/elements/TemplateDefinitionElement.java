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

package com.google.bamboo.soy.elements;

import com.google.bamboo.soy.stubs.TemplateDefinitionStub;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiNamedElement;
import consulo.language.psi.StubBasedPsiElement;
import consulo.language.util.IncorrectOperationException;

import jakarta.annotation.Nonnull;

/**
 * The PSI element that represents the template name in a template block definition.
 */
public interface TemplateDefinitionElement
    extends StubBasedPsiElement<TemplateDefinitionStub>, PsiNamedElement {

  @Nonnull
  @Override
  String getName();

  @Override
  default PsiElement setName(@Nonnull String s) throws IncorrectOperationException {
    return null;
  }
}
