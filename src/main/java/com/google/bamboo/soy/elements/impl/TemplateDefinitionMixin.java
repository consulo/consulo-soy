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

package com.google.bamboo.soy.elements.impl;

import com.google.bamboo.soy.elements.TemplateDefinitionElement;
import com.google.bamboo.soy.stubs.TemplateDefinitionStub;
import consulo.language.ast.ASTNode;
import consulo.language.psi.stub.IStubElementType;
import consulo.language.ast.IElementType;
import jakarta.annotation.Nonnull;

public class TemplateDefinitionMixin extends SoyStubBasedPsiElementBase<TemplateDefinitionStub>
    implements TemplateDefinitionElement {

  public TemplateDefinitionMixin(TemplateDefinitionStub stub, IStubElementType type) {
    super(stub, type);
  }

  public TemplateDefinitionMixin(ASTNode node) {
    super(node);
  }

  public TemplateDefinitionMixin(TemplateDefinitionStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  @Nonnull
  @Override
  public String getName() {
    return getStub() != null ? getStub().getName() : getText();
  }
}
