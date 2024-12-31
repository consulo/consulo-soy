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
import com.google.bamboo.soy.parser.SoyTemplateDefinitionIdentifier;
import com.google.bamboo.soy.parser.impl.SoyTemplateDefinitionIdentifierImpl;
import consulo.index.io.StringRef;
import consulo.language.psi.stub.*;

import jakarta.annotation.Nonnull;
import java.io.IOException;

public class TemplateDefinitionStub extends NamedStubBase<SoyTemplateDefinitionIdentifier> {
  public static final Type TYPE = new Type();

  TemplateDefinitionStub(StubElement parent, String name) {
    super(parent, TYPE, name);
  }

  // May only be called when the stub tree is fully constructed.
  String getFullyQualifiedName() {
    return getName().startsWith(".") ? getNamespace() + getName() : getName();
  }

  // May only be called when the stub tree is fully constructed.
  String getNamespace() {
    FileStub fileStub = StubUtils.getContainingStubFile(this);
    assert fileStub != null;
    return fileStub.getNamespace();
  }

  @Override
  @Nonnull
  public String getName() {
    String name = super.getName();
    return name == null ? "" : name;
  }

  static class Type
    extends IStubElementType<TemplateDefinitionStub, SoyTemplateDefinitionIdentifier> {
    Type() {
      super("TEMPLATE_DEFINITION_IDENTIFIER", SoyLanguage.INSTANCE);
    }

    @Override
    public SoyTemplateDefinitionIdentifier createPsi(@Nonnull TemplateDefinitionStub stub) {
      return new SoyTemplateDefinitionIdentifierImpl(stub, this);
    }

    @Nonnull
    @Override
    public TemplateDefinitionStub createStub(
      @Nonnull SoyTemplateDefinitionIdentifier psi, StubElement parentStub) {
      return new TemplateDefinitionStub(parentStub, psi.getName());
    }

    @Nonnull
    @Override
    public String getExternalId() {
      return "TEMPLATE_DEFINITION_IDENTIFIER";
    }

    @Override
    public void serialize(
      @Nonnull TemplateDefinitionStub stub, @Nonnull StubOutputStream dataStream)
      throws IOException {
      dataStream.writeName(stub.getName());
    }

    @Nonnull
    @Override
    public TemplateDefinitionStub deserialize(
      @Nonnull StubInputStream dataStream, StubElement parentStub) throws IOException {
      final StringRef ref = dataStream.readName();
      return new TemplateDefinitionStub(parentStub, ref.getString());
    }

    @Override
    public void indexStub(@Nonnull TemplateDefinitionStub stub, @Nonnull IndexSink sink) {
    }
  }
}
