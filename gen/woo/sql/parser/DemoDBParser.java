// Generated from /Users/wujianchao5/project/jd/antlr-demo/src/main/java/woo/sql/parser/DemoDB.g4 by ANTLR 4.10.1
package woo.sql.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoDBParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ADD=12, ADMIN=13, AFTER=14, AGGREGATE=15, ALL=16, ALTER=17, 
		ANALYZE=18, AND=19, ANTI=20, ARRAY=21, AS=22, ASC=23, ASYNC=24, AUTHORS=25, 
		AUTHENTICATION=26, AVG=27, BACKEND=28, BACKENDS=29, BACKUP=30, BEGIN=31, 
		BETWEEN=32, BIGINT=33, BITMAP=34, BITMAP_UNION=35, BOOLEAN=36, BOTH=37, 
		BROKER=38, BUCKETS=39, BUILTIN=40, BY=41, CANCEL=42, CASE=43, CAST=44, 
		CATALOG=45, CATALOGS=46, CEIL=47, CHAIN=48, CHAR=49, CHARSET=50, CHECK=51, 
		COLLATE=52, COLLATION=53, COLUMN=54, COLUMNS=55, COMMENT=56, COMMIT=57, 
		COMMITTED=58, COMPUTE=59, CONFIG=60, CONNECTION=61, CONNECTION_ID=62, 
		CONSISTENT=63, CONVERT=64, COSTS=65, COUNT=66, CREATE=67, CROSS=68, CUBE=69, 
		CURRENT=70, CURRENT_TIMESTAMP=71, CURRENT_USER=72, DATA=73, DATABASE=74, 
		DATABASES=75, DATE=76, DATETIME=77, DAY=78, DECIMAL=79, DECIMALV2=80, 
		DECIMAL32=81, DECIMAL64=82, DECIMAL128=83, DECOMMISSION=84, DEFAULT=85, 
		DELETE=86, DENSE_RANK=87, NTILE=88, DESC=89, DESCRIBE=90, DISTINCT=91, 
		DISTRIBUTED=92, DISTRIBUTION=93, DOUBLE=94, DROP=95, DUAL=96, DUPLICATE=97, 
		DYNAMIC=98, ELSE=99, END=100, ENGINE=101, ENGINES=102, ERRORS=103, EVENTS=104, 
		EXCEPT=105, EXECUTE=106, EXISTS=107, EXPLAIN=108, EXPORT=109, EXTERNAL=110, 
		EXTRACT=111, EVERY=112, FALSE=113, FILE=114, FILTER=115, FIRST=116, FIRST_VALUE=117, 
		FLOAT=118, FLOOR=119, FN=120, FOLLOWING=121, FOLLOWER=122, FOR=123, FORCE=124, 
		FORMAT=125, FREE=126, FROM=127, FRONTEND=128, FRONTENDS=129, FULL=130, 
		FUNCTION=131, FUNCTIONS=132, GLOBAL=133, GRANT=134, GRANTS=135, GROUP=136, 
		GROUPS=137, GROUPING=138, GROUPING_ID=139, HASH=140, HAVING=141, HELP=142, 
		HISTOGRAM=143, HLL=144, HLL_UNION=145, HOST=146, HOUR=147, HUB=148, IDENTIFIED=149, 
		IF=150, IMPERSONATE=151, IGNORE=152, IN=153, INDEX=154, INDEXES=155, INFILE=156, 
		INSTALL=157, INNER=158, INSERT=159, INT=160, INCREMENTAL=161, INTEGER=162, 
		INTERMEDIATE=163, INTERSECT=164, INTERVAL=165, INTO=166, OVERWRITE=167, 
		IS=168, ISOLATION=169, JOB=170, JOIN=171, JSON=172, KEY=173, KEYS=174, 
		KILL=175, LABEL=176, LAG=177, LARGEINT=178, LAST=179, LAST_VALUE=180, 
		LATERAL=181, LEAD=182, LEFT=183, LESS=184, LEVEL=185, LIKE=186, LIMIT=187, 
		LIST=188, LOAD=189, LOCAL=190, LOCATION=191, LOGICAL=192, MANUAL=193, 
		MATERIALIZED=194, MAX=195, MAXVALUE=196, MERGE=197, MIN=198, MINUTE=199, 
		MINUS=200, META=201, MOD=202, MODE=203, MODIFY=204, MONTH=205, NAME=206, 
		NAMES=207, NEGATIVE=208, NO=209, NODE=210, NODES=211, NOT=212, NULL=213, 
		NULLS=214, OBSERVER=215, OFFSET=216, ON=217, ONLY=218, OPEN=219, OPTIMIZER=220, 
		OPTION=221, OR=222, ORDER=223, OUTER=224, OUTFILE=225, OVER=226, PARTITION=227, 
		PARTITIONS=228, PASSWORD=229, PATH=230, PAUSE=231, PERCENTILE=232, PERCENTILE_UNION=233, 
		PLUGIN=234, PLUGINS=235, PRECEDING=236, PRIMARY=237, PROC=238, PROCEDURE=239, 
		PROCESSLIST=240, PROPERTIES=241, PROPERTY=242, QUARTER=243, QUERY=244, 
		QUOTA=245, RANDOM=246, RANGE=247, RANK=248, READ=249, RECOVER=250, REFRESH=251, 
		REGEXP=252, RELEASE=253, RENAME=254, REPAIR=255, REPEATABLE=256, REPLACE=257, 
		REPLACE_IF_NOT_NULL=258, REPLICA=259, REPOSITORY=260, REPOSITORIES=261, 
		RESOURCE=262, RESOURCES=263, RESTORE=264, RESUME=265, RETURNS=266, REVOKE=267, 
		REVERT=268, RIGHT=269, RLIKE=270, ROLE=271, ROLES=272, ROLLBACK=273, ROLLUP=274, 
		ROUTINE=275, ROW=276, ROWS=277, ROW_NUMBER=278, SAMPLE=279, SCHEMA=280, 
		SCHEMAS=281, SECOND=282, SELECT=283, SEMI=284, SERIALIZABLE=285, SESSION=286, 
		SET=287, SETS=288, SET_VAR=289, SIGNED=290, SHOW=291, SMALLINT=292, SNAPSHOT=293, 
		SQLBLACKLIST=294, START=295, STATS=296, STATUS=297, STOP=298, STORAGE=299, 
		STRING=300, SUBMIT=301, SUM=302, SYNC=303, SYSTEM=304, SWAP=305, TABLE=306, 
		TABLES=307, TABLET=308, TASK=309, TEMPORARY=310, TERMINATED=311, THAN=312, 
		THEN=313, TIME=314, TIMESTAMP=315, TIMESTAMPADD=316, TIMESTAMPDIFF=317, 
		TINYINT=318, TRANSACTION=319, TO=320, TRACE=321, TRIGGERS=322, TRUE=323, 
		TRUNCATE=324, TYPE=325, TYPES=326, UNBOUNDED=327, UNCOMMITTED=328, UNION=329, 
		UNIQUE=330, UNINSTALL=331, UNSIGNED=332, UPDATE=333, USE=334, USER=335, 
		USING=336, VALUE=337, VALUES=338, VARCHAR=339, VARIABLES=340, VERBOSE=341, 
		VIEW=342, WARNINGS=343, WEEK=344, WHEN=345, WHERE=346, WHITELIST=347, 
		WITH=348, WORK=349, WRITE=350, YEAR=351, EQ=352, NEQ=353, LT=354, LTE=355, 
		GT=356, GTE=357, EQ_FOR_NULL=358, PLUS_SYMBOL=359, MINUS_SYMBOL=360, ASTERISK_SYMBOL=361, 
		SLASH_SYMBOL=362, PERCENT_SYMBOL=363, LOGICAL_OR=364, LOGICAL_AND=365, 
		LOGICAL_NOT=366, INT_DIV=367, BITAND=368, BITOR=369, BITXOR=370, BITNOT=371, 
		ARROW=372, AT=373, INTEGER_VALUE=374, DECIMAL_VALUE=375, DOUBLE_VALUE=376, 
		SINGLE_QUOTED_TEXT=377, DOUBLE_QUOTED_TEXT=378, LETTER_IDENTIFIER=379, 
		DIGIT_IDENTIFIER=380, QUOTED_IDENTIFIER=381, BACKQUOTED_IDENTIFIER=382, 
		SIMPLE_COMMENT=383, BRACKETED_COMMENT=384, SEMICOLON=385, DOTDOTDOT=386, 
		WS=387, CONCAT=388;
	public static final int
		RULE_sqlStatements = 0, RULE_singleStatement = 1, RULE_emptyStatement = 2, 
		RULE_statement = 3, RULE_queryStatment = 4, RULE_queryRelation = 5, RULE_queryNoWith = 6, 
		RULE_queryPrimary = 7, RULE_subquery = 8, RULE_setQuantifier = 9, RULE_querySpecification = 10, 
		RULE_fromClause = 11, RULE_groupingElement = 12, RULE_groupingSet = 13, 
		RULE_selectItem = 14, RULE_relations = 15, RULE_relation = 16, RULE_relationPrimary = 17, 
		RULE_rowConstructor = 18, RULE_joinRelation = 19, RULE_crossOrInnerJoinType = 20, 
		RULE_outerAndSemiJoinType = 21, RULE_bracketHint = 22, RULE_setVarHint = 23, 
		RULE_hintMap = 24, RULE_joinCriteria = 25, RULE_columnAliases = 26, RULE_partitionNames = 27, 
		RULE_tabletList = 28, RULE_identifierOrString = 29, RULE_expressionList = 30, 
		RULE_expression = 31, RULE_identifierList = 32, RULE_identifier = 33, 
		RULE_string = 34, RULE_comparisonOperator = 35, RULE_booleanValue = 36, 
		RULE_qualifiedName = 37, RULE_booleanExpression = 38, RULE_predicate = 39, 
		RULE_predicateOperations = 40, RULE_valueExpression = 41, RULE_primaryExpression = 42, 
		RULE_literalExpression = 43, RULE_functionCall = 44, RULE_aggregationFunction = 45, 
		RULE_userVariable = 46, RULE_systemVariable = 47, RULE_columnReference = 48, 
		RULE_informationFunctionExpression = 49, RULE_specialFunctionExpression = 50, 
		RULE_windowFunction = 51, RULE_whenClause = 52, RULE_over = 53, RULE_windowFrame = 54, 
		RULE_frameBound = 55, RULE_nonReserved = 56, RULE_sortItem = 57, RULE_limitElement = 58, 
		RULE_interval = 59, RULE_unitIdentifier = 60, RULE_unitBoundary = 61, 
		RULE_number = 62, RULE_baseType = 63, RULE_type = 64, RULE_arrayType = 65, 
		RULE_typeParameter = 66, RULE_decimalType = 67, RULE_varType = 68;
	private static String[] makeRuleNames() {
		return new String[] {
			"sqlStatements", "singleStatement", "emptyStatement", "statement", "queryStatment", 
			"queryRelation", "queryNoWith", "queryPrimary", "subquery", "setQuantifier", 
			"querySpecification", "fromClause", "groupingElement", "groupingSet", 
			"selectItem", "relations", "relation", "relationPrimary", "rowConstructor", 
			"joinRelation", "crossOrInnerJoinType", "outerAndSemiJoinType", "bracketHint", 
			"setVarHint", "hintMap", "joinCriteria", "columnAliases", "partitionNames", 
			"tabletList", "identifierOrString", "expressionList", "expression", "identifierList", 
			"identifier", "string", "comparisonOperator", "booleanValue", "qualifiedName", 
			"booleanExpression", "predicate", "predicateOperations", "valueExpression", 
			"primaryExpression", "literalExpression", "functionCall", "aggregationFunction", 
			"userVariable", "systemVariable", "columnReference", "informationFunctionExpression", 
			"specialFunctionExpression", "windowFunction", "whenClause", "over", 
			"windowFrame", "frameBound", "nonReserved", "sortItem", "limitElement", 
			"interval", "unitIdentifier", "unitBoundary", "number", "baseType", "type", 
			"arrayType", "typeParameter", "decimalType", "varType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'.'", "'['", "']'", "'/*+'", "'*/'", "'{'", 
			"'}'", "':'", "'ADD'", "'ADMIN'", "'AFTER'", "'AGGREGATE'", "'ALL'", 
			"'ALTER'", "'ANALYZE'", "'AND'", "'ANTI'", "'ARRAY'", "'AS'", "'ASC'", 
			"'ASYNC'", "'AUTHORS'", "'AUTHENTICATION'", "'AVG'", "'BACKEND'", "'BACKENDS'", 
			"'BACKUP'", "'BEGIN'", "'BETWEEN'", "'BIGINT'", "'BITMAP'", "'BITMAP_UNION'", 
			"'BOOLEAN'", "'BOTH'", "'BROKER'", "'BUCKETS'", "'BUILTIN'", "'BY'", 
			"'CANCEL'", "'CASE'", "'CAST'", "'CATALOG'", "'CATALOGS'", "'CEIL'", 
			"'CHAIN'", "'CHAR'", "'CHARSET'", "'CHECK'", "'COLLATE'", "'COLLATION'", 
			"'COLUMN'", "'COLUMNS'", "'COMMENT'", "'COMMIT'", "'COMMITTED'", "'COMPUTE'", 
			"'CONFIG'", "'CONNECTION'", "'CONNECTION_ID'", "'CONSISTENT'", "'CONVERT'", 
			"'COSTS'", "'COUNT'", "'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", "'CURRENT_TIMESTAMP'", 
			"'CURRENT_USER'", "'DATA'", "'DATABASE'", "'DATABASES'", "'DATE'", "'DATETIME'", 
			"'DAY'", "'DECIMAL'", "'DECIMALV2'", "'DECIMAL32'", "'DECIMAL64'", "'DECIMAL128'", 
			"'DECOMMISSION'", "'DEFAULT'", "'DELETE'", "'DENSE_RANK'", "'NTILE'", 
			"'DESC'", "'DESCRIBE'", "'DISTINCT'", "'DISTRIBUTED'", "'DISTRIBUTION'", 
			"'DOUBLE'", "'DROP'", "'DUAL'", "'DUPLICATE'", "'DYNAMIC'", "'ELSE'", 
			"'END'", "'ENGINE'", "'ENGINES'", "'ERRORS'", "'EVENTS'", "'EXCEPT'", 
			"'EXECUTE'", "'EXISTS'", "'EXPLAIN'", "'EXPORT'", "'EXTERNAL'", "'EXTRACT'", 
			"'EVERY'", "'FALSE'", "'FILE'", "'FILTER'", "'FIRST'", "'FIRST_VALUE'", 
			"'FLOAT'", "'FLOOR'", "'FN'", "'FOLLOWING'", "'FOLLOWER'", "'FOR'", "'FORCE'", 
			"'FORMAT'", "'FREE'", "'FROM'", "'FRONTEND'", "'FRONTENDS'", "'FULL'", 
			"'FUNCTION'", "'FUNCTIONS'", "'GLOBAL'", "'GRANT'", "'GRANTS'", "'GROUP'", 
			"'GROUPS'", "'GROUPING'", "'GROUPING_ID'", "'HASH'", "'HAVING'", "'HELP'", 
			"'HISTOGRAM'", "'HLL'", "'HLL_UNION'", "'HOST'", "'HOUR'", "'HUB'", "'IDENTIFIED'", 
			"'IF'", "'IMPERSONATE'", "'IGNORE'", "'IN'", "'INDEX'", "'INDEXES'", 
			"'INFILE'", "'INSTALL'", "'INNER'", "'INSERT'", "'INT'", "'INCREMENTAL'", 
			"'INTEGER'", "'INTERMEDIATE'", "'INTERSECT'", "'INTERVAL'", "'INTO'", 
			"'OVERWRITE'", "'IS'", "'ISOLATION'", "'JOB'", "'JOIN'", "'JSON'", "'KEY'", 
			"'KEYS'", "'KILL'", "'LABEL'", "'LAG'", "'LARGEINT'", "'LAST'", "'LAST_VALUE'", 
			"'LATERAL'", "'LEAD'", "'LEFT'", "'LESS'", "'LEVEL'", "'LIKE'", "'LIMIT'", 
			"'LIST'", "'LOAD'", "'LOCAL'", "'LOCATION'", "'LOGICAL'", "'MANUAL'", 
			"'MATERIALIZED'", "'MAX'", "'MAXVALUE'", "'MERGE'", "'MIN'", "'MINUTE'", 
			"'MINUS'", "'META'", "'MOD'", "'MODE'", "'MODIFY'", "'MONTH'", "'NAME'", 
			"'NAMES'", "'NEGATIVE'", "'NO'", "'NODE'", "'NODES'", "'NOT'", "'NULL'", 
			"'NULLS'", "'OBSERVER'", "'OFFSET'", "'ON'", "'ONLY'", "'OPEN'", "'OPTIMIZER'", 
			"'OPTION'", "'OR'", "'ORDER'", "'OUTER'", "'OUTFILE'", "'OVER'", "'PARTITION'", 
			"'PARTITIONS'", "'PASSWORD'", "'PATH'", "'PAUSE'", "'PERCENTILE'", "'PERCENTILE_UNION'", 
			"'PLUGIN'", "'PLUGINS'", "'PRECEDING'", "'PRIMARY'", "'PROC'", "'PROCEDURE'", 
			"'PROCESSLIST'", "'PROPERTIES'", "'PROPERTY'", "'QUARTER'", "'QUERY'", 
			"'QUOTA'", "'RANDOM'", "'RANGE'", "'RANK'", "'READ'", "'RECOVER'", "'REFRESH'", 
			"'REGEXP'", "'RELEASE'", "'RENAME'", "'REPAIR'", "'REPEATABLE'", "'REPLACE'", 
			"'REPLACE_IF_NOT_NULL'", "'REPLICA'", "'REPOSITORY'", "'REPOSITORIES'", 
			"'RESOURCE'", "'RESOURCES'", "'RESTORE'", "'RESUME'", "'RETURNS'", "'REVOKE'", 
			"'REVERT'", "'RIGHT'", "'RLIKE'", "'ROLE'", "'ROLES'", "'ROLLBACK'", 
			"'ROLLUP'", "'ROUTINE'", "'ROW'", "'ROWS'", "'ROW_NUMBER'", "'SAMPLE'", 
			"'SCHEMA'", "'SCHEMAS'", "'SECOND'", "'SELECT'", "'SEMI'", "'SERIALIZABLE'", 
			"'SESSION'", "'SET'", "'SETS'", "'SET_VAR'", "'SIGNED'", "'SHOW'", "'SMALLINT'", 
			"'SNAPSHOT'", "'SQLBLACKLIST'", "'START'", "'STATS'", "'STATUS'", "'STOP'", 
			"'STORAGE'", "'STRING'", "'SUBMIT'", "'SUM'", "'SYNC'", "'SYSTEM'", "'SWAP'", 
			"'TABLE'", "'TABLES'", "'TABLET'", "'TASK'", "'TEMPORARY'", "'TERMINATED'", 
			"'THAN'", "'THEN'", "'TIME'", "'TIMESTAMP'", "'TIMESTAMPADD'", "'TIMESTAMPDIFF'", 
			"'TINYINT'", "'TRANSACTION'", "'TO'", "'TRACE'", "'TRIGGERS'", "'TRUE'", 
			"'TRUNCATE'", "'TYPE'", "'TYPES'", "'UNBOUNDED'", "'UNCOMMITTED'", "'UNION'", 
			"'UNIQUE'", "'UNINSTALL'", "'UNSIGNED'", "'UPDATE'", "'USE'", "'USER'", 
			"'USING'", "'VALUE'", "'VALUES'", "'VARCHAR'", "'VARIABLES'", "'VERBOSE'", 
			"'VIEW'", "'WARNINGS'", "'WEEK'", "'WHEN'", "'WHERE'", "'WHITELIST'", 
			"'WITH'", "'WORK'", "'WRITE'", "'YEAR'", "'='", null, "'<'", "'<='", 
			"'>'", "'>='", "'<=>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'||'", "'&&'", 
			"'!'", "'DIV'", "'&'", "'|'", "'^'", "'~'", "'->'", "'@'", null, null, 
			null, null, null, null, null, null, null, null, null, "';'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ADD", "ADMIN", "AFTER", "AGGREGATE", "ALL", "ALTER", "ANALYZE", "AND", 
			"ANTI", "ARRAY", "AS", "ASC", "ASYNC", "AUTHORS", "AUTHENTICATION", "AVG", 
			"BACKEND", "BACKENDS", "BACKUP", "BEGIN", "BETWEEN", "BIGINT", "BITMAP", 
			"BITMAP_UNION", "BOOLEAN", "BOTH", "BROKER", "BUCKETS", "BUILTIN", "BY", 
			"CANCEL", "CASE", "CAST", "CATALOG", "CATALOGS", "CEIL", "CHAIN", "CHAR", 
			"CHARSET", "CHECK", "COLLATE", "COLLATION", "COLUMN", "COLUMNS", "COMMENT", 
			"COMMIT", "COMMITTED", "COMPUTE", "CONFIG", "CONNECTION", "CONNECTION_ID", 
			"CONSISTENT", "CONVERT", "COSTS", "COUNT", "CREATE", "CROSS", "CUBE", 
			"CURRENT", "CURRENT_TIMESTAMP", "CURRENT_USER", "DATA", "DATABASE", "DATABASES", 
			"DATE", "DATETIME", "DAY", "DECIMAL", "DECIMALV2", "DECIMAL32", "DECIMAL64", 
			"DECIMAL128", "DECOMMISSION", "DEFAULT", "DELETE", "DENSE_RANK", "NTILE", 
			"DESC", "DESCRIBE", "DISTINCT", "DISTRIBUTED", "DISTRIBUTION", "DOUBLE", 
			"DROP", "DUAL", "DUPLICATE", "DYNAMIC", "ELSE", "END", "ENGINE", "ENGINES", 
			"ERRORS", "EVENTS", "EXCEPT", "EXECUTE", "EXISTS", "EXPLAIN", "EXPORT", 
			"EXTERNAL", "EXTRACT", "EVERY", "FALSE", "FILE", "FILTER", "FIRST", "FIRST_VALUE", 
			"FLOAT", "FLOOR", "FN", "FOLLOWING", "FOLLOWER", "FOR", "FORCE", "FORMAT", 
			"FREE", "FROM", "FRONTEND", "FRONTENDS", "FULL", "FUNCTION", "FUNCTIONS", 
			"GLOBAL", "GRANT", "GRANTS", "GROUP", "GROUPS", "GROUPING", "GROUPING_ID", 
			"HASH", "HAVING", "HELP", "HISTOGRAM", "HLL", "HLL_UNION", "HOST", "HOUR", 
			"HUB", "IDENTIFIED", "IF", "IMPERSONATE", "IGNORE", "IN", "INDEX", "INDEXES", 
			"INFILE", "INSTALL", "INNER", "INSERT", "INT", "INCREMENTAL", "INTEGER", 
			"INTERMEDIATE", "INTERSECT", "INTERVAL", "INTO", "OVERWRITE", "IS", "ISOLATION", 
			"JOB", "JOIN", "JSON", "KEY", "KEYS", "KILL", "LABEL", "LAG", "LARGEINT", 
			"LAST", "LAST_VALUE", "LATERAL", "LEAD", "LEFT", "LESS", "LEVEL", "LIKE", 
			"LIMIT", "LIST", "LOAD", "LOCAL", "LOCATION", "LOGICAL", "MANUAL", "MATERIALIZED", 
			"MAX", "MAXVALUE", "MERGE", "MIN", "MINUTE", "MINUS", "META", "MOD", 
			"MODE", "MODIFY", "MONTH", "NAME", "NAMES", "NEGATIVE", "NO", "NODE", 
			"NODES", "NOT", "NULL", "NULLS", "OBSERVER", "OFFSET", "ON", "ONLY", 
			"OPEN", "OPTIMIZER", "OPTION", "OR", "ORDER", "OUTER", "OUTFILE", "OVER", 
			"PARTITION", "PARTITIONS", "PASSWORD", "PATH", "PAUSE", "PERCENTILE", 
			"PERCENTILE_UNION", "PLUGIN", "PLUGINS", "PRECEDING", "PRIMARY", "PROC", 
			"PROCEDURE", "PROCESSLIST", "PROPERTIES", "PROPERTY", "QUARTER", "QUERY", 
			"QUOTA", "RANDOM", "RANGE", "RANK", "READ", "RECOVER", "REFRESH", "REGEXP", 
			"RELEASE", "RENAME", "REPAIR", "REPEATABLE", "REPLACE", "REPLACE_IF_NOT_NULL", 
			"REPLICA", "REPOSITORY", "REPOSITORIES", "RESOURCE", "RESOURCES", "RESTORE", 
			"RESUME", "RETURNS", "REVOKE", "REVERT", "RIGHT", "RLIKE", "ROLE", "ROLES", 
			"ROLLBACK", "ROLLUP", "ROUTINE", "ROW", "ROWS", "ROW_NUMBER", "SAMPLE", 
			"SCHEMA", "SCHEMAS", "SECOND", "SELECT", "SEMI", "SERIALIZABLE", "SESSION", 
			"SET", "SETS", "SET_VAR", "SIGNED", "SHOW", "SMALLINT", "SNAPSHOT", "SQLBLACKLIST", 
			"START", "STATS", "STATUS", "STOP", "STORAGE", "STRING", "SUBMIT", "SUM", 
			"SYNC", "SYSTEM", "SWAP", "TABLE", "TABLES", "TABLET", "TASK", "TEMPORARY", 
			"TERMINATED", "THAN", "THEN", "TIME", "TIMESTAMP", "TIMESTAMPADD", "TIMESTAMPDIFF", 
			"TINYINT", "TRANSACTION", "TO", "TRACE", "TRIGGERS", "TRUE", "TRUNCATE", 
			"TYPE", "TYPES", "UNBOUNDED", "UNCOMMITTED", "UNION", "UNIQUE", "UNINSTALL", 
			"UNSIGNED", "UPDATE", "USE", "USER", "USING", "VALUE", "VALUES", "VARCHAR", 
			"VARIABLES", "VERBOSE", "VIEW", "WARNINGS", "WEEK", "WHEN", "WHERE", 
			"WHITELIST", "WITH", "WORK", "WRITE", "YEAR", "EQ", "NEQ", "LT", "LTE", 
			"GT", "GTE", "EQ_FOR_NULL", "PLUS_SYMBOL", "MINUS_SYMBOL", "ASTERISK_SYMBOL", 
			"SLASH_SYMBOL", "PERCENT_SYMBOL", "LOGICAL_OR", "LOGICAL_AND", "LOGICAL_NOT", 
			"INT_DIV", "BITAND", "BITOR", "BITXOR", "BITNOT", "ARROW", "AT", "INTEGER_VALUE", 
			"DECIMAL_VALUE", "DOUBLE_VALUE", "SINGLE_QUOTED_TEXT", "DOUBLE_QUOTED_TEXT", 
			"LETTER_IDENTIFIER", "DIGIT_IDENTIFIER", "QUOTED_IDENTIFIER", "BACKQUOTED_IDENTIFIER", 
			"SIMPLE_COMMENT", "BRACKETED_COMMENT", "SEMICOLON", "DOTDOTDOT", "WS", 
			"CONCAT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DemoDB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public static long sqlMode;
	public DemoDBParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SqlStatementsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DemoDBParser.EOF, 0); }
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
		}
		public SqlStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterSqlStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitSqlStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitSqlStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlStatementsContext sqlStatements() throws RecognitionException {
		SqlStatementsContext _localctx = new SqlStatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sqlStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==SELECT || _la==SEMICOLON) {
				{
				{
				setState(138);
				singleStatement();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DemoDBParser.SEMICOLON, 0); }
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleStatement);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				statement();
				setState(148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(147);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				emptyStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(DemoDBParser.SEMICOLON, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public QueryStatmentContext queryStatment() {
			return getRuleContext(QueryStatmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			queryStatment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryStatmentContext extends ParserRuleContext {
		public QueryRelationContext queryRelation() {
			return getRuleContext(QueryRelationContext.class,0);
		}
		public QueryStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterQueryStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitQueryStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitQueryStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryStatmentContext queryStatment() throws RecognitionException {
		QueryStatmentContext _localctx = new QueryStatmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_queryStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			queryRelation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryRelationContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public QueryRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterQueryRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitQueryRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitQueryRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryRelationContext queryRelation() throws RecognitionException {
		QueryRelationContext _localctx = new QueryRelationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_queryRelation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			queryNoWith();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryNoWithContext extends ParserRuleContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(DemoDBParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(DemoDBParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public LimitElementContext limitElement() {
			return getRuleContext(LimitElementContext.class,0);
		}
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterQueryNoWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitQueryNoWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitQueryNoWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_queryNoWith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			queryPrimary(0);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(162);
				match(ORDER);
				setState(163);
				match(BY);
				setState(164);
				sortItem();
				{
				setState(165);
				match(T__0);
				setState(166);
				sortItem();
				}
				}
			}

			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(170);
				limitElement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryWithParenthesesContext extends QueryPrimaryContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public QueryWithParenthesesContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterQueryWithParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitQueryWithParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitQueryWithParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryPrimaryContext {
		public QueryPrimaryContext left;
		public Token operator;
		public QueryPrimaryContext right;
		public List<QueryPrimaryContext> queryPrimary() {
			return getRuleContexts(QueryPrimaryContext.class);
		}
		public QueryPrimaryContext queryPrimary(int i) {
			return getRuleContext(QueryPrimaryContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(DemoDBParser.INTERSECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode UNION() { return getToken(DemoDBParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(DemoDBParser.EXCEPT, 0); }
		public TerminalNode MINUS() { return getToken(DemoDBParser.MINUS, 0); }
		public SetOperationContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		return queryPrimary(0);
	}

	private QueryPrimaryContext queryPrimary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, _parentState);
		QueryPrimaryContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_queryPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(174);
				querySpecification();
				}
				break;
			case T__1:
				{
				_localctx = new QueryWithParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				subquery();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryPrimaryContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryPrimary);
						setState(178);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(179);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(181);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(180);
							setQuantifier();
							}
						}

						setState(183);
						((SetOperationContext)_localctx).right = queryPrimary(3);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryPrimaryContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryPrimary);
						setState(184);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(185);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==MINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(187);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(186);
							setQuantifier();
							}
						}

						setState(189);
						((SetOperationContext)_localctx).right = queryPrimary(2);
						}
						break;
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public QueryRelationContext queryRelation() {
			return getRuleContext(QueryRelationContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__1);
			setState(196);
			queryRelation();
			setState(197);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(DemoDBParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(DemoDBParser.DISTINCT, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public ExpressionContext where;
		public ExpressionContext having;
		public TerminalNode SELECT() { return getToken(DemoDBParser.SELECT, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<SetVarHintContext> setVarHint() {
			return getRuleContexts(SetVarHintContext.class);
		}
		public SetVarHintContext setVarHint(int i) {
			return getRuleContext(SetVarHintContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(DemoDBParser.WHERE, 0); }
		public TerminalNode GROUP() { return getToken(DemoDBParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(DemoDBParser.BY, 0); }
		public GroupingElementContext groupingElement() {
			return getRuleContext(GroupingElementContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(DemoDBParser.HAVING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_querySpecification);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(SELECT);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(202);
				setVarHint();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(208);
				setQuantifier();
				}
			}

			setState(211);
			selectItem();
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					match(T__0);
					setState(213);
					selectItem();
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(219);
			fromClause();
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(220);
				match(WHERE);
				setState(221);
				((QuerySpecificationContext)_localctx).where = expression(0);
				}
				break;
			}
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(224);
				match(GROUP);
				setState(225);
				match(BY);
				setState(226);
				groupingElement();
				}
				break;
			}
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(229);
				match(HAVING);
				setState(230);
				((QuerySpecificationContext)_localctx).having = expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
	 
		public FromClauseContext() { }
		public void copyFrom(FromClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DualContext extends FromClauseContext {
		public TerminalNode FROM() { return getToken(DemoDBParser.FROM, 0); }
		public TerminalNode DUAL() { return getToken(DemoDBParser.DUAL, 0); }
		public DualContext(FromClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterDual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitDual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitDual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FromContext extends FromClauseContext {
		public TerminalNode FROM() { return getToken(DemoDBParser.FROM, 0); }
		public RelationsContext relations() {
			return getRuleContext(RelationsContext.class,0);
		}
		public FromContext(FromClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fromClause);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new FromContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(233);
					match(FROM);
					setState(234);
					relations();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new DualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(FROM);
				setState(238);
				match(DUAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
	 
		public GroupingElementContext() { }
		public void copyFrom(GroupingElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleGroupingSetsContext extends GroupingElementContext {
		public TerminalNode GROUPING() { return getToken(DemoDBParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(DemoDBParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public MultipleGroupingSetsContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterMultipleGroupingSets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitMultipleGroupingSets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitMultipleGroupingSets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleGroupingSetContext extends GroupingElementContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SingleGroupingSetContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterSingleGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitSingleGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitSingleGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CubeContext extends GroupingElementContext {
		public TerminalNode CUBE() { return getToken(DemoDBParser.CUBE, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public CubeContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterCube(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitCube(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitCube(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollupContext extends GroupingElementContext {
		public TerminalNode ROLLUP() { return getToken(DemoDBParser.ROLLUP, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public RollupContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterRollup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitRollup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitRollup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_groupingElement);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new RollupContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(ROLLUP);
				setState(242);
				match(T__1);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__4 - 2)) | (1L << (T__8 - 2)) | (1L << (ADMIN - 2)) | (1L << (AFTER - 2)) | (1L << (AGGREGATE - 2)) | (1L << (ARRAY - 2)) | (1L << (ASYNC - 2)) | (1L << (AUTHORS - 2)) | (1L << (AVG - 2)) | (1L << (BACKEND - 2)) | (1L << (BACKENDS - 2)) | (1L << (BACKUP - 2)) | (1L << (BEGIN - 2)) | (1L << (BITMAP_UNION - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BROKER - 2)) | (1L << (BUCKETS - 2)) | (1L << (BUILTIN - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CATALOG - 2)) | (1L << (CATALOGS - 2)) | (1L << (CEIL - 2)) | (1L << (CHAIN - 2)) | (1L << (CHAR - 2)) | (1L << (CHARSET - 2)) | (1L << (COLLATION - 2)) | (1L << (COLUMNS - 2)) | (1L << (COMMENT - 2)) | (1L << (COMMIT - 2)) | (1L << (COMMITTED - 2)) | (1L << (COMPUTE - 2)) | (1L << (CONFIG - 2)) | (1L << (CONNECTION - 2)) | (1L << (CONNECTION_ID - 2)) | (1L << (CONSISTENT - 2)) | (1L << (CONVERT - 2)) | (1L << (COSTS - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (COUNT - 66)) | (1L << (CURRENT - 66)) | (1L << (CURRENT_TIMESTAMP - 66)) | (1L << (CURRENT_USER - 66)) | (1L << (DATA - 66)) | (1L << (DATABASE - 66)) | (1L << (DATE - 66)) | (1L << (DATETIME - 66)) | (1L << (DAY - 66)) | (1L << (DECOMMISSION - 66)) | (1L << (DENSE_RANK - 66)) | (1L << (NTILE - 66)) | (1L << (DISTRIBUTION - 66)) | (1L << (DUPLICATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (END - 66)) | (1L << (ENGINE - 66)) | (1L << (ENGINES - 66)) | (1L << (ERRORS - 66)) | (1L << (EVENTS - 66)) | (1L << (EXECUTE - 66)) | (1L << (EXISTS - 66)) | (1L << (EXTERNAL - 66)) | (1L << (EXTRACT - 66)) | (1L << (EVERY - 66)) | (1L << (FALSE - 66)) | (1L << (FILE - 66)) | (1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FIRST_VALUE - 66)) | (1L << (FLOOR - 66)) | (1L << (FN - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FOLLOWER - 66)) | (1L << (FORMAT - 66)) | (1L << (FREE - 66)) | (1L << (FRONTEND - 66)) | (1L << (FRONTENDS - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (FUNCTIONS - 132)) | (1L << (GLOBAL - 132)) | (1L << (GRANTS - 132)) | (1L << (GROUPING - 132)) | (1L << (GROUPING_ID - 132)) | (1L << (HASH - 132)) | (1L << (HELP - 132)) | (1L << (HISTOGRAM - 132)) | (1L << (HLL_UNION - 132)) | (1L << (HOUR - 132)) | (1L << (HUB - 132)) | (1L << (IDENTIFIED - 132)) | (1L << (IF - 132)) | (1L << (IMPERSONATE - 132)) | (1L << (INDEXES - 132)) | (1L << (INSTALL - 132)) | (1L << (INTERMEDIATE - 132)) | (1L << (INTERVAL - 132)) | (1L << (OVERWRITE - 132)) | (1L << (ISOLATION - 132)) | (1L << (JOB - 132)) | (1L << (LABEL - 132)) | (1L << (LAG - 132)) | (1L << (LAST - 132)) | (1L << (LAST_VALUE - 132)) | (1L << (LEAD - 132)) | (1L << (LEFT - 132)) | (1L << (LESS - 132)) | (1L << (LEVEL - 132)) | (1L << (LIKE - 132)) | (1L << (LIST - 132)) | (1L << (LOCAL - 132)) | (1L << (LOGICAL - 132)) | (1L << (MANUAL - 132)) | (1L << (MATERIALIZED - 132)) | (1L << (MAX - 132)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (MERGE - 197)) | (1L << (MIN - 197)) | (1L << (MINUTE - 197)) | (1L << (META - 197)) | (1L << (MOD - 197)) | (1L << (MODE - 197)) | (1L << (MODIFY - 197)) | (1L << (MONTH - 197)) | (1L << (NAME - 197)) | (1L << (NAMES - 197)) | (1L << (NEGATIVE - 197)) | (1L << (NO - 197)) | (1L << (NODE - 197)) | (1L << (NOT - 197)) | (1L << (NULL - 197)) | (1L << (NULLS - 197)) | (1L << (OBSERVER - 197)) | (1L << (OFFSET - 197)) | (1L << (ONLY - 197)) | (1L << (OPEN - 197)) | (1L << (OPTION - 197)) | (1L << (PARTITIONS - 197)) | (1L << (PASSWORD - 197)) | (1L << (PATH - 197)) | (1L << (PAUSE - 197)) | (1L << (PERCENTILE_UNION - 197)) | (1L << (PLUGIN - 197)) | (1L << (PLUGINS - 197)) | (1L << (PRECEDING - 197)) | (1L << (PROC - 197)) | (1L << (PROCESSLIST - 197)) | (1L << (PROPERTIES - 197)) | (1L << (PROPERTY - 197)) | (1L << (QUARTER - 197)) | (1L << (QUERY - 197)) | (1L << (QUOTA - 197)) | (1L << (RANDOM - 197)) | (1L << (RANK - 197)) | (1L << (RECOVER - 197)) | (1L << (REFRESH - 197)) | (1L << (REGEXP - 197)) | (1L << (REPAIR - 197)) | (1L << (REPEATABLE - 197)) | (1L << (REPLACE - 197)) | (1L << (REPLACE_IF_NOT_NULL - 197)) | (1L << (REPLICA - 197)) | (1L << (REPOSITORY - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPOSITORIES - 261)) | (1L << (RESOURCE - 261)) | (1L << (RESOURCES - 261)) | (1L << (RESTORE - 261)) | (1L << (RESUME - 261)) | (1L << (RETURNS - 261)) | (1L << (REVERT - 261)) | (1L << (RIGHT - 261)) | (1L << (RLIKE - 261)) | (1L << (ROLE - 261)) | (1L << (ROLES - 261)) | (1L << (ROLLBACK - 261)) | (1L << (ROLLUP - 261)) | (1L << (ROUTINE - 261)) | (1L << (ROW_NUMBER - 261)) | (1L << (SAMPLE - 261)) | (1L << (SCHEMA - 261)) | (1L << (SECOND - 261)) | (1L << (SERIALIZABLE - 261)) | (1L << (SESSION - 261)) | (1L << (SETS - 261)) | (1L << (SIGNED - 261)) | (1L << (SNAPSHOT - 261)) | (1L << (SQLBLACKLIST - 261)) | (1L << (START - 261)) | (1L << (STATS - 261)) | (1L << (STATUS - 261)) | (1L << (STOP - 261)) | (1L << (STORAGE - 261)) | (1L << (STRING - 261)) | (1L << (SUBMIT - 261)) | (1L << (SUM - 261)) | (1L << (SYNC - 261)) | (1L << (TABLES - 261)) | (1L << (TABLET - 261)) | (1L << (TASK - 261)) | (1L << (TEMPORARY - 261)) | (1L << (THAN - 261)) | (1L << (TIME - 261)) | (1L << (TIMESTAMP - 261)) | (1L << (TIMESTAMPADD - 261)) | (1L << (TIMESTAMPDIFF - 261)) | (1L << (TRANSACTION - 261)) | (1L << (TRIGGERS - 261)) | (1L << (TRUE - 261)) | (1L << (TRUNCATE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (TYPE - 325)) | (1L << (TYPES - 325)) | (1L << (UNBOUNDED - 325)) | (1L << (UNCOMMITTED - 325)) | (1L << (UNINSTALL - 325)) | (1L << (USER - 325)) | (1L << (VALUE - 325)) | (1L << (VARIABLES - 325)) | (1L << (VERBOSE - 325)) | (1L << (VIEW - 325)) | (1L << (WARNINGS - 325)) | (1L << (WEEK - 325)) | (1L << (WHITELIST - 325)) | (1L << (WORK - 325)) | (1L << (WRITE - 325)) | (1L << (YEAR - 325)) | (1L << (PLUS_SYMBOL - 325)) | (1L << (MINUS_SYMBOL - 325)) | (1L << (LOGICAL_NOT - 325)) | (1L << (BITNOT - 325)) | (1L << (AT - 325)) | (1L << (INTEGER_VALUE - 325)) | (1L << (DECIMAL_VALUE - 325)) | (1L << (DOUBLE_VALUE - 325)) | (1L << (SINGLE_QUOTED_TEXT - 325)) | (1L << (DOUBLE_QUOTED_TEXT - 325)) | (1L << (LETTER_IDENTIFIER - 325)) | (1L << (DIGIT_IDENTIFIER - 325)) | (1L << (BACKQUOTED_IDENTIFIER - 325)) | (1L << (DOTDOTDOT - 325)))) != 0)) {
					{
					setState(243);
					expressionList();
					}
				}

				setState(246);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new CubeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(CUBE);
				setState(248);
				match(T__1);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__4 - 2)) | (1L << (T__8 - 2)) | (1L << (ADMIN - 2)) | (1L << (AFTER - 2)) | (1L << (AGGREGATE - 2)) | (1L << (ARRAY - 2)) | (1L << (ASYNC - 2)) | (1L << (AUTHORS - 2)) | (1L << (AVG - 2)) | (1L << (BACKEND - 2)) | (1L << (BACKENDS - 2)) | (1L << (BACKUP - 2)) | (1L << (BEGIN - 2)) | (1L << (BITMAP_UNION - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BROKER - 2)) | (1L << (BUCKETS - 2)) | (1L << (BUILTIN - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CATALOG - 2)) | (1L << (CATALOGS - 2)) | (1L << (CEIL - 2)) | (1L << (CHAIN - 2)) | (1L << (CHAR - 2)) | (1L << (CHARSET - 2)) | (1L << (COLLATION - 2)) | (1L << (COLUMNS - 2)) | (1L << (COMMENT - 2)) | (1L << (COMMIT - 2)) | (1L << (COMMITTED - 2)) | (1L << (COMPUTE - 2)) | (1L << (CONFIG - 2)) | (1L << (CONNECTION - 2)) | (1L << (CONNECTION_ID - 2)) | (1L << (CONSISTENT - 2)) | (1L << (CONVERT - 2)) | (1L << (COSTS - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (COUNT - 66)) | (1L << (CURRENT - 66)) | (1L << (CURRENT_TIMESTAMP - 66)) | (1L << (CURRENT_USER - 66)) | (1L << (DATA - 66)) | (1L << (DATABASE - 66)) | (1L << (DATE - 66)) | (1L << (DATETIME - 66)) | (1L << (DAY - 66)) | (1L << (DECOMMISSION - 66)) | (1L << (DENSE_RANK - 66)) | (1L << (NTILE - 66)) | (1L << (DISTRIBUTION - 66)) | (1L << (DUPLICATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (END - 66)) | (1L << (ENGINE - 66)) | (1L << (ENGINES - 66)) | (1L << (ERRORS - 66)) | (1L << (EVENTS - 66)) | (1L << (EXECUTE - 66)) | (1L << (EXISTS - 66)) | (1L << (EXTERNAL - 66)) | (1L << (EXTRACT - 66)) | (1L << (EVERY - 66)) | (1L << (FALSE - 66)) | (1L << (FILE - 66)) | (1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FIRST_VALUE - 66)) | (1L << (FLOOR - 66)) | (1L << (FN - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FOLLOWER - 66)) | (1L << (FORMAT - 66)) | (1L << (FREE - 66)) | (1L << (FRONTEND - 66)) | (1L << (FRONTENDS - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (FUNCTIONS - 132)) | (1L << (GLOBAL - 132)) | (1L << (GRANTS - 132)) | (1L << (GROUPING - 132)) | (1L << (GROUPING_ID - 132)) | (1L << (HASH - 132)) | (1L << (HELP - 132)) | (1L << (HISTOGRAM - 132)) | (1L << (HLL_UNION - 132)) | (1L << (HOUR - 132)) | (1L << (HUB - 132)) | (1L << (IDENTIFIED - 132)) | (1L << (IF - 132)) | (1L << (IMPERSONATE - 132)) | (1L << (INDEXES - 132)) | (1L << (INSTALL - 132)) | (1L << (INTERMEDIATE - 132)) | (1L << (INTERVAL - 132)) | (1L << (OVERWRITE - 132)) | (1L << (ISOLATION - 132)) | (1L << (JOB - 132)) | (1L << (LABEL - 132)) | (1L << (LAG - 132)) | (1L << (LAST - 132)) | (1L << (LAST_VALUE - 132)) | (1L << (LEAD - 132)) | (1L << (LEFT - 132)) | (1L << (LESS - 132)) | (1L << (LEVEL - 132)) | (1L << (LIKE - 132)) | (1L << (LIST - 132)) | (1L << (LOCAL - 132)) | (1L << (LOGICAL - 132)) | (1L << (MANUAL - 132)) | (1L << (MATERIALIZED - 132)) | (1L << (MAX - 132)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (MERGE - 197)) | (1L << (MIN - 197)) | (1L << (MINUTE - 197)) | (1L << (META - 197)) | (1L << (MOD - 197)) | (1L << (MODE - 197)) | (1L << (MODIFY - 197)) | (1L << (MONTH - 197)) | (1L << (NAME - 197)) | (1L << (NAMES - 197)) | (1L << (NEGATIVE - 197)) | (1L << (NO - 197)) | (1L << (NODE - 197)) | (1L << (NOT - 197)) | (1L << (NULL - 197)) | (1L << (NULLS - 197)) | (1L << (OBSERVER - 197)) | (1L << (OFFSET - 197)) | (1L << (ONLY - 197)) | (1L << (OPEN - 197)) | (1L << (OPTION - 197)) | (1L << (PARTITIONS - 197)) | (1L << (PASSWORD - 197)) | (1L << (PATH - 197)) | (1L << (PAUSE - 197)) | (1L << (PERCENTILE_UNION - 197)) | (1L << (PLUGIN - 197)) | (1L << (PLUGINS - 197)) | (1L << (PRECEDING - 197)) | (1L << (PROC - 197)) | (1L << (PROCESSLIST - 197)) | (1L << (PROPERTIES - 197)) | (1L << (PROPERTY - 197)) | (1L << (QUARTER - 197)) | (1L << (QUERY - 197)) | (1L << (QUOTA - 197)) | (1L << (RANDOM - 197)) | (1L << (RANK - 197)) | (1L << (RECOVER - 197)) | (1L << (REFRESH - 197)) | (1L << (REGEXP - 197)) | (1L << (REPAIR - 197)) | (1L << (REPEATABLE - 197)) | (1L << (REPLACE - 197)) | (1L << (REPLACE_IF_NOT_NULL - 197)) | (1L << (REPLICA - 197)) | (1L << (REPOSITORY - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPOSITORIES - 261)) | (1L << (RESOURCE - 261)) | (1L << (RESOURCES - 261)) | (1L << (RESTORE - 261)) | (1L << (RESUME - 261)) | (1L << (RETURNS - 261)) | (1L << (REVERT - 261)) | (1L << (RIGHT - 261)) | (1L << (RLIKE - 261)) | (1L << (ROLE - 261)) | (1L << (ROLES - 261)) | (1L << (ROLLBACK - 261)) | (1L << (ROLLUP - 261)) | (1L << (ROUTINE - 261)) | (1L << (ROW_NUMBER - 261)) | (1L << (SAMPLE - 261)) | (1L << (SCHEMA - 261)) | (1L << (SECOND - 261)) | (1L << (SERIALIZABLE - 261)) | (1L << (SESSION - 261)) | (1L << (SETS - 261)) | (1L << (SIGNED - 261)) | (1L << (SNAPSHOT - 261)) | (1L << (SQLBLACKLIST - 261)) | (1L << (START - 261)) | (1L << (STATS - 261)) | (1L << (STATUS - 261)) | (1L << (STOP - 261)) | (1L << (STORAGE - 261)) | (1L << (STRING - 261)) | (1L << (SUBMIT - 261)) | (1L << (SUM - 261)) | (1L << (SYNC - 261)) | (1L << (TABLES - 261)) | (1L << (TABLET - 261)) | (1L << (TASK - 261)) | (1L << (TEMPORARY - 261)) | (1L << (THAN - 261)) | (1L << (TIME - 261)) | (1L << (TIMESTAMP - 261)) | (1L << (TIMESTAMPADD - 261)) | (1L << (TIMESTAMPDIFF - 261)) | (1L << (TRANSACTION - 261)) | (1L << (TRIGGERS - 261)) | (1L << (TRUE - 261)) | (1L << (TRUNCATE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (TYPE - 325)) | (1L << (TYPES - 325)) | (1L << (UNBOUNDED - 325)) | (1L << (UNCOMMITTED - 325)) | (1L << (UNINSTALL - 325)) | (1L << (USER - 325)) | (1L << (VALUE - 325)) | (1L << (VARIABLES - 325)) | (1L << (VERBOSE - 325)) | (1L << (VIEW - 325)) | (1L << (WARNINGS - 325)) | (1L << (WEEK - 325)) | (1L << (WHITELIST - 325)) | (1L << (WORK - 325)) | (1L << (WRITE - 325)) | (1L << (YEAR - 325)) | (1L << (PLUS_SYMBOL - 325)) | (1L << (MINUS_SYMBOL - 325)) | (1L << (LOGICAL_NOT - 325)) | (1L << (BITNOT - 325)) | (1L << (AT - 325)) | (1L << (INTEGER_VALUE - 325)) | (1L << (DECIMAL_VALUE - 325)) | (1L << (DOUBLE_VALUE - 325)) | (1L << (SINGLE_QUOTED_TEXT - 325)) | (1L << (DOUBLE_QUOTED_TEXT - 325)) | (1L << (LETTER_IDENTIFIER - 325)) | (1L << (DIGIT_IDENTIFIER - 325)) | (1L << (BACKQUOTED_IDENTIFIER - 325)) | (1L << (DOTDOTDOT - 325)))) != 0)) {
					{
					setState(249);
					expressionList();
					}
				}

				setState(252);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new MultipleGroupingSetsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(GROUPING);
				setState(254);
				match(SETS);
				setState(255);
				match(T__1);
				setState(256);
				groupingSet();
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(257);
					match(T__0);
					setState(258);
					groupingSet();
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(264);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new SingleGroupingSetContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_groupingSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__1);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__4 - 2)) | (1L << (T__8 - 2)) | (1L << (ADMIN - 2)) | (1L << (AFTER - 2)) | (1L << (AGGREGATE - 2)) | (1L << (ARRAY - 2)) | (1L << (ASYNC - 2)) | (1L << (AUTHORS - 2)) | (1L << (AVG - 2)) | (1L << (BACKEND - 2)) | (1L << (BACKENDS - 2)) | (1L << (BACKUP - 2)) | (1L << (BEGIN - 2)) | (1L << (BITMAP_UNION - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BROKER - 2)) | (1L << (BUCKETS - 2)) | (1L << (BUILTIN - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CATALOG - 2)) | (1L << (CATALOGS - 2)) | (1L << (CEIL - 2)) | (1L << (CHAIN - 2)) | (1L << (CHAR - 2)) | (1L << (CHARSET - 2)) | (1L << (COLLATION - 2)) | (1L << (COLUMNS - 2)) | (1L << (COMMENT - 2)) | (1L << (COMMIT - 2)) | (1L << (COMMITTED - 2)) | (1L << (COMPUTE - 2)) | (1L << (CONFIG - 2)) | (1L << (CONNECTION - 2)) | (1L << (CONNECTION_ID - 2)) | (1L << (CONSISTENT - 2)) | (1L << (CONVERT - 2)) | (1L << (COSTS - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (COUNT - 66)) | (1L << (CURRENT - 66)) | (1L << (CURRENT_TIMESTAMP - 66)) | (1L << (CURRENT_USER - 66)) | (1L << (DATA - 66)) | (1L << (DATABASE - 66)) | (1L << (DATE - 66)) | (1L << (DATETIME - 66)) | (1L << (DAY - 66)) | (1L << (DECOMMISSION - 66)) | (1L << (DENSE_RANK - 66)) | (1L << (NTILE - 66)) | (1L << (DISTRIBUTION - 66)) | (1L << (DUPLICATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (END - 66)) | (1L << (ENGINE - 66)) | (1L << (ENGINES - 66)) | (1L << (ERRORS - 66)) | (1L << (EVENTS - 66)) | (1L << (EXECUTE - 66)) | (1L << (EXISTS - 66)) | (1L << (EXTERNAL - 66)) | (1L << (EXTRACT - 66)) | (1L << (EVERY - 66)) | (1L << (FALSE - 66)) | (1L << (FILE - 66)) | (1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FIRST_VALUE - 66)) | (1L << (FLOOR - 66)) | (1L << (FN - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FOLLOWER - 66)) | (1L << (FORMAT - 66)) | (1L << (FREE - 66)) | (1L << (FRONTEND - 66)) | (1L << (FRONTENDS - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (FUNCTIONS - 132)) | (1L << (GLOBAL - 132)) | (1L << (GRANTS - 132)) | (1L << (GROUPING - 132)) | (1L << (GROUPING_ID - 132)) | (1L << (HASH - 132)) | (1L << (HELP - 132)) | (1L << (HISTOGRAM - 132)) | (1L << (HLL_UNION - 132)) | (1L << (HOUR - 132)) | (1L << (HUB - 132)) | (1L << (IDENTIFIED - 132)) | (1L << (IF - 132)) | (1L << (IMPERSONATE - 132)) | (1L << (INDEXES - 132)) | (1L << (INSTALL - 132)) | (1L << (INTERMEDIATE - 132)) | (1L << (INTERVAL - 132)) | (1L << (OVERWRITE - 132)) | (1L << (ISOLATION - 132)) | (1L << (JOB - 132)) | (1L << (LABEL - 132)) | (1L << (LAG - 132)) | (1L << (LAST - 132)) | (1L << (LAST_VALUE - 132)) | (1L << (LEAD - 132)) | (1L << (LEFT - 132)) | (1L << (LESS - 132)) | (1L << (LEVEL - 132)) | (1L << (LIKE - 132)) | (1L << (LIST - 132)) | (1L << (LOCAL - 132)) | (1L << (LOGICAL - 132)) | (1L << (MANUAL - 132)) | (1L << (MATERIALIZED - 132)) | (1L << (MAX - 132)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (MERGE - 197)) | (1L << (MIN - 197)) | (1L << (MINUTE - 197)) | (1L << (META - 197)) | (1L << (MOD - 197)) | (1L << (MODE - 197)) | (1L << (MODIFY - 197)) | (1L << (MONTH - 197)) | (1L << (NAME - 197)) | (1L << (NAMES - 197)) | (1L << (NEGATIVE - 197)) | (1L << (NO - 197)) | (1L << (NODE - 197)) | (1L << (NOT - 197)) | (1L << (NULL - 197)) | (1L << (NULLS - 197)) | (1L << (OBSERVER - 197)) | (1L << (OFFSET - 197)) | (1L << (ONLY - 197)) | (1L << (OPEN - 197)) | (1L << (OPTION - 197)) | (1L << (PARTITIONS - 197)) | (1L << (PASSWORD - 197)) | (1L << (PATH - 197)) | (1L << (PAUSE - 197)) | (1L << (PERCENTILE_UNION - 197)) | (1L << (PLUGIN - 197)) | (1L << (PLUGINS - 197)) | (1L << (PRECEDING - 197)) | (1L << (PROC - 197)) | (1L << (PROCESSLIST - 197)) | (1L << (PROPERTIES - 197)) | (1L << (PROPERTY - 197)) | (1L << (QUARTER - 197)) | (1L << (QUERY - 197)) | (1L << (QUOTA - 197)) | (1L << (RANDOM - 197)) | (1L << (RANK - 197)) | (1L << (RECOVER - 197)) | (1L << (REFRESH - 197)) | (1L << (REGEXP - 197)) | (1L << (REPAIR - 197)) | (1L << (REPEATABLE - 197)) | (1L << (REPLACE - 197)) | (1L << (REPLACE_IF_NOT_NULL - 197)) | (1L << (REPLICA - 197)) | (1L << (REPOSITORY - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPOSITORIES - 261)) | (1L << (RESOURCE - 261)) | (1L << (RESOURCES - 261)) | (1L << (RESTORE - 261)) | (1L << (RESUME - 261)) | (1L << (RETURNS - 261)) | (1L << (REVERT - 261)) | (1L << (RIGHT - 261)) | (1L << (RLIKE - 261)) | (1L << (ROLE - 261)) | (1L << (ROLES - 261)) | (1L << (ROLLBACK - 261)) | (1L << (ROLLUP - 261)) | (1L << (ROUTINE - 261)) | (1L << (ROW_NUMBER - 261)) | (1L << (SAMPLE - 261)) | (1L << (SCHEMA - 261)) | (1L << (SECOND - 261)) | (1L << (SERIALIZABLE - 261)) | (1L << (SESSION - 261)) | (1L << (SETS - 261)) | (1L << (SIGNED - 261)) | (1L << (SNAPSHOT - 261)) | (1L << (SQLBLACKLIST - 261)) | (1L << (START - 261)) | (1L << (STATS - 261)) | (1L << (STATUS - 261)) | (1L << (STOP - 261)) | (1L << (STORAGE - 261)) | (1L << (STRING - 261)) | (1L << (SUBMIT - 261)) | (1L << (SUM - 261)) | (1L << (SYNC - 261)) | (1L << (TABLES - 261)) | (1L << (TABLET - 261)) | (1L << (TASK - 261)) | (1L << (TEMPORARY - 261)) | (1L << (THAN - 261)) | (1L << (TIME - 261)) | (1L << (TIMESTAMP - 261)) | (1L << (TIMESTAMPADD - 261)) | (1L << (TIMESTAMPDIFF - 261)) | (1L << (TRANSACTION - 261)) | (1L << (TRIGGERS - 261)) | (1L << (TRUE - 261)) | (1L << (TRUNCATE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (TYPE - 325)) | (1L << (TYPES - 325)) | (1L << (UNBOUNDED - 325)) | (1L << (UNCOMMITTED - 325)) | (1L << (UNINSTALL - 325)) | (1L << (USER - 325)) | (1L << (VALUE - 325)) | (1L << (VARIABLES - 325)) | (1L << (VERBOSE - 325)) | (1L << (VIEW - 325)) | (1L << (WARNINGS - 325)) | (1L << (WEEK - 325)) | (1L << (WHITELIST - 325)) | (1L << (WORK - 325)) | (1L << (WRITE - 325)) | (1L << (YEAR - 325)) | (1L << (PLUS_SYMBOL - 325)) | (1L << (MINUS_SYMBOL - 325)) | (1L << (LOGICAL_NOT - 325)) | (1L << (BITNOT - 325)) | (1L << (AT - 325)) | (1L << (INTEGER_VALUE - 325)) | (1L << (DECIMAL_VALUE - 325)) | (1L << (DOUBLE_VALUE - 325)) | (1L << (SINGLE_QUOTED_TEXT - 325)) | (1L << (DOUBLE_QUOTED_TEXT - 325)) | (1L << (LETTER_IDENTIFIER - 325)) | (1L << (DIGIT_IDENTIFIER - 325)) | (1L << (BACKQUOTED_IDENTIFIER - 325)) | (1L << (DOTDOTDOT - 325)))) != 0)) {
				{
				setState(270);
				expression(0);
				}
			}

			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(273);
				match(T__0);
				setState(274);
				expression(0);
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemContext extends ParserRuleContext {
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	 
		public SelectItemContext() { }
		public void copyFrom(SelectItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectAllContext extends SelectItemContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK_SYMBOL() { return getToken(DemoDBParser.ASTERISK_SYMBOL, 0); }
		public SelectAllContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterSelectAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitSelectAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitSelectAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectSingleContext extends SelectItemContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode AS() { return getToken(DemoDBParser.AS, 0); }
		public SelectSingleContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterSelectSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitSelectSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitSelectSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_selectItem);
		int _la;
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new SelectSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				expression(0);
				setState(290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(283);
						match(AS);
						}
					}

					setState(288);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ADMIN:
					case AFTER:
					case AGGREGATE:
					case ASYNC:
					case AUTHORS:
					case AVG:
					case BACKEND:
					case BACKENDS:
					case BACKUP:
					case BEGIN:
					case BITMAP_UNION:
					case BOOLEAN:
					case BROKER:
					case BUCKETS:
					case BUILTIN:
					case CAST:
					case CATALOG:
					case CATALOGS:
					case CEIL:
					case CHAIN:
					case CHARSET:
					case COLLATION:
					case COLUMNS:
					case COMMENT:
					case COMMIT:
					case COMMITTED:
					case COMPUTE:
					case CONFIG:
					case CONNECTION:
					case CONNECTION_ID:
					case CONSISTENT:
					case COSTS:
					case COUNT:
					case CURRENT:
					case DATA:
					case DATE:
					case DATETIME:
					case DAY:
					case DECOMMISSION:
					case DISTRIBUTION:
					case DUPLICATE:
					case DYNAMIC:
					case END:
					case ENGINE:
					case ENGINES:
					case ERRORS:
					case EVENTS:
					case EXECUTE:
					case EXTERNAL:
					case EXTRACT:
					case EVERY:
					case FILE:
					case FILTER:
					case FIRST:
					case FLOOR:
					case FN:
					case FOLLOWING:
					case FOLLOWER:
					case FORMAT:
					case FREE:
					case FRONTEND:
					case FRONTENDS:
					case FUNCTIONS:
					case GLOBAL:
					case GRANTS:
					case HASH:
					case HELP:
					case HISTOGRAM:
					case HLL_UNION:
					case HOUR:
					case HUB:
					case IDENTIFIED:
					case IMPERSONATE:
					case INDEXES:
					case INSTALL:
					case INTERMEDIATE:
					case INTERVAL:
					case OVERWRITE:
					case ISOLATION:
					case JOB:
					case LABEL:
					case LAST:
					case LESS:
					case LEVEL:
					case LIST:
					case LOCAL:
					case LOGICAL:
					case MANUAL:
					case MATERIALIZED:
					case MAX:
					case MERGE:
					case MIN:
					case MINUTE:
					case META:
					case MODE:
					case MODIFY:
					case MONTH:
					case NAME:
					case NAMES:
					case NEGATIVE:
					case NO:
					case NODE:
					case NULLS:
					case OBSERVER:
					case OFFSET:
					case ONLY:
					case OPEN:
					case OPTION:
					case PARTITIONS:
					case PASSWORD:
					case PATH:
					case PAUSE:
					case PERCENTILE_UNION:
					case PLUGIN:
					case PLUGINS:
					case PRECEDING:
					case PROC:
					case PROCESSLIST:
					case PROPERTIES:
					case PROPERTY:
					case QUARTER:
					case QUERY:
					case QUOTA:
					case RANDOM:
					case RECOVER:
					case REFRESH:
					case REPAIR:
					case REPEATABLE:
					case REPLACE_IF_NOT_NULL:
					case REPLICA:
					case REPOSITORY:
					case REPOSITORIES:
					case RESOURCE:
					case RESOURCES:
					case RESTORE:
					case RESUME:
					case RETURNS:
					case REVERT:
					case ROLE:
					case ROLES:
					case ROLLBACK:
					case ROLLUP:
					case ROUTINE:
					case SAMPLE:
					case SECOND:
					case SERIALIZABLE:
					case SESSION:
					case SETS:
					case SIGNED:
					case SNAPSHOT:
					case SQLBLACKLIST:
					case START:
					case STATS:
					case STATUS:
					case STOP:
					case STORAGE:
					case STRING:
					case SUBMIT:
					case SUM:
					case SYNC:
					case TABLES:
					case TABLET:
					case TASK:
					case TEMPORARY:
					case THAN:
					case TIME:
					case TIMESTAMP:
					case TIMESTAMPADD:
					case TIMESTAMPDIFF:
					case TRANSACTION:
					case TRIGGERS:
					case TRUNCATE:
					case TYPE:
					case TYPES:
					case UNBOUNDED:
					case UNCOMMITTED:
					case UNINSTALL:
					case USER:
					case VALUE:
					case VARIABLES:
					case VERBOSE:
					case VIEW:
					case WARNINGS:
					case WEEK:
					case WHITELIST:
					case WORK:
					case WRITE:
					case YEAR:
					case LETTER_IDENTIFIER:
					case DIGIT_IDENTIFIER:
					case BACKQUOTED_IDENTIFIER:
					case DOTDOTDOT:
						{
						setState(286);
						identifier();
						}
						break;
					case SINGLE_QUOTED_TEXT:
					case DOUBLE_QUOTED_TEXT:
						{
						setState(287);
						string();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				qualifiedName();
				setState(293);
				match(T__3);
				setState(294);
				match(ASTERISK_SYMBOL);
				}
				break;
			case 3:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(ASTERISK_SYMBOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationsContext extends ParserRuleContext {
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<TerminalNode> LATERAL() { return getTokens(DemoDBParser.LATERAL); }
		public TerminalNode LATERAL(int i) {
			return getToken(DemoDBParser.LATERAL, i);
		}
		public RelationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterRelations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitRelations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitRelations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationsContext relations() throws RecognitionException {
		RelationsContext _localctx = new RelationsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_relations);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			relation();
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(300);
					match(T__0);
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LATERAL) {
						{
						setState(301);
						match(LATERAL);
						}
					}

					setState(304);
					relation();
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relation);
		int _la;
		try {
			int _alt;
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				relationPrimary();
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(311);
						joinRelation();
						}
						} 
					}
					setState(316);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(T__1);
				setState(318);
				relationPrimary();
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CROSS || _la==FULL || ((((_la - 158)) & ~0x3f) == 0 && ((1L << (_la - 158)) & ((1L << (INNER - 158)) | (1L << (JOIN - 158)) | (1L << (LEFT - 158)))) != 0) || _la==RIGHT) {
					{
					{
					setState(319);
					joinRelation();
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(325);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryWithAliasContext extends RelationPrimaryContext {
		public IdentifierContext alias;
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(DemoDBParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public SubqueryWithAliasContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterSubqueryWithAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitSubqueryWithAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitSubqueryWithAlias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableFunctionContext extends RelationPrimaryContext {
		public IdentifierContext alias;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(DemoDBParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public TableFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterTableFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitTableFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitTableFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedRelationContext extends RelationPrimaryContext {
		public RelationsContext relations() {
			return getRuleContext(RelationsContext.class,0);
		}
		public ParenthesizedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterParenthesizedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitParenthesizedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitParenthesizedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableAtomContext extends RelationPrimaryContext {
		public IdentifierContext alias;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PartitionNamesContext partitionNames() {
			return getRuleContext(PartitionNamesContext.class,0);
		}
		public TabletListContext tabletList() {
			return getRuleContext(TabletListContext.class,0);
		}
		public BracketHintContext bracketHint() {
			return getRuleContext(BracketHintContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(DemoDBParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public TableAtomContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterTableAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitTableAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitTableAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableContext extends RelationPrimaryContext {
		public IdentifierContext alias;
		public TerminalNode VALUES() { return getToken(DemoDBParser.VALUES, 0); }
		public List<RowConstructorContext> rowConstructor() {
			return getRuleContexts(RowConstructorContext.class);
		}
		public RowConstructorContext rowConstructor(int i) {
			return getRuleContext(RowConstructorContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(DemoDBParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public InlineTableContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relationPrimary);
		int _la;
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new TableAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				qualifiedName();
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(330);
					partitionNames();
					}
					break;
				}
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(333);
					tabletList();
					}
					break;
				}
				setState(343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(336);
						match(AS);
						}
					}

					setState(339);
					((TableAtomContext)_localctx).alias = identifier();
					setState(341);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(340);
						columnAliases();
						}
						break;
					}
					}
					break;
				}
				setState(346);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(345);
					bracketHint();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new InlineTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(T__1);
				setState(349);
				match(VALUES);
				setState(350);
				rowConstructor();
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(351);
					match(T__0);
					setState(352);
					rowConstructor();
					}
					}
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(358);
				match(T__2);
				setState(366);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(359);
						match(AS);
						}
					}

					setState(362);
					((InlineTableContext)_localctx).alias = identifier();
					setState(364);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(363);
						columnAliases();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new SubqueryWithAliasContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				subquery();
				setState(376);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(369);
						match(AS);
						}
					}

					setState(372);
					((SubqueryWithAliasContext)_localctx).alias = identifier();
					setState(374);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(373);
						columnAliases();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new TableFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				qualifiedName();
				setState(379);
				match(T__1);
				setState(380);
				expressionList();
				setState(381);
				match(T__2);
				setState(389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(382);
						match(AS);
						}
					}

					setState(385);
					((TableFunctionContext)_localctx).alias = identifier();
					setState(387);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(386);
						columnAliases();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new ParenthesizedRelationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(391);
				match(T__1);
				setState(392);
				relations();
				setState(393);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowConstructorContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public RowConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowConstructorContext rowConstructor() throws RecognitionException {
		RowConstructorContext _localctx = new RowConstructorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rowConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__1);
			setState(398);
			expressionList();
			setState(399);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext rightRelation;
		public CrossOrInnerJoinTypeContext crossOrInnerJoinType() {
			return getRuleContext(CrossOrInnerJoinTypeContext.class,0);
		}
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public BracketHintContext bracketHint() {
			return getRuleContext(BracketHintContext.class,0);
		}
		public TerminalNode LATERAL() { return getToken(DemoDBParser.LATERAL, 0); }
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public OuterAndSemiJoinTypeContext outerAndSemiJoinType() {
			return getRuleContext(OuterAndSemiJoinTypeContext.class,0);
		}
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_joinRelation);
		int _la;
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CROSS:
			case INNER:
			case JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				crossOrInnerJoinType();
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(402);
					bracketHint();
					}
				}

				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LATERAL) {
					{
					setState(405);
					match(LATERAL);
					}
				}

				setState(408);
				((JoinRelationContext)_localctx).rightRelation = relationPrimary();
				setState(410);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(409);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case FULL:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				outerAndSemiJoinType();
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(413);
					bracketHint();
					}
				}

				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LATERAL) {
					{
					setState(416);
					match(LATERAL);
					}
				}

				setState(419);
				((JoinRelationContext)_localctx).rightRelation = relationPrimary();
				setState(420);
				joinCriteria();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CrossOrInnerJoinTypeContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(DemoDBParser.JOIN, 0); }
		public TerminalNode INNER() { return getToken(DemoDBParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(DemoDBParser.CROSS, 0); }
		public CrossOrInnerJoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossOrInnerJoinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterCrossOrInnerJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitCrossOrInnerJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitCrossOrInnerJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossOrInnerJoinTypeContext crossOrInnerJoinType() throws RecognitionException {
		CrossOrInnerJoinTypeContext _localctx = new CrossOrInnerJoinTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_crossOrInnerJoinType);
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(JOIN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(INNER);
				setState(426);
				match(JOIN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				match(CROSS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				match(CROSS);
				setState(429);
				match(JOIN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OuterAndSemiJoinTypeContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(DemoDBParser.LEFT, 0); }
		public TerminalNode JOIN() { return getToken(DemoDBParser.JOIN, 0); }
		public TerminalNode RIGHT() { return getToken(DemoDBParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(DemoDBParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(DemoDBParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(DemoDBParser.SEMI, 0); }
		public TerminalNode ANTI() { return getToken(DemoDBParser.ANTI, 0); }
		public OuterAndSemiJoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outerAndSemiJoinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterOuterAndSemiJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitOuterAndSemiJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitOuterAndSemiJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OuterAndSemiJoinTypeContext outerAndSemiJoinType() throws RecognitionException {
		OuterAndSemiJoinTypeContext _localctx = new OuterAndSemiJoinTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_outerAndSemiJoinType);
		try {
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(LEFT);
				setState(433);
				match(JOIN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(RIGHT);
				setState(435);
				match(JOIN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				match(FULL);
				setState(437);
				match(JOIN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(438);
				match(LEFT);
				setState(439);
				match(OUTER);
				setState(440);
				match(JOIN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(441);
				match(RIGHT);
				setState(442);
				match(OUTER);
				setState(443);
				match(JOIN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(444);
				match(FULL);
				setState(445);
				match(OUTER);
				setState(446);
				match(JOIN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(447);
				match(LEFT);
				setState(448);
				match(SEMI);
				setState(449);
				match(JOIN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(450);
				match(RIGHT);
				setState(451);
				match(SEMI);
				setState(452);
				match(JOIN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(453);
				match(LEFT);
				setState(454);
				match(ANTI);
				setState(455);
				match(JOIN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(456);
				match(RIGHT);
				setState(457);
				match(ANTI);
				setState(458);
				match(JOIN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BracketHintContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public BracketHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketHint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterBracketHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitBracketHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitBracketHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketHintContext bracketHint() throws RecognitionException {
		BracketHintContext _localctx = new BracketHintContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bracketHint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(T__4);
			setState(462);
			identifier();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(463);
				match(T__0);
				setState(464);
				identifier();
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(470);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetVarHintContext extends ParserRuleContext {
		public TerminalNode SET_VAR() { return getToken(DemoDBParser.SET_VAR, 0); }
		public List<HintMapContext> hintMap() {
			return getRuleContexts(HintMapContext.class);
		}
		public HintMapContext hintMap(int i) {
			return getRuleContext(HintMapContext.class,i);
		}
		public SetVarHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setVarHint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterSetVarHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitSetVarHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitSetVarHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetVarHintContext setVarHint() throws RecognitionException {
		SetVarHintContext _localctx = new SetVarHintContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_setVarHint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(T__6);
			setState(473);
			match(SET_VAR);
			setState(474);
			match(T__1);
			setState(475);
			hintMap();
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(476);
				match(T__0);
				setState(477);
				hintMap();
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(483);
			match(T__2);
			setState(484);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintMapContext extends ParserRuleContext {
		public IdentifierOrStringContext k;
		public LiteralExpressionContext v;
		public TerminalNode EQ() { return getToken(DemoDBParser.EQ, 0); }
		public IdentifierOrStringContext identifierOrString() {
			return getRuleContext(IdentifierOrStringContext.class,0);
		}
		public LiteralExpressionContext literalExpression() {
			return getRuleContext(LiteralExpressionContext.class,0);
		}
		public HintMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterHintMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitHintMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitHintMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintMapContext hintMap() throws RecognitionException {
		HintMapContext _localctx = new HintMapContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_hintMap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			((HintMapContext)_localctx).k = identifierOrString();
			setState(487);
			match(EQ);
			setState(488);
			((HintMapContext)_localctx).v = literalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(DemoDBParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(DemoDBParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_joinCriteria);
		int _la;
		try {
			setState(504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				match(ON);
				setState(491);
				expression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				match(USING);
				setState(493);
				match(T__1);
				setState(494);
				identifier();
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(495);
					match(T__0);
					setState(496);
					identifier();
					}
					}
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(502);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnAliasesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ColumnAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterColumnAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitColumnAliases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitColumnAliases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasesContext columnAliases() throws RecognitionException {
		ColumnAliasesContext _localctx = new ColumnAliasesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_columnAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(T__1);
			setState(507);
			identifier();
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(508);
				match(T__0);
				setState(509);
				identifier();
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(515);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionNamesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(DemoDBParser.PARTITION, 0); }
		public TerminalNode PARTITIONS() { return getToken(DemoDBParser.PARTITIONS, 0); }
		public TerminalNode TEMPORARY() { return getToken(DemoDBParser.TEMPORARY, 0); }
		public PartitionNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterPartitionNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitPartitionNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitPartitionNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionNamesContext partitionNames() throws RecognitionException {
		PartitionNamesContext _localctx = new PartitionNamesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_partitionNames);
		int _la;
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(517);
					match(TEMPORARY);
					}
				}

				setState(520);
				_la = _input.LA(1);
				if ( !(_la==PARTITION || _la==PARTITIONS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(521);
				match(T__1);
				setState(522);
				identifier();
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(523);
					match(T__0);
					setState(524);
					identifier();
					}
					}
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(530);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(532);
					match(TEMPORARY);
					}
				}

				setState(535);
				_la = _input.LA(1);
				if ( !(_la==PARTITION || _la==PARTITIONS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(536);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TabletListContext extends ParserRuleContext {
		public TerminalNode TABLET() { return getToken(DemoDBParser.TABLET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(DemoDBParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(DemoDBParser.INTEGER_VALUE, i);
		}
		public TabletListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabletList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterTabletList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitTabletList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitTabletList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabletListContext tabletList() throws RecognitionException {
		TabletListContext _localctx = new TabletListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tabletList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(TABLET);
			setState(540);
			match(T__1);
			setState(541);
			match(INTEGER_VALUE);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(542);
				match(T__0);
				setState(543);
				match(INTEGER_VALUE);
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierOrStringContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public IdentifierOrStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterIdentifierOrString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitIdentifierOrString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitIdentifierOrString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierOrStringContext identifierOrString() throws RecognitionException {
		IdentifierOrStringContext _localctx = new IdentifierOrStringContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_identifierOrString);
		try {
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADMIN:
			case AFTER:
			case AGGREGATE:
			case ASYNC:
			case AUTHORS:
			case AVG:
			case BACKEND:
			case BACKENDS:
			case BACKUP:
			case BEGIN:
			case BITMAP_UNION:
			case BOOLEAN:
			case BROKER:
			case BUCKETS:
			case BUILTIN:
			case CAST:
			case CATALOG:
			case CATALOGS:
			case CEIL:
			case CHAIN:
			case CHARSET:
			case COLLATION:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPUTE:
			case CONFIG:
			case CONNECTION:
			case CONNECTION_ID:
			case CONSISTENT:
			case COSTS:
			case COUNT:
			case CURRENT:
			case DATA:
			case DATE:
			case DATETIME:
			case DAY:
			case DECOMMISSION:
			case DISTRIBUTION:
			case DUPLICATE:
			case DYNAMIC:
			case END:
			case ENGINE:
			case ENGINES:
			case ERRORS:
			case EVENTS:
			case EXECUTE:
			case EXTERNAL:
			case EXTRACT:
			case EVERY:
			case FILE:
			case FILTER:
			case FIRST:
			case FLOOR:
			case FN:
			case FOLLOWING:
			case FOLLOWER:
			case FORMAT:
			case FREE:
			case FRONTEND:
			case FRONTENDS:
			case FUNCTIONS:
			case GLOBAL:
			case GRANTS:
			case HASH:
			case HELP:
			case HISTOGRAM:
			case HLL_UNION:
			case HOUR:
			case HUB:
			case IDENTIFIED:
			case IMPERSONATE:
			case INDEXES:
			case INSTALL:
			case INTERMEDIATE:
			case INTERVAL:
			case OVERWRITE:
			case ISOLATION:
			case JOB:
			case LABEL:
			case LAST:
			case LESS:
			case LEVEL:
			case LIST:
			case LOCAL:
			case LOGICAL:
			case MANUAL:
			case MATERIALIZED:
			case MAX:
			case MERGE:
			case MIN:
			case MINUTE:
			case META:
			case MODE:
			case MODIFY:
			case MONTH:
			case NAME:
			case NAMES:
			case NEGATIVE:
			case NO:
			case NODE:
			case NULLS:
			case OBSERVER:
			case OFFSET:
			case ONLY:
			case OPEN:
			case OPTION:
			case PARTITIONS:
			case PASSWORD:
			case PATH:
			case PAUSE:
			case PERCENTILE_UNION:
			case PLUGIN:
			case PLUGINS:
			case PRECEDING:
			case PROC:
			case PROCESSLIST:
			case PROPERTIES:
			case PROPERTY:
			case QUARTER:
			case QUERY:
			case QUOTA:
			case RANDOM:
			case RECOVER:
			case REFRESH:
			case REPAIR:
			case REPEATABLE:
			case REPLACE_IF_NOT_NULL:
			case REPLICA:
			case REPOSITORY:
			case REPOSITORIES:
			case RESOURCE:
			case RESOURCES:
			case RESTORE:
			case RESUME:
			case RETURNS:
			case REVERT:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROLLUP:
			case ROUTINE:
			case SAMPLE:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SETS:
			case SIGNED:
			case SNAPSHOT:
			case SQLBLACKLIST:
			case START:
			case STATS:
			case STATUS:
			case STOP:
			case STORAGE:
			case STRING:
			case SUBMIT:
			case SUM:
			case SYNC:
			case TABLES:
			case TABLET:
			case TASK:
			case TEMPORARY:
			case THAN:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TRANSACTION:
			case TRIGGERS:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNINSTALL:
			case USER:
			case VALUE:
			case VARIABLES:
			case VERBOSE:
			case VIEW:
			case WARNINGS:
			case WEEK:
			case WHITELIST:
			case WORK:
			case WRITE:
			case YEAR:
			case LETTER_IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case DOTDOTDOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				identifier();
				}
				break;
			case SINGLE_QUOTED_TEXT:
			case DOUBLE_QUOTED_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			expression(0);
			setState(560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(556);
					match(T__0);
					setState(557);
					expression(0);
					}
					} 
				}
				setState(562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionDefaultContext extends ExpressionContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionDefaultContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalNotContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(DemoDBParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LogicalNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(DemoDBParser.AND, 0); }
		public TerminalNode LOGICAL_AND() { return getToken(DemoDBParser.LOGICAL_AND, 0); }
		public TerminalNode OR() { return getToken(DemoDBParser.OR, 0); }
		public TerminalNode LOGICAL_OR() { return getToken(DemoDBParser.LOGICAL_OR, 0); }
		public LogicalBinaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case T__8:
			case ADMIN:
			case AFTER:
			case AGGREGATE:
			case ARRAY:
			case ASYNC:
			case AUTHORS:
			case AVG:
			case BACKEND:
			case BACKENDS:
			case BACKUP:
			case BEGIN:
			case BITMAP_UNION:
			case BOOLEAN:
			case BROKER:
			case BUCKETS:
			case BUILTIN:
			case CASE:
			case CAST:
			case CATALOG:
			case CATALOGS:
			case CEIL:
			case CHAIN:
			case CHAR:
			case CHARSET:
			case COLLATION:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPUTE:
			case CONFIG:
			case CONNECTION:
			case CONNECTION_ID:
			case CONSISTENT:
			case CONVERT:
			case COSTS:
			case COUNT:
			case CURRENT:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATABASE:
			case DATE:
			case DATETIME:
			case DAY:
			case DECOMMISSION:
			case DENSE_RANK:
			case NTILE:
			case DISTRIBUTION:
			case DUPLICATE:
			case DYNAMIC:
			case END:
			case ENGINE:
			case ENGINES:
			case ERRORS:
			case EVENTS:
			case EXECUTE:
			case EXISTS:
			case EXTERNAL:
			case EXTRACT:
			case EVERY:
			case FALSE:
			case FILE:
			case FILTER:
			case FIRST:
			case FIRST_VALUE:
			case FLOOR:
			case FN:
			case FOLLOWING:
			case FOLLOWER:
			case FORMAT:
			case FREE:
			case FRONTEND:
			case FRONTENDS:
			case FUNCTIONS:
			case GLOBAL:
			case GRANTS:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case HELP:
			case HISTOGRAM:
			case HLL_UNION:
			case HOUR:
			case HUB:
			case IDENTIFIED:
			case IF:
			case IMPERSONATE:
			case INDEXES:
			case INSTALL:
			case INTERMEDIATE:
			case INTERVAL:
			case OVERWRITE:
			case ISOLATION:
			case JOB:
			case LABEL:
			case LAG:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEFT:
			case LESS:
			case LEVEL:
			case LIKE:
			case LIST:
			case LOCAL:
			case LOGICAL:
			case MANUAL:
			case MATERIALIZED:
			case MAX:
			case MERGE:
			case MIN:
			case MINUTE:
			case META:
			case MOD:
			case MODE:
			case MODIFY:
			case MONTH:
			case NAME:
			case NAMES:
			case NEGATIVE:
			case NO:
			case NODE:
			case NULL:
			case NULLS:
			case OBSERVER:
			case OFFSET:
			case ONLY:
			case OPEN:
			case OPTION:
			case PARTITIONS:
			case PASSWORD:
			case PATH:
			case PAUSE:
			case PERCENTILE_UNION:
			case PLUGIN:
			case PLUGINS:
			case PRECEDING:
			case PROC:
			case PROCESSLIST:
			case PROPERTIES:
			case PROPERTY:
			case QUARTER:
			case QUERY:
			case QUOTA:
			case RANDOM:
			case RANK:
			case RECOVER:
			case REFRESH:
			case REGEXP:
			case REPAIR:
			case REPEATABLE:
			case REPLACE:
			case REPLACE_IF_NOT_NULL:
			case REPLICA:
			case REPOSITORY:
			case REPOSITORIES:
			case RESOURCE:
			case RESOURCES:
			case RESTORE:
			case RESUME:
			case RETURNS:
			case REVERT:
			case RIGHT:
			case RLIKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROLLUP:
			case ROUTINE:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMA:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SETS:
			case SIGNED:
			case SNAPSHOT:
			case SQLBLACKLIST:
			case START:
			case STATS:
			case STATUS:
			case STOP:
			case STORAGE:
			case STRING:
			case SUBMIT:
			case SUM:
			case SYNC:
			case TABLES:
			case TABLET:
			case TASK:
			case TEMPORARY:
			case THAN:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TRANSACTION:
			case TRIGGERS:
			case TRUE:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNINSTALL:
			case USER:
			case VALUE:
			case VARIABLES:
			case VERBOSE:
			case VIEW:
			case WARNINGS:
			case WEEK:
			case WHITELIST:
			case WORK:
			case WRITE:
			case YEAR:
			case PLUS_SYMBOL:
			case MINUS_SYMBOL:
			case LOGICAL_NOT:
			case BITNOT:
			case AT:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_VALUE:
			case SINGLE_QUOTED_TEXT:
			case DOUBLE_QUOTED_TEXT:
			case LETTER_IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case DOTDOTDOT:
				{
				_localctx = new ExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(564);
				booleanExpression(0);
				}
				break;
			case NOT:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(565);
				match(NOT);
				setState(566);
				expression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(577);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(575);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new ExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(569);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(570);
						((LogicalBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==LOGICAL_AND) ) {
							((LogicalBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(571);
						((LogicalBinaryContext)_localctx).right = expression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new ExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(572);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(573);
						((LogicalBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==LOGICAL_OR) ) {
							((LogicalBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(574);
						((LogicalBinaryContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(T__1);
			setState(581);
			identifier();
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(582);
				match(T__0);
				setState(583);
				identifier();
				}
				}
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(589);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BackQuotedIdentifierContext extends IdentifierContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(DemoDBParser.BACKQUOTED_IDENTIFIER, 0); }
		public BackQuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterBackQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitBackQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitBackQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DigitIdentifierContext extends IdentifierContext {
		public TerminalNode DIGIT_IDENTIFIER() { return getToken(DemoDBParser.DIGIT_IDENTIFIER, 0); }
		public DigitIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterDigitIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitDigitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitDigitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode LETTER_IDENTIFIER() { return getToken(DemoDBParser.LETTER_IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_identifier);
		try {
			setState(595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				match(LETTER_IDENTIFIER);
				}
				break;
			case ADMIN:
			case AFTER:
			case AGGREGATE:
			case ASYNC:
			case AUTHORS:
			case AVG:
			case BACKEND:
			case BACKENDS:
			case BACKUP:
			case BEGIN:
			case BITMAP_UNION:
			case BOOLEAN:
			case BROKER:
			case BUCKETS:
			case BUILTIN:
			case CAST:
			case CATALOG:
			case CATALOGS:
			case CEIL:
			case CHAIN:
			case CHARSET:
			case COLLATION:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPUTE:
			case CONFIG:
			case CONNECTION:
			case CONNECTION_ID:
			case CONSISTENT:
			case COSTS:
			case COUNT:
			case CURRENT:
			case DATA:
			case DATE:
			case DATETIME:
			case DAY:
			case DECOMMISSION:
			case DISTRIBUTION:
			case DUPLICATE:
			case DYNAMIC:
			case END:
			case ENGINE:
			case ENGINES:
			case ERRORS:
			case EVENTS:
			case EXECUTE:
			case EXTERNAL:
			case EXTRACT:
			case EVERY:
			case FILE:
			case FILTER:
			case FIRST:
			case FLOOR:
			case FN:
			case FOLLOWING:
			case FOLLOWER:
			case FORMAT:
			case FREE:
			case FRONTEND:
			case FRONTENDS:
			case FUNCTIONS:
			case GLOBAL:
			case GRANTS:
			case HASH:
			case HELP:
			case HISTOGRAM:
			case HLL_UNION:
			case HOUR:
			case HUB:
			case IDENTIFIED:
			case IMPERSONATE:
			case INDEXES:
			case INSTALL:
			case INTERMEDIATE:
			case INTERVAL:
			case OVERWRITE:
			case ISOLATION:
			case JOB:
			case LABEL:
			case LAST:
			case LESS:
			case LEVEL:
			case LIST:
			case LOCAL:
			case LOGICAL:
			case MANUAL:
			case MATERIALIZED:
			case MAX:
			case MERGE:
			case MIN:
			case MINUTE:
			case META:
			case MODE:
			case MODIFY:
			case MONTH:
			case NAME:
			case NAMES:
			case NEGATIVE:
			case NO:
			case NODE:
			case NULLS:
			case OBSERVER:
			case OFFSET:
			case ONLY:
			case OPEN:
			case OPTION:
			case PARTITIONS:
			case PASSWORD:
			case PATH:
			case PAUSE:
			case PERCENTILE_UNION:
			case PLUGIN:
			case PLUGINS:
			case PRECEDING:
			case PROC:
			case PROCESSLIST:
			case PROPERTIES:
			case PROPERTY:
			case QUARTER:
			case QUERY:
			case QUOTA:
			case RANDOM:
			case RECOVER:
			case REFRESH:
			case REPAIR:
			case REPEATABLE:
			case REPLACE_IF_NOT_NULL:
			case REPLICA:
			case REPOSITORY:
			case REPOSITORIES:
			case RESOURCE:
			case RESOURCES:
			case RESTORE:
			case RESUME:
			case RETURNS:
			case REVERT:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROLLUP:
			case ROUTINE:
			case SAMPLE:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SETS:
			case SIGNED:
			case SNAPSHOT:
			case SQLBLACKLIST:
			case START:
			case STATS:
			case STATUS:
			case STOP:
			case STORAGE:
			case STRING:
			case SUBMIT:
			case SUM:
			case SYNC:
			case TABLES:
			case TABLET:
			case TASK:
			case TEMPORARY:
			case THAN:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TRANSACTION:
			case TRIGGERS:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNINSTALL:
			case USER:
			case VALUE:
			case VARIABLES:
			case VERBOSE:
			case VIEW:
			case WARNINGS:
			case WEEK:
			case WHITELIST:
			case WORK:
			case WRITE:
			case YEAR:
			case DOTDOTDOT:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				nonReserved();
				}
				break;
			case DIGIT_IDENTIFIER:
				_localctx = new DigitIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(593);
				match(DIGIT_IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new BackQuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(594);
				match(BACKQUOTED_IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode SINGLE_QUOTED_TEXT() { return getToken(DemoDBParser.SINGLE_QUOTED_TEXT, 0); }
		public TerminalNode DOUBLE_QUOTED_TEXT() { return getToken(DemoDBParser.DOUBLE_QUOTED_TEXT, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_QUOTED_TEXT || _la==DOUBLE_QUOTED_TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(DemoDBParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(DemoDBParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(DemoDBParser.LT, 0); }
		public TerminalNode LTE() { return getToken(DemoDBParser.LTE, 0); }
		public TerminalNode GT() { return getToken(DemoDBParser.GT, 0); }
		public TerminalNode GTE() { return getToken(DemoDBParser.GTE, 0); }
		public TerminalNode EQ_FOR_NULL() { return getToken(DemoDBParser.EQ_FOR_NULL, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_la = _input.LA(1);
			if ( !(((((_la - 352)) & ~0x3f) == 0 && ((1L << (_la - 352)) & ((1L << (EQ - 352)) | (1L << (NEQ - 352)) | (1L << (LT - 352)) | (1L << (LTE - 352)) | (1L << (GT - 352)) | (1L << (GTE - 352)) | (1L << (EQ_FOR_NULL - 352)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(DemoDBParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(DemoDBParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			identifier();
			setState(608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(604);
					match(T__3);
					setState(605);
					identifier();
					}
					} 
				}
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparisonContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public PredicateContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public ComparisonContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanExpressionDefaultContext extends BooleanExpressionContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public BooleanExpressionDefaultContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterBooleanExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitBooleanExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitBooleanExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsNullContext extends BooleanExpressionContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode IS() { return getToken(DemoDBParser.IS, 0); }
		public TerminalNode NULL() { return getToken(DemoDBParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(DemoDBParser.NOT, 0); }
		public IsNullContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterIsNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitIsNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitIsNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScalarSubqueryContext extends BooleanExpressionContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public QueryRelationContext queryRelation() {
			return getRuleContext(QueryRelationContext.class,0);
		}
		public ScalarSubqueryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterScalarSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitScalarSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitScalarSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_booleanExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BooleanExpressionDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(612);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(632);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(630);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						_localctx = new IsNullContext(new BooleanExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(614);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(615);
						match(IS);
						setState(617);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(616);
							match(NOT);
							}
						}

						setState(619);
						match(NULL);
						}
						break;
					case 2:
						{
						_localctx = new ComparisonContext(new BooleanExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(620);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(621);
						comparisonOperator();
						setState(622);
						((ComparisonContext)_localctx).right = predicate();
						}
						break;
					case 3:
						{
						_localctx = new ScalarSubqueryContext(new BooleanExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(624);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(625);
						comparisonOperator();
						setState(626);
						match(T__1);
						setState(627);
						queryRelation();
						setState(628);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(634);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateOperationsContext predicateOperations() {
			return getRuleContext(PredicateOperationsContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			((PredicateContext)_localctx).valueExpression = valueExpression(0);
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(636);
				predicateOperations(((PredicateContext)_localctx).valueExpression);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateOperationsContext extends ParserRuleContext {
		public ParserRuleContext value;
		public PredicateOperationsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PredicateOperationsContext(ParserRuleContext parent, int invokingState, ParserRuleContext value) {
			super(parent, invokingState);
			this.value = value;
		}
		@Override public int getRuleIndex() { return RULE_predicateOperations; }
	 
		public PredicateOperationsContext() { }
		public void copyFrom(PredicateOperationsContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class LikeContext extends PredicateOperationsContext {
		public ValueExpressionContext pattern;
		public TerminalNode LIKE() { return getToken(DemoDBParser.LIKE, 0); }
		public TerminalNode RLIKE() { return getToken(DemoDBParser.RLIKE, 0); }
		public TerminalNode REGEXP() { return getToken(DemoDBParser.REGEXP, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(DemoDBParser.NOT, 0); }
		public LikeContext(PredicateOperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InSubqueryContext extends PredicateOperationsContext {
		public TerminalNode IN() { return getToken(DemoDBParser.IN, 0); }
		public QueryRelationContext queryRelation() {
			return getRuleContext(QueryRelationContext.class,0);
		}
		public TerminalNode NOT() { return getToken(DemoDBParser.NOT, 0); }
		public InSubqueryContext(PredicateOperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterInSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitInSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitInSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InListContext extends PredicateOperationsContext {
		public TerminalNode IN() { return getToken(DemoDBParser.IN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode NOT() { return getToken(DemoDBParser.NOT, 0); }
		public InListContext(PredicateOperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterInList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitInList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitInList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenContext extends PredicateOperationsContext {
		public ValueExpressionContext lower;
		public PredicateContext upper;
		public TerminalNode BETWEEN() { return getToken(DemoDBParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(DemoDBParser.AND, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode NOT() { return getToken(DemoDBParser.NOT, 0); }
		public BetweenContext(PredicateOperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperationsContext predicateOperations(ParserRuleContext value) throws RecognitionException {
		PredicateOperationsContext _localctx = new PredicateOperationsContext(_ctx, getState(), value);
		enterRule(_localctx, 80, RULE_predicateOperations);
		int _la;
		try {
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				_localctx = new InListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(639);
					match(NOT);
					}
				}

				setState(642);
				match(IN);
				setState(643);
				match(T__1);
				setState(644);
				expressionList();
				setState(645);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new InSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(647);
					match(NOT);
					}
				}

				setState(650);
				match(IN);
				setState(651);
				match(T__1);
				setState(652);
				queryRelation();
				setState(653);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new BetweenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(655);
					match(NOT);
					}
				}

				setState(658);
				match(BETWEEN);
				setState(659);
				((BetweenContext)_localctx).lower = valueExpression(0);
				setState(660);
				match(AND);
				setState(661);
				((BetweenContext)_localctx).upper = predicate();
				}
				break;
			case 4:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(663);
					match(NOT);
					}
				}

				setState(666);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==REGEXP || _la==RLIKE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(667);
				((LikeContext)_localctx).pattern = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BITXOR() { return getToken(DemoDBParser.BITXOR, 0); }
		public TerminalNode ASTERISK_SYMBOL() { return getToken(DemoDBParser.ASTERISK_SYMBOL, 0); }
		public TerminalNode SLASH_SYMBOL() { return getToken(DemoDBParser.SLASH_SYMBOL, 0); }
		public TerminalNode PERCENT_SYMBOL() { return getToken(DemoDBParser.PERCENT_SYMBOL, 0); }
		public TerminalNode INT_DIV() { return getToken(DemoDBParser.INT_DIV, 0); }
		public TerminalNode MOD() { return getToken(DemoDBParser.MOD, 0); }
		public TerminalNode PLUS_SYMBOL() { return getToken(DemoDBParser.PLUS_SYMBOL, 0); }
		public TerminalNode MINUS_SYMBOL() { return getToken(DemoDBParser.MINUS_SYMBOL, 0); }
		public TerminalNode BITAND() { return getToken(DemoDBParser.BITAND, 0); }
		public TerminalNode BITOR() { return getToken(DemoDBParser.BITOR, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ValueExpressionDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(671);
			primaryExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(688);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(673);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(674);
						((ArithmeticBinaryContext)_localctx).operator = match(BITXOR);
						setState(675);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(676);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(677);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MOD || ((((_la - 361)) & ~0x3f) == 0 && ((1L << (_la - 361)) & ((1L << (ASTERISK_SYMBOL - 361)) | (1L << (SLASH_SYMBOL - 361)) | (1L << (PERCENT_SYMBOL - 361)) | (1L << (INT_DIV - 361)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(678);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(679);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(680);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS_SYMBOL || _la==MINUS_SYMBOL) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(681);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(682);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(683);
						((ArithmeticBinaryContext)_localctx).operator = match(BITAND);
						setState(684);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(685);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(686);
						((ArithmeticBinaryContext)_localctx).operator = match(BITOR);
						setState(687);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext caseExpr;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(DemoDBParser.CASE, 0); }
		public TerminalNode END() { return getToken(DemoDBParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DemoDBParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrowExpressionContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(DemoDBParser.ARROW, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ArrowExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterArrowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitArrowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitArrowExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OdbcFunctionCallExpressionContext extends PrimaryExpressionContext {
		public TerminalNode FN() { return getToken(DemoDBParser.FN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public OdbcFunctionCallExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterOdbcFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitOdbcFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitOdbcFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnRefContext extends PrimaryExpressionContext {
		public ColumnReferenceContext columnReference() {
			return getRuleContext(ColumnReferenceContext.class,0);
		}
		public ColumnRefContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterColumnRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitColumnRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitColumnRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SystemVariableExpressionContext extends PrimaryExpressionContext {
		public SystemVariableContext systemVariable() {
			return getRuleContext(SystemVariableContext.class,0);
		}
		public SystemVariableExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterSystemVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitSystemVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitSystemVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConvertContext extends PrimaryExpressionContext {
		public TerminalNode CONVERT() { return getToken(DemoDBParser.CONVERT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConvertContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterConvert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitConvert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitConvert(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext left;
		public PrimaryExpressionContext right;
		public TerminalNode CONCAT() { return getToken(DemoDBParser.CONCAT, 0); }
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public ConcatContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitConcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitConcat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaFunctionExprContext extends PrimaryExpressionContext {
		public TerminalNode ARROW() { return getToken(DemoDBParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public LambdaFunctionExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterLambdaFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitLambdaFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitLambdaFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CollectionSubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public CollectionSubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterCollectionSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitCollectionSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitCollectionSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralContext extends PrimaryExpressionContext {
		public LiteralExpressionContext literalExpression() {
			return getRuleContext(LiteralExpressionContext.class,0);
		}
		public LiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(DemoDBParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(DemoDBParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CollateContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(DemoDBParser.COLLATE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public CollateContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterCollate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitCollate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitCollate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UserVariableExpressionContext extends PrimaryExpressionContext {
		public UserVariableContext userVariable() {
			return getRuleContext(UserVariableContext.class,0);
		}
		public UserVariableExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterUserVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitUserVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitUserVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayConstructorContext extends PrimaryExpressionContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArrayConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterArrayConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitArrayConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArraySliceContext extends PrimaryExpressionContext {
		public Token start;
		public Token end;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(DemoDBParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(DemoDBParser.INTEGER_VALUE, i);
		}
		public ArraySliceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterArraySlice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitArraySlice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitArraySlice(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends PrimaryExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends PrimaryExpressionContext {
		public TerminalNode EXISTS() { return getToken(DemoDBParser.EXISTS, 0); }
		public QueryRelationContext queryRelation() {
			return getRuleContext(QueryRelationContext.class,0);
		}
		public ExistsContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(DemoDBParser.CASE, 0); }
		public TerminalNode END() { return getToken(DemoDBParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DemoDBParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends PrimaryExpressionContext {
		public Token operator;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode MINUS_SYMBOL() { return getToken(DemoDBParser.MINUS_SYMBOL, 0); }
		public TerminalNode PLUS_SYMBOL() { return getToken(DemoDBParser.PLUS_SYMBOL, 0); }
		public TerminalNode BITNOT() { return getToken(DemoDBParser.BITNOT, 0); }
		public TerminalNode LOGICAL_NOT() { return getToken(DemoDBParser.LOGICAL_NOT, 0); }
		public ArithmeticUnaryContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				_localctx = new UserVariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(694);
				userVariable();
				}
				break;
			case 2:
				{
				_localctx = new SystemVariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(695);
				systemVariable();
				}
				break;
			case 3:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(696);
				functionCall();
				}
				break;
			case 4:
				{
				_localctx = new OdbcFunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(697);
				match(T__8);
				setState(698);
				match(FN);
				setState(699);
				functionCall();
				setState(700);
				match(T__9);
				}
				break;
			case 5:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(702);
				literalExpression();
				}
				break;
			case 6:
				{
				_localctx = new ColumnRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(703);
				columnReference();
				}
				break;
			case 7:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(704);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 359)) & ~0x3f) == 0 && ((1L << (_la - 359)) & ((1L << (PLUS_SYMBOL - 359)) | (1L << (MINUS_SYMBOL - 359)) | (1L << (BITNOT - 359)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(705);
				primaryExpression(14);
				}
				break;
			case 8:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(706);
				((ArithmeticUnaryContext)_localctx).operator = match(LOGICAL_NOT);
				setState(707);
				primaryExpression(13);
				}
				break;
			case 9:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(708);
				match(T__1);
				setState(709);
				expression(0);
				setState(710);
				match(T__2);
				}
				break;
			case 10:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(712);
				match(EXISTS);
				setState(713);
				match(T__1);
				setState(714);
				queryRelation();
				setState(715);
				match(T__2);
				}
				break;
			case 11:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(717);
				subquery();
				}
				break;
			case 12:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(718);
				match(CAST);
				setState(719);
				match(T__1);
				setState(720);
				expression(0);
				setState(721);
				match(AS);
				setState(722);
				type();
				setState(723);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new ConvertContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(725);
				match(CONVERT);
				setState(726);
				match(T__1);
				setState(727);
				expression(0);
				setState(728);
				match(T__0);
				setState(729);
				type();
				setState(730);
				match(T__2);
				}
				break;
			case 14:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(732);
				match(CASE);
				setState(733);
				((SimpleCaseContext)_localctx).caseExpr = expression(0);
				setState(735); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(734);
					whenClause();
					}
					}
					setState(737); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(739);
					match(ELSE);
					setState(740);
					((SimpleCaseContext)_localctx).elseExpression = expression(0);
					}
				}

				setState(743);
				match(END);
				}
				break;
			case 15:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(745);
				match(CASE);
				setState(747); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(746);
					whenClause();
					}
					}
					setState(749); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(751);
					match(ELSE);
					setState(752);
					((SearchedCaseContext)_localctx).elseExpression = expression(0);
					}
				}

				setState(755);
				match(END);
				}
				break;
			case 16:
				{
				_localctx = new ArrayConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAY) {
					{
					setState(757);
					arrayType();
					}
				}

				setState(760);
				match(T__4);
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__4 - 2)) | (1L << (T__8 - 2)) | (1L << (ADMIN - 2)) | (1L << (AFTER - 2)) | (1L << (AGGREGATE - 2)) | (1L << (ARRAY - 2)) | (1L << (ASYNC - 2)) | (1L << (AUTHORS - 2)) | (1L << (AVG - 2)) | (1L << (BACKEND - 2)) | (1L << (BACKENDS - 2)) | (1L << (BACKUP - 2)) | (1L << (BEGIN - 2)) | (1L << (BITMAP_UNION - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BROKER - 2)) | (1L << (BUCKETS - 2)) | (1L << (BUILTIN - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CATALOG - 2)) | (1L << (CATALOGS - 2)) | (1L << (CEIL - 2)) | (1L << (CHAIN - 2)) | (1L << (CHAR - 2)) | (1L << (CHARSET - 2)) | (1L << (COLLATION - 2)) | (1L << (COLUMNS - 2)) | (1L << (COMMENT - 2)) | (1L << (COMMIT - 2)) | (1L << (COMMITTED - 2)) | (1L << (COMPUTE - 2)) | (1L << (CONFIG - 2)) | (1L << (CONNECTION - 2)) | (1L << (CONNECTION_ID - 2)) | (1L << (CONSISTENT - 2)) | (1L << (CONVERT - 2)) | (1L << (COSTS - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (COUNT - 66)) | (1L << (CURRENT - 66)) | (1L << (CURRENT_TIMESTAMP - 66)) | (1L << (CURRENT_USER - 66)) | (1L << (DATA - 66)) | (1L << (DATABASE - 66)) | (1L << (DATE - 66)) | (1L << (DATETIME - 66)) | (1L << (DAY - 66)) | (1L << (DECOMMISSION - 66)) | (1L << (DENSE_RANK - 66)) | (1L << (NTILE - 66)) | (1L << (DISTRIBUTION - 66)) | (1L << (DUPLICATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (END - 66)) | (1L << (ENGINE - 66)) | (1L << (ENGINES - 66)) | (1L << (ERRORS - 66)) | (1L << (EVENTS - 66)) | (1L << (EXECUTE - 66)) | (1L << (EXISTS - 66)) | (1L << (EXTERNAL - 66)) | (1L << (EXTRACT - 66)) | (1L << (EVERY - 66)) | (1L << (FALSE - 66)) | (1L << (FILE - 66)) | (1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FIRST_VALUE - 66)) | (1L << (FLOOR - 66)) | (1L << (FN - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FOLLOWER - 66)) | (1L << (FORMAT - 66)) | (1L << (FREE - 66)) | (1L << (FRONTEND - 66)) | (1L << (FRONTENDS - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (FUNCTIONS - 132)) | (1L << (GLOBAL - 132)) | (1L << (GRANTS - 132)) | (1L << (GROUPING - 132)) | (1L << (GROUPING_ID - 132)) | (1L << (HASH - 132)) | (1L << (HELP - 132)) | (1L << (HISTOGRAM - 132)) | (1L << (HLL_UNION - 132)) | (1L << (HOUR - 132)) | (1L << (HUB - 132)) | (1L << (IDENTIFIED - 132)) | (1L << (IF - 132)) | (1L << (IMPERSONATE - 132)) | (1L << (INDEXES - 132)) | (1L << (INSTALL - 132)) | (1L << (INTERMEDIATE - 132)) | (1L << (INTERVAL - 132)) | (1L << (OVERWRITE - 132)) | (1L << (ISOLATION - 132)) | (1L << (JOB - 132)) | (1L << (LABEL - 132)) | (1L << (LAG - 132)) | (1L << (LAST - 132)) | (1L << (LAST_VALUE - 132)) | (1L << (LEAD - 132)) | (1L << (LEFT - 132)) | (1L << (LESS - 132)) | (1L << (LEVEL - 132)) | (1L << (LIKE - 132)) | (1L << (LIST - 132)) | (1L << (LOCAL - 132)) | (1L << (LOGICAL - 132)) | (1L << (MANUAL - 132)) | (1L << (MATERIALIZED - 132)) | (1L << (MAX - 132)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (MERGE - 197)) | (1L << (MIN - 197)) | (1L << (MINUTE - 197)) | (1L << (META - 197)) | (1L << (MOD - 197)) | (1L << (MODE - 197)) | (1L << (MODIFY - 197)) | (1L << (MONTH - 197)) | (1L << (NAME - 197)) | (1L << (NAMES - 197)) | (1L << (NEGATIVE - 197)) | (1L << (NO - 197)) | (1L << (NODE - 197)) | (1L << (NOT - 197)) | (1L << (NULL - 197)) | (1L << (NULLS - 197)) | (1L << (OBSERVER - 197)) | (1L << (OFFSET - 197)) | (1L << (ONLY - 197)) | (1L << (OPEN - 197)) | (1L << (OPTION - 197)) | (1L << (PARTITIONS - 197)) | (1L << (PASSWORD - 197)) | (1L << (PATH - 197)) | (1L << (PAUSE - 197)) | (1L << (PERCENTILE_UNION - 197)) | (1L << (PLUGIN - 197)) | (1L << (PLUGINS - 197)) | (1L << (PRECEDING - 197)) | (1L << (PROC - 197)) | (1L << (PROCESSLIST - 197)) | (1L << (PROPERTIES - 197)) | (1L << (PROPERTY - 197)) | (1L << (QUARTER - 197)) | (1L << (QUERY - 197)) | (1L << (QUOTA - 197)) | (1L << (RANDOM - 197)) | (1L << (RANK - 197)) | (1L << (RECOVER - 197)) | (1L << (REFRESH - 197)) | (1L << (REGEXP - 197)) | (1L << (REPAIR - 197)) | (1L << (REPEATABLE - 197)) | (1L << (REPLACE - 197)) | (1L << (REPLACE_IF_NOT_NULL - 197)) | (1L << (REPLICA - 197)) | (1L << (REPOSITORY - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPOSITORIES - 261)) | (1L << (RESOURCE - 261)) | (1L << (RESOURCES - 261)) | (1L << (RESTORE - 261)) | (1L << (RESUME - 261)) | (1L << (RETURNS - 261)) | (1L << (REVERT - 261)) | (1L << (RIGHT - 261)) | (1L << (RLIKE - 261)) | (1L << (ROLE - 261)) | (1L << (ROLES - 261)) | (1L << (ROLLBACK - 261)) | (1L << (ROLLUP - 261)) | (1L << (ROUTINE - 261)) | (1L << (ROW_NUMBER - 261)) | (1L << (SAMPLE - 261)) | (1L << (SCHEMA - 261)) | (1L << (SECOND - 261)) | (1L << (SERIALIZABLE - 261)) | (1L << (SESSION - 261)) | (1L << (SETS - 261)) | (1L << (SIGNED - 261)) | (1L << (SNAPSHOT - 261)) | (1L << (SQLBLACKLIST - 261)) | (1L << (START - 261)) | (1L << (STATS - 261)) | (1L << (STATUS - 261)) | (1L << (STOP - 261)) | (1L << (STORAGE - 261)) | (1L << (STRING - 261)) | (1L << (SUBMIT - 261)) | (1L << (SUM - 261)) | (1L << (SYNC - 261)) | (1L << (TABLES - 261)) | (1L << (TABLET - 261)) | (1L << (TASK - 261)) | (1L << (TEMPORARY - 261)) | (1L << (THAN - 261)) | (1L << (TIME - 261)) | (1L << (TIMESTAMP - 261)) | (1L << (TIMESTAMPADD - 261)) | (1L << (TIMESTAMPDIFF - 261)) | (1L << (TRANSACTION - 261)) | (1L << (TRIGGERS - 261)) | (1L << (TRUE - 261)) | (1L << (TRUNCATE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (TYPE - 325)) | (1L << (TYPES - 325)) | (1L << (UNBOUNDED - 325)) | (1L << (UNCOMMITTED - 325)) | (1L << (UNINSTALL - 325)) | (1L << (USER - 325)) | (1L << (VALUE - 325)) | (1L << (VARIABLES - 325)) | (1L << (VERBOSE - 325)) | (1L << (VIEW - 325)) | (1L << (WARNINGS - 325)) | (1L << (WEEK - 325)) | (1L << (WHITELIST - 325)) | (1L << (WORK - 325)) | (1L << (WRITE - 325)) | (1L << (YEAR - 325)) | (1L << (PLUS_SYMBOL - 325)) | (1L << (MINUS_SYMBOL - 325)) | (1L << (LOGICAL_NOT - 325)) | (1L << (BITNOT - 325)) | (1L << (AT - 325)) | (1L << (INTEGER_VALUE - 325)) | (1L << (DECIMAL_VALUE - 325)) | (1L << (DOUBLE_VALUE - 325)) | (1L << (SINGLE_QUOTED_TEXT - 325)) | (1L << (DOUBLE_QUOTED_TEXT - 325)) | (1L << (LETTER_IDENTIFIER - 325)) | (1L << (DIGIT_IDENTIFIER - 325)) | (1L << (BACKQUOTED_IDENTIFIER - 325)) | (1L << (DOTDOTDOT - 325)))) != 0)) {
					{
					setState(761);
					expressionList();
					}
				}

				setState(764);
				match(T__5);
				}
				break;
			case 17:
				{
				_localctx = new LambdaFunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(767);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADMIN:
				case AFTER:
				case AGGREGATE:
				case ASYNC:
				case AUTHORS:
				case AVG:
				case BACKEND:
				case BACKENDS:
				case BACKUP:
				case BEGIN:
				case BITMAP_UNION:
				case BOOLEAN:
				case BROKER:
				case BUCKETS:
				case BUILTIN:
				case CAST:
				case CATALOG:
				case CATALOGS:
				case CEIL:
				case CHAIN:
				case CHARSET:
				case COLLATION:
				case COLUMNS:
				case COMMENT:
				case COMMIT:
				case COMMITTED:
				case COMPUTE:
				case CONFIG:
				case CONNECTION:
				case CONNECTION_ID:
				case CONSISTENT:
				case COSTS:
				case COUNT:
				case CURRENT:
				case DATA:
				case DATE:
				case DATETIME:
				case DAY:
				case DECOMMISSION:
				case DISTRIBUTION:
				case DUPLICATE:
				case DYNAMIC:
				case END:
				case ENGINE:
				case ENGINES:
				case ERRORS:
				case EVENTS:
				case EXECUTE:
				case EXTERNAL:
				case EXTRACT:
				case EVERY:
				case FILE:
				case FILTER:
				case FIRST:
				case FLOOR:
				case FN:
				case FOLLOWING:
				case FOLLOWER:
				case FORMAT:
				case FREE:
				case FRONTEND:
				case FRONTENDS:
				case FUNCTIONS:
				case GLOBAL:
				case GRANTS:
				case HASH:
				case HELP:
				case HISTOGRAM:
				case HLL_UNION:
				case HOUR:
				case HUB:
				case IDENTIFIED:
				case IMPERSONATE:
				case INDEXES:
				case INSTALL:
				case INTERMEDIATE:
				case INTERVAL:
				case OVERWRITE:
				case ISOLATION:
				case JOB:
				case LABEL:
				case LAST:
				case LESS:
				case LEVEL:
				case LIST:
				case LOCAL:
				case LOGICAL:
				case MANUAL:
				case MATERIALIZED:
				case MAX:
				case MERGE:
				case MIN:
				case MINUTE:
				case META:
				case MODE:
				case MODIFY:
				case MONTH:
				case NAME:
				case NAMES:
				case NEGATIVE:
				case NO:
				case NODE:
				case NULLS:
				case OBSERVER:
				case OFFSET:
				case ONLY:
				case OPEN:
				case OPTION:
				case PARTITIONS:
				case PASSWORD:
				case PATH:
				case PAUSE:
				case PERCENTILE_UNION:
				case PLUGIN:
				case PLUGINS:
				case PRECEDING:
				case PROC:
				case PROCESSLIST:
				case PROPERTIES:
				case PROPERTY:
				case QUARTER:
				case QUERY:
				case QUOTA:
				case RANDOM:
				case RECOVER:
				case REFRESH:
				case REPAIR:
				case REPEATABLE:
				case REPLACE_IF_NOT_NULL:
				case REPLICA:
				case REPOSITORY:
				case REPOSITORIES:
				case RESOURCE:
				case RESOURCES:
				case RESTORE:
				case RESUME:
				case RETURNS:
				case REVERT:
				case ROLE:
				case ROLES:
				case ROLLBACK:
				case ROLLUP:
				case ROUTINE:
				case SAMPLE:
				case SECOND:
				case SERIALIZABLE:
				case SESSION:
				case SETS:
				case SIGNED:
				case SNAPSHOT:
				case SQLBLACKLIST:
				case START:
				case STATS:
				case STATUS:
				case STOP:
				case STORAGE:
				case STRING:
				case SUBMIT:
				case SUM:
				case SYNC:
				case TABLES:
				case TABLET:
				case TASK:
				case TEMPORARY:
				case THAN:
				case TIME:
				case TIMESTAMP:
				case TIMESTAMPADD:
				case TIMESTAMPDIFF:
				case TRANSACTION:
				case TRIGGERS:
				case TRUNCATE:
				case TYPE:
				case TYPES:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNINSTALL:
				case USER:
				case VALUE:
				case VARIABLES:
				case VERBOSE:
				case VIEW:
				case WARNINGS:
				case WEEK:
				case WHITELIST:
				case WORK:
				case WRITE:
				case YEAR:
				case LETTER_IDENTIFIER:
				case DIGIT_IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
				case DOTDOTDOT:
					{
					setState(765);
					identifier();
					}
					break;
				case T__1:
					{
					setState(766);
					identifierList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(769);
				match(ARROW);
				setState(770);
				expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(803);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(801);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
					case 1:
						{
						_localctx = new ConcatContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((ConcatContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(774);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(775);
						match(CONCAT);
						setState(776);
						((ConcatContext)_localctx).right = primaryExpression(16);
						}
						break;
					case 2:
						{
						_localctx = new CollateContext(new PrimaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(777);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(778);
						match(COLLATE);
						setState(781);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ADMIN:
						case AFTER:
						case AGGREGATE:
						case ASYNC:
						case AUTHORS:
						case AVG:
						case BACKEND:
						case BACKENDS:
						case BACKUP:
						case BEGIN:
						case BITMAP_UNION:
						case BOOLEAN:
						case BROKER:
						case BUCKETS:
						case BUILTIN:
						case CAST:
						case CATALOG:
						case CATALOGS:
						case CEIL:
						case CHAIN:
						case CHARSET:
						case COLLATION:
						case COLUMNS:
						case COMMENT:
						case COMMIT:
						case COMMITTED:
						case COMPUTE:
						case CONFIG:
						case CONNECTION:
						case CONNECTION_ID:
						case CONSISTENT:
						case COSTS:
						case COUNT:
						case CURRENT:
						case DATA:
						case DATE:
						case DATETIME:
						case DAY:
						case DECOMMISSION:
						case DISTRIBUTION:
						case DUPLICATE:
						case DYNAMIC:
						case END:
						case ENGINE:
						case ENGINES:
						case ERRORS:
						case EVENTS:
						case EXECUTE:
						case EXTERNAL:
						case EXTRACT:
						case EVERY:
						case FILE:
						case FILTER:
						case FIRST:
						case FLOOR:
						case FN:
						case FOLLOWING:
						case FOLLOWER:
						case FORMAT:
						case FREE:
						case FRONTEND:
						case FRONTENDS:
						case FUNCTIONS:
						case GLOBAL:
						case GRANTS:
						case HASH:
						case HELP:
						case HISTOGRAM:
						case HLL_UNION:
						case HOUR:
						case HUB:
						case IDENTIFIED:
						case IMPERSONATE:
						case INDEXES:
						case INSTALL:
						case INTERMEDIATE:
						case INTERVAL:
						case OVERWRITE:
						case ISOLATION:
						case JOB:
						case LABEL:
						case LAST:
						case LESS:
						case LEVEL:
						case LIST:
						case LOCAL:
						case LOGICAL:
						case MANUAL:
						case MATERIALIZED:
						case MAX:
						case MERGE:
						case MIN:
						case MINUTE:
						case META:
						case MODE:
						case MODIFY:
						case MONTH:
						case NAME:
						case NAMES:
						case NEGATIVE:
						case NO:
						case NODE:
						case NULLS:
						case OBSERVER:
						case OFFSET:
						case ONLY:
						case OPEN:
						case OPTION:
						case PARTITIONS:
						case PASSWORD:
						case PATH:
						case PAUSE:
						case PERCENTILE_UNION:
						case PLUGIN:
						case PLUGINS:
						case PRECEDING:
						case PROC:
						case PROCESSLIST:
						case PROPERTIES:
						case PROPERTY:
						case QUARTER:
						case QUERY:
						case QUOTA:
						case RANDOM:
						case RECOVER:
						case REFRESH:
						case REPAIR:
						case REPEATABLE:
						case REPLACE_IF_NOT_NULL:
						case REPLICA:
						case REPOSITORY:
						case REPOSITORIES:
						case RESOURCE:
						case RESOURCES:
						case RESTORE:
						case RESUME:
						case RETURNS:
						case REVERT:
						case ROLE:
						case ROLES:
						case ROLLBACK:
						case ROLLUP:
						case ROUTINE:
						case SAMPLE:
						case SECOND:
						case SERIALIZABLE:
						case SESSION:
						case SETS:
						case SIGNED:
						case SNAPSHOT:
						case SQLBLACKLIST:
						case START:
						case STATS:
						case STATUS:
						case STOP:
						case STORAGE:
						case STRING:
						case SUBMIT:
						case SUM:
						case SYNC:
						case TABLES:
						case TABLET:
						case TASK:
						case TEMPORARY:
						case THAN:
						case TIME:
						case TIMESTAMP:
						case TIMESTAMPADD:
						case TIMESTAMPDIFF:
						case TRANSACTION:
						case TRIGGERS:
						case TRUNCATE:
						case TYPE:
						case TYPES:
						case UNBOUNDED:
						case UNCOMMITTED:
						case UNINSTALL:
						case USER:
						case VALUE:
						case VARIABLES:
						case VERBOSE:
						case VIEW:
						case WARNINGS:
						case WEEK:
						case WHITELIST:
						case WORK:
						case WRITE:
						case YEAR:
						case LETTER_IDENTIFIER:
						case DIGIT_IDENTIFIER:
						case BACKQUOTED_IDENTIFIER:
						case DOTDOTDOT:
							{
							setState(779);
							identifier();
							}
							break;
						case SINGLE_QUOTED_TEXT:
						case DOUBLE_QUOTED_TEXT:
							{
							setState(780);
							string();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 3:
						{
						_localctx = new CollectionSubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((CollectionSubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(783);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(784);
						match(T__4);
						setState(785);
						((CollectionSubscriptContext)_localctx).index = valueExpression(0);
						setState(786);
						match(T__5);
						}
						break;
					case 4:
						{
						_localctx = new ArraySliceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(788);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(789);
						match(T__4);
						setState(791);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INTEGER_VALUE) {
							{
							setState(790);
							((ArraySliceContext)_localctx).start = match(INTEGER_VALUE);
							}
						}

						setState(793);
						match(T__10);
						setState(795);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INTEGER_VALUE) {
							{
							setState(794);
							((ArraySliceContext)_localctx).end = match(INTEGER_VALUE);
							}
						}

						setState(797);
						match(T__5);
						}
						break;
					case 5:
						{
						_localctx = new ArrowExpressionContext(new PrimaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(798);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(799);
						match(ARROW);
						setState(800);
						string();
						}
						break;
					}
					} 
				}
				setState(805);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LiteralExpressionContext extends ParserRuleContext {
		public LiteralExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalExpression; }
	 
		public LiteralExpressionContext() { }
		public void copyFrom(LiteralExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends LiteralExpressionContext {
		public TerminalNode NULL() { return getToken(DemoDBParser.NULL, 0); }
		public NullLiteralContext(LiteralExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends LiteralExpressionContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringLiteralContext(LiteralExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DateLiteralContext extends LiteralExpressionContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode DATE() { return getToken(DemoDBParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(DemoDBParser.DATETIME, 0); }
		public DateLiteralContext(LiteralExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterDateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitDateLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitDateLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends LiteralExpressionContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(LiteralExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends LiteralExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(LiteralExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends LiteralExpressionContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(LiteralExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnitBoundaryLiteralContext extends LiteralExpressionContext {
		public UnitBoundaryContext unitBoundary() {
			return getRuleContext(UnitBoundaryContext.class,0);
		}
		public UnitBoundaryLiteralContext(LiteralExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterUnitBoundaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitUnitBoundaryLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitUnitBoundaryLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralExpressionContext literalExpression() throws RecognitionException {
		LiteralExpressionContext _localctx = new LiteralExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_literalExpression);
		int _la;
		try {
			setState(814);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				match(NULL);
				}
				break;
			case FALSE:
			case TRUE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				booleanValue();
				}
				break;
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_VALUE:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(808);
				number();
				}
				break;
			case DATE:
			case DATETIME:
				_localctx = new DateLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(809);
				_la = _input.LA(1);
				if ( !(_la==DATE || _la==DATETIME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(810);
				string();
				}
				break;
			case SINGLE_QUOTED_TEXT:
			case DOUBLE_QUOTED_TEXT:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(811);
				string();
				}
				break;
			case INTERVAL:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(812);
				interval();
				}
				break;
			case CEIL:
			case FLOOR:
				_localctx = new UnitBoundaryLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(813);
				unitBoundary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AggregationFunctionCallContext extends FunctionCallContext {
		public AggregationFunctionContext aggregationFunction() {
			return getRuleContext(AggregationFunctionContext.class,0);
		}
		public OverContext over() {
			return getRuleContext(OverContext.class,0);
		}
		public AggregationFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterAggregationFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitAggregationFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitAggregationFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends FunctionCallContext {
		public TerminalNode EXTRACT() { return getToken(DemoDBParser.EXTRACT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(DemoDBParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialFunctionContext extends FunctionCallContext {
		public SpecialFunctionExpressionContext specialFunctionExpression() {
			return getRuleContext(SpecialFunctionExpressionContext.class,0);
		}
		public SpecialFunctionContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterSpecialFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitSpecialFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitSpecialFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleFunctionCallContext extends FunctionCallContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OverContext over() {
			return getRuleContext(OverContext.class,0);
		}
		public SimpleFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterSimpleFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitSimpleFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitSimpleFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowFunctionCallContext extends FunctionCallContext {
		public WindowFunctionContext windowFunction() {
			return getRuleContext(WindowFunctionContext.class,0);
		}
		public OverContext over() {
			return getRuleContext(OverContext.class,0);
		}
		public WindowFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterWindowFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitWindowFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitWindowFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InformationFunctionContext extends FunctionCallContext {
		public InformationFunctionExpressionContext informationFunctionExpression() {
			return getRuleContext(InformationFunctionExpressionContext.class,0);
		}
		public InformationFunctionContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterInformationFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitInformationFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitInformationFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupingOperationContext extends FunctionCallContext {
		public TerminalNode GROUPING() { return getToken(DemoDBParser.GROUPING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GROUPING_ID() { return getToken(DemoDBParser.GROUPING_ID, 0); }
		public GroupingOperationContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterGroupingOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitGroupingOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitGroupingOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionCall);
		int _la;
		try {
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				_localctx = new ExtractContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				match(EXTRACT);
				setState(817);
				match(T__1);
				setState(818);
				identifier();
				setState(819);
				match(FROM);
				setState(820);
				valueExpression(0);
				setState(821);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new GroupingOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(823);
				match(GROUPING);
				setState(824);
				match(T__1);
				setState(833);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__4 - 2)) | (1L << (T__8 - 2)) | (1L << (ADMIN - 2)) | (1L << (AFTER - 2)) | (1L << (AGGREGATE - 2)) | (1L << (ARRAY - 2)) | (1L << (ASYNC - 2)) | (1L << (AUTHORS - 2)) | (1L << (AVG - 2)) | (1L << (BACKEND - 2)) | (1L << (BACKENDS - 2)) | (1L << (BACKUP - 2)) | (1L << (BEGIN - 2)) | (1L << (BITMAP_UNION - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BROKER - 2)) | (1L << (BUCKETS - 2)) | (1L << (BUILTIN - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CATALOG - 2)) | (1L << (CATALOGS - 2)) | (1L << (CEIL - 2)) | (1L << (CHAIN - 2)) | (1L << (CHAR - 2)) | (1L << (CHARSET - 2)) | (1L << (COLLATION - 2)) | (1L << (COLUMNS - 2)) | (1L << (COMMENT - 2)) | (1L << (COMMIT - 2)) | (1L << (COMMITTED - 2)) | (1L << (COMPUTE - 2)) | (1L << (CONFIG - 2)) | (1L << (CONNECTION - 2)) | (1L << (CONNECTION_ID - 2)) | (1L << (CONSISTENT - 2)) | (1L << (CONVERT - 2)) | (1L << (COSTS - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (COUNT - 66)) | (1L << (CURRENT - 66)) | (1L << (CURRENT_TIMESTAMP - 66)) | (1L << (CURRENT_USER - 66)) | (1L << (DATA - 66)) | (1L << (DATABASE - 66)) | (1L << (DATE - 66)) | (1L << (DATETIME - 66)) | (1L << (DAY - 66)) | (1L << (DECOMMISSION - 66)) | (1L << (DENSE_RANK - 66)) | (1L << (NTILE - 66)) | (1L << (DISTRIBUTION - 66)) | (1L << (DUPLICATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (END - 66)) | (1L << (ENGINE - 66)) | (1L << (ENGINES - 66)) | (1L << (ERRORS - 66)) | (1L << (EVENTS - 66)) | (1L << (EXECUTE - 66)) | (1L << (EXISTS - 66)) | (1L << (EXTERNAL - 66)) | (1L << (EXTRACT - 66)) | (1L << (EVERY - 66)) | (1L << (FALSE - 66)) | (1L << (FILE - 66)) | (1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FIRST_VALUE - 66)) | (1L << (FLOOR - 66)) | (1L << (FN - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FOLLOWER - 66)) | (1L << (FORMAT - 66)) | (1L << (FREE - 66)) | (1L << (FRONTEND - 66)) | (1L << (FRONTENDS - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (FUNCTIONS - 132)) | (1L << (GLOBAL - 132)) | (1L << (GRANTS - 132)) | (1L << (GROUPING - 132)) | (1L << (GROUPING_ID - 132)) | (1L << (HASH - 132)) | (1L << (HELP - 132)) | (1L << (HISTOGRAM - 132)) | (1L << (HLL_UNION - 132)) | (1L << (HOUR - 132)) | (1L << (HUB - 132)) | (1L << (IDENTIFIED - 132)) | (1L << (IF - 132)) | (1L << (IMPERSONATE - 132)) | (1L << (INDEXES - 132)) | (1L << (INSTALL - 132)) | (1L << (INTERMEDIATE - 132)) | (1L << (INTERVAL - 132)) | (1L << (OVERWRITE - 132)) | (1L << (ISOLATION - 132)) | (1L << (JOB - 132)) | (1L << (LABEL - 132)) | (1L << (LAG - 132)) | (1L << (LAST - 132)) | (1L << (LAST_VALUE - 132)) | (1L << (LEAD - 132)) | (1L << (LEFT - 132)) | (1L << (LESS - 132)) | (1L << (LEVEL - 132)) | (1L << (LIKE - 132)) | (1L << (LIST - 132)) | (1L << (LOCAL - 132)) | (1L << (LOGICAL - 132)) | (1L << (MANUAL - 132)) | (1L << (MATERIALIZED - 132)) | (1L << (MAX - 132)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (MERGE - 197)) | (1L << (MIN - 197)) | (1L << (MINUTE - 197)) | (1L << (META - 197)) | (1L << (MOD - 197)) | (1L << (MODE - 197)) | (1L << (MODIFY - 197)) | (1L << (MONTH - 197)) | (1L << (NAME - 197)) | (1L << (NAMES - 197)) | (1L << (NEGATIVE - 197)) | (1L << (NO - 197)) | (1L << (NODE - 197)) | (1L << (NOT - 197)) | (1L << (NULL - 197)) | (1L << (NULLS - 197)) | (1L << (OBSERVER - 197)) | (1L << (OFFSET - 197)) | (1L << (ONLY - 197)) | (1L << (OPEN - 197)) | (1L << (OPTION - 197)) | (1L << (PARTITIONS - 197)) | (1L << (PASSWORD - 197)) | (1L << (PATH - 197)) | (1L << (PAUSE - 197)) | (1L << (PERCENTILE_UNION - 197)) | (1L << (PLUGIN - 197)) | (1L << (PLUGINS - 197)) | (1L << (PRECEDING - 197)) | (1L << (PROC - 197)) | (1L << (PROCESSLIST - 197)) | (1L << (PROPERTIES - 197)) | (1L << (PROPERTY - 197)) | (1L << (QUARTER - 197)) | (1L << (QUERY - 197)) | (1L << (QUOTA - 197)) | (1L << (RANDOM - 197)) | (1L << (RANK - 197)) | (1L << (RECOVER - 197)) | (1L << (REFRESH - 197)) | (1L << (REGEXP - 197)) | (1L << (REPAIR - 197)) | (1L << (REPEATABLE - 197)) | (1L << (REPLACE - 197)) | (1L << (REPLACE_IF_NOT_NULL - 197)) | (1L << (REPLICA - 197)) | (1L << (REPOSITORY - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPOSITORIES - 261)) | (1L << (RESOURCE - 261)) | (1L << (RESOURCES - 261)) | (1L << (RESTORE - 261)) | (1L << (RESUME - 261)) | (1L << (RETURNS - 261)) | (1L << (REVERT - 261)) | (1L << (RIGHT - 261)) | (1L << (RLIKE - 261)) | (1L << (ROLE - 261)) | (1L << (ROLES - 261)) | (1L << (ROLLBACK - 261)) | (1L << (ROLLUP - 261)) | (1L << (ROUTINE - 261)) | (1L << (ROW_NUMBER - 261)) | (1L << (SAMPLE - 261)) | (1L << (SCHEMA - 261)) | (1L << (SECOND - 261)) | (1L << (SERIALIZABLE - 261)) | (1L << (SESSION - 261)) | (1L << (SETS - 261)) | (1L << (SIGNED - 261)) | (1L << (SNAPSHOT - 261)) | (1L << (SQLBLACKLIST - 261)) | (1L << (START - 261)) | (1L << (STATS - 261)) | (1L << (STATUS - 261)) | (1L << (STOP - 261)) | (1L << (STORAGE - 261)) | (1L << (STRING - 261)) | (1L << (SUBMIT - 261)) | (1L << (SUM - 261)) | (1L << (SYNC - 261)) | (1L << (TABLES - 261)) | (1L << (TABLET - 261)) | (1L << (TASK - 261)) | (1L << (TEMPORARY - 261)) | (1L << (THAN - 261)) | (1L << (TIME - 261)) | (1L << (TIMESTAMP - 261)) | (1L << (TIMESTAMPADD - 261)) | (1L << (TIMESTAMPDIFF - 261)) | (1L << (TRANSACTION - 261)) | (1L << (TRIGGERS - 261)) | (1L << (TRUE - 261)) | (1L << (TRUNCATE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (TYPE - 325)) | (1L << (TYPES - 325)) | (1L << (UNBOUNDED - 325)) | (1L << (UNCOMMITTED - 325)) | (1L << (UNINSTALL - 325)) | (1L << (USER - 325)) | (1L << (VALUE - 325)) | (1L << (VARIABLES - 325)) | (1L << (VERBOSE - 325)) | (1L << (VIEW - 325)) | (1L << (WARNINGS - 325)) | (1L << (WEEK - 325)) | (1L << (WHITELIST - 325)) | (1L << (WORK - 325)) | (1L << (WRITE - 325)) | (1L << (YEAR - 325)) | (1L << (PLUS_SYMBOL - 325)) | (1L << (MINUS_SYMBOL - 325)) | (1L << (LOGICAL_NOT - 325)) | (1L << (BITNOT - 325)) | (1L << (AT - 325)) | (1L << (INTEGER_VALUE - 325)) | (1L << (DECIMAL_VALUE - 325)) | (1L << (DOUBLE_VALUE - 325)) | (1L << (SINGLE_QUOTED_TEXT - 325)) | (1L << (DOUBLE_QUOTED_TEXT - 325)) | (1L << (LETTER_IDENTIFIER - 325)) | (1L << (DIGIT_IDENTIFIER - 325)) | (1L << (BACKQUOTED_IDENTIFIER - 325)) | (1L << (DOTDOTDOT - 325)))) != 0)) {
					{
					setState(825);
					expression(0);
					setState(830);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(826);
						match(T__0);
						setState(827);
						expression(0);
						}
						}
						setState(832);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(835);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new GroupingOperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(836);
				match(GROUPING_ID);
				setState(837);
				match(T__1);
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__4 - 2)) | (1L << (T__8 - 2)) | (1L << (ADMIN - 2)) | (1L << (AFTER - 2)) | (1L << (AGGREGATE - 2)) | (1L << (ARRAY - 2)) | (1L << (ASYNC - 2)) | (1L << (AUTHORS - 2)) | (1L << (AVG - 2)) | (1L << (BACKEND - 2)) | (1L << (BACKENDS - 2)) | (1L << (BACKUP - 2)) | (1L << (BEGIN - 2)) | (1L << (BITMAP_UNION - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BROKER - 2)) | (1L << (BUCKETS - 2)) | (1L << (BUILTIN - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CATALOG - 2)) | (1L << (CATALOGS - 2)) | (1L << (CEIL - 2)) | (1L << (CHAIN - 2)) | (1L << (CHAR - 2)) | (1L << (CHARSET - 2)) | (1L << (COLLATION - 2)) | (1L << (COLUMNS - 2)) | (1L << (COMMENT - 2)) | (1L << (COMMIT - 2)) | (1L << (COMMITTED - 2)) | (1L << (COMPUTE - 2)) | (1L << (CONFIG - 2)) | (1L << (CONNECTION - 2)) | (1L << (CONNECTION_ID - 2)) | (1L << (CONSISTENT - 2)) | (1L << (CONVERT - 2)) | (1L << (COSTS - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (COUNT - 66)) | (1L << (CURRENT - 66)) | (1L << (CURRENT_TIMESTAMP - 66)) | (1L << (CURRENT_USER - 66)) | (1L << (DATA - 66)) | (1L << (DATABASE - 66)) | (1L << (DATE - 66)) | (1L << (DATETIME - 66)) | (1L << (DAY - 66)) | (1L << (DECOMMISSION - 66)) | (1L << (DENSE_RANK - 66)) | (1L << (NTILE - 66)) | (1L << (DISTRIBUTION - 66)) | (1L << (DUPLICATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (END - 66)) | (1L << (ENGINE - 66)) | (1L << (ENGINES - 66)) | (1L << (ERRORS - 66)) | (1L << (EVENTS - 66)) | (1L << (EXECUTE - 66)) | (1L << (EXISTS - 66)) | (1L << (EXTERNAL - 66)) | (1L << (EXTRACT - 66)) | (1L << (EVERY - 66)) | (1L << (FALSE - 66)) | (1L << (FILE - 66)) | (1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FIRST_VALUE - 66)) | (1L << (FLOOR - 66)) | (1L << (FN - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FOLLOWER - 66)) | (1L << (FORMAT - 66)) | (1L << (FREE - 66)) | (1L << (FRONTEND - 66)) | (1L << (FRONTENDS - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (FUNCTIONS - 132)) | (1L << (GLOBAL - 132)) | (1L << (GRANTS - 132)) | (1L << (GROUPING - 132)) | (1L << (GROUPING_ID - 132)) | (1L << (HASH - 132)) | (1L << (HELP - 132)) | (1L << (HISTOGRAM - 132)) | (1L << (HLL_UNION - 132)) | (1L << (HOUR - 132)) | (1L << (HUB - 132)) | (1L << (IDENTIFIED - 132)) | (1L << (IF - 132)) | (1L << (IMPERSONATE - 132)) | (1L << (INDEXES - 132)) | (1L << (INSTALL - 132)) | (1L << (INTERMEDIATE - 132)) | (1L << (INTERVAL - 132)) | (1L << (OVERWRITE - 132)) | (1L << (ISOLATION - 132)) | (1L << (JOB - 132)) | (1L << (LABEL - 132)) | (1L << (LAG - 132)) | (1L << (LAST - 132)) | (1L << (LAST_VALUE - 132)) | (1L << (LEAD - 132)) | (1L << (LEFT - 132)) | (1L << (LESS - 132)) | (1L << (LEVEL - 132)) | (1L << (LIKE - 132)) | (1L << (LIST - 132)) | (1L << (LOCAL - 132)) | (1L << (LOGICAL - 132)) | (1L << (MANUAL - 132)) | (1L << (MATERIALIZED - 132)) | (1L << (MAX - 132)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (MERGE - 197)) | (1L << (MIN - 197)) | (1L << (MINUTE - 197)) | (1L << (META - 197)) | (1L << (MOD - 197)) | (1L << (MODE - 197)) | (1L << (MODIFY - 197)) | (1L << (MONTH - 197)) | (1L << (NAME - 197)) | (1L << (NAMES - 197)) | (1L << (NEGATIVE - 197)) | (1L << (NO - 197)) | (1L << (NODE - 197)) | (1L << (NOT - 197)) | (1L << (NULL - 197)) | (1L << (NULLS - 197)) | (1L << (OBSERVER - 197)) | (1L << (OFFSET - 197)) | (1L << (ONLY - 197)) | (1L << (OPEN - 197)) | (1L << (OPTION - 197)) | (1L << (PARTITIONS - 197)) | (1L << (PASSWORD - 197)) | (1L << (PATH - 197)) | (1L << (PAUSE - 197)) | (1L << (PERCENTILE_UNION - 197)) | (1L << (PLUGIN - 197)) | (1L << (PLUGINS - 197)) | (1L << (PRECEDING - 197)) | (1L << (PROC - 197)) | (1L << (PROCESSLIST - 197)) | (1L << (PROPERTIES - 197)) | (1L << (PROPERTY - 197)) | (1L << (QUARTER - 197)) | (1L << (QUERY - 197)) | (1L << (QUOTA - 197)) | (1L << (RANDOM - 197)) | (1L << (RANK - 197)) | (1L << (RECOVER - 197)) | (1L << (REFRESH - 197)) | (1L << (REGEXP - 197)) | (1L << (REPAIR - 197)) | (1L << (REPEATABLE - 197)) | (1L << (REPLACE - 197)) | (1L << (REPLACE_IF_NOT_NULL - 197)) | (1L << (REPLICA - 197)) | (1L << (REPOSITORY - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPOSITORIES - 261)) | (1L << (RESOURCE - 261)) | (1L << (RESOURCES - 261)) | (1L << (RESTORE - 261)) | (1L << (RESUME - 261)) | (1L << (RETURNS - 261)) | (1L << (REVERT - 261)) | (1L << (RIGHT - 261)) | (1L << (RLIKE - 261)) | (1L << (ROLE - 261)) | (1L << (ROLES - 261)) | (1L << (ROLLBACK - 261)) | (1L << (ROLLUP - 261)) | (1L << (ROUTINE - 261)) | (1L << (ROW_NUMBER - 261)) | (1L << (SAMPLE - 261)) | (1L << (SCHEMA - 261)) | (1L << (SECOND - 261)) | (1L << (SERIALIZABLE - 261)) | (1L << (SESSION - 261)) | (1L << (SETS - 261)) | (1L << (SIGNED - 261)) | (1L << (SNAPSHOT - 261)) | (1L << (SQLBLACKLIST - 261)) | (1L << (START - 261)) | (1L << (STATS - 261)) | (1L << (STATUS - 261)) | (1L << (STOP - 261)) | (1L << (STORAGE - 261)) | (1L << (STRING - 261)) | (1L << (SUBMIT - 261)) | (1L << (SUM - 261)) | (1L << (SYNC - 261)) | (1L << (TABLES - 261)) | (1L << (TABLET - 261)) | (1L << (TASK - 261)) | (1L << (TEMPORARY - 261)) | (1L << (THAN - 261)) | (1L << (TIME - 261)) | (1L << (TIMESTAMP - 261)) | (1L << (TIMESTAMPADD - 261)) | (1L << (TIMESTAMPDIFF - 261)) | (1L << (TRANSACTION - 261)) | (1L << (TRIGGERS - 261)) | (1L << (TRUE - 261)) | (1L << (TRUNCATE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (TYPE - 325)) | (1L << (TYPES - 325)) | (1L << (UNBOUNDED - 325)) | (1L << (UNCOMMITTED - 325)) | (1L << (UNINSTALL - 325)) | (1L << (USER - 325)) | (1L << (VALUE - 325)) | (1L << (VARIABLES - 325)) | (1L << (VERBOSE - 325)) | (1L << (VIEW - 325)) | (1L << (WARNINGS - 325)) | (1L << (WEEK - 325)) | (1L << (WHITELIST - 325)) | (1L << (WORK - 325)) | (1L << (WRITE - 325)) | (1L << (YEAR - 325)) | (1L << (PLUS_SYMBOL - 325)) | (1L << (MINUS_SYMBOL - 325)) | (1L << (LOGICAL_NOT - 325)) | (1L << (BITNOT - 325)) | (1L << (AT - 325)) | (1L << (INTEGER_VALUE - 325)) | (1L << (DECIMAL_VALUE - 325)) | (1L << (DOUBLE_VALUE - 325)) | (1L << (SINGLE_QUOTED_TEXT - 325)) | (1L << (DOUBLE_QUOTED_TEXT - 325)) | (1L << (LETTER_IDENTIFIER - 325)) | (1L << (DIGIT_IDENTIFIER - 325)) | (1L << (BACKQUOTED_IDENTIFIER - 325)) | (1L << (DOTDOTDOT - 325)))) != 0)) {
					{
					setState(838);
					expression(0);
					setState(843);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(839);
						match(T__0);
						setState(840);
						expression(0);
						}
						}
						setState(845);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(848);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new InformationFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(849);
				informationFunctionExpression();
				}
				break;
			case 5:
				_localctx = new SpecialFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(850);
				specialFunctionExpression();
				}
				break;
			case 6:
				_localctx = new AggregationFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(851);
				aggregationFunction();
				setState(853);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(852);
					over();
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new WindowFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(855);
				windowFunction();
				setState(856);
				over();
				}
				break;
			case 8:
				_localctx = new SimpleFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(858);
				qualifiedName();
				setState(859);
				match(T__1);
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__4 - 2)) | (1L << (T__8 - 2)) | (1L << (ADMIN - 2)) | (1L << (AFTER - 2)) | (1L << (AGGREGATE - 2)) | (1L << (ARRAY - 2)) | (1L << (ASYNC - 2)) | (1L << (AUTHORS - 2)) | (1L << (AVG - 2)) | (1L << (BACKEND - 2)) | (1L << (BACKENDS - 2)) | (1L << (BACKUP - 2)) | (1L << (BEGIN - 2)) | (1L << (BITMAP_UNION - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BROKER - 2)) | (1L << (BUCKETS - 2)) | (1L << (BUILTIN - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CATALOG - 2)) | (1L << (CATALOGS - 2)) | (1L << (CEIL - 2)) | (1L << (CHAIN - 2)) | (1L << (CHAR - 2)) | (1L << (CHARSET - 2)) | (1L << (COLLATION - 2)) | (1L << (COLUMNS - 2)) | (1L << (COMMENT - 2)) | (1L << (COMMIT - 2)) | (1L << (COMMITTED - 2)) | (1L << (COMPUTE - 2)) | (1L << (CONFIG - 2)) | (1L << (CONNECTION - 2)) | (1L << (CONNECTION_ID - 2)) | (1L << (CONSISTENT - 2)) | (1L << (CONVERT - 2)) | (1L << (COSTS - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (COUNT - 66)) | (1L << (CURRENT - 66)) | (1L << (CURRENT_TIMESTAMP - 66)) | (1L << (CURRENT_USER - 66)) | (1L << (DATA - 66)) | (1L << (DATABASE - 66)) | (1L << (DATE - 66)) | (1L << (DATETIME - 66)) | (1L << (DAY - 66)) | (1L << (DECOMMISSION - 66)) | (1L << (DENSE_RANK - 66)) | (1L << (NTILE - 66)) | (1L << (DISTRIBUTION - 66)) | (1L << (DUPLICATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (END - 66)) | (1L << (ENGINE - 66)) | (1L << (ENGINES - 66)) | (1L << (ERRORS - 66)) | (1L << (EVENTS - 66)) | (1L << (EXECUTE - 66)) | (1L << (EXISTS - 66)) | (1L << (EXTERNAL - 66)) | (1L << (EXTRACT - 66)) | (1L << (EVERY - 66)) | (1L << (FALSE - 66)) | (1L << (FILE - 66)) | (1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FIRST_VALUE - 66)) | (1L << (FLOOR - 66)) | (1L << (FN - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FOLLOWER - 66)) | (1L << (FORMAT - 66)) | (1L << (FREE - 66)) | (1L << (FRONTEND - 66)) | (1L << (FRONTENDS - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (FUNCTIONS - 132)) | (1L << (GLOBAL - 132)) | (1L << (GRANTS - 132)) | (1L << (GROUPING - 132)) | (1L << (GROUPING_ID - 132)) | (1L << (HASH - 132)) | (1L << (HELP - 132)) | (1L << (HISTOGRAM - 132)) | (1L << (HLL_UNION - 132)) | (1L << (HOUR - 132)) | (1L << (HUB - 132)) | (1L << (IDENTIFIED - 132)) | (1L << (IF - 132)) | (1L << (IMPERSONATE - 132)) | (1L << (INDEXES - 132)) | (1L << (INSTALL - 132)) | (1L << (INTERMEDIATE - 132)) | (1L << (INTERVAL - 132)) | (1L << (OVERWRITE - 132)) | (1L << (ISOLATION - 132)) | (1L << (JOB - 132)) | (1L << (LABEL - 132)) | (1L << (LAG - 132)) | (1L << (LAST - 132)) | (1L << (LAST_VALUE - 132)) | (1L << (LEAD - 132)) | (1L << (LEFT - 132)) | (1L << (LESS - 132)) | (1L << (LEVEL - 132)) | (1L << (LIKE - 132)) | (1L << (LIST - 132)) | (1L << (LOCAL - 132)) | (1L << (LOGICAL - 132)) | (1L << (MANUAL - 132)) | (1L << (MATERIALIZED - 132)) | (1L << (MAX - 132)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (MERGE - 197)) | (1L << (MIN - 197)) | (1L << (MINUTE - 197)) | (1L << (META - 197)) | (1L << (MOD - 197)) | (1L << (MODE - 197)) | (1L << (MODIFY - 197)) | (1L << (MONTH - 197)) | (1L << (NAME - 197)) | (1L << (NAMES - 197)) | (1L << (NEGATIVE - 197)) | (1L << (NO - 197)) | (1L << (NODE - 197)) | (1L << (NOT - 197)) | (1L << (NULL - 197)) | (1L << (NULLS - 197)) | (1L << (OBSERVER - 197)) | (1L << (OFFSET - 197)) | (1L << (ONLY - 197)) | (1L << (OPEN - 197)) | (1L << (OPTION - 197)) | (1L << (PARTITIONS - 197)) | (1L << (PASSWORD - 197)) | (1L << (PATH - 197)) | (1L << (PAUSE - 197)) | (1L << (PERCENTILE_UNION - 197)) | (1L << (PLUGIN - 197)) | (1L << (PLUGINS - 197)) | (1L << (PRECEDING - 197)) | (1L << (PROC - 197)) | (1L << (PROCESSLIST - 197)) | (1L << (PROPERTIES - 197)) | (1L << (PROPERTY - 197)) | (1L << (QUARTER - 197)) | (1L << (QUERY - 197)) | (1L << (QUOTA - 197)) | (1L << (RANDOM - 197)) | (1L << (RANK - 197)) | (1L << (RECOVER - 197)) | (1L << (REFRESH - 197)) | (1L << (REGEXP - 197)) | (1L << (REPAIR - 197)) | (1L << (REPEATABLE - 197)) | (1L << (REPLACE - 197)) | (1L << (REPLACE_IF_NOT_NULL - 197)) | (1L << (REPLICA - 197)) | (1L << (REPOSITORY - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPOSITORIES - 261)) | (1L << (RESOURCE - 261)) | (1L << (RESOURCES - 261)) | (1L << (RESTORE - 261)) | (1L << (RESUME - 261)) | (1L << (RETURNS - 261)) | (1L << (REVERT - 261)) | (1L << (RIGHT - 261)) | (1L << (RLIKE - 261)) | (1L << (ROLE - 261)) | (1L << (ROLES - 261)) | (1L << (ROLLBACK - 261)) | (1L << (ROLLUP - 261)) | (1L << (ROUTINE - 261)) | (1L << (ROW_NUMBER - 261)) | (1L << (SAMPLE - 261)) | (1L << (SCHEMA - 261)) | (1L << (SECOND - 261)) | (1L << (SERIALIZABLE - 261)) | (1L << (SESSION - 261)) | (1L << (SETS - 261)) | (1L << (SIGNED - 261)) | (1L << (SNAPSHOT - 261)) | (1L << (SQLBLACKLIST - 261)) | (1L << (START - 261)) | (1L << (STATS - 261)) | (1L << (STATUS - 261)) | (1L << (STOP - 261)) | (1L << (STORAGE - 261)) | (1L << (STRING - 261)) | (1L << (SUBMIT - 261)) | (1L << (SUM - 261)) | (1L << (SYNC - 261)) | (1L << (TABLES - 261)) | (1L << (TABLET - 261)) | (1L << (TASK - 261)) | (1L << (TEMPORARY - 261)) | (1L << (THAN - 261)) | (1L << (TIME - 261)) | (1L << (TIMESTAMP - 261)) | (1L << (TIMESTAMPADD - 261)) | (1L << (TIMESTAMPDIFF - 261)) | (1L << (TRANSACTION - 261)) | (1L << (TRIGGERS - 261)) | (1L << (TRUE - 261)) | (1L << (TRUNCATE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (TYPE - 325)) | (1L << (TYPES - 325)) | (1L << (UNBOUNDED - 325)) | (1L << (UNCOMMITTED - 325)) | (1L << (UNINSTALL - 325)) | (1L << (USER - 325)) | (1L << (VALUE - 325)) | (1L << (VARIABLES - 325)) | (1L << (VERBOSE - 325)) | (1L << (VIEW - 325)) | (1L << (WARNINGS - 325)) | (1L << (WEEK - 325)) | (1L << (WHITELIST - 325)) | (1L << (WORK - 325)) | (1L << (WRITE - 325)) | (1L << (YEAR - 325)) | (1L << (PLUS_SYMBOL - 325)) | (1L << (MINUS_SYMBOL - 325)) | (1L << (LOGICAL_NOT - 325)) | (1L << (BITNOT - 325)) | (1L << (AT - 325)) | (1L << (INTEGER_VALUE - 325)) | (1L << (DECIMAL_VALUE - 325)) | (1L << (DOUBLE_VALUE - 325)) | (1L << (SINGLE_QUOTED_TEXT - 325)) | (1L << (DOUBLE_QUOTED_TEXT - 325)) | (1L << (LETTER_IDENTIFIER - 325)) | (1L << (DIGIT_IDENTIFIER - 325)) | (1L << (BACKQUOTED_IDENTIFIER - 325)) | (1L << (DOTDOTDOT - 325)))) != 0)) {
					{
					setState(860);
					expression(0);
					setState(865);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(861);
						match(T__0);
						setState(862);
						expression(0);
						}
						}
						setState(867);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(870);
				match(T__2);
				setState(872);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(871);
					over();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationFunctionContext extends ParserRuleContext {
		public TerminalNode AVG() { return getToken(DemoDBParser.AVG, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DISTINCT() { return getToken(DemoDBParser.DISTINCT, 0); }
		public TerminalNode COUNT() { return getToken(DemoDBParser.COUNT, 0); }
		public TerminalNode ASTERISK_SYMBOL() { return getToken(DemoDBParser.ASTERISK_SYMBOL, 0); }
		public TerminalNode MAX() { return getToken(DemoDBParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(DemoDBParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(DemoDBParser.SUM, 0); }
		public AggregationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterAggregationFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitAggregationFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitAggregationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_aggregationFunction);
		int _la;
		try {
			setState(930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				match(AVG);
				setState(877);
				match(T__1);
				setState(879);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(878);
					match(DISTINCT);
					}
				}

				setState(881);
				expression(0);
				setState(882);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(884);
				match(COUNT);
				setState(885);
				match(T__1);
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASTERISK_SYMBOL) {
					{
					setState(886);
					match(ASTERISK_SYMBOL);
					}
				}

				setState(889);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(890);
				match(COUNT);
				setState(891);
				match(T__1);
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(892);
					match(DISTINCT);
					}
				}

				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__4 - 2)) | (1L << (T__8 - 2)) | (1L << (ADMIN - 2)) | (1L << (AFTER - 2)) | (1L << (AGGREGATE - 2)) | (1L << (ARRAY - 2)) | (1L << (ASYNC - 2)) | (1L << (AUTHORS - 2)) | (1L << (AVG - 2)) | (1L << (BACKEND - 2)) | (1L << (BACKENDS - 2)) | (1L << (BACKUP - 2)) | (1L << (BEGIN - 2)) | (1L << (BITMAP_UNION - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BROKER - 2)) | (1L << (BUCKETS - 2)) | (1L << (BUILTIN - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CATALOG - 2)) | (1L << (CATALOGS - 2)) | (1L << (CEIL - 2)) | (1L << (CHAIN - 2)) | (1L << (CHAR - 2)) | (1L << (CHARSET - 2)) | (1L << (COLLATION - 2)) | (1L << (COLUMNS - 2)) | (1L << (COMMENT - 2)) | (1L << (COMMIT - 2)) | (1L << (COMMITTED - 2)) | (1L << (COMPUTE - 2)) | (1L << (CONFIG - 2)) | (1L << (CONNECTION - 2)) | (1L << (CONNECTION_ID - 2)) | (1L << (CONSISTENT - 2)) | (1L << (CONVERT - 2)) | (1L << (COSTS - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (COUNT - 66)) | (1L << (CURRENT - 66)) | (1L << (CURRENT_TIMESTAMP - 66)) | (1L << (CURRENT_USER - 66)) | (1L << (DATA - 66)) | (1L << (DATABASE - 66)) | (1L << (DATE - 66)) | (1L << (DATETIME - 66)) | (1L << (DAY - 66)) | (1L << (DECOMMISSION - 66)) | (1L << (DENSE_RANK - 66)) | (1L << (NTILE - 66)) | (1L << (DISTRIBUTION - 66)) | (1L << (DUPLICATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (END - 66)) | (1L << (ENGINE - 66)) | (1L << (ENGINES - 66)) | (1L << (ERRORS - 66)) | (1L << (EVENTS - 66)) | (1L << (EXECUTE - 66)) | (1L << (EXISTS - 66)) | (1L << (EXTERNAL - 66)) | (1L << (EXTRACT - 66)) | (1L << (EVERY - 66)) | (1L << (FALSE - 66)) | (1L << (FILE - 66)) | (1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FIRST_VALUE - 66)) | (1L << (FLOOR - 66)) | (1L << (FN - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FOLLOWER - 66)) | (1L << (FORMAT - 66)) | (1L << (FREE - 66)) | (1L << (FRONTEND - 66)) | (1L << (FRONTENDS - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (FUNCTIONS - 132)) | (1L << (GLOBAL - 132)) | (1L << (GRANTS - 132)) | (1L << (GROUPING - 132)) | (1L << (GROUPING_ID - 132)) | (1L << (HASH - 132)) | (1L << (HELP - 132)) | (1L << (HISTOGRAM - 132)) | (1L << (HLL_UNION - 132)) | (1L << (HOUR - 132)) | (1L << (HUB - 132)) | (1L << (IDENTIFIED - 132)) | (1L << (IF - 132)) | (1L << (IMPERSONATE - 132)) | (1L << (INDEXES - 132)) | (1L << (INSTALL - 132)) | (1L << (INTERMEDIATE - 132)) | (1L << (INTERVAL - 132)) | (1L << (OVERWRITE - 132)) | (1L << (ISOLATION - 132)) | (1L << (JOB - 132)) | (1L << (LABEL - 132)) | (1L << (LAG - 132)) | (1L << (LAST - 132)) | (1L << (LAST_VALUE - 132)) | (1L << (LEAD - 132)) | (1L << (LEFT - 132)) | (1L << (LESS - 132)) | (1L << (LEVEL - 132)) | (1L << (LIKE - 132)) | (1L << (LIST - 132)) | (1L << (LOCAL - 132)) | (1L << (LOGICAL - 132)) | (1L << (MANUAL - 132)) | (1L << (MATERIALIZED - 132)) | (1L << (MAX - 132)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (MERGE - 197)) | (1L << (MIN - 197)) | (1L << (MINUTE - 197)) | (1L << (META - 197)) | (1L << (MOD - 197)) | (1L << (MODE - 197)) | (1L << (MODIFY - 197)) | (1L << (MONTH - 197)) | (1L << (NAME - 197)) | (1L << (NAMES - 197)) | (1L << (NEGATIVE - 197)) | (1L << (NO - 197)) | (1L << (NODE - 197)) | (1L << (NOT - 197)) | (1L << (NULL - 197)) | (1L << (NULLS - 197)) | (1L << (OBSERVER - 197)) | (1L << (OFFSET - 197)) | (1L << (ONLY - 197)) | (1L << (OPEN - 197)) | (1L << (OPTION - 197)) | (1L << (PARTITIONS - 197)) | (1L << (PASSWORD - 197)) | (1L << (PATH - 197)) | (1L << (PAUSE - 197)) | (1L << (PERCENTILE_UNION - 197)) | (1L << (PLUGIN - 197)) | (1L << (PLUGINS - 197)) | (1L << (PRECEDING - 197)) | (1L << (PROC - 197)) | (1L << (PROCESSLIST - 197)) | (1L << (PROPERTIES - 197)) | (1L << (PROPERTY - 197)) | (1L << (QUARTER - 197)) | (1L << (QUERY - 197)) | (1L << (QUOTA - 197)) | (1L << (RANDOM - 197)) | (1L << (RANK - 197)) | (1L << (RECOVER - 197)) | (1L << (REFRESH - 197)) | (1L << (REGEXP - 197)) | (1L << (REPAIR - 197)) | (1L << (REPEATABLE - 197)) | (1L << (REPLACE - 197)) | (1L << (REPLACE_IF_NOT_NULL - 197)) | (1L << (REPLICA - 197)) | (1L << (REPOSITORY - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPOSITORIES - 261)) | (1L << (RESOURCE - 261)) | (1L << (RESOURCES - 261)) | (1L << (RESTORE - 261)) | (1L << (RESUME - 261)) | (1L << (RETURNS - 261)) | (1L << (REVERT - 261)) | (1L << (RIGHT - 261)) | (1L << (RLIKE - 261)) | (1L << (ROLE - 261)) | (1L << (ROLES - 261)) | (1L << (ROLLBACK - 261)) | (1L << (ROLLUP - 261)) | (1L << (ROUTINE - 261)) | (1L << (ROW_NUMBER - 261)) | (1L << (SAMPLE - 261)) | (1L << (SCHEMA - 261)) | (1L << (SECOND - 261)) | (1L << (SERIALIZABLE - 261)) | (1L << (SESSION - 261)) | (1L << (SETS - 261)) | (1L << (SIGNED - 261)) | (1L << (SNAPSHOT - 261)) | (1L << (SQLBLACKLIST - 261)) | (1L << (START - 261)) | (1L << (STATS - 261)) | (1L << (STATUS - 261)) | (1L << (STOP - 261)) | (1L << (STORAGE - 261)) | (1L << (STRING - 261)) | (1L << (SUBMIT - 261)) | (1L << (SUM - 261)) | (1L << (SYNC - 261)) | (1L << (TABLES - 261)) | (1L << (TABLET - 261)) | (1L << (TASK - 261)) | (1L << (TEMPORARY - 261)) | (1L << (THAN - 261)) | (1L << (TIME - 261)) | (1L << (TIMESTAMP - 261)) | (1L << (TIMESTAMPADD - 261)) | (1L << (TIMESTAMPDIFF - 261)) | (1L << (TRANSACTION - 261)) | (1L << (TRIGGERS - 261)) | (1L << (TRUE - 261)) | (1L << (TRUNCATE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (TYPE - 325)) | (1L << (TYPES - 325)) | (1L << (UNBOUNDED - 325)) | (1L << (UNCOMMITTED - 325)) | (1L << (UNINSTALL - 325)) | (1L << (USER - 325)) | (1L << (VALUE - 325)) | (1L << (VARIABLES - 325)) | (1L << (VERBOSE - 325)) | (1L << (VIEW - 325)) | (1L << (WARNINGS - 325)) | (1L << (WEEK - 325)) | (1L << (WHITELIST - 325)) | (1L << (WORK - 325)) | (1L << (WRITE - 325)) | (1L << (YEAR - 325)) | (1L << (PLUS_SYMBOL - 325)) | (1L << (MINUS_SYMBOL - 325)) | (1L << (LOGICAL_NOT - 325)) | (1L << (BITNOT - 325)) | (1L << (AT - 325)) | (1L << (INTEGER_VALUE - 325)) | (1L << (DECIMAL_VALUE - 325)) | (1L << (DOUBLE_VALUE - 325)) | (1L << (SINGLE_QUOTED_TEXT - 325)) | (1L << (DOUBLE_QUOTED_TEXT - 325)) | (1L << (LETTER_IDENTIFIER - 325)) | (1L << (DIGIT_IDENTIFIER - 325)) | (1L << (BACKQUOTED_IDENTIFIER - 325)) | (1L << (DOTDOTDOT - 325)))) != 0)) {
					{
					setState(895);
					expression(0);
					setState(900);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(896);
						match(T__0);
						setState(897);
						expression(0);
						}
						}
						setState(902);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(905);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(906);
				match(MAX);
				setState(907);
				match(T__1);
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(908);
					match(DISTINCT);
					}
				}

				setState(911);
				expression(0);
				setState(912);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(914);
				match(MIN);
				setState(915);
				match(T__1);
				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(916);
					match(DISTINCT);
					}
				}

				setState(919);
				expression(0);
				setState(920);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(922);
				match(SUM);
				setState(923);
				match(T__1);
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(924);
					match(DISTINCT);
					}
				}

				setState(927);
				expression(0);
				setState(928);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserVariableContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(DemoDBParser.AT, 0); }
		public IdentifierOrStringContext identifierOrString() {
			return getRuleContext(IdentifierOrStringContext.class,0);
		}
		public UserVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterUserVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitUserVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitUserVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserVariableContext userVariable() throws RecognitionException {
		UserVariableContext _localctx = new UserVariableContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_userVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			match(AT);
			setState(933);
			identifierOrString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SystemVariableContext extends ParserRuleContext {
		public List<TerminalNode> AT() { return getTokens(DemoDBParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(DemoDBParser.AT, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public SystemVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterSystemVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitSystemVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitSystemVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemVariableContext systemVariable() throws RecognitionException {
		SystemVariableContext _localctx = new SystemVariableContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_systemVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(AT);
			setState(936);
			match(AT);
			setState(940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(937);
				varType();
				setState(938);
				match(T__3);
				}
				break;
			}
			setState(942);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnReferenceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ColumnReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnReferenceContext columnReference() throws RecognitionException {
		ColumnReferenceContext _localctx = new ColumnReferenceContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_columnReference);
		try {
			setState(946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(944);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(945);
				qualifiedName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InformationFunctionExpressionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode DATABASE() { return getToken(DemoDBParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(DemoDBParser.SCHEMA, 0); }
		public TerminalNode USER() { return getToken(DemoDBParser.USER, 0); }
		public TerminalNode CONNECTION_ID() { return getToken(DemoDBParser.CONNECTION_ID, 0); }
		public TerminalNode CURRENT_USER() { return getToken(DemoDBParser.CURRENT_USER, 0); }
		public InformationFunctionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_informationFunctionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterInformationFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitInformationFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitInformationFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InformationFunctionExpressionContext informationFunctionExpression() throws RecognitionException {
		InformationFunctionExpressionContext _localctx = new InformationFunctionExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_informationFunctionExpression);
		try {
			setState(963);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATABASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				((InformationFunctionExpressionContext)_localctx).name = match(DATABASE);
				setState(949);
				match(T__1);
				setState(950);
				match(T__2);
				}
				break;
			case SCHEMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				((InformationFunctionExpressionContext)_localctx).name = match(SCHEMA);
				setState(952);
				match(T__1);
				setState(953);
				match(T__2);
				}
				break;
			case USER:
				enterOuterAlt(_localctx, 3);
				{
				setState(954);
				((InformationFunctionExpressionContext)_localctx).name = match(USER);
				setState(955);
				match(T__1);
				setState(956);
				match(T__2);
				}
				break;
			case CONNECTION_ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(957);
				((InformationFunctionExpressionContext)_localctx).name = match(CONNECTION_ID);
				setState(958);
				match(T__1);
				setState(959);
				match(T__2);
				}
				break;
			case CURRENT_USER:
				enterOuterAlt(_localctx, 5);
				{
				setState(960);
				((InformationFunctionExpressionContext)_localctx).name = match(CURRENT_USER);
				setState(961);
				match(T__1);
				setState(962);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialFunctionExpressionContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(DemoDBParser.CHAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(DemoDBParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode DAY() { return getToken(DemoDBParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(DemoDBParser.HOUR, 0); }
		public TerminalNode IF() { return getToken(DemoDBParser.IF, 0); }
		public TerminalNode LEFT() { return getToken(DemoDBParser.LEFT, 0); }
		public TerminalNode LIKE() { return getToken(DemoDBParser.LIKE, 0); }
		public TerminalNode MINUTE() { return getToken(DemoDBParser.MINUTE, 0); }
		public TerminalNode MOD() { return getToken(DemoDBParser.MOD, 0); }
		public TerminalNode MONTH() { return getToken(DemoDBParser.MONTH, 0); }
		public TerminalNode QUARTER() { return getToken(DemoDBParser.QUARTER, 0); }
		public TerminalNode REGEXP() { return getToken(DemoDBParser.REGEXP, 0); }
		public TerminalNode REPLACE() { return getToken(DemoDBParser.REPLACE, 0); }
		public TerminalNode RIGHT() { return getToken(DemoDBParser.RIGHT, 0); }
		public TerminalNode RLIKE() { return getToken(DemoDBParser.RLIKE, 0); }
		public TerminalNode SECOND() { return getToken(DemoDBParser.SECOND, 0); }
		public TerminalNode TIMESTAMPADD() { return getToken(DemoDBParser.TIMESTAMPADD, 0); }
		public UnitIdentifierContext unitIdentifier() {
			return getRuleContext(UnitIdentifierContext.class,0);
		}
		public TerminalNode TIMESTAMPDIFF() { return getToken(DemoDBParser.TIMESTAMPDIFF, 0); }
		public TerminalNode YEAR() { return getToken(DemoDBParser.YEAR, 0); }
		public TerminalNode PASSWORD() { return getToken(DemoDBParser.PASSWORD, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode FLOOR() { return getToken(DemoDBParser.FLOOR, 0); }
		public TerminalNode CEIL() { return getToken(DemoDBParser.CEIL, 0); }
		public SpecialFunctionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialFunctionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterSpecialFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitSpecialFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitSpecialFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialFunctionExpressionContext specialFunctionExpression() throws RecognitionException {
		SpecialFunctionExpressionContext _localctx = new SpecialFunctionExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_specialFunctionExpression);
		int _la;
		try {
			setState(1109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(965);
				match(CHAR);
				setState(966);
				match(T__1);
				setState(967);
				expression(0);
				setState(968);
				match(T__2);
				}
				break;
			case CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(970);
				match(CURRENT_TIMESTAMP);
				setState(971);
				match(T__1);
				setState(972);
				match(T__2);
				}
				break;
			case DAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(973);
				match(DAY);
				setState(974);
				match(T__1);
				setState(975);
				expression(0);
				setState(976);
				match(T__2);
				}
				break;
			case HOUR:
				enterOuterAlt(_localctx, 4);
				{
				setState(978);
				match(HOUR);
				setState(979);
				match(T__1);
				setState(980);
				expression(0);
				setState(981);
				match(T__2);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(983);
				match(IF);
				setState(984);
				match(T__1);
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__4 - 2)) | (1L << (T__8 - 2)) | (1L << (ADMIN - 2)) | (1L << (AFTER - 2)) | (1L << (AGGREGATE - 2)) | (1L << (ARRAY - 2)) | (1L << (ASYNC - 2)) | (1L << (AUTHORS - 2)) | (1L << (AVG - 2)) | (1L << (BACKEND - 2)) | (1L << (BACKENDS - 2)) | (1L << (BACKUP - 2)) | (1L << (BEGIN - 2)) | (1L << (BITMAP_UNION - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BROKER - 2)) | (1L << (BUCKETS - 2)) | (1L << (BUILTIN - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CATALOG - 2)) | (1L << (CATALOGS - 2)) | (1L << (CEIL - 2)) | (1L << (CHAIN - 2)) | (1L << (CHAR - 2)) | (1L << (CHARSET - 2)) | (1L << (COLLATION - 2)) | (1L << (COLUMNS - 2)) | (1L << (COMMENT - 2)) | (1L << (COMMIT - 2)) | (1L << (COMMITTED - 2)) | (1L << (COMPUTE - 2)) | (1L << (CONFIG - 2)) | (1L << (CONNECTION - 2)) | (1L << (CONNECTION_ID - 2)) | (1L << (CONSISTENT - 2)) | (1L << (CONVERT - 2)) | (1L << (COSTS - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (COUNT - 66)) | (1L << (CURRENT - 66)) | (1L << (CURRENT_TIMESTAMP - 66)) | (1L << (CURRENT_USER - 66)) | (1L << (DATA - 66)) | (1L << (DATABASE - 66)) | (1L << (DATE - 66)) | (1L << (DATETIME - 66)) | (1L << (DAY - 66)) | (1L << (DECOMMISSION - 66)) | (1L << (DENSE_RANK - 66)) | (1L << (NTILE - 66)) | (1L << (DISTRIBUTION - 66)) | (1L << (DUPLICATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (END - 66)) | (1L << (ENGINE - 66)) | (1L << (ENGINES - 66)) | (1L << (ERRORS - 66)) | (1L << (EVENTS - 66)) | (1L << (EXECUTE - 66)) | (1L << (EXISTS - 66)) | (1L << (EXTERNAL - 66)) | (1L << (EXTRACT - 66)) | (1L << (EVERY - 66)) | (1L << (FALSE - 66)) | (1L << (FILE - 66)) | (1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FIRST_VALUE - 66)) | (1L << (FLOOR - 66)) | (1L << (FN - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FOLLOWER - 66)) | (1L << (FORMAT - 66)) | (1L << (FREE - 66)) | (1L << (FRONTEND - 66)) | (1L << (FRONTENDS - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (FUNCTIONS - 132)) | (1L << (GLOBAL - 132)) | (1L << (GRANTS - 132)) | (1L << (GROUPING - 132)) | (1L << (GROUPING_ID - 132)) | (1L << (HASH - 132)) | (1L << (HELP - 132)) | (1L << (HISTOGRAM - 132)) | (1L << (HLL_UNION - 132)) | (1L << (HOUR - 132)) | (1L << (HUB - 132)) | (1L << (IDENTIFIED - 132)) | (1L << (IF - 132)) | (1L << (IMPERSONATE - 132)) | (1L << (INDEXES - 132)) | (1L << (INSTALL - 132)) | (1L << (INTERMEDIATE - 132)) | (1L << (INTERVAL - 132)) | (1L << (OVERWRITE - 132)) | (1L << (ISOLATION - 132)) | (1L << (JOB - 132)) | (1L << (LABEL - 132)) | (1L << (LAG - 132)) | (1L << (LAST - 132)) | (1L << (LAST_VALUE - 132)) | (1L << (LEAD - 132)) | (1L << (LEFT - 132)) | (1L << (LESS - 132)) | (1L << (LEVEL - 132)) | (1L << (LIKE - 132)) | (1L << (LIST - 132)) | (1L << (LOCAL - 132)) | (1L << (LOGICAL - 132)) | (1L << (MANUAL - 132)) | (1L << (MATERIALIZED - 132)) | (1L << (MAX - 132)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (MERGE - 197)) | (1L << (MIN - 197)) | (1L << (MINUTE - 197)) | (1L << (META - 197)) | (1L << (MOD - 197)) | (1L << (MODE - 197)) | (1L << (MODIFY - 197)) | (1L << (MONTH - 197)) | (1L << (NAME - 197)) | (1L << (NAMES - 197)) | (1L << (NEGATIVE - 197)) | (1L << (NO - 197)) | (1L << (NODE - 197)) | (1L << (NOT - 197)) | (1L << (NULL - 197)) | (1L << (NULLS - 197)) | (1L << (OBSERVER - 197)) | (1L << (OFFSET - 197)) | (1L << (ONLY - 197)) | (1L << (OPEN - 197)) | (1L << (OPTION - 197)) | (1L << (PARTITIONS - 197)) | (1L << (PASSWORD - 197)) | (1L << (PATH - 197)) | (1L << (PAUSE - 197)) | (1L << (PERCENTILE_UNION - 197)) | (1L << (PLUGIN - 197)) | (1L << (PLUGINS - 197)) | (1L << (PRECEDING - 197)) | (1L << (PROC - 197)) | (1L << (PROCESSLIST - 197)) | (1L << (PROPERTIES - 197)) | (1L << (PROPERTY - 197)) | (1L << (QUARTER - 197)) | (1L << (QUERY - 197)) | (1L << (QUOTA - 197)) | (1L << (RANDOM - 197)) | (1L << (RANK - 197)) | (1L << (RECOVER - 197)) | (1L << (REFRESH - 197)) | (1L << (REGEXP - 197)) | (1L << (REPAIR - 197)) | (1L << (REPEATABLE - 197)) | (1L << (REPLACE - 197)) | (1L << (REPLACE_IF_NOT_NULL - 197)) | (1L << (REPLICA - 197)) | (1L << (REPOSITORY - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPOSITORIES - 261)) | (1L << (RESOURCE - 261)) | (1L << (RESOURCES - 261)) | (1L << (RESTORE - 261)) | (1L << (RESUME - 261)) | (1L << (RETURNS - 261)) | (1L << (REVERT - 261)) | (1L << (RIGHT - 261)) | (1L << (RLIKE - 261)) | (1L << (ROLE - 261)) | (1L << (ROLES - 261)) | (1L << (ROLLBACK - 261)) | (1L << (ROLLUP - 261)) | (1L << (ROUTINE - 261)) | (1L << (ROW_NUMBER - 261)) | (1L << (SAMPLE - 261)) | (1L << (SCHEMA - 261)) | (1L << (SECOND - 261)) | (1L << (SERIALIZABLE - 261)) | (1L << (SESSION - 261)) | (1L << (SETS - 261)) | (1L << (SIGNED - 261)) | (1L << (SNAPSHOT - 261)) | (1L << (SQLBLACKLIST - 261)) | (1L << (START - 261)) | (1L << (STATS - 261)) | (1L << (STATUS - 261)) | (1L << (STOP - 261)) | (1L << (STORAGE - 261)) | (1L << (STRING - 261)) | (1L << (SUBMIT - 261)) | (1L << (SUM - 261)) | (1L << (SYNC - 261)) | (1L << (TABLES - 261)) | (1L << (TABLET - 261)) | (1L << (TASK - 261)) | (1L << (TEMPORARY - 261)) | (1L << (THAN - 261)) | (1L << (TIME - 261)) | (1L << (TIMESTAMP - 261)) | (1L << (TIMESTAMPADD - 261)) | (1L << (TIMESTAMPDIFF - 261)) | (1L << (TRANSACTION - 261)) | (1L << (TRIGGERS - 261)) | (1L << (TRUE - 261)) | (1L << (TRUNCATE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (TYPE - 325)) | (1L << (TYPES - 325)) | (1L << (UNBOUNDED - 325)) | (1L << (UNCOMMITTED - 325)) | (1L << (UNINSTALL - 325)) | (1L << (USER - 325)) | (1L << (VALUE - 325)) | (1L << (VARIABLES - 325)) | (1L << (VERBOSE - 325)) | (1L << (VIEW - 325)) | (1L << (WARNINGS - 325)) | (1L << (WEEK - 325)) | (1L << (WHITELIST - 325)) | (1L << (WORK - 325)) | (1L << (WRITE - 325)) | (1L << (YEAR - 325)) | (1L << (PLUS_SYMBOL - 325)) | (1L << (MINUS_SYMBOL - 325)) | (1L << (LOGICAL_NOT - 325)) | (1L << (BITNOT - 325)) | (1L << (AT - 325)) | (1L << (INTEGER_VALUE - 325)) | (1L << (DECIMAL_VALUE - 325)) | (1L << (DOUBLE_VALUE - 325)) | (1L << (SINGLE_QUOTED_TEXT - 325)) | (1L << (DOUBLE_QUOTED_TEXT - 325)) | (1L << (LETTER_IDENTIFIER - 325)) | (1L << (DIGIT_IDENTIFIER - 325)) | (1L << (BACKQUOTED_IDENTIFIER - 325)) | (1L << (DOTDOTDOT - 325)))) != 0)) {
					{
					setState(985);
					expression(0);
					setState(990);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(986);
						match(T__0);
						setState(987);
						expression(0);
						}
						}
						setState(992);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(995);
				match(T__2);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 6);
				{
				setState(996);
				match(LEFT);
				setState(997);
				match(T__1);
				setState(998);
				expression(0);
				setState(999);
				match(T__0);
				setState(1000);
				expression(0);
				setState(1001);
				match(T__2);
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1003);
				match(LIKE);
				setState(1004);
				match(T__1);
				setState(1005);
				expression(0);
				setState(1006);
				match(T__0);
				setState(1007);
				expression(0);
				setState(1008);
				match(T__2);
				}
				break;
			case MINUTE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1010);
				match(MINUTE);
				setState(1011);
				match(T__1);
				setState(1012);
				expression(0);
				setState(1013);
				match(T__2);
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 9);
				{
				setState(1015);
				match(MOD);
				setState(1016);
				match(T__1);
				setState(1017);
				expression(0);
				setState(1018);
				match(T__0);
				setState(1019);
				expression(0);
				setState(1020);
				match(T__2);
				}
				break;
			case MONTH:
				enterOuterAlt(_localctx, 10);
				{
				setState(1022);
				match(MONTH);
				setState(1023);
				match(T__1);
				setState(1024);
				expression(0);
				setState(1025);
				match(T__2);
				}
				break;
			case QUARTER:
				enterOuterAlt(_localctx, 11);
				{
				setState(1027);
				match(QUARTER);
				setState(1028);
				match(T__1);
				setState(1029);
				expression(0);
				setState(1030);
				match(T__2);
				}
				break;
			case REGEXP:
				enterOuterAlt(_localctx, 12);
				{
				setState(1032);
				match(REGEXP);
				setState(1033);
				match(T__1);
				setState(1034);
				expression(0);
				setState(1035);
				match(T__0);
				setState(1036);
				expression(0);
				setState(1037);
				match(T__2);
				}
				break;
			case REPLACE:
				enterOuterAlt(_localctx, 13);
				{
				setState(1039);
				match(REPLACE);
				setState(1040);
				match(T__1);
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__4 - 2)) | (1L << (T__8 - 2)) | (1L << (ADMIN - 2)) | (1L << (AFTER - 2)) | (1L << (AGGREGATE - 2)) | (1L << (ARRAY - 2)) | (1L << (ASYNC - 2)) | (1L << (AUTHORS - 2)) | (1L << (AVG - 2)) | (1L << (BACKEND - 2)) | (1L << (BACKENDS - 2)) | (1L << (BACKUP - 2)) | (1L << (BEGIN - 2)) | (1L << (BITMAP_UNION - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BROKER - 2)) | (1L << (BUCKETS - 2)) | (1L << (BUILTIN - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CATALOG - 2)) | (1L << (CATALOGS - 2)) | (1L << (CEIL - 2)) | (1L << (CHAIN - 2)) | (1L << (CHAR - 2)) | (1L << (CHARSET - 2)) | (1L << (COLLATION - 2)) | (1L << (COLUMNS - 2)) | (1L << (COMMENT - 2)) | (1L << (COMMIT - 2)) | (1L << (COMMITTED - 2)) | (1L << (COMPUTE - 2)) | (1L << (CONFIG - 2)) | (1L << (CONNECTION - 2)) | (1L << (CONNECTION_ID - 2)) | (1L << (CONSISTENT - 2)) | (1L << (CONVERT - 2)) | (1L << (COSTS - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (COUNT - 66)) | (1L << (CURRENT - 66)) | (1L << (CURRENT_TIMESTAMP - 66)) | (1L << (CURRENT_USER - 66)) | (1L << (DATA - 66)) | (1L << (DATABASE - 66)) | (1L << (DATE - 66)) | (1L << (DATETIME - 66)) | (1L << (DAY - 66)) | (1L << (DECOMMISSION - 66)) | (1L << (DENSE_RANK - 66)) | (1L << (NTILE - 66)) | (1L << (DISTRIBUTION - 66)) | (1L << (DUPLICATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (END - 66)) | (1L << (ENGINE - 66)) | (1L << (ENGINES - 66)) | (1L << (ERRORS - 66)) | (1L << (EVENTS - 66)) | (1L << (EXECUTE - 66)) | (1L << (EXISTS - 66)) | (1L << (EXTERNAL - 66)) | (1L << (EXTRACT - 66)) | (1L << (EVERY - 66)) | (1L << (FALSE - 66)) | (1L << (FILE - 66)) | (1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FIRST_VALUE - 66)) | (1L << (FLOOR - 66)) | (1L << (FN - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FOLLOWER - 66)) | (1L << (FORMAT - 66)) | (1L << (FREE - 66)) | (1L << (FRONTEND - 66)) | (1L << (FRONTENDS - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (FUNCTIONS - 132)) | (1L << (GLOBAL - 132)) | (1L << (GRANTS - 132)) | (1L << (GROUPING - 132)) | (1L << (GROUPING_ID - 132)) | (1L << (HASH - 132)) | (1L << (HELP - 132)) | (1L << (HISTOGRAM - 132)) | (1L << (HLL_UNION - 132)) | (1L << (HOUR - 132)) | (1L << (HUB - 132)) | (1L << (IDENTIFIED - 132)) | (1L << (IF - 132)) | (1L << (IMPERSONATE - 132)) | (1L << (INDEXES - 132)) | (1L << (INSTALL - 132)) | (1L << (INTERMEDIATE - 132)) | (1L << (INTERVAL - 132)) | (1L << (OVERWRITE - 132)) | (1L << (ISOLATION - 132)) | (1L << (JOB - 132)) | (1L << (LABEL - 132)) | (1L << (LAG - 132)) | (1L << (LAST - 132)) | (1L << (LAST_VALUE - 132)) | (1L << (LEAD - 132)) | (1L << (LEFT - 132)) | (1L << (LESS - 132)) | (1L << (LEVEL - 132)) | (1L << (LIKE - 132)) | (1L << (LIST - 132)) | (1L << (LOCAL - 132)) | (1L << (LOGICAL - 132)) | (1L << (MANUAL - 132)) | (1L << (MATERIALIZED - 132)) | (1L << (MAX - 132)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (MERGE - 197)) | (1L << (MIN - 197)) | (1L << (MINUTE - 197)) | (1L << (META - 197)) | (1L << (MOD - 197)) | (1L << (MODE - 197)) | (1L << (MODIFY - 197)) | (1L << (MONTH - 197)) | (1L << (NAME - 197)) | (1L << (NAMES - 197)) | (1L << (NEGATIVE - 197)) | (1L << (NO - 197)) | (1L << (NODE - 197)) | (1L << (NOT - 197)) | (1L << (NULL - 197)) | (1L << (NULLS - 197)) | (1L << (OBSERVER - 197)) | (1L << (OFFSET - 197)) | (1L << (ONLY - 197)) | (1L << (OPEN - 197)) | (1L << (OPTION - 197)) | (1L << (PARTITIONS - 197)) | (1L << (PASSWORD - 197)) | (1L << (PATH - 197)) | (1L << (PAUSE - 197)) | (1L << (PERCENTILE_UNION - 197)) | (1L << (PLUGIN - 197)) | (1L << (PLUGINS - 197)) | (1L << (PRECEDING - 197)) | (1L << (PROC - 197)) | (1L << (PROCESSLIST - 197)) | (1L << (PROPERTIES - 197)) | (1L << (PROPERTY - 197)) | (1L << (QUARTER - 197)) | (1L << (QUERY - 197)) | (1L << (QUOTA - 197)) | (1L << (RANDOM - 197)) | (1L << (RANK - 197)) | (1L << (RECOVER - 197)) | (1L << (REFRESH - 197)) | (1L << (REGEXP - 197)) | (1L << (REPAIR - 197)) | (1L << (REPEATABLE - 197)) | (1L << (REPLACE - 197)) | (1L << (REPLACE_IF_NOT_NULL - 197)) | (1L << (REPLICA - 197)) | (1L << (REPOSITORY - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPOSITORIES - 261)) | (1L << (RESOURCE - 261)) | (1L << (RESOURCES - 261)) | (1L << (RESTORE - 261)) | (1L << (RESUME - 261)) | (1L << (RETURNS - 261)) | (1L << (REVERT - 261)) | (1L << (RIGHT - 261)) | (1L << (RLIKE - 261)) | (1L << (ROLE - 261)) | (1L << (ROLES - 261)) | (1L << (ROLLBACK - 261)) | (1L << (ROLLUP - 261)) | (1L << (ROUTINE - 261)) | (1L << (ROW_NUMBER - 261)) | (1L << (SAMPLE - 261)) | (1L << (SCHEMA - 261)) | (1L << (SECOND - 261)) | (1L << (SERIALIZABLE - 261)) | (1L << (SESSION - 261)) | (1L << (SETS - 261)) | (1L << (SIGNED - 261)) | (1L << (SNAPSHOT - 261)) | (1L << (SQLBLACKLIST - 261)) | (1L << (START - 261)) | (1L << (STATS - 261)) | (1L << (STATUS - 261)) | (1L << (STOP - 261)) | (1L << (STORAGE - 261)) | (1L << (STRING - 261)) | (1L << (SUBMIT - 261)) | (1L << (SUM - 261)) | (1L << (SYNC - 261)) | (1L << (TABLES - 261)) | (1L << (TABLET - 261)) | (1L << (TASK - 261)) | (1L << (TEMPORARY - 261)) | (1L << (THAN - 261)) | (1L << (TIME - 261)) | (1L << (TIMESTAMP - 261)) | (1L << (TIMESTAMPADD - 261)) | (1L << (TIMESTAMPDIFF - 261)) | (1L << (TRANSACTION - 261)) | (1L << (TRIGGERS - 261)) | (1L << (TRUE - 261)) | (1L << (TRUNCATE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (TYPE - 325)) | (1L << (TYPES - 325)) | (1L << (UNBOUNDED - 325)) | (1L << (UNCOMMITTED - 325)) | (1L << (UNINSTALL - 325)) | (1L << (USER - 325)) | (1L << (VALUE - 325)) | (1L << (VARIABLES - 325)) | (1L << (VERBOSE - 325)) | (1L << (VIEW - 325)) | (1L << (WARNINGS - 325)) | (1L << (WEEK - 325)) | (1L << (WHITELIST - 325)) | (1L << (WORK - 325)) | (1L << (WRITE - 325)) | (1L << (YEAR - 325)) | (1L << (PLUS_SYMBOL - 325)) | (1L << (MINUS_SYMBOL - 325)) | (1L << (LOGICAL_NOT - 325)) | (1L << (BITNOT - 325)) | (1L << (AT - 325)) | (1L << (INTEGER_VALUE - 325)) | (1L << (DECIMAL_VALUE - 325)) | (1L << (DOUBLE_VALUE - 325)) | (1L << (SINGLE_QUOTED_TEXT - 325)) | (1L << (DOUBLE_QUOTED_TEXT - 325)) | (1L << (LETTER_IDENTIFIER - 325)) | (1L << (DIGIT_IDENTIFIER - 325)) | (1L << (BACKQUOTED_IDENTIFIER - 325)) | (1L << (DOTDOTDOT - 325)))) != 0)) {
					{
					setState(1041);
					expression(0);
					setState(1046);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(1042);
						match(T__0);
						setState(1043);
						expression(0);
						}
						}
						setState(1048);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1051);
				match(T__2);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 14);
				{
				setState(1052);
				match(RIGHT);
				setState(1053);
				match(T__1);
				setState(1054);
				expression(0);
				setState(1055);
				match(T__0);
				setState(1056);
				expression(0);
				setState(1057);
				match(T__2);
				}
				break;
			case RLIKE:
				enterOuterAlt(_localctx, 15);
				{
				setState(1059);
				match(RLIKE);
				setState(1060);
				match(T__1);
				setState(1061);
				expression(0);
				setState(1062);
				match(T__0);
				setState(1063);
				expression(0);
				setState(1064);
				match(T__2);
				}
				break;
			case SECOND:
				enterOuterAlt(_localctx, 16);
				{
				setState(1066);
				match(SECOND);
				setState(1067);
				match(T__1);
				setState(1068);
				expression(0);
				setState(1069);
				match(T__2);
				}
				break;
			case TIMESTAMPADD:
				enterOuterAlt(_localctx, 17);
				{
				setState(1071);
				match(TIMESTAMPADD);
				setState(1072);
				match(T__1);
				setState(1073);
				unitIdentifier();
				setState(1074);
				match(T__0);
				setState(1075);
				expression(0);
				setState(1076);
				match(T__0);
				setState(1077);
				expression(0);
				setState(1078);
				match(T__2);
				}
				break;
			case TIMESTAMPDIFF:
				enterOuterAlt(_localctx, 18);
				{
				setState(1080);
				match(TIMESTAMPDIFF);
				setState(1081);
				match(T__1);
				setState(1082);
				unitIdentifier();
				setState(1083);
				match(T__0);
				setState(1084);
				expression(0);
				setState(1085);
				match(T__0);
				setState(1086);
				expression(0);
				setState(1087);
				match(T__2);
				}
				break;
			case YEAR:
				enterOuterAlt(_localctx, 19);
				{
				setState(1089);
				match(YEAR);
				setState(1090);
				match(T__1);
				setState(1091);
				expression(0);
				setState(1092);
				match(T__2);
				}
				break;
			case PASSWORD:
				enterOuterAlt(_localctx, 20);
				{
				setState(1094);
				match(PASSWORD);
				setState(1095);
				match(T__1);
				setState(1096);
				string();
				setState(1097);
				match(T__2);
				}
				break;
			case FLOOR:
				enterOuterAlt(_localctx, 21);
				{
				setState(1099);
				match(FLOOR);
				setState(1100);
				match(T__1);
				setState(1101);
				expression(0);
				setState(1102);
				match(T__2);
				}
				break;
			case CEIL:
				enterOuterAlt(_localctx, 22);
				{
				setState(1104);
				match(CEIL);
				setState(1105);
				match(T__1);
				setState(1106);
				expression(0);
				setState(1107);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFunctionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ROW_NUMBER() { return getToken(DemoDBParser.ROW_NUMBER, 0); }
		public TerminalNode RANK() { return getToken(DemoDBParser.RANK, 0); }
		public TerminalNode DENSE_RANK() { return getToken(DemoDBParser.DENSE_RANK, 0); }
		public TerminalNode NTILE() { return getToken(DemoDBParser.NTILE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LEAD() { return getToken(DemoDBParser.LEAD, 0); }
		public TerminalNode LAG() { return getToken(DemoDBParser.LAG, 0); }
		public TerminalNode FIRST_VALUE() { return getToken(DemoDBParser.FIRST_VALUE, 0); }
		public TerminalNode LAST_VALUE() { return getToken(DemoDBParser.LAST_VALUE, 0); }
		public WindowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterWindowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitWindowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitWindowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFunctionContext windowFunction() throws RecognitionException {
		WindowFunctionContext _localctx = new WindowFunctionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_windowFunction);
		int _la;
		try {
			setState(1178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROW_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1111);
				((WindowFunctionContext)_localctx).name = match(ROW_NUMBER);
				setState(1112);
				match(T__1);
				setState(1113);
				match(T__2);
				}
				break;
			case RANK:
				enterOuterAlt(_localctx, 2);
				{
				setState(1114);
				((WindowFunctionContext)_localctx).name = match(RANK);
				setState(1115);
				match(T__1);
				setState(1116);
				match(T__2);
				}
				break;
			case DENSE_RANK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1117);
				((WindowFunctionContext)_localctx).name = match(DENSE_RANK);
				setState(1118);
				match(T__1);
				setState(1119);
				match(T__2);
				}
				break;
			case NTILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1120);
				((WindowFunctionContext)_localctx).name = match(NTILE);
				setState(1121);
				match(T__1);
				setState(1123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__4 - 2)) | (1L << (T__8 - 2)) | (1L << (ADMIN - 2)) | (1L << (AFTER - 2)) | (1L << (AGGREGATE - 2)) | (1L << (ARRAY - 2)) | (1L << (ASYNC - 2)) | (1L << (AUTHORS - 2)) | (1L << (AVG - 2)) | (1L << (BACKEND - 2)) | (1L << (BACKENDS - 2)) | (1L << (BACKUP - 2)) | (1L << (BEGIN - 2)) | (1L << (BITMAP_UNION - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BROKER - 2)) | (1L << (BUCKETS - 2)) | (1L << (BUILTIN - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CATALOG - 2)) | (1L << (CATALOGS - 2)) | (1L << (CEIL - 2)) | (1L << (CHAIN - 2)) | (1L << (CHAR - 2)) | (1L << (CHARSET - 2)) | (1L << (COLLATION - 2)) | (1L << (COLUMNS - 2)) | (1L << (COMMENT - 2)) | (1L << (COMMIT - 2)) | (1L << (COMMITTED - 2)) | (1L << (COMPUTE - 2)) | (1L << (CONFIG - 2)) | (1L << (CONNECTION - 2)) | (1L << (CONNECTION_ID - 2)) | (1L << (CONSISTENT - 2)) | (1L << (CONVERT - 2)) | (1L << (COSTS - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (COUNT - 66)) | (1L << (CURRENT - 66)) | (1L << (CURRENT_TIMESTAMP - 66)) | (1L << (CURRENT_USER - 66)) | (1L << (DATA - 66)) | (1L << (DATABASE - 66)) | (1L << (DATE - 66)) | (1L << (DATETIME - 66)) | (1L << (DAY - 66)) | (1L << (DECOMMISSION - 66)) | (1L << (DENSE_RANK - 66)) | (1L << (NTILE - 66)) | (1L << (DISTRIBUTION - 66)) | (1L << (DUPLICATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (END - 66)) | (1L << (ENGINE - 66)) | (1L << (ENGINES - 66)) | (1L << (ERRORS - 66)) | (1L << (EVENTS - 66)) | (1L << (EXECUTE - 66)) | (1L << (EXISTS - 66)) | (1L << (EXTERNAL - 66)) | (1L << (EXTRACT - 66)) | (1L << (EVERY - 66)) | (1L << (FALSE - 66)) | (1L << (FILE - 66)) | (1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FIRST_VALUE - 66)) | (1L << (FLOOR - 66)) | (1L << (FN - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FOLLOWER - 66)) | (1L << (FORMAT - 66)) | (1L << (FREE - 66)) | (1L << (FRONTEND - 66)) | (1L << (FRONTENDS - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (FUNCTIONS - 132)) | (1L << (GLOBAL - 132)) | (1L << (GRANTS - 132)) | (1L << (GROUPING - 132)) | (1L << (GROUPING_ID - 132)) | (1L << (HASH - 132)) | (1L << (HELP - 132)) | (1L << (HISTOGRAM - 132)) | (1L << (HLL_UNION - 132)) | (1L << (HOUR - 132)) | (1L << (HUB - 132)) | (1L << (IDENTIFIED - 132)) | (1L << (IF - 132)) | (1L << (IMPERSONATE - 132)) | (1L << (INDEXES - 132)) | (1L << (INSTALL - 132)) | (1L << (INTERMEDIATE - 132)) | (1L << (INTERVAL - 132)) | (1L << (OVERWRITE - 132)) | (1L << (ISOLATION - 132)) | (1L << (JOB - 132)) | (1L << (LABEL - 132)) | (1L << (LAG - 132)) | (1L << (LAST - 132)) | (1L << (LAST_VALUE - 132)) | (1L << (LEAD - 132)) | (1L << (LEFT - 132)) | (1L << (LESS - 132)) | (1L << (LEVEL - 132)) | (1L << (LIKE - 132)) | (1L << (LIST - 132)) | (1L << (LOCAL - 132)) | (1L << (LOGICAL - 132)) | (1L << (MANUAL - 132)) | (1L << (MATERIALIZED - 132)) | (1L << (MAX - 132)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (MERGE - 197)) | (1L << (MIN - 197)) | (1L << (MINUTE - 197)) | (1L << (META - 197)) | (1L << (MOD - 197)) | (1L << (MODE - 197)) | (1L << (MODIFY - 197)) | (1L << (MONTH - 197)) | (1L << (NAME - 197)) | (1L << (NAMES - 197)) | (1L << (NEGATIVE - 197)) | (1L << (NO - 197)) | (1L << (NODE - 197)) | (1L << (NOT - 197)) | (1L << (NULL - 197)) | (1L << (NULLS - 197)) | (1L << (OBSERVER - 197)) | (1L << (OFFSET - 197)) | (1L << (ONLY - 197)) | (1L << (OPEN - 197)) | (1L << (OPTION - 197)) | (1L << (PARTITIONS - 197)) | (1L << (PASSWORD - 197)) | (1L << (PATH - 197)) | (1L << (PAUSE - 197)) | (1L << (PERCENTILE_UNION - 197)) | (1L << (PLUGIN - 197)) | (1L << (PLUGINS - 197)) | (1L << (PRECEDING - 197)) | (1L << (PROC - 197)) | (1L << (PROCESSLIST - 197)) | (1L << (PROPERTIES - 197)) | (1L << (PROPERTY - 197)) | (1L << (QUARTER - 197)) | (1L << (QUERY - 197)) | (1L << (QUOTA - 197)) | (1L << (RANDOM - 197)) | (1L << (RANK - 197)) | (1L << (RECOVER - 197)) | (1L << (REFRESH - 197)) | (1L << (REGEXP - 197)) | (1L << (REPAIR - 197)) | (1L << (REPEATABLE - 197)) | (1L << (REPLACE - 197)) | (1L << (REPLACE_IF_NOT_NULL - 197)) | (1L << (REPLICA - 197)) | (1L << (REPOSITORY - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPOSITORIES - 261)) | (1L << (RESOURCE - 261)) | (1L << (RESOURCES - 261)) | (1L << (RESTORE - 261)) | (1L << (RESUME - 261)) | (1L << (RETURNS - 261)) | (1L << (REVERT - 261)) | (1L << (RIGHT - 261)) | (1L << (RLIKE - 261)) | (1L << (ROLE - 261)) | (1L << (ROLES - 261)) | (1L << (ROLLBACK - 261)) | (1L << (ROLLUP - 261)) | (1L << (ROUTINE - 261)) | (1L << (ROW_NUMBER - 261)) | (1L << (SAMPLE - 261)) | (1L << (SCHEMA - 261)) | (1L << (SECOND - 261)) | (1L << (SERIALIZABLE - 261)) | (1L << (SESSION - 261)) | (1L << (SETS - 261)) | (1L << (SIGNED - 261)) | (1L << (SNAPSHOT - 261)) | (1L << (SQLBLACKLIST - 261)) | (1L << (START - 261)) | (1L << (STATS - 261)) | (1L << (STATUS - 261)) | (1L << (STOP - 261)) | (1L << (STORAGE - 261)) | (1L << (STRING - 261)) | (1L << (SUBMIT - 261)) | (1L << (SUM - 261)) | (1L << (SYNC - 261)) | (1L << (TABLES - 261)) | (1L << (TABLET - 261)) | (1L << (TASK - 261)) | (1L << (TEMPORARY - 261)) | (1L << (THAN - 261)) | (1L << (TIME - 261)) | (1L << (TIMESTAMP - 261)) | (1L << (TIMESTAMPADD - 261)) | (1L << (TIMESTAMPDIFF - 261)) | (1L << (TRANSACTION - 261)) | (1L << (TRIGGERS - 261)) | (1L << (TRUE - 261)) | (1L << (TRUNCATE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (TYPE - 325)) | (1L << (TYPES - 325)) | (1L << (UNBOUNDED - 325)) | (1L << (UNCOMMITTED - 325)) | (1L << (UNINSTALL - 325)) | (1L << (USER - 325)) | (1L << (VALUE - 325)) | (1L << (VARIABLES - 325)) | (1L << (VERBOSE - 325)) | (1L << (VIEW - 325)) | (1L << (WARNINGS - 325)) | (1L << (WEEK - 325)) | (1L << (WHITELIST - 325)) | (1L << (WORK - 325)) | (1L << (WRITE - 325)) | (1L << (YEAR - 325)) | (1L << (PLUS_SYMBOL - 325)) | (1L << (MINUS_SYMBOL - 325)) | (1L << (LOGICAL_NOT - 325)) | (1L << (BITNOT - 325)) | (1L << (AT - 325)) | (1L << (INTEGER_VALUE - 325)) | (1L << (DECIMAL_VALUE - 325)) | (1L << (DOUBLE_VALUE - 325)) | (1L << (SINGLE_QUOTED_TEXT - 325)) | (1L << (DOUBLE_QUOTED_TEXT - 325)) | (1L << (LETTER_IDENTIFIER - 325)) | (1L << (DIGIT_IDENTIFIER - 325)) | (1L << (BACKQUOTED_IDENTIFIER - 325)) | (1L << (DOTDOTDOT - 325)))) != 0)) {
					{
					setState(1122);
					expression(0);
					}
				}

				setState(1125);
				match(T__2);
				}
				break;
			case LEAD:
				enterOuterAlt(_localctx, 5);
				{
				setState(1126);
				((WindowFunctionContext)_localctx).name = match(LEAD);
				setState(1127);
				match(T__1);
				setState(1136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__4 - 2)) | (1L << (T__8 - 2)) | (1L << (ADMIN - 2)) | (1L << (AFTER - 2)) | (1L << (AGGREGATE - 2)) | (1L << (ARRAY - 2)) | (1L << (ASYNC - 2)) | (1L << (AUTHORS - 2)) | (1L << (AVG - 2)) | (1L << (BACKEND - 2)) | (1L << (BACKENDS - 2)) | (1L << (BACKUP - 2)) | (1L << (BEGIN - 2)) | (1L << (BITMAP_UNION - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BROKER - 2)) | (1L << (BUCKETS - 2)) | (1L << (BUILTIN - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CATALOG - 2)) | (1L << (CATALOGS - 2)) | (1L << (CEIL - 2)) | (1L << (CHAIN - 2)) | (1L << (CHAR - 2)) | (1L << (CHARSET - 2)) | (1L << (COLLATION - 2)) | (1L << (COLUMNS - 2)) | (1L << (COMMENT - 2)) | (1L << (COMMIT - 2)) | (1L << (COMMITTED - 2)) | (1L << (COMPUTE - 2)) | (1L << (CONFIG - 2)) | (1L << (CONNECTION - 2)) | (1L << (CONNECTION_ID - 2)) | (1L << (CONSISTENT - 2)) | (1L << (CONVERT - 2)) | (1L << (COSTS - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (COUNT - 66)) | (1L << (CURRENT - 66)) | (1L << (CURRENT_TIMESTAMP - 66)) | (1L << (CURRENT_USER - 66)) | (1L << (DATA - 66)) | (1L << (DATABASE - 66)) | (1L << (DATE - 66)) | (1L << (DATETIME - 66)) | (1L << (DAY - 66)) | (1L << (DECOMMISSION - 66)) | (1L << (DENSE_RANK - 66)) | (1L << (NTILE - 66)) | (1L << (DISTRIBUTION - 66)) | (1L << (DUPLICATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (END - 66)) | (1L << (ENGINE - 66)) | (1L << (ENGINES - 66)) | (1L << (ERRORS - 66)) | (1L << (EVENTS - 66)) | (1L << (EXECUTE - 66)) | (1L << (EXISTS - 66)) | (1L << (EXTERNAL - 66)) | (1L << (EXTRACT - 66)) | (1L << (EVERY - 66)) | (1L << (FALSE - 66)) | (1L << (FILE - 66)) | (1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FIRST_VALUE - 66)) | (1L << (FLOOR - 66)) | (1L << (FN - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FOLLOWER - 66)) | (1L << (FORMAT - 66)) | (1L << (FREE - 66)) | (1L << (FRONTEND - 66)) | (1L << (FRONTENDS - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (FUNCTIONS - 132)) | (1L << (GLOBAL - 132)) | (1L << (GRANTS - 132)) | (1L << (GROUPING - 132)) | (1L << (GROUPING_ID - 132)) | (1L << (HASH - 132)) | (1L << (HELP - 132)) | (1L << (HISTOGRAM - 132)) | (1L << (HLL_UNION - 132)) | (1L << (HOUR - 132)) | (1L << (HUB - 132)) | (1L << (IDENTIFIED - 132)) | (1L << (IF - 132)) | (1L << (IMPERSONATE - 132)) | (1L << (INDEXES - 132)) | (1L << (INSTALL - 132)) | (1L << (INTERMEDIATE - 132)) | (1L << (INTERVAL - 132)) | (1L << (OVERWRITE - 132)) | (1L << (ISOLATION - 132)) | (1L << (JOB - 132)) | (1L << (LABEL - 132)) | (1L << (LAG - 132)) | (1L << (LAST - 132)) | (1L << (LAST_VALUE - 132)) | (1L << (LEAD - 132)) | (1L << (LEFT - 132)) | (1L << (LESS - 132)) | (1L << (LEVEL - 132)) | (1L << (LIKE - 132)) | (1L << (LIST - 132)) | (1L << (LOCAL - 132)) | (1L << (LOGICAL - 132)) | (1L << (MANUAL - 132)) | (1L << (MATERIALIZED - 132)) | (1L << (MAX - 132)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (MERGE - 197)) | (1L << (MIN - 197)) | (1L << (MINUTE - 197)) | (1L << (META - 197)) | (1L << (MOD - 197)) | (1L << (MODE - 197)) | (1L << (MODIFY - 197)) | (1L << (MONTH - 197)) | (1L << (NAME - 197)) | (1L << (NAMES - 197)) | (1L << (NEGATIVE - 197)) | (1L << (NO - 197)) | (1L << (NODE - 197)) | (1L << (NOT - 197)) | (1L << (NULL - 197)) | (1L << (NULLS - 197)) | (1L << (OBSERVER - 197)) | (1L << (OFFSET - 197)) | (1L << (ONLY - 197)) | (1L << (OPEN - 197)) | (1L << (OPTION - 197)) | (1L << (PARTITIONS - 197)) | (1L << (PASSWORD - 197)) | (1L << (PATH - 197)) | (1L << (PAUSE - 197)) | (1L << (PERCENTILE_UNION - 197)) | (1L << (PLUGIN - 197)) | (1L << (PLUGINS - 197)) | (1L << (PRECEDING - 197)) | (1L << (PROC - 197)) | (1L << (PROCESSLIST - 197)) | (1L << (PROPERTIES - 197)) | (1L << (PROPERTY - 197)) | (1L << (QUARTER - 197)) | (1L << (QUERY - 197)) | (1L << (QUOTA - 197)) | (1L << (RANDOM - 197)) | (1L << (RANK - 197)) | (1L << (RECOVER - 197)) | (1L << (REFRESH - 197)) | (1L << (REGEXP - 197)) | (1L << (REPAIR - 197)) | (1L << (REPEATABLE - 197)) | (1L << (REPLACE - 197)) | (1L << (REPLACE_IF_NOT_NULL - 197)) | (1L << (REPLICA - 197)) | (1L << (REPOSITORY - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPOSITORIES - 261)) | (1L << (RESOURCE - 261)) | (1L << (RESOURCES - 261)) | (1L << (RESTORE - 261)) | (1L << (RESUME - 261)) | (1L << (RETURNS - 261)) | (1L << (REVERT - 261)) | (1L << (RIGHT - 261)) | (1L << (RLIKE - 261)) | (1L << (ROLE - 261)) | (1L << (ROLES - 261)) | (1L << (ROLLBACK - 261)) | (1L << (ROLLUP - 261)) | (1L << (ROUTINE - 261)) | (1L << (ROW_NUMBER - 261)) | (1L << (SAMPLE - 261)) | (1L << (SCHEMA - 261)) | (1L << (SECOND - 261)) | (1L << (SERIALIZABLE - 261)) | (1L << (SESSION - 261)) | (1L << (SETS - 261)) | (1L << (SIGNED - 261)) | (1L << (SNAPSHOT - 261)) | (1L << (SQLBLACKLIST - 261)) | (1L << (START - 261)) | (1L << (STATS - 261)) | (1L << (STATUS - 261)) | (1L << (STOP - 261)) | (1L << (STORAGE - 261)) | (1L << (STRING - 261)) | (1L << (SUBMIT - 261)) | (1L << (SUM - 261)) | (1L << (SYNC - 261)) | (1L << (TABLES - 261)) | (1L << (TABLET - 261)) | (1L << (TASK - 261)) | (1L << (TEMPORARY - 261)) | (1L << (THAN - 261)) | (1L << (TIME - 261)) | (1L << (TIMESTAMP - 261)) | (1L << (TIMESTAMPADD - 261)) | (1L << (TIMESTAMPDIFF - 261)) | (1L << (TRANSACTION - 261)) | (1L << (TRIGGERS - 261)) | (1L << (TRUE - 261)) | (1L << (TRUNCATE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (TYPE - 325)) | (1L << (TYPES - 325)) | (1L << (UNBOUNDED - 325)) | (1L << (UNCOMMITTED - 325)) | (1L << (UNINSTALL - 325)) | (1L << (USER - 325)) | (1L << (VALUE - 325)) | (1L << (VARIABLES - 325)) | (1L << (VERBOSE - 325)) | (1L << (VIEW - 325)) | (1L << (WARNINGS - 325)) | (1L << (WEEK - 325)) | (1L << (WHITELIST - 325)) | (1L << (WORK - 325)) | (1L << (WRITE - 325)) | (1L << (YEAR - 325)) | (1L << (PLUS_SYMBOL - 325)) | (1L << (MINUS_SYMBOL - 325)) | (1L << (LOGICAL_NOT - 325)) | (1L << (BITNOT - 325)) | (1L << (AT - 325)) | (1L << (INTEGER_VALUE - 325)) | (1L << (DECIMAL_VALUE - 325)) | (1L << (DOUBLE_VALUE - 325)) | (1L << (SINGLE_QUOTED_TEXT - 325)) | (1L << (DOUBLE_QUOTED_TEXT - 325)) | (1L << (LETTER_IDENTIFIER - 325)) | (1L << (DIGIT_IDENTIFIER - 325)) | (1L << (BACKQUOTED_IDENTIFIER - 325)) | (1L << (DOTDOTDOT - 325)))) != 0)) {
					{
					setState(1128);
					expression(0);
					setState(1133);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(1129);
						match(T__0);
						setState(1130);
						expression(0);
						}
						}
						setState(1135);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1138);
				match(T__2);
				}
				break;
			case LAG:
				enterOuterAlt(_localctx, 6);
				{
				setState(1139);
				((WindowFunctionContext)_localctx).name = match(LAG);
				setState(1140);
				match(T__1);
				setState(1149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__4 - 2)) | (1L << (T__8 - 2)) | (1L << (ADMIN - 2)) | (1L << (AFTER - 2)) | (1L << (AGGREGATE - 2)) | (1L << (ARRAY - 2)) | (1L << (ASYNC - 2)) | (1L << (AUTHORS - 2)) | (1L << (AVG - 2)) | (1L << (BACKEND - 2)) | (1L << (BACKENDS - 2)) | (1L << (BACKUP - 2)) | (1L << (BEGIN - 2)) | (1L << (BITMAP_UNION - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BROKER - 2)) | (1L << (BUCKETS - 2)) | (1L << (BUILTIN - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CATALOG - 2)) | (1L << (CATALOGS - 2)) | (1L << (CEIL - 2)) | (1L << (CHAIN - 2)) | (1L << (CHAR - 2)) | (1L << (CHARSET - 2)) | (1L << (COLLATION - 2)) | (1L << (COLUMNS - 2)) | (1L << (COMMENT - 2)) | (1L << (COMMIT - 2)) | (1L << (COMMITTED - 2)) | (1L << (COMPUTE - 2)) | (1L << (CONFIG - 2)) | (1L << (CONNECTION - 2)) | (1L << (CONNECTION_ID - 2)) | (1L << (CONSISTENT - 2)) | (1L << (CONVERT - 2)) | (1L << (COSTS - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (COUNT - 66)) | (1L << (CURRENT - 66)) | (1L << (CURRENT_TIMESTAMP - 66)) | (1L << (CURRENT_USER - 66)) | (1L << (DATA - 66)) | (1L << (DATABASE - 66)) | (1L << (DATE - 66)) | (1L << (DATETIME - 66)) | (1L << (DAY - 66)) | (1L << (DECOMMISSION - 66)) | (1L << (DENSE_RANK - 66)) | (1L << (NTILE - 66)) | (1L << (DISTRIBUTION - 66)) | (1L << (DUPLICATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (END - 66)) | (1L << (ENGINE - 66)) | (1L << (ENGINES - 66)) | (1L << (ERRORS - 66)) | (1L << (EVENTS - 66)) | (1L << (EXECUTE - 66)) | (1L << (EXISTS - 66)) | (1L << (EXTERNAL - 66)) | (1L << (EXTRACT - 66)) | (1L << (EVERY - 66)) | (1L << (FALSE - 66)) | (1L << (FILE - 66)) | (1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FIRST_VALUE - 66)) | (1L << (FLOOR - 66)) | (1L << (FN - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FOLLOWER - 66)) | (1L << (FORMAT - 66)) | (1L << (FREE - 66)) | (1L << (FRONTEND - 66)) | (1L << (FRONTENDS - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (FUNCTIONS - 132)) | (1L << (GLOBAL - 132)) | (1L << (GRANTS - 132)) | (1L << (GROUPING - 132)) | (1L << (GROUPING_ID - 132)) | (1L << (HASH - 132)) | (1L << (HELP - 132)) | (1L << (HISTOGRAM - 132)) | (1L << (HLL_UNION - 132)) | (1L << (HOUR - 132)) | (1L << (HUB - 132)) | (1L << (IDENTIFIED - 132)) | (1L << (IF - 132)) | (1L << (IMPERSONATE - 132)) | (1L << (INDEXES - 132)) | (1L << (INSTALL - 132)) | (1L << (INTERMEDIATE - 132)) | (1L << (INTERVAL - 132)) | (1L << (OVERWRITE - 132)) | (1L << (ISOLATION - 132)) | (1L << (JOB - 132)) | (1L << (LABEL - 132)) | (1L << (LAG - 132)) | (1L << (LAST - 132)) | (1L << (LAST_VALUE - 132)) | (1L << (LEAD - 132)) | (1L << (LEFT - 132)) | (1L << (LESS - 132)) | (1L << (LEVEL - 132)) | (1L << (LIKE - 132)) | (1L << (LIST - 132)) | (1L << (LOCAL - 132)) | (1L << (LOGICAL - 132)) | (1L << (MANUAL - 132)) | (1L << (MATERIALIZED - 132)) | (1L << (MAX - 132)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (MERGE - 197)) | (1L << (MIN - 197)) | (1L << (MINUTE - 197)) | (1L << (META - 197)) | (1L << (MOD - 197)) | (1L << (MODE - 197)) | (1L << (MODIFY - 197)) | (1L << (MONTH - 197)) | (1L << (NAME - 197)) | (1L << (NAMES - 197)) | (1L << (NEGATIVE - 197)) | (1L << (NO - 197)) | (1L << (NODE - 197)) | (1L << (NOT - 197)) | (1L << (NULL - 197)) | (1L << (NULLS - 197)) | (1L << (OBSERVER - 197)) | (1L << (OFFSET - 197)) | (1L << (ONLY - 197)) | (1L << (OPEN - 197)) | (1L << (OPTION - 197)) | (1L << (PARTITIONS - 197)) | (1L << (PASSWORD - 197)) | (1L << (PATH - 197)) | (1L << (PAUSE - 197)) | (1L << (PERCENTILE_UNION - 197)) | (1L << (PLUGIN - 197)) | (1L << (PLUGINS - 197)) | (1L << (PRECEDING - 197)) | (1L << (PROC - 197)) | (1L << (PROCESSLIST - 197)) | (1L << (PROPERTIES - 197)) | (1L << (PROPERTY - 197)) | (1L << (QUARTER - 197)) | (1L << (QUERY - 197)) | (1L << (QUOTA - 197)) | (1L << (RANDOM - 197)) | (1L << (RANK - 197)) | (1L << (RECOVER - 197)) | (1L << (REFRESH - 197)) | (1L << (REGEXP - 197)) | (1L << (REPAIR - 197)) | (1L << (REPEATABLE - 197)) | (1L << (REPLACE - 197)) | (1L << (REPLACE_IF_NOT_NULL - 197)) | (1L << (REPLICA - 197)) | (1L << (REPOSITORY - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPOSITORIES - 261)) | (1L << (RESOURCE - 261)) | (1L << (RESOURCES - 261)) | (1L << (RESTORE - 261)) | (1L << (RESUME - 261)) | (1L << (RETURNS - 261)) | (1L << (REVERT - 261)) | (1L << (RIGHT - 261)) | (1L << (RLIKE - 261)) | (1L << (ROLE - 261)) | (1L << (ROLES - 261)) | (1L << (ROLLBACK - 261)) | (1L << (ROLLUP - 261)) | (1L << (ROUTINE - 261)) | (1L << (ROW_NUMBER - 261)) | (1L << (SAMPLE - 261)) | (1L << (SCHEMA - 261)) | (1L << (SECOND - 261)) | (1L << (SERIALIZABLE - 261)) | (1L << (SESSION - 261)) | (1L << (SETS - 261)) | (1L << (SIGNED - 261)) | (1L << (SNAPSHOT - 261)) | (1L << (SQLBLACKLIST - 261)) | (1L << (START - 261)) | (1L << (STATS - 261)) | (1L << (STATUS - 261)) | (1L << (STOP - 261)) | (1L << (STORAGE - 261)) | (1L << (STRING - 261)) | (1L << (SUBMIT - 261)) | (1L << (SUM - 261)) | (1L << (SYNC - 261)) | (1L << (TABLES - 261)) | (1L << (TABLET - 261)) | (1L << (TASK - 261)) | (1L << (TEMPORARY - 261)) | (1L << (THAN - 261)) | (1L << (TIME - 261)) | (1L << (TIMESTAMP - 261)) | (1L << (TIMESTAMPADD - 261)) | (1L << (TIMESTAMPDIFF - 261)) | (1L << (TRANSACTION - 261)) | (1L << (TRIGGERS - 261)) | (1L << (TRUE - 261)) | (1L << (TRUNCATE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (TYPE - 325)) | (1L << (TYPES - 325)) | (1L << (UNBOUNDED - 325)) | (1L << (UNCOMMITTED - 325)) | (1L << (UNINSTALL - 325)) | (1L << (USER - 325)) | (1L << (VALUE - 325)) | (1L << (VARIABLES - 325)) | (1L << (VERBOSE - 325)) | (1L << (VIEW - 325)) | (1L << (WARNINGS - 325)) | (1L << (WEEK - 325)) | (1L << (WHITELIST - 325)) | (1L << (WORK - 325)) | (1L << (WRITE - 325)) | (1L << (YEAR - 325)) | (1L << (PLUS_SYMBOL - 325)) | (1L << (MINUS_SYMBOL - 325)) | (1L << (LOGICAL_NOT - 325)) | (1L << (BITNOT - 325)) | (1L << (AT - 325)) | (1L << (INTEGER_VALUE - 325)) | (1L << (DECIMAL_VALUE - 325)) | (1L << (DOUBLE_VALUE - 325)) | (1L << (SINGLE_QUOTED_TEXT - 325)) | (1L << (DOUBLE_QUOTED_TEXT - 325)) | (1L << (LETTER_IDENTIFIER - 325)) | (1L << (DIGIT_IDENTIFIER - 325)) | (1L << (BACKQUOTED_IDENTIFIER - 325)) | (1L << (DOTDOTDOT - 325)))) != 0)) {
					{
					setState(1141);
					expression(0);
					setState(1146);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(1142);
						match(T__0);
						setState(1143);
						expression(0);
						}
						}
						setState(1148);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1151);
				match(T__2);
				}
				break;
			case FIRST_VALUE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1152);
				((WindowFunctionContext)_localctx).name = match(FIRST_VALUE);
				setState(1153);
				match(T__1);
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__4 - 2)) | (1L << (T__8 - 2)) | (1L << (ADMIN - 2)) | (1L << (AFTER - 2)) | (1L << (AGGREGATE - 2)) | (1L << (ARRAY - 2)) | (1L << (ASYNC - 2)) | (1L << (AUTHORS - 2)) | (1L << (AVG - 2)) | (1L << (BACKEND - 2)) | (1L << (BACKENDS - 2)) | (1L << (BACKUP - 2)) | (1L << (BEGIN - 2)) | (1L << (BITMAP_UNION - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BROKER - 2)) | (1L << (BUCKETS - 2)) | (1L << (BUILTIN - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CATALOG - 2)) | (1L << (CATALOGS - 2)) | (1L << (CEIL - 2)) | (1L << (CHAIN - 2)) | (1L << (CHAR - 2)) | (1L << (CHARSET - 2)) | (1L << (COLLATION - 2)) | (1L << (COLUMNS - 2)) | (1L << (COMMENT - 2)) | (1L << (COMMIT - 2)) | (1L << (COMMITTED - 2)) | (1L << (COMPUTE - 2)) | (1L << (CONFIG - 2)) | (1L << (CONNECTION - 2)) | (1L << (CONNECTION_ID - 2)) | (1L << (CONSISTENT - 2)) | (1L << (CONVERT - 2)) | (1L << (COSTS - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (COUNT - 66)) | (1L << (CURRENT - 66)) | (1L << (CURRENT_TIMESTAMP - 66)) | (1L << (CURRENT_USER - 66)) | (1L << (DATA - 66)) | (1L << (DATABASE - 66)) | (1L << (DATE - 66)) | (1L << (DATETIME - 66)) | (1L << (DAY - 66)) | (1L << (DECOMMISSION - 66)) | (1L << (DENSE_RANK - 66)) | (1L << (NTILE - 66)) | (1L << (DISTRIBUTION - 66)) | (1L << (DUPLICATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (END - 66)) | (1L << (ENGINE - 66)) | (1L << (ENGINES - 66)) | (1L << (ERRORS - 66)) | (1L << (EVENTS - 66)) | (1L << (EXECUTE - 66)) | (1L << (EXISTS - 66)) | (1L << (EXTERNAL - 66)) | (1L << (EXTRACT - 66)) | (1L << (EVERY - 66)) | (1L << (FALSE - 66)) | (1L << (FILE - 66)) | (1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FIRST_VALUE - 66)) | (1L << (FLOOR - 66)) | (1L << (FN - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FOLLOWER - 66)) | (1L << (FORMAT - 66)) | (1L << (FREE - 66)) | (1L << (FRONTEND - 66)) | (1L << (FRONTENDS - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (FUNCTIONS - 132)) | (1L << (GLOBAL - 132)) | (1L << (GRANTS - 132)) | (1L << (GROUPING - 132)) | (1L << (GROUPING_ID - 132)) | (1L << (HASH - 132)) | (1L << (HELP - 132)) | (1L << (HISTOGRAM - 132)) | (1L << (HLL_UNION - 132)) | (1L << (HOUR - 132)) | (1L << (HUB - 132)) | (1L << (IDENTIFIED - 132)) | (1L << (IF - 132)) | (1L << (IMPERSONATE - 132)) | (1L << (INDEXES - 132)) | (1L << (INSTALL - 132)) | (1L << (INTERMEDIATE - 132)) | (1L << (INTERVAL - 132)) | (1L << (OVERWRITE - 132)) | (1L << (ISOLATION - 132)) | (1L << (JOB - 132)) | (1L << (LABEL - 132)) | (1L << (LAG - 132)) | (1L << (LAST - 132)) | (1L << (LAST_VALUE - 132)) | (1L << (LEAD - 132)) | (1L << (LEFT - 132)) | (1L << (LESS - 132)) | (1L << (LEVEL - 132)) | (1L << (LIKE - 132)) | (1L << (LIST - 132)) | (1L << (LOCAL - 132)) | (1L << (LOGICAL - 132)) | (1L << (MANUAL - 132)) | (1L << (MATERIALIZED - 132)) | (1L << (MAX - 132)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (MERGE - 197)) | (1L << (MIN - 197)) | (1L << (MINUTE - 197)) | (1L << (META - 197)) | (1L << (MOD - 197)) | (1L << (MODE - 197)) | (1L << (MODIFY - 197)) | (1L << (MONTH - 197)) | (1L << (NAME - 197)) | (1L << (NAMES - 197)) | (1L << (NEGATIVE - 197)) | (1L << (NO - 197)) | (1L << (NODE - 197)) | (1L << (NOT - 197)) | (1L << (NULL - 197)) | (1L << (NULLS - 197)) | (1L << (OBSERVER - 197)) | (1L << (OFFSET - 197)) | (1L << (ONLY - 197)) | (1L << (OPEN - 197)) | (1L << (OPTION - 197)) | (1L << (PARTITIONS - 197)) | (1L << (PASSWORD - 197)) | (1L << (PATH - 197)) | (1L << (PAUSE - 197)) | (1L << (PERCENTILE_UNION - 197)) | (1L << (PLUGIN - 197)) | (1L << (PLUGINS - 197)) | (1L << (PRECEDING - 197)) | (1L << (PROC - 197)) | (1L << (PROCESSLIST - 197)) | (1L << (PROPERTIES - 197)) | (1L << (PROPERTY - 197)) | (1L << (QUARTER - 197)) | (1L << (QUERY - 197)) | (1L << (QUOTA - 197)) | (1L << (RANDOM - 197)) | (1L << (RANK - 197)) | (1L << (RECOVER - 197)) | (1L << (REFRESH - 197)) | (1L << (REGEXP - 197)) | (1L << (REPAIR - 197)) | (1L << (REPEATABLE - 197)) | (1L << (REPLACE - 197)) | (1L << (REPLACE_IF_NOT_NULL - 197)) | (1L << (REPLICA - 197)) | (1L << (REPOSITORY - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPOSITORIES - 261)) | (1L << (RESOURCE - 261)) | (1L << (RESOURCES - 261)) | (1L << (RESTORE - 261)) | (1L << (RESUME - 261)) | (1L << (RETURNS - 261)) | (1L << (REVERT - 261)) | (1L << (RIGHT - 261)) | (1L << (RLIKE - 261)) | (1L << (ROLE - 261)) | (1L << (ROLES - 261)) | (1L << (ROLLBACK - 261)) | (1L << (ROLLUP - 261)) | (1L << (ROUTINE - 261)) | (1L << (ROW_NUMBER - 261)) | (1L << (SAMPLE - 261)) | (1L << (SCHEMA - 261)) | (1L << (SECOND - 261)) | (1L << (SERIALIZABLE - 261)) | (1L << (SESSION - 261)) | (1L << (SETS - 261)) | (1L << (SIGNED - 261)) | (1L << (SNAPSHOT - 261)) | (1L << (SQLBLACKLIST - 261)) | (1L << (START - 261)) | (1L << (STATS - 261)) | (1L << (STATUS - 261)) | (1L << (STOP - 261)) | (1L << (STORAGE - 261)) | (1L << (STRING - 261)) | (1L << (SUBMIT - 261)) | (1L << (SUM - 261)) | (1L << (SYNC - 261)) | (1L << (TABLES - 261)) | (1L << (TABLET - 261)) | (1L << (TASK - 261)) | (1L << (TEMPORARY - 261)) | (1L << (THAN - 261)) | (1L << (TIME - 261)) | (1L << (TIMESTAMP - 261)) | (1L << (TIMESTAMPADD - 261)) | (1L << (TIMESTAMPDIFF - 261)) | (1L << (TRANSACTION - 261)) | (1L << (TRIGGERS - 261)) | (1L << (TRUE - 261)) | (1L << (TRUNCATE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (TYPE - 325)) | (1L << (TYPES - 325)) | (1L << (UNBOUNDED - 325)) | (1L << (UNCOMMITTED - 325)) | (1L << (UNINSTALL - 325)) | (1L << (USER - 325)) | (1L << (VALUE - 325)) | (1L << (VARIABLES - 325)) | (1L << (VERBOSE - 325)) | (1L << (VIEW - 325)) | (1L << (WARNINGS - 325)) | (1L << (WEEK - 325)) | (1L << (WHITELIST - 325)) | (1L << (WORK - 325)) | (1L << (WRITE - 325)) | (1L << (YEAR - 325)) | (1L << (PLUS_SYMBOL - 325)) | (1L << (MINUS_SYMBOL - 325)) | (1L << (LOGICAL_NOT - 325)) | (1L << (BITNOT - 325)) | (1L << (AT - 325)) | (1L << (INTEGER_VALUE - 325)) | (1L << (DECIMAL_VALUE - 325)) | (1L << (DOUBLE_VALUE - 325)) | (1L << (SINGLE_QUOTED_TEXT - 325)) | (1L << (DOUBLE_QUOTED_TEXT - 325)) | (1L << (LETTER_IDENTIFIER - 325)) | (1L << (DIGIT_IDENTIFIER - 325)) | (1L << (BACKQUOTED_IDENTIFIER - 325)) | (1L << (DOTDOTDOT - 325)))) != 0)) {
					{
					setState(1154);
					expression(0);
					setState(1159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(1155);
						match(T__0);
						setState(1156);
						expression(0);
						}
						}
						setState(1161);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1164);
				match(T__2);
				}
				break;
			case LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1165);
				((WindowFunctionContext)_localctx).name = match(LAST_VALUE);
				setState(1166);
				match(T__1);
				setState(1175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (T__1 - 2)) | (1L << (T__4 - 2)) | (1L << (T__8 - 2)) | (1L << (ADMIN - 2)) | (1L << (AFTER - 2)) | (1L << (AGGREGATE - 2)) | (1L << (ARRAY - 2)) | (1L << (ASYNC - 2)) | (1L << (AUTHORS - 2)) | (1L << (AVG - 2)) | (1L << (BACKEND - 2)) | (1L << (BACKENDS - 2)) | (1L << (BACKUP - 2)) | (1L << (BEGIN - 2)) | (1L << (BITMAP_UNION - 2)) | (1L << (BOOLEAN - 2)) | (1L << (BROKER - 2)) | (1L << (BUCKETS - 2)) | (1L << (BUILTIN - 2)) | (1L << (CASE - 2)) | (1L << (CAST - 2)) | (1L << (CATALOG - 2)) | (1L << (CATALOGS - 2)) | (1L << (CEIL - 2)) | (1L << (CHAIN - 2)) | (1L << (CHAR - 2)) | (1L << (CHARSET - 2)) | (1L << (COLLATION - 2)) | (1L << (COLUMNS - 2)) | (1L << (COMMENT - 2)) | (1L << (COMMIT - 2)) | (1L << (COMMITTED - 2)) | (1L << (COMPUTE - 2)) | (1L << (CONFIG - 2)) | (1L << (CONNECTION - 2)) | (1L << (CONNECTION_ID - 2)) | (1L << (CONSISTENT - 2)) | (1L << (CONVERT - 2)) | (1L << (COSTS - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (COUNT - 66)) | (1L << (CURRENT - 66)) | (1L << (CURRENT_TIMESTAMP - 66)) | (1L << (CURRENT_USER - 66)) | (1L << (DATA - 66)) | (1L << (DATABASE - 66)) | (1L << (DATE - 66)) | (1L << (DATETIME - 66)) | (1L << (DAY - 66)) | (1L << (DECOMMISSION - 66)) | (1L << (DENSE_RANK - 66)) | (1L << (NTILE - 66)) | (1L << (DISTRIBUTION - 66)) | (1L << (DUPLICATE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (END - 66)) | (1L << (ENGINE - 66)) | (1L << (ENGINES - 66)) | (1L << (ERRORS - 66)) | (1L << (EVENTS - 66)) | (1L << (EXECUTE - 66)) | (1L << (EXISTS - 66)) | (1L << (EXTERNAL - 66)) | (1L << (EXTRACT - 66)) | (1L << (EVERY - 66)) | (1L << (FALSE - 66)) | (1L << (FILE - 66)) | (1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FIRST_VALUE - 66)) | (1L << (FLOOR - 66)) | (1L << (FN - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FOLLOWER - 66)) | (1L << (FORMAT - 66)) | (1L << (FREE - 66)) | (1L << (FRONTEND - 66)) | (1L << (FRONTENDS - 66)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (FUNCTIONS - 132)) | (1L << (GLOBAL - 132)) | (1L << (GRANTS - 132)) | (1L << (GROUPING - 132)) | (1L << (GROUPING_ID - 132)) | (1L << (HASH - 132)) | (1L << (HELP - 132)) | (1L << (HISTOGRAM - 132)) | (1L << (HLL_UNION - 132)) | (1L << (HOUR - 132)) | (1L << (HUB - 132)) | (1L << (IDENTIFIED - 132)) | (1L << (IF - 132)) | (1L << (IMPERSONATE - 132)) | (1L << (INDEXES - 132)) | (1L << (INSTALL - 132)) | (1L << (INTERMEDIATE - 132)) | (1L << (INTERVAL - 132)) | (1L << (OVERWRITE - 132)) | (1L << (ISOLATION - 132)) | (1L << (JOB - 132)) | (1L << (LABEL - 132)) | (1L << (LAG - 132)) | (1L << (LAST - 132)) | (1L << (LAST_VALUE - 132)) | (1L << (LEAD - 132)) | (1L << (LEFT - 132)) | (1L << (LESS - 132)) | (1L << (LEVEL - 132)) | (1L << (LIKE - 132)) | (1L << (LIST - 132)) | (1L << (LOCAL - 132)) | (1L << (LOGICAL - 132)) | (1L << (MANUAL - 132)) | (1L << (MATERIALIZED - 132)) | (1L << (MAX - 132)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (MERGE - 197)) | (1L << (MIN - 197)) | (1L << (MINUTE - 197)) | (1L << (META - 197)) | (1L << (MOD - 197)) | (1L << (MODE - 197)) | (1L << (MODIFY - 197)) | (1L << (MONTH - 197)) | (1L << (NAME - 197)) | (1L << (NAMES - 197)) | (1L << (NEGATIVE - 197)) | (1L << (NO - 197)) | (1L << (NODE - 197)) | (1L << (NOT - 197)) | (1L << (NULL - 197)) | (1L << (NULLS - 197)) | (1L << (OBSERVER - 197)) | (1L << (OFFSET - 197)) | (1L << (ONLY - 197)) | (1L << (OPEN - 197)) | (1L << (OPTION - 197)) | (1L << (PARTITIONS - 197)) | (1L << (PASSWORD - 197)) | (1L << (PATH - 197)) | (1L << (PAUSE - 197)) | (1L << (PERCENTILE_UNION - 197)) | (1L << (PLUGIN - 197)) | (1L << (PLUGINS - 197)) | (1L << (PRECEDING - 197)) | (1L << (PROC - 197)) | (1L << (PROCESSLIST - 197)) | (1L << (PROPERTIES - 197)) | (1L << (PROPERTY - 197)) | (1L << (QUARTER - 197)) | (1L << (QUERY - 197)) | (1L << (QUOTA - 197)) | (1L << (RANDOM - 197)) | (1L << (RANK - 197)) | (1L << (RECOVER - 197)) | (1L << (REFRESH - 197)) | (1L << (REGEXP - 197)) | (1L << (REPAIR - 197)) | (1L << (REPEATABLE - 197)) | (1L << (REPLACE - 197)) | (1L << (REPLACE_IF_NOT_NULL - 197)) | (1L << (REPLICA - 197)) | (1L << (REPOSITORY - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPOSITORIES - 261)) | (1L << (RESOURCE - 261)) | (1L << (RESOURCES - 261)) | (1L << (RESTORE - 261)) | (1L << (RESUME - 261)) | (1L << (RETURNS - 261)) | (1L << (REVERT - 261)) | (1L << (RIGHT - 261)) | (1L << (RLIKE - 261)) | (1L << (ROLE - 261)) | (1L << (ROLES - 261)) | (1L << (ROLLBACK - 261)) | (1L << (ROLLUP - 261)) | (1L << (ROUTINE - 261)) | (1L << (ROW_NUMBER - 261)) | (1L << (SAMPLE - 261)) | (1L << (SCHEMA - 261)) | (1L << (SECOND - 261)) | (1L << (SERIALIZABLE - 261)) | (1L << (SESSION - 261)) | (1L << (SETS - 261)) | (1L << (SIGNED - 261)) | (1L << (SNAPSHOT - 261)) | (1L << (SQLBLACKLIST - 261)) | (1L << (START - 261)) | (1L << (STATS - 261)) | (1L << (STATUS - 261)) | (1L << (STOP - 261)) | (1L << (STORAGE - 261)) | (1L << (STRING - 261)) | (1L << (SUBMIT - 261)) | (1L << (SUM - 261)) | (1L << (SYNC - 261)) | (1L << (TABLES - 261)) | (1L << (TABLET - 261)) | (1L << (TASK - 261)) | (1L << (TEMPORARY - 261)) | (1L << (THAN - 261)) | (1L << (TIME - 261)) | (1L << (TIMESTAMP - 261)) | (1L << (TIMESTAMPADD - 261)) | (1L << (TIMESTAMPDIFF - 261)) | (1L << (TRANSACTION - 261)) | (1L << (TRIGGERS - 261)) | (1L << (TRUE - 261)) | (1L << (TRUNCATE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (TYPE - 325)) | (1L << (TYPES - 325)) | (1L << (UNBOUNDED - 325)) | (1L << (UNCOMMITTED - 325)) | (1L << (UNINSTALL - 325)) | (1L << (USER - 325)) | (1L << (VALUE - 325)) | (1L << (VARIABLES - 325)) | (1L << (VERBOSE - 325)) | (1L << (VIEW - 325)) | (1L << (WARNINGS - 325)) | (1L << (WEEK - 325)) | (1L << (WHITELIST - 325)) | (1L << (WORK - 325)) | (1L << (WRITE - 325)) | (1L << (YEAR - 325)) | (1L << (PLUS_SYMBOL - 325)) | (1L << (MINUS_SYMBOL - 325)) | (1L << (LOGICAL_NOT - 325)) | (1L << (BITNOT - 325)) | (1L << (AT - 325)) | (1L << (INTEGER_VALUE - 325)) | (1L << (DECIMAL_VALUE - 325)) | (1L << (DOUBLE_VALUE - 325)) | (1L << (SINGLE_QUOTED_TEXT - 325)) | (1L << (DOUBLE_QUOTED_TEXT - 325)) | (1L << (LETTER_IDENTIFIER - 325)) | (1L << (DIGIT_IDENTIFIER - 325)) | (1L << (BACKQUOTED_IDENTIFIER - 325)) | (1L << (DOTDOTDOT - 325)))) != 0)) {
					{
					setState(1167);
					expression(0);
					setState(1172);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(1168);
						match(T__0);
						setState(1169);
						expression(0);
						}
						}
						setState(1174);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1177);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(DemoDBParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(DemoDBParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			match(WHEN);
			setState(1181);
			((WhenClauseContext)_localctx).condition = expression(0);
			setState(1182);
			match(THEN);
			setState(1183);
			((WhenClauseContext)_localctx).result = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OverContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode OVER() { return getToken(DemoDBParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(DemoDBParser.PARTITION, 0); }
		public List<TerminalNode> BY() { return getTokens(DemoDBParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(DemoDBParser.BY, i);
		}
		public TerminalNode ORDER() { return getToken(DemoDBParser.ORDER, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitOver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitOver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverContext over() throws RecognitionException {
		OverContext _localctx = new OverContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_over);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1185);
			match(OVER);
			setState(1186);
			match(T__1);
			setState(1197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1187);
				match(PARTITION);
				setState(1188);
				match(BY);
				setState(1189);
				((OverContext)_localctx).expression = expression(0);
				((OverContext)_localctx).partition.add(((OverContext)_localctx).expression);
				setState(1194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(1190);
					match(T__0);
					setState(1191);
					((OverContext)_localctx).expression = expression(0);
					((OverContext)_localctx).partition.add(((OverContext)_localctx).expression);
					}
					}
					setState(1196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1199);
				match(ORDER);
				setState(1200);
				match(BY);
				setState(1201);
				sortItem();
				setState(1206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(1202);
					match(T__0);
					setState(1203);
					sortItem();
					}
					}
					setState(1208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(1211);
				windowFrame();
				}
			}

			setState(1214);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(DemoDBParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(DemoDBParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(DemoDBParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(DemoDBParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_windowFrame);
		try {
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1216);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1217);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1218);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1219);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1220);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1221);
				match(BETWEEN);
				setState(1222);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1223);
				match(AND);
				setState(1224);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1226);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1227);
				match(BETWEEN);
				setState(1228);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1229);
				match(AND);
				setState(1230);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
	 
		public FrameBoundContext() { }
		public void copyFrom(FrameBoundContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PRECEDING() { return getToken(DemoDBParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(DemoDBParser.FOLLOWING, 0); }
		public BoundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterBoundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitBoundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitBoundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnboundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(DemoDBParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(DemoDBParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(DemoDBParser.FOLLOWING, 0); }
		public UnboundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterUnboundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitUnboundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitUnboundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentRowBoundContext extends FrameBoundContext {
		public TerminalNode CURRENT() { return getToken(DemoDBParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(DemoDBParser.ROW, 0); }
		public CurrentRowBoundContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterCurrentRowBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitCurrentRowBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitCurrentRowBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_frameBound);
		int _la;
		try {
			setState(1243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1234);
				match(UNBOUNDED);
				setState(1235);
				((UnboundedFrameContext)_localctx).boundType = match(PRECEDING);
				}
				break;
			case 2:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1236);
				match(UNBOUNDED);
				setState(1237);
				((UnboundedFrameContext)_localctx).boundType = match(FOLLOWING);
				}
				break;
			case 3:
				_localctx = new CurrentRowBoundContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1238);
				match(CURRENT);
				setState(1239);
				match(ROW);
				}
				break;
			case 4:
				_localctx = new BoundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1240);
				expression(0);
				setState(1241);
				((BoundedFrameContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((BoundedFrameContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode AFTER() { return getToken(DemoDBParser.AFTER, 0); }
		public TerminalNode AGGREGATE() { return getToken(DemoDBParser.AGGREGATE, 0); }
		public TerminalNode ASYNC() { return getToken(DemoDBParser.ASYNC, 0); }
		public TerminalNode AUTHORS() { return getToken(DemoDBParser.AUTHORS, 0); }
		public TerminalNode AVG() { return getToken(DemoDBParser.AVG, 0); }
		public TerminalNode ADMIN() { return getToken(DemoDBParser.ADMIN, 0); }
		public TerminalNode BACKEND() { return getToken(DemoDBParser.BACKEND, 0); }
		public TerminalNode BACKENDS() { return getToken(DemoDBParser.BACKENDS, 0); }
		public TerminalNode BACKUP() { return getToken(DemoDBParser.BACKUP, 0); }
		public TerminalNode BEGIN() { return getToken(DemoDBParser.BEGIN, 0); }
		public TerminalNode BITMAP_UNION() { return getToken(DemoDBParser.BITMAP_UNION, 0); }
		public TerminalNode BOOLEAN() { return getToken(DemoDBParser.BOOLEAN, 0); }
		public TerminalNode BROKER() { return getToken(DemoDBParser.BROKER, 0); }
		public TerminalNode BUCKETS() { return getToken(DemoDBParser.BUCKETS, 0); }
		public TerminalNode BUILTIN() { return getToken(DemoDBParser.BUILTIN, 0); }
		public TerminalNode CAST() { return getToken(DemoDBParser.CAST, 0); }
		public TerminalNode CATALOG() { return getToken(DemoDBParser.CATALOG, 0); }
		public TerminalNode CATALOGS() { return getToken(DemoDBParser.CATALOGS, 0); }
		public TerminalNode CEIL() { return getToken(DemoDBParser.CEIL, 0); }
		public TerminalNode CHAIN() { return getToken(DemoDBParser.CHAIN, 0); }
		public TerminalNode CHARSET() { return getToken(DemoDBParser.CHARSET, 0); }
		public TerminalNode CURRENT() { return getToken(DemoDBParser.CURRENT, 0); }
		public TerminalNode COLLATION() { return getToken(DemoDBParser.COLLATION, 0); }
		public TerminalNode COLUMNS() { return getToken(DemoDBParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(DemoDBParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(DemoDBParser.COMMIT, 0); }
		public TerminalNode COMMITTED() { return getToken(DemoDBParser.COMMITTED, 0); }
		public TerminalNode COMPUTE() { return getToken(DemoDBParser.COMPUTE, 0); }
		public TerminalNode CONNECTION() { return getToken(DemoDBParser.CONNECTION, 0); }
		public TerminalNode CONNECTION_ID() { return getToken(DemoDBParser.CONNECTION_ID, 0); }
		public TerminalNode CONSISTENT() { return getToken(DemoDBParser.CONSISTENT, 0); }
		public TerminalNode COSTS() { return getToken(DemoDBParser.COSTS, 0); }
		public TerminalNode COUNT() { return getToken(DemoDBParser.COUNT, 0); }
		public TerminalNode CONFIG() { return getToken(DemoDBParser.CONFIG, 0); }
		public TerminalNode DATA() { return getToken(DemoDBParser.DATA, 0); }
		public TerminalNode DATE() { return getToken(DemoDBParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(DemoDBParser.DATETIME, 0); }
		public TerminalNode DAY() { return getToken(DemoDBParser.DAY, 0); }
		public TerminalNode DECOMMISSION() { return getToken(DemoDBParser.DECOMMISSION, 0); }
		public TerminalNode DISTRIBUTION() { return getToken(DemoDBParser.DISTRIBUTION, 0); }
		public TerminalNode DUPLICATE() { return getToken(DemoDBParser.DUPLICATE, 0); }
		public TerminalNode DYNAMIC() { return getToken(DemoDBParser.DYNAMIC, 0); }
		public TerminalNode END() { return getToken(DemoDBParser.END, 0); }
		public TerminalNode ENGINE() { return getToken(DemoDBParser.ENGINE, 0); }
		public TerminalNode ENGINES() { return getToken(DemoDBParser.ENGINES, 0); }
		public TerminalNode ERRORS() { return getToken(DemoDBParser.ERRORS, 0); }
		public TerminalNode EVENTS() { return getToken(DemoDBParser.EVENTS, 0); }
		public TerminalNode EXECUTE() { return getToken(DemoDBParser.EXECUTE, 0); }
		public TerminalNode EXTERNAL() { return getToken(DemoDBParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(DemoDBParser.EXTRACT, 0); }
		public TerminalNode EVERY() { return getToken(DemoDBParser.EVERY, 0); }
		public TerminalNode FILE() { return getToken(DemoDBParser.FILE, 0); }
		public TerminalNode FILTER() { return getToken(DemoDBParser.FILTER, 0); }
		public TerminalNode FIRST() { return getToken(DemoDBParser.FIRST, 0); }
		public TerminalNode FLOOR() { return getToken(DemoDBParser.FLOOR, 0); }
		public TerminalNode FOLLOWING() { return getToken(DemoDBParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(DemoDBParser.FORMAT, 0); }
		public TerminalNode FN() { return getToken(DemoDBParser.FN, 0); }
		public TerminalNode FRONTEND() { return getToken(DemoDBParser.FRONTEND, 0); }
		public TerminalNode FRONTENDS() { return getToken(DemoDBParser.FRONTENDS, 0); }
		public TerminalNode FOLLOWER() { return getToken(DemoDBParser.FOLLOWER, 0); }
		public TerminalNode FREE() { return getToken(DemoDBParser.FREE, 0); }
		public TerminalNode FUNCTIONS() { return getToken(DemoDBParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(DemoDBParser.GLOBAL, 0); }
		public TerminalNode GRANTS() { return getToken(DemoDBParser.GRANTS, 0); }
		public TerminalNode HASH() { return getToken(DemoDBParser.HASH, 0); }
		public TerminalNode HISTOGRAM() { return getToken(DemoDBParser.HISTOGRAM, 0); }
		public TerminalNode HELP() { return getToken(DemoDBParser.HELP, 0); }
		public TerminalNode HLL_UNION() { return getToken(DemoDBParser.HLL_UNION, 0); }
		public TerminalNode HOUR() { return getToken(DemoDBParser.HOUR, 0); }
		public TerminalNode HUB() { return getToken(DemoDBParser.HUB, 0); }
		public TerminalNode IDENTIFIED() { return getToken(DemoDBParser.IDENTIFIED, 0); }
		public TerminalNode IMPERSONATE() { return getToken(DemoDBParser.IMPERSONATE, 0); }
		public TerminalNode INDEXES() { return getToken(DemoDBParser.INDEXES, 0); }
		public TerminalNode INSTALL() { return getToken(DemoDBParser.INSTALL, 0); }
		public TerminalNode INTERMEDIATE() { return getToken(DemoDBParser.INTERMEDIATE, 0); }
		public TerminalNode INTERVAL() { return getToken(DemoDBParser.INTERVAL, 0); }
		public TerminalNode ISOLATION() { return getToken(DemoDBParser.ISOLATION, 0); }
		public TerminalNode JOB() { return getToken(DemoDBParser.JOB, 0); }
		public TerminalNode LABEL() { return getToken(DemoDBParser.LABEL, 0); }
		public TerminalNode LAST() { return getToken(DemoDBParser.LAST, 0); }
		public TerminalNode LESS() { return getToken(DemoDBParser.LESS, 0); }
		public TerminalNode LEVEL() { return getToken(DemoDBParser.LEVEL, 0); }
		public TerminalNode LIST() { return getToken(DemoDBParser.LIST, 0); }
		public TerminalNode LOCAL() { return getToken(DemoDBParser.LOCAL, 0); }
		public TerminalNode LOGICAL() { return getToken(DemoDBParser.LOGICAL, 0); }
		public TerminalNode MANUAL() { return getToken(DemoDBParser.MANUAL, 0); }
		public TerminalNode MATERIALIZED() { return getToken(DemoDBParser.MATERIALIZED, 0); }
		public TerminalNode MAX() { return getToken(DemoDBParser.MAX, 0); }
		public TerminalNode META() { return getToken(DemoDBParser.META, 0); }
		public TerminalNode MIN() { return getToken(DemoDBParser.MIN, 0); }
		public TerminalNode MINUTE() { return getToken(DemoDBParser.MINUTE, 0); }
		public TerminalNode MODE() { return getToken(DemoDBParser.MODE, 0); }
		public TerminalNode MODIFY() { return getToken(DemoDBParser.MODIFY, 0); }
		public TerminalNode MONTH() { return getToken(DemoDBParser.MONTH, 0); }
		public TerminalNode MERGE() { return getToken(DemoDBParser.MERGE, 0); }
		public TerminalNode NAME() { return getToken(DemoDBParser.NAME, 0); }
		public TerminalNode NAMES() { return getToken(DemoDBParser.NAMES, 0); }
		public TerminalNode NEGATIVE() { return getToken(DemoDBParser.NEGATIVE, 0); }
		public TerminalNode NO() { return getToken(DemoDBParser.NO, 0); }
		public TerminalNode NODE() { return getToken(DemoDBParser.NODE, 0); }
		public TerminalNode NULLS() { return getToken(DemoDBParser.NULLS, 0); }
		public TerminalNode OBSERVER() { return getToken(DemoDBParser.OBSERVER, 0); }
		public TerminalNode OFFSET() { return getToken(DemoDBParser.OFFSET, 0); }
		public TerminalNode ONLY() { return getToken(DemoDBParser.ONLY, 0); }
		public TerminalNode OPEN() { return getToken(DemoDBParser.OPEN, 0); }
		public TerminalNode OPTION() { return getToken(DemoDBParser.OPTION, 0); }
		public TerminalNode OVERWRITE() { return getToken(DemoDBParser.OVERWRITE, 0); }
		public TerminalNode PARTITIONS() { return getToken(DemoDBParser.PARTITIONS, 0); }
		public TerminalNode PASSWORD() { return getToken(DemoDBParser.PASSWORD, 0); }
		public TerminalNode PATH() { return getToken(DemoDBParser.PATH, 0); }
		public TerminalNode PAUSE() { return getToken(DemoDBParser.PAUSE, 0); }
		public TerminalNode PERCENTILE_UNION() { return getToken(DemoDBParser.PERCENTILE_UNION, 0); }
		public TerminalNode PLUGIN() { return getToken(DemoDBParser.PLUGIN, 0); }
		public TerminalNode PLUGINS() { return getToken(DemoDBParser.PLUGINS, 0); }
		public TerminalNode PRECEDING() { return getToken(DemoDBParser.PRECEDING, 0); }
		public TerminalNode PROC() { return getToken(DemoDBParser.PROC, 0); }
		public TerminalNode PROCESSLIST() { return getToken(DemoDBParser.PROCESSLIST, 0); }
		public TerminalNode PROPERTIES() { return getToken(DemoDBParser.PROPERTIES, 0); }
		public TerminalNode PROPERTY() { return getToken(DemoDBParser.PROPERTY, 0); }
		public TerminalNode QUARTER() { return getToken(DemoDBParser.QUARTER, 0); }
		public TerminalNode QUERY() { return getToken(DemoDBParser.QUERY, 0); }
		public TerminalNode QUOTA() { return getToken(DemoDBParser.QUOTA, 0); }
		public TerminalNode RANDOM() { return getToken(DemoDBParser.RANDOM, 0); }
		public TerminalNode RECOVER() { return getToken(DemoDBParser.RECOVER, 0); }
		public TerminalNode REFRESH() { return getToken(DemoDBParser.REFRESH, 0); }
		public TerminalNode REPAIR() { return getToken(DemoDBParser.REPAIR, 0); }
		public TerminalNode REPEATABLE() { return getToken(DemoDBParser.REPEATABLE, 0); }
		public TerminalNode REPLACE_IF_NOT_NULL() { return getToken(DemoDBParser.REPLACE_IF_NOT_NULL, 0); }
		public TerminalNode REPLICA() { return getToken(DemoDBParser.REPLICA, 0); }
		public TerminalNode REPOSITORY() { return getToken(DemoDBParser.REPOSITORY, 0); }
		public TerminalNode REPOSITORIES() { return getToken(DemoDBParser.REPOSITORIES, 0); }
		public TerminalNode RESOURCE() { return getToken(DemoDBParser.RESOURCE, 0); }
		public TerminalNode RESOURCES() { return getToken(DemoDBParser.RESOURCES, 0); }
		public TerminalNode RESTORE() { return getToken(DemoDBParser.RESTORE, 0); }
		public TerminalNode RESUME() { return getToken(DemoDBParser.RESUME, 0); }
		public TerminalNode RETURNS() { return getToken(DemoDBParser.RETURNS, 0); }
		public TerminalNode REVERT() { return getToken(DemoDBParser.REVERT, 0); }
		public TerminalNode ROLE() { return getToken(DemoDBParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(DemoDBParser.ROLES, 0); }
		public TerminalNode ROLLUP() { return getToken(DemoDBParser.ROLLUP, 0); }
		public TerminalNode ROLLBACK() { return getToken(DemoDBParser.ROLLBACK, 0); }
		public TerminalNode ROUTINE() { return getToken(DemoDBParser.ROUTINE, 0); }
		public TerminalNode SAMPLE() { return getToken(DemoDBParser.SAMPLE, 0); }
		public TerminalNode SECOND() { return getToken(DemoDBParser.SECOND, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(DemoDBParser.SERIALIZABLE, 0); }
		public TerminalNode SESSION() { return getToken(DemoDBParser.SESSION, 0); }
		public TerminalNode SETS() { return getToken(DemoDBParser.SETS, 0); }
		public TerminalNode SIGNED() { return getToken(DemoDBParser.SIGNED, 0); }
		public TerminalNode SNAPSHOT() { return getToken(DemoDBParser.SNAPSHOT, 0); }
		public TerminalNode SQLBLACKLIST() { return getToken(DemoDBParser.SQLBLACKLIST, 0); }
		public TerminalNode START() { return getToken(DemoDBParser.START, 0); }
		public TerminalNode SUM() { return getToken(DemoDBParser.SUM, 0); }
		public TerminalNode STATUS() { return getToken(DemoDBParser.STATUS, 0); }
		public TerminalNode STOP() { return getToken(DemoDBParser.STOP, 0); }
		public TerminalNode STORAGE() { return getToken(DemoDBParser.STORAGE, 0); }
		public TerminalNode STRING() { return getToken(DemoDBParser.STRING, 0); }
		public TerminalNode STATS() { return getToken(DemoDBParser.STATS, 0); }
		public TerminalNode SUBMIT() { return getToken(DemoDBParser.SUBMIT, 0); }
		public TerminalNode SYNC() { return getToken(DemoDBParser.SYNC, 0); }
		public TerminalNode TABLES() { return getToken(DemoDBParser.TABLES, 0); }
		public TerminalNode TABLET() { return getToken(DemoDBParser.TABLET, 0); }
		public TerminalNode TASK() { return getToken(DemoDBParser.TASK, 0); }
		public TerminalNode TEMPORARY() { return getToken(DemoDBParser.TEMPORARY, 0); }
		public TerminalNode TIMESTAMP() { return getToken(DemoDBParser.TIMESTAMP, 0); }
		public TerminalNode TIMESTAMPADD() { return getToken(DemoDBParser.TIMESTAMPADD, 0); }
		public TerminalNode TIMESTAMPDIFF() { return getToken(DemoDBParser.TIMESTAMPDIFF, 0); }
		public TerminalNode THAN() { return getToken(DemoDBParser.THAN, 0); }
		public TerminalNode TIME() { return getToken(DemoDBParser.TIME, 0); }
		public TerminalNode TRANSACTION() { return getToken(DemoDBParser.TRANSACTION, 0); }
		public TerminalNode TRIGGERS() { return getToken(DemoDBParser.TRIGGERS, 0); }
		public TerminalNode TRUNCATE() { return getToken(DemoDBParser.TRUNCATE, 0); }
		public TerminalNode TYPE() { return getToken(DemoDBParser.TYPE, 0); }
		public TerminalNode TYPES() { return getToken(DemoDBParser.TYPES, 0); }
		public TerminalNode UNBOUNDED() { return getToken(DemoDBParser.UNBOUNDED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(DemoDBParser.UNCOMMITTED, 0); }
		public TerminalNode UNINSTALL() { return getToken(DemoDBParser.UNINSTALL, 0); }
		public TerminalNode USER() { return getToken(DemoDBParser.USER, 0); }
		public TerminalNode VALUE() { return getToken(DemoDBParser.VALUE, 0); }
		public TerminalNode VARIABLES() { return getToken(DemoDBParser.VARIABLES, 0); }
		public TerminalNode VIEW() { return getToken(DemoDBParser.VIEW, 0); }
		public TerminalNode VERBOSE() { return getToken(DemoDBParser.VERBOSE, 0); }
		public TerminalNode WARNINGS() { return getToken(DemoDBParser.WARNINGS, 0); }
		public TerminalNode WEEK() { return getToken(DemoDBParser.WEEK, 0); }
		public TerminalNode WHITELIST() { return getToken(DemoDBParser.WHITELIST, 0); }
		public TerminalNode WORK() { return getToken(DemoDBParser.WORK, 0); }
		public TerminalNode WRITE() { return getToken(DemoDBParser.WRITE, 0); }
		public TerminalNode YEAR() { return getToken(DemoDBParser.YEAR, 0); }
		public TerminalNode DOTDOTDOT() { return getToken(DemoDBParser.DOTDOTDOT, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			_la = _input.LA(1);
			if ( !(((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (ADMIN - 13)) | (1L << (AFTER - 13)) | (1L << (AGGREGATE - 13)) | (1L << (ASYNC - 13)) | (1L << (AUTHORS - 13)) | (1L << (AVG - 13)) | (1L << (BACKEND - 13)) | (1L << (BACKENDS - 13)) | (1L << (BACKUP - 13)) | (1L << (BEGIN - 13)) | (1L << (BITMAP_UNION - 13)) | (1L << (BOOLEAN - 13)) | (1L << (BROKER - 13)) | (1L << (BUCKETS - 13)) | (1L << (BUILTIN - 13)) | (1L << (CAST - 13)) | (1L << (CATALOG - 13)) | (1L << (CATALOGS - 13)) | (1L << (CEIL - 13)) | (1L << (CHAIN - 13)) | (1L << (CHARSET - 13)) | (1L << (COLLATION - 13)) | (1L << (COLUMNS - 13)) | (1L << (COMMENT - 13)) | (1L << (COMMIT - 13)) | (1L << (COMMITTED - 13)) | (1L << (COMPUTE - 13)) | (1L << (CONFIG - 13)) | (1L << (CONNECTION - 13)) | (1L << (CONNECTION_ID - 13)) | (1L << (CONSISTENT - 13)) | (1L << (COSTS - 13)) | (1L << (COUNT - 13)) | (1L << (CURRENT - 13)) | (1L << (DATA - 13)) | (1L << (DATE - 13)))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (DATETIME - 77)) | (1L << (DAY - 77)) | (1L << (DECOMMISSION - 77)) | (1L << (DISTRIBUTION - 77)) | (1L << (DUPLICATE - 77)) | (1L << (DYNAMIC - 77)) | (1L << (END - 77)) | (1L << (ENGINE - 77)) | (1L << (ENGINES - 77)) | (1L << (ERRORS - 77)) | (1L << (EVENTS - 77)) | (1L << (EXECUTE - 77)) | (1L << (EXTERNAL - 77)) | (1L << (EXTRACT - 77)) | (1L << (EVERY - 77)) | (1L << (FILE - 77)) | (1L << (FILTER - 77)) | (1L << (FIRST - 77)) | (1L << (FLOOR - 77)) | (1L << (FN - 77)) | (1L << (FOLLOWING - 77)) | (1L << (FOLLOWER - 77)) | (1L << (FORMAT - 77)) | (1L << (FREE - 77)) | (1L << (FRONTEND - 77)) | (1L << (FRONTENDS - 77)) | (1L << (FUNCTIONS - 77)) | (1L << (GLOBAL - 77)) | (1L << (GRANTS - 77)) | (1L << (HASH - 77)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (HELP - 142)) | (1L << (HISTOGRAM - 142)) | (1L << (HLL_UNION - 142)) | (1L << (HOUR - 142)) | (1L << (HUB - 142)) | (1L << (IDENTIFIED - 142)) | (1L << (IMPERSONATE - 142)) | (1L << (INDEXES - 142)) | (1L << (INSTALL - 142)) | (1L << (INTERMEDIATE - 142)) | (1L << (INTERVAL - 142)) | (1L << (OVERWRITE - 142)) | (1L << (ISOLATION - 142)) | (1L << (JOB - 142)) | (1L << (LABEL - 142)) | (1L << (LAST - 142)) | (1L << (LESS - 142)) | (1L << (LEVEL - 142)) | (1L << (LIST - 142)) | (1L << (LOCAL - 142)) | (1L << (LOGICAL - 142)) | (1L << (MANUAL - 142)) | (1L << (MATERIALIZED - 142)) | (1L << (MAX - 142)) | (1L << (MERGE - 142)) | (1L << (MIN - 142)) | (1L << (MINUTE - 142)) | (1L << (META - 142)) | (1L << (MODE - 142)) | (1L << (MODIFY - 142)) | (1L << (MONTH - 142)))) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (NAME - 206)) | (1L << (NAMES - 206)) | (1L << (NEGATIVE - 206)) | (1L << (NO - 206)) | (1L << (NODE - 206)) | (1L << (NULLS - 206)) | (1L << (OBSERVER - 206)) | (1L << (OFFSET - 206)) | (1L << (ONLY - 206)) | (1L << (OPEN - 206)) | (1L << (OPTION - 206)) | (1L << (PARTITIONS - 206)) | (1L << (PASSWORD - 206)) | (1L << (PATH - 206)) | (1L << (PAUSE - 206)) | (1L << (PERCENTILE_UNION - 206)) | (1L << (PLUGIN - 206)) | (1L << (PLUGINS - 206)) | (1L << (PRECEDING - 206)) | (1L << (PROC - 206)) | (1L << (PROCESSLIST - 206)) | (1L << (PROPERTIES - 206)) | (1L << (PROPERTY - 206)) | (1L << (QUARTER - 206)) | (1L << (QUERY - 206)) | (1L << (QUOTA - 206)) | (1L << (RANDOM - 206)) | (1L << (RECOVER - 206)) | (1L << (REFRESH - 206)) | (1L << (REPAIR - 206)) | (1L << (REPEATABLE - 206)) | (1L << (REPLACE_IF_NOT_NULL - 206)) | (1L << (REPLICA - 206)) | (1L << (REPOSITORY - 206)) | (1L << (REPOSITORIES - 206)) | (1L << (RESOURCE - 206)) | (1L << (RESOURCES - 206)) | (1L << (RESTORE - 206)) | (1L << (RESUME - 206)) | (1L << (RETURNS - 206)) | (1L << (REVERT - 206)))) != 0) || ((((_la - 271)) & ~0x3f) == 0 && ((1L << (_la - 271)) & ((1L << (ROLE - 271)) | (1L << (ROLES - 271)) | (1L << (ROLLBACK - 271)) | (1L << (ROLLUP - 271)) | (1L << (ROUTINE - 271)) | (1L << (SAMPLE - 271)) | (1L << (SECOND - 271)) | (1L << (SERIALIZABLE - 271)) | (1L << (SESSION - 271)) | (1L << (SETS - 271)) | (1L << (SIGNED - 271)) | (1L << (SNAPSHOT - 271)) | (1L << (SQLBLACKLIST - 271)) | (1L << (START - 271)) | (1L << (STATS - 271)) | (1L << (STATUS - 271)) | (1L << (STOP - 271)) | (1L << (STORAGE - 271)) | (1L << (STRING - 271)) | (1L << (SUBMIT - 271)) | (1L << (SUM - 271)) | (1L << (SYNC - 271)) | (1L << (TABLES - 271)) | (1L << (TABLET - 271)) | (1L << (TASK - 271)) | (1L << (TEMPORARY - 271)) | (1L << (THAN - 271)) | (1L << (TIME - 271)) | (1L << (TIMESTAMP - 271)) | (1L << (TIMESTAMPADD - 271)) | (1L << (TIMESTAMPDIFF - 271)) | (1L << (TRANSACTION - 271)) | (1L << (TRIGGERS - 271)) | (1L << (TRUNCATE - 271)) | (1L << (TYPE - 271)) | (1L << (TYPES - 271)) | (1L << (UNBOUNDED - 271)) | (1L << (UNCOMMITTED - 271)) | (1L << (UNINSTALL - 271)))) != 0) || ((((_la - 335)) & ~0x3f) == 0 && ((1L << (_la - 335)) & ((1L << (USER - 335)) | (1L << (VALUE - 335)) | (1L << (VARIABLES - 335)) | (1L << (VERBOSE - 335)) | (1L << (VIEW - 335)) | (1L << (WARNINGS - 335)) | (1L << (WEEK - 335)) | (1L << (WHITELIST - 335)) | (1L << (WORK - 335)) | (1L << (WRITE - 335)) | (1L << (YEAR - 335)) | (1L << (DOTDOTDOT - 335)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrdering;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(DemoDBParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(DemoDBParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(DemoDBParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(DemoDBParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(DemoDBParser.LAST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			expression(0);
			setState(1249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1248);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1251);
				match(NULLS);
				setState(1252);
				((SortItemContext)_localctx).nullOrdering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrdering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitElementContext extends ParserRuleContext {
		public Token limit;
		public Token offset;
		public TerminalNode LIMIT() { return getToken(DemoDBParser.LIMIT, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(DemoDBParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(DemoDBParser.INTEGER_VALUE, i);
		}
		public TerminalNode OFFSET() { return getToken(DemoDBParser.OFFSET, 0); }
		public LimitElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterLimitElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitLimitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitLimitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitElementContext limitElement() throws RecognitionException {
		LimitElementContext _localctx = new LimitElementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_limitElement);
		int _la;
		try {
			setState(1265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1255);
				match(LIMIT);
				setState(1256);
				((LimitElementContext)_localctx).limit = match(INTEGER_VALUE);
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET) {
					{
					setState(1257);
					match(OFFSET);
					setState(1258);
					((LimitElementContext)_localctx).offset = match(INTEGER_VALUE);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1261);
				match(LIMIT);
				setState(1262);
				((LimitElementContext)_localctx).offset = match(INTEGER_VALUE);
				setState(1263);
				match(T__0);
				setState(1264);
				((LimitElementContext)_localctx).limit = match(INTEGER_VALUE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public ExpressionContext value;
		public UnitIdentifierContext from;
		public TerminalNode INTERVAL() { return getToken(DemoDBParser.INTERVAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnitIdentifierContext unitIdentifier() {
			return getRuleContext(UnitIdentifierContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			match(INTERVAL);
			setState(1268);
			((IntervalContext)_localctx).value = expression(0);
			setState(1269);
			((IntervalContext)_localctx).from = unitIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitIdentifierContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(DemoDBParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(DemoDBParser.MONTH, 0); }
		public TerminalNode WEEK() { return getToken(DemoDBParser.WEEK, 0); }
		public TerminalNode DAY() { return getToken(DemoDBParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(DemoDBParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(DemoDBParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(DemoDBParser.SECOND, 0); }
		public TerminalNode QUARTER() { return getToken(DemoDBParser.QUARTER, 0); }
		public UnitIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterUnitIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitUnitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitUnitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitIdentifierContext unitIdentifier() throws RecognitionException {
		UnitIdentifierContext _localctx = new UnitIdentifierContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unitIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			_la = _input.LA(1);
			if ( !(_la==DAY || ((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (HOUR - 147)) | (1L << (MINUTE - 147)) | (1L << (MONTH - 147)))) != 0) || _la==QUARTER || _la==SECOND || _la==WEEK || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitBoundaryContext extends ParserRuleContext {
		public TerminalNode FLOOR() { return getToken(DemoDBParser.FLOOR, 0); }
		public TerminalNode CEIL() { return getToken(DemoDBParser.CEIL, 0); }
		public UnitBoundaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitBoundary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterUnitBoundary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitUnitBoundary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitUnitBoundary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitBoundaryContext unitBoundary() throws RecognitionException {
		UnitBoundaryContext _localctx = new UnitBoundaryContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unitBoundary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			_la = _input.LA(1);
			if ( !(_la==CEIL || _la==FLOOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalValueContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(DemoDBParser.DECIMAL_VALUE, 0); }
		public DecimalValueContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterDecimalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitDecimalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitDecimalValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerValueContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(DemoDBParser.INTEGER_VALUE, 0); }
		public IntegerValueContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterIntegerValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitIntegerValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitIntegerValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleValueContext extends NumberContext {
		public TerminalNode DOUBLE_VALUE() { return getToken(DemoDBParser.DOUBLE_VALUE, 0); }
		public DoubleValueContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterDoubleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitDoubleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitDoubleValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_number);
		try {
			setState(1278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_VALUE:
				_localctx = new DecimalValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1275);
				match(DECIMAL_VALUE);
				}
				break;
			case DOUBLE_VALUE:
				_localctx = new DoubleValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1276);
				match(DOUBLE_VALUE);
				}
				break;
			case INTEGER_VALUE:
				_localctx = new IntegerValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1277);
				match(INTEGER_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(DemoDBParser.BOOLEAN, 0); }
		public TerminalNode TINYINT() { return getToken(DemoDBParser.TINYINT, 0); }
		public TypeParameterContext typeParameter() {
			return getRuleContext(TypeParameterContext.class,0);
		}
		public TerminalNode SMALLINT() { return getToken(DemoDBParser.SMALLINT, 0); }
		public TerminalNode SIGNED() { return getToken(DemoDBParser.SIGNED, 0); }
		public TerminalNode INT() { return getToken(DemoDBParser.INT, 0); }
		public TerminalNode INTEGER() { return getToken(DemoDBParser.INTEGER, 0); }
		public TerminalNode UNSIGNED() { return getToken(DemoDBParser.UNSIGNED, 0); }
		public TerminalNode BIGINT() { return getToken(DemoDBParser.BIGINT, 0); }
		public TerminalNode LARGEINT() { return getToken(DemoDBParser.LARGEINT, 0); }
		public TerminalNode FLOAT() { return getToken(DemoDBParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(DemoDBParser.DOUBLE, 0); }
		public TerminalNode DATE() { return getToken(DemoDBParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(DemoDBParser.DATETIME, 0); }
		public TerminalNode TIME() { return getToken(DemoDBParser.TIME, 0); }
		public TerminalNode CHAR() { return getToken(DemoDBParser.CHAR, 0); }
		public TerminalNode VARCHAR() { return getToken(DemoDBParser.VARCHAR, 0); }
		public TerminalNode STRING() { return getToken(DemoDBParser.STRING, 0); }
		public TerminalNode BITMAP() { return getToken(DemoDBParser.BITMAP, 0); }
		public TerminalNode HLL() { return getToken(DemoDBParser.HLL, 0); }
		public TerminalNode PERCENTILE() { return getToken(DemoDBParser.PERCENTILE, 0); }
		public TerminalNode JSON() { return getToken(DemoDBParser.JSON, 0); }
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_baseType);
		int _la;
		try {
			setState(1339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1280);
				match(BOOLEAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1281);
				match(TINYINT);
				setState(1283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1282);
					typeParameter();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1285);
				match(SMALLINT);
				setState(1287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1286);
					typeParameter();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1289);
				match(SIGNED);
				setState(1291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(1290);
					match(INT);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1293);
				match(SIGNED);
				setState(1295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(1294);
					match(INTEGER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1297);
				match(UNSIGNED);
				setState(1299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(1298);
					match(INT);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1301);
				match(UNSIGNED);
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(1302);
					match(INTEGER);
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1305);
				match(INT);
				setState(1307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1306);
					typeParameter();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1309);
				match(INTEGER);
				setState(1311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1310);
					typeParameter();
					}
				}

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1313);
				match(BIGINT);
				setState(1315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1314);
					typeParameter();
					}
				}

				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1317);
				match(LARGEINT);
				setState(1319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1318);
					typeParameter();
					}
				}

				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1321);
				match(FLOAT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1322);
				match(DOUBLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1323);
				match(DATE);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1324);
				match(DATETIME);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1325);
				match(TIME);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1326);
				match(CHAR);
				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1327);
					typeParameter();
					}
				}

				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1330);
				match(VARCHAR);
				setState(1332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1331);
					typeParameter();
					}
				}

				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1334);
				match(STRING);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1335);
				match(BITMAP);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1336);
				match(HLL);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1337);
				match(PERCENTILE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1338);
				match(JSON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public DecimalTypeContext decimalType() {
			return getRuleContext(DecimalTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_type);
		try {
			setState(1344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BIGINT:
			case BITMAP:
			case BOOLEAN:
			case CHAR:
			case DATE:
			case DATETIME:
			case DOUBLE:
			case FLOAT:
			case HLL:
			case INT:
			case INTEGER:
			case JSON:
			case LARGEINT:
			case PERCENTILE:
			case SIGNED:
			case SMALLINT:
			case STRING:
			case TIME:
			case TINYINT:
			case UNSIGNED:
			case VARCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1341);
				baseType();
				}
				break;
			case DECIMAL:
			case DECIMALV2:
			case DECIMAL32:
			case DECIMAL64:
			case DECIMAL128:
				enterOuterAlt(_localctx, 2);
				{
				setState(1342);
				decimalType();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1343);
				arrayType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(DemoDBParser.ARRAY, 0); }
		public TerminalNode LT() { return getToken(DemoDBParser.LT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode GT() { return getToken(DemoDBParser.GT, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			match(ARRAY);
			setState(1347);
			match(LT);
			setState(1348);
			type();
			setState(1349);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(DemoDBParser.INTEGER_VALUE, 0); }
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_typeParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1351);
			match(T__1);
			setState(1352);
			match(INTEGER_VALUE);
			setState(1353);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalTypeContext extends ParserRuleContext {
		public Token precision;
		public Token scale;
		public TerminalNode DECIMAL() { return getToken(DemoDBParser.DECIMAL, 0); }
		public TerminalNode DECIMALV2() { return getToken(DemoDBParser.DECIMALV2, 0); }
		public TerminalNode DECIMAL32() { return getToken(DemoDBParser.DECIMAL32, 0); }
		public TerminalNode DECIMAL64() { return getToken(DemoDBParser.DECIMAL64, 0); }
		public TerminalNode DECIMAL128() { return getToken(DemoDBParser.DECIMAL128, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(DemoDBParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(DemoDBParser.INTEGER_VALUE, i);
		}
		public DecimalTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterDecimalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitDecimalType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitDecimalType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalTypeContext decimalType() throws RecognitionException {
		DecimalTypeContext _localctx = new DecimalTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_decimalType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (DECIMAL - 79)) | (1L << (DECIMALV2 - 79)) | (1L << (DECIMAL32 - 79)) | (1L << (DECIMAL64 - 79)) | (1L << (DECIMAL128 - 79)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1356);
				match(T__1);
				setState(1357);
				((DecimalTypeContext)_localctx).precision = match(INTEGER_VALUE);
				setState(1360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1358);
					match(T__0);
					setState(1359);
					((DecimalTypeContext)_localctx).scale = match(INTEGER_VALUE);
					}
				}

				setState(1362);
				match(T__2);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(DemoDBParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(DemoDBParser.LOCAL, 0); }
		public TerminalNode SESSION() { return getToken(DemoDBParser.SESSION, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoDBListener ) ((DemoDBListener)listener).exitVarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoDBVisitor ) return ((DemoDBVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			_la = _input.LA(1);
			if ( !(_la==GLOBAL || _la==LOCAL || _la==SESSION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return queryPrimary_sempred((QueryPrimaryContext)_localctx, predIndex);
		case 31:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 38:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 41:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 42:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryPrimary_sempred(QueryPrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 15);
		case 13:
			return precpred(_ctx, 18);
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0184\u0558\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0001\u0000"+
		"\u0005\u0000\u008c\b\u0000\n\u0000\f\u0000\u008f\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u0095\b\u0001\u0001\u0001\u0003"+
		"\u0001\u0098\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a9"+
		"\b\u0006\u0001\u0006\u0003\u0006\u00ac\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00b1\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00b6\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00bc\b\u0007\u0001\u0007\u0005\u0007\u00bf\b\u0007\n\u0007"+
		"\f\u0007\u00c2\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0005\n\u00cc\b\n\n\n\f\n\u00cf\t\n\u0001\n\u0003\n\u00d2"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0005\n\u00d7\b\n\n\n\f\n\u00da\t\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00df\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e4"+
		"\b\n\u0001\n\u0001\n\u0003\n\u00e8\b\n\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00ec\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00f0\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00f5\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00fb\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u0104\b\f\n\f\f\f\u0107\t\f\u0001\f\u0001\f\u0001\f\u0003\f\u010c\b"+
		"\f\u0001\r\u0001\r\u0003\r\u0110\b\r\u0001\r\u0001\r\u0005\r\u0114\b\r"+
		"\n\r\f\r\u0117\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u011d\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0121\b\u000e\u0003"+
		"\u000e\u0123\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u012a\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u012f\b\u000f\u0001\u000f\u0005\u000f\u0132\b\u000f\n\u000f\f\u000f"+
		"\u0135\t\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u0139\b\u0010\n\u0010"+
		"\f\u0010\u013c\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u0141\b\u0010\n\u0010\f\u0010\u0144\t\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0148\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u014c\b\u0011"+
		"\u0001\u0011\u0003\u0011\u014f\b\u0011\u0001\u0011\u0003\u0011\u0152\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0156\b\u0011\u0003\u0011\u0158"+
		"\b\u0011\u0001\u0011\u0003\u0011\u015b\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0162\b\u0011\n\u0011"+
		"\f\u0011\u0165\t\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0169\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u016d\b\u0011\u0003\u0011\u016f\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0173\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0177\b\u0011\u0003\u0011\u0179\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0180\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0184\b\u0011\u0003\u0011\u0186\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u018c"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u0194\b\u0013\u0001\u0013\u0003\u0013\u0197\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u019b\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u019f\b\u0013\u0001\u0013\u0003\u0013\u01a2\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01a7\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01af"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01cc\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u01d2\b\u0016\n"+
		"\u0016\f\u0016\u01d5\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01df"+
		"\b\u0017\n\u0017\f\u0017\u01e2\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u01f2\b\u0019\n\u0019\f\u0019\u01f5\t\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u01f9\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u01ff\b\u001a\n\u001a\f\u001a\u0202\t\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0003\u001b\u0207\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u020e\b\u001b\n\u001b\f\u001b\u0211"+
		"\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0216\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u021a\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0221\b\u001c\n\u001c"+
		"\f\u001c\u0224\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u022a\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u022f\b\u001e\n\u001e\f\u001e\u0232\t\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u0238\b\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0240\b\u001f\n"+
		"\u001f\f\u001f\u0243\t\u001f\u0001 \u0001 \u0001 \u0001 \u0005 \u0249"+
		"\b \n \f \u024c\t \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0003!\u0254"+
		"\b!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001%\u0005"+
		"%\u025f\b%\n%\f%\u0262\t%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u026a\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0005&\u0277\b&\n&\f&\u027a\t&\u0001\'\u0001\'\u0003\'"+
		"\u027e\b\'\u0001(\u0003(\u0281\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0003(\u0289\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0291"+
		"\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0299\b(\u0001(\u0001"+
		"(\u0003(\u029d\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0005)\u02b1\b)\n)\f)\u02b4\t)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0004*\u02e0\b*\u000b*\f*"+
		"\u02e1\u0001*\u0001*\u0003*\u02e6\b*\u0001*\u0001*\u0001*\u0001*\u0004"+
		"*\u02ec\b*\u000b*\f*\u02ed\u0001*\u0001*\u0003*\u02f2\b*\u0001*\u0001"+
		"*\u0001*\u0003*\u02f7\b*\u0001*\u0001*\u0003*\u02fb\b*\u0001*\u0001*\u0001"+
		"*\u0003*\u0300\b*\u0001*\u0001*\u0001*\u0003*\u0305\b*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0003*\u030e\b*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0003*\u0318\b*\u0001*\u0001*\u0003*\u031c"+
		"\b*\u0001*\u0001*\u0001*\u0001*\u0005*\u0322\b*\n*\f*\u0325\t*\u0001+"+
		"\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u032f\b+\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0005,\u033d\b,\n,\f,\u0340\t,\u0003,\u0342\b,\u0001,\u0001,"+
		"\u0001,\u0001,\u0001,\u0001,\u0005,\u034a\b,\n,\f,\u034d\t,\u0003,\u034f"+
		"\b,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u0356\b,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u0360\b,\n,\f,\u0363\t,\u0003"+
		",\u0365\b,\u0001,\u0001,\u0003,\u0369\b,\u0003,\u036b\b,\u0001-\u0001"+
		"-\u0001-\u0003-\u0370\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u0378\b-\u0001-\u0001-\u0001-\u0001-\u0003-\u037e\b-\u0001-\u0001-\u0001"+
		"-\u0005-\u0383\b-\n-\f-\u0386\t-\u0003-\u0388\b-\u0001-\u0001-\u0001-"+
		"\u0001-\u0003-\u038e\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u0396\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u039e\b-\u0001"+
		"-\u0001-\u0001-\u0003-\u03a3\b-\u0001.\u0001.\u0001.\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0003/\u03ad\b/\u0001/\u0001/\u00010\u00010\u00030\u03b3"+
		"\b0\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00031\u03c4\b1\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00052\u03dd\b2\n2\f2\u03e0\t2\u00032\u03e2\b2\u00012\u00012\u00012"+
		"\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00052\u0415\b2\n2\f2\u0418"+
		"\t2\u00032\u041a\b2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00032\u0456\b2\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00033\u0464\b3\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00053\u046c\b3\n3\f3\u046f\t3\u00033\u0471\b3\u00013"+
		"\u00013\u00013\u00013\u00013\u00013\u00053\u0479\b3\n3\f3\u047c\t3\u0003"+
		"3\u047e\b3\u00013\u00013\u00013\u00013\u00013\u00013\u00053\u0486\b3\n"+
		"3\f3\u0489\t3\u00033\u048b\b3\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00053\u0493\b3\n3\f3\u0496\t3\u00033\u0498\b3\u00013\u00033\u049b\b"+
		"3\u00014\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00055\u04a9\b5\n5\f5\u04ac\t5\u00035\u04ae\b5\u00015"+
		"\u00015\u00015\u00015\u00015\u00055\u04b5\b5\n5\f5\u04b8\t5\u00035\u04ba"+
		"\b5\u00015\u00035\u04bd\b5\u00015\u00015\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00036\u04d1\b6\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00037\u04dc\b7\u00018\u00018\u00019\u00019\u00039\u04e2"+
		"\b9\u00019\u00019\u00039\u04e6\b9\u0001:\u0001:\u0001:\u0001:\u0003:\u04ec"+
		"\b:\u0001:\u0001:\u0001:\u0001:\u0003:\u04f2\b:\u0001;\u0001;\u0001;\u0001"+
		";\u0001<\u0001<\u0001=\u0001=\u0001>\u0001>\u0001>\u0003>\u04ff\b>\u0001"+
		"?\u0001?\u0001?\u0003?\u0504\b?\u0001?\u0001?\u0003?\u0508\b?\u0001?\u0001"+
		"?\u0003?\u050c\b?\u0001?\u0001?\u0003?\u0510\b?\u0001?\u0001?\u0003?\u0514"+
		"\b?\u0001?\u0001?\u0003?\u0518\b?\u0001?\u0001?\u0003?\u051c\b?\u0001"+
		"?\u0001?\u0003?\u0520\b?\u0001?\u0001?\u0003?\u0524\b?\u0001?\u0001?\u0003"+
		"?\u0528\b?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003?\u0531"+
		"\b?\u0001?\u0001?\u0003?\u0535\b?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003"+
		"?\u053c\b?\u0001@\u0001@\u0001@\u0003@\u0541\b@\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0003C\u0551\bC\u0001C\u0003C\u0554\bC\u0001D\u0001D\u0001D\u0000\u0005"+
		"\u000e>LRTE\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt"+
		"vxz|~\u0080\u0082\u0084\u0086\u0088\u0000\u0015\u0003\u0000ii\u00c8\u00c8"+
		"\u0149\u0149\u0002\u0000\u0010\u0010[[\u0001\u0000\u00e3\u00e4\u0002\u0000"+
		"\u0013\u0013\u016d\u016d\u0002\u0000\u00de\u00de\u016c\u016c\u0001\u0000"+
		"\u0179\u017a\u0001\u0000\u0160\u0166\u0002\u0000qq\u0143\u0143\u0003\u0000"+
		"\u00ba\u00ba\u00fc\u00fc\u010e\u010e\u0003\u0000\u00ca\u00ca\u0169\u016b"+
		"\u016f\u016f\u0001\u0000\u0167\u0168\u0002\u0000\u0167\u0168\u0173\u0173"+
		"\u0001\u0000LM\u0002\u0000yy\u00ec\u00ecL\u0000\r\u000f\u0018\u0019\u001b"+
		"\u001f#$&(,022557?ABFFIILNTT]]abdhjjnprtwz}~\u0080\u0081\u0084\u0085\u0087"+
		"\u0087\u008c\u008c\u008e\u008f\u0091\u0091\u0093\u0095\u0097\u0097\u009b"+
		"\u009b\u009d\u009d\u00a3\u00a3\u00a5\u00a5\u00a7\u00a7\u00a9\u00aa\u00b0"+
		"\u00b0\u00b3\u00b3\u00b8\u00b9\u00bc\u00bc\u00be\u00be\u00c0\u00c3\u00c5"+
		"\u00c7\u00c9\u00c9\u00cb\u00d2\u00d6\u00d8\u00da\u00db\u00dd\u00dd\u00e4"+
		"\u00e7\u00e9\u00ec\u00ee\u00ee\u00f0\u00f6\u00fa\u00fb\u00ff\u0100\u0102"+
		"\u010a\u010c\u010c\u010f\u0113\u0117\u0117\u011a\u011a\u011d\u011e\u0120"+
		"\u0120\u0122\u0122\u0125\u012f\u0133\u0136\u0138\u0138\u013a\u013d\u013f"+
		"\u013f\u0142\u0142\u0144\u0148\u014b\u014b\u014f\u014f\u0151\u0151\u0154"+
		"\u0158\u015b\u015b\u015d\u015f\u0182\u0182\u0002\u0000\u0017\u0017YY\u0002"+
		"\u0000tt\u00b3\u00b3\b\u0000NN\u0093\u0093\u00c7\u00c7\u00cd\u00cd\u00f3"+
		"\u00f3\u011a\u011a\u0158\u0158\u015f\u015f\u0002\u0000//ww\u0001\u0000"+
		"OS\u0003\u0000\u0085\u0085\u00be\u00be\u011e\u011e\u0628\u0000\u008d\u0001"+
		"\u0000\u0000\u0000\u0002\u0097\u0001\u0000\u0000\u0000\u0004\u0099\u0001"+
		"\u0000\u0000\u0000\u0006\u009b\u0001\u0000\u0000\u0000\b\u009d\u0001\u0000"+
		"\u0000\u0000\n\u009f\u0001\u0000\u0000\u0000\f\u00a1\u0001\u0000\u0000"+
		"\u0000\u000e\u00b0\u0001\u0000\u0000\u0000\u0010\u00c3\u0001\u0000\u0000"+
		"\u0000\u0012\u00c7\u0001\u0000\u0000\u0000\u0014\u00c9\u0001\u0000\u0000"+
		"\u0000\u0016\u00ef\u0001\u0000\u0000\u0000\u0018\u010b\u0001\u0000\u0000"+
		"\u0000\u001a\u010d\u0001\u0000\u0000\u0000\u001c\u0129\u0001\u0000\u0000"+
		"\u0000\u001e\u012b\u0001\u0000\u0000\u0000 \u0147\u0001\u0000\u0000\u0000"+
		"\"\u018b\u0001\u0000\u0000\u0000$\u018d\u0001\u0000\u0000\u0000&\u01a6"+
		"\u0001\u0000\u0000\u0000(\u01ae\u0001\u0000\u0000\u0000*\u01cb\u0001\u0000"+
		"\u0000\u0000,\u01cd\u0001\u0000\u0000\u0000.\u01d8\u0001\u0000\u0000\u0000"+
		"0\u01e6\u0001\u0000\u0000\u00002\u01f8\u0001\u0000\u0000\u00004\u01fa"+
		"\u0001\u0000\u0000\u00006\u0219\u0001\u0000\u0000\u00008\u021b\u0001\u0000"+
		"\u0000\u0000:\u0229\u0001\u0000\u0000\u0000<\u022b\u0001\u0000\u0000\u0000"+
		">\u0237\u0001\u0000\u0000\u0000@\u0244\u0001\u0000\u0000\u0000B\u0253"+
		"\u0001\u0000\u0000\u0000D\u0255\u0001\u0000\u0000\u0000F\u0257\u0001\u0000"+
		"\u0000\u0000H\u0259\u0001\u0000\u0000\u0000J\u025b\u0001\u0000\u0000\u0000"+
		"L\u0263\u0001\u0000\u0000\u0000N\u027b\u0001\u0000\u0000\u0000P\u029c"+
		"\u0001\u0000\u0000\u0000R\u029e\u0001\u0000\u0000\u0000T\u0304\u0001\u0000"+
		"\u0000\u0000V\u032e\u0001\u0000\u0000\u0000X\u036a\u0001\u0000\u0000\u0000"+
		"Z\u03a2\u0001\u0000\u0000\u0000\\\u03a4\u0001\u0000\u0000\u0000^\u03a7"+
		"\u0001\u0000\u0000\u0000`\u03b2\u0001\u0000\u0000\u0000b\u03c3\u0001\u0000"+
		"\u0000\u0000d\u0455\u0001\u0000\u0000\u0000f\u049a\u0001\u0000\u0000\u0000"+
		"h\u049c\u0001\u0000\u0000\u0000j\u04a1\u0001\u0000\u0000\u0000l\u04d0"+
		"\u0001\u0000\u0000\u0000n\u04db\u0001\u0000\u0000\u0000p\u04dd\u0001\u0000"+
		"\u0000\u0000r\u04df\u0001\u0000\u0000\u0000t\u04f1\u0001\u0000\u0000\u0000"+
		"v\u04f3\u0001\u0000\u0000\u0000x\u04f7\u0001\u0000\u0000\u0000z\u04f9"+
		"\u0001\u0000\u0000\u0000|\u04fe\u0001\u0000\u0000\u0000~\u053b\u0001\u0000"+
		"\u0000\u0000\u0080\u0540\u0001\u0000\u0000\u0000\u0082\u0542\u0001\u0000"+
		"\u0000\u0000\u0084\u0547\u0001\u0000\u0000\u0000\u0086\u054b\u0001\u0000"+
		"\u0000\u0000\u0088\u0555\u0001\u0000\u0000\u0000\u008a\u008c\u0003\u0002"+
		"\u0001\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005\u0000\u0000\u0001\u0091\u0001\u0001\u0000"+
		"\u0000\u0000\u0092\u0094\u0003\u0006\u0003\u0000\u0093\u0095\u0005\u0181"+
		"\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0098\u0003\u0004"+
		"\u0002\u0000\u0097\u0092\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u0003\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0181"+
		"\u0000\u0000\u009a\u0005\u0001\u0000\u0000\u0000\u009b\u009c\u0003\b\u0004"+
		"\u0000\u009c\u0007\u0001\u0000\u0000\u0000\u009d\u009e\u0003\n\u0005\u0000"+
		"\u009e\t\u0001\u0000\u0000\u0000\u009f\u00a0\u0003\f\u0006\u0000\u00a0"+
		"\u000b\u0001\u0000\u0000\u0000\u00a1\u00a8\u0003\u000e\u0007\u0000\u00a2"+
		"\u00a3\u0005\u00df\u0000\u0000\u00a3\u00a4\u0005)\u0000\u0000\u00a4\u00a5"+
		"\u0003r9\u0000\u00a5\u00a6\u0005\u0001\u0000\u0000\u00a6\u00a7\u0003r"+
		"9\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ac\u0003t:\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac\r\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0006\u0007\uffff\uffff\u0000\u00ae\u00b1\u0003\u0014\n\u0000\u00af\u00b1"+
		"\u0003\u0010\b\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b0\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00c0\u0001\u0000\u0000\u0000\u00b2\u00b3\n\u0002"+
		"\u0000\u0000\u00b3\u00b5\u0005\u00a4\u0000\u0000\u00b4\u00b6\u0003\u0012"+
		"\t\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00bf\u0003\u000e\u0007"+
		"\u0003\u00b8\u00b9\n\u0001\u0000\u0000\u00b9\u00bb\u0007\u0000\u0000\u0000"+
		"\u00ba\u00bc\u0003\u0012\t\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bf\u0003\u000e\u0007\u0002\u00be\u00b2\u0001\u0000\u0000\u0000\u00be"+
		"\u00b8\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1"+
		"\u000f\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0005\u0002\u0000\u0000\u00c4\u00c5\u0003\n\u0005\u0000\u00c5\u00c6"+
		"\u0005\u0003\u0000\u0000\u00c6\u0011\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0007\u0001\u0000\u0000\u00c8\u0013\u0001\u0000\u0000\u0000\u00c9\u00cd"+
		"\u0005\u011b\u0000\u0000\u00ca\u00cc\u0003.\u0017\u0000\u00cb\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d2\u0003"+
		"\u0012\t\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d8\u0003\u001c"+
		"\u000e\u0000\u00d4\u00d5\u0005\u0001\u0000\u0000\u00d5\u00d7\u0003\u001c"+
		"\u000e\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00db\u00de\u0003\u0016\u000b\u0000\u00dc\u00dd\u0005\u015a"+
		"\u0000\u0000\u00dd\u00df\u0003>\u001f\u0000\u00de\u00dc\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0005\u0088\u0000\u0000\u00e1\u00e2\u0005)\u0000\u0000"+
		"\u00e2\u00e4\u0003\u0018\f\u0000\u00e3\u00e0\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0005\u008d\u0000\u0000\u00e6\u00e8\u0003>\u001f\u0000\u00e7\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u0015"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u007f\u0000\u0000\u00ea\u00ec"+
		"\u0003\u001e\u000f\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ec\u00f0\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0005\u007f\u0000\u0000\u00ee\u00f0\u0005`\u0000\u0000\u00ef\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u0017\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0005\u0112\u0000\u0000\u00f2\u00f4\u0005"+
		"\u0002\u0000\u0000\u00f3\u00f5\u0003<\u001e\u0000\u00f4\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\u010c\u0005\u0003\u0000\u0000\u00f7\u00f8\u0005E\u0000"+
		"\u0000\u00f8\u00fa\u0005\u0002\u0000\u0000\u00f9\u00fb\u0003<\u001e\u0000"+
		"\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u010c\u0005\u0003\u0000\u0000"+
		"\u00fd\u00fe\u0005\u008a\u0000\u0000\u00fe\u00ff\u0005\u0120\u0000\u0000"+
		"\u00ff\u0100\u0005\u0002\u0000\u0000\u0100\u0105\u0003\u001a\r\u0000\u0101"+
		"\u0102\u0005\u0001\u0000\u0000\u0102\u0104\u0003\u001a\r\u0000\u0103\u0101"+
		"\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0108"+
		"\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0005\u0003\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u010c"+
		"\u0003<\u001e\u0000\u010b\u00f1\u0001\u0000\u0000\u0000\u010b\u00f7\u0001"+
		"\u0000\u0000\u0000\u010b\u00fd\u0001\u0000\u0000\u0000\u010b\u010a\u0001"+
		"\u0000\u0000\u0000\u010c\u0019\u0001\u0000\u0000\u0000\u010d\u010f\u0005"+
		"\u0002\u0000\u0000\u010e\u0110\u0003>\u001f\u0000\u010f\u010e\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0115\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0005\u0001\u0000\u0000\u0112\u0114\u0003>\u001f"+
		"\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"+
		"\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0005\u0003\u0000\u0000\u0119\u001b\u0001\u0000\u0000"+
		"\u0000\u011a\u0122\u0003>\u001f\u0000\u011b\u011d\u0005\u0016\u0000\u0000"+
		"\u011c\u011b\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000"+
		"\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u0121\u0003B!\u0000\u011f\u0121"+
		"\u0003D\"\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u011f\u0001"+
		"\u0000\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u011c\u0001"+
		"\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u012a\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0003J%\u0000\u0125\u0126\u0005\u0004\u0000"+
		"\u0000\u0126\u0127\u0005\u0169\u0000\u0000\u0127\u012a\u0001\u0000\u0000"+
		"\u0000\u0128\u012a\u0005\u0169\u0000\u0000\u0129\u011a\u0001\u0000\u0000"+
		"\u0000\u0129\u0124\u0001\u0000\u0000\u0000\u0129\u0128\u0001\u0000\u0000"+
		"\u0000\u012a\u001d\u0001\u0000\u0000\u0000\u012b\u0133\u0003 \u0010\u0000"+
		"\u012c\u012e\u0005\u0001\u0000\u0000\u012d\u012f\u0005\u00b5\u0000\u0000"+
		"\u012e\u012d\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0132\u0003 \u0010\u0000\u0131"+
		"\u012c\u0001\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133"+
		"\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134"+
		"\u001f\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136"+
		"\u013a\u0003\"\u0011\u0000\u0137\u0139\u0003&\u0013\u0000\u0138\u0137"+
		"\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u0148"+
		"\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0005\u0002\u0000\u0000\u013e\u0142\u0003\"\u0011\u0000\u013f\u0141\u0003"+
		"&\u0013\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000"+
		"\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0005\u0003\u0000\u0000\u0146\u0148\u0001\u0000"+
		"\u0000\u0000\u0147\u0136\u0001\u0000\u0000\u0000\u0147\u013d\u0001\u0000"+
		"\u0000\u0000\u0148!\u0001\u0000\u0000\u0000\u0149\u014b\u0003J%\u0000"+
		"\u014a\u014c\u00036\u001b\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014b"+
		"\u014c\u0001\u0000\u0000\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d"+
		"\u014f\u00038\u001c\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0001\u0000\u0000\u0000\u014f\u0157\u0001\u0000\u0000\u0000\u0150\u0152"+
		"\u0005\u0016\u0000\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0155"+
		"\u0003B!\u0000\u0154\u0156\u00034\u001a\u0000\u0155\u0154\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0158\u0001\u0000"+
		"\u0000\u0000\u0157\u0151\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000"+
		"\u0000\u0000\u0158\u015a\u0001\u0000\u0000\u0000\u0159\u015b\u0003,\u0016"+
		"\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000"+
		"\u0000\u015b\u018c\u0001\u0000\u0000\u0000\u015c\u015d\u0005\u0002\u0000"+
		"\u0000\u015d\u015e\u0005\u0152\u0000\u0000\u015e\u0163\u0003$\u0012\u0000"+
		"\u015f\u0160\u0005\u0001\u0000\u0000\u0160\u0162\u0003$\u0012\u0000\u0161"+
		"\u015f\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000\u0000\u0163"+
		"\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164"+
		"\u0166\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166"+
		"\u016e\u0005\u0003\u0000\u0000\u0167\u0169\u0005\u0016\u0000\u0000\u0168"+
		"\u0167\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0001\u0000\u0000\u0000\u016a\u016c\u0003B!\u0000\u016b\u016d\u0003"+
		"4\u001a\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000"+
		"\u0000\u0000\u016d\u016f\u0001\u0000\u0000\u0000\u016e\u0168\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u018c\u0001\u0000"+
		"\u0000\u0000\u0170\u0178\u0003\u0010\b\u0000\u0171\u0173\u0005\u0016\u0000"+
		"\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0176\u0003B!\u0000\u0175"+
		"\u0177\u00034\u001a\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0176\u0177"+
		"\u0001\u0000\u0000\u0000\u0177\u0179\u0001\u0000\u0000\u0000\u0178\u0172"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u018c"+
		"\u0001\u0000\u0000\u0000\u017a\u017b\u0003J%\u0000\u017b\u017c\u0005\u0002"+
		"\u0000\u0000\u017c\u017d\u0003<\u001e\u0000\u017d\u0185\u0005\u0003\u0000"+
		"\u0000\u017e\u0180\u0005\u0016\u0000\u0000\u017f\u017e\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000"+
		"\u0000\u0181\u0183\u0003B!\u0000\u0182\u0184\u00034\u001a\u0000\u0183"+
		"\u0182\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184"+
		"\u0186\u0001\u0000\u0000\u0000\u0185\u017f\u0001\u0000\u0000\u0000\u0185"+
		"\u0186\u0001\u0000\u0000\u0000\u0186\u018c\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u0005\u0002\u0000\u0000\u0188\u0189\u0003\u001e\u000f\u0000\u0189"+
		"\u018a\u0005\u0003\u0000\u0000\u018a\u018c\u0001\u0000\u0000\u0000\u018b"+
		"\u0149\u0001\u0000\u0000\u0000\u018b\u015c\u0001\u0000\u0000\u0000\u018b"+
		"\u0170\u0001\u0000\u0000\u0000\u018b\u017a\u0001\u0000\u0000\u0000\u018b"+
		"\u0187\u0001\u0000\u0000\u0000\u018c#\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0005\u0002\u0000\u0000\u018e\u018f\u0003<\u001e\u0000\u018f\u0190\u0005"+
		"\u0003\u0000\u0000\u0190%\u0001\u0000\u0000\u0000\u0191\u0193\u0003(\u0014"+
		"\u0000\u0192\u0194\u0003,\u0016\u0000\u0193\u0192\u0001\u0000\u0000\u0000"+
		"\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0196\u0001\u0000\u0000\u0000"+
		"\u0195\u0197\u0005\u00b5\u0000\u0000\u0196\u0195\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000"+
		"\u0198\u019a\u0003\"\u0011\u0000\u0199\u019b\u00032\u0019\u0000\u019a"+
		"\u0199\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b"+
		"\u01a7\u0001\u0000\u0000\u0000\u019c\u019e\u0003*\u0015\u0000\u019d\u019f"+
		"\u0003,\u0016\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019e\u019f\u0001"+
		"\u0000\u0000\u0000\u019f\u01a1\u0001\u0000\u0000\u0000\u01a0\u01a2\u0005"+
		"\u00b5\u0000\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a4\u0003"+
		"\"\u0011\u0000\u01a4\u01a5\u00032\u0019\u0000\u01a5\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a6\u0191\u0001\u0000\u0000\u0000\u01a6\u019c\u0001\u0000"+
		"\u0000\u0000\u01a7\'\u0001\u0000\u0000\u0000\u01a8\u01af\u0005\u00ab\u0000"+
		"\u0000\u01a9\u01aa\u0005\u009e\u0000\u0000\u01aa\u01af\u0005\u00ab\u0000"+
		"\u0000\u01ab\u01af\u0005D\u0000\u0000\u01ac\u01ad\u0005D\u0000\u0000\u01ad"+
		"\u01af\u0005\u00ab\u0000\u0000\u01ae\u01a8\u0001\u0000\u0000\u0000\u01ae"+
		"\u01a9\u0001\u0000\u0000\u0000\u01ae\u01ab\u0001\u0000\u0000\u0000\u01ae"+
		"\u01ac\u0001\u0000\u0000\u0000\u01af)\u0001\u0000\u0000\u0000\u01b0\u01b1"+
		"\u0005\u00b7\u0000\u0000\u01b1\u01cc\u0005\u00ab\u0000\u0000\u01b2\u01b3"+
		"\u0005\u010d\u0000\u0000\u01b3\u01cc\u0005\u00ab\u0000\u0000\u01b4\u01b5"+
		"\u0005\u0082\u0000\u0000\u01b5\u01cc\u0005\u00ab\u0000\u0000\u01b6\u01b7"+
		"\u0005\u00b7\u0000\u0000\u01b7\u01b8\u0005\u00e0\u0000\u0000\u01b8\u01cc"+
		"\u0005\u00ab\u0000\u0000\u01b9\u01ba\u0005\u010d\u0000\u0000\u01ba\u01bb"+
		"\u0005\u00e0\u0000\u0000\u01bb\u01cc\u0005\u00ab\u0000\u0000\u01bc\u01bd"+
		"\u0005\u0082\u0000\u0000\u01bd\u01be\u0005\u00e0\u0000\u0000\u01be\u01cc"+
		"\u0005\u00ab\u0000\u0000\u01bf\u01c0\u0005\u00b7\u0000\u0000\u01c0\u01c1"+
		"\u0005\u011c\u0000\u0000\u01c1\u01cc\u0005\u00ab\u0000\u0000\u01c2\u01c3"+
		"\u0005\u010d\u0000\u0000\u01c3\u01c4\u0005\u011c\u0000\u0000\u01c4\u01cc"+
		"\u0005\u00ab\u0000\u0000\u01c5\u01c6\u0005\u00b7\u0000\u0000\u01c6\u01c7"+
		"\u0005\u0014\u0000\u0000\u01c7\u01cc\u0005\u00ab\u0000\u0000\u01c8\u01c9"+
		"\u0005\u010d\u0000\u0000\u01c9\u01ca\u0005\u0014\u0000\u0000\u01ca\u01cc"+
		"\u0005\u00ab\u0000\u0000\u01cb\u01b0\u0001\u0000\u0000\u0000\u01cb\u01b2"+
		"\u0001\u0000\u0000\u0000\u01cb\u01b4\u0001\u0000\u0000\u0000\u01cb\u01b6"+
		"\u0001\u0000\u0000\u0000\u01cb\u01b9\u0001\u0000\u0000\u0000\u01cb\u01bc"+
		"\u0001\u0000\u0000\u0000\u01cb\u01bf\u0001\u0000\u0000\u0000\u01cb\u01c2"+
		"\u0001\u0000\u0000\u0000\u01cb\u01c5\u0001\u0000\u0000\u0000\u01cb\u01c8"+
		"\u0001\u0000\u0000\u0000\u01cc+\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005"+
		"\u0005\u0000\u0000\u01ce\u01d3\u0003B!\u0000\u01cf\u01d0\u0005\u0001\u0000"+
		"\u0000\u01d0\u01d2\u0003B!\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005\u0006\u0000\u0000\u01d7"+
		"-\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005\u0007\u0000\u0000\u01d9\u01da"+
		"\u0005\u0121\u0000\u0000\u01da\u01db\u0005\u0002\u0000\u0000\u01db\u01e0"+
		"\u00030\u0018\u0000\u01dc\u01dd\u0005\u0001\u0000\u0000\u01dd\u01df\u0003"+
		"0\u0018\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e3\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u0005\u0003\u0000\u0000\u01e4\u01e5\u0005\b\u0000"+
		"\u0000\u01e5/\u0001\u0000\u0000\u0000\u01e6\u01e7\u0003:\u001d\u0000\u01e7"+
		"\u01e8\u0005\u0160\u0000\u0000\u01e8\u01e9\u0003V+\u0000\u01e91\u0001"+
		"\u0000\u0000\u0000\u01ea\u01eb\u0005\u00d9\u0000\u0000\u01eb\u01f9\u0003"+
		">\u001f\u0000\u01ec\u01ed\u0005\u0150\u0000\u0000\u01ed\u01ee\u0005\u0002"+
		"\u0000\u0000\u01ee\u01f3\u0003B!\u0000\u01ef\u01f0\u0005\u0001\u0000\u0000"+
		"\u01f0\u01f2\u0003B!\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f2\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f6\u0001\u0000\u0000\u0000\u01f5\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005\u0003\u0000\u0000\u01f7\u01f9"+
		"\u0001\u0000\u0000\u0000\u01f8\u01ea\u0001\u0000\u0000\u0000\u01f8\u01ec"+
		"\u0001\u0000\u0000\u0000\u01f93\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005"+
		"\u0002\u0000\u0000\u01fb\u0200\u0003B!\u0000\u01fc\u01fd\u0005\u0001\u0000"+
		"\u0000\u01fd\u01ff\u0003B!\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01ff"+
		"\u0202\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0200"+
		"\u0201\u0001\u0000\u0000\u0000\u0201\u0203\u0001\u0000\u0000\u0000\u0202"+
		"\u0200\u0001\u0000\u0000\u0000\u0203\u0204\u0005\u0003\u0000\u0000\u0204"+
		"5\u0001\u0000\u0000\u0000\u0205\u0207\u0005\u0136\u0000\u0000\u0206\u0205"+
		"\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u0208"+
		"\u0001\u0000\u0000\u0000\u0208\u0209\u0007\u0002\u0000\u0000\u0209\u020a"+
		"\u0005\u0002\u0000\u0000\u020a\u020f\u0003B!\u0000\u020b\u020c\u0005\u0001"+
		"\u0000\u0000\u020c\u020e\u0003B!\u0000\u020d\u020b\u0001\u0000\u0000\u0000"+
		"\u020e\u0211\u0001\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000"+
		"\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0212\u0001\u0000\u0000\u0000"+
		"\u0211\u020f\u0001\u0000\u0000\u0000\u0212\u0213\u0005\u0003\u0000\u0000"+
		"\u0213\u021a\u0001\u0000\u0000\u0000\u0214\u0216\u0005\u0136\u0000\u0000"+
		"\u0215\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000"+
		"\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0218\u0007\u0002\u0000\u0000"+
		"\u0218\u021a\u0003B!\u0000\u0219\u0206\u0001\u0000\u0000\u0000\u0219\u0215"+
		"\u0001\u0000\u0000\u0000\u021a7\u0001\u0000\u0000\u0000\u021b\u021c\u0005"+
		"\u0134\u0000\u0000\u021c\u021d\u0005\u0002\u0000\u0000\u021d\u0222\u0005"+
		"\u0176\u0000\u0000\u021e\u021f\u0005\u0001\u0000\u0000\u021f\u0221\u0005"+
		"\u0176\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0221\u0224\u0001"+
		"\u0000\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0223\u0001"+
		"\u0000\u0000\u0000\u0223\u0225\u0001\u0000\u0000\u0000\u0224\u0222\u0001"+
		"\u0000\u0000\u0000\u0225\u0226\u0005\u0003\u0000\u0000\u02269\u0001\u0000"+
		"\u0000\u0000\u0227\u022a\u0003B!\u0000\u0228\u022a\u0003D\"\u0000\u0229"+
		"\u0227\u0001\u0000\u0000\u0000\u0229\u0228\u0001\u0000\u0000\u0000\u022a"+
		";\u0001\u0000\u0000\u0000\u022b\u0230\u0003>\u001f\u0000\u022c\u022d\u0005"+
		"\u0001\u0000\u0000\u022d\u022f\u0003>\u001f\u0000\u022e\u022c\u0001\u0000"+
		"\u0000\u0000\u022f\u0232\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000"+
		"\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231=\u0001\u0000\u0000"+
		"\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0233\u0234\u0006\u001f\uffff"+
		"\uffff\u0000\u0234\u0238\u0003L&\u0000\u0235\u0236\u0005\u00d4\u0000\u0000"+
		"\u0236\u0238\u0003>\u001f\u0003\u0237\u0233\u0001\u0000\u0000\u0000\u0237"+
		"\u0235\u0001\u0000\u0000\u0000\u0238\u0241\u0001\u0000\u0000\u0000\u0239"+
		"\u023a\n\u0002\u0000\u0000\u023a\u023b\u0007\u0003\u0000\u0000\u023b\u0240"+
		"\u0003>\u001f\u0003\u023c\u023d\n\u0001\u0000\u0000\u023d\u023e\u0007"+
		"\u0004\u0000\u0000\u023e\u0240\u0003>\u001f\u0002\u023f\u0239\u0001\u0000"+
		"\u0000\u0000\u023f\u023c\u0001\u0000\u0000\u0000\u0240\u0243\u0001\u0000"+
		"\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000"+
		"\u0000\u0000\u0242?\u0001\u0000\u0000\u0000\u0243\u0241\u0001\u0000\u0000"+
		"\u0000\u0244\u0245\u0005\u0002\u0000\u0000\u0245\u024a\u0003B!\u0000\u0246"+
		"\u0247\u0005\u0001\u0000\u0000\u0247\u0249\u0003B!\u0000\u0248\u0246\u0001"+
		"\u0000\u0000\u0000\u0249\u024c\u0001\u0000\u0000\u0000\u024a\u0248\u0001"+
		"\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024d\u0001"+
		"\u0000\u0000\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024d\u024e\u0005"+
		"\u0003\u0000\u0000\u024eA\u0001\u0000\u0000\u0000\u024f\u0254\u0005\u017b"+
		"\u0000\u0000\u0250\u0254\u0003p8\u0000\u0251\u0254\u0005\u017c\u0000\u0000"+
		"\u0252\u0254\u0005\u017e\u0000\u0000\u0253\u024f\u0001\u0000\u0000\u0000"+
		"\u0253\u0250\u0001\u0000\u0000\u0000\u0253\u0251\u0001\u0000\u0000\u0000"+
		"\u0253\u0252\u0001\u0000\u0000\u0000\u0254C\u0001\u0000\u0000\u0000\u0255"+
		"\u0256\u0007\u0005\u0000\u0000\u0256E\u0001\u0000\u0000\u0000\u0257\u0258"+
		"\u0007\u0006\u0000\u0000\u0258G\u0001\u0000\u0000\u0000\u0259\u025a\u0007"+
		"\u0007\u0000\u0000\u025aI\u0001\u0000\u0000\u0000\u025b\u0260\u0003B!"+
		"\u0000\u025c\u025d\u0005\u0004\u0000\u0000\u025d\u025f\u0003B!\u0000\u025e"+
		"\u025c\u0001\u0000\u0000\u0000\u025f\u0262\u0001\u0000\u0000\u0000\u0260"+
		"\u025e\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261"+
		"K\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0263\u0264"+
		"\u0006&\uffff\uffff\u0000\u0264\u0265\u0003N\'\u0000\u0265\u0278\u0001"+
		"\u0000\u0000\u0000\u0266\u0267\n\u0003\u0000\u0000\u0267\u0269\u0005\u00a8"+
		"\u0000\u0000\u0268\u026a\u0005\u00d4\u0000\u0000\u0269\u0268\u0001\u0000"+
		"\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000"+
		"\u0000\u0000\u026b\u0277\u0005\u00d5\u0000\u0000\u026c\u026d\n\u0002\u0000"+
		"\u0000\u026d\u026e\u0003F#\u0000\u026e\u026f\u0003N\'\u0000\u026f\u0277"+
		"\u0001\u0000\u0000\u0000\u0270\u0271\n\u0001\u0000\u0000\u0271\u0272\u0003"+
		"F#\u0000\u0272\u0273\u0005\u0002\u0000\u0000\u0273\u0274\u0003\n\u0005"+
		"\u0000\u0274\u0275\u0005\u0003\u0000\u0000\u0275\u0277\u0001\u0000\u0000"+
		"\u0000\u0276\u0266\u0001\u0000\u0000\u0000\u0276\u026c\u0001\u0000\u0000"+
		"\u0000\u0276\u0270\u0001\u0000\u0000\u0000\u0277\u027a\u0001\u0000\u0000"+
		"\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000"+
		"\u0000\u0279M\u0001\u0000\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000"+
		"\u027b\u027d\u0003R)\u0000\u027c\u027e\u0003P(\u0000\u027d\u027c\u0001"+
		"\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000\u027eO\u0001\u0000"+
		"\u0000\u0000\u027f\u0281\u0005\u00d4\u0000\u0000\u0280\u027f\u0001\u0000"+
		"\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000"+
		"\u0000\u0000\u0282\u0283\u0005\u0099\u0000\u0000\u0283\u0284\u0005\u0002"+
		"\u0000\u0000\u0284\u0285\u0003<\u001e\u0000\u0285\u0286\u0005\u0003\u0000"+
		"\u0000\u0286\u029d\u0001\u0000\u0000\u0000\u0287\u0289\u0005\u00d4\u0000"+
		"\u0000\u0288\u0287\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000"+
		"\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028b\u0005\u0099\u0000"+
		"\u0000\u028b\u028c\u0005\u0002\u0000\u0000\u028c\u028d\u0003\n\u0005\u0000"+
		"\u028d\u028e\u0005\u0003\u0000\u0000\u028e\u029d\u0001\u0000\u0000\u0000"+
		"\u028f\u0291\u0005\u00d4\u0000\u0000\u0290\u028f\u0001\u0000\u0000\u0000"+
		"\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0292\u0001\u0000\u0000\u0000"+
		"\u0292\u0293\u0005 \u0000\u0000\u0293\u0294\u0003R)\u0000\u0294\u0295"+
		"\u0005\u0013\u0000\u0000\u0295\u0296\u0003N\'\u0000\u0296\u029d\u0001"+
		"\u0000\u0000\u0000\u0297\u0299\u0005\u00d4\u0000\u0000\u0298\u0297\u0001"+
		"\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029a\u0001"+
		"\u0000\u0000\u0000\u029a\u029b\u0007\b\u0000\u0000\u029b\u029d\u0003R"+
		")\u0000\u029c\u0280\u0001\u0000\u0000\u0000\u029c\u0288\u0001\u0000\u0000"+
		"\u0000\u029c\u0290\u0001\u0000\u0000\u0000\u029c\u0298\u0001\u0000\u0000"+
		"\u0000\u029dQ\u0001\u0000\u0000\u0000\u029e\u029f\u0006)\uffff\uffff\u0000"+
		"\u029f\u02a0\u0003T*\u0000\u02a0\u02b2\u0001\u0000\u0000\u0000\u02a1\u02a2"+
		"\n\u0005\u0000\u0000\u02a2\u02a3\u0005\u0172\u0000\u0000\u02a3\u02b1\u0003"+
		"R)\u0006\u02a4\u02a5\n\u0004\u0000\u0000\u02a5\u02a6\u0007\t\u0000\u0000"+
		"\u02a6\u02b1\u0003R)\u0005\u02a7\u02a8\n\u0003\u0000\u0000\u02a8\u02a9"+
		"\u0007\n\u0000\u0000\u02a9\u02b1\u0003R)\u0004\u02aa\u02ab\n\u0002\u0000"+
		"\u0000\u02ab\u02ac\u0005\u0170\u0000\u0000\u02ac\u02b1\u0003R)\u0003\u02ad"+
		"\u02ae\n\u0001\u0000\u0000\u02ae\u02af\u0005\u0171\u0000\u0000\u02af\u02b1"+
		"\u0003R)\u0002\u02b0\u02a1\u0001\u0000\u0000\u0000\u02b0\u02a4\u0001\u0000"+
		"\u0000\u0000\u02b0\u02a7\u0001\u0000\u0000\u0000\u02b0\u02aa\u0001\u0000"+
		"\u0000\u0000\u02b0\u02ad\u0001\u0000\u0000\u0000\u02b1\u02b4\u0001\u0000"+
		"\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000"+
		"\u0000\u0000\u02b3S\u0001\u0000\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000"+
		"\u0000\u02b5\u02b6\u0006*\uffff\uffff\u0000\u02b6\u0305\u0003\\.\u0000"+
		"\u02b7\u0305\u0003^/\u0000\u02b8\u0305\u0003X,\u0000\u02b9\u02ba\u0005"+
		"\t\u0000\u0000\u02ba\u02bb\u0005x\u0000\u0000\u02bb\u02bc\u0003X,\u0000"+
		"\u02bc\u02bd\u0005\n\u0000\u0000\u02bd\u0305\u0001\u0000\u0000\u0000\u02be"+
		"\u0305\u0003V+\u0000\u02bf\u0305\u0003`0\u0000\u02c0\u02c1\u0007\u000b"+
		"\u0000\u0000\u02c1\u0305\u0003T*\u000e\u02c2\u02c3\u0005\u016e\u0000\u0000"+
		"\u02c3\u0305\u0003T*\r\u02c4\u02c5\u0005\u0002\u0000\u0000\u02c5\u02c6"+
		"\u0003>\u001f\u0000\u02c6\u02c7\u0005\u0003\u0000\u0000\u02c7\u0305\u0001"+
		"\u0000\u0000\u0000\u02c8\u02c9\u0005k\u0000\u0000\u02c9\u02ca\u0005\u0002"+
		"\u0000\u0000\u02ca\u02cb\u0003\n\u0005\u0000\u02cb\u02cc\u0005\u0003\u0000"+
		"\u0000\u02cc\u0305\u0001\u0000\u0000\u0000\u02cd\u0305\u0003\u0010\b\u0000"+
		"\u02ce\u02cf\u0005,\u0000\u0000\u02cf\u02d0\u0005\u0002\u0000\u0000\u02d0"+
		"\u02d1\u0003>\u001f\u0000\u02d1\u02d2\u0005\u0016\u0000\u0000\u02d2\u02d3"+
		"\u0003\u0080@\u0000\u02d3\u02d4\u0005\u0003\u0000\u0000\u02d4\u0305\u0001"+
		"\u0000\u0000\u0000\u02d5\u02d6\u0005@\u0000\u0000\u02d6\u02d7\u0005\u0002"+
		"\u0000\u0000\u02d7\u02d8\u0003>\u001f\u0000\u02d8\u02d9\u0005\u0001\u0000"+
		"\u0000\u02d9\u02da\u0003\u0080@\u0000\u02da\u02db\u0005\u0003\u0000\u0000"+
		"\u02db\u0305\u0001\u0000\u0000\u0000\u02dc\u02dd\u0005+\u0000\u0000\u02dd"+
		"\u02df\u0003>\u001f\u0000\u02de\u02e0\u0003h4\u0000\u02df\u02de\u0001"+
		"\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1\u02df\u0001"+
		"\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e5\u0001"+
		"\u0000\u0000\u0000\u02e3\u02e4\u0005c\u0000\u0000\u02e4\u02e6\u0003>\u001f"+
		"\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e5\u02e6\u0001\u0000\u0000"+
		"\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7\u02e8\u0005d\u0000\u0000"+
		"\u02e8\u0305\u0001\u0000\u0000\u0000\u02e9\u02eb\u0005+\u0000\u0000\u02ea"+
		"\u02ec\u0003h4\u0000\u02eb\u02ea\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001"+
		"\u0000\u0000\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001"+
		"\u0000\u0000\u0000\u02ee\u02f1\u0001\u0000\u0000\u0000\u02ef\u02f0\u0005"+
		"c\u0000\u0000\u02f0\u02f2\u0003>\u001f\u0000\u02f1\u02ef\u0001\u0000\u0000"+
		"\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000"+
		"\u0000\u02f3\u02f4\u0005d\u0000\u0000\u02f4\u0305\u0001\u0000\u0000\u0000"+
		"\u02f5\u02f7\u0003\u0082A\u0000\u02f6\u02f5\u0001\u0000\u0000\u0000\u02f6"+
		"\u02f7\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8"+
		"\u02fa\u0005\u0005\u0000\u0000\u02f9\u02fb\u0003<\u001e\u0000\u02fa\u02f9"+
		"\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fc"+
		"\u0001\u0000\u0000\u0000\u02fc\u0305\u0005\u0006\u0000\u0000\u02fd\u0300"+
		"\u0003B!\u0000\u02fe\u0300\u0003@ \u0000\u02ff\u02fd\u0001\u0000\u0000"+
		"\u0000\u02ff\u02fe\u0001\u0000\u0000\u0000\u0300\u0301\u0001\u0000\u0000"+
		"\u0000\u0301\u0302\u0005\u0174\u0000\u0000\u0302\u0303\u0003>\u001f\u0000"+
		"\u0303\u0305\u0001\u0000\u0000\u0000\u0304\u02b5\u0001\u0000\u0000\u0000"+
		"\u0304\u02b7\u0001\u0000\u0000\u0000\u0304\u02b8\u0001\u0000\u0000\u0000"+
		"\u0304\u02b9\u0001\u0000\u0000\u0000\u0304\u02be\u0001\u0000\u0000\u0000"+
		"\u0304\u02bf\u0001\u0000\u0000\u0000\u0304\u02c0\u0001\u0000\u0000\u0000"+
		"\u0304\u02c2\u0001\u0000\u0000\u0000\u0304\u02c4\u0001\u0000\u0000\u0000"+
		"\u0304\u02c8\u0001\u0000\u0000\u0000\u0304\u02cd\u0001\u0000\u0000\u0000"+
		"\u0304\u02ce\u0001\u0000\u0000\u0000\u0304\u02d5\u0001\u0000\u0000\u0000"+
		"\u0304\u02dc\u0001\u0000\u0000\u0000\u0304\u02e9\u0001\u0000\u0000\u0000"+
		"\u0304\u02f6\u0001\u0000\u0000\u0000\u0304\u02ff\u0001\u0000\u0000\u0000"+
		"\u0305\u0323\u0001\u0000\u0000\u0000\u0306\u0307\n\u000f\u0000\u0000\u0307"+
		"\u0308\u0005\u0184\u0000\u0000\u0308\u0322\u0003T*\u0010\u0309\u030a\n"+
		"\u0012\u0000\u0000\u030a\u030d\u00054\u0000\u0000\u030b\u030e\u0003B!"+
		"\u0000\u030c\u030e\u0003D\"\u0000\u030d\u030b\u0001\u0000\u0000\u0000"+
		"\u030d\u030c\u0001\u0000\u0000\u0000\u030e\u0322\u0001\u0000\u0000\u0000"+
		"\u030f\u0310\n\u0004\u0000\u0000\u0310\u0311\u0005\u0005\u0000\u0000\u0311"+
		"\u0312\u0003R)\u0000\u0312\u0313\u0005\u0006\u0000\u0000\u0313\u0322\u0001"+
		"\u0000\u0000\u0000\u0314\u0315\n\u0003\u0000\u0000\u0315\u0317\u0005\u0005"+
		"\u0000\u0000\u0316\u0318\u0005\u0176\u0000\u0000\u0317\u0316\u0001\u0000"+
		"\u0000\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000"+
		"\u0000\u0000\u0319\u031b\u0005\u000b\u0000\u0000\u031a\u031c\u0005\u0176"+
		"\u0000\u0000\u031b\u031a\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000"+
		"\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d\u0322\u0005\u0006"+
		"\u0000\u0000\u031e\u031f\n\u0002\u0000\u0000\u031f\u0320\u0005\u0174\u0000"+
		"\u0000\u0320\u0322\u0003D\"\u0000\u0321\u0306\u0001\u0000\u0000\u0000"+
		"\u0321\u0309\u0001\u0000\u0000\u0000\u0321\u030f\u0001\u0000\u0000\u0000"+
		"\u0321\u0314\u0001\u0000\u0000\u0000\u0321\u031e\u0001\u0000\u0000\u0000"+
		"\u0322\u0325\u0001\u0000\u0000\u0000\u0323\u0321\u0001\u0000\u0000\u0000"+
		"\u0323\u0324\u0001\u0000\u0000\u0000\u0324U\u0001\u0000\u0000\u0000\u0325"+
		"\u0323\u0001\u0000\u0000\u0000\u0326\u032f\u0005\u00d5\u0000\u0000\u0327"+
		"\u032f\u0003H$\u0000\u0328\u032f\u0003|>\u0000\u0329\u032a\u0007\f\u0000"+
		"\u0000\u032a\u032f\u0003D\"\u0000\u032b\u032f\u0003D\"\u0000\u032c\u032f"+
		"\u0003v;\u0000\u032d\u032f\u0003z=\u0000\u032e\u0326\u0001\u0000\u0000"+
		"\u0000\u032e\u0327\u0001\u0000\u0000\u0000\u032e\u0328\u0001\u0000\u0000"+
		"\u0000\u032e\u0329\u0001\u0000\u0000\u0000\u032e\u032b\u0001\u0000\u0000"+
		"\u0000\u032e\u032c\u0001\u0000\u0000\u0000\u032e\u032d\u0001\u0000\u0000"+
		"\u0000\u032fW\u0001\u0000\u0000\u0000\u0330\u0331\u0005o\u0000\u0000\u0331"+
		"\u0332\u0005\u0002\u0000\u0000\u0332\u0333\u0003B!\u0000\u0333\u0334\u0005"+
		"\u007f\u0000\u0000\u0334\u0335\u0003R)\u0000\u0335\u0336\u0005\u0003\u0000"+
		"\u0000\u0336\u036b\u0001\u0000\u0000\u0000\u0337\u0338\u0005\u008a\u0000"+
		"\u0000\u0338\u0341\u0005\u0002\u0000\u0000\u0339\u033e\u0003>\u001f\u0000"+
		"\u033a\u033b\u0005\u0001\u0000\u0000\u033b\u033d\u0003>\u001f\u0000\u033c"+
		"\u033a\u0001\u0000\u0000\u0000\u033d\u0340\u0001\u0000\u0000\u0000\u033e"+
		"\u033c\u0001\u0000\u0000\u0000\u033e\u033f\u0001\u0000\u0000\u0000\u033f"+
		"\u0342\u0001\u0000\u0000\u0000\u0340\u033e\u0001\u0000\u0000\u0000\u0341"+
		"\u0339\u0001\u0000\u0000\u0000\u0341\u0342\u0001\u0000\u0000\u0000\u0342"+
		"\u0343\u0001\u0000\u0000\u0000\u0343\u036b\u0005\u0003\u0000\u0000\u0344"+
		"\u0345\u0005\u008b\u0000\u0000\u0345\u034e\u0005\u0002\u0000\u0000\u0346"+
		"\u034b\u0003>\u001f\u0000\u0347\u0348\u0005\u0001\u0000\u0000\u0348\u034a"+
		"\u0003>\u001f\u0000\u0349\u0347\u0001\u0000\u0000\u0000\u034a\u034d\u0001"+
		"\u0000\u0000\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034b\u034c\u0001"+
		"\u0000\u0000\u0000\u034c\u034f\u0001\u0000\u0000\u0000\u034d\u034b\u0001"+
		"\u0000\u0000\u0000\u034e\u0346\u0001\u0000\u0000\u0000\u034e\u034f\u0001"+
		"\u0000\u0000\u0000\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u036b\u0005"+
		"\u0003\u0000\u0000\u0351\u036b\u0003b1\u0000\u0352\u036b\u0003d2\u0000"+
		"\u0353\u0355\u0003Z-\u0000\u0354\u0356\u0003j5\u0000\u0355\u0354\u0001"+
		"\u0000\u0000\u0000\u0355\u0356\u0001\u0000\u0000\u0000\u0356\u036b\u0001"+
		"\u0000\u0000\u0000\u0357\u0358\u0003f3\u0000\u0358\u0359\u0003j5\u0000"+
		"\u0359\u036b\u0001\u0000\u0000\u0000\u035a\u035b\u0003J%\u0000\u035b\u0364"+
		"\u0005\u0002\u0000\u0000\u035c\u0361\u0003>\u001f\u0000\u035d\u035e\u0005"+
		"\u0001\u0000\u0000\u035e\u0360\u0003>\u001f\u0000\u035f\u035d\u0001\u0000"+
		"\u0000\u0000\u0360\u0363\u0001\u0000\u0000\u0000\u0361\u035f\u0001\u0000"+
		"\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362\u0365\u0001\u0000"+
		"\u0000\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0364\u035c\u0001\u0000"+
		"\u0000\u0000\u0364\u0365\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000"+
		"\u0000\u0000\u0366\u0368\u0005\u0003\u0000\u0000\u0367\u0369\u0003j5\u0000"+
		"\u0368\u0367\u0001\u0000\u0000\u0000\u0368\u0369\u0001\u0000\u0000\u0000"+
		"\u0369\u036b\u0001\u0000\u0000\u0000\u036a\u0330\u0001\u0000\u0000\u0000"+
		"\u036a\u0337\u0001\u0000\u0000\u0000\u036a\u0344\u0001\u0000\u0000\u0000"+
		"\u036a\u0351\u0001\u0000\u0000\u0000\u036a\u0352\u0001\u0000\u0000\u0000"+
		"\u036a\u0353\u0001\u0000\u0000\u0000\u036a\u0357\u0001\u0000\u0000\u0000"+
		"\u036a\u035a\u0001\u0000\u0000\u0000\u036bY\u0001\u0000\u0000\u0000\u036c"+
		"\u036d\u0005\u001b\u0000\u0000\u036d\u036f\u0005\u0002\u0000\u0000\u036e"+
		"\u0370\u0005[\u0000\u0000\u036f\u036e\u0001\u0000\u0000\u0000\u036f\u0370"+
		"\u0001\u0000\u0000\u0000\u0370\u0371\u0001\u0000\u0000\u0000\u0371\u0372"+
		"\u0003>\u001f\u0000\u0372\u0373\u0005\u0003\u0000\u0000\u0373\u03a3\u0001"+
		"\u0000\u0000\u0000\u0374\u0375\u0005B\u0000\u0000\u0375\u0377\u0005\u0002"+
		"\u0000\u0000\u0376\u0378\u0005\u0169\u0000\u0000\u0377\u0376\u0001\u0000"+
		"\u0000\u0000\u0377\u0378\u0001\u0000\u0000\u0000\u0378\u0379\u0001\u0000"+
		"\u0000\u0000\u0379\u03a3\u0005\u0003\u0000\u0000\u037a\u037b\u0005B\u0000"+
		"\u0000\u037b\u037d\u0005\u0002\u0000\u0000\u037c\u037e\u0005[\u0000\u0000"+
		"\u037d\u037c\u0001\u0000\u0000\u0000\u037d\u037e\u0001\u0000\u0000\u0000"+
		"\u037e\u0387\u0001\u0000\u0000\u0000\u037f\u0384\u0003>\u001f\u0000\u0380"+
		"\u0381\u0005\u0001\u0000\u0000\u0381\u0383\u0003>\u001f\u0000\u0382\u0380"+
		"\u0001\u0000\u0000\u0000\u0383\u0386\u0001\u0000\u0000\u0000\u0384\u0382"+
		"\u0001\u0000\u0000\u0000\u0384\u0385\u0001\u0000\u0000\u0000\u0385\u0388"+
		"\u0001\u0000\u0000\u0000\u0386\u0384\u0001\u0000\u0000\u0000\u0387\u037f"+
		"\u0001\u0000\u0000\u0000\u0387\u0388\u0001\u0000\u0000\u0000\u0388\u0389"+
		"\u0001\u0000\u0000\u0000\u0389\u03a3\u0005\u0003\u0000\u0000\u038a\u038b"+
		"\u0005\u00c3\u0000\u0000\u038b\u038d\u0005\u0002\u0000\u0000\u038c\u038e"+
		"\u0005[\u0000\u0000\u038d\u038c\u0001\u0000\u0000\u0000\u038d\u038e\u0001"+
		"\u0000\u0000\u0000\u038e\u038f\u0001\u0000\u0000\u0000\u038f\u0390\u0003"+
		">\u001f\u0000\u0390\u0391\u0005\u0003\u0000\u0000\u0391\u03a3\u0001\u0000"+
		"\u0000\u0000\u0392\u0393\u0005\u00c6\u0000\u0000\u0393\u0395\u0005\u0002"+
		"\u0000\u0000\u0394\u0396\u0005[\u0000\u0000\u0395\u0394\u0001\u0000\u0000"+
		"\u0000\u0395\u0396\u0001\u0000\u0000\u0000\u0396\u0397\u0001\u0000\u0000"+
		"\u0000\u0397\u0398\u0003>\u001f\u0000\u0398\u0399\u0005\u0003\u0000\u0000"+
		"\u0399\u03a3\u0001\u0000\u0000\u0000\u039a\u039b\u0005\u012e\u0000\u0000"+
		"\u039b\u039d\u0005\u0002\u0000\u0000\u039c\u039e\u0005[\u0000\u0000\u039d"+
		"\u039c\u0001\u0000\u0000\u0000\u039d\u039e\u0001\u0000\u0000\u0000\u039e"+
		"\u039f\u0001\u0000\u0000\u0000\u039f\u03a0\u0003>\u001f\u0000\u03a0\u03a1"+
		"\u0005\u0003\u0000\u0000\u03a1\u03a3\u0001\u0000\u0000\u0000\u03a2\u036c"+
		"\u0001\u0000\u0000\u0000\u03a2\u0374\u0001\u0000\u0000\u0000\u03a2\u037a"+
		"\u0001\u0000\u0000\u0000\u03a2\u038a\u0001\u0000\u0000\u0000\u03a2\u0392"+
		"\u0001\u0000\u0000\u0000\u03a2\u039a\u0001\u0000\u0000\u0000\u03a3[\u0001"+
		"\u0000\u0000\u0000\u03a4\u03a5\u0005\u0175\u0000\u0000\u03a5\u03a6\u0003"+
		":\u001d\u0000\u03a6]\u0001\u0000\u0000\u0000\u03a7\u03a8\u0005\u0175\u0000"+
		"\u0000\u03a8\u03ac\u0005\u0175\u0000\u0000\u03a9\u03aa\u0003\u0088D\u0000"+
		"\u03aa\u03ab\u0005\u0004\u0000\u0000\u03ab\u03ad\u0001\u0000\u0000\u0000"+
		"\u03ac\u03a9\u0001\u0000\u0000\u0000\u03ac\u03ad\u0001\u0000\u0000\u0000"+
		"\u03ad\u03ae\u0001\u0000\u0000\u0000\u03ae\u03af\u0003B!\u0000\u03af_"+
		"\u0001\u0000\u0000\u0000\u03b0\u03b3\u0003B!\u0000\u03b1\u03b3\u0003J"+
		"%\u0000\u03b2\u03b0\u0001\u0000\u0000\u0000\u03b2\u03b1\u0001\u0000\u0000"+
		"\u0000\u03b3a\u0001\u0000\u0000\u0000\u03b4\u03b5\u0005J\u0000\u0000\u03b5"+
		"\u03b6\u0005\u0002\u0000\u0000\u03b6\u03c4\u0005\u0003\u0000\u0000\u03b7"+
		"\u03b8\u0005\u0118\u0000\u0000\u03b8\u03b9\u0005\u0002\u0000\u0000\u03b9"+
		"\u03c4\u0005\u0003\u0000\u0000\u03ba\u03bb\u0005\u014f\u0000\u0000\u03bb"+
		"\u03bc\u0005\u0002\u0000\u0000\u03bc\u03c4\u0005\u0003\u0000\u0000\u03bd"+
		"\u03be\u0005>\u0000\u0000\u03be\u03bf\u0005\u0002\u0000\u0000\u03bf\u03c4"+
		"\u0005\u0003\u0000\u0000\u03c0\u03c1\u0005H\u0000\u0000\u03c1\u03c2\u0005"+
		"\u0002\u0000\u0000\u03c2\u03c4\u0005\u0003\u0000\u0000\u03c3\u03b4\u0001"+
		"\u0000\u0000\u0000\u03c3\u03b7\u0001\u0000\u0000\u0000\u03c3\u03ba\u0001"+
		"\u0000\u0000\u0000\u03c3\u03bd\u0001\u0000\u0000\u0000\u03c3\u03c0\u0001"+
		"\u0000\u0000\u0000\u03c4c\u0001\u0000\u0000\u0000\u03c5\u03c6\u00051\u0000"+
		"\u0000\u03c6\u03c7\u0005\u0002\u0000\u0000\u03c7\u03c8\u0003>\u001f\u0000"+
		"\u03c8\u03c9\u0005\u0003\u0000\u0000\u03c9\u0456\u0001\u0000\u0000\u0000"+
		"\u03ca\u03cb\u0005G\u0000\u0000\u03cb\u03cc\u0005\u0002\u0000\u0000\u03cc"+
		"\u0456\u0005\u0003\u0000\u0000\u03cd\u03ce\u0005N\u0000\u0000\u03ce\u03cf"+
		"\u0005\u0002\u0000\u0000\u03cf\u03d0\u0003>\u001f\u0000\u03d0\u03d1\u0005"+
		"\u0003\u0000\u0000\u03d1\u0456\u0001\u0000\u0000\u0000\u03d2\u03d3\u0005"+
		"\u0093\u0000\u0000\u03d3\u03d4\u0005\u0002\u0000\u0000\u03d4\u03d5\u0003"+
		">\u001f\u0000\u03d5\u03d6\u0005\u0003\u0000\u0000\u03d6\u0456\u0001\u0000"+
		"\u0000\u0000\u03d7\u03d8\u0005\u0096\u0000\u0000\u03d8\u03e1\u0005\u0002"+
		"\u0000\u0000\u03d9\u03de\u0003>\u001f\u0000\u03da\u03db\u0005\u0001\u0000"+
		"\u0000\u03db\u03dd\u0003>\u001f\u0000\u03dc\u03da\u0001\u0000\u0000\u0000"+
		"\u03dd\u03e0\u0001\u0000\u0000\u0000\u03de\u03dc\u0001\u0000\u0000\u0000"+
		"\u03de\u03df\u0001\u0000\u0000\u0000\u03df\u03e2\u0001\u0000\u0000\u0000"+
		"\u03e0\u03de\u0001\u0000\u0000\u0000\u03e1\u03d9\u0001\u0000\u0000\u0000"+
		"\u03e1\u03e2\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001\u0000\u0000\u0000"+
		"\u03e3\u0456\u0005\u0003\u0000\u0000\u03e4\u03e5\u0005\u00b7\u0000\u0000"+
		"\u03e5\u03e6\u0005\u0002\u0000\u0000\u03e6\u03e7\u0003>\u001f\u0000\u03e7"+
		"\u03e8\u0005\u0001\u0000\u0000\u03e8\u03e9\u0003>\u001f\u0000\u03e9\u03ea"+
		"\u0005\u0003\u0000\u0000\u03ea\u0456\u0001\u0000\u0000\u0000\u03eb\u03ec"+
		"\u0005\u00ba\u0000\u0000\u03ec\u03ed\u0005\u0002\u0000\u0000\u03ed\u03ee"+
		"\u0003>\u001f\u0000\u03ee\u03ef\u0005\u0001\u0000\u0000\u03ef\u03f0\u0003"+
		">\u001f\u0000\u03f0\u03f1\u0005\u0003\u0000\u0000\u03f1\u0456\u0001\u0000"+
		"\u0000\u0000\u03f2\u03f3\u0005\u00c7\u0000\u0000\u03f3\u03f4\u0005\u0002"+
		"\u0000\u0000\u03f4\u03f5\u0003>\u001f\u0000\u03f5\u03f6\u0005\u0003\u0000"+
		"\u0000\u03f6\u0456\u0001\u0000\u0000\u0000\u03f7\u03f8\u0005\u00ca\u0000"+
		"\u0000\u03f8\u03f9\u0005\u0002\u0000\u0000\u03f9\u03fa\u0003>\u001f\u0000"+
		"\u03fa\u03fb\u0005\u0001\u0000\u0000\u03fb\u03fc\u0003>\u001f\u0000\u03fc"+
		"\u03fd\u0005\u0003\u0000\u0000\u03fd\u0456\u0001\u0000\u0000\u0000\u03fe"+
		"\u03ff\u0005\u00cd\u0000\u0000\u03ff\u0400\u0005\u0002\u0000\u0000\u0400"+
		"\u0401\u0003>\u001f\u0000\u0401\u0402\u0005\u0003\u0000\u0000\u0402\u0456"+
		"\u0001\u0000\u0000\u0000\u0403\u0404\u0005\u00f3\u0000\u0000\u0404\u0405"+
		"\u0005\u0002\u0000\u0000\u0405\u0406\u0003>\u001f\u0000\u0406\u0407\u0005"+
		"\u0003\u0000\u0000\u0407\u0456\u0001\u0000\u0000\u0000\u0408\u0409\u0005"+
		"\u00fc\u0000\u0000\u0409\u040a\u0005\u0002\u0000\u0000\u040a\u040b\u0003"+
		">\u001f\u0000\u040b\u040c\u0005\u0001\u0000\u0000\u040c\u040d\u0003>\u001f"+
		"\u0000\u040d\u040e\u0005\u0003\u0000\u0000\u040e\u0456\u0001\u0000\u0000"+
		"\u0000\u040f\u0410\u0005\u0101\u0000\u0000\u0410\u0419\u0005\u0002\u0000"+
		"\u0000\u0411\u0416\u0003>\u001f\u0000\u0412\u0413\u0005\u0001\u0000\u0000"+
		"\u0413\u0415\u0003>\u001f\u0000\u0414\u0412\u0001\u0000\u0000\u0000\u0415"+
		"\u0418\u0001\u0000\u0000\u0000\u0416\u0414\u0001\u0000\u0000\u0000\u0416"+
		"\u0417\u0001\u0000\u0000\u0000\u0417\u041a\u0001\u0000\u0000\u0000\u0418"+
		"\u0416\u0001\u0000\u0000\u0000\u0419\u0411\u0001\u0000\u0000\u0000\u0419"+
		"\u041a\u0001\u0000\u0000\u0000\u041a\u041b\u0001\u0000\u0000\u0000\u041b"+
		"\u0456\u0005\u0003\u0000\u0000\u041c\u041d\u0005\u010d\u0000\u0000\u041d"+
		"\u041e\u0005\u0002\u0000\u0000\u041e\u041f\u0003>\u001f\u0000\u041f\u0420"+
		"\u0005\u0001\u0000\u0000\u0420\u0421\u0003>\u001f\u0000\u0421\u0422\u0005"+
		"\u0003\u0000\u0000\u0422\u0456\u0001\u0000\u0000\u0000\u0423\u0424\u0005"+
		"\u010e\u0000\u0000\u0424\u0425\u0005\u0002\u0000\u0000\u0425\u0426\u0003"+
		">\u001f\u0000\u0426\u0427\u0005\u0001\u0000\u0000\u0427\u0428\u0003>\u001f"+
		"\u0000\u0428\u0429\u0005\u0003\u0000\u0000\u0429\u0456\u0001\u0000\u0000"+
		"\u0000\u042a\u042b\u0005\u011a\u0000\u0000\u042b\u042c\u0005\u0002\u0000"+
		"\u0000\u042c\u042d\u0003>\u001f\u0000\u042d\u042e\u0005\u0003\u0000\u0000"+
		"\u042e\u0456\u0001\u0000\u0000\u0000\u042f\u0430\u0005\u013c\u0000\u0000"+
		"\u0430\u0431\u0005\u0002\u0000\u0000\u0431\u0432\u0003x<\u0000\u0432\u0433"+
		"\u0005\u0001\u0000\u0000\u0433\u0434\u0003>\u001f\u0000\u0434\u0435\u0005"+
		"\u0001\u0000\u0000\u0435\u0436\u0003>\u001f\u0000\u0436\u0437\u0005\u0003"+
		"\u0000\u0000\u0437\u0456\u0001\u0000\u0000\u0000\u0438\u0439\u0005\u013d"+
		"\u0000\u0000\u0439\u043a\u0005\u0002\u0000\u0000\u043a\u043b\u0003x<\u0000"+
		"\u043b\u043c\u0005\u0001\u0000\u0000\u043c\u043d\u0003>\u001f\u0000\u043d"+
		"\u043e\u0005\u0001\u0000\u0000\u043e\u043f\u0003>\u001f\u0000\u043f\u0440"+
		"\u0005\u0003\u0000\u0000\u0440\u0456\u0001\u0000\u0000\u0000\u0441\u0442"+
		"\u0005\u015f\u0000\u0000\u0442\u0443\u0005\u0002\u0000\u0000\u0443\u0444"+
		"\u0003>\u001f\u0000\u0444\u0445\u0005\u0003\u0000\u0000\u0445\u0456\u0001"+
		"\u0000\u0000\u0000\u0446\u0447\u0005\u00e5\u0000\u0000\u0447\u0448\u0005"+
		"\u0002\u0000\u0000\u0448\u0449\u0003D\"\u0000\u0449\u044a\u0005\u0003"+
		"\u0000\u0000\u044a\u0456\u0001\u0000\u0000\u0000\u044b\u044c\u0005w\u0000"+
		"\u0000\u044c\u044d\u0005\u0002\u0000\u0000\u044d\u044e\u0003>\u001f\u0000"+
		"\u044e\u044f\u0005\u0003\u0000\u0000\u044f\u0456\u0001\u0000\u0000\u0000"+
		"\u0450\u0451\u0005/\u0000\u0000\u0451\u0452\u0005\u0002\u0000\u0000\u0452"+
		"\u0453\u0003>\u001f\u0000\u0453\u0454\u0005\u0003\u0000\u0000\u0454\u0456"+
		"\u0001\u0000\u0000\u0000\u0455\u03c5\u0001\u0000\u0000\u0000\u0455\u03ca"+
		"\u0001\u0000\u0000\u0000\u0455\u03cd\u0001\u0000\u0000\u0000\u0455\u03d2"+
		"\u0001\u0000\u0000\u0000\u0455\u03d7\u0001\u0000\u0000\u0000\u0455\u03e4"+
		"\u0001\u0000\u0000\u0000\u0455\u03eb\u0001\u0000\u0000\u0000\u0455\u03f2"+
		"\u0001\u0000\u0000\u0000\u0455\u03f7\u0001\u0000\u0000\u0000\u0455\u03fe"+
		"\u0001\u0000\u0000\u0000\u0455\u0403\u0001\u0000\u0000\u0000\u0455\u0408"+
		"\u0001\u0000\u0000\u0000\u0455\u040f\u0001\u0000\u0000\u0000\u0455\u041c"+
		"\u0001\u0000\u0000\u0000\u0455\u0423\u0001\u0000\u0000\u0000\u0455\u042a"+
		"\u0001\u0000\u0000\u0000\u0455\u042f\u0001\u0000\u0000\u0000\u0455\u0438"+
		"\u0001\u0000\u0000\u0000\u0455\u0441\u0001\u0000\u0000\u0000\u0455\u0446"+
		"\u0001\u0000\u0000\u0000\u0455\u044b\u0001\u0000\u0000\u0000\u0455\u0450"+
		"\u0001\u0000\u0000\u0000\u0456e\u0001\u0000\u0000\u0000\u0457\u0458\u0005"+
		"\u0116\u0000\u0000\u0458\u0459\u0005\u0002\u0000\u0000\u0459\u049b\u0005"+
		"\u0003\u0000\u0000\u045a\u045b\u0005\u00f8\u0000\u0000\u045b\u045c\u0005"+
		"\u0002\u0000\u0000\u045c\u049b\u0005\u0003\u0000\u0000\u045d\u045e\u0005"+
		"W\u0000\u0000\u045e\u045f\u0005\u0002\u0000\u0000\u045f\u049b\u0005\u0003"+
		"\u0000\u0000\u0460\u0461\u0005X\u0000\u0000\u0461\u0463\u0005\u0002\u0000"+
		"\u0000\u0462\u0464\u0003>\u001f\u0000\u0463\u0462\u0001\u0000\u0000\u0000"+
		"\u0463\u0464\u0001\u0000\u0000\u0000\u0464\u0465\u0001\u0000\u0000\u0000"+
		"\u0465\u049b\u0005\u0003\u0000\u0000\u0466\u0467\u0005\u00b6\u0000\u0000"+
		"\u0467\u0470\u0005\u0002\u0000\u0000\u0468\u046d\u0003>\u001f\u0000\u0469"+
		"\u046a\u0005\u0001\u0000\u0000\u046a\u046c\u0003>\u001f\u0000\u046b\u0469"+
		"\u0001\u0000\u0000\u0000\u046c\u046f\u0001\u0000\u0000\u0000\u046d\u046b"+
		"\u0001\u0000\u0000\u0000\u046d\u046e\u0001\u0000\u0000\u0000\u046e\u0471"+
		"\u0001\u0000\u0000\u0000\u046f\u046d\u0001\u0000\u0000\u0000\u0470\u0468"+
		"\u0001\u0000\u0000\u0000\u0470\u0471\u0001\u0000\u0000\u0000\u0471\u0472"+
		"\u0001\u0000\u0000\u0000\u0472\u049b\u0005\u0003\u0000\u0000\u0473\u0474"+
		"\u0005\u00b1\u0000\u0000\u0474\u047d\u0005\u0002\u0000\u0000\u0475\u047a"+
		"\u0003>\u001f\u0000\u0476\u0477\u0005\u0001\u0000\u0000\u0477\u0479\u0003"+
		">\u001f\u0000\u0478\u0476\u0001\u0000\u0000\u0000\u0479\u047c\u0001\u0000"+
		"\u0000\u0000\u047a\u0478\u0001\u0000\u0000\u0000\u047a\u047b\u0001\u0000"+
		"\u0000\u0000\u047b\u047e\u0001\u0000\u0000\u0000\u047c\u047a\u0001\u0000"+
		"\u0000\u0000\u047d\u0475\u0001\u0000\u0000\u0000\u047d\u047e\u0001\u0000"+
		"\u0000\u0000\u047e\u047f\u0001\u0000\u0000\u0000\u047f\u049b\u0005\u0003"+
		"\u0000\u0000\u0480\u0481\u0005u\u0000\u0000\u0481\u048a\u0005\u0002\u0000"+
		"\u0000\u0482\u0487\u0003>\u001f\u0000\u0483\u0484\u0005\u0001\u0000\u0000"+
		"\u0484\u0486\u0003>\u001f\u0000\u0485\u0483\u0001\u0000\u0000\u0000\u0486"+
		"\u0489\u0001\u0000\u0000\u0000\u0487\u0485\u0001\u0000\u0000\u0000\u0487"+
		"\u0488\u0001\u0000\u0000\u0000\u0488\u048b\u0001\u0000\u0000\u0000\u0489"+
		"\u0487\u0001\u0000\u0000\u0000\u048a\u0482\u0001\u0000\u0000\u0000\u048a"+
		"\u048b\u0001\u0000\u0000\u0000\u048b\u048c\u0001\u0000\u0000\u0000\u048c"+
		"\u049b\u0005\u0003\u0000\u0000\u048d\u048e\u0005\u00b4\u0000\u0000\u048e"+
		"\u0497\u0005\u0002\u0000\u0000\u048f\u0494\u0003>\u001f\u0000\u0490\u0491"+
		"\u0005\u0001\u0000\u0000\u0491\u0493\u0003>\u001f\u0000\u0492\u0490\u0001"+
		"\u0000\u0000\u0000\u0493\u0496\u0001\u0000\u0000\u0000\u0494\u0492\u0001"+
		"\u0000\u0000\u0000\u0494\u0495\u0001\u0000\u0000\u0000\u0495\u0498\u0001"+
		"\u0000\u0000\u0000\u0496\u0494\u0001\u0000\u0000\u0000\u0497\u048f\u0001"+
		"\u0000\u0000\u0000\u0497\u0498\u0001\u0000\u0000\u0000\u0498\u0499\u0001"+
		"\u0000\u0000\u0000\u0499\u049b\u0005\u0003\u0000\u0000\u049a\u0457\u0001"+
		"\u0000\u0000\u0000\u049a\u045a\u0001\u0000\u0000\u0000\u049a\u045d\u0001"+
		"\u0000\u0000\u0000\u049a\u0460\u0001\u0000\u0000\u0000\u049a\u0466\u0001"+
		"\u0000\u0000\u0000\u049a\u0473\u0001\u0000\u0000\u0000\u049a\u0480\u0001"+
		"\u0000\u0000\u0000\u049a\u048d\u0001\u0000\u0000\u0000\u049bg\u0001\u0000"+
		"\u0000\u0000\u049c\u049d\u0005\u0159\u0000\u0000\u049d\u049e\u0003>\u001f"+
		"\u0000\u049e\u049f\u0005\u0139\u0000\u0000\u049f\u04a0\u0003>\u001f\u0000"+
		"\u04a0i\u0001\u0000\u0000\u0000\u04a1\u04a2\u0005\u00e2\u0000\u0000\u04a2"+
		"\u04ad\u0005\u0002\u0000\u0000\u04a3\u04a4\u0005\u00e3\u0000\u0000\u04a4"+
		"\u04a5\u0005)\u0000\u0000\u04a5\u04aa\u0003>\u001f\u0000\u04a6\u04a7\u0005"+
		"\u0001\u0000\u0000\u04a7\u04a9\u0003>\u001f\u0000\u04a8\u04a6\u0001\u0000"+
		"\u0000\u0000\u04a9\u04ac\u0001\u0000\u0000\u0000\u04aa\u04a8\u0001\u0000"+
		"\u0000\u0000\u04aa\u04ab\u0001\u0000\u0000\u0000\u04ab\u04ae\u0001\u0000"+
		"\u0000\u0000\u04ac\u04aa\u0001\u0000\u0000\u0000\u04ad\u04a3\u0001\u0000"+
		"\u0000\u0000\u04ad\u04ae\u0001\u0000\u0000\u0000\u04ae\u04b9\u0001\u0000"+
		"\u0000\u0000\u04af\u04b0\u0005\u00df\u0000\u0000\u04b0\u04b1\u0005)\u0000"+
		"\u0000\u04b1\u04b6\u0003r9\u0000\u04b2\u04b3\u0005\u0001\u0000\u0000\u04b3"+
		"\u04b5\u0003r9\u0000\u04b4\u04b2\u0001\u0000\u0000\u0000\u04b5\u04b8\u0001"+
		"\u0000\u0000\u0000\u04b6\u04b4\u0001\u0000\u0000\u0000\u04b6\u04b7\u0001"+
		"\u0000\u0000\u0000\u04b7\u04ba\u0001\u0000\u0000\u0000\u04b8\u04b6\u0001"+
		"\u0000\u0000\u0000\u04b9\u04af\u0001\u0000\u0000\u0000\u04b9\u04ba\u0001"+
		"\u0000\u0000\u0000\u04ba\u04bc\u0001\u0000\u0000\u0000\u04bb\u04bd\u0003"+
		"l6\u0000\u04bc\u04bb\u0001\u0000\u0000\u0000\u04bc\u04bd\u0001\u0000\u0000"+
		"\u0000\u04bd\u04be\u0001\u0000\u0000\u0000\u04be\u04bf\u0005\u0003\u0000"+
		"\u0000\u04bfk\u0001\u0000\u0000\u0000\u04c0\u04c1\u0005\u00f7\u0000\u0000"+
		"\u04c1\u04d1\u0003n7\u0000\u04c2\u04c3\u0005\u0115\u0000\u0000\u04c3\u04d1"+
		"\u0003n7\u0000\u04c4\u04c5\u0005\u00f7\u0000\u0000\u04c5\u04c6\u0005 "+
		"\u0000\u0000\u04c6\u04c7\u0003n7\u0000\u04c7\u04c8\u0005\u0013\u0000\u0000"+
		"\u04c8\u04c9\u0003n7\u0000\u04c9\u04d1\u0001\u0000\u0000\u0000\u04ca\u04cb"+
		"\u0005\u0115\u0000\u0000\u04cb\u04cc\u0005 \u0000\u0000\u04cc\u04cd\u0003"+
		"n7\u0000\u04cd\u04ce\u0005\u0013\u0000\u0000\u04ce\u04cf\u0003n7\u0000"+
		"\u04cf\u04d1\u0001\u0000\u0000\u0000\u04d0\u04c0\u0001\u0000\u0000\u0000"+
		"\u04d0\u04c2\u0001\u0000\u0000\u0000\u04d0\u04c4\u0001\u0000\u0000\u0000"+
		"\u04d0\u04ca\u0001\u0000\u0000\u0000\u04d1m\u0001\u0000\u0000\u0000\u04d2"+
		"\u04d3\u0005\u0147\u0000\u0000\u04d3\u04dc\u0005\u00ec\u0000\u0000\u04d4"+
		"\u04d5\u0005\u0147\u0000\u0000\u04d5\u04dc\u0005y\u0000\u0000\u04d6\u04d7"+
		"\u0005F\u0000\u0000\u04d7\u04dc\u0005\u0114\u0000\u0000\u04d8\u04d9\u0003"+
		">\u001f\u0000\u04d9\u04da\u0007\r\u0000\u0000\u04da\u04dc\u0001\u0000"+
		"\u0000\u0000\u04db\u04d2\u0001\u0000\u0000\u0000\u04db\u04d4\u0001\u0000"+
		"\u0000\u0000\u04db\u04d6\u0001\u0000\u0000\u0000\u04db\u04d8\u0001\u0000"+
		"\u0000\u0000\u04dco\u0001\u0000\u0000\u0000\u04dd\u04de\u0007\u000e\u0000"+
		"\u0000\u04deq\u0001\u0000\u0000\u0000\u04df\u04e1\u0003>\u001f\u0000\u04e0"+
		"\u04e2\u0007\u000f\u0000\u0000\u04e1\u04e0\u0001\u0000\u0000\u0000\u04e1"+
		"\u04e2\u0001\u0000\u0000\u0000\u04e2\u04e5\u0001\u0000\u0000\u0000\u04e3"+
		"\u04e4\u0005\u00d6\u0000\u0000\u04e4\u04e6\u0007\u0010\u0000\u0000\u04e5"+
		"\u04e3\u0001\u0000\u0000\u0000\u04e5\u04e6\u0001\u0000\u0000\u0000\u04e6"+
		"s\u0001\u0000\u0000\u0000\u04e7\u04e8\u0005\u00bb\u0000\u0000\u04e8\u04eb"+
		"\u0005\u0176\u0000\u0000\u04e9\u04ea\u0005\u00d8\u0000\u0000\u04ea\u04ec"+
		"\u0005\u0176\u0000\u0000\u04eb\u04e9\u0001\u0000\u0000\u0000\u04eb\u04ec"+
		"\u0001\u0000\u0000\u0000\u04ec\u04f2\u0001\u0000\u0000\u0000\u04ed\u04ee"+
		"\u0005\u00bb\u0000\u0000\u04ee\u04ef\u0005\u0176\u0000\u0000\u04ef\u04f0"+
		"\u0005\u0001\u0000\u0000\u04f0\u04f2\u0005\u0176\u0000\u0000\u04f1\u04e7"+
		"\u0001\u0000\u0000\u0000\u04f1\u04ed\u0001\u0000\u0000\u0000\u04f2u\u0001"+
		"\u0000\u0000\u0000\u04f3\u04f4\u0005\u00a5\u0000\u0000\u04f4\u04f5\u0003"+
		">\u001f\u0000\u04f5\u04f6\u0003x<\u0000\u04f6w\u0001\u0000\u0000\u0000"+
		"\u04f7\u04f8\u0007\u0011\u0000\u0000\u04f8y\u0001\u0000\u0000\u0000\u04f9"+
		"\u04fa\u0007\u0012\u0000\u0000\u04fa{\u0001\u0000\u0000\u0000\u04fb\u04ff"+
		"\u0005\u0177\u0000\u0000\u04fc\u04ff\u0005\u0178\u0000\u0000\u04fd\u04ff"+
		"\u0005\u0176\u0000\u0000\u04fe\u04fb\u0001\u0000\u0000\u0000\u04fe\u04fc"+
		"\u0001\u0000\u0000\u0000\u04fe\u04fd\u0001\u0000\u0000\u0000\u04ff}\u0001"+
		"\u0000\u0000\u0000\u0500\u053c\u0005$\u0000\u0000\u0501\u0503\u0005\u013e"+
		"\u0000\u0000\u0502\u0504\u0003\u0084B\u0000\u0503\u0502\u0001\u0000\u0000"+
		"\u0000\u0503\u0504\u0001\u0000\u0000\u0000\u0504\u053c\u0001\u0000\u0000"+
		"\u0000\u0505\u0507\u0005\u0124\u0000\u0000\u0506\u0508\u0003\u0084B\u0000"+
		"\u0507\u0506\u0001\u0000\u0000\u0000\u0507\u0508\u0001\u0000\u0000\u0000"+
		"\u0508\u053c\u0001\u0000\u0000\u0000\u0509\u050b\u0005\u0122\u0000\u0000"+
		"\u050a\u050c\u0005\u00a0\u0000\u0000\u050b\u050a\u0001\u0000\u0000\u0000"+
		"\u050b\u050c\u0001\u0000\u0000\u0000\u050c\u053c\u0001\u0000\u0000\u0000"+
		"\u050d\u050f\u0005\u0122\u0000\u0000\u050e\u0510\u0005\u00a2\u0000\u0000"+
		"\u050f\u050e\u0001\u0000\u0000\u0000\u050f\u0510\u0001\u0000\u0000\u0000"+
		"\u0510\u053c\u0001\u0000\u0000\u0000\u0511\u0513\u0005\u014c\u0000\u0000"+
		"\u0512\u0514\u0005\u00a0\u0000\u0000\u0513\u0512\u0001\u0000\u0000\u0000"+
		"\u0513\u0514\u0001\u0000\u0000\u0000\u0514\u053c\u0001\u0000\u0000\u0000"+
		"\u0515\u0517\u0005\u014c\u0000\u0000\u0516\u0518\u0005\u00a2\u0000\u0000"+
		"\u0517\u0516\u0001\u0000\u0000\u0000\u0517\u0518\u0001\u0000\u0000\u0000"+
		"\u0518\u053c\u0001\u0000\u0000\u0000\u0519\u051b\u0005\u00a0\u0000\u0000"+
		"\u051a\u051c\u0003\u0084B\u0000\u051b\u051a\u0001\u0000\u0000\u0000\u051b"+
		"\u051c\u0001\u0000\u0000\u0000\u051c\u053c\u0001\u0000\u0000\u0000\u051d"+
		"\u051f\u0005\u00a2\u0000\u0000\u051e\u0520\u0003\u0084B\u0000\u051f\u051e"+
		"\u0001\u0000\u0000\u0000\u051f\u0520\u0001\u0000\u0000\u0000\u0520\u053c"+
		"\u0001\u0000\u0000\u0000\u0521\u0523\u0005!\u0000\u0000\u0522\u0524\u0003"+
		"\u0084B\u0000\u0523\u0522\u0001\u0000\u0000\u0000\u0523\u0524\u0001\u0000"+
		"\u0000\u0000\u0524\u053c\u0001\u0000\u0000\u0000\u0525\u0527\u0005\u00b2"+
		"\u0000\u0000\u0526\u0528\u0003\u0084B\u0000\u0527\u0526\u0001\u0000\u0000"+
		"\u0000\u0527\u0528\u0001\u0000\u0000\u0000\u0528\u053c\u0001\u0000\u0000"+
		"\u0000\u0529\u053c\u0005v\u0000\u0000\u052a\u053c\u0005^\u0000\u0000\u052b"+
		"\u053c\u0005L\u0000\u0000\u052c\u053c\u0005M\u0000\u0000\u052d\u053c\u0005"+
		"\u013a\u0000\u0000\u052e\u0530\u00051\u0000\u0000\u052f\u0531\u0003\u0084"+
		"B\u0000\u0530\u052f\u0001\u0000\u0000\u0000\u0530\u0531\u0001\u0000\u0000"+
		"\u0000\u0531\u053c\u0001\u0000\u0000\u0000\u0532\u0534\u0005\u0153\u0000"+
		"\u0000\u0533\u0535\u0003\u0084B\u0000\u0534\u0533\u0001\u0000\u0000\u0000"+
		"\u0534\u0535\u0001\u0000\u0000\u0000\u0535\u053c\u0001\u0000\u0000\u0000"+
		"\u0536\u053c\u0005\u012c\u0000\u0000\u0537\u053c\u0005\"\u0000\u0000\u0538"+
		"\u053c\u0005\u0090\u0000\u0000\u0539\u053c\u0005\u00e8\u0000\u0000\u053a"+
		"\u053c\u0005\u00ac\u0000\u0000\u053b\u0500\u0001\u0000\u0000\u0000\u053b"+
		"\u0501\u0001\u0000\u0000\u0000\u053b\u0505\u0001\u0000\u0000\u0000\u053b"+
		"\u0509\u0001\u0000\u0000\u0000\u053b\u050d\u0001\u0000\u0000\u0000\u053b"+
		"\u0511\u0001\u0000\u0000\u0000\u053b\u0515\u0001\u0000\u0000\u0000\u053b"+
		"\u0519\u0001\u0000\u0000\u0000\u053b\u051d\u0001\u0000\u0000\u0000\u053b"+
		"\u0521\u0001\u0000\u0000\u0000\u053b\u0525\u0001\u0000\u0000\u0000\u053b"+
		"\u0529\u0001\u0000\u0000\u0000\u053b\u052a\u0001\u0000\u0000\u0000\u053b"+
		"\u052b\u0001\u0000\u0000\u0000\u053b\u052c\u0001\u0000\u0000\u0000\u053b"+
		"\u052d\u0001\u0000\u0000\u0000\u053b\u052e\u0001\u0000\u0000\u0000\u053b"+
		"\u0532\u0001\u0000\u0000\u0000\u053b\u0536\u0001\u0000\u0000\u0000\u053b"+
		"\u0537\u0001\u0000\u0000\u0000\u053b\u0538\u0001\u0000\u0000\u0000\u053b"+
		"\u0539\u0001\u0000\u0000\u0000\u053b\u053a\u0001\u0000\u0000\u0000\u053c"+
		"\u007f\u0001\u0000\u0000\u0000\u053d\u0541\u0003~?\u0000\u053e\u0541\u0003"+
		"\u0086C\u0000\u053f\u0541\u0003\u0082A\u0000\u0540\u053d\u0001\u0000\u0000"+
		"\u0000\u0540\u053e\u0001\u0000\u0000\u0000\u0540\u053f\u0001\u0000\u0000"+
		"\u0000\u0541\u0081\u0001\u0000\u0000\u0000\u0542\u0543\u0005\u0015\u0000"+
		"\u0000\u0543\u0544\u0005\u0162\u0000\u0000\u0544\u0545\u0003\u0080@\u0000"+
		"\u0545\u0546\u0005\u0164\u0000\u0000\u0546\u0083\u0001\u0000\u0000\u0000"+
		"\u0547\u0548\u0005\u0002\u0000\u0000\u0548\u0549\u0005\u0176\u0000\u0000"+
		"\u0549\u054a\u0005\u0003\u0000\u0000\u054a\u0085\u0001\u0000\u0000\u0000"+
		"\u054b\u0553\u0007\u0013\u0000\u0000\u054c\u054d\u0005\u0002\u0000\u0000"+
		"\u054d\u0550\u0005\u0176\u0000\u0000\u054e\u054f\u0005\u0001\u0000\u0000"+
		"\u054f\u0551\u0005\u0176\u0000\u0000\u0550\u054e\u0001\u0000\u0000\u0000"+
		"\u0550\u0551\u0001\u0000\u0000\u0000\u0551\u0552\u0001\u0000\u0000\u0000"+
		"\u0552\u0554\u0005\u0003\u0000\u0000\u0553\u054c\u0001\u0000\u0000\u0000"+
		"\u0553\u0554\u0001\u0000\u0000\u0000\u0554\u0087\u0001\u0000\u0000\u0000"+
		"\u0555\u0556\u0007\u0014\u0000\u0000\u0556\u0089\u0001\u0000\u0000\u0000"+
		"\u00a5\u008d\u0094\u0097\u00a8\u00ab\u00b0\u00b5\u00bb\u00be\u00c0\u00cd"+
		"\u00d1\u00d8\u00de\u00e3\u00e7\u00eb\u00ef\u00f4\u00fa\u0105\u010b\u010f"+
		"\u0115\u011c\u0120\u0122\u0129\u012e\u0133\u013a\u0142\u0147\u014b\u014e"+
		"\u0151\u0155\u0157\u015a\u0163\u0168\u016c\u016e\u0172\u0176\u0178\u017f"+
		"\u0183\u0185\u018b\u0193\u0196\u019a\u019e\u01a1\u01a6\u01ae\u01cb\u01d3"+
		"\u01e0\u01f3\u01f8\u0200\u0206\u020f\u0215\u0219\u0222\u0229\u0230\u0237"+
		"\u023f\u0241\u024a\u0253\u0260\u0269\u0276\u0278\u027d\u0280\u0288\u0290"+
		"\u0298\u029c\u02b0\u02b2\u02e1\u02e5\u02ed\u02f1\u02f6\u02fa\u02ff\u0304"+
		"\u030d\u0317\u031b\u0321\u0323\u032e\u033e\u0341\u034b\u034e\u0355\u0361"+
		"\u0364\u0368\u036a\u036f\u0377\u037d\u0384\u0387\u038d\u0395\u039d\u03a2"+
		"\u03ac\u03b2\u03c3\u03de\u03e1\u0416\u0419\u0455\u0463\u046d\u0470\u047a"+
		"\u047d\u0487\u048a\u0494\u0497\u049a\u04aa\u04ad\u04b6\u04b9\u04bc\u04d0"+
		"\u04db\u04e1\u04e5\u04eb\u04f1\u04fe\u0503\u0507\u050b\u050f\u0513\u0517"+
		"\u051b\u051f\u0523\u0527\u0530\u0534\u053b\u0540\u0550\u0553";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}