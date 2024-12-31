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
import com.google.bamboo.soy.parser.SoyAtParamSingle;
import com.google.bamboo.soy.parser.impl.SoyAtParamSingleImpl;
import consulo.index.io.StringRef;
import consulo.language.psi.stub.*;

import jakarta.annotation.Nonnull;
import java.io.IOException;

public class AtParamStub extends NamedStubBase<SoyAtParamSingle> {
  public static final Type TYPE = new Type();
  public final String type;
  public final boolean isOptional;

  AtParamStub(StubElement parent, String name, String type, boolean isOptional) {
    super(parent, TYPE, name);
    this.type = type;
    this.isOptional = isOptional;
  }

  static class Type extends IStubElementType<AtParamStub, SoyAtParamSingle> {
    Type() {
      super("AT_PARAM", SoyLanguage.INSTANCE);
    }

    @Override
    public SoyAtParamSingle createPsi(@Nonnull AtParamStub stub) {
      return new SoyAtParamSingleImpl(stub, this);
    }

    @Nonnull
    @Override
    public AtParamStub createStub(@Nonnull SoyAtParamSingle psi, StubElement parentStub) {
      return new AtParamStub(parentStub, psi.getName(), psi.getType(), psi.isOptional());
    }

    @Nonnull
    @Override
    public String getExternalId() {
      return "AT_PARAM";
    }

    @Override
    public void serialize(@Nonnull AtParamStub stub, @Nonnull StubOutputStream dataStream)
        throws IOException {
      dataStream.writeName(stub.getName());
      dataStream.writeName(stub.type);
      dataStream.writeBoolean(stub.isOptional);
    }

    @Nonnull
    @Override
    public AtParamStub deserialize(@Nonnull StubInputStream dataStream, StubElement parentStub)
        throws IOException {
      final StringRef ref = dataStream.readName();
      final StringRef ref2 = dataStream.readName();
      return new AtParamStub(
          parentStub, ref.getString(), ref2.getString(), dataStream.readBoolean());
    }

    @Override
    public void indexStub(@Nonnull AtParamStub stub, @Nonnull IndexSink sink) {}
  }
}
