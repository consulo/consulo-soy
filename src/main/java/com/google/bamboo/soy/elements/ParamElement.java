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

package com.google.bamboo.soy.elements;

import com.google.bamboo.soy.parser.SoyBeginParamTag;
import com.google.bamboo.soy.parser.SoyEndTag;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

public interface ParamElement extends TagBlockElement {

  @Nonnull
  SoyBeginParamTag getBeginParamTag();

  @Nullable
  default String getParamName() {
    try {
      return getBeginParamTag().getParamSpecificationIdentifier().getText();
    } catch (NullPointerException e) {
      return null;
    }
  }

  @Nullable
  default String getInlinedValue() {
    try {
      return getBeginParamTag().getExpr().getText();
    } catch (NullPointerException e) {
      return null;
    }
  }

  @Override
  default boolean isIncomplete() {
    return !getBeginParamTag().isSelfClosed() && !(getLastChild() instanceof SoyEndTag);
  }
}
