lexer grammar InternalApplauseDsl;
@header {
package org.applause.applausedsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'Default' ;
T12 : 'DefaultWithDisclosure' ;
T13 : 'Value2' ;
T14 : 'Double' ;
T15 : 'Subtitle' ;
T16 : '.' ;
T17 : '(' ;
T18 : ')' ;
T19 : 'replace(' ;
T20 : ',' ;
T21 : 'urlconform(' ;
T22 : '[' ;
T23 : ']' ;
T24 : 'split(' ;
T25 : 'application' ;
T26 : '{' ;
T27 : '}' ;
T28 : 'background=' ;
T29 : 'button' ;
T30 : 'title=' ;
T31 : 'icon=' ;
T32 : 'view=' ;
T33 : 'type' ;
T34 : 'mapsTo' ;
T35 : 'entity' ;
T36 : 'extends' ;
T37 : 'contentprovider' ;
T38 : 'returns' ;
T39 : 'fetches' ;
T40 : 'XML' ;
T41 : 'from' ;
T42 : 'selects' ;
T43 : 'tableview' ;
T44 : 'detailsview' ;
T45 : 'customview' ;
T46 : 'implementedBy' ;
T47 : 'header' ;
T48 : 'subtitle=' ;
T49 : 'details=' ;
T50 : 'image=' ;
T51 : 'section' ;
T52 : 'cell' ;
T53 : 'foreach' ;
T54 : 'text=' ;
T55 : 'action=' ;
T56 : 'as' ;
T57 : '[]' ;
T58 : 'derived' ;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 7956
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 7958
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 7960
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 7962
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 7964
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 7966
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 7968
RULE_ANY_OTHER : .;


