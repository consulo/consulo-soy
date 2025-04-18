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

package com.google.bamboo.soy.insight.completion;

import com.google.bamboo.soy.SoyLanguage;
import com.google.bamboo.soy.elements.CallStatementElement;
import com.google.bamboo.soy.elements.WhitespaceUtils;
import com.google.bamboo.soy.lang.ParamUtils;
import com.google.bamboo.soy.lang.Scope;
import com.google.bamboo.soy.lang.TemplateNameUtils;
import com.google.bamboo.soy.lang.Variable;
import com.google.bamboo.soy.parser.*;
import consulo.annotation.component.ExtensionImpl;
import consulo.language.Language;
import consulo.language.editor.completion.*;
import consulo.language.editor.completion.lookup.LookupElement;
import consulo.language.editor.completion.lookup.LookupElementBuilder;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiWhiteSpace;
import consulo.language.psi.util.PsiTreeUtil;
import consulo.language.util.ProcessingContext;

import jakarta.annotation.Nonnull;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static consulo.language.pattern.PlatformPatterns.psiElement;

@ExtensionImpl
public class SoyCompletionContributor extends CompletionContributor {

  private static LookupElement soyListTypeLiteral =
    LookupElementBuilder.create("list").withInsertHandler(new PostfixInsertHandler("<", ">"));
  private static LookupElement soyMapTypeLiteral =
    LookupElementBuilder.create("map").withInsertHandler(new PostfixInsertHandler("<", ",>"));
  private static List<LookupElement> soyTypeLiterals =
    Stream.concat(
      Stream.of(
        "any",
        "null",
        "?",
        "string",
        "bool",
        "int",
        "float",
        "number",
        "html",
        "uri",
        "js",
        "css",
        "attributes")
            .map(LookupElementBuilder::create),
      Stream.of(soyListTypeLiteral, soyMapTypeLiteral))
          .collect(Collectors.toList());
  private static List<LookupElement> kindLiterals =
    Stream.of("text", "html", "attributes", "uri", "css", "js")
          .map(LookupElementBuilder::create)
          .collect(Collectors.toList());

  public SoyCompletionContributor() {
    extendWithTemplateDefinitionLevelKeywords();
    extendWithKindKeyword();
    extendWithVariableNamesInScope();
    extendWithTemplateCallIdentifiers();
    extendWithIdentifierFragmentsForAlias();
    extendWithParameterNames();
    extendWithParameterTypes();
  }

  /**
   * Complete the "visibility" and "stricthtml" keywords in template definition open tags.
   */
  private void extendWithTemplateDefinitionLevelKeywords() {
    extend(
      CompletionType.BASIC,
      psiElement().andOr(psiElement().inside(SoyBeginTemplate.class)),
      new CompletionProvider() {
        @Override
        public void addCompletions(
          @Nonnull CompletionParameters completionParameters,
          ProcessingContext processingContext,
          @Nonnull CompletionResultSet completionResultSet) {
          if (isPrecededBy(completionParameters.getPosition(),
                           elt -> elt instanceof SoyTemplateDefinitionIdentifier)) {
            completionResultSet.addElement(
              LookupElementBuilder.create("visibility=\"private\""));
            completionResultSet.addElement(
              LookupElementBuilder.create("stricthtml=\"true\""));
          }
        }
      });
  }

  /**
   * Complete the "kind" keyword in begin parameter tags and complete the supported kind literals in
   * the string literal.
   */
  private void extendWithKindKeyword() {
    extend(
      CompletionType.BASIC,
      psiElement()
        .andOr(
          psiElement().inside(SoyBeginParamTag.class),
          psiElement().inside(SoyBeginLet.class)),
      new CompletionProvider() {
        @Override
        public void addCompletions(
          @Nonnull CompletionParameters completionParameters,
          ProcessingContext processingContext,
          @Nonnull CompletionResultSet completionResultSet) {
          if (isPrecededBy(completionParameters.getPosition(),
                           elt -> elt instanceof SoyParamSpecificationIdentifier
                             || elt instanceof SoyVariableDefinitionIdentifier)) {
            completionResultSet.addElement(
              LookupElementBuilder.create("kind")
                                  .withInsertHandler(new PostfixInsertHandler("=\"", "\"")));
          }
        }
      });

    // Complete supported kind literals for names for let statements and parameters in template
    // function calls.
    extend(
      CompletionType.BASIC,
      psiElement()
        .andOr(
          psiElement().inside(SoyBeginParamTag.class).afterLeaf("="),
          psiElement().inside(SoyBeginLet.class).afterLeaf("=")),
      new CompletionProvider() {
        @Override
        public void addCompletions(
          @Nonnull CompletionParameters completionParameters,
          ProcessingContext processingContext,
          @Nonnull CompletionResultSet completionResultSet) {
          completionResultSet.addAllElements(kindLiterals);
        }
      });
  }

