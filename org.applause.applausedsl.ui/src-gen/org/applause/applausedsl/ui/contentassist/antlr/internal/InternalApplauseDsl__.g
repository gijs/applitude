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
T25 : 'tabbarApplication' ;
T26 : '{' ;
T27 : '}' ;
T28 : 'button' ;
T29 : 'title=' ;
T30 : 'icon=' ;
T31 : 'view=' ;
T32 : 'type' ;
T33 : 'mapsTo' ;
T34 : 'entity' ;
T35 : 'extends' ;
T36 : 'contentprovider' ;
T37 : 'returns' ;
T38 : 'fetches' ;
T39 : 'XML' ;
T40 : 'from' ;
T41 : 'selects' ;
T42 : 'tableview' ;
T43 : 'detailsview' ;
T44 : 'customview' ;
T45 : 'implementedBy' ;
T46 : 'header' ;
T47 : 'subtitle=' ;
T48 : 'details=' ;
T49 : 'image=' ;
T50 : 'section' ;
T51 : 'cell' ;
T52 : 'foreach' ;
T53 : 'text=' ;
T54 : 'action=' ;
T55 : 'as' ;
T56 : '[]' ;
T57 : 'derived' ;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 7875
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 7877
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 7879
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 7881
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 7883
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 7885
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 7887
RULE_ANY_OTHER : .;


