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
T44 : 'titleImage:' ;
T45 : 'style:' ;
T46 : 'customview' ;
T47 : 'section' ;
T48 : 'cell' ;
T49 : 'text:' ;
T50 : 'details:' ;
T51 : 'image:' ;
T52 : 'action:' ;
T53 : 'accessory:' ;
T54 : 'for' ;
T55 : 'in' ;
T56 : ':' ;
T57 : '@selector' ;
T58 : 'XML' ;
T59 : 'JSON' ;
T60 : 'Plain' ;
T61 : 'Grouped' ;
T62 : 'Default' ;
T63 : 'Value1' ;
T64 : 'Value2' ;
T65 : 'Subtitle' ;
T66 : 'None' ;
T67 : 'Link' ;
T68 : 'Detail' ;
T69 : 'Check' ;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3820
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3822
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3824
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3826
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3828
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3830
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.applausedsl/src-gen/org/applause/applausedsl/parser/antlr/internal/InternalApplauseDsl.g" 3832
RULE_ANY_OTHER : .;


