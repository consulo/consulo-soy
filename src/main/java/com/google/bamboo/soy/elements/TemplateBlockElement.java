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

import com.google.bamboo.soy.lang.Parameter;
import com.google.bamboo.soy.lang.Scope;
import com.google.bamboo.soy.lang.Variable;
import com.google.bamboo.soy.parser.SoyAtInjectSingle;
import com.google.bamboo.soy.parser.SoyAtParamSingle;
import com.google.bamboo.soy.parser.SoyTemplateDefinitionIdentifier;
import com.google.bamboo.soy.parser.SoyTypes;
import com.google.bamboo.soy.stubs.TemplateBlockStub;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiNamedElement;
import consulo.language.psi.StubBasedPsiElement;
import consulo.language.psi.util.PsiTreeUtil;
import consulo.language.util.IncorrectOperationException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

/**
 * The PSI element that represents the template block definition.
 */
public interface TemplateBlockElement
    extends StubBasedPsiElement<TemplateBlockStub>, PsiNamedElement, TagBlockElement, Scope {

  @Nonnull
  List<SoyAtInjectSingle> getAtInjectSingleList();

  @Nonnull
  List<SoyAtParamSingle> getAtParamSingleList();

  @Override
  default PsiElement setName(@Nonnull String s) throws IncorrectOperationException {
    return null;
  }

  @Nullable
  default SoyTemplateDefinitionIdentifier getDefinitionIdentifier() {
    return PsiTreeUtil.findChildOfType(this, SoyTemplateDefinitionIdentifier.class);
  }

  default boolean isDelegate() {
    return getStub() != null ? getStub().isDelegate : getTagNameTokenType() == SoyTypes.DELTEMPLATE;
  }

  @Nonnull
  default List<Parameter> getParameters() {
    if (getStub() != null) {
      return getStub().getParameters();
    }
    return getAtParamSingleList()
        .stream()
        .map(SoyAtParamSingle::toParameter)
        .filter(Objects::nonNull)
        .collect(Collectors.toList());
  }

  @Nullable
  @Override
  default Scope getParentScope() {
    return null;
  }

  @Nonnull
  @Override
  default List<Variable> getLocalVariables() {
    List<Variable> variables = new ArrayList<>();
    variables.addAll(getParameters());
    variables.addAll(getInjectedVariables());
    return variables;
  }

  default List<Variable> getInjectedVariables() {
    return getAtInjectSingleList()
        .stream()
        .map(SoyAtInjectSingle::toVariable)
        .filter(Objects::nonNull)
        .collect(Collectors.toList());
  }
}
