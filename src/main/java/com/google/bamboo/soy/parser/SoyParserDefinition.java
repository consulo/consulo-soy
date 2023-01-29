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

package com.google.bamboo.soy.parser;

import com.google.bamboo.soy.SoyLanguage;
import com.google.bamboo.soy.file.SoyFile;
import com.google.bamboo.soy.lexer.SoyLexer;
import com.google.bamboo.soy.lexer.SoyTokenTypes;
import com.google.bamboo.soy.stubs.FileStub;
import consulo.annotation.component.ExtensionImpl;
import consulo.language.Language;
import consulo.language.ast.ASTNode;
import consulo.language.ast.TokenSet;
import consulo.language.file.FileViewProvider;
import consulo.language.lexer.Lexer;
import consulo.language.parser.ParserDefinition;
import consulo.language.parser.PsiParser;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiFile;
import consulo.language.psi.stub.IStubFileElementType;
import consulo.language.version.LanguageVersion;

import javax.annotation.Nonnull;

@ExtensionImpl
public class SoyParserDefinition implements ParserDefinition {
  @Nonnull
  @Override
  public Language getLanguage() {
    return SoyLanguage.INSTANCE;
  }

  @Nonnull
  @Override
  public Lexer createLexer(LanguageVersion languageVersion) {
    return new SoyLexer();
  }

  @Nonnull
  public TokenSet getWhitespaceTokens(LanguageVersion languageVersion) {
    return SoyTokenTypes.WHITE_SPACES;
  }

  @Nonnull
  public TokenSet getCommentTokens(LanguageVersion languageVersion) {
    return SoyTokenTypes.COMMENTS;
  }

  @Nonnull
  public TokenSet getStringLiteralElements(LanguageVersion languageVersion) {
    return SoyTokenTypes.STRINGS;
  }

  @Nonnull
  public PsiParser createParser(LanguageVersion languageVersion) {
    return new SoyParser();
  }

  @Override
  public IStubFileElementType<FileStub> getFileNodeType() {
    return FileStub.TYPE;
  }

  public PsiFile createFile(FileViewProvider viewProvider) {
    return new SoyFile(viewProvider);
  }

  public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
    return SpaceRequirements.MAY;
  }

  @Nonnull
  public PsiElement createElement(ASTNode node) {
    return SoyTypes.Factory.createElement(node);
  }
}
