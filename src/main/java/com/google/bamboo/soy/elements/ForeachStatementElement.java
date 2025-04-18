package com.google.bamboo.soy.elements;

import com.google.bamboo.soy.lang.Scope;
import com.google.bamboo.soy.lang.Variable;
import com.google.bamboo.soy.parser.SoyBeginForeach;
import com.google.common.collect.ImmutableList;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import java.util.List;

public interface ForeachStatementElement extends Scope, TagBlockElement, StatementElement {

  @Nonnull
  SoyBeginForeach getBeginForeach();

  @Nullable
  @Override
  default Scope getParentScope() {
    return Scope.getScope(this);
  }

  @Nonnull
  @Override
  default List<Variable> getLocalVariables() {
    return getBeginForeach().getVariableDefinitionIdentifier() != null
        ? ImmutableList.of(getBeginForeach().getVariableDefinitionIdentifier().toVariable())
        : ImmutableList.of();
  }
}
