// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import com.google.bamboo.soy.elements.TagElement;
import com.google.bamboo.soy.elements.IdentifierElement;
import com.google.bamboo.soy.elements.AtInjectElement;
import com.google.bamboo.soy.elements.AtParamElement;
import com.google.bamboo.soy.elements.ChoiceClauseElement;
import com.google.bamboo.soy.elements.StatementElement;
import com.google.bamboo.soy.elements.CallStatementElement;
import com.google.bamboo.soy.elements.ForStatementElement;
import com.google.bamboo.soy.elements.ForeachStatementElement;
import com.google.bamboo.soy.elements.TagBlockElement;
import com.google.bamboo.soy.elements.MsgStatementElement;
import com.google.bamboo.soy.elements.NamespaceDeclarationElement;
import com.google.bamboo.soy.elements.VariableDefinitionElement;
import com.google.bamboo.soy.elements.ParamElement;
import com.google.bamboo.soy.elements.ParamIdentifierElement;
import com.google.bamboo.soy.elements.ChoiceStatementElement;
import com.google.bamboo.soy.elements.StatementListElement;
import com.google.bamboo.soy.elements.TemplateBlockElement;
import com.google.bamboo.soy.elements.TemplateDefinitionElement;

public class SoyVisitor extends PsiElementVisitor {

  public void visitAddBinExpr(@Nonnull SoyAddBinExpr o) {
    visitExpr(o);
  }

  public void visitAliasBlock(@Nonnull SoyAliasBlock o) {
    visitTagElement(o);
  }

  public void visitAliasIdentifier(@Nonnull SoyAliasIdentifier o) {
    visitPsiElement(o);
  }

  public void visitAndBinExpr(@Nonnull SoyAndBinExpr o) {
    visitExpr(o);
  }

  public void visitAnyStringLiteral(@Nonnull SoyAnyStringLiteral o) {
    visitIdentifierElement(o);
  }

  public void visitAtInjectSingle(@Nonnull SoyAtInjectSingle o) {
    visitAtInjectElement(o);
  }

  public void visitAtParamSingle(@Nonnull SoyAtParamSingle o) {
    visitAtParamElement(o);
  }

  public void visitAttributeKeyValuePair(@Nonnull SoyAttributeKeyValuePair o) {
    visitPsiElement(o);
  }

  public void visitAttributeNameIdentifier(@Nonnull SoyAttributeNameIdentifier o) {
    visitPsiElement(o);
  }

  public void visitBeginCall(@Nonnull SoyBeginCall o) {
    visitTagElement(o);
  }

  public void visitBeginChoice(@Nonnull SoyBeginChoice o) {
    visitTagElement(o);
  }

  public void visitBeginChoiceClause(@Nonnull SoyBeginChoiceClause o) {
    visitTagElement(o);
  }

  public void visitBeginElseIf(@Nonnull SoyBeginElseIf o) {
    visitTagElement(o);
  }

  public void visitBeginFor(@Nonnull SoyBeginFor o) {
    visitTagElement(o);
  }

  public void visitBeginForeach(@Nonnull SoyBeginForeach o) {
    visitTagElement(o);
  }

  public void visitBeginIf(@Nonnull SoyBeginIf o) {
    visitTagElement(o);
  }

  public void visitBeginLet(@Nonnull SoyBeginLet o) {
    visitTagElement(o);
  }

  public void visitBeginMsg(@Nonnull SoyBeginMsg o) {
    visitTagElement(o);
  }

  public void visitBeginParamTag(@Nonnull SoyBeginParamTag o) {
    visitTagElement(o);
  }

  public void visitBeginTemplate(@Nonnull SoyBeginTemplate o) {
    visitTagElement(o);
  }

  public void visitBlockList(@Nonnull SoyBlockList o) {
    visitPsiElement(o);
  }

  public void visitBoolAndBinExpr(@Nonnull SoyBoolAndBinExpr o) {
    visitExpr(o);
  }

  public void visitBoolOrBinExpr(@Nonnull SoyBoolOrBinExpr o) {
    visitExpr(o);
  }

  public void visitCatchallBraces(@Nonnull SoyCatchallBraces o) {
    visitPsiElement(o);
  }

  public void visitChoiceClause(@Nonnull SoyChoiceClause o) {
    visitChoiceClauseElement(o);
  }

  public void visitCommaSeparatedExpressionList(@Nonnull SoyCommaSeparatedExpressionList o) {
    visitPsiElement(o);
  }

  public void visitCommaSeparatedKeyValueList(@Nonnull SoyCommaSeparatedKeyValueList o) {
    visitPsiElement(o);
  }

  public void visitCompBinExpr(@Nonnull SoyCompBinExpr o) {
    visitExpr(o);
  }

  public void visitCompoundType(@Nonnull SoyCompoundType o) {
    visitPsiElement(o);
  }

  public void visitCssStatement(@Nonnull SoyCssStatement o) {
    visitStatementElement(o);
    // visitTagElement(o);
  }

