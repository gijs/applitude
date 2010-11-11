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
T27 : 'background:' ;
T28 : '}' ;
T29 : 'view:' ;
T30 : 'type' ;
T31 : 'mapsTo' ;
T32 : 'entity' ;
T33 : 'extends' ;
T34 : 'contentprovider' ;
T35 : 'returns' ;
T36 : 'fetches' ;
T37 : 'XML' ;
T38 : 'from' ;
T39 : 'selects' ;
T40 : 'tabview' ;
T41 : 'tab' ;
T42 : 'title:' ;
T43 : 'icon:' ;
T44 : 'tableview' ;
T45 : 'detailsview' ;
T46 : 'customview' ;
T47 : 'class' ;
T48 : 'header' ;
T49 : 'subtitle:' ;
T50 : 'details:' ;
T51 : 'image:' ;
T52 : 'section' ;
T53 : 'cell' ;
T54 : 'foreach' ;
T55 : 'text:' ;
T56 : 'action:' ;
T57 : 'as' ;
T58 : '[]' ;
T59 : 'derived' ;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8668
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8670
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8672
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8674
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8676
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8678
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 8680
RULE_ANY_OTHER : .;


