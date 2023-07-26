// Generated from /Users/wujianchao5/project/jd/antlr-demo/src/main/java/woo/sql/parser/DemoDB.g4 by ANTLR 4.10.1
package woo.sql.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DemoDBParser}.
 */
public interface DemoDBListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatements(DemoDBParser.SqlStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatements(DemoDBParser.SqlStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(DemoDBParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(DemoDBParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(DemoDBParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(DemoDBParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DemoDBParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DemoDBParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#queryStatment}.
	 * @param ctx the parse tree
	 */
	void enterQueryStatment(DemoDBParser.QueryStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#queryStatment}.
	 * @param ctx the parse tree
	 */
	void exitQueryStatment(DemoDBParser.QueryStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#queryRelation}.
	 * @param ctx the parse tree
	 */
	void enterQueryRelation(DemoDBParser.QueryRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#queryRelation}.
	 * @param ctx the parse tree
	 */
	void exitQueryRelation(DemoDBParser.QueryRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterQueryNoWith(DemoDBParser.QueryNoWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitQueryNoWith(DemoDBParser.QueryNoWithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryWithParentheses}
	 * labeled alternative in {@link DemoDBParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryWithParentheses(DemoDBParser.QueryWithParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryWithParentheses}
	 * labeled alternative in {@link DemoDBParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryWithParentheses(DemoDBParser.QueryWithParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link DemoDBParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(DemoDBParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link DemoDBParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(DemoDBParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link DemoDBParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(DemoDBParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link DemoDBParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(DemoDBParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(DemoDBParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(DemoDBParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(DemoDBParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(DemoDBParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(DemoDBParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(DemoDBParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code from}
	 * labeled alternative in {@link DemoDBParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFrom(DemoDBParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by the {@code from}
	 * labeled alternative in {@link DemoDBParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFrom(DemoDBParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dual}
	 * labeled alternative in {@link DemoDBParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterDual(DemoDBParser.DualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dual}
	 * labeled alternative in {@link DemoDBParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitDual(DemoDBParser.DualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rollup}
	 * labeled alternative in {@link DemoDBParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void enterRollup(DemoDBParser.RollupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rollup}
	 * labeled alternative in {@link DemoDBParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void exitRollup(DemoDBParser.RollupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cube}
	 * labeled alternative in {@link DemoDBParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void enterCube(DemoDBParser.CubeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cube}
	 * labeled alternative in {@link DemoDBParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void exitCube(DemoDBParser.CubeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleGroupingSets}
	 * labeled alternative in {@link DemoDBParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleGroupingSets(DemoDBParser.MultipleGroupingSetsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleGroupingSets}
	 * labeled alternative in {@link DemoDBParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleGroupingSets(DemoDBParser.MultipleGroupingSetsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleGroupingSet}
	 * labeled alternative in {@link DemoDBParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void enterSingleGroupingSet(DemoDBParser.SingleGroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleGroupingSet}
	 * labeled alternative in {@link DemoDBParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void exitSingleGroupingSet(DemoDBParser.SingleGroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(DemoDBParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(DemoDBParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link DemoDBParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectSingle(DemoDBParser.SelectSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link DemoDBParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectSingle(DemoDBParser.SelectSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link DemoDBParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectAll(DemoDBParser.SelectAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link DemoDBParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectAll(DemoDBParser.SelectAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#relations}.
	 * @param ctx the parse tree
	 */
	void enterRelations(DemoDBParser.RelationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#relations}.
	 * @param ctx the parse tree
	 */
	void exitRelations(DemoDBParser.RelationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(DemoDBParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(DemoDBParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableAtom}
	 * labeled alternative in {@link DemoDBParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableAtom(DemoDBParser.TableAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableAtom}
	 * labeled alternative in {@link DemoDBParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableAtom(DemoDBParser.TableAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTable}
	 * labeled alternative in {@link DemoDBParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(DemoDBParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTable}
	 * labeled alternative in {@link DemoDBParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(DemoDBParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryWithAlias}
	 * labeled alternative in {@link DemoDBParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryWithAlias(DemoDBParser.SubqueryWithAliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryWithAlias}
	 * labeled alternative in {@link DemoDBParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryWithAlias(DemoDBParser.SubqueryWithAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFunction}
	 * labeled alternative in {@link DemoDBParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableFunction(DemoDBParser.TableFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFunction}
	 * labeled alternative in {@link DemoDBParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableFunction(DemoDBParser.TableFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedRelation}
	 * labeled alternative in {@link DemoDBParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedRelation(DemoDBParser.ParenthesizedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedRelation}
	 * labeled alternative in {@link DemoDBParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedRelation(DemoDBParser.ParenthesizedRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#rowConstructor}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(DemoDBParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#rowConstructor}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(DemoDBParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(DemoDBParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(DemoDBParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#crossOrInnerJoinType}.
	 * @param ctx the parse tree
	 */
	void enterCrossOrInnerJoinType(DemoDBParser.CrossOrInnerJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#crossOrInnerJoinType}.
	 * @param ctx the parse tree
	 */
	void exitCrossOrInnerJoinType(DemoDBParser.CrossOrInnerJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#outerAndSemiJoinType}.
	 * @param ctx the parse tree
	 */
	void enterOuterAndSemiJoinType(DemoDBParser.OuterAndSemiJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#outerAndSemiJoinType}.
	 * @param ctx the parse tree
	 */
	void exitOuterAndSemiJoinType(DemoDBParser.OuterAndSemiJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#bracketHint}.
	 * @param ctx the parse tree
	 */
	void enterBracketHint(DemoDBParser.BracketHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#bracketHint}.
	 * @param ctx the parse tree
	 */
	void exitBracketHint(DemoDBParser.BracketHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#setVarHint}.
	 * @param ctx the parse tree
	 */
	void enterSetVarHint(DemoDBParser.SetVarHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#setVarHint}.
	 * @param ctx the parse tree
	 */
	void exitSetVarHint(DemoDBParser.SetVarHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#hintMap}.
	 * @param ctx the parse tree
	 */
	void enterHintMap(DemoDBParser.HintMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#hintMap}.
	 * @param ctx the parse tree
	 */
	void exitHintMap(DemoDBParser.HintMapContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(DemoDBParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(DemoDBParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#columnAliases}.
	 * @param ctx the parse tree
	 */
	void enterColumnAliases(DemoDBParser.ColumnAliasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#columnAliases}.
	 * @param ctx the parse tree
	 */
	void exitColumnAliases(DemoDBParser.ColumnAliasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#partitionNames}.
	 * @param ctx the parse tree
	 */
	void enterPartitionNames(DemoDBParser.PartitionNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#partitionNames}.
	 * @param ctx the parse tree
	 */
	void exitPartitionNames(DemoDBParser.PartitionNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#tabletList}.
	 * @param ctx the parse tree
	 */
	void enterTabletList(DemoDBParser.TabletListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#tabletList}.
	 * @param ctx the parse tree
	 */
	void exitTabletList(DemoDBParser.TabletListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#identifierOrString}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierOrString(DemoDBParser.IdentifierOrStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#identifierOrString}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierOrString(DemoDBParser.IdentifierOrStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(DemoDBParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(DemoDBParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionDefault}
	 * labeled alternative in {@link DemoDBParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDefault(DemoDBParser.ExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionDefault}
	 * labeled alternative in {@link DemoDBParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDefault(DemoDBParser.ExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link DemoDBParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(DemoDBParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link DemoDBParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(DemoDBParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link DemoDBParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(DemoDBParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link DemoDBParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(DemoDBParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(DemoDBParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(DemoDBParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link DemoDBParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(DemoDBParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link DemoDBParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(DemoDBParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code digitIdentifier}
	 * labeled alternative in {@link DemoDBParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterDigitIdentifier(DemoDBParser.DigitIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code digitIdentifier}
	 * labeled alternative in {@link DemoDBParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitDigitIdentifier(DemoDBParser.DigitIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code backQuotedIdentifier}
	 * labeled alternative in {@link DemoDBParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterBackQuotedIdentifier(DemoDBParser.BackQuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code backQuotedIdentifier}
	 * labeled alternative in {@link DemoDBParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitBackQuotedIdentifier(DemoDBParser.BackQuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(DemoDBParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(DemoDBParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(DemoDBParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(DemoDBParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(DemoDBParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(DemoDBParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(DemoDBParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(DemoDBParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link DemoDBParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(DemoDBParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link DemoDBParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(DemoDBParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpressionDefault}
	 * labeled alternative in {@link DemoDBParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpressionDefault(DemoDBParser.BooleanExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpressionDefault}
	 * labeled alternative in {@link DemoDBParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpressionDefault(DemoDBParser.BooleanExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isNull}
	 * labeled alternative in {@link DemoDBParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterIsNull(DemoDBParser.IsNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isNull}
	 * labeled alternative in {@link DemoDBParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitIsNull(DemoDBParser.IsNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalarSubquery}
	 * labeled alternative in {@link DemoDBParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterScalarSubquery(DemoDBParser.ScalarSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalarSubquery}
	 * labeled alternative in {@link DemoDBParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitScalarSubquery(DemoDBParser.ScalarSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(DemoDBParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(DemoDBParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inList}
	 * labeled alternative in {@link DemoDBParser#predicateOperations}.
	 * @param ctx the parse tree
	 */
	void enterInList(DemoDBParser.InListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inList}
	 * labeled alternative in {@link DemoDBParser#predicateOperations}.
	 * @param ctx the parse tree
	 */
	void exitInList(DemoDBParser.InListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inSubquery}
	 * labeled alternative in {@link DemoDBParser#predicateOperations}.
	 * @param ctx the parse tree
	 */
	void enterInSubquery(DemoDBParser.InSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inSubquery}
	 * labeled alternative in {@link DemoDBParser#predicateOperations}.
	 * @param ctx the parse tree
	 */
	void exitInSubquery(DemoDBParser.InSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code between}
	 * labeled alternative in {@link DemoDBParser#predicateOperations}.
	 * @param ctx the parse tree
	 */
	void enterBetween(DemoDBParser.BetweenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code between}
	 * labeled alternative in {@link DemoDBParser#predicateOperations}.
	 * @param ctx the parse tree
	 */
	void exitBetween(DemoDBParser.BetweenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code like}
	 * labeled alternative in {@link DemoDBParser#predicateOperations}.
	 * @param ctx the parse tree
	 */
	void enterLike(DemoDBParser.LikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code like}
	 * labeled alternative in {@link DemoDBParser#predicateOperations}.
	 * @param ctx the parse tree
	 */
	void exitLike(DemoDBParser.LikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link DemoDBParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(DemoDBParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link DemoDBParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(DemoDBParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link DemoDBParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(DemoDBParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link DemoDBParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(DemoDBParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(DemoDBParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(DemoDBParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrowExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrowExpression(DemoDBParser.ArrowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrowExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrowExpression(DemoDBParser.ArrowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code odbcFunctionCallExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterOdbcFunctionCallExpression(DemoDBParser.OdbcFunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code odbcFunctionCallExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitOdbcFunctionCallExpression(DemoDBParser.OdbcFunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnRef}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnRef(DemoDBParser.ColumnRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnRef}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnRef(DemoDBParser.ColumnRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code systemVariableExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSystemVariableExpression(DemoDBParser.SystemVariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code systemVariableExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSystemVariableExpression(DemoDBParser.SystemVariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code convert}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConvert(DemoDBParser.ConvertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code convert}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConvert(DemoDBParser.ConvertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concat}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConcat(DemoDBParser.ConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concat}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConcat(DemoDBParser.ConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(DemoDBParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(DemoDBParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaFunctionExpr}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaFunctionExpr(DemoDBParser.LambdaFunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaFunctionExpr}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaFunctionExpr(DemoDBParser.LambdaFunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collectionSubscript}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCollectionSubscript(DemoDBParser.CollectionSubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collectionSubscript}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCollectionSubscript(DemoDBParser.CollectionSubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DemoDBParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DemoDBParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(DemoDBParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(DemoDBParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collate}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCollate(DemoDBParser.CollateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collate}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCollate(DemoDBParser.CollateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(DemoDBParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(DemoDBParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code userVariableExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUserVariableExpression(DemoDBParser.UserVariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code userVariableExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUserVariableExpression(DemoDBParser.UserVariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayConstructor}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayConstructor(DemoDBParser.ArrayConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayConstructor}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayConstructor(DemoDBParser.ArrayConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arraySlice}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterArraySlice(DemoDBParser.ArraySliceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arraySlice}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitArraySlice(DemoDBParser.ArraySliceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(DemoDBParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(DemoDBParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(DemoDBParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(DemoDBParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(DemoDBParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(DemoDBParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(DemoDBParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(DemoDBParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(DemoDBParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(DemoDBParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(DemoDBParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(DemoDBParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(DemoDBParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(DemoDBParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dateLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void enterDateLiteral(DemoDBParser.DateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dateLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void exitDateLiteral(DemoDBParser.DateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(DemoDBParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(DemoDBParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(DemoDBParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(DemoDBParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unitBoundaryLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnitBoundaryLiteral(DemoDBParser.UnitBoundaryLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unitBoundaryLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnitBoundaryLiteral(DemoDBParser.UnitBoundaryLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extract}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterExtract(DemoDBParser.ExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitExtract(DemoDBParser.ExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code groupingOperation}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterGroupingOperation(DemoDBParser.GroupingOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code groupingOperation}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitGroupingOperation(DemoDBParser.GroupingOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code informationFunction}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterInformationFunction(DemoDBParser.InformationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code informationFunction}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitInformationFunction(DemoDBParser.InformationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specialFunction}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterSpecialFunction(DemoDBParser.SpecialFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specialFunction}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitSpecialFunction(DemoDBParser.SpecialFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregationFunctionCall}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunctionCall(DemoDBParser.AggregationFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregationFunctionCall}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunctionCall(DemoDBParser.AggregationFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowFunctionCall}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterWindowFunctionCall(DemoDBParser.WindowFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowFunctionCall}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitWindowFunctionCall(DemoDBParser.WindowFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFunctionCall(DemoDBParser.SimpleFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFunctionCall(DemoDBParser.SimpleFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(DemoDBParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(DemoDBParser.AggregationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#userVariable}.
	 * @param ctx the parse tree
	 */
	void enterUserVariable(DemoDBParser.UserVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#userVariable}.
	 * @param ctx the parse tree
	 */
	void exitUserVariable(DemoDBParser.UserVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#systemVariable}.
	 * @param ctx the parse tree
	 */
	void enterSystemVariable(DemoDBParser.SystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#systemVariable}.
	 * @param ctx the parse tree
	 */
	void exitSystemVariable(DemoDBParser.SystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#columnReference}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(DemoDBParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#columnReference}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(DemoDBParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#informationFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void enterInformationFunctionExpression(DemoDBParser.InformationFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#informationFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void exitInformationFunctionExpression(DemoDBParser.InformationFunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#specialFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void enterSpecialFunctionExpression(DemoDBParser.SpecialFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#specialFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void exitSpecialFunctionExpression(DemoDBParser.SpecialFunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void enterWindowFunction(DemoDBParser.WindowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void exitWindowFunction(DemoDBParser.WindowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(DemoDBParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(DemoDBParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#over}.
	 * @param ctx the parse tree
	 */
	void enterOver(DemoDBParser.OverContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#over}.
	 * @param ctx the parse tree
	 */
	void exitOver(DemoDBParser.OverContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(DemoDBParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(DemoDBParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unboundedFrame}
	 * labeled alternative in {@link DemoDBParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterUnboundedFrame(DemoDBParser.UnboundedFrameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unboundedFrame}
	 * labeled alternative in {@link DemoDBParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitUnboundedFrame(DemoDBParser.UnboundedFrameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentRowBound}
	 * labeled alternative in {@link DemoDBParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterCurrentRowBound(DemoDBParser.CurrentRowBoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentRowBound}
	 * labeled alternative in {@link DemoDBParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitCurrentRowBound(DemoDBParser.CurrentRowBoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boundedFrame}
	 * labeled alternative in {@link DemoDBParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterBoundedFrame(DemoDBParser.BoundedFrameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boundedFrame}
	 * labeled alternative in {@link DemoDBParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitBoundedFrame(DemoDBParser.BoundedFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(DemoDBParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(DemoDBParser.NonReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(DemoDBParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(DemoDBParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#limitElement}.
	 * @param ctx the parse tree
	 */
	void enterLimitElement(DemoDBParser.LimitElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#limitElement}.
	 * @param ctx the parse tree
	 */
	void exitLimitElement(DemoDBParser.LimitElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(DemoDBParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(DemoDBParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#unitIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnitIdentifier(DemoDBParser.UnitIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#unitIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnitIdentifier(DemoDBParser.UnitIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#unitBoundary}.
	 * @param ctx the parse tree
	 */
	void enterUnitBoundary(DemoDBParser.UnitBoundaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#unitBoundary}.
	 * @param ctx the parse tree
	 */
	void exitUnitBoundary(DemoDBParser.UnitBoundaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalValue}
	 * labeled alternative in {@link DemoDBParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalValue(DemoDBParser.DecimalValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalValue}
	 * labeled alternative in {@link DemoDBParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalValue(DemoDBParser.DecimalValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleValue}
	 * labeled alternative in {@link DemoDBParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleValue(DemoDBParser.DoubleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleValue}
	 * labeled alternative in {@link DemoDBParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleValue(DemoDBParser.DoubleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerValue}
	 * labeled alternative in {@link DemoDBParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerValue(DemoDBParser.IntegerValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerValue}
	 * labeled alternative in {@link DemoDBParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerValue(DemoDBParser.IntegerValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(DemoDBParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(DemoDBParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DemoDBParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DemoDBParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(DemoDBParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(DemoDBParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(DemoDBParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(DemoDBParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#decimalType}.
	 * @param ctx the parse tree
	 */
	void enterDecimalType(DemoDBParser.DecimalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#decimalType}.
	 * @param ctx the parse tree
	 */
	void exitDecimalType(DemoDBParser.DecimalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoDBParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(DemoDBParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoDBParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(DemoDBParser.VarTypeContext ctx);
}