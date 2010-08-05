package org.applause.applausedsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.applause.applausedsl.services.ApplauseDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalApplauseDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Default'", "'DefaultWithDisclosure'", "'Value2'", "'Double'", "'Subtitle'", "'.'", "'('", "')'", "'replace('", "','", "'urlconform('", "'['", "']'", "'split('", "'application'", "'{'", "'}'", "'background='", "'button'", "'title='", "'icon='", "'view='", "'type'", "'mapsTo'", "'entity'", "'extends'", "'contentprovider'", "'returns'", "'fetches'", "'XML'", "'from'", "'selects'", "'tableview'", "'detailsview'", "'customview'", "'implementedBy'", "'header'", "'subtitle='", "'details='", "'image='", "'section'", "'cell'", "'foreach'", "'text='", "'action='", "'as'", "'[]'", "'derived'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalApplauseDslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g"; }


     
     	private ApplauseDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ApplauseDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleModel
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:62:1: ( ruleModel EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:63:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();
            _fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:76:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:77:1: ( rule__Model__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:77:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleModelElement
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:89:1: entryRuleModelElement : ruleModelElement EOF ;
    public final void entryRuleModelElement() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:90:1: ( ruleModelElement EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:91:1: ruleModelElement EOF
            {
             before(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_ruleModelElement_in_entryRuleModelElement121);
            ruleModelElement();
            _fsp--;

             after(grammarAccess.getModelElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElement128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleModelElement


    // $ANTLR start ruleModelElement
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:98:1: ruleModelElement : ( ( rule__ModelElement__Alternatives ) ) ;
    public final void ruleModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:102:2: ( ( ( rule__ModelElement__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:103:1: ( ( rule__ModelElement__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:103:1: ( ( rule__ModelElement__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:104:1: ( rule__ModelElement__Alternatives )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:105:1: ( rule__ModelElement__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:105:2: rule__ModelElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ModelElement__Alternatives_in_ruleModelElement154);
            rule__ModelElement__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getModelElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModelElement


    // $ANTLR start entryRuleTypeDescription
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:119:1: entryRuleTypeDescription : ruleTypeDescription EOF ;
    public final void entryRuleTypeDescription() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:120:1: ( ruleTypeDescription EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:121:1: ruleTypeDescription EOF
            {
             before(grammarAccess.getTypeDescriptionRule()); 
            pushFollow(FOLLOW_ruleTypeDescription_in_entryRuleTypeDescription183);
            ruleTypeDescription();
            _fsp--;

             after(grammarAccess.getTypeDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDescription190); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTypeDescription


    // $ANTLR start ruleTypeDescription
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:128:1: ruleTypeDescription : ( ( rule__TypeDescription__Group__0 ) ) ;
    public final void ruleTypeDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:132:2: ( ( ( rule__TypeDescription__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:133:1: ( ( rule__TypeDescription__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:133:1: ( ( rule__TypeDescription__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:134:1: ( rule__TypeDescription__Group__0 )
            {
             before(grammarAccess.getTypeDescriptionAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:135:1: ( rule__TypeDescription__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:135:2: rule__TypeDescription__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDescription__Group__0_in_ruleTypeDescription216);
            rule__TypeDescription__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTypeDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTypeDescription


    // $ANTLR start entryRuleParameter
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:147:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:148:1: ( ruleParameter EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:149:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter243);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter250); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleParameter


    // $ANTLR start ruleParameter
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:156:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:160:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:161:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:161:1: ( ( rule__Parameter__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:162:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:163:1: ( rule__Parameter__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:163:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter276);
            rule__Parameter__Group__0();
            _fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleObjectReference
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:175:1: entryRuleObjectReference : ruleObjectReference EOF ;
    public final void entryRuleObjectReference() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:176:1: ( ruleObjectReference EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:177:1: ruleObjectReference EOF
            {
             before(grammarAccess.getObjectReferenceRule()); 
            pushFollow(FOLLOW_ruleObjectReference_in_entryRuleObjectReference303);
            ruleObjectReference();
            _fsp--;

             after(grammarAccess.getObjectReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectReference310); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleObjectReference


    // $ANTLR start ruleObjectReference
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:184:1: ruleObjectReference : ( ( rule__ObjectReference__Group__0 ) ) ;
    public final void ruleObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:188:2: ( ( ( rule__ObjectReference__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:189:1: ( ( rule__ObjectReference__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:189:1: ( ( rule__ObjectReference__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:190:1: ( rule__ObjectReference__Group__0 )
            {
             before(grammarAccess.getObjectReferenceAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:191:1: ( rule__ObjectReference__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:191:2: rule__ObjectReference__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectReference__Group__0_in_ruleObjectReference336);
            rule__ObjectReference__Group__0();
            _fsp--;


            }

             after(grammarAccess.getObjectReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleObjectReference


    // $ANTLR start entryRuleNestedObjectReference
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:203:1: entryRuleNestedObjectReference : ruleNestedObjectReference EOF ;
    public final void entryRuleNestedObjectReference() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:204:1: ( ruleNestedObjectReference EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:205:1: ruleNestedObjectReference EOF
            {
             before(grammarAccess.getNestedObjectReferenceRule()); 
            pushFollow(FOLLOW_ruleNestedObjectReference_in_entryRuleNestedObjectReference363);
            ruleNestedObjectReference();
            _fsp--;

             after(grammarAccess.getNestedObjectReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedObjectReference370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleNestedObjectReference


    // $ANTLR start ruleNestedObjectReference
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:212:1: ruleNestedObjectReference : ( ( rule__NestedObjectReference__Group__0 ) ) ;
    public final void ruleNestedObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:216:2: ( ( ( rule__NestedObjectReference__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:217:1: ( ( rule__NestedObjectReference__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:217:1: ( ( rule__NestedObjectReference__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:218:1: ( rule__NestedObjectReference__Group__0 )
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:219:1: ( rule__NestedObjectReference__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:219:2: rule__NestedObjectReference__Group__0
            {
            pushFollow(FOLLOW_rule__NestedObjectReference__Group__0_in_ruleNestedObjectReference396);
            rule__NestedObjectReference__Group__0();
            _fsp--;


            }

             after(grammarAccess.getNestedObjectReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNestedObjectReference


    // $ANTLR start entryRuleExpression
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:231:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:232:1: ( ruleExpression EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:233:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression423);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:240:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:244:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:245:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:245:1: ( ( rule__Expression__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:246:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:247:1: ( rule__Expression__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:247:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression456);
            rule__Expression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleScalarExpression
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:259:1: entryRuleScalarExpression : ruleScalarExpression EOF ;
    public final void entryRuleScalarExpression() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:260:1: ( ruleScalarExpression EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:261:1: ruleScalarExpression EOF
            {
             before(grammarAccess.getScalarExpressionRule()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_entryRuleScalarExpression483);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getScalarExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarExpression490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleScalarExpression


    // $ANTLR start ruleScalarExpression
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:268:1: ruleScalarExpression : ( ( rule__ScalarExpression__Alternatives ) ) ;
    public final void ruleScalarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:272:2: ( ( ( rule__ScalarExpression__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:273:1: ( ( rule__ScalarExpression__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:273:1: ( ( rule__ScalarExpression__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:274:1: ( rule__ScalarExpression__Alternatives )
            {
             before(grammarAccess.getScalarExpressionAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:275:1: ( rule__ScalarExpression__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:275:2: rule__ScalarExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ScalarExpression__Alternatives_in_ruleScalarExpression516);
            rule__ScalarExpression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getScalarExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleScalarExpression


    // $ANTLR start entryRuleCollectionExpression
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:287:1: entryRuleCollectionExpression : ruleCollectionExpression EOF ;
    public final void entryRuleCollectionExpression() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:288:1: ( ruleCollectionExpression EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:289:1: ruleCollectionExpression EOF
            {
             before(grammarAccess.getCollectionExpressionRule()); 
            pushFollow(FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression543);
            ruleCollectionExpression();
            _fsp--;

             after(grammarAccess.getCollectionExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionExpression550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCollectionExpression


    // $ANTLR start ruleCollectionExpression
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:296:1: ruleCollectionExpression : ( ( rule__CollectionExpression__Alternatives ) ) ;
    public final void ruleCollectionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:300:2: ( ( ( rule__CollectionExpression__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:301:1: ( ( rule__CollectionExpression__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:301:1: ( ( rule__CollectionExpression__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:302:1: ( rule__CollectionExpression__Alternatives )
            {
             before(grammarAccess.getCollectionExpressionAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:303:1: ( rule__CollectionExpression__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:303:2: rule__CollectionExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__CollectionExpression__Alternatives_in_ruleCollectionExpression576);
            rule__CollectionExpression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getCollectionExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCollectionExpression


    // $ANTLR start entryRuleStringLiteral
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:315:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:316:1: ( ruleStringLiteral EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:317:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral603);
            ruleStringLiteral();
            _fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleStringLiteral


    // $ANTLR start ruleStringLiteral
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:324:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:328:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:329:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:329:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:330:1: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:331:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:331:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral636);
            rule__StringLiteral__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStringLiteral


    // $ANTLR start entryRuleStringFunction
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:343:1: entryRuleStringFunction : ruleStringFunction EOF ;
    public final void entryRuleStringFunction() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:344:1: ( ruleStringFunction EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:345:1: ruleStringFunction EOF
            {
             before(grammarAccess.getStringFunctionRule()); 
            pushFollow(FOLLOW_ruleStringFunction_in_entryRuleStringFunction663);
            ruleStringFunction();
            _fsp--;

             after(grammarAccess.getStringFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunction670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleStringFunction


    // $ANTLR start ruleStringFunction
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:352:1: ruleStringFunction : ( ( rule__StringFunction__Alternatives ) ) ;
    public final void ruleStringFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:356:2: ( ( ( rule__StringFunction__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:357:1: ( ( rule__StringFunction__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:357:1: ( ( rule__StringFunction__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:358:1: ( rule__StringFunction__Alternatives )
            {
             before(grammarAccess.getStringFunctionAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:359:1: ( rule__StringFunction__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:359:2: rule__StringFunction__Alternatives
            {
            pushFollow(FOLLOW_rule__StringFunction__Alternatives_in_ruleStringFunction696);
            rule__StringFunction__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getStringFunctionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStringFunction


    // $ANTLR start entryRuleCollectionLiteral
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:371:1: entryRuleCollectionLiteral : ruleCollectionLiteral EOF ;
    public final void entryRuleCollectionLiteral() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:372:1: ( ruleCollectionLiteral EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:373:1: ruleCollectionLiteral EOF
            {
             before(grammarAccess.getCollectionLiteralRule()); 
            pushFollow(FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral723);
            ruleCollectionLiteral();
            _fsp--;

             after(grammarAccess.getCollectionLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionLiteral730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCollectionLiteral


    // $ANTLR start ruleCollectionLiteral
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:380:1: ruleCollectionLiteral : ( ( rule__CollectionLiteral__Group__0 ) ) ;
    public final void ruleCollectionLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:384:2: ( ( ( rule__CollectionLiteral__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:385:1: ( ( rule__CollectionLiteral__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:385:1: ( ( rule__CollectionLiteral__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:386:1: ( rule__CollectionLiteral__Group__0 )
            {
             before(grammarAccess.getCollectionLiteralAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:387:1: ( rule__CollectionLiteral__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:387:2: rule__CollectionLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group__0_in_ruleCollectionLiteral756);
            rule__CollectionLiteral__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCollectionLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCollectionLiteral


    // $ANTLR start entryRuleCollectionFunction
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:399:1: entryRuleCollectionFunction : ruleCollectionFunction EOF ;
    public final void entryRuleCollectionFunction() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:400:1: ( ruleCollectionFunction EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:401:1: ruleCollectionFunction EOF
            {
             before(grammarAccess.getCollectionFunctionRule()); 
            pushFollow(FOLLOW_ruleCollectionFunction_in_entryRuleCollectionFunction783);
            ruleCollectionFunction();
            _fsp--;

             after(grammarAccess.getCollectionFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionFunction790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCollectionFunction


    // $ANTLR start ruleCollectionFunction
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:408:1: ruleCollectionFunction : ( ( rule__CollectionFunction__Group__0 ) ) ;
    public final void ruleCollectionFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:412:2: ( ( ( rule__CollectionFunction__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:413:1: ( ( rule__CollectionFunction__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:413:1: ( ( rule__CollectionFunction__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:414:1: ( rule__CollectionFunction__Group__0 )
            {
             before(grammarAccess.getCollectionFunctionAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:415:1: ( rule__CollectionFunction__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:415:2: rule__CollectionFunction__Group__0
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__0_in_ruleCollectionFunction816);
            rule__CollectionFunction__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCollectionFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCollectionFunction


    // $ANTLR start entryRuleApplication
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:427:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:428:1: ( ruleApplication EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:429:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication843);
            ruleApplication();
            _fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleApplication


    // $ANTLR start ruleApplication
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:436:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:440:2: ( ( ( rule__Application__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:441:1: ( ( rule__Application__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:441:1: ( ( rule__Application__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:442:1: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:443:1: ( rule__Application__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:443:2: rule__Application__Group__0
            {
            pushFollow(FOLLOW_rule__Application__Group__0_in_ruleApplication876);
            rule__Application__Group__0();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleApplication


    // $ANTLR start entryRuleTabbarButton
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:455:1: entryRuleTabbarButton : ruleTabbarButton EOF ;
    public final void entryRuleTabbarButton() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:456:1: ( ruleTabbarButton EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:457:1: ruleTabbarButton EOF
            {
             before(grammarAccess.getTabbarButtonRule()); 
            pushFollow(FOLLOW_ruleTabbarButton_in_entryRuleTabbarButton903);
            ruleTabbarButton();
            _fsp--;

             after(grammarAccess.getTabbarButtonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabbarButton910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTabbarButton


    // $ANTLR start ruleTabbarButton
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:464:1: ruleTabbarButton : ( ( rule__TabbarButton__Group__0 ) ) ;
    public final void ruleTabbarButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:468:2: ( ( ( rule__TabbarButton__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:469:1: ( ( rule__TabbarButton__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:469:1: ( ( rule__TabbarButton__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:470:1: ( rule__TabbarButton__Group__0 )
            {
             before(grammarAccess.getTabbarButtonAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:471:1: ( rule__TabbarButton__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:471:2: rule__TabbarButton__Group__0
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__0_in_ruleTabbarButton936);
            rule__TabbarButton__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTabbarButtonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTabbarButton


    // $ANTLR start entryRuleType
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:483:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:484:1: ( ruleType EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:485:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType963);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType970); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:492:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:496:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:497:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:497:1: ( ( rule__Type__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:498:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:499:1: ( rule__Type__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:499:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType996);
            rule__Type__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleSimpleType
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:511:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:512:1: ( ruleSimpleType EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:513:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType1023);
            ruleSimpleType();
            _fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType1030); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSimpleType


    // $ANTLR start ruleSimpleType
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:520:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:524:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:525:1: ( ( rule__SimpleType__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:525:1: ( ( rule__SimpleType__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:526:1: ( rule__SimpleType__Group__0 )
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:527:1: ( rule__SimpleType__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:527:2: rule__SimpleType__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType1056);
            rule__SimpleType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSimpleType


    // $ANTLR start entryRuleEntity
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:539:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:540:1: ( ruleEntity EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:541:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1083);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1090); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:548:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:552:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:553:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:553:1: ( ( rule__Entity__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:554:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:555:1: ( rule__Entity__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:555:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity1116);
            rule__Entity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleProperty
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:567:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:568:1: ( ruleProperty EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:569:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1143);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1150); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:576:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:580:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:581:1: ( ( rule__Property__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:581:1: ( ( rule__Property__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:582:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:583:1: ( rule__Property__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:583:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty1176);
            rule__Property__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProperty


    // $ANTLR start entryRuleContentProvider
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:595:1: entryRuleContentProvider : ruleContentProvider EOF ;
    public final void entryRuleContentProvider() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:596:1: ( ruleContentProvider EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:597:1: ruleContentProvider EOF
            {
             before(grammarAccess.getContentProviderRule()); 
            pushFollow(FOLLOW_ruleContentProvider_in_entryRuleContentProvider1203);
            ruleContentProvider();
            _fsp--;

             after(grammarAccess.getContentProviderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentProvider1210); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleContentProvider


    // $ANTLR start ruleContentProvider
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:604:1: ruleContentProvider : ( ( rule__ContentProvider__Group__0 ) ) ;
    public final void ruleContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:608:2: ( ( ( rule__ContentProvider__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:609:1: ( ( rule__ContentProvider__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:609:1: ( ( rule__ContentProvider__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:610:1: ( rule__ContentProvider__Group__0 )
            {
             before(grammarAccess.getContentProviderAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:611:1: ( rule__ContentProvider__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:611:2: rule__ContentProvider__Group__0
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__0_in_ruleContentProvider1236);
            rule__ContentProvider__Group__0();
            _fsp--;


            }

             after(grammarAccess.getContentProviderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleContentProvider


    // $ANTLR start entryRuleProviderConstruction
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:623:1: entryRuleProviderConstruction : ruleProviderConstruction EOF ;
    public final void entryRuleProviderConstruction() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:624:1: ( ruleProviderConstruction EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:625:1: ruleProviderConstruction EOF
            {
             before(grammarAccess.getProviderConstructionRule()); 
            pushFollow(FOLLOW_ruleProviderConstruction_in_entryRuleProviderConstruction1263);
            ruleProviderConstruction();
            _fsp--;

             after(grammarAccess.getProviderConstructionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProviderConstruction1270); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleProviderConstruction


    // $ANTLR start ruleProviderConstruction
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:632:1: ruleProviderConstruction : ( ( rule__ProviderConstruction__Alternatives ) ) ;
    public final void ruleProviderConstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:636:2: ( ( ( rule__ProviderConstruction__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:637:1: ( ( rule__ProviderConstruction__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:637:1: ( ( rule__ProviderConstruction__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:638:1: ( rule__ProviderConstruction__Alternatives )
            {
             before(grammarAccess.getProviderConstructionAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:639:1: ( rule__ProviderConstruction__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:639:2: rule__ProviderConstruction__Alternatives
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Alternatives_in_ruleProviderConstruction1296);
            rule__ProviderConstruction__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getProviderConstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProviderConstruction


    // $ANTLR start entryRuleView
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:651:1: entryRuleView : ruleView EOF ;
    public final void entryRuleView() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:652:1: ( ruleView EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:653:1: ruleView EOF
            {
             before(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView1323);
            ruleView();
            _fsp--;

             after(grammarAccess.getViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView1330); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleView


    // $ANTLR start ruleView
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:660:1: ruleView : ( ( rule__View__Alternatives ) ) ;
    public final void ruleView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:664:2: ( ( ( rule__View__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:665:1: ( ( rule__View__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:665:1: ( ( rule__View__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:666:1: ( rule__View__Alternatives )
            {
             before(grammarAccess.getViewAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:667:1: ( rule__View__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:667:2: rule__View__Alternatives
            {
            pushFollow(FOLLOW_rule__View__Alternatives_in_ruleView1356);
            rule__View__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getViewAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleView


    // $ANTLR start entryRuleSectionedView
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:679:1: entryRuleSectionedView : ruleSectionedView EOF ;
    public final void entryRuleSectionedView() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:680:1: ( ruleSectionedView EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:681:1: ruleSectionedView EOF
            {
             before(grammarAccess.getSectionedViewRule()); 
            pushFollow(FOLLOW_ruleSectionedView_in_entryRuleSectionedView1383);
            ruleSectionedView();
            _fsp--;

             after(grammarAccess.getSectionedViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionedView1390); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSectionedView


    // $ANTLR start ruleSectionedView
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:688:1: ruleSectionedView : ( ( rule__SectionedView__Alternatives ) ) ;
    public final void ruleSectionedView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:692:2: ( ( ( rule__SectionedView__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:693:1: ( ( rule__SectionedView__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:693:1: ( ( rule__SectionedView__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:694:1: ( rule__SectionedView__Alternatives )
            {
             before(grammarAccess.getSectionedViewAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:695:1: ( rule__SectionedView__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:695:2: rule__SectionedView__Alternatives
            {
            pushFollow(FOLLOW_rule__SectionedView__Alternatives_in_ruleSectionedView1416);
            rule__SectionedView__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getSectionedViewAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSectionedView


    // $ANTLR start entryRuleTableView
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:707:1: entryRuleTableView : ruleTableView EOF ;
    public final void entryRuleTableView() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:708:1: ( ruleTableView EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:709:1: ruleTableView EOF
            {
             before(grammarAccess.getTableViewRule()); 
            pushFollow(FOLLOW_ruleTableView_in_entryRuleTableView1443);
            ruleTableView();
            _fsp--;

             after(grammarAccess.getTableViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableView1450); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTableView


    // $ANTLR start ruleTableView
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:716:1: ruleTableView : ( ( rule__TableView__Group__0 ) ) ;
    public final void ruleTableView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:720:2: ( ( ( rule__TableView__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:721:1: ( ( rule__TableView__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:721:1: ( ( rule__TableView__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:722:1: ( rule__TableView__Group__0 )
            {
             before(grammarAccess.getTableViewAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:723:1: ( rule__TableView__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:723:2: rule__TableView__Group__0
            {
            pushFollow(FOLLOW_rule__TableView__Group__0_in_ruleTableView1476);
            rule__TableView__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTableViewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTableView


    // $ANTLR start entryRuleDetailsView
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:735:1: entryRuleDetailsView : ruleDetailsView EOF ;
    public final void entryRuleDetailsView() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:736:1: ( ruleDetailsView EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:737:1: ruleDetailsView EOF
            {
             before(grammarAccess.getDetailsViewRule()); 
            pushFollow(FOLLOW_ruleDetailsView_in_entryRuleDetailsView1503);
            ruleDetailsView();
            _fsp--;

             after(grammarAccess.getDetailsViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDetailsView1510); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDetailsView


    // $ANTLR start ruleDetailsView
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:744:1: ruleDetailsView : ( ( rule__DetailsView__Group__0 ) ) ;
    public final void ruleDetailsView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:748:2: ( ( ( rule__DetailsView__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:749:1: ( ( rule__DetailsView__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:749:1: ( ( rule__DetailsView__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:750:1: ( rule__DetailsView__Group__0 )
            {
             before(grammarAccess.getDetailsViewAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:751:1: ( rule__DetailsView__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:751:2: rule__DetailsView__Group__0
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__0_in_ruleDetailsView1536);
            rule__DetailsView__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDetailsViewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDetailsView


    // $ANTLR start entryRuleCustomView
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:763:1: entryRuleCustomView : ruleCustomView EOF ;
    public final void entryRuleCustomView() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:764:1: ( ruleCustomView EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:765:1: ruleCustomView EOF
            {
             before(grammarAccess.getCustomViewRule()); 
            pushFollow(FOLLOW_ruleCustomView_in_entryRuleCustomView1563);
            ruleCustomView();
            _fsp--;

             after(grammarAccess.getCustomViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomView1570); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCustomView


    // $ANTLR start ruleCustomView
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:772:1: ruleCustomView : ( ( rule__CustomView__Group__0 ) ) ;
    public final void ruleCustomView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:776:2: ( ( ( rule__CustomView__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:777:1: ( ( rule__CustomView__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:777:1: ( ( rule__CustomView__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:778:1: ( rule__CustomView__Group__0 )
            {
             before(grammarAccess.getCustomViewAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:779:1: ( rule__CustomView__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:779:2: rule__CustomView__Group__0
            {
            pushFollow(FOLLOW_rule__CustomView__Group__0_in_ruleCustomView1596);
            rule__CustomView__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCustomViewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCustomView


    // $ANTLR start entryRuleViewHeader
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:791:1: entryRuleViewHeader : ruleViewHeader EOF ;
    public final void entryRuleViewHeader() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:792:1: ( ruleViewHeader EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:793:1: ruleViewHeader EOF
            {
             before(grammarAccess.getViewHeaderRule()); 
            pushFollow(FOLLOW_ruleViewHeader_in_entryRuleViewHeader1623);
            ruleViewHeader();
            _fsp--;

             after(grammarAccess.getViewHeaderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewHeader1630); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleViewHeader


    // $ANTLR start ruleViewHeader
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:800:1: ruleViewHeader : ( ( rule__ViewHeader__Group__0 ) ) ;
    public final void ruleViewHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:804:2: ( ( ( rule__ViewHeader__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:805:1: ( ( rule__ViewHeader__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:805:1: ( ( rule__ViewHeader__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:806:1: ( rule__ViewHeader__Group__0 )
            {
             before(grammarAccess.getViewHeaderAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:807:1: ( rule__ViewHeader__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:807:2: rule__ViewHeader__Group__0
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__0_in_ruleViewHeader1656);
            rule__ViewHeader__Group__0();
            _fsp--;


            }

             after(grammarAccess.getViewHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleViewHeader


    // $ANTLR start entryRuleViewSection
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:819:1: entryRuleViewSection : ruleViewSection EOF ;
    public final void entryRuleViewSection() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:820:1: ( ruleViewSection EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:821:1: ruleViewSection EOF
            {
             before(grammarAccess.getViewSectionRule()); 
            pushFollow(FOLLOW_ruleViewSection_in_entryRuleViewSection1683);
            ruleViewSection();
            _fsp--;

             after(grammarAccess.getViewSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewSection1690); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleViewSection


    // $ANTLR start ruleViewSection
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:828:1: ruleViewSection : ( ( rule__ViewSection__Group__0 ) ) ;
    public final void ruleViewSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:832:2: ( ( ( rule__ViewSection__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:833:1: ( ( rule__ViewSection__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:833:1: ( ( rule__ViewSection__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:834:1: ( rule__ViewSection__Group__0 )
            {
             before(grammarAccess.getViewSectionAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:835:1: ( rule__ViewSection__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:835:2: rule__ViewSection__Group__0
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__0_in_ruleViewSection1716);
            rule__ViewSection__Group__0();
            _fsp--;


            }

             after(grammarAccess.getViewSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleViewSection


    // $ANTLR start entryRuleSectionCell
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:847:1: entryRuleSectionCell : ruleSectionCell EOF ;
    public final void entryRuleSectionCell() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:848:1: ( ruleSectionCell EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:849:1: ruleSectionCell EOF
            {
             before(grammarAccess.getSectionCellRule()); 
            pushFollow(FOLLOW_ruleSectionCell_in_entryRuleSectionCell1743);
            ruleSectionCell();
            _fsp--;

             after(grammarAccess.getSectionCellRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionCell1750); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSectionCell


    // $ANTLR start ruleSectionCell
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:856:1: ruleSectionCell : ( ( rule__SectionCell__Group__0 ) ) ;
    public final void ruleSectionCell() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:860:2: ( ( ( rule__SectionCell__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:861:1: ( ( rule__SectionCell__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:861:1: ( ( rule__SectionCell__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:862:1: ( rule__SectionCell__Group__0 )
            {
             before(grammarAccess.getSectionCellAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:863:1: ( rule__SectionCell__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:863:2: rule__SectionCell__Group__0
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__0_in_ruleSectionCell1776);
            rule__SectionCell__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSectionCellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSectionCell


    // $ANTLR start entryRuleCollectionIterator
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:875:1: entryRuleCollectionIterator : ruleCollectionIterator EOF ;
    public final void entryRuleCollectionIterator() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:876:1: ( ruleCollectionIterator EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:877:1: ruleCollectionIterator EOF
            {
             before(grammarAccess.getCollectionIteratorRule()); 
            pushFollow(FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator1803);
            ruleCollectionIterator();
            _fsp--;

             after(grammarAccess.getCollectionIteratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionIterator1810); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCollectionIterator


    // $ANTLR start ruleCollectionIterator
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:884:1: ruleCollectionIterator : ( ( rule__CollectionIterator__Group__0 ) ) ;
    public final void ruleCollectionIterator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:888:2: ( ( ( rule__CollectionIterator__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:889:1: ( ( rule__CollectionIterator__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:889:1: ( ( rule__CollectionIterator__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:890:1: ( rule__CollectionIterator__Group__0 )
            {
             before(grammarAccess.getCollectionIteratorAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:891:1: ( rule__CollectionIterator__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:891:2: rule__CollectionIterator__Group__0
            {
            pushFollow(FOLLOW_rule__CollectionIterator__Group__0_in_ruleCollectionIterator1836);
            rule__CollectionIterator__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCollectionIteratorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCollectionIterator


    // $ANTLR start entryRuleViewAction
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:903:1: entryRuleViewAction : ruleViewAction EOF ;
    public final void entryRuleViewAction() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:904:1: ( ruleViewAction EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:905:1: ruleViewAction EOF
            {
             before(grammarAccess.getViewActionRule()); 
            pushFollow(FOLLOW_ruleViewAction_in_entryRuleViewAction1863);
            ruleViewAction();
            _fsp--;

             after(grammarAccess.getViewActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewAction1870); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleViewAction


    // $ANTLR start ruleViewAction
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:912:1: ruleViewAction : ( ( rule__ViewAction__Alternatives ) ) ;
    public final void ruleViewAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:916:2: ( ( ( rule__ViewAction__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:917:1: ( ( rule__ViewAction__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:917:1: ( ( rule__ViewAction__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:918:1: ( rule__ViewAction__Alternatives )
            {
             before(grammarAccess.getViewActionAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:919:1: ( rule__ViewAction__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:919:2: rule__ViewAction__Alternatives
            {
            pushFollow(FOLLOW_rule__ViewAction__Alternatives_in_ruleViewAction1896);
            rule__ViewAction__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getViewActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleViewAction


    // $ANTLR start entryRuleExternalOpen
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:931:1: entryRuleExternalOpen : ruleExternalOpen EOF ;
    public final void entryRuleExternalOpen() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:932:1: ( ruleExternalOpen EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:933:1: ruleExternalOpen EOF
            {
             before(grammarAccess.getExternalOpenRule()); 
            pushFollow(FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen1923);
            ruleExternalOpen();
            _fsp--;

             after(grammarAccess.getExternalOpenRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalOpen1930); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleExternalOpen


    // $ANTLR start ruleExternalOpen
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:940:1: ruleExternalOpen : ( ( rule__ExternalOpen__UrlAssignment ) ) ;
    public final void ruleExternalOpen() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:944:2: ( ( ( rule__ExternalOpen__UrlAssignment ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:945:1: ( ( rule__ExternalOpen__UrlAssignment ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:945:1: ( ( rule__ExternalOpen__UrlAssignment ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:946:1: ( rule__ExternalOpen__UrlAssignment )
            {
             before(grammarAccess.getExternalOpenAccess().getUrlAssignment()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:947:1: ( rule__ExternalOpen__UrlAssignment )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:947:2: rule__ExternalOpen__UrlAssignment
            {
            pushFollow(FOLLOW_rule__ExternalOpen__UrlAssignment_in_ruleExternalOpen1956);
            rule__ExternalOpen__UrlAssignment();
            _fsp--;


            }

             after(grammarAccess.getExternalOpenAccess().getUrlAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExternalOpen


    // $ANTLR start entryRuleViewCall
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:959:1: entryRuleViewCall : ruleViewCall EOF ;
    public final void entryRuleViewCall() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:960:1: ( ruleViewCall EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:961:1: ruleViewCall EOF
            {
             before(grammarAccess.getViewCallRule()); 
            pushFollow(FOLLOW_ruleViewCall_in_entryRuleViewCall1983);
            ruleViewCall();
            _fsp--;

             after(grammarAccess.getViewCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewCall1990); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleViewCall


    // $ANTLR start ruleViewCall
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:968:1: ruleViewCall : ( ( rule__ViewCall__Group__0 ) ) ;
    public final void ruleViewCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:972:2: ( ( ( rule__ViewCall__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:973:1: ( ( rule__ViewCall__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:973:1: ( ( rule__ViewCall__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:974:1: ( rule__ViewCall__Group__0 )
            {
             before(grammarAccess.getViewCallAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:975:1: ( rule__ViewCall__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:975:2: rule__ViewCall__Group__0
            {
            pushFollow(FOLLOW_rule__ViewCall__Group__0_in_ruleViewCall2016);
            rule__ViewCall__Group__0();
            _fsp--;


            }

             after(grammarAccess.getViewCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleViewCall


    // $ANTLR start ruleCellType
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:988:1: ruleCellType : ( ( rule__CellType__Alternatives ) ) ;
    public final void ruleCellType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:992:1: ( ( ( rule__CellType__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:993:1: ( ( rule__CellType__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:993:1: ( ( rule__CellType__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:994:1: ( rule__CellType__Alternatives )
            {
             before(grammarAccess.getCellTypeAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:995:1: ( rule__CellType__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:995:2: rule__CellType__Alternatives
            {
            pushFollow(FOLLOW_rule__CellType__Alternatives_in_ruleCellType2053);
            rule__CellType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getCellTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCellType


    // $ANTLR start rule__ModelElement__Alternatives
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1006:1: rule__ModelElement__Alternatives : ( ( ruleType ) | ( ruleContentProvider ) | ( ruleView ) );
    public final void rule__ModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1010:1: ( ( ruleType ) | ( ruleContentProvider ) | ( ruleView ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 33:
            case 35:
                {
                alt1=1;
                }
                break;
            case 37:
                {
                alt1=2;
                }
                break;
            case 43:
            case 44:
            case 45:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1006:1: rule__ModelElement__Alternatives : ( ( ruleType ) | ( ruleContentProvider ) | ( ruleView ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1011:1: ( ruleType )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1011:1: ( ruleType )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1012:1: ruleType
                    {
                     before(grammarAccess.getModelElementAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleType_in_rule__ModelElement__Alternatives2088);
                    ruleType();
                    _fsp--;

                     after(grammarAccess.getModelElementAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1017:6: ( ruleContentProvider )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1017:6: ( ruleContentProvider )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1018:1: ruleContentProvider
                    {
                     before(grammarAccess.getModelElementAccess().getContentProviderParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleContentProvider_in_rule__ModelElement__Alternatives2105);
                    ruleContentProvider();
                    _fsp--;

                     after(grammarAccess.getModelElementAccess().getContentProviderParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1023:6: ( ruleView )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1023:6: ( ruleView )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1024:1: ruleView
                    {
                     before(grammarAccess.getModelElementAccess().getViewParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleView_in_rule__ModelElement__Alternatives2122);
                    ruleView();
                    _fsp--;

                     after(grammarAccess.getModelElementAccess().getViewParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModelElement__Alternatives


    // $ANTLR start rule__Expression__Alternatives
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1035:1: rule__Expression__Alternatives : ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1039:1: ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt2=1;
                }
                break;
            case 17:
            case 19:
            case 21:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            case 24:
                {
                alt2=4;
                }
                break;
            case RULE_ID:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1035:1: rule__Expression__Alternatives : ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1040:1: ( ruleStringLiteral )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1040:1: ( ruleStringLiteral )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1041:1: ruleStringLiteral
                    {
                     before(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Expression__Alternatives2155);
                    ruleStringLiteral();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1046:6: ( ruleStringFunction )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1046:6: ( ruleStringFunction )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1047:1: ruleStringFunction
                    {
                     before(grammarAccess.getExpressionAccess().getStringFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringFunction_in_rule__Expression__Alternatives2172);
                    ruleStringFunction();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getStringFunctionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1052:6: ( ruleCollectionLiteral )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1052:6: ( ruleCollectionLiteral )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1053:1: ruleCollectionLiteral
                    {
                     before(grammarAccess.getExpressionAccess().getCollectionLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_rule__Expression__Alternatives2189);
                    ruleCollectionLiteral();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getCollectionLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1058:6: ( ruleCollectionFunction )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1058:6: ( ruleCollectionFunction )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1059:1: ruleCollectionFunction
                    {
                     before(grammarAccess.getExpressionAccess().getCollectionFunctionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleCollectionFunction_in_rule__Expression__Alternatives2206);
                    ruleCollectionFunction();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getCollectionFunctionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1064:6: ( ruleObjectReference )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1064:6: ( ruleObjectReference )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1065:1: ruleObjectReference
                    {
                     before(grammarAccess.getExpressionAccess().getObjectReferenceParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleObjectReference_in_rule__Expression__Alternatives2223);
                    ruleObjectReference();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getObjectReferenceParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Alternatives


    // $ANTLR start rule__ScalarExpression__Alternatives
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1075:1: rule__ScalarExpression__Alternatives : ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleObjectReference ) );
    public final void rule__ScalarExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1079:1: ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleObjectReference ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case 17:
            case 19:
            case 21:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1075:1: rule__ScalarExpression__Alternatives : ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleObjectReference ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1080:1: ( ruleStringLiteral )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1080:1: ( ruleStringLiteral )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1081:1: ruleStringLiteral
                    {
                     before(grammarAccess.getScalarExpressionAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__ScalarExpression__Alternatives2255);
                    ruleStringLiteral();
                    _fsp--;

                     after(grammarAccess.getScalarExpressionAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1086:6: ( ruleStringFunction )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1086:6: ( ruleStringFunction )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1087:1: ruleStringFunction
                    {
                     before(grammarAccess.getScalarExpressionAccess().getStringFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringFunction_in_rule__ScalarExpression__Alternatives2272);
                    ruleStringFunction();
                    _fsp--;

                     after(grammarAccess.getScalarExpressionAccess().getStringFunctionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1092:6: ( ruleObjectReference )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1092:6: ( ruleObjectReference )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1093:1: ruleObjectReference
                    {
                     before(grammarAccess.getScalarExpressionAccess().getObjectReferenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleObjectReference_in_rule__ScalarExpression__Alternatives2289);
                    ruleObjectReference();
                    _fsp--;

                     after(grammarAccess.getScalarExpressionAccess().getObjectReferenceParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ScalarExpression__Alternatives


    // $ANTLR start rule__CollectionExpression__Alternatives
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1103:1: rule__CollectionExpression__Alternatives : ( ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) );
    public final void rule__CollectionExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1107:1: ( ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1103:1: rule__CollectionExpression__Alternatives : ( ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1108:1: ( ruleCollectionLiteral )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1108:1: ( ruleCollectionLiteral )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1109:1: ruleCollectionLiteral
                    {
                     before(grammarAccess.getCollectionExpressionAccess().getCollectionLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_rule__CollectionExpression__Alternatives2321);
                    ruleCollectionLiteral();
                    _fsp--;

                     after(grammarAccess.getCollectionExpressionAccess().getCollectionLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1114:6: ( ruleCollectionFunction )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1114:6: ( ruleCollectionFunction )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1115:1: ruleCollectionFunction
                    {
                     before(grammarAccess.getCollectionExpressionAccess().getCollectionFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCollectionFunction_in_rule__CollectionExpression__Alternatives2338);
                    ruleCollectionFunction();
                    _fsp--;

                     after(grammarAccess.getCollectionExpressionAccess().getCollectionFunctionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1120:6: ( ruleObjectReference )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1120:6: ( ruleObjectReference )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1121:1: ruleObjectReference
                    {
                     before(grammarAccess.getCollectionExpressionAccess().getObjectReferenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleObjectReference_in_rule__CollectionExpression__Alternatives2355);
                    ruleObjectReference();
                    _fsp--;

                     after(grammarAccess.getCollectionExpressionAccess().getObjectReferenceParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionExpression__Alternatives


    // $ANTLR start rule__StringFunction__Alternatives
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1131:1: rule__StringFunction__Alternatives : ( ( ( rule__StringFunction__Group_0__0 ) ) | ( ( rule__StringFunction__Group_1__0 ) ) | ( ( rule__StringFunction__Group_2__0 ) ) );
    public final void rule__StringFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1135:1: ( ( ( rule__StringFunction__Group_0__0 ) ) | ( ( rule__StringFunction__Group_1__0 ) ) | ( ( rule__StringFunction__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1131:1: rule__StringFunction__Alternatives : ( ( ( rule__StringFunction__Group_0__0 ) ) | ( ( rule__StringFunction__Group_1__0 ) ) | ( ( rule__StringFunction__Group_2__0 ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1136:1: ( ( rule__StringFunction__Group_0__0 ) )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1136:1: ( ( rule__StringFunction__Group_0__0 ) )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1137:1: ( rule__StringFunction__Group_0__0 )
                    {
                     before(grammarAccess.getStringFunctionAccess().getGroup_0()); 
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1138:1: ( rule__StringFunction__Group_0__0 )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1138:2: rule__StringFunction__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__StringFunction__Group_0__0_in_rule__StringFunction__Alternatives2387);
                    rule__StringFunction__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStringFunctionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1142:6: ( ( rule__StringFunction__Group_1__0 ) )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1142:6: ( ( rule__StringFunction__Group_1__0 ) )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1143:1: ( rule__StringFunction__Group_1__0 )
                    {
                     before(grammarAccess.getStringFunctionAccess().getGroup_1()); 
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1144:1: ( rule__StringFunction__Group_1__0 )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1144:2: rule__StringFunction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StringFunction__Group_1__0_in_rule__StringFunction__Alternatives2405);
                    rule__StringFunction__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStringFunctionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1148:6: ( ( rule__StringFunction__Group_2__0 ) )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1148:6: ( ( rule__StringFunction__Group_2__0 ) )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1149:1: ( rule__StringFunction__Group_2__0 )
                    {
                     before(grammarAccess.getStringFunctionAccess().getGroup_2()); 
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1150:1: ( rule__StringFunction__Group_2__0 )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1150:2: rule__StringFunction__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StringFunction__Group_2__0_in_rule__StringFunction__Alternatives2423);
                    rule__StringFunction__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStringFunctionAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Alternatives


    // $ANTLR start rule__Type__Alternatives
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1159:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1163:1: ( ( ruleSimpleType ) | ( ruleEntity ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            else if ( (LA6_0==35) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1159:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1164:1: ( ruleSimpleType )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1164:1: ( ruleSimpleType )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1165:1: ruleSimpleType
                    {
                     before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__Type__Alternatives2456);
                    ruleSimpleType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1170:6: ( ruleEntity )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1170:6: ( ruleEntity )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1171:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives2473);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__Alternatives


    // $ANTLR start rule__ProviderConstruction__Alternatives
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1181:1: rule__ProviderConstruction__Alternatives : ( ( ( rule__ProviderConstruction__Group_0__0 ) ) | ( ( rule__ProviderConstruction__Group_1__0 ) ) );
    public final void rule__ProviderConstruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1185:1: ( ( ( rule__ProviderConstruction__Group_0__0 ) ) | ( ( rule__ProviderConstruction__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==17) ) {
                    alt7=1;
                }
                else if ( (LA7_1==EOF||LA7_1==16||LA7_1==18) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1181:1: rule__ProviderConstruction__Alternatives : ( ( ( rule__ProviderConstruction__Group_0__0 ) ) | ( ( rule__ProviderConstruction__Group_1__0 ) ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_STRING||LA7_0==17||LA7_0==19||(LA7_0>=21 && LA7_0<=22)||LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1181:1: rule__ProviderConstruction__Alternatives : ( ( ( rule__ProviderConstruction__Group_0__0 ) ) | ( ( rule__ProviderConstruction__Group_1__0 ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1186:1: ( ( rule__ProviderConstruction__Group_0__0 ) )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1186:1: ( ( rule__ProviderConstruction__Group_0__0 ) )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1187:1: ( rule__ProviderConstruction__Group_0__0 )
                    {
                     before(grammarAccess.getProviderConstructionAccess().getGroup_0()); 
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1188:1: ( rule__ProviderConstruction__Group_0__0 )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1188:2: rule__ProviderConstruction__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__0_in_rule__ProviderConstruction__Alternatives2505);
                    rule__ProviderConstruction__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getProviderConstructionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1192:6: ( ( rule__ProviderConstruction__Group_1__0 ) )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1192:6: ( ( rule__ProviderConstruction__Group_1__0 ) )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1193:1: ( rule__ProviderConstruction__Group_1__0 )
                    {
                     before(grammarAccess.getProviderConstructionAccess().getGroup_1()); 
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1194:1: ( rule__ProviderConstruction__Group_1__0 )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1194:2: rule__ProviderConstruction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ProviderConstruction__Group_1__0_in_rule__ProviderConstruction__Alternatives2523);
                    rule__ProviderConstruction__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getProviderConstructionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Alternatives


    // $ANTLR start rule__View__Alternatives
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1203:1: rule__View__Alternatives : ( ( ruleSectionedView ) | ( ruleCustomView ) );
    public final void rule__View__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1207:1: ( ( ruleSectionedView ) | ( ruleCustomView ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=43 && LA8_0<=44)) ) {
                alt8=1;
            }
            else if ( (LA8_0==45) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1203:1: rule__View__Alternatives : ( ( ruleSectionedView ) | ( ruleCustomView ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1208:1: ( ruleSectionedView )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1208:1: ( ruleSectionedView )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1209:1: ruleSectionedView
                    {
                     before(grammarAccess.getViewAccess().getSectionedViewParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSectionedView_in_rule__View__Alternatives2556);
                    ruleSectionedView();
                    _fsp--;

                     after(grammarAccess.getViewAccess().getSectionedViewParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1214:6: ( ruleCustomView )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1214:6: ( ruleCustomView )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1215:1: ruleCustomView
                    {
                     before(grammarAccess.getViewAccess().getCustomViewParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCustomView_in_rule__View__Alternatives2573);
                    ruleCustomView();
                    _fsp--;

                     after(grammarAccess.getViewAccess().getCustomViewParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__View__Alternatives


    // $ANTLR start rule__SectionedView__Alternatives
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1225:1: rule__SectionedView__Alternatives : ( ( ruleTableView ) | ( ruleDetailsView ) );
    public final void rule__SectionedView__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1229:1: ( ( ruleTableView ) | ( ruleDetailsView ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==43) ) {
                alt9=1;
            }
            else if ( (LA9_0==44) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1225:1: rule__SectionedView__Alternatives : ( ( ruleTableView ) | ( ruleDetailsView ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1230:1: ( ruleTableView )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1230:1: ( ruleTableView )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1231:1: ruleTableView
                    {
                     before(grammarAccess.getSectionedViewAccess().getTableViewParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTableView_in_rule__SectionedView__Alternatives2605);
                    ruleTableView();
                    _fsp--;

                     after(grammarAccess.getSectionedViewAccess().getTableViewParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1236:6: ( ruleDetailsView )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1236:6: ( ruleDetailsView )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1237:1: ruleDetailsView
                    {
                     before(grammarAccess.getSectionedViewAccess().getDetailsViewParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDetailsView_in_rule__SectionedView__Alternatives2622);
                    ruleDetailsView();
                    _fsp--;

                     after(grammarAccess.getSectionedViewAccess().getDetailsViewParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionedView__Alternatives


    // $ANTLR start rule__ViewAction__Alternatives
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1247:1: rule__ViewAction__Alternatives : ( ( ruleViewCall ) | ( ruleExternalOpen ) );
    public final void rule__ViewAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1251:1: ( ( ruleViewCall ) | ( ruleExternalOpen ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==17) ) {
                    alt10=1;
                }
                else if ( (LA10_1==EOF||LA10_1==16||LA10_1==27) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1247:1: rule__ViewAction__Alternatives : ( ( ruleViewCall ) | ( ruleExternalOpen ) );", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==RULE_STRING||LA10_0==17||LA10_0==19||LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1247:1: rule__ViewAction__Alternatives : ( ( ruleViewCall ) | ( ruleExternalOpen ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1252:1: ( ruleViewCall )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1252:1: ( ruleViewCall )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1253:1: ruleViewCall
                    {
                     before(grammarAccess.getViewActionAccess().getViewCallParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleViewCall_in_rule__ViewAction__Alternatives2654);
                    ruleViewCall();
                    _fsp--;

                     after(grammarAccess.getViewActionAccess().getViewCallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1258:6: ( ruleExternalOpen )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1258:6: ( ruleExternalOpen )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1259:1: ruleExternalOpen
                    {
                     before(grammarAccess.getViewActionAccess().getExternalOpenParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExternalOpen_in_rule__ViewAction__Alternatives2671);
                    ruleExternalOpen();
                    _fsp--;

                     after(grammarAccess.getViewActionAccess().getExternalOpenParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewAction__Alternatives


    // $ANTLR start rule__CellType__Alternatives
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1269:1: rule__CellType__Alternatives : ( ( ( 'Default' ) ) | ( ( 'DefaultWithDisclosure' ) ) | ( ( 'Value2' ) ) | ( ( 'Double' ) ) | ( ( 'Subtitle' ) ) );
    public final void rule__CellType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1273:1: ( ( ( 'Default' ) ) | ( ( 'DefaultWithDisclosure' ) ) | ( ( 'Value2' ) ) | ( ( 'Double' ) ) | ( ( 'Subtitle' ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt11=1;
                }
                break;
            case 12:
                {
                alt11=2;
                }
                break;
            case 13:
                {
                alt11=3;
                }
                break;
            case 14:
                {
                alt11=4;
                }
                break;
            case 15:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1269:1: rule__CellType__Alternatives : ( ( ( 'Default' ) ) | ( ( 'DefaultWithDisclosure' ) ) | ( ( 'Value2' ) ) | ( ( 'Double' ) ) | ( ( 'Subtitle' ) ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1274:1: ( ( 'Default' ) )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1274:1: ( ( 'Default' ) )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1275:1: ( 'Default' )
                    {
                     before(grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0()); 
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1276:1: ( 'Default' )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1276:3: 'Default'
                    {
                    match(input,11,FOLLOW_11_in_rule__CellType__Alternatives2704); 

                    }

                     after(grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1281:6: ( ( 'DefaultWithDisclosure' ) )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1281:6: ( ( 'DefaultWithDisclosure' ) )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1282:1: ( 'DefaultWithDisclosure' )
                    {
                     before(grammarAccess.getCellTypeAccess().getDefaultWithDisclosureEnumLiteralDeclaration_1()); 
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1283:1: ( 'DefaultWithDisclosure' )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1283:3: 'DefaultWithDisclosure'
                    {
                    match(input,12,FOLLOW_12_in_rule__CellType__Alternatives2725); 

                    }

                     after(grammarAccess.getCellTypeAccess().getDefaultWithDisclosureEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1288:6: ( ( 'Value2' ) )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1288:6: ( ( 'Value2' ) )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1289:1: ( 'Value2' )
                    {
                     before(grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2()); 
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1290:1: ( 'Value2' )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1290:3: 'Value2'
                    {
                    match(input,13,FOLLOW_13_in_rule__CellType__Alternatives2746); 

                    }

                     after(grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1295:6: ( ( 'Double' ) )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1295:6: ( ( 'Double' ) )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1296:1: ( 'Double' )
                    {
                     before(grammarAccess.getCellTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1297:1: ( 'Double' )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1297:3: 'Double'
                    {
                    match(input,14,FOLLOW_14_in_rule__CellType__Alternatives2767); 

                    }

                     after(grammarAccess.getCellTypeAccess().getDoubleEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1302:6: ( ( 'Subtitle' ) )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1302:6: ( ( 'Subtitle' ) )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1303:1: ( 'Subtitle' )
                    {
                     before(grammarAccess.getCellTypeAccess().getSubtitleEnumLiteralDeclaration_4()); 
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1304:1: ( 'Subtitle' )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1304:3: 'Subtitle'
                    {
                    match(input,15,FOLLOW_15_in_rule__CellType__Alternatives2788); 

                    }

                     after(grammarAccess.getCellTypeAccess().getSubtitleEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CellType__Alternatives


    // $ANTLR start rule__Model__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1316:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1320:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1321:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02821);
            rule__Model__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02824);
            rule__Model__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__0


    // $ANTLR start rule__Model__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1328:1: rule__Model__Group__0__Impl : ( ( rule__Model__ApplicationAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1332:1: ( ( ( rule__Model__ApplicationAssignment_0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1333:1: ( ( rule__Model__ApplicationAssignment_0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1333:1: ( ( rule__Model__ApplicationAssignment_0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1334:1: ( rule__Model__ApplicationAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getApplicationAssignment_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1335:1: ( rule__Model__ApplicationAssignment_0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1335:2: rule__Model__ApplicationAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__ApplicationAssignment_0_in_rule__Model__Group__0__Impl2851);
            rule__Model__ApplicationAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getApplicationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__0__Impl


    // $ANTLR start rule__Model__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1345:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1349:1: ( rule__Model__Group__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1350:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12881);
            rule__Model__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__1


    // $ANTLR start rule__Model__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1356:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1360:1: ( ( ( rule__Model__ElementsAssignment_1 )* ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1361:1: ( ( rule__Model__ElementsAssignment_1 )* )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1361:1: ( ( rule__Model__ElementsAssignment_1 )* )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1362:1: ( rule__Model__ElementsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1363:1: ( rule__Model__ElementsAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33||LA12_0==35||LA12_0==37||(LA12_0>=43 && LA12_0<=45)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1363:2: rule__Model__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ElementsAssignment_1_in_rule__Model__Group__1__Impl2908);
            	    rule__Model__ElementsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__1__Impl


    // $ANTLR start rule__TypeDescription__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1377:1: rule__TypeDescription__Group__0 : rule__TypeDescription__Group__0__Impl rule__TypeDescription__Group__1 ;
    public final void rule__TypeDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1381:1: ( rule__TypeDescription__Group__0__Impl rule__TypeDescription__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1382:2: rule__TypeDescription__Group__0__Impl rule__TypeDescription__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDescription__Group__0__Impl_in_rule__TypeDescription__Group__02943);
            rule__TypeDescription__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TypeDescription__Group__1_in_rule__TypeDescription__Group__02946);
            rule__TypeDescription__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDescription__Group__0


    // $ANTLR start rule__TypeDescription__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1389:1: rule__TypeDescription__Group__0__Impl : ( ( rule__TypeDescription__TypeAssignment_0 ) ) ;
    public final void rule__TypeDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1393:1: ( ( ( rule__TypeDescription__TypeAssignment_0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1394:1: ( ( rule__TypeDescription__TypeAssignment_0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1394:1: ( ( rule__TypeDescription__TypeAssignment_0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1395:1: ( rule__TypeDescription__TypeAssignment_0 )
            {
             before(grammarAccess.getTypeDescriptionAccess().getTypeAssignment_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1396:1: ( rule__TypeDescription__TypeAssignment_0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1396:2: rule__TypeDescription__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeDescription__TypeAssignment_0_in_rule__TypeDescription__Group__0__Impl2973);
            rule__TypeDescription__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getTypeDescriptionAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDescription__Group__0__Impl


    // $ANTLR start rule__TypeDescription__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1406:1: rule__TypeDescription__Group__1 : rule__TypeDescription__Group__1__Impl ;
    public final void rule__TypeDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1410:1: ( rule__TypeDescription__Group__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1411:2: rule__TypeDescription__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDescription__Group__1__Impl_in_rule__TypeDescription__Group__13003);
            rule__TypeDescription__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDescription__Group__1


    // $ANTLR start rule__TypeDescription__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1417:1: rule__TypeDescription__Group__1__Impl : ( ( rule__TypeDescription__ManyAssignment_1 )? ) ;
    public final void rule__TypeDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1421:1: ( ( ( rule__TypeDescription__ManyAssignment_1 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1422:1: ( ( rule__TypeDescription__ManyAssignment_1 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1422:1: ( ( rule__TypeDescription__ManyAssignment_1 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1423:1: ( rule__TypeDescription__ManyAssignment_1 )?
            {
             before(grammarAccess.getTypeDescriptionAccess().getManyAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1424:1: ( rule__TypeDescription__ManyAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==57) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1424:2: rule__TypeDescription__ManyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeDescription__ManyAssignment_1_in_rule__TypeDescription__Group__1__Impl3030);
                    rule__TypeDescription__ManyAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeDescriptionAccess().getManyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDescription__Group__1__Impl


    // $ANTLR start rule__Parameter__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1438:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1442:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1443:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03065);
            rule__Parameter__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03068);
            rule__Parameter__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__Group__0


    // $ANTLR start rule__Parameter__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1450:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__DescriptionAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1454:1: ( ( ( rule__Parameter__DescriptionAssignment_0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1455:1: ( ( rule__Parameter__DescriptionAssignment_0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1455:1: ( ( rule__Parameter__DescriptionAssignment_0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1456:1: ( rule__Parameter__DescriptionAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getDescriptionAssignment_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1457:1: ( rule__Parameter__DescriptionAssignment_0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1457:2: rule__Parameter__DescriptionAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__DescriptionAssignment_0_in_rule__Parameter__Group__0__Impl3095);
            rule__Parameter__DescriptionAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getParameterAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__Group__0__Impl


    // $ANTLR start rule__Parameter__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1467:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1471:1: ( rule__Parameter__Group__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1472:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13125);
            rule__Parameter__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__Group__1


    // $ANTLR start rule__Parameter__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1478:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1482:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1483:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1483:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1484:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1485:1: ( rule__Parameter__NameAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1485:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl3152);
            rule__Parameter__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__Group__1__Impl


    // $ANTLR start rule__ObjectReference__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1499:1: rule__ObjectReference__Group__0 : rule__ObjectReference__Group__0__Impl rule__ObjectReference__Group__1 ;
    public final void rule__ObjectReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1503:1: ( rule__ObjectReference__Group__0__Impl rule__ObjectReference__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1504:2: rule__ObjectReference__Group__0__Impl rule__ObjectReference__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectReference__Group__0__Impl_in_rule__ObjectReference__Group__03186);
            rule__ObjectReference__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ObjectReference__Group__1_in_rule__ObjectReference__Group__03189);
            rule__ObjectReference__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectReference__Group__0


    // $ANTLR start rule__ObjectReference__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1511:1: rule__ObjectReference__Group__0__Impl : ( ( rule__ObjectReference__ObjectAssignment_0 ) ) ;
    public final void rule__ObjectReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1515:1: ( ( ( rule__ObjectReference__ObjectAssignment_0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1516:1: ( ( rule__ObjectReference__ObjectAssignment_0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1516:1: ( ( rule__ObjectReference__ObjectAssignment_0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1517:1: ( rule__ObjectReference__ObjectAssignment_0 )
            {
             before(grammarAccess.getObjectReferenceAccess().getObjectAssignment_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1518:1: ( rule__ObjectReference__ObjectAssignment_0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1518:2: rule__ObjectReference__ObjectAssignment_0
            {
            pushFollow(FOLLOW_rule__ObjectReference__ObjectAssignment_0_in_rule__ObjectReference__Group__0__Impl3216);
            rule__ObjectReference__ObjectAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getObjectReferenceAccess().getObjectAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectReference__Group__0__Impl


    // $ANTLR start rule__ObjectReference__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1528:1: rule__ObjectReference__Group__1 : rule__ObjectReference__Group__1__Impl ;
    public final void rule__ObjectReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1532:1: ( rule__ObjectReference__Group__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1533:2: rule__ObjectReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectReference__Group__1__Impl_in_rule__ObjectReference__Group__13246);
            rule__ObjectReference__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectReference__Group__1


    // $ANTLR start rule__ObjectReference__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1539:1: rule__ObjectReference__Group__1__Impl : ( ( rule__ObjectReference__TailAssignment_1 )? ) ;
    public final void rule__ObjectReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1543:1: ( ( ( rule__ObjectReference__TailAssignment_1 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1544:1: ( ( rule__ObjectReference__TailAssignment_1 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1544:1: ( ( rule__ObjectReference__TailAssignment_1 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1545:1: ( rule__ObjectReference__TailAssignment_1 )?
            {
             before(grammarAccess.getObjectReferenceAccess().getTailAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1546:1: ( rule__ObjectReference__TailAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1546:2: rule__ObjectReference__TailAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ObjectReference__TailAssignment_1_in_rule__ObjectReference__Group__1__Impl3273);
                    rule__ObjectReference__TailAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectReferenceAccess().getTailAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectReference__Group__1__Impl


    // $ANTLR start rule__NestedObjectReference__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1560:1: rule__NestedObjectReference__Group__0 : rule__NestedObjectReference__Group__0__Impl rule__NestedObjectReference__Group__1 ;
    public final void rule__NestedObjectReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1564:1: ( rule__NestedObjectReference__Group__0__Impl rule__NestedObjectReference__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1565:2: rule__NestedObjectReference__Group__0__Impl rule__NestedObjectReference__Group__1
            {
            pushFollow(FOLLOW_rule__NestedObjectReference__Group__0__Impl_in_rule__NestedObjectReference__Group__03308);
            rule__NestedObjectReference__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NestedObjectReference__Group__1_in_rule__NestedObjectReference__Group__03311);
            rule__NestedObjectReference__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NestedObjectReference__Group__0


    // $ANTLR start rule__NestedObjectReference__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1572:1: rule__NestedObjectReference__Group__0__Impl : ( '.' ) ;
    public final void rule__NestedObjectReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1576:1: ( ( '.' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1577:1: ( '.' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1577:1: ( '.' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1578:1: '.'
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getFullStopKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__NestedObjectReference__Group__0__Impl3339); 
             after(grammarAccess.getNestedObjectReferenceAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NestedObjectReference__Group__0__Impl


    // $ANTLR start rule__NestedObjectReference__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1591:1: rule__NestedObjectReference__Group__1 : rule__NestedObjectReference__Group__1__Impl rule__NestedObjectReference__Group__2 ;
    public final void rule__NestedObjectReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1595:1: ( rule__NestedObjectReference__Group__1__Impl rule__NestedObjectReference__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1596:2: rule__NestedObjectReference__Group__1__Impl rule__NestedObjectReference__Group__2
            {
            pushFollow(FOLLOW_rule__NestedObjectReference__Group__1__Impl_in_rule__NestedObjectReference__Group__13370);
            rule__NestedObjectReference__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NestedObjectReference__Group__2_in_rule__NestedObjectReference__Group__13373);
            rule__NestedObjectReference__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NestedObjectReference__Group__1


    // $ANTLR start rule__NestedObjectReference__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1603:1: rule__NestedObjectReference__Group__1__Impl : ( ( rule__NestedObjectReference__ObjectAssignment_1 ) ) ;
    public final void rule__NestedObjectReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1607:1: ( ( ( rule__NestedObjectReference__ObjectAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1608:1: ( ( rule__NestedObjectReference__ObjectAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1608:1: ( ( rule__NestedObjectReference__ObjectAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1609:1: ( rule__NestedObjectReference__ObjectAssignment_1 )
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getObjectAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1610:1: ( rule__NestedObjectReference__ObjectAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1610:2: rule__NestedObjectReference__ObjectAssignment_1
            {
            pushFollow(FOLLOW_rule__NestedObjectReference__ObjectAssignment_1_in_rule__NestedObjectReference__Group__1__Impl3400);
            rule__NestedObjectReference__ObjectAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getNestedObjectReferenceAccess().getObjectAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NestedObjectReference__Group__1__Impl


    // $ANTLR start rule__NestedObjectReference__Group__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1620:1: rule__NestedObjectReference__Group__2 : rule__NestedObjectReference__Group__2__Impl ;
    public final void rule__NestedObjectReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1624:1: ( rule__NestedObjectReference__Group__2__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1625:2: rule__NestedObjectReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NestedObjectReference__Group__2__Impl_in_rule__NestedObjectReference__Group__23430);
            rule__NestedObjectReference__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NestedObjectReference__Group__2


    // $ANTLR start rule__NestedObjectReference__Group__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1631:1: rule__NestedObjectReference__Group__2__Impl : ( ( rule__NestedObjectReference__TailAssignment_2 )? ) ;
    public final void rule__NestedObjectReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1635:1: ( ( ( rule__NestedObjectReference__TailAssignment_2 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1636:1: ( ( rule__NestedObjectReference__TailAssignment_2 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1636:1: ( ( rule__NestedObjectReference__TailAssignment_2 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1637:1: ( rule__NestedObjectReference__TailAssignment_2 )?
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getTailAssignment_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1638:1: ( rule__NestedObjectReference__TailAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1638:2: rule__NestedObjectReference__TailAssignment_2
                    {
                    pushFollow(FOLLOW_rule__NestedObjectReference__TailAssignment_2_in_rule__NestedObjectReference__Group__2__Impl3457);
                    rule__NestedObjectReference__TailAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNestedObjectReferenceAccess().getTailAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NestedObjectReference__Group__2__Impl


    // $ANTLR start rule__StringFunction__Group_0__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1654:1: rule__StringFunction__Group_0__0 : rule__StringFunction__Group_0__0__Impl rule__StringFunction__Group_0__1 ;
    public final void rule__StringFunction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1658:1: ( rule__StringFunction__Group_0__0__Impl rule__StringFunction__Group_0__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1659:2: rule__StringFunction__Group_0__0__Impl rule__StringFunction__Group_0__1
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_0__0__Impl_in_rule__StringFunction__Group_0__03494);
            rule__StringFunction__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_0__1_in_rule__StringFunction__Group_0__03497);
            rule__StringFunction__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_0__0


    // $ANTLR start rule__StringFunction__Group_0__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1666:1: rule__StringFunction__Group_0__0__Impl : ( () ) ;
    public final void rule__StringFunction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1670:1: ( ( () ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1671:1: ( () )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1671:1: ( () )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1672:1: ()
            {
             before(grammarAccess.getStringFunctionAccess().getStringConcatAction_0_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1673:1: ()
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1675:1: 
            {
            }

             after(grammarAccess.getStringFunctionAccess().getStringConcatAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_0__0__Impl


    // $ANTLR start rule__StringFunction__Group_0__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1685:1: rule__StringFunction__Group_0__1 : rule__StringFunction__Group_0__1__Impl rule__StringFunction__Group_0__2 ;
    public final void rule__StringFunction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1689:1: ( rule__StringFunction__Group_0__1__Impl rule__StringFunction__Group_0__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1690:2: rule__StringFunction__Group_0__1__Impl rule__StringFunction__Group_0__2
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_0__1__Impl_in_rule__StringFunction__Group_0__13555);
            rule__StringFunction__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_0__2_in_rule__StringFunction__Group_0__13558);
            rule__StringFunction__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_0__1


    // $ANTLR start rule__StringFunction__Group_0__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1697:1: rule__StringFunction__Group_0__1__Impl : ( '(' ) ;
    public final void rule__StringFunction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1701:1: ( ( '(' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1702:1: ( '(' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1702:1: ( '(' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1703:1: '('
            {
             before(grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,17,FOLLOW_17_in_rule__StringFunction__Group_0__1__Impl3586); 
             after(grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_0__1__Impl


    // $ANTLR start rule__StringFunction__Group_0__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1716:1: rule__StringFunction__Group_0__2 : rule__StringFunction__Group_0__2__Impl rule__StringFunction__Group_0__3 ;
    public final void rule__StringFunction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1720:1: ( rule__StringFunction__Group_0__2__Impl rule__StringFunction__Group_0__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1721:2: rule__StringFunction__Group_0__2__Impl rule__StringFunction__Group_0__3
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_0__2__Impl_in_rule__StringFunction__Group_0__23617);
            rule__StringFunction__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_0__3_in_rule__StringFunction__Group_0__23620);
            rule__StringFunction__Group_0__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_0__2


    // $ANTLR start rule__StringFunction__Group_0__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1728:1: rule__StringFunction__Group_0__2__Impl : ( ( ( rule__StringFunction__ValuesAssignment_0_2 ) ) ( ( rule__StringFunction__ValuesAssignment_0_2 )* ) ) ;
    public final void rule__StringFunction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1732:1: ( ( ( ( rule__StringFunction__ValuesAssignment_0_2 ) ) ( ( rule__StringFunction__ValuesAssignment_0_2 )* ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1733:1: ( ( ( rule__StringFunction__ValuesAssignment_0_2 ) ) ( ( rule__StringFunction__ValuesAssignment_0_2 )* ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1733:1: ( ( ( rule__StringFunction__ValuesAssignment_0_2 ) ) ( ( rule__StringFunction__ValuesAssignment_0_2 )* ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1734:1: ( ( rule__StringFunction__ValuesAssignment_0_2 ) ) ( ( rule__StringFunction__ValuesAssignment_0_2 )* )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1734:1: ( ( rule__StringFunction__ValuesAssignment_0_2 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1735:1: ( rule__StringFunction__ValuesAssignment_0_2 )
            {
             before(grammarAccess.getStringFunctionAccess().getValuesAssignment_0_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1736:1: ( rule__StringFunction__ValuesAssignment_0_2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1736:2: rule__StringFunction__ValuesAssignment_0_2
            {
            pushFollow(FOLLOW_rule__StringFunction__ValuesAssignment_0_2_in_rule__StringFunction__Group_0__2__Impl3649);
            rule__StringFunction__ValuesAssignment_0_2();
            _fsp--;


            }

             after(grammarAccess.getStringFunctionAccess().getValuesAssignment_0_2()); 

            }

            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1739:1: ( ( rule__StringFunction__ValuesAssignment_0_2 )* )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1740:1: ( rule__StringFunction__ValuesAssignment_0_2 )*
            {
             before(grammarAccess.getStringFunctionAccess().getValuesAssignment_0_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1741:1: ( rule__StringFunction__ValuesAssignment_0_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||LA16_0==17||LA16_0==19||LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1741:2: rule__StringFunction__ValuesAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_rule__StringFunction__ValuesAssignment_0_2_in_rule__StringFunction__Group_0__2__Impl3661);
            	    rule__StringFunction__ValuesAssignment_0_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getStringFunctionAccess().getValuesAssignment_0_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_0__2__Impl


    // $ANTLR start rule__StringFunction__Group_0__3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1752:1: rule__StringFunction__Group_0__3 : rule__StringFunction__Group_0__3__Impl ;
    public final void rule__StringFunction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1756:1: ( rule__StringFunction__Group_0__3__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1757:2: rule__StringFunction__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_0__3__Impl_in_rule__StringFunction__Group_0__33694);
            rule__StringFunction__Group_0__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_0__3


    // $ANTLR start rule__StringFunction__Group_0__3__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1763:1: rule__StringFunction__Group_0__3__Impl : ( ')' ) ;
    public final void rule__StringFunction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1767:1: ( ( ')' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1768:1: ( ')' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1768:1: ( ')' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1769:1: ')'
            {
             before(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_0_3()); 
            match(input,18,FOLLOW_18_in_rule__StringFunction__Group_0__3__Impl3722); 
             after(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_0__3__Impl


    // $ANTLR start rule__StringFunction__Group_1__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1790:1: rule__StringFunction__Group_1__0 : rule__StringFunction__Group_1__0__Impl rule__StringFunction__Group_1__1 ;
    public final void rule__StringFunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1794:1: ( rule__StringFunction__Group_1__0__Impl rule__StringFunction__Group_1__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1795:2: rule__StringFunction__Group_1__0__Impl rule__StringFunction__Group_1__1
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__0__Impl_in_rule__StringFunction__Group_1__03761);
            rule__StringFunction__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__1_in_rule__StringFunction__Group_1__03764);
            rule__StringFunction__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__0


    // $ANTLR start rule__StringFunction__Group_1__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1802:1: rule__StringFunction__Group_1__0__Impl : ( () ) ;
    public final void rule__StringFunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1806:1: ( ( () ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1807:1: ( () )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1807:1: ( () )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1808:1: ()
            {
             before(grammarAccess.getStringFunctionAccess().getStringReplaceAction_1_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1809:1: ()
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1811:1: 
            {
            }

             after(grammarAccess.getStringFunctionAccess().getStringReplaceAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__0__Impl


    // $ANTLR start rule__StringFunction__Group_1__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1821:1: rule__StringFunction__Group_1__1 : rule__StringFunction__Group_1__1__Impl rule__StringFunction__Group_1__2 ;
    public final void rule__StringFunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1825:1: ( rule__StringFunction__Group_1__1__Impl rule__StringFunction__Group_1__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1826:2: rule__StringFunction__Group_1__1__Impl rule__StringFunction__Group_1__2
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__1__Impl_in_rule__StringFunction__Group_1__13822);
            rule__StringFunction__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__2_in_rule__StringFunction__Group_1__13825);
            rule__StringFunction__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__1


    // $ANTLR start rule__StringFunction__Group_1__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1833:1: rule__StringFunction__Group_1__1__Impl : ( 'replace(' ) ;
    public final void rule__StringFunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1837:1: ( ( 'replace(' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1838:1: ( 'replace(' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1838:1: ( 'replace(' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1839:1: 'replace('
            {
             before(grammarAccess.getStringFunctionAccess().getReplaceKeyword_1_1()); 
            match(input,19,FOLLOW_19_in_rule__StringFunction__Group_1__1__Impl3853); 
             after(grammarAccess.getStringFunctionAccess().getReplaceKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__1__Impl


    // $ANTLR start rule__StringFunction__Group_1__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1852:1: rule__StringFunction__Group_1__2 : rule__StringFunction__Group_1__2__Impl rule__StringFunction__Group_1__3 ;
    public final void rule__StringFunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1856:1: ( rule__StringFunction__Group_1__2__Impl rule__StringFunction__Group_1__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1857:2: rule__StringFunction__Group_1__2__Impl rule__StringFunction__Group_1__3
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__2__Impl_in_rule__StringFunction__Group_1__23884);
            rule__StringFunction__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__3_in_rule__StringFunction__Group_1__23887);
            rule__StringFunction__Group_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__2


    // $ANTLR start rule__StringFunction__Group_1__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1864:1: rule__StringFunction__Group_1__2__Impl : ( ( rule__StringFunction__ValueAssignment_1_2 ) ) ;
    public final void rule__StringFunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1868:1: ( ( ( rule__StringFunction__ValueAssignment_1_2 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1869:1: ( ( rule__StringFunction__ValueAssignment_1_2 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1869:1: ( ( rule__StringFunction__ValueAssignment_1_2 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1870:1: ( rule__StringFunction__ValueAssignment_1_2 )
            {
             before(grammarAccess.getStringFunctionAccess().getValueAssignment_1_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1871:1: ( rule__StringFunction__ValueAssignment_1_2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1871:2: rule__StringFunction__ValueAssignment_1_2
            {
            pushFollow(FOLLOW_rule__StringFunction__ValueAssignment_1_2_in_rule__StringFunction__Group_1__2__Impl3914);
            rule__StringFunction__ValueAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getStringFunctionAccess().getValueAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__2__Impl


    // $ANTLR start rule__StringFunction__Group_1__3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1881:1: rule__StringFunction__Group_1__3 : rule__StringFunction__Group_1__3__Impl rule__StringFunction__Group_1__4 ;
    public final void rule__StringFunction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1885:1: ( rule__StringFunction__Group_1__3__Impl rule__StringFunction__Group_1__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1886:2: rule__StringFunction__Group_1__3__Impl rule__StringFunction__Group_1__4
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__3__Impl_in_rule__StringFunction__Group_1__33944);
            rule__StringFunction__Group_1__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__4_in_rule__StringFunction__Group_1__33947);
            rule__StringFunction__Group_1__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__3


    // $ANTLR start rule__StringFunction__Group_1__3__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1893:1: rule__StringFunction__Group_1__3__Impl : ( ',' ) ;
    public final void rule__StringFunction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1897:1: ( ( ',' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1898:1: ( ',' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1898:1: ( ',' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1899:1: ','
            {
             before(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_3()); 
            match(input,20,FOLLOW_20_in_rule__StringFunction__Group_1__3__Impl3975); 
             after(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__3__Impl


    // $ANTLR start rule__StringFunction__Group_1__4
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1912:1: rule__StringFunction__Group_1__4 : rule__StringFunction__Group_1__4__Impl rule__StringFunction__Group_1__5 ;
    public final void rule__StringFunction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1916:1: ( rule__StringFunction__Group_1__4__Impl rule__StringFunction__Group_1__5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1917:2: rule__StringFunction__Group_1__4__Impl rule__StringFunction__Group_1__5
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__4__Impl_in_rule__StringFunction__Group_1__44006);
            rule__StringFunction__Group_1__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__5_in_rule__StringFunction__Group_1__44009);
            rule__StringFunction__Group_1__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__4


    // $ANTLR start rule__StringFunction__Group_1__4__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1924:1: rule__StringFunction__Group_1__4__Impl : ( ( rule__StringFunction__MatchAssignment_1_4 ) ) ;
    public final void rule__StringFunction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1928:1: ( ( ( rule__StringFunction__MatchAssignment_1_4 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1929:1: ( ( rule__StringFunction__MatchAssignment_1_4 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1929:1: ( ( rule__StringFunction__MatchAssignment_1_4 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1930:1: ( rule__StringFunction__MatchAssignment_1_4 )
            {
             before(grammarAccess.getStringFunctionAccess().getMatchAssignment_1_4()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1931:1: ( rule__StringFunction__MatchAssignment_1_4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1931:2: rule__StringFunction__MatchAssignment_1_4
            {
            pushFollow(FOLLOW_rule__StringFunction__MatchAssignment_1_4_in_rule__StringFunction__Group_1__4__Impl4036);
            rule__StringFunction__MatchAssignment_1_4();
            _fsp--;


            }

             after(grammarAccess.getStringFunctionAccess().getMatchAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__4__Impl


    // $ANTLR start rule__StringFunction__Group_1__5
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1941:1: rule__StringFunction__Group_1__5 : rule__StringFunction__Group_1__5__Impl rule__StringFunction__Group_1__6 ;
    public final void rule__StringFunction__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1945:1: ( rule__StringFunction__Group_1__5__Impl rule__StringFunction__Group_1__6 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1946:2: rule__StringFunction__Group_1__5__Impl rule__StringFunction__Group_1__6
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__5__Impl_in_rule__StringFunction__Group_1__54066);
            rule__StringFunction__Group_1__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__6_in_rule__StringFunction__Group_1__54069);
            rule__StringFunction__Group_1__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__5


    // $ANTLR start rule__StringFunction__Group_1__5__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1953:1: rule__StringFunction__Group_1__5__Impl : ( ',' ) ;
    public final void rule__StringFunction__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1957:1: ( ( ',' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1958:1: ( ',' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1958:1: ( ',' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1959:1: ','
            {
             before(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_5()); 
            match(input,20,FOLLOW_20_in_rule__StringFunction__Group_1__5__Impl4097); 
             after(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__5__Impl


    // $ANTLR start rule__StringFunction__Group_1__6
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1972:1: rule__StringFunction__Group_1__6 : rule__StringFunction__Group_1__6__Impl rule__StringFunction__Group_1__7 ;
    public final void rule__StringFunction__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1976:1: ( rule__StringFunction__Group_1__6__Impl rule__StringFunction__Group_1__7 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1977:2: rule__StringFunction__Group_1__6__Impl rule__StringFunction__Group_1__7
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__6__Impl_in_rule__StringFunction__Group_1__64128);
            rule__StringFunction__Group_1__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__7_in_rule__StringFunction__Group_1__64131);
            rule__StringFunction__Group_1__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__6


    // $ANTLR start rule__StringFunction__Group_1__6__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1984:1: rule__StringFunction__Group_1__6__Impl : ( ( rule__StringFunction__ReplacementAssignment_1_6 ) ) ;
    public final void rule__StringFunction__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1988:1: ( ( ( rule__StringFunction__ReplacementAssignment_1_6 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1989:1: ( ( rule__StringFunction__ReplacementAssignment_1_6 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1989:1: ( ( rule__StringFunction__ReplacementAssignment_1_6 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1990:1: ( rule__StringFunction__ReplacementAssignment_1_6 )
            {
             before(grammarAccess.getStringFunctionAccess().getReplacementAssignment_1_6()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1991:1: ( rule__StringFunction__ReplacementAssignment_1_6 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1991:2: rule__StringFunction__ReplacementAssignment_1_6
            {
            pushFollow(FOLLOW_rule__StringFunction__ReplacementAssignment_1_6_in_rule__StringFunction__Group_1__6__Impl4158);
            rule__StringFunction__ReplacementAssignment_1_6();
            _fsp--;


            }

             after(grammarAccess.getStringFunctionAccess().getReplacementAssignment_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__6__Impl


    // $ANTLR start rule__StringFunction__Group_1__7
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2001:1: rule__StringFunction__Group_1__7 : rule__StringFunction__Group_1__7__Impl ;
    public final void rule__StringFunction__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2005:1: ( rule__StringFunction__Group_1__7__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2006:2: rule__StringFunction__Group_1__7__Impl
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__7__Impl_in_rule__StringFunction__Group_1__74188);
            rule__StringFunction__Group_1__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__7


    // $ANTLR start rule__StringFunction__Group_1__7__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2012:1: rule__StringFunction__Group_1__7__Impl : ( ')' ) ;
    public final void rule__StringFunction__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2016:1: ( ( ')' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2017:1: ( ')' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2017:1: ( ')' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2018:1: ')'
            {
             before(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_1_7()); 
            match(input,18,FOLLOW_18_in_rule__StringFunction__Group_1__7__Impl4216); 
             after(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_1_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_1__7__Impl


    // $ANTLR start rule__StringFunction__Group_2__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2047:1: rule__StringFunction__Group_2__0 : rule__StringFunction__Group_2__0__Impl rule__StringFunction__Group_2__1 ;
    public final void rule__StringFunction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2051:1: ( rule__StringFunction__Group_2__0__Impl rule__StringFunction__Group_2__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2052:2: rule__StringFunction__Group_2__0__Impl rule__StringFunction__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_2__0__Impl_in_rule__StringFunction__Group_2__04263);
            rule__StringFunction__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_2__1_in_rule__StringFunction__Group_2__04266);
            rule__StringFunction__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_2__0


    // $ANTLR start rule__StringFunction__Group_2__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2059:1: rule__StringFunction__Group_2__0__Impl : ( () ) ;
    public final void rule__StringFunction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2063:1: ( ( () ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2064:1: ( () )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2064:1: ( () )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2065:1: ()
            {
             before(grammarAccess.getStringFunctionAccess().getStringUrlConformAction_2_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2066:1: ()
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2068:1: 
            {
            }

             after(grammarAccess.getStringFunctionAccess().getStringUrlConformAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_2__0__Impl


    // $ANTLR start rule__StringFunction__Group_2__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2078:1: rule__StringFunction__Group_2__1 : rule__StringFunction__Group_2__1__Impl rule__StringFunction__Group_2__2 ;
    public final void rule__StringFunction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2082:1: ( rule__StringFunction__Group_2__1__Impl rule__StringFunction__Group_2__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2083:2: rule__StringFunction__Group_2__1__Impl rule__StringFunction__Group_2__2
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_2__1__Impl_in_rule__StringFunction__Group_2__14324);
            rule__StringFunction__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_2__2_in_rule__StringFunction__Group_2__14327);
            rule__StringFunction__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_2__1


    // $ANTLR start rule__StringFunction__Group_2__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2090:1: rule__StringFunction__Group_2__1__Impl : ( 'urlconform(' ) ;
    public final void rule__StringFunction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2094:1: ( ( 'urlconform(' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2095:1: ( 'urlconform(' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2095:1: ( 'urlconform(' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2096:1: 'urlconform('
            {
             before(grammarAccess.getStringFunctionAccess().getUrlconformKeyword_2_1()); 
            match(input,21,FOLLOW_21_in_rule__StringFunction__Group_2__1__Impl4355); 
             after(grammarAccess.getStringFunctionAccess().getUrlconformKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_2__1__Impl


    // $ANTLR start rule__StringFunction__Group_2__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2109:1: rule__StringFunction__Group_2__2 : rule__StringFunction__Group_2__2__Impl rule__StringFunction__Group_2__3 ;
    public final void rule__StringFunction__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2113:1: ( rule__StringFunction__Group_2__2__Impl rule__StringFunction__Group_2__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2114:2: rule__StringFunction__Group_2__2__Impl rule__StringFunction__Group_2__3
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_2__2__Impl_in_rule__StringFunction__Group_2__24386);
            rule__StringFunction__Group_2__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_2__3_in_rule__StringFunction__Group_2__24389);
            rule__StringFunction__Group_2__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_2__2


    // $ANTLR start rule__StringFunction__Group_2__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2121:1: rule__StringFunction__Group_2__2__Impl : ( ( rule__StringFunction__ValueAssignment_2_2 ) ) ;
    public final void rule__StringFunction__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2125:1: ( ( ( rule__StringFunction__ValueAssignment_2_2 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2126:1: ( ( rule__StringFunction__ValueAssignment_2_2 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2126:1: ( ( rule__StringFunction__ValueAssignment_2_2 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2127:1: ( rule__StringFunction__ValueAssignment_2_2 )
            {
             before(grammarAccess.getStringFunctionAccess().getValueAssignment_2_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2128:1: ( rule__StringFunction__ValueAssignment_2_2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2128:2: rule__StringFunction__ValueAssignment_2_2
            {
            pushFollow(FOLLOW_rule__StringFunction__ValueAssignment_2_2_in_rule__StringFunction__Group_2__2__Impl4416);
            rule__StringFunction__ValueAssignment_2_2();
            _fsp--;


            }

             after(grammarAccess.getStringFunctionAccess().getValueAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_2__2__Impl


    // $ANTLR start rule__StringFunction__Group_2__3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2138:1: rule__StringFunction__Group_2__3 : rule__StringFunction__Group_2__3__Impl ;
    public final void rule__StringFunction__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2142:1: ( rule__StringFunction__Group_2__3__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2143:2: rule__StringFunction__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_2__3__Impl_in_rule__StringFunction__Group_2__34446);
            rule__StringFunction__Group_2__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_2__3


    // $ANTLR start rule__StringFunction__Group_2__3__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2149:1: rule__StringFunction__Group_2__3__Impl : ( ')' ) ;
    public final void rule__StringFunction__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2153:1: ( ( ')' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2154:1: ( ')' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2154:1: ( ')' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2155:1: ')'
            {
             before(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_2_3()); 
            match(input,18,FOLLOW_18_in_rule__StringFunction__Group_2__3__Impl4474); 
             after(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__Group_2__3__Impl


    // $ANTLR start rule__CollectionLiteral__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2176:1: rule__CollectionLiteral__Group__0 : rule__CollectionLiteral__Group__0__Impl rule__CollectionLiteral__Group__1 ;
    public final void rule__CollectionLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2180:1: ( rule__CollectionLiteral__Group__0__Impl rule__CollectionLiteral__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2181:2: rule__CollectionLiteral__Group__0__Impl rule__CollectionLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group__0__Impl_in_rule__CollectionLiteral__Group__04513);
            rule__CollectionLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionLiteral__Group__1_in_rule__CollectionLiteral__Group__04516);
            rule__CollectionLiteral__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group__0


    // $ANTLR start rule__CollectionLiteral__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2188:1: rule__CollectionLiteral__Group__0__Impl : ( '[' ) ;
    public final void rule__CollectionLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2192:1: ( ( '[' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2193:1: ( '[' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2193:1: ( '[' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2194:1: '['
            {
             before(grammarAccess.getCollectionLiteralAccess().getLeftSquareBracketKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__CollectionLiteral__Group__0__Impl4544); 
             after(grammarAccess.getCollectionLiteralAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group__0__Impl


    // $ANTLR start rule__CollectionLiteral__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2207:1: rule__CollectionLiteral__Group__1 : rule__CollectionLiteral__Group__1__Impl rule__CollectionLiteral__Group__2 ;
    public final void rule__CollectionLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2211:1: ( rule__CollectionLiteral__Group__1__Impl rule__CollectionLiteral__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2212:2: rule__CollectionLiteral__Group__1__Impl rule__CollectionLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group__1__Impl_in_rule__CollectionLiteral__Group__14575);
            rule__CollectionLiteral__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionLiteral__Group__2_in_rule__CollectionLiteral__Group__14578);
            rule__CollectionLiteral__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group__1


    // $ANTLR start rule__CollectionLiteral__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2219:1: rule__CollectionLiteral__Group__1__Impl : ( ( rule__CollectionLiteral__ItemsAssignment_1 ) ) ;
    public final void rule__CollectionLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2223:1: ( ( ( rule__CollectionLiteral__ItemsAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2224:1: ( ( rule__CollectionLiteral__ItemsAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2224:1: ( ( rule__CollectionLiteral__ItemsAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2225:1: ( rule__CollectionLiteral__ItemsAssignment_1 )
            {
             before(grammarAccess.getCollectionLiteralAccess().getItemsAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2226:1: ( rule__CollectionLiteral__ItemsAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2226:2: rule__CollectionLiteral__ItemsAssignment_1
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__ItemsAssignment_1_in_rule__CollectionLiteral__Group__1__Impl4605);
            rule__CollectionLiteral__ItemsAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getCollectionLiteralAccess().getItemsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group__1__Impl


    // $ANTLR start rule__CollectionLiteral__Group__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2236:1: rule__CollectionLiteral__Group__2 : rule__CollectionLiteral__Group__2__Impl rule__CollectionLiteral__Group__3 ;
    public final void rule__CollectionLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2240:1: ( rule__CollectionLiteral__Group__2__Impl rule__CollectionLiteral__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2241:2: rule__CollectionLiteral__Group__2__Impl rule__CollectionLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group__2__Impl_in_rule__CollectionLiteral__Group__24635);
            rule__CollectionLiteral__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionLiteral__Group__3_in_rule__CollectionLiteral__Group__24638);
            rule__CollectionLiteral__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group__2


    // $ANTLR start rule__CollectionLiteral__Group__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2248:1: rule__CollectionLiteral__Group__2__Impl : ( ( rule__CollectionLiteral__Group_2__0 )* ) ;
    public final void rule__CollectionLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2252:1: ( ( ( rule__CollectionLiteral__Group_2__0 )* ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2253:1: ( ( rule__CollectionLiteral__Group_2__0 )* )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2253:1: ( ( rule__CollectionLiteral__Group_2__0 )* )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2254:1: ( rule__CollectionLiteral__Group_2__0 )*
            {
             before(grammarAccess.getCollectionLiteralAccess().getGroup_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2255:1: ( rule__CollectionLiteral__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2255:2: rule__CollectionLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CollectionLiteral__Group_2__0_in_rule__CollectionLiteral__Group__2__Impl4665);
            	    rule__CollectionLiteral__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getCollectionLiteralAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group__2__Impl


    // $ANTLR start rule__CollectionLiteral__Group__3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2265:1: rule__CollectionLiteral__Group__3 : rule__CollectionLiteral__Group__3__Impl ;
    public final void rule__CollectionLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2269:1: ( rule__CollectionLiteral__Group__3__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2270:2: rule__CollectionLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group__3__Impl_in_rule__CollectionLiteral__Group__34696);
            rule__CollectionLiteral__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group__3


    // $ANTLR start rule__CollectionLiteral__Group__3__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2276:1: rule__CollectionLiteral__Group__3__Impl : ( ']' ) ;
    public final void rule__CollectionLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2280:1: ( ( ']' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2281:1: ( ']' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2281:1: ( ']' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2282:1: ']'
            {
             before(grammarAccess.getCollectionLiteralAccess().getRightSquareBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__CollectionLiteral__Group__3__Impl4724); 
             after(grammarAccess.getCollectionLiteralAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group__3__Impl


    // $ANTLR start rule__CollectionLiteral__Group_2__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2303:1: rule__CollectionLiteral__Group_2__0 : rule__CollectionLiteral__Group_2__0__Impl rule__CollectionLiteral__Group_2__1 ;
    public final void rule__CollectionLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2307:1: ( rule__CollectionLiteral__Group_2__0__Impl rule__CollectionLiteral__Group_2__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2308:2: rule__CollectionLiteral__Group_2__0__Impl rule__CollectionLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group_2__0__Impl_in_rule__CollectionLiteral__Group_2__04763);
            rule__CollectionLiteral__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionLiteral__Group_2__1_in_rule__CollectionLiteral__Group_2__04766);
            rule__CollectionLiteral__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group_2__0


    // $ANTLR start rule__CollectionLiteral__Group_2__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2315:1: rule__CollectionLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__CollectionLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2319:1: ( ( ',' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2320:1: ( ',' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2320:1: ( ',' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2321:1: ','
            {
             before(grammarAccess.getCollectionLiteralAccess().getCommaKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__CollectionLiteral__Group_2__0__Impl4794); 
             after(grammarAccess.getCollectionLiteralAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group_2__0__Impl


    // $ANTLR start rule__CollectionLiteral__Group_2__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2334:1: rule__CollectionLiteral__Group_2__1 : rule__CollectionLiteral__Group_2__1__Impl ;
    public final void rule__CollectionLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2338:1: ( rule__CollectionLiteral__Group_2__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2339:2: rule__CollectionLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group_2__1__Impl_in_rule__CollectionLiteral__Group_2__14825);
            rule__CollectionLiteral__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group_2__1


    // $ANTLR start rule__CollectionLiteral__Group_2__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2345:1: rule__CollectionLiteral__Group_2__1__Impl : ( ( rule__CollectionLiteral__ItemsAssignment_2_1 ) ) ;
    public final void rule__CollectionLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2349:1: ( ( ( rule__CollectionLiteral__ItemsAssignment_2_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2350:1: ( ( rule__CollectionLiteral__ItemsAssignment_2_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2350:1: ( ( rule__CollectionLiteral__ItemsAssignment_2_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2351:1: ( rule__CollectionLiteral__ItemsAssignment_2_1 )
            {
             before(grammarAccess.getCollectionLiteralAccess().getItemsAssignment_2_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2352:1: ( rule__CollectionLiteral__ItemsAssignment_2_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2352:2: rule__CollectionLiteral__ItemsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__ItemsAssignment_2_1_in_rule__CollectionLiteral__Group_2__1__Impl4852);
            rule__CollectionLiteral__ItemsAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getCollectionLiteralAccess().getItemsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__Group_2__1__Impl


    // $ANTLR start rule__CollectionFunction__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2366:1: rule__CollectionFunction__Group__0 : rule__CollectionFunction__Group__0__Impl rule__CollectionFunction__Group__1 ;
    public final void rule__CollectionFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2370:1: ( rule__CollectionFunction__Group__0__Impl rule__CollectionFunction__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2371:2: rule__CollectionFunction__Group__0__Impl rule__CollectionFunction__Group__1
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__0__Impl_in_rule__CollectionFunction__Group__04886);
            rule__CollectionFunction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionFunction__Group__1_in_rule__CollectionFunction__Group__04889);
            rule__CollectionFunction__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__0


    // $ANTLR start rule__CollectionFunction__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2378:1: rule__CollectionFunction__Group__0__Impl : ( () ) ;
    public final void rule__CollectionFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2382:1: ( ( () ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2383:1: ( () )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2383:1: ( () )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2384:1: ()
            {
             before(grammarAccess.getCollectionFunctionAccess().getStringSplitAction_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2385:1: ()
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2387:1: 
            {
            }

             after(grammarAccess.getCollectionFunctionAccess().getStringSplitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__0__Impl


    // $ANTLR start rule__CollectionFunction__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2397:1: rule__CollectionFunction__Group__1 : rule__CollectionFunction__Group__1__Impl rule__CollectionFunction__Group__2 ;
    public final void rule__CollectionFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2401:1: ( rule__CollectionFunction__Group__1__Impl rule__CollectionFunction__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2402:2: rule__CollectionFunction__Group__1__Impl rule__CollectionFunction__Group__2
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__1__Impl_in_rule__CollectionFunction__Group__14947);
            rule__CollectionFunction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionFunction__Group__2_in_rule__CollectionFunction__Group__14950);
            rule__CollectionFunction__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__1


    // $ANTLR start rule__CollectionFunction__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2409:1: rule__CollectionFunction__Group__1__Impl : ( 'split(' ) ;
    public final void rule__CollectionFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2413:1: ( ( 'split(' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2414:1: ( 'split(' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2414:1: ( 'split(' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2415:1: 'split('
            {
             before(grammarAccess.getCollectionFunctionAccess().getSplitKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__CollectionFunction__Group__1__Impl4978); 
             after(grammarAccess.getCollectionFunctionAccess().getSplitKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__1__Impl


    // $ANTLR start rule__CollectionFunction__Group__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2428:1: rule__CollectionFunction__Group__2 : rule__CollectionFunction__Group__2__Impl rule__CollectionFunction__Group__3 ;
    public final void rule__CollectionFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2432:1: ( rule__CollectionFunction__Group__2__Impl rule__CollectionFunction__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2433:2: rule__CollectionFunction__Group__2__Impl rule__CollectionFunction__Group__3
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__2__Impl_in_rule__CollectionFunction__Group__25009);
            rule__CollectionFunction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionFunction__Group__3_in_rule__CollectionFunction__Group__25012);
            rule__CollectionFunction__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__2


    // $ANTLR start rule__CollectionFunction__Group__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2440:1: rule__CollectionFunction__Group__2__Impl : ( ( rule__CollectionFunction__ValueAssignment_2 ) ) ;
    public final void rule__CollectionFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2444:1: ( ( ( rule__CollectionFunction__ValueAssignment_2 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2445:1: ( ( rule__CollectionFunction__ValueAssignment_2 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2445:1: ( ( rule__CollectionFunction__ValueAssignment_2 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2446:1: ( rule__CollectionFunction__ValueAssignment_2 )
            {
             before(grammarAccess.getCollectionFunctionAccess().getValueAssignment_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2447:1: ( rule__CollectionFunction__ValueAssignment_2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2447:2: rule__CollectionFunction__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__CollectionFunction__ValueAssignment_2_in_rule__CollectionFunction__Group__2__Impl5039);
            rule__CollectionFunction__ValueAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCollectionFunctionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__2__Impl


    // $ANTLR start rule__CollectionFunction__Group__3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2457:1: rule__CollectionFunction__Group__3 : rule__CollectionFunction__Group__3__Impl rule__CollectionFunction__Group__4 ;
    public final void rule__CollectionFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2461:1: ( rule__CollectionFunction__Group__3__Impl rule__CollectionFunction__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2462:2: rule__CollectionFunction__Group__3__Impl rule__CollectionFunction__Group__4
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__3__Impl_in_rule__CollectionFunction__Group__35069);
            rule__CollectionFunction__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionFunction__Group__4_in_rule__CollectionFunction__Group__35072);
            rule__CollectionFunction__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__3


    // $ANTLR start rule__CollectionFunction__Group__3__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2469:1: rule__CollectionFunction__Group__3__Impl : ( ',' ) ;
    public final void rule__CollectionFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2473:1: ( ( ',' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2474:1: ( ',' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2474:1: ( ',' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2475:1: ','
            {
             before(grammarAccess.getCollectionFunctionAccess().getCommaKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__CollectionFunction__Group__3__Impl5100); 
             after(grammarAccess.getCollectionFunctionAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__3__Impl


    // $ANTLR start rule__CollectionFunction__Group__4
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2488:1: rule__CollectionFunction__Group__4 : rule__CollectionFunction__Group__4__Impl rule__CollectionFunction__Group__5 ;
    public final void rule__CollectionFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2492:1: ( rule__CollectionFunction__Group__4__Impl rule__CollectionFunction__Group__5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2493:2: rule__CollectionFunction__Group__4__Impl rule__CollectionFunction__Group__5
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__4__Impl_in_rule__CollectionFunction__Group__45131);
            rule__CollectionFunction__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionFunction__Group__5_in_rule__CollectionFunction__Group__45134);
            rule__CollectionFunction__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__4


    // $ANTLR start rule__CollectionFunction__Group__4__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2500:1: rule__CollectionFunction__Group__4__Impl : ( ( rule__CollectionFunction__DelimiterAssignment_4 ) ) ;
    public final void rule__CollectionFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2504:1: ( ( ( rule__CollectionFunction__DelimiterAssignment_4 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2505:1: ( ( rule__CollectionFunction__DelimiterAssignment_4 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2505:1: ( ( rule__CollectionFunction__DelimiterAssignment_4 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2506:1: ( rule__CollectionFunction__DelimiterAssignment_4 )
            {
             before(grammarAccess.getCollectionFunctionAccess().getDelimiterAssignment_4()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2507:1: ( rule__CollectionFunction__DelimiterAssignment_4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2507:2: rule__CollectionFunction__DelimiterAssignment_4
            {
            pushFollow(FOLLOW_rule__CollectionFunction__DelimiterAssignment_4_in_rule__CollectionFunction__Group__4__Impl5161);
            rule__CollectionFunction__DelimiterAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getCollectionFunctionAccess().getDelimiterAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__4__Impl


    // $ANTLR start rule__CollectionFunction__Group__5
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2517:1: rule__CollectionFunction__Group__5 : rule__CollectionFunction__Group__5__Impl ;
    public final void rule__CollectionFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2521:1: ( rule__CollectionFunction__Group__5__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2522:2: rule__CollectionFunction__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__5__Impl_in_rule__CollectionFunction__Group__55191);
            rule__CollectionFunction__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__5


    // $ANTLR start rule__CollectionFunction__Group__5__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2528:1: rule__CollectionFunction__Group__5__Impl : ( ')' ) ;
    public final void rule__CollectionFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2532:1: ( ( ')' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2533:1: ( ')' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2533:1: ( ')' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2534:1: ')'
            {
             before(grammarAccess.getCollectionFunctionAccess().getRightParenthesisKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__CollectionFunction__Group__5__Impl5219); 
             after(grammarAccess.getCollectionFunctionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__Group__5__Impl


    // $ANTLR start rule__Application__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2559:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2563:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2564:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__05262);
            rule__Application__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__1_in_rule__Application__Group__05265);
            rule__Application__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__0


    // $ANTLR start rule__Application__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2571:1: rule__Application__Group__0__Impl : ( 'application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2575:1: ( ( 'application' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2576:1: ( 'application' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2576:1: ( 'application' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2577:1: 'application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Application__Group__0__Impl5293); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__0__Impl


    // $ANTLR start rule__Application__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2590:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2594:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2595:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__15324);
            rule__Application__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__2_in_rule__Application__Group__15327);
            rule__Application__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__1


    // $ANTLR start rule__Application__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2602:1: rule__Application__Group__1__Impl : ( ( rule__Application__NameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2606:1: ( ( ( rule__Application__NameAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2607:1: ( ( rule__Application__NameAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2607:1: ( ( rule__Application__NameAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2608:1: ( rule__Application__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2609:1: ( rule__Application__NameAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2609:2: rule__Application__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Application__NameAssignment_1_in_rule__Application__Group__1__Impl5354);
            rule__Application__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__1__Impl


    // $ANTLR start rule__Application__Group__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2619:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2623:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2624:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__25384);
            rule__Application__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__3_in_rule__Application__Group__25387);
            rule__Application__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__2


    // $ANTLR start rule__Application__Group__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2631:1: rule__Application__Group__2__Impl : ( '{' ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2635:1: ( ( '{' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2636:1: ( '{' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2636:1: ( '{' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2637:1: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Application__Group__2__Impl5415); 
             after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__2__Impl


    // $ANTLR start rule__Application__Group__3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2650:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2654:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2655:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__35446);
            rule__Application__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__4_in_rule__Application__Group__35449);
            rule__Application__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__3


    // $ANTLR start rule__Application__Group__3__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2662:1: rule__Application__Group__3__Impl : ( ( rule__Application__Group_3__0 )? ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2666:1: ( ( ( rule__Application__Group_3__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2667:1: ( ( rule__Application__Group_3__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2667:1: ( ( rule__Application__Group_3__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2668:1: ( rule__Application__Group_3__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_3()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2669:1: ( rule__Application__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2669:2: rule__Application__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Application__Group_3__0_in_rule__Application__Group__3__Impl5476);
                    rule__Application__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__3__Impl


    // $ANTLR start rule__Application__Group__4
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2679:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2683:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2684:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__45507);
            rule__Application__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__5_in_rule__Application__Group__45510);
            rule__Application__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__4


    // $ANTLR start rule__Application__Group__4__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2691:1: rule__Application__Group__4__Impl : ( ( rule__Application__ButtonsAssignment_4 )* ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2695:1: ( ( ( rule__Application__ButtonsAssignment_4 )* ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2696:1: ( ( rule__Application__ButtonsAssignment_4 )* )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2696:1: ( ( rule__Application__ButtonsAssignment_4 )* )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2697:1: ( rule__Application__ButtonsAssignment_4 )*
            {
             before(grammarAccess.getApplicationAccess().getButtonsAssignment_4()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2698:1: ( rule__Application__ButtonsAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2698:2: rule__Application__ButtonsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Application__ButtonsAssignment_4_in_rule__Application__Group__4__Impl5537);
            	    rule__Application__ButtonsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getButtonsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__4__Impl


    // $ANTLR start rule__Application__Group__5
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2708:1: rule__Application__Group__5 : rule__Application__Group__5__Impl ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2712:1: ( rule__Application__Group__5__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2713:2: rule__Application__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__55568);
            rule__Application__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__5


    // $ANTLR start rule__Application__Group__5__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2719:1: rule__Application__Group__5__Impl : ( '}' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2723:1: ( ( '}' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2724:1: ( '}' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2724:1: ( '}' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2725:1: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_27_in_rule__Application__Group__5__Impl5596); 
             after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__5__Impl


    // $ANTLR start rule__Application__Group_3__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2750:1: rule__Application__Group_3__0 : rule__Application__Group_3__0__Impl rule__Application__Group_3__1 ;
    public final void rule__Application__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2754:1: ( rule__Application__Group_3__0__Impl rule__Application__Group_3__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2755:2: rule__Application__Group_3__0__Impl rule__Application__Group_3__1
            {
            pushFollow(FOLLOW_rule__Application__Group_3__0__Impl_in_rule__Application__Group_3__05639);
            rule__Application__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group_3__1_in_rule__Application__Group_3__05642);
            rule__Application__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group_3__0


    // $ANTLR start rule__Application__Group_3__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2762:1: rule__Application__Group_3__0__Impl : ( 'background=' ) ;
    public final void rule__Application__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2766:1: ( ( 'background=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2767:1: ( 'background=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2767:1: ( 'background=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2768:1: 'background='
            {
             before(grammarAccess.getApplicationAccess().getBackgroundKeyword_3_0()); 
            match(input,28,FOLLOW_28_in_rule__Application__Group_3__0__Impl5670); 
             after(grammarAccess.getApplicationAccess().getBackgroundKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group_3__0__Impl


    // $ANTLR start rule__Application__Group_3__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2781:1: rule__Application__Group_3__1 : rule__Application__Group_3__1__Impl ;
    public final void rule__Application__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2785:1: ( rule__Application__Group_3__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2786:2: rule__Application__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group_3__1__Impl_in_rule__Application__Group_3__15701);
            rule__Application__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group_3__1


    // $ANTLR start rule__Application__Group_3__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2792:1: rule__Application__Group_3__1__Impl : ( ( rule__Application__BackgroundAssignment_3_1 ) ) ;
    public final void rule__Application__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2796:1: ( ( ( rule__Application__BackgroundAssignment_3_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2797:1: ( ( rule__Application__BackgroundAssignment_3_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2797:1: ( ( rule__Application__BackgroundAssignment_3_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2798:1: ( rule__Application__BackgroundAssignment_3_1 )
            {
             before(grammarAccess.getApplicationAccess().getBackgroundAssignment_3_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2799:1: ( rule__Application__BackgroundAssignment_3_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2799:2: rule__Application__BackgroundAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Application__BackgroundAssignment_3_1_in_rule__Application__Group_3__1__Impl5728);
            rule__Application__BackgroundAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getBackgroundAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group_3__1__Impl


    // $ANTLR start rule__TabbarButton__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2813:1: rule__TabbarButton__Group__0 : rule__TabbarButton__Group__0__Impl rule__TabbarButton__Group__1 ;
    public final void rule__TabbarButton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2817:1: ( rule__TabbarButton__Group__0__Impl rule__TabbarButton__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2818:2: rule__TabbarButton__Group__0__Impl rule__TabbarButton__Group__1
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__0__Impl_in_rule__TabbarButton__Group__05762);
            rule__TabbarButton__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__1_in_rule__TabbarButton__Group__05765);
            rule__TabbarButton__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__0


    // $ANTLR start rule__TabbarButton__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2825:1: rule__TabbarButton__Group__0__Impl : ( 'button' ) ;
    public final void rule__TabbarButton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2829:1: ( ( 'button' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2830:1: ( 'button' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2830:1: ( 'button' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2831:1: 'button'
            {
             before(grammarAccess.getTabbarButtonAccess().getButtonKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__TabbarButton__Group__0__Impl5793); 
             after(grammarAccess.getTabbarButtonAccess().getButtonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__0__Impl


    // $ANTLR start rule__TabbarButton__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2844:1: rule__TabbarButton__Group__1 : rule__TabbarButton__Group__1__Impl rule__TabbarButton__Group__2 ;
    public final void rule__TabbarButton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2848:1: ( rule__TabbarButton__Group__1__Impl rule__TabbarButton__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2849:2: rule__TabbarButton__Group__1__Impl rule__TabbarButton__Group__2
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__1__Impl_in_rule__TabbarButton__Group__15824);
            rule__TabbarButton__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__2_in_rule__TabbarButton__Group__15827);
            rule__TabbarButton__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__1


    // $ANTLR start rule__TabbarButton__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2856:1: rule__TabbarButton__Group__1__Impl : ( '{' ) ;
    public final void rule__TabbarButton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2860:1: ( ( '{' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2861:1: ( '{' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2861:1: ( '{' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2862:1: '{'
            {
             before(grammarAccess.getTabbarButtonAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__TabbarButton__Group__1__Impl5855); 
             after(grammarAccess.getTabbarButtonAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__1__Impl


    // $ANTLR start rule__TabbarButton__Group__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2875:1: rule__TabbarButton__Group__2 : rule__TabbarButton__Group__2__Impl rule__TabbarButton__Group__3 ;
    public final void rule__TabbarButton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2879:1: ( rule__TabbarButton__Group__2__Impl rule__TabbarButton__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2880:2: rule__TabbarButton__Group__2__Impl rule__TabbarButton__Group__3
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__2__Impl_in_rule__TabbarButton__Group__25886);
            rule__TabbarButton__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__3_in_rule__TabbarButton__Group__25889);
            rule__TabbarButton__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__2


    // $ANTLR start rule__TabbarButton__Group__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2887:1: rule__TabbarButton__Group__2__Impl : ( 'title=' ) ;
    public final void rule__TabbarButton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2891:1: ( ( 'title=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2892:1: ( 'title=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2892:1: ( 'title=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2893:1: 'title='
            {
             before(grammarAccess.getTabbarButtonAccess().getTitleKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__TabbarButton__Group__2__Impl5917); 
             after(grammarAccess.getTabbarButtonAccess().getTitleKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__2__Impl


    // $ANTLR start rule__TabbarButton__Group__3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2906:1: rule__TabbarButton__Group__3 : rule__TabbarButton__Group__3__Impl rule__TabbarButton__Group__4 ;
    public final void rule__TabbarButton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2910:1: ( rule__TabbarButton__Group__3__Impl rule__TabbarButton__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2911:2: rule__TabbarButton__Group__3__Impl rule__TabbarButton__Group__4
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__3__Impl_in_rule__TabbarButton__Group__35948);
            rule__TabbarButton__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__4_in_rule__TabbarButton__Group__35951);
            rule__TabbarButton__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__3


    // $ANTLR start rule__TabbarButton__Group__3__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2918:1: rule__TabbarButton__Group__3__Impl : ( ( rule__TabbarButton__TitleAssignment_3 ) ) ;
    public final void rule__TabbarButton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2922:1: ( ( ( rule__TabbarButton__TitleAssignment_3 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2923:1: ( ( rule__TabbarButton__TitleAssignment_3 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2923:1: ( ( rule__TabbarButton__TitleAssignment_3 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2924:1: ( rule__TabbarButton__TitleAssignment_3 )
            {
             before(grammarAccess.getTabbarButtonAccess().getTitleAssignment_3()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2925:1: ( rule__TabbarButton__TitleAssignment_3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2925:2: rule__TabbarButton__TitleAssignment_3
            {
            pushFollow(FOLLOW_rule__TabbarButton__TitleAssignment_3_in_rule__TabbarButton__Group__3__Impl5978);
            rule__TabbarButton__TitleAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getTabbarButtonAccess().getTitleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__3__Impl


    // $ANTLR start rule__TabbarButton__Group__4
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2935:1: rule__TabbarButton__Group__4 : rule__TabbarButton__Group__4__Impl rule__TabbarButton__Group__5 ;
    public final void rule__TabbarButton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2939:1: ( rule__TabbarButton__Group__4__Impl rule__TabbarButton__Group__5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2940:2: rule__TabbarButton__Group__4__Impl rule__TabbarButton__Group__5
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__4__Impl_in_rule__TabbarButton__Group__46008);
            rule__TabbarButton__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__5_in_rule__TabbarButton__Group__46011);
            rule__TabbarButton__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__4


    // $ANTLR start rule__TabbarButton__Group__4__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2947:1: rule__TabbarButton__Group__4__Impl : ( 'icon=' ) ;
    public final void rule__TabbarButton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2951:1: ( ( 'icon=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2952:1: ( 'icon=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2952:1: ( 'icon=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2953:1: 'icon='
            {
             before(grammarAccess.getTabbarButtonAccess().getIconKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__TabbarButton__Group__4__Impl6039); 
             after(grammarAccess.getTabbarButtonAccess().getIconKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__4__Impl


    // $ANTLR start rule__TabbarButton__Group__5
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2966:1: rule__TabbarButton__Group__5 : rule__TabbarButton__Group__5__Impl rule__TabbarButton__Group__6 ;
    public final void rule__TabbarButton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2970:1: ( rule__TabbarButton__Group__5__Impl rule__TabbarButton__Group__6 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2971:2: rule__TabbarButton__Group__5__Impl rule__TabbarButton__Group__6
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__5__Impl_in_rule__TabbarButton__Group__56070);
            rule__TabbarButton__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__6_in_rule__TabbarButton__Group__56073);
            rule__TabbarButton__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__5


    // $ANTLR start rule__TabbarButton__Group__5__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2978:1: rule__TabbarButton__Group__5__Impl : ( ( rule__TabbarButton__IconAssignment_5 ) ) ;
    public final void rule__TabbarButton__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2982:1: ( ( ( rule__TabbarButton__IconAssignment_5 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2983:1: ( ( rule__TabbarButton__IconAssignment_5 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2983:1: ( ( rule__TabbarButton__IconAssignment_5 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2984:1: ( rule__TabbarButton__IconAssignment_5 )
            {
             before(grammarAccess.getTabbarButtonAccess().getIconAssignment_5()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2985:1: ( rule__TabbarButton__IconAssignment_5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2985:2: rule__TabbarButton__IconAssignment_5
            {
            pushFollow(FOLLOW_rule__TabbarButton__IconAssignment_5_in_rule__TabbarButton__Group__5__Impl6100);
            rule__TabbarButton__IconAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getTabbarButtonAccess().getIconAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__5__Impl


    // $ANTLR start rule__TabbarButton__Group__6
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2995:1: rule__TabbarButton__Group__6 : rule__TabbarButton__Group__6__Impl rule__TabbarButton__Group__7 ;
    public final void rule__TabbarButton__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2999:1: ( rule__TabbarButton__Group__6__Impl rule__TabbarButton__Group__7 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3000:2: rule__TabbarButton__Group__6__Impl rule__TabbarButton__Group__7
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__6__Impl_in_rule__TabbarButton__Group__66130);
            rule__TabbarButton__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__7_in_rule__TabbarButton__Group__66133);
            rule__TabbarButton__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__6


    // $ANTLR start rule__TabbarButton__Group__6__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3007:1: rule__TabbarButton__Group__6__Impl : ( 'view=' ) ;
    public final void rule__TabbarButton__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3011:1: ( ( 'view=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3012:1: ( 'view=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3012:1: ( 'view=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3013:1: 'view='
            {
             before(grammarAccess.getTabbarButtonAccess().getViewKeyword_6()); 
            match(input,32,FOLLOW_32_in_rule__TabbarButton__Group__6__Impl6161); 
             after(grammarAccess.getTabbarButtonAccess().getViewKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__6__Impl


    // $ANTLR start rule__TabbarButton__Group__7
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3026:1: rule__TabbarButton__Group__7 : rule__TabbarButton__Group__7__Impl rule__TabbarButton__Group__8 ;
    public final void rule__TabbarButton__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3030:1: ( rule__TabbarButton__Group__7__Impl rule__TabbarButton__Group__8 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3031:2: rule__TabbarButton__Group__7__Impl rule__TabbarButton__Group__8
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__7__Impl_in_rule__TabbarButton__Group__76192);
            rule__TabbarButton__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__8_in_rule__TabbarButton__Group__76195);
            rule__TabbarButton__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__7


    // $ANTLR start rule__TabbarButton__Group__7__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3038:1: rule__TabbarButton__Group__7__Impl : ( ( rule__TabbarButton__ViewAssignment_7 ) ) ;
    public final void rule__TabbarButton__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3042:1: ( ( ( rule__TabbarButton__ViewAssignment_7 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3043:1: ( ( rule__TabbarButton__ViewAssignment_7 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3043:1: ( ( rule__TabbarButton__ViewAssignment_7 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3044:1: ( rule__TabbarButton__ViewAssignment_7 )
            {
             before(grammarAccess.getTabbarButtonAccess().getViewAssignment_7()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3045:1: ( rule__TabbarButton__ViewAssignment_7 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3045:2: rule__TabbarButton__ViewAssignment_7
            {
            pushFollow(FOLLOW_rule__TabbarButton__ViewAssignment_7_in_rule__TabbarButton__Group__7__Impl6222);
            rule__TabbarButton__ViewAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getTabbarButtonAccess().getViewAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__7__Impl


    // $ANTLR start rule__TabbarButton__Group__8
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3055:1: rule__TabbarButton__Group__8 : rule__TabbarButton__Group__8__Impl ;
    public final void rule__TabbarButton__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3059:1: ( rule__TabbarButton__Group__8__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3060:2: rule__TabbarButton__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__8__Impl_in_rule__TabbarButton__Group__86252);
            rule__TabbarButton__Group__8__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__8


    // $ANTLR start rule__TabbarButton__Group__8__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3066:1: rule__TabbarButton__Group__8__Impl : ( '}' ) ;
    public final void rule__TabbarButton__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3070:1: ( ( '}' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3071:1: ( '}' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3071:1: ( '}' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3072:1: '}'
            {
             before(grammarAccess.getTabbarButtonAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_27_in_rule__TabbarButton__Group__8__Impl6280); 
             after(grammarAccess.getTabbarButtonAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__Group__8__Impl


    // $ANTLR start rule__SimpleType__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3103:1: rule__SimpleType__Group__0 : rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3107:1: ( rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3108:2: rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0__Impl_in_rule__SimpleType__Group__06329);
            rule__SimpleType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__06332);
            rule__SimpleType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__0


    // $ANTLR start rule__SimpleType__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3115:1: rule__SimpleType__Group__0__Impl : ( 'type' ) ;
    public final void rule__SimpleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3119:1: ( ( 'type' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3120:1: ( 'type' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3120:1: ( 'type' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3121:1: 'type'
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__SimpleType__Group__0__Impl6360); 
             after(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__0__Impl


    // $ANTLR start rule__SimpleType__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3134:1: rule__SimpleType__Group__1 : rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2 ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3138:1: ( rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3139:2: rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__1__Impl_in_rule__SimpleType__Group__16391);
            rule__SimpleType__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__16394);
            rule__SimpleType__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__1


    // $ANTLR start rule__SimpleType__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3146:1: rule__SimpleType__Group__1__Impl : ( ( rule__SimpleType__NameAssignment_1 ) ) ;
    public final void rule__SimpleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3150:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3151:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3151:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3152:1: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3153:1: ( rule__SimpleType__NameAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3153:2: rule__SimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1__Impl6421);
            rule__SimpleType__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__1__Impl


    // $ANTLR start rule__SimpleType__Group__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3163:1: rule__SimpleType__Group__2 : rule__SimpleType__Group__2__Impl rule__SimpleType__Group__3 ;
    public final void rule__SimpleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3167:1: ( rule__SimpleType__Group__2__Impl rule__SimpleType__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3168:2: rule__SimpleType__Group__2__Impl rule__SimpleType__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__2__Impl_in_rule__SimpleType__Group__26451);
            rule__SimpleType__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__3_in_rule__SimpleType__Group__26454);
            rule__SimpleType__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__2


    // $ANTLR start rule__SimpleType__Group__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3175:1: rule__SimpleType__Group__2__Impl : ( 'mapsTo' ) ;
    public final void rule__SimpleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3179:1: ( ( 'mapsTo' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3180:1: ( 'mapsTo' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3180:1: ( 'mapsTo' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3181:1: 'mapsTo'
            {
             before(grammarAccess.getSimpleTypeAccess().getMapsToKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__SimpleType__Group__2__Impl6482); 
             after(grammarAccess.getSimpleTypeAccess().getMapsToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__2__Impl


    // $ANTLR start rule__SimpleType__Group__3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3194:1: rule__SimpleType__Group__3 : rule__SimpleType__Group__3__Impl ;
    public final void rule__SimpleType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3198:1: ( rule__SimpleType__Group__3__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3199:2: rule__SimpleType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__3__Impl_in_rule__SimpleType__Group__36513);
            rule__SimpleType__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__3


    // $ANTLR start rule__SimpleType__Group__3__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3205:1: rule__SimpleType__Group__3__Impl : ( ( rule__SimpleType__PlatformTypeAssignment_3 ) ) ;
    public final void rule__SimpleType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3209:1: ( ( ( rule__SimpleType__PlatformTypeAssignment_3 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3210:1: ( ( rule__SimpleType__PlatformTypeAssignment_3 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3210:1: ( ( rule__SimpleType__PlatformTypeAssignment_3 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3211:1: ( rule__SimpleType__PlatformTypeAssignment_3 )
            {
             before(grammarAccess.getSimpleTypeAccess().getPlatformTypeAssignment_3()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3212:1: ( rule__SimpleType__PlatformTypeAssignment_3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3212:2: rule__SimpleType__PlatformTypeAssignment_3
            {
            pushFollow(FOLLOW_rule__SimpleType__PlatformTypeAssignment_3_in_rule__SimpleType__Group__3__Impl6540);
            rule__SimpleType__PlatformTypeAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getPlatformTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__Group__3__Impl


    // $ANTLR start rule__Entity__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3230:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3234:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3235:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__06578);
            rule__Entity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__06581);
            rule__Entity__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0


    // $ANTLR start rule__Entity__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3242:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3246:1: ( ( 'entity' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3247:1: ( 'entity' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3247:1: ( 'entity' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3248:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Entity__Group__0__Impl6609); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0__Impl


    // $ANTLR start rule__Entity__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3261:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3265:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3266:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__16640);
            rule__Entity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__16643);
            rule__Entity__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1


    // $ANTLR start rule__Entity__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3273:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3277:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3278:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3278:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3279:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3280:1: ( rule__Entity__NameAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3280:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl6670);
            rule__Entity__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1__Impl


    // $ANTLR start rule__Entity__Group__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3290:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3294:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3295:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__26700);
            rule__Entity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__26703);
            rule__Entity__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__2


    // $ANTLR start rule__Entity__Group__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3302:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3306:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3307:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3307:1: ( ( rule__Entity__Group_2__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3308:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3309:1: ( rule__Entity__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3309:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl6730);
                    rule__Entity__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__2__Impl


    // $ANTLR start rule__Entity__Group__3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3319:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3323:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3324:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__36761);
            rule__Entity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__36764);
            rule__Entity__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__3


    // $ANTLR start rule__Entity__Group__3__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3331:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3335:1: ( ( '{' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3336:1: ( '{' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3336:1: ( '{' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3337:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Entity__Group__3__Impl6792); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__3__Impl


    // $ANTLR start rule__Entity__Group__4
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3350:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3354:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3355:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__46823);
            rule__Entity__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__46826);
            rule__Entity__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__4


    // $ANTLR start rule__Entity__Group__4__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3362:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__PropertiesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3366:1: ( ( ( rule__Entity__PropertiesAssignment_4 )* ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3367:1: ( ( rule__Entity__PropertiesAssignment_4 )* )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3367:1: ( ( rule__Entity__PropertiesAssignment_4 )* )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3368:1: ( rule__Entity__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getPropertiesAssignment_4()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3369:1: ( rule__Entity__PropertiesAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==58) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3369:2: rule__Entity__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__PropertiesAssignment_4_in_rule__Entity__Group__4__Impl6853);
            	    rule__Entity__PropertiesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getPropertiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__4__Impl


    // $ANTLR start rule__Entity__Group__5
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3379:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3383:1: ( rule__Entity__Group__5__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3384:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__56884);
            rule__Entity__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__5


    // $ANTLR start rule__Entity__Group__5__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3390:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3394:1: ( ( '}' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3395:1: ( '}' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3395:1: ( '}' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3396:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_27_in_rule__Entity__Group__5__Impl6912); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__5__Impl


    // $ANTLR start rule__Entity__Group_2__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3421:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3425:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3426:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__06955);
            rule__Entity__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__06958);
            rule__Entity__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__0


    // $ANTLR start rule__Entity__Group_2__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3433:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3437:1: ( ( 'extends' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3438:1: ( 'extends' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3438:1: ( 'extends' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3439:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,36,FOLLOW_36_in_rule__Entity__Group_2__0__Impl6986); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__0__Impl


    // $ANTLR start rule__Entity__Group_2__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3452:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3456:1: ( rule__Entity__Group_2__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3457:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__17017);
            rule__Entity__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__1


    // $ANTLR start rule__Entity__Group_2__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3463:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__ExtendsAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3467:1: ( ( ( rule__Entity__ExtendsAssignment_2_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3468:1: ( ( rule__Entity__ExtendsAssignment_2_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3468:1: ( ( rule__Entity__ExtendsAssignment_2_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3469:1: ( rule__Entity__ExtendsAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getExtendsAssignment_2_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3470:1: ( rule__Entity__ExtendsAssignment_2_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3470:2: rule__Entity__ExtendsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__ExtendsAssignment_2_1_in_rule__Entity__Group_2__1__Impl7044);
            rule__Entity__ExtendsAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getExtendsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__1__Impl


    // $ANTLR start rule__Property__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3484:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3488:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3489:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__07078);
            rule__Property__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__07081);
            rule__Property__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__0


    // $ANTLR start rule__Property__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3496:1: rule__Property__Group__0__Impl : ( ( rule__Property__DerivedAssignment_0 )? ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3500:1: ( ( ( rule__Property__DerivedAssignment_0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3501:1: ( ( rule__Property__DerivedAssignment_0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3501:1: ( ( rule__Property__DerivedAssignment_0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3502:1: ( rule__Property__DerivedAssignment_0 )?
            {
             before(grammarAccess.getPropertyAccess().getDerivedAssignment_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3503:1: ( rule__Property__DerivedAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==58) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3503:2: rule__Property__DerivedAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Property__DerivedAssignment_0_in_rule__Property__Group__0__Impl7108);
                    rule__Property__DerivedAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getDerivedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__0__Impl


    // $ANTLR start rule__Property__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3513:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3517:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3518:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__17139);
            rule__Property__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__17142);
            rule__Property__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__1


    // $ANTLR start rule__Property__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3525:1: rule__Property__Group__1__Impl : ( ( rule__Property__DescriptionAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3529:1: ( ( ( rule__Property__DescriptionAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3530:1: ( ( rule__Property__DescriptionAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3530:1: ( ( rule__Property__DescriptionAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3531:1: ( rule__Property__DescriptionAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getDescriptionAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3532:1: ( rule__Property__DescriptionAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3532:2: rule__Property__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__DescriptionAssignment_1_in_rule__Property__Group__1__Impl7169);
            rule__Property__DescriptionAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__1__Impl


    // $ANTLR start rule__Property__Group__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3542:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3546:1: ( rule__Property__Group__2__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3547:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__27199);
            rule__Property__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__2


    // $ANTLR start rule__Property__Group__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3553:1: rule__Property__Group__2__Impl : ( ( rule__Property__NameAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3557:1: ( ( ( rule__Property__NameAssignment_2 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3558:1: ( ( rule__Property__NameAssignment_2 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3558:1: ( ( rule__Property__NameAssignment_2 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3559:1: ( rule__Property__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3560:1: ( rule__Property__NameAssignment_2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3560:2: rule__Property__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_2_in_rule__Property__Group__2__Impl7226);
            rule__Property__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__2__Impl


    // $ANTLR start rule__ContentProvider__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3576:1: rule__ContentProvider__Group__0 : rule__ContentProvider__Group__0__Impl rule__ContentProvider__Group__1 ;
    public final void rule__ContentProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3580:1: ( rule__ContentProvider__Group__0__Impl rule__ContentProvider__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3581:2: rule__ContentProvider__Group__0__Impl rule__ContentProvider__Group__1
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__0__Impl_in_rule__ContentProvider__Group__07262);
            rule__ContentProvider__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__1_in_rule__ContentProvider__Group__07265);
            rule__ContentProvider__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__0


    // $ANTLR start rule__ContentProvider__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3588:1: rule__ContentProvider__Group__0__Impl : ( 'contentprovider' ) ;
    public final void rule__ContentProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3592:1: ( ( 'contentprovider' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3593:1: ( 'contentprovider' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3593:1: ( 'contentprovider' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3594:1: 'contentprovider'
            {
             before(grammarAccess.getContentProviderAccess().getContentproviderKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__ContentProvider__Group__0__Impl7293); 
             after(grammarAccess.getContentProviderAccess().getContentproviderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__0__Impl


    // $ANTLR start rule__ContentProvider__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3607:1: rule__ContentProvider__Group__1 : rule__ContentProvider__Group__1__Impl rule__ContentProvider__Group__2 ;
    public final void rule__ContentProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3611:1: ( rule__ContentProvider__Group__1__Impl rule__ContentProvider__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3612:2: rule__ContentProvider__Group__1__Impl rule__ContentProvider__Group__2
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__1__Impl_in_rule__ContentProvider__Group__17324);
            rule__ContentProvider__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__2_in_rule__ContentProvider__Group__17327);
            rule__ContentProvider__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__1


    // $ANTLR start rule__ContentProvider__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3619:1: rule__ContentProvider__Group__1__Impl : ( ( rule__ContentProvider__NameAssignment_1 ) ) ;
    public final void rule__ContentProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3623:1: ( ( ( rule__ContentProvider__NameAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3624:1: ( ( rule__ContentProvider__NameAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3624:1: ( ( rule__ContentProvider__NameAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3625:1: ( rule__ContentProvider__NameAssignment_1 )
            {
             before(grammarAccess.getContentProviderAccess().getNameAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3626:1: ( rule__ContentProvider__NameAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3626:2: rule__ContentProvider__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ContentProvider__NameAssignment_1_in_rule__ContentProvider__Group__1__Impl7354);
            rule__ContentProvider__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getContentProviderAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__1__Impl


    // $ANTLR start rule__ContentProvider__Group__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3636:1: rule__ContentProvider__Group__2 : rule__ContentProvider__Group__2__Impl rule__ContentProvider__Group__3 ;
    public final void rule__ContentProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3640:1: ( rule__ContentProvider__Group__2__Impl rule__ContentProvider__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3641:2: rule__ContentProvider__Group__2__Impl rule__ContentProvider__Group__3
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__2__Impl_in_rule__ContentProvider__Group__27384);
            rule__ContentProvider__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__3_in_rule__ContentProvider__Group__27387);
            rule__ContentProvider__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__2


    // $ANTLR start rule__ContentProvider__Group__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3648:1: rule__ContentProvider__Group__2__Impl : ( ( rule__ContentProvider__Group_2__0 )? ) ;
    public final void rule__ContentProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3652:1: ( ( ( rule__ContentProvider__Group_2__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3653:1: ( ( rule__ContentProvider__Group_2__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3653:1: ( ( rule__ContentProvider__Group_2__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3654:1: ( rule__ContentProvider__Group_2__0 )?
            {
             before(grammarAccess.getContentProviderAccess().getGroup_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3655:1: ( rule__ContentProvider__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3655:2: rule__ContentProvider__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ContentProvider__Group_2__0_in_rule__ContentProvider__Group__2__Impl7414);
                    rule__ContentProvider__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentProviderAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__2__Impl


    // $ANTLR start rule__ContentProvider__Group__3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3665:1: rule__ContentProvider__Group__3 : rule__ContentProvider__Group__3__Impl rule__ContentProvider__Group__4 ;
    public final void rule__ContentProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3669:1: ( rule__ContentProvider__Group__3__Impl rule__ContentProvider__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3670:2: rule__ContentProvider__Group__3__Impl rule__ContentProvider__Group__4
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__3__Impl_in_rule__ContentProvider__Group__37445);
            rule__ContentProvider__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__4_in_rule__ContentProvider__Group__37448);
            rule__ContentProvider__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__3


    // $ANTLR start rule__ContentProvider__Group__3__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3677:1: rule__ContentProvider__Group__3__Impl : ( 'returns' ) ;
    public final void rule__ContentProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3681:1: ( ( 'returns' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3682:1: ( 'returns' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3682:1: ( 'returns' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3683:1: 'returns'
            {
             before(grammarAccess.getContentProviderAccess().getReturnsKeyword_3()); 
            match(input,38,FOLLOW_38_in_rule__ContentProvider__Group__3__Impl7476); 
             after(grammarAccess.getContentProviderAccess().getReturnsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__3__Impl


    // $ANTLR start rule__ContentProvider__Group__4
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3696:1: rule__ContentProvider__Group__4 : rule__ContentProvider__Group__4__Impl rule__ContentProvider__Group__5 ;
    public final void rule__ContentProvider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3700:1: ( rule__ContentProvider__Group__4__Impl rule__ContentProvider__Group__5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3701:2: rule__ContentProvider__Group__4__Impl rule__ContentProvider__Group__5
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__4__Impl_in_rule__ContentProvider__Group__47507);
            rule__ContentProvider__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__5_in_rule__ContentProvider__Group__47510);
            rule__ContentProvider__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__4


    // $ANTLR start rule__ContentProvider__Group__4__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3708:1: rule__ContentProvider__Group__4__Impl : ( ( rule__ContentProvider__TypeAssignment_4 ) ) ;
    public final void rule__ContentProvider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3712:1: ( ( ( rule__ContentProvider__TypeAssignment_4 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3713:1: ( ( rule__ContentProvider__TypeAssignment_4 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3713:1: ( ( rule__ContentProvider__TypeAssignment_4 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3714:1: ( rule__ContentProvider__TypeAssignment_4 )
            {
             before(grammarAccess.getContentProviderAccess().getTypeAssignment_4()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3715:1: ( rule__ContentProvider__TypeAssignment_4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3715:2: rule__ContentProvider__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__ContentProvider__TypeAssignment_4_in_rule__ContentProvider__Group__4__Impl7537);
            rule__ContentProvider__TypeAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getContentProviderAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__4__Impl


    // $ANTLR start rule__ContentProvider__Group__5
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3725:1: rule__ContentProvider__Group__5 : rule__ContentProvider__Group__5__Impl rule__ContentProvider__Group__6 ;
    public final void rule__ContentProvider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3729:1: ( rule__ContentProvider__Group__5__Impl rule__ContentProvider__Group__6 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3730:2: rule__ContentProvider__Group__5__Impl rule__ContentProvider__Group__6
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__5__Impl_in_rule__ContentProvider__Group__57567);
            rule__ContentProvider__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__6_in_rule__ContentProvider__Group__57570);
            rule__ContentProvider__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__5


    // $ANTLR start rule__ContentProvider__Group__5__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3737:1: rule__ContentProvider__Group__5__Impl : ( ( rule__ContentProvider__ManyAssignment_5 )? ) ;
    public final void rule__ContentProvider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3741:1: ( ( ( rule__ContentProvider__ManyAssignment_5 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3742:1: ( ( rule__ContentProvider__ManyAssignment_5 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3742:1: ( ( rule__ContentProvider__ManyAssignment_5 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3743:1: ( rule__ContentProvider__ManyAssignment_5 )?
            {
             before(grammarAccess.getContentProviderAccess().getManyAssignment_5()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3744:1: ( rule__ContentProvider__ManyAssignment_5 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==57) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3744:2: rule__ContentProvider__ManyAssignment_5
                    {
                    pushFollow(FOLLOW_rule__ContentProvider__ManyAssignment_5_in_rule__ContentProvider__Group__5__Impl7597);
                    rule__ContentProvider__ManyAssignment_5();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentProviderAccess().getManyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__5__Impl


    // $ANTLR start rule__ContentProvider__Group__6
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3754:1: rule__ContentProvider__Group__6 : rule__ContentProvider__Group__6__Impl rule__ContentProvider__Group__7 ;
    public final void rule__ContentProvider__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3758:1: ( rule__ContentProvider__Group__6__Impl rule__ContentProvider__Group__7 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3759:2: rule__ContentProvider__Group__6__Impl rule__ContentProvider__Group__7
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__6__Impl_in_rule__ContentProvider__Group__67628);
            rule__ContentProvider__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__7_in_rule__ContentProvider__Group__67631);
            rule__ContentProvider__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__6


    // $ANTLR start rule__ContentProvider__Group__6__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3766:1: rule__ContentProvider__Group__6__Impl : ( 'fetches' ) ;
    public final void rule__ContentProvider__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3770:1: ( ( 'fetches' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3771:1: ( 'fetches' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3771:1: ( 'fetches' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3772:1: 'fetches'
            {
             before(grammarAccess.getContentProviderAccess().getFetchesKeyword_6()); 
            match(input,39,FOLLOW_39_in_rule__ContentProvider__Group__6__Impl7659); 
             after(grammarAccess.getContentProviderAccess().getFetchesKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__6__Impl


    // $ANTLR start rule__ContentProvider__Group__7
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3785:1: rule__ContentProvider__Group__7 : rule__ContentProvider__Group__7__Impl rule__ContentProvider__Group__8 ;
    public final void rule__ContentProvider__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3789:1: ( rule__ContentProvider__Group__7__Impl rule__ContentProvider__Group__8 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3790:2: rule__ContentProvider__Group__7__Impl rule__ContentProvider__Group__8
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__7__Impl_in_rule__ContentProvider__Group__77690);
            rule__ContentProvider__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__8_in_rule__ContentProvider__Group__77693);
            rule__ContentProvider__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__7


    // $ANTLR start rule__ContentProvider__Group__7__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3797:1: rule__ContentProvider__Group__7__Impl : ( 'XML' ) ;
    public final void rule__ContentProvider__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3801:1: ( ( 'XML' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3802:1: ( 'XML' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3802:1: ( 'XML' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3803:1: 'XML'
            {
             before(grammarAccess.getContentProviderAccess().getXMLKeyword_7()); 
            match(input,40,FOLLOW_40_in_rule__ContentProvider__Group__7__Impl7721); 
             after(grammarAccess.getContentProviderAccess().getXMLKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__7__Impl


    // $ANTLR start rule__ContentProvider__Group__8
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3816:1: rule__ContentProvider__Group__8 : rule__ContentProvider__Group__8__Impl rule__ContentProvider__Group__9 ;
    public final void rule__ContentProvider__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3820:1: ( rule__ContentProvider__Group__8__Impl rule__ContentProvider__Group__9 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3821:2: rule__ContentProvider__Group__8__Impl rule__ContentProvider__Group__9
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__8__Impl_in_rule__ContentProvider__Group__87752);
            rule__ContentProvider__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__9_in_rule__ContentProvider__Group__87755);
            rule__ContentProvider__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__8


    // $ANTLR start rule__ContentProvider__Group__8__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3828:1: rule__ContentProvider__Group__8__Impl : ( 'from' ) ;
    public final void rule__ContentProvider__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3832:1: ( ( 'from' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3833:1: ( 'from' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3833:1: ( 'from' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3834:1: 'from'
            {
             before(grammarAccess.getContentProviderAccess().getFromKeyword_8()); 
            match(input,41,FOLLOW_41_in_rule__ContentProvider__Group__8__Impl7783); 
             after(grammarAccess.getContentProviderAccess().getFromKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__8__Impl


    // $ANTLR start rule__ContentProvider__Group__9
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3847:1: rule__ContentProvider__Group__9 : rule__ContentProvider__Group__9__Impl rule__ContentProvider__Group__10 ;
    public final void rule__ContentProvider__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3851:1: ( rule__ContentProvider__Group__9__Impl rule__ContentProvider__Group__10 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3852:2: rule__ContentProvider__Group__9__Impl rule__ContentProvider__Group__10
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__9__Impl_in_rule__ContentProvider__Group__97814);
            rule__ContentProvider__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__10_in_rule__ContentProvider__Group__97817);
            rule__ContentProvider__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__9


    // $ANTLR start rule__ContentProvider__Group__9__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3859:1: rule__ContentProvider__Group__9__Impl : ( ( rule__ContentProvider__UrlAssignment_9 ) ) ;
    public final void rule__ContentProvider__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3863:1: ( ( ( rule__ContentProvider__UrlAssignment_9 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3864:1: ( ( rule__ContentProvider__UrlAssignment_9 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3864:1: ( ( rule__ContentProvider__UrlAssignment_9 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3865:1: ( rule__ContentProvider__UrlAssignment_9 )
            {
             before(grammarAccess.getContentProviderAccess().getUrlAssignment_9()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3866:1: ( rule__ContentProvider__UrlAssignment_9 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3866:2: rule__ContentProvider__UrlAssignment_9
            {
            pushFollow(FOLLOW_rule__ContentProvider__UrlAssignment_9_in_rule__ContentProvider__Group__9__Impl7844);
            rule__ContentProvider__UrlAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getContentProviderAccess().getUrlAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__9__Impl


    // $ANTLR start rule__ContentProvider__Group__10
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3876:1: rule__ContentProvider__Group__10 : rule__ContentProvider__Group__10__Impl rule__ContentProvider__Group__11 ;
    public final void rule__ContentProvider__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3880:1: ( rule__ContentProvider__Group__10__Impl rule__ContentProvider__Group__11 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3881:2: rule__ContentProvider__Group__10__Impl rule__ContentProvider__Group__11
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__10__Impl_in_rule__ContentProvider__Group__107874);
            rule__ContentProvider__Group__10__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__11_in_rule__ContentProvider__Group__107877);
            rule__ContentProvider__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__10


    // $ANTLR start rule__ContentProvider__Group__10__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3888:1: rule__ContentProvider__Group__10__Impl : ( 'selects' ) ;
    public final void rule__ContentProvider__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3892:1: ( ( 'selects' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3893:1: ( 'selects' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3893:1: ( 'selects' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3894:1: 'selects'
            {
             before(grammarAccess.getContentProviderAccess().getSelectsKeyword_10()); 
            match(input,42,FOLLOW_42_in_rule__ContentProvider__Group__10__Impl7905); 
             after(grammarAccess.getContentProviderAccess().getSelectsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__10__Impl


    // $ANTLR start rule__ContentProvider__Group__11
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3907:1: rule__ContentProvider__Group__11 : rule__ContentProvider__Group__11__Impl ;
    public final void rule__ContentProvider__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3911:1: ( rule__ContentProvider__Group__11__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3912:2: rule__ContentProvider__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__11__Impl_in_rule__ContentProvider__Group__117936);
            rule__ContentProvider__Group__11__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__11


    // $ANTLR start rule__ContentProvider__Group__11__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3918:1: rule__ContentProvider__Group__11__Impl : ( ( rule__ContentProvider__SelectionAssignment_11 ) ) ;
    public final void rule__ContentProvider__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3922:1: ( ( ( rule__ContentProvider__SelectionAssignment_11 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3923:1: ( ( rule__ContentProvider__SelectionAssignment_11 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3923:1: ( ( rule__ContentProvider__SelectionAssignment_11 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3924:1: ( rule__ContentProvider__SelectionAssignment_11 )
            {
             before(grammarAccess.getContentProviderAccess().getSelectionAssignment_11()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3925:1: ( rule__ContentProvider__SelectionAssignment_11 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3925:2: rule__ContentProvider__SelectionAssignment_11
            {
            pushFollow(FOLLOW_rule__ContentProvider__SelectionAssignment_11_in_rule__ContentProvider__Group__11__Impl7963);
            rule__ContentProvider__SelectionAssignment_11();
            _fsp--;


            }

             after(grammarAccess.getContentProviderAccess().getSelectionAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group__11__Impl


    // $ANTLR start rule__ContentProvider__Group_2__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3959:1: rule__ContentProvider__Group_2__0 : rule__ContentProvider__Group_2__0__Impl rule__ContentProvider__Group_2__1 ;
    public final void rule__ContentProvider__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3963:1: ( rule__ContentProvider__Group_2__0__Impl rule__ContentProvider__Group_2__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3964:2: rule__ContentProvider__Group_2__0__Impl rule__ContentProvider__Group_2__1
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group_2__0__Impl_in_rule__ContentProvider__Group_2__08017);
            rule__ContentProvider__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group_2__1_in_rule__ContentProvider__Group_2__08020);
            rule__ContentProvider__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group_2__0


    // $ANTLR start rule__ContentProvider__Group_2__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3971:1: rule__ContentProvider__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ContentProvider__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3975:1: ( ( '(' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3976:1: ( '(' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3976:1: ( '(' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3977:1: '('
            {
             before(grammarAccess.getContentProviderAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__ContentProvider__Group_2__0__Impl8048); 
             after(grammarAccess.getContentProviderAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group_2__0__Impl


    // $ANTLR start rule__ContentProvider__Group_2__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3990:1: rule__ContentProvider__Group_2__1 : rule__ContentProvider__Group_2__1__Impl rule__ContentProvider__Group_2__2 ;
    public final void rule__ContentProvider__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3994:1: ( rule__ContentProvider__Group_2__1__Impl rule__ContentProvider__Group_2__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3995:2: rule__ContentProvider__Group_2__1__Impl rule__ContentProvider__Group_2__2
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group_2__1__Impl_in_rule__ContentProvider__Group_2__18079);
            rule__ContentProvider__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group_2__2_in_rule__ContentProvider__Group_2__18082);
            rule__ContentProvider__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group_2__1


    // $ANTLR start rule__ContentProvider__Group_2__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4002:1: rule__ContentProvider__Group_2__1__Impl : ( ( rule__ContentProvider__ParameterAssignment_2_1 ) ) ;
    public final void rule__ContentProvider__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4006:1: ( ( ( rule__ContentProvider__ParameterAssignment_2_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4007:1: ( ( rule__ContentProvider__ParameterAssignment_2_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4007:1: ( ( rule__ContentProvider__ParameterAssignment_2_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4008:1: ( rule__ContentProvider__ParameterAssignment_2_1 )
            {
             before(grammarAccess.getContentProviderAccess().getParameterAssignment_2_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4009:1: ( rule__ContentProvider__ParameterAssignment_2_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4009:2: rule__ContentProvider__ParameterAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ContentProvider__ParameterAssignment_2_1_in_rule__ContentProvider__Group_2__1__Impl8109);
            rule__ContentProvider__ParameterAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getContentProviderAccess().getParameterAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group_2__1__Impl


    // $ANTLR start rule__ContentProvider__Group_2__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4019:1: rule__ContentProvider__Group_2__2 : rule__ContentProvider__Group_2__2__Impl ;
    public final void rule__ContentProvider__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4023:1: ( rule__ContentProvider__Group_2__2__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4024:2: rule__ContentProvider__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group_2__2__Impl_in_rule__ContentProvider__Group_2__28139);
            rule__ContentProvider__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group_2__2


    // $ANTLR start rule__ContentProvider__Group_2__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4030:1: rule__ContentProvider__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ContentProvider__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4034:1: ( ( ')' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4035:1: ( ')' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4035:1: ( ')' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4036:1: ')'
            {
             before(grammarAccess.getContentProviderAccess().getRightParenthesisKeyword_2_2()); 
            match(input,18,FOLLOW_18_in_rule__ContentProvider__Group_2__2__Impl8167); 
             after(grammarAccess.getContentProviderAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__Group_2__2__Impl


    // $ANTLR start rule__ProviderConstruction__Group_0__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4055:1: rule__ProviderConstruction__Group_0__0 : rule__ProviderConstruction__Group_0__0__Impl rule__ProviderConstruction__Group_0__1 ;
    public final void rule__ProviderConstruction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4059:1: ( rule__ProviderConstruction__Group_0__0__Impl rule__ProviderConstruction__Group_0__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4060:2: rule__ProviderConstruction__Group_0__0__Impl rule__ProviderConstruction__Group_0__1
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__0__Impl_in_rule__ProviderConstruction__Group_0__08204);
            rule__ProviderConstruction__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__1_in_rule__ProviderConstruction__Group_0__08207);
            rule__ProviderConstruction__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_0__0


    // $ANTLR start rule__ProviderConstruction__Group_0__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4067:1: rule__ProviderConstruction__Group_0__0__Impl : ( () ) ;
    public final void rule__ProviderConstruction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4071:1: ( ( () ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4072:1: ( () )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4072:1: ( () )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4073:1: ()
            {
             before(grammarAccess.getProviderConstructionAccess().getComplexProviderConstructionAction_0_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4074:1: ()
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4076:1: 
            {
            }

             after(grammarAccess.getProviderConstructionAccess().getComplexProviderConstructionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_0__0__Impl


    // $ANTLR start rule__ProviderConstruction__Group_0__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4086:1: rule__ProviderConstruction__Group_0__1 : rule__ProviderConstruction__Group_0__1__Impl rule__ProviderConstruction__Group_0__2 ;
    public final void rule__ProviderConstruction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4090:1: ( rule__ProviderConstruction__Group_0__1__Impl rule__ProviderConstruction__Group_0__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4091:2: rule__ProviderConstruction__Group_0__1__Impl rule__ProviderConstruction__Group_0__2
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__1__Impl_in_rule__ProviderConstruction__Group_0__18265);
            rule__ProviderConstruction__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__2_in_rule__ProviderConstruction__Group_0__18268);
            rule__ProviderConstruction__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_0__1


    // $ANTLR start rule__ProviderConstruction__Group_0__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4098:1: rule__ProviderConstruction__Group_0__1__Impl : ( ( rule__ProviderConstruction__ProviderAssignment_0_1 ) ) ;
    public final void rule__ProviderConstruction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4102:1: ( ( ( rule__ProviderConstruction__ProviderAssignment_0_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4103:1: ( ( rule__ProviderConstruction__ProviderAssignment_0_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4103:1: ( ( rule__ProviderConstruction__ProviderAssignment_0_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4104:1: ( rule__ProviderConstruction__ProviderAssignment_0_1 )
            {
             before(grammarAccess.getProviderConstructionAccess().getProviderAssignment_0_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4105:1: ( rule__ProviderConstruction__ProviderAssignment_0_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4105:2: rule__ProviderConstruction__ProviderAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__ProviderAssignment_0_1_in_rule__ProviderConstruction__Group_0__1__Impl8295);
            rule__ProviderConstruction__ProviderAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getProviderConstructionAccess().getProviderAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_0__1__Impl


    // $ANTLR start rule__ProviderConstruction__Group_0__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4115:1: rule__ProviderConstruction__Group_0__2 : rule__ProviderConstruction__Group_0__2__Impl rule__ProviderConstruction__Group_0__3 ;
    public final void rule__ProviderConstruction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4119:1: ( rule__ProviderConstruction__Group_0__2__Impl rule__ProviderConstruction__Group_0__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4120:2: rule__ProviderConstruction__Group_0__2__Impl rule__ProviderConstruction__Group_0__3
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__2__Impl_in_rule__ProviderConstruction__Group_0__28325);
            rule__ProviderConstruction__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__3_in_rule__ProviderConstruction__Group_0__28328);
            rule__ProviderConstruction__Group_0__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_0__2


    // $ANTLR start rule__ProviderConstruction__Group_0__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4127:1: rule__ProviderConstruction__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ProviderConstruction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4131:1: ( ( '(' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4132:1: ( '(' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4132:1: ( '(' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4133:1: '('
            {
             before(grammarAccess.getProviderConstructionAccess().getLeftParenthesisKeyword_0_2()); 
            match(input,17,FOLLOW_17_in_rule__ProviderConstruction__Group_0__2__Impl8356); 
             after(grammarAccess.getProviderConstructionAccess().getLeftParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_0__2__Impl


    // $ANTLR start rule__ProviderConstruction__Group_0__3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4146:1: rule__ProviderConstruction__Group_0__3 : rule__ProviderConstruction__Group_0__3__Impl rule__ProviderConstruction__Group_0__4 ;
    public final void rule__ProviderConstruction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4150:1: ( rule__ProviderConstruction__Group_0__3__Impl rule__ProviderConstruction__Group_0__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4151:2: rule__ProviderConstruction__Group_0__3__Impl rule__ProviderConstruction__Group_0__4
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__3__Impl_in_rule__ProviderConstruction__Group_0__38387);
            rule__ProviderConstruction__Group_0__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__4_in_rule__ProviderConstruction__Group_0__38390);
            rule__ProviderConstruction__Group_0__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_0__3


    // $ANTLR start rule__ProviderConstruction__Group_0__3__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4158:1: rule__ProviderConstruction__Group_0__3__Impl : ( ( rule__ProviderConstruction__ArgumentAssignment_0_3 )? ) ;
    public final void rule__ProviderConstruction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4162:1: ( ( ( rule__ProviderConstruction__ArgumentAssignment_0_3 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4163:1: ( ( rule__ProviderConstruction__ArgumentAssignment_0_3 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4163:1: ( ( rule__ProviderConstruction__ArgumentAssignment_0_3 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4164:1: ( rule__ProviderConstruction__ArgumentAssignment_0_3 )?
            {
             before(grammarAccess.getProviderConstructionAccess().getArgumentAssignment_0_3()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4165:1: ( rule__ProviderConstruction__ArgumentAssignment_0_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)||LA25_0==17||LA25_0==19||(LA25_0>=21 && LA25_0<=22)||LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4165:2: rule__ProviderConstruction__ArgumentAssignment_0_3
                    {
                    pushFollow(FOLLOW_rule__ProviderConstruction__ArgumentAssignment_0_3_in_rule__ProviderConstruction__Group_0__3__Impl8417);
                    rule__ProviderConstruction__ArgumentAssignment_0_3();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProviderConstructionAccess().getArgumentAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_0__3__Impl


    // $ANTLR start rule__ProviderConstruction__Group_0__4
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4175:1: rule__ProviderConstruction__Group_0__4 : rule__ProviderConstruction__Group_0__4__Impl ;
    public final void rule__ProviderConstruction__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4179:1: ( rule__ProviderConstruction__Group_0__4__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4180:2: rule__ProviderConstruction__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__4__Impl_in_rule__ProviderConstruction__Group_0__48448);
            rule__ProviderConstruction__Group_0__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_0__4


    // $ANTLR start rule__ProviderConstruction__Group_0__4__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4186:1: rule__ProviderConstruction__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ProviderConstruction__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4190:1: ( ( ')' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4191:1: ( ')' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4191:1: ( ')' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4192:1: ')'
            {
             before(grammarAccess.getProviderConstructionAccess().getRightParenthesisKeyword_0_4()); 
            match(input,18,FOLLOW_18_in_rule__ProviderConstruction__Group_0__4__Impl8476); 
             after(grammarAccess.getProviderConstructionAccess().getRightParenthesisKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_0__4__Impl


    // $ANTLR start rule__ProviderConstruction__Group_1__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4215:1: rule__ProviderConstruction__Group_1__0 : rule__ProviderConstruction__Group_1__0__Impl rule__ProviderConstruction__Group_1__1 ;
    public final void rule__ProviderConstruction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4219:1: ( rule__ProviderConstruction__Group_1__0__Impl rule__ProviderConstruction__Group_1__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4220:2: rule__ProviderConstruction__Group_1__0__Impl rule__ProviderConstruction__Group_1__1
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_1__0__Impl_in_rule__ProviderConstruction__Group_1__08517);
            rule__ProviderConstruction__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProviderConstruction__Group_1__1_in_rule__ProviderConstruction__Group_1__08520);
            rule__ProviderConstruction__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_1__0


    // $ANTLR start rule__ProviderConstruction__Group_1__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4227:1: rule__ProviderConstruction__Group_1__0__Impl : ( () ) ;
    public final void rule__ProviderConstruction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4231:1: ( ( () ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4232:1: ( () )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4232:1: ( () )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4233:1: ()
            {
             before(grammarAccess.getProviderConstructionAccess().getSimpleProviderConstructionAction_1_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4234:1: ()
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4236:1: 
            {
            }

             after(grammarAccess.getProviderConstructionAccess().getSimpleProviderConstructionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_1__0__Impl


    // $ANTLR start rule__ProviderConstruction__Group_1__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4246:1: rule__ProviderConstruction__Group_1__1 : rule__ProviderConstruction__Group_1__1__Impl ;
    public final void rule__ProviderConstruction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4250:1: ( rule__ProviderConstruction__Group_1__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4251:2: rule__ProviderConstruction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_1__1__Impl_in_rule__ProviderConstruction__Group_1__18578);
            rule__ProviderConstruction__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_1__1


    // $ANTLR start rule__ProviderConstruction__Group_1__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4257:1: rule__ProviderConstruction__Group_1__1__Impl : ( ( rule__ProviderConstruction__ExpressionAssignment_1_1 ) ) ;
    public final void rule__ProviderConstruction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4261:1: ( ( ( rule__ProviderConstruction__ExpressionAssignment_1_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4262:1: ( ( rule__ProviderConstruction__ExpressionAssignment_1_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4262:1: ( ( rule__ProviderConstruction__ExpressionAssignment_1_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4263:1: ( rule__ProviderConstruction__ExpressionAssignment_1_1 )
            {
             before(grammarAccess.getProviderConstructionAccess().getExpressionAssignment_1_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4264:1: ( rule__ProviderConstruction__ExpressionAssignment_1_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4264:2: rule__ProviderConstruction__ExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__ExpressionAssignment_1_1_in_rule__ProviderConstruction__Group_1__1__Impl8605);
            rule__ProviderConstruction__ExpressionAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getProviderConstructionAccess().getExpressionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__Group_1__1__Impl


    // $ANTLR start rule__TableView__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4278:1: rule__TableView__Group__0 : rule__TableView__Group__0__Impl rule__TableView__Group__1 ;
    public final void rule__TableView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4282:1: ( rule__TableView__Group__0__Impl rule__TableView__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4283:2: rule__TableView__Group__0__Impl rule__TableView__Group__1
            {
            pushFollow(FOLLOW_rule__TableView__Group__0__Impl_in_rule__TableView__Group__08639);
            rule__TableView__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__1_in_rule__TableView__Group__08642);
            rule__TableView__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__0


    // $ANTLR start rule__TableView__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4290:1: rule__TableView__Group__0__Impl : ( 'tableview' ) ;
    public final void rule__TableView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4294:1: ( ( 'tableview' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4295:1: ( 'tableview' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4295:1: ( 'tableview' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4296:1: 'tableview'
            {
             before(grammarAccess.getTableViewAccess().getTableviewKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__TableView__Group__0__Impl8670); 
             after(grammarAccess.getTableViewAccess().getTableviewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__0__Impl


    // $ANTLR start rule__TableView__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4309:1: rule__TableView__Group__1 : rule__TableView__Group__1__Impl rule__TableView__Group__2 ;
    public final void rule__TableView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4313:1: ( rule__TableView__Group__1__Impl rule__TableView__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4314:2: rule__TableView__Group__1__Impl rule__TableView__Group__2
            {
            pushFollow(FOLLOW_rule__TableView__Group__1__Impl_in_rule__TableView__Group__18701);
            rule__TableView__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__2_in_rule__TableView__Group__18704);
            rule__TableView__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__1


    // $ANTLR start rule__TableView__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4321:1: rule__TableView__Group__1__Impl : ( ( rule__TableView__NameAssignment_1 ) ) ;
    public final void rule__TableView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4325:1: ( ( ( rule__TableView__NameAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4326:1: ( ( rule__TableView__NameAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4326:1: ( ( rule__TableView__NameAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4327:1: ( rule__TableView__NameAssignment_1 )
            {
             before(grammarAccess.getTableViewAccess().getNameAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4328:1: ( rule__TableView__NameAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4328:2: rule__TableView__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TableView__NameAssignment_1_in_rule__TableView__Group__1__Impl8731);
            rule__TableView__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTableViewAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__1__Impl


    // $ANTLR start rule__TableView__Group__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4338:1: rule__TableView__Group__2 : rule__TableView__Group__2__Impl rule__TableView__Group__3 ;
    public final void rule__TableView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4342:1: ( rule__TableView__Group__2__Impl rule__TableView__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4343:2: rule__TableView__Group__2__Impl rule__TableView__Group__3
            {
            pushFollow(FOLLOW_rule__TableView__Group__2__Impl_in_rule__TableView__Group__28761);
            rule__TableView__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__3_in_rule__TableView__Group__28764);
            rule__TableView__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__2


    // $ANTLR start rule__TableView__Group__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4350:1: rule__TableView__Group__2__Impl : ( ( rule__TableView__Group_2__0 )? ) ;
    public final void rule__TableView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4354:1: ( ( ( rule__TableView__Group_2__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4355:1: ( ( rule__TableView__Group_2__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4355:1: ( ( rule__TableView__Group_2__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4356:1: ( rule__TableView__Group_2__0 )?
            {
             before(grammarAccess.getTableViewAccess().getGroup_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4357:1: ( rule__TableView__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4357:2: rule__TableView__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TableView__Group_2__0_in_rule__TableView__Group__2__Impl8791);
                    rule__TableView__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableViewAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__2__Impl


    // $ANTLR start rule__TableView__Group__3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4367:1: rule__TableView__Group__3 : rule__TableView__Group__3__Impl rule__TableView__Group__4 ;
    public final void rule__TableView__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4371:1: ( rule__TableView__Group__3__Impl rule__TableView__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4372:2: rule__TableView__Group__3__Impl rule__TableView__Group__4
            {
            pushFollow(FOLLOW_rule__TableView__Group__3__Impl_in_rule__TableView__Group__38822);
            rule__TableView__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__4_in_rule__TableView__Group__38825);
            rule__TableView__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__3


    // $ANTLR start rule__TableView__Group__3__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4379:1: rule__TableView__Group__3__Impl : ( '{' ) ;
    public final void rule__TableView__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4383:1: ( ( '{' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4384:1: ( '{' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4384:1: ( '{' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4385:1: '{'
            {
             before(grammarAccess.getTableViewAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__TableView__Group__3__Impl8853); 
             after(grammarAccess.getTableViewAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__3__Impl


    // $ANTLR start rule__TableView__Group__4
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4398:1: rule__TableView__Group__4 : rule__TableView__Group__4__Impl rule__TableView__Group__5 ;
    public final void rule__TableView__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4402:1: ( rule__TableView__Group__4__Impl rule__TableView__Group__5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4403:2: rule__TableView__Group__4__Impl rule__TableView__Group__5
            {
            pushFollow(FOLLOW_rule__TableView__Group__4__Impl_in_rule__TableView__Group__48884);
            rule__TableView__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__5_in_rule__TableView__Group__48887);
            rule__TableView__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__4


    // $ANTLR start rule__TableView__Group__4__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4410:1: rule__TableView__Group__4__Impl : ( 'title=' ) ;
    public final void rule__TableView__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4414:1: ( ( 'title=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4415:1: ( 'title=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4415:1: ( 'title=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4416:1: 'title='
            {
             before(grammarAccess.getTableViewAccess().getTitleKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__TableView__Group__4__Impl8915); 
             after(grammarAccess.getTableViewAccess().getTitleKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__4__Impl


    // $ANTLR start rule__TableView__Group__5
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4429:1: rule__TableView__Group__5 : rule__TableView__Group__5__Impl rule__TableView__Group__6 ;
    public final void rule__TableView__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4433:1: ( rule__TableView__Group__5__Impl rule__TableView__Group__6 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4434:2: rule__TableView__Group__5__Impl rule__TableView__Group__6
            {
            pushFollow(FOLLOW_rule__TableView__Group__5__Impl_in_rule__TableView__Group__58946);
            rule__TableView__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__6_in_rule__TableView__Group__58949);
            rule__TableView__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__5


    // $ANTLR start rule__TableView__Group__5__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4441:1: rule__TableView__Group__5__Impl : ( ( rule__TableView__TitleAssignment_5 ) ) ;
    public final void rule__TableView__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4445:1: ( ( ( rule__TableView__TitleAssignment_5 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4446:1: ( ( rule__TableView__TitleAssignment_5 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4446:1: ( ( rule__TableView__TitleAssignment_5 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4447:1: ( rule__TableView__TitleAssignment_5 )
            {
             before(grammarAccess.getTableViewAccess().getTitleAssignment_5()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4448:1: ( rule__TableView__TitleAssignment_5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4448:2: rule__TableView__TitleAssignment_5
            {
            pushFollow(FOLLOW_rule__TableView__TitleAssignment_5_in_rule__TableView__Group__5__Impl8976);
            rule__TableView__TitleAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getTableViewAccess().getTitleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__5__Impl


    // $ANTLR start rule__TableView__Group__6
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4458:1: rule__TableView__Group__6 : rule__TableView__Group__6__Impl rule__TableView__Group__7 ;
    public final void rule__TableView__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4462:1: ( rule__TableView__Group__6__Impl rule__TableView__Group__7 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4463:2: rule__TableView__Group__6__Impl rule__TableView__Group__7
            {
            pushFollow(FOLLOW_rule__TableView__Group__6__Impl_in_rule__TableView__Group__69006);
            rule__TableView__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__7_in_rule__TableView__Group__69009);
            rule__TableView__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__6


    // $ANTLR start rule__TableView__Group__6__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4470:1: rule__TableView__Group__6__Impl : ( ( rule__TableView__SectionsAssignment_6 )* ) ;
    public final void rule__TableView__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4474:1: ( ( ( rule__TableView__SectionsAssignment_6 )* ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4475:1: ( ( rule__TableView__SectionsAssignment_6 )* )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4475:1: ( ( rule__TableView__SectionsAssignment_6 )* )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4476:1: ( rule__TableView__SectionsAssignment_6 )*
            {
             before(grammarAccess.getTableViewAccess().getSectionsAssignment_6()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4477:1: ( rule__TableView__SectionsAssignment_6 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==51) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4477:2: rule__TableView__SectionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__TableView__SectionsAssignment_6_in_rule__TableView__Group__6__Impl9036);
            	    rule__TableView__SectionsAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getTableViewAccess().getSectionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__6__Impl


    // $ANTLR start rule__TableView__Group__7
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4487:1: rule__TableView__Group__7 : rule__TableView__Group__7__Impl ;
    public final void rule__TableView__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4491:1: ( rule__TableView__Group__7__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4492:2: rule__TableView__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__TableView__Group__7__Impl_in_rule__TableView__Group__79067);
            rule__TableView__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__7


    // $ANTLR start rule__TableView__Group__7__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4498:1: rule__TableView__Group__7__Impl : ( '}' ) ;
    public final void rule__TableView__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4502:1: ( ( '}' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4503:1: ( '}' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4503:1: ( '}' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4504:1: '}'
            {
             before(grammarAccess.getTableViewAccess().getRightCurlyBracketKeyword_7()); 
            match(input,27,FOLLOW_27_in_rule__TableView__Group__7__Impl9095); 
             after(grammarAccess.getTableViewAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group__7__Impl


    // $ANTLR start rule__TableView__Group_2__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4533:1: rule__TableView__Group_2__0 : rule__TableView__Group_2__0__Impl rule__TableView__Group_2__1 ;
    public final void rule__TableView__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4537:1: ( rule__TableView__Group_2__0__Impl rule__TableView__Group_2__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4538:2: rule__TableView__Group_2__0__Impl rule__TableView__Group_2__1
            {
            pushFollow(FOLLOW_rule__TableView__Group_2__0__Impl_in_rule__TableView__Group_2__09142);
            rule__TableView__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group_2__1_in_rule__TableView__Group_2__09145);
            rule__TableView__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group_2__0


    // $ANTLR start rule__TableView__Group_2__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4545:1: rule__TableView__Group_2__0__Impl : ( '(' ) ;
    public final void rule__TableView__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4549:1: ( ( '(' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4550:1: ( '(' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4550:1: ( '(' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4551:1: '('
            {
             before(grammarAccess.getTableViewAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__TableView__Group_2__0__Impl9173); 
             after(grammarAccess.getTableViewAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group_2__0__Impl


    // $ANTLR start rule__TableView__Group_2__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4564:1: rule__TableView__Group_2__1 : rule__TableView__Group_2__1__Impl rule__TableView__Group_2__2 ;
    public final void rule__TableView__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4568:1: ( rule__TableView__Group_2__1__Impl rule__TableView__Group_2__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4569:2: rule__TableView__Group_2__1__Impl rule__TableView__Group_2__2
            {
            pushFollow(FOLLOW_rule__TableView__Group_2__1__Impl_in_rule__TableView__Group_2__19204);
            rule__TableView__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group_2__2_in_rule__TableView__Group_2__19207);
            rule__TableView__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group_2__1


    // $ANTLR start rule__TableView__Group_2__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4576:1: rule__TableView__Group_2__1__Impl : ( ( rule__TableView__ContentAssignment_2_1 ) ) ;
    public final void rule__TableView__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4580:1: ( ( ( rule__TableView__ContentAssignment_2_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4581:1: ( ( rule__TableView__ContentAssignment_2_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4581:1: ( ( rule__TableView__ContentAssignment_2_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4582:1: ( rule__TableView__ContentAssignment_2_1 )
            {
             before(grammarAccess.getTableViewAccess().getContentAssignment_2_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4583:1: ( rule__TableView__ContentAssignment_2_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4583:2: rule__TableView__ContentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TableView__ContentAssignment_2_1_in_rule__TableView__Group_2__1__Impl9234);
            rule__TableView__ContentAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getTableViewAccess().getContentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group_2__1__Impl


    // $ANTLR start rule__TableView__Group_2__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4593:1: rule__TableView__Group_2__2 : rule__TableView__Group_2__2__Impl ;
    public final void rule__TableView__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4597:1: ( rule__TableView__Group_2__2__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4598:2: rule__TableView__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TableView__Group_2__2__Impl_in_rule__TableView__Group_2__29264);
            rule__TableView__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group_2__2


    // $ANTLR start rule__TableView__Group_2__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4604:1: rule__TableView__Group_2__2__Impl : ( ')' ) ;
    public final void rule__TableView__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4608:1: ( ( ')' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4609:1: ( ')' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4609:1: ( ')' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4610:1: ')'
            {
             before(grammarAccess.getTableViewAccess().getRightParenthesisKeyword_2_2()); 
            match(input,18,FOLLOW_18_in_rule__TableView__Group_2__2__Impl9292); 
             after(grammarAccess.getTableViewAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__Group_2__2__Impl


    // $ANTLR start rule__DetailsView__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4629:1: rule__DetailsView__Group__0 : rule__DetailsView__Group__0__Impl rule__DetailsView__Group__1 ;
    public final void rule__DetailsView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4633:1: ( rule__DetailsView__Group__0__Impl rule__DetailsView__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4634:2: rule__DetailsView__Group__0__Impl rule__DetailsView__Group__1
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__0__Impl_in_rule__DetailsView__Group__09329);
            rule__DetailsView__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__1_in_rule__DetailsView__Group__09332);
            rule__DetailsView__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__0


    // $ANTLR start rule__DetailsView__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4641:1: rule__DetailsView__Group__0__Impl : ( 'detailsview' ) ;
    public final void rule__DetailsView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4645:1: ( ( 'detailsview' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4646:1: ( 'detailsview' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4646:1: ( 'detailsview' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4647:1: 'detailsview'
            {
             before(grammarAccess.getDetailsViewAccess().getDetailsviewKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__DetailsView__Group__0__Impl9360); 
             after(grammarAccess.getDetailsViewAccess().getDetailsviewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__0__Impl


    // $ANTLR start rule__DetailsView__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4660:1: rule__DetailsView__Group__1 : rule__DetailsView__Group__1__Impl rule__DetailsView__Group__2 ;
    public final void rule__DetailsView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4664:1: ( rule__DetailsView__Group__1__Impl rule__DetailsView__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4665:2: rule__DetailsView__Group__1__Impl rule__DetailsView__Group__2
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__1__Impl_in_rule__DetailsView__Group__19391);
            rule__DetailsView__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__2_in_rule__DetailsView__Group__19394);
            rule__DetailsView__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__1


    // $ANTLR start rule__DetailsView__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4672:1: rule__DetailsView__Group__1__Impl : ( ( rule__DetailsView__NameAssignment_1 ) ) ;
    public final void rule__DetailsView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4676:1: ( ( ( rule__DetailsView__NameAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4677:1: ( ( rule__DetailsView__NameAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4677:1: ( ( rule__DetailsView__NameAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4678:1: ( rule__DetailsView__NameAssignment_1 )
            {
             before(grammarAccess.getDetailsViewAccess().getNameAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4679:1: ( rule__DetailsView__NameAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4679:2: rule__DetailsView__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DetailsView__NameAssignment_1_in_rule__DetailsView__Group__1__Impl9421);
            rule__DetailsView__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDetailsViewAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__1__Impl


    // $ANTLR start rule__DetailsView__Group__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4689:1: rule__DetailsView__Group__2 : rule__DetailsView__Group__2__Impl rule__DetailsView__Group__3 ;
    public final void rule__DetailsView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4693:1: ( rule__DetailsView__Group__2__Impl rule__DetailsView__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4694:2: rule__DetailsView__Group__2__Impl rule__DetailsView__Group__3
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__2__Impl_in_rule__DetailsView__Group__29451);
            rule__DetailsView__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__3_in_rule__DetailsView__Group__29454);
            rule__DetailsView__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__2


    // $ANTLR start rule__DetailsView__Group__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4701:1: rule__DetailsView__Group__2__Impl : ( ( rule__DetailsView__Group_2__0 )? ) ;
    public final void rule__DetailsView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4705:1: ( ( ( rule__DetailsView__Group_2__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4706:1: ( ( rule__DetailsView__Group_2__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4706:1: ( ( rule__DetailsView__Group_2__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4707:1: ( rule__DetailsView__Group_2__0 )?
            {
             before(grammarAccess.getDetailsViewAccess().getGroup_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4708:1: ( rule__DetailsView__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==17) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4708:2: rule__DetailsView__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DetailsView__Group_2__0_in_rule__DetailsView__Group__2__Impl9481);
                    rule__DetailsView__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDetailsViewAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__2__Impl


    // $ANTLR start rule__DetailsView__Group__3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4718:1: rule__DetailsView__Group__3 : rule__DetailsView__Group__3__Impl rule__DetailsView__Group__4 ;
    public final void rule__DetailsView__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4722:1: ( rule__DetailsView__Group__3__Impl rule__DetailsView__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4723:2: rule__DetailsView__Group__3__Impl rule__DetailsView__Group__4
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__3__Impl_in_rule__DetailsView__Group__39512);
            rule__DetailsView__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__4_in_rule__DetailsView__Group__39515);
            rule__DetailsView__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__3


    // $ANTLR start rule__DetailsView__Group__3__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4730:1: rule__DetailsView__Group__3__Impl : ( '{' ) ;
    public final void rule__DetailsView__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4734:1: ( ( '{' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4735:1: ( '{' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4735:1: ( '{' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4736:1: '{'
            {
             before(grammarAccess.getDetailsViewAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__DetailsView__Group__3__Impl9543); 
             after(grammarAccess.getDetailsViewAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__3__Impl


    // $ANTLR start rule__DetailsView__Group__4
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4749:1: rule__DetailsView__Group__4 : rule__DetailsView__Group__4__Impl rule__DetailsView__Group__5 ;
    public final void rule__DetailsView__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4753:1: ( rule__DetailsView__Group__4__Impl rule__DetailsView__Group__5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4754:2: rule__DetailsView__Group__4__Impl rule__DetailsView__Group__5
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__4__Impl_in_rule__DetailsView__Group__49574);
            rule__DetailsView__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__5_in_rule__DetailsView__Group__49577);
            rule__DetailsView__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__4


    // $ANTLR start rule__DetailsView__Group__4__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4761:1: rule__DetailsView__Group__4__Impl : ( 'title=' ) ;
    public final void rule__DetailsView__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4765:1: ( ( 'title=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4766:1: ( 'title=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4766:1: ( 'title=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4767:1: 'title='
            {
             before(grammarAccess.getDetailsViewAccess().getTitleKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__DetailsView__Group__4__Impl9605); 
             after(grammarAccess.getDetailsViewAccess().getTitleKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__4__Impl


    // $ANTLR start rule__DetailsView__Group__5
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4780:1: rule__DetailsView__Group__5 : rule__DetailsView__Group__5__Impl rule__DetailsView__Group__6 ;
    public final void rule__DetailsView__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4784:1: ( rule__DetailsView__Group__5__Impl rule__DetailsView__Group__6 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4785:2: rule__DetailsView__Group__5__Impl rule__DetailsView__Group__6
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__5__Impl_in_rule__DetailsView__Group__59636);
            rule__DetailsView__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__6_in_rule__DetailsView__Group__59639);
            rule__DetailsView__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__5


    // $ANTLR start rule__DetailsView__Group__5__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4792:1: rule__DetailsView__Group__5__Impl : ( ( rule__DetailsView__TitleAssignment_5 ) ) ;
    public final void rule__DetailsView__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4796:1: ( ( ( rule__DetailsView__TitleAssignment_5 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4797:1: ( ( rule__DetailsView__TitleAssignment_5 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4797:1: ( ( rule__DetailsView__TitleAssignment_5 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4798:1: ( rule__DetailsView__TitleAssignment_5 )
            {
             before(grammarAccess.getDetailsViewAccess().getTitleAssignment_5()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4799:1: ( rule__DetailsView__TitleAssignment_5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4799:2: rule__DetailsView__TitleAssignment_5
            {
            pushFollow(FOLLOW_rule__DetailsView__TitleAssignment_5_in_rule__DetailsView__Group__5__Impl9666);
            rule__DetailsView__TitleAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getDetailsViewAccess().getTitleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__5__Impl


    // $ANTLR start rule__DetailsView__Group__6
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4809:1: rule__DetailsView__Group__6 : rule__DetailsView__Group__6__Impl rule__DetailsView__Group__7 ;
    public final void rule__DetailsView__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4813:1: ( rule__DetailsView__Group__6__Impl rule__DetailsView__Group__7 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4814:2: rule__DetailsView__Group__6__Impl rule__DetailsView__Group__7
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__6__Impl_in_rule__DetailsView__Group__69696);
            rule__DetailsView__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__7_in_rule__DetailsView__Group__69699);
            rule__DetailsView__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__6


    // $ANTLR start rule__DetailsView__Group__6__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4821:1: rule__DetailsView__Group__6__Impl : ( ( rule__DetailsView__HeaderAssignment_6 )? ) ;
    public final void rule__DetailsView__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4825:1: ( ( ( rule__DetailsView__HeaderAssignment_6 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4826:1: ( ( rule__DetailsView__HeaderAssignment_6 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4826:1: ( ( rule__DetailsView__HeaderAssignment_6 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4827:1: ( rule__DetailsView__HeaderAssignment_6 )?
            {
             before(grammarAccess.getDetailsViewAccess().getHeaderAssignment_6()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4828:1: ( rule__DetailsView__HeaderAssignment_6 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==47) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4828:2: rule__DetailsView__HeaderAssignment_6
                    {
                    pushFollow(FOLLOW_rule__DetailsView__HeaderAssignment_6_in_rule__DetailsView__Group__6__Impl9726);
                    rule__DetailsView__HeaderAssignment_6();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDetailsViewAccess().getHeaderAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__6__Impl


    // $ANTLR start rule__DetailsView__Group__7
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4838:1: rule__DetailsView__Group__7 : rule__DetailsView__Group__7__Impl rule__DetailsView__Group__8 ;
    public final void rule__DetailsView__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4842:1: ( rule__DetailsView__Group__7__Impl rule__DetailsView__Group__8 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4843:2: rule__DetailsView__Group__7__Impl rule__DetailsView__Group__8
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__7__Impl_in_rule__DetailsView__Group__79757);
            rule__DetailsView__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__8_in_rule__DetailsView__Group__79760);
            rule__DetailsView__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__7


    // $ANTLR start rule__DetailsView__Group__7__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4850:1: rule__DetailsView__Group__7__Impl : ( ( rule__DetailsView__SectionsAssignment_7 )* ) ;
    public final void rule__DetailsView__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4854:1: ( ( ( rule__DetailsView__SectionsAssignment_7 )* ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4855:1: ( ( rule__DetailsView__SectionsAssignment_7 )* )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4855:1: ( ( rule__DetailsView__SectionsAssignment_7 )* )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4856:1: ( rule__DetailsView__SectionsAssignment_7 )*
            {
             before(grammarAccess.getDetailsViewAccess().getSectionsAssignment_7()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4857:1: ( rule__DetailsView__SectionsAssignment_7 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==51) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4857:2: rule__DetailsView__SectionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__DetailsView__SectionsAssignment_7_in_rule__DetailsView__Group__7__Impl9787);
            	    rule__DetailsView__SectionsAssignment_7();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getDetailsViewAccess().getSectionsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__7__Impl


    // $ANTLR start rule__DetailsView__Group__8
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4867:1: rule__DetailsView__Group__8 : rule__DetailsView__Group__8__Impl ;
    public final void rule__DetailsView__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4871:1: ( rule__DetailsView__Group__8__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4872:2: rule__DetailsView__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__8__Impl_in_rule__DetailsView__Group__89818);
            rule__DetailsView__Group__8__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__8


    // $ANTLR start rule__DetailsView__Group__8__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4878:1: rule__DetailsView__Group__8__Impl : ( '}' ) ;
    public final void rule__DetailsView__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4882:1: ( ( '}' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4883:1: ( '}' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4883:1: ( '}' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4884:1: '}'
            {
             before(grammarAccess.getDetailsViewAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_27_in_rule__DetailsView__Group__8__Impl9846); 
             after(grammarAccess.getDetailsViewAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group__8__Impl


    // $ANTLR start rule__DetailsView__Group_2__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4915:1: rule__DetailsView__Group_2__0 : rule__DetailsView__Group_2__0__Impl rule__DetailsView__Group_2__1 ;
    public final void rule__DetailsView__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4919:1: ( rule__DetailsView__Group_2__0__Impl rule__DetailsView__Group_2__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4920:2: rule__DetailsView__Group_2__0__Impl rule__DetailsView__Group_2__1
            {
            pushFollow(FOLLOW_rule__DetailsView__Group_2__0__Impl_in_rule__DetailsView__Group_2__09895);
            rule__DetailsView__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group_2__1_in_rule__DetailsView__Group_2__09898);
            rule__DetailsView__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group_2__0


    // $ANTLR start rule__DetailsView__Group_2__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4927:1: rule__DetailsView__Group_2__0__Impl : ( '(' ) ;
    public final void rule__DetailsView__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4931:1: ( ( '(' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4932:1: ( '(' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4932:1: ( '(' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4933:1: '('
            {
             before(grammarAccess.getDetailsViewAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__DetailsView__Group_2__0__Impl9926); 
             after(grammarAccess.getDetailsViewAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group_2__0__Impl


    // $ANTLR start rule__DetailsView__Group_2__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4946:1: rule__DetailsView__Group_2__1 : rule__DetailsView__Group_2__1__Impl rule__DetailsView__Group_2__2 ;
    public final void rule__DetailsView__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4950:1: ( rule__DetailsView__Group_2__1__Impl rule__DetailsView__Group_2__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4951:2: rule__DetailsView__Group_2__1__Impl rule__DetailsView__Group_2__2
            {
            pushFollow(FOLLOW_rule__DetailsView__Group_2__1__Impl_in_rule__DetailsView__Group_2__19957);
            rule__DetailsView__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group_2__2_in_rule__DetailsView__Group_2__19960);
            rule__DetailsView__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group_2__1


    // $ANTLR start rule__DetailsView__Group_2__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4958:1: rule__DetailsView__Group_2__1__Impl : ( ( rule__DetailsView__ContentAssignment_2_1 ) ) ;
    public final void rule__DetailsView__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4962:1: ( ( ( rule__DetailsView__ContentAssignment_2_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4963:1: ( ( rule__DetailsView__ContentAssignment_2_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4963:1: ( ( rule__DetailsView__ContentAssignment_2_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4964:1: ( rule__DetailsView__ContentAssignment_2_1 )
            {
             before(grammarAccess.getDetailsViewAccess().getContentAssignment_2_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4965:1: ( rule__DetailsView__ContentAssignment_2_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4965:2: rule__DetailsView__ContentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DetailsView__ContentAssignment_2_1_in_rule__DetailsView__Group_2__1__Impl9987);
            rule__DetailsView__ContentAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getDetailsViewAccess().getContentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group_2__1__Impl


    // $ANTLR start rule__DetailsView__Group_2__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4975:1: rule__DetailsView__Group_2__2 : rule__DetailsView__Group_2__2__Impl ;
    public final void rule__DetailsView__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4979:1: ( rule__DetailsView__Group_2__2__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4980:2: rule__DetailsView__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__DetailsView__Group_2__2__Impl_in_rule__DetailsView__Group_2__210017);
            rule__DetailsView__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group_2__2


    // $ANTLR start rule__DetailsView__Group_2__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4986:1: rule__DetailsView__Group_2__2__Impl : ( ')' ) ;
    public final void rule__DetailsView__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4990:1: ( ( ')' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4991:1: ( ')' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4991:1: ( ')' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4992:1: ')'
            {
             before(grammarAccess.getDetailsViewAccess().getRightParenthesisKeyword_2_2()); 
            match(input,18,FOLLOW_18_in_rule__DetailsView__Group_2__2__Impl10045); 
             after(grammarAccess.getDetailsViewAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__Group_2__2__Impl


    // $ANTLR start rule__CustomView__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5011:1: rule__CustomView__Group__0 : rule__CustomView__Group__0__Impl rule__CustomView__Group__1 ;
    public final void rule__CustomView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5015:1: ( rule__CustomView__Group__0__Impl rule__CustomView__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5016:2: rule__CustomView__Group__0__Impl rule__CustomView__Group__1
            {
            pushFollow(FOLLOW_rule__CustomView__Group__0__Impl_in_rule__CustomView__Group__010082);
            rule__CustomView__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group__1_in_rule__CustomView__Group__010085);
            rule__CustomView__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group__0


    // $ANTLR start rule__CustomView__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5023:1: rule__CustomView__Group__0__Impl : ( 'customview' ) ;
    public final void rule__CustomView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5027:1: ( ( 'customview' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5028:1: ( 'customview' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5028:1: ( 'customview' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5029:1: 'customview'
            {
             before(grammarAccess.getCustomViewAccess().getCustomviewKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__CustomView__Group__0__Impl10113); 
             after(grammarAccess.getCustomViewAccess().getCustomviewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group__0__Impl


    // $ANTLR start rule__CustomView__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5042:1: rule__CustomView__Group__1 : rule__CustomView__Group__1__Impl rule__CustomView__Group__2 ;
    public final void rule__CustomView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5046:1: ( rule__CustomView__Group__1__Impl rule__CustomView__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5047:2: rule__CustomView__Group__1__Impl rule__CustomView__Group__2
            {
            pushFollow(FOLLOW_rule__CustomView__Group__1__Impl_in_rule__CustomView__Group__110144);
            rule__CustomView__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group__2_in_rule__CustomView__Group__110147);
            rule__CustomView__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group__1


    // $ANTLR start rule__CustomView__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5054:1: rule__CustomView__Group__1__Impl : ( ( rule__CustomView__NameAssignment_1 ) ) ;
    public final void rule__CustomView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5058:1: ( ( ( rule__CustomView__NameAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5059:1: ( ( rule__CustomView__NameAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5059:1: ( ( rule__CustomView__NameAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5060:1: ( rule__CustomView__NameAssignment_1 )
            {
             before(grammarAccess.getCustomViewAccess().getNameAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5061:1: ( rule__CustomView__NameAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5061:2: rule__CustomView__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CustomView__NameAssignment_1_in_rule__CustomView__Group__1__Impl10174);
            rule__CustomView__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getCustomViewAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group__1__Impl


    // $ANTLR start rule__CustomView__Group__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5071:1: rule__CustomView__Group__2 : rule__CustomView__Group__2__Impl rule__CustomView__Group__3 ;
    public final void rule__CustomView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5075:1: ( rule__CustomView__Group__2__Impl rule__CustomView__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5076:2: rule__CustomView__Group__2__Impl rule__CustomView__Group__3
            {
            pushFollow(FOLLOW_rule__CustomView__Group__2__Impl_in_rule__CustomView__Group__210204);
            rule__CustomView__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group__3_in_rule__CustomView__Group__210207);
            rule__CustomView__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group__2


    // $ANTLR start rule__CustomView__Group__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5083:1: rule__CustomView__Group__2__Impl : ( ( rule__CustomView__Group_2__0 )? ) ;
    public final void rule__CustomView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5087:1: ( ( ( rule__CustomView__Group_2__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5088:1: ( ( rule__CustomView__Group_2__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5088:1: ( ( rule__CustomView__Group_2__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5089:1: ( rule__CustomView__Group_2__0 )?
            {
             before(grammarAccess.getCustomViewAccess().getGroup_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5090:1: ( rule__CustomView__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==17) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5090:2: rule__CustomView__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CustomView__Group_2__0_in_rule__CustomView__Group__2__Impl10234);
                    rule__CustomView__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomViewAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group__2__Impl


    // $ANTLR start rule__CustomView__Group__3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5100:1: rule__CustomView__Group__3 : rule__CustomView__Group__3__Impl rule__CustomView__Group__4 ;
    public final void rule__CustomView__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5104:1: ( rule__CustomView__Group__3__Impl rule__CustomView__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5105:2: rule__CustomView__Group__3__Impl rule__CustomView__Group__4
            {
            pushFollow(FOLLOW_rule__CustomView__Group__3__Impl_in_rule__CustomView__Group__310265);
            rule__CustomView__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group__4_in_rule__CustomView__Group__310268);
            rule__CustomView__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group__3


    // $ANTLR start rule__CustomView__Group__3__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5112:1: rule__CustomView__Group__3__Impl : ( 'implementedBy' ) ;
    public final void rule__CustomView__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5116:1: ( ( 'implementedBy' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5117:1: ( 'implementedBy' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5117:1: ( 'implementedBy' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5118:1: 'implementedBy'
            {
             before(grammarAccess.getCustomViewAccess().getImplementedByKeyword_3()); 
            match(input,46,FOLLOW_46_in_rule__CustomView__Group__3__Impl10296); 
             after(grammarAccess.getCustomViewAccess().getImplementedByKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group__3__Impl


    // $ANTLR start rule__CustomView__Group__4
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5131:1: rule__CustomView__Group__4 : rule__CustomView__Group__4__Impl ;
    public final void rule__CustomView__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5135:1: ( rule__CustomView__Group__4__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5136:2: rule__CustomView__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CustomView__Group__4__Impl_in_rule__CustomView__Group__410327);
            rule__CustomView__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group__4


    // $ANTLR start rule__CustomView__Group__4__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5142:1: rule__CustomView__Group__4__Impl : ( ( rule__CustomView__ObjclassAssignment_4 ) ) ;
    public final void rule__CustomView__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5146:1: ( ( ( rule__CustomView__ObjclassAssignment_4 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5147:1: ( ( rule__CustomView__ObjclassAssignment_4 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5147:1: ( ( rule__CustomView__ObjclassAssignment_4 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5148:1: ( rule__CustomView__ObjclassAssignment_4 )
            {
             before(grammarAccess.getCustomViewAccess().getObjclassAssignment_4()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5149:1: ( rule__CustomView__ObjclassAssignment_4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5149:2: rule__CustomView__ObjclassAssignment_4
            {
            pushFollow(FOLLOW_rule__CustomView__ObjclassAssignment_4_in_rule__CustomView__Group__4__Impl10354);
            rule__CustomView__ObjclassAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getCustomViewAccess().getObjclassAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group__4__Impl


    // $ANTLR start rule__CustomView__Group_2__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5169:1: rule__CustomView__Group_2__0 : rule__CustomView__Group_2__0__Impl rule__CustomView__Group_2__1 ;
    public final void rule__CustomView__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5173:1: ( rule__CustomView__Group_2__0__Impl rule__CustomView__Group_2__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5174:2: rule__CustomView__Group_2__0__Impl rule__CustomView__Group_2__1
            {
            pushFollow(FOLLOW_rule__CustomView__Group_2__0__Impl_in_rule__CustomView__Group_2__010394);
            rule__CustomView__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group_2__1_in_rule__CustomView__Group_2__010397);
            rule__CustomView__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group_2__0


    // $ANTLR start rule__CustomView__Group_2__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5181:1: rule__CustomView__Group_2__0__Impl : ( '(' ) ;
    public final void rule__CustomView__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5185:1: ( ( '(' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5186:1: ( '(' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5186:1: ( '(' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5187:1: '('
            {
             before(grammarAccess.getCustomViewAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__CustomView__Group_2__0__Impl10425); 
             after(grammarAccess.getCustomViewAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group_2__0__Impl


    // $ANTLR start rule__CustomView__Group_2__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5200:1: rule__CustomView__Group_2__1 : rule__CustomView__Group_2__1__Impl rule__CustomView__Group_2__2 ;
    public final void rule__CustomView__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5204:1: ( rule__CustomView__Group_2__1__Impl rule__CustomView__Group_2__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5205:2: rule__CustomView__Group_2__1__Impl rule__CustomView__Group_2__2
            {
            pushFollow(FOLLOW_rule__CustomView__Group_2__1__Impl_in_rule__CustomView__Group_2__110456);
            rule__CustomView__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group_2__2_in_rule__CustomView__Group_2__110459);
            rule__CustomView__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group_2__1


    // $ANTLR start rule__CustomView__Group_2__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5212:1: rule__CustomView__Group_2__1__Impl : ( ( rule__CustomView__ContentAssignment_2_1 ) ) ;
    public final void rule__CustomView__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5216:1: ( ( ( rule__CustomView__ContentAssignment_2_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5217:1: ( ( rule__CustomView__ContentAssignment_2_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5217:1: ( ( rule__CustomView__ContentAssignment_2_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5218:1: ( rule__CustomView__ContentAssignment_2_1 )
            {
             before(grammarAccess.getCustomViewAccess().getContentAssignment_2_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5219:1: ( rule__CustomView__ContentAssignment_2_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5219:2: rule__CustomView__ContentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__CustomView__ContentAssignment_2_1_in_rule__CustomView__Group_2__1__Impl10486);
            rule__CustomView__ContentAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getCustomViewAccess().getContentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group_2__1__Impl


    // $ANTLR start rule__CustomView__Group_2__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5229:1: rule__CustomView__Group_2__2 : rule__CustomView__Group_2__2__Impl ;
    public final void rule__CustomView__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5233:1: ( rule__CustomView__Group_2__2__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5234:2: rule__CustomView__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__CustomView__Group_2__2__Impl_in_rule__CustomView__Group_2__210516);
            rule__CustomView__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group_2__2


    // $ANTLR start rule__CustomView__Group_2__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5240:1: rule__CustomView__Group_2__2__Impl : ( ')' ) ;
    public final void rule__CustomView__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5244:1: ( ( ')' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5245:1: ( ')' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5245:1: ( ')' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5246:1: ')'
            {
             before(grammarAccess.getCustomViewAccess().getRightParenthesisKeyword_2_2()); 
            match(input,18,FOLLOW_18_in_rule__CustomView__Group_2__2__Impl10544); 
             after(grammarAccess.getCustomViewAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__Group_2__2__Impl


    // $ANTLR start rule__ViewHeader__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5265:1: rule__ViewHeader__Group__0 : rule__ViewHeader__Group__0__Impl rule__ViewHeader__Group__1 ;
    public final void rule__ViewHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5269:1: ( rule__ViewHeader__Group__0__Impl rule__ViewHeader__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5270:2: rule__ViewHeader__Group__0__Impl rule__ViewHeader__Group__1
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__0__Impl_in_rule__ViewHeader__Group__010581);
            rule__ViewHeader__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__1_in_rule__ViewHeader__Group__010584);
            rule__ViewHeader__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__0


    // $ANTLR start rule__ViewHeader__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5277:1: rule__ViewHeader__Group__0__Impl : ( () ) ;
    public final void rule__ViewHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5281:1: ( ( () ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5282:1: ( () )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5282:1: ( () )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5283:1: ()
            {
             before(grammarAccess.getViewHeaderAccess().getViewHeaderAction_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5284:1: ()
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5286:1: 
            {
            }

             after(grammarAccess.getViewHeaderAccess().getViewHeaderAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__0__Impl


    // $ANTLR start rule__ViewHeader__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5296:1: rule__ViewHeader__Group__1 : rule__ViewHeader__Group__1__Impl rule__ViewHeader__Group__2 ;
    public final void rule__ViewHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5300:1: ( rule__ViewHeader__Group__1__Impl rule__ViewHeader__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5301:2: rule__ViewHeader__Group__1__Impl rule__ViewHeader__Group__2
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__1__Impl_in_rule__ViewHeader__Group__110642);
            rule__ViewHeader__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__2_in_rule__ViewHeader__Group__110645);
            rule__ViewHeader__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__1


    // $ANTLR start rule__ViewHeader__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5308:1: rule__ViewHeader__Group__1__Impl : ( 'header' ) ;
    public final void rule__ViewHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5312:1: ( ( 'header' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5313:1: ( 'header' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5313:1: ( 'header' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5314:1: 'header'
            {
             before(grammarAccess.getViewHeaderAccess().getHeaderKeyword_1()); 
            match(input,47,FOLLOW_47_in_rule__ViewHeader__Group__1__Impl10673); 
             after(grammarAccess.getViewHeaderAccess().getHeaderKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__1__Impl


    // $ANTLR start rule__ViewHeader__Group__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5327:1: rule__ViewHeader__Group__2 : rule__ViewHeader__Group__2__Impl rule__ViewHeader__Group__3 ;
    public final void rule__ViewHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5331:1: ( rule__ViewHeader__Group__2__Impl rule__ViewHeader__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5332:2: rule__ViewHeader__Group__2__Impl rule__ViewHeader__Group__3
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__2__Impl_in_rule__ViewHeader__Group__210704);
            rule__ViewHeader__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__3_in_rule__ViewHeader__Group__210707);
            rule__ViewHeader__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__2


    // $ANTLR start rule__ViewHeader__Group__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5339:1: rule__ViewHeader__Group__2__Impl : ( '{' ) ;
    public final void rule__ViewHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5343:1: ( ( '{' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5344:1: ( '{' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5344:1: ( '{' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5345:1: '{'
            {
             before(grammarAccess.getViewHeaderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__ViewHeader__Group__2__Impl10735); 
             after(grammarAccess.getViewHeaderAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__2__Impl


    // $ANTLR start rule__ViewHeader__Group__3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5358:1: rule__ViewHeader__Group__3 : rule__ViewHeader__Group__3__Impl rule__ViewHeader__Group__4 ;
    public final void rule__ViewHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5362:1: ( rule__ViewHeader__Group__3__Impl rule__ViewHeader__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5363:2: rule__ViewHeader__Group__3__Impl rule__ViewHeader__Group__4
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__3__Impl_in_rule__ViewHeader__Group__310766);
            rule__ViewHeader__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__4_in_rule__ViewHeader__Group__310769);
            rule__ViewHeader__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__3


    // $ANTLR start rule__ViewHeader__Group__3__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5370:1: rule__ViewHeader__Group__3__Impl : ( ( rule__ViewHeader__Group_3__0 )? ) ;
    public final void rule__ViewHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5374:1: ( ( ( rule__ViewHeader__Group_3__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5375:1: ( ( rule__ViewHeader__Group_3__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5375:1: ( ( rule__ViewHeader__Group_3__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5376:1: ( rule__ViewHeader__Group_3__0 )?
            {
             before(grammarAccess.getViewHeaderAccess().getGroup_3()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5377:1: ( rule__ViewHeader__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5377:2: rule__ViewHeader__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ViewHeader__Group_3__0_in_rule__ViewHeader__Group__3__Impl10796);
                    rule__ViewHeader__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewHeaderAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__3__Impl


    // $ANTLR start rule__ViewHeader__Group__4
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5387:1: rule__ViewHeader__Group__4 : rule__ViewHeader__Group__4__Impl rule__ViewHeader__Group__5 ;
    public final void rule__ViewHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5391:1: ( rule__ViewHeader__Group__4__Impl rule__ViewHeader__Group__5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5392:2: rule__ViewHeader__Group__4__Impl rule__ViewHeader__Group__5
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__4__Impl_in_rule__ViewHeader__Group__410827);
            rule__ViewHeader__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__5_in_rule__ViewHeader__Group__410830);
            rule__ViewHeader__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__4


    // $ANTLR start rule__ViewHeader__Group__4__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5399:1: rule__ViewHeader__Group__4__Impl : ( ( rule__ViewHeader__Group_4__0 )? ) ;
    public final void rule__ViewHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5403:1: ( ( ( rule__ViewHeader__Group_4__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5404:1: ( ( rule__ViewHeader__Group_4__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5404:1: ( ( rule__ViewHeader__Group_4__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5405:1: ( rule__ViewHeader__Group_4__0 )?
            {
             before(grammarAccess.getViewHeaderAccess().getGroup_4()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5406:1: ( rule__ViewHeader__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5406:2: rule__ViewHeader__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ViewHeader__Group_4__0_in_rule__ViewHeader__Group__4__Impl10857);
                    rule__ViewHeader__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewHeaderAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__4__Impl


    // $ANTLR start rule__ViewHeader__Group__5
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5416:1: rule__ViewHeader__Group__5 : rule__ViewHeader__Group__5__Impl rule__ViewHeader__Group__6 ;
    public final void rule__ViewHeader__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5420:1: ( rule__ViewHeader__Group__5__Impl rule__ViewHeader__Group__6 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5421:2: rule__ViewHeader__Group__5__Impl rule__ViewHeader__Group__6
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__5__Impl_in_rule__ViewHeader__Group__510888);
            rule__ViewHeader__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__6_in_rule__ViewHeader__Group__510891);
            rule__ViewHeader__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__5


    // $ANTLR start rule__ViewHeader__Group__5__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5428:1: rule__ViewHeader__Group__5__Impl : ( ( rule__ViewHeader__Group_5__0 )? ) ;
    public final void rule__ViewHeader__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5432:1: ( ( ( rule__ViewHeader__Group_5__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5433:1: ( ( rule__ViewHeader__Group_5__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5433:1: ( ( rule__ViewHeader__Group_5__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5434:1: ( rule__ViewHeader__Group_5__0 )?
            {
             before(grammarAccess.getViewHeaderAccess().getGroup_5()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5435:1: ( rule__ViewHeader__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==49) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5435:2: rule__ViewHeader__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ViewHeader__Group_5__0_in_rule__ViewHeader__Group__5__Impl10918);
                    rule__ViewHeader__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewHeaderAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__5__Impl


    // $ANTLR start rule__ViewHeader__Group__6
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5445:1: rule__ViewHeader__Group__6 : rule__ViewHeader__Group__6__Impl rule__ViewHeader__Group__7 ;
    public final void rule__ViewHeader__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5449:1: ( rule__ViewHeader__Group__6__Impl rule__ViewHeader__Group__7 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5450:2: rule__ViewHeader__Group__6__Impl rule__ViewHeader__Group__7
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__6__Impl_in_rule__ViewHeader__Group__610949);
            rule__ViewHeader__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__7_in_rule__ViewHeader__Group__610952);
            rule__ViewHeader__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__6


    // $ANTLR start rule__ViewHeader__Group__6__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5457:1: rule__ViewHeader__Group__6__Impl : ( ( rule__ViewHeader__Group_6__0 )? ) ;
    public final void rule__ViewHeader__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5461:1: ( ( ( rule__ViewHeader__Group_6__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5462:1: ( ( rule__ViewHeader__Group_6__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5462:1: ( ( rule__ViewHeader__Group_6__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5463:1: ( rule__ViewHeader__Group_6__0 )?
            {
             before(grammarAccess.getViewHeaderAccess().getGroup_6()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5464:1: ( rule__ViewHeader__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==50) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5464:2: rule__ViewHeader__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__ViewHeader__Group_6__0_in_rule__ViewHeader__Group__6__Impl10979);
                    rule__ViewHeader__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewHeaderAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__6__Impl


    // $ANTLR start rule__ViewHeader__Group__7
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5474:1: rule__ViewHeader__Group__7 : rule__ViewHeader__Group__7__Impl ;
    public final void rule__ViewHeader__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5478:1: ( rule__ViewHeader__Group__7__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5479:2: rule__ViewHeader__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__7__Impl_in_rule__ViewHeader__Group__711010);
            rule__ViewHeader__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__7


    // $ANTLR start rule__ViewHeader__Group__7__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5485:1: rule__ViewHeader__Group__7__Impl : ( '}' ) ;
    public final void rule__ViewHeader__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5489:1: ( ( '}' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5490:1: ( '}' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5490:1: ( '}' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5491:1: '}'
            {
             before(grammarAccess.getViewHeaderAccess().getRightCurlyBracketKeyword_7()); 
            match(input,27,FOLLOW_27_in_rule__ViewHeader__Group__7__Impl11038); 
             after(grammarAccess.getViewHeaderAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group__7__Impl


    // $ANTLR start rule__ViewHeader__Group_3__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5520:1: rule__ViewHeader__Group_3__0 : rule__ViewHeader__Group_3__0__Impl rule__ViewHeader__Group_3__1 ;
    public final void rule__ViewHeader__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5524:1: ( rule__ViewHeader__Group_3__0__Impl rule__ViewHeader__Group_3__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5525:2: rule__ViewHeader__Group_3__0__Impl rule__ViewHeader__Group_3__1
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_3__0__Impl_in_rule__ViewHeader__Group_3__011085);
            rule__ViewHeader__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group_3__1_in_rule__ViewHeader__Group_3__011088);
            rule__ViewHeader__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_3__0


    // $ANTLR start rule__ViewHeader__Group_3__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5532:1: rule__ViewHeader__Group_3__0__Impl : ( 'title=' ) ;
    public final void rule__ViewHeader__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5536:1: ( ( 'title=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5537:1: ( 'title=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5537:1: ( 'title=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5538:1: 'title='
            {
             before(grammarAccess.getViewHeaderAccess().getTitleKeyword_3_0()); 
            match(input,30,FOLLOW_30_in_rule__ViewHeader__Group_3__0__Impl11116); 
             after(grammarAccess.getViewHeaderAccess().getTitleKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_3__0__Impl


    // $ANTLR start rule__ViewHeader__Group_3__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5551:1: rule__ViewHeader__Group_3__1 : rule__ViewHeader__Group_3__1__Impl ;
    public final void rule__ViewHeader__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5555:1: ( rule__ViewHeader__Group_3__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5556:2: rule__ViewHeader__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_3__1__Impl_in_rule__ViewHeader__Group_3__111147);
            rule__ViewHeader__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_3__1


    // $ANTLR start rule__ViewHeader__Group_3__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5562:1: rule__ViewHeader__Group_3__1__Impl : ( ( rule__ViewHeader__TitleAssignment_3_1 ) ) ;
    public final void rule__ViewHeader__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5566:1: ( ( ( rule__ViewHeader__TitleAssignment_3_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5567:1: ( ( rule__ViewHeader__TitleAssignment_3_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5567:1: ( ( rule__ViewHeader__TitleAssignment_3_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5568:1: ( rule__ViewHeader__TitleAssignment_3_1 )
            {
             before(grammarAccess.getViewHeaderAccess().getTitleAssignment_3_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5569:1: ( rule__ViewHeader__TitleAssignment_3_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5569:2: rule__ViewHeader__TitleAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ViewHeader__TitleAssignment_3_1_in_rule__ViewHeader__Group_3__1__Impl11174);
            rule__ViewHeader__TitleAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getViewHeaderAccess().getTitleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_3__1__Impl


    // $ANTLR start rule__ViewHeader__Group_4__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5583:1: rule__ViewHeader__Group_4__0 : rule__ViewHeader__Group_4__0__Impl rule__ViewHeader__Group_4__1 ;
    public final void rule__ViewHeader__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5587:1: ( rule__ViewHeader__Group_4__0__Impl rule__ViewHeader__Group_4__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5588:2: rule__ViewHeader__Group_4__0__Impl rule__ViewHeader__Group_4__1
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_4__0__Impl_in_rule__ViewHeader__Group_4__011208);
            rule__ViewHeader__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group_4__1_in_rule__ViewHeader__Group_4__011211);
            rule__ViewHeader__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_4__0


    // $ANTLR start rule__ViewHeader__Group_4__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5595:1: rule__ViewHeader__Group_4__0__Impl : ( 'subtitle=' ) ;
    public final void rule__ViewHeader__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5599:1: ( ( 'subtitle=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5600:1: ( 'subtitle=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5600:1: ( 'subtitle=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5601:1: 'subtitle='
            {
             before(grammarAccess.getViewHeaderAccess().getSubtitleKeyword_4_0()); 
            match(input,48,FOLLOW_48_in_rule__ViewHeader__Group_4__0__Impl11239); 
             after(grammarAccess.getViewHeaderAccess().getSubtitleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_4__0__Impl


    // $ANTLR start rule__ViewHeader__Group_4__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5614:1: rule__ViewHeader__Group_4__1 : rule__ViewHeader__Group_4__1__Impl ;
    public final void rule__ViewHeader__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5618:1: ( rule__ViewHeader__Group_4__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5619:2: rule__ViewHeader__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_4__1__Impl_in_rule__ViewHeader__Group_4__111270);
            rule__ViewHeader__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_4__1


    // $ANTLR start rule__ViewHeader__Group_4__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5625:1: rule__ViewHeader__Group_4__1__Impl : ( ( rule__ViewHeader__SubtitleAssignment_4_1 ) ) ;
    public final void rule__ViewHeader__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5629:1: ( ( ( rule__ViewHeader__SubtitleAssignment_4_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5630:1: ( ( rule__ViewHeader__SubtitleAssignment_4_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5630:1: ( ( rule__ViewHeader__SubtitleAssignment_4_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5631:1: ( rule__ViewHeader__SubtitleAssignment_4_1 )
            {
             before(grammarAccess.getViewHeaderAccess().getSubtitleAssignment_4_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5632:1: ( rule__ViewHeader__SubtitleAssignment_4_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5632:2: rule__ViewHeader__SubtitleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ViewHeader__SubtitleAssignment_4_1_in_rule__ViewHeader__Group_4__1__Impl11297);
            rule__ViewHeader__SubtitleAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getViewHeaderAccess().getSubtitleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_4__1__Impl


    // $ANTLR start rule__ViewHeader__Group_5__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5646:1: rule__ViewHeader__Group_5__0 : rule__ViewHeader__Group_5__0__Impl rule__ViewHeader__Group_5__1 ;
    public final void rule__ViewHeader__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5650:1: ( rule__ViewHeader__Group_5__0__Impl rule__ViewHeader__Group_5__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5651:2: rule__ViewHeader__Group_5__0__Impl rule__ViewHeader__Group_5__1
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_5__0__Impl_in_rule__ViewHeader__Group_5__011331);
            rule__ViewHeader__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group_5__1_in_rule__ViewHeader__Group_5__011334);
            rule__ViewHeader__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_5__0


    // $ANTLR start rule__ViewHeader__Group_5__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5658:1: rule__ViewHeader__Group_5__0__Impl : ( 'details=' ) ;
    public final void rule__ViewHeader__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5662:1: ( ( 'details=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5663:1: ( 'details=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5663:1: ( 'details=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5664:1: 'details='
            {
             before(grammarAccess.getViewHeaderAccess().getDetailsKeyword_5_0()); 
            match(input,49,FOLLOW_49_in_rule__ViewHeader__Group_5__0__Impl11362); 
             after(grammarAccess.getViewHeaderAccess().getDetailsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_5__0__Impl


    // $ANTLR start rule__ViewHeader__Group_5__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5677:1: rule__ViewHeader__Group_5__1 : rule__ViewHeader__Group_5__1__Impl ;
    public final void rule__ViewHeader__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5681:1: ( rule__ViewHeader__Group_5__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5682:2: rule__ViewHeader__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_5__1__Impl_in_rule__ViewHeader__Group_5__111393);
            rule__ViewHeader__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_5__1


    // $ANTLR start rule__ViewHeader__Group_5__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5688:1: rule__ViewHeader__Group_5__1__Impl : ( ( rule__ViewHeader__DetailsAssignment_5_1 ) ) ;
    public final void rule__ViewHeader__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5692:1: ( ( ( rule__ViewHeader__DetailsAssignment_5_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5693:1: ( ( rule__ViewHeader__DetailsAssignment_5_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5693:1: ( ( rule__ViewHeader__DetailsAssignment_5_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5694:1: ( rule__ViewHeader__DetailsAssignment_5_1 )
            {
             before(grammarAccess.getViewHeaderAccess().getDetailsAssignment_5_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5695:1: ( rule__ViewHeader__DetailsAssignment_5_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5695:2: rule__ViewHeader__DetailsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ViewHeader__DetailsAssignment_5_1_in_rule__ViewHeader__Group_5__1__Impl11420);
            rule__ViewHeader__DetailsAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getViewHeaderAccess().getDetailsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_5__1__Impl


    // $ANTLR start rule__ViewHeader__Group_6__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5709:1: rule__ViewHeader__Group_6__0 : rule__ViewHeader__Group_6__0__Impl rule__ViewHeader__Group_6__1 ;
    public final void rule__ViewHeader__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5713:1: ( rule__ViewHeader__Group_6__0__Impl rule__ViewHeader__Group_6__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5714:2: rule__ViewHeader__Group_6__0__Impl rule__ViewHeader__Group_6__1
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_6__0__Impl_in_rule__ViewHeader__Group_6__011454);
            rule__ViewHeader__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group_6__1_in_rule__ViewHeader__Group_6__011457);
            rule__ViewHeader__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_6__0


    // $ANTLR start rule__ViewHeader__Group_6__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5721:1: rule__ViewHeader__Group_6__0__Impl : ( 'image=' ) ;
    public final void rule__ViewHeader__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5725:1: ( ( 'image=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5726:1: ( 'image=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5726:1: ( 'image=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5727:1: 'image='
            {
             before(grammarAccess.getViewHeaderAccess().getImageKeyword_6_0()); 
            match(input,50,FOLLOW_50_in_rule__ViewHeader__Group_6__0__Impl11485); 
             after(grammarAccess.getViewHeaderAccess().getImageKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_6__0__Impl


    // $ANTLR start rule__ViewHeader__Group_6__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5740:1: rule__ViewHeader__Group_6__1 : rule__ViewHeader__Group_6__1__Impl ;
    public final void rule__ViewHeader__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5744:1: ( rule__ViewHeader__Group_6__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5745:2: rule__ViewHeader__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_6__1__Impl_in_rule__ViewHeader__Group_6__111516);
            rule__ViewHeader__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_6__1


    // $ANTLR start rule__ViewHeader__Group_6__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5751:1: rule__ViewHeader__Group_6__1__Impl : ( ( rule__ViewHeader__ImageAssignment_6_1 ) ) ;
    public final void rule__ViewHeader__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5755:1: ( ( ( rule__ViewHeader__ImageAssignment_6_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5756:1: ( ( rule__ViewHeader__ImageAssignment_6_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5756:1: ( ( rule__ViewHeader__ImageAssignment_6_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5757:1: ( rule__ViewHeader__ImageAssignment_6_1 )
            {
             before(grammarAccess.getViewHeaderAccess().getImageAssignment_6_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5758:1: ( rule__ViewHeader__ImageAssignment_6_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5758:2: rule__ViewHeader__ImageAssignment_6_1
            {
            pushFollow(FOLLOW_rule__ViewHeader__ImageAssignment_6_1_in_rule__ViewHeader__Group_6__1__Impl11543);
            rule__ViewHeader__ImageAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getViewHeaderAccess().getImageAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__Group_6__1__Impl


    // $ANTLR start rule__ViewSection__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5772:1: rule__ViewSection__Group__0 : rule__ViewSection__Group__0__Impl rule__ViewSection__Group__1 ;
    public final void rule__ViewSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5776:1: ( rule__ViewSection__Group__0__Impl rule__ViewSection__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5777:2: rule__ViewSection__Group__0__Impl rule__ViewSection__Group__1
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__0__Impl_in_rule__ViewSection__Group__011577);
            rule__ViewSection__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewSection__Group__1_in_rule__ViewSection__Group__011580);
            rule__ViewSection__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group__0


    // $ANTLR start rule__ViewSection__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5784:1: rule__ViewSection__Group__0__Impl : ( 'section' ) ;
    public final void rule__ViewSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5788:1: ( ( 'section' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5789:1: ( 'section' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5789:1: ( 'section' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5790:1: 'section'
            {
             before(grammarAccess.getViewSectionAccess().getSectionKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__ViewSection__Group__0__Impl11608); 
             after(grammarAccess.getViewSectionAccess().getSectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group__0__Impl


    // $ANTLR start rule__ViewSection__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5803:1: rule__ViewSection__Group__1 : rule__ViewSection__Group__1__Impl rule__ViewSection__Group__2 ;
    public final void rule__ViewSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5807:1: ( rule__ViewSection__Group__1__Impl rule__ViewSection__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5808:2: rule__ViewSection__Group__1__Impl rule__ViewSection__Group__2
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__1__Impl_in_rule__ViewSection__Group__111639);
            rule__ViewSection__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewSection__Group__2_in_rule__ViewSection__Group__111642);
            rule__ViewSection__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group__1


    // $ANTLR start rule__ViewSection__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5815:1: rule__ViewSection__Group__1__Impl : ( '{' ) ;
    public final void rule__ViewSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5819:1: ( ( '{' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5820:1: ( '{' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5820:1: ( '{' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5821:1: '{'
            {
             before(grammarAccess.getViewSectionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__ViewSection__Group__1__Impl11670); 
             after(grammarAccess.getViewSectionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group__1__Impl


    // $ANTLR start rule__ViewSection__Group__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5834:1: rule__ViewSection__Group__2 : rule__ViewSection__Group__2__Impl rule__ViewSection__Group__3 ;
    public final void rule__ViewSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5838:1: ( rule__ViewSection__Group__2__Impl rule__ViewSection__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5839:2: rule__ViewSection__Group__2__Impl rule__ViewSection__Group__3
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__2__Impl_in_rule__ViewSection__Group__211701);
            rule__ViewSection__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewSection__Group__3_in_rule__ViewSection__Group__211704);
            rule__ViewSection__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group__2


    // $ANTLR start rule__ViewSection__Group__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5846:1: rule__ViewSection__Group__2__Impl : ( ( rule__ViewSection__Group_2__0 )? ) ;
    public final void rule__ViewSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5850:1: ( ( ( rule__ViewSection__Group_2__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5851:1: ( ( rule__ViewSection__Group_2__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5851:1: ( ( rule__ViewSection__Group_2__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5852:1: ( rule__ViewSection__Group_2__0 )?
            {
             before(grammarAccess.getViewSectionAccess().getGroup_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5853:1: ( rule__ViewSection__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==30) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5853:2: rule__ViewSection__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ViewSection__Group_2__0_in_rule__ViewSection__Group__2__Impl11731);
                    rule__ViewSection__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewSectionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group__2__Impl


    // $ANTLR start rule__ViewSection__Group__3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5863:1: rule__ViewSection__Group__3 : rule__ViewSection__Group__3__Impl rule__ViewSection__Group__4 ;
    public final void rule__ViewSection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5867:1: ( rule__ViewSection__Group__3__Impl rule__ViewSection__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5868:2: rule__ViewSection__Group__3__Impl rule__ViewSection__Group__4
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__3__Impl_in_rule__ViewSection__Group__311762);
            rule__ViewSection__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewSection__Group__4_in_rule__ViewSection__Group__311765);
            rule__ViewSection__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group__3


    // $ANTLR start rule__ViewSection__Group__3__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5875:1: rule__ViewSection__Group__3__Impl : ( ( ( rule__ViewSection__CellsAssignment_3 ) ) ( ( rule__ViewSection__CellsAssignment_3 )* ) ) ;
    public final void rule__ViewSection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5879:1: ( ( ( ( rule__ViewSection__CellsAssignment_3 ) ) ( ( rule__ViewSection__CellsAssignment_3 )* ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5880:1: ( ( ( rule__ViewSection__CellsAssignment_3 ) ) ( ( rule__ViewSection__CellsAssignment_3 )* ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5880:1: ( ( ( rule__ViewSection__CellsAssignment_3 ) ) ( ( rule__ViewSection__CellsAssignment_3 )* ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5881:1: ( ( rule__ViewSection__CellsAssignment_3 ) ) ( ( rule__ViewSection__CellsAssignment_3 )* )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5881:1: ( ( rule__ViewSection__CellsAssignment_3 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5882:1: ( rule__ViewSection__CellsAssignment_3 )
            {
             before(grammarAccess.getViewSectionAccess().getCellsAssignment_3()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5883:1: ( rule__ViewSection__CellsAssignment_3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5883:2: rule__ViewSection__CellsAssignment_3
            {
            pushFollow(FOLLOW_rule__ViewSection__CellsAssignment_3_in_rule__ViewSection__Group__3__Impl11794);
            rule__ViewSection__CellsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getViewSectionAccess().getCellsAssignment_3()); 

            }

            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5886:1: ( ( rule__ViewSection__CellsAssignment_3 )* )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5887:1: ( rule__ViewSection__CellsAssignment_3 )*
            {
             before(grammarAccess.getViewSectionAccess().getCellsAssignment_3()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5888:1: ( rule__ViewSection__CellsAssignment_3 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==52) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5888:2: rule__ViewSection__CellsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ViewSection__CellsAssignment_3_in_rule__ViewSection__Group__3__Impl11806);
            	    rule__ViewSection__CellsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getViewSectionAccess().getCellsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group__3__Impl


    // $ANTLR start rule__ViewSection__Group__4
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5899:1: rule__ViewSection__Group__4 : rule__ViewSection__Group__4__Impl ;
    public final void rule__ViewSection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5903:1: ( rule__ViewSection__Group__4__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5904:2: rule__ViewSection__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__4__Impl_in_rule__ViewSection__Group__411839);
            rule__ViewSection__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group__4


    // $ANTLR start rule__ViewSection__Group__4__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5910:1: rule__ViewSection__Group__4__Impl : ( '}' ) ;
    public final void rule__ViewSection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5914:1: ( ( '}' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5915:1: ( '}' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5915:1: ( '}' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5916:1: '}'
            {
             before(grammarAccess.getViewSectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__ViewSection__Group__4__Impl11867); 
             after(grammarAccess.getViewSectionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group__4__Impl


    // $ANTLR start rule__ViewSection__Group_2__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5939:1: rule__ViewSection__Group_2__0 : rule__ViewSection__Group_2__0__Impl rule__ViewSection__Group_2__1 ;
    public final void rule__ViewSection__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5943:1: ( rule__ViewSection__Group_2__0__Impl rule__ViewSection__Group_2__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5944:2: rule__ViewSection__Group_2__0__Impl rule__ViewSection__Group_2__1
            {
            pushFollow(FOLLOW_rule__ViewSection__Group_2__0__Impl_in_rule__ViewSection__Group_2__011908);
            rule__ViewSection__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewSection__Group_2__1_in_rule__ViewSection__Group_2__011911);
            rule__ViewSection__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group_2__0


    // $ANTLR start rule__ViewSection__Group_2__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5951:1: rule__ViewSection__Group_2__0__Impl : ( 'title=' ) ;
    public final void rule__ViewSection__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5955:1: ( ( 'title=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5956:1: ( 'title=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5956:1: ( 'title=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5957:1: 'title='
            {
             before(grammarAccess.getViewSectionAccess().getTitleKeyword_2_0()); 
            match(input,30,FOLLOW_30_in_rule__ViewSection__Group_2__0__Impl11939); 
             after(grammarAccess.getViewSectionAccess().getTitleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group_2__0__Impl


    // $ANTLR start rule__ViewSection__Group_2__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5970:1: rule__ViewSection__Group_2__1 : rule__ViewSection__Group_2__1__Impl ;
    public final void rule__ViewSection__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5974:1: ( rule__ViewSection__Group_2__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5975:2: rule__ViewSection__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewSection__Group_2__1__Impl_in_rule__ViewSection__Group_2__111970);
            rule__ViewSection__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group_2__1


    // $ANTLR start rule__ViewSection__Group_2__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5981:1: rule__ViewSection__Group_2__1__Impl : ( ( rule__ViewSection__TitleAssignment_2_1 ) ) ;
    public final void rule__ViewSection__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5985:1: ( ( ( rule__ViewSection__TitleAssignment_2_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5986:1: ( ( rule__ViewSection__TitleAssignment_2_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5986:1: ( ( rule__ViewSection__TitleAssignment_2_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5987:1: ( rule__ViewSection__TitleAssignment_2_1 )
            {
             before(grammarAccess.getViewSectionAccess().getTitleAssignment_2_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5988:1: ( rule__ViewSection__TitleAssignment_2_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5988:2: rule__ViewSection__TitleAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ViewSection__TitleAssignment_2_1_in_rule__ViewSection__Group_2__1__Impl11997);
            rule__ViewSection__TitleAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getViewSectionAccess().getTitleAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__Group_2__1__Impl


    // $ANTLR start rule__SectionCell__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6002:1: rule__SectionCell__Group__0 : rule__SectionCell__Group__0__Impl rule__SectionCell__Group__1 ;
    public final void rule__SectionCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6006:1: ( rule__SectionCell__Group__0__Impl rule__SectionCell__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6007:2: rule__SectionCell__Group__0__Impl rule__SectionCell__Group__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__0__Impl_in_rule__SectionCell__Group__012031);
            rule__SectionCell__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__1_in_rule__SectionCell__Group__012034);
            rule__SectionCell__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__0


    // $ANTLR start rule__SectionCell__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6014:1: rule__SectionCell__Group__0__Impl : ( 'cell' ) ;
    public final void rule__SectionCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6018:1: ( ( 'cell' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6019:1: ( 'cell' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6019:1: ( 'cell' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6020:1: 'cell'
            {
             before(grammarAccess.getSectionCellAccess().getCellKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__SectionCell__Group__0__Impl12062); 
             after(grammarAccess.getSectionCellAccess().getCellKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__0__Impl


    // $ANTLR start rule__SectionCell__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6033:1: rule__SectionCell__Group__1 : rule__SectionCell__Group__1__Impl rule__SectionCell__Group__2 ;
    public final void rule__SectionCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6037:1: ( rule__SectionCell__Group__1__Impl rule__SectionCell__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6038:2: rule__SectionCell__Group__1__Impl rule__SectionCell__Group__2
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__1__Impl_in_rule__SectionCell__Group__112093);
            rule__SectionCell__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__2_in_rule__SectionCell__Group__112096);
            rule__SectionCell__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__1


    // $ANTLR start rule__SectionCell__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6045:1: rule__SectionCell__Group__1__Impl : ( ( rule__SectionCell__TypeAssignment_1 ) ) ;
    public final void rule__SectionCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6049:1: ( ( ( rule__SectionCell__TypeAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6050:1: ( ( rule__SectionCell__TypeAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6050:1: ( ( rule__SectionCell__TypeAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6051:1: ( rule__SectionCell__TypeAssignment_1 )
            {
             before(grammarAccess.getSectionCellAccess().getTypeAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6052:1: ( rule__SectionCell__TypeAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6052:2: rule__SectionCell__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__SectionCell__TypeAssignment_1_in_rule__SectionCell__Group__1__Impl12123);
            rule__SectionCell__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSectionCellAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__1__Impl


    // $ANTLR start rule__SectionCell__Group__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6062:1: rule__SectionCell__Group__2 : rule__SectionCell__Group__2__Impl rule__SectionCell__Group__3 ;
    public final void rule__SectionCell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6066:1: ( rule__SectionCell__Group__2__Impl rule__SectionCell__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6067:2: rule__SectionCell__Group__2__Impl rule__SectionCell__Group__3
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__2__Impl_in_rule__SectionCell__Group__212153);
            rule__SectionCell__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__3_in_rule__SectionCell__Group__212156);
            rule__SectionCell__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__2


    // $ANTLR start rule__SectionCell__Group__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6074:1: rule__SectionCell__Group__2__Impl : ( ( rule__SectionCell__Group_2__0 )? ) ;
    public final void rule__SectionCell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6078:1: ( ( ( rule__SectionCell__Group_2__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6079:1: ( ( rule__SectionCell__Group_2__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6079:1: ( ( rule__SectionCell__Group_2__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6080:1: ( rule__SectionCell__Group_2__0 )?
            {
             before(grammarAccess.getSectionCellAccess().getGroup_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6081:1: ( rule__SectionCell__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==53) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6081:2: rule__SectionCell__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SectionCell__Group_2__0_in_rule__SectionCell__Group__2__Impl12183);
                    rule__SectionCell__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionCellAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__2__Impl


    // $ANTLR start rule__SectionCell__Group__3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6091:1: rule__SectionCell__Group__3 : rule__SectionCell__Group__3__Impl rule__SectionCell__Group__4 ;
    public final void rule__SectionCell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6095:1: ( rule__SectionCell__Group__3__Impl rule__SectionCell__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6096:2: rule__SectionCell__Group__3__Impl rule__SectionCell__Group__4
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__3__Impl_in_rule__SectionCell__Group__312214);
            rule__SectionCell__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__4_in_rule__SectionCell__Group__312217);
            rule__SectionCell__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__3


    // $ANTLR start rule__SectionCell__Group__3__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6103:1: rule__SectionCell__Group__3__Impl : ( '{' ) ;
    public final void rule__SectionCell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6107:1: ( ( '{' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6108:1: ( '{' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6108:1: ( '{' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6109:1: '{'
            {
             before(grammarAccess.getSectionCellAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__SectionCell__Group__3__Impl12245); 
             after(grammarAccess.getSectionCellAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__3__Impl


    // $ANTLR start rule__SectionCell__Group__4
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6122:1: rule__SectionCell__Group__4 : rule__SectionCell__Group__4__Impl rule__SectionCell__Group__5 ;
    public final void rule__SectionCell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6126:1: ( rule__SectionCell__Group__4__Impl rule__SectionCell__Group__5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6127:2: rule__SectionCell__Group__4__Impl rule__SectionCell__Group__5
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__4__Impl_in_rule__SectionCell__Group__412276);
            rule__SectionCell__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__5_in_rule__SectionCell__Group__412279);
            rule__SectionCell__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__4


    // $ANTLR start rule__SectionCell__Group__4__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6134:1: rule__SectionCell__Group__4__Impl : ( ( rule__SectionCell__Group_4__0 )? ) ;
    public final void rule__SectionCell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6138:1: ( ( ( rule__SectionCell__Group_4__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6139:1: ( ( rule__SectionCell__Group_4__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6139:1: ( ( rule__SectionCell__Group_4__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6140:1: ( rule__SectionCell__Group_4__0 )?
            {
             before(grammarAccess.getSectionCellAccess().getGroup_4()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6141:1: ( rule__SectionCell__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6141:2: rule__SectionCell__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SectionCell__Group_4__0_in_rule__SectionCell__Group__4__Impl12306);
                    rule__SectionCell__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionCellAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__4__Impl


    // $ANTLR start rule__SectionCell__Group__5
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6151:1: rule__SectionCell__Group__5 : rule__SectionCell__Group__5__Impl rule__SectionCell__Group__6 ;
    public final void rule__SectionCell__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6155:1: ( rule__SectionCell__Group__5__Impl rule__SectionCell__Group__6 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6156:2: rule__SectionCell__Group__5__Impl rule__SectionCell__Group__6
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__5__Impl_in_rule__SectionCell__Group__512337);
            rule__SectionCell__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__6_in_rule__SectionCell__Group__512340);
            rule__SectionCell__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__5


    // $ANTLR start rule__SectionCell__Group__5__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6163:1: rule__SectionCell__Group__5__Impl : ( ( rule__SectionCell__Group_5__0 )? ) ;
    public final void rule__SectionCell__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6167:1: ( ( ( rule__SectionCell__Group_5__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6168:1: ( ( rule__SectionCell__Group_5__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6168:1: ( ( rule__SectionCell__Group_5__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6169:1: ( rule__SectionCell__Group_5__0 )?
            {
             before(grammarAccess.getSectionCellAccess().getGroup_5()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6170:1: ( rule__SectionCell__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6170:2: rule__SectionCell__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__SectionCell__Group_5__0_in_rule__SectionCell__Group__5__Impl12367);
                    rule__SectionCell__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionCellAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__5__Impl


    // $ANTLR start rule__SectionCell__Group__6
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6180:1: rule__SectionCell__Group__6 : rule__SectionCell__Group__6__Impl rule__SectionCell__Group__7 ;
    public final void rule__SectionCell__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6184:1: ( rule__SectionCell__Group__6__Impl rule__SectionCell__Group__7 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6185:2: rule__SectionCell__Group__6__Impl rule__SectionCell__Group__7
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__6__Impl_in_rule__SectionCell__Group__612398);
            rule__SectionCell__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__7_in_rule__SectionCell__Group__612401);
            rule__SectionCell__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__6


    // $ANTLR start rule__SectionCell__Group__6__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6192:1: rule__SectionCell__Group__6__Impl : ( ( rule__SectionCell__Group_6__0 )? ) ;
    public final void rule__SectionCell__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6196:1: ( ( ( rule__SectionCell__Group_6__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6197:1: ( ( rule__SectionCell__Group_6__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6197:1: ( ( rule__SectionCell__Group_6__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6198:1: ( rule__SectionCell__Group_6__0 )?
            {
             before(grammarAccess.getSectionCellAccess().getGroup_6()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6199:1: ( rule__SectionCell__Group_6__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==50) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6199:2: rule__SectionCell__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__SectionCell__Group_6__0_in_rule__SectionCell__Group__6__Impl12428);
                    rule__SectionCell__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionCellAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__6__Impl


    // $ANTLR start rule__SectionCell__Group__7
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6209:1: rule__SectionCell__Group__7 : rule__SectionCell__Group__7__Impl rule__SectionCell__Group__8 ;
    public final void rule__SectionCell__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6213:1: ( rule__SectionCell__Group__7__Impl rule__SectionCell__Group__8 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6214:2: rule__SectionCell__Group__7__Impl rule__SectionCell__Group__8
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__7__Impl_in_rule__SectionCell__Group__712459);
            rule__SectionCell__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__8_in_rule__SectionCell__Group__712462);
            rule__SectionCell__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__7


    // $ANTLR start rule__SectionCell__Group__7__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6221:1: rule__SectionCell__Group__7__Impl : ( ( rule__SectionCell__Group_7__0 )? ) ;
    public final void rule__SectionCell__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6225:1: ( ( ( rule__SectionCell__Group_7__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6226:1: ( ( rule__SectionCell__Group_7__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6226:1: ( ( rule__SectionCell__Group_7__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6227:1: ( rule__SectionCell__Group_7__0 )?
            {
             before(grammarAccess.getSectionCellAccess().getGroup_7()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6228:1: ( rule__SectionCell__Group_7__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==55) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6228:2: rule__SectionCell__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__SectionCell__Group_7__0_in_rule__SectionCell__Group__7__Impl12489);
                    rule__SectionCell__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionCellAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__7__Impl


    // $ANTLR start rule__SectionCell__Group__8
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6238:1: rule__SectionCell__Group__8 : rule__SectionCell__Group__8__Impl ;
    public final void rule__SectionCell__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6242:1: ( rule__SectionCell__Group__8__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6243:2: rule__SectionCell__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__8__Impl_in_rule__SectionCell__Group__812520);
            rule__SectionCell__Group__8__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__8


    // $ANTLR start rule__SectionCell__Group__8__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6249:1: rule__SectionCell__Group__8__Impl : ( '}' ) ;
    public final void rule__SectionCell__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6253:1: ( ( '}' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6254:1: ( '}' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6254:1: ( '}' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6255:1: '}'
            {
             before(grammarAccess.getSectionCellAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_27_in_rule__SectionCell__Group__8__Impl12548); 
             after(grammarAccess.getSectionCellAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group__8__Impl


    // $ANTLR start rule__SectionCell__Group_2__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6286:1: rule__SectionCell__Group_2__0 : rule__SectionCell__Group_2__0__Impl rule__SectionCell__Group_2__1 ;
    public final void rule__SectionCell__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6290:1: ( rule__SectionCell__Group_2__0__Impl rule__SectionCell__Group_2__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6291:2: rule__SectionCell__Group_2__0__Impl rule__SectionCell__Group_2__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_2__0__Impl_in_rule__SectionCell__Group_2__012597);
            rule__SectionCell__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group_2__1_in_rule__SectionCell__Group_2__012600);
            rule__SectionCell__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_2__0


    // $ANTLR start rule__SectionCell__Group_2__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6298:1: rule__SectionCell__Group_2__0__Impl : ( 'foreach' ) ;
    public final void rule__SectionCell__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6302:1: ( ( 'foreach' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6303:1: ( 'foreach' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6303:1: ( 'foreach' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6304:1: 'foreach'
            {
             before(grammarAccess.getSectionCellAccess().getForeachKeyword_2_0()); 
            match(input,53,FOLLOW_53_in_rule__SectionCell__Group_2__0__Impl12628); 
             after(grammarAccess.getSectionCellAccess().getForeachKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_2__0__Impl


    // $ANTLR start rule__SectionCell__Group_2__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6317:1: rule__SectionCell__Group_2__1 : rule__SectionCell__Group_2__1__Impl ;
    public final void rule__SectionCell__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6321:1: ( rule__SectionCell__Group_2__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6322:2: rule__SectionCell__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_2__1__Impl_in_rule__SectionCell__Group_2__112659);
            rule__SectionCell__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_2__1


    // $ANTLR start rule__SectionCell__Group_2__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6328:1: rule__SectionCell__Group_2__1__Impl : ( ( rule__SectionCell__IteratorAssignment_2_1 ) ) ;
    public final void rule__SectionCell__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6332:1: ( ( ( rule__SectionCell__IteratorAssignment_2_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6333:1: ( ( rule__SectionCell__IteratorAssignment_2_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6333:1: ( ( rule__SectionCell__IteratorAssignment_2_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6334:1: ( rule__SectionCell__IteratorAssignment_2_1 )
            {
             before(grammarAccess.getSectionCellAccess().getIteratorAssignment_2_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6335:1: ( rule__SectionCell__IteratorAssignment_2_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6335:2: rule__SectionCell__IteratorAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SectionCell__IteratorAssignment_2_1_in_rule__SectionCell__Group_2__1__Impl12686);
            rule__SectionCell__IteratorAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getSectionCellAccess().getIteratorAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_2__1__Impl


    // $ANTLR start rule__SectionCell__Group_4__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6349:1: rule__SectionCell__Group_4__0 : rule__SectionCell__Group_4__0__Impl rule__SectionCell__Group_4__1 ;
    public final void rule__SectionCell__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6353:1: ( rule__SectionCell__Group_4__0__Impl rule__SectionCell__Group_4__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6354:2: rule__SectionCell__Group_4__0__Impl rule__SectionCell__Group_4__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_4__0__Impl_in_rule__SectionCell__Group_4__012720);
            rule__SectionCell__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group_4__1_in_rule__SectionCell__Group_4__012723);
            rule__SectionCell__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_4__0


    // $ANTLR start rule__SectionCell__Group_4__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6361:1: rule__SectionCell__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__SectionCell__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6365:1: ( ( 'text=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6366:1: ( 'text=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6366:1: ( 'text=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6367:1: 'text='
            {
             before(grammarAccess.getSectionCellAccess().getTextKeyword_4_0()); 
            match(input,54,FOLLOW_54_in_rule__SectionCell__Group_4__0__Impl12751); 
             after(grammarAccess.getSectionCellAccess().getTextKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_4__0__Impl


    // $ANTLR start rule__SectionCell__Group_4__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6380:1: rule__SectionCell__Group_4__1 : rule__SectionCell__Group_4__1__Impl ;
    public final void rule__SectionCell__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6384:1: ( rule__SectionCell__Group_4__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6385:2: rule__SectionCell__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_4__1__Impl_in_rule__SectionCell__Group_4__112782);
            rule__SectionCell__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_4__1


    // $ANTLR start rule__SectionCell__Group_4__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6391:1: rule__SectionCell__Group_4__1__Impl : ( ( rule__SectionCell__TextAssignment_4_1 ) ) ;
    public final void rule__SectionCell__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6395:1: ( ( ( rule__SectionCell__TextAssignment_4_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6396:1: ( ( rule__SectionCell__TextAssignment_4_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6396:1: ( ( rule__SectionCell__TextAssignment_4_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6397:1: ( rule__SectionCell__TextAssignment_4_1 )
            {
             before(grammarAccess.getSectionCellAccess().getTextAssignment_4_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6398:1: ( rule__SectionCell__TextAssignment_4_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6398:2: rule__SectionCell__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SectionCell__TextAssignment_4_1_in_rule__SectionCell__Group_4__1__Impl12809);
            rule__SectionCell__TextAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getSectionCellAccess().getTextAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_4__1__Impl


    // $ANTLR start rule__SectionCell__Group_5__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6412:1: rule__SectionCell__Group_5__0 : rule__SectionCell__Group_5__0__Impl rule__SectionCell__Group_5__1 ;
    public final void rule__SectionCell__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6416:1: ( rule__SectionCell__Group_5__0__Impl rule__SectionCell__Group_5__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6417:2: rule__SectionCell__Group_5__0__Impl rule__SectionCell__Group_5__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_5__0__Impl_in_rule__SectionCell__Group_5__012843);
            rule__SectionCell__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group_5__1_in_rule__SectionCell__Group_5__012846);
            rule__SectionCell__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_5__0


    // $ANTLR start rule__SectionCell__Group_5__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6424:1: rule__SectionCell__Group_5__0__Impl : ( 'details=' ) ;
    public final void rule__SectionCell__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6428:1: ( ( 'details=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6429:1: ( 'details=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6429:1: ( 'details=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6430:1: 'details='
            {
             before(grammarAccess.getSectionCellAccess().getDetailsKeyword_5_0()); 
            match(input,49,FOLLOW_49_in_rule__SectionCell__Group_5__0__Impl12874); 
             after(grammarAccess.getSectionCellAccess().getDetailsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_5__0__Impl


    // $ANTLR start rule__SectionCell__Group_5__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6443:1: rule__SectionCell__Group_5__1 : rule__SectionCell__Group_5__1__Impl ;
    public final void rule__SectionCell__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6447:1: ( rule__SectionCell__Group_5__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6448:2: rule__SectionCell__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_5__1__Impl_in_rule__SectionCell__Group_5__112905);
            rule__SectionCell__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_5__1


    // $ANTLR start rule__SectionCell__Group_5__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6454:1: rule__SectionCell__Group_5__1__Impl : ( ( rule__SectionCell__DetailsAssignment_5_1 ) ) ;
    public final void rule__SectionCell__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6458:1: ( ( ( rule__SectionCell__DetailsAssignment_5_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6459:1: ( ( rule__SectionCell__DetailsAssignment_5_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6459:1: ( ( rule__SectionCell__DetailsAssignment_5_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6460:1: ( rule__SectionCell__DetailsAssignment_5_1 )
            {
             before(grammarAccess.getSectionCellAccess().getDetailsAssignment_5_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6461:1: ( rule__SectionCell__DetailsAssignment_5_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6461:2: rule__SectionCell__DetailsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__SectionCell__DetailsAssignment_5_1_in_rule__SectionCell__Group_5__1__Impl12932);
            rule__SectionCell__DetailsAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getSectionCellAccess().getDetailsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_5__1__Impl


    // $ANTLR start rule__SectionCell__Group_6__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6475:1: rule__SectionCell__Group_6__0 : rule__SectionCell__Group_6__0__Impl rule__SectionCell__Group_6__1 ;
    public final void rule__SectionCell__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6479:1: ( rule__SectionCell__Group_6__0__Impl rule__SectionCell__Group_6__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6480:2: rule__SectionCell__Group_6__0__Impl rule__SectionCell__Group_6__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_6__0__Impl_in_rule__SectionCell__Group_6__012966);
            rule__SectionCell__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group_6__1_in_rule__SectionCell__Group_6__012969);
            rule__SectionCell__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_6__0


    // $ANTLR start rule__SectionCell__Group_6__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6487:1: rule__SectionCell__Group_6__0__Impl : ( 'image=' ) ;
    public final void rule__SectionCell__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6491:1: ( ( 'image=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6492:1: ( 'image=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6492:1: ( 'image=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6493:1: 'image='
            {
             before(grammarAccess.getSectionCellAccess().getImageKeyword_6_0()); 
            match(input,50,FOLLOW_50_in_rule__SectionCell__Group_6__0__Impl12997); 
             after(grammarAccess.getSectionCellAccess().getImageKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_6__0__Impl


    // $ANTLR start rule__SectionCell__Group_6__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6506:1: rule__SectionCell__Group_6__1 : rule__SectionCell__Group_6__1__Impl ;
    public final void rule__SectionCell__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6510:1: ( rule__SectionCell__Group_6__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6511:2: rule__SectionCell__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_6__1__Impl_in_rule__SectionCell__Group_6__113028);
            rule__SectionCell__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_6__1


    // $ANTLR start rule__SectionCell__Group_6__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6517:1: rule__SectionCell__Group_6__1__Impl : ( ( rule__SectionCell__ImageAssignment_6_1 ) ) ;
    public final void rule__SectionCell__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6521:1: ( ( ( rule__SectionCell__ImageAssignment_6_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6522:1: ( ( rule__SectionCell__ImageAssignment_6_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6522:1: ( ( rule__SectionCell__ImageAssignment_6_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6523:1: ( rule__SectionCell__ImageAssignment_6_1 )
            {
             before(grammarAccess.getSectionCellAccess().getImageAssignment_6_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6524:1: ( rule__SectionCell__ImageAssignment_6_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6524:2: rule__SectionCell__ImageAssignment_6_1
            {
            pushFollow(FOLLOW_rule__SectionCell__ImageAssignment_6_1_in_rule__SectionCell__Group_6__1__Impl13055);
            rule__SectionCell__ImageAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getSectionCellAccess().getImageAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_6__1__Impl


    // $ANTLR start rule__SectionCell__Group_7__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6538:1: rule__SectionCell__Group_7__0 : rule__SectionCell__Group_7__0__Impl rule__SectionCell__Group_7__1 ;
    public final void rule__SectionCell__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6542:1: ( rule__SectionCell__Group_7__0__Impl rule__SectionCell__Group_7__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6543:2: rule__SectionCell__Group_7__0__Impl rule__SectionCell__Group_7__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_7__0__Impl_in_rule__SectionCell__Group_7__013089);
            rule__SectionCell__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group_7__1_in_rule__SectionCell__Group_7__013092);
            rule__SectionCell__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_7__0


    // $ANTLR start rule__SectionCell__Group_7__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6550:1: rule__SectionCell__Group_7__0__Impl : ( 'action=' ) ;
    public final void rule__SectionCell__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6554:1: ( ( 'action=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6555:1: ( 'action=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6555:1: ( 'action=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6556:1: 'action='
            {
             before(grammarAccess.getSectionCellAccess().getActionKeyword_7_0()); 
            match(input,55,FOLLOW_55_in_rule__SectionCell__Group_7__0__Impl13120); 
             after(grammarAccess.getSectionCellAccess().getActionKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_7__0__Impl


    // $ANTLR start rule__SectionCell__Group_7__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6569:1: rule__SectionCell__Group_7__1 : rule__SectionCell__Group_7__1__Impl ;
    public final void rule__SectionCell__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6573:1: ( rule__SectionCell__Group_7__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6574:2: rule__SectionCell__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_7__1__Impl_in_rule__SectionCell__Group_7__113151);
            rule__SectionCell__Group_7__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_7__1


    // $ANTLR start rule__SectionCell__Group_7__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6580:1: rule__SectionCell__Group_7__1__Impl : ( ( rule__SectionCell__ActionAssignment_7_1 ) ) ;
    public final void rule__SectionCell__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6584:1: ( ( ( rule__SectionCell__ActionAssignment_7_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6585:1: ( ( rule__SectionCell__ActionAssignment_7_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6585:1: ( ( rule__SectionCell__ActionAssignment_7_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6586:1: ( rule__SectionCell__ActionAssignment_7_1 )
            {
             before(grammarAccess.getSectionCellAccess().getActionAssignment_7_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6587:1: ( rule__SectionCell__ActionAssignment_7_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6587:2: rule__SectionCell__ActionAssignment_7_1
            {
            pushFollow(FOLLOW_rule__SectionCell__ActionAssignment_7_1_in_rule__SectionCell__Group_7__1__Impl13178);
            rule__SectionCell__ActionAssignment_7_1();
            _fsp--;


            }

             after(grammarAccess.getSectionCellAccess().getActionAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__Group_7__1__Impl


    // $ANTLR start rule__CollectionIterator__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6601:1: rule__CollectionIterator__Group__0 : rule__CollectionIterator__Group__0__Impl rule__CollectionIterator__Group__1 ;
    public final void rule__CollectionIterator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6605:1: ( rule__CollectionIterator__Group__0__Impl rule__CollectionIterator__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6606:2: rule__CollectionIterator__Group__0__Impl rule__CollectionIterator__Group__1
            {
            pushFollow(FOLLOW_rule__CollectionIterator__Group__0__Impl_in_rule__CollectionIterator__Group__013212);
            rule__CollectionIterator__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionIterator__Group__1_in_rule__CollectionIterator__Group__013215);
            rule__CollectionIterator__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionIterator__Group__0


    // $ANTLR start rule__CollectionIterator__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6613:1: rule__CollectionIterator__Group__0__Impl : ( ( rule__CollectionIterator__CollectionAssignment_0 ) ) ;
    public final void rule__CollectionIterator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6617:1: ( ( ( rule__CollectionIterator__CollectionAssignment_0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6618:1: ( ( rule__CollectionIterator__CollectionAssignment_0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6618:1: ( ( rule__CollectionIterator__CollectionAssignment_0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6619:1: ( rule__CollectionIterator__CollectionAssignment_0 )
            {
             before(grammarAccess.getCollectionIteratorAccess().getCollectionAssignment_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6620:1: ( rule__CollectionIterator__CollectionAssignment_0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6620:2: rule__CollectionIterator__CollectionAssignment_0
            {
            pushFollow(FOLLOW_rule__CollectionIterator__CollectionAssignment_0_in_rule__CollectionIterator__Group__0__Impl13242);
            rule__CollectionIterator__CollectionAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getCollectionIteratorAccess().getCollectionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionIterator__Group__0__Impl


    // $ANTLR start rule__CollectionIterator__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6630:1: rule__CollectionIterator__Group__1 : rule__CollectionIterator__Group__1__Impl rule__CollectionIterator__Group__2 ;
    public final void rule__CollectionIterator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6634:1: ( rule__CollectionIterator__Group__1__Impl rule__CollectionIterator__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6635:2: rule__CollectionIterator__Group__1__Impl rule__CollectionIterator__Group__2
            {
            pushFollow(FOLLOW_rule__CollectionIterator__Group__1__Impl_in_rule__CollectionIterator__Group__113272);
            rule__CollectionIterator__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionIterator__Group__2_in_rule__CollectionIterator__Group__113275);
            rule__CollectionIterator__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionIterator__Group__1


    // $ANTLR start rule__CollectionIterator__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6642:1: rule__CollectionIterator__Group__1__Impl : ( 'as' ) ;
    public final void rule__CollectionIterator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6646:1: ( ( 'as' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6647:1: ( 'as' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6647:1: ( 'as' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6648:1: 'as'
            {
             before(grammarAccess.getCollectionIteratorAccess().getAsKeyword_1()); 
            match(input,56,FOLLOW_56_in_rule__CollectionIterator__Group__1__Impl13303); 
             after(grammarAccess.getCollectionIteratorAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionIterator__Group__1__Impl


    // $ANTLR start rule__CollectionIterator__Group__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6661:1: rule__CollectionIterator__Group__2 : rule__CollectionIterator__Group__2__Impl ;
    public final void rule__CollectionIterator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6665:1: ( rule__CollectionIterator__Group__2__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6666:2: rule__CollectionIterator__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CollectionIterator__Group__2__Impl_in_rule__CollectionIterator__Group__213334);
            rule__CollectionIterator__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionIterator__Group__2


    // $ANTLR start rule__CollectionIterator__Group__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6672:1: rule__CollectionIterator__Group__2__Impl : ( ( rule__CollectionIterator__NameAssignment_2 ) ) ;
    public final void rule__CollectionIterator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6676:1: ( ( ( rule__CollectionIterator__NameAssignment_2 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6677:1: ( ( rule__CollectionIterator__NameAssignment_2 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6677:1: ( ( rule__CollectionIterator__NameAssignment_2 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6678:1: ( rule__CollectionIterator__NameAssignment_2 )
            {
             before(grammarAccess.getCollectionIteratorAccess().getNameAssignment_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6679:1: ( rule__CollectionIterator__NameAssignment_2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6679:2: rule__CollectionIterator__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CollectionIterator__NameAssignment_2_in_rule__CollectionIterator__Group__2__Impl13361);
            rule__CollectionIterator__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCollectionIteratorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionIterator__Group__2__Impl


    // $ANTLR start rule__ViewCall__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6695:1: rule__ViewCall__Group__0 : rule__ViewCall__Group__0__Impl rule__ViewCall__Group__1 ;
    public final void rule__ViewCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6699:1: ( rule__ViewCall__Group__0__Impl rule__ViewCall__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6700:2: rule__ViewCall__Group__0__Impl rule__ViewCall__Group__1
            {
            pushFollow(FOLLOW_rule__ViewCall__Group__0__Impl_in_rule__ViewCall__Group__013397);
            rule__ViewCall__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewCall__Group__1_in_rule__ViewCall__Group__013400);
            rule__ViewCall__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewCall__Group__0


    // $ANTLR start rule__ViewCall__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6707:1: rule__ViewCall__Group__0__Impl : ( ( rule__ViewCall__ViewAssignment_0 ) ) ;
    public final void rule__ViewCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6711:1: ( ( ( rule__ViewCall__ViewAssignment_0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6712:1: ( ( rule__ViewCall__ViewAssignment_0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6712:1: ( ( rule__ViewCall__ViewAssignment_0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6713:1: ( rule__ViewCall__ViewAssignment_0 )
            {
             before(grammarAccess.getViewCallAccess().getViewAssignment_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6714:1: ( rule__ViewCall__ViewAssignment_0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6714:2: rule__ViewCall__ViewAssignment_0
            {
            pushFollow(FOLLOW_rule__ViewCall__ViewAssignment_0_in_rule__ViewCall__Group__0__Impl13427);
            rule__ViewCall__ViewAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getViewCallAccess().getViewAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewCall__Group__0__Impl


    // $ANTLR start rule__ViewCall__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6724:1: rule__ViewCall__Group__1 : rule__ViewCall__Group__1__Impl rule__ViewCall__Group__2 ;
    public final void rule__ViewCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6728:1: ( rule__ViewCall__Group__1__Impl rule__ViewCall__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6729:2: rule__ViewCall__Group__1__Impl rule__ViewCall__Group__2
            {
            pushFollow(FOLLOW_rule__ViewCall__Group__1__Impl_in_rule__ViewCall__Group__113457);
            rule__ViewCall__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewCall__Group__2_in_rule__ViewCall__Group__113460);
            rule__ViewCall__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewCall__Group__1


    // $ANTLR start rule__ViewCall__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6736:1: rule__ViewCall__Group__1__Impl : ( '(' ) ;
    public final void rule__ViewCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6740:1: ( ( '(' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6741:1: ( '(' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6741:1: ( '(' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6742:1: '('
            {
             before(grammarAccess.getViewCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__ViewCall__Group__1__Impl13488); 
             after(grammarAccess.getViewCallAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewCall__Group__1__Impl


    // $ANTLR start rule__ViewCall__Group__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6755:1: rule__ViewCall__Group__2 : rule__ViewCall__Group__2__Impl rule__ViewCall__Group__3 ;
    public final void rule__ViewCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6759:1: ( rule__ViewCall__Group__2__Impl rule__ViewCall__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6760:2: rule__ViewCall__Group__2__Impl rule__ViewCall__Group__3
            {
            pushFollow(FOLLOW_rule__ViewCall__Group__2__Impl_in_rule__ViewCall__Group__213519);
            rule__ViewCall__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewCall__Group__3_in_rule__ViewCall__Group__213522);
            rule__ViewCall__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewCall__Group__2


    // $ANTLR start rule__ViewCall__Group__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6767:1: rule__ViewCall__Group__2__Impl : ( ( rule__ViewCall__ProviderAssignment_2 )? ) ;
    public final void rule__ViewCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6771:1: ( ( ( rule__ViewCall__ProviderAssignment_2 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6772:1: ( ( rule__ViewCall__ProviderAssignment_2 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6772:1: ( ( rule__ViewCall__ProviderAssignment_2 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6773:1: ( rule__ViewCall__ProviderAssignment_2 )?
            {
             before(grammarAccess.getViewCallAccess().getProviderAssignment_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6774:1: ( rule__ViewCall__ProviderAssignment_2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_STRING)||LA43_0==17||LA43_0==19||(LA43_0>=21 && LA43_0<=22)||LA43_0==24) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6774:2: rule__ViewCall__ProviderAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ViewCall__ProviderAssignment_2_in_rule__ViewCall__Group__2__Impl13549);
                    rule__ViewCall__ProviderAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewCallAccess().getProviderAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewCall__Group__2__Impl


    // $ANTLR start rule__ViewCall__Group__3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6784:1: rule__ViewCall__Group__3 : rule__ViewCall__Group__3__Impl ;
    public final void rule__ViewCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6788:1: ( rule__ViewCall__Group__3__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6789:2: rule__ViewCall__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ViewCall__Group__3__Impl_in_rule__ViewCall__Group__313580);
            rule__ViewCall__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewCall__Group__3


    // $ANTLR start rule__ViewCall__Group__3__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6795:1: rule__ViewCall__Group__3__Impl : ( ')' ) ;
    public final void rule__ViewCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6799:1: ( ( ')' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6800:1: ( ')' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6800:1: ( ')' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6801:1: ')'
            {
             before(grammarAccess.getViewCallAccess().getRightParenthesisKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__ViewCall__Group__3__Impl13608); 
             after(grammarAccess.getViewCallAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewCall__Group__3__Impl


    // $ANTLR start rule__Model__ApplicationAssignment_0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6823:1: rule__Model__ApplicationAssignment_0 : ( ruleApplication ) ;
    public final void rule__Model__ApplicationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6827:1: ( ( ruleApplication ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6828:1: ( ruleApplication )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6828:1: ( ruleApplication )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6829:1: ruleApplication
            {
             before(grammarAccess.getModelAccess().getApplicationApplicationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__Model__ApplicationAssignment_013652);
            ruleApplication();
            _fsp--;

             after(grammarAccess.getModelAccess().getApplicationApplicationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__ApplicationAssignment_0


    // $ANTLR start rule__Model__ElementsAssignment_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6838:1: rule__Model__ElementsAssignment_1 : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6842:1: ( ( ruleModelElement ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6843:1: ( ruleModelElement )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6843:1: ( ruleModelElement )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6844:1: ruleModelElement
            {
             before(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleModelElement_in_rule__Model__ElementsAssignment_113683);
            ruleModelElement();
            _fsp--;

             after(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__ElementsAssignment_1


    // $ANTLR start rule__TypeDescription__TypeAssignment_0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6853:1: rule__TypeDescription__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeDescription__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6857:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6858:1: ( ( RULE_ID ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6858:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6859:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeDescriptionAccess().getTypeTypeCrossReference_0_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6860:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6861:1: RULE_ID
            {
             before(grammarAccess.getTypeDescriptionAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDescription__TypeAssignment_013718); 
             after(grammarAccess.getTypeDescriptionAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTypeDescriptionAccess().getTypeTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDescription__TypeAssignment_0


    // $ANTLR start rule__TypeDescription__ManyAssignment_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6872:1: rule__TypeDescription__ManyAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__TypeDescription__ManyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6876:1: ( ( ( '[]' ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6877:1: ( ( '[]' ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6877:1: ( ( '[]' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6878:1: ( '[]' )
            {
             before(grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6879:1: ( '[]' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6880:1: '[]'
            {
             before(grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,57,FOLLOW_57_in_rule__TypeDescription__ManyAssignment_113758); 
             after(grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); 

            }

             after(grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeDescription__ManyAssignment_1


    // $ANTLR start rule__Parameter__DescriptionAssignment_0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6895:1: rule__Parameter__DescriptionAssignment_0 : ( ruleTypeDescription ) ;
    public final void rule__Parameter__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6899:1: ( ( ruleTypeDescription ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6900:1: ( ruleTypeDescription )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6900:1: ( ruleTypeDescription )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6901:1: ruleTypeDescription
            {
             before(grammarAccess.getParameterAccess().getDescriptionTypeDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeDescription_in_rule__Parameter__DescriptionAssignment_013797);
            ruleTypeDescription();
            _fsp--;

             after(grammarAccess.getParameterAccess().getDescriptionTypeDescriptionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__DescriptionAssignment_0


    // $ANTLR start rule__Parameter__NameAssignment_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6910:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6914:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6915:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6915:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6916:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_113828); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__NameAssignment_1


    // $ANTLR start rule__ObjectReference__ObjectAssignment_0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6925:1: rule__ObjectReference__ObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectReference__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6929:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6930:1: ( ( RULE_ID ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6930:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6931:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectReferenceAccess().getObjectVariableDeclarationCrossReference_0_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6932:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6933:1: RULE_ID
            {
             before(grammarAccess.getObjectReferenceAccess().getObjectVariableDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectReference__ObjectAssignment_013863); 
             after(grammarAccess.getObjectReferenceAccess().getObjectVariableDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getObjectReferenceAccess().getObjectVariableDeclarationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectReference__ObjectAssignment_0


    // $ANTLR start rule__ObjectReference__TailAssignment_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6944:1: rule__ObjectReference__TailAssignment_1 : ( ruleNestedObjectReference ) ;
    public final void rule__ObjectReference__TailAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6948:1: ( ( ruleNestedObjectReference ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6949:1: ( ruleNestedObjectReference )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6949:1: ( ruleNestedObjectReference )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6950:1: ruleNestedObjectReference
            {
             before(grammarAccess.getObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNestedObjectReference_in_rule__ObjectReference__TailAssignment_113898);
            ruleNestedObjectReference();
            _fsp--;

             after(grammarAccess.getObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ObjectReference__TailAssignment_1


    // $ANTLR start rule__NestedObjectReference__ObjectAssignment_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6959:1: rule__NestedObjectReference__ObjectAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__NestedObjectReference__ObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6963:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6964:1: ( ( RULE_ID ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6964:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6965:1: ( RULE_ID )
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getObjectVariableDeclarationCrossReference_1_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6966:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6967:1: RULE_ID
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getObjectVariableDeclarationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NestedObjectReference__ObjectAssignment_113933); 
             after(grammarAccess.getNestedObjectReferenceAccess().getObjectVariableDeclarationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getNestedObjectReferenceAccess().getObjectVariableDeclarationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NestedObjectReference__ObjectAssignment_1


    // $ANTLR start rule__NestedObjectReference__TailAssignment_2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6978:1: rule__NestedObjectReference__TailAssignment_2 : ( ruleNestedObjectReference ) ;
    public final void rule__NestedObjectReference__TailAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6982:1: ( ( ruleNestedObjectReference ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6983:1: ( ruleNestedObjectReference )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6983:1: ( ruleNestedObjectReference )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6984:1: ruleNestedObjectReference
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNestedObjectReference_in_rule__NestedObjectReference__TailAssignment_213968);
            ruleNestedObjectReference();
            _fsp--;

             after(grammarAccess.getNestedObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NestedObjectReference__TailAssignment_2


    // $ANTLR start rule__StringLiteral__ValueAssignment
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6993:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6997:1: ( ( RULE_STRING ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6998:1: ( RULE_STRING )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6998:1: ( RULE_STRING )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6999:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment13999); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringLiteral__ValueAssignment


    // $ANTLR start rule__StringFunction__ValuesAssignment_0_2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7008:1: rule__StringFunction__ValuesAssignment_0_2 : ( ruleScalarExpression ) ;
    public final void rule__StringFunction__ValuesAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7012:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7013:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7013:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7014:1: ruleScalarExpression
            {
             before(grammarAccess.getStringFunctionAccess().getValuesScalarExpressionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValuesAssignment_0_214030);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getStringFunctionAccess().getValuesScalarExpressionParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__ValuesAssignment_0_2


    // $ANTLR start rule__StringFunction__ValueAssignment_1_2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7023:1: rule__StringFunction__ValueAssignment_1_2 : ( ruleScalarExpression ) ;
    public final void rule__StringFunction__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7027:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7028:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7028:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7029:1: ruleScalarExpression
            {
             before(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValueAssignment_1_214061);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__ValueAssignment_1_2


    // $ANTLR start rule__StringFunction__MatchAssignment_1_4
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7038:1: rule__StringFunction__MatchAssignment_1_4 : ( ruleScalarExpression ) ;
    public final void rule__StringFunction__MatchAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7042:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7043:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7043:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7044:1: ruleScalarExpression
            {
             before(grammarAccess.getStringFunctionAccess().getMatchScalarExpressionParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__StringFunction__MatchAssignment_1_414092);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getStringFunctionAccess().getMatchScalarExpressionParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__MatchAssignment_1_4


    // $ANTLR start rule__StringFunction__ReplacementAssignment_1_6
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7053:1: rule__StringFunction__ReplacementAssignment_1_6 : ( ruleScalarExpression ) ;
    public final void rule__StringFunction__ReplacementAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7057:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7058:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7058:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7059:1: ruleScalarExpression
            {
             before(grammarAccess.getStringFunctionAccess().getReplacementScalarExpressionParserRuleCall_1_6_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__StringFunction__ReplacementAssignment_1_614123);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getStringFunctionAccess().getReplacementScalarExpressionParserRuleCall_1_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__ReplacementAssignment_1_6


    // $ANTLR start rule__StringFunction__ValueAssignment_2_2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7068:1: rule__StringFunction__ValueAssignment_2_2 : ( ruleScalarExpression ) ;
    public final void rule__StringFunction__ValueAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7072:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7073:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7073:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7074:1: ruleScalarExpression
            {
             before(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValueAssignment_2_214154);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringFunction__ValueAssignment_2_2


    // $ANTLR start rule__CollectionLiteral__ItemsAssignment_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7083:1: rule__CollectionLiteral__ItemsAssignment_1 : ( ruleScalarExpression ) ;
    public final void rule__CollectionLiteral__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7087:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7088:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7088:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7089:1: ruleScalarExpression
            {
             before(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__CollectionLiteral__ItemsAssignment_114185);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__ItemsAssignment_1


    // $ANTLR start rule__CollectionLiteral__ItemsAssignment_2_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7098:1: rule__CollectionLiteral__ItemsAssignment_2_1 : ( ruleScalarExpression ) ;
    public final void rule__CollectionLiteral__ItemsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7102:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7103:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7103:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7104:1: ruleScalarExpression
            {
             before(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__CollectionLiteral__ItemsAssignment_2_114216);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionLiteral__ItemsAssignment_2_1


    // $ANTLR start rule__CollectionFunction__ValueAssignment_2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7113:1: rule__CollectionFunction__ValueAssignment_2 : ( ruleScalarExpression ) ;
    public final void rule__CollectionFunction__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7117:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7118:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7118:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7119:1: ruleScalarExpression
            {
             before(grammarAccess.getCollectionFunctionAccess().getValueScalarExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__CollectionFunction__ValueAssignment_214247);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getCollectionFunctionAccess().getValueScalarExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__ValueAssignment_2


    // $ANTLR start rule__CollectionFunction__DelimiterAssignment_4
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7128:1: rule__CollectionFunction__DelimiterAssignment_4 : ( ruleScalarExpression ) ;
    public final void rule__CollectionFunction__DelimiterAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7132:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7133:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7133:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7134:1: ruleScalarExpression
            {
             before(grammarAccess.getCollectionFunctionAccess().getDelimiterScalarExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__CollectionFunction__DelimiterAssignment_414278);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getCollectionFunctionAccess().getDelimiterScalarExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionFunction__DelimiterAssignment_4


    // $ANTLR start rule__Application__NameAssignment_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7143:1: rule__Application__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7147:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7148:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7148:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7149:1: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Application__NameAssignment_114309); 
             after(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__NameAssignment_1


    // $ANTLR start rule__Application__BackgroundAssignment_3_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7158:1: rule__Application__BackgroundAssignment_3_1 : ( ruleScalarExpression ) ;
    public final void rule__Application__BackgroundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7162:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7163:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7163:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7164:1: ruleScalarExpression
            {
             before(grammarAccess.getApplicationAccess().getBackgroundScalarExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__Application__BackgroundAssignment_3_114340);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getApplicationAccess().getBackgroundScalarExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__BackgroundAssignment_3_1


    // $ANTLR start rule__Application__ButtonsAssignment_4
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7173:1: rule__Application__ButtonsAssignment_4 : ( ruleTabbarButton ) ;
    public final void rule__Application__ButtonsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7177:1: ( ( ruleTabbarButton ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7178:1: ( ruleTabbarButton )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7178:1: ( ruleTabbarButton )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7179:1: ruleTabbarButton
            {
             before(grammarAccess.getApplicationAccess().getButtonsTabbarButtonParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTabbarButton_in_rule__Application__ButtonsAssignment_414371);
            ruleTabbarButton();
            _fsp--;

             after(grammarAccess.getApplicationAccess().getButtonsTabbarButtonParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__ButtonsAssignment_4


    // $ANTLR start rule__TabbarButton__TitleAssignment_3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7188:1: rule__TabbarButton__TitleAssignment_3 : ( ruleScalarExpression ) ;
    public final void rule__TabbarButton__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7192:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7193:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7193:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7194:1: ruleScalarExpression
            {
             before(grammarAccess.getTabbarButtonAccess().getTitleScalarExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__TabbarButton__TitleAssignment_314402);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getTabbarButtonAccess().getTitleScalarExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__TitleAssignment_3


    // $ANTLR start rule__TabbarButton__IconAssignment_5
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7203:1: rule__TabbarButton__IconAssignment_5 : ( ruleScalarExpression ) ;
    public final void rule__TabbarButton__IconAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7207:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7208:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7208:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7209:1: ruleScalarExpression
            {
             before(grammarAccess.getTabbarButtonAccess().getIconScalarExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__TabbarButton__IconAssignment_514433);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getTabbarButtonAccess().getIconScalarExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__IconAssignment_5


    // $ANTLR start rule__TabbarButton__ViewAssignment_7
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7218:1: rule__TabbarButton__ViewAssignment_7 : ( ruleViewCall ) ;
    public final void rule__TabbarButton__ViewAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7222:1: ( ( ruleViewCall ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7223:1: ( ruleViewCall )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7223:1: ( ruleViewCall )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7224:1: ruleViewCall
            {
             before(grammarAccess.getTabbarButtonAccess().getViewViewCallParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleViewCall_in_rule__TabbarButton__ViewAssignment_714464);
            ruleViewCall();
            _fsp--;

             after(grammarAccess.getTabbarButtonAccess().getViewViewCallParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabbarButton__ViewAssignment_7


    // $ANTLR start rule__SimpleType__NameAssignment_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7233:1: rule__SimpleType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7237:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7238:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7238:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7239:1: RULE_ID
            {
             before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_114495); 
             after(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__NameAssignment_1


    // $ANTLR start rule__SimpleType__PlatformTypeAssignment_3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7248:1: rule__SimpleType__PlatformTypeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SimpleType__PlatformTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7252:1: ( ( RULE_STRING ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7253:1: ( RULE_STRING )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7253:1: ( RULE_STRING )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7254:1: RULE_STRING
            {
             before(grammarAccess.getSimpleTypeAccess().getPlatformTypeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleType__PlatformTypeAssignment_314526); 
             after(grammarAccess.getSimpleTypeAccess().getPlatformTypeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleType__PlatformTypeAssignment_3


    // $ANTLR start rule__Entity__NameAssignment_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7263:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7267:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7268:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7268:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7269:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_114557); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__NameAssignment_1


    // $ANTLR start rule__Entity__ExtendsAssignment_2_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7278:1: rule__Entity__ExtendsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__ExtendsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7282:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7283:1: ( ( RULE_ID ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7283:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7284:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7285:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7286:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__ExtendsAssignment_2_114592); 
             after(grammarAccess.getEntityAccess().getExtendsEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__ExtendsAssignment_2_1


    // $ANTLR start rule__Entity__PropertiesAssignment_4
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7297:1: rule__Entity__PropertiesAssignment_4 : ( ruleProperty ) ;
    public final void rule__Entity__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7301:1: ( ( ruleProperty ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7302:1: ( ruleProperty )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7302:1: ( ruleProperty )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7303:1: ruleProperty
            {
             before(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_414627);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__PropertiesAssignment_4


    // $ANTLR start rule__Property__DerivedAssignment_0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7312:1: rule__Property__DerivedAssignment_0 : ( ( 'derived' ) ) ;
    public final void rule__Property__DerivedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7316:1: ( ( ( 'derived' ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7317:1: ( ( 'derived' ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7317:1: ( ( 'derived' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7318:1: ( 'derived' )
            {
             before(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_0_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7319:1: ( 'derived' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7320:1: 'derived'
            {
             before(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_0_0()); 
            match(input,58,FOLLOW_58_in_rule__Property__DerivedAssignment_014663); 
             after(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_0_0()); 

            }

             after(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__DerivedAssignment_0


    // $ANTLR start rule__Property__DescriptionAssignment_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7335:1: rule__Property__DescriptionAssignment_1 : ( ruleTypeDescription ) ;
    public final void rule__Property__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7339:1: ( ( ruleTypeDescription ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7340:1: ( ruleTypeDescription )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7340:1: ( ruleTypeDescription )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7341:1: ruleTypeDescription
            {
             before(grammarAccess.getPropertyAccess().getDescriptionTypeDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeDescription_in_rule__Property__DescriptionAssignment_114702);
            ruleTypeDescription();
            _fsp--;

             after(grammarAccess.getPropertyAccess().getDescriptionTypeDescriptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__DescriptionAssignment_1


    // $ANTLR start rule__Property__NameAssignment_2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7350:1: rule__Property__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7354:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7355:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7355:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7356:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_214733); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__NameAssignment_2


    // $ANTLR start rule__ContentProvider__NameAssignment_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7365:1: rule__ContentProvider__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ContentProvider__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7369:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7370:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7370:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7371:1: RULE_ID
            {
             before(grammarAccess.getContentProviderAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContentProvider__NameAssignment_114764); 
             after(grammarAccess.getContentProviderAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__NameAssignment_1


    // $ANTLR start rule__ContentProvider__ParameterAssignment_2_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7380:1: rule__ContentProvider__ParameterAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__ContentProvider__ParameterAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7384:1: ( ( ruleParameter ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7385:1: ( ruleParameter )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7385:1: ( ruleParameter )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7386:1: ruleParameter
            {
             before(grammarAccess.getContentProviderAccess().getParameterParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__ContentProvider__ParameterAssignment_2_114795);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getContentProviderAccess().getParameterParameterParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__ParameterAssignment_2_1


    // $ANTLR start rule__ContentProvider__TypeAssignment_4
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7395:1: rule__ContentProvider__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ContentProvider__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7399:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7400:1: ( ( RULE_ID ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7400:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7401:1: ( RULE_ID )
            {
             before(grammarAccess.getContentProviderAccess().getTypeTypeCrossReference_4_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7402:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7403:1: RULE_ID
            {
             before(grammarAccess.getContentProviderAccess().getTypeTypeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContentProvider__TypeAssignment_414830); 
             after(grammarAccess.getContentProviderAccess().getTypeTypeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getContentProviderAccess().getTypeTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__TypeAssignment_4


    // $ANTLR start rule__ContentProvider__ManyAssignment_5
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7414:1: rule__ContentProvider__ManyAssignment_5 : ( ( '[]' ) ) ;
    public final void rule__ContentProvider__ManyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7418:1: ( ( ( '[]' ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7419:1: ( ( '[]' ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7419:1: ( ( '[]' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7420:1: ( '[]' )
            {
             before(grammarAccess.getContentProviderAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7421:1: ( '[]' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7422:1: '[]'
            {
             before(grammarAccess.getContentProviderAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 
            match(input,57,FOLLOW_57_in_rule__ContentProvider__ManyAssignment_514870); 
             after(grammarAccess.getContentProviderAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 

            }

             after(grammarAccess.getContentProviderAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__ManyAssignment_5


    // $ANTLR start rule__ContentProvider__UrlAssignment_9
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7437:1: rule__ContentProvider__UrlAssignment_9 : ( ruleScalarExpression ) ;
    public final void rule__ContentProvider__UrlAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7441:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7442:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7442:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7443:1: ruleScalarExpression
            {
             before(grammarAccess.getContentProviderAccess().getUrlScalarExpressionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ContentProvider__UrlAssignment_914909);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getContentProviderAccess().getUrlScalarExpressionParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__UrlAssignment_9


    // $ANTLR start rule__ContentProvider__SelectionAssignment_11
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7452:1: rule__ContentProvider__SelectionAssignment_11 : ( ruleScalarExpression ) ;
    public final void rule__ContentProvider__SelectionAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7456:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7457:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7457:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7458:1: ruleScalarExpression
            {
             before(grammarAccess.getContentProviderAccess().getSelectionScalarExpressionParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ContentProvider__SelectionAssignment_1114940);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getContentProviderAccess().getSelectionScalarExpressionParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ContentProvider__SelectionAssignment_11


    // $ANTLR start rule__ProviderConstruction__ProviderAssignment_0_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7467:1: rule__ProviderConstruction__ProviderAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__ProviderConstruction__ProviderAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7471:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7472:1: ( ( RULE_ID ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7472:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7473:1: ( RULE_ID )
            {
             before(grammarAccess.getProviderConstructionAccess().getProviderContentProviderCrossReference_0_1_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7474:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7475:1: RULE_ID
            {
             before(grammarAccess.getProviderConstructionAccess().getProviderContentProviderIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProviderConstruction__ProviderAssignment_0_114975); 
             after(grammarAccess.getProviderConstructionAccess().getProviderContentProviderIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getProviderConstructionAccess().getProviderContentProviderCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__ProviderAssignment_0_1


    // $ANTLR start rule__ProviderConstruction__ArgumentAssignment_0_3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7486:1: rule__ProviderConstruction__ArgumentAssignment_0_3 : ( ruleExpression ) ;
    public final void rule__ProviderConstruction__ArgumentAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7490:1: ( ( ruleExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7491:1: ( ruleExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7491:1: ( ruleExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7492:1: ruleExpression
            {
             before(grammarAccess.getProviderConstructionAccess().getArgumentExpressionParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ProviderConstruction__ArgumentAssignment_0_315010);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getProviderConstructionAccess().getArgumentExpressionParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__ArgumentAssignment_0_3


    // $ANTLR start rule__ProviderConstruction__ExpressionAssignment_1_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7501:1: rule__ProviderConstruction__ExpressionAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__ProviderConstruction__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7505:1: ( ( ruleExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7506:1: ( ruleExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7506:1: ( ruleExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7507:1: ruleExpression
            {
             before(grammarAccess.getProviderConstructionAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ProviderConstruction__ExpressionAssignment_1_115041);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getProviderConstructionAccess().getExpressionExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProviderConstruction__ExpressionAssignment_1_1


    // $ANTLR start rule__TableView__NameAssignment_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7516:1: rule__TableView__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TableView__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7520:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7521:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7521:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7522:1: RULE_ID
            {
             before(grammarAccess.getTableViewAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TableView__NameAssignment_115072); 
             after(grammarAccess.getTableViewAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__NameAssignment_1


    // $ANTLR start rule__TableView__ContentAssignment_2_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7531:1: rule__TableView__ContentAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__TableView__ContentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7535:1: ( ( ruleParameter ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7536:1: ( ruleParameter )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7536:1: ( ruleParameter )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7537:1: ruleParameter
            {
             before(grammarAccess.getTableViewAccess().getContentParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__TableView__ContentAssignment_2_115103);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getTableViewAccess().getContentParameterParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__ContentAssignment_2_1


    // $ANTLR start rule__TableView__TitleAssignment_5
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7546:1: rule__TableView__TitleAssignment_5 : ( ruleScalarExpression ) ;
    public final void rule__TableView__TitleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7550:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7551:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7551:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7552:1: ruleScalarExpression
            {
             before(grammarAccess.getTableViewAccess().getTitleScalarExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__TableView__TitleAssignment_515134);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getTableViewAccess().getTitleScalarExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__TitleAssignment_5


    // $ANTLR start rule__TableView__SectionsAssignment_6
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7561:1: rule__TableView__SectionsAssignment_6 : ( ruleViewSection ) ;
    public final void rule__TableView__SectionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7565:1: ( ( ruleViewSection ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7566:1: ( ruleViewSection )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7566:1: ( ruleViewSection )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7567:1: ruleViewSection
            {
             before(grammarAccess.getTableViewAccess().getSectionsViewSectionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleViewSection_in_rule__TableView__SectionsAssignment_615165);
            ruleViewSection();
            _fsp--;

             after(grammarAccess.getTableViewAccess().getSectionsViewSectionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TableView__SectionsAssignment_6


    // $ANTLR start rule__DetailsView__NameAssignment_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7576:1: rule__DetailsView__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DetailsView__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7580:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7581:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7581:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7582:1: RULE_ID
            {
             before(grammarAccess.getDetailsViewAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DetailsView__NameAssignment_115196); 
             after(grammarAccess.getDetailsViewAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__NameAssignment_1


    // $ANTLR start rule__DetailsView__ContentAssignment_2_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7591:1: rule__DetailsView__ContentAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__DetailsView__ContentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7595:1: ( ( ruleParameter ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7596:1: ( ruleParameter )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7596:1: ( ruleParameter )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7597:1: ruleParameter
            {
             before(grammarAccess.getDetailsViewAccess().getContentParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__DetailsView__ContentAssignment_2_115227);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getDetailsViewAccess().getContentParameterParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__ContentAssignment_2_1


    // $ANTLR start rule__DetailsView__TitleAssignment_5
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7606:1: rule__DetailsView__TitleAssignment_5 : ( ruleScalarExpression ) ;
    public final void rule__DetailsView__TitleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7610:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7611:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7611:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7612:1: ruleScalarExpression
            {
             before(grammarAccess.getDetailsViewAccess().getTitleScalarExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__DetailsView__TitleAssignment_515258);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getDetailsViewAccess().getTitleScalarExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__TitleAssignment_5


    // $ANTLR start rule__DetailsView__HeaderAssignment_6
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7621:1: rule__DetailsView__HeaderAssignment_6 : ( ruleViewHeader ) ;
    public final void rule__DetailsView__HeaderAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7625:1: ( ( ruleViewHeader ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7626:1: ( ruleViewHeader )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7626:1: ( ruleViewHeader )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7627:1: ruleViewHeader
            {
             before(grammarAccess.getDetailsViewAccess().getHeaderViewHeaderParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleViewHeader_in_rule__DetailsView__HeaderAssignment_615289);
            ruleViewHeader();
            _fsp--;

             after(grammarAccess.getDetailsViewAccess().getHeaderViewHeaderParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__HeaderAssignment_6


    // $ANTLR start rule__DetailsView__SectionsAssignment_7
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7636:1: rule__DetailsView__SectionsAssignment_7 : ( ruleViewSection ) ;
    public final void rule__DetailsView__SectionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7640:1: ( ( ruleViewSection ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7641:1: ( ruleViewSection )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7641:1: ( ruleViewSection )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7642:1: ruleViewSection
            {
             before(grammarAccess.getDetailsViewAccess().getSectionsViewSectionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleViewSection_in_rule__DetailsView__SectionsAssignment_715320);
            ruleViewSection();
            _fsp--;

             after(grammarAccess.getDetailsViewAccess().getSectionsViewSectionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DetailsView__SectionsAssignment_7


    // $ANTLR start rule__CustomView__NameAssignment_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7651:1: rule__CustomView__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CustomView__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7655:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7656:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7656:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7657:1: RULE_ID
            {
             before(grammarAccess.getCustomViewAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomView__NameAssignment_115351); 
             after(grammarAccess.getCustomViewAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__NameAssignment_1


    // $ANTLR start rule__CustomView__ContentAssignment_2_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7666:1: rule__CustomView__ContentAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__CustomView__ContentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7670:1: ( ( ruleParameter ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7671:1: ( ruleParameter )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7671:1: ( ruleParameter )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7672:1: ruleParameter
            {
             before(grammarAccess.getCustomViewAccess().getContentParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__CustomView__ContentAssignment_2_115382);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getCustomViewAccess().getContentParameterParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__ContentAssignment_2_1


    // $ANTLR start rule__CustomView__ObjclassAssignment_4
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7681:1: rule__CustomView__ObjclassAssignment_4 : ( RULE_STRING ) ;
    public final void rule__CustomView__ObjclassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7685:1: ( ( RULE_STRING ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7686:1: ( RULE_STRING )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7686:1: ( RULE_STRING )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7687:1: RULE_STRING
            {
             before(grammarAccess.getCustomViewAccess().getObjclassSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CustomView__ObjclassAssignment_415413); 
             after(grammarAccess.getCustomViewAccess().getObjclassSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomView__ObjclassAssignment_4


    // $ANTLR start rule__ViewHeader__TitleAssignment_3_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7696:1: rule__ViewHeader__TitleAssignment_3_1 : ( ruleScalarExpression ) ;
    public final void rule__ViewHeader__TitleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7700:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7701:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7701:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7702:1: ruleScalarExpression
            {
             before(grammarAccess.getViewHeaderAccess().getTitleScalarExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ViewHeader__TitleAssignment_3_115444);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getViewHeaderAccess().getTitleScalarExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__TitleAssignment_3_1


    // $ANTLR start rule__ViewHeader__SubtitleAssignment_4_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7711:1: rule__ViewHeader__SubtitleAssignment_4_1 : ( ruleScalarExpression ) ;
    public final void rule__ViewHeader__SubtitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7715:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7716:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7716:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7717:1: ruleScalarExpression
            {
             before(grammarAccess.getViewHeaderAccess().getSubtitleScalarExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ViewHeader__SubtitleAssignment_4_115475);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getViewHeaderAccess().getSubtitleScalarExpressionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__SubtitleAssignment_4_1


    // $ANTLR start rule__ViewHeader__DetailsAssignment_5_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7726:1: rule__ViewHeader__DetailsAssignment_5_1 : ( ruleScalarExpression ) ;
    public final void rule__ViewHeader__DetailsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7730:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7731:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7731:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7732:1: ruleScalarExpression
            {
             before(grammarAccess.getViewHeaderAccess().getDetailsScalarExpressionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ViewHeader__DetailsAssignment_5_115506);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getViewHeaderAccess().getDetailsScalarExpressionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__DetailsAssignment_5_1


    // $ANTLR start rule__ViewHeader__ImageAssignment_6_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7741:1: rule__ViewHeader__ImageAssignment_6_1 : ( ruleScalarExpression ) ;
    public final void rule__ViewHeader__ImageAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7745:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7746:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7746:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7747:1: ruleScalarExpression
            {
             before(grammarAccess.getViewHeaderAccess().getImageScalarExpressionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ViewHeader__ImageAssignment_6_115537);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getViewHeaderAccess().getImageScalarExpressionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewHeader__ImageAssignment_6_1


    // $ANTLR start rule__ViewSection__TitleAssignment_2_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7756:1: rule__ViewSection__TitleAssignment_2_1 : ( ruleScalarExpression ) ;
    public final void rule__ViewSection__TitleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7760:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7761:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7761:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7762:1: ruleScalarExpression
            {
             before(grammarAccess.getViewSectionAccess().getTitleScalarExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ViewSection__TitleAssignment_2_115568);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getViewSectionAccess().getTitleScalarExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__TitleAssignment_2_1


    // $ANTLR start rule__ViewSection__CellsAssignment_3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7771:1: rule__ViewSection__CellsAssignment_3 : ( ruleSectionCell ) ;
    public final void rule__ViewSection__CellsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7775:1: ( ( ruleSectionCell ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7776:1: ( ruleSectionCell )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7776:1: ( ruleSectionCell )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7777:1: ruleSectionCell
            {
             before(grammarAccess.getViewSectionAccess().getCellsSectionCellParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSectionCell_in_rule__ViewSection__CellsAssignment_315599);
            ruleSectionCell();
            _fsp--;

             after(grammarAccess.getViewSectionAccess().getCellsSectionCellParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewSection__CellsAssignment_3


    // $ANTLR start rule__SectionCell__TypeAssignment_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7786:1: rule__SectionCell__TypeAssignment_1 : ( ruleCellType ) ;
    public final void rule__SectionCell__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7790:1: ( ( ruleCellType ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7791:1: ( ruleCellType )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7791:1: ( ruleCellType )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7792:1: ruleCellType
            {
             before(grammarAccess.getSectionCellAccess().getTypeCellTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCellType_in_rule__SectionCell__TypeAssignment_115630);
            ruleCellType();
            _fsp--;

             after(grammarAccess.getSectionCellAccess().getTypeCellTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__TypeAssignment_1


    // $ANTLR start rule__SectionCell__IteratorAssignment_2_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7801:1: rule__SectionCell__IteratorAssignment_2_1 : ( ruleCollectionIterator ) ;
    public final void rule__SectionCell__IteratorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7805:1: ( ( ruleCollectionIterator ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7806:1: ( ruleCollectionIterator )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7806:1: ( ruleCollectionIterator )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7807:1: ruleCollectionIterator
            {
             before(grammarAccess.getSectionCellAccess().getIteratorCollectionIteratorParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleCollectionIterator_in_rule__SectionCell__IteratorAssignment_2_115661);
            ruleCollectionIterator();
            _fsp--;

             after(grammarAccess.getSectionCellAccess().getIteratorCollectionIteratorParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__IteratorAssignment_2_1


    // $ANTLR start rule__SectionCell__TextAssignment_4_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7816:1: rule__SectionCell__TextAssignment_4_1 : ( ruleScalarExpression ) ;
    public final void rule__SectionCell__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7820:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7821:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7821:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7822:1: ruleScalarExpression
            {
             before(grammarAccess.getSectionCellAccess().getTextScalarExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__SectionCell__TextAssignment_4_115692);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getSectionCellAccess().getTextScalarExpressionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__TextAssignment_4_1


    // $ANTLR start rule__SectionCell__DetailsAssignment_5_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7831:1: rule__SectionCell__DetailsAssignment_5_1 : ( ruleScalarExpression ) ;
    public final void rule__SectionCell__DetailsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7835:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7836:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7836:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7837:1: ruleScalarExpression
            {
             before(grammarAccess.getSectionCellAccess().getDetailsScalarExpressionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__SectionCell__DetailsAssignment_5_115723);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getSectionCellAccess().getDetailsScalarExpressionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__DetailsAssignment_5_1


    // $ANTLR start rule__SectionCell__ImageAssignment_6_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7846:1: rule__SectionCell__ImageAssignment_6_1 : ( ruleScalarExpression ) ;
    public final void rule__SectionCell__ImageAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7850:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7851:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7851:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7852:1: ruleScalarExpression
            {
             before(grammarAccess.getSectionCellAccess().getImageScalarExpressionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__SectionCell__ImageAssignment_6_115754);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getSectionCellAccess().getImageScalarExpressionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__ImageAssignment_6_1


    // $ANTLR start rule__SectionCell__ActionAssignment_7_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7861:1: rule__SectionCell__ActionAssignment_7_1 : ( ruleViewAction ) ;
    public final void rule__SectionCell__ActionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7865:1: ( ( ruleViewAction ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7866:1: ( ruleViewAction )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7866:1: ( ruleViewAction )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7867:1: ruleViewAction
            {
             before(grammarAccess.getSectionCellAccess().getActionViewActionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleViewAction_in_rule__SectionCell__ActionAssignment_7_115785);
            ruleViewAction();
            _fsp--;

             after(grammarAccess.getSectionCellAccess().getActionViewActionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SectionCell__ActionAssignment_7_1


    // $ANTLR start rule__CollectionIterator__CollectionAssignment_0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7876:1: rule__CollectionIterator__CollectionAssignment_0 : ( ruleCollectionExpression ) ;
    public final void rule__CollectionIterator__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7880:1: ( ( ruleCollectionExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7881:1: ( ruleCollectionExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7881:1: ( ruleCollectionExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7882:1: ruleCollectionExpression
            {
             before(grammarAccess.getCollectionIteratorAccess().getCollectionCollectionExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCollectionExpression_in_rule__CollectionIterator__CollectionAssignment_015816);
            ruleCollectionExpression();
            _fsp--;

             after(grammarAccess.getCollectionIteratorAccess().getCollectionCollectionExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionIterator__CollectionAssignment_0


    // $ANTLR start rule__CollectionIterator__NameAssignment_2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7891:1: rule__CollectionIterator__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CollectionIterator__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7895:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7896:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7896:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7897:1: RULE_ID
            {
             before(grammarAccess.getCollectionIteratorAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CollectionIterator__NameAssignment_215847); 
             after(grammarAccess.getCollectionIteratorAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CollectionIterator__NameAssignment_2


    // $ANTLR start rule__ExternalOpen__UrlAssignment
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7906:1: rule__ExternalOpen__UrlAssignment : ( ruleScalarExpression ) ;
    public final void rule__ExternalOpen__UrlAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7910:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7911:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7911:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7912:1: ruleScalarExpression
            {
             before(grammarAccess.getExternalOpenAccess().getUrlScalarExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ExternalOpen__UrlAssignment15878);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getExternalOpenAccess().getUrlScalarExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExternalOpen__UrlAssignment


    // $ANTLR start rule__ViewCall__ViewAssignment_0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7921:1: rule__ViewCall__ViewAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ViewCall__ViewAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7925:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7926:1: ( ( RULE_ID ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7926:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7927:1: ( RULE_ID )
            {
             before(grammarAccess.getViewCallAccess().getViewViewCrossReference_0_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7928:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7929:1: RULE_ID
            {
             before(grammarAccess.getViewCallAccess().getViewViewIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ViewCall__ViewAssignment_015913); 
             after(grammarAccess.getViewCallAccess().getViewViewIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getViewCallAccess().getViewViewCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewCall__ViewAssignment_0


    // $ANTLR start rule__ViewCall__ProviderAssignment_2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7940:1: rule__ViewCall__ProviderAssignment_2 : ( ruleProviderConstruction ) ;
    public final void rule__ViewCall__ProviderAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7944:1: ( ( ruleProviderConstruction ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7945:1: ( ruleProviderConstruction )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7945:1: ( ruleProviderConstruction )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7946:1: ruleProviderConstruction
            {
             before(grammarAccess.getViewCallAccess().getProviderProviderConstructionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleProviderConstruction_in_rule__ViewCall__ProviderAssignment_215948);
            ruleProviderConstruction();
            _fsp--;

             after(grammarAccess.getViewCallAccess().getProviderProviderConstructionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ViewCall__ProviderAssignment_2


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_entryRuleModelElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelElement__Alternatives_in_ruleModelElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_entryRuleTypeDescription183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDescription190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__Group__0_in_ruleTypeDescription216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_entryRuleObjectReference303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectReference310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectReference__Group__0_in_ruleObjectReference336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_entryRuleNestedObjectReference363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedObjectReference370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__0_in_ruleNestedObjectReference396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_entryRuleScalarExpression483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarExpression490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScalarExpression__Alternatives_in_ruleScalarExpression516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionExpression550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionExpression__Alternatives_in_ruleCollectionExpression576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_entryRuleStringFunction663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunction670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Alternatives_in_ruleStringFunction696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteral730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__0_in_ruleCollectionLiteral756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_entryRuleCollectionFunction783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionFunction790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__0_in_ruleCollectionFunction816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__0_in_ruleApplication876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabbarButton_in_entryRuleTabbarButton903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabbarButton910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__0_in_ruleTabbarButton936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_entryRuleContentProvider1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentProvider1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__0_in_ruleContentProvider1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_entryRuleProviderConstruction1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProviderConstruction1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Alternatives_in_ruleProviderConstruction1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Alternatives_in_ruleView1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionedView_in_entryRuleSectionedView1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionedView1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionedView__Alternatives_in_ruleSectionedView1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_entryRuleTableView1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableView1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__0_in_ruleTableView1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetailsView_in_entryRuleDetailsView1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDetailsView1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__0_in_ruleDetailsView1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_entryRuleCustomView1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomView1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__0_in_ruleCustomView1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewHeader_in_entryRuleViewHeader1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewHeader1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__0_in_ruleViewHeader1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewSection_in_entryRuleViewSection1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewSection1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__0_in_ruleViewSection1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionCell_in_entryRuleSectionCell1743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionCell1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__0_in_ruleSectionCell1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator1803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionIterator1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__0_in_ruleCollectionIterator1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewAction_in_entryRuleViewAction1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewAction1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewAction__Alternatives_in_ruleViewAction1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen1923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalOpen1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalOpen__UrlAssignment_in_ruleExternalOpen1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_entryRuleViewCall1983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewCall1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__0_in_ruleViewCall2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellType__Alternatives_in_ruleCellType2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ModelElement__Alternatives2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_rule__ModelElement__Alternatives2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_rule__ModelElement__Alternatives2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Expression__Alternatives2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_rule__Expression__Alternatives2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_rule__Expression__Alternatives2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_rule__Expression__Alternatives2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_rule__Expression__Alternatives2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__ScalarExpression__Alternatives2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_rule__ScalarExpression__Alternatives2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_rule__ScalarExpression__Alternatives2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_rule__CollectionExpression__Alternatives2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_rule__CollectionExpression__Alternatives2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_rule__CollectionExpression__Alternatives2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__0_in_rule__StringFunction__Alternatives2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__0_in_rule__StringFunction__Alternatives2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__0_in_rule__StringFunction__Alternatives2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__Type__Alternatives2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__0_in_rule__ProviderConstruction__Alternatives2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_1__0_in_rule__ProviderConstruction__Alternatives2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionedView_in_rule__View__Alternatives2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_rule__View__Alternatives2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_rule__SectionedView__Alternatives2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetailsView_in_rule__SectionedView__Alternatives2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_rule__ViewAction__Alternatives2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_rule__ViewAction__Alternatives2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CellType__Alternatives2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CellType__Alternatives2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CellType__Alternatives2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CellType__Alternatives2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CellType__Alternatives2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02821 = new BitSet(new long[]{0x0000382A00000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ApplicationAssignment_0_in_rule__Model__Group__0__Impl2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_1_in_rule__Model__Group__1__Impl2908 = new BitSet(new long[]{0x0000382A00000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__Group__0__Impl_in_rule__TypeDescription__Group__02943 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__Group__1_in_rule__TypeDescription__Group__02946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__TypeAssignment_0_in_rule__TypeDescription__Group__0__Impl2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__Group__1__Impl_in_rule__TypeDescription__Group__13003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__ManyAssignment_1_in_rule__TypeDescription__Group__1__Impl3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__DescriptionAssignment_0_in_rule__Parameter__Group__0__Impl3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectReference__Group__0__Impl_in_rule__ObjectReference__Group__03186 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__ObjectReference__Group__1_in_rule__ObjectReference__Group__03189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectReference__ObjectAssignment_0_in_rule__ObjectReference__Group__0__Impl3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectReference__Group__1__Impl_in_rule__ObjectReference__Group__13246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectReference__TailAssignment_1_in_rule__ObjectReference__Group__1__Impl3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__0__Impl_in_rule__NestedObjectReference__Group__03308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__1_in_rule__NestedObjectReference__Group__03311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NestedObjectReference__Group__0__Impl3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__1__Impl_in_rule__NestedObjectReference__Group__13370 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__2_in_rule__NestedObjectReference__Group__13373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__ObjectAssignment_1_in_rule__NestedObjectReference__Group__1__Impl3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__2__Impl_in_rule__NestedObjectReference__Group__23430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__TailAssignment_2_in_rule__NestedObjectReference__Group__2__Impl3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__0__Impl_in_rule__StringFunction__Group_0__03494 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__1_in_rule__StringFunction__Group_0__03497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__1__Impl_in_rule__StringFunction__Group_0__13555 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__2_in_rule__StringFunction__Group_0__13558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__StringFunction__Group_0__1__Impl3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__2__Impl_in_rule__StringFunction__Group_0__23617 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__3_in_rule__StringFunction__Group_0__23620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__ValuesAssignment_0_2_in_rule__StringFunction__Group_0__2__Impl3649 = new BitSet(new long[]{0x00000000002A0032L});
    public static final BitSet FOLLOW_rule__StringFunction__ValuesAssignment_0_2_in_rule__StringFunction__Group_0__2__Impl3661 = new BitSet(new long[]{0x00000000002A0032L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__3__Impl_in_rule__StringFunction__Group_0__33694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StringFunction__Group_0__3__Impl3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__0__Impl_in_rule__StringFunction__Group_1__03761 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__1_in_rule__StringFunction__Group_1__03764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__1__Impl_in_rule__StringFunction__Group_1__13822 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__2_in_rule__StringFunction__Group_1__13825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StringFunction__Group_1__1__Impl3853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__2__Impl_in_rule__StringFunction__Group_1__23884 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__3_in_rule__StringFunction__Group_1__23887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__ValueAssignment_1_2_in_rule__StringFunction__Group_1__2__Impl3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__3__Impl_in_rule__StringFunction__Group_1__33944 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__4_in_rule__StringFunction__Group_1__33947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__StringFunction__Group_1__3__Impl3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__4__Impl_in_rule__StringFunction__Group_1__44006 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__5_in_rule__StringFunction__Group_1__44009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__MatchAssignment_1_4_in_rule__StringFunction__Group_1__4__Impl4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__5__Impl_in_rule__StringFunction__Group_1__54066 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__6_in_rule__StringFunction__Group_1__54069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__StringFunction__Group_1__5__Impl4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__6__Impl_in_rule__StringFunction__Group_1__64128 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__7_in_rule__StringFunction__Group_1__64131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__ReplacementAssignment_1_6_in_rule__StringFunction__Group_1__6__Impl4158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__7__Impl_in_rule__StringFunction__Group_1__74188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StringFunction__Group_1__7__Impl4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__0__Impl_in_rule__StringFunction__Group_2__04263 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__1_in_rule__StringFunction__Group_2__04266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__1__Impl_in_rule__StringFunction__Group_2__14324 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__2_in_rule__StringFunction__Group_2__14327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StringFunction__Group_2__1__Impl4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__2__Impl_in_rule__StringFunction__Group_2__24386 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__3_in_rule__StringFunction__Group_2__24389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__ValueAssignment_2_2_in_rule__StringFunction__Group_2__2__Impl4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__3__Impl_in_rule__StringFunction__Group_2__34446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StringFunction__Group_2__3__Impl4474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__0__Impl_in_rule__CollectionLiteral__Group__04513 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__1_in_rule__CollectionLiteral__Group__04516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CollectionLiteral__Group__0__Impl4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__1__Impl_in_rule__CollectionLiteral__Group__14575 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__2_in_rule__CollectionLiteral__Group__14578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__ItemsAssignment_1_in_rule__CollectionLiteral__Group__1__Impl4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__2__Impl_in_rule__CollectionLiteral__Group__24635 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__3_in_rule__CollectionLiteral__Group__24638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group_2__0_in_rule__CollectionLiteral__Group__2__Impl4665 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__3__Impl_in_rule__CollectionLiteral__Group__34696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CollectionLiteral__Group__3__Impl4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group_2__0__Impl_in_rule__CollectionLiteral__Group_2__04763 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group_2__1_in_rule__CollectionLiteral__Group_2__04766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CollectionLiteral__Group_2__0__Impl4794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group_2__1__Impl_in_rule__CollectionLiteral__Group_2__14825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__ItemsAssignment_2_1_in_rule__CollectionLiteral__Group_2__1__Impl4852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__0__Impl_in_rule__CollectionFunction__Group__04886 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__1_in_rule__CollectionFunction__Group__04889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__1__Impl_in_rule__CollectionFunction__Group__14947 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__2_in_rule__CollectionFunction__Group__14950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CollectionFunction__Group__1__Impl4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__2__Impl_in_rule__CollectionFunction__Group__25009 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__3_in_rule__CollectionFunction__Group__25012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__ValueAssignment_2_in_rule__CollectionFunction__Group__2__Impl5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__3__Impl_in_rule__CollectionFunction__Group__35069 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__4_in_rule__CollectionFunction__Group__35072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CollectionFunction__Group__3__Impl5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__4__Impl_in_rule__CollectionFunction__Group__45131 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__5_in_rule__CollectionFunction__Group__45134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__DelimiterAssignment_4_in_rule__CollectionFunction__Group__4__Impl5161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__5__Impl_in_rule__CollectionFunction__Group__55191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CollectionFunction__Group__5__Impl5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__05262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Application__Group__1_in_rule__Application__Group__05265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Application__Group__0__Impl5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__15324 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Application__Group__2_in_rule__Application__Group__15327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__NameAssignment_1_in_rule__Application__Group__1__Impl5354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__25384 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_rule__Application__Group__3_in_rule__Application__Group__25387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Application__Group__2__Impl5415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__35446 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_rule__Application__Group__4_in_rule__Application__Group__35449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_3__0_in_rule__Application__Group__3__Impl5476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__45507 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Application__Group__5_in_rule__Application__Group__45510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__ButtonsAssignment_4_in_rule__Application__Group__4__Impl5537 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__55568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Application__Group__5__Impl5596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_3__0__Impl_in_rule__Application__Group_3__05639 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__Application__Group_3__1_in_rule__Application__Group_3__05642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Application__Group_3__0__Impl5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_3__1__Impl_in_rule__Application__Group_3__15701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__BackgroundAssignment_3_1_in_rule__Application__Group_3__1__Impl5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__0__Impl_in_rule__TabbarButton__Group__05762 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__1_in_rule__TabbarButton__Group__05765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TabbarButton__Group__0__Impl5793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__1__Impl_in_rule__TabbarButton__Group__15824 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__2_in_rule__TabbarButton__Group__15827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TabbarButton__Group__1__Impl5855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__2__Impl_in_rule__TabbarButton__Group__25886 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__3_in_rule__TabbarButton__Group__25889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TabbarButton__Group__2__Impl5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__3__Impl_in_rule__TabbarButton__Group__35948 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__4_in_rule__TabbarButton__Group__35951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__TitleAssignment_3_in_rule__TabbarButton__Group__3__Impl5978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__4__Impl_in_rule__TabbarButton__Group__46008 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__5_in_rule__TabbarButton__Group__46011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TabbarButton__Group__4__Impl6039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__5__Impl_in_rule__TabbarButton__Group__56070 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__6_in_rule__TabbarButton__Group__56073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__IconAssignment_5_in_rule__TabbarButton__Group__5__Impl6100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__6__Impl_in_rule__TabbarButton__Group__66130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__7_in_rule__TabbarButton__Group__66133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TabbarButton__Group__6__Impl6161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__7__Impl_in_rule__TabbarButton__Group__76192 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__8_in_rule__TabbarButton__Group__76195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__ViewAssignment_7_in_rule__TabbarButton__Group__7__Impl6222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__8__Impl_in_rule__TabbarButton__Group__86252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TabbarButton__Group__8__Impl6280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0__Impl_in_rule__SimpleType__Group__06329 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__06332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SimpleType__Group__0__Impl6360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1__Impl_in_rule__SimpleType__Group__16391 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__16394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1__Impl6421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__2__Impl_in_rule__SimpleType__Group__26451 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__3_in_rule__SimpleType__Group__26454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SimpleType__Group__2__Impl6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__3__Impl_in_rule__SimpleType__Group__36513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__PlatformTypeAssignment_3_in_rule__SimpleType__Group__3__Impl6540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__06578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__06581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Entity__Group__0__Impl6609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__16640 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__16643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl6670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__26700 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__26703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl6730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__36761 = new BitSet(new long[]{0x0400000008000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__36764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Entity__Group__3__Impl6792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__46823 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__46826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__PropertiesAssignment_4_in_rule__Entity__Group__4__Impl6853 = new BitSet(new long[]{0x0400000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__56884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Entity__Group__5__Impl6912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__06955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__06958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Entity__Group_2__0__Impl6986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__17017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ExtendsAssignment_2_1_in_rule__Entity__Group_2__1__Impl7044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__07078 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__07081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DerivedAssignment_0_in_rule__Property__Group__0__Impl7108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__17139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__17142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DescriptionAssignment_1_in_rule__Property__Group__1__Impl7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__27199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_2_in_rule__Property__Group__2__Impl7226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__0__Impl_in_rule__ContentProvider__Group__07262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__1_in_rule__ContentProvider__Group__07265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ContentProvider__Group__0__Impl7293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__1__Impl_in_rule__ContentProvider__Group__17324 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__2_in_rule__ContentProvider__Group__17327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__NameAssignment_1_in_rule__ContentProvider__Group__1__Impl7354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__2__Impl_in_rule__ContentProvider__Group__27384 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__3_in_rule__ContentProvider__Group__27387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__0_in_rule__ContentProvider__Group__2__Impl7414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__3__Impl_in_rule__ContentProvider__Group__37445 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__4_in_rule__ContentProvider__Group__37448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ContentProvider__Group__3__Impl7476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__4__Impl_in_rule__ContentProvider__Group__47507 = new BitSet(new long[]{0x0200008000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__5_in_rule__ContentProvider__Group__47510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__TypeAssignment_4_in_rule__ContentProvider__Group__4__Impl7537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__5__Impl_in_rule__ContentProvider__Group__57567 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__6_in_rule__ContentProvider__Group__57570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__ManyAssignment_5_in_rule__ContentProvider__Group__5__Impl7597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__6__Impl_in_rule__ContentProvider__Group__67628 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__7_in_rule__ContentProvider__Group__67631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ContentProvider__Group__6__Impl7659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__7__Impl_in_rule__ContentProvider__Group__77690 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__8_in_rule__ContentProvider__Group__77693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ContentProvider__Group__7__Impl7721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__8__Impl_in_rule__ContentProvider__Group__87752 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__9_in_rule__ContentProvider__Group__87755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ContentProvider__Group__8__Impl7783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__9__Impl_in_rule__ContentProvider__Group__97814 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__10_in_rule__ContentProvider__Group__97817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__UrlAssignment_9_in_rule__ContentProvider__Group__9__Impl7844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__10__Impl_in_rule__ContentProvider__Group__107874 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__11_in_rule__ContentProvider__Group__107877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ContentProvider__Group__10__Impl7905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__11__Impl_in_rule__ContentProvider__Group__117936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__SelectionAssignment_11_in_rule__ContentProvider__Group__11__Impl7963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__0__Impl_in_rule__ContentProvider__Group_2__08017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__1_in_rule__ContentProvider__Group_2__08020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ContentProvider__Group_2__0__Impl8048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__1__Impl_in_rule__ContentProvider__Group_2__18079 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__2_in_rule__ContentProvider__Group_2__18082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__ParameterAssignment_2_1_in_rule__ContentProvider__Group_2__1__Impl8109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__2__Impl_in_rule__ContentProvider__Group_2__28139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ContentProvider__Group_2__2__Impl8167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__0__Impl_in_rule__ProviderConstruction__Group_0__08204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__1_in_rule__ProviderConstruction__Group_0__08207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__1__Impl_in_rule__ProviderConstruction__Group_0__18265 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__2_in_rule__ProviderConstruction__Group_0__18268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__ProviderAssignment_0_1_in_rule__ProviderConstruction__Group_0__1__Impl8295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__2__Impl_in_rule__ProviderConstruction__Group_0__28325 = new BitSet(new long[]{0x00000000016E0030L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__3_in_rule__ProviderConstruction__Group_0__28328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ProviderConstruction__Group_0__2__Impl8356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__3__Impl_in_rule__ProviderConstruction__Group_0__38387 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__4_in_rule__ProviderConstruction__Group_0__38390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__ArgumentAssignment_0_3_in_rule__ProviderConstruction__Group_0__3__Impl8417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__4__Impl_in_rule__ProviderConstruction__Group_0__48448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ProviderConstruction__Group_0__4__Impl8476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_1__0__Impl_in_rule__ProviderConstruction__Group_1__08517 = new BitSet(new long[]{0x00000000016A0030L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_1__1_in_rule__ProviderConstruction__Group_1__08520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_1__1__Impl_in_rule__ProviderConstruction__Group_1__18578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__ExpressionAssignment_1_1_in_rule__ProviderConstruction__Group_1__1__Impl8605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__0__Impl_in_rule__TableView__Group__08639 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TableView__Group__1_in_rule__TableView__Group__08642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__TableView__Group__0__Impl8670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__1__Impl_in_rule__TableView__Group__18701 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__TableView__Group__2_in_rule__TableView__Group__18704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__NameAssignment_1_in_rule__TableView__Group__1__Impl8731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__2__Impl_in_rule__TableView__Group__28761 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__TableView__Group__3_in_rule__TableView__Group__28764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__0_in_rule__TableView__Group__2__Impl8791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__3__Impl_in_rule__TableView__Group__38822 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TableView__Group__4_in_rule__TableView__Group__38825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TableView__Group__3__Impl8853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__4__Impl_in_rule__TableView__Group__48884 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__TableView__Group__5_in_rule__TableView__Group__48887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TableView__Group__4__Impl8915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__5__Impl_in_rule__TableView__Group__58946 = new BitSet(new long[]{0x0008000008000000L});
    public static final BitSet FOLLOW_rule__TableView__Group__6_in_rule__TableView__Group__58949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__TitleAssignment_5_in_rule__TableView__Group__5__Impl8976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__6__Impl_in_rule__TableView__Group__69006 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TableView__Group__7_in_rule__TableView__Group__69009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__SectionsAssignment_6_in_rule__TableView__Group__6__Impl9036 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__7__Impl_in_rule__TableView__Group__79067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TableView__Group__7__Impl9095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__0__Impl_in_rule__TableView__Group_2__09142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__1_in_rule__TableView__Group_2__09145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TableView__Group_2__0__Impl9173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__1__Impl_in_rule__TableView__Group_2__19204 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__2_in_rule__TableView__Group_2__19207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__ContentAssignment_2_1_in_rule__TableView__Group_2__1__Impl9234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__2__Impl_in_rule__TableView__Group_2__29264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TableView__Group_2__2__Impl9292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__0__Impl_in_rule__DetailsView__Group__09329 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__1_in_rule__DetailsView__Group__09332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__DetailsView__Group__0__Impl9360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__1__Impl_in_rule__DetailsView__Group__19391 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__2_in_rule__DetailsView__Group__19394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__NameAssignment_1_in_rule__DetailsView__Group__1__Impl9421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__2__Impl_in_rule__DetailsView__Group__29451 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__3_in_rule__DetailsView__Group__29454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__0_in_rule__DetailsView__Group__2__Impl9481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__3__Impl_in_rule__DetailsView__Group__39512 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__4_in_rule__DetailsView__Group__39515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DetailsView__Group__3__Impl9543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__4__Impl_in_rule__DetailsView__Group__49574 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__5_in_rule__DetailsView__Group__49577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DetailsView__Group__4__Impl9605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__5__Impl_in_rule__DetailsView__Group__59636 = new BitSet(new long[]{0x0008800008000000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__6_in_rule__DetailsView__Group__59639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__TitleAssignment_5_in_rule__DetailsView__Group__5__Impl9666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__6__Impl_in_rule__DetailsView__Group__69696 = new BitSet(new long[]{0x0008000008000000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__7_in_rule__DetailsView__Group__69699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__HeaderAssignment_6_in_rule__DetailsView__Group__6__Impl9726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__7__Impl_in_rule__DetailsView__Group__79757 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__8_in_rule__DetailsView__Group__79760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__SectionsAssignment_7_in_rule__DetailsView__Group__7__Impl9787 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__8__Impl_in_rule__DetailsView__Group__89818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DetailsView__Group__8__Impl9846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__0__Impl_in_rule__DetailsView__Group_2__09895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__1_in_rule__DetailsView__Group_2__09898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DetailsView__Group_2__0__Impl9926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__1__Impl_in_rule__DetailsView__Group_2__19957 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__2_in_rule__DetailsView__Group_2__19960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__ContentAssignment_2_1_in_rule__DetailsView__Group_2__1__Impl9987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__2__Impl_in_rule__DetailsView__Group_2__210017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DetailsView__Group_2__2__Impl10045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__0__Impl_in_rule__CustomView__Group__010082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CustomView__Group__1_in_rule__CustomView__Group__010085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__CustomView__Group__0__Impl10113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__1__Impl_in_rule__CustomView__Group__110144 = new BitSet(new long[]{0x0000400000020000L});
    public static final BitSet FOLLOW_rule__CustomView__Group__2_in_rule__CustomView__Group__110147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__NameAssignment_1_in_rule__CustomView__Group__1__Impl10174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__2__Impl_in_rule__CustomView__Group__210204 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__CustomView__Group__3_in_rule__CustomView__Group__210207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__0_in_rule__CustomView__Group__2__Impl10234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__3__Impl_in_rule__CustomView__Group__310265 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CustomView__Group__4_in_rule__CustomView__Group__310268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__CustomView__Group__3__Impl10296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__4__Impl_in_rule__CustomView__Group__410327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__ObjclassAssignment_4_in_rule__CustomView__Group__4__Impl10354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__0__Impl_in_rule__CustomView__Group_2__010394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__1_in_rule__CustomView__Group_2__010397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CustomView__Group_2__0__Impl10425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__1__Impl_in_rule__CustomView__Group_2__110456 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__2_in_rule__CustomView__Group_2__110459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__ContentAssignment_2_1_in_rule__CustomView__Group_2__1__Impl10486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__2__Impl_in_rule__CustomView__Group_2__210516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CustomView__Group_2__2__Impl10544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__0__Impl_in_rule__ViewHeader__Group__010581 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__1_in_rule__ViewHeader__Group__010584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__1__Impl_in_rule__ViewHeader__Group__110642 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__2_in_rule__ViewHeader__Group__110645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ViewHeader__Group__1__Impl10673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__2__Impl_in_rule__ViewHeader__Group__210704 = new BitSet(new long[]{0x0007000048000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__3_in_rule__ViewHeader__Group__210707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ViewHeader__Group__2__Impl10735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__3__Impl_in_rule__ViewHeader__Group__310766 = new BitSet(new long[]{0x0007000008000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__4_in_rule__ViewHeader__Group__310769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_3__0_in_rule__ViewHeader__Group__3__Impl10796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__4__Impl_in_rule__ViewHeader__Group__410827 = new BitSet(new long[]{0x0006000008000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__5_in_rule__ViewHeader__Group__410830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_4__0_in_rule__ViewHeader__Group__4__Impl10857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__5__Impl_in_rule__ViewHeader__Group__510888 = new BitSet(new long[]{0x0004000008000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__6_in_rule__ViewHeader__Group__510891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_5__0_in_rule__ViewHeader__Group__5__Impl10918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__6__Impl_in_rule__ViewHeader__Group__610949 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__7_in_rule__ViewHeader__Group__610952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_6__0_in_rule__ViewHeader__Group__6__Impl10979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__7__Impl_in_rule__ViewHeader__Group__711010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ViewHeader__Group__7__Impl11038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_3__0__Impl_in_rule__ViewHeader__Group_3__011085 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_3__1_in_rule__ViewHeader__Group_3__011088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ViewHeader__Group_3__0__Impl11116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_3__1__Impl_in_rule__ViewHeader__Group_3__111147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__TitleAssignment_3_1_in_rule__ViewHeader__Group_3__1__Impl11174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_4__0__Impl_in_rule__ViewHeader__Group_4__011208 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_4__1_in_rule__ViewHeader__Group_4__011211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ViewHeader__Group_4__0__Impl11239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_4__1__Impl_in_rule__ViewHeader__Group_4__111270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__SubtitleAssignment_4_1_in_rule__ViewHeader__Group_4__1__Impl11297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_5__0__Impl_in_rule__ViewHeader__Group_5__011331 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_5__1_in_rule__ViewHeader__Group_5__011334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ViewHeader__Group_5__0__Impl11362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_5__1__Impl_in_rule__ViewHeader__Group_5__111393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__DetailsAssignment_5_1_in_rule__ViewHeader__Group_5__1__Impl11420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_6__0__Impl_in_rule__ViewHeader__Group_6__011454 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_6__1_in_rule__ViewHeader__Group_6__011457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ViewHeader__Group_6__0__Impl11485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_6__1__Impl_in_rule__ViewHeader__Group_6__111516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__ImageAssignment_6_1_in_rule__ViewHeader__Group_6__1__Impl11543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__0__Impl_in_rule__ViewSection__Group__011577 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__1_in_rule__ViewSection__Group__011580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ViewSection__Group__0__Impl11608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__1__Impl_in_rule__ViewSection__Group__111639 = new BitSet(new long[]{0x0010000040000000L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__2_in_rule__ViewSection__Group__111642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ViewSection__Group__1__Impl11670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__2__Impl_in_rule__ViewSection__Group__211701 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__3_in_rule__ViewSection__Group__211704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group_2__0_in_rule__ViewSection__Group__2__Impl11731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__3__Impl_in_rule__ViewSection__Group__311762 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__4_in_rule__ViewSection__Group__311765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__CellsAssignment_3_in_rule__ViewSection__Group__3__Impl11794 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__CellsAssignment_3_in_rule__ViewSection__Group__3__Impl11806 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__4__Impl_in_rule__ViewSection__Group__411839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ViewSection__Group__4__Impl11867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group_2__0__Impl_in_rule__ViewSection__Group_2__011908 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__ViewSection__Group_2__1_in_rule__ViewSection__Group_2__011911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ViewSection__Group_2__0__Impl11939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group_2__1__Impl_in_rule__ViewSection__Group_2__111970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__TitleAssignment_2_1_in_rule__ViewSection__Group_2__1__Impl11997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__0__Impl_in_rule__SectionCell__Group__012031 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__1_in_rule__SectionCell__Group__012034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__SectionCell__Group__0__Impl12062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__1__Impl_in_rule__SectionCell__Group__112093 = new BitSet(new long[]{0x0020000004000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__2_in_rule__SectionCell__Group__112096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__TypeAssignment_1_in_rule__SectionCell__Group__1__Impl12123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__2__Impl_in_rule__SectionCell__Group__212153 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__3_in_rule__SectionCell__Group__212156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_2__0_in_rule__SectionCell__Group__2__Impl12183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__3__Impl_in_rule__SectionCell__Group__312214 = new BitSet(new long[]{0x00C6000008000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__4_in_rule__SectionCell__Group__312217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SectionCell__Group__3__Impl12245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__4__Impl_in_rule__SectionCell__Group__412276 = new BitSet(new long[]{0x0086000008000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__5_in_rule__SectionCell__Group__412279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_4__0_in_rule__SectionCell__Group__4__Impl12306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__5__Impl_in_rule__SectionCell__Group__512337 = new BitSet(new long[]{0x0084000008000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__6_in_rule__SectionCell__Group__512340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_5__0_in_rule__SectionCell__Group__5__Impl12367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__6__Impl_in_rule__SectionCell__Group__612398 = new BitSet(new long[]{0x0080000008000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__7_in_rule__SectionCell__Group__612401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_6__0_in_rule__SectionCell__Group__6__Impl12428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__7__Impl_in_rule__SectionCell__Group__712459 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__8_in_rule__SectionCell__Group__712462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_7__0_in_rule__SectionCell__Group__7__Impl12489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__8__Impl_in_rule__SectionCell__Group__812520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SectionCell__Group__8__Impl12548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_2__0__Impl_in_rule__SectionCell__Group_2__012597 = new BitSet(new long[]{0x0000000001400010L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_2__1_in_rule__SectionCell__Group_2__012600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__SectionCell__Group_2__0__Impl12628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_2__1__Impl_in_rule__SectionCell__Group_2__112659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__IteratorAssignment_2_1_in_rule__SectionCell__Group_2__1__Impl12686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_4__0__Impl_in_rule__SectionCell__Group_4__012720 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_4__1_in_rule__SectionCell__Group_4__012723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__SectionCell__Group_4__0__Impl12751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_4__1__Impl_in_rule__SectionCell__Group_4__112782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__TextAssignment_4_1_in_rule__SectionCell__Group_4__1__Impl12809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_5__0__Impl_in_rule__SectionCell__Group_5__012843 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_5__1_in_rule__SectionCell__Group_5__012846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__SectionCell__Group_5__0__Impl12874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_5__1__Impl_in_rule__SectionCell__Group_5__112905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__DetailsAssignment_5_1_in_rule__SectionCell__Group_5__1__Impl12932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_6__0__Impl_in_rule__SectionCell__Group_6__012966 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_6__1_in_rule__SectionCell__Group_6__012969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__SectionCell__Group_6__0__Impl12997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_6__1__Impl_in_rule__SectionCell__Group_6__113028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__ImageAssignment_6_1_in_rule__SectionCell__Group_6__1__Impl13055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_7__0__Impl_in_rule__SectionCell__Group_7__013089 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_7__1_in_rule__SectionCell__Group_7__013092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__SectionCell__Group_7__0__Impl13120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_7__1__Impl_in_rule__SectionCell__Group_7__113151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__ActionAssignment_7_1_in_rule__SectionCell__Group_7__1__Impl13178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__0__Impl_in_rule__CollectionIterator__Group__013212 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__1_in_rule__CollectionIterator__Group__013215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__CollectionAssignment_0_in_rule__CollectionIterator__Group__0__Impl13242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__1__Impl_in_rule__CollectionIterator__Group__113272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__2_in_rule__CollectionIterator__Group__113275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__CollectionIterator__Group__1__Impl13303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__2__Impl_in_rule__CollectionIterator__Group__213334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__NameAssignment_2_in_rule__CollectionIterator__Group__2__Impl13361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__0__Impl_in_rule__ViewCall__Group__013397 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__1_in_rule__ViewCall__Group__013400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__ViewAssignment_0_in_rule__ViewCall__Group__0__Impl13427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__1__Impl_in_rule__ViewCall__Group__113457 = new BitSet(new long[]{0x00000000016E0030L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__2_in_rule__ViewCall__Group__113460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ViewCall__Group__1__Impl13488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__2__Impl_in_rule__ViewCall__Group__213519 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__3_in_rule__ViewCall__Group__213522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__ProviderAssignment_2_in_rule__ViewCall__Group__2__Impl13549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__3__Impl_in_rule__ViewCall__Group__313580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ViewCall__Group__3__Impl13608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__Model__ApplicationAssignment_013652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_rule__Model__ElementsAssignment_113683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDescription__TypeAssignment_013718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__TypeDescription__ManyAssignment_113758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_rule__Parameter__DescriptionAssignment_013797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_113828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectReference__ObjectAssignment_013863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_rule__ObjectReference__TailAssignment_113898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NestedObjectReference__ObjectAssignment_113933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_rule__NestedObjectReference__TailAssignment_213968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment13999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValuesAssignment_0_214030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValueAssignment_1_214061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__StringFunction__MatchAssignment_1_414092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__StringFunction__ReplacementAssignment_1_614123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValueAssignment_2_214154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__CollectionLiteral__ItemsAssignment_114185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__CollectionLiteral__ItemsAssignment_2_114216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__CollectionFunction__ValueAssignment_214247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__CollectionFunction__DelimiterAssignment_414278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Application__NameAssignment_114309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__Application__BackgroundAssignment_3_114340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabbarButton_in_rule__Application__ButtonsAssignment_414371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__TabbarButton__TitleAssignment_314402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__TabbarButton__IconAssignment_514433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_rule__TabbarButton__ViewAssignment_714464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_114495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleType__PlatformTypeAssignment_314526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_114557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__ExtendsAssignment_2_114592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_414627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Property__DerivedAssignment_014663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_rule__Property__DescriptionAssignment_114702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_214733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContentProvider__NameAssignment_114764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ContentProvider__ParameterAssignment_2_114795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContentProvider__TypeAssignment_414830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ContentProvider__ManyAssignment_514870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ContentProvider__UrlAssignment_914909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ContentProvider__SelectionAssignment_1114940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProviderConstruction__ProviderAssignment_0_114975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ProviderConstruction__ArgumentAssignment_0_315010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ProviderConstruction__ExpressionAssignment_1_115041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TableView__NameAssignment_115072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__TableView__ContentAssignment_2_115103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__TableView__TitleAssignment_515134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewSection_in_rule__TableView__SectionsAssignment_615165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DetailsView__NameAssignment_115196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__DetailsView__ContentAssignment_2_115227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__DetailsView__TitleAssignment_515258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewHeader_in_rule__DetailsView__HeaderAssignment_615289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewSection_in_rule__DetailsView__SectionsAssignment_715320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomView__NameAssignment_115351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__CustomView__ContentAssignment_2_115382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomView__ObjclassAssignment_415413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ViewHeader__TitleAssignment_3_115444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ViewHeader__SubtitleAssignment_4_115475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ViewHeader__DetailsAssignment_5_115506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ViewHeader__ImageAssignment_6_115537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ViewSection__TitleAssignment_2_115568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionCell_in_rule__ViewSection__CellsAssignment_315599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellType_in_rule__SectionCell__TypeAssignment_115630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_rule__SectionCell__IteratorAssignment_2_115661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__SectionCell__TextAssignment_4_115692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__SectionCell__DetailsAssignment_5_115723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__SectionCell__ImageAssignment_6_115754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewAction_in_rule__SectionCell__ActionAssignment_7_115785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_rule__CollectionIterator__CollectionAssignment_015816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CollectionIterator__NameAssignment_215847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ExternalOpen__UrlAssignment15878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ViewCall__ViewAssignment_015913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_rule__ViewCall__ProviderAssignment_215948 = new BitSet(new long[]{0x0000000000000002L});

}