grammar Cmm;

@header{
     import main.ast.nodes.*;
     import main.ast.nodes.declaration.*;
     import main.ast.nodes.declaration.struct.*;
     import main.ast.nodes.expression.*;
     import main.ast.nodes.expression.operators.*;
     import main.ast.nodes.expression.values.*;
     import main.ast.nodes.expression.values.primitive.*;
     import main.ast.nodes.statement.*;
     import main.ast.types.*;
     import main.ast.types.primitives.*;
     import java.util.*;
 }

cmm returns[Program cmmProgram]:
    NEWLINE* p = program {$cmmProgram = $p.programRet;} NEWLINE* EOF;

program returns[Program programRet]:
    {$programRet = new Program();
     int line = 1;
     $programRet.setLine(line);}
    (s = structDeclaration {$programRet.addStruct($s.structDeclarationRet);})*
    (f = functionDeclaration {$programRet.addFunction($f.functionDeclarationRet);})*
    m = main {$programRet.setMain($m.mainRet);};

//todo
main returns[MainDeclaration mainRet]:
    {$mainRet = new MainDeclaration();}
    m = MAIN {$mainRet.setLine($m.getLine());} LPAR RPAR b = body {$mainRet.setBody($b.bodyRet};


//todo
structDeclaration returns[StructDeclaration structDeclarationRet]:
    {$structDeclarationRet = new structDeclaration();}
    s = STRUCT {$structDeclarationRet.setline($s.getline());}
    i = identifier {$structDeclarationRet.setStructName($i.identifierRet);}
     ((BEGIN b1 = structBody NEWLINE+ END {$structDeclarationRet.setBody($b1.strcutBodyRet);}) |
      (NEWLINE+ b2 = singleStatementStructBody SEMICOLON? {$structDeclarationRet.setBody($b2.strcutBodyRet);})) NEWLINE+;

//todo
singleVarWithGetAndSet :
    type identifier functionArgsDec BEGIN NEWLINE+ setBody getBody END;

//todo
singleStatementStructBody :
    varDecStatement | singleVarWithGetAndSet;

//todo
structBody returns[Statement strcutBodyRet] :
    (NEWLINE+ (singleStatementStructBody SEMICOLON)* singleStatementStructBody SEMICOLON?)+;

//todo
getBody :
    GET body NEWLINE+;

//todo
setBody :
    SET body NEWLINE+;

//todo
functionDeclaration returns[FunctionDeclaration functionDeclarationRet]:
{functionDeclarationRet = new FunctionDeclaration();}
    (t = type {functionDeclarationRet.setReturnType($t.typeRet);} | VOID ) 
    i = identifier {functionDeclarationRet.setFunctionName($i.identifierRet); functionDeclarationRet.setLine($i.getLine());}
    a = functionArgsDec {functionDeclarationRet.setArgs($a.functionArgsDecRet);} 
    b = body {$functionDeclarationRet.setBody($b.bodyRet);} NEWLINE+;

//todo
functionArgsDec returns[ArrayList<VariableDeclaration> functionArgsDecRet]:
    {functionArgsDecRet = new ArrayList<>();}
    LPAR (t = type i = identifier
     {VariableDeclaration v = new VariableDeclaration($i.identifierRet, $t.typeRet);  functionArgsDecRet.addArg(v);}
      (COMMA t = type i = identifier {VariableDeclaration v = new VariableDeclaration($i.identifierRet, $t.typeRet);  functionArgsDecRet.addArg(v);})*)? RPAR ;

//todo
functionArguments returns[ArrayList<Expression> functionArgumentsRet] :
    {functionArgumentsRet = new ArrayList<>();}
    (ex = expression {functionArgumentsRet.addArg($ex.expressionRet);}
    (COMMA ex = expression {functionArgumentsRet.addArg($ex.expressionRet);})*)?;

//todo
body returns[Statement bodyRet]:
    {bodyRet = new BlockStmt();}
     (b = blockStatement {bodyRet.addStatement($b.blockStatementRet);} |
      (NEWLINE+ b1 = singleStatement {bodyRet.addStatement($b1.blockStatementRet);} (SEMICOLON)?));

//todo
loopCondBody :
     (blockStatement | (NEWLINE+ singleStatement ));

//todo
blockStatement returns[Statement blockStatementRet]:
    {blockStatementRet = new BlockStmt();}
    bg = BEGIN {blockStatementRet.setLine($bg.getLine());}
     (NEWLINE+ (ss = singleStatement {blockStatementRet.addStatement($ss.singleStatementRet);} SEMICOLON)* 
     ss = singleStatement {blockStatementRet.addStatement($ss.singleStatementRet);} (SEMICOLON)?)+ NEWLINE+ END;

//todo
varDecStatement :
    type identifier (ASSIGN orExpression )? (COMMA identifier (ASSIGN orExpression)? )*;

//todo
functionCallStmt :
     otherExpression ((LPAR functionArguments RPAR) | (DOT identifier))* (LPAR functionArguments RPAR);

//todo
returnStatement :
    RETURN (expression)?;

//todo
ifStatement returns[Statement ifStatementRet]:
    {ifStatementRet = new ConditionalStmt();}
    IF e = expression {ifStatementRet.setCondition(e.);} (loopCondBody | body elseStatement);

//todo
elseStatement :
     NEWLINE* ELSE loopCondBody;

//todo
loopStatement :
    whileLoopStatement | doWhileLoopStatement;

//todo
whileLoopStatement :
    WHILE expression loopCondBody;

//todo
doWhileLoopStatement :
    DO body NEWLINE* WHILE expression;

//todo
displayStatement :
  DISPLAY LPAR expression RPAR;

//todo
assignmentStatement :
    orExpression ASSIGN expression;

//todo
singleStatement returns[Statement singleStatementRet]:
    ifStatement | displayStatement | functionCallStmt | returnStatement | assignmentStatement
    | varDecStatement | loopStatement | append | size;

//todo
expression returns[Expression expressionRet]:
oe = orExpression
{$expressionRet = $oe.orExpressionRet;}
(op = ASSIGN e = expression 
{
    BinaryOperator bo = BinaryOperator.assign;
    $expressionRet = new BinaryExpression($oe.orExpressionRet, $e.expressionRet, bo);
    $expressionRet.setLine($op.getLine());
})? ;

//todo
orExpression returns[Expression orExpressionRet]:
ael=andExpression
{ $orExpressionRet = $ael.andExpressionRet;}
(op=OR aer=andExpression
{
    BinaryOperator bo = BinaryOperator.or;
    $orExpressionRet = new BinaryExpression($ael.andExpressionRet, $aer.andExpressionRet, bo);
    $orExpressionRet.setLine($op.getLine());
})*;


//todo
andExpression returns[Expression andExpressionRet]:
eql = equalityExpression
{$andExpressionRet = eql.equalityExpressionRet;}
(op = AND eqr = equalityExpression 
{   
    BinaryOperator bo = BinaryOperator.and;
    $andExpressionRet = new BinaryExpression(eql.equalityExpressionRet, $eqr.equalityExpressionRet, bo);
    $andExpressionRet.setLine($op.getLine());
})*;

//todo
equalityExpression returns[Expression equalityExpressionRet]:
rel = relationalExpression
{$equalityExpressionRet = rel.relationalExpressionRet;}
(op = EQUAL rer = relationalExpression 
{
    BinaryOperator bo = BinaryOperator.equal;
    $equalityExpressionRet = new BinaryExpression(rel.relationalExpressionRet, $eqr.relationalExpressionRet, bo);
    $equalityExpressionRet.setLine($op.getLine());
})*;

//todo
relationalExpression returns[Expression relationalExpressionRet]:
ael = additiveExpression
{$relationalExpressionRet = $ael.additiveExpressionRet;}
((op = GREATER_THAN {BinaryOperator bo = BinaryOperator.gt;} | op = LESS_THAN {BinaryOperator bo = BinaryOperator.lt;})
aer = additiveExpression 
{
    $relationalExpressionRet = new BinaryExpression(ael.additiveExpressionRet, $aer.additiveExpressionRet, bo);
    $relationalExpressionRet.setLine($op.getLine());
})*;


//todo
additiveExpression returns[Expression additiveExpressionRet]:
mpl = multiplicativeExpression
{$additiveExpressionRet = $mpl.multiplicativeExpressionRet;}
((op = PLUS {BinaryOperator bo = BinaryOperator.add;} | op = MINUS {BinaryOperator bo = BinaryOperator.sub;}) 
mpr = multiplicativeExpression 
{
    $additiveExpressionRet = new BinaryExpression(mpl.multiplicativeExpressionRet, $mpr.multiplicativeExpressionRet, bo);
    $additiveExpressionRet.setLine($op.getLine());
})*;



//todo
multiplicativeExpression returns[Expression multiplicativeExpressionRet]:
pul = preUnaryExpression
{$multiplicativeExpressionRet = $pul.preUnaryExpressionRet;}
((op = MULT {BinaryOperator bo = BinaryOperator.mult;} | op = DIVIDE {BinaryOperator bo = BinaryOperator.div;})
pur = preUnaryExpression
{
    $multiplicativeExpressionRet = new BinaryExpression(pul.preUnaryExpressionRet, $pur.preUnaryExpressionRet, bo);
    $multiplicativeExpressionRet.setLine($op.getLine());
})*;

//todo
preUnaryExpression returns[Expression preUnaryExpressionRet]:
    ((op = NOT {BinaryOperator bo = BinaryOperator.not;} | op = MINUS {BinaryOperator bo = BinaryOperator.minus;})
    pue = preUnaryExpression 
    {
        preUnaryExpressionRet = new UnaryExpression($pue.preUnaryExpression, bo);
        preUnaryExpressionRet.setLine($op.getLine());
    }) |
    ae = accessExpression
    {
        preUnaryExpressionRet = new UnaryExpression($ae.accessExpressionRet, bo);
        preUnaryExpressionRet.setLine($op.getLine());
    };


//todo
accessExpression returns[Expression accessExpressionRet]:
    oe = otherExpression
    {accessExpressionRet = $oe.otherExpressionRet;}
    ((lp = LPAR functionArguments
    {
        accessExpressionRet = new FunctionCall(accessExpressionRet, $fa.functionArgumentsRet);
        accessExpressionRet.setLine($lp.getLine());
    }RPAR) | (d = DOT id = identifier {
        accessExpressionRet = new StructAccess(accessExpressionRet, $id.identifierRet);
        accessExpressionRet.setLine($d.getLine());
    }))*  ((lb = LBRACK ex = expression{
        accessExpressionRet = new ListAccessByIndex(accessExpressionRet, $ex.expressionRet);
        accessExpressionRet.setLine($lb.getLine());
    }RBRACK) | (d = DOT id = identifier {
        accessExpressionRet = new StructAccess(accessExpressionRet, $id.identifierRet);
        accessExpressionRet.setLine($d.getLine());
    }))*;

//todo
otherExpression returns[Expression otherExpressionRet]:
    vl = value {otherExpressionRet = $vl.ValueRet;} |
    id = identifier {otherExpressionRet = $id.identifierRet;} |
    lp = LPAR (fa = functionArguments) {otherExpressionRet = $fa.functionArgumentsRet;}
    RPAR | sz = size {therExpressionRet = $sz.sizeRet;} |
    ap = append {otherExpressionRet = $ap.appendRet;};

//todo
size returns [Expression sizeRet] :
    sz = SIZE LPAR ex = expression {
        sizeRet = new ListSize($ex.expressionRet);
        sizeRet.setLine($sz.getLine());
    } RPAR;

//todo
append returns [Expression appendRet]:
    ap = APPEND LPAR ex1 = expression COMMA ex2 = expression {
        appendRet = new ListAppend($ex1.expressionRet, $ex2.expressionRet);
        appendRet.setLine($ap.getLine());
    } RPAR;

//todo
value returns[Value valueRet]:
    bv = boolValue {valueRet = $bv.boolValueRet;} |
    INT_VALUE {valueRet = new IntValue(integer.valueOf(INT_VALUE.text()));};

//todo
boolValue returns [BoolValue boolValueRet]:
    TRUE {boolValueRet = new BoolValue(true);} |
    FALSE {boolValueRet = new BoolValue(false);};

//todo
identifier returns[Identifier identifierRet]:
    i = IDENTIFIER {identifierRet = new Identifier($i.text); identifierRet.setLine($i.getLine());};
    
//todo
type returns[Type typeRet]:
    INT | BOOL | LIST SHARP type | STRUCT identifier | fptrType;

//todo
fptrType:
    FPTR LESS_THAN (VOID | (type (COMMA type)*)) ARROW (type | VOID) GREATER_THAN;

MAIN: 'main';
RETURN: 'return';
VOID: 'void';

SIZE: 'size';
DISPLAY: 'display';
APPEND: 'append';

IF: 'if';
ELSE: 'else';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIVIDE: '/';


EQUAL: '==';
ARROW: '->';
GREATER_THAN: '>';
LESS_THAN: '<';


AND: '&';
OR: '|';
NOT: '~';

TRUE: 'true';
FALSE: 'false';

BEGIN: 'begin';
END: 'end';

INT: 'int';
BOOL: 'bool';
LIST: 'list';
STRUCT: 'struct';
FPTR: 'fptr';
GET: 'get';
SET: 'set';
WHILE: 'while';
DO: 'do';

ASSIGN: '=';
SHARP: '#';
LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';

COMMA: ',';
DOT: '.';
SEMICOLON: ';';
NEWLINE: '\n';

INT_VALUE: '0' | [1-9][0-9]*;
IDENTIFIER: [a-zA-Z_][A-Za-z0-9_]*;


COMMENT: ('/*' .*? '*/') -> skip;
WS: ([ \t\r]) -> skip;