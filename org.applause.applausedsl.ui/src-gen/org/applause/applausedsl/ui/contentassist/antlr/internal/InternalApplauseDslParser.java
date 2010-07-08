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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Default'", "'DefaultWithDisclosure'", "'Value2'", "'Double'", "'Subtitle'", "'.'", "'('", "')'", "'replace('", "','", "'urlconform('", "'['", "']'", "'split('", "'tabbarApplication'", "'{'", "'}'", "'button'", "'title='", "'icon='", "'view='", "'type'", "'mapsTo'", "'entity'", "'extends'", "'contentprovider'", "'returns'", "'fetches'", "'XML'", "'from'", "'selects'", "'tableview'", "'detailsview'", "'customview'", "'implementedBy'", "'header'", "'subtitle='", "'details='", "'image='", "'section'", "'cell'", "'foreach'", "'text='", "'action='", "'as'", "'[]'", "'derived'"
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


    // $ANTLR start entryRuleApplication
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:89:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:90:1: ( ruleApplication EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:91:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication121);
            ruleApplication();
            _fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication128); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:98:1: ruleApplication : ( ruleTabBarApplication ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:102:2: ( ( ruleTabBarApplication ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:103:1: ( ruleTabBarApplication )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:103:1: ( ruleTabBarApplication )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:104:1: ruleTabBarApplication
            {
             before(grammarAccess.getApplicationAccess().getTabBarApplicationParserRuleCall()); 
            pushFollow(FOLLOW_ruleTabBarApplication_in_ruleApplication154);
            ruleTabBarApplication();
            _fsp--;

             after(grammarAccess.getApplicationAccess().getTabBarApplicationParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start entryRuleModelElement
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:117:1: entryRuleModelElement : ruleModelElement EOF ;
    public final void entryRuleModelElement() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:118:1: ( ruleModelElement EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:119:1: ruleModelElement EOF
            {
             before(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_ruleModelElement_in_entryRuleModelElement180);
            ruleModelElement();
            _fsp--;

             after(grammarAccess.getModelElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElement187); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:126:1: ruleModelElement : ( ( rule__ModelElement__Alternatives ) ) ;
    public final void ruleModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:130:2: ( ( ( rule__ModelElement__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:131:1: ( ( rule__ModelElement__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:131:1: ( ( rule__ModelElement__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:132:1: ( rule__ModelElement__Alternatives )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:133:1: ( rule__ModelElement__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:133:2: rule__ModelElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ModelElement__Alternatives_in_ruleModelElement213);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:147:1: entryRuleTypeDescription : ruleTypeDescription EOF ;
    public final void entryRuleTypeDescription() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:148:1: ( ruleTypeDescription EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:149:1: ruleTypeDescription EOF
            {
             before(grammarAccess.getTypeDescriptionRule()); 
            pushFollow(FOLLOW_ruleTypeDescription_in_entryRuleTypeDescription242);
            ruleTypeDescription();
            _fsp--;

             after(grammarAccess.getTypeDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDescription249); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:156:1: ruleTypeDescription : ( ( rule__TypeDescription__Group__0 ) ) ;
    public final void ruleTypeDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:160:2: ( ( ( rule__TypeDescription__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:161:1: ( ( rule__TypeDescription__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:161:1: ( ( rule__TypeDescription__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:162:1: ( rule__TypeDescription__Group__0 )
            {
             before(grammarAccess.getTypeDescriptionAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:163:1: ( rule__TypeDescription__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:163:2: rule__TypeDescription__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDescription__Group__0_in_ruleTypeDescription275);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:175:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:176:1: ( ruleParameter EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:177:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter302);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter309); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:184:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:188:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:189:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:189:1: ( ( rule__Parameter__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:190:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:191:1: ( rule__Parameter__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:191:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter335);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:203:1: entryRuleObjectReference : ruleObjectReference EOF ;
    public final void entryRuleObjectReference() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:204:1: ( ruleObjectReference EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:205:1: ruleObjectReference EOF
            {
             before(grammarAccess.getObjectReferenceRule()); 
            pushFollow(FOLLOW_ruleObjectReference_in_entryRuleObjectReference362);
            ruleObjectReference();
            _fsp--;

             after(grammarAccess.getObjectReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectReference369); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:212:1: ruleObjectReference : ( ( rule__ObjectReference__Group__0 ) ) ;
    public final void ruleObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:216:2: ( ( ( rule__ObjectReference__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:217:1: ( ( rule__ObjectReference__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:217:1: ( ( rule__ObjectReference__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:218:1: ( rule__ObjectReference__Group__0 )
            {
             before(grammarAccess.getObjectReferenceAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:219:1: ( rule__ObjectReference__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:219:2: rule__ObjectReference__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectReference__Group__0_in_ruleObjectReference395);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:231:1: entryRuleNestedObjectReference : ruleNestedObjectReference EOF ;
    public final void entryRuleNestedObjectReference() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:232:1: ( ruleNestedObjectReference EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:233:1: ruleNestedObjectReference EOF
            {
             before(grammarAccess.getNestedObjectReferenceRule()); 
            pushFollow(FOLLOW_ruleNestedObjectReference_in_entryRuleNestedObjectReference422);
            ruleNestedObjectReference();
            _fsp--;

             after(grammarAccess.getNestedObjectReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedObjectReference429); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:240:1: ruleNestedObjectReference : ( ( rule__NestedObjectReference__Group__0 ) ) ;
    public final void ruleNestedObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:244:2: ( ( ( rule__NestedObjectReference__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:245:1: ( ( rule__NestedObjectReference__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:245:1: ( ( rule__NestedObjectReference__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:246:1: ( rule__NestedObjectReference__Group__0 )
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:247:1: ( rule__NestedObjectReference__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:247:2: rule__NestedObjectReference__Group__0
            {
            pushFollow(FOLLOW_rule__NestedObjectReference__Group__0_in_ruleNestedObjectReference455);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:259:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:260:1: ( ruleExpression EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:261:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression482);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression489); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:268:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:272:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:273:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:273:1: ( ( rule__Expression__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:274:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:275:1: ( rule__Expression__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:275:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression515);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:287:1: entryRuleScalarExpression : ruleScalarExpression EOF ;
    public final void entryRuleScalarExpression() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:288:1: ( ruleScalarExpression EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:289:1: ruleScalarExpression EOF
            {
             before(grammarAccess.getScalarExpressionRule()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_entryRuleScalarExpression542);
            ruleScalarExpression();
            _fsp--;

             after(grammarAccess.getScalarExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarExpression549); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:296:1: ruleScalarExpression : ( ( rule__ScalarExpression__Alternatives ) ) ;
    public final void ruleScalarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:300:2: ( ( ( rule__ScalarExpression__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:301:1: ( ( rule__ScalarExpression__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:301:1: ( ( rule__ScalarExpression__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:302:1: ( rule__ScalarExpression__Alternatives )
            {
             before(grammarAccess.getScalarExpressionAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:303:1: ( rule__ScalarExpression__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:303:2: rule__ScalarExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ScalarExpression__Alternatives_in_ruleScalarExpression575);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:315:1: entryRuleCollectionExpression : ruleCollectionExpression EOF ;
    public final void entryRuleCollectionExpression() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:316:1: ( ruleCollectionExpression EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:317:1: ruleCollectionExpression EOF
            {
             before(grammarAccess.getCollectionExpressionRule()); 
            pushFollow(FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression602);
            ruleCollectionExpression();
            _fsp--;

             after(grammarAccess.getCollectionExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionExpression609); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:324:1: ruleCollectionExpression : ( ( rule__CollectionExpression__Alternatives ) ) ;
    public final void ruleCollectionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:328:2: ( ( ( rule__CollectionExpression__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:329:1: ( ( rule__CollectionExpression__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:329:1: ( ( rule__CollectionExpression__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:330:1: ( rule__CollectionExpression__Alternatives )
            {
             before(grammarAccess.getCollectionExpressionAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:331:1: ( rule__CollectionExpression__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:331:2: rule__CollectionExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__CollectionExpression__Alternatives_in_ruleCollectionExpression635);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:343:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:344:1: ( ruleStringLiteral EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:345:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral662);
            ruleStringLiteral();
            _fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral669); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:352:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:356:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:357:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:357:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:358:1: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:359:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:359:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral695);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:371:1: entryRuleStringFunction : ruleStringFunction EOF ;
    public final void entryRuleStringFunction() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:372:1: ( ruleStringFunction EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:373:1: ruleStringFunction EOF
            {
             before(grammarAccess.getStringFunctionRule()); 
            pushFollow(FOLLOW_ruleStringFunction_in_entryRuleStringFunction722);
            ruleStringFunction();
            _fsp--;

             after(grammarAccess.getStringFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunction729); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:380:1: ruleStringFunction : ( ( rule__StringFunction__Alternatives ) ) ;
    public final void ruleStringFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:384:2: ( ( ( rule__StringFunction__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:385:1: ( ( rule__StringFunction__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:385:1: ( ( rule__StringFunction__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:386:1: ( rule__StringFunction__Alternatives )
            {
             before(grammarAccess.getStringFunctionAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:387:1: ( rule__StringFunction__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:387:2: rule__StringFunction__Alternatives
            {
            pushFollow(FOLLOW_rule__StringFunction__Alternatives_in_ruleStringFunction755);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:399:1: entryRuleCollectionLiteral : ruleCollectionLiteral EOF ;
    public final void entryRuleCollectionLiteral() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:400:1: ( ruleCollectionLiteral EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:401:1: ruleCollectionLiteral EOF
            {
             before(grammarAccess.getCollectionLiteralRule()); 
            pushFollow(FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral782);
            ruleCollectionLiteral();
            _fsp--;

             after(grammarAccess.getCollectionLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionLiteral789); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:408:1: ruleCollectionLiteral : ( ( rule__CollectionLiteral__Group__0 ) ) ;
    public final void ruleCollectionLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:412:2: ( ( ( rule__CollectionLiteral__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:413:1: ( ( rule__CollectionLiteral__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:413:1: ( ( rule__CollectionLiteral__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:414:1: ( rule__CollectionLiteral__Group__0 )
            {
             before(grammarAccess.getCollectionLiteralAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:415:1: ( rule__CollectionLiteral__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:415:2: rule__CollectionLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group__0_in_ruleCollectionLiteral815);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:427:1: entryRuleCollectionFunction : ruleCollectionFunction EOF ;
    public final void entryRuleCollectionFunction() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:428:1: ( ruleCollectionFunction EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:429:1: ruleCollectionFunction EOF
            {
             before(grammarAccess.getCollectionFunctionRule()); 
            pushFollow(FOLLOW_ruleCollectionFunction_in_entryRuleCollectionFunction842);
            ruleCollectionFunction();
            _fsp--;

             after(grammarAccess.getCollectionFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionFunction849); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:436:1: ruleCollectionFunction : ( ( rule__CollectionFunction__Group__0 ) ) ;
    public final void ruleCollectionFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:440:2: ( ( ( rule__CollectionFunction__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:441:1: ( ( rule__CollectionFunction__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:441:1: ( ( rule__CollectionFunction__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:442:1: ( rule__CollectionFunction__Group__0 )
            {
             before(grammarAccess.getCollectionFunctionAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:443:1: ( rule__CollectionFunction__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:443:2: rule__CollectionFunction__Group__0
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__0_in_ruleCollectionFunction875);
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


    // $ANTLR start entryRuleTabBarApplication
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:455:1: entryRuleTabBarApplication : ruleTabBarApplication EOF ;
    public final void entryRuleTabBarApplication() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:456:1: ( ruleTabBarApplication EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:457:1: ruleTabBarApplication EOF
            {
             before(grammarAccess.getTabBarApplicationRule()); 
            pushFollow(FOLLOW_ruleTabBarApplication_in_entryRuleTabBarApplication902);
            ruleTabBarApplication();
            _fsp--;

             after(grammarAccess.getTabBarApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabBarApplication909); 

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
    // $ANTLR end entryRuleTabBarApplication


    // $ANTLR start ruleTabBarApplication
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:464:1: ruleTabBarApplication : ( ( rule__TabBarApplication__Group__0 ) ) ;
    public final void ruleTabBarApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:468:2: ( ( ( rule__TabBarApplication__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:469:1: ( ( rule__TabBarApplication__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:469:1: ( ( rule__TabBarApplication__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:470:1: ( rule__TabBarApplication__Group__0 )
            {
             before(grammarAccess.getTabBarApplicationAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:471:1: ( rule__TabBarApplication__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:471:2: rule__TabBarApplication__Group__0
            {
            pushFollow(FOLLOW_rule__TabBarApplication__Group__0_in_ruleTabBarApplication935);
            rule__TabBarApplication__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTabBarApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTabBarApplication


    // $ANTLR start entryRuleTabbarButton
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:483:1: entryRuleTabbarButton : ruleTabbarButton EOF ;
    public final void entryRuleTabbarButton() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:484:1: ( ruleTabbarButton EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:485:1: ruleTabbarButton EOF
            {
             before(grammarAccess.getTabbarButtonRule()); 
            pushFollow(FOLLOW_ruleTabbarButton_in_entryRuleTabbarButton962);
            ruleTabbarButton();
            _fsp--;

             after(grammarAccess.getTabbarButtonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabbarButton969); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:492:1: ruleTabbarButton : ( ( rule__TabbarButton__Group__0 ) ) ;
    public final void ruleTabbarButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:496:2: ( ( ( rule__TabbarButton__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:497:1: ( ( rule__TabbarButton__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:497:1: ( ( rule__TabbarButton__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:498:1: ( rule__TabbarButton__Group__0 )
            {
             before(grammarAccess.getTabbarButtonAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:499:1: ( rule__TabbarButton__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:499:2: rule__TabbarButton__Group__0
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__0_in_ruleTabbarButton995);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:511:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:512:1: ( ruleType EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:513:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1022);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1029); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:520:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:524:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:525:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:525:1: ( ( rule__Type__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:526:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:527:1: ( rule__Type__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:527:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1055);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:539:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:540:1: ( ruleSimpleType EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:541:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType1082);
            ruleSimpleType();
            _fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType1089); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:548:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:552:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:553:1: ( ( rule__SimpleType__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:553:1: ( ( rule__SimpleType__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:554:1: ( rule__SimpleType__Group__0 )
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:555:1: ( rule__SimpleType__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:555:2: rule__SimpleType__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType1115);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:567:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:568:1: ( ruleEntity EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:569:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1142);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1149); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:576:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:580:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:581:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:581:1: ( ( rule__Entity__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:582:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:583:1: ( rule__Entity__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:583:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity1175);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:595:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:596:1: ( ruleProperty EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:597:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1202);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1209); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:604:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:608:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:609:1: ( ( rule__Property__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:609:1: ( ( rule__Property__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:610:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:611:1: ( rule__Property__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:611:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty1235);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:623:1: entryRuleContentProvider : ruleContentProvider EOF ;
    public final void entryRuleContentProvider() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:624:1: ( ruleContentProvider EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:625:1: ruleContentProvider EOF
            {
             before(grammarAccess.getContentProviderRule()); 
            pushFollow(FOLLOW_ruleContentProvider_in_entryRuleContentProvider1262);
            ruleContentProvider();
            _fsp--;

             after(grammarAccess.getContentProviderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentProvider1269); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:632:1: ruleContentProvider : ( ( rule__ContentProvider__Group__0 ) ) ;
    public final void ruleContentProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:636:2: ( ( ( rule__ContentProvider__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:637:1: ( ( rule__ContentProvider__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:637:1: ( ( rule__ContentProvider__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:638:1: ( rule__ContentProvider__Group__0 )
            {
             before(grammarAccess.getContentProviderAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:639:1: ( rule__ContentProvider__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:639:2: rule__ContentProvider__Group__0
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__0_in_ruleContentProvider1295);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:651:1: entryRuleProviderConstruction : ruleProviderConstruction EOF ;
    public final void entryRuleProviderConstruction() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:652:1: ( ruleProviderConstruction EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:653:1: ruleProviderConstruction EOF
            {
             before(grammarAccess.getProviderConstructionRule()); 
            pushFollow(FOLLOW_ruleProviderConstruction_in_entryRuleProviderConstruction1322);
            ruleProviderConstruction();
            _fsp--;

             after(grammarAccess.getProviderConstructionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProviderConstruction1329); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:660:1: ruleProviderConstruction : ( ( rule__ProviderConstruction__Alternatives ) ) ;
    public final void ruleProviderConstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:664:2: ( ( ( rule__ProviderConstruction__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:665:1: ( ( rule__ProviderConstruction__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:665:1: ( ( rule__ProviderConstruction__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:666:1: ( rule__ProviderConstruction__Alternatives )
            {
             before(grammarAccess.getProviderConstructionAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:667:1: ( rule__ProviderConstruction__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:667:2: rule__ProviderConstruction__Alternatives
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Alternatives_in_ruleProviderConstruction1355);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:679:1: entryRuleView : ruleView EOF ;
    public final void entryRuleView() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:680:1: ( ruleView EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:681:1: ruleView EOF
            {
             before(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView1382);
            ruleView();
            _fsp--;

             after(grammarAccess.getViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView1389); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:688:1: ruleView : ( ( rule__View__Alternatives ) ) ;
    public final void ruleView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:692:2: ( ( ( rule__View__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:693:1: ( ( rule__View__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:693:1: ( ( rule__View__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:694:1: ( rule__View__Alternatives )
            {
             before(grammarAccess.getViewAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:695:1: ( rule__View__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:695:2: rule__View__Alternatives
            {
            pushFollow(FOLLOW_rule__View__Alternatives_in_ruleView1415);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:707:1: entryRuleSectionedView : ruleSectionedView EOF ;
    public final void entryRuleSectionedView() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:708:1: ( ruleSectionedView EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:709:1: ruleSectionedView EOF
            {
             before(grammarAccess.getSectionedViewRule()); 
            pushFollow(FOLLOW_ruleSectionedView_in_entryRuleSectionedView1442);
            ruleSectionedView();
            _fsp--;

             after(grammarAccess.getSectionedViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionedView1449); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:716:1: ruleSectionedView : ( ( rule__SectionedView__Alternatives ) ) ;
    public final void ruleSectionedView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:720:2: ( ( ( rule__SectionedView__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:721:1: ( ( rule__SectionedView__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:721:1: ( ( rule__SectionedView__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:722:1: ( rule__SectionedView__Alternatives )
            {
             before(grammarAccess.getSectionedViewAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:723:1: ( rule__SectionedView__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:723:2: rule__SectionedView__Alternatives
            {
            pushFollow(FOLLOW_rule__SectionedView__Alternatives_in_ruleSectionedView1475);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:735:1: entryRuleTableView : ruleTableView EOF ;
    public final void entryRuleTableView() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:736:1: ( ruleTableView EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:737:1: ruleTableView EOF
            {
             before(grammarAccess.getTableViewRule()); 
            pushFollow(FOLLOW_ruleTableView_in_entryRuleTableView1502);
            ruleTableView();
            _fsp--;

             after(grammarAccess.getTableViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableView1509); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:744:1: ruleTableView : ( ( rule__TableView__Group__0 ) ) ;
    public final void ruleTableView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:748:2: ( ( ( rule__TableView__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:749:1: ( ( rule__TableView__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:749:1: ( ( rule__TableView__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:750:1: ( rule__TableView__Group__0 )
            {
             before(grammarAccess.getTableViewAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:751:1: ( rule__TableView__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:751:2: rule__TableView__Group__0
            {
            pushFollow(FOLLOW_rule__TableView__Group__0_in_ruleTableView1535);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:763:1: entryRuleDetailsView : ruleDetailsView EOF ;
    public final void entryRuleDetailsView() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:764:1: ( ruleDetailsView EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:765:1: ruleDetailsView EOF
            {
             before(grammarAccess.getDetailsViewRule()); 
            pushFollow(FOLLOW_ruleDetailsView_in_entryRuleDetailsView1562);
            ruleDetailsView();
            _fsp--;

             after(grammarAccess.getDetailsViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDetailsView1569); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:772:1: ruleDetailsView : ( ( rule__DetailsView__Group__0 ) ) ;
    public final void ruleDetailsView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:776:2: ( ( ( rule__DetailsView__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:777:1: ( ( rule__DetailsView__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:777:1: ( ( rule__DetailsView__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:778:1: ( rule__DetailsView__Group__0 )
            {
             before(grammarAccess.getDetailsViewAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:779:1: ( rule__DetailsView__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:779:2: rule__DetailsView__Group__0
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__0_in_ruleDetailsView1595);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:791:1: entryRuleCustomView : ruleCustomView EOF ;
    public final void entryRuleCustomView() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:792:1: ( ruleCustomView EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:793:1: ruleCustomView EOF
            {
             before(grammarAccess.getCustomViewRule()); 
            pushFollow(FOLLOW_ruleCustomView_in_entryRuleCustomView1622);
            ruleCustomView();
            _fsp--;

             after(grammarAccess.getCustomViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomView1629); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:800:1: ruleCustomView : ( ( rule__CustomView__Group__0 ) ) ;
    public final void ruleCustomView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:804:2: ( ( ( rule__CustomView__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:805:1: ( ( rule__CustomView__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:805:1: ( ( rule__CustomView__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:806:1: ( rule__CustomView__Group__0 )
            {
             before(grammarAccess.getCustomViewAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:807:1: ( rule__CustomView__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:807:2: rule__CustomView__Group__0
            {
            pushFollow(FOLLOW_rule__CustomView__Group__0_in_ruleCustomView1655);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:819:1: entryRuleViewHeader : ruleViewHeader EOF ;
    public final void entryRuleViewHeader() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:820:1: ( ruleViewHeader EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:821:1: ruleViewHeader EOF
            {
             before(grammarAccess.getViewHeaderRule()); 
            pushFollow(FOLLOW_ruleViewHeader_in_entryRuleViewHeader1682);
            ruleViewHeader();
            _fsp--;

             after(grammarAccess.getViewHeaderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewHeader1689); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:828:1: ruleViewHeader : ( ( rule__ViewHeader__Group__0 ) ) ;
    public final void ruleViewHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:832:2: ( ( ( rule__ViewHeader__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:833:1: ( ( rule__ViewHeader__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:833:1: ( ( rule__ViewHeader__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:834:1: ( rule__ViewHeader__Group__0 )
            {
             before(grammarAccess.getViewHeaderAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:835:1: ( rule__ViewHeader__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:835:2: rule__ViewHeader__Group__0
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__0_in_ruleViewHeader1715);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:847:1: entryRuleViewSection : ruleViewSection EOF ;
    public final void entryRuleViewSection() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:848:1: ( ruleViewSection EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:849:1: ruleViewSection EOF
            {
             before(grammarAccess.getViewSectionRule()); 
            pushFollow(FOLLOW_ruleViewSection_in_entryRuleViewSection1742);
            ruleViewSection();
            _fsp--;

             after(grammarAccess.getViewSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewSection1749); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:856:1: ruleViewSection : ( ( rule__ViewSection__Group__0 ) ) ;
    public final void ruleViewSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:860:2: ( ( ( rule__ViewSection__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:861:1: ( ( rule__ViewSection__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:861:1: ( ( rule__ViewSection__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:862:1: ( rule__ViewSection__Group__0 )
            {
             before(grammarAccess.getViewSectionAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:863:1: ( rule__ViewSection__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:863:2: rule__ViewSection__Group__0
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__0_in_ruleViewSection1775);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:875:1: entryRuleSectionCell : ruleSectionCell EOF ;
    public final void entryRuleSectionCell() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:876:1: ( ruleSectionCell EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:877:1: ruleSectionCell EOF
            {
             before(grammarAccess.getSectionCellRule()); 
            pushFollow(FOLLOW_ruleSectionCell_in_entryRuleSectionCell1802);
            ruleSectionCell();
            _fsp--;

             after(grammarAccess.getSectionCellRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionCell1809); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:884:1: ruleSectionCell : ( ( rule__SectionCell__Group__0 ) ) ;
    public final void ruleSectionCell() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:888:2: ( ( ( rule__SectionCell__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:889:1: ( ( rule__SectionCell__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:889:1: ( ( rule__SectionCell__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:890:1: ( rule__SectionCell__Group__0 )
            {
             before(grammarAccess.getSectionCellAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:891:1: ( rule__SectionCell__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:891:2: rule__SectionCell__Group__0
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__0_in_ruleSectionCell1835);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:903:1: entryRuleCollectionIterator : ruleCollectionIterator EOF ;
    public final void entryRuleCollectionIterator() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:904:1: ( ruleCollectionIterator EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:905:1: ruleCollectionIterator EOF
            {
             before(grammarAccess.getCollectionIteratorRule()); 
            pushFollow(FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator1862);
            ruleCollectionIterator();
            _fsp--;

             after(grammarAccess.getCollectionIteratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionIterator1869); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:912:1: ruleCollectionIterator : ( ( rule__CollectionIterator__Group__0 ) ) ;
    public final void ruleCollectionIterator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:916:2: ( ( ( rule__CollectionIterator__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:917:1: ( ( rule__CollectionIterator__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:917:1: ( ( rule__CollectionIterator__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:918:1: ( rule__CollectionIterator__Group__0 )
            {
             before(grammarAccess.getCollectionIteratorAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:919:1: ( rule__CollectionIterator__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:919:2: rule__CollectionIterator__Group__0
            {
            pushFollow(FOLLOW_rule__CollectionIterator__Group__0_in_ruleCollectionIterator1895);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:931:1: entryRuleViewAction : ruleViewAction EOF ;
    public final void entryRuleViewAction() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:932:1: ( ruleViewAction EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:933:1: ruleViewAction EOF
            {
             before(grammarAccess.getViewActionRule()); 
            pushFollow(FOLLOW_ruleViewAction_in_entryRuleViewAction1922);
            ruleViewAction();
            _fsp--;

             after(grammarAccess.getViewActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewAction1929); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:940:1: ruleViewAction : ( ( rule__ViewAction__Alternatives ) ) ;
    public final void ruleViewAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:944:2: ( ( ( rule__ViewAction__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:945:1: ( ( rule__ViewAction__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:945:1: ( ( rule__ViewAction__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:946:1: ( rule__ViewAction__Alternatives )
            {
             before(grammarAccess.getViewActionAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:947:1: ( rule__ViewAction__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:947:2: rule__ViewAction__Alternatives
            {
            pushFollow(FOLLOW_rule__ViewAction__Alternatives_in_ruleViewAction1955);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:959:1: entryRuleExternalOpen : ruleExternalOpen EOF ;
    public final void entryRuleExternalOpen() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:960:1: ( ruleExternalOpen EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:961:1: ruleExternalOpen EOF
            {
             before(grammarAccess.getExternalOpenRule()); 
            pushFollow(FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen1982);
            ruleExternalOpen();
            _fsp--;

             after(grammarAccess.getExternalOpenRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalOpen1989); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:968:1: ruleExternalOpen : ( ( rule__ExternalOpen__UrlAssignment ) ) ;
    public final void ruleExternalOpen() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:972:2: ( ( ( rule__ExternalOpen__UrlAssignment ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:973:1: ( ( rule__ExternalOpen__UrlAssignment ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:973:1: ( ( rule__ExternalOpen__UrlAssignment ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:974:1: ( rule__ExternalOpen__UrlAssignment )
            {
             before(grammarAccess.getExternalOpenAccess().getUrlAssignment()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:975:1: ( rule__ExternalOpen__UrlAssignment )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:975:2: rule__ExternalOpen__UrlAssignment
            {
            pushFollow(FOLLOW_rule__ExternalOpen__UrlAssignment_in_ruleExternalOpen2015);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:987:1: entryRuleViewCall : ruleViewCall EOF ;
    public final void entryRuleViewCall() throws RecognitionException {
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:988:1: ( ruleViewCall EOF )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:989:1: ruleViewCall EOF
            {
             before(grammarAccess.getViewCallRule()); 
            pushFollow(FOLLOW_ruleViewCall_in_entryRuleViewCall2042);
            ruleViewCall();
            _fsp--;

             after(grammarAccess.getViewCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewCall2049); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:996:1: ruleViewCall : ( ( rule__ViewCall__Group__0 ) ) ;
    public final void ruleViewCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1000:2: ( ( ( rule__ViewCall__Group__0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1001:1: ( ( rule__ViewCall__Group__0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1001:1: ( ( rule__ViewCall__Group__0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1002:1: ( rule__ViewCall__Group__0 )
            {
             before(grammarAccess.getViewCallAccess().getGroup()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1003:1: ( rule__ViewCall__Group__0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1003:2: rule__ViewCall__Group__0
            {
            pushFollow(FOLLOW_rule__ViewCall__Group__0_in_ruleViewCall2075);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1016:1: ruleCellType : ( ( rule__CellType__Alternatives ) ) ;
    public final void ruleCellType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1020:1: ( ( ( rule__CellType__Alternatives ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1021:1: ( ( rule__CellType__Alternatives ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1021:1: ( ( rule__CellType__Alternatives ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1022:1: ( rule__CellType__Alternatives )
            {
             before(grammarAccess.getCellTypeAccess().getAlternatives()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1023:1: ( rule__CellType__Alternatives )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1023:2: rule__CellType__Alternatives
            {
            pushFollow(FOLLOW_rule__CellType__Alternatives_in_ruleCellType2112);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1034:1: rule__ModelElement__Alternatives : ( ( ruleType ) | ( ruleContentProvider ) | ( ruleView ) );
    public final void rule__ModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1038:1: ( ( ruleType ) | ( ruleContentProvider ) | ( ruleView ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 32:
            case 34:
                {
                alt1=1;
                }
                break;
            case 36:
                {
                alt1=2;
                }
                break;
            case 42:
            case 43:
            case 44:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1034:1: rule__ModelElement__Alternatives : ( ( ruleType ) | ( ruleContentProvider ) | ( ruleView ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1039:1: ( ruleType )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1039:1: ( ruleType )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1040:1: ruleType
                    {
                     before(grammarAccess.getModelElementAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleType_in_rule__ModelElement__Alternatives2147);
                    ruleType();
                    _fsp--;

                     after(grammarAccess.getModelElementAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1045:6: ( ruleContentProvider )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1045:6: ( ruleContentProvider )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1046:1: ruleContentProvider
                    {
                     before(grammarAccess.getModelElementAccess().getContentProviderParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleContentProvider_in_rule__ModelElement__Alternatives2164);
                    ruleContentProvider();
                    _fsp--;

                     after(grammarAccess.getModelElementAccess().getContentProviderParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1051:6: ( ruleView )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1051:6: ( ruleView )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1052:1: ruleView
                    {
                     before(grammarAccess.getModelElementAccess().getViewParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleView_in_rule__ModelElement__Alternatives2181);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1063:1: rule__Expression__Alternatives : ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1067:1: ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) )
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
                    new NoViableAltException("1063:1: rule__Expression__Alternatives : ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1068:1: ( ruleStringLiteral )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1068:1: ( ruleStringLiteral )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1069:1: ruleStringLiteral
                    {
                     before(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Expression__Alternatives2214);
                    ruleStringLiteral();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1074:6: ( ruleStringFunction )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1074:6: ( ruleStringFunction )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1075:1: ruleStringFunction
                    {
                     before(grammarAccess.getExpressionAccess().getStringFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringFunction_in_rule__Expression__Alternatives2231);
                    ruleStringFunction();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getStringFunctionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1080:6: ( ruleCollectionLiteral )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1080:6: ( ruleCollectionLiteral )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1081:1: ruleCollectionLiteral
                    {
                     before(grammarAccess.getExpressionAccess().getCollectionLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_rule__Expression__Alternatives2248);
                    ruleCollectionLiteral();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getCollectionLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1086:6: ( ruleCollectionFunction )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1086:6: ( ruleCollectionFunction )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1087:1: ruleCollectionFunction
                    {
                     before(grammarAccess.getExpressionAccess().getCollectionFunctionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleCollectionFunction_in_rule__Expression__Alternatives2265);
                    ruleCollectionFunction();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getCollectionFunctionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1092:6: ( ruleObjectReference )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1092:6: ( ruleObjectReference )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1093:1: ruleObjectReference
                    {
                     before(grammarAccess.getExpressionAccess().getObjectReferenceParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleObjectReference_in_rule__Expression__Alternatives2282);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1103:1: rule__ScalarExpression__Alternatives : ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleObjectReference ) );
    public final void rule__ScalarExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1107:1: ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleObjectReference ) )
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
                    new NoViableAltException("1103:1: rule__ScalarExpression__Alternatives : ( ( ruleStringLiteral ) | ( ruleStringFunction ) | ( ruleObjectReference ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1108:1: ( ruleStringLiteral )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1108:1: ( ruleStringLiteral )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1109:1: ruleStringLiteral
                    {
                     before(grammarAccess.getScalarExpressionAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__ScalarExpression__Alternatives2314);
                    ruleStringLiteral();
                    _fsp--;

                     after(grammarAccess.getScalarExpressionAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1114:6: ( ruleStringFunction )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1114:6: ( ruleStringFunction )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1115:1: ruleStringFunction
                    {
                     before(grammarAccess.getScalarExpressionAccess().getStringFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringFunction_in_rule__ScalarExpression__Alternatives2331);
                    ruleStringFunction();
                    _fsp--;

                     after(grammarAccess.getScalarExpressionAccess().getStringFunctionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1120:6: ( ruleObjectReference )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1120:6: ( ruleObjectReference )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1121:1: ruleObjectReference
                    {
                     before(grammarAccess.getScalarExpressionAccess().getObjectReferenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleObjectReference_in_rule__ScalarExpression__Alternatives2348);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1131:1: rule__CollectionExpression__Alternatives : ( ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) );
    public final void rule__CollectionExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1135:1: ( ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) )
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
                    new NoViableAltException("1131:1: rule__CollectionExpression__Alternatives : ( ( ruleCollectionLiteral ) | ( ruleCollectionFunction ) | ( ruleObjectReference ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1136:1: ( ruleCollectionLiteral )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1136:1: ( ruleCollectionLiteral )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1137:1: ruleCollectionLiteral
                    {
                     before(grammarAccess.getCollectionExpressionAccess().getCollectionLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_rule__CollectionExpression__Alternatives2380);
                    ruleCollectionLiteral();
                    _fsp--;

                     after(grammarAccess.getCollectionExpressionAccess().getCollectionLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1142:6: ( ruleCollectionFunction )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1142:6: ( ruleCollectionFunction )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1143:1: ruleCollectionFunction
                    {
                     before(grammarAccess.getCollectionExpressionAccess().getCollectionFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCollectionFunction_in_rule__CollectionExpression__Alternatives2397);
                    ruleCollectionFunction();
                    _fsp--;

                     after(grammarAccess.getCollectionExpressionAccess().getCollectionFunctionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1148:6: ( ruleObjectReference )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1148:6: ( ruleObjectReference )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1149:1: ruleObjectReference
                    {
                     before(grammarAccess.getCollectionExpressionAccess().getObjectReferenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleObjectReference_in_rule__CollectionExpression__Alternatives2414);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1159:1: rule__StringFunction__Alternatives : ( ( ( rule__StringFunction__Group_0__0 ) ) | ( ( rule__StringFunction__Group_1__0 ) ) | ( ( rule__StringFunction__Group_2__0 ) ) );
    public final void rule__StringFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1163:1: ( ( ( rule__StringFunction__Group_0__0 ) ) | ( ( rule__StringFunction__Group_1__0 ) ) | ( ( rule__StringFunction__Group_2__0 ) ) )
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
                    new NoViableAltException("1159:1: rule__StringFunction__Alternatives : ( ( ( rule__StringFunction__Group_0__0 ) ) | ( ( rule__StringFunction__Group_1__0 ) ) | ( ( rule__StringFunction__Group_2__0 ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1164:1: ( ( rule__StringFunction__Group_0__0 ) )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1164:1: ( ( rule__StringFunction__Group_0__0 ) )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1165:1: ( rule__StringFunction__Group_0__0 )
                    {
                     before(grammarAccess.getStringFunctionAccess().getGroup_0()); 
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1166:1: ( rule__StringFunction__Group_0__0 )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1166:2: rule__StringFunction__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__StringFunction__Group_0__0_in_rule__StringFunction__Alternatives2446);
                    rule__StringFunction__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStringFunctionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1170:6: ( ( rule__StringFunction__Group_1__0 ) )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1170:6: ( ( rule__StringFunction__Group_1__0 ) )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1171:1: ( rule__StringFunction__Group_1__0 )
                    {
                     before(grammarAccess.getStringFunctionAccess().getGroup_1()); 
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1172:1: ( rule__StringFunction__Group_1__0 )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1172:2: rule__StringFunction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StringFunction__Group_1__0_in_rule__StringFunction__Alternatives2464);
                    rule__StringFunction__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStringFunctionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1176:6: ( ( rule__StringFunction__Group_2__0 ) )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1176:6: ( ( rule__StringFunction__Group_2__0 ) )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1177:1: ( rule__StringFunction__Group_2__0 )
                    {
                     before(grammarAccess.getStringFunctionAccess().getGroup_2()); 
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1178:1: ( rule__StringFunction__Group_2__0 )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1178:2: rule__StringFunction__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StringFunction__Group_2__0_in_rule__StringFunction__Alternatives2482);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1187:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1191:1: ( ( ruleSimpleType ) | ( ruleEntity ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==32) ) {
                alt6=1;
            }
            else if ( (LA6_0==34) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1187:1: rule__Type__Alternatives : ( ( ruleSimpleType ) | ( ruleEntity ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1192:1: ( ruleSimpleType )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1192:1: ( ruleSimpleType )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1193:1: ruleSimpleType
                    {
                     before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__Type__Alternatives2515);
                    ruleSimpleType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1198:6: ( ruleEntity )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1198:6: ( ruleEntity )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1199:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives2532);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1209:1: rule__ProviderConstruction__Alternatives : ( ( ( rule__ProviderConstruction__Group_0__0 ) ) | ( ( rule__ProviderConstruction__Group_1__0 ) ) );
    public final void rule__ProviderConstruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1213:1: ( ( ( rule__ProviderConstruction__Group_0__0 ) ) | ( ( rule__ProviderConstruction__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||LA7_1==16||LA7_1==18) ) {
                    alt7=2;
                }
                else if ( (LA7_1==17) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1209:1: rule__ProviderConstruction__Alternatives : ( ( ( rule__ProviderConstruction__Group_0__0 ) ) | ( ( rule__ProviderConstruction__Group_1__0 ) ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_STRING||LA7_0==17||LA7_0==19||(LA7_0>=21 && LA7_0<=22)||LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1209:1: rule__ProviderConstruction__Alternatives : ( ( ( rule__ProviderConstruction__Group_0__0 ) ) | ( ( rule__ProviderConstruction__Group_1__0 ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1214:1: ( ( rule__ProviderConstruction__Group_0__0 ) )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1214:1: ( ( rule__ProviderConstruction__Group_0__0 ) )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1215:1: ( rule__ProviderConstruction__Group_0__0 )
                    {
                     before(grammarAccess.getProviderConstructionAccess().getGroup_0()); 
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1216:1: ( rule__ProviderConstruction__Group_0__0 )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1216:2: rule__ProviderConstruction__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__0_in_rule__ProviderConstruction__Alternatives2564);
                    rule__ProviderConstruction__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getProviderConstructionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1220:6: ( ( rule__ProviderConstruction__Group_1__0 ) )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1220:6: ( ( rule__ProviderConstruction__Group_1__0 ) )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1221:1: ( rule__ProviderConstruction__Group_1__0 )
                    {
                     before(grammarAccess.getProviderConstructionAccess().getGroup_1()); 
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1222:1: ( rule__ProviderConstruction__Group_1__0 )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1222:2: rule__ProviderConstruction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ProviderConstruction__Group_1__0_in_rule__ProviderConstruction__Alternatives2582);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1231:1: rule__View__Alternatives : ( ( ruleSectionedView ) | ( ruleCustomView ) );
    public final void rule__View__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1235:1: ( ( ruleSectionedView ) | ( ruleCustomView ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=42 && LA8_0<=43)) ) {
                alt8=1;
            }
            else if ( (LA8_0==44) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1231:1: rule__View__Alternatives : ( ( ruleSectionedView ) | ( ruleCustomView ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1236:1: ( ruleSectionedView )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1236:1: ( ruleSectionedView )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1237:1: ruleSectionedView
                    {
                     before(grammarAccess.getViewAccess().getSectionedViewParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSectionedView_in_rule__View__Alternatives2615);
                    ruleSectionedView();
                    _fsp--;

                     after(grammarAccess.getViewAccess().getSectionedViewParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1242:6: ( ruleCustomView )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1242:6: ( ruleCustomView )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1243:1: ruleCustomView
                    {
                     before(grammarAccess.getViewAccess().getCustomViewParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCustomView_in_rule__View__Alternatives2632);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1253:1: rule__SectionedView__Alternatives : ( ( ruleTableView ) | ( ruleDetailsView ) );
    public final void rule__SectionedView__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1257:1: ( ( ruleTableView ) | ( ruleDetailsView ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==42) ) {
                alt9=1;
            }
            else if ( (LA9_0==43) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1253:1: rule__SectionedView__Alternatives : ( ( ruleTableView ) | ( ruleDetailsView ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1258:1: ( ruleTableView )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1258:1: ( ruleTableView )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1259:1: ruleTableView
                    {
                     before(grammarAccess.getSectionedViewAccess().getTableViewParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTableView_in_rule__SectionedView__Alternatives2664);
                    ruleTableView();
                    _fsp--;

                     after(grammarAccess.getSectionedViewAccess().getTableViewParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1264:6: ( ruleDetailsView )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1264:6: ( ruleDetailsView )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1265:1: ruleDetailsView
                    {
                     before(grammarAccess.getSectionedViewAccess().getDetailsViewParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDetailsView_in_rule__SectionedView__Alternatives2681);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1275:1: rule__ViewAction__Alternatives : ( ( ruleViewCall ) | ( ruleExternalOpen ) );
    public final void rule__ViewAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1279:1: ( ( ruleViewCall ) | ( ruleExternalOpen ) )
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
                        new NoViableAltException("1275:1: rule__ViewAction__Alternatives : ( ( ruleViewCall ) | ( ruleExternalOpen ) );", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==RULE_STRING||LA10_0==17||LA10_0==19||LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1275:1: rule__ViewAction__Alternatives : ( ( ruleViewCall ) | ( ruleExternalOpen ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1280:1: ( ruleViewCall )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1280:1: ( ruleViewCall )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1281:1: ruleViewCall
                    {
                     before(grammarAccess.getViewActionAccess().getViewCallParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleViewCall_in_rule__ViewAction__Alternatives2713);
                    ruleViewCall();
                    _fsp--;

                     after(grammarAccess.getViewActionAccess().getViewCallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1286:6: ( ruleExternalOpen )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1286:6: ( ruleExternalOpen )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1287:1: ruleExternalOpen
                    {
                     before(grammarAccess.getViewActionAccess().getExternalOpenParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExternalOpen_in_rule__ViewAction__Alternatives2730);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1297:1: rule__CellType__Alternatives : ( ( ( 'Default' ) ) | ( ( 'DefaultWithDisclosure' ) ) | ( ( 'Value2' ) ) | ( ( 'Double' ) ) | ( ( 'Subtitle' ) ) );
    public final void rule__CellType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1301:1: ( ( ( 'Default' ) ) | ( ( 'DefaultWithDisclosure' ) ) | ( ( 'Value2' ) ) | ( ( 'Double' ) ) | ( ( 'Subtitle' ) ) )
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
                    new NoViableAltException("1297:1: rule__CellType__Alternatives : ( ( ( 'Default' ) ) | ( ( 'DefaultWithDisclosure' ) ) | ( ( 'Value2' ) ) | ( ( 'Double' ) ) | ( ( 'Subtitle' ) ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1302:1: ( ( 'Default' ) )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1302:1: ( ( 'Default' ) )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1303:1: ( 'Default' )
                    {
                     before(grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0()); 
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1304:1: ( 'Default' )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1304:3: 'Default'
                    {
                    match(input,11,FOLLOW_11_in_rule__CellType__Alternatives2763); 

                    }

                     after(grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1309:6: ( ( 'DefaultWithDisclosure' ) )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1309:6: ( ( 'DefaultWithDisclosure' ) )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1310:1: ( 'DefaultWithDisclosure' )
                    {
                     before(grammarAccess.getCellTypeAccess().getDefaultWithDisclosureEnumLiteralDeclaration_1()); 
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1311:1: ( 'DefaultWithDisclosure' )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1311:3: 'DefaultWithDisclosure'
                    {
                    match(input,12,FOLLOW_12_in_rule__CellType__Alternatives2784); 

                    }

                     after(grammarAccess.getCellTypeAccess().getDefaultWithDisclosureEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1316:6: ( ( 'Value2' ) )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1316:6: ( ( 'Value2' ) )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1317:1: ( 'Value2' )
                    {
                     before(grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2()); 
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1318:1: ( 'Value2' )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1318:3: 'Value2'
                    {
                    match(input,13,FOLLOW_13_in_rule__CellType__Alternatives2805); 

                    }

                     after(grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1323:6: ( ( 'Double' ) )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1323:6: ( ( 'Double' ) )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1324:1: ( 'Double' )
                    {
                     before(grammarAccess.getCellTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1325:1: ( 'Double' )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1325:3: 'Double'
                    {
                    match(input,14,FOLLOW_14_in_rule__CellType__Alternatives2826); 

                    }

                     after(grammarAccess.getCellTypeAccess().getDoubleEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1330:6: ( ( 'Subtitle' ) )
                    {
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1330:6: ( ( 'Subtitle' ) )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1331:1: ( 'Subtitle' )
                    {
                     before(grammarAccess.getCellTypeAccess().getSubtitleEnumLiteralDeclaration_4()); 
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1332:1: ( 'Subtitle' )
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1332:3: 'Subtitle'
                    {
                    match(input,15,FOLLOW_15_in_rule__CellType__Alternatives2847); 

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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1344:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1348:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1349:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02880);
            rule__Model__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02883);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1356:1: rule__Model__Group__0__Impl : ( ( rule__Model__ApplicationAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1360:1: ( ( ( rule__Model__ApplicationAssignment_0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1361:1: ( ( rule__Model__ApplicationAssignment_0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1361:1: ( ( rule__Model__ApplicationAssignment_0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1362:1: ( rule__Model__ApplicationAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getApplicationAssignment_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1363:1: ( rule__Model__ApplicationAssignment_0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1363:2: rule__Model__ApplicationAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__ApplicationAssignment_0_in_rule__Model__Group__0__Impl2910);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1373:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1377:1: ( rule__Model__Group__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1378:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12940);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1384:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1388:1: ( ( ( rule__Model__ElementsAssignment_1 )* ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1389:1: ( ( rule__Model__ElementsAssignment_1 )* )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1389:1: ( ( rule__Model__ElementsAssignment_1 )* )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1390:1: ( rule__Model__ElementsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1391:1: ( rule__Model__ElementsAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32||LA12_0==34||LA12_0==36||(LA12_0>=42 && LA12_0<=44)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1391:2: rule__Model__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ElementsAssignment_1_in_rule__Model__Group__1__Impl2967);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1405:1: rule__TypeDescription__Group__0 : rule__TypeDescription__Group__0__Impl rule__TypeDescription__Group__1 ;
    public final void rule__TypeDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1409:1: ( rule__TypeDescription__Group__0__Impl rule__TypeDescription__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1410:2: rule__TypeDescription__Group__0__Impl rule__TypeDescription__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDescription__Group__0__Impl_in_rule__TypeDescription__Group__03002);
            rule__TypeDescription__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TypeDescription__Group__1_in_rule__TypeDescription__Group__03005);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1417:1: rule__TypeDescription__Group__0__Impl : ( ( rule__TypeDescription__TypeAssignment_0 ) ) ;
    public final void rule__TypeDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1421:1: ( ( ( rule__TypeDescription__TypeAssignment_0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1422:1: ( ( rule__TypeDescription__TypeAssignment_0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1422:1: ( ( rule__TypeDescription__TypeAssignment_0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1423:1: ( rule__TypeDescription__TypeAssignment_0 )
            {
             before(grammarAccess.getTypeDescriptionAccess().getTypeAssignment_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1424:1: ( rule__TypeDescription__TypeAssignment_0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1424:2: rule__TypeDescription__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeDescription__TypeAssignment_0_in_rule__TypeDescription__Group__0__Impl3032);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1434:1: rule__TypeDescription__Group__1 : rule__TypeDescription__Group__1__Impl ;
    public final void rule__TypeDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1438:1: ( rule__TypeDescription__Group__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1439:2: rule__TypeDescription__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDescription__Group__1__Impl_in_rule__TypeDescription__Group__13062);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1445:1: rule__TypeDescription__Group__1__Impl : ( ( rule__TypeDescription__ManyAssignment_1 )? ) ;
    public final void rule__TypeDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1449:1: ( ( ( rule__TypeDescription__ManyAssignment_1 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1450:1: ( ( rule__TypeDescription__ManyAssignment_1 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1450:1: ( ( rule__TypeDescription__ManyAssignment_1 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1451:1: ( rule__TypeDescription__ManyAssignment_1 )?
            {
             before(grammarAccess.getTypeDescriptionAccess().getManyAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1452:1: ( rule__TypeDescription__ManyAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==56) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1452:2: rule__TypeDescription__ManyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeDescription__ManyAssignment_1_in_rule__TypeDescription__Group__1__Impl3089);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1466:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1470:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1471:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03124);
            rule__Parameter__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03127);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1478:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__DescriptionAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1482:1: ( ( ( rule__Parameter__DescriptionAssignment_0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1483:1: ( ( rule__Parameter__DescriptionAssignment_0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1483:1: ( ( rule__Parameter__DescriptionAssignment_0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1484:1: ( rule__Parameter__DescriptionAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getDescriptionAssignment_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1485:1: ( rule__Parameter__DescriptionAssignment_0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1485:2: rule__Parameter__DescriptionAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__DescriptionAssignment_0_in_rule__Parameter__Group__0__Impl3154);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1495:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1499:1: ( rule__Parameter__Group__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1500:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13184);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1506:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1510:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1511:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1511:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1512:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1513:1: ( rule__Parameter__NameAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1513:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl3211);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1527:1: rule__ObjectReference__Group__0 : rule__ObjectReference__Group__0__Impl rule__ObjectReference__Group__1 ;
    public final void rule__ObjectReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1531:1: ( rule__ObjectReference__Group__0__Impl rule__ObjectReference__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1532:2: rule__ObjectReference__Group__0__Impl rule__ObjectReference__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectReference__Group__0__Impl_in_rule__ObjectReference__Group__03245);
            rule__ObjectReference__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ObjectReference__Group__1_in_rule__ObjectReference__Group__03248);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1539:1: rule__ObjectReference__Group__0__Impl : ( ( rule__ObjectReference__ObjectAssignment_0 ) ) ;
    public final void rule__ObjectReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1543:1: ( ( ( rule__ObjectReference__ObjectAssignment_0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1544:1: ( ( rule__ObjectReference__ObjectAssignment_0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1544:1: ( ( rule__ObjectReference__ObjectAssignment_0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1545:1: ( rule__ObjectReference__ObjectAssignment_0 )
            {
             before(grammarAccess.getObjectReferenceAccess().getObjectAssignment_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1546:1: ( rule__ObjectReference__ObjectAssignment_0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1546:2: rule__ObjectReference__ObjectAssignment_0
            {
            pushFollow(FOLLOW_rule__ObjectReference__ObjectAssignment_0_in_rule__ObjectReference__Group__0__Impl3275);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1556:1: rule__ObjectReference__Group__1 : rule__ObjectReference__Group__1__Impl ;
    public final void rule__ObjectReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1560:1: ( rule__ObjectReference__Group__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1561:2: rule__ObjectReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectReference__Group__1__Impl_in_rule__ObjectReference__Group__13305);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1567:1: rule__ObjectReference__Group__1__Impl : ( ( rule__ObjectReference__TailAssignment_1 )? ) ;
    public final void rule__ObjectReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1571:1: ( ( ( rule__ObjectReference__TailAssignment_1 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1572:1: ( ( rule__ObjectReference__TailAssignment_1 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1572:1: ( ( rule__ObjectReference__TailAssignment_1 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1573:1: ( rule__ObjectReference__TailAssignment_1 )?
            {
             before(grammarAccess.getObjectReferenceAccess().getTailAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1574:1: ( rule__ObjectReference__TailAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1574:2: rule__ObjectReference__TailAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ObjectReference__TailAssignment_1_in_rule__ObjectReference__Group__1__Impl3332);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1588:1: rule__NestedObjectReference__Group__0 : rule__NestedObjectReference__Group__0__Impl rule__NestedObjectReference__Group__1 ;
    public final void rule__NestedObjectReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1592:1: ( rule__NestedObjectReference__Group__0__Impl rule__NestedObjectReference__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1593:2: rule__NestedObjectReference__Group__0__Impl rule__NestedObjectReference__Group__1
            {
            pushFollow(FOLLOW_rule__NestedObjectReference__Group__0__Impl_in_rule__NestedObjectReference__Group__03367);
            rule__NestedObjectReference__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NestedObjectReference__Group__1_in_rule__NestedObjectReference__Group__03370);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1600:1: rule__NestedObjectReference__Group__0__Impl : ( '.' ) ;
    public final void rule__NestedObjectReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1604:1: ( ( '.' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1605:1: ( '.' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1605:1: ( '.' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1606:1: '.'
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getFullStopKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__NestedObjectReference__Group__0__Impl3398); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1619:1: rule__NestedObjectReference__Group__1 : rule__NestedObjectReference__Group__1__Impl rule__NestedObjectReference__Group__2 ;
    public final void rule__NestedObjectReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1623:1: ( rule__NestedObjectReference__Group__1__Impl rule__NestedObjectReference__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1624:2: rule__NestedObjectReference__Group__1__Impl rule__NestedObjectReference__Group__2
            {
            pushFollow(FOLLOW_rule__NestedObjectReference__Group__1__Impl_in_rule__NestedObjectReference__Group__13429);
            rule__NestedObjectReference__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NestedObjectReference__Group__2_in_rule__NestedObjectReference__Group__13432);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1631:1: rule__NestedObjectReference__Group__1__Impl : ( ( rule__NestedObjectReference__ObjectAssignment_1 ) ) ;
    public final void rule__NestedObjectReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1635:1: ( ( ( rule__NestedObjectReference__ObjectAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1636:1: ( ( rule__NestedObjectReference__ObjectAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1636:1: ( ( rule__NestedObjectReference__ObjectAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1637:1: ( rule__NestedObjectReference__ObjectAssignment_1 )
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getObjectAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1638:1: ( rule__NestedObjectReference__ObjectAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1638:2: rule__NestedObjectReference__ObjectAssignment_1
            {
            pushFollow(FOLLOW_rule__NestedObjectReference__ObjectAssignment_1_in_rule__NestedObjectReference__Group__1__Impl3459);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1648:1: rule__NestedObjectReference__Group__2 : rule__NestedObjectReference__Group__2__Impl ;
    public final void rule__NestedObjectReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1652:1: ( rule__NestedObjectReference__Group__2__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1653:2: rule__NestedObjectReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NestedObjectReference__Group__2__Impl_in_rule__NestedObjectReference__Group__23489);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1659:1: rule__NestedObjectReference__Group__2__Impl : ( ( rule__NestedObjectReference__TailAssignment_2 )? ) ;
    public final void rule__NestedObjectReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1663:1: ( ( ( rule__NestedObjectReference__TailAssignment_2 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1664:1: ( ( rule__NestedObjectReference__TailAssignment_2 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1664:1: ( ( rule__NestedObjectReference__TailAssignment_2 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1665:1: ( rule__NestedObjectReference__TailAssignment_2 )?
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getTailAssignment_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1666:1: ( rule__NestedObjectReference__TailAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1666:2: rule__NestedObjectReference__TailAssignment_2
                    {
                    pushFollow(FOLLOW_rule__NestedObjectReference__TailAssignment_2_in_rule__NestedObjectReference__Group__2__Impl3516);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1682:1: rule__StringFunction__Group_0__0 : rule__StringFunction__Group_0__0__Impl rule__StringFunction__Group_0__1 ;
    public final void rule__StringFunction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1686:1: ( rule__StringFunction__Group_0__0__Impl rule__StringFunction__Group_0__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1687:2: rule__StringFunction__Group_0__0__Impl rule__StringFunction__Group_0__1
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_0__0__Impl_in_rule__StringFunction__Group_0__03553);
            rule__StringFunction__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_0__1_in_rule__StringFunction__Group_0__03556);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1694:1: rule__StringFunction__Group_0__0__Impl : ( () ) ;
    public final void rule__StringFunction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1698:1: ( ( () ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1699:1: ( () )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1699:1: ( () )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1700:1: ()
            {
             before(grammarAccess.getStringFunctionAccess().getStringConcatAction_0_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1701:1: ()
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1703:1: 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1713:1: rule__StringFunction__Group_0__1 : rule__StringFunction__Group_0__1__Impl rule__StringFunction__Group_0__2 ;
    public final void rule__StringFunction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1717:1: ( rule__StringFunction__Group_0__1__Impl rule__StringFunction__Group_0__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1718:2: rule__StringFunction__Group_0__1__Impl rule__StringFunction__Group_0__2
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_0__1__Impl_in_rule__StringFunction__Group_0__13614);
            rule__StringFunction__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_0__2_in_rule__StringFunction__Group_0__13617);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1725:1: rule__StringFunction__Group_0__1__Impl : ( '(' ) ;
    public final void rule__StringFunction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1729:1: ( ( '(' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1730:1: ( '(' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1730:1: ( '(' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1731:1: '('
            {
             before(grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,17,FOLLOW_17_in_rule__StringFunction__Group_0__1__Impl3645); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1744:1: rule__StringFunction__Group_0__2 : rule__StringFunction__Group_0__2__Impl rule__StringFunction__Group_0__3 ;
    public final void rule__StringFunction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1748:1: ( rule__StringFunction__Group_0__2__Impl rule__StringFunction__Group_0__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1749:2: rule__StringFunction__Group_0__2__Impl rule__StringFunction__Group_0__3
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_0__2__Impl_in_rule__StringFunction__Group_0__23676);
            rule__StringFunction__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_0__3_in_rule__StringFunction__Group_0__23679);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1756:1: rule__StringFunction__Group_0__2__Impl : ( ( ( rule__StringFunction__ValuesAssignment_0_2 ) ) ( ( rule__StringFunction__ValuesAssignment_0_2 )* ) ) ;
    public final void rule__StringFunction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1760:1: ( ( ( ( rule__StringFunction__ValuesAssignment_0_2 ) ) ( ( rule__StringFunction__ValuesAssignment_0_2 )* ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1761:1: ( ( ( rule__StringFunction__ValuesAssignment_0_2 ) ) ( ( rule__StringFunction__ValuesAssignment_0_2 )* ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1761:1: ( ( ( rule__StringFunction__ValuesAssignment_0_2 ) ) ( ( rule__StringFunction__ValuesAssignment_0_2 )* ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1762:1: ( ( rule__StringFunction__ValuesAssignment_0_2 ) ) ( ( rule__StringFunction__ValuesAssignment_0_2 )* )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1762:1: ( ( rule__StringFunction__ValuesAssignment_0_2 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1763:1: ( rule__StringFunction__ValuesAssignment_0_2 )
            {
             before(grammarAccess.getStringFunctionAccess().getValuesAssignment_0_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1764:1: ( rule__StringFunction__ValuesAssignment_0_2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1764:2: rule__StringFunction__ValuesAssignment_0_2
            {
            pushFollow(FOLLOW_rule__StringFunction__ValuesAssignment_0_2_in_rule__StringFunction__Group_0__2__Impl3708);
            rule__StringFunction__ValuesAssignment_0_2();
            _fsp--;


            }

             after(grammarAccess.getStringFunctionAccess().getValuesAssignment_0_2()); 

            }

            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1767:1: ( ( rule__StringFunction__ValuesAssignment_0_2 )* )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1768:1: ( rule__StringFunction__ValuesAssignment_0_2 )*
            {
             before(grammarAccess.getStringFunctionAccess().getValuesAssignment_0_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1769:1: ( rule__StringFunction__ValuesAssignment_0_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||LA16_0==17||LA16_0==19||LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1769:2: rule__StringFunction__ValuesAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_rule__StringFunction__ValuesAssignment_0_2_in_rule__StringFunction__Group_0__2__Impl3720);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1780:1: rule__StringFunction__Group_0__3 : rule__StringFunction__Group_0__3__Impl ;
    public final void rule__StringFunction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1784:1: ( rule__StringFunction__Group_0__3__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1785:2: rule__StringFunction__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_0__3__Impl_in_rule__StringFunction__Group_0__33753);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1791:1: rule__StringFunction__Group_0__3__Impl : ( ')' ) ;
    public final void rule__StringFunction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1795:1: ( ( ')' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1796:1: ( ')' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1796:1: ( ')' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1797:1: ')'
            {
             before(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_0_3()); 
            match(input,18,FOLLOW_18_in_rule__StringFunction__Group_0__3__Impl3781); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1818:1: rule__StringFunction__Group_1__0 : rule__StringFunction__Group_1__0__Impl rule__StringFunction__Group_1__1 ;
    public final void rule__StringFunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1822:1: ( rule__StringFunction__Group_1__0__Impl rule__StringFunction__Group_1__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1823:2: rule__StringFunction__Group_1__0__Impl rule__StringFunction__Group_1__1
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__0__Impl_in_rule__StringFunction__Group_1__03820);
            rule__StringFunction__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__1_in_rule__StringFunction__Group_1__03823);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1830:1: rule__StringFunction__Group_1__0__Impl : ( () ) ;
    public final void rule__StringFunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1834:1: ( ( () ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1835:1: ( () )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1835:1: ( () )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1836:1: ()
            {
             before(grammarAccess.getStringFunctionAccess().getStringReplaceAction_1_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1837:1: ()
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1839:1: 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1849:1: rule__StringFunction__Group_1__1 : rule__StringFunction__Group_1__1__Impl rule__StringFunction__Group_1__2 ;
    public final void rule__StringFunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1853:1: ( rule__StringFunction__Group_1__1__Impl rule__StringFunction__Group_1__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1854:2: rule__StringFunction__Group_1__1__Impl rule__StringFunction__Group_1__2
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__1__Impl_in_rule__StringFunction__Group_1__13881);
            rule__StringFunction__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__2_in_rule__StringFunction__Group_1__13884);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1861:1: rule__StringFunction__Group_1__1__Impl : ( 'replace(' ) ;
    public final void rule__StringFunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1865:1: ( ( 'replace(' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1866:1: ( 'replace(' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1866:1: ( 'replace(' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1867:1: 'replace('
            {
             before(grammarAccess.getStringFunctionAccess().getReplaceKeyword_1_1()); 
            match(input,19,FOLLOW_19_in_rule__StringFunction__Group_1__1__Impl3912); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1880:1: rule__StringFunction__Group_1__2 : rule__StringFunction__Group_1__2__Impl rule__StringFunction__Group_1__3 ;
    public final void rule__StringFunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1884:1: ( rule__StringFunction__Group_1__2__Impl rule__StringFunction__Group_1__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1885:2: rule__StringFunction__Group_1__2__Impl rule__StringFunction__Group_1__3
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__2__Impl_in_rule__StringFunction__Group_1__23943);
            rule__StringFunction__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__3_in_rule__StringFunction__Group_1__23946);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1892:1: rule__StringFunction__Group_1__2__Impl : ( ( rule__StringFunction__ValueAssignment_1_2 ) ) ;
    public final void rule__StringFunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1896:1: ( ( ( rule__StringFunction__ValueAssignment_1_2 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1897:1: ( ( rule__StringFunction__ValueAssignment_1_2 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1897:1: ( ( rule__StringFunction__ValueAssignment_1_2 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1898:1: ( rule__StringFunction__ValueAssignment_1_2 )
            {
             before(grammarAccess.getStringFunctionAccess().getValueAssignment_1_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1899:1: ( rule__StringFunction__ValueAssignment_1_2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1899:2: rule__StringFunction__ValueAssignment_1_2
            {
            pushFollow(FOLLOW_rule__StringFunction__ValueAssignment_1_2_in_rule__StringFunction__Group_1__2__Impl3973);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1909:1: rule__StringFunction__Group_1__3 : rule__StringFunction__Group_1__3__Impl rule__StringFunction__Group_1__4 ;
    public final void rule__StringFunction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1913:1: ( rule__StringFunction__Group_1__3__Impl rule__StringFunction__Group_1__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1914:2: rule__StringFunction__Group_1__3__Impl rule__StringFunction__Group_1__4
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__3__Impl_in_rule__StringFunction__Group_1__34003);
            rule__StringFunction__Group_1__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__4_in_rule__StringFunction__Group_1__34006);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1921:1: rule__StringFunction__Group_1__3__Impl : ( ',' ) ;
    public final void rule__StringFunction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1925:1: ( ( ',' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1926:1: ( ',' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1926:1: ( ',' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1927:1: ','
            {
             before(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_3()); 
            match(input,20,FOLLOW_20_in_rule__StringFunction__Group_1__3__Impl4034); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1940:1: rule__StringFunction__Group_1__4 : rule__StringFunction__Group_1__4__Impl rule__StringFunction__Group_1__5 ;
    public final void rule__StringFunction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1944:1: ( rule__StringFunction__Group_1__4__Impl rule__StringFunction__Group_1__5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1945:2: rule__StringFunction__Group_1__4__Impl rule__StringFunction__Group_1__5
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__4__Impl_in_rule__StringFunction__Group_1__44065);
            rule__StringFunction__Group_1__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__5_in_rule__StringFunction__Group_1__44068);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1952:1: rule__StringFunction__Group_1__4__Impl : ( ( rule__StringFunction__MatchAssignment_1_4 ) ) ;
    public final void rule__StringFunction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1956:1: ( ( ( rule__StringFunction__MatchAssignment_1_4 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1957:1: ( ( rule__StringFunction__MatchAssignment_1_4 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1957:1: ( ( rule__StringFunction__MatchAssignment_1_4 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1958:1: ( rule__StringFunction__MatchAssignment_1_4 )
            {
             before(grammarAccess.getStringFunctionAccess().getMatchAssignment_1_4()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1959:1: ( rule__StringFunction__MatchAssignment_1_4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1959:2: rule__StringFunction__MatchAssignment_1_4
            {
            pushFollow(FOLLOW_rule__StringFunction__MatchAssignment_1_4_in_rule__StringFunction__Group_1__4__Impl4095);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1969:1: rule__StringFunction__Group_1__5 : rule__StringFunction__Group_1__5__Impl rule__StringFunction__Group_1__6 ;
    public final void rule__StringFunction__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1973:1: ( rule__StringFunction__Group_1__5__Impl rule__StringFunction__Group_1__6 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1974:2: rule__StringFunction__Group_1__5__Impl rule__StringFunction__Group_1__6
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__5__Impl_in_rule__StringFunction__Group_1__54125);
            rule__StringFunction__Group_1__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__6_in_rule__StringFunction__Group_1__54128);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1981:1: rule__StringFunction__Group_1__5__Impl : ( ',' ) ;
    public final void rule__StringFunction__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1985:1: ( ( ',' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1986:1: ( ',' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1986:1: ( ',' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:1987:1: ','
            {
             before(grammarAccess.getStringFunctionAccess().getCommaKeyword_1_5()); 
            match(input,20,FOLLOW_20_in_rule__StringFunction__Group_1__5__Impl4156); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2000:1: rule__StringFunction__Group_1__6 : rule__StringFunction__Group_1__6__Impl rule__StringFunction__Group_1__7 ;
    public final void rule__StringFunction__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2004:1: ( rule__StringFunction__Group_1__6__Impl rule__StringFunction__Group_1__7 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2005:2: rule__StringFunction__Group_1__6__Impl rule__StringFunction__Group_1__7
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__6__Impl_in_rule__StringFunction__Group_1__64187);
            rule__StringFunction__Group_1__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_1__7_in_rule__StringFunction__Group_1__64190);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2012:1: rule__StringFunction__Group_1__6__Impl : ( ( rule__StringFunction__ReplacementAssignment_1_6 ) ) ;
    public final void rule__StringFunction__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2016:1: ( ( ( rule__StringFunction__ReplacementAssignment_1_6 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2017:1: ( ( rule__StringFunction__ReplacementAssignment_1_6 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2017:1: ( ( rule__StringFunction__ReplacementAssignment_1_6 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2018:1: ( rule__StringFunction__ReplacementAssignment_1_6 )
            {
             before(grammarAccess.getStringFunctionAccess().getReplacementAssignment_1_6()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2019:1: ( rule__StringFunction__ReplacementAssignment_1_6 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2019:2: rule__StringFunction__ReplacementAssignment_1_6
            {
            pushFollow(FOLLOW_rule__StringFunction__ReplacementAssignment_1_6_in_rule__StringFunction__Group_1__6__Impl4217);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2029:1: rule__StringFunction__Group_1__7 : rule__StringFunction__Group_1__7__Impl ;
    public final void rule__StringFunction__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2033:1: ( rule__StringFunction__Group_1__7__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2034:2: rule__StringFunction__Group_1__7__Impl
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_1__7__Impl_in_rule__StringFunction__Group_1__74247);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2040:1: rule__StringFunction__Group_1__7__Impl : ( ')' ) ;
    public final void rule__StringFunction__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2044:1: ( ( ')' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2045:1: ( ')' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2045:1: ( ')' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2046:1: ')'
            {
             before(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_1_7()); 
            match(input,18,FOLLOW_18_in_rule__StringFunction__Group_1__7__Impl4275); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2075:1: rule__StringFunction__Group_2__0 : rule__StringFunction__Group_2__0__Impl rule__StringFunction__Group_2__1 ;
    public final void rule__StringFunction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2079:1: ( rule__StringFunction__Group_2__0__Impl rule__StringFunction__Group_2__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2080:2: rule__StringFunction__Group_2__0__Impl rule__StringFunction__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_2__0__Impl_in_rule__StringFunction__Group_2__04322);
            rule__StringFunction__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_2__1_in_rule__StringFunction__Group_2__04325);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2087:1: rule__StringFunction__Group_2__0__Impl : ( () ) ;
    public final void rule__StringFunction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2091:1: ( ( () ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2092:1: ( () )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2092:1: ( () )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2093:1: ()
            {
             before(grammarAccess.getStringFunctionAccess().getStringUrlConformAction_2_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2094:1: ()
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2096:1: 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2106:1: rule__StringFunction__Group_2__1 : rule__StringFunction__Group_2__1__Impl rule__StringFunction__Group_2__2 ;
    public final void rule__StringFunction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2110:1: ( rule__StringFunction__Group_2__1__Impl rule__StringFunction__Group_2__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2111:2: rule__StringFunction__Group_2__1__Impl rule__StringFunction__Group_2__2
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_2__1__Impl_in_rule__StringFunction__Group_2__14383);
            rule__StringFunction__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_2__2_in_rule__StringFunction__Group_2__14386);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2118:1: rule__StringFunction__Group_2__1__Impl : ( 'urlconform(' ) ;
    public final void rule__StringFunction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2122:1: ( ( 'urlconform(' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2123:1: ( 'urlconform(' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2123:1: ( 'urlconform(' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2124:1: 'urlconform('
            {
             before(grammarAccess.getStringFunctionAccess().getUrlconformKeyword_2_1()); 
            match(input,21,FOLLOW_21_in_rule__StringFunction__Group_2__1__Impl4414); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2137:1: rule__StringFunction__Group_2__2 : rule__StringFunction__Group_2__2__Impl rule__StringFunction__Group_2__3 ;
    public final void rule__StringFunction__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2141:1: ( rule__StringFunction__Group_2__2__Impl rule__StringFunction__Group_2__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2142:2: rule__StringFunction__Group_2__2__Impl rule__StringFunction__Group_2__3
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_2__2__Impl_in_rule__StringFunction__Group_2__24445);
            rule__StringFunction__Group_2__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringFunction__Group_2__3_in_rule__StringFunction__Group_2__24448);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2149:1: rule__StringFunction__Group_2__2__Impl : ( ( rule__StringFunction__ValueAssignment_2_2 ) ) ;
    public final void rule__StringFunction__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2153:1: ( ( ( rule__StringFunction__ValueAssignment_2_2 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2154:1: ( ( rule__StringFunction__ValueAssignment_2_2 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2154:1: ( ( rule__StringFunction__ValueAssignment_2_2 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2155:1: ( rule__StringFunction__ValueAssignment_2_2 )
            {
             before(grammarAccess.getStringFunctionAccess().getValueAssignment_2_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2156:1: ( rule__StringFunction__ValueAssignment_2_2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2156:2: rule__StringFunction__ValueAssignment_2_2
            {
            pushFollow(FOLLOW_rule__StringFunction__ValueAssignment_2_2_in_rule__StringFunction__Group_2__2__Impl4475);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2166:1: rule__StringFunction__Group_2__3 : rule__StringFunction__Group_2__3__Impl ;
    public final void rule__StringFunction__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2170:1: ( rule__StringFunction__Group_2__3__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2171:2: rule__StringFunction__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__StringFunction__Group_2__3__Impl_in_rule__StringFunction__Group_2__34505);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2177:1: rule__StringFunction__Group_2__3__Impl : ( ')' ) ;
    public final void rule__StringFunction__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2181:1: ( ( ')' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2182:1: ( ')' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2182:1: ( ')' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2183:1: ')'
            {
             before(grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_2_3()); 
            match(input,18,FOLLOW_18_in_rule__StringFunction__Group_2__3__Impl4533); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2204:1: rule__CollectionLiteral__Group__0 : rule__CollectionLiteral__Group__0__Impl rule__CollectionLiteral__Group__1 ;
    public final void rule__CollectionLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2208:1: ( rule__CollectionLiteral__Group__0__Impl rule__CollectionLiteral__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2209:2: rule__CollectionLiteral__Group__0__Impl rule__CollectionLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group__0__Impl_in_rule__CollectionLiteral__Group__04572);
            rule__CollectionLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionLiteral__Group__1_in_rule__CollectionLiteral__Group__04575);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2216:1: rule__CollectionLiteral__Group__0__Impl : ( '[' ) ;
    public final void rule__CollectionLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2220:1: ( ( '[' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2221:1: ( '[' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2221:1: ( '[' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2222:1: '['
            {
             before(grammarAccess.getCollectionLiteralAccess().getLeftSquareBracketKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__CollectionLiteral__Group__0__Impl4603); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2235:1: rule__CollectionLiteral__Group__1 : rule__CollectionLiteral__Group__1__Impl rule__CollectionLiteral__Group__2 ;
    public final void rule__CollectionLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2239:1: ( rule__CollectionLiteral__Group__1__Impl rule__CollectionLiteral__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2240:2: rule__CollectionLiteral__Group__1__Impl rule__CollectionLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group__1__Impl_in_rule__CollectionLiteral__Group__14634);
            rule__CollectionLiteral__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionLiteral__Group__2_in_rule__CollectionLiteral__Group__14637);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2247:1: rule__CollectionLiteral__Group__1__Impl : ( ( rule__CollectionLiteral__ItemsAssignment_1 ) ) ;
    public final void rule__CollectionLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2251:1: ( ( ( rule__CollectionLiteral__ItemsAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2252:1: ( ( rule__CollectionLiteral__ItemsAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2252:1: ( ( rule__CollectionLiteral__ItemsAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2253:1: ( rule__CollectionLiteral__ItemsAssignment_1 )
            {
             before(grammarAccess.getCollectionLiteralAccess().getItemsAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2254:1: ( rule__CollectionLiteral__ItemsAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2254:2: rule__CollectionLiteral__ItemsAssignment_1
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__ItemsAssignment_1_in_rule__CollectionLiteral__Group__1__Impl4664);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2264:1: rule__CollectionLiteral__Group__2 : rule__CollectionLiteral__Group__2__Impl rule__CollectionLiteral__Group__3 ;
    public final void rule__CollectionLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2268:1: ( rule__CollectionLiteral__Group__2__Impl rule__CollectionLiteral__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2269:2: rule__CollectionLiteral__Group__2__Impl rule__CollectionLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group__2__Impl_in_rule__CollectionLiteral__Group__24694);
            rule__CollectionLiteral__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionLiteral__Group__3_in_rule__CollectionLiteral__Group__24697);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2276:1: rule__CollectionLiteral__Group__2__Impl : ( ( rule__CollectionLiteral__Group_2__0 )* ) ;
    public final void rule__CollectionLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2280:1: ( ( ( rule__CollectionLiteral__Group_2__0 )* ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2281:1: ( ( rule__CollectionLiteral__Group_2__0 )* )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2281:1: ( ( rule__CollectionLiteral__Group_2__0 )* )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2282:1: ( rule__CollectionLiteral__Group_2__0 )*
            {
             before(grammarAccess.getCollectionLiteralAccess().getGroup_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2283:1: ( rule__CollectionLiteral__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2283:2: rule__CollectionLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CollectionLiteral__Group_2__0_in_rule__CollectionLiteral__Group__2__Impl4724);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2293:1: rule__CollectionLiteral__Group__3 : rule__CollectionLiteral__Group__3__Impl ;
    public final void rule__CollectionLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2297:1: ( rule__CollectionLiteral__Group__3__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2298:2: rule__CollectionLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group__3__Impl_in_rule__CollectionLiteral__Group__34755);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2304:1: rule__CollectionLiteral__Group__3__Impl : ( ']' ) ;
    public final void rule__CollectionLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2308:1: ( ( ']' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2309:1: ( ']' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2309:1: ( ']' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2310:1: ']'
            {
             before(grammarAccess.getCollectionLiteralAccess().getRightSquareBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__CollectionLiteral__Group__3__Impl4783); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2331:1: rule__CollectionLiteral__Group_2__0 : rule__CollectionLiteral__Group_2__0__Impl rule__CollectionLiteral__Group_2__1 ;
    public final void rule__CollectionLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2335:1: ( rule__CollectionLiteral__Group_2__0__Impl rule__CollectionLiteral__Group_2__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2336:2: rule__CollectionLiteral__Group_2__0__Impl rule__CollectionLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group_2__0__Impl_in_rule__CollectionLiteral__Group_2__04822);
            rule__CollectionLiteral__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionLiteral__Group_2__1_in_rule__CollectionLiteral__Group_2__04825);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2343:1: rule__CollectionLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__CollectionLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2347:1: ( ( ',' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2348:1: ( ',' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2348:1: ( ',' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2349:1: ','
            {
             before(grammarAccess.getCollectionLiteralAccess().getCommaKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__CollectionLiteral__Group_2__0__Impl4853); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2362:1: rule__CollectionLiteral__Group_2__1 : rule__CollectionLiteral__Group_2__1__Impl ;
    public final void rule__CollectionLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2366:1: ( rule__CollectionLiteral__Group_2__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2367:2: rule__CollectionLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__Group_2__1__Impl_in_rule__CollectionLiteral__Group_2__14884);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2373:1: rule__CollectionLiteral__Group_2__1__Impl : ( ( rule__CollectionLiteral__ItemsAssignment_2_1 ) ) ;
    public final void rule__CollectionLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2377:1: ( ( ( rule__CollectionLiteral__ItemsAssignment_2_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2378:1: ( ( rule__CollectionLiteral__ItemsAssignment_2_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2378:1: ( ( rule__CollectionLiteral__ItemsAssignment_2_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2379:1: ( rule__CollectionLiteral__ItemsAssignment_2_1 )
            {
             before(grammarAccess.getCollectionLiteralAccess().getItemsAssignment_2_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2380:1: ( rule__CollectionLiteral__ItemsAssignment_2_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2380:2: rule__CollectionLiteral__ItemsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__CollectionLiteral__ItemsAssignment_2_1_in_rule__CollectionLiteral__Group_2__1__Impl4911);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2394:1: rule__CollectionFunction__Group__0 : rule__CollectionFunction__Group__0__Impl rule__CollectionFunction__Group__1 ;
    public final void rule__CollectionFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2398:1: ( rule__CollectionFunction__Group__0__Impl rule__CollectionFunction__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2399:2: rule__CollectionFunction__Group__0__Impl rule__CollectionFunction__Group__1
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__0__Impl_in_rule__CollectionFunction__Group__04945);
            rule__CollectionFunction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionFunction__Group__1_in_rule__CollectionFunction__Group__04948);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2406:1: rule__CollectionFunction__Group__0__Impl : ( () ) ;
    public final void rule__CollectionFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2410:1: ( ( () ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2411:1: ( () )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2411:1: ( () )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2412:1: ()
            {
             before(grammarAccess.getCollectionFunctionAccess().getStringSplitAction_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2413:1: ()
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2415:1: 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2425:1: rule__CollectionFunction__Group__1 : rule__CollectionFunction__Group__1__Impl rule__CollectionFunction__Group__2 ;
    public final void rule__CollectionFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2429:1: ( rule__CollectionFunction__Group__1__Impl rule__CollectionFunction__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2430:2: rule__CollectionFunction__Group__1__Impl rule__CollectionFunction__Group__2
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__1__Impl_in_rule__CollectionFunction__Group__15006);
            rule__CollectionFunction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionFunction__Group__2_in_rule__CollectionFunction__Group__15009);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2437:1: rule__CollectionFunction__Group__1__Impl : ( 'split(' ) ;
    public final void rule__CollectionFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2441:1: ( ( 'split(' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2442:1: ( 'split(' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2442:1: ( 'split(' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2443:1: 'split('
            {
             before(grammarAccess.getCollectionFunctionAccess().getSplitKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__CollectionFunction__Group__1__Impl5037); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2456:1: rule__CollectionFunction__Group__2 : rule__CollectionFunction__Group__2__Impl rule__CollectionFunction__Group__3 ;
    public final void rule__CollectionFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2460:1: ( rule__CollectionFunction__Group__2__Impl rule__CollectionFunction__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2461:2: rule__CollectionFunction__Group__2__Impl rule__CollectionFunction__Group__3
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__2__Impl_in_rule__CollectionFunction__Group__25068);
            rule__CollectionFunction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionFunction__Group__3_in_rule__CollectionFunction__Group__25071);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2468:1: rule__CollectionFunction__Group__2__Impl : ( ( rule__CollectionFunction__ValueAssignment_2 ) ) ;
    public final void rule__CollectionFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2472:1: ( ( ( rule__CollectionFunction__ValueAssignment_2 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2473:1: ( ( rule__CollectionFunction__ValueAssignment_2 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2473:1: ( ( rule__CollectionFunction__ValueAssignment_2 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2474:1: ( rule__CollectionFunction__ValueAssignment_2 )
            {
             before(grammarAccess.getCollectionFunctionAccess().getValueAssignment_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2475:1: ( rule__CollectionFunction__ValueAssignment_2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2475:2: rule__CollectionFunction__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__CollectionFunction__ValueAssignment_2_in_rule__CollectionFunction__Group__2__Impl5098);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2485:1: rule__CollectionFunction__Group__3 : rule__CollectionFunction__Group__3__Impl rule__CollectionFunction__Group__4 ;
    public final void rule__CollectionFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2489:1: ( rule__CollectionFunction__Group__3__Impl rule__CollectionFunction__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2490:2: rule__CollectionFunction__Group__3__Impl rule__CollectionFunction__Group__4
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__3__Impl_in_rule__CollectionFunction__Group__35128);
            rule__CollectionFunction__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionFunction__Group__4_in_rule__CollectionFunction__Group__35131);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2497:1: rule__CollectionFunction__Group__3__Impl : ( ',' ) ;
    public final void rule__CollectionFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2501:1: ( ( ',' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2502:1: ( ',' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2502:1: ( ',' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2503:1: ','
            {
             before(grammarAccess.getCollectionFunctionAccess().getCommaKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__CollectionFunction__Group__3__Impl5159); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2516:1: rule__CollectionFunction__Group__4 : rule__CollectionFunction__Group__4__Impl rule__CollectionFunction__Group__5 ;
    public final void rule__CollectionFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2520:1: ( rule__CollectionFunction__Group__4__Impl rule__CollectionFunction__Group__5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2521:2: rule__CollectionFunction__Group__4__Impl rule__CollectionFunction__Group__5
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__4__Impl_in_rule__CollectionFunction__Group__45190);
            rule__CollectionFunction__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionFunction__Group__5_in_rule__CollectionFunction__Group__45193);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2528:1: rule__CollectionFunction__Group__4__Impl : ( ( rule__CollectionFunction__DelimiterAssignment_4 ) ) ;
    public final void rule__CollectionFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2532:1: ( ( ( rule__CollectionFunction__DelimiterAssignment_4 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2533:1: ( ( rule__CollectionFunction__DelimiterAssignment_4 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2533:1: ( ( rule__CollectionFunction__DelimiterAssignment_4 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2534:1: ( rule__CollectionFunction__DelimiterAssignment_4 )
            {
             before(grammarAccess.getCollectionFunctionAccess().getDelimiterAssignment_4()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2535:1: ( rule__CollectionFunction__DelimiterAssignment_4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2535:2: rule__CollectionFunction__DelimiterAssignment_4
            {
            pushFollow(FOLLOW_rule__CollectionFunction__DelimiterAssignment_4_in_rule__CollectionFunction__Group__4__Impl5220);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2545:1: rule__CollectionFunction__Group__5 : rule__CollectionFunction__Group__5__Impl ;
    public final void rule__CollectionFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2549:1: ( rule__CollectionFunction__Group__5__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2550:2: rule__CollectionFunction__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CollectionFunction__Group__5__Impl_in_rule__CollectionFunction__Group__55250);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2556:1: rule__CollectionFunction__Group__5__Impl : ( ')' ) ;
    public final void rule__CollectionFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2560:1: ( ( ')' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2561:1: ( ')' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2561:1: ( ')' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2562:1: ')'
            {
             before(grammarAccess.getCollectionFunctionAccess().getRightParenthesisKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__CollectionFunction__Group__5__Impl5278); 
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


    // $ANTLR start rule__TabBarApplication__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2587:1: rule__TabBarApplication__Group__0 : rule__TabBarApplication__Group__0__Impl rule__TabBarApplication__Group__1 ;
    public final void rule__TabBarApplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2591:1: ( rule__TabBarApplication__Group__0__Impl rule__TabBarApplication__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2592:2: rule__TabBarApplication__Group__0__Impl rule__TabBarApplication__Group__1
            {
            pushFollow(FOLLOW_rule__TabBarApplication__Group__0__Impl_in_rule__TabBarApplication__Group__05321);
            rule__TabBarApplication__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabBarApplication__Group__1_in_rule__TabBarApplication__Group__05324);
            rule__TabBarApplication__Group__1();
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
    // $ANTLR end rule__TabBarApplication__Group__0


    // $ANTLR start rule__TabBarApplication__Group__0__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2599:1: rule__TabBarApplication__Group__0__Impl : ( 'tabbarApplication' ) ;
    public final void rule__TabBarApplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2603:1: ( ( 'tabbarApplication' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2604:1: ( 'tabbarApplication' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2604:1: ( 'tabbarApplication' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2605:1: 'tabbarApplication'
            {
             before(grammarAccess.getTabBarApplicationAccess().getTabbarApplicationKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__TabBarApplication__Group__0__Impl5352); 
             after(grammarAccess.getTabBarApplicationAccess().getTabbarApplicationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabBarApplication__Group__0__Impl


    // $ANTLR start rule__TabBarApplication__Group__1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2618:1: rule__TabBarApplication__Group__1 : rule__TabBarApplication__Group__1__Impl rule__TabBarApplication__Group__2 ;
    public final void rule__TabBarApplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2622:1: ( rule__TabBarApplication__Group__1__Impl rule__TabBarApplication__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2623:2: rule__TabBarApplication__Group__1__Impl rule__TabBarApplication__Group__2
            {
            pushFollow(FOLLOW_rule__TabBarApplication__Group__1__Impl_in_rule__TabBarApplication__Group__15383);
            rule__TabBarApplication__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabBarApplication__Group__2_in_rule__TabBarApplication__Group__15386);
            rule__TabBarApplication__Group__2();
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
    // $ANTLR end rule__TabBarApplication__Group__1


    // $ANTLR start rule__TabBarApplication__Group__1__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2630:1: rule__TabBarApplication__Group__1__Impl : ( ( rule__TabBarApplication__NameAssignment_1 ) ) ;
    public final void rule__TabBarApplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2634:1: ( ( ( rule__TabBarApplication__NameAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2635:1: ( ( rule__TabBarApplication__NameAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2635:1: ( ( rule__TabBarApplication__NameAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2636:1: ( rule__TabBarApplication__NameAssignment_1 )
            {
             before(grammarAccess.getTabBarApplicationAccess().getNameAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2637:1: ( rule__TabBarApplication__NameAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2637:2: rule__TabBarApplication__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TabBarApplication__NameAssignment_1_in_rule__TabBarApplication__Group__1__Impl5413);
            rule__TabBarApplication__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTabBarApplicationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabBarApplication__Group__1__Impl


    // $ANTLR start rule__TabBarApplication__Group__2
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2647:1: rule__TabBarApplication__Group__2 : rule__TabBarApplication__Group__2__Impl rule__TabBarApplication__Group__3 ;
    public final void rule__TabBarApplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2651:1: ( rule__TabBarApplication__Group__2__Impl rule__TabBarApplication__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2652:2: rule__TabBarApplication__Group__2__Impl rule__TabBarApplication__Group__3
            {
            pushFollow(FOLLOW_rule__TabBarApplication__Group__2__Impl_in_rule__TabBarApplication__Group__25443);
            rule__TabBarApplication__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabBarApplication__Group__3_in_rule__TabBarApplication__Group__25446);
            rule__TabBarApplication__Group__3();
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
    // $ANTLR end rule__TabBarApplication__Group__2


    // $ANTLR start rule__TabBarApplication__Group__2__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2659:1: rule__TabBarApplication__Group__2__Impl : ( '{' ) ;
    public final void rule__TabBarApplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2663:1: ( ( '{' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2664:1: ( '{' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2664:1: ( '{' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2665:1: '{'
            {
             before(grammarAccess.getTabBarApplicationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__TabBarApplication__Group__2__Impl5474); 
             after(grammarAccess.getTabBarApplicationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabBarApplication__Group__2__Impl


    // $ANTLR start rule__TabBarApplication__Group__3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2678:1: rule__TabBarApplication__Group__3 : rule__TabBarApplication__Group__3__Impl rule__TabBarApplication__Group__4 ;
    public final void rule__TabBarApplication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2682:1: ( rule__TabBarApplication__Group__3__Impl rule__TabBarApplication__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2683:2: rule__TabBarApplication__Group__3__Impl rule__TabBarApplication__Group__4
            {
            pushFollow(FOLLOW_rule__TabBarApplication__Group__3__Impl_in_rule__TabBarApplication__Group__35505);
            rule__TabBarApplication__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabBarApplication__Group__4_in_rule__TabBarApplication__Group__35508);
            rule__TabBarApplication__Group__4();
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
    // $ANTLR end rule__TabBarApplication__Group__3


    // $ANTLR start rule__TabBarApplication__Group__3__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2690:1: rule__TabBarApplication__Group__3__Impl : ( ( rule__TabBarApplication__ButtonsAssignment_3 )* ) ;
    public final void rule__TabBarApplication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2694:1: ( ( ( rule__TabBarApplication__ButtonsAssignment_3 )* ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2695:1: ( ( rule__TabBarApplication__ButtonsAssignment_3 )* )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2695:1: ( ( rule__TabBarApplication__ButtonsAssignment_3 )* )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2696:1: ( rule__TabBarApplication__ButtonsAssignment_3 )*
            {
             before(grammarAccess.getTabBarApplicationAccess().getButtonsAssignment_3()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2697:1: ( rule__TabBarApplication__ButtonsAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2697:2: rule__TabBarApplication__ButtonsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__TabBarApplication__ButtonsAssignment_3_in_rule__TabBarApplication__Group__3__Impl5535);
            	    rule__TabBarApplication__ButtonsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getTabBarApplicationAccess().getButtonsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabBarApplication__Group__3__Impl


    // $ANTLR start rule__TabBarApplication__Group__4
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2707:1: rule__TabBarApplication__Group__4 : rule__TabBarApplication__Group__4__Impl ;
    public final void rule__TabBarApplication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2711:1: ( rule__TabBarApplication__Group__4__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2712:2: rule__TabBarApplication__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TabBarApplication__Group__4__Impl_in_rule__TabBarApplication__Group__45566);
            rule__TabBarApplication__Group__4__Impl();
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
    // $ANTLR end rule__TabBarApplication__Group__4


    // $ANTLR start rule__TabBarApplication__Group__4__Impl
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2718:1: rule__TabBarApplication__Group__4__Impl : ( '}' ) ;
    public final void rule__TabBarApplication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2722:1: ( ( '}' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2723:1: ( '}' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2723:1: ( '}' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2724:1: '}'
            {
             before(grammarAccess.getTabBarApplicationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__TabBarApplication__Group__4__Impl5594); 
             after(grammarAccess.getTabBarApplicationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabBarApplication__Group__4__Impl


    // $ANTLR start rule__TabbarButton__Group__0
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2747:1: rule__TabbarButton__Group__0 : rule__TabbarButton__Group__0__Impl rule__TabbarButton__Group__1 ;
    public final void rule__TabbarButton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2751:1: ( rule__TabbarButton__Group__0__Impl rule__TabbarButton__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2752:2: rule__TabbarButton__Group__0__Impl rule__TabbarButton__Group__1
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__0__Impl_in_rule__TabbarButton__Group__05635);
            rule__TabbarButton__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__1_in_rule__TabbarButton__Group__05638);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2759:1: rule__TabbarButton__Group__0__Impl : ( 'button' ) ;
    public final void rule__TabbarButton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2763:1: ( ( 'button' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2764:1: ( 'button' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2764:1: ( 'button' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2765:1: 'button'
            {
             before(grammarAccess.getTabbarButtonAccess().getButtonKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__TabbarButton__Group__0__Impl5666); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2778:1: rule__TabbarButton__Group__1 : rule__TabbarButton__Group__1__Impl rule__TabbarButton__Group__2 ;
    public final void rule__TabbarButton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2782:1: ( rule__TabbarButton__Group__1__Impl rule__TabbarButton__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2783:2: rule__TabbarButton__Group__1__Impl rule__TabbarButton__Group__2
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__1__Impl_in_rule__TabbarButton__Group__15697);
            rule__TabbarButton__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__2_in_rule__TabbarButton__Group__15700);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2790:1: rule__TabbarButton__Group__1__Impl : ( '{' ) ;
    public final void rule__TabbarButton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2794:1: ( ( '{' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2795:1: ( '{' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2795:1: ( '{' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2796:1: '{'
            {
             before(grammarAccess.getTabbarButtonAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__TabbarButton__Group__1__Impl5728); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2809:1: rule__TabbarButton__Group__2 : rule__TabbarButton__Group__2__Impl rule__TabbarButton__Group__3 ;
    public final void rule__TabbarButton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2813:1: ( rule__TabbarButton__Group__2__Impl rule__TabbarButton__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2814:2: rule__TabbarButton__Group__2__Impl rule__TabbarButton__Group__3
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__2__Impl_in_rule__TabbarButton__Group__25759);
            rule__TabbarButton__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__3_in_rule__TabbarButton__Group__25762);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2821:1: rule__TabbarButton__Group__2__Impl : ( 'title=' ) ;
    public final void rule__TabbarButton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2825:1: ( ( 'title=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2826:1: ( 'title=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2826:1: ( 'title=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2827:1: 'title='
            {
             before(grammarAccess.getTabbarButtonAccess().getTitleKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__TabbarButton__Group__2__Impl5790); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2840:1: rule__TabbarButton__Group__3 : rule__TabbarButton__Group__3__Impl rule__TabbarButton__Group__4 ;
    public final void rule__TabbarButton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2844:1: ( rule__TabbarButton__Group__3__Impl rule__TabbarButton__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2845:2: rule__TabbarButton__Group__3__Impl rule__TabbarButton__Group__4
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__3__Impl_in_rule__TabbarButton__Group__35821);
            rule__TabbarButton__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__4_in_rule__TabbarButton__Group__35824);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2852:1: rule__TabbarButton__Group__3__Impl : ( ( rule__TabbarButton__TitleAssignment_3 ) ) ;
    public final void rule__TabbarButton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2856:1: ( ( ( rule__TabbarButton__TitleAssignment_3 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2857:1: ( ( rule__TabbarButton__TitleAssignment_3 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2857:1: ( ( rule__TabbarButton__TitleAssignment_3 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2858:1: ( rule__TabbarButton__TitleAssignment_3 )
            {
             before(grammarAccess.getTabbarButtonAccess().getTitleAssignment_3()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2859:1: ( rule__TabbarButton__TitleAssignment_3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2859:2: rule__TabbarButton__TitleAssignment_3
            {
            pushFollow(FOLLOW_rule__TabbarButton__TitleAssignment_3_in_rule__TabbarButton__Group__3__Impl5851);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2869:1: rule__TabbarButton__Group__4 : rule__TabbarButton__Group__4__Impl rule__TabbarButton__Group__5 ;
    public final void rule__TabbarButton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2873:1: ( rule__TabbarButton__Group__4__Impl rule__TabbarButton__Group__5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2874:2: rule__TabbarButton__Group__4__Impl rule__TabbarButton__Group__5
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__4__Impl_in_rule__TabbarButton__Group__45881);
            rule__TabbarButton__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__5_in_rule__TabbarButton__Group__45884);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2881:1: rule__TabbarButton__Group__4__Impl : ( 'icon=' ) ;
    public final void rule__TabbarButton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2885:1: ( ( 'icon=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2886:1: ( 'icon=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2886:1: ( 'icon=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2887:1: 'icon='
            {
             before(grammarAccess.getTabbarButtonAccess().getIconKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__TabbarButton__Group__4__Impl5912); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2900:1: rule__TabbarButton__Group__5 : rule__TabbarButton__Group__5__Impl rule__TabbarButton__Group__6 ;
    public final void rule__TabbarButton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2904:1: ( rule__TabbarButton__Group__5__Impl rule__TabbarButton__Group__6 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2905:2: rule__TabbarButton__Group__5__Impl rule__TabbarButton__Group__6
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__5__Impl_in_rule__TabbarButton__Group__55943);
            rule__TabbarButton__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__6_in_rule__TabbarButton__Group__55946);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2912:1: rule__TabbarButton__Group__5__Impl : ( ( rule__TabbarButton__IconAssignment_5 ) ) ;
    public final void rule__TabbarButton__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2916:1: ( ( ( rule__TabbarButton__IconAssignment_5 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2917:1: ( ( rule__TabbarButton__IconAssignment_5 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2917:1: ( ( rule__TabbarButton__IconAssignment_5 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2918:1: ( rule__TabbarButton__IconAssignment_5 )
            {
             before(grammarAccess.getTabbarButtonAccess().getIconAssignment_5()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2919:1: ( rule__TabbarButton__IconAssignment_5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2919:2: rule__TabbarButton__IconAssignment_5
            {
            pushFollow(FOLLOW_rule__TabbarButton__IconAssignment_5_in_rule__TabbarButton__Group__5__Impl5973);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2929:1: rule__TabbarButton__Group__6 : rule__TabbarButton__Group__6__Impl rule__TabbarButton__Group__7 ;
    public final void rule__TabbarButton__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2933:1: ( rule__TabbarButton__Group__6__Impl rule__TabbarButton__Group__7 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2934:2: rule__TabbarButton__Group__6__Impl rule__TabbarButton__Group__7
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__6__Impl_in_rule__TabbarButton__Group__66003);
            rule__TabbarButton__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__7_in_rule__TabbarButton__Group__66006);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2941:1: rule__TabbarButton__Group__6__Impl : ( 'view=' ) ;
    public final void rule__TabbarButton__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2945:1: ( ( 'view=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2946:1: ( 'view=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2946:1: ( 'view=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2947:1: 'view='
            {
             before(grammarAccess.getTabbarButtonAccess().getViewKeyword_6()); 
            match(input,31,FOLLOW_31_in_rule__TabbarButton__Group__6__Impl6034); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2960:1: rule__TabbarButton__Group__7 : rule__TabbarButton__Group__7__Impl rule__TabbarButton__Group__8 ;
    public final void rule__TabbarButton__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2964:1: ( rule__TabbarButton__Group__7__Impl rule__TabbarButton__Group__8 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2965:2: rule__TabbarButton__Group__7__Impl rule__TabbarButton__Group__8
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__7__Impl_in_rule__TabbarButton__Group__76065);
            rule__TabbarButton__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TabbarButton__Group__8_in_rule__TabbarButton__Group__76068);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2972:1: rule__TabbarButton__Group__7__Impl : ( ( rule__TabbarButton__ViewAssignment_7 ) ) ;
    public final void rule__TabbarButton__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2976:1: ( ( ( rule__TabbarButton__ViewAssignment_7 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2977:1: ( ( rule__TabbarButton__ViewAssignment_7 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2977:1: ( ( rule__TabbarButton__ViewAssignment_7 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2978:1: ( rule__TabbarButton__ViewAssignment_7 )
            {
             before(grammarAccess.getTabbarButtonAccess().getViewAssignment_7()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2979:1: ( rule__TabbarButton__ViewAssignment_7 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2979:2: rule__TabbarButton__ViewAssignment_7
            {
            pushFollow(FOLLOW_rule__TabbarButton__ViewAssignment_7_in_rule__TabbarButton__Group__7__Impl6095);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2989:1: rule__TabbarButton__Group__8 : rule__TabbarButton__Group__8__Impl ;
    public final void rule__TabbarButton__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2993:1: ( rule__TabbarButton__Group__8__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:2994:2: rule__TabbarButton__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__TabbarButton__Group__8__Impl_in_rule__TabbarButton__Group__86125);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3000:1: rule__TabbarButton__Group__8__Impl : ( '}' ) ;
    public final void rule__TabbarButton__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3004:1: ( ( '}' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3005:1: ( '}' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3005:1: ( '}' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3006:1: '}'
            {
             before(grammarAccess.getTabbarButtonAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_27_in_rule__TabbarButton__Group__8__Impl6153); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3037:1: rule__SimpleType__Group__0 : rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3041:1: ( rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3042:2: rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0__Impl_in_rule__SimpleType__Group__06202);
            rule__SimpleType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__06205);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3049:1: rule__SimpleType__Group__0__Impl : ( 'type' ) ;
    public final void rule__SimpleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3053:1: ( ( 'type' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3054:1: ( 'type' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3054:1: ( 'type' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3055:1: 'type'
            {
             before(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__SimpleType__Group__0__Impl6233); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3068:1: rule__SimpleType__Group__1 : rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2 ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3072:1: ( rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3073:2: rule__SimpleType__Group__1__Impl rule__SimpleType__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__1__Impl_in_rule__SimpleType__Group__16264);
            rule__SimpleType__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__16267);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3080:1: rule__SimpleType__Group__1__Impl : ( ( rule__SimpleType__NameAssignment_1 ) ) ;
    public final void rule__SimpleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3084:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3085:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3085:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3086:1: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3087:1: ( rule__SimpleType__NameAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3087:2: rule__SimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1__Impl6294);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3097:1: rule__SimpleType__Group__2 : rule__SimpleType__Group__2__Impl rule__SimpleType__Group__3 ;
    public final void rule__SimpleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3101:1: ( rule__SimpleType__Group__2__Impl rule__SimpleType__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3102:2: rule__SimpleType__Group__2__Impl rule__SimpleType__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__2__Impl_in_rule__SimpleType__Group__26324);
            rule__SimpleType__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__3_in_rule__SimpleType__Group__26327);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3109:1: rule__SimpleType__Group__2__Impl : ( 'mapsTo' ) ;
    public final void rule__SimpleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3113:1: ( ( 'mapsTo' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3114:1: ( 'mapsTo' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3114:1: ( 'mapsTo' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3115:1: 'mapsTo'
            {
             before(grammarAccess.getSimpleTypeAccess().getMapsToKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__SimpleType__Group__2__Impl6355); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3128:1: rule__SimpleType__Group__3 : rule__SimpleType__Group__3__Impl ;
    public final void rule__SimpleType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3132:1: ( rule__SimpleType__Group__3__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3133:2: rule__SimpleType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__3__Impl_in_rule__SimpleType__Group__36386);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3139:1: rule__SimpleType__Group__3__Impl : ( ( rule__SimpleType__PlatformTypeAssignment_3 ) ) ;
    public final void rule__SimpleType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3143:1: ( ( ( rule__SimpleType__PlatformTypeAssignment_3 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3144:1: ( ( rule__SimpleType__PlatformTypeAssignment_3 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3144:1: ( ( rule__SimpleType__PlatformTypeAssignment_3 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3145:1: ( rule__SimpleType__PlatformTypeAssignment_3 )
            {
             before(grammarAccess.getSimpleTypeAccess().getPlatformTypeAssignment_3()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3146:1: ( rule__SimpleType__PlatformTypeAssignment_3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3146:2: rule__SimpleType__PlatformTypeAssignment_3
            {
            pushFollow(FOLLOW_rule__SimpleType__PlatformTypeAssignment_3_in_rule__SimpleType__Group__3__Impl6413);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3164:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3168:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3169:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__06451);
            rule__Entity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__06454);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3176:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3180:1: ( ( 'entity' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3181:1: ( 'entity' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3181:1: ( 'entity' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3182:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Entity__Group__0__Impl6482); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3195:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3199:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3200:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__16513);
            rule__Entity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__16516);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3207:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3211:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3212:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3212:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3213:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3214:1: ( rule__Entity__NameAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3214:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl6543);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3224:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3228:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3229:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__26573);
            rule__Entity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__26576);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3236:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3240:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3241:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3241:1: ( ( rule__Entity__Group_2__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3242:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3243:1: ( rule__Entity__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3243:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl6603);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3253:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3257:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3258:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__36634);
            rule__Entity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__36637);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3265:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3269:1: ( ( '{' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3270:1: ( '{' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3270:1: ( '{' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3271:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Entity__Group__3__Impl6665); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3284:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3288:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3289:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__46696);
            rule__Entity__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__46699);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3296:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__PropertiesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3300:1: ( ( ( rule__Entity__PropertiesAssignment_4 )* ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3301:1: ( ( rule__Entity__PropertiesAssignment_4 )* )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3301:1: ( ( rule__Entity__PropertiesAssignment_4 )* )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3302:1: ( rule__Entity__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getPropertiesAssignment_4()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3303:1: ( rule__Entity__PropertiesAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==57) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3303:2: rule__Entity__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__PropertiesAssignment_4_in_rule__Entity__Group__4__Impl6726);
            	    rule__Entity__PropertiesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3313:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3317:1: ( rule__Entity__Group__5__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3318:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__56757);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3324:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3328:1: ( ( '}' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3329:1: ( '}' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3329:1: ( '}' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3330:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_27_in_rule__Entity__Group__5__Impl6785); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3355:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3359:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3360:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__06828);
            rule__Entity__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__06831);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3367:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3371:1: ( ( 'extends' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3372:1: ( 'extends' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3372:1: ( 'extends' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3373:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__Entity__Group_2__0__Impl6859); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3386:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3390:1: ( rule__Entity__Group_2__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3391:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__16890);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3397:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__ExtendsAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3401:1: ( ( ( rule__Entity__ExtendsAssignment_2_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3402:1: ( ( rule__Entity__ExtendsAssignment_2_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3402:1: ( ( rule__Entity__ExtendsAssignment_2_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3403:1: ( rule__Entity__ExtendsAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getExtendsAssignment_2_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3404:1: ( rule__Entity__ExtendsAssignment_2_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3404:2: rule__Entity__ExtendsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__ExtendsAssignment_2_1_in_rule__Entity__Group_2__1__Impl6917);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3418:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3422:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3423:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__06951);
            rule__Property__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__06954);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3430:1: rule__Property__Group__0__Impl : ( ( rule__Property__DerivedAssignment_0 )? ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3434:1: ( ( ( rule__Property__DerivedAssignment_0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3435:1: ( ( rule__Property__DerivedAssignment_0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3435:1: ( ( rule__Property__DerivedAssignment_0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3436:1: ( rule__Property__DerivedAssignment_0 )?
            {
             before(grammarAccess.getPropertyAccess().getDerivedAssignment_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3437:1: ( rule__Property__DerivedAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==57) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3437:2: rule__Property__DerivedAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Property__DerivedAssignment_0_in_rule__Property__Group__0__Impl6981);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3447:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3451:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3452:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__17012);
            rule__Property__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__17015);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3459:1: rule__Property__Group__1__Impl : ( ( rule__Property__DescriptionAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3463:1: ( ( ( rule__Property__DescriptionAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3464:1: ( ( rule__Property__DescriptionAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3464:1: ( ( rule__Property__DescriptionAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3465:1: ( rule__Property__DescriptionAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getDescriptionAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3466:1: ( rule__Property__DescriptionAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3466:2: rule__Property__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__DescriptionAssignment_1_in_rule__Property__Group__1__Impl7042);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3476:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3480:1: ( rule__Property__Group__2__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3481:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__27072);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3487:1: rule__Property__Group__2__Impl : ( ( rule__Property__NameAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3491:1: ( ( ( rule__Property__NameAssignment_2 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3492:1: ( ( rule__Property__NameAssignment_2 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3492:1: ( ( rule__Property__NameAssignment_2 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3493:1: ( rule__Property__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3494:1: ( rule__Property__NameAssignment_2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3494:2: rule__Property__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_2_in_rule__Property__Group__2__Impl7099);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3510:1: rule__ContentProvider__Group__0 : rule__ContentProvider__Group__0__Impl rule__ContentProvider__Group__1 ;
    public final void rule__ContentProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3514:1: ( rule__ContentProvider__Group__0__Impl rule__ContentProvider__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3515:2: rule__ContentProvider__Group__0__Impl rule__ContentProvider__Group__1
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__0__Impl_in_rule__ContentProvider__Group__07135);
            rule__ContentProvider__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__1_in_rule__ContentProvider__Group__07138);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3522:1: rule__ContentProvider__Group__0__Impl : ( 'contentprovider' ) ;
    public final void rule__ContentProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3526:1: ( ( 'contentprovider' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3527:1: ( 'contentprovider' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3527:1: ( 'contentprovider' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3528:1: 'contentprovider'
            {
             before(grammarAccess.getContentProviderAccess().getContentproviderKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__ContentProvider__Group__0__Impl7166); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3541:1: rule__ContentProvider__Group__1 : rule__ContentProvider__Group__1__Impl rule__ContentProvider__Group__2 ;
    public final void rule__ContentProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3545:1: ( rule__ContentProvider__Group__1__Impl rule__ContentProvider__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3546:2: rule__ContentProvider__Group__1__Impl rule__ContentProvider__Group__2
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__1__Impl_in_rule__ContentProvider__Group__17197);
            rule__ContentProvider__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__2_in_rule__ContentProvider__Group__17200);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3553:1: rule__ContentProvider__Group__1__Impl : ( ( rule__ContentProvider__NameAssignment_1 ) ) ;
    public final void rule__ContentProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3557:1: ( ( ( rule__ContentProvider__NameAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3558:1: ( ( rule__ContentProvider__NameAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3558:1: ( ( rule__ContentProvider__NameAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3559:1: ( rule__ContentProvider__NameAssignment_1 )
            {
             before(grammarAccess.getContentProviderAccess().getNameAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3560:1: ( rule__ContentProvider__NameAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3560:2: rule__ContentProvider__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ContentProvider__NameAssignment_1_in_rule__ContentProvider__Group__1__Impl7227);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3570:1: rule__ContentProvider__Group__2 : rule__ContentProvider__Group__2__Impl rule__ContentProvider__Group__3 ;
    public final void rule__ContentProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3574:1: ( rule__ContentProvider__Group__2__Impl rule__ContentProvider__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3575:2: rule__ContentProvider__Group__2__Impl rule__ContentProvider__Group__3
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__2__Impl_in_rule__ContentProvider__Group__27257);
            rule__ContentProvider__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__3_in_rule__ContentProvider__Group__27260);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3582:1: rule__ContentProvider__Group__2__Impl : ( ( rule__ContentProvider__Group_2__0 )? ) ;
    public final void rule__ContentProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3586:1: ( ( ( rule__ContentProvider__Group_2__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3587:1: ( ( rule__ContentProvider__Group_2__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3587:1: ( ( rule__ContentProvider__Group_2__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3588:1: ( rule__ContentProvider__Group_2__0 )?
            {
             before(grammarAccess.getContentProviderAccess().getGroup_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3589:1: ( rule__ContentProvider__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3589:2: rule__ContentProvider__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ContentProvider__Group_2__0_in_rule__ContentProvider__Group__2__Impl7287);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3599:1: rule__ContentProvider__Group__3 : rule__ContentProvider__Group__3__Impl rule__ContentProvider__Group__4 ;
    public final void rule__ContentProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3603:1: ( rule__ContentProvider__Group__3__Impl rule__ContentProvider__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3604:2: rule__ContentProvider__Group__3__Impl rule__ContentProvider__Group__4
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__3__Impl_in_rule__ContentProvider__Group__37318);
            rule__ContentProvider__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__4_in_rule__ContentProvider__Group__37321);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3611:1: rule__ContentProvider__Group__3__Impl : ( 'returns' ) ;
    public final void rule__ContentProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3615:1: ( ( 'returns' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3616:1: ( 'returns' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3616:1: ( 'returns' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3617:1: 'returns'
            {
             before(grammarAccess.getContentProviderAccess().getReturnsKeyword_3()); 
            match(input,37,FOLLOW_37_in_rule__ContentProvider__Group__3__Impl7349); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3630:1: rule__ContentProvider__Group__4 : rule__ContentProvider__Group__4__Impl rule__ContentProvider__Group__5 ;
    public final void rule__ContentProvider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3634:1: ( rule__ContentProvider__Group__4__Impl rule__ContentProvider__Group__5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3635:2: rule__ContentProvider__Group__4__Impl rule__ContentProvider__Group__5
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__4__Impl_in_rule__ContentProvider__Group__47380);
            rule__ContentProvider__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__5_in_rule__ContentProvider__Group__47383);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3642:1: rule__ContentProvider__Group__4__Impl : ( ( rule__ContentProvider__TypeAssignment_4 ) ) ;
    public final void rule__ContentProvider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3646:1: ( ( ( rule__ContentProvider__TypeAssignment_4 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3647:1: ( ( rule__ContentProvider__TypeAssignment_4 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3647:1: ( ( rule__ContentProvider__TypeAssignment_4 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3648:1: ( rule__ContentProvider__TypeAssignment_4 )
            {
             before(grammarAccess.getContentProviderAccess().getTypeAssignment_4()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3649:1: ( rule__ContentProvider__TypeAssignment_4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3649:2: rule__ContentProvider__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__ContentProvider__TypeAssignment_4_in_rule__ContentProvider__Group__4__Impl7410);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3659:1: rule__ContentProvider__Group__5 : rule__ContentProvider__Group__5__Impl rule__ContentProvider__Group__6 ;
    public final void rule__ContentProvider__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3663:1: ( rule__ContentProvider__Group__5__Impl rule__ContentProvider__Group__6 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3664:2: rule__ContentProvider__Group__5__Impl rule__ContentProvider__Group__6
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__5__Impl_in_rule__ContentProvider__Group__57440);
            rule__ContentProvider__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__6_in_rule__ContentProvider__Group__57443);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3671:1: rule__ContentProvider__Group__5__Impl : ( ( rule__ContentProvider__ManyAssignment_5 )? ) ;
    public final void rule__ContentProvider__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3675:1: ( ( ( rule__ContentProvider__ManyAssignment_5 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3676:1: ( ( rule__ContentProvider__ManyAssignment_5 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3676:1: ( ( rule__ContentProvider__ManyAssignment_5 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3677:1: ( rule__ContentProvider__ManyAssignment_5 )?
            {
             before(grammarAccess.getContentProviderAccess().getManyAssignment_5()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3678:1: ( rule__ContentProvider__ManyAssignment_5 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==56) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3678:2: rule__ContentProvider__ManyAssignment_5
                    {
                    pushFollow(FOLLOW_rule__ContentProvider__ManyAssignment_5_in_rule__ContentProvider__Group__5__Impl7470);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3688:1: rule__ContentProvider__Group__6 : rule__ContentProvider__Group__6__Impl rule__ContentProvider__Group__7 ;
    public final void rule__ContentProvider__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3692:1: ( rule__ContentProvider__Group__6__Impl rule__ContentProvider__Group__7 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3693:2: rule__ContentProvider__Group__6__Impl rule__ContentProvider__Group__7
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__6__Impl_in_rule__ContentProvider__Group__67501);
            rule__ContentProvider__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__7_in_rule__ContentProvider__Group__67504);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3700:1: rule__ContentProvider__Group__6__Impl : ( 'fetches' ) ;
    public final void rule__ContentProvider__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3704:1: ( ( 'fetches' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3705:1: ( 'fetches' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3705:1: ( 'fetches' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3706:1: 'fetches'
            {
             before(grammarAccess.getContentProviderAccess().getFetchesKeyword_6()); 
            match(input,38,FOLLOW_38_in_rule__ContentProvider__Group__6__Impl7532); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3719:1: rule__ContentProvider__Group__7 : rule__ContentProvider__Group__7__Impl rule__ContentProvider__Group__8 ;
    public final void rule__ContentProvider__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3723:1: ( rule__ContentProvider__Group__7__Impl rule__ContentProvider__Group__8 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3724:2: rule__ContentProvider__Group__7__Impl rule__ContentProvider__Group__8
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__7__Impl_in_rule__ContentProvider__Group__77563);
            rule__ContentProvider__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__8_in_rule__ContentProvider__Group__77566);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3731:1: rule__ContentProvider__Group__7__Impl : ( 'XML' ) ;
    public final void rule__ContentProvider__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3735:1: ( ( 'XML' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3736:1: ( 'XML' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3736:1: ( 'XML' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3737:1: 'XML'
            {
             before(grammarAccess.getContentProviderAccess().getXMLKeyword_7()); 
            match(input,39,FOLLOW_39_in_rule__ContentProvider__Group__7__Impl7594); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3750:1: rule__ContentProvider__Group__8 : rule__ContentProvider__Group__8__Impl rule__ContentProvider__Group__9 ;
    public final void rule__ContentProvider__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3754:1: ( rule__ContentProvider__Group__8__Impl rule__ContentProvider__Group__9 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3755:2: rule__ContentProvider__Group__8__Impl rule__ContentProvider__Group__9
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__8__Impl_in_rule__ContentProvider__Group__87625);
            rule__ContentProvider__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__9_in_rule__ContentProvider__Group__87628);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3762:1: rule__ContentProvider__Group__8__Impl : ( 'from' ) ;
    public final void rule__ContentProvider__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3766:1: ( ( 'from' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3767:1: ( 'from' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3767:1: ( 'from' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3768:1: 'from'
            {
             before(grammarAccess.getContentProviderAccess().getFromKeyword_8()); 
            match(input,40,FOLLOW_40_in_rule__ContentProvider__Group__8__Impl7656); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3781:1: rule__ContentProvider__Group__9 : rule__ContentProvider__Group__9__Impl rule__ContentProvider__Group__10 ;
    public final void rule__ContentProvider__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3785:1: ( rule__ContentProvider__Group__9__Impl rule__ContentProvider__Group__10 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3786:2: rule__ContentProvider__Group__9__Impl rule__ContentProvider__Group__10
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__9__Impl_in_rule__ContentProvider__Group__97687);
            rule__ContentProvider__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__10_in_rule__ContentProvider__Group__97690);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3793:1: rule__ContentProvider__Group__9__Impl : ( ( rule__ContentProvider__UrlAssignment_9 ) ) ;
    public final void rule__ContentProvider__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3797:1: ( ( ( rule__ContentProvider__UrlAssignment_9 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3798:1: ( ( rule__ContentProvider__UrlAssignment_9 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3798:1: ( ( rule__ContentProvider__UrlAssignment_9 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3799:1: ( rule__ContentProvider__UrlAssignment_9 )
            {
             before(grammarAccess.getContentProviderAccess().getUrlAssignment_9()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3800:1: ( rule__ContentProvider__UrlAssignment_9 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3800:2: rule__ContentProvider__UrlAssignment_9
            {
            pushFollow(FOLLOW_rule__ContentProvider__UrlAssignment_9_in_rule__ContentProvider__Group__9__Impl7717);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3810:1: rule__ContentProvider__Group__10 : rule__ContentProvider__Group__10__Impl rule__ContentProvider__Group__11 ;
    public final void rule__ContentProvider__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3814:1: ( rule__ContentProvider__Group__10__Impl rule__ContentProvider__Group__11 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3815:2: rule__ContentProvider__Group__10__Impl rule__ContentProvider__Group__11
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__10__Impl_in_rule__ContentProvider__Group__107747);
            rule__ContentProvider__Group__10__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group__11_in_rule__ContentProvider__Group__107750);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3822:1: rule__ContentProvider__Group__10__Impl : ( 'selects' ) ;
    public final void rule__ContentProvider__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3826:1: ( ( 'selects' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3827:1: ( 'selects' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3827:1: ( 'selects' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3828:1: 'selects'
            {
             before(grammarAccess.getContentProviderAccess().getSelectsKeyword_10()); 
            match(input,41,FOLLOW_41_in_rule__ContentProvider__Group__10__Impl7778); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3841:1: rule__ContentProvider__Group__11 : rule__ContentProvider__Group__11__Impl ;
    public final void rule__ContentProvider__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3845:1: ( rule__ContentProvider__Group__11__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3846:2: rule__ContentProvider__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group__11__Impl_in_rule__ContentProvider__Group__117809);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3852:1: rule__ContentProvider__Group__11__Impl : ( ( rule__ContentProvider__SelectionAssignment_11 ) ) ;
    public final void rule__ContentProvider__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3856:1: ( ( ( rule__ContentProvider__SelectionAssignment_11 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3857:1: ( ( rule__ContentProvider__SelectionAssignment_11 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3857:1: ( ( rule__ContentProvider__SelectionAssignment_11 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3858:1: ( rule__ContentProvider__SelectionAssignment_11 )
            {
             before(grammarAccess.getContentProviderAccess().getSelectionAssignment_11()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3859:1: ( rule__ContentProvider__SelectionAssignment_11 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3859:2: rule__ContentProvider__SelectionAssignment_11
            {
            pushFollow(FOLLOW_rule__ContentProvider__SelectionAssignment_11_in_rule__ContentProvider__Group__11__Impl7836);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3893:1: rule__ContentProvider__Group_2__0 : rule__ContentProvider__Group_2__0__Impl rule__ContentProvider__Group_2__1 ;
    public final void rule__ContentProvider__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3897:1: ( rule__ContentProvider__Group_2__0__Impl rule__ContentProvider__Group_2__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3898:2: rule__ContentProvider__Group_2__0__Impl rule__ContentProvider__Group_2__1
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group_2__0__Impl_in_rule__ContentProvider__Group_2__07890);
            rule__ContentProvider__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group_2__1_in_rule__ContentProvider__Group_2__07893);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3905:1: rule__ContentProvider__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ContentProvider__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3909:1: ( ( '(' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3910:1: ( '(' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3910:1: ( '(' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3911:1: '('
            {
             before(grammarAccess.getContentProviderAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__ContentProvider__Group_2__0__Impl7921); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3924:1: rule__ContentProvider__Group_2__1 : rule__ContentProvider__Group_2__1__Impl rule__ContentProvider__Group_2__2 ;
    public final void rule__ContentProvider__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3928:1: ( rule__ContentProvider__Group_2__1__Impl rule__ContentProvider__Group_2__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3929:2: rule__ContentProvider__Group_2__1__Impl rule__ContentProvider__Group_2__2
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group_2__1__Impl_in_rule__ContentProvider__Group_2__17952);
            rule__ContentProvider__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ContentProvider__Group_2__2_in_rule__ContentProvider__Group_2__17955);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3936:1: rule__ContentProvider__Group_2__1__Impl : ( ( rule__ContentProvider__ParameterAssignment_2_1 ) ) ;
    public final void rule__ContentProvider__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3940:1: ( ( ( rule__ContentProvider__ParameterAssignment_2_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3941:1: ( ( rule__ContentProvider__ParameterAssignment_2_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3941:1: ( ( rule__ContentProvider__ParameterAssignment_2_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3942:1: ( rule__ContentProvider__ParameterAssignment_2_1 )
            {
             before(grammarAccess.getContentProviderAccess().getParameterAssignment_2_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3943:1: ( rule__ContentProvider__ParameterAssignment_2_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3943:2: rule__ContentProvider__ParameterAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ContentProvider__ParameterAssignment_2_1_in_rule__ContentProvider__Group_2__1__Impl7982);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3953:1: rule__ContentProvider__Group_2__2 : rule__ContentProvider__Group_2__2__Impl ;
    public final void rule__ContentProvider__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3957:1: ( rule__ContentProvider__Group_2__2__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3958:2: rule__ContentProvider__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ContentProvider__Group_2__2__Impl_in_rule__ContentProvider__Group_2__28012);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3964:1: rule__ContentProvider__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ContentProvider__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3968:1: ( ( ')' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3969:1: ( ')' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3969:1: ( ')' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3970:1: ')'
            {
             before(grammarAccess.getContentProviderAccess().getRightParenthesisKeyword_2_2()); 
            match(input,18,FOLLOW_18_in_rule__ContentProvider__Group_2__2__Impl8040); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3989:1: rule__ProviderConstruction__Group_0__0 : rule__ProviderConstruction__Group_0__0__Impl rule__ProviderConstruction__Group_0__1 ;
    public final void rule__ProviderConstruction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3993:1: ( rule__ProviderConstruction__Group_0__0__Impl rule__ProviderConstruction__Group_0__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:3994:2: rule__ProviderConstruction__Group_0__0__Impl rule__ProviderConstruction__Group_0__1
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__0__Impl_in_rule__ProviderConstruction__Group_0__08077);
            rule__ProviderConstruction__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__1_in_rule__ProviderConstruction__Group_0__08080);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4001:1: rule__ProviderConstruction__Group_0__0__Impl : ( () ) ;
    public final void rule__ProviderConstruction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4005:1: ( ( () ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4006:1: ( () )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4006:1: ( () )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4007:1: ()
            {
             before(grammarAccess.getProviderConstructionAccess().getComplexProviderConstructionAction_0_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4008:1: ()
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4010:1: 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4020:1: rule__ProviderConstruction__Group_0__1 : rule__ProviderConstruction__Group_0__1__Impl rule__ProviderConstruction__Group_0__2 ;
    public final void rule__ProviderConstruction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4024:1: ( rule__ProviderConstruction__Group_0__1__Impl rule__ProviderConstruction__Group_0__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4025:2: rule__ProviderConstruction__Group_0__1__Impl rule__ProviderConstruction__Group_0__2
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__1__Impl_in_rule__ProviderConstruction__Group_0__18138);
            rule__ProviderConstruction__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__2_in_rule__ProviderConstruction__Group_0__18141);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4032:1: rule__ProviderConstruction__Group_0__1__Impl : ( ( rule__ProviderConstruction__ProviderAssignment_0_1 ) ) ;
    public final void rule__ProviderConstruction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4036:1: ( ( ( rule__ProviderConstruction__ProviderAssignment_0_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4037:1: ( ( rule__ProviderConstruction__ProviderAssignment_0_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4037:1: ( ( rule__ProviderConstruction__ProviderAssignment_0_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4038:1: ( rule__ProviderConstruction__ProviderAssignment_0_1 )
            {
             before(grammarAccess.getProviderConstructionAccess().getProviderAssignment_0_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4039:1: ( rule__ProviderConstruction__ProviderAssignment_0_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4039:2: rule__ProviderConstruction__ProviderAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__ProviderAssignment_0_1_in_rule__ProviderConstruction__Group_0__1__Impl8168);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4049:1: rule__ProviderConstruction__Group_0__2 : rule__ProviderConstruction__Group_0__2__Impl rule__ProviderConstruction__Group_0__3 ;
    public final void rule__ProviderConstruction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4053:1: ( rule__ProviderConstruction__Group_0__2__Impl rule__ProviderConstruction__Group_0__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4054:2: rule__ProviderConstruction__Group_0__2__Impl rule__ProviderConstruction__Group_0__3
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__2__Impl_in_rule__ProviderConstruction__Group_0__28198);
            rule__ProviderConstruction__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__3_in_rule__ProviderConstruction__Group_0__28201);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4061:1: rule__ProviderConstruction__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ProviderConstruction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4065:1: ( ( '(' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4066:1: ( '(' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4066:1: ( '(' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4067:1: '('
            {
             before(grammarAccess.getProviderConstructionAccess().getLeftParenthesisKeyword_0_2()); 
            match(input,17,FOLLOW_17_in_rule__ProviderConstruction__Group_0__2__Impl8229); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4080:1: rule__ProviderConstruction__Group_0__3 : rule__ProviderConstruction__Group_0__3__Impl rule__ProviderConstruction__Group_0__4 ;
    public final void rule__ProviderConstruction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4084:1: ( rule__ProviderConstruction__Group_0__3__Impl rule__ProviderConstruction__Group_0__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4085:2: rule__ProviderConstruction__Group_0__3__Impl rule__ProviderConstruction__Group_0__4
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__3__Impl_in_rule__ProviderConstruction__Group_0__38260);
            rule__ProviderConstruction__Group_0__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__4_in_rule__ProviderConstruction__Group_0__38263);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4092:1: rule__ProviderConstruction__Group_0__3__Impl : ( ( rule__ProviderConstruction__ArgumentAssignment_0_3 )? ) ;
    public final void rule__ProviderConstruction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4096:1: ( ( ( rule__ProviderConstruction__ArgumentAssignment_0_3 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4097:1: ( ( rule__ProviderConstruction__ArgumentAssignment_0_3 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4097:1: ( ( rule__ProviderConstruction__ArgumentAssignment_0_3 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4098:1: ( rule__ProviderConstruction__ArgumentAssignment_0_3 )?
            {
             before(grammarAccess.getProviderConstructionAccess().getArgumentAssignment_0_3()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4099:1: ( rule__ProviderConstruction__ArgumentAssignment_0_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_STRING)||LA24_0==17||LA24_0==19||(LA24_0>=21 && LA24_0<=22)||LA24_0==24) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4099:2: rule__ProviderConstruction__ArgumentAssignment_0_3
                    {
                    pushFollow(FOLLOW_rule__ProviderConstruction__ArgumentAssignment_0_3_in_rule__ProviderConstruction__Group_0__3__Impl8290);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4109:1: rule__ProviderConstruction__Group_0__4 : rule__ProviderConstruction__Group_0__4__Impl ;
    public final void rule__ProviderConstruction__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4113:1: ( rule__ProviderConstruction__Group_0__4__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4114:2: rule__ProviderConstruction__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_0__4__Impl_in_rule__ProviderConstruction__Group_0__48321);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4120:1: rule__ProviderConstruction__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ProviderConstruction__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4124:1: ( ( ')' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4125:1: ( ')' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4125:1: ( ')' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4126:1: ')'
            {
             before(grammarAccess.getProviderConstructionAccess().getRightParenthesisKeyword_0_4()); 
            match(input,18,FOLLOW_18_in_rule__ProviderConstruction__Group_0__4__Impl8349); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4149:1: rule__ProviderConstruction__Group_1__0 : rule__ProviderConstruction__Group_1__0__Impl rule__ProviderConstruction__Group_1__1 ;
    public final void rule__ProviderConstruction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4153:1: ( rule__ProviderConstruction__Group_1__0__Impl rule__ProviderConstruction__Group_1__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4154:2: rule__ProviderConstruction__Group_1__0__Impl rule__ProviderConstruction__Group_1__1
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_1__0__Impl_in_rule__ProviderConstruction__Group_1__08390);
            rule__ProviderConstruction__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProviderConstruction__Group_1__1_in_rule__ProviderConstruction__Group_1__08393);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4161:1: rule__ProviderConstruction__Group_1__0__Impl : ( () ) ;
    public final void rule__ProviderConstruction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4165:1: ( ( () ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4166:1: ( () )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4166:1: ( () )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4167:1: ()
            {
             before(grammarAccess.getProviderConstructionAccess().getSimpleProviderConstructionAction_1_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4168:1: ()
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4170:1: 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4180:1: rule__ProviderConstruction__Group_1__1 : rule__ProviderConstruction__Group_1__1__Impl ;
    public final void rule__ProviderConstruction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4184:1: ( rule__ProviderConstruction__Group_1__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4185:2: rule__ProviderConstruction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__Group_1__1__Impl_in_rule__ProviderConstruction__Group_1__18451);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4191:1: rule__ProviderConstruction__Group_1__1__Impl : ( ( rule__ProviderConstruction__ExpressionAssignment_1_1 ) ) ;
    public final void rule__ProviderConstruction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4195:1: ( ( ( rule__ProviderConstruction__ExpressionAssignment_1_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4196:1: ( ( rule__ProviderConstruction__ExpressionAssignment_1_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4196:1: ( ( rule__ProviderConstruction__ExpressionAssignment_1_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4197:1: ( rule__ProviderConstruction__ExpressionAssignment_1_1 )
            {
             before(grammarAccess.getProviderConstructionAccess().getExpressionAssignment_1_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4198:1: ( rule__ProviderConstruction__ExpressionAssignment_1_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4198:2: rule__ProviderConstruction__ExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ProviderConstruction__ExpressionAssignment_1_1_in_rule__ProviderConstruction__Group_1__1__Impl8478);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4212:1: rule__TableView__Group__0 : rule__TableView__Group__0__Impl rule__TableView__Group__1 ;
    public final void rule__TableView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4216:1: ( rule__TableView__Group__0__Impl rule__TableView__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4217:2: rule__TableView__Group__0__Impl rule__TableView__Group__1
            {
            pushFollow(FOLLOW_rule__TableView__Group__0__Impl_in_rule__TableView__Group__08512);
            rule__TableView__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__1_in_rule__TableView__Group__08515);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4224:1: rule__TableView__Group__0__Impl : ( 'tableview' ) ;
    public final void rule__TableView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4228:1: ( ( 'tableview' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4229:1: ( 'tableview' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4229:1: ( 'tableview' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4230:1: 'tableview'
            {
             before(grammarAccess.getTableViewAccess().getTableviewKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__TableView__Group__0__Impl8543); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4243:1: rule__TableView__Group__1 : rule__TableView__Group__1__Impl rule__TableView__Group__2 ;
    public final void rule__TableView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4247:1: ( rule__TableView__Group__1__Impl rule__TableView__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4248:2: rule__TableView__Group__1__Impl rule__TableView__Group__2
            {
            pushFollow(FOLLOW_rule__TableView__Group__1__Impl_in_rule__TableView__Group__18574);
            rule__TableView__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__2_in_rule__TableView__Group__18577);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4255:1: rule__TableView__Group__1__Impl : ( ( rule__TableView__NameAssignment_1 ) ) ;
    public final void rule__TableView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4259:1: ( ( ( rule__TableView__NameAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4260:1: ( ( rule__TableView__NameAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4260:1: ( ( rule__TableView__NameAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4261:1: ( rule__TableView__NameAssignment_1 )
            {
             before(grammarAccess.getTableViewAccess().getNameAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4262:1: ( rule__TableView__NameAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4262:2: rule__TableView__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TableView__NameAssignment_1_in_rule__TableView__Group__1__Impl8604);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4272:1: rule__TableView__Group__2 : rule__TableView__Group__2__Impl rule__TableView__Group__3 ;
    public final void rule__TableView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4276:1: ( rule__TableView__Group__2__Impl rule__TableView__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4277:2: rule__TableView__Group__2__Impl rule__TableView__Group__3
            {
            pushFollow(FOLLOW_rule__TableView__Group__2__Impl_in_rule__TableView__Group__28634);
            rule__TableView__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__3_in_rule__TableView__Group__28637);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4284:1: rule__TableView__Group__2__Impl : ( ( rule__TableView__Group_2__0 )? ) ;
    public final void rule__TableView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4288:1: ( ( ( rule__TableView__Group_2__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4289:1: ( ( rule__TableView__Group_2__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4289:1: ( ( rule__TableView__Group_2__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4290:1: ( rule__TableView__Group_2__0 )?
            {
             before(grammarAccess.getTableViewAccess().getGroup_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4291:1: ( rule__TableView__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==17) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4291:2: rule__TableView__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TableView__Group_2__0_in_rule__TableView__Group__2__Impl8664);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4301:1: rule__TableView__Group__3 : rule__TableView__Group__3__Impl rule__TableView__Group__4 ;
    public final void rule__TableView__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4305:1: ( rule__TableView__Group__3__Impl rule__TableView__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4306:2: rule__TableView__Group__3__Impl rule__TableView__Group__4
            {
            pushFollow(FOLLOW_rule__TableView__Group__3__Impl_in_rule__TableView__Group__38695);
            rule__TableView__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__4_in_rule__TableView__Group__38698);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4313:1: rule__TableView__Group__3__Impl : ( '{' ) ;
    public final void rule__TableView__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4317:1: ( ( '{' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4318:1: ( '{' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4318:1: ( '{' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4319:1: '{'
            {
             before(grammarAccess.getTableViewAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__TableView__Group__3__Impl8726); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4332:1: rule__TableView__Group__4 : rule__TableView__Group__4__Impl rule__TableView__Group__5 ;
    public final void rule__TableView__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4336:1: ( rule__TableView__Group__4__Impl rule__TableView__Group__5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4337:2: rule__TableView__Group__4__Impl rule__TableView__Group__5
            {
            pushFollow(FOLLOW_rule__TableView__Group__4__Impl_in_rule__TableView__Group__48757);
            rule__TableView__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__5_in_rule__TableView__Group__48760);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4344:1: rule__TableView__Group__4__Impl : ( 'title=' ) ;
    public final void rule__TableView__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4348:1: ( ( 'title=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4349:1: ( 'title=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4349:1: ( 'title=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4350:1: 'title='
            {
             before(grammarAccess.getTableViewAccess().getTitleKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__TableView__Group__4__Impl8788); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4363:1: rule__TableView__Group__5 : rule__TableView__Group__5__Impl rule__TableView__Group__6 ;
    public final void rule__TableView__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4367:1: ( rule__TableView__Group__5__Impl rule__TableView__Group__6 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4368:2: rule__TableView__Group__5__Impl rule__TableView__Group__6
            {
            pushFollow(FOLLOW_rule__TableView__Group__5__Impl_in_rule__TableView__Group__58819);
            rule__TableView__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__6_in_rule__TableView__Group__58822);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4375:1: rule__TableView__Group__5__Impl : ( ( rule__TableView__TitleAssignment_5 ) ) ;
    public final void rule__TableView__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4379:1: ( ( ( rule__TableView__TitleAssignment_5 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4380:1: ( ( rule__TableView__TitleAssignment_5 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4380:1: ( ( rule__TableView__TitleAssignment_5 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4381:1: ( rule__TableView__TitleAssignment_5 )
            {
             before(grammarAccess.getTableViewAccess().getTitleAssignment_5()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4382:1: ( rule__TableView__TitleAssignment_5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4382:2: rule__TableView__TitleAssignment_5
            {
            pushFollow(FOLLOW_rule__TableView__TitleAssignment_5_in_rule__TableView__Group__5__Impl8849);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4392:1: rule__TableView__Group__6 : rule__TableView__Group__6__Impl rule__TableView__Group__7 ;
    public final void rule__TableView__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4396:1: ( rule__TableView__Group__6__Impl rule__TableView__Group__7 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4397:2: rule__TableView__Group__6__Impl rule__TableView__Group__7
            {
            pushFollow(FOLLOW_rule__TableView__Group__6__Impl_in_rule__TableView__Group__68879);
            rule__TableView__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group__7_in_rule__TableView__Group__68882);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4404:1: rule__TableView__Group__6__Impl : ( ( rule__TableView__SectionsAssignment_6 )* ) ;
    public final void rule__TableView__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4408:1: ( ( ( rule__TableView__SectionsAssignment_6 )* ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4409:1: ( ( rule__TableView__SectionsAssignment_6 )* )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4409:1: ( ( rule__TableView__SectionsAssignment_6 )* )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4410:1: ( rule__TableView__SectionsAssignment_6 )*
            {
             before(grammarAccess.getTableViewAccess().getSectionsAssignment_6()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4411:1: ( rule__TableView__SectionsAssignment_6 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==50) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4411:2: rule__TableView__SectionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__TableView__SectionsAssignment_6_in_rule__TableView__Group__6__Impl8909);
            	    rule__TableView__SectionsAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4421:1: rule__TableView__Group__7 : rule__TableView__Group__7__Impl ;
    public final void rule__TableView__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4425:1: ( rule__TableView__Group__7__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4426:2: rule__TableView__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__TableView__Group__7__Impl_in_rule__TableView__Group__78940);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4432:1: rule__TableView__Group__7__Impl : ( '}' ) ;
    public final void rule__TableView__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4436:1: ( ( '}' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4437:1: ( '}' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4437:1: ( '}' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4438:1: '}'
            {
             before(grammarAccess.getTableViewAccess().getRightCurlyBracketKeyword_7()); 
            match(input,27,FOLLOW_27_in_rule__TableView__Group__7__Impl8968); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4467:1: rule__TableView__Group_2__0 : rule__TableView__Group_2__0__Impl rule__TableView__Group_2__1 ;
    public final void rule__TableView__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4471:1: ( rule__TableView__Group_2__0__Impl rule__TableView__Group_2__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4472:2: rule__TableView__Group_2__0__Impl rule__TableView__Group_2__1
            {
            pushFollow(FOLLOW_rule__TableView__Group_2__0__Impl_in_rule__TableView__Group_2__09015);
            rule__TableView__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group_2__1_in_rule__TableView__Group_2__09018);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4479:1: rule__TableView__Group_2__0__Impl : ( '(' ) ;
    public final void rule__TableView__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4483:1: ( ( '(' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4484:1: ( '(' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4484:1: ( '(' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4485:1: '('
            {
             before(grammarAccess.getTableViewAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__TableView__Group_2__0__Impl9046); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4498:1: rule__TableView__Group_2__1 : rule__TableView__Group_2__1__Impl rule__TableView__Group_2__2 ;
    public final void rule__TableView__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4502:1: ( rule__TableView__Group_2__1__Impl rule__TableView__Group_2__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4503:2: rule__TableView__Group_2__1__Impl rule__TableView__Group_2__2
            {
            pushFollow(FOLLOW_rule__TableView__Group_2__1__Impl_in_rule__TableView__Group_2__19077);
            rule__TableView__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TableView__Group_2__2_in_rule__TableView__Group_2__19080);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4510:1: rule__TableView__Group_2__1__Impl : ( ( rule__TableView__ContentAssignment_2_1 ) ) ;
    public final void rule__TableView__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4514:1: ( ( ( rule__TableView__ContentAssignment_2_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4515:1: ( ( rule__TableView__ContentAssignment_2_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4515:1: ( ( rule__TableView__ContentAssignment_2_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4516:1: ( rule__TableView__ContentAssignment_2_1 )
            {
             before(grammarAccess.getTableViewAccess().getContentAssignment_2_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4517:1: ( rule__TableView__ContentAssignment_2_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4517:2: rule__TableView__ContentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TableView__ContentAssignment_2_1_in_rule__TableView__Group_2__1__Impl9107);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4527:1: rule__TableView__Group_2__2 : rule__TableView__Group_2__2__Impl ;
    public final void rule__TableView__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4531:1: ( rule__TableView__Group_2__2__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4532:2: rule__TableView__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TableView__Group_2__2__Impl_in_rule__TableView__Group_2__29137);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4538:1: rule__TableView__Group_2__2__Impl : ( ')' ) ;
    public final void rule__TableView__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4542:1: ( ( ')' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4543:1: ( ')' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4543:1: ( ')' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4544:1: ')'
            {
             before(grammarAccess.getTableViewAccess().getRightParenthesisKeyword_2_2()); 
            match(input,18,FOLLOW_18_in_rule__TableView__Group_2__2__Impl9165); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4563:1: rule__DetailsView__Group__0 : rule__DetailsView__Group__0__Impl rule__DetailsView__Group__1 ;
    public final void rule__DetailsView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4567:1: ( rule__DetailsView__Group__0__Impl rule__DetailsView__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4568:2: rule__DetailsView__Group__0__Impl rule__DetailsView__Group__1
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__0__Impl_in_rule__DetailsView__Group__09202);
            rule__DetailsView__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__1_in_rule__DetailsView__Group__09205);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4575:1: rule__DetailsView__Group__0__Impl : ( 'detailsview' ) ;
    public final void rule__DetailsView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4579:1: ( ( 'detailsview' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4580:1: ( 'detailsview' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4580:1: ( 'detailsview' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4581:1: 'detailsview'
            {
             before(grammarAccess.getDetailsViewAccess().getDetailsviewKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__DetailsView__Group__0__Impl9233); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4594:1: rule__DetailsView__Group__1 : rule__DetailsView__Group__1__Impl rule__DetailsView__Group__2 ;
    public final void rule__DetailsView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4598:1: ( rule__DetailsView__Group__1__Impl rule__DetailsView__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4599:2: rule__DetailsView__Group__1__Impl rule__DetailsView__Group__2
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__1__Impl_in_rule__DetailsView__Group__19264);
            rule__DetailsView__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__2_in_rule__DetailsView__Group__19267);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4606:1: rule__DetailsView__Group__1__Impl : ( ( rule__DetailsView__NameAssignment_1 ) ) ;
    public final void rule__DetailsView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4610:1: ( ( ( rule__DetailsView__NameAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4611:1: ( ( rule__DetailsView__NameAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4611:1: ( ( rule__DetailsView__NameAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4612:1: ( rule__DetailsView__NameAssignment_1 )
            {
             before(grammarAccess.getDetailsViewAccess().getNameAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4613:1: ( rule__DetailsView__NameAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4613:2: rule__DetailsView__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DetailsView__NameAssignment_1_in_rule__DetailsView__Group__1__Impl9294);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4623:1: rule__DetailsView__Group__2 : rule__DetailsView__Group__2__Impl rule__DetailsView__Group__3 ;
    public final void rule__DetailsView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4627:1: ( rule__DetailsView__Group__2__Impl rule__DetailsView__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4628:2: rule__DetailsView__Group__2__Impl rule__DetailsView__Group__3
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__2__Impl_in_rule__DetailsView__Group__29324);
            rule__DetailsView__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__3_in_rule__DetailsView__Group__29327);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4635:1: rule__DetailsView__Group__2__Impl : ( ( rule__DetailsView__Group_2__0 )? ) ;
    public final void rule__DetailsView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4639:1: ( ( ( rule__DetailsView__Group_2__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4640:1: ( ( rule__DetailsView__Group_2__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4640:1: ( ( rule__DetailsView__Group_2__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4641:1: ( rule__DetailsView__Group_2__0 )?
            {
             before(grammarAccess.getDetailsViewAccess().getGroup_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4642:1: ( rule__DetailsView__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==17) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4642:2: rule__DetailsView__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DetailsView__Group_2__0_in_rule__DetailsView__Group__2__Impl9354);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4652:1: rule__DetailsView__Group__3 : rule__DetailsView__Group__3__Impl rule__DetailsView__Group__4 ;
    public final void rule__DetailsView__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4656:1: ( rule__DetailsView__Group__3__Impl rule__DetailsView__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4657:2: rule__DetailsView__Group__3__Impl rule__DetailsView__Group__4
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__3__Impl_in_rule__DetailsView__Group__39385);
            rule__DetailsView__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__4_in_rule__DetailsView__Group__39388);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4664:1: rule__DetailsView__Group__3__Impl : ( '{' ) ;
    public final void rule__DetailsView__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4668:1: ( ( '{' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4669:1: ( '{' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4669:1: ( '{' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4670:1: '{'
            {
             before(grammarAccess.getDetailsViewAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__DetailsView__Group__3__Impl9416); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4683:1: rule__DetailsView__Group__4 : rule__DetailsView__Group__4__Impl rule__DetailsView__Group__5 ;
    public final void rule__DetailsView__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4687:1: ( rule__DetailsView__Group__4__Impl rule__DetailsView__Group__5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4688:2: rule__DetailsView__Group__4__Impl rule__DetailsView__Group__5
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__4__Impl_in_rule__DetailsView__Group__49447);
            rule__DetailsView__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__5_in_rule__DetailsView__Group__49450);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4695:1: rule__DetailsView__Group__4__Impl : ( 'title=' ) ;
    public final void rule__DetailsView__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4699:1: ( ( 'title=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4700:1: ( 'title=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4700:1: ( 'title=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4701:1: 'title='
            {
             before(grammarAccess.getDetailsViewAccess().getTitleKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__DetailsView__Group__4__Impl9478); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4714:1: rule__DetailsView__Group__5 : rule__DetailsView__Group__5__Impl rule__DetailsView__Group__6 ;
    public final void rule__DetailsView__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4718:1: ( rule__DetailsView__Group__5__Impl rule__DetailsView__Group__6 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4719:2: rule__DetailsView__Group__5__Impl rule__DetailsView__Group__6
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__5__Impl_in_rule__DetailsView__Group__59509);
            rule__DetailsView__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__6_in_rule__DetailsView__Group__59512);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4726:1: rule__DetailsView__Group__5__Impl : ( ( rule__DetailsView__TitleAssignment_5 ) ) ;
    public final void rule__DetailsView__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4730:1: ( ( ( rule__DetailsView__TitleAssignment_5 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4731:1: ( ( rule__DetailsView__TitleAssignment_5 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4731:1: ( ( rule__DetailsView__TitleAssignment_5 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4732:1: ( rule__DetailsView__TitleAssignment_5 )
            {
             before(grammarAccess.getDetailsViewAccess().getTitleAssignment_5()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4733:1: ( rule__DetailsView__TitleAssignment_5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4733:2: rule__DetailsView__TitleAssignment_5
            {
            pushFollow(FOLLOW_rule__DetailsView__TitleAssignment_5_in_rule__DetailsView__Group__5__Impl9539);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4743:1: rule__DetailsView__Group__6 : rule__DetailsView__Group__6__Impl rule__DetailsView__Group__7 ;
    public final void rule__DetailsView__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4747:1: ( rule__DetailsView__Group__6__Impl rule__DetailsView__Group__7 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4748:2: rule__DetailsView__Group__6__Impl rule__DetailsView__Group__7
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__6__Impl_in_rule__DetailsView__Group__69569);
            rule__DetailsView__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__7_in_rule__DetailsView__Group__69572);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4755:1: rule__DetailsView__Group__6__Impl : ( ( rule__DetailsView__HeaderAssignment_6 )? ) ;
    public final void rule__DetailsView__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4759:1: ( ( ( rule__DetailsView__HeaderAssignment_6 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4760:1: ( ( rule__DetailsView__HeaderAssignment_6 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4760:1: ( ( rule__DetailsView__HeaderAssignment_6 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4761:1: ( rule__DetailsView__HeaderAssignment_6 )?
            {
             before(grammarAccess.getDetailsViewAccess().getHeaderAssignment_6()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4762:1: ( rule__DetailsView__HeaderAssignment_6 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4762:2: rule__DetailsView__HeaderAssignment_6
                    {
                    pushFollow(FOLLOW_rule__DetailsView__HeaderAssignment_6_in_rule__DetailsView__Group__6__Impl9599);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4772:1: rule__DetailsView__Group__7 : rule__DetailsView__Group__7__Impl rule__DetailsView__Group__8 ;
    public final void rule__DetailsView__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4776:1: ( rule__DetailsView__Group__7__Impl rule__DetailsView__Group__8 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4777:2: rule__DetailsView__Group__7__Impl rule__DetailsView__Group__8
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__7__Impl_in_rule__DetailsView__Group__79630);
            rule__DetailsView__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group__8_in_rule__DetailsView__Group__79633);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4784:1: rule__DetailsView__Group__7__Impl : ( ( rule__DetailsView__SectionsAssignment_7 )* ) ;
    public final void rule__DetailsView__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4788:1: ( ( ( rule__DetailsView__SectionsAssignment_7 )* ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4789:1: ( ( rule__DetailsView__SectionsAssignment_7 )* )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4789:1: ( ( rule__DetailsView__SectionsAssignment_7 )* )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4790:1: ( rule__DetailsView__SectionsAssignment_7 )*
            {
             before(grammarAccess.getDetailsViewAccess().getSectionsAssignment_7()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4791:1: ( rule__DetailsView__SectionsAssignment_7 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==50) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4791:2: rule__DetailsView__SectionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__DetailsView__SectionsAssignment_7_in_rule__DetailsView__Group__7__Impl9660);
            	    rule__DetailsView__SectionsAssignment_7();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4801:1: rule__DetailsView__Group__8 : rule__DetailsView__Group__8__Impl ;
    public final void rule__DetailsView__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4805:1: ( rule__DetailsView__Group__8__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4806:2: rule__DetailsView__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__DetailsView__Group__8__Impl_in_rule__DetailsView__Group__89691);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4812:1: rule__DetailsView__Group__8__Impl : ( '}' ) ;
    public final void rule__DetailsView__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4816:1: ( ( '}' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4817:1: ( '}' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4817:1: ( '}' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4818:1: '}'
            {
             before(grammarAccess.getDetailsViewAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_27_in_rule__DetailsView__Group__8__Impl9719); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4849:1: rule__DetailsView__Group_2__0 : rule__DetailsView__Group_2__0__Impl rule__DetailsView__Group_2__1 ;
    public final void rule__DetailsView__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4853:1: ( rule__DetailsView__Group_2__0__Impl rule__DetailsView__Group_2__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4854:2: rule__DetailsView__Group_2__0__Impl rule__DetailsView__Group_2__1
            {
            pushFollow(FOLLOW_rule__DetailsView__Group_2__0__Impl_in_rule__DetailsView__Group_2__09768);
            rule__DetailsView__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group_2__1_in_rule__DetailsView__Group_2__09771);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4861:1: rule__DetailsView__Group_2__0__Impl : ( '(' ) ;
    public final void rule__DetailsView__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4865:1: ( ( '(' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4866:1: ( '(' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4866:1: ( '(' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4867:1: '('
            {
             before(grammarAccess.getDetailsViewAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__DetailsView__Group_2__0__Impl9799); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4880:1: rule__DetailsView__Group_2__1 : rule__DetailsView__Group_2__1__Impl rule__DetailsView__Group_2__2 ;
    public final void rule__DetailsView__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4884:1: ( rule__DetailsView__Group_2__1__Impl rule__DetailsView__Group_2__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4885:2: rule__DetailsView__Group_2__1__Impl rule__DetailsView__Group_2__2
            {
            pushFollow(FOLLOW_rule__DetailsView__Group_2__1__Impl_in_rule__DetailsView__Group_2__19830);
            rule__DetailsView__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DetailsView__Group_2__2_in_rule__DetailsView__Group_2__19833);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4892:1: rule__DetailsView__Group_2__1__Impl : ( ( rule__DetailsView__ContentAssignment_2_1 ) ) ;
    public final void rule__DetailsView__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4896:1: ( ( ( rule__DetailsView__ContentAssignment_2_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4897:1: ( ( rule__DetailsView__ContentAssignment_2_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4897:1: ( ( rule__DetailsView__ContentAssignment_2_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4898:1: ( rule__DetailsView__ContentAssignment_2_1 )
            {
             before(grammarAccess.getDetailsViewAccess().getContentAssignment_2_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4899:1: ( rule__DetailsView__ContentAssignment_2_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4899:2: rule__DetailsView__ContentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DetailsView__ContentAssignment_2_1_in_rule__DetailsView__Group_2__1__Impl9860);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4909:1: rule__DetailsView__Group_2__2 : rule__DetailsView__Group_2__2__Impl ;
    public final void rule__DetailsView__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4913:1: ( rule__DetailsView__Group_2__2__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4914:2: rule__DetailsView__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__DetailsView__Group_2__2__Impl_in_rule__DetailsView__Group_2__29890);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4920:1: rule__DetailsView__Group_2__2__Impl : ( ')' ) ;
    public final void rule__DetailsView__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4924:1: ( ( ')' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4925:1: ( ')' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4925:1: ( ')' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4926:1: ')'
            {
             before(grammarAccess.getDetailsViewAccess().getRightParenthesisKeyword_2_2()); 
            match(input,18,FOLLOW_18_in_rule__DetailsView__Group_2__2__Impl9918); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4945:1: rule__CustomView__Group__0 : rule__CustomView__Group__0__Impl rule__CustomView__Group__1 ;
    public final void rule__CustomView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4949:1: ( rule__CustomView__Group__0__Impl rule__CustomView__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4950:2: rule__CustomView__Group__0__Impl rule__CustomView__Group__1
            {
            pushFollow(FOLLOW_rule__CustomView__Group__0__Impl_in_rule__CustomView__Group__09955);
            rule__CustomView__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group__1_in_rule__CustomView__Group__09958);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4957:1: rule__CustomView__Group__0__Impl : ( 'customview' ) ;
    public final void rule__CustomView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4961:1: ( ( 'customview' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4962:1: ( 'customview' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4962:1: ( 'customview' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4963:1: 'customview'
            {
             before(grammarAccess.getCustomViewAccess().getCustomviewKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__CustomView__Group__0__Impl9986); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4976:1: rule__CustomView__Group__1 : rule__CustomView__Group__1__Impl rule__CustomView__Group__2 ;
    public final void rule__CustomView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4980:1: ( rule__CustomView__Group__1__Impl rule__CustomView__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4981:2: rule__CustomView__Group__1__Impl rule__CustomView__Group__2
            {
            pushFollow(FOLLOW_rule__CustomView__Group__1__Impl_in_rule__CustomView__Group__110017);
            rule__CustomView__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group__2_in_rule__CustomView__Group__110020);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4988:1: rule__CustomView__Group__1__Impl : ( ( rule__CustomView__NameAssignment_1 ) ) ;
    public final void rule__CustomView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4992:1: ( ( ( rule__CustomView__NameAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4993:1: ( ( rule__CustomView__NameAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4993:1: ( ( rule__CustomView__NameAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4994:1: ( rule__CustomView__NameAssignment_1 )
            {
             before(grammarAccess.getCustomViewAccess().getNameAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4995:1: ( rule__CustomView__NameAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:4995:2: rule__CustomView__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CustomView__NameAssignment_1_in_rule__CustomView__Group__1__Impl10047);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5005:1: rule__CustomView__Group__2 : rule__CustomView__Group__2__Impl rule__CustomView__Group__3 ;
    public final void rule__CustomView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5009:1: ( rule__CustomView__Group__2__Impl rule__CustomView__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5010:2: rule__CustomView__Group__2__Impl rule__CustomView__Group__3
            {
            pushFollow(FOLLOW_rule__CustomView__Group__2__Impl_in_rule__CustomView__Group__210077);
            rule__CustomView__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group__3_in_rule__CustomView__Group__210080);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5017:1: rule__CustomView__Group__2__Impl : ( ( rule__CustomView__Group_2__0 )? ) ;
    public final void rule__CustomView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5021:1: ( ( ( rule__CustomView__Group_2__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5022:1: ( ( rule__CustomView__Group_2__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5022:1: ( ( rule__CustomView__Group_2__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5023:1: ( rule__CustomView__Group_2__0 )?
            {
             before(grammarAccess.getCustomViewAccess().getGroup_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5024:1: ( rule__CustomView__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==17) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5024:2: rule__CustomView__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CustomView__Group_2__0_in_rule__CustomView__Group__2__Impl10107);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5034:1: rule__CustomView__Group__3 : rule__CustomView__Group__3__Impl rule__CustomView__Group__4 ;
    public final void rule__CustomView__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5038:1: ( rule__CustomView__Group__3__Impl rule__CustomView__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5039:2: rule__CustomView__Group__3__Impl rule__CustomView__Group__4
            {
            pushFollow(FOLLOW_rule__CustomView__Group__3__Impl_in_rule__CustomView__Group__310138);
            rule__CustomView__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group__4_in_rule__CustomView__Group__310141);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5046:1: rule__CustomView__Group__3__Impl : ( 'implementedBy' ) ;
    public final void rule__CustomView__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5050:1: ( ( 'implementedBy' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5051:1: ( 'implementedBy' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5051:1: ( 'implementedBy' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5052:1: 'implementedBy'
            {
             before(grammarAccess.getCustomViewAccess().getImplementedByKeyword_3()); 
            match(input,45,FOLLOW_45_in_rule__CustomView__Group__3__Impl10169); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5065:1: rule__CustomView__Group__4 : rule__CustomView__Group__4__Impl ;
    public final void rule__CustomView__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5069:1: ( rule__CustomView__Group__4__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5070:2: rule__CustomView__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CustomView__Group__4__Impl_in_rule__CustomView__Group__410200);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5076:1: rule__CustomView__Group__4__Impl : ( ( rule__CustomView__ObjclassAssignment_4 ) ) ;
    public final void rule__CustomView__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5080:1: ( ( ( rule__CustomView__ObjclassAssignment_4 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5081:1: ( ( rule__CustomView__ObjclassAssignment_4 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5081:1: ( ( rule__CustomView__ObjclassAssignment_4 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5082:1: ( rule__CustomView__ObjclassAssignment_4 )
            {
             before(grammarAccess.getCustomViewAccess().getObjclassAssignment_4()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5083:1: ( rule__CustomView__ObjclassAssignment_4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5083:2: rule__CustomView__ObjclassAssignment_4
            {
            pushFollow(FOLLOW_rule__CustomView__ObjclassAssignment_4_in_rule__CustomView__Group__4__Impl10227);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5103:1: rule__CustomView__Group_2__0 : rule__CustomView__Group_2__0__Impl rule__CustomView__Group_2__1 ;
    public final void rule__CustomView__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5107:1: ( rule__CustomView__Group_2__0__Impl rule__CustomView__Group_2__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5108:2: rule__CustomView__Group_2__0__Impl rule__CustomView__Group_2__1
            {
            pushFollow(FOLLOW_rule__CustomView__Group_2__0__Impl_in_rule__CustomView__Group_2__010267);
            rule__CustomView__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group_2__1_in_rule__CustomView__Group_2__010270);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5115:1: rule__CustomView__Group_2__0__Impl : ( '(' ) ;
    public final void rule__CustomView__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5119:1: ( ( '(' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5120:1: ( '(' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5120:1: ( '(' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5121:1: '('
            {
             before(grammarAccess.getCustomViewAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__CustomView__Group_2__0__Impl10298); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5134:1: rule__CustomView__Group_2__1 : rule__CustomView__Group_2__1__Impl rule__CustomView__Group_2__2 ;
    public final void rule__CustomView__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5138:1: ( rule__CustomView__Group_2__1__Impl rule__CustomView__Group_2__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5139:2: rule__CustomView__Group_2__1__Impl rule__CustomView__Group_2__2
            {
            pushFollow(FOLLOW_rule__CustomView__Group_2__1__Impl_in_rule__CustomView__Group_2__110329);
            rule__CustomView__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomView__Group_2__2_in_rule__CustomView__Group_2__110332);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5146:1: rule__CustomView__Group_2__1__Impl : ( ( rule__CustomView__ContentAssignment_2_1 ) ) ;
    public final void rule__CustomView__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5150:1: ( ( ( rule__CustomView__ContentAssignment_2_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5151:1: ( ( rule__CustomView__ContentAssignment_2_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5151:1: ( ( rule__CustomView__ContentAssignment_2_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5152:1: ( rule__CustomView__ContentAssignment_2_1 )
            {
             before(grammarAccess.getCustomViewAccess().getContentAssignment_2_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5153:1: ( rule__CustomView__ContentAssignment_2_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5153:2: rule__CustomView__ContentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__CustomView__ContentAssignment_2_1_in_rule__CustomView__Group_2__1__Impl10359);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5163:1: rule__CustomView__Group_2__2 : rule__CustomView__Group_2__2__Impl ;
    public final void rule__CustomView__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5167:1: ( rule__CustomView__Group_2__2__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5168:2: rule__CustomView__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__CustomView__Group_2__2__Impl_in_rule__CustomView__Group_2__210389);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5174:1: rule__CustomView__Group_2__2__Impl : ( ')' ) ;
    public final void rule__CustomView__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5178:1: ( ( ')' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5179:1: ( ')' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5179:1: ( ')' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5180:1: ')'
            {
             before(grammarAccess.getCustomViewAccess().getRightParenthesisKeyword_2_2()); 
            match(input,18,FOLLOW_18_in_rule__CustomView__Group_2__2__Impl10417); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5199:1: rule__ViewHeader__Group__0 : rule__ViewHeader__Group__0__Impl rule__ViewHeader__Group__1 ;
    public final void rule__ViewHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5203:1: ( rule__ViewHeader__Group__0__Impl rule__ViewHeader__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5204:2: rule__ViewHeader__Group__0__Impl rule__ViewHeader__Group__1
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__0__Impl_in_rule__ViewHeader__Group__010454);
            rule__ViewHeader__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__1_in_rule__ViewHeader__Group__010457);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5211:1: rule__ViewHeader__Group__0__Impl : ( () ) ;
    public final void rule__ViewHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5215:1: ( ( () ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5216:1: ( () )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5216:1: ( () )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5217:1: ()
            {
             before(grammarAccess.getViewHeaderAccess().getViewHeaderAction_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5218:1: ()
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5220:1: 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5230:1: rule__ViewHeader__Group__1 : rule__ViewHeader__Group__1__Impl rule__ViewHeader__Group__2 ;
    public final void rule__ViewHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5234:1: ( rule__ViewHeader__Group__1__Impl rule__ViewHeader__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5235:2: rule__ViewHeader__Group__1__Impl rule__ViewHeader__Group__2
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__1__Impl_in_rule__ViewHeader__Group__110515);
            rule__ViewHeader__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__2_in_rule__ViewHeader__Group__110518);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5242:1: rule__ViewHeader__Group__1__Impl : ( 'header' ) ;
    public final void rule__ViewHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5246:1: ( ( 'header' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5247:1: ( 'header' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5247:1: ( 'header' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5248:1: 'header'
            {
             before(grammarAccess.getViewHeaderAccess().getHeaderKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__ViewHeader__Group__1__Impl10546); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5261:1: rule__ViewHeader__Group__2 : rule__ViewHeader__Group__2__Impl rule__ViewHeader__Group__3 ;
    public final void rule__ViewHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5265:1: ( rule__ViewHeader__Group__2__Impl rule__ViewHeader__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5266:2: rule__ViewHeader__Group__2__Impl rule__ViewHeader__Group__3
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__2__Impl_in_rule__ViewHeader__Group__210577);
            rule__ViewHeader__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__3_in_rule__ViewHeader__Group__210580);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5273:1: rule__ViewHeader__Group__2__Impl : ( '{' ) ;
    public final void rule__ViewHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5277:1: ( ( '{' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5278:1: ( '{' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5278:1: ( '{' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5279:1: '{'
            {
             before(grammarAccess.getViewHeaderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__ViewHeader__Group__2__Impl10608); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5292:1: rule__ViewHeader__Group__3 : rule__ViewHeader__Group__3__Impl rule__ViewHeader__Group__4 ;
    public final void rule__ViewHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5296:1: ( rule__ViewHeader__Group__3__Impl rule__ViewHeader__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5297:2: rule__ViewHeader__Group__3__Impl rule__ViewHeader__Group__4
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__3__Impl_in_rule__ViewHeader__Group__310639);
            rule__ViewHeader__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__4_in_rule__ViewHeader__Group__310642);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5304:1: rule__ViewHeader__Group__3__Impl : ( ( rule__ViewHeader__Group_3__0 )? ) ;
    public final void rule__ViewHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5308:1: ( ( ( rule__ViewHeader__Group_3__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5309:1: ( ( rule__ViewHeader__Group_3__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5309:1: ( ( rule__ViewHeader__Group_3__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5310:1: ( rule__ViewHeader__Group_3__0 )?
            {
             before(grammarAccess.getViewHeaderAccess().getGroup_3()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5311:1: ( rule__ViewHeader__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==29) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5311:2: rule__ViewHeader__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ViewHeader__Group_3__0_in_rule__ViewHeader__Group__3__Impl10669);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5321:1: rule__ViewHeader__Group__4 : rule__ViewHeader__Group__4__Impl rule__ViewHeader__Group__5 ;
    public final void rule__ViewHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5325:1: ( rule__ViewHeader__Group__4__Impl rule__ViewHeader__Group__5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5326:2: rule__ViewHeader__Group__4__Impl rule__ViewHeader__Group__5
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__4__Impl_in_rule__ViewHeader__Group__410700);
            rule__ViewHeader__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__5_in_rule__ViewHeader__Group__410703);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5333:1: rule__ViewHeader__Group__4__Impl : ( ( rule__ViewHeader__Group_4__0 )? ) ;
    public final void rule__ViewHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5337:1: ( ( ( rule__ViewHeader__Group_4__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5338:1: ( ( rule__ViewHeader__Group_4__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5338:1: ( ( rule__ViewHeader__Group_4__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5339:1: ( rule__ViewHeader__Group_4__0 )?
            {
             before(grammarAccess.getViewHeaderAccess().getGroup_4()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5340:1: ( rule__ViewHeader__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5340:2: rule__ViewHeader__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ViewHeader__Group_4__0_in_rule__ViewHeader__Group__4__Impl10730);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5350:1: rule__ViewHeader__Group__5 : rule__ViewHeader__Group__5__Impl rule__ViewHeader__Group__6 ;
    public final void rule__ViewHeader__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5354:1: ( rule__ViewHeader__Group__5__Impl rule__ViewHeader__Group__6 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5355:2: rule__ViewHeader__Group__5__Impl rule__ViewHeader__Group__6
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__5__Impl_in_rule__ViewHeader__Group__510761);
            rule__ViewHeader__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__6_in_rule__ViewHeader__Group__510764);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5362:1: rule__ViewHeader__Group__5__Impl : ( ( rule__ViewHeader__Group_5__0 )? ) ;
    public final void rule__ViewHeader__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5366:1: ( ( ( rule__ViewHeader__Group_5__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5367:1: ( ( rule__ViewHeader__Group_5__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5367:1: ( ( rule__ViewHeader__Group_5__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5368:1: ( rule__ViewHeader__Group_5__0 )?
            {
             before(grammarAccess.getViewHeaderAccess().getGroup_5()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5369:1: ( rule__ViewHeader__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5369:2: rule__ViewHeader__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ViewHeader__Group_5__0_in_rule__ViewHeader__Group__5__Impl10791);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5379:1: rule__ViewHeader__Group__6 : rule__ViewHeader__Group__6__Impl rule__ViewHeader__Group__7 ;
    public final void rule__ViewHeader__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5383:1: ( rule__ViewHeader__Group__6__Impl rule__ViewHeader__Group__7 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5384:2: rule__ViewHeader__Group__6__Impl rule__ViewHeader__Group__7
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__6__Impl_in_rule__ViewHeader__Group__610822);
            rule__ViewHeader__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group__7_in_rule__ViewHeader__Group__610825);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5391:1: rule__ViewHeader__Group__6__Impl : ( ( rule__ViewHeader__Group_6__0 )? ) ;
    public final void rule__ViewHeader__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5395:1: ( ( ( rule__ViewHeader__Group_6__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5396:1: ( ( rule__ViewHeader__Group_6__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5396:1: ( ( rule__ViewHeader__Group_6__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5397:1: ( rule__ViewHeader__Group_6__0 )?
            {
             before(grammarAccess.getViewHeaderAccess().getGroup_6()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5398:1: ( rule__ViewHeader__Group_6__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==49) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5398:2: rule__ViewHeader__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__ViewHeader__Group_6__0_in_rule__ViewHeader__Group__6__Impl10852);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5408:1: rule__ViewHeader__Group__7 : rule__ViewHeader__Group__7__Impl ;
    public final void rule__ViewHeader__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5412:1: ( rule__ViewHeader__Group__7__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5413:2: rule__ViewHeader__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group__7__Impl_in_rule__ViewHeader__Group__710883);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5419:1: rule__ViewHeader__Group__7__Impl : ( '}' ) ;
    public final void rule__ViewHeader__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5423:1: ( ( '}' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5424:1: ( '}' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5424:1: ( '}' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5425:1: '}'
            {
             before(grammarAccess.getViewHeaderAccess().getRightCurlyBracketKeyword_7()); 
            match(input,27,FOLLOW_27_in_rule__ViewHeader__Group__7__Impl10911); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5454:1: rule__ViewHeader__Group_3__0 : rule__ViewHeader__Group_3__0__Impl rule__ViewHeader__Group_3__1 ;
    public final void rule__ViewHeader__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5458:1: ( rule__ViewHeader__Group_3__0__Impl rule__ViewHeader__Group_3__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5459:2: rule__ViewHeader__Group_3__0__Impl rule__ViewHeader__Group_3__1
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_3__0__Impl_in_rule__ViewHeader__Group_3__010958);
            rule__ViewHeader__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group_3__1_in_rule__ViewHeader__Group_3__010961);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5466:1: rule__ViewHeader__Group_3__0__Impl : ( 'title=' ) ;
    public final void rule__ViewHeader__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5470:1: ( ( 'title=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5471:1: ( 'title=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5471:1: ( 'title=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5472:1: 'title='
            {
             before(grammarAccess.getViewHeaderAccess().getTitleKeyword_3_0()); 
            match(input,29,FOLLOW_29_in_rule__ViewHeader__Group_3__0__Impl10989); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5485:1: rule__ViewHeader__Group_3__1 : rule__ViewHeader__Group_3__1__Impl ;
    public final void rule__ViewHeader__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5489:1: ( rule__ViewHeader__Group_3__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5490:2: rule__ViewHeader__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_3__1__Impl_in_rule__ViewHeader__Group_3__111020);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5496:1: rule__ViewHeader__Group_3__1__Impl : ( ( rule__ViewHeader__TitleAssignment_3_1 ) ) ;
    public final void rule__ViewHeader__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5500:1: ( ( ( rule__ViewHeader__TitleAssignment_3_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5501:1: ( ( rule__ViewHeader__TitleAssignment_3_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5501:1: ( ( rule__ViewHeader__TitleAssignment_3_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5502:1: ( rule__ViewHeader__TitleAssignment_3_1 )
            {
             before(grammarAccess.getViewHeaderAccess().getTitleAssignment_3_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5503:1: ( rule__ViewHeader__TitleAssignment_3_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5503:2: rule__ViewHeader__TitleAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ViewHeader__TitleAssignment_3_1_in_rule__ViewHeader__Group_3__1__Impl11047);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5517:1: rule__ViewHeader__Group_4__0 : rule__ViewHeader__Group_4__0__Impl rule__ViewHeader__Group_4__1 ;
    public final void rule__ViewHeader__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5521:1: ( rule__ViewHeader__Group_4__0__Impl rule__ViewHeader__Group_4__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5522:2: rule__ViewHeader__Group_4__0__Impl rule__ViewHeader__Group_4__1
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_4__0__Impl_in_rule__ViewHeader__Group_4__011081);
            rule__ViewHeader__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group_4__1_in_rule__ViewHeader__Group_4__011084);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5529:1: rule__ViewHeader__Group_4__0__Impl : ( 'subtitle=' ) ;
    public final void rule__ViewHeader__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5533:1: ( ( 'subtitle=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5534:1: ( 'subtitle=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5534:1: ( 'subtitle=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5535:1: 'subtitle='
            {
             before(grammarAccess.getViewHeaderAccess().getSubtitleKeyword_4_0()); 
            match(input,47,FOLLOW_47_in_rule__ViewHeader__Group_4__0__Impl11112); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5548:1: rule__ViewHeader__Group_4__1 : rule__ViewHeader__Group_4__1__Impl ;
    public final void rule__ViewHeader__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5552:1: ( rule__ViewHeader__Group_4__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5553:2: rule__ViewHeader__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_4__1__Impl_in_rule__ViewHeader__Group_4__111143);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5559:1: rule__ViewHeader__Group_4__1__Impl : ( ( rule__ViewHeader__SubtitleAssignment_4_1 ) ) ;
    public final void rule__ViewHeader__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5563:1: ( ( ( rule__ViewHeader__SubtitleAssignment_4_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5564:1: ( ( rule__ViewHeader__SubtitleAssignment_4_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5564:1: ( ( rule__ViewHeader__SubtitleAssignment_4_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5565:1: ( rule__ViewHeader__SubtitleAssignment_4_1 )
            {
             before(grammarAccess.getViewHeaderAccess().getSubtitleAssignment_4_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5566:1: ( rule__ViewHeader__SubtitleAssignment_4_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5566:2: rule__ViewHeader__SubtitleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ViewHeader__SubtitleAssignment_4_1_in_rule__ViewHeader__Group_4__1__Impl11170);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5580:1: rule__ViewHeader__Group_5__0 : rule__ViewHeader__Group_5__0__Impl rule__ViewHeader__Group_5__1 ;
    public final void rule__ViewHeader__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5584:1: ( rule__ViewHeader__Group_5__0__Impl rule__ViewHeader__Group_5__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5585:2: rule__ViewHeader__Group_5__0__Impl rule__ViewHeader__Group_5__1
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_5__0__Impl_in_rule__ViewHeader__Group_5__011204);
            rule__ViewHeader__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group_5__1_in_rule__ViewHeader__Group_5__011207);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5592:1: rule__ViewHeader__Group_5__0__Impl : ( 'details=' ) ;
    public final void rule__ViewHeader__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5596:1: ( ( 'details=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5597:1: ( 'details=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5597:1: ( 'details=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5598:1: 'details='
            {
             before(grammarAccess.getViewHeaderAccess().getDetailsKeyword_5_0()); 
            match(input,48,FOLLOW_48_in_rule__ViewHeader__Group_5__0__Impl11235); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5611:1: rule__ViewHeader__Group_5__1 : rule__ViewHeader__Group_5__1__Impl ;
    public final void rule__ViewHeader__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5615:1: ( rule__ViewHeader__Group_5__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5616:2: rule__ViewHeader__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_5__1__Impl_in_rule__ViewHeader__Group_5__111266);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5622:1: rule__ViewHeader__Group_5__1__Impl : ( ( rule__ViewHeader__DetailsAssignment_5_1 ) ) ;
    public final void rule__ViewHeader__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5626:1: ( ( ( rule__ViewHeader__DetailsAssignment_5_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5627:1: ( ( rule__ViewHeader__DetailsAssignment_5_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5627:1: ( ( rule__ViewHeader__DetailsAssignment_5_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5628:1: ( rule__ViewHeader__DetailsAssignment_5_1 )
            {
             before(grammarAccess.getViewHeaderAccess().getDetailsAssignment_5_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5629:1: ( rule__ViewHeader__DetailsAssignment_5_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5629:2: rule__ViewHeader__DetailsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ViewHeader__DetailsAssignment_5_1_in_rule__ViewHeader__Group_5__1__Impl11293);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5643:1: rule__ViewHeader__Group_6__0 : rule__ViewHeader__Group_6__0__Impl rule__ViewHeader__Group_6__1 ;
    public final void rule__ViewHeader__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5647:1: ( rule__ViewHeader__Group_6__0__Impl rule__ViewHeader__Group_6__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5648:2: rule__ViewHeader__Group_6__0__Impl rule__ViewHeader__Group_6__1
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_6__0__Impl_in_rule__ViewHeader__Group_6__011327);
            rule__ViewHeader__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewHeader__Group_6__1_in_rule__ViewHeader__Group_6__011330);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5655:1: rule__ViewHeader__Group_6__0__Impl : ( 'image=' ) ;
    public final void rule__ViewHeader__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5659:1: ( ( 'image=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5660:1: ( 'image=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5660:1: ( 'image=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5661:1: 'image='
            {
             before(grammarAccess.getViewHeaderAccess().getImageKeyword_6_0()); 
            match(input,49,FOLLOW_49_in_rule__ViewHeader__Group_6__0__Impl11358); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5674:1: rule__ViewHeader__Group_6__1 : rule__ViewHeader__Group_6__1__Impl ;
    public final void rule__ViewHeader__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5678:1: ( rule__ViewHeader__Group_6__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5679:2: rule__ViewHeader__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewHeader__Group_6__1__Impl_in_rule__ViewHeader__Group_6__111389);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5685:1: rule__ViewHeader__Group_6__1__Impl : ( ( rule__ViewHeader__ImageAssignment_6_1 ) ) ;
    public final void rule__ViewHeader__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5689:1: ( ( ( rule__ViewHeader__ImageAssignment_6_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5690:1: ( ( rule__ViewHeader__ImageAssignment_6_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5690:1: ( ( rule__ViewHeader__ImageAssignment_6_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5691:1: ( rule__ViewHeader__ImageAssignment_6_1 )
            {
             before(grammarAccess.getViewHeaderAccess().getImageAssignment_6_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5692:1: ( rule__ViewHeader__ImageAssignment_6_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5692:2: rule__ViewHeader__ImageAssignment_6_1
            {
            pushFollow(FOLLOW_rule__ViewHeader__ImageAssignment_6_1_in_rule__ViewHeader__Group_6__1__Impl11416);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5706:1: rule__ViewSection__Group__0 : rule__ViewSection__Group__0__Impl rule__ViewSection__Group__1 ;
    public final void rule__ViewSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5710:1: ( rule__ViewSection__Group__0__Impl rule__ViewSection__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5711:2: rule__ViewSection__Group__0__Impl rule__ViewSection__Group__1
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__0__Impl_in_rule__ViewSection__Group__011450);
            rule__ViewSection__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewSection__Group__1_in_rule__ViewSection__Group__011453);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5718:1: rule__ViewSection__Group__0__Impl : ( 'section' ) ;
    public final void rule__ViewSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5722:1: ( ( 'section' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5723:1: ( 'section' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5723:1: ( 'section' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5724:1: 'section'
            {
             before(grammarAccess.getViewSectionAccess().getSectionKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__ViewSection__Group__0__Impl11481); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5737:1: rule__ViewSection__Group__1 : rule__ViewSection__Group__1__Impl rule__ViewSection__Group__2 ;
    public final void rule__ViewSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5741:1: ( rule__ViewSection__Group__1__Impl rule__ViewSection__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5742:2: rule__ViewSection__Group__1__Impl rule__ViewSection__Group__2
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__1__Impl_in_rule__ViewSection__Group__111512);
            rule__ViewSection__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewSection__Group__2_in_rule__ViewSection__Group__111515);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5749:1: rule__ViewSection__Group__1__Impl : ( '{' ) ;
    public final void rule__ViewSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5753:1: ( ( '{' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5754:1: ( '{' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5754:1: ( '{' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5755:1: '{'
            {
             before(grammarAccess.getViewSectionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__ViewSection__Group__1__Impl11543); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5768:1: rule__ViewSection__Group__2 : rule__ViewSection__Group__2__Impl rule__ViewSection__Group__3 ;
    public final void rule__ViewSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5772:1: ( rule__ViewSection__Group__2__Impl rule__ViewSection__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5773:2: rule__ViewSection__Group__2__Impl rule__ViewSection__Group__3
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__2__Impl_in_rule__ViewSection__Group__211574);
            rule__ViewSection__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewSection__Group__3_in_rule__ViewSection__Group__211577);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5780:1: rule__ViewSection__Group__2__Impl : ( ( rule__ViewSection__Group_2__0 )? ) ;
    public final void rule__ViewSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5784:1: ( ( ( rule__ViewSection__Group_2__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5785:1: ( ( rule__ViewSection__Group_2__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5785:1: ( ( rule__ViewSection__Group_2__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5786:1: ( rule__ViewSection__Group_2__0 )?
            {
             before(grammarAccess.getViewSectionAccess().getGroup_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5787:1: ( rule__ViewSection__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5787:2: rule__ViewSection__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ViewSection__Group_2__0_in_rule__ViewSection__Group__2__Impl11604);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5797:1: rule__ViewSection__Group__3 : rule__ViewSection__Group__3__Impl rule__ViewSection__Group__4 ;
    public final void rule__ViewSection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5801:1: ( rule__ViewSection__Group__3__Impl rule__ViewSection__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5802:2: rule__ViewSection__Group__3__Impl rule__ViewSection__Group__4
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__3__Impl_in_rule__ViewSection__Group__311635);
            rule__ViewSection__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewSection__Group__4_in_rule__ViewSection__Group__311638);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5809:1: rule__ViewSection__Group__3__Impl : ( ( ( rule__ViewSection__CellsAssignment_3 ) ) ( ( rule__ViewSection__CellsAssignment_3 )* ) ) ;
    public final void rule__ViewSection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5813:1: ( ( ( ( rule__ViewSection__CellsAssignment_3 ) ) ( ( rule__ViewSection__CellsAssignment_3 )* ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5814:1: ( ( ( rule__ViewSection__CellsAssignment_3 ) ) ( ( rule__ViewSection__CellsAssignment_3 )* ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5814:1: ( ( ( rule__ViewSection__CellsAssignment_3 ) ) ( ( rule__ViewSection__CellsAssignment_3 )* ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5815:1: ( ( rule__ViewSection__CellsAssignment_3 ) ) ( ( rule__ViewSection__CellsAssignment_3 )* )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5815:1: ( ( rule__ViewSection__CellsAssignment_3 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5816:1: ( rule__ViewSection__CellsAssignment_3 )
            {
             before(grammarAccess.getViewSectionAccess().getCellsAssignment_3()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5817:1: ( rule__ViewSection__CellsAssignment_3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5817:2: rule__ViewSection__CellsAssignment_3
            {
            pushFollow(FOLLOW_rule__ViewSection__CellsAssignment_3_in_rule__ViewSection__Group__3__Impl11667);
            rule__ViewSection__CellsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getViewSectionAccess().getCellsAssignment_3()); 

            }

            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5820:1: ( ( rule__ViewSection__CellsAssignment_3 )* )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5821:1: ( rule__ViewSection__CellsAssignment_3 )*
            {
             before(grammarAccess.getViewSectionAccess().getCellsAssignment_3()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5822:1: ( rule__ViewSection__CellsAssignment_3 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==51) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5822:2: rule__ViewSection__CellsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ViewSection__CellsAssignment_3_in_rule__ViewSection__Group__3__Impl11679);
            	    rule__ViewSection__CellsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5833:1: rule__ViewSection__Group__4 : rule__ViewSection__Group__4__Impl ;
    public final void rule__ViewSection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5837:1: ( rule__ViewSection__Group__4__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5838:2: rule__ViewSection__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ViewSection__Group__4__Impl_in_rule__ViewSection__Group__411712);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5844:1: rule__ViewSection__Group__4__Impl : ( '}' ) ;
    public final void rule__ViewSection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5848:1: ( ( '}' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5849:1: ( '}' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5849:1: ( '}' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5850:1: '}'
            {
             before(grammarAccess.getViewSectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__ViewSection__Group__4__Impl11740); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5873:1: rule__ViewSection__Group_2__0 : rule__ViewSection__Group_2__0__Impl rule__ViewSection__Group_2__1 ;
    public final void rule__ViewSection__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5877:1: ( rule__ViewSection__Group_2__0__Impl rule__ViewSection__Group_2__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5878:2: rule__ViewSection__Group_2__0__Impl rule__ViewSection__Group_2__1
            {
            pushFollow(FOLLOW_rule__ViewSection__Group_2__0__Impl_in_rule__ViewSection__Group_2__011781);
            rule__ViewSection__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewSection__Group_2__1_in_rule__ViewSection__Group_2__011784);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5885:1: rule__ViewSection__Group_2__0__Impl : ( 'title=' ) ;
    public final void rule__ViewSection__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5889:1: ( ( 'title=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5890:1: ( 'title=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5890:1: ( 'title=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5891:1: 'title='
            {
             before(grammarAccess.getViewSectionAccess().getTitleKeyword_2_0()); 
            match(input,29,FOLLOW_29_in_rule__ViewSection__Group_2__0__Impl11812); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5904:1: rule__ViewSection__Group_2__1 : rule__ViewSection__Group_2__1__Impl ;
    public final void rule__ViewSection__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5908:1: ( rule__ViewSection__Group_2__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5909:2: rule__ViewSection__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewSection__Group_2__1__Impl_in_rule__ViewSection__Group_2__111843);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5915:1: rule__ViewSection__Group_2__1__Impl : ( ( rule__ViewSection__TitleAssignment_2_1 ) ) ;
    public final void rule__ViewSection__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5919:1: ( ( ( rule__ViewSection__TitleAssignment_2_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5920:1: ( ( rule__ViewSection__TitleAssignment_2_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5920:1: ( ( rule__ViewSection__TitleAssignment_2_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5921:1: ( rule__ViewSection__TitleAssignment_2_1 )
            {
             before(grammarAccess.getViewSectionAccess().getTitleAssignment_2_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5922:1: ( rule__ViewSection__TitleAssignment_2_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5922:2: rule__ViewSection__TitleAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ViewSection__TitleAssignment_2_1_in_rule__ViewSection__Group_2__1__Impl11870);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5936:1: rule__SectionCell__Group__0 : rule__SectionCell__Group__0__Impl rule__SectionCell__Group__1 ;
    public final void rule__SectionCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5940:1: ( rule__SectionCell__Group__0__Impl rule__SectionCell__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5941:2: rule__SectionCell__Group__0__Impl rule__SectionCell__Group__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__0__Impl_in_rule__SectionCell__Group__011904);
            rule__SectionCell__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__1_in_rule__SectionCell__Group__011907);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5948:1: rule__SectionCell__Group__0__Impl : ( 'cell' ) ;
    public final void rule__SectionCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5952:1: ( ( 'cell' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5953:1: ( 'cell' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5953:1: ( 'cell' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5954:1: 'cell'
            {
             before(grammarAccess.getSectionCellAccess().getCellKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__SectionCell__Group__0__Impl11935); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5967:1: rule__SectionCell__Group__1 : rule__SectionCell__Group__1__Impl rule__SectionCell__Group__2 ;
    public final void rule__SectionCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5971:1: ( rule__SectionCell__Group__1__Impl rule__SectionCell__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5972:2: rule__SectionCell__Group__1__Impl rule__SectionCell__Group__2
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__1__Impl_in_rule__SectionCell__Group__111966);
            rule__SectionCell__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__2_in_rule__SectionCell__Group__111969);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5979:1: rule__SectionCell__Group__1__Impl : ( ( rule__SectionCell__TypeAssignment_1 ) ) ;
    public final void rule__SectionCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5983:1: ( ( ( rule__SectionCell__TypeAssignment_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5984:1: ( ( rule__SectionCell__TypeAssignment_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5984:1: ( ( rule__SectionCell__TypeAssignment_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5985:1: ( rule__SectionCell__TypeAssignment_1 )
            {
             before(grammarAccess.getSectionCellAccess().getTypeAssignment_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5986:1: ( rule__SectionCell__TypeAssignment_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5986:2: rule__SectionCell__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__SectionCell__TypeAssignment_1_in_rule__SectionCell__Group__1__Impl11996);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:5996:1: rule__SectionCell__Group__2 : rule__SectionCell__Group__2__Impl rule__SectionCell__Group__3 ;
    public final void rule__SectionCell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6000:1: ( rule__SectionCell__Group__2__Impl rule__SectionCell__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6001:2: rule__SectionCell__Group__2__Impl rule__SectionCell__Group__3
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__2__Impl_in_rule__SectionCell__Group__212026);
            rule__SectionCell__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__3_in_rule__SectionCell__Group__212029);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6008:1: rule__SectionCell__Group__2__Impl : ( ( rule__SectionCell__Group_2__0 )? ) ;
    public final void rule__SectionCell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6012:1: ( ( ( rule__SectionCell__Group_2__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6013:1: ( ( rule__SectionCell__Group_2__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6013:1: ( ( rule__SectionCell__Group_2__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6014:1: ( rule__SectionCell__Group_2__0 )?
            {
             before(grammarAccess.getSectionCellAccess().getGroup_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6015:1: ( rule__SectionCell__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==52) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6015:2: rule__SectionCell__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SectionCell__Group_2__0_in_rule__SectionCell__Group__2__Impl12056);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6025:1: rule__SectionCell__Group__3 : rule__SectionCell__Group__3__Impl rule__SectionCell__Group__4 ;
    public final void rule__SectionCell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6029:1: ( rule__SectionCell__Group__3__Impl rule__SectionCell__Group__4 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6030:2: rule__SectionCell__Group__3__Impl rule__SectionCell__Group__4
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__3__Impl_in_rule__SectionCell__Group__312087);
            rule__SectionCell__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__4_in_rule__SectionCell__Group__312090);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6037:1: rule__SectionCell__Group__3__Impl : ( '{' ) ;
    public final void rule__SectionCell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6041:1: ( ( '{' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6042:1: ( '{' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6042:1: ( '{' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6043:1: '{'
            {
             before(grammarAccess.getSectionCellAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__SectionCell__Group__3__Impl12118); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6056:1: rule__SectionCell__Group__4 : rule__SectionCell__Group__4__Impl rule__SectionCell__Group__5 ;
    public final void rule__SectionCell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6060:1: ( rule__SectionCell__Group__4__Impl rule__SectionCell__Group__5 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6061:2: rule__SectionCell__Group__4__Impl rule__SectionCell__Group__5
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__4__Impl_in_rule__SectionCell__Group__412149);
            rule__SectionCell__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__5_in_rule__SectionCell__Group__412152);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6068:1: rule__SectionCell__Group__4__Impl : ( ( rule__SectionCell__Group_4__0 )? ) ;
    public final void rule__SectionCell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6072:1: ( ( ( rule__SectionCell__Group_4__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6073:1: ( ( rule__SectionCell__Group_4__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6073:1: ( ( rule__SectionCell__Group_4__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6074:1: ( rule__SectionCell__Group_4__0 )?
            {
             before(grammarAccess.getSectionCellAccess().getGroup_4()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6075:1: ( rule__SectionCell__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==53) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6075:2: rule__SectionCell__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SectionCell__Group_4__0_in_rule__SectionCell__Group__4__Impl12179);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6085:1: rule__SectionCell__Group__5 : rule__SectionCell__Group__5__Impl rule__SectionCell__Group__6 ;
    public final void rule__SectionCell__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6089:1: ( rule__SectionCell__Group__5__Impl rule__SectionCell__Group__6 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6090:2: rule__SectionCell__Group__5__Impl rule__SectionCell__Group__6
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__5__Impl_in_rule__SectionCell__Group__512210);
            rule__SectionCell__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__6_in_rule__SectionCell__Group__512213);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6097:1: rule__SectionCell__Group__5__Impl : ( ( rule__SectionCell__Group_5__0 )? ) ;
    public final void rule__SectionCell__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6101:1: ( ( ( rule__SectionCell__Group_5__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6102:1: ( ( rule__SectionCell__Group_5__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6102:1: ( ( rule__SectionCell__Group_5__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6103:1: ( rule__SectionCell__Group_5__0 )?
            {
             before(grammarAccess.getSectionCellAccess().getGroup_5()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6104:1: ( rule__SectionCell__Group_5__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==48) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6104:2: rule__SectionCell__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__SectionCell__Group_5__0_in_rule__SectionCell__Group__5__Impl12240);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6114:1: rule__SectionCell__Group__6 : rule__SectionCell__Group__6__Impl rule__SectionCell__Group__7 ;
    public final void rule__SectionCell__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6118:1: ( rule__SectionCell__Group__6__Impl rule__SectionCell__Group__7 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6119:2: rule__SectionCell__Group__6__Impl rule__SectionCell__Group__7
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__6__Impl_in_rule__SectionCell__Group__612271);
            rule__SectionCell__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__7_in_rule__SectionCell__Group__612274);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6126:1: rule__SectionCell__Group__6__Impl : ( ( rule__SectionCell__Group_6__0 )? ) ;
    public final void rule__SectionCell__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6130:1: ( ( ( rule__SectionCell__Group_6__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6131:1: ( ( rule__SectionCell__Group_6__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6131:1: ( ( rule__SectionCell__Group_6__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6132:1: ( rule__SectionCell__Group_6__0 )?
            {
             before(grammarAccess.getSectionCellAccess().getGroup_6()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6133:1: ( rule__SectionCell__Group_6__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6133:2: rule__SectionCell__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__SectionCell__Group_6__0_in_rule__SectionCell__Group__6__Impl12301);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6143:1: rule__SectionCell__Group__7 : rule__SectionCell__Group__7__Impl rule__SectionCell__Group__8 ;
    public final void rule__SectionCell__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6147:1: ( rule__SectionCell__Group__7__Impl rule__SectionCell__Group__8 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6148:2: rule__SectionCell__Group__7__Impl rule__SectionCell__Group__8
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__7__Impl_in_rule__SectionCell__Group__712332);
            rule__SectionCell__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group__8_in_rule__SectionCell__Group__712335);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6155:1: rule__SectionCell__Group__7__Impl : ( ( rule__SectionCell__Group_7__0 )? ) ;
    public final void rule__SectionCell__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6159:1: ( ( ( rule__SectionCell__Group_7__0 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6160:1: ( ( rule__SectionCell__Group_7__0 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6160:1: ( ( rule__SectionCell__Group_7__0 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6161:1: ( rule__SectionCell__Group_7__0 )?
            {
             before(grammarAccess.getSectionCellAccess().getGroup_7()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6162:1: ( rule__SectionCell__Group_7__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==54) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6162:2: rule__SectionCell__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__SectionCell__Group_7__0_in_rule__SectionCell__Group__7__Impl12362);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6172:1: rule__SectionCell__Group__8 : rule__SectionCell__Group__8__Impl ;
    public final void rule__SectionCell__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6176:1: ( rule__SectionCell__Group__8__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6177:2: rule__SectionCell__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group__8__Impl_in_rule__SectionCell__Group__812393);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6183:1: rule__SectionCell__Group__8__Impl : ( '}' ) ;
    public final void rule__SectionCell__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6187:1: ( ( '}' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6188:1: ( '}' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6188:1: ( '}' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6189:1: '}'
            {
             before(grammarAccess.getSectionCellAccess().getRightCurlyBracketKeyword_8()); 
            match(input,27,FOLLOW_27_in_rule__SectionCell__Group__8__Impl12421); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6220:1: rule__SectionCell__Group_2__0 : rule__SectionCell__Group_2__0__Impl rule__SectionCell__Group_2__1 ;
    public final void rule__SectionCell__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6224:1: ( rule__SectionCell__Group_2__0__Impl rule__SectionCell__Group_2__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6225:2: rule__SectionCell__Group_2__0__Impl rule__SectionCell__Group_2__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_2__0__Impl_in_rule__SectionCell__Group_2__012470);
            rule__SectionCell__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group_2__1_in_rule__SectionCell__Group_2__012473);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6232:1: rule__SectionCell__Group_2__0__Impl : ( 'foreach' ) ;
    public final void rule__SectionCell__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6236:1: ( ( 'foreach' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6237:1: ( 'foreach' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6237:1: ( 'foreach' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6238:1: 'foreach'
            {
             before(grammarAccess.getSectionCellAccess().getForeachKeyword_2_0()); 
            match(input,52,FOLLOW_52_in_rule__SectionCell__Group_2__0__Impl12501); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6251:1: rule__SectionCell__Group_2__1 : rule__SectionCell__Group_2__1__Impl ;
    public final void rule__SectionCell__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6255:1: ( rule__SectionCell__Group_2__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6256:2: rule__SectionCell__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_2__1__Impl_in_rule__SectionCell__Group_2__112532);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6262:1: rule__SectionCell__Group_2__1__Impl : ( ( rule__SectionCell__IteratorAssignment_2_1 ) ) ;
    public final void rule__SectionCell__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6266:1: ( ( ( rule__SectionCell__IteratorAssignment_2_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6267:1: ( ( rule__SectionCell__IteratorAssignment_2_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6267:1: ( ( rule__SectionCell__IteratorAssignment_2_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6268:1: ( rule__SectionCell__IteratorAssignment_2_1 )
            {
             before(grammarAccess.getSectionCellAccess().getIteratorAssignment_2_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6269:1: ( rule__SectionCell__IteratorAssignment_2_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6269:2: rule__SectionCell__IteratorAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SectionCell__IteratorAssignment_2_1_in_rule__SectionCell__Group_2__1__Impl12559);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6283:1: rule__SectionCell__Group_4__0 : rule__SectionCell__Group_4__0__Impl rule__SectionCell__Group_4__1 ;
    public final void rule__SectionCell__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6287:1: ( rule__SectionCell__Group_4__0__Impl rule__SectionCell__Group_4__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6288:2: rule__SectionCell__Group_4__0__Impl rule__SectionCell__Group_4__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_4__0__Impl_in_rule__SectionCell__Group_4__012593);
            rule__SectionCell__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group_4__1_in_rule__SectionCell__Group_4__012596);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6295:1: rule__SectionCell__Group_4__0__Impl : ( 'text=' ) ;
    public final void rule__SectionCell__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6299:1: ( ( 'text=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6300:1: ( 'text=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6300:1: ( 'text=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6301:1: 'text='
            {
             before(grammarAccess.getSectionCellAccess().getTextKeyword_4_0()); 
            match(input,53,FOLLOW_53_in_rule__SectionCell__Group_4__0__Impl12624); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6314:1: rule__SectionCell__Group_4__1 : rule__SectionCell__Group_4__1__Impl ;
    public final void rule__SectionCell__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6318:1: ( rule__SectionCell__Group_4__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6319:2: rule__SectionCell__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_4__1__Impl_in_rule__SectionCell__Group_4__112655);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6325:1: rule__SectionCell__Group_4__1__Impl : ( ( rule__SectionCell__TextAssignment_4_1 ) ) ;
    public final void rule__SectionCell__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6329:1: ( ( ( rule__SectionCell__TextAssignment_4_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6330:1: ( ( rule__SectionCell__TextAssignment_4_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6330:1: ( ( rule__SectionCell__TextAssignment_4_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6331:1: ( rule__SectionCell__TextAssignment_4_1 )
            {
             before(grammarAccess.getSectionCellAccess().getTextAssignment_4_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6332:1: ( rule__SectionCell__TextAssignment_4_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6332:2: rule__SectionCell__TextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SectionCell__TextAssignment_4_1_in_rule__SectionCell__Group_4__1__Impl12682);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6346:1: rule__SectionCell__Group_5__0 : rule__SectionCell__Group_5__0__Impl rule__SectionCell__Group_5__1 ;
    public final void rule__SectionCell__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6350:1: ( rule__SectionCell__Group_5__0__Impl rule__SectionCell__Group_5__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6351:2: rule__SectionCell__Group_5__0__Impl rule__SectionCell__Group_5__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_5__0__Impl_in_rule__SectionCell__Group_5__012716);
            rule__SectionCell__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group_5__1_in_rule__SectionCell__Group_5__012719);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6358:1: rule__SectionCell__Group_5__0__Impl : ( 'details=' ) ;
    public final void rule__SectionCell__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6362:1: ( ( 'details=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6363:1: ( 'details=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6363:1: ( 'details=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6364:1: 'details='
            {
             before(grammarAccess.getSectionCellAccess().getDetailsKeyword_5_0()); 
            match(input,48,FOLLOW_48_in_rule__SectionCell__Group_5__0__Impl12747); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6377:1: rule__SectionCell__Group_5__1 : rule__SectionCell__Group_5__1__Impl ;
    public final void rule__SectionCell__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6381:1: ( rule__SectionCell__Group_5__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6382:2: rule__SectionCell__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_5__1__Impl_in_rule__SectionCell__Group_5__112778);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6388:1: rule__SectionCell__Group_5__1__Impl : ( ( rule__SectionCell__DetailsAssignment_5_1 ) ) ;
    public final void rule__SectionCell__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6392:1: ( ( ( rule__SectionCell__DetailsAssignment_5_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6393:1: ( ( rule__SectionCell__DetailsAssignment_5_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6393:1: ( ( rule__SectionCell__DetailsAssignment_5_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6394:1: ( rule__SectionCell__DetailsAssignment_5_1 )
            {
             before(grammarAccess.getSectionCellAccess().getDetailsAssignment_5_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6395:1: ( rule__SectionCell__DetailsAssignment_5_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6395:2: rule__SectionCell__DetailsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__SectionCell__DetailsAssignment_5_1_in_rule__SectionCell__Group_5__1__Impl12805);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6409:1: rule__SectionCell__Group_6__0 : rule__SectionCell__Group_6__0__Impl rule__SectionCell__Group_6__1 ;
    public final void rule__SectionCell__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6413:1: ( rule__SectionCell__Group_6__0__Impl rule__SectionCell__Group_6__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6414:2: rule__SectionCell__Group_6__0__Impl rule__SectionCell__Group_6__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_6__0__Impl_in_rule__SectionCell__Group_6__012839);
            rule__SectionCell__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group_6__1_in_rule__SectionCell__Group_6__012842);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6421:1: rule__SectionCell__Group_6__0__Impl : ( 'image=' ) ;
    public final void rule__SectionCell__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6425:1: ( ( 'image=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6426:1: ( 'image=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6426:1: ( 'image=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6427:1: 'image='
            {
             before(grammarAccess.getSectionCellAccess().getImageKeyword_6_0()); 
            match(input,49,FOLLOW_49_in_rule__SectionCell__Group_6__0__Impl12870); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6440:1: rule__SectionCell__Group_6__1 : rule__SectionCell__Group_6__1__Impl ;
    public final void rule__SectionCell__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6444:1: ( rule__SectionCell__Group_6__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6445:2: rule__SectionCell__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_6__1__Impl_in_rule__SectionCell__Group_6__112901);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6451:1: rule__SectionCell__Group_6__1__Impl : ( ( rule__SectionCell__ImageAssignment_6_1 ) ) ;
    public final void rule__SectionCell__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6455:1: ( ( ( rule__SectionCell__ImageAssignment_6_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6456:1: ( ( rule__SectionCell__ImageAssignment_6_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6456:1: ( ( rule__SectionCell__ImageAssignment_6_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6457:1: ( rule__SectionCell__ImageAssignment_6_1 )
            {
             before(grammarAccess.getSectionCellAccess().getImageAssignment_6_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6458:1: ( rule__SectionCell__ImageAssignment_6_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6458:2: rule__SectionCell__ImageAssignment_6_1
            {
            pushFollow(FOLLOW_rule__SectionCell__ImageAssignment_6_1_in_rule__SectionCell__Group_6__1__Impl12928);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6472:1: rule__SectionCell__Group_7__0 : rule__SectionCell__Group_7__0__Impl rule__SectionCell__Group_7__1 ;
    public final void rule__SectionCell__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6476:1: ( rule__SectionCell__Group_7__0__Impl rule__SectionCell__Group_7__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6477:2: rule__SectionCell__Group_7__0__Impl rule__SectionCell__Group_7__1
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_7__0__Impl_in_rule__SectionCell__Group_7__012962);
            rule__SectionCell__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SectionCell__Group_7__1_in_rule__SectionCell__Group_7__012965);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6484:1: rule__SectionCell__Group_7__0__Impl : ( 'action=' ) ;
    public final void rule__SectionCell__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6488:1: ( ( 'action=' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6489:1: ( 'action=' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6489:1: ( 'action=' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6490:1: 'action='
            {
             before(grammarAccess.getSectionCellAccess().getActionKeyword_7_0()); 
            match(input,54,FOLLOW_54_in_rule__SectionCell__Group_7__0__Impl12993); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6503:1: rule__SectionCell__Group_7__1 : rule__SectionCell__Group_7__1__Impl ;
    public final void rule__SectionCell__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6507:1: ( rule__SectionCell__Group_7__1__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6508:2: rule__SectionCell__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionCell__Group_7__1__Impl_in_rule__SectionCell__Group_7__113024);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6514:1: rule__SectionCell__Group_7__1__Impl : ( ( rule__SectionCell__ActionAssignment_7_1 ) ) ;
    public final void rule__SectionCell__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6518:1: ( ( ( rule__SectionCell__ActionAssignment_7_1 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6519:1: ( ( rule__SectionCell__ActionAssignment_7_1 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6519:1: ( ( rule__SectionCell__ActionAssignment_7_1 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6520:1: ( rule__SectionCell__ActionAssignment_7_1 )
            {
             before(grammarAccess.getSectionCellAccess().getActionAssignment_7_1()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6521:1: ( rule__SectionCell__ActionAssignment_7_1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6521:2: rule__SectionCell__ActionAssignment_7_1
            {
            pushFollow(FOLLOW_rule__SectionCell__ActionAssignment_7_1_in_rule__SectionCell__Group_7__1__Impl13051);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6535:1: rule__CollectionIterator__Group__0 : rule__CollectionIterator__Group__0__Impl rule__CollectionIterator__Group__1 ;
    public final void rule__CollectionIterator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6539:1: ( rule__CollectionIterator__Group__0__Impl rule__CollectionIterator__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6540:2: rule__CollectionIterator__Group__0__Impl rule__CollectionIterator__Group__1
            {
            pushFollow(FOLLOW_rule__CollectionIterator__Group__0__Impl_in_rule__CollectionIterator__Group__013085);
            rule__CollectionIterator__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionIterator__Group__1_in_rule__CollectionIterator__Group__013088);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6547:1: rule__CollectionIterator__Group__0__Impl : ( ( rule__CollectionIterator__CollectionAssignment_0 ) ) ;
    public final void rule__CollectionIterator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6551:1: ( ( ( rule__CollectionIterator__CollectionAssignment_0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6552:1: ( ( rule__CollectionIterator__CollectionAssignment_0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6552:1: ( ( rule__CollectionIterator__CollectionAssignment_0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6553:1: ( rule__CollectionIterator__CollectionAssignment_0 )
            {
             before(grammarAccess.getCollectionIteratorAccess().getCollectionAssignment_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6554:1: ( rule__CollectionIterator__CollectionAssignment_0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6554:2: rule__CollectionIterator__CollectionAssignment_0
            {
            pushFollow(FOLLOW_rule__CollectionIterator__CollectionAssignment_0_in_rule__CollectionIterator__Group__0__Impl13115);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6564:1: rule__CollectionIterator__Group__1 : rule__CollectionIterator__Group__1__Impl rule__CollectionIterator__Group__2 ;
    public final void rule__CollectionIterator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6568:1: ( rule__CollectionIterator__Group__1__Impl rule__CollectionIterator__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6569:2: rule__CollectionIterator__Group__1__Impl rule__CollectionIterator__Group__2
            {
            pushFollow(FOLLOW_rule__CollectionIterator__Group__1__Impl_in_rule__CollectionIterator__Group__113145);
            rule__CollectionIterator__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CollectionIterator__Group__2_in_rule__CollectionIterator__Group__113148);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6576:1: rule__CollectionIterator__Group__1__Impl : ( 'as' ) ;
    public final void rule__CollectionIterator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6580:1: ( ( 'as' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6581:1: ( 'as' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6581:1: ( 'as' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6582:1: 'as'
            {
             before(grammarAccess.getCollectionIteratorAccess().getAsKeyword_1()); 
            match(input,55,FOLLOW_55_in_rule__CollectionIterator__Group__1__Impl13176); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6595:1: rule__CollectionIterator__Group__2 : rule__CollectionIterator__Group__2__Impl ;
    public final void rule__CollectionIterator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6599:1: ( rule__CollectionIterator__Group__2__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6600:2: rule__CollectionIterator__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CollectionIterator__Group__2__Impl_in_rule__CollectionIterator__Group__213207);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6606:1: rule__CollectionIterator__Group__2__Impl : ( ( rule__CollectionIterator__NameAssignment_2 ) ) ;
    public final void rule__CollectionIterator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6610:1: ( ( ( rule__CollectionIterator__NameAssignment_2 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6611:1: ( ( rule__CollectionIterator__NameAssignment_2 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6611:1: ( ( rule__CollectionIterator__NameAssignment_2 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6612:1: ( rule__CollectionIterator__NameAssignment_2 )
            {
             before(grammarAccess.getCollectionIteratorAccess().getNameAssignment_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6613:1: ( rule__CollectionIterator__NameAssignment_2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6613:2: rule__CollectionIterator__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CollectionIterator__NameAssignment_2_in_rule__CollectionIterator__Group__2__Impl13234);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6629:1: rule__ViewCall__Group__0 : rule__ViewCall__Group__0__Impl rule__ViewCall__Group__1 ;
    public final void rule__ViewCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6633:1: ( rule__ViewCall__Group__0__Impl rule__ViewCall__Group__1 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6634:2: rule__ViewCall__Group__0__Impl rule__ViewCall__Group__1
            {
            pushFollow(FOLLOW_rule__ViewCall__Group__0__Impl_in_rule__ViewCall__Group__013270);
            rule__ViewCall__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewCall__Group__1_in_rule__ViewCall__Group__013273);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6641:1: rule__ViewCall__Group__0__Impl : ( ( rule__ViewCall__ViewAssignment_0 ) ) ;
    public final void rule__ViewCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6645:1: ( ( ( rule__ViewCall__ViewAssignment_0 ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6646:1: ( ( rule__ViewCall__ViewAssignment_0 ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6646:1: ( ( rule__ViewCall__ViewAssignment_0 ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6647:1: ( rule__ViewCall__ViewAssignment_0 )
            {
             before(grammarAccess.getViewCallAccess().getViewAssignment_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6648:1: ( rule__ViewCall__ViewAssignment_0 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6648:2: rule__ViewCall__ViewAssignment_0
            {
            pushFollow(FOLLOW_rule__ViewCall__ViewAssignment_0_in_rule__ViewCall__Group__0__Impl13300);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6658:1: rule__ViewCall__Group__1 : rule__ViewCall__Group__1__Impl rule__ViewCall__Group__2 ;
    public final void rule__ViewCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6662:1: ( rule__ViewCall__Group__1__Impl rule__ViewCall__Group__2 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6663:2: rule__ViewCall__Group__1__Impl rule__ViewCall__Group__2
            {
            pushFollow(FOLLOW_rule__ViewCall__Group__1__Impl_in_rule__ViewCall__Group__113330);
            rule__ViewCall__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewCall__Group__2_in_rule__ViewCall__Group__113333);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6670:1: rule__ViewCall__Group__1__Impl : ( '(' ) ;
    public final void rule__ViewCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6674:1: ( ( '(' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6675:1: ( '(' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6675:1: ( '(' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6676:1: '('
            {
             before(grammarAccess.getViewCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__ViewCall__Group__1__Impl13361); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6689:1: rule__ViewCall__Group__2 : rule__ViewCall__Group__2__Impl rule__ViewCall__Group__3 ;
    public final void rule__ViewCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6693:1: ( rule__ViewCall__Group__2__Impl rule__ViewCall__Group__3 )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6694:2: rule__ViewCall__Group__2__Impl rule__ViewCall__Group__3
            {
            pushFollow(FOLLOW_rule__ViewCall__Group__2__Impl_in_rule__ViewCall__Group__213392);
            rule__ViewCall__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ViewCall__Group__3_in_rule__ViewCall__Group__213395);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6701:1: rule__ViewCall__Group__2__Impl : ( ( rule__ViewCall__ProviderAssignment_2 )? ) ;
    public final void rule__ViewCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6705:1: ( ( ( rule__ViewCall__ProviderAssignment_2 )? ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6706:1: ( ( rule__ViewCall__ProviderAssignment_2 )? )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6706:1: ( ( rule__ViewCall__ProviderAssignment_2 )? )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6707:1: ( rule__ViewCall__ProviderAssignment_2 )?
            {
             before(grammarAccess.getViewCallAccess().getProviderAssignment_2()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6708:1: ( rule__ViewCall__ProviderAssignment_2 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_STRING)||LA42_0==17||LA42_0==19||(LA42_0>=21 && LA42_0<=22)||LA42_0==24) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6708:2: rule__ViewCall__ProviderAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ViewCall__ProviderAssignment_2_in_rule__ViewCall__Group__2__Impl13422);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6718:1: rule__ViewCall__Group__3 : rule__ViewCall__Group__3__Impl ;
    public final void rule__ViewCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6722:1: ( rule__ViewCall__Group__3__Impl )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6723:2: rule__ViewCall__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ViewCall__Group__3__Impl_in_rule__ViewCall__Group__313453);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6729:1: rule__ViewCall__Group__3__Impl : ( ')' ) ;
    public final void rule__ViewCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6733:1: ( ( ')' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6734:1: ( ')' )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6734:1: ( ')' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6735:1: ')'
            {
             before(grammarAccess.getViewCallAccess().getRightParenthesisKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__ViewCall__Group__3__Impl13481); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6757:1: rule__Model__ApplicationAssignment_0 : ( ruleApplication ) ;
    public final void rule__Model__ApplicationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6761:1: ( ( ruleApplication ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6762:1: ( ruleApplication )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6762:1: ( ruleApplication )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6763:1: ruleApplication
            {
             before(grammarAccess.getModelAccess().getApplicationApplicationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__Model__ApplicationAssignment_013525);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6772:1: rule__Model__ElementsAssignment_1 : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6776:1: ( ( ruleModelElement ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6777:1: ( ruleModelElement )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6777:1: ( ruleModelElement )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6778:1: ruleModelElement
            {
             before(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleModelElement_in_rule__Model__ElementsAssignment_113556);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6787:1: rule__TypeDescription__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeDescription__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6791:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6792:1: ( ( RULE_ID ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6792:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6793:1: ( RULE_ID )
            {
             before(grammarAccess.getTypeDescriptionAccess().getTypeTypeCrossReference_0_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6794:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6795:1: RULE_ID
            {
             before(grammarAccess.getTypeDescriptionAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDescription__TypeAssignment_013591); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6806:1: rule__TypeDescription__ManyAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__TypeDescription__ManyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6810:1: ( ( ( '[]' ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6811:1: ( ( '[]' ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6811:1: ( ( '[]' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6812:1: ( '[]' )
            {
             before(grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6813:1: ( '[]' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6814:1: '[]'
            {
             before(grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,56,FOLLOW_56_in_rule__TypeDescription__ManyAssignment_113631); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6829:1: rule__Parameter__DescriptionAssignment_0 : ( ruleTypeDescription ) ;
    public final void rule__Parameter__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6833:1: ( ( ruleTypeDescription ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6834:1: ( ruleTypeDescription )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6834:1: ( ruleTypeDescription )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6835:1: ruleTypeDescription
            {
             before(grammarAccess.getParameterAccess().getDescriptionTypeDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeDescription_in_rule__Parameter__DescriptionAssignment_013670);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6844:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6848:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6849:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6849:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6850:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_113701); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6859:1: rule__ObjectReference__ObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectReference__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6863:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6864:1: ( ( RULE_ID ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6864:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6865:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectReferenceAccess().getObjectVariableDeclarationCrossReference_0_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6866:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6867:1: RULE_ID
            {
             before(grammarAccess.getObjectReferenceAccess().getObjectVariableDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectReference__ObjectAssignment_013736); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6878:1: rule__ObjectReference__TailAssignment_1 : ( ruleNestedObjectReference ) ;
    public final void rule__ObjectReference__TailAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6882:1: ( ( ruleNestedObjectReference ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6883:1: ( ruleNestedObjectReference )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6883:1: ( ruleNestedObjectReference )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6884:1: ruleNestedObjectReference
            {
             before(grammarAccess.getObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNestedObjectReference_in_rule__ObjectReference__TailAssignment_113771);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6893:1: rule__NestedObjectReference__ObjectAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__NestedObjectReference__ObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6897:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6898:1: ( ( RULE_ID ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6898:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6899:1: ( RULE_ID )
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getObjectVariableDeclarationCrossReference_1_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6900:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6901:1: RULE_ID
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getObjectVariableDeclarationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NestedObjectReference__ObjectAssignment_113806); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6912:1: rule__NestedObjectReference__TailAssignment_2 : ( ruleNestedObjectReference ) ;
    public final void rule__NestedObjectReference__TailAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6916:1: ( ( ruleNestedObjectReference ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6917:1: ( ruleNestedObjectReference )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6917:1: ( ruleNestedObjectReference )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6918:1: ruleNestedObjectReference
            {
             before(grammarAccess.getNestedObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNestedObjectReference_in_rule__NestedObjectReference__TailAssignment_213841);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6927:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6931:1: ( ( RULE_STRING ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6932:1: ( RULE_STRING )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6932:1: ( RULE_STRING )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6933:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment13872); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6942:1: rule__StringFunction__ValuesAssignment_0_2 : ( ruleScalarExpression ) ;
    public final void rule__StringFunction__ValuesAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6946:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6947:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6947:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6948:1: ruleScalarExpression
            {
             before(grammarAccess.getStringFunctionAccess().getValuesScalarExpressionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValuesAssignment_0_213903);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6957:1: rule__StringFunction__ValueAssignment_1_2 : ( ruleScalarExpression ) ;
    public final void rule__StringFunction__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6961:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6962:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6962:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6963:1: ruleScalarExpression
            {
             before(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValueAssignment_1_213934);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6972:1: rule__StringFunction__MatchAssignment_1_4 : ( ruleScalarExpression ) ;
    public final void rule__StringFunction__MatchAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6976:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6977:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6977:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6978:1: ruleScalarExpression
            {
             before(grammarAccess.getStringFunctionAccess().getMatchScalarExpressionParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__StringFunction__MatchAssignment_1_413965);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6987:1: rule__StringFunction__ReplacementAssignment_1_6 : ( ruleScalarExpression ) ;
    public final void rule__StringFunction__ReplacementAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6991:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6992:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6992:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:6993:1: ruleScalarExpression
            {
             before(grammarAccess.getStringFunctionAccess().getReplacementScalarExpressionParserRuleCall_1_6_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__StringFunction__ReplacementAssignment_1_613996);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7002:1: rule__StringFunction__ValueAssignment_2_2 : ( ruleScalarExpression ) ;
    public final void rule__StringFunction__ValueAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7006:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7007:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7007:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7008:1: ruleScalarExpression
            {
             before(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValueAssignment_2_214027);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7017:1: rule__CollectionLiteral__ItemsAssignment_1 : ( ruleScalarExpression ) ;
    public final void rule__CollectionLiteral__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7021:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7022:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7022:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7023:1: ruleScalarExpression
            {
             before(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__CollectionLiteral__ItemsAssignment_114058);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7032:1: rule__CollectionLiteral__ItemsAssignment_2_1 : ( ruleScalarExpression ) ;
    public final void rule__CollectionLiteral__ItemsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7036:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7037:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7037:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7038:1: ruleScalarExpression
            {
             before(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__CollectionLiteral__ItemsAssignment_2_114089);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7047:1: rule__CollectionFunction__ValueAssignment_2 : ( ruleScalarExpression ) ;
    public final void rule__CollectionFunction__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7051:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7052:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7052:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7053:1: ruleScalarExpression
            {
             before(grammarAccess.getCollectionFunctionAccess().getValueScalarExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__CollectionFunction__ValueAssignment_214120);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7062:1: rule__CollectionFunction__DelimiterAssignment_4 : ( ruleScalarExpression ) ;
    public final void rule__CollectionFunction__DelimiterAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7066:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7067:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7067:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7068:1: ruleScalarExpression
            {
             before(grammarAccess.getCollectionFunctionAccess().getDelimiterScalarExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__CollectionFunction__DelimiterAssignment_414151);
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


    // $ANTLR start rule__TabBarApplication__NameAssignment_1
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7077:1: rule__TabBarApplication__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TabBarApplication__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7081:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7082:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7082:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7083:1: RULE_ID
            {
             before(grammarAccess.getTabBarApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TabBarApplication__NameAssignment_114182); 
             after(grammarAccess.getTabBarApplicationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabBarApplication__NameAssignment_1


    // $ANTLR start rule__TabBarApplication__ButtonsAssignment_3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7092:1: rule__TabBarApplication__ButtonsAssignment_3 : ( ruleTabbarButton ) ;
    public final void rule__TabBarApplication__ButtonsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7096:1: ( ( ruleTabbarButton ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7097:1: ( ruleTabbarButton )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7097:1: ( ruleTabbarButton )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7098:1: ruleTabbarButton
            {
             before(grammarAccess.getTabBarApplicationAccess().getButtonsTabbarButtonParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTabbarButton_in_rule__TabBarApplication__ButtonsAssignment_314213);
            ruleTabbarButton();
            _fsp--;

             after(grammarAccess.getTabBarApplicationAccess().getButtonsTabbarButtonParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TabBarApplication__ButtonsAssignment_3


    // $ANTLR start rule__TabbarButton__TitleAssignment_3
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7107:1: rule__TabbarButton__TitleAssignment_3 : ( ruleScalarExpression ) ;
    public final void rule__TabbarButton__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7111:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7112:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7112:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7113:1: ruleScalarExpression
            {
             before(grammarAccess.getTabbarButtonAccess().getTitleScalarExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__TabbarButton__TitleAssignment_314244);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7122:1: rule__TabbarButton__IconAssignment_5 : ( ruleScalarExpression ) ;
    public final void rule__TabbarButton__IconAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7126:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7127:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7127:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7128:1: ruleScalarExpression
            {
             before(grammarAccess.getTabbarButtonAccess().getIconScalarExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__TabbarButton__IconAssignment_514275);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7137:1: rule__TabbarButton__ViewAssignment_7 : ( ruleViewCall ) ;
    public final void rule__TabbarButton__ViewAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7141:1: ( ( ruleViewCall ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7142:1: ( ruleViewCall )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7142:1: ( ruleViewCall )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7143:1: ruleViewCall
            {
             before(grammarAccess.getTabbarButtonAccess().getViewViewCallParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleViewCall_in_rule__TabbarButton__ViewAssignment_714306);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7152:1: rule__SimpleType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7156:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7157:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7157:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7158:1: RULE_ID
            {
             before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_114337); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7167:1: rule__SimpleType__PlatformTypeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SimpleType__PlatformTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7171:1: ( ( RULE_STRING ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7172:1: ( RULE_STRING )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7172:1: ( RULE_STRING )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7173:1: RULE_STRING
            {
             before(grammarAccess.getSimpleTypeAccess().getPlatformTypeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleType__PlatformTypeAssignment_314368); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7182:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7186:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7187:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7187:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7188:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_114399); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7197:1: rule__Entity__ExtendsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__ExtendsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7201:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7202:1: ( ( RULE_ID ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7202:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7203:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7204:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7205:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getExtendsEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__ExtendsAssignment_2_114434); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7216:1: rule__Entity__PropertiesAssignment_4 : ( ruleProperty ) ;
    public final void rule__Entity__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7220:1: ( ( ruleProperty ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7221:1: ( ruleProperty )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7221:1: ( ruleProperty )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7222:1: ruleProperty
            {
             before(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_414469);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7231:1: rule__Property__DerivedAssignment_0 : ( ( 'derived' ) ) ;
    public final void rule__Property__DerivedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7235:1: ( ( ( 'derived' ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7236:1: ( ( 'derived' ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7236:1: ( ( 'derived' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7237:1: ( 'derived' )
            {
             before(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_0_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7238:1: ( 'derived' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7239:1: 'derived'
            {
             before(grammarAccess.getPropertyAccess().getDerivedDerivedKeyword_0_0()); 
            match(input,57,FOLLOW_57_in_rule__Property__DerivedAssignment_014505); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7254:1: rule__Property__DescriptionAssignment_1 : ( ruleTypeDescription ) ;
    public final void rule__Property__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7258:1: ( ( ruleTypeDescription ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7259:1: ( ruleTypeDescription )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7259:1: ( ruleTypeDescription )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7260:1: ruleTypeDescription
            {
             before(grammarAccess.getPropertyAccess().getDescriptionTypeDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeDescription_in_rule__Property__DescriptionAssignment_114544);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7269:1: rule__Property__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7273:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7274:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7274:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7275:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_214575); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7284:1: rule__ContentProvider__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ContentProvider__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7288:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7289:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7289:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7290:1: RULE_ID
            {
             before(grammarAccess.getContentProviderAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContentProvider__NameAssignment_114606); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7299:1: rule__ContentProvider__ParameterAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__ContentProvider__ParameterAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7303:1: ( ( ruleParameter ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7304:1: ( ruleParameter )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7304:1: ( ruleParameter )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7305:1: ruleParameter
            {
             before(grammarAccess.getContentProviderAccess().getParameterParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__ContentProvider__ParameterAssignment_2_114637);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7314:1: rule__ContentProvider__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ContentProvider__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7318:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7319:1: ( ( RULE_ID ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7319:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7320:1: ( RULE_ID )
            {
             before(grammarAccess.getContentProviderAccess().getTypeTypeCrossReference_4_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7321:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7322:1: RULE_ID
            {
             before(grammarAccess.getContentProviderAccess().getTypeTypeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContentProvider__TypeAssignment_414672); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7333:1: rule__ContentProvider__ManyAssignment_5 : ( ( '[]' ) ) ;
    public final void rule__ContentProvider__ManyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7337:1: ( ( ( '[]' ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7338:1: ( ( '[]' ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7338:1: ( ( '[]' ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7339:1: ( '[]' )
            {
             before(grammarAccess.getContentProviderAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7340:1: ( '[]' )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7341:1: '[]'
            {
             before(grammarAccess.getContentProviderAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 
            match(input,56,FOLLOW_56_in_rule__ContentProvider__ManyAssignment_514712); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7356:1: rule__ContentProvider__UrlAssignment_9 : ( ruleScalarExpression ) ;
    public final void rule__ContentProvider__UrlAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7360:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7361:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7361:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7362:1: ruleScalarExpression
            {
             before(grammarAccess.getContentProviderAccess().getUrlScalarExpressionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ContentProvider__UrlAssignment_914751);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7371:1: rule__ContentProvider__SelectionAssignment_11 : ( ruleScalarExpression ) ;
    public final void rule__ContentProvider__SelectionAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7375:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7376:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7376:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7377:1: ruleScalarExpression
            {
             before(grammarAccess.getContentProviderAccess().getSelectionScalarExpressionParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ContentProvider__SelectionAssignment_1114782);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7386:1: rule__ProviderConstruction__ProviderAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__ProviderConstruction__ProviderAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7390:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7391:1: ( ( RULE_ID ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7391:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7392:1: ( RULE_ID )
            {
             before(grammarAccess.getProviderConstructionAccess().getProviderContentProviderCrossReference_0_1_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7393:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7394:1: RULE_ID
            {
             before(grammarAccess.getProviderConstructionAccess().getProviderContentProviderIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProviderConstruction__ProviderAssignment_0_114817); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7405:1: rule__ProviderConstruction__ArgumentAssignment_0_3 : ( ruleExpression ) ;
    public final void rule__ProviderConstruction__ArgumentAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7409:1: ( ( ruleExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7410:1: ( ruleExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7410:1: ( ruleExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7411:1: ruleExpression
            {
             before(grammarAccess.getProviderConstructionAccess().getArgumentExpressionParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ProviderConstruction__ArgumentAssignment_0_314852);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7420:1: rule__ProviderConstruction__ExpressionAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__ProviderConstruction__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7424:1: ( ( ruleExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7425:1: ( ruleExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7425:1: ( ruleExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7426:1: ruleExpression
            {
             before(grammarAccess.getProviderConstructionAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ProviderConstruction__ExpressionAssignment_1_114883);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7435:1: rule__TableView__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TableView__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7439:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7440:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7440:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7441:1: RULE_ID
            {
             before(grammarAccess.getTableViewAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TableView__NameAssignment_114914); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7450:1: rule__TableView__ContentAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__TableView__ContentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7454:1: ( ( ruleParameter ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7455:1: ( ruleParameter )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7455:1: ( ruleParameter )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7456:1: ruleParameter
            {
             before(grammarAccess.getTableViewAccess().getContentParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__TableView__ContentAssignment_2_114945);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7465:1: rule__TableView__TitleAssignment_5 : ( ruleScalarExpression ) ;
    public final void rule__TableView__TitleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7469:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7470:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7470:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7471:1: ruleScalarExpression
            {
             before(grammarAccess.getTableViewAccess().getTitleScalarExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__TableView__TitleAssignment_514976);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7480:1: rule__TableView__SectionsAssignment_6 : ( ruleViewSection ) ;
    public final void rule__TableView__SectionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7484:1: ( ( ruleViewSection ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7485:1: ( ruleViewSection )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7485:1: ( ruleViewSection )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7486:1: ruleViewSection
            {
             before(grammarAccess.getTableViewAccess().getSectionsViewSectionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleViewSection_in_rule__TableView__SectionsAssignment_615007);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7495:1: rule__DetailsView__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DetailsView__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7499:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7500:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7500:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7501:1: RULE_ID
            {
             before(grammarAccess.getDetailsViewAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DetailsView__NameAssignment_115038); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7510:1: rule__DetailsView__ContentAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__DetailsView__ContentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7514:1: ( ( ruleParameter ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7515:1: ( ruleParameter )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7515:1: ( ruleParameter )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7516:1: ruleParameter
            {
             before(grammarAccess.getDetailsViewAccess().getContentParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__DetailsView__ContentAssignment_2_115069);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7525:1: rule__DetailsView__TitleAssignment_5 : ( ruleScalarExpression ) ;
    public final void rule__DetailsView__TitleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7529:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7530:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7530:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7531:1: ruleScalarExpression
            {
             before(grammarAccess.getDetailsViewAccess().getTitleScalarExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__DetailsView__TitleAssignment_515100);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7540:1: rule__DetailsView__HeaderAssignment_6 : ( ruleViewHeader ) ;
    public final void rule__DetailsView__HeaderAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7544:1: ( ( ruleViewHeader ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7545:1: ( ruleViewHeader )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7545:1: ( ruleViewHeader )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7546:1: ruleViewHeader
            {
             before(grammarAccess.getDetailsViewAccess().getHeaderViewHeaderParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleViewHeader_in_rule__DetailsView__HeaderAssignment_615131);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7555:1: rule__DetailsView__SectionsAssignment_7 : ( ruleViewSection ) ;
    public final void rule__DetailsView__SectionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7559:1: ( ( ruleViewSection ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7560:1: ( ruleViewSection )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7560:1: ( ruleViewSection )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7561:1: ruleViewSection
            {
             before(grammarAccess.getDetailsViewAccess().getSectionsViewSectionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleViewSection_in_rule__DetailsView__SectionsAssignment_715162);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7570:1: rule__CustomView__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CustomView__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7574:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7575:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7575:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7576:1: RULE_ID
            {
             before(grammarAccess.getCustomViewAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomView__NameAssignment_115193); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7585:1: rule__CustomView__ContentAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__CustomView__ContentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7589:1: ( ( ruleParameter ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7590:1: ( ruleParameter )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7590:1: ( ruleParameter )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7591:1: ruleParameter
            {
             before(grammarAccess.getCustomViewAccess().getContentParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__CustomView__ContentAssignment_2_115224);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7600:1: rule__CustomView__ObjclassAssignment_4 : ( RULE_STRING ) ;
    public final void rule__CustomView__ObjclassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7604:1: ( ( RULE_STRING ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7605:1: ( RULE_STRING )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7605:1: ( RULE_STRING )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7606:1: RULE_STRING
            {
             before(grammarAccess.getCustomViewAccess().getObjclassSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CustomView__ObjclassAssignment_415255); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7615:1: rule__ViewHeader__TitleAssignment_3_1 : ( ruleScalarExpression ) ;
    public final void rule__ViewHeader__TitleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7619:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7620:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7620:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7621:1: ruleScalarExpression
            {
             before(grammarAccess.getViewHeaderAccess().getTitleScalarExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ViewHeader__TitleAssignment_3_115286);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7630:1: rule__ViewHeader__SubtitleAssignment_4_1 : ( ruleScalarExpression ) ;
    public final void rule__ViewHeader__SubtitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7634:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7635:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7635:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7636:1: ruleScalarExpression
            {
             before(grammarAccess.getViewHeaderAccess().getSubtitleScalarExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ViewHeader__SubtitleAssignment_4_115317);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7645:1: rule__ViewHeader__DetailsAssignment_5_1 : ( ruleScalarExpression ) ;
    public final void rule__ViewHeader__DetailsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7649:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7650:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7650:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7651:1: ruleScalarExpression
            {
             before(grammarAccess.getViewHeaderAccess().getDetailsScalarExpressionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ViewHeader__DetailsAssignment_5_115348);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7660:1: rule__ViewHeader__ImageAssignment_6_1 : ( ruleScalarExpression ) ;
    public final void rule__ViewHeader__ImageAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7664:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7665:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7665:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7666:1: ruleScalarExpression
            {
             before(grammarAccess.getViewHeaderAccess().getImageScalarExpressionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ViewHeader__ImageAssignment_6_115379);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7675:1: rule__ViewSection__TitleAssignment_2_1 : ( ruleScalarExpression ) ;
    public final void rule__ViewSection__TitleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7679:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7680:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7680:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7681:1: ruleScalarExpression
            {
             before(grammarAccess.getViewSectionAccess().getTitleScalarExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ViewSection__TitleAssignment_2_115410);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7690:1: rule__ViewSection__CellsAssignment_3 : ( ruleSectionCell ) ;
    public final void rule__ViewSection__CellsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7694:1: ( ( ruleSectionCell ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7695:1: ( ruleSectionCell )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7695:1: ( ruleSectionCell )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7696:1: ruleSectionCell
            {
             before(grammarAccess.getViewSectionAccess().getCellsSectionCellParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSectionCell_in_rule__ViewSection__CellsAssignment_315441);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7705:1: rule__SectionCell__TypeAssignment_1 : ( ruleCellType ) ;
    public final void rule__SectionCell__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7709:1: ( ( ruleCellType ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7710:1: ( ruleCellType )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7710:1: ( ruleCellType )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7711:1: ruleCellType
            {
             before(grammarAccess.getSectionCellAccess().getTypeCellTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCellType_in_rule__SectionCell__TypeAssignment_115472);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7720:1: rule__SectionCell__IteratorAssignment_2_1 : ( ruleCollectionIterator ) ;
    public final void rule__SectionCell__IteratorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7724:1: ( ( ruleCollectionIterator ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7725:1: ( ruleCollectionIterator )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7725:1: ( ruleCollectionIterator )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7726:1: ruleCollectionIterator
            {
             before(grammarAccess.getSectionCellAccess().getIteratorCollectionIteratorParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleCollectionIterator_in_rule__SectionCell__IteratorAssignment_2_115503);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7735:1: rule__SectionCell__TextAssignment_4_1 : ( ruleScalarExpression ) ;
    public final void rule__SectionCell__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7739:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7740:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7740:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7741:1: ruleScalarExpression
            {
             before(grammarAccess.getSectionCellAccess().getTextScalarExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__SectionCell__TextAssignment_4_115534);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7750:1: rule__SectionCell__DetailsAssignment_5_1 : ( ruleScalarExpression ) ;
    public final void rule__SectionCell__DetailsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7754:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7755:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7755:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7756:1: ruleScalarExpression
            {
             before(grammarAccess.getSectionCellAccess().getDetailsScalarExpressionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__SectionCell__DetailsAssignment_5_115565);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7765:1: rule__SectionCell__ImageAssignment_6_1 : ( ruleScalarExpression ) ;
    public final void rule__SectionCell__ImageAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7769:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7770:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7770:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7771:1: ruleScalarExpression
            {
             before(grammarAccess.getSectionCellAccess().getImageScalarExpressionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__SectionCell__ImageAssignment_6_115596);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7780:1: rule__SectionCell__ActionAssignment_7_1 : ( ruleViewAction ) ;
    public final void rule__SectionCell__ActionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7784:1: ( ( ruleViewAction ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7785:1: ( ruleViewAction )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7785:1: ( ruleViewAction )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7786:1: ruleViewAction
            {
             before(grammarAccess.getSectionCellAccess().getActionViewActionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleViewAction_in_rule__SectionCell__ActionAssignment_7_115627);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7795:1: rule__CollectionIterator__CollectionAssignment_0 : ( ruleCollectionExpression ) ;
    public final void rule__CollectionIterator__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7799:1: ( ( ruleCollectionExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7800:1: ( ruleCollectionExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7800:1: ( ruleCollectionExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7801:1: ruleCollectionExpression
            {
             before(grammarAccess.getCollectionIteratorAccess().getCollectionCollectionExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCollectionExpression_in_rule__CollectionIterator__CollectionAssignment_015658);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7810:1: rule__CollectionIterator__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CollectionIterator__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7814:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7815:1: ( RULE_ID )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7815:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7816:1: RULE_ID
            {
             before(grammarAccess.getCollectionIteratorAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CollectionIterator__NameAssignment_215689); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7825:1: rule__ExternalOpen__UrlAssignment : ( ruleScalarExpression ) ;
    public final void rule__ExternalOpen__UrlAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7829:1: ( ( ruleScalarExpression ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7830:1: ( ruleScalarExpression )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7830:1: ( ruleScalarExpression )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7831:1: ruleScalarExpression
            {
             before(grammarAccess.getExternalOpenAccess().getUrlScalarExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleScalarExpression_in_rule__ExternalOpen__UrlAssignment15720);
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7840:1: rule__ViewCall__ViewAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ViewCall__ViewAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7844:1: ( ( ( RULE_ID ) ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7845:1: ( ( RULE_ID ) )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7845:1: ( ( RULE_ID ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7846:1: ( RULE_ID )
            {
             before(grammarAccess.getViewCallAccess().getViewViewCrossReference_0_0()); 
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7847:1: ( RULE_ID )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7848:1: RULE_ID
            {
             before(grammarAccess.getViewCallAccess().getViewViewIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ViewCall__ViewAssignment_015755); 
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
    // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7859:1: rule__ViewCall__ProviderAssignment_2 : ( ruleProviderConstruction ) ;
    public final void rule__ViewCall__ProviderAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7863:1: ( ( ruleProviderConstruction ) )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7864:1: ( ruleProviderConstruction )
            {
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7864:1: ( ruleProviderConstruction )
            // ../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/contentassist/antlr/internal/InternalApplauseDsl.g:7865:1: ruleProviderConstruction
            {
             before(grammarAccess.getViewCallAccess().getProviderProviderConstructionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleProviderConstruction_in_rule__ViewCall__ProviderAssignment_215790);
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
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabBarApplication_in_ruleApplication154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_entryRuleModelElement180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElement187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelElement__Alternatives_in_ruleModelElement213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_entryRuleTypeDescription242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDescription249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__Group__0_in_ruleTypeDescription275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_entryRuleObjectReference362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectReference369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectReference__Group__0_in_ruleObjectReference395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_entryRuleNestedObjectReference422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedObjectReference429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__0_in_ruleNestedObjectReference455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_entryRuleScalarExpression542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarExpression549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScalarExpression__Alternatives_in_ruleScalarExpression575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionExpression609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionExpression__Alternatives_in_ruleCollectionExpression635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_entryRuleStringFunction722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunction729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Alternatives_in_ruleStringFunction755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteral789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__0_in_ruleCollectionLiteral815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_entryRuleCollectionFunction842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionFunction849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__0_in_ruleCollectionFunction875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabBarApplication_in_entryRuleTabBarApplication902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabBarApplication909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__0_in_ruleTabBarApplication935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabbarButton_in_entryRuleTabbarButton962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabbarButton969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__0_in_ruleTabbarButton995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_entryRuleContentProvider1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentProvider1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__0_in_ruleContentProvider1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_entryRuleProviderConstruction1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProviderConstruction1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Alternatives_in_ruleProviderConstruction1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Alternatives_in_ruleView1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionedView_in_entryRuleSectionedView1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionedView1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionedView__Alternatives_in_ruleSectionedView1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_entryRuleTableView1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableView1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__0_in_ruleTableView1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetailsView_in_entryRuleDetailsView1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDetailsView1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__0_in_ruleDetailsView1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_entryRuleCustomView1622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomView1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__0_in_ruleCustomView1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewHeader_in_entryRuleViewHeader1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewHeader1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__0_in_ruleViewHeader1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewSection_in_entryRuleViewSection1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewSection1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__0_in_ruleViewSection1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionCell_in_entryRuleSectionCell1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionCell1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__0_in_ruleSectionCell1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_entryRuleCollectionIterator1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionIterator1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__0_in_ruleCollectionIterator1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewAction_in_entryRuleViewAction1922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewAction1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewAction__Alternatives_in_ruleViewAction1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_entryRuleExternalOpen1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalOpen1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalOpen__UrlAssignment_in_ruleExternalOpen2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_entryRuleViewCall2042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewCall2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__0_in_ruleViewCall2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CellType__Alternatives_in_ruleCellType2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ModelElement__Alternatives2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentProvider_in_rule__ModelElement__Alternatives2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_rule__ModelElement__Alternatives2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Expression__Alternatives2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_rule__Expression__Alternatives2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_rule__Expression__Alternatives2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_rule__Expression__Alternatives2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_rule__Expression__Alternatives2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__ScalarExpression__Alternatives2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_rule__ScalarExpression__Alternatives2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_rule__ScalarExpression__Alternatives2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_rule__CollectionExpression__Alternatives2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunction_in_rule__CollectionExpression__Alternatives2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectReference_in_rule__CollectionExpression__Alternatives2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__0_in_rule__StringFunction__Alternatives2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__0_in_rule__StringFunction__Alternatives2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__0_in_rule__StringFunction__Alternatives2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__Type__Alternatives2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__0_in_rule__ProviderConstruction__Alternatives2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_1__0_in_rule__ProviderConstruction__Alternatives2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionedView_in_rule__View__Alternatives2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomView_in_rule__View__Alternatives2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableView_in_rule__SectionedView__Alternatives2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDetailsView_in_rule__SectionedView__Alternatives2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_rule__ViewAction__Alternatives2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalOpen_in_rule__ViewAction__Alternatives2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CellType__Alternatives2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CellType__Alternatives2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CellType__Alternatives2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CellType__Alternatives2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CellType__Alternatives2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02880 = new BitSet(new long[]{0x00001C1500000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ApplicationAssignment_0_in_rule__Model__Group__0__Impl2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_1_in_rule__Model__Group__1__Impl2967 = new BitSet(new long[]{0x00001C1500000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__Group__0__Impl_in_rule__TypeDescription__Group__03002 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__Group__1_in_rule__TypeDescription__Group__03005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__TypeAssignment_0_in_rule__TypeDescription__Group__0__Impl3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__Group__1__Impl_in_rule__TypeDescription__Group__13062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDescription__ManyAssignment_1_in_rule__TypeDescription__Group__1__Impl3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__DescriptionAssignment_0_in_rule__Parameter__Group__0__Impl3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectReference__Group__0__Impl_in_rule__ObjectReference__Group__03245 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__ObjectReference__Group__1_in_rule__ObjectReference__Group__03248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectReference__ObjectAssignment_0_in_rule__ObjectReference__Group__0__Impl3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectReference__Group__1__Impl_in_rule__ObjectReference__Group__13305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectReference__TailAssignment_1_in_rule__ObjectReference__Group__1__Impl3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__0__Impl_in_rule__NestedObjectReference__Group__03367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__1_in_rule__NestedObjectReference__Group__03370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NestedObjectReference__Group__0__Impl3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__1__Impl_in_rule__NestedObjectReference__Group__13429 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__2_in_rule__NestedObjectReference__Group__13432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__ObjectAssignment_1_in_rule__NestedObjectReference__Group__1__Impl3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__Group__2__Impl_in_rule__NestedObjectReference__Group__23489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NestedObjectReference__TailAssignment_2_in_rule__NestedObjectReference__Group__2__Impl3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__0__Impl_in_rule__StringFunction__Group_0__03553 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__1_in_rule__StringFunction__Group_0__03556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__1__Impl_in_rule__StringFunction__Group_0__13614 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__2_in_rule__StringFunction__Group_0__13617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__StringFunction__Group_0__1__Impl3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__2__Impl_in_rule__StringFunction__Group_0__23676 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__3_in_rule__StringFunction__Group_0__23679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__ValuesAssignment_0_2_in_rule__StringFunction__Group_0__2__Impl3708 = new BitSet(new long[]{0x00000000002A0032L});
    public static final BitSet FOLLOW_rule__StringFunction__ValuesAssignment_0_2_in_rule__StringFunction__Group_0__2__Impl3720 = new BitSet(new long[]{0x00000000002A0032L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_0__3__Impl_in_rule__StringFunction__Group_0__33753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StringFunction__Group_0__3__Impl3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__0__Impl_in_rule__StringFunction__Group_1__03820 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__1_in_rule__StringFunction__Group_1__03823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__1__Impl_in_rule__StringFunction__Group_1__13881 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__2_in_rule__StringFunction__Group_1__13884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StringFunction__Group_1__1__Impl3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__2__Impl_in_rule__StringFunction__Group_1__23943 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__3_in_rule__StringFunction__Group_1__23946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__ValueAssignment_1_2_in_rule__StringFunction__Group_1__2__Impl3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__3__Impl_in_rule__StringFunction__Group_1__34003 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__4_in_rule__StringFunction__Group_1__34006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__StringFunction__Group_1__3__Impl4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__4__Impl_in_rule__StringFunction__Group_1__44065 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__5_in_rule__StringFunction__Group_1__44068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__MatchAssignment_1_4_in_rule__StringFunction__Group_1__4__Impl4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__5__Impl_in_rule__StringFunction__Group_1__54125 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__6_in_rule__StringFunction__Group_1__54128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__StringFunction__Group_1__5__Impl4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__6__Impl_in_rule__StringFunction__Group_1__64187 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__7_in_rule__StringFunction__Group_1__64190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__ReplacementAssignment_1_6_in_rule__StringFunction__Group_1__6__Impl4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_1__7__Impl_in_rule__StringFunction__Group_1__74247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StringFunction__Group_1__7__Impl4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__0__Impl_in_rule__StringFunction__Group_2__04322 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__1_in_rule__StringFunction__Group_2__04325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__1__Impl_in_rule__StringFunction__Group_2__14383 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__2_in_rule__StringFunction__Group_2__14386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StringFunction__Group_2__1__Impl4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__2__Impl_in_rule__StringFunction__Group_2__24445 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__3_in_rule__StringFunction__Group_2__24448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__ValueAssignment_2_2_in_rule__StringFunction__Group_2__2__Impl4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringFunction__Group_2__3__Impl_in_rule__StringFunction__Group_2__34505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StringFunction__Group_2__3__Impl4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__0__Impl_in_rule__CollectionLiteral__Group__04572 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__1_in_rule__CollectionLiteral__Group__04575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CollectionLiteral__Group__0__Impl4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__1__Impl_in_rule__CollectionLiteral__Group__14634 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__2_in_rule__CollectionLiteral__Group__14637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__ItemsAssignment_1_in_rule__CollectionLiteral__Group__1__Impl4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__2__Impl_in_rule__CollectionLiteral__Group__24694 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__3_in_rule__CollectionLiteral__Group__24697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group_2__0_in_rule__CollectionLiteral__Group__2__Impl4724 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group__3__Impl_in_rule__CollectionLiteral__Group__34755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CollectionLiteral__Group__3__Impl4783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group_2__0__Impl_in_rule__CollectionLiteral__Group_2__04822 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group_2__1_in_rule__CollectionLiteral__Group_2__04825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CollectionLiteral__Group_2__0__Impl4853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__Group_2__1__Impl_in_rule__CollectionLiteral__Group_2__14884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionLiteral__ItemsAssignment_2_1_in_rule__CollectionLiteral__Group_2__1__Impl4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__0__Impl_in_rule__CollectionFunction__Group__04945 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__1_in_rule__CollectionFunction__Group__04948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__1__Impl_in_rule__CollectionFunction__Group__15006 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__2_in_rule__CollectionFunction__Group__15009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CollectionFunction__Group__1__Impl5037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__2__Impl_in_rule__CollectionFunction__Group__25068 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__3_in_rule__CollectionFunction__Group__25071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__ValueAssignment_2_in_rule__CollectionFunction__Group__2__Impl5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__3__Impl_in_rule__CollectionFunction__Group__35128 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__4_in_rule__CollectionFunction__Group__35131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CollectionFunction__Group__3__Impl5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__4__Impl_in_rule__CollectionFunction__Group__45190 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__5_in_rule__CollectionFunction__Group__45193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__DelimiterAssignment_4_in_rule__CollectionFunction__Group__4__Impl5220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionFunction__Group__5__Impl_in_rule__CollectionFunction__Group__55250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CollectionFunction__Group__5__Impl5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__0__Impl_in_rule__TabBarApplication__Group__05321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__1_in_rule__TabBarApplication__Group__05324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TabBarApplication__Group__0__Impl5352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__1__Impl_in_rule__TabBarApplication__Group__15383 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__2_in_rule__TabBarApplication__Group__15386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__NameAssignment_1_in_rule__TabBarApplication__Group__1__Impl5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__2__Impl_in_rule__TabBarApplication__Group__25443 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__3_in_rule__TabBarApplication__Group__25446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TabBarApplication__Group__2__Impl5474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__3__Impl_in_rule__TabBarApplication__Group__35505 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__4_in_rule__TabBarApplication__Group__35508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__ButtonsAssignment_3_in_rule__TabBarApplication__Group__3__Impl5535 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__TabBarApplication__Group__4__Impl_in_rule__TabBarApplication__Group__45566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TabBarApplication__Group__4__Impl5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__0__Impl_in_rule__TabbarButton__Group__05635 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__1_in_rule__TabbarButton__Group__05638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TabbarButton__Group__0__Impl5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__1__Impl_in_rule__TabbarButton__Group__15697 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__2_in_rule__TabbarButton__Group__15700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TabbarButton__Group__1__Impl5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__2__Impl_in_rule__TabbarButton__Group__25759 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__3_in_rule__TabbarButton__Group__25762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TabbarButton__Group__2__Impl5790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__3__Impl_in_rule__TabbarButton__Group__35821 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__4_in_rule__TabbarButton__Group__35824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__TitleAssignment_3_in_rule__TabbarButton__Group__3__Impl5851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__4__Impl_in_rule__TabbarButton__Group__45881 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__5_in_rule__TabbarButton__Group__45884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TabbarButton__Group__4__Impl5912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__5__Impl_in_rule__TabbarButton__Group__55943 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__6_in_rule__TabbarButton__Group__55946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__IconAssignment_5_in_rule__TabbarButton__Group__5__Impl5973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__6__Impl_in_rule__TabbarButton__Group__66003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__7_in_rule__TabbarButton__Group__66006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TabbarButton__Group__6__Impl6034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__7__Impl_in_rule__TabbarButton__Group__76065 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__8_in_rule__TabbarButton__Group__76068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__ViewAssignment_7_in_rule__TabbarButton__Group__7__Impl6095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabbarButton__Group__8__Impl_in_rule__TabbarButton__Group__86125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TabbarButton__Group__8__Impl6153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0__Impl_in_rule__SimpleType__Group__06202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__06205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SimpleType__Group__0__Impl6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1__Impl_in_rule__SimpleType__Group__16264 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__2_in_rule__SimpleType__Group__16267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1__Impl6294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__2__Impl_in_rule__SimpleType__Group__26324 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__3_in_rule__SimpleType__Group__26327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SimpleType__Group__2__Impl6355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__3__Impl_in_rule__SimpleType__Group__36386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__PlatformTypeAssignment_3_in_rule__SimpleType__Group__3__Impl6413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__06451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__06454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Entity__Group__0__Impl6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__16513 = new BitSet(new long[]{0x0000000804000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__16516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl6543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__26573 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__26576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl6603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__36634 = new BitSet(new long[]{0x0200000008000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__36637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Entity__Group__3__Impl6665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__46696 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__46699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__PropertiesAssignment_4_in_rule__Entity__Group__4__Impl6726 = new BitSet(new long[]{0x0200000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__56757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Entity__Group__5__Impl6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__06828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__06831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Entity__Group_2__0__Impl6859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__16890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ExtendsAssignment_2_1_in_rule__Entity__Group_2__1__Impl6917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__06951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__06954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DerivedAssignment_0_in_rule__Property__Group__0__Impl6981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__17012 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__17015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DescriptionAssignment_1_in_rule__Property__Group__1__Impl7042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__27072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_2_in_rule__Property__Group__2__Impl7099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__0__Impl_in_rule__ContentProvider__Group__07135 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__1_in_rule__ContentProvider__Group__07138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ContentProvider__Group__0__Impl7166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__1__Impl_in_rule__ContentProvider__Group__17197 = new BitSet(new long[]{0x0000002000020000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__2_in_rule__ContentProvider__Group__17200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__NameAssignment_1_in_rule__ContentProvider__Group__1__Impl7227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__2__Impl_in_rule__ContentProvider__Group__27257 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__3_in_rule__ContentProvider__Group__27260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__0_in_rule__ContentProvider__Group__2__Impl7287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__3__Impl_in_rule__ContentProvider__Group__37318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__4_in_rule__ContentProvider__Group__37321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ContentProvider__Group__3__Impl7349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__4__Impl_in_rule__ContentProvider__Group__47380 = new BitSet(new long[]{0x0100004000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__5_in_rule__ContentProvider__Group__47383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__TypeAssignment_4_in_rule__ContentProvider__Group__4__Impl7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__5__Impl_in_rule__ContentProvider__Group__57440 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__6_in_rule__ContentProvider__Group__57443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__ManyAssignment_5_in_rule__ContentProvider__Group__5__Impl7470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__6__Impl_in_rule__ContentProvider__Group__67501 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__7_in_rule__ContentProvider__Group__67504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ContentProvider__Group__6__Impl7532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__7__Impl_in_rule__ContentProvider__Group__77563 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__8_in_rule__ContentProvider__Group__77566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ContentProvider__Group__7__Impl7594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__8__Impl_in_rule__ContentProvider__Group__87625 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__9_in_rule__ContentProvider__Group__87628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ContentProvider__Group__8__Impl7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__9__Impl_in_rule__ContentProvider__Group__97687 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__10_in_rule__ContentProvider__Group__97690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__UrlAssignment_9_in_rule__ContentProvider__Group__9__Impl7717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__10__Impl_in_rule__ContentProvider__Group__107747 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__11_in_rule__ContentProvider__Group__107750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ContentProvider__Group__10__Impl7778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group__11__Impl_in_rule__ContentProvider__Group__117809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__SelectionAssignment_11_in_rule__ContentProvider__Group__11__Impl7836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__0__Impl_in_rule__ContentProvider__Group_2__07890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__1_in_rule__ContentProvider__Group_2__07893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ContentProvider__Group_2__0__Impl7921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__1__Impl_in_rule__ContentProvider__Group_2__17952 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__2_in_rule__ContentProvider__Group_2__17955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__ParameterAssignment_2_1_in_rule__ContentProvider__Group_2__1__Impl7982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContentProvider__Group_2__2__Impl_in_rule__ContentProvider__Group_2__28012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ContentProvider__Group_2__2__Impl8040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__0__Impl_in_rule__ProviderConstruction__Group_0__08077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__1_in_rule__ProviderConstruction__Group_0__08080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__1__Impl_in_rule__ProviderConstruction__Group_0__18138 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__2_in_rule__ProviderConstruction__Group_0__18141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__ProviderAssignment_0_1_in_rule__ProviderConstruction__Group_0__1__Impl8168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__2__Impl_in_rule__ProviderConstruction__Group_0__28198 = new BitSet(new long[]{0x00000000016E0030L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__3_in_rule__ProviderConstruction__Group_0__28201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ProviderConstruction__Group_0__2__Impl8229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__3__Impl_in_rule__ProviderConstruction__Group_0__38260 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__4_in_rule__ProviderConstruction__Group_0__38263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__ArgumentAssignment_0_3_in_rule__ProviderConstruction__Group_0__3__Impl8290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_0__4__Impl_in_rule__ProviderConstruction__Group_0__48321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ProviderConstruction__Group_0__4__Impl8349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_1__0__Impl_in_rule__ProviderConstruction__Group_1__08390 = new BitSet(new long[]{0x00000000016A0030L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_1__1_in_rule__ProviderConstruction__Group_1__08393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__Group_1__1__Impl_in_rule__ProviderConstruction__Group_1__18451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProviderConstruction__ExpressionAssignment_1_1_in_rule__ProviderConstruction__Group_1__1__Impl8478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__0__Impl_in_rule__TableView__Group__08512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TableView__Group__1_in_rule__TableView__Group__08515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__TableView__Group__0__Impl8543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__1__Impl_in_rule__TableView__Group__18574 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__TableView__Group__2_in_rule__TableView__Group__18577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__NameAssignment_1_in_rule__TableView__Group__1__Impl8604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__2__Impl_in_rule__TableView__Group__28634 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__TableView__Group__3_in_rule__TableView__Group__28637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__0_in_rule__TableView__Group__2__Impl8664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__3__Impl_in_rule__TableView__Group__38695 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TableView__Group__4_in_rule__TableView__Group__38698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TableView__Group__3__Impl8726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__4__Impl_in_rule__TableView__Group__48757 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__TableView__Group__5_in_rule__TableView__Group__48760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TableView__Group__4__Impl8788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__5__Impl_in_rule__TableView__Group__58819 = new BitSet(new long[]{0x0004000008000000L});
    public static final BitSet FOLLOW_rule__TableView__Group__6_in_rule__TableView__Group__58822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__TitleAssignment_5_in_rule__TableView__Group__5__Impl8849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__6__Impl_in_rule__TableView__Group__68879 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TableView__Group__7_in_rule__TableView__Group__68882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__SectionsAssignment_6_in_rule__TableView__Group__6__Impl8909 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group__7__Impl_in_rule__TableView__Group__78940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TableView__Group__7__Impl8968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__0__Impl_in_rule__TableView__Group_2__09015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__1_in_rule__TableView__Group_2__09018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TableView__Group_2__0__Impl9046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__1__Impl_in_rule__TableView__Group_2__19077 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__2_in_rule__TableView__Group_2__19080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__ContentAssignment_2_1_in_rule__TableView__Group_2__1__Impl9107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableView__Group_2__2__Impl_in_rule__TableView__Group_2__29137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TableView__Group_2__2__Impl9165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__0__Impl_in_rule__DetailsView__Group__09202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__1_in_rule__DetailsView__Group__09205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__DetailsView__Group__0__Impl9233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__1__Impl_in_rule__DetailsView__Group__19264 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__2_in_rule__DetailsView__Group__19267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__NameAssignment_1_in_rule__DetailsView__Group__1__Impl9294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__2__Impl_in_rule__DetailsView__Group__29324 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__3_in_rule__DetailsView__Group__29327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__0_in_rule__DetailsView__Group__2__Impl9354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__3__Impl_in_rule__DetailsView__Group__39385 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__4_in_rule__DetailsView__Group__39388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DetailsView__Group__3__Impl9416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__4__Impl_in_rule__DetailsView__Group__49447 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__5_in_rule__DetailsView__Group__49450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DetailsView__Group__4__Impl9478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__5__Impl_in_rule__DetailsView__Group__59509 = new BitSet(new long[]{0x0004400008000000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__6_in_rule__DetailsView__Group__59512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__TitleAssignment_5_in_rule__DetailsView__Group__5__Impl9539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__6__Impl_in_rule__DetailsView__Group__69569 = new BitSet(new long[]{0x0004000008000000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__7_in_rule__DetailsView__Group__69572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__HeaderAssignment_6_in_rule__DetailsView__Group__6__Impl9599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__7__Impl_in_rule__DetailsView__Group__79630 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__8_in_rule__DetailsView__Group__79633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__SectionsAssignment_7_in_rule__DetailsView__Group__7__Impl9660 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group__8__Impl_in_rule__DetailsView__Group__89691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DetailsView__Group__8__Impl9719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__0__Impl_in_rule__DetailsView__Group_2__09768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__1_in_rule__DetailsView__Group_2__09771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DetailsView__Group_2__0__Impl9799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__1__Impl_in_rule__DetailsView__Group_2__19830 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__2_in_rule__DetailsView__Group_2__19833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__ContentAssignment_2_1_in_rule__DetailsView__Group_2__1__Impl9860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DetailsView__Group_2__2__Impl_in_rule__DetailsView__Group_2__29890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DetailsView__Group_2__2__Impl9918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__0__Impl_in_rule__CustomView__Group__09955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CustomView__Group__1_in_rule__CustomView__Group__09958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__CustomView__Group__0__Impl9986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__1__Impl_in_rule__CustomView__Group__110017 = new BitSet(new long[]{0x0000200000020000L});
    public static final BitSet FOLLOW_rule__CustomView__Group__2_in_rule__CustomView__Group__110020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__NameAssignment_1_in_rule__CustomView__Group__1__Impl10047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__2__Impl_in_rule__CustomView__Group__210077 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__CustomView__Group__3_in_rule__CustomView__Group__210080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__0_in_rule__CustomView__Group__2__Impl10107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__3__Impl_in_rule__CustomView__Group__310138 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CustomView__Group__4_in_rule__CustomView__Group__310141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__CustomView__Group__3__Impl10169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group__4__Impl_in_rule__CustomView__Group__410200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__ObjclassAssignment_4_in_rule__CustomView__Group__4__Impl10227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__0__Impl_in_rule__CustomView__Group_2__010267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__1_in_rule__CustomView__Group_2__010270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CustomView__Group_2__0__Impl10298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__1__Impl_in_rule__CustomView__Group_2__110329 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__2_in_rule__CustomView__Group_2__110332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__ContentAssignment_2_1_in_rule__CustomView__Group_2__1__Impl10359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomView__Group_2__2__Impl_in_rule__CustomView__Group_2__210389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CustomView__Group_2__2__Impl10417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__0__Impl_in_rule__ViewHeader__Group__010454 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__1_in_rule__ViewHeader__Group__010457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__1__Impl_in_rule__ViewHeader__Group__110515 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__2_in_rule__ViewHeader__Group__110518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ViewHeader__Group__1__Impl10546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__2__Impl_in_rule__ViewHeader__Group__210577 = new BitSet(new long[]{0x0003800028000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__3_in_rule__ViewHeader__Group__210580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ViewHeader__Group__2__Impl10608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__3__Impl_in_rule__ViewHeader__Group__310639 = new BitSet(new long[]{0x0003800008000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__4_in_rule__ViewHeader__Group__310642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_3__0_in_rule__ViewHeader__Group__3__Impl10669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__4__Impl_in_rule__ViewHeader__Group__410700 = new BitSet(new long[]{0x0003000008000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__5_in_rule__ViewHeader__Group__410703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_4__0_in_rule__ViewHeader__Group__4__Impl10730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__5__Impl_in_rule__ViewHeader__Group__510761 = new BitSet(new long[]{0x0002000008000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__6_in_rule__ViewHeader__Group__510764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_5__0_in_rule__ViewHeader__Group__5__Impl10791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__6__Impl_in_rule__ViewHeader__Group__610822 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__7_in_rule__ViewHeader__Group__610825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_6__0_in_rule__ViewHeader__Group__6__Impl10852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group__7__Impl_in_rule__ViewHeader__Group__710883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ViewHeader__Group__7__Impl10911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_3__0__Impl_in_rule__ViewHeader__Group_3__010958 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_3__1_in_rule__ViewHeader__Group_3__010961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ViewHeader__Group_3__0__Impl10989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_3__1__Impl_in_rule__ViewHeader__Group_3__111020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__TitleAssignment_3_1_in_rule__ViewHeader__Group_3__1__Impl11047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_4__0__Impl_in_rule__ViewHeader__Group_4__011081 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_4__1_in_rule__ViewHeader__Group_4__011084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ViewHeader__Group_4__0__Impl11112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_4__1__Impl_in_rule__ViewHeader__Group_4__111143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__SubtitleAssignment_4_1_in_rule__ViewHeader__Group_4__1__Impl11170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_5__0__Impl_in_rule__ViewHeader__Group_5__011204 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_5__1_in_rule__ViewHeader__Group_5__011207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ViewHeader__Group_5__0__Impl11235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_5__1__Impl_in_rule__ViewHeader__Group_5__111266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__DetailsAssignment_5_1_in_rule__ViewHeader__Group_5__1__Impl11293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_6__0__Impl_in_rule__ViewHeader__Group_6__011327 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_6__1_in_rule__ViewHeader__Group_6__011330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ViewHeader__Group_6__0__Impl11358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__Group_6__1__Impl_in_rule__ViewHeader__Group_6__111389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewHeader__ImageAssignment_6_1_in_rule__ViewHeader__Group_6__1__Impl11416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__0__Impl_in_rule__ViewSection__Group__011450 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__1_in_rule__ViewSection__Group__011453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ViewSection__Group__0__Impl11481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__1__Impl_in_rule__ViewSection__Group__111512 = new BitSet(new long[]{0x0008000020000000L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__2_in_rule__ViewSection__Group__111515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ViewSection__Group__1__Impl11543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__2__Impl_in_rule__ViewSection__Group__211574 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__3_in_rule__ViewSection__Group__211577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group_2__0_in_rule__ViewSection__Group__2__Impl11604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__3__Impl_in_rule__ViewSection__Group__311635 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__4_in_rule__ViewSection__Group__311638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__CellsAssignment_3_in_rule__ViewSection__Group__3__Impl11667 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__CellsAssignment_3_in_rule__ViewSection__Group__3__Impl11679 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group__4__Impl_in_rule__ViewSection__Group__411712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ViewSection__Group__4__Impl11740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group_2__0__Impl_in_rule__ViewSection__Group_2__011781 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__ViewSection__Group_2__1_in_rule__ViewSection__Group_2__011784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ViewSection__Group_2__0__Impl11812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__Group_2__1__Impl_in_rule__ViewSection__Group_2__111843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewSection__TitleAssignment_2_1_in_rule__ViewSection__Group_2__1__Impl11870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__0__Impl_in_rule__SectionCell__Group__011904 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__1_in_rule__SectionCell__Group__011907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__SectionCell__Group__0__Impl11935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__1__Impl_in_rule__SectionCell__Group__111966 = new BitSet(new long[]{0x0010000004000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__2_in_rule__SectionCell__Group__111969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__TypeAssignment_1_in_rule__SectionCell__Group__1__Impl11996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__2__Impl_in_rule__SectionCell__Group__212026 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__3_in_rule__SectionCell__Group__212029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_2__0_in_rule__SectionCell__Group__2__Impl12056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__3__Impl_in_rule__SectionCell__Group__312087 = new BitSet(new long[]{0x0063000008000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__4_in_rule__SectionCell__Group__312090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SectionCell__Group__3__Impl12118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__4__Impl_in_rule__SectionCell__Group__412149 = new BitSet(new long[]{0x0043000008000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__5_in_rule__SectionCell__Group__412152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_4__0_in_rule__SectionCell__Group__4__Impl12179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__5__Impl_in_rule__SectionCell__Group__512210 = new BitSet(new long[]{0x0042000008000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__6_in_rule__SectionCell__Group__512213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_5__0_in_rule__SectionCell__Group__5__Impl12240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__6__Impl_in_rule__SectionCell__Group__612271 = new BitSet(new long[]{0x0040000008000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__7_in_rule__SectionCell__Group__612274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_6__0_in_rule__SectionCell__Group__6__Impl12301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__7__Impl_in_rule__SectionCell__Group__712332 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__8_in_rule__SectionCell__Group__712335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_7__0_in_rule__SectionCell__Group__7__Impl12362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group__8__Impl_in_rule__SectionCell__Group__812393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SectionCell__Group__8__Impl12421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_2__0__Impl_in_rule__SectionCell__Group_2__012470 = new BitSet(new long[]{0x0000000001400010L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_2__1_in_rule__SectionCell__Group_2__012473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__SectionCell__Group_2__0__Impl12501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_2__1__Impl_in_rule__SectionCell__Group_2__112532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__IteratorAssignment_2_1_in_rule__SectionCell__Group_2__1__Impl12559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_4__0__Impl_in_rule__SectionCell__Group_4__012593 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_4__1_in_rule__SectionCell__Group_4__012596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__SectionCell__Group_4__0__Impl12624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_4__1__Impl_in_rule__SectionCell__Group_4__112655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__TextAssignment_4_1_in_rule__SectionCell__Group_4__1__Impl12682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_5__0__Impl_in_rule__SectionCell__Group_5__012716 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_5__1_in_rule__SectionCell__Group_5__012719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__SectionCell__Group_5__0__Impl12747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_5__1__Impl_in_rule__SectionCell__Group_5__112778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__DetailsAssignment_5_1_in_rule__SectionCell__Group_5__1__Impl12805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_6__0__Impl_in_rule__SectionCell__Group_6__012839 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_6__1_in_rule__SectionCell__Group_6__012842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__SectionCell__Group_6__0__Impl12870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_6__1__Impl_in_rule__SectionCell__Group_6__112901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__ImageAssignment_6_1_in_rule__SectionCell__Group_6__1__Impl12928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_7__0__Impl_in_rule__SectionCell__Group_7__012962 = new BitSet(new long[]{0x00000000002A0030L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_7__1_in_rule__SectionCell__Group_7__012965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__SectionCell__Group_7__0__Impl12993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__Group_7__1__Impl_in_rule__SectionCell__Group_7__113024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionCell__ActionAssignment_7_1_in_rule__SectionCell__Group_7__1__Impl13051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__0__Impl_in_rule__CollectionIterator__Group__013085 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__1_in_rule__CollectionIterator__Group__013088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__CollectionAssignment_0_in_rule__CollectionIterator__Group__0__Impl13115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__1__Impl_in_rule__CollectionIterator__Group__113145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__2_in_rule__CollectionIterator__Group__113148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__CollectionIterator__Group__1__Impl13176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__Group__2__Impl_in_rule__CollectionIterator__Group__213207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionIterator__NameAssignment_2_in_rule__CollectionIterator__Group__2__Impl13234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__0__Impl_in_rule__ViewCall__Group__013270 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__1_in_rule__ViewCall__Group__013273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__ViewAssignment_0_in_rule__ViewCall__Group__0__Impl13300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__1__Impl_in_rule__ViewCall__Group__113330 = new BitSet(new long[]{0x00000000016E0030L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__2_in_rule__ViewCall__Group__113333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ViewCall__Group__1__Impl13361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__2__Impl_in_rule__ViewCall__Group__213392 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__3_in_rule__ViewCall__Group__213395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__ProviderAssignment_2_in_rule__ViewCall__Group__2__Impl13422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewCall__Group__3__Impl_in_rule__ViewCall__Group__313453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ViewCall__Group__3__Impl13481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__Model__ApplicationAssignment_013525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_rule__Model__ElementsAssignment_113556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDescription__TypeAssignment_013591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__TypeDescription__ManyAssignment_113631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_rule__Parameter__DescriptionAssignment_013670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_113701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectReference__ObjectAssignment_013736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_rule__ObjectReference__TailAssignment_113771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NestedObjectReference__ObjectAssignment_113806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedObjectReference_in_rule__NestedObjectReference__TailAssignment_213841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment13872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValuesAssignment_0_213903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValueAssignment_1_213934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__StringFunction__MatchAssignment_1_413965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__StringFunction__ReplacementAssignment_1_613996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__StringFunction__ValueAssignment_2_214027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__CollectionLiteral__ItemsAssignment_114058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__CollectionLiteral__ItemsAssignment_2_114089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__CollectionFunction__ValueAssignment_214120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__CollectionFunction__DelimiterAssignment_414151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TabBarApplication__NameAssignment_114182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTabbarButton_in_rule__TabBarApplication__ButtonsAssignment_314213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__TabbarButton__TitleAssignment_314244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__TabbarButton__IconAssignment_514275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewCall_in_rule__TabbarButton__ViewAssignment_714306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_114337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleType__PlatformTypeAssignment_314368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_114399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__ExtendsAssignment_2_114434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_414469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Property__DerivedAssignment_014505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDescription_in_rule__Property__DescriptionAssignment_114544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_214575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContentProvider__NameAssignment_114606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ContentProvider__ParameterAssignment_2_114637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContentProvider__TypeAssignment_414672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ContentProvider__ManyAssignment_514712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ContentProvider__UrlAssignment_914751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ContentProvider__SelectionAssignment_1114782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProviderConstruction__ProviderAssignment_0_114817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ProviderConstruction__ArgumentAssignment_0_314852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ProviderConstruction__ExpressionAssignment_1_114883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TableView__NameAssignment_114914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__TableView__ContentAssignment_2_114945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__TableView__TitleAssignment_514976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewSection_in_rule__TableView__SectionsAssignment_615007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DetailsView__NameAssignment_115038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__DetailsView__ContentAssignment_2_115069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__DetailsView__TitleAssignment_515100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewHeader_in_rule__DetailsView__HeaderAssignment_615131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewSection_in_rule__DetailsView__SectionsAssignment_715162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomView__NameAssignment_115193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__CustomView__ContentAssignment_2_115224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomView__ObjclassAssignment_415255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ViewHeader__TitleAssignment_3_115286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ViewHeader__SubtitleAssignment_4_115317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ViewHeader__DetailsAssignment_5_115348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ViewHeader__ImageAssignment_6_115379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ViewSection__TitleAssignment_2_115410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionCell_in_rule__ViewSection__CellsAssignment_315441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCellType_in_rule__SectionCell__TypeAssignment_115472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionIterator_in_rule__SectionCell__IteratorAssignment_2_115503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__SectionCell__TextAssignment_4_115534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__SectionCell__DetailsAssignment_5_115565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__SectionCell__ImageAssignment_6_115596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewAction_in_rule__SectionCell__ActionAssignment_7_115627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_rule__CollectionIterator__CollectionAssignment_015658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CollectionIterator__NameAssignment_215689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarExpression_in_rule__ExternalOpen__UrlAssignment15720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ViewCall__ViewAssignment_015755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProviderConstruction_in_rule__ViewCall__ProviderAssignment_215790 = new BitSet(new long[]{0x0000000000000002L});

}