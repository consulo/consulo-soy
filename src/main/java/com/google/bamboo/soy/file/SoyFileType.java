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

package com.google.bamboo.soy.file;

import com.google.bamboo.soy.SoyLanguage;
import consulo.language.file.LanguageFileType;
import consulo.language.template.TemplateLanguageFileType;
import consulo.localize.LocalizeValue;
import consulo.soy.icon.SoyIconGroup;
import consulo.ui.image.Image;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

public class SoyFileType extends LanguageFileType implements TemplateLanguageFileType {
  public static final SoyFileType INSTANCE = new SoyFileType();

  private SoyFileType() {
    super(SoyLanguage.INSTANCE);
  }

  @Nonnull
  @Override
  public String getId() {
    return "CLOSURE_TEMPLATE_TYPE";
  }

  @Nonnull
  @Override
  public LocalizeValue getDescription() {
    return LocalizeValue.localizeTODO("Closure template file");
  }

  @Nonnull
  @Override
  public String getDefaultExtension() {
    return "soy";
  }

  @Nullable
  @Override
  public Image getIcon() {
    return SoyIconGroup.closure_template();
  }
}
