grammar Cmm;

cmmParser:
//    structDeclaration*
    methodDeclaration*
    mainDeclaration
    EOF
;

mainDeclaration:
    MAIN LPAR RPAR BEGIN NEWLINE
    functionBody
    NEWLINE END NEWLINE
    ;

functionBody:
((assignment | expression) (';' (assignment | expression))* ';'? |
    ifBlock |
    whileBlock |
    doWhileBlock |
    return)*
    ;

return:
    (RETURN expression?)
    ;

singleFunctionBody:
(assignment | expression) (';' (assignment | expression))* ';'? |
    ifBlock |
    whileBlock |
    doWhileBlock |
    return
    ;

ifBlock:
    IF expression
       (BEGIN NEWLINE functionBody NEWLINE END NEWLINE | singleFunctionBody)

    elseBlock?
    ;

elseBlock:
    ELSE
       (BEGIN NEWLINE functionBody NEWLINE END NEWLINE | singleFunctionBody)
    ;


whileBlock:
    WHILE expression
           (BEGIN NEWLINE functionBody NEWLINE END NEWLINE | singleFunctionBody)
    ;

doWhileBlock:
    DO BEGIN NEWLINE
    functionBody
    NEWLINE
    END WHILE expression
    ;


assignment:
    IDENTIFIER ASSIGN expression
    ;

expression:
    (LPAR expression RPAR) |
     expressionOperandAfterPlusMinus ((PLUS | MINUS) expressionOperandAfterPlusMinus)*
     ;

expressionOperandAfterPlusMinus:
    (LPAR expressionOperandAfterPlusMinus RPAR) |
     expressionOperandAfterMultDiv ((MULT | DIVIDE) expressionOperandAfterMultDiv)*
     ;

expressionOperandAfterMultDiv:
    (LPAR expressionOperandAfterMultDiv RPAR) |
     expressionOperandAfterCond ((EQ | LT | GT) expressionOperandAfterCond)*
    ;

expressionOperandAfterCond:
    (LPAR expressionOperandAfterCond RPAR) |
     expressionOperand ((AND | OR) expressionOperand)*
    ;

expressionOperand:
  (LPAR expressionOperand RPAR)
   | functionCall | NUM | TRUE | FALSE | IDENTIFIER | ((NEG | PLUS | MINUS) expressionOperand);

functionCall:
    (IDENTIFIER | (IDENTIFIER DOT IDENTIFIER)) call
    ;

//nestedCall:
//    (DOT IDENTIFIER | LPAR arithmeticStatement RPAR) call?
//    ;

call:
    LPAR callArguments? RPAR call?
    ;

callArguments:
    expression (COMMA callArguments)?
;

variableDeclaration:
//    VarName = variableType IDENTIFIER ';'?
//    { System.out.println("VarDec:" + $VarName.text); }
;


variableType:
    INT | BOOL | LIST | STRUCT | FPTR;


NUM: DIGIT+;

// Operators
PLUS: '+';
MINUS: '-';
MULT: '*';
DIVIDE: '/';

COMMA: ',';
DOT: '.';

GT: '>';

LT: '<';
ASSIGN: '=';
EQ: '==';

AND: '&';
OR: '|';
NEG: '~';

LPAR: '(';
RPAR: ')';
NEWLINE: '\n' | '\r';

// Keywords
INT: 'int';
BOOL: 'bool';
LIST: 'list';
STRUCT: 'struct';

FALSE: 'false';
TRUE: 'true';

BEGIN: 'begin';
END: 'end';

RETURN: 'return';

MAIN: 'main';

DISPLAY: 'display';
APPEND: 'append';
SIZE: 'size';
VOID: 'void';

GET: 'get';
SET: 'set';

WHILE: 'while';
DO: 'do';
IF: 'if';
ELSE: 'else';
FPTR: 'fptr';

IDENTIFIER: ALPHA (ALPHA | DIGIT)*;

WS: [ \t\r]+ -> skip;
COMMENT: '/*' * '*/' -> skip;
fragment DIGIT: [0-9];
fragment ALPHA: [a-zA-Z_];