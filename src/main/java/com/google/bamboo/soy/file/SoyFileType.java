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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.google.bamboo.soy.SoyLanguage;
import com.google.bamboo.soy.icons.SoyIcons;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.fileTypes.TemplateLanguageFileType;
import consulo.ui.image.Image;

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
  public String getDescription() {
    return "Closure template file";
  }

  @Nonnull
  @Override
  public String getDefaultExtension() {
    return "soy";
  }

  @Nullable
  @Override
  public Image getIcon() {
    return SoyIcons.FILE;
  }
}
