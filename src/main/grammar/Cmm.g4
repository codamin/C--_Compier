grammar Cmm;

cmmParser:
    NEWLINE*
    structDeclaration* NEWLINE*
    methodDeclaration* NEWLINE*
    mainDeclaration NEWLINE*
    EOF
;

structDeclaration:
    STRUCT StructName = IDENTIFIER {System.out.println("StructDec : " + $StructName.text);}
    ((BEGIN NEWLINE+ structBody NEWLINE+ END NEWLINE+) | (NEWLINE* structBody NEWLINE*))
    ;

structBody:
    (((variableDeclaration | structVariableDeclarationGetSet) (';' variableDeclaration | structVariableDeclarationGetSet)* ';'?) | NEWLINE)*
    ;


structVariableDeclarationGetSet:
    variableType (VariableName = IDENTIFIER {System.out.println("VarDec : " + $VariableName.text);}) LPAR arguments? RPAR BEGIN NEWLINE+
    SET {System.out.println("Setter");} functionBody NEWLINE*
    GET {System.out.println("Getter");} functionBody
    NEWLINE+ END NEWLINE*
    ;

methodDeclaration:
    (variableType | VOID) FunctionName = IDENTIFIER {System.out.println("FunctionDec : " + $FunctionName.text);} LPAR arguments? RPAR
        functionBody
   ;

arguments:
   (variableType (ArgumentName = IDENTIFIER {System.out.println("ArgumentDec : " + $ArgumentName.text);}))
   (',' variableType (ArgumentName = IDENTIFIER {System.out.println("ArgumentDec : " + $ArgumentName.text);}))*
   ;

mainDeclaration:
    MAIN {System.out.println("Main");} LPAR RPAR BEGIN NEWLINE+
        multiFunctionBody
    NEWLINE+ END NEWLINE*
    ;

functionBody:
   ((BEGIN NEWLINE+ multiFunctionBody NEWLINE+ END NEWLINE*) | singleFunctionBody)
   ;

multiFunctionBody:
    (
    (assignment | expresionFunctionCall | variableDeclaration | returnStmt | ifBlock | doWhileBlock | whileBlock)
    (SEMICOLLON (assignment | expresionFunctionCall | variableDeclaration | returnStmt | ifBlock | doWhileBlock | whileBlock))* SEMICOLLON? | NEWLINE)*
    ;

returnStmt:
    RETURN {System.out.println("Return");} expression?
    ;

singleFunctionBody:
NEWLINE*
((assignment | expresionFunctionCall | variableDeclaration | returnStmt  | ifBlock | whileBlock | doWhileBlock)
 (SEMICOLLON (assignment | expresionFunctionCall | variableDeclaration | returnStmt | ifBlock | whileBlock | doWhileBlock))* SEMICOLLON?) NEWLINE*
    ;

variableDeclaration:
   (variableType ((VariableName = IDENTIFIER {System.out.println("VarDec : " + $VariableName.text);}) (ASSIGN expression)?)
   (',' ((VariableName = IDENTIFIER {System.out.println("VarDec : " + $VariableName.text);}) (ASSIGN expression)?))*) SEMICOLLON?
    ;

ifBlock:
    IF {System.out.println("Conditional : if");} expression
       functionBody
    elseBlock?
    ;

elseBlock:
    ELSE {System.out.println("Conditional : else");}
      functionBody
    ;

whileBlock:
    WHILE {System.out.println("Loop : while");} expression
       functionBody
    ;

doWhileBlock:
    DO {System.out.println("Loop : do...while");}
    functionBody
    WHILE expression
    ;

assignment:
    nestedIdentifier ASSIGN expression
    ;

expresionFunctionCall:
        (nestedIdentifier call {System.out.println("FunctionCall");}) | expression
        ;

expression:
    (((Operator = NEG) | (Operator = PLUS) | (Operator = MINUS))? LPAR expression RPAR {if($Operator.text != null) System.out.println("Operator : " + $Operator.text);}) |
     expressionOperandAfterAndOr (((Operator = AND) | (Operator = OR)) expressionOperandAfterAndOr {System.out.println("Operator : " + $Operator.text);})*
     ;

expressionOperandAfterAndOr:
    (((Operator = NEG) | (Operator = PLUS) | (Operator = MINUS))? LPAR expression RPAR {if($Operator.text != null) System.out.println("Operator : " + $Operator.text);}) |
     expressionOperandAfterPlusMinus (((Operator = PLUS) | (Operator = MINUS)) expressionOperandAfterPlusMinus {System.out.println("Operator : " + $Operator.text);})*
    ;

expressionOperandAfterPlusMinus:
    (((Operator = NEG) | (Operator = PLUS) | (Operator = MINUS))? LPAR expression RPAR {if($Operator.text != null) System.out.println("Operator : " + $Operator.text);}) |
     expressionOperandAfterMultDiv (((Operator = MULT) | (Operator = DIVIDE)) expressionOperandAfterMultDiv {System.out.println("Operator : " + $Operator.text);})*
     ;

expressionOperandAfterMultDiv:
    (((Operator = NEG) | (Operator = PLUS) | (Operator = MINUS))? LPAR expression RPAR {if($Operator.text != null) System.out.println("Operator : " + $Operator.text);}) |
     expressionOperand (((Operator = EQ) | (Operator = LT) | (Operator = GT)) expressionOperand {System.out.println("Operator : " + $Operator.text);})*
    ;

//expressionOperandAfterAndOr:
//    (((Operator = NEG) | (Operator = PLUS) | (Operator = MINUS))? LPAR expression RPAR {if($Operator.text != null) System.out.println("Operator : " + $Operator.text);}) |
//     expressionOperand (((Operator = AND) | (Operator = OR)) expressionOperand {System.out.println("Operator : " + $Operator.text);})*
//    ;

expressionOperand:
  (((Operator = NEG) | (Operator = PLUS) | (Operator = MINUS))? LPAR expression RPAR {if($Operator.text != null) System.out.println("Operator : " + $Operator.text);}) |
  (((LPAR expression RPAR) | functionCall | nestedIdentifier) index) |
  functionCall | NUM | TRUE | FALSE | nestedIdentifier |
  (((Operator = NEG) | (Operator = PLUS) | (Operator = MINUS)) expressionOperand {if($Operator.text != null) System.out.println("Operator : " + $Operator.text);})
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
    (DISPLAY {System.out.println("Built-in : display");} LPAR expression RPAR) |
    (SIZE {System.out.println("Size");} LPAR expression RPAR) |
    (APPEND {System.out.println("Append");} LPAR nestedIdentifier COMMA expression RPAR)
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
SEMICOLLON: ';';
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
WS: [ \t\r]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;
fragment DIGIT: [0-9];
fragment ALPHA: [a-zA-Z_];

//WS: (' '|'\n'|'\r'|'\t')+ -> skip;
