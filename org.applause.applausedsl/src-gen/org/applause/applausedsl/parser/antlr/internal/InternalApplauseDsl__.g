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
T21 : 'tabbarApplication' ;
T22 : '{' ;
T23 : '}' ;
T24 : 'button' ;
T25 : 'title=' ;
T26 : 'icon=' ;
T27 : 'view=' ;
T28 : 'type' ;
T29 : 'mapsTo' ;
T30 : 'entity' ;
T31 : 'extends' ;
T32 : 'derived' ;
T33 : 'contentprovider' ;
T34 : 'returns' ;
T35 : 'fetches' ;
T36 : 'XML' ;
T37 : 'from' ;
T38 : 'selects' ;
T39 : 'tableview' ;
T40 : 'detailsview' ;
T41 : 'customview' ;
T42 : 'implementedBy' ;
T43 : 'header' ;
T44 : 'subtitle=' ;
T45 : 'details=' ;
T46 : 'image=' ;
T47 : 'section' ;
T48 : 'cell' ;
T49 : 'foreach' ;
T50 : 'text=' ;
T51 : 'action=' ;
T52 : 'as' ;
T53 : 'Default' ;
T54 : 'DefaultWithDisclosure' ;
T55 : 'Value2' ;
T56 : 'Double' ;
T57 : 'Subtitle' ;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3138
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3140
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3142
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3144
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3146
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3148
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3150
RULE_ANY_OTHER : .;


