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
T43 : 'detailsview' ;
T44 : 'customview' ;
T45 : 'header' ;
T46 : 'subtitle:' ;
T47 : 'details:' ;
T48 : 'image:' ;
T49 : 'section' ;
T50 : 'cell' ;
T51 : 'foreach' ;
T52 : 'text:' ;
T53 : 'action:' ;
T54 : 'as' ;
T55 : 'XML' ;
T56 : 'JSON' ;
T57 : 'Default' ;
T58 : 'DefaultWithDisclosure' ;
T59 : 'Value2' ;
T60 : 'Double' ;
T61 : 'Subtitle' ;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3628
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3630
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3632
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3634
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3636
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3638
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3640
RULE_ANY_OTHER : .;


