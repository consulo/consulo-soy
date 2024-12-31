package com.google.bamboo.soy.elements;

import com.google.bamboo.soy.lang.Variable;
import com.google.bamboo.soy.parser.SoyLetCompoundStatement;
import com.google.bamboo.soy.parser.SoyLetSingleStatement;
import com.google.bamboo.soy.lang.Scope;
import com.google.bamboo.soy.parser.SoyVariableDefinitionIdentifier;
import consulo.language.psi.PsiElement;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

public interface StatementListElement extends Scope, PsiElement {
  @Nonnull
  List<SoyLetCompoundStatement> getLetCompoundStatementList();

  @Nonnull
  List<SoyLetSingleStatement> getLetSingleStatementList();

  @Nullable
  @Override
  default Scope getParentScope() {
    return Scope.getScope(this);
  }

  @Nonnull
  @Override
  default List<Variable> getLocalVariables() {
    return Stream.concat(
        getLetSingleStatementList()
            .stream()
            .map(SoyLetSingleStatement::getVariableDefinitionIdentifier),
        getLetCompoundStatementList()
            .stream()
            .map((let) -> let.getBeginLet().getVariableDefinitionIdentifier()))
        .map(SoyVariableDefinitionIdentifier::toVariable)
        .collect(Collectors.toList());
  }
}
