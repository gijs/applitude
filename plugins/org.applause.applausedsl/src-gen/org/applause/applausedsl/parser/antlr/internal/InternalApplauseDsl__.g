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
T26 : 'title:' ;
T27 : 'icon:' ;
T28 : 'view:' ;
T29 : 'type' ;
T30 : 'mapsTo' ;
T31 : 'entity' ;
T32 : 'extends' ;
T33 : 'derived' ;
T34 : 'contentprovider' ;
T35 : 'returns' ;
T36 : 'fetches' ;
T37 : 'XML' ;
T38 : 'from' ;
T39 : 'selects' ;
T40 : 'tableview' ;
T41 : 'detailsview' ;
T42 : 'customview' ;
T43 : 'class' ;
T44 : 'header' ;
T45 : 'subtitle:' ;
T46 : 'details:' ;
T47 : 'image:' ;
T48 : 'section' ;
T49 : 'cell' ;
T50 : 'foreach' ;
T51 : 'text:' ;
T52 : 'action:' ;
T53 : 'as' ;
T54 : 'Default' ;
T55 : 'DefaultWithDisclosure' ;
T56 : 'Value2' ;
T57 : 'Double' ;
T58 : 'Subtitle' ;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3187
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3189
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3191
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3193
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3195
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3197
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3199
RULE_ANY_OTHER : .;


