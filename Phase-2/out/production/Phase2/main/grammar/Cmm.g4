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
     ((BEGIN b1 = structBody {$structDeclarationRet.setBody($b1.structBodyRet);} NEWLINE+ END) |
      (NEWLINE+ b2 = singleStatementStructBody {$structDeclarationRet.setBody($b2.singleStatementStructBodyRet);} SEMICOLON?)) NEWLINE+;

//todo
singleVarWithGetAndSet returns[SetGetVarDeclaration singleVarWithGetAndSetRet]:
    {$singleVarWithGetAndSetRet = new SetGetVarDeclaration();}
    t = type
    {$singleVarWithGetAndSetRet.setVarType($t.typeRet);}
    id = identifier
    {$singleVarWithGetAndSetRet.setVarName($id.identifierRet);
    $singleVarWithGetAndSetRet.setLine($id.line);}
    fa = functionArgsDec
    {$singleVarWithGetAndSetRet.setArgs($fa.functionArgsDecRet);}
    BEGIN NEWLINE+
    sb = setBody
    {$singleVarWithGetAndSetRet.setSetterBody($sb.setBodyRet);}
    gb = getBody
    {$singleVarWithGetAndSetRet.setGetterBody($gb.getBodyRet);}
    END;

//todo
singleStatementStructBody returns[Statement singleStatementStructBodyRet]:
    {$singleStatementStructBodyRet = new BlockStmt();}
    (vd = varDecStatement {
        $singleStatementStructBodyRet = $vd.varDecStatementRet;
    } | sv = singleVarWithGetAndSet {
        $singleStatementStructBodyRet = $sv.singleVarWithGetAndSetRet;
    });

//todo
structBody returns[BlockStmt structBodyRet] :
    {$structBodyRet = new BlockStmt();}
    (NEWLINE+ (s1 = singleStatementStructBody {
        $structBodyRet.addStatement($s1.singleStatementStructBodyRet);
//        $structBodyRet.setLine($s1.singleStatementStructBodyRet.getLine());
    } SEMICOLON)* s2 = singleStatementStructBody {
        $structBodyRet.addStatement($s2.singleStatementStructBodyRet);
//        $structBodyRet.setLine($s2.singleStatementStructBodyRet.getLine());
    } SEMICOLON?)+;

//todo
getBody returns[Statement getBodyRet] :
    GET bd = body {$getBodyRet = $bd.bodyRet;} NEWLINE+;

//todo
setBody returns[Statement setBodyRet] :
    SET bd = body {$setBodyRet = $bd.bodyRet;} NEWLINE+;

//todo
functionDeclaration returns[FunctionDeclaration functionDeclarationRet]:
{$functionDeclarationRet = new FunctionDeclaration();}
    (t = type {$functionDeclarationRet.setReturnType($t.typeRet);} | VOID {$functionDeclarationRet.setReturnType(new VoidType());})
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
     {
     VariableDeclaration v1 = new VariableDeclaration($i.identifierRet, $t.typeRet);
     }
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
body returns[Statement bodyRet]:
//    {$bodyRet = new BlockStmt();}
     (b = blockStatement {$bodyRet = $b.blockStatementRet;} |
     (NEWLINE+ b1 = singleStatement {$bodyRet = $b1.singleStatementRet;} (SEMICOLON)?));

//todo
loopCondBody returns[Statement loopCondBodyRet]:
     (bs = blockStatement {
        $loopCondBodyRet = $bs.blockStatementRet;
     } | (NEWLINE+ ss = singleStatement {
        $loopCondBodyRet = $ss.singleStatementRet;
     } ));

//todo
blockStatement returns[BlockStmt blockStatementRet]:
    {$blockStatementRet = new BlockStmt();}
    bg = BEGIN {
    $blockStatementRet.setLine($bg.getLine());
    }
     (NEWLINE+ (ss = singleStatement {
     $blockStatementRet.addStatement($ss.singleStatementRet);
     } SEMICOLON)*
     ss = singleStatement {
     $blockStatementRet.addStatement($ss.singleStatementRet);
     } (SEMICOLON)?)+ NEWLINE+ END;

//todo
varDecStatement returns[VarDecStmt varDecStatementRet] :
    {
    $varDecStatementRet = new VarDecStmt();
    ArrayList<VariableDeclaration> vars = new ArrayList<>();
    }
    tp = type
        id = identifier (ASSIGN oe = orExpression {
        VariableDeclaration vd = new VariableDeclaration($id.identifierRet, $tp.typeRet);
        vd.setDefaultValue($oe.orExpressionRet);
        vars.add(vd);
        $varDecStatementRet.setLine($id.line);
    })? (COMMA id = identifier (ASSIGN oe = orExpression {
        VariableDeclaration vd = new VariableDeclaration($id.identifierRet, $tp.typeRet);
        vd.setDefaultValue($oe.orExpressionRet);
        vars.add(vd);
        $varDecStatementRet.setLine($id.line);
    })? )*
    {$varDecStatementRet.setVars(vars);}
    ;

