package com.google.bamboo.soy.lang;

import com.google.bamboo.soy.elements.VariableDefinitionElement;
import com.intellij.psi.PsiNamedElement;

import javax.annotation.Nonnull;

public class Variable {
  public final String name;
  public final String type;
  public final PsiNamedElement element;

  public Variable(String name, String type, @Nonnull VariableDefinitionElement element) {
    this.name = name.replaceFirst("^\\$", "");
    this.type = type;
    this.element = element;
  }
}
