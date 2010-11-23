lexer grammar InternalApplauseDsl;
@header {
package org.applause.applausedsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'returns' ;
T12 : 'XML' ;
T13 : 'JSON' ;
T14 : 'Default' ;
T15 : 'DefaultWithDisclosure' ;
T16 : 'Value2' ;
T17 : 'Double' ;
T18 : 'Subtitle' ;
T19 : '.' ;
T20 : '(' ;
T21 : ')' ;
T22 : 'replace(' ;
T23 : ',' ;
T24 : 'urlconform(' ;
T25 : '[' ;
T26 : ']' ;
T27 : 'split(' ;
T28 : 'application' ;
T29 : '{' ;
T30 : 'background:' ;
T31 : '}' ;
T32 : 'view:' ;
T33 : 'type' ;
T34 : 'mapsTo' ;
T35 : 'entity' ;
T36 : 'extends' ;
T37 : 'contentprovider' ;
T38 : 'fetches' ;
T39 : 'from' ;
T40 : 'selects' ;
T41 : 'class' ;
T42 : 'tabview' ;
T43 : 'tab' ;
T44 : 'title:' ;
T45 : 'icon:' ;
T46 : 'tableview' ;
T47 : 'detailsview' ;
T48 : 'customview' ;
T49 : 'header' ;
T50 : 'subtitle:' ;
T51 : 'details:' ;
T52 : 'image:' ;
T53 : 'section' ;
T54 : 'cell' ;
T55 : 'foreach' ;
T56 : 'text:' ;
T57 : 'action:' ;
T58 : 'as' ;
T59 : '[]' ;
T60 : 'derived' ;
T61 : 'stores' ;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9095
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9097
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9099
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9101
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9103
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9105
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9107
RULE_ANY_OTHER : .;


