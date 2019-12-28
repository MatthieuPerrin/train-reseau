package fr.perrin.trains.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.perrin.trains.services.ReseauGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReseauParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "';'", "'+'", "'-'", "'*'", "'/'", "'\\u00B0'", "'^'", "'('", "')'", "','", "'~'", "'nord'", "'sud'", "'est'", "'ouest'", "'pi'", "'e'", "'i'", "'x'", "'y'", "'longueur'", "'angle'", "'argument'", "'inter'", "'['", "']'", "'<'", "'>'", "'segment'", "'{'", "'}'", "'->'", "'<->'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_NUMBER=5;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalReseauParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReseauParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReseauParser.tokenNames; }
    public String getGrammarFileName() { return "InternalReseau.g"; }


    	private ReseauGrammarAccess grammarAccess;

    	public void setGrammarAccess(ReseauGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalReseau.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalReseau.g:54:1: ( ruleModel EOF )
            // InternalReseau.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalReseau.g:62:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:66:2: ( ( ( rule__Model__Alternatives )* ) )
            // InternalReseau.g:67:2: ( ( rule__Model__Alternatives )* )
            {
            // InternalReseau.g:67:2: ( ( rule__Model__Alternatives )* )
            // InternalReseau.g:68:3: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalReseau.g:69:3: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==41) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReseau.g:69:4: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDeclarationPoint"
    // InternalReseau.g:78:1: entryRuleDeclarationPoint : ruleDeclarationPoint EOF ;
    public final void entryRuleDeclarationPoint() throws RecognitionException {
        try {
            // InternalReseau.g:79:1: ( ruleDeclarationPoint EOF )
            // InternalReseau.g:80:1: ruleDeclarationPoint EOF
            {
             before(grammarAccess.getDeclarationPointRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclarationPoint();

            state._fsp--;

             after(grammarAccess.getDeclarationPointRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclarationPoint"


    // $ANTLR start "ruleDeclarationPoint"
    // InternalReseau.g:87:1: ruleDeclarationPoint : ( ( rule__DeclarationPoint__Group__0 ) ) ;
    public final void ruleDeclarationPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:91:2: ( ( ( rule__DeclarationPoint__Group__0 ) ) )
            // InternalReseau.g:92:2: ( ( rule__DeclarationPoint__Group__0 ) )
            {
            // InternalReseau.g:92:2: ( ( rule__DeclarationPoint__Group__0 ) )
            // InternalReseau.g:93:3: ( rule__DeclarationPoint__Group__0 )
            {
             before(grammarAccess.getDeclarationPointAccess().getGroup()); 
            // InternalReseau.g:94:3: ( rule__DeclarationPoint__Group__0 )
            // InternalReseau.g:94:4: rule__DeclarationPoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeclarationPoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclarationPoint"


    // $ANTLR start "entryRulePoint"
    // InternalReseau.g:103:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // InternalReseau.g:104:1: ( rulePoint EOF )
            // InternalReseau.g:105:1: rulePoint EOF
            {
             before(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPointRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalReseau.g:112:1: rulePoint : ( ruleAddition ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:116:2: ( ( ruleAddition ) )
            // InternalReseau.g:117:2: ( ruleAddition )
            {
            // InternalReseau.g:117:2: ( ruleAddition )
            // InternalReseau.g:118:3: ruleAddition
            {
             before(grammarAccess.getPointAccess().getAdditionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getPointAccess().getAdditionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleAddition"
    // InternalReseau.g:128:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalReseau.g:129:1: ( ruleAddition EOF )
            // InternalReseau.g:130:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalReseau.g:137:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:141:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalReseau.g:142:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalReseau.g:142:2: ( ( rule__Addition__Group__0 ) )
            // InternalReseau.g:143:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalReseau.g:144:3: ( rule__Addition__Group__0 )
            // InternalReseau.g:144:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalReseau.g:153:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalReseau.g:154:1: ( ruleMultiplication EOF )
            // InternalReseau.g:155:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalReseau.g:162:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:166:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalReseau.g:167:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalReseau.g:167:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalReseau.g:168:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalReseau.g:169:3: ( rule__Multiplication__Group__0 )
            // InternalReseau.g:169:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePuissance"
    // InternalReseau.g:178:1: entryRulePuissance : rulePuissance EOF ;
    public final void entryRulePuissance() throws RecognitionException {
        try {
            // InternalReseau.g:179:1: ( rulePuissance EOF )
            // InternalReseau.g:180:1: rulePuissance EOF
            {
             before(grammarAccess.getPuissanceRule()); 
            pushFollow(FOLLOW_1);
            rulePuissance();

            state._fsp--;

             after(grammarAccess.getPuissanceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePuissance"


    // $ANTLR start "rulePuissance"
    // InternalReseau.g:187:1: rulePuissance : ( ( rule__Puissance__Group__0 ) ) ;
    public final void rulePuissance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:191:2: ( ( ( rule__Puissance__Group__0 ) ) )
            // InternalReseau.g:192:2: ( ( rule__Puissance__Group__0 ) )
            {
            // InternalReseau.g:192:2: ( ( rule__Puissance__Group__0 ) )
            // InternalReseau.g:193:3: ( rule__Puissance__Group__0 )
            {
             before(grammarAccess.getPuissanceAccess().getGroup()); 
            // InternalReseau.g:194:3: ( rule__Puissance__Group__0 )
            // InternalReseau.g:194:4: rule__Puissance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Puissance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPuissanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePuissance"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalReseau.g:203:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalReseau.g:204:1: ( rulePrimaryExpression EOF )
            // InternalReseau.g:205:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalReseau.g:212:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:216:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalReseau.g:217:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalReseau.g:217:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalReseau.g:218:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalReseau.g:219:3: ( rule__PrimaryExpression__Alternatives )
            // InternalReseau.g:219:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleLigne"
    // InternalReseau.g:228:1: entryRuleLigne : ruleLigne EOF ;
    public final void entryRuleLigne() throws RecognitionException {
        try {
            // InternalReseau.g:229:1: ( ruleLigne EOF )
            // InternalReseau.g:230:1: ruleLigne EOF
            {
             before(grammarAccess.getLigneRule()); 
            pushFollow(FOLLOW_1);
            ruleLigne();

            state._fsp--;

             after(grammarAccess.getLigneRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLigne"


    // $ANTLR start "ruleLigne"
    // InternalReseau.g:237:1: ruleLigne : ( ( rule__Ligne__Alternatives ) ) ;
    public final void ruleLigne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:241:2: ( ( ( rule__Ligne__Alternatives ) ) )
            // InternalReseau.g:242:2: ( ( rule__Ligne__Alternatives ) )
            {
            // InternalReseau.g:242:2: ( ( rule__Ligne__Alternatives ) )
            // InternalReseau.g:243:3: ( rule__Ligne__Alternatives )
            {
             before(grammarAccess.getLigneAccess().getAlternatives()); 
            // InternalReseau.g:244:3: ( rule__Ligne__Alternatives )
            // InternalReseau.g:244:4: rule__Ligne__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Ligne__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLigneAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLigne"


    // $ANTLR start "entryRuleLigne1"
    // InternalReseau.g:253:1: entryRuleLigne1 : ruleLigne1 EOF ;
    public final void entryRuleLigne1() throws RecognitionException {
        try {
            // InternalReseau.g:254:1: ( ruleLigne1 EOF )
            // InternalReseau.g:255:1: ruleLigne1 EOF
            {
             before(grammarAccess.getLigne1Rule()); 
            pushFollow(FOLLOW_1);
            ruleLigne1();

            state._fsp--;

             after(grammarAccess.getLigne1Rule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLigne1"


    // $ANTLR start "ruleLigne1"
    // InternalReseau.g:262:1: ruleLigne1 : ( ( rule__Ligne1__Group__0 ) ) ;
    public final void ruleLigne1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:266:2: ( ( ( rule__Ligne1__Group__0 ) ) )
            // InternalReseau.g:267:2: ( ( rule__Ligne1__Group__0 ) )
            {
            // InternalReseau.g:267:2: ( ( rule__Ligne1__Group__0 ) )
            // InternalReseau.g:268:3: ( rule__Ligne1__Group__0 )
            {
             before(grammarAccess.getLigne1Access().getGroup()); 
            // InternalReseau.g:269:3: ( rule__Ligne1__Group__0 )
            // InternalReseau.g:269:4: rule__Ligne1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ligne1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLigne1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLigne1"


    // $ANTLR start "entryRuleLigne2"
    // InternalReseau.g:278:1: entryRuleLigne2 : ruleLigne2 EOF ;
    public final void entryRuleLigne2() throws RecognitionException {
        try {
            // InternalReseau.g:279:1: ( ruleLigne2 EOF )
            // InternalReseau.g:280:1: ruleLigne2 EOF
            {
             before(grammarAccess.getLigne2Rule()); 
            pushFollow(FOLLOW_1);
            ruleLigne2();

            state._fsp--;

             after(grammarAccess.getLigne2Rule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLigne2"


    // $ANTLR start "ruleLigne2"
    // InternalReseau.g:287:1: ruleLigne2 : ( ( rule__Ligne2__Group__0 ) ) ;
    public final void ruleLigne2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:291:2: ( ( ( rule__Ligne2__Group__0 ) ) )
            // InternalReseau.g:292:2: ( ( rule__Ligne2__Group__0 ) )
            {
            // InternalReseau.g:292:2: ( ( rule__Ligne2__Group__0 ) )
            // InternalReseau.g:293:3: ( rule__Ligne2__Group__0 )
            {
             before(grammarAccess.getLigne2Access().getGroup()); 
            // InternalReseau.g:294:3: ( rule__Ligne2__Group__0 )
            // InternalReseau.g:294:4: rule__Ligne2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ligne2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLigne2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLigne2"


    // $ANTLR start "entryRuleSegment"
    // InternalReseau.g:303:1: entryRuleSegment : ruleSegment EOF ;
    public final void entryRuleSegment() throws RecognitionException {
        try {
            // InternalReseau.g:304:1: ( ruleSegment EOF )
            // InternalReseau.g:305:1: ruleSegment EOF
            {
             before(grammarAccess.getSegmentRule()); 
            pushFollow(FOLLOW_1);
            ruleSegment();

            state._fsp--;

             after(grammarAccess.getSegmentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSegment"


    // $ANTLR start "ruleSegment"
    // InternalReseau.g:312:1: ruleSegment : ( ( rule__Segment__Group__0 ) ) ;
    public final void ruleSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:316:2: ( ( ( rule__Segment__Group__0 ) ) )
            // InternalReseau.g:317:2: ( ( rule__Segment__Group__0 ) )
            {
            // InternalReseau.g:317:2: ( ( rule__Segment__Group__0 ) )
            // InternalReseau.g:318:3: ( rule__Segment__Group__0 )
            {
             before(grammarAccess.getSegmentAccess().getGroup()); 
            // InternalReseau.g:319:3: ( rule__Segment__Group__0 )
            // InternalReseau.g:319:4: rule__Segment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Segment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSegment"


    // $ANTLR start "entryRuleSegmentPart"
    // InternalReseau.g:328:1: entryRuleSegmentPart : ruleSegmentPart EOF ;
    public final void entryRuleSegmentPart() throws RecognitionException {
        try {
            // InternalReseau.g:329:1: ( ruleSegmentPart EOF )
            // InternalReseau.g:330:1: ruleSegmentPart EOF
            {
             before(grammarAccess.getSegmentPartRule()); 
            pushFollow(FOLLOW_1);
            ruleSegmentPart();

            state._fsp--;

             after(grammarAccess.getSegmentPartRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSegmentPart"


    // $ANTLR start "ruleSegmentPart"
    // InternalReseau.g:337:1: ruleSegmentPart : ( ( rule__SegmentPart__Group__0 ) ) ;
    public final void ruleSegmentPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:341:2: ( ( ( rule__SegmentPart__Group__0 ) ) )
            // InternalReseau.g:342:2: ( ( rule__SegmentPart__Group__0 ) )
            {
            // InternalReseau.g:342:2: ( ( rule__SegmentPart__Group__0 ) )
            // InternalReseau.g:343:3: ( rule__SegmentPart__Group__0 )
            {
             before(grammarAccess.getSegmentPartAccess().getGroup()); 
            // InternalReseau.g:344:3: ( rule__SegmentPart__Group__0 )
            // InternalReseau.g:344:4: rule__SegmentPart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SegmentPart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSegmentPartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSegmentPart"


    // $ANTLR start "entryRuleUnidir"
    // InternalReseau.g:353:1: entryRuleUnidir : ruleUnidir EOF ;
    public final void entryRuleUnidir() throws RecognitionException {
        try {
            // InternalReseau.g:354:1: ( ruleUnidir EOF )
            // InternalReseau.g:355:1: ruleUnidir EOF
            {
             before(grammarAccess.getUnidirRule()); 
            pushFollow(FOLLOW_1);
            ruleUnidir();

            state._fsp--;

             after(grammarAccess.getUnidirRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnidir"


    // $ANTLR start "ruleUnidir"
    // InternalReseau.g:362:1: ruleUnidir : ( ( ( rule__Unidir__Group__0 ) ) ( ( rule__Unidir__Group__0 )* ) ) ;
    public final void ruleUnidir() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:366:2: ( ( ( ( rule__Unidir__Group__0 ) ) ( ( rule__Unidir__Group__0 )* ) ) )
            // InternalReseau.g:367:2: ( ( ( rule__Unidir__Group__0 ) ) ( ( rule__Unidir__Group__0 )* ) )
            {
            // InternalReseau.g:367:2: ( ( ( rule__Unidir__Group__0 ) ) ( ( rule__Unidir__Group__0 )* ) )
            // InternalReseau.g:368:3: ( ( rule__Unidir__Group__0 ) ) ( ( rule__Unidir__Group__0 )* )
            {
            // InternalReseau.g:368:3: ( ( rule__Unidir__Group__0 ) )
            // InternalReseau.g:369:4: ( rule__Unidir__Group__0 )
            {
             before(grammarAccess.getUnidirAccess().getGroup()); 
            // InternalReseau.g:370:4: ( rule__Unidir__Group__0 )
            // InternalReseau.g:370:5: rule__Unidir__Group__0
            {
            pushFollow(FOLLOW_4);
            rule__Unidir__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnidirAccess().getGroup()); 

            }

            // InternalReseau.g:373:3: ( ( rule__Unidir__Group__0 )* )
            // InternalReseau.g:374:4: ( rule__Unidir__Group__0 )*
            {
             before(grammarAccess.getUnidirAccess().getGroup()); 
            // InternalReseau.g:375:4: ( rule__Unidir__Group__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==44) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalReseau.g:375:5: rule__Unidir__Group__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Unidir__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getUnidirAccess().getGroup()); 

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
    // $ANTLR end "ruleUnidir"


    // $ANTLR start "entryRuleBidir"
    // InternalReseau.g:385:1: entryRuleBidir : ruleBidir EOF ;
    public final void entryRuleBidir() throws RecognitionException {
        try {
            // InternalReseau.g:386:1: ( ruleBidir EOF )
            // InternalReseau.g:387:1: ruleBidir EOF
            {
             before(grammarAccess.getBidirRule()); 
            pushFollow(FOLLOW_1);
            ruleBidir();

            state._fsp--;

             after(grammarAccess.getBidirRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBidir"


    // $ANTLR start "ruleBidir"
    // InternalReseau.g:394:1: ruleBidir : ( ( ( rule__Bidir__Group__0 ) ) ( ( rule__Bidir__Group__0 )* ) ) ;
    public final void ruleBidir() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:398:2: ( ( ( ( rule__Bidir__Group__0 ) ) ( ( rule__Bidir__Group__0 )* ) ) )
            // InternalReseau.g:399:2: ( ( ( rule__Bidir__Group__0 ) ) ( ( rule__Bidir__Group__0 )* ) )
            {
            // InternalReseau.g:399:2: ( ( ( rule__Bidir__Group__0 ) ) ( ( rule__Bidir__Group__0 )* ) )
            // InternalReseau.g:400:3: ( ( rule__Bidir__Group__0 ) ) ( ( rule__Bidir__Group__0 )* )
            {
            // InternalReseau.g:400:3: ( ( rule__Bidir__Group__0 ) )
            // InternalReseau.g:401:4: ( rule__Bidir__Group__0 )
            {
             before(grammarAccess.getBidirAccess().getGroup()); 
            // InternalReseau.g:402:4: ( rule__Bidir__Group__0 )
            // InternalReseau.g:402:5: rule__Bidir__Group__0
            {
            pushFollow(FOLLOW_5);
            rule__Bidir__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBidirAccess().getGroup()); 

            }

            // InternalReseau.g:405:3: ( ( rule__Bidir__Group__0 )* )
            // InternalReseau.g:406:4: ( rule__Bidir__Group__0 )*
            {
             before(grammarAccess.getBidirAccess().getGroup()); 
            // InternalReseau.g:407:4: ( rule__Bidir__Group__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==45) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalReseau.g:407:5: rule__Bidir__Group__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Bidir__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getBidirAccess().getGroup()); 

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
    // $ANTLR end "ruleBidir"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalReseau.g:416:1: rule__Model__Alternatives : ( ( ( rule__Model__SegmentsAssignment_0 ) ) | ( ( rule__Model__PointsLiaisonAssignment_1 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:420:1: ( ( ( rule__Model__SegmentsAssignment_0 ) ) | ( ( rule__Model__PointsLiaisonAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==41) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalReseau.g:421:2: ( ( rule__Model__SegmentsAssignment_0 ) )
                    {
                    // InternalReseau.g:421:2: ( ( rule__Model__SegmentsAssignment_0 ) )
                    // InternalReseau.g:422:3: ( rule__Model__SegmentsAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getSegmentsAssignment_0()); 
                    // InternalReseau.g:423:3: ( rule__Model__SegmentsAssignment_0 )
                    // InternalReseau.g:423:4: rule__Model__SegmentsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__SegmentsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getSegmentsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReseau.g:427:2: ( ( rule__Model__PointsLiaisonAssignment_1 ) )
                    {
                    // InternalReseau.g:427:2: ( ( rule__Model__PointsLiaisonAssignment_1 ) )
                    // InternalReseau.g:428:3: ( rule__Model__PointsLiaisonAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getPointsLiaisonAssignment_1()); 
                    // InternalReseau.g:429:3: ( rule__Model__PointsLiaisonAssignment_1 )
                    // InternalReseau.g:429:4: rule__Model__PointsLiaisonAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__PointsLiaisonAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getPointsLiaisonAssignment_1()); 

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
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Addition__Alternatives_1_0"
    // InternalReseau.g:437:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:441:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalReseau.g:442:2: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // InternalReseau.g:442:2: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // InternalReseau.g:443:3: ( rule__Addition__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    // InternalReseau.g:444:3: ( rule__Addition__Group_1_0_0__0 )
                    // InternalReseau.g:444:4: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Addition__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReseau.g:448:2: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // InternalReseau.g:448:2: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // InternalReseau.g:449:3: ( rule__Addition__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    // InternalReseau.g:450:3: ( rule__Addition__Group_1_0_1__0 )
                    // InternalReseau.g:450:4: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Addition__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__Addition__Alternatives_1_0"


    // $ANTLR start "rule__Multiplication__Alternatives_1_0"
    // InternalReseau.g:458:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:462:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalReseau.g:463:2: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // InternalReseau.g:463:2: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // InternalReseau.g:464:3: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    // InternalReseau.g:465:3: ( rule__Multiplication__Group_1_0_0__0 )
                    // InternalReseau.g:465:4: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplication__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReseau.g:469:2: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // InternalReseau.g:469:2: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // InternalReseau.g:470:3: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    // InternalReseau.g:471:3: ( rule__Multiplication__Group_1_0_1__0 )
                    // InternalReseau.g:471:4: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplication__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__Multiplication__Alternatives_1_0"


    // $ANTLR start "rule__Puissance__Alternatives_1"
    // InternalReseau.g:479:1: rule__Puissance__Alternatives_1 : ( ( ( rule__Puissance__Group_1_0__0 ) ) | ( ( rule__Puissance__Group_1_1__0 ) ) );
    public final void rule__Puissance__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:483:1: ( ( ( rule__Puissance__Group_1_0__0 ) ) | ( ( rule__Puissance__Group_1_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalReseau.g:484:2: ( ( rule__Puissance__Group_1_0__0 ) )
                    {
                    // InternalReseau.g:484:2: ( ( rule__Puissance__Group_1_0__0 ) )
                    // InternalReseau.g:485:3: ( rule__Puissance__Group_1_0__0 )
                    {
                     before(grammarAccess.getPuissanceAccess().getGroup_1_0()); 
                    // InternalReseau.g:486:3: ( rule__Puissance__Group_1_0__0 )
                    // InternalReseau.g:486:4: rule__Puissance__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Puissance__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPuissanceAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReseau.g:490:2: ( ( rule__Puissance__Group_1_1__0 ) )
                    {
                    // InternalReseau.g:490:2: ( ( rule__Puissance__Group_1_1__0 ) )
                    // InternalReseau.g:491:3: ( rule__Puissance__Group_1_1__0 )
                    {
                     before(grammarAccess.getPuissanceAccess().getGroup_1_1()); 
                    // InternalReseau.g:492:3: ( rule__Puissance__Group_1_1__0 )
                    // InternalReseau.g:492:4: rule__Puissance__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Puissance__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPuissanceAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Puissance__Alternatives_1"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalReseau.g:500:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) | ( ( rule__PrimaryExpression__Group_6__0 ) ) | ( ( rule__PrimaryExpression__Group_7__0 ) ) | ( ( rule__PrimaryExpression__Group_8__0 ) ) | ( ( rule__PrimaryExpression__Group_9__0 ) ) | ( ( rule__PrimaryExpression__Group_10__0 ) ) | ( ( rule__PrimaryExpression__Group_11__0 ) ) | ( ( rule__PrimaryExpression__Group_12__0 ) ) | ( ( rule__PrimaryExpression__Group_13__0 ) ) | ( ( rule__PrimaryExpression__Group_14__0 ) ) | ( ( rule__PrimaryExpression__Group_15__0 ) ) | ( ( rule__PrimaryExpression__Group_16__0 ) ) | ( ( rule__PrimaryExpression__Group_17__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:504:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) | ( ( rule__PrimaryExpression__Group_6__0 ) ) | ( ( rule__PrimaryExpression__Group_7__0 ) ) | ( ( rule__PrimaryExpression__Group_8__0 ) ) | ( ( rule__PrimaryExpression__Group_9__0 ) ) | ( ( rule__PrimaryExpression__Group_10__0 ) ) | ( ( rule__PrimaryExpression__Group_11__0 ) ) | ( ( rule__PrimaryExpression__Group_12__0 ) ) | ( ( rule__PrimaryExpression__Group_13__0 ) ) | ( ( rule__PrimaryExpression__Group_14__0 ) ) | ( ( rule__PrimaryExpression__Group_15__0 ) ) | ( ( rule__PrimaryExpression__Group_16__0 ) ) | ( ( rule__PrimaryExpression__Group_17__0 ) ) )
            int alt8=18;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt8=2;
                }
                break;
            case 15:
                {
                alt8=3;
                }
                break;
            case RULE_ID:
                {
                alt8=4;
                }
                break;
            case 23:
                {
                alt8=5;
                }
                break;
            case 24:
                {
                alt8=6;
                }
                break;
            case 25:
                {
                alt8=7;
                }
                break;
            case 26:
                {
                alt8=8;
                }
                break;
            case 27:
                {
                alt8=9;
                }
                break;
            case 28:
                {
                alt8=10;
                }
                break;
            case 29:
                {
                alt8=11;
                }
                break;
            case 30:
                {
                alt8=12;
                }
                break;
            case 31:
                {
                alt8=13;
                }
                break;
            case 32:
                {
                alt8=14;
                }
                break;
            case 33:
                {
                alt8=15;
                }
                break;
            case 34:
                {
                alt8=16;
                }
                break;
            case 35:
                {
                alt8=17;
                }
                break;
            case 37:
            case 39:
                {
                alt8=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalReseau.g:505:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalReseau.g:505:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalReseau.g:506:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // InternalReseau.g:507:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalReseau.g:507:4: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReseau.g:511:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalReseau.g:511:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalReseau.g:512:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // InternalReseau.g:513:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalReseau.g:513:4: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReseau.g:517:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalReseau.g:517:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalReseau.g:518:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalReseau.g:519:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalReseau.g:519:4: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalReseau.g:523:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // InternalReseau.g:523:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // InternalReseau.g:524:3: ( rule__PrimaryExpression__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    // InternalReseau.g:525:3: ( rule__PrimaryExpression__Group_3__0 )
                    // InternalReseau.g:525:4: rule__PrimaryExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalReseau.g:529:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    {
                    // InternalReseau.g:529:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    // InternalReseau.g:530:3: ( rule__PrimaryExpression__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 
                    // InternalReseau.g:531:3: ( rule__PrimaryExpression__Group_4__0 )
                    // InternalReseau.g:531:4: rule__PrimaryExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalReseau.g:535:2: ( ( rule__PrimaryExpression__Group_5__0 ) )
                    {
                    // InternalReseau.g:535:2: ( ( rule__PrimaryExpression__Group_5__0 ) )
                    // InternalReseau.g:536:3: ( rule__PrimaryExpression__Group_5__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_5()); 
                    // InternalReseau.g:537:3: ( rule__PrimaryExpression__Group_5__0 )
                    // InternalReseau.g:537:4: rule__PrimaryExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalReseau.g:541:2: ( ( rule__PrimaryExpression__Group_6__0 ) )
                    {
                    // InternalReseau.g:541:2: ( ( rule__PrimaryExpression__Group_6__0 ) )
                    // InternalReseau.g:542:3: ( rule__PrimaryExpression__Group_6__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_6()); 
                    // InternalReseau.g:543:3: ( rule__PrimaryExpression__Group_6__0 )
                    // InternalReseau.g:543:4: rule__PrimaryExpression__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalReseau.g:547:2: ( ( rule__PrimaryExpression__Group_7__0 ) )
                    {
                    // InternalReseau.g:547:2: ( ( rule__PrimaryExpression__Group_7__0 ) )
                    // InternalReseau.g:548:3: ( rule__PrimaryExpression__Group_7__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_7()); 
                    // InternalReseau.g:549:3: ( rule__PrimaryExpression__Group_7__0 )
                    // InternalReseau.g:549:4: rule__PrimaryExpression__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalReseau.g:553:2: ( ( rule__PrimaryExpression__Group_8__0 ) )
                    {
                    // InternalReseau.g:553:2: ( ( rule__PrimaryExpression__Group_8__0 ) )
                    // InternalReseau.g:554:3: ( rule__PrimaryExpression__Group_8__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_8()); 
                    // InternalReseau.g:555:3: ( rule__PrimaryExpression__Group_8__0 )
                    // InternalReseau.g:555:4: rule__PrimaryExpression__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalReseau.g:559:2: ( ( rule__PrimaryExpression__Group_9__0 ) )
                    {
                    // InternalReseau.g:559:2: ( ( rule__PrimaryExpression__Group_9__0 ) )
                    // InternalReseau.g:560:3: ( rule__PrimaryExpression__Group_9__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_9()); 
                    // InternalReseau.g:561:3: ( rule__PrimaryExpression__Group_9__0 )
                    // InternalReseau.g:561:4: rule__PrimaryExpression__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalReseau.g:565:2: ( ( rule__PrimaryExpression__Group_10__0 ) )
                    {
                    // InternalReseau.g:565:2: ( ( rule__PrimaryExpression__Group_10__0 ) )
                    // InternalReseau.g:566:3: ( rule__PrimaryExpression__Group_10__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_10()); 
                    // InternalReseau.g:567:3: ( rule__PrimaryExpression__Group_10__0 )
                    // InternalReseau.g:567:4: rule__PrimaryExpression__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_10__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalReseau.g:571:2: ( ( rule__PrimaryExpression__Group_11__0 ) )
                    {
                    // InternalReseau.g:571:2: ( ( rule__PrimaryExpression__Group_11__0 ) )
                    // InternalReseau.g:572:3: ( rule__PrimaryExpression__Group_11__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_11()); 
                    // InternalReseau.g:573:3: ( rule__PrimaryExpression__Group_11__0 )
                    // InternalReseau.g:573:4: rule__PrimaryExpression__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_11__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalReseau.g:577:2: ( ( rule__PrimaryExpression__Group_12__0 ) )
                    {
                    // InternalReseau.g:577:2: ( ( rule__PrimaryExpression__Group_12__0 ) )
                    // InternalReseau.g:578:3: ( rule__PrimaryExpression__Group_12__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_12()); 
                    // InternalReseau.g:579:3: ( rule__PrimaryExpression__Group_12__0 )
                    // InternalReseau.g:579:4: rule__PrimaryExpression__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_12__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalReseau.g:583:2: ( ( rule__PrimaryExpression__Group_13__0 ) )
                    {
                    // InternalReseau.g:583:2: ( ( rule__PrimaryExpression__Group_13__0 ) )
                    // InternalReseau.g:584:3: ( rule__PrimaryExpression__Group_13__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_13()); 
                    // InternalReseau.g:585:3: ( rule__PrimaryExpression__Group_13__0 )
                    // InternalReseau.g:585:4: rule__PrimaryExpression__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_13__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalReseau.g:589:2: ( ( rule__PrimaryExpression__Group_14__0 ) )
                    {
                    // InternalReseau.g:589:2: ( ( rule__PrimaryExpression__Group_14__0 ) )
                    // InternalReseau.g:590:3: ( rule__PrimaryExpression__Group_14__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_14()); 
                    // InternalReseau.g:591:3: ( rule__PrimaryExpression__Group_14__0 )
                    // InternalReseau.g:591:4: rule__PrimaryExpression__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_14__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalReseau.g:595:2: ( ( rule__PrimaryExpression__Group_15__0 ) )
                    {
                    // InternalReseau.g:595:2: ( ( rule__PrimaryExpression__Group_15__0 ) )
                    // InternalReseau.g:596:3: ( rule__PrimaryExpression__Group_15__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_15()); 
                    // InternalReseau.g:597:3: ( rule__PrimaryExpression__Group_15__0 )
                    // InternalReseau.g:597:4: rule__PrimaryExpression__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_15__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalReseau.g:601:2: ( ( rule__PrimaryExpression__Group_16__0 ) )
                    {
                    // InternalReseau.g:601:2: ( ( rule__PrimaryExpression__Group_16__0 ) )
                    // InternalReseau.g:602:3: ( rule__PrimaryExpression__Group_16__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_16()); 
                    // InternalReseau.g:603:3: ( rule__PrimaryExpression__Group_16__0 )
                    // InternalReseau.g:603:4: rule__PrimaryExpression__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_16__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalReseau.g:607:2: ( ( rule__PrimaryExpression__Group_17__0 ) )
                    {
                    // InternalReseau.g:607:2: ( ( rule__PrimaryExpression__Group_17__0 ) )
                    // InternalReseau.g:608:3: ( rule__PrimaryExpression__Group_17__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_17()); 
                    // InternalReseau.g:609:3: ( rule__PrimaryExpression__Group_17__0 )
                    // InternalReseau.g:609:4: rule__PrimaryExpression__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_17__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_17()); 

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__Ligne__Alternatives"
    // InternalReseau.g:617:1: rule__Ligne__Alternatives : ( ( ruleLigne1 ) | ( ruleLigne2 ) );
    public final void rule__Ligne__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:621:1: ( ( ruleLigne1 ) | ( ruleLigne2 ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            else if ( (LA9_0==39) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalReseau.g:622:2: ( ruleLigne1 )
                    {
                    // InternalReseau.g:622:2: ( ruleLigne1 )
                    // InternalReseau.g:623:3: ruleLigne1
                    {
                     before(grammarAccess.getLigneAccess().getLigne1ParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLigne1();

                    state._fsp--;

                     after(grammarAccess.getLigneAccess().getLigne1ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReseau.g:628:2: ( ruleLigne2 )
                    {
                    // InternalReseau.g:628:2: ( ruleLigne2 )
                    // InternalReseau.g:629:3: ruleLigne2
                    {
                     before(grammarAccess.getLigneAccess().getLigne2ParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLigne2();

                    state._fsp--;

                     after(grammarAccess.getLigneAccess().getLigne2ParserRuleCall_1()); 

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
    // $ANTLR end "rule__Ligne__Alternatives"


    // $ANTLR start "rule__SegmentPart__NextAlternatives_1_0"
    // InternalReseau.g:638:1: rule__SegmentPart__NextAlternatives_1_0 : ( ( ruleUnidir ) | ( ruleBidir ) );
    public final void rule__SegmentPart__NextAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:642:1: ( ( ruleUnidir ) | ( ruleBidir ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==44) ) {
                alt10=1;
            }
            else if ( (LA10_0==45) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalReseau.g:643:2: ( ruleUnidir )
                    {
                    // InternalReseau.g:643:2: ( ruleUnidir )
                    // InternalReseau.g:644:3: ruleUnidir
                    {
                     before(grammarAccess.getSegmentPartAccess().getNextUnidirParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUnidir();

                    state._fsp--;

                     after(grammarAccess.getSegmentPartAccess().getNextUnidirParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReseau.g:649:2: ( ruleBidir )
                    {
                    // InternalReseau.g:649:2: ( ruleBidir )
                    // InternalReseau.g:650:3: ruleBidir
                    {
                     before(grammarAccess.getSegmentPartAccess().getNextBidirParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBidir();

                    state._fsp--;

                     after(grammarAccess.getSegmentPartAccess().getNextBidirParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__SegmentPart__NextAlternatives_1_0"


    // $ANTLR start "rule__DeclarationPoint__Group__0"
    // InternalReseau.g:659:1: rule__DeclarationPoint__Group__0 : rule__DeclarationPoint__Group__0__Impl rule__DeclarationPoint__Group__1 ;
    public final void rule__DeclarationPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:663:1: ( rule__DeclarationPoint__Group__0__Impl rule__DeclarationPoint__Group__1 )
            // InternalReseau.g:664:2: rule__DeclarationPoint__Group__0__Impl rule__DeclarationPoint__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DeclarationPoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclarationPoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationPoint__Group__0"


    // $ANTLR start "rule__DeclarationPoint__Group__0__Impl"
    // InternalReseau.g:671:1: rule__DeclarationPoint__Group__0__Impl : ( ( rule__DeclarationPoint__NameAssignment_0 ) ) ;
    public final void rule__DeclarationPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:675:1: ( ( ( rule__DeclarationPoint__NameAssignment_0 ) ) )
            // InternalReseau.g:676:1: ( ( rule__DeclarationPoint__NameAssignment_0 ) )
            {
            // InternalReseau.g:676:1: ( ( rule__DeclarationPoint__NameAssignment_0 ) )
            // InternalReseau.g:677:2: ( rule__DeclarationPoint__NameAssignment_0 )
            {
             before(grammarAccess.getDeclarationPointAccess().getNameAssignment_0()); 
            // InternalReseau.g:678:2: ( rule__DeclarationPoint__NameAssignment_0 )
            // InternalReseau.g:678:3: rule__DeclarationPoint__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DeclarationPoint__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationPointAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationPoint__Group__0__Impl"


    // $ANTLR start "rule__DeclarationPoint__Group__1"
    // InternalReseau.g:686:1: rule__DeclarationPoint__Group__1 : rule__DeclarationPoint__Group__1__Impl rule__DeclarationPoint__Group__2 ;
    public final void rule__DeclarationPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:690:1: ( rule__DeclarationPoint__Group__1__Impl rule__DeclarationPoint__Group__2 )
            // InternalReseau.g:691:2: rule__DeclarationPoint__Group__1__Impl rule__DeclarationPoint__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__DeclarationPoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclarationPoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationPoint__Group__1"


    // $ANTLR start "rule__DeclarationPoint__Group__1__Impl"
    // InternalReseau.g:698:1: rule__DeclarationPoint__Group__1__Impl : ( '=' ) ;
    public final void rule__DeclarationPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:702:1: ( ( '=' ) )
            // InternalReseau.g:703:1: ( '=' )
            {
            // InternalReseau.g:703:1: ( '=' )
            // InternalReseau.g:704:2: '='
            {
             before(grammarAccess.getDeclarationPointAccess().getEqualsSignKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDeclarationPointAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationPoint__Group__1__Impl"


    // $ANTLR start "rule__DeclarationPoint__Group__2"
    // InternalReseau.g:713:1: rule__DeclarationPoint__Group__2 : rule__DeclarationPoint__Group__2__Impl rule__DeclarationPoint__Group__3 ;
    public final void rule__DeclarationPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:717:1: ( rule__DeclarationPoint__Group__2__Impl rule__DeclarationPoint__Group__3 )
            // InternalReseau.g:718:2: rule__DeclarationPoint__Group__2__Impl rule__DeclarationPoint__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__DeclarationPoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclarationPoint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationPoint__Group__2"


    // $ANTLR start "rule__DeclarationPoint__Group__2__Impl"
    // InternalReseau.g:725:1: rule__DeclarationPoint__Group__2__Impl : ( ( rule__DeclarationPoint__XyAssignment_2 ) ) ;
    public final void rule__DeclarationPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:729:1: ( ( ( rule__DeclarationPoint__XyAssignment_2 ) ) )
            // InternalReseau.g:730:1: ( ( rule__DeclarationPoint__XyAssignment_2 ) )
            {
            // InternalReseau.g:730:1: ( ( rule__DeclarationPoint__XyAssignment_2 ) )
            // InternalReseau.g:731:2: ( rule__DeclarationPoint__XyAssignment_2 )
            {
             before(grammarAccess.getDeclarationPointAccess().getXyAssignment_2()); 
            // InternalReseau.g:732:2: ( rule__DeclarationPoint__XyAssignment_2 )
            // InternalReseau.g:732:3: rule__DeclarationPoint__XyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DeclarationPoint__XyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationPointAccess().getXyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationPoint__Group__2__Impl"


    // $ANTLR start "rule__DeclarationPoint__Group__3"
    // InternalReseau.g:740:1: rule__DeclarationPoint__Group__3 : rule__DeclarationPoint__Group__3__Impl ;
    public final void rule__DeclarationPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:744:1: ( rule__DeclarationPoint__Group__3__Impl )
            // InternalReseau.g:745:2: rule__DeclarationPoint__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclarationPoint__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationPoint__Group__3"


    // $ANTLR start "rule__DeclarationPoint__Group__3__Impl"
    // InternalReseau.g:751:1: rule__DeclarationPoint__Group__3__Impl : ( ';' ) ;
    public final void rule__DeclarationPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:755:1: ( ( ';' ) )
            // InternalReseau.g:756:1: ( ';' )
            {
            // InternalReseau.g:756:1: ( ';' )
            // InternalReseau.g:757:2: ';'
            {
             before(grammarAccess.getDeclarationPointAccess().getSemicolonKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDeclarationPointAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationPoint__Group__3__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalReseau.g:767:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:771:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalReseau.g:772:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalReseau.g:779:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:783:1: ( ( ruleMultiplication ) )
            // InternalReseau.g:784:1: ( ruleMultiplication )
            {
            // InternalReseau.g:784:1: ( ruleMultiplication )
            // InternalReseau.g:785:2: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalReseau.g:794:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:798:1: ( rule__Addition__Group__1__Impl )
            // InternalReseau.g:799:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalReseau.g:805:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:809:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalReseau.g:810:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalReseau.g:810:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalReseau.g:811:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalReseau.g:812:2: ( rule__Addition__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=14 && LA11_0<=15)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalReseau.g:812:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalReseau.g:821:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:825:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalReseau.g:826:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalReseau.g:833:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:837:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // InternalReseau.g:838:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // InternalReseau.g:838:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // InternalReseau.g:839:2: ( rule__Addition__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            // InternalReseau.g:840:2: ( rule__Addition__Alternatives_1_0 )
            // InternalReseau.g:840:3: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalReseau.g:848:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:852:1: ( rule__Addition__Group_1__1__Impl )
            // InternalReseau.g:853:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalReseau.g:859:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:863:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // InternalReseau.g:864:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // InternalReseau.g:864:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // InternalReseau.g:865:2: ( rule__Addition__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            // InternalReseau.g:866:2: ( rule__Addition__RightAssignment_1_1 )
            // InternalReseau.g:866:3: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__0"
    // InternalReseau.g:875:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:879:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // InternalReseau.g:880:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_11);
            rule__Addition__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0"


    // $ANTLR start "rule__Addition__Group_1_0_0__0__Impl"
    // InternalReseau.g:887:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:891:1: ( ( () ) )
            // InternalReseau.g:892:1: ( () )
            {
            // InternalReseau.g:892:1: ( () )
            // InternalReseau.g:893:2: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalReseau.g:894:2: ()
            // InternalReseau.g:894:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__1"
    // InternalReseau.g:902:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:906:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // InternalReseau.g:907:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__1"


    // $ANTLR start "rule__Addition__Group_1_0_0__1__Impl"
    // InternalReseau.g:913:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:917:1: ( ( '+' ) )
            // InternalReseau.g:918:1: ( '+' )
            {
            // InternalReseau.g:918:1: ( '+' )
            // InternalReseau.g:919:2: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__0"
    // InternalReseau.g:929:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:933:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // InternalReseau.g:934:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Addition__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0"


    // $ANTLR start "rule__Addition__Group_1_0_1__0__Impl"
    // InternalReseau.g:941:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:945:1: ( ( () ) )
            // InternalReseau.g:946:1: ( () )
            {
            // InternalReseau.g:946:1: ( () )
            // InternalReseau.g:947:2: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalReseau.g:948:2: ()
            // InternalReseau.g:948:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__1"
    // InternalReseau.g:956:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:960:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // InternalReseau.g:961:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__1"


    // $ANTLR start "rule__Addition__Group_1_0_1__1__Impl"
    // InternalReseau.g:967:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:971:1: ( ( '-' ) )
            // InternalReseau.g:972:1: ( '-' )
            {
            // InternalReseau.g:972:1: ( '-' )
            // InternalReseau.g:973:2: '-'
            {
             before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalReseau.g:983:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:987:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalReseau.g:988:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalReseau.g:995:1: rule__Multiplication__Group__0__Impl : ( rulePuissance ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:999:1: ( ( rulePuissance ) )
            // InternalReseau.g:1000:1: ( rulePuissance )
            {
            // InternalReseau.g:1000:1: ( rulePuissance )
            // InternalReseau.g:1001:2: rulePuissance
            {
             before(grammarAccess.getMultiplicationAccess().getPuissanceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePuissance();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getPuissanceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalReseau.g:1010:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1014:1: ( rule__Multiplication__Group__1__Impl )
            // InternalReseau.g:1015:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalReseau.g:1021:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1025:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalReseau.g:1026:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalReseau.g:1026:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalReseau.g:1027:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalReseau.g:1028:2: ( rule__Multiplication__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=16 && LA12_0<=17)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalReseau.g:1028:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalReseau.g:1037:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1041:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalReseau.g:1042:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalReseau.g:1049:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1053:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // InternalReseau.g:1054:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // InternalReseau.g:1054:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // InternalReseau.g:1055:2: ( rule__Multiplication__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            // InternalReseau.g:1056:2: ( rule__Multiplication__Alternatives_1_0 )
            // InternalReseau.g:1056:3: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalReseau.g:1064:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1068:1: ( rule__Multiplication__Group_1__1__Impl )
            // InternalReseau.g:1069:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalReseau.g:1075:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1079:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // InternalReseau.g:1080:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // InternalReseau.g:1080:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // InternalReseau.g:1081:2: ( rule__Multiplication__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            // InternalReseau.g:1082:2: ( rule__Multiplication__RightAssignment_1_1 )
            // InternalReseau.g:1082:3: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0"
    // InternalReseau.g:1091:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1095:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // InternalReseau.g:1096:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_14);
            rule__Multiplication__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0__Impl"
    // InternalReseau.g:1103:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1107:1: ( ( () ) )
            // InternalReseau.g:1108:1: ( () )
            {
            // InternalReseau.g:1108:1: ( () )
            // InternalReseau.g:1109:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            // InternalReseau.g:1110:2: ()
            // InternalReseau.g:1110:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1"
    // InternalReseau.g:1118:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1122:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // InternalReseau.g:1123:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1__Impl"
    // InternalReseau.g:1129:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1133:1: ( ( '*' ) )
            // InternalReseau.g:1134:1: ( '*' )
            {
            // InternalReseau.g:1134:1: ( '*' )
            // InternalReseau.g:1135:2: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0"
    // InternalReseau.g:1145:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1149:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // InternalReseau.g:1150:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Multiplication__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0__Impl"
    // InternalReseau.g:1157:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1161:1: ( ( () ) )
            // InternalReseau.g:1162:1: ( () )
            {
            // InternalReseau.g:1162:1: ( () )
            // InternalReseau.g:1163:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            // InternalReseau.g:1164:2: ()
            // InternalReseau.g:1164:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1"
    // InternalReseau.g:1172:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1176:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // InternalReseau.g:1177:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1__Impl"
    // InternalReseau.g:1183:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1187:1: ( ( '/' ) )
            // InternalReseau.g:1188:1: ( '/' )
            {
            // InternalReseau.g:1188:1: ( '/' )
            // InternalReseau.g:1189:2: '/'
            {
             before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Puissance__Group__0"
    // InternalReseau.g:1199:1: rule__Puissance__Group__0 : rule__Puissance__Group__0__Impl rule__Puissance__Group__1 ;
    public final void rule__Puissance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1203:1: ( rule__Puissance__Group__0__Impl rule__Puissance__Group__1 )
            // InternalReseau.g:1204:2: rule__Puissance__Group__0__Impl rule__Puissance__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Puissance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Puissance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Puissance__Group__0"


    // $ANTLR start "rule__Puissance__Group__0__Impl"
    // InternalReseau.g:1211:1: rule__Puissance__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Puissance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1215:1: ( ( rulePrimaryExpression ) )
            // InternalReseau.g:1216:1: ( rulePrimaryExpression )
            {
            // InternalReseau.g:1216:1: ( rulePrimaryExpression )
            // InternalReseau.g:1217:2: rulePrimaryExpression
            {
             before(grammarAccess.getPuissanceAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPuissanceAccess().getPrimaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Puissance__Group__0__Impl"


    // $ANTLR start "rule__Puissance__Group__1"
    // InternalReseau.g:1226:1: rule__Puissance__Group__1 : rule__Puissance__Group__1__Impl ;
    public final void rule__Puissance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1230:1: ( rule__Puissance__Group__1__Impl )
            // InternalReseau.g:1231:2: rule__Puissance__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Puissance__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Puissance__Group__1"


    // $ANTLR start "rule__Puissance__Group__1__Impl"
    // InternalReseau.g:1237:1: rule__Puissance__Group__1__Impl : ( ( rule__Puissance__Alternatives_1 )? ) ;
    public final void rule__Puissance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1241:1: ( ( ( rule__Puissance__Alternatives_1 )? ) )
            // InternalReseau.g:1242:1: ( ( rule__Puissance__Alternatives_1 )? )
            {
            // InternalReseau.g:1242:1: ( ( rule__Puissance__Alternatives_1 )? )
            // InternalReseau.g:1243:2: ( rule__Puissance__Alternatives_1 )?
            {
             before(grammarAccess.getPuissanceAccess().getAlternatives_1()); 
            // InternalReseau.g:1244:2: ( rule__Puissance__Alternatives_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=18 && LA13_0<=19)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalReseau.g:1244:3: rule__Puissance__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Puissance__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPuissanceAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Puissance__Group__1__Impl"


    // $ANTLR start "rule__Puissance__Group_1_0__0"
    // InternalReseau.g:1253:1: rule__Puissance__Group_1_0__0 : rule__Puissance__Group_1_0__0__Impl rule__Puissance__Group_1_0__1 ;
    public final void rule__Puissance__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1257:1: ( rule__Puissance__Group_1_0__0__Impl rule__Puissance__Group_1_0__1 )
            // InternalReseau.g:1258:2: rule__Puissance__Group_1_0__0__Impl rule__Puissance__Group_1_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Puissance__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Puissance__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Puissance__Group_1_0__0"


    // $ANTLR start "rule__Puissance__Group_1_0__0__Impl"
    // InternalReseau.g:1265:1: rule__Puissance__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Puissance__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1269:1: ( ( () ) )
            // InternalReseau.g:1270:1: ( () )
            {
            // InternalReseau.g:1270:1: ( () )
            // InternalReseau.g:1271:2: ()
            {
             before(grammarAccess.getPuissanceAccess().getDegreeLeftAction_1_0_0()); 
            // InternalReseau.g:1272:2: ()
            // InternalReseau.g:1272:3: 
            {
            }

             after(grammarAccess.getPuissanceAccess().getDegreeLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Puissance__Group_1_0__0__Impl"


    // $ANTLR start "rule__Puissance__Group_1_0__1"
    // InternalReseau.g:1280:1: rule__Puissance__Group_1_0__1 : rule__Puissance__Group_1_0__1__Impl ;
    public final void rule__Puissance__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1284:1: ( rule__Puissance__Group_1_0__1__Impl )
            // InternalReseau.g:1285:2: rule__Puissance__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Puissance__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Puissance__Group_1_0__1"


    // $ANTLR start "rule__Puissance__Group_1_0__1__Impl"
    // InternalReseau.g:1291:1: rule__Puissance__Group_1_0__1__Impl : ( '\\u00B0' ) ;
    public final void rule__Puissance__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1295:1: ( ( '\\u00B0' ) )
            // InternalReseau.g:1296:1: ( '\\u00B0' )
            {
            // InternalReseau.g:1296:1: ( '\\u00B0' )
            // InternalReseau.g:1297:2: '\\u00B0'
            {
             before(grammarAccess.getPuissanceAccess().getDegreeSignKeyword_1_0_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPuissanceAccess().getDegreeSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Puissance__Group_1_0__1__Impl"


    // $ANTLR start "rule__Puissance__Group_1_1__0"
    // InternalReseau.g:1307:1: rule__Puissance__Group_1_1__0 : rule__Puissance__Group_1_1__0__Impl rule__Puissance__Group_1_1__1 ;
    public final void rule__Puissance__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1311:1: ( rule__Puissance__Group_1_1__0__Impl rule__Puissance__Group_1_1__1 )
            // InternalReseau.g:1312:2: rule__Puissance__Group_1_1__0__Impl rule__Puissance__Group_1_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Puissance__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Puissance__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Puissance__Group_1_1__0"


    // $ANTLR start "rule__Puissance__Group_1_1__0__Impl"
    // InternalReseau.g:1319:1: rule__Puissance__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Puissance__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1323:1: ( ( () ) )
            // InternalReseau.g:1324:1: ( () )
            {
            // InternalReseau.g:1324:1: ( () )
            // InternalReseau.g:1325:2: ()
            {
             before(grammarAccess.getPuissanceAccess().getPowLeftAction_1_1_0()); 
            // InternalReseau.g:1326:2: ()
            // InternalReseau.g:1326:3: 
            {
            }

             after(grammarAccess.getPuissanceAccess().getPowLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Puissance__Group_1_1__0__Impl"


    // $ANTLR start "rule__Puissance__Group_1_1__1"
    // InternalReseau.g:1334:1: rule__Puissance__Group_1_1__1 : rule__Puissance__Group_1_1__1__Impl rule__Puissance__Group_1_1__2 ;
    public final void rule__Puissance__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1338:1: ( rule__Puissance__Group_1_1__1__Impl rule__Puissance__Group_1_1__2 )
            // InternalReseau.g:1339:2: rule__Puissance__Group_1_1__1__Impl rule__Puissance__Group_1_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Puissance__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Puissance__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Puissance__Group_1_1__1"


    // $ANTLR start "rule__Puissance__Group_1_1__1__Impl"
    // InternalReseau.g:1346:1: rule__Puissance__Group_1_1__1__Impl : ( '^' ) ;
    public final void rule__Puissance__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1350:1: ( ( '^' ) )
            // InternalReseau.g:1351:1: ( '^' )
            {
            // InternalReseau.g:1351:1: ( '^' )
            // InternalReseau.g:1352:2: '^'
            {
             before(grammarAccess.getPuissanceAccess().getCircumflexAccentKeyword_1_1_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPuissanceAccess().getCircumflexAccentKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Puissance__Group_1_1__1__Impl"


    // $ANTLR start "rule__Puissance__Group_1_1__2"
    // InternalReseau.g:1361:1: rule__Puissance__Group_1_1__2 : rule__Puissance__Group_1_1__2__Impl ;
    public final void rule__Puissance__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1365:1: ( rule__Puissance__Group_1_1__2__Impl )
            // InternalReseau.g:1366:2: rule__Puissance__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Puissance__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Puissance__Group_1_1__2"


    // $ANTLR start "rule__Puissance__Group_1_1__2__Impl"
    // InternalReseau.g:1372:1: rule__Puissance__Group_1_1__2__Impl : ( ( rule__Puissance__RightAssignment_1_1_2 ) ) ;
    public final void rule__Puissance__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1376:1: ( ( ( rule__Puissance__RightAssignment_1_1_2 ) ) )
            // InternalReseau.g:1377:1: ( ( rule__Puissance__RightAssignment_1_1_2 ) )
            {
            // InternalReseau.g:1377:1: ( ( rule__Puissance__RightAssignment_1_1_2 ) )
            // InternalReseau.g:1378:2: ( rule__Puissance__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getPuissanceAccess().getRightAssignment_1_1_2()); 
            // InternalReseau.g:1379:2: ( rule__Puissance__RightAssignment_1_1_2 )
            // InternalReseau.g:1379:3: rule__Puissance__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Puissance__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPuissanceAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Puissance__Group_1_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // InternalReseau.g:1388:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1392:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalReseau.g:1393:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // InternalReseau.g:1400:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1404:1: ( ( '(' ) )
            // InternalReseau.g:1405:1: ( '(' )
            {
            // InternalReseau.g:1405:1: ( '(' )
            // InternalReseau.g:1406:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // InternalReseau.g:1415:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1419:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalReseau.g:1420:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_17);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // InternalReseau.g:1427:1: rule__PrimaryExpression__Group_0__1__Impl : ( rulePoint ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1431:1: ( ( rulePoint ) )
            // InternalReseau.g:1432:1: ( rulePoint )
            {
            // InternalReseau.g:1432:1: ( rulePoint )
            // InternalReseau.g:1433:2: rulePoint
            {
             before(grammarAccess.getPrimaryExpressionAccess().getPointParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getPointParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2"
    // InternalReseau.g:1442:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl rule__PrimaryExpression__Group_0__3 ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1446:1: ( rule__PrimaryExpression__Group_0__2__Impl rule__PrimaryExpression__Group_0__3 )
            // InternalReseau.g:1447:2: rule__PrimaryExpression__Group_0__2__Impl rule__PrimaryExpression__Group_0__3
            {
            pushFollow(FOLLOW_17);
            rule__PrimaryExpression__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2__Impl"
    // InternalReseau.g:1454:1: rule__PrimaryExpression__Group_0__2__Impl : ( ( rule__PrimaryExpression__Group_0_2__0 )? ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1458:1: ( ( ( rule__PrimaryExpression__Group_0_2__0 )? ) )
            // InternalReseau.g:1459:1: ( ( rule__PrimaryExpression__Group_0_2__0 )? )
            {
            // InternalReseau.g:1459:1: ( ( rule__PrimaryExpression__Group_0_2__0 )? )
            // InternalReseau.g:1460:2: ( rule__PrimaryExpression__Group_0_2__0 )?
            {
             before(grammarAccess.getPrimaryExpressionAccess().getGroup_0_2()); 
            // InternalReseau.g:1461:2: ( rule__PrimaryExpression__Group_0_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalReseau.g:1461:3: rule__PrimaryExpression__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimaryExpressionAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__3"
    // InternalReseau.g:1469:1: rule__PrimaryExpression__Group_0__3 : rule__PrimaryExpression__Group_0__3__Impl ;
    public final void rule__PrimaryExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1473:1: ( rule__PrimaryExpression__Group_0__3__Impl )
            // InternalReseau.g:1474:2: rule__PrimaryExpression__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__3"


    // $ANTLR start "rule__PrimaryExpression__Group_0__3__Impl"
    // InternalReseau.g:1480:1: rule__PrimaryExpression__Group_0__3__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1484:1: ( ( ')' ) )
            // InternalReseau.g:1485:1: ( ')' )
            {
            // InternalReseau.g:1485:1: ( ')' )
            // InternalReseau.g:1486:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__3__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0_2__0"
    // InternalReseau.g:1496:1: rule__PrimaryExpression__Group_0_2__0 : rule__PrimaryExpression__Group_0_2__0__Impl rule__PrimaryExpression__Group_0_2__1 ;
    public final void rule__PrimaryExpression__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1500:1: ( rule__PrimaryExpression__Group_0_2__0__Impl rule__PrimaryExpression__Group_0_2__1 )
            // InternalReseau.g:1501:2: rule__PrimaryExpression__Group_0_2__0__Impl rule__PrimaryExpression__Group_0_2__1
            {
            pushFollow(FOLLOW_18);
            rule__PrimaryExpression__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0_2__0__Impl"
    // InternalReseau.g:1508:1: rule__PrimaryExpression__Group_0_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1512:1: ( ( () ) )
            // InternalReseau.g:1513:1: ( () )
            {
            // InternalReseau.g:1513:1: ( () )
            // InternalReseau.g:1514:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getCoordonneeLiteralLeftAction_0_2_0()); 
            // InternalReseau.g:1515:2: ()
            // InternalReseau.g:1515:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getCoordonneeLiteralLeftAction_0_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0_2__1"
    // InternalReseau.g:1523:1: rule__PrimaryExpression__Group_0_2__1 : rule__PrimaryExpression__Group_0_2__1__Impl rule__PrimaryExpression__Group_0_2__2 ;
    public final void rule__PrimaryExpression__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1527:1: ( rule__PrimaryExpression__Group_0_2__1__Impl rule__PrimaryExpression__Group_0_2__2 )
            // InternalReseau.g:1528:2: rule__PrimaryExpression__Group_0_2__1__Impl rule__PrimaryExpression__Group_0_2__2
            {
            pushFollow(FOLLOW_7);
            rule__PrimaryExpression__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0_2__1__Impl"
    // InternalReseau.g:1535:1: rule__PrimaryExpression__Group_0_2__1__Impl : ( ',' ) ;
    public final void rule__PrimaryExpression__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1539:1: ( ( ',' ) )
            // InternalReseau.g:1540:1: ( ',' )
            {
            // InternalReseau.g:1540:1: ( ',' )
            // InternalReseau.g:1541:2: ','
            {
             before(grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_0_2_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0_2__2"
    // InternalReseau.g:1550:1: rule__PrimaryExpression__Group_0_2__2 : rule__PrimaryExpression__Group_0_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1554:1: ( rule__PrimaryExpression__Group_0_2__2__Impl )
            // InternalReseau.g:1555:2: rule__PrimaryExpression__Group_0_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0_2__2"


    // $ANTLR start "rule__PrimaryExpression__Group_0_2__2__Impl"
    // InternalReseau.g:1561:1: rule__PrimaryExpression__Group_0_2__2__Impl : ( ( rule__PrimaryExpression__RightAssignment_0_2_2 ) ) ;
    public final void rule__PrimaryExpression__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1565:1: ( ( ( rule__PrimaryExpression__RightAssignment_0_2_2 ) ) )
            // InternalReseau.g:1566:1: ( ( rule__PrimaryExpression__RightAssignment_0_2_2 ) )
            {
            // InternalReseau.g:1566:1: ( ( rule__PrimaryExpression__RightAssignment_0_2_2 ) )
            // InternalReseau.g:1567:2: ( rule__PrimaryExpression__RightAssignment_0_2_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightAssignment_0_2_2()); 
            // InternalReseau.g:1568:2: ( rule__PrimaryExpression__RightAssignment_0_2_2 )
            // InternalReseau.g:1568:3: rule__PrimaryExpression__RightAssignment_0_2_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__RightAssignment_0_2_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getRightAssignment_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0_2__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0"
    // InternalReseau.g:1577:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1581:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalReseau.g:1582:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0__Impl"
    // InternalReseau.g:1589:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1593:1: ( ( () ) )
            // InternalReseau.g:1594:1: ( () )
            {
            // InternalReseau.g:1594:1: ( () )
            // InternalReseau.g:1595:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0()); 
            // InternalReseau.g:1596:2: ()
            // InternalReseau.g:1596:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1"
    // InternalReseau.g:1604:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1608:1: ( rule__PrimaryExpression__Group_1__1__Impl )
            // InternalReseau.g:1609:2: rule__PrimaryExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1__Impl"
    // InternalReseau.g:1615:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1619:1: ( ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) )
            // InternalReseau.g:1620:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            {
            // InternalReseau.g:1620:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            // InternalReseau.g:1621:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 
            // InternalReseau.g:1622:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            // InternalReseau.g:1622:3: rule__PrimaryExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0"
    // InternalReseau.g:1631:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1635:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalReseau.g:1636:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0__Impl"
    // InternalReseau.g:1643:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1647:1: ( ( () ) )
            // InternalReseau.g:1648:1: ( () )
            {
            // InternalReseau.g:1648:1: ( () )
            // InternalReseau.g:1649:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNegativeAction_2_0()); 
            // InternalReseau.g:1650:2: ()
            // InternalReseau.g:1650:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getNegativeAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1"
    // InternalReseau.g:1658:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1662:1: ( rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 )
            // InternalReseau.g:1663:2: rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2
            {
            pushFollow(FOLLOW_7);
            rule__PrimaryExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1__Impl"
    // InternalReseau.g:1670:1: rule__PrimaryExpression__Group_2__1__Impl : ( '-' ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1674:1: ( ( '-' ) )
            // InternalReseau.g:1675:1: ( '-' )
            {
            // InternalReseau.g:1675:1: ( '-' )
            // InternalReseau.g:1676:2: '-'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getHyphenMinusKeyword_2_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getHyphenMinusKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2"
    // InternalReseau.g:1685:1: rule__PrimaryExpression__Group_2__2 : rule__PrimaryExpression__Group_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1689:1: ( rule__PrimaryExpression__Group_2__2__Impl )
            // InternalReseau.g:1690:2: rule__PrimaryExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__2"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2__Impl"
    // InternalReseau.g:1696:1: rule__PrimaryExpression__Group_2__2__Impl : ( ( rule__PrimaryExpression__ValueAssignment_2_2 ) ) ;
    public final void rule__PrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1700:1: ( ( ( rule__PrimaryExpression__ValueAssignment_2_2 ) ) )
            // InternalReseau.g:1701:1: ( ( rule__PrimaryExpression__ValueAssignment_2_2 ) )
            {
            // InternalReseau.g:1701:1: ( ( rule__PrimaryExpression__ValueAssignment_2_2 ) )
            // InternalReseau.g:1702:2: ( rule__PrimaryExpression__ValueAssignment_2_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_2()); 
            // InternalReseau.g:1703:2: ( rule__PrimaryExpression__ValueAssignment_2_2 )
            // InternalReseau.g:1703:3: rule__PrimaryExpression__ValueAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ValueAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__0"
    // InternalReseau.g:1712:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1716:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // InternalReseau.g:1717:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__PrimaryExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__0"


    // $ANTLR start "rule__PrimaryExpression__Group_3__0__Impl"
    // InternalReseau.g:1724:1: rule__PrimaryExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1728:1: ( ( () ) )
            // InternalReseau.g:1729:1: ( () )
            {
            // InternalReseau.g:1729:1: ( () )
            // InternalReseau.g:1730:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getDeclaredAction_3_0()); 
            // InternalReseau.g:1731:2: ()
            // InternalReseau.g:1731:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getDeclaredAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__1"
    // InternalReseau.g:1739:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1743:1: ( rule__PrimaryExpression__Group_3__1__Impl )
            // InternalReseau.g:1744:2: rule__PrimaryExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__1"


    // $ANTLR start "rule__PrimaryExpression__Group_3__1__Impl"
    // InternalReseau.g:1750:1: rule__PrimaryExpression__Group_3__1__Impl : ( ( rule__PrimaryExpression__DeclAssignment_3_1 ) ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1754:1: ( ( ( rule__PrimaryExpression__DeclAssignment_3_1 ) ) )
            // InternalReseau.g:1755:1: ( ( rule__PrimaryExpression__DeclAssignment_3_1 ) )
            {
            // InternalReseau.g:1755:1: ( ( rule__PrimaryExpression__DeclAssignment_3_1 ) )
            // InternalReseau.g:1756:2: ( rule__PrimaryExpression__DeclAssignment_3_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getDeclAssignment_3_1()); 
            // InternalReseau.g:1757:2: ( rule__PrimaryExpression__DeclAssignment_3_1 )
            // InternalReseau.g:1757:3: rule__PrimaryExpression__DeclAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__DeclAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getDeclAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__0"
    // InternalReseau.g:1766:1: rule__PrimaryExpression__Group_4__0 : rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 ;
    public final void rule__PrimaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1770:1: ( rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 )
            // InternalReseau.g:1771:2: rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__PrimaryExpression__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__0"


    // $ANTLR start "rule__PrimaryExpression__Group_4__0__Impl"
    // InternalReseau.g:1778:1: rule__PrimaryExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1782:1: ( ( () ) )
            // InternalReseau.g:1783:1: ( () )
            {
            // InternalReseau.g:1783:1: ( () )
            // InternalReseau.g:1784:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getDernierAction_4_0()); 
            // InternalReseau.g:1785:2: ()
            // InternalReseau.g:1785:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getDernierAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__1"
    // InternalReseau.g:1793:1: rule__PrimaryExpression__Group_4__1 : rule__PrimaryExpression__Group_4__1__Impl ;
    public final void rule__PrimaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1797:1: ( rule__PrimaryExpression__Group_4__1__Impl )
            // InternalReseau.g:1798:2: rule__PrimaryExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__1"


    // $ANTLR start "rule__PrimaryExpression__Group_4__1__Impl"
    // InternalReseau.g:1804:1: rule__PrimaryExpression__Group_4__1__Impl : ( '~' ) ;
    public final void rule__PrimaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1808:1: ( ( '~' ) )
            // InternalReseau.g:1809:1: ( '~' )
            {
            // InternalReseau.g:1809:1: ( '~' )
            // InternalReseau.g:1810:2: '~'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getTildeKeyword_4_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getTildeKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_4__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_5__0"
    // InternalReseau.g:1820:1: rule__PrimaryExpression__Group_5__0 : rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1 ;
    public final void rule__PrimaryExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1824:1: ( rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1 )
            // InternalReseau.g:1825:2: rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1
            {
            pushFollow(FOLLOW_23);
            rule__PrimaryExpression__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_5__0"


    // $ANTLR start "rule__PrimaryExpression__Group_5__0__Impl"
    // InternalReseau.g:1832:1: rule__PrimaryExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1836:1: ( ( () ) )
            // InternalReseau.g:1837:1: ( () )
            {
            // InternalReseau.g:1837:1: ( () )
            // InternalReseau.g:1838:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNordAction_5_0()); 
            // InternalReseau.g:1839:2: ()
            // InternalReseau.g:1839:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getNordAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_5__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_5__1"
    // InternalReseau.g:1847:1: rule__PrimaryExpression__Group_5__1 : rule__PrimaryExpression__Group_5__1__Impl ;
    public final void rule__PrimaryExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1851:1: ( rule__PrimaryExpression__Group_5__1__Impl )
            // InternalReseau.g:1852:2: rule__PrimaryExpression__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_5__1"


    // $ANTLR start "rule__PrimaryExpression__Group_5__1__Impl"
    // InternalReseau.g:1858:1: rule__PrimaryExpression__Group_5__1__Impl : ( 'nord' ) ;
    public final void rule__PrimaryExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1862:1: ( ( 'nord' ) )
            // InternalReseau.g:1863:1: ( 'nord' )
            {
            // InternalReseau.g:1863:1: ( 'nord' )
            // InternalReseau.g:1864:2: 'nord'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNordKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getNordKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_5__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_6__0"
    // InternalReseau.g:1874:1: rule__PrimaryExpression__Group_6__0 : rule__PrimaryExpression__Group_6__0__Impl rule__PrimaryExpression__Group_6__1 ;
    public final void rule__PrimaryExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1878:1: ( rule__PrimaryExpression__Group_6__0__Impl rule__PrimaryExpression__Group_6__1 )
            // InternalReseau.g:1879:2: rule__PrimaryExpression__Group_6__0__Impl rule__PrimaryExpression__Group_6__1
            {
            pushFollow(FOLLOW_24);
            rule__PrimaryExpression__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_6__0"


    // $ANTLR start "rule__PrimaryExpression__Group_6__0__Impl"
    // InternalReseau.g:1886:1: rule__PrimaryExpression__Group_6__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1890:1: ( ( () ) )
            // InternalReseau.g:1891:1: ( () )
            {
            // InternalReseau.g:1891:1: ( () )
            // InternalReseau.g:1892:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getSudAction_6_0()); 
            // InternalReseau.g:1893:2: ()
            // InternalReseau.g:1893:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getSudAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_6__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_6__1"
    // InternalReseau.g:1901:1: rule__PrimaryExpression__Group_6__1 : rule__PrimaryExpression__Group_6__1__Impl ;
    public final void rule__PrimaryExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1905:1: ( rule__PrimaryExpression__Group_6__1__Impl )
            // InternalReseau.g:1906:2: rule__PrimaryExpression__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_6__1"


    // $ANTLR start "rule__PrimaryExpression__Group_6__1__Impl"
    // InternalReseau.g:1912:1: rule__PrimaryExpression__Group_6__1__Impl : ( 'sud' ) ;
    public final void rule__PrimaryExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1916:1: ( ( 'sud' ) )
            // InternalReseau.g:1917:1: ( 'sud' )
            {
            // InternalReseau.g:1917:1: ( 'sud' )
            // InternalReseau.g:1918:2: 'sud'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getSudKeyword_6_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getSudKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_6__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_7__0"
    // InternalReseau.g:1928:1: rule__PrimaryExpression__Group_7__0 : rule__PrimaryExpression__Group_7__0__Impl rule__PrimaryExpression__Group_7__1 ;
    public final void rule__PrimaryExpression__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1932:1: ( rule__PrimaryExpression__Group_7__0__Impl rule__PrimaryExpression__Group_7__1 )
            // InternalReseau.g:1933:2: rule__PrimaryExpression__Group_7__0__Impl rule__PrimaryExpression__Group_7__1
            {
            pushFollow(FOLLOW_25);
            rule__PrimaryExpression__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_7__0"


    // $ANTLR start "rule__PrimaryExpression__Group_7__0__Impl"
    // InternalReseau.g:1940:1: rule__PrimaryExpression__Group_7__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1944:1: ( ( () ) )
            // InternalReseau.g:1945:1: ( () )
            {
            // InternalReseau.g:1945:1: ( () )
            // InternalReseau.g:1946:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getEstAction_7_0()); 
            // InternalReseau.g:1947:2: ()
            // InternalReseau.g:1947:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getEstAction_7_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_7__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_7__1"
    // InternalReseau.g:1955:1: rule__PrimaryExpression__Group_7__1 : rule__PrimaryExpression__Group_7__1__Impl ;
    public final void rule__PrimaryExpression__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1959:1: ( rule__PrimaryExpression__Group_7__1__Impl )
            // InternalReseau.g:1960:2: rule__PrimaryExpression__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_7__1"


    // $ANTLR start "rule__PrimaryExpression__Group_7__1__Impl"
    // InternalReseau.g:1966:1: rule__PrimaryExpression__Group_7__1__Impl : ( 'est' ) ;
    public final void rule__PrimaryExpression__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1970:1: ( ( 'est' ) )
            // InternalReseau.g:1971:1: ( 'est' )
            {
            // InternalReseau.g:1971:1: ( 'est' )
            // InternalReseau.g:1972:2: 'est'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getEstKeyword_7_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getEstKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_7__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_8__0"
    // InternalReseau.g:1982:1: rule__PrimaryExpression__Group_8__0 : rule__PrimaryExpression__Group_8__0__Impl rule__PrimaryExpression__Group_8__1 ;
    public final void rule__PrimaryExpression__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1986:1: ( rule__PrimaryExpression__Group_8__0__Impl rule__PrimaryExpression__Group_8__1 )
            // InternalReseau.g:1987:2: rule__PrimaryExpression__Group_8__0__Impl rule__PrimaryExpression__Group_8__1
            {
            pushFollow(FOLLOW_26);
            rule__PrimaryExpression__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_8__0"


    // $ANTLR start "rule__PrimaryExpression__Group_8__0__Impl"
    // InternalReseau.g:1994:1: rule__PrimaryExpression__Group_8__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1998:1: ( ( () ) )
            // InternalReseau.g:1999:1: ( () )
            {
            // InternalReseau.g:1999:1: ( () )
            // InternalReseau.g:2000:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOuestAction_8_0()); 
            // InternalReseau.g:2001:2: ()
            // InternalReseau.g:2001:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getOuestAction_8_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_8__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_8__1"
    // InternalReseau.g:2009:1: rule__PrimaryExpression__Group_8__1 : rule__PrimaryExpression__Group_8__1__Impl ;
    public final void rule__PrimaryExpression__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2013:1: ( rule__PrimaryExpression__Group_8__1__Impl )
            // InternalReseau.g:2014:2: rule__PrimaryExpression__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_8__1"


    // $ANTLR start "rule__PrimaryExpression__Group_8__1__Impl"
    // InternalReseau.g:2020:1: rule__PrimaryExpression__Group_8__1__Impl : ( 'ouest' ) ;
    public final void rule__PrimaryExpression__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2024:1: ( ( 'ouest' ) )
            // InternalReseau.g:2025:1: ( 'ouest' )
            {
            // InternalReseau.g:2025:1: ( 'ouest' )
            // InternalReseau.g:2026:2: 'ouest'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOuestKeyword_8_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getOuestKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_8__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_9__0"
    // InternalReseau.g:2036:1: rule__PrimaryExpression__Group_9__0 : rule__PrimaryExpression__Group_9__0__Impl rule__PrimaryExpression__Group_9__1 ;
    public final void rule__PrimaryExpression__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2040:1: ( rule__PrimaryExpression__Group_9__0__Impl rule__PrimaryExpression__Group_9__1 )
            // InternalReseau.g:2041:2: rule__PrimaryExpression__Group_9__0__Impl rule__PrimaryExpression__Group_9__1
            {
            pushFollow(FOLLOW_27);
            rule__PrimaryExpression__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_9__0"


    // $ANTLR start "rule__PrimaryExpression__Group_9__0__Impl"
    // InternalReseau.g:2048:1: rule__PrimaryExpression__Group_9__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2052:1: ( ( () ) )
            // InternalReseau.g:2053:1: ( () )
            {
            // InternalReseau.g:2053:1: ( () )
            // InternalReseau.g:2054:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getPiAction_9_0()); 
            // InternalReseau.g:2055:2: ()
            // InternalReseau.g:2055:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getPiAction_9_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_9__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_9__1"
    // InternalReseau.g:2063:1: rule__PrimaryExpression__Group_9__1 : rule__PrimaryExpression__Group_9__1__Impl ;
    public final void rule__PrimaryExpression__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2067:1: ( rule__PrimaryExpression__Group_9__1__Impl )
            // InternalReseau.g:2068:2: rule__PrimaryExpression__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_9__1"


    // $ANTLR start "rule__PrimaryExpression__Group_9__1__Impl"
    // InternalReseau.g:2074:1: rule__PrimaryExpression__Group_9__1__Impl : ( 'pi' ) ;
    public final void rule__PrimaryExpression__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2078:1: ( ( 'pi' ) )
            // InternalReseau.g:2079:1: ( 'pi' )
            {
            // InternalReseau.g:2079:1: ( 'pi' )
            // InternalReseau.g:2080:2: 'pi'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getPiKeyword_9_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getPiKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_9__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_10__0"
    // InternalReseau.g:2090:1: rule__PrimaryExpression__Group_10__0 : rule__PrimaryExpression__Group_10__0__Impl rule__PrimaryExpression__Group_10__1 ;
    public final void rule__PrimaryExpression__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2094:1: ( rule__PrimaryExpression__Group_10__0__Impl rule__PrimaryExpression__Group_10__1 )
            // InternalReseau.g:2095:2: rule__PrimaryExpression__Group_10__0__Impl rule__PrimaryExpression__Group_10__1
            {
            pushFollow(FOLLOW_28);
            rule__PrimaryExpression__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_10__0"


    // $ANTLR start "rule__PrimaryExpression__Group_10__0__Impl"
    // InternalReseau.g:2102:1: rule__PrimaryExpression__Group_10__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2106:1: ( ( () ) )
            // InternalReseau.g:2107:1: ( () )
            {
            // InternalReseau.g:2107:1: ( () )
            // InternalReseau.g:2108:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getEulerAction_10_0()); 
            // InternalReseau.g:2109:2: ()
            // InternalReseau.g:2109:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getEulerAction_10_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_10__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_10__1"
    // InternalReseau.g:2117:1: rule__PrimaryExpression__Group_10__1 : rule__PrimaryExpression__Group_10__1__Impl ;
    public final void rule__PrimaryExpression__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2121:1: ( rule__PrimaryExpression__Group_10__1__Impl )
            // InternalReseau.g:2122:2: rule__PrimaryExpression__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_10__1"


    // $ANTLR start "rule__PrimaryExpression__Group_10__1__Impl"
    // InternalReseau.g:2128:1: rule__PrimaryExpression__Group_10__1__Impl : ( 'e' ) ;
    public final void rule__PrimaryExpression__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2132:1: ( ( 'e' ) )
            // InternalReseau.g:2133:1: ( 'e' )
            {
            // InternalReseau.g:2133:1: ( 'e' )
            // InternalReseau.g:2134:2: 'e'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getEKeyword_10_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getEKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_10__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_11__0"
    // InternalReseau.g:2144:1: rule__PrimaryExpression__Group_11__0 : rule__PrimaryExpression__Group_11__0__Impl rule__PrimaryExpression__Group_11__1 ;
    public final void rule__PrimaryExpression__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2148:1: ( rule__PrimaryExpression__Group_11__0__Impl rule__PrimaryExpression__Group_11__1 )
            // InternalReseau.g:2149:2: rule__PrimaryExpression__Group_11__0__Impl rule__PrimaryExpression__Group_11__1
            {
            pushFollow(FOLLOW_29);
            rule__PrimaryExpression__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_11__0"


    // $ANTLR start "rule__PrimaryExpression__Group_11__0__Impl"
    // InternalReseau.g:2156:1: rule__PrimaryExpression__Group_11__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2160:1: ( ( () ) )
            // InternalReseau.g:2161:1: ( () )
            {
            // InternalReseau.g:2161:1: ( () )
            // InternalReseau.g:2162:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getIAction_11_0()); 
            // InternalReseau.g:2163:2: ()
            // InternalReseau.g:2163:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getIAction_11_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_11__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_11__1"
    // InternalReseau.g:2171:1: rule__PrimaryExpression__Group_11__1 : rule__PrimaryExpression__Group_11__1__Impl ;
    public final void rule__PrimaryExpression__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2175:1: ( rule__PrimaryExpression__Group_11__1__Impl )
            // InternalReseau.g:2176:2: rule__PrimaryExpression__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_11__1"


    // $ANTLR start "rule__PrimaryExpression__Group_11__1__Impl"
    // InternalReseau.g:2182:1: rule__PrimaryExpression__Group_11__1__Impl : ( 'i' ) ;
    public final void rule__PrimaryExpression__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2186:1: ( ( 'i' ) )
            // InternalReseau.g:2187:1: ( 'i' )
            {
            // InternalReseau.g:2187:1: ( 'i' )
            // InternalReseau.g:2188:2: 'i'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getIKeyword_11_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getIKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_11__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_12__0"
    // InternalReseau.g:2198:1: rule__PrimaryExpression__Group_12__0 : rule__PrimaryExpression__Group_12__0__Impl rule__PrimaryExpression__Group_12__1 ;
    public final void rule__PrimaryExpression__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2202:1: ( rule__PrimaryExpression__Group_12__0__Impl rule__PrimaryExpression__Group_12__1 )
            // InternalReseau.g:2203:2: rule__PrimaryExpression__Group_12__0__Impl rule__PrimaryExpression__Group_12__1
            {
            pushFollow(FOLLOW_30);
            rule__PrimaryExpression__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_12__0"


    // $ANTLR start "rule__PrimaryExpression__Group_12__0__Impl"
    // InternalReseau.g:2210:1: rule__PrimaryExpression__Group_12__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2214:1: ( ( () ) )
            // InternalReseau.g:2215:1: ( () )
            {
            // InternalReseau.g:2215:1: ( () )
            // InternalReseau.g:2216:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getXAction_12_0()); 
            // InternalReseau.g:2217:2: ()
            // InternalReseau.g:2217:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getXAction_12_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_12__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_12__1"
    // InternalReseau.g:2225:1: rule__PrimaryExpression__Group_12__1 : rule__PrimaryExpression__Group_12__1__Impl rule__PrimaryExpression__Group_12__2 ;
    public final void rule__PrimaryExpression__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2229:1: ( rule__PrimaryExpression__Group_12__1__Impl rule__PrimaryExpression__Group_12__2 )
            // InternalReseau.g:2230:2: rule__PrimaryExpression__Group_12__1__Impl rule__PrimaryExpression__Group_12__2
            {
            pushFollow(FOLLOW_31);
            rule__PrimaryExpression__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_12__1"


    // $ANTLR start "rule__PrimaryExpression__Group_12__1__Impl"
    // InternalReseau.g:2237:1: rule__PrimaryExpression__Group_12__1__Impl : ( 'x' ) ;
    public final void rule__PrimaryExpression__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2241:1: ( ( 'x' ) )
            // InternalReseau.g:2242:1: ( 'x' )
            {
            // InternalReseau.g:2242:1: ( 'x' )
            // InternalReseau.g:2243:2: 'x'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getXKeyword_12_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getXKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_12__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_12__2"
    // InternalReseau.g:2252:1: rule__PrimaryExpression__Group_12__2 : rule__PrimaryExpression__Group_12__2__Impl rule__PrimaryExpression__Group_12__3 ;
    public final void rule__PrimaryExpression__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2256:1: ( rule__PrimaryExpression__Group_12__2__Impl rule__PrimaryExpression__Group_12__3 )
            // InternalReseau.g:2257:2: rule__PrimaryExpression__Group_12__2__Impl rule__PrimaryExpression__Group_12__3
            {
            pushFollow(FOLLOW_7);
            rule__PrimaryExpression__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_12__2"


    // $ANTLR start "rule__PrimaryExpression__Group_12__2__Impl"
    // InternalReseau.g:2264:1: rule__PrimaryExpression__Group_12__2__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2268:1: ( ( '(' ) )
            // InternalReseau.g:2269:1: ( '(' )
            {
            // InternalReseau.g:2269:1: ( '(' )
            // InternalReseau.g:2270:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_12_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_12__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_12__3"
    // InternalReseau.g:2279:1: rule__PrimaryExpression__Group_12__3 : rule__PrimaryExpression__Group_12__3__Impl rule__PrimaryExpression__Group_12__4 ;
    public final void rule__PrimaryExpression__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2283:1: ( rule__PrimaryExpression__Group_12__3__Impl rule__PrimaryExpression__Group_12__4 )
            // InternalReseau.g:2284:2: rule__PrimaryExpression__Group_12__3__Impl rule__PrimaryExpression__Group_12__4
            {
            pushFollow(FOLLOW_32);
            rule__PrimaryExpression__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_12__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_12__3"


    // $ANTLR start "rule__PrimaryExpression__Group_12__3__Impl"
    // InternalReseau.g:2291:1: rule__PrimaryExpression__Group_12__3__Impl : ( ( rule__PrimaryExpression__ValueAssignment_12_3 ) ) ;
    public final void rule__PrimaryExpression__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2295:1: ( ( ( rule__PrimaryExpression__ValueAssignment_12_3 ) ) )
            // InternalReseau.g:2296:1: ( ( rule__PrimaryExpression__ValueAssignment_12_3 ) )
            {
            // InternalReseau.g:2296:1: ( ( rule__PrimaryExpression__ValueAssignment_12_3 ) )
            // InternalReseau.g:2297:2: ( rule__PrimaryExpression__ValueAssignment_12_3 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_12_3()); 
            // InternalReseau.g:2298:2: ( rule__PrimaryExpression__ValueAssignment_12_3 )
            // InternalReseau.g:2298:3: rule__PrimaryExpression__ValueAssignment_12_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ValueAssignment_12_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_12__3__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_12__4"
    // InternalReseau.g:2306:1: rule__PrimaryExpression__Group_12__4 : rule__PrimaryExpression__Group_12__4__Impl ;
    public final void rule__PrimaryExpression__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2310:1: ( rule__PrimaryExpression__Group_12__4__Impl )
            // InternalReseau.g:2311:2: rule__PrimaryExpression__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_12__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_12__4"


    // $ANTLR start "rule__PrimaryExpression__Group_12__4__Impl"
    // InternalReseau.g:2317:1: rule__PrimaryExpression__Group_12__4__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2321:1: ( ( ')' ) )
            // InternalReseau.g:2322:1: ( ')' )
            {
            // InternalReseau.g:2322:1: ( ')' )
            // InternalReseau.g:2323:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_12_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_12_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_12__4__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_13__0"
    // InternalReseau.g:2333:1: rule__PrimaryExpression__Group_13__0 : rule__PrimaryExpression__Group_13__0__Impl rule__PrimaryExpression__Group_13__1 ;
    public final void rule__PrimaryExpression__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2337:1: ( rule__PrimaryExpression__Group_13__0__Impl rule__PrimaryExpression__Group_13__1 )
            // InternalReseau.g:2338:2: rule__PrimaryExpression__Group_13__0__Impl rule__PrimaryExpression__Group_13__1
            {
            pushFollow(FOLLOW_33);
            rule__PrimaryExpression__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_13__0"


    // $ANTLR start "rule__PrimaryExpression__Group_13__0__Impl"
    // InternalReseau.g:2345:1: rule__PrimaryExpression__Group_13__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2349:1: ( ( () ) )
            // InternalReseau.g:2350:1: ( () )
            {
            // InternalReseau.g:2350:1: ( () )
            // InternalReseau.g:2351:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getYAction_13_0()); 
            // InternalReseau.g:2352:2: ()
            // InternalReseau.g:2352:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getYAction_13_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_13__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_13__1"
    // InternalReseau.g:2360:1: rule__PrimaryExpression__Group_13__1 : rule__PrimaryExpression__Group_13__1__Impl rule__PrimaryExpression__Group_13__2 ;
    public final void rule__PrimaryExpression__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2364:1: ( rule__PrimaryExpression__Group_13__1__Impl rule__PrimaryExpression__Group_13__2 )
            // InternalReseau.g:2365:2: rule__PrimaryExpression__Group_13__1__Impl rule__PrimaryExpression__Group_13__2
            {
            pushFollow(FOLLOW_31);
            rule__PrimaryExpression__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_13__1"


    // $ANTLR start "rule__PrimaryExpression__Group_13__1__Impl"
    // InternalReseau.g:2372:1: rule__PrimaryExpression__Group_13__1__Impl : ( 'y' ) ;
    public final void rule__PrimaryExpression__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2376:1: ( ( 'y' ) )
            // InternalReseau.g:2377:1: ( 'y' )
            {
            // InternalReseau.g:2377:1: ( 'y' )
            // InternalReseau.g:2378:2: 'y'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getYKeyword_13_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getYKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_13__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_13__2"
    // InternalReseau.g:2387:1: rule__PrimaryExpression__Group_13__2 : rule__PrimaryExpression__Group_13__2__Impl rule__PrimaryExpression__Group_13__3 ;
    public final void rule__PrimaryExpression__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2391:1: ( rule__PrimaryExpression__Group_13__2__Impl rule__PrimaryExpression__Group_13__3 )
            // InternalReseau.g:2392:2: rule__PrimaryExpression__Group_13__2__Impl rule__PrimaryExpression__Group_13__3
            {
            pushFollow(FOLLOW_7);
            rule__PrimaryExpression__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_13__2"


    // $ANTLR start "rule__PrimaryExpression__Group_13__2__Impl"
    // InternalReseau.g:2399:1: rule__PrimaryExpression__Group_13__2__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2403:1: ( ( '(' ) )
            // InternalReseau.g:2404:1: ( '(' )
            {
            // InternalReseau.g:2404:1: ( '(' )
            // InternalReseau.g:2405:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_13_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_13__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_13__3"
    // InternalReseau.g:2414:1: rule__PrimaryExpression__Group_13__3 : rule__PrimaryExpression__Group_13__3__Impl rule__PrimaryExpression__Group_13__4 ;
    public final void rule__PrimaryExpression__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2418:1: ( rule__PrimaryExpression__Group_13__3__Impl rule__PrimaryExpression__Group_13__4 )
            // InternalReseau.g:2419:2: rule__PrimaryExpression__Group_13__3__Impl rule__PrimaryExpression__Group_13__4
            {
            pushFollow(FOLLOW_32);
            rule__PrimaryExpression__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_13__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_13__3"


    // $ANTLR start "rule__PrimaryExpression__Group_13__3__Impl"
    // InternalReseau.g:2426:1: rule__PrimaryExpression__Group_13__3__Impl : ( ( rule__PrimaryExpression__ValueAssignment_13_3 ) ) ;
    public final void rule__PrimaryExpression__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2430:1: ( ( ( rule__PrimaryExpression__ValueAssignment_13_3 ) ) )
            // InternalReseau.g:2431:1: ( ( rule__PrimaryExpression__ValueAssignment_13_3 ) )
            {
            // InternalReseau.g:2431:1: ( ( rule__PrimaryExpression__ValueAssignment_13_3 ) )
            // InternalReseau.g:2432:2: ( rule__PrimaryExpression__ValueAssignment_13_3 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_13_3()); 
            // InternalReseau.g:2433:2: ( rule__PrimaryExpression__ValueAssignment_13_3 )
            // InternalReseau.g:2433:3: rule__PrimaryExpression__ValueAssignment_13_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ValueAssignment_13_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_13__3__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_13__4"
    // InternalReseau.g:2441:1: rule__PrimaryExpression__Group_13__4 : rule__PrimaryExpression__Group_13__4__Impl ;
    public final void rule__PrimaryExpression__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2445:1: ( rule__PrimaryExpression__Group_13__4__Impl )
            // InternalReseau.g:2446:2: rule__PrimaryExpression__Group_13__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_13__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_13__4"


    // $ANTLR start "rule__PrimaryExpression__Group_13__4__Impl"
    // InternalReseau.g:2452:1: rule__PrimaryExpression__Group_13__4__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2456:1: ( ( ')' ) )
            // InternalReseau.g:2457:1: ( ')' )
            {
            // InternalReseau.g:2457:1: ( ')' )
            // InternalReseau.g:2458:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_13_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_13_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_13__4__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_14__0"
    // InternalReseau.g:2468:1: rule__PrimaryExpression__Group_14__0 : rule__PrimaryExpression__Group_14__0__Impl rule__PrimaryExpression__Group_14__1 ;
    public final void rule__PrimaryExpression__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2472:1: ( rule__PrimaryExpression__Group_14__0__Impl rule__PrimaryExpression__Group_14__1 )
            // InternalReseau.g:2473:2: rule__PrimaryExpression__Group_14__0__Impl rule__PrimaryExpression__Group_14__1
            {
            pushFollow(FOLLOW_34);
            rule__PrimaryExpression__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_14__0"


    // $ANTLR start "rule__PrimaryExpression__Group_14__0__Impl"
    // InternalReseau.g:2480:1: rule__PrimaryExpression__Group_14__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2484:1: ( ( () ) )
            // InternalReseau.g:2485:1: ( () )
            {
            // InternalReseau.g:2485:1: ( () )
            // InternalReseau.g:2486:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLongueurAction_14_0()); 
            // InternalReseau.g:2487:2: ()
            // InternalReseau.g:2487:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getLongueurAction_14_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_14__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_14__1"
    // InternalReseau.g:2495:1: rule__PrimaryExpression__Group_14__1 : rule__PrimaryExpression__Group_14__1__Impl rule__PrimaryExpression__Group_14__2 ;
    public final void rule__PrimaryExpression__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2499:1: ( rule__PrimaryExpression__Group_14__1__Impl rule__PrimaryExpression__Group_14__2 )
            // InternalReseau.g:2500:2: rule__PrimaryExpression__Group_14__1__Impl rule__PrimaryExpression__Group_14__2
            {
            pushFollow(FOLLOW_31);
            rule__PrimaryExpression__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_14__1"


    // $ANTLR start "rule__PrimaryExpression__Group_14__1__Impl"
    // InternalReseau.g:2507:1: rule__PrimaryExpression__Group_14__1__Impl : ( 'longueur' ) ;
    public final void rule__PrimaryExpression__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2511:1: ( ( 'longueur' ) )
            // InternalReseau.g:2512:1: ( 'longueur' )
            {
            // InternalReseau.g:2512:1: ( 'longueur' )
            // InternalReseau.g:2513:2: 'longueur'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLongueurKeyword_14_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLongueurKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_14__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_14__2"
    // InternalReseau.g:2522:1: rule__PrimaryExpression__Group_14__2 : rule__PrimaryExpression__Group_14__2__Impl rule__PrimaryExpression__Group_14__3 ;
    public final void rule__PrimaryExpression__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2526:1: ( rule__PrimaryExpression__Group_14__2__Impl rule__PrimaryExpression__Group_14__3 )
            // InternalReseau.g:2527:2: rule__PrimaryExpression__Group_14__2__Impl rule__PrimaryExpression__Group_14__3
            {
            pushFollow(FOLLOW_7);
            rule__PrimaryExpression__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_14__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_14__2"


    // $ANTLR start "rule__PrimaryExpression__Group_14__2__Impl"
    // InternalReseau.g:2534:1: rule__PrimaryExpression__Group_14__2__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2538:1: ( ( '(' ) )
            // InternalReseau.g:2539:1: ( '(' )
            {
            // InternalReseau.g:2539:1: ( '(' )
            // InternalReseau.g:2540:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_14_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_14__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_14__3"
    // InternalReseau.g:2549:1: rule__PrimaryExpression__Group_14__3 : rule__PrimaryExpression__Group_14__3__Impl rule__PrimaryExpression__Group_14__4 ;
    public final void rule__PrimaryExpression__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2553:1: ( rule__PrimaryExpression__Group_14__3__Impl rule__PrimaryExpression__Group_14__4 )
            // InternalReseau.g:2554:2: rule__PrimaryExpression__Group_14__3__Impl rule__PrimaryExpression__Group_14__4
            {
            pushFollow(FOLLOW_32);
            rule__PrimaryExpression__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_14__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_14__3"


    // $ANTLR start "rule__PrimaryExpression__Group_14__3__Impl"
    // InternalReseau.g:2561:1: rule__PrimaryExpression__Group_14__3__Impl : ( ( rule__PrimaryExpression__ValueAssignment_14_3 ) ) ;
    public final void rule__PrimaryExpression__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2565:1: ( ( ( rule__PrimaryExpression__ValueAssignment_14_3 ) ) )
            // InternalReseau.g:2566:1: ( ( rule__PrimaryExpression__ValueAssignment_14_3 ) )
            {
            // InternalReseau.g:2566:1: ( ( rule__PrimaryExpression__ValueAssignment_14_3 ) )
            // InternalReseau.g:2567:2: ( rule__PrimaryExpression__ValueAssignment_14_3 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_14_3()); 
            // InternalReseau.g:2568:2: ( rule__PrimaryExpression__ValueAssignment_14_3 )
            // InternalReseau.g:2568:3: rule__PrimaryExpression__ValueAssignment_14_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ValueAssignment_14_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_14_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_14__3__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_14__4"
    // InternalReseau.g:2576:1: rule__PrimaryExpression__Group_14__4 : rule__PrimaryExpression__Group_14__4__Impl ;
    public final void rule__PrimaryExpression__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2580:1: ( rule__PrimaryExpression__Group_14__4__Impl )
            // InternalReseau.g:2581:2: rule__PrimaryExpression__Group_14__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_14__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_14__4"


    // $ANTLR start "rule__PrimaryExpression__Group_14__4__Impl"
    // InternalReseau.g:2587:1: rule__PrimaryExpression__Group_14__4__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2591:1: ( ( ')' ) )
            // InternalReseau.g:2592:1: ( ')' )
            {
            // InternalReseau.g:2592:1: ( ')' )
            // InternalReseau.g:2593:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_14_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_14_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_14__4__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_15__0"
    // InternalReseau.g:2603:1: rule__PrimaryExpression__Group_15__0 : rule__PrimaryExpression__Group_15__0__Impl rule__PrimaryExpression__Group_15__1 ;
    public final void rule__PrimaryExpression__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2607:1: ( rule__PrimaryExpression__Group_15__0__Impl rule__PrimaryExpression__Group_15__1 )
            // InternalReseau.g:2608:2: rule__PrimaryExpression__Group_15__0__Impl rule__PrimaryExpression__Group_15__1
            {
            pushFollow(FOLLOW_35);
            rule__PrimaryExpression__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_15__0"


    // $ANTLR start "rule__PrimaryExpression__Group_15__0__Impl"
    // InternalReseau.g:2615:1: rule__PrimaryExpression__Group_15__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2619:1: ( ( () ) )
            // InternalReseau.g:2620:1: ( () )
            {
            // InternalReseau.g:2620:1: ( () )
            // InternalReseau.g:2621:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAngleAction_15_0()); 
            // InternalReseau.g:2622:2: ()
            // InternalReseau.g:2622:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getAngleAction_15_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_15__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_15__1"
    // InternalReseau.g:2630:1: rule__PrimaryExpression__Group_15__1 : rule__PrimaryExpression__Group_15__1__Impl rule__PrimaryExpression__Group_15__2 ;
    public final void rule__PrimaryExpression__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2634:1: ( rule__PrimaryExpression__Group_15__1__Impl rule__PrimaryExpression__Group_15__2 )
            // InternalReseau.g:2635:2: rule__PrimaryExpression__Group_15__1__Impl rule__PrimaryExpression__Group_15__2
            {
            pushFollow(FOLLOW_31);
            rule__PrimaryExpression__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_15__1"


    // $ANTLR start "rule__PrimaryExpression__Group_15__1__Impl"
    // InternalReseau.g:2642:1: rule__PrimaryExpression__Group_15__1__Impl : ( 'angle' ) ;
    public final void rule__PrimaryExpression__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2646:1: ( ( 'angle' ) )
            // InternalReseau.g:2647:1: ( 'angle' )
            {
            // InternalReseau.g:2647:1: ( 'angle' )
            // InternalReseau.g:2648:2: 'angle'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAngleKeyword_15_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getAngleKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_15__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_15__2"
    // InternalReseau.g:2657:1: rule__PrimaryExpression__Group_15__2 : rule__PrimaryExpression__Group_15__2__Impl rule__PrimaryExpression__Group_15__3 ;
    public final void rule__PrimaryExpression__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2661:1: ( rule__PrimaryExpression__Group_15__2__Impl rule__PrimaryExpression__Group_15__3 )
            // InternalReseau.g:2662:2: rule__PrimaryExpression__Group_15__2__Impl rule__PrimaryExpression__Group_15__3
            {
            pushFollow(FOLLOW_7);
            rule__PrimaryExpression__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_15__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_15__2"


    // $ANTLR start "rule__PrimaryExpression__Group_15__2__Impl"
    // InternalReseau.g:2669:1: rule__PrimaryExpression__Group_15__2__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2673:1: ( ( '(' ) )
            // InternalReseau.g:2674:1: ( '(' )
            {
            // InternalReseau.g:2674:1: ( '(' )
            // InternalReseau.g:2675:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_15_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_15__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_15__3"
    // InternalReseau.g:2684:1: rule__PrimaryExpression__Group_15__3 : rule__PrimaryExpression__Group_15__3__Impl rule__PrimaryExpression__Group_15__4 ;
    public final void rule__PrimaryExpression__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2688:1: ( rule__PrimaryExpression__Group_15__3__Impl rule__PrimaryExpression__Group_15__4 )
            // InternalReseau.g:2689:2: rule__PrimaryExpression__Group_15__3__Impl rule__PrimaryExpression__Group_15__4
            {
            pushFollow(FOLLOW_32);
            rule__PrimaryExpression__Group_15__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_15__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_15__3"


    // $ANTLR start "rule__PrimaryExpression__Group_15__3__Impl"
    // InternalReseau.g:2696:1: rule__PrimaryExpression__Group_15__3__Impl : ( ( rule__PrimaryExpression__ValueAssignment_15_3 ) ) ;
    public final void rule__PrimaryExpression__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2700:1: ( ( ( rule__PrimaryExpression__ValueAssignment_15_3 ) ) )
            // InternalReseau.g:2701:1: ( ( rule__PrimaryExpression__ValueAssignment_15_3 ) )
            {
            // InternalReseau.g:2701:1: ( ( rule__PrimaryExpression__ValueAssignment_15_3 ) )
            // InternalReseau.g:2702:2: ( rule__PrimaryExpression__ValueAssignment_15_3 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_15_3()); 
            // InternalReseau.g:2703:2: ( rule__PrimaryExpression__ValueAssignment_15_3 )
            // InternalReseau.g:2703:3: rule__PrimaryExpression__ValueAssignment_15_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ValueAssignment_15_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_15__3__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_15__4"
    // InternalReseau.g:2711:1: rule__PrimaryExpression__Group_15__4 : rule__PrimaryExpression__Group_15__4__Impl ;
    public final void rule__PrimaryExpression__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2715:1: ( rule__PrimaryExpression__Group_15__4__Impl )
            // InternalReseau.g:2716:2: rule__PrimaryExpression__Group_15__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_15__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_15__4"


    // $ANTLR start "rule__PrimaryExpression__Group_15__4__Impl"
    // InternalReseau.g:2722:1: rule__PrimaryExpression__Group_15__4__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2726:1: ( ( ')' ) )
            // InternalReseau.g:2727:1: ( ')' )
            {
            // InternalReseau.g:2727:1: ( ')' )
            // InternalReseau.g:2728:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_15_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_15_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_15__4__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_16__0"
    // InternalReseau.g:2738:1: rule__PrimaryExpression__Group_16__0 : rule__PrimaryExpression__Group_16__0__Impl rule__PrimaryExpression__Group_16__1 ;
    public final void rule__PrimaryExpression__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2742:1: ( rule__PrimaryExpression__Group_16__0__Impl rule__PrimaryExpression__Group_16__1 )
            // InternalReseau.g:2743:2: rule__PrimaryExpression__Group_16__0__Impl rule__PrimaryExpression__Group_16__1
            {
            pushFollow(FOLLOW_36);
            rule__PrimaryExpression__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_16__0"


    // $ANTLR start "rule__PrimaryExpression__Group_16__0__Impl"
    // InternalReseau.g:2750:1: rule__PrimaryExpression__Group_16__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2754:1: ( ( () ) )
            // InternalReseau.g:2755:1: ( () )
            {
            // InternalReseau.g:2755:1: ( () )
            // InternalReseau.g:2756:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getArgumentAction_16_0()); 
            // InternalReseau.g:2757:2: ()
            // InternalReseau.g:2757:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getArgumentAction_16_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_16__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_16__1"
    // InternalReseau.g:2765:1: rule__PrimaryExpression__Group_16__1 : rule__PrimaryExpression__Group_16__1__Impl rule__PrimaryExpression__Group_16__2 ;
    public final void rule__PrimaryExpression__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2769:1: ( rule__PrimaryExpression__Group_16__1__Impl rule__PrimaryExpression__Group_16__2 )
            // InternalReseau.g:2770:2: rule__PrimaryExpression__Group_16__1__Impl rule__PrimaryExpression__Group_16__2
            {
            pushFollow(FOLLOW_31);
            rule__PrimaryExpression__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_16__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_16__1"


    // $ANTLR start "rule__PrimaryExpression__Group_16__1__Impl"
    // InternalReseau.g:2777:1: rule__PrimaryExpression__Group_16__1__Impl : ( 'argument' ) ;
    public final void rule__PrimaryExpression__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2781:1: ( ( 'argument' ) )
            // InternalReseau.g:2782:1: ( 'argument' )
            {
            // InternalReseau.g:2782:1: ( 'argument' )
            // InternalReseau.g:2783:2: 'argument'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getArgumentKeyword_16_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getArgumentKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_16__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_16__2"
    // InternalReseau.g:2792:1: rule__PrimaryExpression__Group_16__2 : rule__PrimaryExpression__Group_16__2__Impl rule__PrimaryExpression__Group_16__3 ;
    public final void rule__PrimaryExpression__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2796:1: ( rule__PrimaryExpression__Group_16__2__Impl rule__PrimaryExpression__Group_16__3 )
            // InternalReseau.g:2797:2: rule__PrimaryExpression__Group_16__2__Impl rule__PrimaryExpression__Group_16__3
            {
            pushFollow(FOLLOW_7);
            rule__PrimaryExpression__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_16__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_16__2"


    // $ANTLR start "rule__PrimaryExpression__Group_16__2__Impl"
    // InternalReseau.g:2804:1: rule__PrimaryExpression__Group_16__2__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2808:1: ( ( '(' ) )
            // InternalReseau.g:2809:1: ( '(' )
            {
            // InternalReseau.g:2809:1: ( '(' )
            // InternalReseau.g:2810:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_16_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_16_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_16__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_16__3"
    // InternalReseau.g:2819:1: rule__PrimaryExpression__Group_16__3 : rule__PrimaryExpression__Group_16__3__Impl rule__PrimaryExpression__Group_16__4 ;
    public final void rule__PrimaryExpression__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2823:1: ( rule__PrimaryExpression__Group_16__3__Impl rule__PrimaryExpression__Group_16__4 )
            // InternalReseau.g:2824:2: rule__PrimaryExpression__Group_16__3__Impl rule__PrimaryExpression__Group_16__4
            {
            pushFollow(FOLLOW_32);
            rule__PrimaryExpression__Group_16__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_16__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_16__3"


    // $ANTLR start "rule__PrimaryExpression__Group_16__3__Impl"
    // InternalReseau.g:2831:1: rule__PrimaryExpression__Group_16__3__Impl : ( ( rule__PrimaryExpression__ValueAssignment_16_3 ) ) ;
    public final void rule__PrimaryExpression__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2835:1: ( ( ( rule__PrimaryExpression__ValueAssignment_16_3 ) ) )
            // InternalReseau.g:2836:1: ( ( rule__PrimaryExpression__ValueAssignment_16_3 ) )
            {
            // InternalReseau.g:2836:1: ( ( rule__PrimaryExpression__ValueAssignment_16_3 ) )
            // InternalReseau.g:2837:2: ( rule__PrimaryExpression__ValueAssignment_16_3 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_16_3()); 
            // InternalReseau.g:2838:2: ( rule__PrimaryExpression__ValueAssignment_16_3 )
            // InternalReseau.g:2838:3: rule__PrimaryExpression__ValueAssignment_16_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ValueAssignment_16_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_16_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_16__3__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_16__4"
    // InternalReseau.g:2846:1: rule__PrimaryExpression__Group_16__4 : rule__PrimaryExpression__Group_16__4__Impl ;
    public final void rule__PrimaryExpression__Group_16__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2850:1: ( rule__PrimaryExpression__Group_16__4__Impl )
            // InternalReseau.g:2851:2: rule__PrimaryExpression__Group_16__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_16__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_16__4"


    // $ANTLR start "rule__PrimaryExpression__Group_16__4__Impl"
    // InternalReseau.g:2857:1: rule__PrimaryExpression__Group_16__4__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_16__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2861:1: ( ( ')' ) )
            // InternalReseau.g:2862:1: ( ')' )
            {
            // InternalReseau.g:2862:1: ( ')' )
            // InternalReseau.g:2863:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_16_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_16_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_16__4__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_17__0"
    // InternalReseau.g:2873:1: rule__PrimaryExpression__Group_17__0 : rule__PrimaryExpression__Group_17__0__Impl rule__PrimaryExpression__Group_17__1 ;
    public final void rule__PrimaryExpression__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2877:1: ( rule__PrimaryExpression__Group_17__0__Impl rule__PrimaryExpression__Group_17__1 )
            // InternalReseau.g:2878:2: rule__PrimaryExpression__Group_17__0__Impl rule__PrimaryExpression__Group_17__1
            {
            pushFollow(FOLLOW_7);
            rule__PrimaryExpression__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_17__0"


    // $ANTLR start "rule__PrimaryExpression__Group_17__0__Impl"
    // InternalReseau.g:2885:1: rule__PrimaryExpression__Group_17__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2889:1: ( ( () ) )
            // InternalReseau.g:2890:1: ( () )
            {
            // InternalReseau.g:2890:1: ( () )
            // InternalReseau.g:2891:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getIntersectionAction_17_0()); 
            // InternalReseau.g:2892:2: ()
            // InternalReseau.g:2892:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getIntersectionAction_17_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_17__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_17__1"
    // InternalReseau.g:2900:1: rule__PrimaryExpression__Group_17__1 : rule__PrimaryExpression__Group_17__1__Impl rule__PrimaryExpression__Group_17__2 ;
    public final void rule__PrimaryExpression__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2904:1: ( rule__PrimaryExpression__Group_17__1__Impl rule__PrimaryExpression__Group_17__2 )
            // InternalReseau.g:2905:2: rule__PrimaryExpression__Group_17__1__Impl rule__PrimaryExpression__Group_17__2
            {
            pushFollow(FOLLOW_37);
            rule__PrimaryExpression__Group_17__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_17__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_17__1"


    // $ANTLR start "rule__PrimaryExpression__Group_17__1__Impl"
    // InternalReseau.g:2912:1: rule__PrimaryExpression__Group_17__1__Impl : ( ( rule__PrimaryExpression__L1Assignment_17_1 ) ) ;
    public final void rule__PrimaryExpression__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2916:1: ( ( ( rule__PrimaryExpression__L1Assignment_17_1 ) ) )
            // InternalReseau.g:2917:1: ( ( rule__PrimaryExpression__L1Assignment_17_1 ) )
            {
            // InternalReseau.g:2917:1: ( ( rule__PrimaryExpression__L1Assignment_17_1 ) )
            // InternalReseau.g:2918:2: ( rule__PrimaryExpression__L1Assignment_17_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getL1Assignment_17_1()); 
            // InternalReseau.g:2919:2: ( rule__PrimaryExpression__L1Assignment_17_1 )
            // InternalReseau.g:2919:3: rule__PrimaryExpression__L1Assignment_17_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__L1Assignment_17_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getL1Assignment_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_17__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_17__2"
    // InternalReseau.g:2927:1: rule__PrimaryExpression__Group_17__2 : rule__PrimaryExpression__Group_17__2__Impl rule__PrimaryExpression__Group_17__3 ;
    public final void rule__PrimaryExpression__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2931:1: ( rule__PrimaryExpression__Group_17__2__Impl rule__PrimaryExpression__Group_17__3 )
            // InternalReseau.g:2932:2: rule__PrimaryExpression__Group_17__2__Impl rule__PrimaryExpression__Group_17__3
            {
            pushFollow(FOLLOW_7);
            rule__PrimaryExpression__Group_17__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_17__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_17__2"


    // $ANTLR start "rule__PrimaryExpression__Group_17__2__Impl"
    // InternalReseau.g:2939:1: rule__PrimaryExpression__Group_17__2__Impl : ( 'inter' ) ;
    public final void rule__PrimaryExpression__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2943:1: ( ( 'inter' ) )
            // InternalReseau.g:2944:1: ( 'inter' )
            {
            // InternalReseau.g:2944:1: ( 'inter' )
            // InternalReseau.g:2945:2: 'inter'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getInterKeyword_17_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getInterKeyword_17_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_17__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_17__3"
    // InternalReseau.g:2954:1: rule__PrimaryExpression__Group_17__3 : rule__PrimaryExpression__Group_17__3__Impl ;
    public final void rule__PrimaryExpression__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2958:1: ( rule__PrimaryExpression__Group_17__3__Impl )
            // InternalReseau.g:2959:2: rule__PrimaryExpression__Group_17__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_17__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_17__3"


    // $ANTLR start "rule__PrimaryExpression__Group_17__3__Impl"
    // InternalReseau.g:2965:1: rule__PrimaryExpression__Group_17__3__Impl : ( ( rule__PrimaryExpression__L2Assignment_17_3 ) ) ;
    public final void rule__PrimaryExpression__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2969:1: ( ( ( rule__PrimaryExpression__L2Assignment_17_3 ) ) )
            // InternalReseau.g:2970:1: ( ( rule__PrimaryExpression__L2Assignment_17_3 ) )
            {
            // InternalReseau.g:2970:1: ( ( rule__PrimaryExpression__L2Assignment_17_3 ) )
            // InternalReseau.g:2971:2: ( rule__PrimaryExpression__L2Assignment_17_3 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getL2Assignment_17_3()); 
            // InternalReseau.g:2972:2: ( rule__PrimaryExpression__L2Assignment_17_3 )
            // InternalReseau.g:2972:3: rule__PrimaryExpression__L2Assignment_17_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__L2Assignment_17_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getL2Assignment_17_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_17__3__Impl"


    // $ANTLR start "rule__Ligne1__Group__0"
    // InternalReseau.g:2981:1: rule__Ligne1__Group__0 : rule__Ligne1__Group__0__Impl rule__Ligne1__Group__1 ;
    public final void rule__Ligne1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2985:1: ( rule__Ligne1__Group__0__Impl rule__Ligne1__Group__1 )
            // InternalReseau.g:2986:2: rule__Ligne1__Group__0__Impl rule__Ligne1__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Ligne1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ligne1__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne1__Group__0"


    // $ANTLR start "rule__Ligne1__Group__0__Impl"
    // InternalReseau.g:2993:1: rule__Ligne1__Group__0__Impl : ( '[' ) ;
    public final void rule__Ligne1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2997:1: ( ( '[' ) )
            // InternalReseau.g:2998:1: ( '[' )
            {
            // InternalReseau.g:2998:1: ( '[' )
            // InternalReseau.g:2999:2: '['
            {
             before(grammarAccess.getLigne1Access().getLeftSquareBracketKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLigne1Access().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne1__Group__0__Impl"


    // $ANTLR start "rule__Ligne1__Group__1"
    // InternalReseau.g:3008:1: rule__Ligne1__Group__1 : rule__Ligne1__Group__1__Impl rule__Ligne1__Group__2 ;
    public final void rule__Ligne1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3012:1: ( rule__Ligne1__Group__1__Impl rule__Ligne1__Group__2 )
            // InternalReseau.g:3013:2: rule__Ligne1__Group__1__Impl rule__Ligne1__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Ligne1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ligne1__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne1__Group__1"


    // $ANTLR start "rule__Ligne1__Group__1__Impl"
    // InternalReseau.g:3020:1: rule__Ligne1__Group__1__Impl : ( ( rule__Ligne1__P1Assignment_1 ) ) ;
    public final void rule__Ligne1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3024:1: ( ( ( rule__Ligne1__P1Assignment_1 ) ) )
            // InternalReseau.g:3025:1: ( ( rule__Ligne1__P1Assignment_1 ) )
            {
            // InternalReseau.g:3025:1: ( ( rule__Ligne1__P1Assignment_1 ) )
            // InternalReseau.g:3026:2: ( rule__Ligne1__P1Assignment_1 )
            {
             before(grammarAccess.getLigne1Access().getP1Assignment_1()); 
            // InternalReseau.g:3027:2: ( rule__Ligne1__P1Assignment_1 )
            // InternalReseau.g:3027:3: rule__Ligne1__P1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ligne1__P1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLigne1Access().getP1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne1__Group__1__Impl"


    // $ANTLR start "rule__Ligne1__Group__2"
    // InternalReseau.g:3035:1: rule__Ligne1__Group__2 : rule__Ligne1__Group__2__Impl rule__Ligne1__Group__3 ;
    public final void rule__Ligne1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3039:1: ( rule__Ligne1__Group__2__Impl rule__Ligne1__Group__3 )
            // InternalReseau.g:3040:2: rule__Ligne1__Group__2__Impl rule__Ligne1__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Ligne1__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ligne1__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne1__Group__2"


    // $ANTLR start "rule__Ligne1__Group__2__Impl"
    // InternalReseau.g:3047:1: rule__Ligne1__Group__2__Impl : ( ',' ) ;
    public final void rule__Ligne1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3051:1: ( ( ',' ) )
            // InternalReseau.g:3052:1: ( ',' )
            {
            // InternalReseau.g:3052:1: ( ',' )
            // InternalReseau.g:3053:2: ','
            {
             before(grammarAccess.getLigne1Access().getCommaKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLigne1Access().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne1__Group__2__Impl"


    // $ANTLR start "rule__Ligne1__Group__3"
    // InternalReseau.g:3062:1: rule__Ligne1__Group__3 : rule__Ligne1__Group__3__Impl rule__Ligne1__Group__4 ;
    public final void rule__Ligne1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3066:1: ( rule__Ligne1__Group__3__Impl rule__Ligne1__Group__4 )
            // InternalReseau.g:3067:2: rule__Ligne1__Group__3__Impl rule__Ligne1__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__Ligne1__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ligne1__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne1__Group__3"


    // $ANTLR start "rule__Ligne1__Group__3__Impl"
    // InternalReseau.g:3074:1: rule__Ligne1__Group__3__Impl : ( ( rule__Ligne1__P2Assignment_3 ) ) ;
    public final void rule__Ligne1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3078:1: ( ( ( rule__Ligne1__P2Assignment_3 ) ) )
            // InternalReseau.g:3079:1: ( ( rule__Ligne1__P2Assignment_3 ) )
            {
            // InternalReseau.g:3079:1: ( ( rule__Ligne1__P2Assignment_3 ) )
            // InternalReseau.g:3080:2: ( rule__Ligne1__P2Assignment_3 )
            {
             before(grammarAccess.getLigne1Access().getP2Assignment_3()); 
            // InternalReseau.g:3081:2: ( rule__Ligne1__P2Assignment_3 )
            // InternalReseau.g:3081:3: rule__Ligne1__P2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Ligne1__P2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLigne1Access().getP2Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne1__Group__3__Impl"


    // $ANTLR start "rule__Ligne1__Group__4"
    // InternalReseau.g:3089:1: rule__Ligne1__Group__4 : rule__Ligne1__Group__4__Impl ;
    public final void rule__Ligne1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3093:1: ( rule__Ligne1__Group__4__Impl )
            // InternalReseau.g:3094:2: rule__Ligne1__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ligne1__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne1__Group__4"


    // $ANTLR start "rule__Ligne1__Group__4__Impl"
    // InternalReseau.g:3100:1: rule__Ligne1__Group__4__Impl : ( ']' ) ;
    public final void rule__Ligne1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3104:1: ( ( ']' ) )
            // InternalReseau.g:3105:1: ( ']' )
            {
            // InternalReseau.g:3105:1: ( ']' )
            // InternalReseau.g:3106:2: ']'
            {
             before(grammarAccess.getLigne1Access().getRightSquareBracketKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLigne1Access().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne1__Group__4__Impl"


    // $ANTLR start "rule__Ligne2__Group__0"
    // InternalReseau.g:3116:1: rule__Ligne2__Group__0 : rule__Ligne2__Group__0__Impl rule__Ligne2__Group__1 ;
    public final void rule__Ligne2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3120:1: ( rule__Ligne2__Group__0__Impl rule__Ligne2__Group__1 )
            // InternalReseau.g:3121:2: rule__Ligne2__Group__0__Impl rule__Ligne2__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Ligne2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ligne2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne2__Group__0"


    // $ANTLR start "rule__Ligne2__Group__0__Impl"
    // InternalReseau.g:3128:1: rule__Ligne2__Group__0__Impl : ( '<' ) ;
    public final void rule__Ligne2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3132:1: ( ( '<' ) )
            // InternalReseau.g:3133:1: ( '<' )
            {
            // InternalReseau.g:3133:1: ( '<' )
            // InternalReseau.g:3134:2: '<'
            {
             before(grammarAccess.getLigne2Access().getLessThanSignKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLigne2Access().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne2__Group__0__Impl"


    // $ANTLR start "rule__Ligne2__Group__1"
    // InternalReseau.g:3143:1: rule__Ligne2__Group__1 : rule__Ligne2__Group__1__Impl rule__Ligne2__Group__2 ;
    public final void rule__Ligne2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3147:1: ( rule__Ligne2__Group__1__Impl rule__Ligne2__Group__2 )
            // InternalReseau.g:3148:2: rule__Ligne2__Group__1__Impl rule__Ligne2__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Ligne2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ligne2__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne2__Group__1"


    // $ANTLR start "rule__Ligne2__Group__1__Impl"
    // InternalReseau.g:3155:1: rule__Ligne2__Group__1__Impl : ( ( rule__Ligne2__P1Assignment_1 ) ) ;
    public final void rule__Ligne2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3159:1: ( ( ( rule__Ligne2__P1Assignment_1 ) ) )
            // InternalReseau.g:3160:1: ( ( rule__Ligne2__P1Assignment_1 ) )
            {
            // InternalReseau.g:3160:1: ( ( rule__Ligne2__P1Assignment_1 ) )
            // InternalReseau.g:3161:2: ( rule__Ligne2__P1Assignment_1 )
            {
             before(grammarAccess.getLigne2Access().getP1Assignment_1()); 
            // InternalReseau.g:3162:2: ( rule__Ligne2__P1Assignment_1 )
            // InternalReseau.g:3162:3: rule__Ligne2__P1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ligne2__P1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLigne2Access().getP1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne2__Group__1__Impl"


    // $ANTLR start "rule__Ligne2__Group__2"
    // InternalReseau.g:3170:1: rule__Ligne2__Group__2 : rule__Ligne2__Group__2__Impl rule__Ligne2__Group__3 ;
    public final void rule__Ligne2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3174:1: ( rule__Ligne2__Group__2__Impl rule__Ligne2__Group__3 )
            // InternalReseau.g:3175:2: rule__Ligne2__Group__2__Impl rule__Ligne2__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Ligne2__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ligne2__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne2__Group__2"


    // $ANTLR start "rule__Ligne2__Group__2__Impl"
    // InternalReseau.g:3182:1: rule__Ligne2__Group__2__Impl : ( ',' ) ;
    public final void rule__Ligne2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3186:1: ( ( ',' ) )
            // InternalReseau.g:3187:1: ( ',' )
            {
            // InternalReseau.g:3187:1: ( ',' )
            // InternalReseau.g:3188:2: ','
            {
             before(grammarAccess.getLigne2Access().getCommaKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLigne2Access().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne2__Group__2__Impl"


    // $ANTLR start "rule__Ligne2__Group__3"
    // InternalReseau.g:3197:1: rule__Ligne2__Group__3 : rule__Ligne2__Group__3__Impl rule__Ligne2__Group__4 ;
    public final void rule__Ligne2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3201:1: ( rule__Ligne2__Group__3__Impl rule__Ligne2__Group__4 )
            // InternalReseau.g:3202:2: rule__Ligne2__Group__3__Impl rule__Ligne2__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__Ligne2__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ligne2__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne2__Group__3"


    // $ANTLR start "rule__Ligne2__Group__3__Impl"
    // InternalReseau.g:3209:1: rule__Ligne2__Group__3__Impl : ( ( rule__Ligne2__P2Assignment_3 ) ) ;
    public final void rule__Ligne2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3213:1: ( ( ( rule__Ligne2__P2Assignment_3 ) ) )
            // InternalReseau.g:3214:1: ( ( rule__Ligne2__P2Assignment_3 ) )
            {
            // InternalReseau.g:3214:1: ( ( rule__Ligne2__P2Assignment_3 ) )
            // InternalReseau.g:3215:2: ( rule__Ligne2__P2Assignment_3 )
            {
             before(grammarAccess.getLigne2Access().getP2Assignment_3()); 
            // InternalReseau.g:3216:2: ( rule__Ligne2__P2Assignment_3 )
            // InternalReseau.g:3216:3: rule__Ligne2__P2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Ligne2__P2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLigne2Access().getP2Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne2__Group__3__Impl"


    // $ANTLR start "rule__Ligne2__Group__4"
    // InternalReseau.g:3224:1: rule__Ligne2__Group__4 : rule__Ligne2__Group__4__Impl ;
    public final void rule__Ligne2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3228:1: ( rule__Ligne2__Group__4__Impl )
            // InternalReseau.g:3229:2: rule__Ligne2__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ligne2__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne2__Group__4"


    // $ANTLR start "rule__Ligne2__Group__4__Impl"
    // InternalReseau.g:3235:1: rule__Ligne2__Group__4__Impl : ( '>' ) ;
    public final void rule__Ligne2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3239:1: ( ( '>' ) )
            // InternalReseau.g:3240:1: ( '>' )
            {
            // InternalReseau.g:3240:1: ( '>' )
            // InternalReseau.g:3241:2: '>'
            {
             before(grammarAccess.getLigne2Access().getGreaterThanSignKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLigne2Access().getGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne2__Group__4__Impl"


    // $ANTLR start "rule__Segment__Group__0"
    // InternalReseau.g:3251:1: rule__Segment__Group__0 : rule__Segment__Group__0__Impl rule__Segment__Group__1 ;
    public final void rule__Segment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3255:1: ( rule__Segment__Group__0__Impl rule__Segment__Group__1 )
            // InternalReseau.g:3256:2: rule__Segment__Group__0__Impl rule__Segment__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Segment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Segment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__0"


    // $ANTLR start "rule__Segment__Group__0__Impl"
    // InternalReseau.g:3263:1: rule__Segment__Group__0__Impl : ( 'segment' ) ;
    public final void rule__Segment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3267:1: ( ( 'segment' ) )
            // InternalReseau.g:3268:1: ( 'segment' )
            {
            // InternalReseau.g:3268:1: ( 'segment' )
            // InternalReseau.g:3269:2: 'segment'
            {
             before(grammarAccess.getSegmentAccess().getSegmentKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getSegmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__0__Impl"


    // $ANTLR start "rule__Segment__Group__1"
    // InternalReseau.g:3278:1: rule__Segment__Group__1 : rule__Segment__Group__1__Impl rule__Segment__Group__2 ;
    public final void rule__Segment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3282:1: ( rule__Segment__Group__1__Impl rule__Segment__Group__2 )
            // InternalReseau.g:3283:2: rule__Segment__Group__1__Impl rule__Segment__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__Segment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Segment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__1"


    // $ANTLR start "rule__Segment__Group__1__Impl"
    // InternalReseau.g:3290:1: rule__Segment__Group__1__Impl : ( ( rule__Segment__NameAssignment_1 ) ) ;
    public final void rule__Segment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3294:1: ( ( ( rule__Segment__NameAssignment_1 ) ) )
            // InternalReseau.g:3295:1: ( ( rule__Segment__NameAssignment_1 ) )
            {
            // InternalReseau.g:3295:1: ( ( rule__Segment__NameAssignment_1 ) )
            // InternalReseau.g:3296:2: ( rule__Segment__NameAssignment_1 )
            {
             before(grammarAccess.getSegmentAccess().getNameAssignment_1()); 
            // InternalReseau.g:3297:2: ( rule__Segment__NameAssignment_1 )
            // InternalReseau.g:3297:3: rule__Segment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Segment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__1__Impl"


    // $ANTLR start "rule__Segment__Group__2"
    // InternalReseau.g:3305:1: rule__Segment__Group__2 : rule__Segment__Group__2__Impl rule__Segment__Group__3 ;
    public final void rule__Segment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3309:1: ( rule__Segment__Group__2__Impl rule__Segment__Group__3 )
            // InternalReseau.g:3310:2: rule__Segment__Group__2__Impl rule__Segment__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Segment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Segment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__2"


    // $ANTLR start "rule__Segment__Group__2__Impl"
    // InternalReseau.g:3317:1: rule__Segment__Group__2__Impl : ( '{' ) ;
    public final void rule__Segment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3321:1: ( ( '{' ) )
            // InternalReseau.g:3322:1: ( '{' )
            {
            // InternalReseau.g:3322:1: ( '{' )
            // InternalReseau.g:3323:2: '{'
            {
             before(grammarAccess.getSegmentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__2__Impl"


    // $ANTLR start "rule__Segment__Group__3"
    // InternalReseau.g:3332:1: rule__Segment__Group__3 : rule__Segment__Group__3__Impl rule__Segment__Group__4 ;
    public final void rule__Segment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3336:1: ( rule__Segment__Group__3__Impl rule__Segment__Group__4 )
            // InternalReseau.g:3337:2: rule__Segment__Group__3__Impl rule__Segment__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__Segment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Segment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__3"


    // $ANTLR start "rule__Segment__Group__3__Impl"
    // InternalReseau.g:3344:1: rule__Segment__Group__3__Impl : ( ( ( rule__Segment__PartsAssignment_3 ) ) ( ( rule__Segment__PartsAssignment_3 )* ) ) ;
    public final void rule__Segment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3348:1: ( ( ( ( rule__Segment__PartsAssignment_3 ) ) ( ( rule__Segment__PartsAssignment_3 )* ) ) )
            // InternalReseau.g:3349:1: ( ( ( rule__Segment__PartsAssignment_3 ) ) ( ( rule__Segment__PartsAssignment_3 )* ) )
            {
            // InternalReseau.g:3349:1: ( ( ( rule__Segment__PartsAssignment_3 ) ) ( ( rule__Segment__PartsAssignment_3 )* ) )
            // InternalReseau.g:3350:2: ( ( rule__Segment__PartsAssignment_3 ) ) ( ( rule__Segment__PartsAssignment_3 )* )
            {
            // InternalReseau.g:3350:2: ( ( rule__Segment__PartsAssignment_3 ) )
            // InternalReseau.g:3351:3: ( rule__Segment__PartsAssignment_3 )
            {
             before(grammarAccess.getSegmentAccess().getPartsAssignment_3()); 
            // InternalReseau.g:3352:3: ( rule__Segment__PartsAssignment_3 )
            // InternalReseau.g:3352:4: rule__Segment__PartsAssignment_3
            {
            pushFollow(FOLLOW_42);
            rule__Segment__PartsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getPartsAssignment_3()); 

            }

            // InternalReseau.g:3355:2: ( ( rule__Segment__PartsAssignment_3 )* )
            // InternalReseau.g:3356:3: ( rule__Segment__PartsAssignment_3 )*
            {
             before(grammarAccess.getSegmentAccess().getPartsAssignment_3()); 
            // InternalReseau.g:3357:3: ( rule__Segment__PartsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_NUMBER)||LA15_0==15||LA15_0==20||(LA15_0>=23 && LA15_0<=35)||LA15_0==37||LA15_0==39) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalReseau.g:3357:4: rule__Segment__PartsAssignment_3
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__Segment__PartsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSegmentAccess().getPartsAssignment_3()); 

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
    // $ANTLR end "rule__Segment__Group__3__Impl"


    // $ANTLR start "rule__Segment__Group__4"
    // InternalReseau.g:3366:1: rule__Segment__Group__4 : rule__Segment__Group__4__Impl ;
    public final void rule__Segment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3370:1: ( rule__Segment__Group__4__Impl )
            // InternalReseau.g:3371:2: rule__Segment__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Segment__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__4"


    // $ANTLR start "rule__Segment__Group__4__Impl"
    // InternalReseau.g:3377:1: rule__Segment__Group__4__Impl : ( '}' ) ;
    public final void rule__Segment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3381:1: ( ( '}' ) )
            // InternalReseau.g:3382:1: ( '}' )
            {
            // InternalReseau.g:3382:1: ( '}' )
            // InternalReseau.g:3383:2: '}'
            {
             before(grammarAccess.getSegmentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__Group__4__Impl"


    // $ANTLR start "rule__SegmentPart__Group__0"
    // InternalReseau.g:3393:1: rule__SegmentPart__Group__0 : rule__SegmentPart__Group__0__Impl rule__SegmentPart__Group__1 ;
    public final void rule__SegmentPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3397:1: ( rule__SegmentPart__Group__0__Impl rule__SegmentPart__Group__1 )
            // InternalReseau.g:3398:2: rule__SegmentPart__Group__0__Impl rule__SegmentPart__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__SegmentPart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SegmentPart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentPart__Group__0"


    // $ANTLR start "rule__SegmentPart__Group__0__Impl"
    // InternalReseau.g:3405:1: rule__SegmentPart__Group__0__Impl : ( ( rule__SegmentPart__FstAssignment_0 ) ) ;
    public final void rule__SegmentPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3409:1: ( ( ( rule__SegmentPart__FstAssignment_0 ) ) )
            // InternalReseau.g:3410:1: ( ( rule__SegmentPart__FstAssignment_0 ) )
            {
            // InternalReseau.g:3410:1: ( ( rule__SegmentPart__FstAssignment_0 ) )
            // InternalReseau.g:3411:2: ( rule__SegmentPart__FstAssignment_0 )
            {
             before(grammarAccess.getSegmentPartAccess().getFstAssignment_0()); 
            // InternalReseau.g:3412:2: ( rule__SegmentPart__FstAssignment_0 )
            // InternalReseau.g:3412:3: rule__SegmentPart__FstAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SegmentPart__FstAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSegmentPartAccess().getFstAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentPart__Group__0__Impl"


    // $ANTLR start "rule__SegmentPart__Group__1"
    // InternalReseau.g:3420:1: rule__SegmentPart__Group__1 : rule__SegmentPart__Group__1__Impl rule__SegmentPart__Group__2 ;
    public final void rule__SegmentPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3424:1: ( rule__SegmentPart__Group__1__Impl rule__SegmentPart__Group__2 )
            // InternalReseau.g:3425:2: rule__SegmentPart__Group__1__Impl rule__SegmentPart__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__SegmentPart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SegmentPart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentPart__Group__1"


    // $ANTLR start "rule__SegmentPart__Group__1__Impl"
    // InternalReseau.g:3432:1: rule__SegmentPart__Group__1__Impl : ( ( rule__SegmentPart__NextAssignment_1 ) ) ;
    public final void rule__SegmentPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3436:1: ( ( ( rule__SegmentPart__NextAssignment_1 ) ) )
            // InternalReseau.g:3437:1: ( ( rule__SegmentPart__NextAssignment_1 ) )
            {
            // InternalReseau.g:3437:1: ( ( rule__SegmentPart__NextAssignment_1 ) )
            // InternalReseau.g:3438:2: ( rule__SegmentPart__NextAssignment_1 )
            {
             before(grammarAccess.getSegmentPartAccess().getNextAssignment_1()); 
            // InternalReseau.g:3439:2: ( rule__SegmentPart__NextAssignment_1 )
            // InternalReseau.g:3439:3: rule__SegmentPart__NextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SegmentPart__NextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSegmentPartAccess().getNextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentPart__Group__1__Impl"


    // $ANTLR start "rule__SegmentPart__Group__2"
    // InternalReseau.g:3447:1: rule__SegmentPart__Group__2 : rule__SegmentPart__Group__2__Impl ;
    public final void rule__SegmentPart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3451:1: ( rule__SegmentPart__Group__2__Impl )
            // InternalReseau.g:3452:2: rule__SegmentPart__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SegmentPart__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentPart__Group__2"


    // $ANTLR start "rule__SegmentPart__Group__2__Impl"
    // InternalReseau.g:3458:1: rule__SegmentPart__Group__2__Impl : ( ';' ) ;
    public final void rule__SegmentPart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3462:1: ( ( ';' ) )
            // InternalReseau.g:3463:1: ( ';' )
            {
            // InternalReseau.g:3463:1: ( ';' )
            // InternalReseau.g:3464:2: ';'
            {
             before(grammarAccess.getSegmentPartAccess().getSemicolonKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSegmentPartAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentPart__Group__2__Impl"


    // $ANTLR start "rule__Unidir__Group__0"
    // InternalReseau.g:3474:1: rule__Unidir__Group__0 : rule__Unidir__Group__0__Impl rule__Unidir__Group__1 ;
    public final void rule__Unidir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3478:1: ( rule__Unidir__Group__0__Impl rule__Unidir__Group__1 )
            // InternalReseau.g:3479:2: rule__Unidir__Group__0__Impl rule__Unidir__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Unidir__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unidir__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unidir__Group__0"


    // $ANTLR start "rule__Unidir__Group__0__Impl"
    // InternalReseau.g:3486:1: rule__Unidir__Group__0__Impl : ( '->' ) ;
    public final void rule__Unidir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3490:1: ( ( '->' ) )
            // InternalReseau.g:3491:1: ( '->' )
            {
            // InternalReseau.g:3491:1: ( '->' )
            // InternalReseau.g:3492:2: '->'
            {
             before(grammarAccess.getUnidirAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getUnidirAccess().getHyphenMinusGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unidir__Group__0__Impl"


    // $ANTLR start "rule__Unidir__Group__1"
    // InternalReseau.g:3501:1: rule__Unidir__Group__1 : rule__Unidir__Group__1__Impl ;
    public final void rule__Unidir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3505:1: ( rule__Unidir__Group__1__Impl )
            // InternalReseau.g:3506:2: rule__Unidir__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Unidir__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unidir__Group__1"


    // $ANTLR start "rule__Unidir__Group__1__Impl"
    // InternalReseau.g:3512:1: rule__Unidir__Group__1__Impl : ( ( rule__Unidir__PtsAssignment_1 ) ) ;
    public final void rule__Unidir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3516:1: ( ( ( rule__Unidir__PtsAssignment_1 ) ) )
            // InternalReseau.g:3517:1: ( ( rule__Unidir__PtsAssignment_1 ) )
            {
            // InternalReseau.g:3517:1: ( ( rule__Unidir__PtsAssignment_1 ) )
            // InternalReseau.g:3518:2: ( rule__Unidir__PtsAssignment_1 )
            {
             before(grammarAccess.getUnidirAccess().getPtsAssignment_1()); 
            // InternalReseau.g:3519:2: ( rule__Unidir__PtsAssignment_1 )
            // InternalReseau.g:3519:3: rule__Unidir__PtsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Unidir__PtsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnidirAccess().getPtsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unidir__Group__1__Impl"


    // $ANTLR start "rule__Bidir__Group__0"
    // InternalReseau.g:3528:1: rule__Bidir__Group__0 : rule__Bidir__Group__0__Impl rule__Bidir__Group__1 ;
    public final void rule__Bidir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3532:1: ( rule__Bidir__Group__0__Impl rule__Bidir__Group__1 )
            // InternalReseau.g:3533:2: rule__Bidir__Group__0__Impl rule__Bidir__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Bidir__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bidir__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bidir__Group__0"


    // $ANTLR start "rule__Bidir__Group__0__Impl"
    // InternalReseau.g:3540:1: rule__Bidir__Group__0__Impl : ( '<->' ) ;
    public final void rule__Bidir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3544:1: ( ( '<->' ) )
            // InternalReseau.g:3545:1: ( '<->' )
            {
            // InternalReseau.g:3545:1: ( '<->' )
            // InternalReseau.g:3546:2: '<->'
            {
             before(grammarAccess.getBidirAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBidirAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bidir__Group__0__Impl"


    // $ANTLR start "rule__Bidir__Group__1"
    // InternalReseau.g:3555:1: rule__Bidir__Group__1 : rule__Bidir__Group__1__Impl ;
    public final void rule__Bidir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3559:1: ( rule__Bidir__Group__1__Impl )
            // InternalReseau.g:3560:2: rule__Bidir__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bidir__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bidir__Group__1"


    // $ANTLR start "rule__Bidir__Group__1__Impl"
    // InternalReseau.g:3566:1: rule__Bidir__Group__1__Impl : ( ( rule__Bidir__PtsAssignment_1 ) ) ;
    public final void rule__Bidir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3570:1: ( ( ( rule__Bidir__PtsAssignment_1 ) ) )
            // InternalReseau.g:3571:1: ( ( rule__Bidir__PtsAssignment_1 ) )
            {
            // InternalReseau.g:3571:1: ( ( rule__Bidir__PtsAssignment_1 ) )
            // InternalReseau.g:3572:2: ( rule__Bidir__PtsAssignment_1 )
            {
             before(grammarAccess.getBidirAccess().getPtsAssignment_1()); 
            // InternalReseau.g:3573:2: ( rule__Bidir__PtsAssignment_1 )
            // InternalReseau.g:3573:3: rule__Bidir__PtsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Bidir__PtsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBidirAccess().getPtsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bidir__Group__1__Impl"


    // $ANTLR start "rule__Model__SegmentsAssignment_0"
    // InternalReseau.g:3582:1: rule__Model__SegmentsAssignment_0 : ( ruleSegment ) ;
    public final void rule__Model__SegmentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3586:1: ( ( ruleSegment ) )
            // InternalReseau.g:3587:2: ( ruleSegment )
            {
            // InternalReseau.g:3587:2: ( ruleSegment )
            // InternalReseau.g:3588:3: ruleSegment
            {
             before(grammarAccess.getModelAccess().getSegmentsSegmentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSegment();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSegmentsSegmentParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SegmentsAssignment_0"


    // $ANTLR start "rule__Model__PointsLiaisonAssignment_1"
    // InternalReseau.g:3597:1: rule__Model__PointsLiaisonAssignment_1 : ( ruleDeclarationPoint ) ;
    public final void rule__Model__PointsLiaisonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3601:1: ( ( ruleDeclarationPoint ) )
            // InternalReseau.g:3602:2: ( ruleDeclarationPoint )
            {
            // InternalReseau.g:3602:2: ( ruleDeclarationPoint )
            // InternalReseau.g:3603:3: ruleDeclarationPoint
            {
             before(grammarAccess.getModelAccess().getPointsLiaisonDeclarationPointParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclarationPoint();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPointsLiaisonDeclarationPointParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PointsLiaisonAssignment_1"


    // $ANTLR start "rule__DeclarationPoint__NameAssignment_0"
    // InternalReseau.g:3612:1: rule__DeclarationPoint__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DeclarationPoint__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3616:1: ( ( RULE_ID ) )
            // InternalReseau.g:3617:2: ( RULE_ID )
            {
            // InternalReseau.g:3617:2: ( RULE_ID )
            // InternalReseau.g:3618:3: RULE_ID
            {
             before(grammarAccess.getDeclarationPointAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeclarationPointAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationPoint__NameAssignment_0"


    // $ANTLR start "rule__DeclarationPoint__XyAssignment_2"
    // InternalReseau.g:3627:1: rule__DeclarationPoint__XyAssignment_2 : ( rulePoint ) ;
    public final void rule__DeclarationPoint__XyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3631:1: ( ( rulePoint ) )
            // InternalReseau.g:3632:2: ( rulePoint )
            {
            // InternalReseau.g:3632:2: ( rulePoint )
            // InternalReseau.g:3633:3: rulePoint
            {
             before(grammarAccess.getDeclarationPointAccess().getXyPointParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getDeclarationPointAccess().getXyPointParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationPoint__XyAssignment_2"


    // $ANTLR start "rule__Addition__RightAssignment_1_1"
    // InternalReseau.g:3642:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3646:1: ( ( ruleMultiplication ) )
            // InternalReseau.g:3647:2: ( ruleMultiplication )
            {
            // InternalReseau.g:3647:2: ( ruleMultiplication )
            // InternalReseau.g:3648:3: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_1"
    // InternalReseau.g:3657:1: rule__Multiplication__RightAssignment_1_1 : ( rulePuissance ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3661:1: ( ( rulePuissance ) )
            // InternalReseau.g:3662:2: ( rulePuissance )
            {
            // InternalReseau.g:3662:2: ( rulePuissance )
            // InternalReseau.g:3663:3: rulePuissance
            {
             before(grammarAccess.getMultiplicationAccess().getRightPuissanceParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePuissance();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPuissanceParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_1"


    // $ANTLR start "rule__Puissance__RightAssignment_1_1_2"
    // InternalReseau.g:3672:1: rule__Puissance__RightAssignment_1_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__Puissance__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3676:1: ( ( rulePrimaryExpression ) )
            // InternalReseau.g:3677:2: ( rulePrimaryExpression )
            {
            // InternalReseau.g:3677:2: ( rulePrimaryExpression )
            // InternalReseau.g:3678:3: rulePrimaryExpression
            {
             before(grammarAccess.getPuissanceAccess().getRightPrimaryExpressionParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPuissanceAccess().getRightPrimaryExpressionParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Puissance__RightAssignment_1_1_2"


    // $ANTLR start "rule__PrimaryExpression__RightAssignment_0_2_2"
    // InternalReseau.g:3687:1: rule__PrimaryExpression__RightAssignment_0_2_2 : ( rulePoint ) ;
    public final void rule__PrimaryExpression__RightAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3691:1: ( ( rulePoint ) )
            // InternalReseau.g:3692:2: ( rulePoint )
            {
            // InternalReseau.g:3692:2: ( rulePoint )
            // InternalReseau.g:3693:3: rulePoint
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightPointParserRuleCall_0_2_2_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getRightPointParserRuleCall_0_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__RightAssignment_0_2_2"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_1_1"
    // InternalReseau.g:3702:1: rule__PrimaryExpression__ValueAssignment_1_1 : ( RULE_NUMBER ) ;
    public final void rule__PrimaryExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3706:1: ( ( RULE_NUMBER ) )
            // InternalReseau.g:3707:2: ( RULE_NUMBER )
            {
            // InternalReseau.g:3707:2: ( RULE_NUMBER )
            // InternalReseau.g:3708:3: RULE_NUMBER
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_2_2"
    // InternalReseau.g:3717:1: rule__PrimaryExpression__ValueAssignment_2_2 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ValueAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3721:1: ( ( rulePrimaryExpression ) )
            // InternalReseau.g:3722:2: ( rulePrimaryExpression )
            {
            // InternalReseau.g:3722:2: ( rulePrimaryExpression )
            // InternalReseau.g:3723:3: rulePrimaryExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValuePrimaryExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getValuePrimaryExpressionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_2_2"


    // $ANTLR start "rule__PrimaryExpression__DeclAssignment_3_1"
    // InternalReseau.g:3732:1: rule__PrimaryExpression__DeclAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryExpression__DeclAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3736:1: ( ( ( RULE_ID ) ) )
            // InternalReseau.g:3737:2: ( ( RULE_ID ) )
            {
            // InternalReseau.g:3737:2: ( ( RULE_ID ) )
            // InternalReseau.g:3738:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getDeclDeclarationPointCrossReference_3_1_0()); 
            // InternalReseau.g:3739:3: ( RULE_ID )
            // InternalReseau.g:3740:4: RULE_ID
            {
             before(grammarAccess.getPrimaryExpressionAccess().getDeclDeclarationPointIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getDeclDeclarationPointIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getPrimaryExpressionAccess().getDeclDeclarationPointCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__DeclAssignment_3_1"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_12_3"
    // InternalReseau.g:3751:1: rule__PrimaryExpression__ValueAssignment_12_3 : ( rulePoint ) ;
    public final void rule__PrimaryExpression__ValueAssignment_12_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3755:1: ( ( rulePoint ) )
            // InternalReseau.g:3756:2: ( rulePoint )
            {
            // InternalReseau.g:3756:2: ( rulePoint )
            // InternalReseau.g:3757:3: rulePoint
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_12_3_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_12_3"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_13_3"
    // InternalReseau.g:3766:1: rule__PrimaryExpression__ValueAssignment_13_3 : ( rulePoint ) ;
    public final void rule__PrimaryExpression__ValueAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3770:1: ( ( rulePoint ) )
            // InternalReseau.g:3771:2: ( rulePoint )
            {
            // InternalReseau.g:3771:2: ( rulePoint )
            // InternalReseau.g:3772:3: rulePoint
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_13_3_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_13_3"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_14_3"
    // InternalReseau.g:3781:1: rule__PrimaryExpression__ValueAssignment_14_3 : ( rulePoint ) ;
    public final void rule__PrimaryExpression__ValueAssignment_14_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3785:1: ( ( rulePoint ) )
            // InternalReseau.g:3786:2: ( rulePoint )
            {
            // InternalReseau.g:3786:2: ( rulePoint )
            // InternalReseau.g:3787:3: rulePoint
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_14_3_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_14_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_14_3"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_15_3"
    // InternalReseau.g:3796:1: rule__PrimaryExpression__ValueAssignment_15_3 : ( rulePoint ) ;
    public final void rule__PrimaryExpression__ValueAssignment_15_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3800:1: ( ( rulePoint ) )
            // InternalReseau.g:3801:2: ( rulePoint )
            {
            // InternalReseau.g:3801:2: ( rulePoint )
            // InternalReseau.g:3802:3: rulePoint
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_15_3_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_15_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_15_3"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_16_3"
    // InternalReseau.g:3811:1: rule__PrimaryExpression__ValueAssignment_16_3 : ( rulePoint ) ;
    public final void rule__PrimaryExpression__ValueAssignment_16_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3815:1: ( ( rulePoint ) )
            // InternalReseau.g:3816:2: ( rulePoint )
            {
            // InternalReseau.g:3816:2: ( rulePoint )
            // InternalReseau.g:3817:3: rulePoint
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_16_3_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_16_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_16_3"


    // $ANTLR start "rule__PrimaryExpression__L1Assignment_17_1"
    // InternalReseau.g:3826:1: rule__PrimaryExpression__L1Assignment_17_1 : ( ruleLigne ) ;
    public final void rule__PrimaryExpression__L1Assignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3830:1: ( ( ruleLigne ) )
            // InternalReseau.g:3831:2: ( ruleLigne )
            {
            // InternalReseau.g:3831:2: ( ruleLigne )
            // InternalReseau.g:3832:3: ruleLigne
            {
             before(grammarAccess.getPrimaryExpressionAccess().getL1LigneParserRuleCall_17_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLigne();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getL1LigneParserRuleCall_17_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__L1Assignment_17_1"


    // $ANTLR start "rule__PrimaryExpression__L2Assignment_17_3"
    // InternalReseau.g:3841:1: rule__PrimaryExpression__L2Assignment_17_3 : ( ruleLigne ) ;
    public final void rule__PrimaryExpression__L2Assignment_17_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3845:1: ( ( ruleLigne ) )
            // InternalReseau.g:3846:2: ( ruleLigne )
            {
            // InternalReseau.g:3846:2: ( ruleLigne )
            // InternalReseau.g:3847:3: ruleLigne
            {
             before(grammarAccess.getPrimaryExpressionAccess().getL2LigneParserRuleCall_17_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLigne();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getL2LigneParserRuleCall_17_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__L2Assignment_17_3"


    // $ANTLR start "rule__Ligne1__P1Assignment_1"
    // InternalReseau.g:3856:1: rule__Ligne1__P1Assignment_1 : ( rulePoint ) ;
    public final void rule__Ligne1__P1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3860:1: ( ( rulePoint ) )
            // InternalReseau.g:3861:2: ( rulePoint )
            {
            // InternalReseau.g:3861:2: ( rulePoint )
            // InternalReseau.g:3862:3: rulePoint
            {
             before(grammarAccess.getLigne1Access().getP1PointParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getLigne1Access().getP1PointParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne1__P1Assignment_1"


    // $ANTLR start "rule__Ligne1__P2Assignment_3"
    // InternalReseau.g:3871:1: rule__Ligne1__P2Assignment_3 : ( rulePoint ) ;
    public final void rule__Ligne1__P2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3875:1: ( ( rulePoint ) )
            // InternalReseau.g:3876:2: ( rulePoint )
            {
            // InternalReseau.g:3876:2: ( rulePoint )
            // InternalReseau.g:3877:3: rulePoint
            {
             before(grammarAccess.getLigne1Access().getP2PointParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getLigne1Access().getP2PointParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne1__P2Assignment_3"


    // $ANTLR start "rule__Ligne2__P1Assignment_1"
    // InternalReseau.g:3886:1: rule__Ligne2__P1Assignment_1 : ( rulePoint ) ;
    public final void rule__Ligne2__P1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3890:1: ( ( rulePoint ) )
            // InternalReseau.g:3891:2: ( rulePoint )
            {
            // InternalReseau.g:3891:2: ( rulePoint )
            // InternalReseau.g:3892:3: rulePoint
            {
             before(grammarAccess.getLigne2Access().getP1PointParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getLigne2Access().getP1PointParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne2__P1Assignment_1"


    // $ANTLR start "rule__Ligne2__P2Assignment_3"
    // InternalReseau.g:3901:1: rule__Ligne2__P2Assignment_3 : ( rulePoint ) ;
    public final void rule__Ligne2__P2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3905:1: ( ( rulePoint ) )
            // InternalReseau.g:3906:2: ( rulePoint )
            {
            // InternalReseau.g:3906:2: ( rulePoint )
            // InternalReseau.g:3907:3: rulePoint
            {
             before(grammarAccess.getLigne2Access().getP2PointParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getLigne2Access().getP2PointParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ligne2__P2Assignment_3"


    // $ANTLR start "rule__Segment__NameAssignment_1"
    // InternalReseau.g:3916:1: rule__Segment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Segment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3920:1: ( ( RULE_ID ) )
            // InternalReseau.g:3921:2: ( RULE_ID )
            {
            // InternalReseau.g:3921:2: ( RULE_ID )
            // InternalReseau.g:3922:3: RULE_ID
            {
             before(grammarAccess.getSegmentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSegmentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__NameAssignment_1"


    // $ANTLR start "rule__Segment__PartsAssignment_3"
    // InternalReseau.g:3931:1: rule__Segment__PartsAssignment_3 : ( ruleSegmentPart ) ;
    public final void rule__Segment__PartsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3935:1: ( ( ruleSegmentPart ) )
            // InternalReseau.g:3936:2: ( ruleSegmentPart )
            {
            // InternalReseau.g:3936:2: ( ruleSegmentPart )
            // InternalReseau.g:3937:3: ruleSegmentPart
            {
             before(grammarAccess.getSegmentAccess().getPartsSegmentPartParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSegmentPart();

            state._fsp--;

             after(grammarAccess.getSegmentAccess().getPartsSegmentPartParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Segment__PartsAssignment_3"


    // $ANTLR start "rule__SegmentPart__FstAssignment_0"
    // InternalReseau.g:3946:1: rule__SegmentPart__FstAssignment_0 : ( rulePoint ) ;
    public final void rule__SegmentPart__FstAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3950:1: ( ( rulePoint ) )
            // InternalReseau.g:3951:2: ( rulePoint )
            {
            // InternalReseau.g:3951:2: ( rulePoint )
            // InternalReseau.g:3952:3: rulePoint
            {
             before(grammarAccess.getSegmentPartAccess().getFstPointParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getSegmentPartAccess().getFstPointParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentPart__FstAssignment_0"


    // $ANTLR start "rule__SegmentPart__NextAssignment_1"
    // InternalReseau.g:3961:1: rule__SegmentPart__NextAssignment_1 : ( ( rule__SegmentPart__NextAlternatives_1_0 ) ) ;
    public final void rule__SegmentPart__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3965:1: ( ( ( rule__SegmentPart__NextAlternatives_1_0 ) ) )
            // InternalReseau.g:3966:2: ( ( rule__SegmentPart__NextAlternatives_1_0 ) )
            {
            // InternalReseau.g:3966:2: ( ( rule__SegmentPart__NextAlternatives_1_0 ) )
            // InternalReseau.g:3967:3: ( rule__SegmentPart__NextAlternatives_1_0 )
            {
             before(grammarAccess.getSegmentPartAccess().getNextAlternatives_1_0()); 
            // InternalReseau.g:3968:3: ( rule__SegmentPart__NextAlternatives_1_0 )
            // InternalReseau.g:3968:4: rule__SegmentPart__NextAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SegmentPart__NextAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSegmentPartAccess().getNextAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SegmentPart__NextAssignment_1"


    // $ANTLR start "rule__Unidir__PtsAssignment_1"
    // InternalReseau.g:3976:1: rule__Unidir__PtsAssignment_1 : ( rulePoint ) ;
    public final void rule__Unidir__PtsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3980:1: ( ( rulePoint ) )
            // InternalReseau.g:3981:2: ( rulePoint )
            {
            // InternalReseau.g:3981:2: ( rulePoint )
            // InternalReseau.g:3982:3: rulePoint
            {
             before(grammarAccess.getUnidirAccess().getPtsPointParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getUnidirAccess().getPtsPointParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unidir__PtsAssignment_1"


    // $ANTLR start "rule__Bidir__PtsAssignment_1"
    // InternalReseau.g:3991:1: rule__Bidir__PtsAssignment_1 : ( rulePoint ) ;
    public final void rule__Bidir__PtsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3995:1: ( ( rulePoint ) )
            // InternalReseau.g:3996:2: ( rulePoint )
            {
            // InternalReseau.g:3996:2: ( rulePoint )
            // InternalReseau.g:3997:3: rulePoint
            {
             before(grammarAccess.getBidirAccess().getPtsPointParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getBidirAccess().getPtsPointParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bidir__PtsAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000020000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000AFFF908030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000000AFFF908032L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000300000000000L});

}