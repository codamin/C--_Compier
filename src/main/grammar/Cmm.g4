grammar Cmm;

r  : ID MINUS ID ;         // match keyword hello followed by an identifier
ID : [1-9]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

// Operators
PLUS: '+';
MINUS: '-';
MULT: '*';
DIVIDE: '/';