package com.google.bamboo.soy.elements;

import com.google.bamboo.soy.lang.Scope;
import com.google.bamboo.soy.lang.Variable;
import com.google.bamboo.soy.parser.SoyBeginFor;
import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface ForStatementElement extends Scope, TagBlockElement, StatementElement {

  @Nonnull
  SoyBeginFor getBeginFor();

  @Nullable
  @Override
  default Scope getParentScope() {
    return Scope.getScope(this);
  }

  @Nonnull
  @Override
  default List<Variable> getLocalVariables() {
    return getBeginFor().getVariableDefinitionIdentifier() != null
        ? ImmutableList.of(getBeginFor().getVariableDefinitionIdentifier().toVariable())
        : ImmutableList.of();
  }
}
