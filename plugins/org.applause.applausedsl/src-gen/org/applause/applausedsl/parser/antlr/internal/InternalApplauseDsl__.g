lexer grammar InternalApplauseDsl;
@header {
package org.applause.applausedsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : '[]' ;
T12 : '.' ;
T13 : '(' ;
T14 : ')' ;
T15 : 'replace(' ;
T16 : ',' ;
T17 : 'urlconform(' ;
T18 : '[' ;
T19 : ']' ;
T20 : 'split(' ;
T21 : 'application' ;
T22 : '{' ;
T23 : 'background=' ;
T24 : '}' ;
T25 : 'tab' ;
T26 : 'title' ;
T27 : ':' ;
T28 : 'icon' ;
T29 : 'view' ;
T30 : 'type' ;
T31 : 'mapsTo' ;
T32 : 'entity' ;
T33 : 'extends' ;
T34 : 'derived' ;
T35 : 'contentprovider' ;
T36 : 'returns' ;
T37 : 'fetches' ;
T38 : 'XML' ;
T39 : 'from' ;
T40 : 'selects' ;
T41 : 'tableview' ;
T42 : 'detailsview' ;
T43 : 'customview' ;
T44 : 'implementedBy' ;
T45 : 'header' ;
T46 : 'subtitle' ;
T47 : 'details' ;
T48 : 'image' ;
T49 : 'section' ;
T50 : 'cell' ;
T51 : 'foreach' ;
T52 : 'text' ;
T53 : 'action' ;
T54 : 'as' ;
T55 : 'Default' ;
T56 : 'DefaultWithDisclosure' ;
T57 : 'Value2' ;
T58 : 'Double' ;
T59 : 'Subtitle' ;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3243
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3245
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3247
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3249
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3251
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3253
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3255
RULE_ANY_OTHER : .;


