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
T14 : 'Plain' ;
T15 : 'Grouped' ;
T16 : 'Default' ;
T17 : 'DefaultWithDisclosure' ;
T18 : 'Value2' ;
T19 : 'Double' ;
T20 : 'Subtitle' ;
T21 : '.' ;
T22 : '(' ;
T23 : ')' ;
T24 : 'replace(' ;
T25 : ',' ;
T26 : 'urlconform(' ;
T27 : '[' ;
T28 : ']' ;
T29 : 'split(' ;
T30 : 'application' ;
T31 : '{' ;
T32 : 'background:' ;
T33 : '}' ;
T34 : 'view:' ;
T35 : 'type' ;
T36 : 'mapsTo' ;
T37 : 'entity' ;
T38 : 'extends' ;
T39 : 'contentprovider' ;
T40 : 'fetches' ;
T41 : 'from' ;
T42 : 'selects' ;
T43 : 'class' ;
T44 : 'tabview' ;
T45 : 'tab' ;
T46 : 'title:' ;
T47 : 'icon:' ;
T48 : 'tableview' ;
T49 : 'style:' ;
T50 : 'detailsview' ;
T51 : 'customview' ;
T52 : 'header' ;
T53 : 'subtitle:' ;
T54 : 'details:' ;
T55 : 'image:' ;
T56 : 'section' ;
T57 : 'cell' ;
T58 : 'foreach' ;
T59 : 'text:' ;
T60 : 'action:' ;
T61 : 'as' ;
T62 : '[]' ;
T63 : 'derived' ;
T64 : 'stores' ;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9342
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9344
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9346
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9348
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9350
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9352
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9354
RULE_ANY_OTHER : .;


