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

package com.google.bamboo.soy.stubs;

import com.google.bamboo.soy.SoyLanguage;
import com.google.bamboo.soy.parser.SoyNamespaceDeclarationIdentifier;
import com.google.bamboo.soy.parser.impl.SoyNamespaceDeclarationIdentifierImpl;
import com.google.bamboo.soy.stubs.index.NamespaceDeclarationIndex;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.IndexSink;
import com.intellij.psi.stubs.NamedStubBase;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import com.intellij.psi.stubs.StubOutputStream;
import com.intellij.util.io.StringRef;
import java.io.IOException;
import javax.annotation.Nonnull;

public class NamespaceDeclarationStub extends NamedStubBase<SoyNamespaceDeclarationIdentifier> {
  static final Type TYPE = new Type();

  NamespaceDeclarationStub(StubElement parent, String name) {
    super(parent, TYPE, name);
  }

  static class Type
      extends IStubElementType<NamespaceDeclarationStub, SoyNamespaceDeclarationIdentifier> {
    Type() {
      super("NAMESPACE_DECLARATION_IDENTIFIER", SoyLanguage.INSTANCE);
    }

    @Override
    public SoyNamespaceDeclarationIdentifier createPsi(@Nonnull NamespaceDeclarationStub stub) {
      return new SoyNamespaceDeclarationIdentifierImpl(stub, this);
    }

    @Nonnull
    @Override
    public NamespaceDeclarationStub createStub(
      @Nonnull SoyNamespaceDeclarationIdentifier psi, StubElement parentStub) {
      return new NamespaceDeclarationStub(parentStub, psi.getName());
    }

    @Nonnull
    @Override
    public String getExternalId() {
      return "NAMESPACE_DECLARATION_IDENTIFIER";
    }

    @Override
    public void serialize(
      @Nonnull NamespaceDeclarationStub stub, @Nonnull StubOutputStream dataStream)
        throws IOException {
      dataStream.writeName(stub.getName());
    }

    @Nonnull
    @Override
    public NamespaceDeclarationStub deserialize(
      @Nonnull StubInputStream dataStream, StubElement parentStub) throws IOException {
      final StringRef ref = dataStream.readName();
      return new NamespaceDeclarationStub(parentStub, ref.getString());
    }

    @Override
    public void indexStub(@Nonnull NamespaceDeclarationStub stub, @Nonnull IndexSink sink) {
      sink.occurrence(NamespaceDeclarationIndex.KEY, stub.getName());
    }
  }
}
