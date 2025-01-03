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

import com.google.bamboo.soy.parser.SoyAnyStringLiteral;
import com.google.bamboo.soy.parser.SoyAttributeKeyValuePair;
import com.google.bamboo.soy.parser.SoyBeginMsg;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

public interface MsgStatementElement extends TagBlockElement, StatementElement {

  @Nonnull
  SoyBeginMsg getBeginMsg();

  @Nullable
  default String getDescription() {
    return getBeginMsg()
        .getAttributeKeyValuePairList()
        .stream()
        .filter(pair -> pair.getAttributeNameIdentifier().getText().equalsIgnoreCase("desc"))
        .findFirst()
        .map(SoyAttributeKeyValuePair::getAnyStringLiteral)
        .map(SoyAnyStringLiteral::getText)
        .orElse(null);
  }
}
