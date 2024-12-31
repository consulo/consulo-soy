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
import consulo.annotation.component.ExtensionImpl;
import consulo.language.Language;
import consulo.language.file.FileViewProvider;
import consulo.language.file.LanguageFileViewProviderFactory;
import consulo.language.psi.PsiManager;
import consulo.virtualFileSystem.VirtualFile;

import jakarta.annotation.Nonnull;

@ExtensionImpl
public class SoyFileViewProviderFactory implements LanguageFileViewProviderFactory {
  @Nonnull
  @Override
  public FileViewProvider createFileViewProvider(@Nonnull VirtualFile virtualFile,
                                                 Language language,
                                                 @Nonnull PsiManager psiManager,
                                                 boolean eventSystemEnabled) {
    assert language.isKindOf(SoyLanguage.INSTANCE);
    return new SoyFileViewProvider(psiManager, virtualFile, eventSystemEnabled);
  }

  @Nonnull
  @Override
  public Language getLanguage() {
    return SoyLanguage.INSTANCE;
  }
}
