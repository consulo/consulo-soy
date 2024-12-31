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

package com.google.bamboo.soy.format;

import com.google.bamboo.soy.SoyLanguage;
import com.google.bamboo.soy.elements.TagBlockElement;
import com.google.bamboo.soy.elements.TagElement;
import com.google.bamboo.soy.format.blocks.SoyBlock;
import com.google.bamboo.soy.format.blocks.SoyStatementListBlock;
import com.google.bamboo.soy.format.blocks.SoyTagBlock;
import com.google.bamboo.soy.format.blocks.SoyTagBlockBlock;
import com.google.bamboo.soy.parser.SoyStatementList;
import com.google.bamboo.soy.parser.SoyTypes;
import consulo.annotation.component.ExtensionImpl;
import consulo.language.Language;
import consulo.language.ast.ASTNode;
import consulo.language.codeStyle.*;
import consulo.language.codeStyle.template.DataLanguageBlockWrapper;
import consulo.language.codeStyle.template.SimpleTemplateLanguageFormattingModelBuilder;
import consulo.language.codeStyle.template.TemplateLanguageBlock;
import consulo.language.codeStyle.template.TemplateLanguageFormattingModelBuilder;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiFile;
import consulo.xml.psi.formatter.xml.HtmlPolicy;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import java.util.List;

@ExtensionImpl
public class SoyFormattingModelBuilder extends TemplateLanguageFormattingModelBuilder {
  private static SimpleTemplateLanguageFormattingModelBuilder ourBaseBuilder = new SimpleTemplateLanguageFormattingModelBuilder() {
    @Nonnull
    @Override
    public Language getLanguage() {
      return SoyLanguage.INSTANCE;
    }
  };

  @Override
  public TemplateLanguageBlock createTemplateLanguageBlock(
    @Nonnull ASTNode node,
    @Nullable Wrap wrap,
    @Nullable Alignment alignment,
    @Nullable List<DataLanguageBlockWrapper> foreignChildren,
    @Nonnull CodeStyleSettings codeStyleSettings) {
    final FormattingDocumentModel documentModel =
      FormattingDocumentModel.create(node.getPsi().getContainingFile());
    if (node.getPsi() instanceof TagElement) {
      return new SoyTagBlock(
        this,
        codeStyleSettings,
        node,
        foreignChildren,
        new HtmlPolicy(codeStyleSettings, documentModel));
    }
    else if (node.getPsi() instanceof TagBlockElement) {
      return new SoyTagBlockBlock(
        this,
        codeStyleSettings,
        node,
        foreignChildren,
        new HtmlPolicy(codeStyleSettings, documentModel));
    }
    else if (node.getPsi() instanceof SoyStatementList) {
      return new SoyStatementListBlock(
        this,
        codeStyleSettings,
        node,
        foreignChildren,
        new HtmlPolicy(codeStyleSettings, documentModel));
    }
    else {
      return new SoyBlock(
        this,
        codeStyleSettings,
        node,
        foreignChildren,
        new HtmlPolicy(codeStyleSettings, documentModel));
    }
  }

  @Nonnull
  @Override
  public FormattingModel createModel(FormattingContext context) {
    PsiElement element = context.getPsiElement();
    CodeStyleSettings settings = context.getCodeStyleSettings();
    final PsiFile file = element.getContainingFile();

    if (element.getNode().getElementType() == SoyTypes.OTHER) {
      return ourBaseBuilder.createModel(context);
    }
    else {
      return new DocumentBasedFormattingModel(
        getRootBlock(file, file.getViewProvider(), settings),
        element.getProject(),
        settings,
        file.getFileType(),
        file);
    }
  }

  @Override
  public boolean dontFormatMyModel() {
    return false;
  }

  @Nonnull
  @Override
  public Language getLanguage() {
    return SoyLanguage.INSTANCE;
  }
}
