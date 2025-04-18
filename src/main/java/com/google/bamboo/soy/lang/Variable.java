package com.google.bamboo.soy.lang;

import com.google.bamboo.soy.elements.VariableDefinitionElement;
import consulo.language.psi.PsiNamedElement;

import jakarta.annotation.Nonnull;

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
