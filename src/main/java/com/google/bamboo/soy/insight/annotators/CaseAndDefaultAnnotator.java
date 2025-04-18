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

package com.google.bamboo.soy.insight.annotators;

import com.google.bamboo.soy.elements.ChoiceStatementElement;
import com.google.bamboo.soy.parser.SoyChoiceClause;
import consulo.language.editor.annotation.AnnotationHolder;
import consulo.language.editor.annotation.Annotator;
import consulo.language.psi.PsiElement;

import jakarta.annotation.Nonnull;

public class CaseAndDefaultAnnotator implements Annotator {

  @Override
  public void annotate(@Nonnull PsiElement psiElement, @Nonnull AnnotationHolder annotationHolder) {
    if (psiElement instanceof ChoiceStatementElement) {
      boolean foundDefault = false;
      for (PsiElement child : psiElement.getChildren()) {
        if (!(child instanceof SoyChoiceClause)) {
          continue;
        }

        SoyChoiceClause clause = (SoyChoiceClause) child;

        if (foundDefault) {
          if (!clause.isDefault()) {
            annotationHolder.createErrorAnnotation(
                child, "{case} clauses are not allowed after {default}.");
          } else if (clause.isDefault()) {
            annotationHolder.createErrorAnnotation(
                child, "There can only be one {default} clause.");
          }
        } else if (clause.isDefault()) {
          foundDefault = true;
        }
      }
    }
  }
}
