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

import com.google.bamboo.soy.elements.ChoiceClauseElement;
import com.google.bamboo.soy.elements.TagBlockElement;
import consulo.language.editor.annotation.AnnotationHolder;
import consulo.language.editor.annotation.Annotator;
import consulo.language.psi.PsiElement;
import jakarta.annotation.Nonnull;

public class IncompleteBlockAnnotator implements Annotator {

  @Override
  public void annotate(@Nonnull PsiElement psiElement, @Nonnull AnnotationHolder annotationHolder) {
    if (psiElement instanceof TagBlockElement) {
      TagBlockElement block = (TagBlockElement) psiElement;
      if (block.isIncomplete() && !(block instanceof ChoiceClauseElement)) {
        annotationHolder.createErrorAnnotation(block.getOpeningTag(),
            "{" + block.getTagName() + "} is not closed.");
      }
    }
  }
}
