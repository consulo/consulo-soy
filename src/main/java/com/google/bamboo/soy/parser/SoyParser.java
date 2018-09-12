// This is a generated file. Not intended for manual editing.
package com.google.bamboo.soy.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.google.bamboo.soy.parser.SoyTypes.*;
import static com.google.bamboo.soy.parser.SoyParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import consulo.lang.LanguageVersion;
import static com.intellij.lang.WhitespacesBinders.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SoyParser implements PsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b, LanguageVersion v) {
    parseLight(t, b, v);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b, LanguageVersion v) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ALIAS_BLOCK) {
      r = AliasBlock(b, 0);
    }
    else if (t == ALIAS_IDENTIFIER) {
      r = AliasIdentifier(b, 0);
    }
    else if (t == ANY_STRING_LITERAL) {
      r = AnyStringLiteral(b, 0);
    }
    else if (t == AT_INJECT_SINGLE) {
      r = AtInjectSingle(b, 0);
    }
    else if (t == AT_PARAM_SINGLE) {
      r = AtParamSingle(b, 0);
    }
    else if (t == ATTRIBUTE_KEY_VALUE_PAIR) {
      r = AttributeKeyValuePair(b, 0);
    }
    else if (t == ATTRIBUTE_NAME_IDENTIFIER) {
      r = AttributeNameIdentifier(b, 0);
    }
    else if (t == BEGIN_CHOICE_CLAUSE) {
      r = BeginChoiceClause(b, 0);
    }
    else if (t == BEGIN_ELSE_IF) {
      r = BeginElseIf(b, 0);
    }
    else if (t == BEGIN_FOR) {
      r = BeginFor(b, 0);
    }
    else if (t == BEGIN_FOREACH) {
      r = BeginForeach(b, 0);
    }
    else if (t == BEGIN_IF) {
      r = BeginIf(b, 0);
    }
    else if (t == BEGIN_LET) {
      r = BeginLet(b, 0);
    }
    else if (t == BEGIN_MSG) {
      r = BeginMsg(b, 0);
    }
    else if (t == BEGIN_PARAM_TAG) {
      r = BeginParamTag(b, 0);
    }
    else if (t == BLOCK_LIST) {
      r = BlockList(b, 0);
    }
    else if (t == CATCHALL_BRACES) {
      r = CatchallBraces(b, 0);
    }
    else if (t == CHOICE_CLAUSE) {
      r = ChoiceClause(b, 0);
    }
    else if (t == COMMA_SEPARATED_EXPRESSION_LIST) {
      r = CommaSeparatedExpressionList(b, 0);
    }
    else if (t == COMMA_SEPARATED_KEY_VALUE_LIST) {
      r = CommaSeparatedKeyValueList(b, 0);
    }
    else if (t == COMPOUND_TYPE) {
      r = CompoundType(b, 0);
    }
    else if (t == CSS_STATEMENT) {
      r = CssStatement(b, 0);
    }
    else if (t == DEL_CALL_STATEMENT) {
      r = DelCallStatement(b, 0);
    }
    else if (t == DELEGATE_PACKAGE_BLOCK) {
      r = DelegatePackageBlock(b, 0);
    }
    else if (t == DIRECT_CALL_STATEMENT) {
      r = DirectCallStatement(b, 0);
    }
    else if (t == DIRECTIVE) {
      r = Directive(b, 0);
    }
    else if (t == ELSE_TAG) {
      r = ElseTag(b, 0);
    }
    else if (t == EXPR) {
      r = Expr(b, 0, -1);
    }
    else if (t == FALLBACK_MSG_TAG) {
      r = FallbackMsgTag(b, 0);
    }
    else if (t == FIELD_IDENTIFIER) {
      r = FieldIdentifier(b, 0);
    }
    else if (t == FOR_STATEMENT) {
      r = ForStatement(b, 0);
    }
    else if (t == FOREACH_STATEMENT) {
      r = ForeachStatement(b, 0);
    }
    else if (t == FUNCTION_IDENTIFIER) {
      r = FunctionIdentifier(b, 0);
    }
    else if (t == IF_EMPTY_TAG) {
      r = IfEmptyTag(b, 0);
    }
    else if (t == IF_STATEMENT) {
      r = IfStatement(b, 0);
    }
    else if (t == KEY_VALUE) {
      r = KeyValue(b, 0);
    }
    else if (t == LET_COMPOUND_STATEMENT) {
      r = LetCompoundStatement(b, 0);
    }
    else if (t == LET_SINGLE_STATEMENT) {
      r = LetSingleStatement(b, 0);
    }
    else if (t == LIST_TYPE) {
      r = ListType(b, 0);
    }
    else if (t == LITERAL_STATEMENT) {
      r = LiteralStatement(b, 0);
    }
    else if (t == MAP_TYPE) {
      r = MapType(b, 0);
    }
    else if (t == MSG_STATEMENT) {
      r = MsgStatement(b, 0);
    }
    else if (t == NAMESPACE_BLOCK) {
      r = NamespaceBlock(b, 0);
    }
    else if (t == NAMESPACE_DECLARATION_IDENTIFIER) {
      r = NamespaceDeclarationIdentifier(b, 0);
    }
    else if (t == NAMESPACE_IDENTIFIER) {
      r = NamespaceIdentifier(b, 0);
    }
    else if (t == PACKAGE_IDENTIFIER) {
      r = PackageIdentifier(b, 0);
    }
    else if (t == PARAM_DEFINITION_IDENTIFIER) {
      r = ParamDefinitionIdentifier(b, 0);
    }
    else if (t == PARAM_LIST_ELEMENT) {
      r = ParamListElement(b, 0);
    }
    else if (t == PARAM_SPECIFICATION_IDENTIFIER) {
      r = ParamSpecificationIdentifier(b, 0);
    }
    else if (t == PLURAL_STATEMENT) {
      r = PluralStatement(b, 0);
    }
    else if (t == PRIMITIVE_TYPE) {
      r = PrimitiveType(b, 0);
    }
    else if (t == PRINT_STATEMENT) {
      r = PrintStatement(b, 0);
    }
    else if (t == PROTOBUF_ENUM) {
      r = ProtobufEnum(b, 0);
    }
    else if (t == RECORD_TYPE) {
      r = RecordType(b, 0);
    }
    else if (t == RECORD_TYPE_FIELD) {
      r = RecordTypeField(b, 0);
    }
    else if (t == SELECT_STATEMENT) {
      r = SelectStatement(b, 0);
    }
    else if (t == SPECIAL_CHARACTER_STATEMENT) {
      r = SpecialCharacterStatement(b, 0);
    }
    else if (t == SWITCH_STATEMENT) {
      r = SwitchStatement(b, 0);
    }
    else if (t == TEMPLATE_BLOCK) {
      r = TemplateBlock(b, 0);
    }
    else if (t == TEMPLATE_DEFINITION_IDENTIFIER) {
      r = TemplateDefinitionIdentifier(b, 0);
    }
    else if (t == TEMPLATE_REFERENCE_IDENTIFIER) {
      r = TemplateReferenceIdentifier(b, 0);
    }
    else if (t == TYPE_EXPRESSION) {
      r = TypeExpression(b, 0);
    }
    else if (t == TYPE_IDENTIFIER) {
      r = TypeIdentifier(b, 0);
    }
    else if (t == UNION_TYPE) {
      r = UnionType(b, 0);
    }
    else if (t == VARIABLE_DEFINITION_IDENTIFIER) {
      r = VariableDefinitionIdentifier(b, 0);
    }
    else if (t == XID_STATEMENT) {
      r = XidStatement(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return FileInput(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ADD_BIN_EXPR, AND_BIN_EXPR, BOOL_AND_BIN_EXPR, BOOL_OR_BIN_EXPR,
      COMP_BIN_EXPR, EXPR, FIELD_EXPR, FUNCTION_CALL_EXPR,
      INDEX_EXPR, LIST_EXPR, LITERAL_EXPR, MAP_EXPR,
      MUL_BIN_EXPR, NULL_CHECK_BIN_EXPR, NULL_CHECK_TERNARY_EXPR, OR_BIN_EXPR,
      PARENTHESIZED_EXPR, REL_COMP_BIN_EXPR, UNARY_EXPR, VARIABLE_REFERENCE_IDENTIFIER),
  };

  /* ********************************************************** */
  // <<p>> Expr [AttributeKeyValuePair]
  static boolean AbstractBeginChoiceStatementBody(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "AbstractBeginChoiceStatementBody")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = _p.parse(b, l);
    p = r; // pin = 1
    r = r && Expr(b, l + 1, -1);
    r = r && AbstractBeginChoiceStatementBody_2(b, l + 1);
    exit_section_(b, l, m, r, p, recoverEndOfTag_parser_);
    return r || p;
  }

  // [AttributeKeyValuePair]
  private static boolean AbstractBeginChoiceStatementBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbstractBeginChoiceStatementBody_2")) return false;
    AttributeKeyValuePair(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // !(<<ClosedBeginCall <<p>>>>) <<AbstractCallStatementBlock <<p>>>>
  //   | <<BeginCall <<p>>>>
  static boolean AbstractCallStatement(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "AbstractCallStatement")) return false;
    if (!nextTokenIs(b, "", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AbstractCallStatement_0(b, l + 1, _p);
    if (!r) r = BeginCall(b, l + 1, _p);
    exit_section_(b, m, null, r);
    return r;
  }

  // !(<<ClosedBeginCall <<p>>>>) <<AbstractCallStatementBlock <<p>>>>
  private static boolean AbstractCallStatement_0(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "AbstractCallStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AbstractCallStatement_0_0(b, l + 1, _p);
    r = r && AbstractCallStatementBlock(b, l + 1, _p);
    exit_section_(b, m, null, r);
    return r;
  }

  // !(<<ClosedBeginCall <<p>>>>)
  private static boolean AbstractCallStatement_0_0(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "AbstractCallStatement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !AbstractCallStatement_0_0_0(b, l + 1, _p);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<ClosedBeginCall <<p>>>>
  private static boolean AbstractCallStatement_0_0_0(PsiBuilder b, int l, Parser _p) {
    return ClosedBeginCall(b, l + 1, _p);
  }

  /* ********************************************************** */
  // <<BeginCall <<p>>>> ParamList <<EndTag <<p>>>>
  static boolean AbstractCallStatementBlock(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "AbstractCallStatementBlock")) return false;
    if (!nextTokenIs(b, "", LBRACE, LBRACE_LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = BeginCall(b, l + 1, _p);
    p = r; // pin = 1
    r = r && ParamList(b, l + 1);
    r = r && EndTag(b, l + 1, _p);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // <<BeginChoice <<p>>>>
  //     ChoiceClausesList
  //     <<EndTag <<p>>>>
  static boolean AbstractChoiceStatement(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "AbstractChoiceStatement")) return false;
    if (!nextTokenIs(b, "", LBRACE, LBRACE_LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = BeginChoice(b, l + 1, _p);
    p = r; // pin = 1
    r = r && ChoiceClausesList(b, l + 1);
    r = r && EndTag(b, l + 1, _p);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // <<BeginTemplate <<p>>>>
  //     [AtParamList]
  //     [<<StatementList !()>>]
  //     <<EndTag <<p>>>>
  static boolean AbstractTemplateBlock(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "AbstractTemplateBlock")) return false;
    if (!nextTokenIs(b, "", LBRACE, LBRACE_LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = BeginTemplate(b, l + 1, _p);
    p = r; // pin = 1
    r = r && AbstractTemplateBlock_1(b, l + 1);
    r = r && AbstractTemplateBlock_2(b, l + 1);
    r = r && EndTag(b, l + 1, _p);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [AtParamList]
  private static boolean AbstractTemplateBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbstractTemplateBlock_1")) return false;
    AtParamList(b, l + 1);
    return true;
  }

  // [<<StatementList !()>>]
  private static boolean AbstractTemplateBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbstractTemplateBlock_2")) return false;
    StatementList(b, l + 1, AbstractTemplateBlock_2_0_0_parser_);
    return true;
  }

  // !()
  private static boolean AbstractTemplateBlock_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AbstractTemplateBlock_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !AbstractTemplateBlock_2_0_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ()
  private static boolean AbstractTemplateBlock_2_0_0_0(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // <<BracedTag AliasBody>>
  public static boolean AliasBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasBlock")) return false;
    if (!nextTokenIs(b, "<alias block>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALIAS_BLOCK, "<alias block>");
    r = BracedTag(b, l + 1, AliasBody_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ALIAS NamespaceIdentifier [AS AliasIdentifier]
  static boolean AliasBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasBody")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, ALIAS);
    p = r; // pin = 1
    r = r && NamespaceIdentifier(b, l + 1);
    r = r && AliasBody_2(b, l + 1);
    exit_section_(b, l, m, r, p, recoverEndOfTag_parser_);
    return r || p;
  }

  // [AS AliasIdentifier]
  private static boolean AliasBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasBody_2")) return false;
    AliasBody_2_0(b, l + 1);
    return true;
  }

  // AS AliasIdentifier
  private static boolean AliasBody_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasBody_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && AliasIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PlainIdentifier
  public static boolean AliasIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALIAS_IDENTIFIER, "<alias identifier>");
    r = PlainIdentifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL | MULTI_LINE_STRING_LITERAL
  public static boolean AnyStringLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnyStringLiteral")) return false;
    if (!nextTokenIs(b, "<any string literal>", MULTI_LINE_STRING_LITERAL, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANY_STRING_LITERAL, "<any string literal>");
    r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, MULTI_LINE_STRING_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (AT_INJECT | AT_INJECT_OPT) ParamDefinitionIdentifier COLON TypeExpression
  static boolean AtInjectBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AtInjectBody")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = AtInjectBody_0(b, l + 1);
    p = r; // pin = 1
    r = r && ParamDefinitionIdentifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && TypeExpression(b, l + 1);
    exit_section_(b, l, m, r, p, recoverEndOfTag_parser_);
    return r || p;
  }

  // AT_INJECT | AT_INJECT_OPT
  private static boolean AtInjectBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AtInjectBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT_INJECT);
    if (!r) r = consumeToken(b, AT_INJECT_OPT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<BracedTag AtInjectBody>>
  public static boolean AtInjectSingle(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AtInjectSingle")) return false;
    if (!nextTokenIs(b, "<at inject single>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AT_INJECT_SINGLE, "<at inject single>");
    r = BracedTag(b, l + 1, AtInjectBody_parser_);
    register_hook_(b, WS_BINDERS, LEADING_COMMENTS_BINDER, TRAILING_COMMENTS_BINDER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (AT_PARAM | AT_PARAM_OPT) ParamDefinitionIdentifier COLON TypeExpression
  static boolean AtParamBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AtParamBody")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = AtParamBody_0(b, l + 1);
    p = r; // pin = 1
    r = r && ParamDefinitionIdentifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && TypeExpression(b, l + 1);
    exit_section_(b, l, m, r, p, recoverEndOfTag_parser_);
    return r || p;
  }

  // AT_PARAM | AT_PARAM_OPT
  private static boolean AtParamBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AtParamBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT_PARAM);
    if (!r) r = consumeToken(b, AT_PARAM_OPT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (AtParamSingle | AtInjectSingle)+
  static boolean AtParamList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AtParamList")) return false;
    if (!nextTokenIs(b, "", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AtParamList_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!AtParamList_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AtParamList", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // AtParamSingle | AtInjectSingle
  private static boolean AtParamList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AtParamList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AtParamSingle(b, l + 1);
    if (!r) r = AtInjectSingle(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<BracedTag AtParamBody>>
  public static boolean AtParamSingle(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AtParamSingle")) return false;
    if (!nextTokenIs(b, "<at param single>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AT_PARAM_SINGLE, "<at param single>");
    r = BracedTag(b, l + 1, AtParamBody_parser_);
    register_hook_(b, WS_BINDERS, LEADING_COMMENTS_BINDER, TRAILING_COMMENTS_BINDER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AttributeNameIdentifier EQUAL AnyStringLiteral
  public static boolean AttributeKeyValuePair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeKeyValuePair")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_KEY_VALUE_PAIR, "<attribute key value pair>");
    r = AttributeNameIdentifier(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    p = r; // pin = 2
    r = r && AnyStringLiteral(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // AttributeKeyValuePair+
  static boolean AttributeList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeList")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AttributeKeyValuePair(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!AttributeKeyValuePair(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AttributeList", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PlainIdentifier
  public static boolean AttributeNameIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttributeNameIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_NAME_IDENTIFIER, "<attribute name identifier>");
    r = PlainIdentifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<BracedTag <<CallTagBody <<p>>>>>>
  public static boolean BeginCall(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "BeginCall")) return false;
    if (!nextTokenIs(b, "", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BracedTag(b, l + 1, new Parser() {
      public boolean parse(PsiBuilder b, int l) {
        return CallTagBody(b, l + 1, _p);
      }
    });
    exit_section_(b, m, BEGIN_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // CASE CommaSeparatedExpressionList
  static boolean BeginCaseClauseTagBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginCaseClauseTagBody")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, CASE);
    p = r; // pin = 1
    r = r && CommaSeparatedExpressionList(b, l + 1);
    exit_section_(b, l, m, r, p, recoverEndOfTag_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // <<BracedTag <<AbstractBeginChoiceStatementBody <<p>>>>>>
  public static boolean BeginChoice(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "BeginChoice")) return false;
    if (!nextTokenIs(b, "", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BracedTag(b, l + 1, new Parser() {
      public boolean parse(PsiBuilder b, int l) {
        return AbstractBeginChoiceStatementBody(b, l + 1, _p);
      }
    });
    exit_section_(b, m, BEGIN_CHOICE, r);
    return r;
  }

  /* ********************************************************** */
  // <<BracedTag BeginCaseClauseTagBody>> | <<BracedTag DEFAULT>>
  public static boolean BeginChoiceClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginChoiceClause")) return false;
    if (!nextTokenIs(b, "<begin choice clause>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BEGIN_CHOICE_CLAUSE, "<begin choice clause>");
    r = BracedTag(b, l + 1, BeginCaseClauseTagBody_parser_);
    if (!r) r = BracedTag(b, l + 1, DEFAULT_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<BracedTag BeginElseIfTagBody>>
  public static boolean BeginElseIf(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginElseIf")) return false;
    if (!nextTokenIs(b, "<begin else if>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BEGIN_ELSE_IF, "<begin else if>");
    r = BracedTag(b, l + 1, BeginElseIfTagBody_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ELSEIF Expr
  static boolean BeginElseIfTagBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginElseIfTagBody")) return false;
    if (!nextTokenIs(b, ELSEIF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, ELSEIF);
    p = r; // pin = 1
    r = r && Expr(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // <<BracedTag BeginForTagBody>>
  public static boolean BeginFor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginFor")) return false;
    if (!nextTokenIs(b, "<begin for>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BEGIN_FOR, "<begin for>");
    r = BracedTag(b, l + 1, BeginForTagBody_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FOR VariableDefinitionIdentifier IN Expr
  static boolean BeginForTagBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginForTagBody")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, FOR);
    p = r; // pin = 1
    r = r && VariableDefinitionIdentifier(b, l + 1);
    r = r && consumeToken(b, IN);
    r = r && Expr(b, l + 1, -1);
    exit_section_(b, l, m, r, p, recoverEndOfTag_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // <<BracedTag BeginForeachTagBody>>
  public static boolean BeginForeach(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginForeach")) return false;
    if (!nextTokenIs(b, "<begin foreach>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BEGIN_FOREACH, "<begin foreach>");
    r = BracedTag(b, l + 1, BeginForeachTagBody_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FOREACH VariableDefinitionIdentifier IN Expr
  static boolean BeginForeachTagBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginForeachTagBody")) return false;
    if (!nextTokenIs(b, FOREACH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, FOREACH);
    p = r; // pin = 1
    r = r && VariableDefinitionIdentifier(b, l + 1);
    r = r && consumeToken(b, IN);
    r = r && Expr(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // <<BracedTag BeginIfTagBody>>
  public static boolean BeginIf(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginIf")) return false;
    if (!nextTokenIs(b, "<begin if>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BEGIN_IF, "<begin if>");
    r = BracedTag(b, l + 1, BeginIfTagBody_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IF Expr
  static boolean BeginIfTagBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginIfTagBody")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, IF);
    p = r; // pin = 1
    r = r && Expr(b, l + 1, -1);
    exit_section_(b, l, m, r, p, recoverEndOfTag_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // <<BracedTag BeginLetTagBody>>
  public static boolean BeginLet(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginLet")) return false;
    if (!nextTokenIs(b, "<begin let>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BEGIN_LET, "<begin let>");
    r = BracedTag(b, l + 1, BeginLetTagBody_parser_);
    register_hook_(b, WS_BINDERS, LEADING_COMMENTS_BINDER, TRAILING_COMMENTS_BINDER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LET VariableDefinitionIdentifier [AttributeKeyValuePair]
  static boolean BeginLetTagBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginLetTagBody")) return false;
    if (!nextTokenIs(b, LET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LET);
    p = r; // pin = 1
    r = r && VariableDefinitionIdentifier(b, l + 1);
    r = r && BeginLetTagBody_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [AttributeKeyValuePair]
  private static boolean BeginLetTagBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginLetTagBody_2")) return false;
    AttributeKeyValuePair(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // <<BracedTag BeginMsgTagBody>>
  public static boolean BeginMsg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginMsg")) return false;
    if (!nextTokenIs(b, "<begin msg>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BEGIN_MSG, "<begin msg>");
    r = BracedTag(b, l + 1, BeginMsgTagBody_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // MSG AttributeList
  static boolean BeginMsgTagBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginMsgTagBody")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, MSG);
    p = r; // pin = 1
    r = r && AttributeList(b, l + 1);
    exit_section_(b, l, m, r, p, recoverEndOfTag_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // <<BracedTag BeginParamTagBody>>
  public static boolean BeginParamTag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginParamTag")) return false;
    if (!nextTokenIs(b, "<begin param tag>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BEGIN_PARAM_TAG, "<begin param tag>");
    r = BracedTag(b, l + 1, BeginParamTagBody_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PARAM (ParamSpecificationIdentifier COLON Expr | AttributeList | ParamSpecificationIdentifier [AttributeList])
  static boolean BeginParamTagBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginParamTagBody")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, PARAM);
    p = r; // pin = 1
    r = r && BeginParamTagBody_1(b, l + 1);
    exit_section_(b, l, m, r, p, recoverEndOfTag_parser_);
    return r || p;
  }

  // ParamSpecificationIdentifier COLON Expr | AttributeList | ParamSpecificationIdentifier [AttributeList]
  private static boolean BeginParamTagBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginParamTagBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BeginParamTagBody_1_0(b, l + 1);
    if (!r) r = AttributeList(b, l + 1);
    if (!r) r = BeginParamTagBody_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ParamSpecificationIdentifier COLON Expr
  private static boolean BeginParamTagBody_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginParamTagBody_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParamSpecificationIdentifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ParamSpecificationIdentifier [AttributeList]
  private static boolean BeginParamTagBody_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginParamTagBody_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParamSpecificationIdentifier(b, l + 1);
    r = r && BeginParamTagBody_1_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [AttributeList]
  private static boolean BeginParamTagBody_1_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginParamTagBody_1_2_1")) return false;
    AttributeList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // <<BracedTag <<BeginTemplateBody<<p>>>>>>
  public static boolean BeginTemplate(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "BeginTemplate")) return false;
    if (!nextTokenIs(b, "", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BracedTag(b, l + 1, new Parser() {
      public boolean parse(PsiBuilder b, int l) {
        return BeginTemplateBody(b, l + 1, _p);
      }
    });
    register_hook_(b, WS_BINDERS, LEADING_COMMENTS_BINDER, TRAILING_COMMENTS_BINDER);
    exit_section_(b, m, BEGIN_TEMPLATE, r);
    return r;
  }

  /* ********************************************************** */
  // <<p>> (TemplateDefinitionIdentifier [AttributeList] | AttributeList)
  static boolean BeginTemplateBody(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "BeginTemplateBody")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = _p.parse(b, l);
    p = r; // pin = 1
    r = r && BeginTemplateBody_1(b, l + 1);
    exit_section_(b, l, m, r, p, recoverEndOfTag_parser_);
    return r || p;
  }

  // TemplateDefinitionIdentifier [AttributeList] | AttributeList
  private static boolean BeginTemplateBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginTemplateBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BeginTemplateBody_1_0(b, l + 1);
    if (!r) r = AttributeList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateDefinitionIdentifier [AttributeList]
  private static boolean BeginTemplateBody_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginTemplateBody_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateDefinitionIdentifier(b, l + 1);
    r = r && BeginTemplateBody_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [AttributeList]
  private static boolean BeginTemplateBody_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BeginTemplateBody_1_0_1")) return false;
    AttributeList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // NamespaceBlock | AliasBlock | TemplateBlock | DelegatePackageBlock | CatchallBraces
  static boolean Block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Block")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NamespaceBlock(b, l + 1);
    if (!r) r = AliasBlock(b, l + 1);
    if (!r) r = TemplateBlock(b, l + 1);
    if (!r) r = DelegatePackageBlock(b, l + 1);
    if (!r) r = CatchallBraces(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (Block | OTHER | COMMENT_BLOCK | HTML_COMMENT)*
  public static boolean BlockList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockList")) return false;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_LIST, "<block list>");
    int c = current_position_(b);
    while (true) {
      if (!BlockList_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BlockList", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // Block | OTHER | COMMENT_BLOCK | HTML_COMMENT
  private static boolean BlockList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Block(b, l + 1);
    if (!r) r = consumeToken(b, OTHER);
    if (!r) r = consumeToken(b, COMMENT_BLOCK);
    if (!r) r = consumeToken(b, HTML_COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BeginParamTag <<StatementList (BeginParamTag)>> <<EndTag PARAM>>
  static boolean BlockParamListElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockParamListElement")) return false;
    if (!nextTokenIs(b, "", LBRACE, LBRACE_LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = BeginParamTag(b, l + 1);
    p = r; // pin = 1
    r = r && StatementList(b, l + 1, BlockParamListElement_1_0_parser_);
    r = r && EndTag(b, l + 1, PARAM_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (BeginParamTag)
  private static boolean BlockParamListElement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockParamListElement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BeginParamTag(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACE | LBRACE_LBRACE | LBRACE_SLASH | LBRACE_LBRACE_SLASH | RBRACE | RBRACE_RBRACE | SLASH_RBRACE | SLASH_RBRACE_RBRACE
  static boolean Brace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Brace")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    if (!r) r = consumeToken(b, LBRACE_LBRACE);
    if (!r) r = consumeToken(b, LBRACE_SLASH);
    if (!r) r = consumeToken(b, LBRACE_LBRACE_SLASH);
    if (!r) r = consumeToken(b, RBRACE);
    if (!r) r = consumeToken(b, RBRACE_RBRACE);
    if (!r) r = consumeToken(b, SLASH_RBRACE);
    if (!r) r = consumeToken(b, SLASH_RBRACE_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<ClosedBracedTag <<p>>>> | <<OpenBracedTag <<p>>>>
  static boolean BracedTag(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "BracedTag")) return false;
    if (!nextTokenIs(b, "", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClosedBracedTag(b, l + 1, _p);
    if (!r) r = OpenBracedTag(b, l + 1, _p);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DirectCallStatement | DelCallStatement
  static boolean CallStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallStatement")) return false;
    if (!nextTokenIs(b, "", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DirectCallStatement(b, l + 1);
    if (!r) r = DelCallStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<p>> (TemplateReferenceIdentifier [AttributeList] | AttributeList)
  static boolean CallTagBody(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "CallTagBody")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = _p.parse(b, l);
    p = r; // pin = 1
    r = r && CallTagBody_1(b, l + 1);
    exit_section_(b, l, m, r, p, recoverEndOfTag_parser_);
    return r || p;
  }

  // TemplateReferenceIdentifier [AttributeList] | AttributeList
  private static boolean CallTagBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallTagBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallTagBody_1_0(b, l + 1);
    if (!r) r = AttributeList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TemplateReferenceIdentifier [AttributeList]
  private static boolean CallTagBody_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallTagBody_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TemplateReferenceIdentifier(b, l + 1);
    r = r && CallTagBody_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [AttributeList]
  private static boolean CallTagBody_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallTagBody_1_0_1")) return false;
    AttributeList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // <<BracedTag ()>> | <<EndTag_ ()>>
  public static boolean CatchallBraces(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CatchallBraces")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CATCHALL_BRACES, "<catchall braces>");
    r = BracedTag(b, l + 1, CatchallBraces_0_0_parser_);
    if (!r) r = EndTag_(b, l + 1, CatchallBraces_1_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ()
  private static boolean CatchallBraces_0_0(PsiBuilder b, int l) {
    return true;
  }

  // ()
  private static boolean CatchallBraces_1_0(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // BeginChoiceClause <<StatementList (BeginChoiceClause)>>
  public static boolean ChoiceClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ChoiceClause")) return false;
    if (!nextTokenIs(b, "<choice clause>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CHOICE_CLAUSE, "<choice clause>");
    r = BeginChoiceClause(b, l + 1);
    p = r; // pin = 1
    r = r && StatementList(b, l + 1, ChoiceClause_1_0_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (BeginChoiceClause)
  private static boolean ChoiceClause_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ChoiceClause_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BeginChoiceClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [<<UnexpectedStatements (BeginChoiceClause)>>]
  //     (ChoiceClause)*
  //     // StatementList can only be empty and exists to consume whitespace.
  //     <<StatementList (BeginChoiceClause)>>
  static boolean ChoiceClausesList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ChoiceClausesList")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ChoiceClausesList_0(b, l + 1);
    r = r && ChoiceClausesList_1(b, l + 1);
    r = r && StatementList(b, l + 1, ChoiceClausesList_2_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // [<<UnexpectedStatements (BeginChoiceClause)>>]
  private static boolean ChoiceClausesList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ChoiceClausesList_0")) return false;
    UnexpectedStatements(b, l + 1, ChoiceClausesList_0_0_0_parser_);
    return true;
  }

  // (BeginChoiceClause)
  private static boolean ChoiceClausesList_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ChoiceClausesList_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BeginChoiceClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ChoiceClause)*
  private static boolean ChoiceClausesList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ChoiceClausesList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ChoiceClausesList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ChoiceClausesList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (ChoiceClause)
  private static boolean ChoiceClausesList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ChoiceClausesList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ChoiceClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (BeginChoiceClause)
  private static boolean ChoiceClausesList_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ChoiceClausesList_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BeginChoiceClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SwitchStatement | SelectStatement | PluralStatement
  static boolean ChoiceStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ChoiceStatement")) return false;
    if (!nextTokenIs(b, "", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SwitchStatement(b, l + 1);
    if (!r) r = SelectStatement(b, l + 1);
    if (!r) r = PluralStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<ClosedBracedTag <<CallTagBody <<p>>>> >>
  static boolean ClosedBeginCall(PsiBuilder b, int l, Parser _p) {
    return ClosedBracedTag(b, l + 1, new Parser() {
      public boolean parse(PsiBuilder b, int l) {
        return CallTagBody(b, l + 1, _p);
      }
    });
  }

  /* ********************************************************** */
  // (LBRACE | LBRACE_LBRACE) <<p>> (SLASH_RBRACE | SLASH_RBRACE_RBRACE)
  static boolean ClosedBracedTag(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "ClosedBracedTag")) return false;
    if (!nextTokenIs(b, "", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClosedBracedTag_0(b, l + 1);
    r = r && _p.parse(b, l);
    r = r && ClosedBracedTag_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE | LBRACE_LBRACE
  private static boolean ClosedBracedTag_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClosedBracedTag_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    if (!r) r = consumeToken(b, LBRACE_LBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // SLASH_RBRACE | SLASH_RBRACE_RBRACE
  private static boolean ClosedBracedTag_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClosedBracedTag_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SLASH_RBRACE);
    if (!r) r = consumeToken(b, SLASH_RBRACE_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expr (COMMA Expr)* COMMA?
  public static boolean CommaSeparatedExpressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommaSeparatedExpressionList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMA_SEPARATED_EXPRESSION_LIST, "<comma separated expression list>");
    r = Expr(b, l + 1, -1);
    r = r && CommaSeparatedExpressionList_1(b, l + 1);
    r = r && CommaSeparatedExpressionList_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA Expr)*
  private static boolean CommaSeparatedExpressionList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommaSeparatedExpressionList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!CommaSeparatedExpressionList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CommaSeparatedExpressionList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA Expr
  private static boolean CommaSeparatedExpressionList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommaSeparatedExpressionList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean CommaSeparatedExpressionList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommaSeparatedExpressionList_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // KeyValue (COMMA KeyValue)* COMMA?
  public static boolean CommaSeparatedKeyValueList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommaSeparatedKeyValueList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMA_SEPARATED_KEY_VALUE_LIST, "<comma separated key value list>");
    r = KeyValue(b, l + 1);
    r = r && CommaSeparatedKeyValueList_1(b, l + 1);
    r = r && CommaSeparatedKeyValueList_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA KeyValue)*
  private static boolean CommaSeparatedKeyValueList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommaSeparatedKeyValueList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!CommaSeparatedKeyValueList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CommaSeparatedKeyValueList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA KeyValue
  private static boolean CommaSeparatedKeyValueList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommaSeparatedKeyValueList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && KeyValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean CommaSeparatedKeyValueList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CommaSeparatedKeyValueList_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // ListType | MapType | RecordType
  public static boolean CompoundType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompoundType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPOUND_TYPE, "<compound type>");
    r = ListType(b, l + 1);
    if (!r) r = MapType(b, l + 1);
    if (!r) r = RecordType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OTHER
  static boolean Content(PsiBuilder b, int l) {
    return consumeToken(b, OTHER);
  }

  /* ********************************************************** */
  // <<BracedTag CssStatementTagBody>>
  public static boolean CssStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CssStatement")) return false;
    if (!nextTokenIs(b, "<css statement>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CSS_STATEMENT, "<css statement>");
    r = BracedTag(b, l + 1, CssStatementTagBody_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CSS CSS_XID_IDENTIFIER
  static boolean CssStatementTagBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CssStatementTagBody")) return false;
    if (!nextTokenIs(b, CSS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CSS, CSS_XID_IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<AbstractCallStatement DELCALL>>
  public static boolean DelCallStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DelCallStatement")) return false;
    if (!nextTokenIs(b, "<del call statement>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEL_CALL_STATEMENT, "<del call statement>");
    r = AbstractCallStatement(b, l + 1, DELCALL_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<BracedTag DelegatePackageTagBody>>
  public static boolean DelegatePackageBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DelegatePackageBlock")) return false;
    if (!nextTokenIs(b, "<delegate package block>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DELEGATE_PACKAGE_BLOCK, "<delegate package block>");
    r = BracedTag(b, l + 1, DelegatePackageTagBody_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DELPACKAGE PackageIdentifier
  static boolean DelegatePackageTagBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DelegatePackageTagBody")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, DELPACKAGE);
    p = r; // pin = 1
    r = r && PackageIdentifier(b, l + 1);
    exit_section_(b, l, m, r, p, recoverEndOfTag_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // <<AbstractTemplateBlock DELTEMPLATE>>
  static boolean DelegateTemplateBlock(PsiBuilder b, int l) {
    return AbstractTemplateBlock(b, l + 1, DELTEMPLATE_parser_);
  }

  /* ********************************************************** */
  // <<AbstractCallStatement CALL>>
  public static boolean DirectCallStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DirectCallStatement")) return false;
    if (!nextTokenIs(b, "<direct call statement>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIRECT_CALL_STATEMENT, "<direct call statement>");
    r = AbstractCallStatement(b, l + 1, CALL_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FunctionIdentifier
  //   |
  //     FunctionIdentifier COLON LiteralExpr (COMMA LiteralExpr)*
  public static boolean Directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Directive")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIRECTIVE, "<directive>");
    r = FunctionIdentifier(b, l + 1);
    if (!r) r = Directive_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // FunctionIdentifier COLON LiteralExpr (COMMA LiteralExpr)*
  private static boolean Directive_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Directive_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionIdentifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && LiteralExpr(b, l + 1);
    r = r && Directive_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA LiteralExpr)*
  private static boolean Directive_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Directive_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Directive_1_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Directive_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA LiteralExpr
  private static boolean Directive_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Directive_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && LiteralExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Directive (PIPE Directive)*
  static boolean DirectiveList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DirectiveList")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Directive(b, l + 1);
    r = r && DirectiveList_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (PIPE Directive)*
  private static boolean DirectiveList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DirectiveList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!DirectiveList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DirectiveList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // PIPE Directive
  private static boolean DirectiveList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DirectiveList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PIPE);
    r = r && Directive(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BeginElseIf <<StatementList (ElseTag | BeginElseIf)>>
  static boolean ElseIfClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfClause")) return false;
    if (!nextTokenIs(b, "", LBRACE, LBRACE_LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = BeginElseIf(b, l + 1);
    p = r; // pin = 1
    r = r && StatementList(b, l + 1, ElseIfClause_1_0_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ElseTag | BeginElseIf
  private static boolean ElseIfClause_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseIfClause_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ElseTag(b, l + 1);
    if (!r) r = BeginElseIf(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<BracedTag ELSE>>
  public static boolean ElseTag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseTag")) return false;
    if (!nextTokenIs(b, "<else tag>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELSE_TAG, "<else tag>");
    r = BracedTag(b, l + 1, ELSE_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<EndTag_<<p>>>>
  public static boolean EndTag(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "EndTag")) return false;
    if (!nextTokenIs(b, "", LBRACE_LBRACE_SLASH, LBRACE_SLASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EndTag_(b, l + 1, _p);
    exit_section_(b, m, END_TAG, r);
    return r;
  }

  /* ********************************************************** */
  // (LBRACE_SLASH | LBRACE_LBRACE_SLASH) <<p>>
  static boolean EndTagInner(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "EndTagInner")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_);
    r = EndTagInner_0(b, l + 1);
    r = r && _p.parse(b, l);
    exit_section_(b, l, m, r, false, recoverEndOfTag_parser_);
    return r;
  }

  // LBRACE_SLASH | LBRACE_LBRACE_SLASH
  private static boolean EndTagInner_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndTagInner_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE_SLASH);
    if (!r) r = consumeToken(b, LBRACE_LBRACE_SLASH);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<EndTagInner <<p>>>> (RBRACE | RBRACE_RBRACE)
  static boolean EndTag_(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "EndTag_")) return false;
    if (!nextTokenIs(b, "", LBRACE_LBRACE_SLASH, LBRACE_SLASH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = EndTagInner(b, l + 1, _p);
    p = r; // pin = 1
    r = r && EndTag__1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // RBRACE | RBRACE_RBRACE
  private static boolean EndTag__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndTag__1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RBRACE);
    if (!r) r = consumeToken(b, RBRACE_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PRINT Expr [PIPE DirectiveList]
  static boolean ExplicitPrintBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExplicitPrintBody")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, PRINT);
    p = r; // pin = 1
    r = r && Expr(b, l + 1, -1);
    r = r && ExplicitPrintBody_2(b, l + 1);
    exit_section_(b, l, m, r, p, recoverEndOfTag_parser_);
    return r || p;
  }

  // [PIPE DirectiveList]
  private static boolean ExplicitPrintBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExplicitPrintBody_2")) return false;
    ExplicitPrintBody_2_0(b, l + 1);
    return true;
  }

  // PIPE DirectiveList
  private static boolean ExplicitPrintBody_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExplicitPrintBody_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PIPE);
    r = r && DirectiveList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<BracedTag FallbackMsgTagBody>>
  public static boolean FallbackMsgTag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FallbackMsgTag")) return false;
    if (!nextTokenIs(b, "<fallback msg tag>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FALLBACK_MSG_TAG, "<fallback msg tag>");
    r = BracedTag(b, l + 1, FallbackMsgTagBody_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FALLBACKMSG AttributeList
  static boolean FallbackMsgTagBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FallbackMsgTagBody")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, FALLBACKMSG);
    p = r; // pin = 1
    r = r && AttributeList(b, l + 1);
    exit_section_(b, l, m, r, p, recoverEndOfTag_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // (DOT | DOT_NULL_CHECK) IDENTIFIER_WORD
  static boolean FieldAccess(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldAccess")) return false;
    if (!nextTokenIs(b, "", DOT, DOT_NULL_CHECK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = FieldAccess_0(b, l + 1);
    p = r; // pin = 1
    r = r && consumeToken(b, IDENTIFIER_WORD);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // DOT | DOT_NULL_CHECK
  private static boolean FieldAccess_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldAccess_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    if (!r) r = consumeToken(b, DOT_NULL_CHECK);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PlainIdentifier
  public static boolean FieldIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_IDENTIFIER, "<field identifier>");
    r = PlainIdentifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BlockList
  static boolean FileInput(PsiBuilder b, int l) {
    return BlockList(b, l + 1);
  }

  /* ********************************************************** */
  // BeginFor
  //     <<StatementList !()>>
  //     <<EndTag FOR>>
  public static boolean ForStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement")) return false;
    if (!nextTokenIs(b, "<for statement>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FOR_STATEMENT, "<for statement>");
    r = BeginFor(b, l + 1);
    p = r; // pin = 1
    r = r && StatementList(b, l + 1, ForStatement_1_0_parser_);
    r = r && EndTag(b, l + 1, FOR_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // !()
  private static boolean ForStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !ForStatement_1_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ()
  private static boolean ForStatement_1_0_0(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // BeginForeach
  //     <<StatementList (IfEmptyTag)>>
  //     [IfEmptyTag <<StatementList !()>>]
  //     <<EndTag FOREACH>>
  public static boolean ForeachStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStatement")) return false;
    if (!nextTokenIs(b, "<foreach statement>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FOREACH_STATEMENT, "<foreach statement>");
    r = BeginForeach(b, l + 1);
    p = r; // pin = 1
    r = r && StatementList(b, l + 1, ForeachStatement_1_0_parser_);
    r = r && ForeachStatement_2(b, l + 1);
    r = r && EndTag(b, l + 1, FOREACH_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (IfEmptyTag)
  private static boolean ForeachStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IfEmptyTag(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [IfEmptyTag <<StatementList !()>>]
  private static boolean ForeachStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStatement_2")) return false;
    ForeachStatement_2_0(b, l + 1);
    return true;
  }

  // IfEmptyTag <<StatementList !()>>
  private static boolean ForeachStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IfEmptyTag(b, l + 1);
    r = r && StatementList(b, l + 1, ForeachStatement_2_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // !()
  private static boolean ForeachStatement_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeachStatement_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !ForeachStatement_2_0_1_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ()
  private static boolean ForeachStatement_2_0_1_0_0(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // PlainIdentifier
  public static boolean FunctionIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_IDENTIFIER, "<function identifier>");
    r = PlainIdentifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<BracedTag IFEMPTY>>
  public static boolean IfEmptyTag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfEmptyTag")) return false;
    if (!nextTokenIs(b, "<if empty tag>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_EMPTY_TAG, "<if empty tag>");
    r = BracedTag(b, l + 1, IFEMPTY_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BeginIf
  //     <<StatementList (ElseTag | BeginElseIf)>>
  //     ElseIfClause*
  //     [ElseTag <<StatementList !()>>]
  //     <<EndTag IF>>
  public static boolean IfStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement")) return false;
    if (!nextTokenIs(b, "<if statement>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_STATEMENT, "<if statement>");
    r = BeginIf(b, l + 1);
    p = r; // pin = 1
    r = r && StatementList(b, l + 1, IfStatement_1_0_parser_);
    r = r && IfStatement_2(b, l + 1);
    r = r && IfStatement_3(b, l + 1);
    r = r && EndTag(b, l + 1, IF_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ElseTag | BeginElseIf
  private static boolean IfStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ElseTag(b, l + 1);
    if (!r) r = BeginElseIf(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ElseIfClause*
  private static boolean IfStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ElseIfClause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfStatement_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // [ElseTag <<StatementList !()>>]
  private static boolean IfStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_3")) return false;
    IfStatement_3_0(b, l + 1);
    return true;
  }

  // ElseTag <<StatementList !()>>
  private static boolean IfStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ElseTag(b, l + 1);
    r = r && StatementList(b, l + 1, IfStatement_3_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // !()
  private static boolean IfStatement_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStatement_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !IfStatement_3_0_1_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ()
  private static boolean IfStatement_3_0_1_0_0(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // Expr [PIPE DirectiveList] [AttributeKeyValuePair]
  static boolean ImplicitPrintBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImplicitPrintBody")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expr(b, l + 1, -1);
    r = r && ImplicitPrintBody_1(b, l + 1);
    r = r && ImplicitPrintBody_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [PIPE DirectiveList]
  private static boolean ImplicitPrintBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImplicitPrintBody_1")) return false;
    ImplicitPrintBody_1_0(b, l + 1);
    return true;
  }

  // PIPE DirectiveList
  private static boolean ImplicitPrintBody_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImplicitPrintBody_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PIPE);
    r = r && DirectiveList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [AttributeKeyValuePair]
  private static boolean ImplicitPrintBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImplicitPrintBody_2")) return false;
    AttributeKeyValuePair(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Expr COLON Expr
  public static boolean KeyValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeyValue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEY_VALUE, "<key value>");
    r = Expr(b, l + 1, -1);
    r = r && consumeToken(b, COLON);
    r = r && Expr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ANY | AS | ATTRIBUTES | BOOL | CSS | FLOAT | HTML | INT | JS | LB | LIST |
  //     MAP | MSG | NIL | NUMBER | PLURAL | RB | SP | STRING | URI | XID
  static boolean KeywordsAllowedInIdentifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeywordsAllowedInIdentifiers")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANY);
    if (!r) r = consumeToken(b, AS);
    if (!r) r = consumeToken(b, ATTRIBUTES);
    if (!r) r = consumeToken(b, BOOL);
    if (!r) r = consumeToken(b, CSS);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, HTML);
    if (!r) r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, JS);
    if (!r) r = consumeToken(b, LB);
    if (!r) r = consumeToken(b, LIST);
    if (!r) r = consumeToken(b, MAP);
    if (!r) r = consumeToken(b, MSG);
    if (!r) r = consumeToken(b, NIL);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, PLURAL);
    if (!r) r = consumeToken(b, RB);
    if (!r) r = consumeToken(b, SP);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, URI);
    if (!r) r = consumeToken(b, XID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BeginLet <<StatementList !()>> <<EndTag LET>>
  public static boolean LetCompoundStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetCompoundStatement")) return false;
    if (!nextTokenIs(b, "<let compound statement>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LET_COMPOUND_STATEMENT, "<let compound statement>");
    r = BeginLet(b, l + 1);
    p = r; // pin = 1
    r = r && StatementList(b, l + 1, LetCompoundStatement_1_0_parser_);
    r = r && EndTag(b, l + 1, LET_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // !()
  private static boolean LetCompoundStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetCompoundStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !LetCompoundStatement_1_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ()
  private static boolean LetCompoundStatement_1_0_0(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // <<BracedTag LetSingleTagBody>>
  public static boolean LetSingleStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetSingleStatement")) return false;
    if (!nextTokenIs(b, "<let single statement>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LET_SINGLE_STATEMENT, "<let single statement>");
    r = BracedTag(b, l + 1, LetSingleTagBody_parser_);
    register_hook_(b, WS_BINDERS, LEADING_COMMENTS_BINDER, TRAILING_COMMENTS_BINDER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LET VariableDefinitionIdentifier COLON Expr
  static boolean LetSingleTagBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetSingleTagBody")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LET);
    r = r && VariableDefinitionIdentifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    p = r; // pin = 3
    r = r && Expr(b, l + 1, -1);
    exit_section_(b, l, m, r, p, recoverEndOfTag_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // LIST LESS TypeExpression GREATER
  public static boolean ListType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListType")) return false;
    if (!nextTokenIs(b, LIST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LIST_TYPE, null);
    r = consumeTokens(b, 2, LIST, LESS);
    p = r; // pin = 2
    r = r && TypeExpression(b, l + 1);
    r = r && consumeToken(b, GREATER);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (LITERAL Content? END_LITERAL) | (LITERAL_DOUBLE Content? END_LITERAL_DOUBLE)
  public static boolean LiteralStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralStatement")) return false;
    if (!nextTokenIs(b, "<literal statement>", LITERAL, LITERAL_DOUBLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_STATEMENT, "<literal statement>");
    r = LiteralStatement_0(b, l + 1);
    if (!r) r = LiteralStatement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LITERAL Content? END_LITERAL
  private static boolean LiteralStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITERAL);
    r = r && LiteralStatement_0_1(b, l + 1);
    r = r && consumeToken(b, END_LITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // Content?
  private static boolean LiteralStatement_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralStatement_0_1")) return false;
    Content(b, l + 1);
    return true;
  }

  // LITERAL_DOUBLE Content? END_LITERAL_DOUBLE
  private static boolean LiteralStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LITERAL_DOUBLE);
    r = r && LiteralStatement_1_1(b, l + 1);
    r = r && consumeToken(b, END_LITERAL_DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  // Content?
  private static boolean LiteralStatement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralStatement_1_1")) return false;
    Content(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // <<AbstractTemplateBlock TEMPLATE>>
  static boolean LocalTemplateBlock(PsiBuilder b, int l) {
    return AbstractTemplateBlock(b, l + 1, TEMPLATE_parser_);
  }

  /* ********************************************************** */
  // MAP LESS TypeExpression COMMA TypeExpression GREATER
  public static boolean MapType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapType")) return false;
    if (!nextTokenIs(b, MAP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MAP_TYPE, null);
    r = consumeTokens(b, 2, MAP, LESS);
    p = r; // pin = 2
    r = r && TypeExpression(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && TypeExpression(b, l + 1);
    r = r && consumeToken(b, GREATER);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // BeginMsg
  //     <<StatementList (FallbackMsgTag)>>
  //     [FallbackMsgTag <<StatementList !()>>]
  //     <<EndTag MSG>>
  public static boolean MsgStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MsgStatement")) return false;
    if (!nextTokenIs(b, "<msg statement>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MSG_STATEMENT, "<msg statement>");
    r = BeginMsg(b, l + 1);
    p = r; // pin = 1
    r = r && StatementList(b, l + 1, MsgStatement_1_0_parser_);
    r = r && MsgStatement_2(b, l + 1);
    r = r && EndTag(b, l + 1, MSG_parser_);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (FallbackMsgTag)
  private static boolean MsgStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MsgStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FallbackMsgTag(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [FallbackMsgTag <<StatementList !()>>]
  private static boolean MsgStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MsgStatement_2")) return false;
    MsgStatement_2_0(b, l + 1);
    return true;
  }

  // FallbackMsgTag <<StatementList !()>>
  private static boolean MsgStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MsgStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FallbackMsgTag(b, l + 1);
    r = r && StatementList(b, l + 1, MsgStatement_2_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // !()
  private static boolean MsgStatement_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MsgStatement_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !MsgStatement_2_0_1_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ()
  private static boolean MsgStatement_2_0_1_0_0(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // <<BracedTag NamespaceTagBody>>
  public static boolean NamespaceBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceBlock")) return false;
    if (!nextTokenIs(b, "<namespace block>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMESPACE_BLOCK, "<namespace block>");
    r = BracedTag(b, l + 1, NamespaceTagBody_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // QualifiedIdentifier
  public static boolean NamespaceDeclarationIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceDeclarationIdentifier")) return false;
    if (!nextTokenIs(b, QUALIFIED_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedIdentifier(b, l + 1);
    exit_section_(b, m, NAMESPACE_DECLARATION_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // QualifiedIdentifier
  public static boolean NamespaceIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceIdentifier")) return false;
    if (!nextTokenIs(b, QUALIFIED_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedIdentifier(b, l + 1);
    exit_section_(b, m, NAMESPACE_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // NAMESPACE NamespaceDeclarationIdentifier [AttributeList]
  static boolean NamespaceTagBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceTagBody")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, NAMESPACE);
    p = r; // pin = 1
    r = r && NamespaceDeclarationIdentifier(b, l + 1);
    r = r && NamespaceTagBody_2(b, l + 1);
    exit_section_(b, l, m, r, p, recoverEndOfTag_parser_);
    return r || p;
  }

  // [AttributeList]
  private static boolean NamespaceTagBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceTagBody_2")) return false;
    AttributeList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // INTEGER_LITERAL | FLOAT_LITERAL | DOT FLOAT_LITERAL
  static boolean NumberLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumberLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = consumeToken(b, FLOAT_LITERAL);
    if (!r) r = parseTokens(b, 0, DOT, FLOAT_LITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<OpenTagInner <<p>>>> (RBRACE | RBRACE_RBRACE)
  static boolean OpenBracedTag(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "OpenBracedTag")) return false;
    if (!nextTokenIs(b, "", LBRACE, LBRACE_LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = OpenTagInner(b, l + 1, _p);
    p = r; // pin = 1
    r = r && OpenBracedTag_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // RBRACE | RBRACE_RBRACE
  private static boolean OpenBracedTag_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenBracedTag_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RBRACE);
    if (!r) r = consumeToken(b, RBRACE_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (LBRACE | LBRACE_LBRACE) <<p>>
  static boolean OpenTagInner(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "OpenTagInner")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_);
    r = OpenTagInner_0(b, l + 1);
    r = r && _p.parse(b, l);
    exit_section_(b, l, m, r, false, recoverEndOfTag_parser_);
    return r;
  }

  // LBRACE | LBRACE_LBRACE
  private static boolean OpenTagInner_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenTagInner_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    if (!r) r = consumeToken(b, LBRACE_LBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // QualifiedIdentifier
  public static boolean PackageIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PackageIdentifier")) return false;
    if (!nextTokenIs(b, QUALIFIED_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedIdentifier(b, l + 1);
    exit_section_(b, m, PACKAGE_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // PlainIdentifier
  public static boolean ParamDefinitionIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamDefinitionIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAM_DEFINITION_IDENTIFIER, "<param definition identifier>");
    r = PlainIdentifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (ParamListElement | <<UnexpectedStatements (BeginParamTag)>>)*
  //   // StatementList can only be empty and exists to consume whitespace.
  //   <<StatementList (BeginParamTag)>>
  static boolean ParamList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_);
    r = ParamList_0(b, l + 1);
    r = r && StatementList(b, l + 1, ParamList_1_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ParamListElement | <<UnexpectedStatements (BeginParamTag)>>)*
  private static boolean ParamList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamList_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ParamList_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ParamList_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ParamListElement | <<UnexpectedStatements (BeginParamTag)>>
  private static boolean ParamList_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamList_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParamListElement(b, l + 1);
    if (!r) r = UnexpectedStatements(b, l + 1, ParamList_0_0_1_0_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  // (BeginParamTag)
  private static boolean ParamList_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamList_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BeginParamTag(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (BeginParamTag)
  private static boolean ParamList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BeginParamTag(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !<<ClosedBracedTag BeginParamTagBody>> BlockParamListElement | BeginParamTag
  public static boolean ParamListElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamListElement")) return false;
    if (!nextTokenIs(b, "<param list element>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAM_LIST_ELEMENT, "<param list element>");
    r = ParamListElement_0(b, l + 1);
    if (!r) r = BeginParamTag(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // !<<ClosedBracedTag BeginParamTagBody>> BlockParamListElement
  private static boolean ParamListElement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamListElement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParamListElement_0_0(b, l + 1);
    r = r && BlockParamListElement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<ClosedBracedTag BeginParamTagBody>>
  private static boolean ParamListElement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamListElement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !ClosedBracedTag(b, l + 1, BeginParamTagBody_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PlainIdentifier
  public static boolean ParamSpecificationIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParamSpecificationIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAM_SPECIFICATION_IDENTIFIER, "<param specification identifier>");
    r = PlainIdentifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER_WORD | KeywordsAllowedInIdentifiers
  static boolean PlainIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PlainIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER_WORD);
    if (!r) r = KeywordsAllowedInIdentifiers(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<AbstractChoiceStatement PLURAL>>
  public static boolean PluralStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PluralStatement")) return false;
    if (!nextTokenIs(b, "<plural statement>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PLURAL_STATEMENT, "<plural statement>");
    r = AbstractChoiceStatement(b, l + 1, PLURAL_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ANY | STRING | BOOL | INT | FLOAT | NUMBER | HTML | NULL_LITERAL | QUESTIONMARK |
  //     URI | JS | ATTRIBUTES | TypeIdentifier
  public static boolean PrimitiveType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimitiveType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMITIVE_TYPE, "<primitive type>");
    r = consumeToken(b, ANY);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, BOOL);
    if (!r) r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, HTML);
    if (!r) r = consumeToken(b, NULL_LITERAL);
    if (!r) r = consumeToken(b, QUESTIONMARK);
    if (!r) r = consumeToken(b, URI);
    if (!r) r = consumeToken(b, JS);
    if (!r) r = consumeToken(b, ATTRIBUTES);
    if (!r) r = TypeIdentifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ImplicitPrintBody | ExplicitPrintBody
  static boolean PrintBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrintBody")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImplicitPrintBody(b, l + 1);
    if (!r) r = ExplicitPrintBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<BracedTag PrintBody>>
  public static boolean PrintStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrintStatement")) return false;
    if (!nextTokenIs(b, "<print statement>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRINT_STATEMENT, "<print statement>");
    r = BracedTag(b, l + 1, PrintBody_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PlainIdentifier (DOT PlainIdentifier)+
  public static boolean ProtobufEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProtobufEnum")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROTOBUF_ENUM, "<protobuf enum>");
    r = PlainIdentifier(b, l + 1);
    r = r && ProtobufEnum_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (DOT PlainIdentifier)+
  private static boolean ProtobufEnum_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProtobufEnum_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ProtobufEnum_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!ProtobufEnum_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ProtobufEnum_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // DOT PlainIdentifier
  private static boolean ProtobufEnum_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ProtobufEnum_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && PlainIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // QUALIFIED_IDENTIFIER
  static boolean QualifiedIdentifier(PsiBuilder b, int l) {
    return consumeToken(b, QUALIFIED_IDENTIFIER);
  }

  /* ********************************************************** */
  // SQUARE_OPEN RecordTypeField (COMMA RecordTypeField)* SQUARE_CLOSE
  public static boolean RecordType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordType")) return false;
    if (!nextTokenIs(b, SQUARE_OPEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RECORD_TYPE, null);
    r = consumeToken(b, SQUARE_OPEN);
    p = r; // pin = 1
    r = r && RecordTypeField(b, l + 1);
    r = r && RecordType_2(b, l + 1);
    r = r && consumeToken(b, SQUARE_CLOSE);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA RecordTypeField)*
  private static boolean RecordType_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordType_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!RecordType_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RecordType_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA RecordTypeField
  private static boolean RecordType_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordType_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && RecordTypeField(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FieldIdentifier COLON TypeExpression
  public static boolean RecordTypeField(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RecordTypeField")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RECORD_TYPE_FIELD, "<record type field>");
    r = FieldIdentifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    p = r; // pin = 2
    r = r && TypeExpression(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // <<AbstractChoiceStatement SELECT>>
  public static boolean SelectStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelectStatement")) return false;
    if (!nextTokenIs(b, "<select statement>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECT_STATEMENT, "<select statement>");
    r = AbstractChoiceStatement(b, l + 1, SELECT_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CssStatement
  //   |
  //     LetSingleStatement
  //   |
  //     SpecialCharacterStatement
  //   |
  //     XidStatement
  //   |
  //     PrintStatement
  static boolean SingleTagStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SingleTagStatement")) return false;
    if (!nextTokenIs(b, "", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CssStatement(b, l + 1);
    if (!r) r = LetSingleStatement(b, l + 1);
    if (!r) r = SpecialCharacterStatement(b, l + 1);
    if (!r) r = XidStatement(b, l + 1);
    if (!r) r = PrintStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<BracedTag LB>>
  //   | <<BracedTag NIL>>
  //   | <<BracedTag RB>>
  //   | <<BracedTag SP>>
  //   | <<BracedTag TAB>>
  //   | <<BracedTag NEWLINE_LITERAL>>
  //   | <<BracedTag CARRIAGE_RETURN>>
  public static boolean SpecialCharacterStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialCharacterStatement")) return false;
    if (!nextTokenIs(b, "<special character statement>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SPECIAL_CHARACTER_STATEMENT, "<special character statement>");
    r = BracedTag(b, l + 1, LB_parser_);
    if (!r) r = BracedTag(b, l + 1, NIL_parser_);
    if (!r) r = BracedTag(b, l + 1, RB_parser_);
    if (!r) r = BracedTag(b, l + 1, SP_parser_);
    if (!r) r = BracedTag(b, l + 1, TAB_parser_);
    if (!r) r = BracedTag(b, l + 1, NEWLINE_LITERAL_parser_);
    if (!r) r = BracedTag(b, l + 1, CARRIAGE_RETURN_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SingleTagStatement
  //   |
  //     CallStatement
  //   |
  //     ChoiceStatement
  //   |
  //     ForStatement
  //   |
  //     ForeachStatement
  //   |
  //     IfStatement
  //   |
  //     LetCompoundStatement
  //   |
  //     LiteralStatement
  //   |
  //     MsgStatement
  //   |
  //     Content
  static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SingleTagStatement(b, l + 1);
    if (!r) r = CallStatement(b, l + 1);
    if (!r) r = ChoiceStatement(b, l + 1);
    if (!r) r = ForStatement(b, l + 1);
    if (!r) r = ForeachStatement(b, l + 1);
    if (!r) r = IfStatement(b, l + 1);
    if (!r) r = LetCompoundStatement(b, l + 1);
    if (!r) r = LiteralStatement(b, l + 1);
    if (!r) r = MsgStatement(b, l + 1);
    if (!r) r = Content(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (Statement | !(<<p>> | endOfStatementBlock) CatchallBraces)*
  public static boolean StatementList(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "StatementList")) return false;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_LIST, null);
    int c = current_position_(b);
    while (true) {
      if (!StatementList_0(b, l + 1, _p)) break;
      if (!empty_element_parsed_guard_(b, "StatementList", c)) break;
      c = current_position_(b);
    }
    register_hook_(b, WS_BINDERS, GREEDY_LEFT_BINDER, GREEDY_RIGHT_BINDER);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // Statement | !(<<p>> | endOfStatementBlock) CatchallBraces
  private static boolean StatementList_0(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "StatementList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Statement(b, l + 1);
    if (!r) r = StatementList_0_1(b, l + 1, _p);
    exit_section_(b, m, null, r);
    return r;
  }

  // !(<<p>> | endOfStatementBlock) CatchallBraces
  private static boolean StatementList_0_1(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "StatementList_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StatementList_0_1_0(b, l + 1, _p);
    r = r && CatchallBraces(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !(<<p>> | endOfStatementBlock)
  private static boolean StatementList_0_1_0(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "StatementList_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !StatementList_0_1_0_0(b, l + 1, _p);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<p>> | endOfStatementBlock
  private static boolean StatementList_0_1_0_0(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "StatementList_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _p.parse(b, l);
    if (!r) r = parseEndOfStatementBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<AbstractChoiceStatement SWITCH>>
  public static boolean SwitchStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SwitchStatement")) return false;
    if (!nextTokenIs(b, "<switch statement>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SWITCH_STATEMENT, "<switch statement>");
    r = AbstractChoiceStatement(b, l + 1, SWITCH_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LocalTemplateBlock | DelegateTemplateBlock
  public static boolean TemplateBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateBlock")) return false;
    if (!nextTokenIs(b, "<template block>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_BLOCK, "<template block>");
    r = LocalTemplateBlock(b, l + 1);
    if (!r) r = DelegateTemplateBlock(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // QualifiedIdentifier
  public static boolean TemplateDefinitionIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateDefinitionIdentifier")) return false;
    if (!nextTokenIs(b, QUALIFIED_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedIdentifier(b, l + 1);
    exit_section_(b, m, TEMPLATE_DEFINITION_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // QualifiedIdentifier
  public static boolean TemplateReferenceIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateReferenceIdentifier")) return false;
    if (!nextTokenIs(b, QUALIFIED_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedIdentifier(b, l + 1);
    exit_section_(b, m, TEMPLATE_REFERENCE_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // UnionType | CompoundType | PrimitiveType
  public static boolean TypeExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_EXPRESSION, "<type expression>");
    r = UnionType(b, l + 1);
    if (!r) r = CompoundType(b, l + 1);
    if (!r) r = PrimitiveType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PlainIdentifier (DOT PlainIdentifier)*
  public static boolean TypeIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_IDENTIFIER, "<type identifier>");
    r = PlainIdentifier(b, l + 1);
    r = r && TypeIdentifier_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (DOT PlainIdentifier)*
  private static boolean TypeIdentifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdentifier_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TypeIdentifier_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeIdentifier_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DOT PlainIdentifier
  private static boolean TypeIdentifier_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdentifier_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && PlainIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (Statement | !(<<p>> | endOfStatementBlock) CatchallBraces)+
  public static boolean UnexpectedStatements(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "UnexpectedStatements")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNEXPECTED_STATEMENTS, null);
    r = UnexpectedStatements_0(b, l + 1, _p);
    int c = current_position_(b);
    while (r) {
      if (!UnexpectedStatements_0(b, l + 1, _p)) break;
      if (!empty_element_parsed_guard_(b, "UnexpectedStatements", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Statement | !(<<p>> | endOfStatementBlock) CatchallBraces
  private static boolean UnexpectedStatements_0(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "UnexpectedStatements_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Statement(b, l + 1);
    if (!r) r = UnexpectedStatements_0_1(b, l + 1, _p);
    exit_section_(b, m, null, r);
    return r;
  }

  // !(<<p>> | endOfStatementBlock) CatchallBraces
  private static boolean UnexpectedStatements_0_1(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "UnexpectedStatements_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnexpectedStatements_0_1_0(b, l + 1, _p);
    r = r && CatchallBraces(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !(<<p>> | endOfStatementBlock)
  private static boolean UnexpectedStatements_0_1_0(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "UnexpectedStatements_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !UnexpectedStatements_0_1_0_0(b, l + 1, _p);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<p>> | endOfStatementBlock
  private static boolean UnexpectedStatements_0_1_0_0(PsiBuilder b, int l, Parser _p) {
    if (!recursion_guard_(b, l, "UnexpectedStatements_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _p.parse(b, l);
    if (!r) r = parseEndOfStatementBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (CompoundType | PrimitiveType) PIPE TypeExpression
  public static boolean UnionType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionType")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, UNION_TYPE, "<union type>");
    r = UnionType_0(b, l + 1);
    r = r && consumeToken(b, PIPE);
    p = r; // pin = 2
    r = r && TypeExpression(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // CompoundType | PrimitiveType
  private static boolean UnionType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionType_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CompoundType(b, l + 1);
    if (!r) r = PrimitiveType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NumberLiteral | AnyStringLiteral | ProtobufEnum | BOOL_LITERAL | NULL_LITERAL
  static boolean ValueLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValueLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NumberLiteral(b, l + 1);
    if (!r) r = AnyStringLiteral(b, l + 1);
    if (!r) r = ProtobufEnum(b, l + 1);
    if (!r) r = consumeToken(b, BOOL_LITERAL);
    if (!r) r = consumeToken(b, NULL_LITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VariableIdentifier
  public static boolean VariableDefinitionIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableDefinitionIdentifier")) return false;
    if (!nextTokenIs(b, DOLLAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableIdentifier(b, l + 1);
    exit_section_(b, m, VARIABLE_DEFINITION_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // DOLLAR IDENTIFIER_WORD
  static boolean VariableIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableIdentifier")) return false;
    if (!nextTokenIs(b, DOLLAR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, DOLLAR, IDENTIFIER_WORD);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // <<BracedTag XidStatementTagBody>>
  public static boolean XidStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XidStatement")) return false;
    if (!nextTokenIs(b, "<xid statement>", LBRACE, LBRACE_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, XID_STATEMENT, "<xid statement>");
    r = BracedTag(b, l + 1, XidStatementTagBody_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // XID CSS_XID_IDENTIFIER
  static boolean XidStatementTagBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "XidStatementTagBody")) return false;
    if (!nextTokenIs(b, XID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, XID, CSS_XID_IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !(Brace | LITERAL | LITERAL_DOUBLE)
  static boolean recoverEndOfTag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recoverEndOfTag")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !recoverEndOfTag_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Brace | LITERAL | LITERAL_DOUBLE
  private static boolean recoverEndOfTag_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recoverEndOfTag_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Brace(b, l + 1);
    if (!r) r = consumeToken(b, LITERAL);
    if (!r) r = consumeToken(b, LITERAL_DOUBLE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: Expr
  // Operator priority table:
  // 0: BINARY(NullCheckTernaryExpr)
  // 1: BINARY(NullCheckBinExpr)
  // 2: BINARY(OrBinExpr)
  // 3: BINARY(AndBinExpr)
  // 4: BINARY(BoolOrBinExpr)
  // 5: BINARY(BoolAndBinExpr)
  // 6: BINARY(CompBinExpr)
  // 7: BINARY(RelCompBinExpr)
  // 8: BINARY(AddBinExpr)
  // 9: BINARY(MulBinExpr)
  // 10: PREFIX(UnaryExpr)
  // 11: ATOM(VariableReferenceIdentifier) ATOM(FunctionCallExpr) POSTFIX(FieldExpr) POSTFIX(IndexExpr)
  //    ATOM(MapExpr) ATOM(ListExpr) PREFIX(ParenthesizedExpr) ATOM(LiteralExpr)
  public static boolean Expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expr")) return false;
    addVariant(b, "<expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = UnaryExpr(b, l + 1);
    if (!r) r = VariableReferenceIdentifier(b, l + 1);
    if (!r) r = FunctionCallExpr(b, l + 1);
    if (!r) r = MapExpr(b, l + 1);
    if (!r) r = ListExpr(b, l + 1);
    if (!r) r = ParenthesizedExpr(b, l + 1);
    if (!r) r = LiteralExpr(b, l + 1);
    p = r;
    r = r && Expr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean Expr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, QUESTIONMARK)) {
        r = report_error_(b, Expr(b, l, 0));
        r = NullCheckTernaryExpr_1(b, l + 1) && r;
        exit_section_(b, l, m, NULL_CHECK_TERNARY_EXPR, r, true, null);
      }
      else if (g < 1 && consumeTokenSmart(b, TERNARY_COALESCER)) {
        r = Expr(b, l, 1);
        exit_section_(b, l, m, NULL_CHECK_BIN_EXPR, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, OR)) {
        r = Expr(b, l, 2);
        exit_section_(b, l, m, OR_BIN_EXPR, r, true, null);
      }
      else if (g < 3 && consumeTokenSmart(b, AND)) {
        r = Expr(b, l, 3);
        exit_section_(b, l, m, AND_BIN_EXPR, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, PIPE_PIPE)) {
        r = Expr(b, l, 4);
        exit_section_(b, l, m, BOOL_OR_BIN_EXPR, r, true, null);
      }
      else if (g < 5 && consumeTokenSmart(b, AMP_AMP)) {
        r = Expr(b, l, 5);
        exit_section_(b, l, m, BOOL_AND_BIN_EXPR, r, true, null);
      }
      else if (g < 6 && CompBinExpr_0(b, l + 1)) {
        r = Expr(b, l, 6);
        exit_section_(b, l, m, COMP_BIN_EXPR, r, true, null);
      }
      else if (g < 7 && RelCompBinExpr_0(b, l + 1)) {
        r = Expr(b, l, 7);
        exit_section_(b, l, m, REL_COMP_BIN_EXPR, r, true, null);
      }
      else if (g < 8 && AddBinExpr_0(b, l + 1)) {
        r = Expr(b, l, 8);
        exit_section_(b, l, m, ADD_BIN_EXPR, r, true, null);
      }
      else if (g < 9 && MulBinExpr_0(b, l + 1)) {
        r = Expr(b, l, 9);
        exit_section_(b, l, m, MUL_BIN_EXPR, r, true, null);
      }
      else if (g < 11 && FieldAccess(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, FIELD_EXPR, r, true, null);
      }
      else if (g < 11 && IndexExpr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, INDEX_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // COLON Expr
  private static boolean NullCheckTernaryExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NullCheckTernaryExpr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, COLON);
    r = r && Expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQUAL_EQUAL | NOT_EQUAL
  private static boolean CompBinExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompBinExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, EQUAL_EQUAL);
    if (!r) r = consumeTokenSmart(b, NOT_EQUAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // GREATER | GREATER_EQUAL | LESS_EQUAL | LESS
  private static boolean RelCompBinExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelCompBinExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, GREATER);
    if (!r) r = consumeTokenSmart(b, GREATER_EQUAL);
    if (!r) r = consumeTokenSmart(b, LESS_EQUAL);
    if (!r) r = consumeTokenSmart(b, LESS);
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS | MINUS
  private static boolean AddBinExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddBinExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, PLUS);
    if (!r) r = consumeTokenSmart(b, MINUS);
    exit_section_(b, m, null, r);
    return r;
  }

  // STAR | SLASH | PERCENT
  private static boolean MulBinExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulBinExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, STAR);
    if (!r) r = consumeTokenSmart(b, SLASH);
    if (!r) r = consumeTokenSmart(b, PERCENT);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean UnaryExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = UnaryExpr_0(b, l + 1);
    p = r;
    r = p && Expr(b, l, 10);
    exit_section_(b, l, m, UNARY_EXPR, r, p, null);
    return r || p;
  }

  // PLUS | MINUS | NOT | EXCLAMATION
  private static boolean UnaryExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, PLUS);
    if (!r) r = consumeTokenSmart(b, MINUS);
    if (!r) r = consumeTokenSmart(b, NOT);
    if (!r) r = consumeTokenSmart(b, EXCLAMATION);
    exit_section_(b, m, null, r);
    return r;
  }

  // VariableIdentifier
  public static boolean VariableReferenceIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariableReferenceIdentifier")) return false;
    if (!nextTokenIsSmart(b, DOLLAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VariableIdentifier(b, l + 1);
    exit_section_(b, m, VARIABLE_REFERENCE_IDENTIFIER, r);
    return r;
  }

  // FunctionIdentifier PARENS_OPEN [CommaSeparatedExpressionList] PARENS_CLOSE
  public static boolean FunctionCallExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_CALL_EXPR, "<function call expr>");
    r = FunctionIdentifier(b, l + 1);
    r = r && consumeToken(b, PARENS_OPEN);
    r = r && FunctionCallExpr_2(b, l + 1);
    r = r && consumeToken(b, PARENS_CLOSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [CommaSeparatedExpressionList]
  private static boolean FunctionCallExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionCallExpr_2")) return false;
    CommaSeparatedExpressionList(b, l + 1);
    return true;
  }

  // (SQUARE_OPEN | INDEX_NULL_CHECK) [CommaSeparatedExpressionList] SQUARE_CLOSE
  private static boolean IndexExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IndexExpr_0_0(b, l + 1);
    r = r && IndexExpr_0_1(b, l + 1);
    r = r && consumeToken(b, SQUARE_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // SQUARE_OPEN | INDEX_NULL_CHECK
  private static boolean IndexExpr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexExpr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, SQUARE_OPEN);
    if (!r) r = consumeTokenSmart(b, INDEX_NULL_CHECK);
    exit_section_(b, m, null, r);
    return r;
  }

  // [CommaSeparatedExpressionList]
  private static boolean IndexExpr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexExpr_0_1")) return false;
    CommaSeparatedExpressionList(b, l + 1);
    return true;
  }

  // SQUARE_OPEN [CommaSeparatedKeyValueList] SQUARE_CLOSE
  public static boolean MapExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapExpr")) return false;
    if (!nextTokenIsSmart(b, SQUARE_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, SQUARE_OPEN);
    r = r && MapExpr_1(b, l + 1);
    r = r && consumeToken(b, SQUARE_CLOSE);
    exit_section_(b, m, MAP_EXPR, r);
    return r;
  }

  // [CommaSeparatedKeyValueList]
  private static boolean MapExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapExpr_1")) return false;
    CommaSeparatedKeyValueList(b, l + 1);
    return true;
  }

  // SQUARE_OPEN [CommaSeparatedExpressionList] SQUARE_CLOSE
  public static boolean ListExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListExpr")) return false;
    if (!nextTokenIsSmart(b, SQUARE_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, SQUARE_OPEN);
    r = r && ListExpr_1(b, l + 1);
    r = r && consumeToken(b, SQUARE_CLOSE);
    exit_section_(b, m, LIST_EXPR, r);
    return r;
  }

  // [CommaSeparatedExpressionList]
  private static boolean ListExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ListExpr_1")) return false;
    CommaSeparatedExpressionList(b, l + 1);
    return true;
  }

  public static boolean ParenthesizedExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParenthesizedExpr")) return false;
    if (!nextTokenIsSmart(b, PARENS_OPEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, PARENS_OPEN);
    p = r;
    r = p && Expr(b, l, -1);
    r = p && report_error_(b, consumeToken(b, PARENS_CLOSE)) && r;
    exit_section_(b, l, m, PARENTHESIZED_EXPR, r, p, null);
    return r || p;
  }

  // ValueLiteral
  public static boolean LiteralExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_EXPR, "<literal expr>");
    r = ValueLiteral(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  final static Parser AbstractTemplateBlock_2_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return AbstractTemplateBlock_2_0_0(b, l + 1);
    }
  };
  final static Parser AliasBody_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return AliasBody(b, l + 1);
    }
  };
  final static Parser AtInjectBody_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return AtInjectBody(b, l + 1);
    }
  };
  final static Parser AtParamBody_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return AtParamBody(b, l + 1);
    }
  };
  final static Parser BeginCaseClauseTagBody_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return BeginCaseClauseTagBody(b, l + 1);
    }
  };
  final static Parser BeginElseIfTagBody_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return BeginElseIfTagBody(b, l + 1);
    }
  };
  final static Parser BeginForTagBody_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return BeginForTagBody(b, l + 1);
    }
  };
  final static Parser BeginForeachTagBody_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return BeginForeachTagBody(b, l + 1);
    }
  };
  final static Parser BeginIfTagBody_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return BeginIfTagBody(b, l + 1);
    }
  };
  final static Parser BeginLetTagBody_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return BeginLetTagBody(b, l + 1);
    }
  };
  final static Parser BeginMsgTagBody_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return BeginMsgTagBody(b, l + 1);
    }
  };
  final static Parser BeginParamTagBody_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return BeginParamTagBody(b, l + 1);
    }
  };
  final static Parser BlockParamListElement_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return BlockParamListElement_1_0(b, l + 1);
    }
  };
  final static Parser CALL_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, CALL);
    }
  };
  final static Parser CARRIAGE_RETURN_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, CARRIAGE_RETURN);
    }
  };
  final static Parser CatchallBraces_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return CatchallBraces_0_0(b, l + 1);
    }
  };
  final static Parser CatchallBraces_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return CatchallBraces_1_0(b, l + 1);
    }
  };
  final static Parser ChoiceClause_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return ChoiceClause_1_0(b, l + 1);
    }
  };
  final static Parser ChoiceClausesList_0_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return ChoiceClausesList_0_0_0(b, l + 1);
    }
  };
  final static Parser ChoiceClausesList_2_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return ChoiceClausesList_2_0(b, l + 1);
    }
  };
  final static Parser CssStatementTagBody_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return CssStatementTagBody(b, l + 1);
    }
  };
  final static Parser DEFAULT_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, DEFAULT);
    }
  };
  final static Parser DELCALL_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, DELCALL);
    }
  };
  final static Parser DELTEMPLATE_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, DELTEMPLATE);
    }
  };
  final static Parser DelegatePackageTagBody_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return DelegatePackageTagBody(b, l + 1);
    }
  };
  final static Parser ELSE_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, ELSE);
    }
  };
  final static Parser ElseIfClause_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return ElseIfClause_1_0(b, l + 1);
    }
  };
  final static Parser FOREACH_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, FOREACH);
    }
  };
  final static Parser FOR_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, FOR);
    }
  };
  final static Parser FallbackMsgTagBody_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return FallbackMsgTagBody(b, l + 1);
    }
  };
  final static Parser ForStatement_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return ForStatement_1_0(b, l + 1);
    }
  };
  final static Parser ForeachStatement_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return ForeachStatement_1_0(b, l + 1);
    }
  };
  final static Parser ForeachStatement_2_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return ForeachStatement_2_0_1_0(b, l + 1);
    }
  };
  final static Parser IFEMPTY_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, IFEMPTY);
    }
  };
  final static Parser IF_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, IF);
    }
  };
  final static Parser IfStatement_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return IfStatement_1_0(b, l + 1);
    }
  };
  final static Parser IfStatement_3_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return IfStatement_3_0_1_0(b, l + 1);
    }
  };
  final static Parser LB_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, LB);
    }
  };
  final static Parser LET_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, LET);
    }
  };
  final static Parser LetCompoundStatement_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return LetCompoundStatement_1_0(b, l + 1);
    }
  };
  final static Parser LetSingleTagBody_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return LetSingleTagBody(b, l + 1);
    }
  };
  final static Parser MSG_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, MSG);
    }
  };
  final static Parser MsgStatement_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return MsgStatement_1_0(b, l + 1);
    }
  };
  final static Parser MsgStatement_2_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return MsgStatement_2_0_1_0(b, l + 1);
    }
  };
  final static Parser NEWLINE_LITERAL_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, NEWLINE_LITERAL);
    }
  };
  final static Parser NIL_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, NIL);
    }
  };
  final static Parser NamespaceTagBody_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return NamespaceTagBody(b, l + 1);
    }
  };
  final static Parser PARAM_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, PARAM);
    }
  };
  final static Parser PLURAL_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, PLURAL);
    }
  };
  final static Parser ParamList_0_0_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return ParamList_0_0_1_0(b, l + 1);
    }
  };
  final static Parser ParamList_1_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return ParamList_1_0(b, l + 1);
    }
  };
  final static Parser PrintBody_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return PrintBody(b, l + 1);
    }
  };
  final static Parser RB_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, RB);
    }
  };
  final static Parser SELECT_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, SELECT);
    }
  };
  final static Parser SP_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, SP);
    }
  };
  final static Parser SWITCH_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, SWITCH);
    }
  };
  final static Parser TAB_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, TAB);
    }
  };
  final static Parser TEMPLATE_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return consumeToken(b, TEMPLATE);
    }
  };
  final static Parser XidStatementTagBody_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return XidStatementTagBody(b, l + 1);
    }
  };
  final static Parser recoverEndOfTag_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return recoverEndOfTag(b, l + 1);
    }
  };
}
