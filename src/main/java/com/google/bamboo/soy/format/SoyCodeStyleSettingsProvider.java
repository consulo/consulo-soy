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
import consulo.annotation.component.ExtensionImpl;
import consulo.configurable.Configurable;
import consulo.language.Language;
import consulo.language.codeStyle.ui.setting.CodeStyleAbstractConfigurable;
import consulo.language.codeStyle.CodeStyleSettings;
import consulo.language.codeStyle.setting.CodeStyleSettingsProvider;
import consulo.language.codeStyle.ui.setting.CodeStyleAbstractPanel;
import consulo.language.codeStyle.ui.setting.TabbedLanguageCodeStylePanel;

import javax.annotation.Nonnull;

@ExtensionImpl
public class SoyCodeStyleSettingsProvider extends CodeStyleSettingsProvider {

  @Override
  public Language getLanguage() {
    return SoyLanguage.INSTANCE;
  }

  @Nonnull
  @Override
  public Configurable createSettingsPage(CodeStyleSettings settings,
                                         CodeStyleSettings originalSettings) {
    return new CodeStyleAbstractConfigurable(settings, originalSettings,
        getConfigurableDisplayName()) {
      @Override
      protected CodeStyleAbstractPanel createPanel(CodeStyleSettings settings) {
        return new TabbedLanguageCodeStylePanel(getLanguage(), settings, originalSettings) {
          @Override
          protected void initTabs(CodeStyleSettings settings) {
            addIndentOptionsTab(settings);
          }
        };
      }
    };
  }
}
