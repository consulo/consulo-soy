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

package com.google.bamboo.soy.format;

import com.google.bamboo.soy.SoyCodeInsightFixtureTestCase;
import consulo.language.codeStyle.CodeStyleManager;
import consulo.language.editor.WriteCommandAction;
import consulo.util.collection.ContainerUtil;

public abstract class SoyFormatterTest extends SoyCodeInsightFixtureTestCase {

  @Override
  protected String getBasePath() {
    return "/format";
  }

  protected void doTest() throws Throwable {
    myFixture.configureByFiles(getTestName(false) + ".soy");
    new WriteCommandAction.Simple(getProject()) {
      @Override
      protected void run() throws Throwable {
        CodeStyleManager.getInstance(getProject()).reformatText(myFixture.getFile(),
                                                                ContainerUtil.newArrayList(myFixture.getFile().getTextRange()));
      }
    }.execute();
    myFixture.checkResultByFile(getTestName(false) + "_after.soy");
  }


  public void testNestedBlocks() throws Throwable {
    doTest();
  }

  public void testSpacing() throws Throwable {
    doTest();
  }
}
