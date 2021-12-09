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
    m = MAIN {$mainRet.setLine($m.getLine());} LPAR RPAR b = body {$mainRet.setBody($b.bodyRet);};


//todo
structDeclaration returns[StructDeclaration structDeclarationRet]:
    {$structDeclarationRet = new StructDeclaration();}
    s = STRUCT {$structDeclarationRet.setLine($s.getLine());}
    i = identifier {$structDeclarationRet.setStructName($i.identifierRet);}
     ((BEGIN b1 = structBody NEWLINE+ END {$structDeclarationRet.setBody($b1.strcutBodyRet);}) |
      (NEWLINE+ b2 = singleStatementStructBody SEMICOLON? {$structDeclarationRet.setBody($b2.singleStatementStructBodyRet);})) NEWLINE+;

//todo
singleVarWithGetAndSet :
    type identifier functionArgsDec BEGIN NEWLINE+ setBody getBody END;

//todo
singleStatementStructBody returns[BlockStmt singleStatementStructBodyRet] :
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
{$functionDeclarationRet = new FunctionDeclaration();}
    (t = type {$functionDeclarationRet.setReturnType($t.typeRet);} | VOID )
    id = identifier {
        $functionDeclarationRet.setFunctionName($id.identifierRet);
        $functionDeclarationRet.setLine($id.line);
    }
    a = functionArgsDec {$functionDeclarationRet.setArgs($a.functionArgsDecRet);}
    b = body {$functionDeclarationRet.setBody($b.bodyRet);} NEWLINE+;

//todo
functionArgsDec returns[ArrayList<VariableDeclaration> functionArgsDecRet]:
    {$functionArgsDecRet = new ArrayList<>();}
    LPAR (t = type i = identifier
     {VariableDeclaration v1 = new VariableDeclaration($i.identifierRet, $t.typeRet);  $functionArgsDecRet.add(v1);}
      (COMMA t = type i = identifier {VariableDeclaration v2 = new VariableDeclaration($i.identifierRet, $t.typeRet);
        $functionArgsDecRet.add(v2);})*)? RPAR ;

//todo
functionArguments returns[ExprInPar functionArgumentsRet] :
    {
        ArrayList<Expression> inputs = new ArrayList<>();
        $functionArgumentsRet = new ExprInPar(inputs);
    }
    (ex = expression {inputs.add($ex.expressionRet);}
    (COMMA ex = expression {inputs.add($ex.expressionRet);})*)? {$functionArgumentsRet.setInputs(inputs);};

//todo
body returns[BlockStmt bodyRet]:
    {$bodyRet = new BlockStmt();}
     (b = blockStatement {$bodyRet.addStatement($b.blockStatementRet);} |
     (NEWLINE+ b1 = singleStatement {$bodyRet.addStatement($b1.singleStatementRet);} (SEMICOLON)?));

//todo
loopCondBody :
     (blockStatement | (NEWLINE+ singleStatement ));

//todo
blockStatement returns[BlockStmt blockStatementRet]:
    {$blockStatementRet = new BlockStmt();}
    bg = BEGIN {$blockStatementRet.setLine($bg.getLine());}
     (NEWLINE+ (ss = singleStatement {$blockStatementRet.addStatement($ss.singleStatementRet);} SEMICOLON)*
     ss = singleStatement {$blockStatementRet.addStatement($ss.singleStatementRet);} (SEMICOLON)?)+ NEWLINE+ END;

//todo
varDecStatement returns [VarDecStmt varDecStatementRet] :
    type identifier (ASSIGN orExpression )? (COMMA identifier (ASSIGN orExpression)? )*;

//todo
functionCallStmt :
     otherExpression ((LPAR functionArguments RPAR) | (DOT identifier))* (LPAR functionArguments RPAR);

//todo
returnStatement :
    RETURN (expression)?;

//todo
ifStatement returns[ConditionalStmt ifStatementRet]:
    IF e = expression {$ifStatementRet = new ConditionalStmt($e.expressionRet);} (loopCondBody | body elseStatement);


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
{$andExpressionRet = $eql.equalityExpressionRet;}
(op = AND eqr = equalityExpression 
{   
    BinaryOperator bo = BinaryOperator.and;
    $andExpressionRet = new BinaryExpression($eql.equalityExpressionRet, $eqr.equalityExpressionRet, bo);
    $andExpressionRet.setLine($op.getLine());
})*;

//todo
equalityExpression returns[Expression equalityExpressionRet]:
rel = relationalExpression
{$equalityExpressionRet = $rel.relationalExpressionRet;}
(op = EQUAL rer = relationalExpression 
{
    BinaryOperator bo = BinaryOperator.eq;
    $equalityExpressionRet = new BinaryExpression($rel.relationalExpressionRet, $rer.relationalExpressionRet, bo);
    $equalityExpressionRet.setLine($op.getLine());
})*;