  /**
   * Complete variable names that are in lang when in an expression.
   */
  private void extendWithVariableNamesInScope() {
    extend(
      CompletionType.BASIC,
      psiElement().andOr(
        psiElement().inside(SoyExpr.class),
        psiElement().inside(SoyBeginIf.class),
        psiElement().inside(SoyBeginElseIf.class),
        psiElement().inside(SoyBeginFor.class),
        psiElement().inside(SoyBeginForeach.class),
        psiElement().inside(SoyPrintStatement.class),
        psiElement().inside(SoyBeginParamTag.class).and(
          psiElement().afterLeafSkipping(psiElement(PsiWhiteSpace.class),
                                         psiElement(SoyTypes.COLON)))
      ),
      new CompletionProvider() {
        @Override
        public void addCompletions(
          @Nonnull CompletionParameters completionParameters,
          ProcessingContext processingContext,
          @Nonnull CompletionResultSet completionResultSet) {
          Collection<Variable> params =
            Scope.getScopeOrEmpty(completionParameters.getPosition()).getVariables();
          completionResultSet.addAllElements(
            params
              .stream()
              .map(param -> "$" + param.name)
              .map(LookupElementBuilder::create)
              .collect(Collectors.toList()));
        }
      });
  }

  /**
   * Complete local template identifiers and global fully qualified template name fragments at
   * template call site.
   */
  private void extendWithTemplateCallIdentifiers() {
    // Complete local template identifiers (only for {call})
    extend(
      CompletionType.BASIC,
      psiElement().inside(SoyBeginCall.class),
      new CompletionProvider() {
        @Override
        public void addCompletions(
          @Nonnull CompletionParameters completionParameters,
          ProcessingContext processingContext,
          @Nonnull CompletionResultSet completionResultSet) {
          if (
            PsiTreeUtil.getParentOfType(
              completionParameters.getPosition(), CallStatementElement.class).isDelegate()) {
            return;
          }

          completionResultSet.addAllElements(
            TemplateNameUtils.findLocalTemplateNames(completionParameters.getPosition())
                             .stream()
                             .map(LookupElementBuilder::create)
                             .collect(Collectors.toList()));
        }
      });

    // Complete fully qualified template identifiers fragments for {call} and {delcall}.
    extend(
      CompletionType.BASIC,
      psiElement().inside(SoyBeginCall.class),
      new CompletionProvider() {
        @Override
        public void addCompletions(
          @Nonnull CompletionParameters completionParameters,
          ProcessingContext processingContext,
          @Nonnull CompletionResultSet completionResultSet) {
          PsiElement identifierElement =
            PsiTreeUtil.getParentOfType(
              completionParameters.getPosition(), SoyTemplateReferenceIdentifier.class);

          if (identifierElement == null) {
            return;
          }

          String identifier = identifierElement.getText();

          boolean isDelegate =
            PsiTreeUtil.getParentOfType(
              identifierElement, CallStatementElement.class).isDelegate();

          String prefix = identifier.replaceFirst("IntellijIdeaRulezzz", "");
          Collection<TemplateNameUtils.Fragment> completions =
            TemplateNameUtils.getPossibleNextIdentifierFragments(
              completionParameters.getPosition().getProject(),
              identifierElement,
              prefix,
              isDelegate);

          completionResultSet.addAllElements(
            completions
              .stream()
              .map(
                (fragment) ->
                  LookupElementBuilder.create(fragment.text)
                                      .withTypeText(
                                        fragment.isFinalFragment
                                          ? (isDelegate ? "Delegate template" : "Template")
                                          : "Partial namespace"))
              .collect(Collectors.toList()));
        }
      });
  }

