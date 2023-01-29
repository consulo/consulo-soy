// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import consulo.language.ast.IElementType;
import consulo.language.psi.PsiElement;
import consulo.language.ast.ASTNode;
import com.google.bamboo.soy.stubs.StubFactory;
import com.google.bamboo.soy.lexer.SoyTokenType;
import com.google.bamboo.soy.parser.impl.*;

public interface SoyTypes {

  IElementType ADD_BIN_EXPR = new SoyElementType("ADD_BIN_EXPR");
  IElementType ALIAS_BLOCK = new SoyElementType("ALIAS_BLOCK");
  IElementType ALIAS_IDENTIFIER = new SoyElementType("ALIAS_IDENTIFIER");
  IElementType AND_BIN_EXPR = new SoyElementType("AND_BIN_EXPR");
  IElementType ANY_STRING_LITERAL = new SoyElementType("ANY_STRING_LITERAL");
  IElementType ATTRIBUTE_KEY_VALUE_PAIR = new SoyElementType("ATTRIBUTE_KEY_VALUE_PAIR");
  IElementType ATTRIBUTE_NAME_IDENTIFIER = new SoyElementType("ATTRIBUTE_NAME_IDENTIFIER");
  IElementType AT_INJECT_SINGLE = new SoyElementType("AT_INJECT_SINGLE");
  IElementType AT_PARAM_SINGLE = StubFactory.getType("AT_PARAM_SINGLE");
  IElementType BEGIN_CALL = new SoyElementType("BEGIN_CALL");
  IElementType BEGIN_CHOICE = new SoyElementType("BEGIN_CHOICE");
  IElementType BEGIN_CHOICE_CLAUSE = new SoyElementType("BEGIN_CHOICE_CLAUSE");
  IElementType BEGIN_ELSE_IF = new SoyElementType("BEGIN_ELSE_IF");
  IElementType BEGIN_FOR = new SoyElementType("BEGIN_FOR");
  IElementType BEGIN_FOREACH = new SoyElementType("BEGIN_FOREACH");
  IElementType BEGIN_IF = new SoyElementType("BEGIN_IF");
  IElementType BEGIN_LET = new SoyElementType("BEGIN_LET");
  IElementType BEGIN_MSG = new SoyElementType("BEGIN_MSG");
  IElementType BEGIN_PARAM_TAG = new SoyElementType("BEGIN_PARAM_TAG");
  IElementType BEGIN_TEMPLATE = new SoyElementType("BEGIN_TEMPLATE");
  IElementType BLOCK_LIST = new SoyElementType("BLOCK_LIST");
  IElementType BOOL_AND_BIN_EXPR = new SoyElementType("BOOL_AND_BIN_EXPR");
  IElementType BOOL_OR_BIN_EXPR = new SoyElementType("BOOL_OR_BIN_EXPR");
  IElementType CATCHALL_BRACES = new SoyElementType("CATCHALL_BRACES");
  IElementType CHOICE_CLAUSE = new SoyElementType("CHOICE_CLAUSE");
  IElementType COMMA_SEPARATED_EXPRESSION_LIST = new SoyElementType("COMMA_SEPARATED_EXPRESSION_LIST");
  IElementType COMMA_SEPARATED_KEY_VALUE_LIST = new SoyElementType("COMMA_SEPARATED_KEY_VALUE_LIST");
  IElementType COMPOUND_TYPE = new SoyElementType("COMPOUND_TYPE");
  IElementType COMP_BIN_EXPR = new SoyElementType("COMP_BIN_EXPR");
  IElementType CSS_STATEMENT = new SoyElementType("CSS_STATEMENT");
  IElementType DELEGATE_PACKAGE_BLOCK = new SoyElementType("DELEGATE_PACKAGE_BLOCK");
  IElementType DEL_CALL_STATEMENT = new SoyElementType("DEL_CALL_STATEMENT");
  IElementType DIRECTIVE = new SoyElementType("DIRECTIVE");
  IElementType DIRECT_CALL_STATEMENT = new SoyElementType("DIRECT_CALL_STATEMENT");
  IElementType ELSE_TAG = new SoyElementType("ELSE_TAG");
  IElementType END_TAG = new SoyElementType("END_TAG");
  IElementType EXPR = new SoyElementType("EXPR");
  IElementType FALLBACK_MSG_TAG = new SoyElementType("FALLBACK_MSG_TAG");
  IElementType FIELD_EXPR = new SoyElementType("FIELD_EXPR");
  IElementType FIELD_IDENTIFIER = new SoyElementType("FIELD_IDENTIFIER");
  IElementType FOREACH_STATEMENT = new SoyElementType("FOREACH_STATEMENT");
  IElementType FOR_STATEMENT = new SoyElementType("FOR_STATEMENT");
  IElementType FUNCTION_CALL_EXPR = new SoyElementType("FUNCTION_CALL_EXPR");
  IElementType FUNCTION_IDENTIFIER = new SoyElementType("FUNCTION_IDENTIFIER");
  IElementType IF_EMPTY_TAG = new SoyElementType("IF_EMPTY_TAG");
  IElementType IF_STATEMENT = new SoyElementType("IF_STATEMENT");
  IElementType INDEX_EXPR = new SoyElementType("INDEX_EXPR");
  IElementType KEY_VALUE = new SoyElementType("KEY_VALUE");
  IElementType LET_COMPOUND_STATEMENT = new SoyElementType("LET_COMPOUND_STATEMENT");
  IElementType LET_SINGLE_STATEMENT = new SoyElementType("LET_SINGLE_STATEMENT");
  IElementType LIST_EXPR = new SoyElementType("LIST_EXPR");
  IElementType LIST_TYPE = new SoyElementType("LIST_TYPE");
  IElementType LITERAL_EXPR = new SoyElementType("LITERAL_EXPR");
  IElementType LITERAL_STATEMENT = new SoyElementType("LITERAL_STATEMENT");
  IElementType MAP_EXPR = new SoyElementType("MAP_EXPR");
  IElementType MAP_TYPE = new SoyElementType("MAP_TYPE");
  IElementType MSG_STATEMENT = new SoyElementType("MSG_STATEMENT");
  IElementType MUL_BIN_EXPR = new SoyElementType("MUL_BIN_EXPR");
  IElementType NAMESPACE_BLOCK = new SoyElementType("NAMESPACE_BLOCK");
  IElementType NAMESPACE_DECLARATION_IDENTIFIER = StubFactory.getType("NAMESPACE_DECLARATION_IDENTIFIER");
  IElementType NAMESPACE_IDENTIFIER = new SoyElementType("NAMESPACE_IDENTIFIER");
  IElementType NULL_CHECK_BIN_EXPR = new SoyElementType("NULL_CHECK_BIN_EXPR");
  IElementType NULL_CHECK_TERNARY_EXPR = new SoyElementType("NULL_CHECK_TERNARY_EXPR");
  IElementType OR_BIN_EXPR = new SoyElementType("OR_BIN_EXPR");
  IElementType PACKAGE_IDENTIFIER = new SoyElementType("PACKAGE_IDENTIFIER");
  IElementType PARAM_DEFINITION_IDENTIFIER = new SoyElementType("PARAM_DEFINITION_IDENTIFIER");
  IElementType PARAM_LIST_ELEMENT = new SoyElementType("PARAM_LIST_ELEMENT");
  IElementType PARAM_SPECIFICATION_IDENTIFIER = new SoyElementType("PARAM_SPECIFICATION_IDENTIFIER");
  IElementType PARENTHESIZED_EXPR = new SoyElementType("PARENTHESIZED_EXPR");
  IElementType PLURAL_STATEMENT = new SoyElementType("PLURAL_STATEMENT");
  IElementType PRIMITIVE_TYPE = new SoyElementType("PRIMITIVE_TYPE");
  IElementType PRINT_STATEMENT = new SoyElementType("PRINT_STATEMENT");
  IElementType PROTOBUF_ENUM = new SoyElementType("PROTOBUF_ENUM");
  IElementType RECORD_TYPE = new SoyElementType("RECORD_TYPE");
  IElementType RECORD_TYPE_FIELD = new SoyElementType("RECORD_TYPE_FIELD");
  IElementType REL_COMP_BIN_EXPR = new SoyElementType("REL_COMP_BIN_EXPR");
  IElementType SELECT_STATEMENT = new SoyElementType("SELECT_STATEMENT");
  IElementType SPECIAL_CHARACTER_STATEMENT = new SoyElementType("SPECIAL_CHARACTER_STATEMENT");
  IElementType STATEMENT_LIST = new SoyElementType("STATEMENT_LIST");
  IElementType SWITCH_STATEMENT = new SoyElementType("SWITCH_STATEMENT");
  IElementType TEMPLATE_BLOCK = StubFactory.getType("TEMPLATE_BLOCK");
  IElementType TEMPLATE_DEFINITION_IDENTIFIER = StubFactory.getType("TEMPLATE_DEFINITION_IDENTIFIER");
  IElementType TEMPLATE_REFERENCE_IDENTIFIER = new SoyElementType("TEMPLATE_REFERENCE_IDENTIFIER");
  IElementType TYPE_EXPRESSION = new SoyElementType("TYPE_EXPRESSION");
  IElementType TYPE_IDENTIFIER = new SoyElementType("TYPE_IDENTIFIER");
  IElementType UNARY_EXPR = new SoyElementType("UNARY_EXPR");
  IElementType UNEXPECTED_STATEMENTS = new SoyElementType("UNEXPECTED_STATEMENTS");
  IElementType UNION_TYPE = new SoyElementType("UNION_TYPE");
  IElementType VARIABLE_DEFINITION_IDENTIFIER = new SoyElementType("VARIABLE_DEFINITION_IDENTIFIER");
  IElementType VARIABLE_REFERENCE_IDENTIFIER = new SoyElementType("VARIABLE_REFERENCE_IDENTIFIER");
  IElementType XID_STATEMENT = new SoyElementType("XID_STATEMENT");