//todo
relationalExpression returns[Expression relationalExpressionRet] locals[BinaryOperator bo]:
ael = additiveExpression
{$relationalExpressionRet = $ael.additiveExpressionRet;}
((op = GREATER_THAN {$bo = BinaryOperator.gt;} | op = LESS_THAN {$bo = BinaryOperator.lt;})
aer = additiveExpression 
{
    $relationalExpressionRet = new BinaryExpression($ael.additiveExpressionRet, $aer.additiveExpressionRet, $bo);
    $relationalExpressionRet.setLine($op.getLine());
})*;


//todo
additiveExpression returns[Expression additiveExpressionRet] locals[BinaryOperator bo]:
mpl = multiplicativeExpression
{$additiveExpressionRet = $mpl.multiplicativeExpressionRet;}
((op = PLUS {$bo = BinaryOperator.add;} | op = MINUS {$bo = BinaryOperator.sub;}) 
mpr = multiplicativeExpression 
{
    $additiveExpressionRet = new BinaryExpression($mpl.multiplicativeExpressionRet, $mpr.multiplicativeExpressionRet, $bo);
    $additiveExpressionRet.setLine($op.getLine());
})*;



//todo
multiplicativeExpression returns[Expression multiplicativeExpressionRet] locals[BinaryOperator bo]:
pul = preUnaryExpression
{$multiplicativeExpressionRet = $pul.preUnaryExpressionRet;}
((op = MULT {$bo = BinaryOperator.mult;} | op = DIVIDE {$bo = BinaryOperator.div;})
pur = preUnaryExpression
{
    $multiplicativeExpressionRet = new BinaryExpression($pul.preUnaryExpressionRet, $pur.preUnaryExpressionRet, $bo);
    $multiplicativeExpressionRet.setLine($op.getLine());
})*;

//todo
preUnaryExpression returns[Expression preUnaryExpressionRet] locals[int line, UnaryOperator bo]:
    ((op = NOT {$bo = UnaryOperator.not; $line = $op.getLine();} |
    op = MINUS {$bo = UnaryOperator.minus; $line = $op.getLine();})
    pue = preUnaryExpression 
    {
        $preUnaryExpressionRet = new UnaryExpression($pue.preUnaryExpressionRet, $bo);
        $preUnaryExpressionRet.setLine($line);
    }) |
    ae = accessExpression
    {
        $preUnaryExpressionRet = new UnaryExpression($ae.accessExpressionRet, $bo);
        $preUnaryExpressionRet.setLine($line);
    };


//todo
accessExpression returns[Expression accessExpressionRet]:
    oe = otherExpression
    {$accessExpressionRet = $oe.otherExpressionRet;}
    ((lp = LPAR fa = functionArguments
    {
        $accessExpressionRet = new FunctionCall($accessExpressionRet, $fa.functionArgumentsRet.getInputs());
        $accessExpressionRet.setLine($lp.getLine());
    }RPAR) | (d = DOT id = identifier {
        $accessExpressionRet = new StructAccess($accessExpressionRet, $id.identifierRet);
        $accessExpressionRet.setLine($d.getLine());
    }))*  ((lb = LBRACK ex = expression{
        $accessExpressionRet = new ListAccessByIndex($accessExpressionRet, $ex.expressionRet);
        $accessExpressionRet.setLine($lb.getLine());
    }RBRACK) | (d = DOT id = identifier {
        $accessExpressionRet = new StructAccess($accessExpressionRet, $id.identifierRet);
        $accessExpressionRet.setLine($d.getLine());
    }))*;

//todo
otherExpression returns[Expression otherExpressionRet]:
    vl = value {$otherExpressionRet = $vl.valueRet;} |
    id = identifier {$otherExpressionRet = $id.identifierRet;} |
    lp = LPAR (fa = functionArguments) {$otherExpressionRet = $fa.functionArgumentsRet;}
    RPAR | sz = size {$otherExpressionRet = $sz.sizeRet;} |
    ap = append {$otherExpressionRet = $ap.appendRet;};

//todo
size returns [Expression sizeRet] :
    sz = SIZE LPAR ex = expression {
        $sizeRet = new ListSize($ex.expressionRet);
        $sizeRet.setLine($sz.getLine());
    } RPAR;

//todo
append returns [Expression appendRet]:
    ap = APPEND LPAR ex1 = expression COMMA ex2 = expression {
        $appendRet = new ListAppend($ex1.expressionRet, $ex2.expressionRet);
        $appendRet.setLine($ap.getLine());
    } RPAR;

//todo
value returns[Value valueRet]:
    bv = boolValue {$valueRet = $bv.boolValueRet;} |
    INT_VALUE {$valueRet = new IntValue(Integer.valueOf(INT_VALUE));};

//todo
boolValue returns [BoolValue boolValueRet]:
    TRUE {$boolValueRet = new BoolValue(true);} |
    FALSE {$boolValueRet = new BoolValue(false);};

//todo
identifier returns[Identifier identifierRet, int line]:
    i = IDENTIFIER {
    $identifierRet = new Identifier($i.text);
    $identifierRet.setLine($i.getLine());
    $line = $i.getLine();
    };

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