// Copyright 2021-present StarRocks, Inc. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package woo.sql.analyzer;


import woo.sql.ast.Expr;
import woo.sql.ast.ExprList;
import woo.sql.ast.FunctionCall;
import woo.sql.ast.LimitElement;
import woo.sql.ast.Relation;
import woo.sql.ast.SelectList;
import woo.sql.ast.SelectRelation;
import woo.sql.ast.SortItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnalyzeState {
    private SelectList selectList;
    /**
     * Relations referenced in From clause. The Relation can be a CTE/table
     * reference a subquery or two relation joined together.
     */
    private Relation relation;
    /**
     * Output field expr such in `as k + 1 as col1` col1 is the output field.
     */
    private List<Expr> outputExpr;

    private Expr predicate;
    private ExprList groupBy;
    private Expr having;

    public AnalyzeState() {
    }

    public SelectList getSelectList() {
        return selectList;
    }

    public void setSelectList(SelectList selectList) {
        this.selectList = selectList;
    }

    public Relation getRelation() {
        return relation;
    }

    public void setRelation(Relation relation) {
        this.relation = relation;
    }

    public List<Expr> getOutputExpr() {
        return outputExpr;
    }

    public void setOutputExpr(List<Expr> outputExpr) {
        this.outputExpr = outputExpr;
    }

    public Expr getPredicate() {
        return predicate;
    }

    public void setPredicate(Expr predicate) {
        this.predicate = predicate;
    }

    public ExprList getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(ExprList groupBy) {
        this.groupBy = groupBy;
    }

    public Expr getHaving() {
        return having;
    }

    public void setHaving(Expr having) {
        this.having = having;
    }
}
