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

import com.google.bamboo.soy.elements.TagElement;
import com.google.bamboo.soy.lexer.SoyTokenTypes;
import com.google.bamboo.soy.parser.impl.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableSet;
import consulo.language.ast.TokenSet;
import consulo.language.editor.annotation.AnnotationHolder;
import consulo.language.editor.annotation.Annotator;
import consulo.language.psi.PsiElement;

import jakarta.annotation.Nonnull;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClosingBraceSanityAnnotator implements Annotator {

  @VisibleForTesting
  static final ImmutableSet<Class> mustCloseRBraceTags =
      ImmutableSet.<Class>builder()
          .add(SoyAliasBlockImpl.class)
          .add(SoyAtParamSingleImpl.class)
          .add(SoyBeginChoiceClauseImpl.class)
          .add(SoyBeginElseIfImpl.class)
          .add(SoyBeginForImpl.class)
          .add(SoyBeginForeachImpl.class)
          .add(SoyBeginIfImpl.class)
          .add(SoyBeginLetImpl.class)
          .add(SoyBeginMsgImpl.class)
          .add(SoyBeginChoiceImpl.class)
          .add(SoyBeginTemplateImpl.class)
          .add(SoyCssStatementImpl.class)
          .add(SoyDelegatePackageBlockImpl.class)
          .add(SoyElseTagImpl.class)
          .add(SoyEndTagImpl.class)
          .add(SoyFallbackMsgTagImpl.class)
          .add(SoySpecialCharacterStatementImpl.class)
          .add(SoyNamespaceBlockImpl.class)
          .add(SoyPrintStatementImpl.class)
          .add(SoyXidStatementImpl.class)
          .build();
  
  private static ImmutableSet<Class> mustCloseSlashRBraceTags =
      ImmutableSet.of(SoyLetSingleStatementImpl.class);

  @Override
  public void annotate(@Nonnull PsiElement psiElement, @Nonnull AnnotationHolder annotationHolder) {
    if (psiElement instanceof TagElement) {
      TagElement tagElement = (TagElement) psiElement;

      TokenSet allowedRBraces = SoyTokenTypes.RIGHT_BRACES;
      if (mustCloseRBraceTags.contains(tagElement.getClass())) {
        allowedRBraces = TokenSet.andNot(allowedRBraces, SoyTokenTypes.SLASH_R_BRACES);
      } else if (mustCloseSlashRBraceTags.contains(tagElement.getClass())) {
        allowedRBraces = TokenSet.andSet(allowedRBraces, SoyTokenTypes.SLASH_R_BRACES);
      }

      if (tagElement.isDoubleBraced()) {
        allowedRBraces = TokenSet.andSet(allowedRBraces, SoyTokenTypes.DOUBLE_BRACES);
      } else {
        allowedRBraces = TokenSet.andNot(allowedRBraces, SoyTokenTypes.DOUBLE_BRACES);
      }

      if (!allowedRBraces.contains(tagElement.getClosingBraceType())) {
        annotationHolder.createErrorAnnotation(tagElement, "Must close by " +
            Stream.of(allowedRBraces.getTypes())
                .map(SoyTokenTypes.BRACE_TYPE_TO_STRING::get)
                .sorted()
                .collect(Collectors.joining(" or ")));
      }
    }
  }
}