  public void visitDelCallStatement(@Nonnull SoyDelCallStatement o) {
    visitCallStatementElement(o);
  }

  public void visitDelegatePackageBlock(@Nonnull SoyDelegatePackageBlock o) {
    visitTagElement(o);
  }

  public void visitDirectCallStatement(@Nonnull SoyDirectCallStatement o) {
    visitCallStatementElement(o);
  }

  public void visitDirective(@Nonnull SoyDirective o) {
    visitPsiElement(o);
  }

  public void visitElseTag(@Nonnull SoyElseTag o) {
    visitTagElement(o);
  }

  public void visitEndTag(@Nonnull SoyEndTag o) {
    visitTagElement(o);
  }

  public void visitExpr(@Nonnull SoyExpr o) {
    visitPsiElement(o);
  }

  public void visitFallbackMsgTag(@Nonnull SoyFallbackMsgTag o) {
    visitTagElement(o);
  }

  public void visitFieldExpr(@Nonnull SoyFieldExpr o) {
    visitExpr(o);
  }

  public void visitFieldIdentifier(@Nonnull SoyFieldIdentifier o) {
    visitPsiElement(o);
  }

  public void visitForStatement(@Nonnull SoyForStatement o) {
    visitForStatementElement(o);
  }

  public void visitForeachStatement(@Nonnull SoyForeachStatement o) {
    visitForeachStatementElement(o);
  }

  public void visitFunctionCallExpr(@Nonnull SoyFunctionCallExpr o) {
    visitExpr(o);
  }

  public void visitFunctionIdentifier(@Nonnull SoyFunctionIdentifier o) {
    visitPsiElement(o);
  }

  public void visitIfEmptyTag(@Nonnull SoyIfEmptyTag o) {
    visitTagElement(o);
  }

  public void visitIfStatement(@Nonnull SoyIfStatement o) {
    visitStatementElement(o);
    // visitTagBlockElement(o);
  }

  public void visitIndexExpr(@Nonnull SoyIndexExpr o) {
    visitExpr(o);
  }

  public void visitKeyValue(@Nonnull SoyKeyValue o) {
    visitPsiElement(o);
  }

  public void visitLetCompoundStatement(@Nonnull SoyLetCompoundStatement o) {
    visitStatementElement(o);
    // visitTagBlockElement(o);
  }

  public void visitLetSingleStatement(@Nonnull SoyLetSingleStatement o) {
    visitStatementElement(o);
    // visitTagElement(o);
  }

  public void visitListExpr(@Nonnull SoyListExpr o) {
    visitExpr(o);
  }

  public void visitListType(@Nonnull SoyListType o) {
    visitPsiElement(o);
  }

  public void visitLiteralExpr(@Nonnull SoyLiteralExpr o) {
    visitExpr(o);
  }

  public void visitLiteralStatement(@Nonnull SoyLiteralStatement o) {
    visitStatementElement(o);
  }

  public void visitMapExpr(@Nonnull SoyMapExpr o) {
    visitExpr(o);
  }

  public void visitMapType(@Nonnull SoyMapType o) {
    visitPsiElement(o);
  }

  public void visitMsgStatement(@Nonnull SoyMsgStatement o) {
    visitMsgStatementElement(o);
  }

  public void visitMulBinExpr(@Nonnull SoyMulBinExpr o) {
    visitExpr(o);
  }

  public void visitNamespaceBlock(@Nonnull SoyNamespaceBlock o) {
    visitTagElement(o);
  }

  public void visitNamespaceDeclarationIdentifier(@Nonnull SoyNamespaceDeclarationIdentifier o) {
    visitNamespaceDeclarationElement(o);
  }

  public void visitNamespaceIdentifier(@Nonnull SoyNamespaceIdentifier o) {
    visitPsiElement(o);
  }

  public void visitNullCheckBinExpr(@Nonnull SoyNullCheckBinExpr o) {
    visitExpr(o);
  }

  public void visitNullCheckTernaryExpr(@Nonnull SoyNullCheckTernaryExpr o) {
    visitExpr(o);
  }

  public void visitOrBinExpr(@Nonnull SoyOrBinExpr o) {
    visitExpr(o);
  }

  public void visitPackageIdentifier(@Nonnull SoyPackageIdentifier o) {
    visitPsiElement(o);
  }

  public void visitParamDefinitionIdentifier(@Nonnull SoyParamDefinitionIdentifier o) {
    visitVariableDefinitionElement(o);
  }

  public void visitParamListElement(@Nonnull SoyParamListElement o) {
    visitParamElement(o);
  }

  public void visitParamSpecificationIdentifier(@Nonnull SoyParamSpecificationIdentifier o) {
    visitParamIdentifierElement(o);
  }

  public void visitParenthesizedExpr(@Nonnull SoyParenthesizedExpr o) {
    visitExpr(o);
  }

