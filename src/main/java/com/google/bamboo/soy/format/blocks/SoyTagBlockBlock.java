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

package com.google.bamboo.soy.format.blocks;

import consulo.language.ast.ASTNode;
import consulo.language.codeStyle.CodeStyleSettings;
import consulo.language.codeStyle.template.DataLanguageBlockWrapper;
import consulo.language.codeStyle.template.TemplateLanguageBlockFactory;
import consulo.xml.psi.formatter.xml.HtmlPolicy;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import java.util.List;

public class SoyTagBlockBlock extends SoyBlock {

  public SoyTagBlockBlock(
      @Nonnull TemplateLanguageBlockFactory blockFactory,
      @Nonnull CodeStyleSettings settings,
      @Nonnull ASTNode node,
      @Nullable List<DataLanguageBlockWrapper> foreignChildren,
      HtmlPolicy htmlPolicy) {
    super(blockFactory, settings, node, foreignChildren, htmlPolicy);
  }
}
