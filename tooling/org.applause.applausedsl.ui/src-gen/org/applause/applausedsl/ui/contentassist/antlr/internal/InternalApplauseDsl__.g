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
T24 : '=' ;
T25 : '.' ;
T26 : '(' ;
T27 : ')' ;
T28 : 'replace(' ;
T29 : ',' ;
T30 : 'urlconform(' ;
T31 : '[' ;
T32 : ']' ;
T33 : 'split(' ;
T34 : 'application' ;
T35 : '{' ;
T36 : 'background:' ;
T37 : '}' ;
T38 : 'view:' ;
T39 : 'type' ;
T40 : 'mapsTo' ;
T41 : 'entity' ;
T42 : 'extends' ;
T43 : 'contentprovider' ;
T44 : 'fetches' ;
T45 : 'from' ;
T46 : 'selects' ;
T47 : 'class' ;
T48 : 'tabview' ;
T49 : 'tab' ;
T50 : 'title:' ;
T51 : 'icon:' ;
T52 : 'tableview' ;
T53 : 'style:' ;
T54 : 'customview' ;
T55 : 'section' ;
T56 : 'cell' ;
T57 : 'foreach' ;
T58 : 'text:' ;
T59 : 'details:' ;
T60 : 'image:' ;
T61 : 'action:' ;
T62 : 'accessory:' ;
T63 : 'as' ;
T64 : ':' ;
T65 : '@selector' ;
T66 : '[]' ;
T67 : 'derived' ;
T68 : 'stores' ;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9046
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9048
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9050
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9052
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9054
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9056
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g" 9058
RULE_ANY_OTHER : .;


