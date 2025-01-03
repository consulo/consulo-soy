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
import com.google.bamboo.soy.parser.SoyParamDefinitionIdentifier;
import com.google.bamboo.soy.parser.SoyTypeExpression;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiNamedElement;
import consulo.language.util.IncorrectOperationException;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

public interface AtInjectElement extends PsiNamedElement, TagElement {
  @Nullable
  SoyParamDefinitionIdentifier getParamDefinitionIdentifier();

  @Nullable
  SoyTypeExpression getTypeExpression();

  default PsiElement setName(@Nonnull String s) throws IncorrectOperationException {
    return null;
  }

  @Nonnull
  default String getType() {
    if (getTypeExpression() != null) {
      return getTypeExpression().getText();
    }
    return "";
  }

  default Variable toVariable() {
    return this.getParamDefinitionIdentifier() == null
        ? null
        : new Variable(getName(), getType(), this.getParamDefinitionIdentifier());
  }
}