  /**
   * Complete fully qualified namespace fragments for alias declaration.
   */
  private void extendWithIdentifierFragmentsForAlias() {
    extend(
      CompletionType.BASIC,
      psiElement().inside(SoyAliasBlock.class),
      new CompletionProvider() {
        @Override
        public void addCompletions(
          @Nonnull CompletionParameters completionParameters,
          ProcessingContext processingContext,
          @Nonnull CompletionResultSet completionResultSet) {
          PsiElement identifierElement =
            PsiTreeUtil.getParentOfType(
              completionParameters.getPosition(), SoyNamespaceIdentifier.class);
          String identifier = identifierElement == null ? "" : identifierElement.getText();

          String prefix = identifier.replaceFirst("IntellijIdeaRulezzz", "");
          Collection<TemplateNameUtils.Fragment> completions =
            TemplateNameUtils.getTemplateNamespaceFragments(
              completionParameters.getPosition().getProject(), prefix);

          completionResultSet.addAllElements(
            completions
              .stream()
              .map(
                (fragment) ->
                  LookupElementBuilder.create(fragment.text)
                                      .withTypeText(
                                        fragment.isFinalFragment ? "Namespace" : "Partial namespace"))
              .collect(Collectors.toList()));
        }
      });
  }

  /**
   * Complete parameter names for {param .. /} in template function calls.
   */
  private void extendWithParameterNames() {
    extend(
      CompletionType.BASIC,
      psiElement()
        .inside(SoyBeginParamTag.class)
        .and(
          psiElement()
            .afterLeafSkipping(
              psiElement(PsiWhiteSpace.class), psiElement().withText("param"))),
      new CompletionProvider() {
        @Override
        public void addCompletions(
          @Nonnull CompletionParameters completionParameters,
          ProcessingContext processingContext,
          @Nonnull CompletionResultSet completionResultSet) {
          PsiElement position = completionParameters.getPosition();
          CallStatementElement callStatement =
            (CallStatementElement)
              PsiTreeUtil
                .findFirstParent(position, elt -> elt instanceof CallStatementElement);

          if (callStatement == null) {
            return;
          }

          PsiElement identifier = PsiTreeUtil
            .findChildOfType(callStatement, SoyTemplateReferenceIdentifier.class);

          if (identifier == null) {
            return;
          }

          Collection<String> givenParameters = ParamUtils.getGivenParameters(callStatement);
          List<Variable> parameters =
            ParamUtils.getParametersForInvocation(position, identifier.getText())
                      .stream()
                      .filter(v -> !givenParameters.contains(v.name))
                      .collect(Collectors.toList());

          completionResultSet.addAllElements(
            parameters
              .stream()
              .map(
                (variable) ->
                  LookupElementBuilder.create(variable.name).withTypeText(variable.type))
              .collect(Collectors.toList()));
        }
      });
  }

  /**
   * Complete types in {@param ...} .
   */
  private void extendWithParameterTypes() {
    // Complete types in @param.
    extend(
      CompletionType.BASIC,
      psiElement()
        .andOr(
          psiElement().inside(SoyAtParamSingle.class).afterLeaf(":"),
          psiElement().inside(SoyAtInjectSingle.class).afterLeaf(":"),

          // List type literal.
          psiElement().inside(SoyListType.class).afterLeaf("<"),

          // Map type literal.
          psiElement().inside(SoyMapType.class).afterLeaf("<"),
          psiElement().inside(SoyMapType.class).afterLeaf(",")),
      new CompletionProvider() {
        @Override
        public void addCompletions(
          @Nonnull CompletionParameters completionParameters,
          ProcessingContext processingContext,
          @Nonnull CompletionResultSet completionResultSet) {
          completionResultSet.addAllElements(soyTypeLiterals);
        }
      });
  }

  @Override
  public boolean invokeAutoPopup(@Nonnull PsiElement position, char typeChar) {
    return (typeChar == '.' || typeChar == '$');
  }

  /**
   * Whether the given element is directly preceded by an element matching the predicate (ignoring
   * whitespaces).
   */
  private boolean isPrecededBy(PsiElement startElement, Predicate<PsiElement> predicate) {
    for (PsiElement element = WhitespaceUtils.getPrevMeaningSibling(startElement); element != null;
         element = WhitespaceUtils.getPrevMeaningSibling(element)) {
      if (predicate.test(element)) {
        return true;
      }
    }
    return false;
  }

  @Nonnull
  @Override
  public Language getLanguage() {
    return SoyLanguage.INSTANCE;
  }
}
