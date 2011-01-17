lexer grammar InternalApplauseDsl;
@header {
package org.applause.applausedsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : '[]' ;
T12 : '=' ;
T13 : '.' ;
T14 : '(' ;
T15 : ')' ;
T16 : 'replace(' ;
T17 : ',' ;
T18 : 'urlconform(' ;
T19 : '[' ;
T20 : ']' ;
T21 : 'split(' ;
T22 : 'application' ;
T23 : '{' ;
T24 : 'background:' ;
T25 : 'view:' ;
T26 : '}' ;
T27 : 'type' ;
T28 : 'mapsTo' ;
T29 : 'entity' ;
T30 : 'class' ;
T31 : 'extends' ;
T32 : 'derived' ;
T33 : 'contentprovider' ;
T34 : 'returns' ;
T35 : 'stores' ;
T36 : 'fetches' ;
T37 : 'from' ;
T38 : 'selects' ;
T39 : 'tabview' ;
T40 : 'tab' ;
T41 : 'title:' ;
T42 : 'icon:' ;
T43 : 'tableview' ;
T44 : 'style:' ;
T45 : 'customview' ;
T46 : 'section' ;
T47 : 'cell' ;
T48 : 'foreach' ;
T49 : 'text:' ;
T50 : 'details:' ;
T51 : 'image:' ;
T52 : 'action:' ;
T53 : 'accessory:' ;
T54 : 'as' ;
T55 : ':' ;
T56 : '@selector' ;
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

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3722
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3724
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3726
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3728
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3730
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3732
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3734
RULE_ANY_OTHER : .;


