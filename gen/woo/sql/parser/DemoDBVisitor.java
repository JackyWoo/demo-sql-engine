// Generated from /Users/wujianchao5/project/jd/antlr-demo/src/main/java/woo/sql/parser/DemoDB.g4 by ANTLR 4.10.1
package woo.sql.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DemoDBParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DemoDBVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#sqlStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatements(DemoDBParser.SqlStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(DemoDBParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(DemoDBParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DemoDBParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#queryStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryStatment(DemoDBParser.QueryStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#queryRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryRelation(DemoDBParser.QueryRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryNoWith(DemoDBParser.QueryNoWithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryWithParentheses}
	 * labeled alternative in {@link DemoDBParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryWithParentheses(DemoDBParser.QueryWithParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link DemoDBParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperation(DemoDBParser.SetOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link DemoDBParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimaryDefault(DemoDBParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(DemoDBParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(DemoDBParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(DemoDBParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code from}
	 * labeled alternative in {@link DemoDBParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(DemoDBParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dual}
	 * labeled alternative in {@link DemoDBParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDual(DemoDBParser.DualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rollup}
	 * labeled alternative in {@link DemoDBParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollup(DemoDBParser.RollupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cube}
	 * labeled alternative in {@link DemoDBParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCube(DemoDBParser.CubeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleGroupingSets}
	 * labeled alternative in {@link DemoDBParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleGroupingSets(DemoDBParser.MultipleGroupingSetsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleGroupingSet}
	 * labeled alternative in {@link DemoDBParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleGroupingSet(DemoDBParser.SingleGroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#groupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSet(DemoDBParser.GroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link DemoDBParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSingle(DemoDBParser.SelectSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link DemoDBParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAll(DemoDBParser.SelectAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#relations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelations(DemoDBParser.RelationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(DemoDBParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableAtom}
	 * labeled alternative in {@link DemoDBParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAtom(DemoDBParser.TableAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTable}
	 * labeled alternative in {@link DemoDBParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTable(DemoDBParser.InlineTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryWithAlias}
	 * labeled alternative in {@link DemoDBParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryWithAlias(DemoDBParser.SubqueryWithAliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFunction}
	 * labeled alternative in {@link DemoDBParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFunction(DemoDBParser.TableFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedRelation}
	 * labeled alternative in {@link DemoDBParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedRelation(DemoDBParser.ParenthesizedRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#rowConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructor(DemoDBParser.RowConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#joinRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRelation(DemoDBParser.JoinRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#crossOrInnerJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossOrInnerJoinType(DemoDBParser.CrossOrInnerJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#outerAndSemiJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuterAndSemiJoinType(DemoDBParser.OuterAndSemiJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#bracketHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketHint(DemoDBParser.BracketHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#setVarHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVarHint(DemoDBParser.SetVarHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#hintMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHintMap(DemoDBParser.HintMapContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#joinCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCriteria(DemoDBParser.JoinCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#columnAliases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAliases(DemoDBParser.ColumnAliasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#partitionNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionNames(DemoDBParser.PartitionNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#tabletList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabletList(DemoDBParser.TabletListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#identifierOrString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierOrString(DemoDBParser.IdentifierOrStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(DemoDBParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionDefault}
	 * labeled alternative in {@link DemoDBParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionDefault(DemoDBParser.ExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link DemoDBParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(DemoDBParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link DemoDBParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(DemoDBParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(DemoDBParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link DemoDBParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(DemoDBParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code digitIdentifier}
	 * labeled alternative in {@link DemoDBParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitIdentifier(DemoDBParser.DigitIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code backQuotedIdentifier}
	 * labeled alternative in {@link DemoDBParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackQuotedIdentifier(DemoDBParser.BackQuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(DemoDBParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(DemoDBParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(DemoDBParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(DemoDBParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link DemoDBParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(DemoDBParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpressionDefault}
	 * labeled alternative in {@link DemoDBParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpressionDefault(DemoDBParser.BooleanExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isNull}
	 * labeled alternative in {@link DemoDBParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNull(DemoDBParser.IsNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scalarSubquery}
	 * labeled alternative in {@link DemoDBParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarSubquery(DemoDBParser.ScalarSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(DemoDBParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inList}
	 * labeled alternative in {@link DemoDBParser#predicateOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInList(DemoDBParser.InListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inSubquery}
	 * labeled alternative in {@link DemoDBParser#predicateOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInSubquery(DemoDBParser.InSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code between}
	 * labeled alternative in {@link DemoDBParser#predicateOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween(DemoDBParser.BetweenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code like}
	 * labeled alternative in {@link DemoDBParser#predicateOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike(DemoDBParser.LikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link DemoDBParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(DemoDBParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link DemoDBParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(DemoDBParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(DemoDBParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrowExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowExpression(DemoDBParser.ArrowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code odbcFunctionCallExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdbcFunctionCallExpression(DemoDBParser.OdbcFunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnRef}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnRef(DemoDBParser.ColumnRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code systemVariableExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemVariableExpression(DemoDBParser.SystemVariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code convert}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvert(DemoDBParser.ConvertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concat}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(DemoDBParser.ConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpression(DemoDBParser.SubqueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaFunctionExpr}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaFunctionExpr(DemoDBParser.LambdaFunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collectionSubscript}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionSubscript(DemoDBParser.CollectionSubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DemoDBParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(DemoDBParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collate}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollate(DemoDBParser.CollateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(DemoDBParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code userVariableExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserVariableExpression(DemoDBParser.UserVariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayConstructor}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayConstructor(DemoDBParser.ArrayConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arraySlice}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySlice(DemoDBParser.ArraySliceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(DemoDBParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(DemoDBParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCase(DemoDBParser.SearchedCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link DemoDBParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(DemoDBParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(DemoDBParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(DemoDBParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(DemoDBParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dateLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateLiteral(DemoDBParser.DateLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(DemoDBParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalLiteral(DemoDBParser.IntervalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unitBoundaryLiteral}
	 * labeled alternative in {@link DemoDBParser#literalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitBoundaryLiteral(DemoDBParser.UnitBoundaryLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract(DemoDBParser.ExtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupingOperation}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingOperation(DemoDBParser.GroupingOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code informationFunction}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInformationFunction(DemoDBParser.InformationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specialFunction}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialFunction(DemoDBParser.SpecialFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aggregationFunctionCall}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunctionCall(DemoDBParser.AggregationFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowFunctionCall}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFunctionCall(DemoDBParser.WindowFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link DemoDBParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFunctionCall(DemoDBParser.SimpleFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(DemoDBParser.AggregationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#userVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserVariable(DemoDBParser.UserVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#systemVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemVariable(DemoDBParser.SystemVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#columnReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(DemoDBParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#informationFunctionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInformationFunctionExpression(DemoDBParser.InformationFunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#specialFunctionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialFunctionExpression(DemoDBParser.SpecialFunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#windowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFunction(DemoDBParser.WindowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(DemoDBParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#over}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver(DemoDBParser.OverContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#windowFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrame(DemoDBParser.WindowFrameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unboundedFrame}
	 * labeled alternative in {@link DemoDBParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnboundedFrame(DemoDBParser.UnboundedFrameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentRowBound}
	 * labeled alternative in {@link DemoDBParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentRowBound(DemoDBParser.CurrentRowBoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boundedFrame}
	 * labeled alternative in {@link DemoDBParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundedFrame(DemoDBParser.BoundedFrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(DemoDBParser.NonReservedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#sortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItem(DemoDBParser.SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#limitElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitElement(DemoDBParser.LimitElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(DemoDBParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#unitIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitIdentifier(DemoDBParser.UnitIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#unitBoundary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitBoundary(DemoDBParser.UnitBoundaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalValue}
	 * labeled alternative in {@link DemoDBParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalValue(DemoDBParser.DecimalValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleValue}
	 * labeled alternative in {@link DemoDBParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleValue(DemoDBParser.DoubleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerValue}
	 * labeled alternative in {@link DemoDBParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerValue(DemoDBParser.IntegerValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(DemoDBParser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DemoDBParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(DemoDBParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(DemoDBParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#decimalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalType(DemoDBParser.DecimalTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoDBParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(DemoDBParser.VarTypeContext ctx);
}