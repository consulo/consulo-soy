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

package com.google.bamboo.soy.stubs.index;

import com.google.bamboo.soy.parser.SoyTemplateBlock;
import consulo.annotation.component.ExtensionImpl;
import consulo.component.ProcessCanceledException;
import consulo.language.psi.stub.StringStubIndexExtension;
import consulo.language.psi.stub.StubIndexKey;
import consulo.project.Project;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Collection;

@ExtensionImpl
public class TemplateBlockIndex extends StringStubIndexExtension<SoyTemplateBlock> {
  public static final StubIndexKey<String, SoyTemplateBlock> KEY =
      StubIndexKey.createIndexKey("SoyTemplateBlock");
  public static final TemplateBlockIndex INSTANCE = new TemplateBlockIndex();

  @Nonnull
  @Override
  public StubIndexKey<String, SoyTemplateBlock> getKey() {
    return KEY;
  }

  @Nonnull
  @Override
  public Collection<String> getAllKeys(Project project) {
    try {
      return super.getAllKeys(project);
    } catch (ProcessCanceledException e) {
      return new ArrayList<>();
    }
  }
}
