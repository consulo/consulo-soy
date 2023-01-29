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
import consulo.language.Language;
import consulo.language.impl.file.MultiplePsiFilesPerDocumentFileViewProvider;
import consulo.language.impl.psi.PsiFileImpl;
import consulo.language.impl.psi.template.TemplateDataElementType;
import consulo.language.parser.ParserDefinition;
import consulo.language.psi.PsiFile;
import consulo.language.psi.PsiManager;
import consulo.language.template.ConfigurableTemplateLanguageFileViewProvider;
import consulo.virtualFileSystem.VirtualFile;
import consulo.xml.lang.html.HTMLLanguage;

import javax.annotation.Nonnull;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.google.bamboo.soy.parser.SoyTypes.OTHER;

public class SoyFileViewProvider extends MultiplePsiFilesPerDocumentFileViewProvider
    implements ConfigurableTemplateLanguageFileViewProvider {
  // Base language, a template language like Soy
  private static final Language baseLanguage = SoyLanguage.INSTANCE;

  // Template data language, like HTML
  private static final Language templateDataLanguage = HTMLLanguage.INSTANCE;

  // Element type for template data language
  private static TemplateDataElementType templateDataLanguageType =
      new TemplateDataElementType("CLOSURE_TEMPLATE_DATA", templateDataLanguage, OTHER, OTHER);

  SoyFileViewProvider(PsiManager manager, VirtualFile file, boolean physical) {
    super(manager, file, physical);
  }

  @Override
  public boolean supportsIncrementalReparse(@Nonnull Language rootLanguage) {
    return false;
  }

  @Nonnull
  @Override
  public Language getBaseLanguage() {
    return baseLanguage;
  }

  @Nonnull
  @Override
  public Language getTemplateDataLanguage() {
    return templateDataLanguage;
  }

  @Nonnull
  @Override
  public Set<Language> getLanguages() {
    return new HashSet<>(Arrays.asList(new Language[] {baseLanguage, templateDataLanguage}));
  }

  @Override
  protected MultiplePsiFilesPerDocumentFileViewProvider cloneInner(VirtualFile virtualFile) {
    return new SoyFileViewProvider(getManager(), virtualFile, false);
  }

  @Override
  protected PsiFile createFile(@Nonnull Language lang) {
    ParserDefinition parserDefinition = getDefinition(lang);
    if (parserDefinition == null) {
      return null;
    }

    if (lang.is(templateDataLanguage)) {
      PsiFileImpl file = (PsiFileImpl) parserDefinition.createFile(this);
      file.setContentElementType(templateDataLanguageType);
      return file;
    } else if (lang.isKindOf(baseLanguage)) {
      return parserDefinition.createFile(this);
    } else {
      return null;
    }
  }

  private ParserDefinition getDefinition(Language lang) {
    return ParserDefinition.forLanguage(lang);
  }
}
