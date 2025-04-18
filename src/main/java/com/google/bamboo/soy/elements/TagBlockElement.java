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

import com.google.bamboo.soy.parser.SoyEndTag;
import consulo.language.ast.IElementType;
import consulo.language.psi.PsiElement;

import jakarta.annotation.Nonnull;

public interface TagBlockElement extends PsiElement {

  @Nonnull
  default TagElement getOpeningTag() {
    return (TagElement) WhitespaceUtils.getFirstMeaningChild(this);
  }

  @Nonnull
  default IElementType getTagNameTokenType() {
    return getOpeningTag().getTagNameTokenType();
  }

  @Nonnull
  default String getTagName() {
    return getOpeningTag().getTagName();
  }

  default boolean isIncomplete() {
    PsiElement lastChild = WhitespaceUtils.getLastMeaningChild(this);
    return !(lastChild instanceof SoyEndTag);
  }
}
