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

import com.google.bamboo.soy.lang.Variable;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiNamedElement;
import consulo.language.util.IncorrectOperationException;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface VariableDefinitionElement extends PsiNamedElement {
  @Nullable
  PsiElement getIdentifierWord();

  @Nonnull
  @Override
  String getName();

  @Override
  default PsiElement setName(@Nonnull String s) throws IncorrectOperationException {
    return null;
  }

  @Nonnull
  default Variable toVariable() {
    return new Variable(getName(), "", this);
  }
}
