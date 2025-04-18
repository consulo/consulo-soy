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

package com.google.bamboo.soy.elements.references;

import com.google.bamboo.soy.elements.CallStatementElement;
import com.google.bamboo.soy.lang.ParamUtils;
import consulo.language.psi.PsiElement;
import consulo.language.psi.util.PsiTreeUtil;
import consulo.document.util.TextRange;
import consulo.language.psi.PsiReference;
import consulo.language.psi.PsiReferenceBase;

import jakarta.annotation.Nonnull;

public class ParameterDefinitionReference extends PsiReferenceBase<PsiElement>
    implements PsiReference {

  private String parameterName;

  public ParameterDefinitionReference(PsiElement element, TextRange textRange) {
    super(element, textRange);

    this.parameterName = element.getText();
  }

  @Override
  public PsiElement resolve() {
    PsiElement element = this.getElement();
    CallStatementElement callStatement =
        (CallStatementElement) PsiTreeUtil
            .findFirstParent(element, elt -> elt instanceof CallStatementElement);

    if (callStatement != null) {
      PsiElement identifier = callStatement.getBeginCall().getTemplateReferenceIdentifier();
      if (identifier == null) {
        return null;
      }

      return ParamUtils.getParametersForInvocation(element, identifier.getText())
          .stream()
          .filter((var) -> var.name.equals(parameterName))
          .findAny()
          .map((var) -> var.element)
          .orElse(null);
    }

    return null;
  }

  @Override
  @Nonnull
  public Object[] getVariants() {
    return new Object[0];
  }

  @Override
  public TextRange getRangeInElement() {
    return new TextRange(0, this.getElement().getNode().getTextLength());
  }
}
