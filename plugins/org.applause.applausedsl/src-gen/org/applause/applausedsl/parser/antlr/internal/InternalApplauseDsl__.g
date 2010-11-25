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
T23 : 'background:' ;
T24 : 'view:' ;
T25 : '}' ;
T26 : 'type' ;
T27 : 'mapsTo' ;
T28 : 'entity' ;
T29 : 'class' ;
T30 : 'extends' ;
T31 : 'derived' ;
T32 : 'contentprovider' ;
T33 : 'returns' ;
T34 : 'stores' ;
T35 : 'fetches' ;
T36 : 'from' ;
T37 : 'selects' ;
T38 : 'tabview' ;
T39 : 'tab' ;
T40 : 'title:' ;
T41 : 'icon:' ;
T42 : 'tableview' ;
T43 : 'style:' ;
T44 : 'detailsview' ;
T45 : 'customview' ;
T46 : 'header' ;
T47 : 'subtitle:' ;
T48 : 'details:' ;
T49 : 'image:' ;
T50 : 'section' ;
T51 : 'cell' ;
T52 : 'foreach' ;
T53 : 'text:' ;
T54 : 'action:' ;
T55 : 'accessory:' ;
T56 : 'as' ;
T57 : 'XML' ;
T58 : 'JSON' ;
T59 : 'Plain' ;
T60 : 'Grouped' ;
T61 : 'Default' ;
T62 : 'Value1' ;
T63 : 'Value2' ;
T64 : 'Subtitle' ;
T65 : 'None' ;
T66 : 'Link' ;
T67 : 'Detail' ;
T68 : 'Check' ;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3848
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3850
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3852
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3854
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3856
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3858
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3860
RULE_ANY_OTHER : .;


