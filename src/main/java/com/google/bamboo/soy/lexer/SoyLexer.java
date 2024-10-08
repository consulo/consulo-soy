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

import com.google.bamboo.soy.parser.SoyTypes;
import consulo.language.lexer.MergeFunction;
import consulo.language.ast.TokenType;
import consulo.language.ast.IElementType;
import consulo.language.lexer.Lexer;
import consulo.language.lexer.MergingLexerAdapterBase;

public class SoyLexer extends MergingLexerAdapterBase {
  public SoyLexer() {
    super(new SoyRawLexer());
  }

  @Override
  public MergeFunction getMergeFunction() {
    return ((final IElementType type, final Lexer originalLexer) -> {
      if (type == SoyTypes.OTHER || type == TokenType.WHITE_SPACE) {
        IElementType returnType =  type;
        while (originalLexer.getTokenType() == SoyTypes.OTHER
            || originalLexer.getTokenType() == TokenType.WHITE_SPACE) {
          if (originalLexer.getTokenType() == SoyTypes.OTHER) {
            returnType = SoyTypes.OTHER;
          }
          originalLexer.advance();
        }
        return returnType;
      }

      return type;
    });
  }
}
