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

package com.google.bamboo.soy.templates;

import com.google.bamboo.soy.file.SoyFileType;
import consulo.annotation.component.ExtensionImpl;
import consulo.language.editor.template.context.BaseTemplateContextType;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiFile;
import consulo.localize.LocalizeValue;
import jakarta.inject.Inject;

import javax.annotation.Nonnull;

import static consulo.language.pattern.PlatformPatterns.psiElement;

@ExtensionImpl
public class CallBlockContext extends BaseTemplateContextType {
  @Inject
  protected CallBlockContext() {
    super("CLOSURE_TEMPLATE_CALL_BLOCK", LocalizeValue.localizeTODO("Closure template: call block"));
  }

  @Override
  public boolean isInContext(@Nonnull PsiFile file, int offset) {
    if (file.getFileType() != SoyFileType.INSTANCE) return false;

    PsiElement element = file.findElementAt(offset);
    return psiElement()
      .andOr(
        psiElement().inside(Matchers.templateBlockMatcher),
        psiElement().withAncestor(2, Matchers.templateCallStatementMatcher))
      .accepts(element);
  }
}
