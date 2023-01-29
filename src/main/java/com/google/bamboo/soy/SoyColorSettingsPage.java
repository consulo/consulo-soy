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

package com.google.bamboo.soy;

import com.google.bamboo.soy.insight.highlight.SoySyntaxHighlighter;
import consulo.annotation.component.ExtensionImpl;
import consulo.colorScheme.TextAttributesKey;
import consulo.colorScheme.setting.AttributesDescriptor;
import consulo.colorScheme.setting.ColorDescriptor;
import consulo.language.editor.colorScheme.setting.ColorSettingsPage;
import consulo.language.editor.highlight.SyntaxHighlighter;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Map;

@ExtensionImpl
public class SoyColorSettingsPage implements ColorSettingsPage {
  private static final AttributesDescriptor[] DESCRIPTORS =
      new AttributesDescriptor[] {
        new AttributesDescriptor("Numeric and boolean literals", SoySyntaxHighlighter.NUMBER),
        new AttributesDescriptor("Built-in types", SoySyntaxHighlighter.BUILTIN_TYPE),
        new AttributesDescriptor("Comments", SoySyntaxHighlighter.COMMENT),
        new AttributesDescriptor("Tag names", SoySyntaxHighlighter.KEYWORD),
        new AttributesDescriptor("Operators words", SoySyntaxHighlighter.OPERATOR_LITERAL),
        new AttributesDescriptor("String literals", SoySyntaxHighlighter.STRING),
        new AttributesDescriptor("Variable references", SoySyntaxHighlighter.VARIABLE_REFERENCE),
      };

  @Nonnull
  @Override
  public SyntaxHighlighter getHighlighter() {
    return new SoySyntaxHighlighter();
  }

  @Nonnull
  @Override
  public String getDemoText() {
    return "{namespace foo.bar}\n"
        + "\n"
        + "{template .localExample}\n"
        + "  {@param foo: int}\n"
        + "{/template}\n"
        + "\n"
        + "// Foo\n"
        + "/* Bar */\n"
        + "{template .bar}\n"
        + "  {@param bar: string}\n"
        + "  {call .localExample}\n"
        + "    {param foo: true /}\n"
        + "  {/call}\n"
        + "  {if $foo and 3}\n"
        + "    {$foo}\n"
        + "  {/if}\n"
        + "  <!-- -->\n"
        + "{/template}\n";
  }

  @Nullable
  @Override
  public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
    return null;
  }

  @Nonnull
  @Override
  public AttributesDescriptor[] getAttributeDescriptors() {
    return DESCRIPTORS;
  }

  @Nonnull
  @Override
  public ColorDescriptor[] getColorDescriptors() {
    return ColorDescriptor.EMPTY_ARRAY;
  }

  @Nonnull
  @Override
  public String getDisplayName() {
    return "Closure Template";
  }
}
