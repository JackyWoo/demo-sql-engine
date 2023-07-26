grammar Calculator;

prog: stmt+;

stmt: expr NEWLINE                      # Expression
    | VAR '=' expr NEWLINE              # Assignment
    | NEWLINE                           # Blank
    ;

expr: expr op=('*'|'/') expr            # MulDiv
| expr op=('+'|'-') expr                # AddSub
| INT                                   # Literal
| VAR                                   # Variable
| '(' expr ')'                          # Parens
;

VAR : [a-zA-Z]+ ;
INT : [0-9]+ ;
NEWLINE:'\r'? '\n' ;
WS : [ \t]+ -> skip ;
