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

import com.google.bamboo.soy.lexer.SoyTokenTypes;
import consulo.language.psi.PsiElement;
import consulo.language.ast.IElementType;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

public interface TagElement extends PsiElement {

  @Nonnull
  default PsiElement getTagNameToken() {
    return WhitespaceUtils.getNextMeaningSibling(getOpeningBrace());
  }

  @Nonnull
  default IElementType getTagNameTokenType() {
    return getTagNameToken().getNode().getElementType();
  }

  @Nonnull
  default String getTagName() {
    return getTagNameToken().getText().toLowerCase();
  }

  @Nonnull
  default PsiElement getOpeningBrace() {
    return WhitespaceUtils.getFirstMeaningChild(this);
  }

  @Nonnull
  default IElementType getOpeningBraceType() {
    return getOpeningBrace().getNode().getElementType();
  }

  @Nullable
  default IElementType getClosingBraceType() {
    IElementType type = WhitespaceUtils.getLastMeaningChild(this).getNode().getElementType();
    return SoyTokenTypes.RIGHT_BRACES.contains(type) ? type : null;
  }

  default boolean isDoubleBraced() {
    return SoyTokenTypes.DOUBLE_BRACES.contains(getOpeningBraceType());
  }

  default boolean isSelfClosed() {
    return SoyTokenTypes.SLASH_R_BRACES.contains(getClosingBraceType());
  }

  default boolean isIncomplete() {
    return getClosingBraceType() == null;
  }

  default String generateClosingTag() {
    String closingTag = "{/" + getTagName() + "}";
    if (isDoubleBraced()) {
      closingTag = "{" + closingTag + "}";
    }
    return closingTag;
  }
}
