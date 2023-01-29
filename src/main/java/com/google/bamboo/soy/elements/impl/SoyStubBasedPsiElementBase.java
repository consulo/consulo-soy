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

import consulo.language.ast.ASTNode;
import consulo.language.ast.IElementType;
import consulo.language.impl.psi.stub.StubBasedPsiElementBase;
import consulo.language.psi.stub.StubElement;
import consulo.language.psi.stub.IStubElementType;

import javax.annotation.Nonnull;

public abstract class SoyStubBasedPsiElementBase<T extends StubElement>
    extends StubBasedPsiElementBase<T> {
  public SoyStubBasedPsiElementBase(@Nonnull T stub, @Nonnull IStubElementType nodeType) {
    super(stub, nodeType);
  }

  public SoyStubBasedPsiElementBase(@Nonnull ASTNode node) {
    super(node);
  }

  public SoyStubBasedPsiElementBase(T stub, IElementType nodeType, ASTNode node) {
    super(stub, nodeType, node);
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "(" + getNode().getElementType().toString() + ")";
  }
}
