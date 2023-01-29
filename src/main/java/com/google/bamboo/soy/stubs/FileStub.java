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
import com.google.bamboo.soy.file.SoyFile;
import consulo.language.Language;
import consulo.language.psi.PsiFile;
import consulo.language.psi.stub.*;

import javax.annotation.Nonnull;
import java.io.IOException;

public class FileStub extends PsiFileStubImpl<SoyFile> {
  public static final Type TYPE = new Type("SoyFile", SoyLanguage.INSTANCE);

  public FileStub(SoyFile file) {
    super(file);
  }

  @Override
  public IStubFileElementType getType() {
    return TYPE;
  }

  // May only be called when the stub tree is fully constructed.
  public String getNamespace() {
    NamespaceDeclarationStub namespaceDeclaration =
        (NamespaceDeclarationStub) findChildStubByType(NamespaceDeclarationStub.TYPE);
    return namespaceDeclaration == null ? "" : namespaceDeclaration.getName();
  }

  public static class Type extends IStubFileElementType<FileStub> {
    public static final int VERSION = 4;

    public Type(String debugName, Language language) {
      super(debugName, language);
    }

    @Override
    public StubBuilder getBuilder() {
      return new DefaultStubBuilder() {
        @Override
        protected StubElement createStubForFile(@Nonnull PsiFile file) {
          return new FileStub((SoyFile) file);
        }
      };
    }

    @Override
    public int getStubVersion() {
      return VERSION;
    }

    @Override
    public void serialize(@Nonnull FileStub stub, @Nonnull StubOutputStream dataStream)
        throws IOException {}

    @Nonnull
    @Override
    public FileStub deserialize(@Nonnull StubInputStream dataStream, StubElement parentStub)
        throws IOException {
      return new FileStub(null);
    }

    @Nonnull
    @Override
    public String getExternalId() {
      return "SoyFile";
    }
  }
}
