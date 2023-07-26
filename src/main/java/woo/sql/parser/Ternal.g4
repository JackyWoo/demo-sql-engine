
grammar Ternal;
import TernalLex;

sqlStatements
    : singleStatement* EOF
    ;

singleStatement
    : statement SEMICOLON?
    ;

statement
    : queryStatement
    ;

queryStatement
    : queryRelation
    ;

queryRelation
    : selectRelation (ORDER BY sortItem (',' sortItem)*)? (limitElement)?
    ;

selectRelation
    : SELECT selectItem (',' selectItem)*
      FROM relation
      (WHERE where=expression)?
      (GROUP BY groupBy=expressionList)?
      (HAVING having=expression)?
    ;

selectItem
    : expression (AS? identifier)?                                                       #selectSingle
    | qualifiedName '.' ASTERISK_SYMBOL                                                  #selectAll
    | ASTERISK_SYMBOL                                                                    #selectAll
    ;

relation
    : relationPrimary joinRelation*
    ;

relationPrimary
    : qualifiedName (AS? alias=identifier)?                              #table
    | subquery (AS? alias=identifier)?                                   #subqueryWithAlias
    ;

subquery
    : queryRelation
    ;

joinRelation
    : joinType rightRelation=relationPrimary joinCriteria?
    ;

joinType
    : JOIN | INNER JOIN
    | CROSS | CROSS JOIN
    | LEFT JOIN | RIGHT JOIN | FULL JOIN
    | LEFT OUTER JOIN | RIGHT OUTER JOIN
    | FULL OUTER JOIN
    | LEFT SEMI JOIN | RIGHT SEMI JOIN
    | LEFT ANTI JOIN | RIGHT ANTI JOIN
    ;

joinCriteria
    : ON expression
    ;

identifier
    : LETTER_IDENTIFIER      #unquotedIdentifier
    | nonReserved            #unquotedIdentifier
    | DIGIT_IDENTIFIER       #digitIdentifier
    | BACKQUOTED_IDENTIFIER  #backQuotedIdentifier
    ;

string
    : SINGLE_QUOTED_TEXT
    | DOUBLE_QUOTED_TEXT
    ;

comparisonOperator
    : EQ | NEQ | LT | LTE | GT | GTE | EQ_FOR_NULL
    ;

booleanValue
    : TRUE | FALSE
    ;

qualifiedName
    : identifier ('.' identifier)*
    ;

expressionList
    :  expression (',' expression)*
    ;

expression
    : booleanExpression                                                                   #expressionDefault
    | NOT expression                                                                      #logicalNot
    | left=expression operator=(AND|LOGICAL_AND) right=expression                         #logicalBinary
    | left=expression operator=(OR|LOGICAL_OR) right=expression                           #logicalBinary
    ;

booleanExpression
    : predicate                                                                           #booleanExpressionDefault
    | booleanExpression IS NOT? NULL                                                      #isNull
    | left = booleanExpression comparisonOperator right = predicate                       #comparison
    ;

predicate
    : valueExpression (predicateOperations[$valueExpression.ctx])?
    ;

predicateOperations [ParserRuleContext value]
    : NOT? IN '(' expressionList ')'                                                      #inList
    | NOT? IN '(' queryRelation ')'                                                       #inSubquery
    ;

valueExpression
    : primaryExpression                                                                   #valueExpressionDefault
    | left = valueExpression operator = (
              ASTERISK_SYMBOL
            | SLASH_SYMBOL)
      right = valueExpression                                                             #arithmeticBinary
    | left = valueExpression operator = (
              PLUS_SYMBOL
            | MINUS_SYMBOL)
      right = valueExpression                                                             #arithmeticBinary
    ;

primaryExpression
    : functionCall                                                                        #functionCallExpression
    | literalExpression                                                                   #literal
    | columnReference                                                                     #columnRef
    | '(' expression ')'                                                                  #parenthesizedExpression
    | EXISTS '(' queryRelation ')'                                                        #exists
    | subquery                                                                            #subqueryExpression
    | CAST '(' expression AS type ')'                                                     #cast
    ;

literalExpression
    : NULL                                                                                #nullLiteral
    | booleanValue                                                                        #booleanLiteral
    | number                                                                              #numericLiteral
    | (DATE | DATETIME) string                                                            #dateLiteral
    | string                                                                              #stringLiteral
    ;

