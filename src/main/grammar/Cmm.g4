grammar Cmm;

cmmParser:
    NEWLINE*
    structDeclaration* NEWLINE*
    methodDeclaration* NEWLINE*
    mainDeclaration NEWLINE*
    EOF
;

structDeclaration:
    STRUCT StructName = IDENTIFIER {System.out.println("StructDec : " + $StructName.text);} BEGIN NEWLINE+
    structBody
     NEWLINE+ END NEWLINE+
    ;

structBody:
    ((variableDeclaration (';' variableDeclaration)* ';'?) | NEWLINE |
    structVariableDeclarationGetSet)*
    ;


structVariableDeclarationGetSet:
    variableType IDENTIFIER LPAR arguments? RPAR BEGIN NEWLINE+
    SET {System.out.println("Setter");} functionBody NEWLINE*
    GET {System.out.println("Getter");} functionBody
    NEWLINE+ END NEWLINE+
    ;

methodDeclaration:
    (variableType | VOID) IDENTIFIER LPAR arguments? RPAR
        functionBody
   ;

arguments:
   (variableType (IDENTIFIER)) (',' variableType (IDENTIFIER))*
   ;

mainDeclaration:
    MAIN LPAR RPAR BEGIN NEWLINE+
        multiFunctionBody
    NEWLINE+ END
    ;

functionBody:
   ((BEGIN NEWLINE+ multiFunctionBody NEWLINE+ END NEWLINE+) | singleFunctionBody)
   ;

multiFunctionBody:
    ((assignment | expression | variableDeclaration | returnStmt)
     (';' (assignment | expression | variableDeclaration | returnStmt))* ';'? | NEWLINE |
    doWhileBlock |
    ifBlock |
    whileBlock)*
    ;

returnStmt:
    RETURN expression?
    ;

singleFunctionBody:
NEWLINE*
((assignment | expression | variableDeclaration | returnStmt) (';' (assignment | expression | variableDeclaration | returnStmt))* ';'? |
    ifBlock |
    whileBlock |
    doWhileBlock) NEWLINE*
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
    nestedIdentifier ASSIGN expression
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
  ((NEG | PLUS | MINUS)? LPAR expressionOperand RPAR) | (((LPAR expression RPAR) | functionCall | nestedIdentifier) index) |
  functionCall | NUM | TRUE | FALSE | nestedIdentifier | ((NEG | PLUS | MINUS) expressionOperand)
   ;

index:
    (LBRACKET NUM RBRACKET)+
    ;

functionCall:
    primitiveFunctions | (nestedIdentifier call)
    ;

call:
    LPAR callArguments? RPAR call?
    ;

callArguments:
    expression (COMMA expression)*
;

primitiveFunctions:
    ((DISPLAY | SIZE) LPAR expression RPAR) | (APPEND LPAR nestedIdentifier COMMA expression RPAR)
;

nestedIdentifier: IDENTIFIER (DOT IDENTIFIER)* (LBRACKET expression RBRACKET)*;

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
LBRACKET: '[';
RBRACKET: ']';
SHARP: '#';
NEWLINE: '\n';

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

//WS: WHITESPACE -> skip;
//WS: (' ' | '\n' | '\r' | '\t')+ -> skip;
//WS: [ \n\t\r]+ -> channel(HIDDEN);
//WS : (' ' | '\t' | '\n' | '\r')+
//     {$channel = HIDDEN;}
//   ;
//WHITESPACE:( '\t' | ' ' | '\r' | '\n'| '\u000C' ) + { $channel=HIDDEN;};
COMMENT: '/*' * '*/' -> skip;
fragment DIGIT: [0-9];
fragment ALPHA: [a-zA-Z_];

WS: [ \t\r]+ -> skip;
//WS: (' '|'\n'|'\r'|'\t')+ -> skip;