  public void visitPluralStatement(@Nonnull SoyPluralStatement o) {
    visitChoiceStatementElement(o);
  }

  public void visitPrimitiveType(@Nonnull SoyPrimitiveType o) {
    visitPsiElement(o);
  }

  public void visitPrintStatement(@Nonnull SoyPrintStatement o) {
    visitStatementElement(o);
    // visitTagElement(o);
  }

  public void visitProtobufEnum(@Nonnull SoyProtobufEnum o) {
    visitPsiElement(o);
  }

  public void visitRecordType(@Nonnull SoyRecordType o) {
    visitPsiElement(o);
  }

  public void visitRecordTypeField(@Nonnull SoyRecordTypeField o) {
    visitPsiElement(o);
  }

  public void visitRelCompBinExpr(@Nonnull SoyRelCompBinExpr o) {
    visitExpr(o);
  }

  public void visitSelectStatement(@Nonnull SoySelectStatement o) {
    visitChoiceStatementElement(o);
  }

  public void visitSpecialCharacterStatement(@Nonnull SoySpecialCharacterStatement o) {
    visitStatementElement(o);
    // visitTagElement(o);
  }

  public void visitStatementList(@Nonnull SoyStatementList o) {
    visitStatementListElement(o);
  }

  public void visitSwitchStatement(@Nonnull SoySwitchStatement o) {
    visitChoiceStatementElement(o);
  }

  public void visitTemplateBlock(@Nonnull SoyTemplateBlock o) {
    visitTemplateBlockElement(o);
  }

  public void visitTemplateDefinitionIdentifier(@Nonnull SoyTemplateDefinitionIdentifier o) {
    visitTemplateDefinitionElement(o);
  }

  public void visitTemplateReferenceIdentifier(@Nonnull SoyTemplateReferenceIdentifier o) {
    visitIdentifierElement(o);
  }

  public void visitTypeExpression(@Nonnull SoyTypeExpression o) {
    visitPsiElement(o);
  }

  public void visitTypeIdentifier(@Nonnull SoyTypeIdentifier o) {
    visitPsiElement(o);
  }

  public void visitUnaryExpr(@Nonnull SoyUnaryExpr o) {
    visitExpr(o);
  }

  public void visitUnexpectedStatements(@Nonnull SoyUnexpectedStatements o) {
    visitPsiElement(o);
  }

  public void visitUnionType(@Nonnull SoyUnionType o) {
    visitPsiElement(o);
  }

  public void visitVariableDefinitionIdentifier(@Nonnull SoyVariableDefinitionIdentifier o) {
    visitVariableDefinitionElement(o);
  }

  public void visitVariableReferenceIdentifier(@Nonnull SoyVariableReferenceIdentifier o) {
    visitExpr(o);
    // visitIdentifierElement(o);
  }

  public void visitXidStatement(@Nonnull SoyXidStatement o) {
    visitStatementElement(o);
    // visitTagElement(o);
  }

  public void visitAtInjectElement(@Nonnull AtInjectElement o) {
    visitElement(o);
  }

  public void visitAtParamElement(@Nonnull AtParamElement o) {
    visitElement(o);
  }

  public void visitCallStatementElement(@Nonnull CallStatementElement o) {
    visitElement(o);
  }

  public void visitChoiceClauseElement(@Nonnull ChoiceClauseElement o) {
    visitElement(o);
  }

  public void visitChoiceStatementElement(@Nonnull ChoiceStatementElement o) {
    visitElement(o);
  }

  public void visitForStatementElement(@Nonnull ForStatementElement o) {
    visitElement(o);
  }

  public void visitForeachStatementElement(@Nonnull ForeachStatementElement o) {
    visitElement(o);
  }

  public void visitIdentifierElement(@Nonnull IdentifierElement o) {
    visitElement(o);
  }

  public void visitMsgStatementElement(@Nonnull MsgStatementElement o) {
    visitElement(o);
  }

  public void visitNamespaceDeclarationElement(@Nonnull NamespaceDeclarationElement o) {
    visitElement(o);
  }

  public void visitParamElement(@Nonnull ParamElement o) {
    visitElement(o);
  }

  public void visitParamIdentifierElement(@Nonnull ParamIdentifierElement o) {
    visitElement(o);
  }

  public void visitStatementElement(@Nonnull StatementElement o) {
    visitElement(o);
  }

  public void visitStatementListElement(@Nonnull StatementListElement o) {
    visitElement(o);
  }

  public void visitTagElement(@Nonnull TagElement o) {
    visitElement(o);
  }

  public void visitTemplateBlockElement(@Nonnull TemplateBlockElement o) {
    visitElement(o);
  }

  public void visitTemplateDefinitionElement(@Nonnull TemplateDefinitionElement o) {
    visitElement(o);
  }

  public void visitVariableDefinitionElement(@Nonnull VariableDefinitionElement o) {
    visitElement(o);
  }

  public void visitPsiElement(@Nonnull PsiElement o) {
    visitElement(o);
  }

}