  IElementType ALIAS = new SoyTokenType("alias");
  IElementType AMP_AMP = new SoyTokenType("&&");
  IElementType AND = new SoyTokenType("and");
  IElementType ANY = new SoyTokenType("any");
  IElementType AS = new SoyTokenType("as");
  IElementType ATTRIBUTES = new SoyTokenType("attributes");
  IElementType AT_INJECT = new SoyTokenType("@inject");
  IElementType AT_INJECT_OPT = new SoyTokenType("@inject?");
  IElementType AT_PARAM = new SoyTokenType("@param");
  IElementType AT_PARAM_OPT = new SoyTokenType("@param?");
  IElementType BOOL = new SoyTokenType("bool");
  IElementType BOOL_LITERAL = new SoyTokenType("BOOL_LITERAL");
  IElementType CALL = new SoyTokenType("call");
  IElementType CARRIAGE_RETURN = new SoyTokenType("\\\\r");
  IElementType CASE = new SoyTokenType("case");
  IElementType COLON = new SoyTokenType(":");
  IElementType COMMA = new SoyTokenType(",");
  IElementType COMMENT_BLOCK = new SoyTokenType("COMMENT_BLOCK");
  IElementType CSS = new SoyTokenType("css");
  IElementType CSS_XID_IDENTIFIER = new SoyTokenType("CSS_XID_IDENTIFIER");
  IElementType DEFAULT = new SoyTokenType("default");
  IElementType DELCALL = new SoyTokenType("delcall");
  IElementType DELPACKAGE = new SoyTokenType("delpackage");
  IElementType DELTEMPLATE = new SoyTokenType("deltemplate");
  IElementType DOC_COMMENT_BLOCK = new SoyTokenType("DOC_COMMENT_BLOCK");
  IElementType DOLLAR = new SoyTokenType("$");
  IElementType DOT = new SoyTokenType(".");
  IElementType DOT_NULL_CHECK = new SoyTokenType("?.");
  IElementType ELSE = new SoyTokenType("else");
  IElementType ELSEIF = new SoyTokenType("elseif");
  IElementType END_LITERAL = new SoyTokenType("END_LITERAL");
  IElementType END_LITERAL_DOUBLE = new SoyTokenType("END_LITERAL_DOUBLE");
  IElementType EQUAL = new SoyTokenType("=");
  IElementType EQUAL_EQUAL = new SoyTokenType("==");
  IElementType EXCLAMATION = new SoyTokenType("!");
  IElementType FALLBACKMSG = new SoyTokenType("fallbackmsg");
  IElementType FLOAT = new SoyTokenType("float");
  IElementType FLOAT_LITERAL = new SoyTokenType("FLOAT_LITERAL");
  IElementType FOR = new SoyTokenType("for");
  IElementType FOREACH = new SoyTokenType("foreach");
  IElementType GREATER = new SoyTokenType(">");
  IElementType GREATER_EQUAL = new SoyTokenType(">=");
  IElementType HTML = new SoyTokenType("html");
  IElementType HTML_COMMENT = new SoyTokenType("HTML_COMMENT");
  IElementType IDENTIFIER_WORD = new SoyTokenType("IDENTIFIER_WORD");
  IElementType IF = new SoyTokenType("if");
  IElementType IFEMPTY = new SoyTokenType("ifempty");
  IElementType IN = new SoyTokenType("in");
  IElementType INDEX_NULL_CHECK = new SoyTokenType("?[");
  IElementType INT = new SoyTokenType("int");
  IElementType INTEGER_LITERAL = new SoyTokenType("INTEGER_LITERAL");
  IElementType JS = new SoyTokenType("js");
  IElementType LB = new SoyTokenType("lb");
  IElementType LBRACE = new SoyTokenType("{");
  IElementType LBRACE_LBRACE = new SoyTokenType("{{");
  IElementType LBRACE_LBRACE_SLASH = new SoyTokenType("{{/");
  IElementType LBRACE_SLASH = new SoyTokenType("{/");
  IElementType LESS = new SoyTokenType("<");
  IElementType LESS_EQUAL = new SoyTokenType("<=");
  IElementType LET = new SoyTokenType("let");
  IElementType LIST = new SoyTokenType("list");
  IElementType LITERAL = new SoyTokenType("{literal}");
  IElementType LITERAL_DOUBLE = new SoyTokenType("LITERAL_DOUBLE");
  IElementType MAP = new SoyTokenType("map");
  IElementType MINUS = new SoyTokenType("-");
  IElementType MSG = new SoyTokenType("msg");
  IElementType MULTI_LINE_STRING_LITERAL = new SoyTokenType("MULTI_LINE_STRING_LITERAL");
  IElementType NAMESPACE = new SoyTokenType("namespace");
  IElementType NEWLINE_LITERAL = new SoyTokenType("\\\\n");
  IElementType NIL = new SoyTokenType("nil");
  IElementType NOT = new SoyTokenType("not");
  IElementType NOT_EQUAL = new SoyTokenType("!=");
  IElementType NULL_LITERAL = new SoyTokenType("null");
  IElementType NUMBER = new SoyTokenType("number");
  IElementType OR = new SoyTokenType("or");
  IElementType OTHER = new SoyTokenType("OTHER");
  IElementType PARAM = new SoyTokenType("param");
  IElementType PARENS_CLOSE = new SoyTokenType(")");
  IElementType PARENS_OPEN = new SoyTokenType("(");
  IElementType PERCENT = new SoyTokenType("%");
  IElementType PIPE = new SoyTokenType("|");
  IElementType PIPE_PIPE = new SoyTokenType("||");
  IElementType PLURAL = new SoyTokenType("plural");
  IElementType PLUS = new SoyTokenType("+");
  IElementType PRINT = new SoyTokenType("print");
  IElementType QUALIFIED_IDENTIFIER = new SoyTokenType("QUALIFIED_IDENTIFIER");
  IElementType QUESTIONMARK = new SoyTokenType("?");
  IElementType RB = new SoyTokenType("rb");
  IElementType RBRACE = new SoyTokenType("}");
  IElementType RBRACE_RBRACE = new SoyTokenType("}}");
  IElementType SELECT = new SoyTokenType("select");
  IElementType SLASH = new SoyTokenType("/");
  IElementType SLASH_RBRACE = new SoyTokenType("/}");
  IElementType SLASH_RBRACE_RBRACE = new SoyTokenType("/}}");
  IElementType SP = new SoyTokenType("sp");
  IElementType SQUARE_CLOSE = new SoyTokenType("]");
  IElementType SQUARE_OPEN = new SoyTokenType("[");
  IElementType STAR = new SoyTokenType("*");
  IElementType STRING = new SoyTokenType("string");
  IElementType STRING_LITERAL = new SoyTokenType("STRING_LITERAL");
  IElementType SWITCH = new SoyTokenType("switch");
  IElementType TAB = new SoyTokenType("\\\\t");
  IElementType TEMPLATE = new SoyTokenType("template");
  IElementType TERNARY_COALESCER = new SoyTokenType("?:");
  IElementType URI = new SoyTokenType("uri");
  IElementType XID = new SoyTokenType("xid");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ADD_BIN_EXPR) {
        return new SoyAddBinExprImpl(node);
      }
      else if (type == ALIAS_BLOCK) {
        return new SoyAliasBlockImpl(node);
      }
      else if (type == ALIAS_IDENTIFIER) {
        return new SoyAliasIdentifierImpl(node);
      }
      else if (type == AND_BIN_EXPR) {
        return new SoyAndBinExprImpl(node);
      }
      else if (type == ANY_STRING_LITERAL) {
        return new SoyAnyStringLiteralImpl(node);
      }
      else if (type == ATTRIBUTE_KEY_VALUE_PAIR) {
        return new SoyAttributeKeyValuePairImpl(node);
      }
      else if (type == ATTRIBUTE_NAME_IDENTIFIER) {
        return new SoyAttributeNameIdentifierImpl(node);
      }
      else if (type == AT_INJECT_SINGLE) {
        return new SoyAtInjectSingleImpl(node);
      }
      else if (type == AT_PARAM_SINGLE) {
        return new SoyAtParamSingleImpl(node);
      }
      else if (type == BEGIN_CALL) {
        return new SoyBeginCallImpl(node);
      }
      else if (type == BEGIN_CHOICE) {
        return new SoyBeginChoiceImpl(node);
      }
      else if (type == BEGIN_CHOICE_CLAUSE) {
        return new SoyBeginChoiceClauseImpl(node);
      }
      else if (type == BEGIN_ELSE_IF) {
        return new SoyBeginElseIfImpl(node);
      }
      else if (type == BEGIN_FOR) {
        return new SoyBeginForImpl(node);
      }
      else if (type == BEGIN_FOREACH) {
        return new SoyBeginForeachImpl(node);
      }
      else if (type == BEGIN_IF) {
        return new SoyBeginIfImpl(node);
      }
      else if (type == BEGIN_LET) {
        return new SoyBeginLetImpl(node);
      }
      else if (type == BEGIN_MSG) {
        return new SoyBeginMsgImpl(node);
      }
      else if (type == BEGIN_PARAM_TAG) {
        return new SoyBeginParamTagImpl(node);
      }
      else if (type == BEGIN_TEMPLATE) {
        return new SoyBeginTemplateImpl(node);
      }
      else if (type == BLOCK_LIST) {
        return new SoyBlockListImpl(node);
      }
      else if (type == BOOL_AND_BIN_EXPR) {
        return new SoyBoolAndBinExprImpl(node);
      }
      else if (type == BOOL_OR_BIN_EXPR) {
        return new SoyBoolOrBinExprImpl(node);
      }
      else if (type == CATCHALL_BRACES) {
        return new SoyCatchallBracesImpl(node);
      }
      else if (type == CHOICE_CLAUSE) {
        return new SoyChoiceClauseImpl(node);
      }
      else if (type == COMMA_SEPARATED_EXPRESSION_LIST) {
        return new SoyCommaSeparatedExpressionListImpl(node);
      }
      else if (type == COMMA_SEPARATED_KEY_VALUE_LIST) {
        return new SoyCommaSeparatedKeyValueListImpl(node);
      }
      else if (type == COMPOUND_TYPE) {
        return new SoyCompoundTypeImpl(node);
      }
      else if (type == COMP_BIN_EXPR) {
        return new SoyCompBinExprImpl(node);
      }
      else if (type == CSS_STATEMENT) {
        return new SoyCssStatementImpl(node);
      }
      else if (type == DELEGATE_PACKAGE_BLOCK) {
        return new SoyDelegatePackageBlockImpl(node);
      }
      else if (type == DEL_CALL_STATEMENT) {
        return new SoyDelCallStatementImpl(node);
      }
      else if (type == DIRECTIVE) {
        return new SoyDirectiveImpl(node);
      }
      else if (type == DIRECT_CALL_STATEMENT) {
        return new SoyDirectCallStatementImpl(node);
      }
      else if (type == ELSE_TAG) {
        return new SoyElseTagImpl(node);
      }
      else if (type == END_TAG) {
        return new SoyEndTagImpl(node);
      }
      else if (type == EXPR) {
        return new SoyExprImpl(node);
      }
      else if (type == FALLBACK_MSG_TAG) {
        return new SoyFallbackMsgTagImpl(node);
      }
      else if (type == FIELD_EXPR) {
        return new SoyFieldExprImpl(node);
      }
      else if (type == FIELD_IDENTIFIER) {
        return new SoyFieldIdentifierImpl(node);
      }
      else if (type == FOREACH_STATEMENT) {
        return new SoyForeachStatementImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new SoyForStatementImpl(node);
      }
      else if (type == FUNCTION_CALL_EXPR) {
        return new SoyFunctionCallExprImpl(node);
      }
      else if (type == FUNCTION_IDENTIFIER) {
        return new SoyFunctionIdentifierImpl(node);
      }
      else if (type == IF_EMPTY_TAG) {
        return new SoyIfEmptyTagImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new SoyIfStatementImpl(node);
      }
      else if (type == INDEX_EXPR) {
        return new SoyIndexExprImpl(node);
      }
      else if (type == KEY_VALUE) {
        return new SoyKeyValueImpl(node);
      }
      else if (type == LET_COMPOUND_STATEMENT) {
        return new SoyLetCompoundStatementImpl(node);
      }
      else if (type == LET_SINGLE_STATEMENT) {
        return new SoyLetSingleStatementImpl(node);
      }
      else if (type == LIST_EXPR) {
        return new SoyListExprImpl(node);
      }
      else if (type == LIST_TYPE) {
        return new SoyListTypeImpl(node);
      }
      else if (type == LITERAL_EXPR) {
        return new SoyLiteralExprImpl(node);
      }
      else if (type == LITERAL_STATEMENT) {
        return new SoyLiteralStatementImpl(node);
      }
      else if (type == MAP_EXPR) {
        return new SoyMapExprImpl(node);
      }
      else if (type == MAP_TYPE) {
        return new SoyMapTypeImpl(node);
      }
      else if (type == MSG_STATEMENT) {
        return new SoyMsgStatementImpl(node);
      }
      else if (type == MUL_BIN_EXPR) {
        return new SoyMulBinExprImpl(node);
      }
      else if (type == NAMESPACE_BLOCK) {
        return new SoyNamespaceBlockImpl(node);
      }
      else if (type == NAMESPACE_DECLARATION_IDENTIFIER) {
        return new SoyNamespaceDeclarationIdentifierImpl(node);
      }
      else if (type == NAMESPACE_IDENTIFIER) {
        return new SoyNamespaceIdentifierImpl(node);
      }
      else if (type == NULL_CHECK_BIN_EXPR) {
        return new SoyNullCheckBinExprImpl(node);
      }
      else if (type == NULL_CHECK_TERNARY_EXPR) {
        return new SoyNullCheckTernaryExprImpl(node);
      }
      else if (type == OR_BIN_EXPR) {
        return new SoyOrBinExprImpl(node);
      }
      else if (type == PACKAGE_IDENTIFIER) {
        return new SoyPackageIdentifierImpl(node);
      }
      else if (type == PARAM_DEFINITION_IDENTIFIER) {
        return new SoyParamDefinitionIdentifierImpl(node);
      }
      else if (type == PARAM_LIST_ELEMENT) {
        return new SoyParamListElementImpl(node);
      }
      else if (type == PARAM_SPECIFICATION_IDENTIFIER) {
        return new SoyParamSpecificationIdentifierImpl(node);
      }
      else if (type == PARENTHESIZED_EXPR) {
        return new SoyParenthesizedExprImpl(node);
      }
      else if (type == PLURAL_STATEMENT) {
        return new SoyPluralStatementImpl(node);
      }
      else if (type == PRIMITIVE_TYPE) {
        return new SoyPrimitiveTypeImpl(node);
      }
      else if (type == PRINT_STATEMENT) {
        return new SoyPrintStatementImpl(node);
      }
      else if (type == PROTOBUF_ENUM) {
        return new SoyProtobufEnumImpl(node);
      }
      else if (type == RECORD_TYPE) {
        return new SoyRecordTypeImpl(node);
      }
      else if (type == RECORD_TYPE_FIELD) {
        return new SoyRecordTypeFieldImpl(node);
      }
      else if (type == REL_COMP_BIN_EXPR) {
        return new SoyRelCompBinExprImpl(node);
      }
      else if (type == SELECT_STATEMENT) {
        return new SoySelectStatementImpl(node);
      }
      else if (type == SPECIAL_CHARACTER_STATEMENT) {
        return new SoySpecialCharacterStatementImpl(node);
      }
      else if (type == STATEMENT_LIST) {
        return new SoyStatementListImpl(node);
      }
      else if (type == SWITCH_STATEMENT) {
        return new SoySwitchStatementImpl(node);
      }
      else if (type == TEMPLATE_BLOCK) {
        return new SoyTemplateBlockImpl(node);
      }
      else if (type == TEMPLATE_DEFINITION_IDENTIFIER) {
        return new SoyTemplateDefinitionIdentifierImpl(node);
      }
      else if (type == TEMPLATE_REFERENCE_IDENTIFIER) {
        return new SoyTemplateReferenceIdentifierImpl(node);
      }
      else if (type == TYPE_EXPRESSION) {
        return new SoyTypeExpressionImpl(node);
      }
      else if (type == TYPE_IDENTIFIER) {
        return new SoyTypeIdentifierImpl(node);
      }
      else if (type == UNARY_EXPR) {
        return new SoyUnaryExprImpl(node);
      }
      else if (type == UNEXPECTED_STATEMENTS) {
        return new SoyUnexpectedStatementsImpl(node);
      }
      else if (type == UNION_TYPE) {
        return new SoyUnionTypeImpl(node);
      }
      else if (type == VARIABLE_DEFINITION_IDENTIFIER) {
        return new SoyVariableDefinitionIdentifierImpl(node);
      }
      else if (type == VARIABLE_REFERENCE_IDENTIFIER) {
        return new SoyVariableReferenceIdentifierImpl(node);
      }
      else if (type == XID_STATEMENT) {
        return new SoyXidStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
