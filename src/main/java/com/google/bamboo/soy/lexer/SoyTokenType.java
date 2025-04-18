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

package com.google.bamboo.soy.lexer;

import com.google.bamboo.soy.SoyLanguage;
import consulo.language.ast.IElementType;
import org.jetbrains.annotations.NonNls;
import jakarta.annotation.Nonnull;

public class SoyTokenType extends IElementType {

  public SoyTokenType(@Nonnull @NonNls String debugName) {
    super(debugName, SoyLanguage.INSTANCE);
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "." + super.toString();
  }
}
