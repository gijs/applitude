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
T17 : 'Value1' ;
T18 : 'Value2' ;
T19 : 'Subtitle' ;
T20 : 'None' ;
T21 : 'Link' ;
T22 : 'Detail' ;
T23 : 'Check' ;
T24 : '.' ;
T25 : '(' ;
T26 : ')' ;
T27 : 'replace(' ;
T28 : ',' ;
T29 : 'urlconform(' ;
T30 : '[' ;
T31 : ']' ;
T32 : 'split(' ;
T33 : 'application' ;
T34 : '{' ;
T35 : 'background:' ;
T36 : '}' ;
T37 : 'view:' ;
T38 : 'type' ;
T39 : 'mapsTo' ;
T40 : 'entity' ;
T41 : 'extends' ;
T42 : 'contentprovider' ;
T43 : 'fetches' ;
T44 : 'from' ;
T45 : 'selects' ;
T46 : 'class' ;
T47 : 'tabview' ;
T48 : 'tab' ;
T49 : 'title:' ;
T50 : 'icon:' ;
T51 : 'tableview' ;
T52 : 'style:' ;
T53 : 'detailsview' ;
T54 : 'customview' ;
T55 : 'header' ;
T56 : 'subtitle:' ;
T57 : 'details:' ;
T58 : 'image:' ;
T59 : 'section' ;
T60 : 'cell' ;
T61 : 'foreach' ;
T62 : 'text:' ;
T63 : 'action:' ;
T64 : 'accessory:' ;
T65 : 'as' ;
T66 : '[]' ;
T67 : 'derived' ;
T68 : 'stores' ;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9569
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9571
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9573
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9575
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9577
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9579
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9581
RULE_ANY_OTHER : .;


