package woo.sql.analyzer;

import woo.exec.Context;
import woo.metadata.MetaDataMgr;
import woo.sql.ast.JoinRelation;
import woo.sql.ast.QueryRelation;
import woo.sql.ast.QueryStatement;
import woo.sql.ast.Relation;
import woo.sql.ast.SelectRelation;
import woo.sql.ast.SubqueryRelation;
import woo.sql.ast.TableRelation;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wujianchao on 2023/1/10.
 */
public class QueryAnalyzer {

    private Context context;
    private MetaDataMgr metaDataMgr;

    public QueryAnalyzer(Context context) {
        this.context = context;
        this.metaDataMgr = MetaDataMgr.instance();
    }

    public Scope analyze(QueryStatement query) {
        return new Visitor().analyze(query);
    }

    class Visitor extends AstVisitor<Scope, Scope> {

        public Scope analyze(QueryStatement query) {
            return process(query, new Scope(RelationId.anonymous(), new RelationFields()));
        }

        protected Scope process(Node node, Scope scope) {
            return node.accept(this, scope);
        }

        @Override
        public Scope visitQueryRelation(QueryRelation node, Scope parent) {
            return super.visitQueryRelation(node, parent);
        }

        @Override
        public Scope visitSelectRelation(SelectRelation node, Scope parent) {
            AnalyzeState analyzeState = new AnalyzeState();
            //Record aliases at this level to prevent alias conflicts
            Set<TableName> aliasSet = new HashSet<>();
//            Relation resolvedRelation = resolveTableRef(selectRelation.getRelation(), scope, aliasSet);
//            if (resolvedRelation instanceof TableFunctionRelation) {
//                throw unsupportedException("Table function must be used with lateral join");
//            }
//            selectRelation.setRelation(resolvedRelation);
//            Scope sourceScope = process(resolvedRelation, scope);
//            sourceScope.setParent(scope);
//
//            SelectAnalyzer selectAnalyzer = new SelectAnalyzer(session);
//            selectAnalyzer.analyze(
//                    analyzeState,
//                    selectRelation.getSelectList(),
//                    selectRelation.getRelation(),
//                    sourceScope,
//                    selectRelation.getGroupByClause(),
//                    selectRelation.getHavingClause(),
//                    selectRelation.getWhereClause(),
//                    selectRelation.getOrderBy(),
//                    selectRelation.getLimit());
//
//            selectRelation.fillResolvedAST(analyzeState);
//            return analyzeState.getOutputScope();
            return null;
        }

        @Override
        public Scope visitTableRelation(TableRelation node, Scope parent) {
            return super.visitTableRelation(node, parent);
        }

        @Override
        public Scope visitJoinRelation(JoinRelation node, Scope parent) {
            return super.visitJoinRelation(node, parent);
        }

        @Override
        public Scope visitSubqueryRelation(SubqueryRelation node, Scope parent) {
            return super.visitSubqueryRelation(node, parent);
        }
    }

}