functionCall
    : aggregationFunction                                                                 #aggregationFunctionCall
    | qualifiedName '(' (expression (',' expression)*)? ')'                               #simpleFunctionCall
    ;

aggregationFunction
    : AVG '(' DISTINCT? expression ')'
    | COUNT '(' ASTERISK_SYMBOL? ')'
    | COUNT '(' DISTINCT? (expression (',' expression)*)? ')'
    | MAX '(' DISTINCT? expression ')'
    | MIN '(' DISTINCT? expression ')'
    | SUM '(' DISTINCT? expression ')'
    ;

columnReference
    : identifier
    | qualifiedName
    ;

nonReserved
    : AFTER | AGGREGATE | ASYNC | AUTHORS | AVG | ADMIN
    | BACKEND | BACKENDS | BACKUP | BEGIN | BITMAP_UNION | BOOLEAN | BROKER | BUCKETS | BUILTIN
    | CAST | CATALOG | CATALOGS | CEIL | CHAIN | CHARSET | CURRENT | COLLATION | COLUMNS | COMMENT | COMMIT | COMMITTED
    | COMPUTE | CONNECTION | CONNECTION_ID | CONSISTENT | COSTS | COUNT | CONFIG
    | DATA | DATE | DATETIME | DAY | DECOMMISSION | DISTRIBUTION | DUPLICATE | DYNAMIC
    | END | ENGINE | ENGINES | ERRORS | EVENTS | EXECUTE | EXTERNAL | EXTRACT | EVERY
    | FILE | FILTER | FIRST | FLOOR | FOLLOWING | FORMAT | FN | FRONTEND | FRONTENDS | FOLLOWER | FREE | FUNCTIONS
    | GLOBAL | GRANTS
    | HASH | HISTOGRAM | HELP | HLL_UNION | HOUR | HUB
    | IDENTIFIED | IMPERSONATE | INDEXES | INSTALL | INTERMEDIATE | INTERVAL | ISOLATION
    | JOB
    | LABEL | LAST | LESS | LEVEL | LIST | LOCAL | LOGICAL
    | MANUAL | MATERIALIZED | MAX | META | MIN | MINUTE | MODE | MODIFY | MONTH | MERGE
    | NAME | NAMES | NEGATIVE | NO | NODE | NULLS
    | OBSERVER | OFFSET | ONLY | OPEN | OPTION | OVERWRITE
    | PARTITIONS | PASSWORD | PATH | PAUSE | PERCENTILE_UNION | PLUGIN | PLUGINS | PRECEDING | PROC | PROCESSLIST
    | PROPERTIES | PROPERTY
    | QUARTER | QUERY | QUOTA
    | RANDOM | RECOVER | REFRESH | REPAIR | REPEATABLE | REPLACE_IF_NOT_NULL | REPLICA | REPOSITORY | REPOSITORIES
    | RESOURCE | RESOURCES | RESTORE | RESUME | RETURNS | REVERT | ROLE | ROLES | ROLLUP | ROLLBACK | ROUTINE
    | SAMPLE | SECOND | SERIALIZABLE | SESSION | SETS | SIGNED | SNAPSHOT | SQLBLACKLIST | START | SUM | STATUS | STOP
    | STORAGE| STRING | STATS | SUBMIT | SYNC
    | TABLES | TABLET | TASK | TEMPORARY | TIMESTAMP | TIMESTAMPADD | TIMESTAMPDIFF | THAN | TIME | TRANSACTION
    | TRIGGERS | TRUNCATE | TYPE | TYPES
    | UNBOUNDED | UNCOMMITTED | UNINSTALL | USER
    | VALUE | VARIABLES | VIEW | VERBOSE
    | WARNINGS | WEEK | WHITELIST | WORK | WRITE
    | YEAR
    | DOTDOTDOT
    ;

sortItem
    : expression ordering = (ASC | DESC)? (NULLS nullOrdering=(FIRST | LAST))?
    ;

limitElement
    : LIMIT limit =INTEGER_VALUE (OFFSET offset=INTEGER_VALUE)?
    ;

number
    : DOUBLE_VALUE   #doubleValue
    | INTEGER_VALUE  #integerValue
    ;

type
    : BOOLEAN
    | TINYINT
    | UNSIGNED TINYINT
    | SMALLINT
    | UNSIGNED SMALLINT
    | INT
    | UNSIGNED INT
    | BIGINT
    | FLOAT
    | DOUBLE
    | DATE
    | DATETIME
    | TIME
    | CHAR
    | STRING
    ;