//todo
functionCallStmt returns[FunctionCallStmt functionCallStmtRet] locals[FunctionCall functionCall]:
     oe = otherExpression {
        $functionCall = new FunctionCall($oe.otherExpressionRet);
     } ((lp = LPAR fa = functionArguments {
        $functionCall.setArgs($fa.functionArgumentsRet.getInputs());
        $functionCall.setLine($lp.getLine());
     } RPAR) | {
        Expression sa = $oe.otherExpressionRet;
     } (DOT id = identifier {
        StructAccess tmp = new StructAccess(sa, $id.identifierRet);
        sa = tmp;
     }))* (lp = LPAR fa = functionArguments {
        $functionCall.setArgs($fa.functionArgumentsRet.getInputs());
        $functionCall.setLine($lp.getLine());
     } RPAR)
     {$functionCallStmtRet = new FunctionCallStmt($functionCall);};

//todo
returnStatement returns[ReturnStmt returnStatementRet] :
    {$returnStatementRet = new ReturnStmt();}
    ret = RETURN {$returnStatementRet.setLine($ret.getLine());}
    (ex = expression
    {$returnStatementRet.setReturnedExpr($ex.expressionRet);})?;

//todo
ifStatement returns[ConditionalStmt ifStatementRet]:
    iftemp = IF e = expression {$ifStatementRet = new ConditionalStmt($e.expressionRet);
     {$ifStatementRet.setLine($iftemp.getLine());}}
    (lc = loopCondBody {
        $ifStatementRet.setThenBody($lc.loopCondBodyRet);
    } | bd = body es = elseStatement {
        $ifStatementRet.setThenBody($bd.bodyRet);
        $ifStatementRet.setElseBody($es.elseStatementRet);
    });


//todo
elseStatement returns[Statement elseStatementRet] :
     NEWLINE* ELSE lc = loopCondBody {$elseStatementRet = $lc.loopCondBodyRet;};

//todo
loopStatement returns[LoopStmt loopStatementRet] :
    wl = whileLoopStatement {$loopStatementRet = $wl.whileLoopStatementRet;} |
    dwl = doWhileLoopStatement {$loopStatementRet = $dwl.doWhileLoopStatementRet;};

//todo
whileLoopStatement returns[LoopStmt whileLoopStatementRet] :
    {$whileLoopStatementRet = new LoopStmt();}
    w = WHILE ex = expression lc = loopCondBody
    {
        $whileLoopStatementRet.setCondition($ex.expressionRet);
        $whileLoopStatementRet.setBody($lc.loopCondBodyRet);
        $whileLoopStatementRet.setLine($w.getLine());
    };

//todo
doWhileLoopStatement returns[LoopStmt doWhileLoopStatementRet] :
    {$doWhileLoopStatementRet = new LoopStmt();}
    d = DO bd = body NEWLINE* WHILE ex = expression
    {
        $doWhileLoopStatementRet.setCondition($ex.expressionRet);
        $doWhileLoopStatementRet.setBody($bd.bodyRet);
        $doWhileLoopStatementRet.setLine($d.getLine());
    };

//todo
displayStatement returns[DisplayStmt displayStatementRet] :
  dis = DISPLAY LPAR ex = expression
    {
    $displayStatementRet = new DisplayStmt($ex.expressionRet);
    $displayStatementRet.setLine($dis.getLine());
    }
  RPAR;

//todo
assignmentStatement returns[AssignmentStmt assignmentStatementRet]:
    lv = orExpression as = ASSIGN rv = expression {
        $assignmentStatementRet = new AssignmentStmt($lv.orExpressionRet, $rv.expressionRet);
        $assignmentStatementRet.setLine($as.getLine());
    };

//todo
singleStatement returns[Statement singleStatementRet]:
    is = ifStatement {$singleStatementRet = $is.ifStatementRet;} |
    ds = displayStatement {$singleStatementRet = $ds.displayStatementRet;} |
    fc = functionCallStmt {$singleStatementRet = $fc.functionCallStmtRet;} |
    rs = returnStatement {$singleStatementRet = $rs.returnStatementRet;} |
    as = assignmentStatement {$singleStatementRet = $as.assignmentStatementRet;} |
    vd = varDecStatement {$singleStatementRet = $vd.varDecStatementRet;} |
    ls = loopStatement {$singleStatementRet = $ls.loopStatementRet;} |
    ap = append {$singleStatementRet = new ListAppendStmt($ap.appendRet);} |
    sz = size {$singleStatementRet = new ListSizeStmt($sz.sizeRet);};

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
        System.out.println("one");
        System.out.println($bo == null);
        $preUnaryExpressionRet = new UnaryExpression($pue.preUnaryExpressionRet, $bo);
        $preUnaryExpressionRet.setLine($line);
    }) |
    ae = accessExpression
    {
        $preUnaryExpressionRet = $ae.accessExpressionRet;
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
size returns [ListSize sizeRet] :
    sz = SIZE LPAR ex = expression {
        $sizeRet = new ListSize($ex.expressionRet);
        $sizeRet.setLine($sz.getLine());
    } RPAR;

//todo
append returns [ListAppend appendRet]:
    ap = APPEND LPAR ex1 = expression COMMA ex2 = expression {
        $appendRet = new ListAppend($ex1.expressionRet, $ex2.expressionRet);
        $appendRet.setLine($ap.getLine());
    } RPAR;

//todo
value returns[Value valueRet]:
    bv = boolValue {$valueRet = $bv.boolValueRet;} |
    i = INT_VALUE {$valueRet = new IntValue($i.int);};

//todo
boolValue returns [BoolValue boolValueRet]:
    tr = TRUE {$boolValueRet = new BoolValue(true); $boolValueRet.setLine($tr.getLine());} |
    fa = FALSE {$boolValueRet = new BoolValue(false); $boolValueRet.setLine($fa.getLine());};

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