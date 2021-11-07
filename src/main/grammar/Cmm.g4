grammar Cmm;

cmmParser:
    structDeclaration*
    methodDeclaration*
    mainDeclaration
    EOF
;

structDeclaration:
    STRUCT IDENTIFIER BEGIN
    structBody
    END
    ;

structBody:
    ((variableDeclaration (';' variableDeclaration)* ';'?) |
    structVariableDeclarationGetSet)*
    ;


structVariableDeclarationGetSet:
    variableType IDENTIFIER LPAR arguments? RPAR BEGIN
    SET functionBody
    GET functionBody
    END
    ;

methodDeclaration:
    (variableType | VOID) IDENTIFIER LPAR arguments? RPAR
        functionBody
   ;

arguments:
   (variableType (IDENTIFIER)) (',' variableType (IDENTIFIER))*
   ;

mainDeclaration:
    MAIN LPAR RPAR
        multiFunctionBody
    ;

functionBody:
   ((BEGIN multiFunctionBody END) | singleFunctionBody)
   ;

multiFunctionBody:
    ((assignment | expression | variableDeclaration)
     (';' (assignment | expression | variableDeclaration))* ';'? |
    doWhileBlock |
    ifBlock |
    whileBlock |
    returnStmt)*
    ;

returnStmt:
    RETURN expression?
    ;

singleFunctionBody:
(assignment | expression | variableDeclaration) (';' (assignment | expression | variableDeclaration))* ';'? |
    ifBlock |
    whileBlock |
    doWhileBlock |
    returnStmt
    ;

variableDeclaration:
   (variableType (IDENTIFIER | assignment) (',' (IDENTIFIER | assignment))*)
    ;

ifBlock:
    IF expression
       functionBody
    elseBlock?
    ;

elseBlock:
    ELSE
      functionBody
    ;

whileBlock:
    WHILE expression
       functionBody
    ;

doWhileBlock:
    DO
    functionBody
    WHILE expression
    ;

assignment:
    IDENTIFIER ASSIGN expression
    ;


expression:
    ((NEG | PLUS | MINUS)? LPAR expression RPAR) |
     expressionOperandAfterPlusMinus ((PLUS | MINUS) expressionOperandAfterPlusMinus)*
     ;

expressionOperandAfterPlusMinus:
    ((NEG | PLUS | MINUS)? LPAR expressionOperandAfterPlusMinus RPAR) |
     expressionOperandAfterMultDiv ((MULT | DIVIDE) expressionOperandAfterMultDiv)*
     ;

expressionOperandAfterMultDiv:
    ((NEG | PLUS | MINUS)? LPAR expressionOperandAfterMultDiv RPAR) |
     expressionOperandAfterCond ((EQ | LT | GT) expressionOperandAfterCond)*
    ;

expressionOperandAfterCond:
    ((NEG | PLUS | MINUS)? LPAR expressionOperandAfterCond RPAR) |
     expressionOperand ((AND | OR) expressionOperand)*
    ;

expressionOperand:
  ((NEG | PLUS | MINUS)? LPAR expressionOperand RPAR)
   | functionCall | NUM | TRUE | FALSE | IDENTIFIER | ((NEG | PLUS | MINUS) expressionOperand)
   ;

functionCall:
    IDENTIFIER call
    ;

call:
    LPAR callArguments? RPAR call?
    ;

callArguments:
    expression (COMMA expression)*
;

primitiveFunctions:
    ((DISPLAY | SIZE) LPAR IDENTIFIER RPAR) | (APPEND LPAR IDENTIFIER COMMA IDENTIFIER RPAR)
;

fptrVarTypes:
    INT | BOOL | (STRUCT IDENTIFIER) | (LIST SHARP (LIST SHARP)* variableType)
    ;

variableType:
    fptrVarTypes |
    (FPTR LT ((fptrVarTypes (COMMA fptrVarTypes)*) | VOID) '->' (fptrVarTypes | VOID) GT)
    ;

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
SHARP: '#';
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

WS: [ \t\r\n]+ -> skip;
COMMENT: '/*' * '*/' -> skip;
fragment DIGIT: [0-9];
fragment ALPHA: [a-zA-Z_];