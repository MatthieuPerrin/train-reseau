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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "';'", "'+'", "'-'", "'*'", "'/'", "'\\u00B0'", "'^'", "'('", "')'", "','", "'nord'", "'sud'", "'est'", "'ouest'", "'pi'", "'e'", "'i'", "'x'", "'y'", "'longueur'", "'angle'", "'argument'", "'segment'", "'{'", "'}'", "'->'", "'<->'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_NUMBER=5;
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

                if ( (LA1_0==RULE_ID||LA1_0==35) ) {
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


    // $ANTLR start "entryRuleSegment"
    // InternalReseau.g:228:1: entryRuleSegment : ruleSegment EOF ;
    public final void entryRuleSegment() throws RecognitionException {
        try {
            // InternalReseau.g:229:1: ( ruleSegment EOF )
            // InternalReseau.g:230:1: ruleSegment EOF
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
    // InternalReseau.g:237:1: ruleSegment : ( ( rule__Segment__Group__0 ) ) ;
    public final void ruleSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:241:2: ( ( ( rule__Segment__Group__0 ) ) )
            // InternalReseau.g:242:2: ( ( rule__Segment__Group__0 ) )
            {
            // InternalReseau.g:242:2: ( ( rule__Segment__Group__0 ) )
            // InternalReseau.g:243:3: ( rule__Segment__Group__0 )
            {
             before(grammarAccess.getSegmentAccess().getGroup()); 
            // InternalReseau.g:244:3: ( rule__Segment__Group__0 )
            // InternalReseau.g:244:4: rule__Segment__Group__0
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
    // InternalReseau.g:253:1: entryRuleSegmentPart : ruleSegmentPart EOF ;
    public final void entryRuleSegmentPart() throws RecognitionException {
        try {
            // InternalReseau.g:254:1: ( ruleSegmentPart EOF )
            // InternalReseau.g:255:1: ruleSegmentPart EOF
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
    // InternalReseau.g:262:1: ruleSegmentPart : ( ( rule__SegmentPart__Group__0 ) ) ;
    public final void ruleSegmentPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:266:2: ( ( ( rule__SegmentPart__Group__0 ) ) )
            // InternalReseau.g:267:2: ( ( rule__SegmentPart__Group__0 ) )
            {
            // InternalReseau.g:267:2: ( ( rule__SegmentPart__Group__0 ) )
            // InternalReseau.g:268:3: ( rule__SegmentPart__Group__0 )
            {
             before(grammarAccess.getSegmentPartAccess().getGroup()); 
            // InternalReseau.g:269:3: ( rule__SegmentPart__Group__0 )
            // InternalReseau.g:269:4: rule__SegmentPart__Group__0
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
    // InternalReseau.g:278:1: entryRuleUnidir : ruleUnidir EOF ;
    public final void entryRuleUnidir() throws RecognitionException {
        try {
            // InternalReseau.g:279:1: ( ruleUnidir EOF )
            // InternalReseau.g:280:1: ruleUnidir EOF
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
    // InternalReseau.g:287:1: ruleUnidir : ( ( ( rule__Unidir__Group__0 ) ) ( ( rule__Unidir__Group__0 )* ) ) ;
    public final void ruleUnidir() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:291:2: ( ( ( ( rule__Unidir__Group__0 ) ) ( ( rule__Unidir__Group__0 )* ) ) )
            // InternalReseau.g:292:2: ( ( ( rule__Unidir__Group__0 ) ) ( ( rule__Unidir__Group__0 )* ) )
            {
            // InternalReseau.g:292:2: ( ( ( rule__Unidir__Group__0 ) ) ( ( rule__Unidir__Group__0 )* ) )
            // InternalReseau.g:293:3: ( ( rule__Unidir__Group__0 ) ) ( ( rule__Unidir__Group__0 )* )
            {
            // InternalReseau.g:293:3: ( ( rule__Unidir__Group__0 ) )
            // InternalReseau.g:294:4: ( rule__Unidir__Group__0 )
            {
             before(grammarAccess.getUnidirAccess().getGroup()); 
            // InternalReseau.g:295:4: ( rule__Unidir__Group__0 )
            // InternalReseau.g:295:5: rule__Unidir__Group__0
            {
            pushFollow(FOLLOW_4);
            rule__Unidir__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnidirAccess().getGroup()); 

            }

            // InternalReseau.g:298:3: ( ( rule__Unidir__Group__0 )* )
            // InternalReseau.g:299:4: ( rule__Unidir__Group__0 )*
            {
             before(grammarAccess.getUnidirAccess().getGroup()); 
            // InternalReseau.g:300:4: ( rule__Unidir__Group__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==38) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalReseau.g:300:5: rule__Unidir__Group__0
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
    // InternalReseau.g:310:1: entryRuleBidir : ruleBidir EOF ;
    public final void entryRuleBidir() throws RecognitionException {
        try {
            // InternalReseau.g:311:1: ( ruleBidir EOF )
            // InternalReseau.g:312:1: ruleBidir EOF
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
    // InternalReseau.g:319:1: ruleBidir : ( ( ( rule__Bidir__Group__0 ) ) ( ( rule__Bidir__Group__0 )* ) ) ;
    public final void ruleBidir() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:323:2: ( ( ( ( rule__Bidir__Group__0 ) ) ( ( rule__Bidir__Group__0 )* ) ) )
            // InternalReseau.g:324:2: ( ( ( rule__Bidir__Group__0 ) ) ( ( rule__Bidir__Group__0 )* ) )
            {
            // InternalReseau.g:324:2: ( ( ( rule__Bidir__Group__0 ) ) ( ( rule__Bidir__Group__0 )* ) )
            // InternalReseau.g:325:3: ( ( rule__Bidir__Group__0 ) ) ( ( rule__Bidir__Group__0 )* )
            {
            // InternalReseau.g:325:3: ( ( rule__Bidir__Group__0 ) )
            // InternalReseau.g:326:4: ( rule__Bidir__Group__0 )
            {
             before(grammarAccess.getBidirAccess().getGroup()); 
            // InternalReseau.g:327:4: ( rule__Bidir__Group__0 )
            // InternalReseau.g:327:5: rule__Bidir__Group__0
            {
            pushFollow(FOLLOW_5);
            rule__Bidir__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBidirAccess().getGroup()); 

            }

            // InternalReseau.g:330:3: ( ( rule__Bidir__Group__0 )* )
            // InternalReseau.g:331:4: ( rule__Bidir__Group__0 )*
            {
             before(grammarAccess.getBidirAccess().getGroup()); 
            // InternalReseau.g:332:4: ( rule__Bidir__Group__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==39) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalReseau.g:332:5: rule__Bidir__Group__0
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
    // InternalReseau.g:341:1: rule__Model__Alternatives : ( ( ( rule__Model__SegmentsAssignment_0 ) ) | ( ( rule__Model__PointsLiaisonAssignment_1 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:345:1: ( ( ( rule__Model__SegmentsAssignment_0 ) ) | ( ( rule__Model__PointsLiaisonAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==35) ) {
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
                    // InternalReseau.g:346:2: ( ( rule__Model__SegmentsAssignment_0 ) )
                    {
                    // InternalReseau.g:346:2: ( ( rule__Model__SegmentsAssignment_0 ) )
                    // InternalReseau.g:347:3: ( rule__Model__SegmentsAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getSegmentsAssignment_0()); 
                    // InternalReseau.g:348:3: ( rule__Model__SegmentsAssignment_0 )
                    // InternalReseau.g:348:4: rule__Model__SegmentsAssignment_0
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
                    // InternalReseau.g:352:2: ( ( rule__Model__PointsLiaisonAssignment_1 ) )
                    {
                    // InternalReseau.g:352:2: ( ( rule__Model__PointsLiaisonAssignment_1 ) )
                    // InternalReseau.g:353:3: ( rule__Model__PointsLiaisonAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getPointsLiaisonAssignment_1()); 
                    // InternalReseau.g:354:3: ( rule__Model__PointsLiaisonAssignment_1 )
                    // InternalReseau.g:354:4: rule__Model__PointsLiaisonAssignment_1
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
    // InternalReseau.g:362:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:366:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
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
                    // InternalReseau.g:367:2: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // InternalReseau.g:367:2: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // InternalReseau.g:368:3: ( rule__Addition__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    // InternalReseau.g:369:3: ( rule__Addition__Group_1_0_0__0 )
                    // InternalReseau.g:369:4: rule__Addition__Group_1_0_0__0
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
                    // InternalReseau.g:373:2: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // InternalReseau.g:373:2: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // InternalReseau.g:374:3: ( rule__Addition__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    // InternalReseau.g:375:3: ( rule__Addition__Group_1_0_1__0 )
                    // InternalReseau.g:375:4: rule__Addition__Group_1_0_1__0
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
    // InternalReseau.g:383:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:387:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
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
                    // InternalReseau.g:388:2: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // InternalReseau.g:388:2: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // InternalReseau.g:389:3: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    // InternalReseau.g:390:3: ( rule__Multiplication__Group_1_0_0__0 )
                    // InternalReseau.g:390:4: rule__Multiplication__Group_1_0_0__0
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
                    // InternalReseau.g:394:2: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // InternalReseau.g:394:2: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // InternalReseau.g:395:3: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    // InternalReseau.g:396:3: ( rule__Multiplication__Group_1_0_1__0 )
                    // InternalReseau.g:396:4: rule__Multiplication__Group_1_0_1__0
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
    // InternalReseau.g:404:1: rule__Puissance__Alternatives_1 : ( ( ( rule__Puissance__Group_1_0__0 ) ) | ( ( rule__Puissance__Group_1_1__0 ) ) );
    public final void rule__Puissance__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:408:1: ( ( ( rule__Puissance__Group_1_0__0 ) ) | ( ( rule__Puissance__Group_1_1__0 ) ) )
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
                    // InternalReseau.g:409:2: ( ( rule__Puissance__Group_1_0__0 ) )
                    {
                    // InternalReseau.g:409:2: ( ( rule__Puissance__Group_1_0__0 ) )
                    // InternalReseau.g:410:3: ( rule__Puissance__Group_1_0__0 )
                    {
                     before(grammarAccess.getPuissanceAccess().getGroup_1_0()); 
                    // InternalReseau.g:411:3: ( rule__Puissance__Group_1_0__0 )
                    // InternalReseau.g:411:4: rule__Puissance__Group_1_0__0
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
                    // InternalReseau.g:415:2: ( ( rule__Puissance__Group_1_1__0 ) )
                    {
                    // InternalReseau.g:415:2: ( ( rule__Puissance__Group_1_1__0 ) )
                    // InternalReseau.g:416:3: ( rule__Puissance__Group_1_1__0 )
                    {
                     before(grammarAccess.getPuissanceAccess().getGroup_1_1()); 
                    // InternalReseau.g:417:3: ( rule__Puissance__Group_1_1__0 )
                    // InternalReseau.g:417:4: rule__Puissance__Group_1_1__0
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
    // InternalReseau.g:425:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) | ( ( rule__PrimaryExpression__Group_6__0 ) ) | ( ( rule__PrimaryExpression__Group_7__0 ) ) | ( ( rule__PrimaryExpression__Group_8__0 ) ) | ( ( rule__PrimaryExpression__Group_9__0 ) ) | ( ( rule__PrimaryExpression__Group_10__0 ) ) | ( ( rule__PrimaryExpression__Group_11__0 ) ) | ( ( rule__PrimaryExpression__Group_12__0 ) ) | ( ( rule__PrimaryExpression__Group_13__0 ) ) | ( ( rule__PrimaryExpression__Group_14__0 ) ) | ( ( rule__PrimaryExpression__Group_15__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:429:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) | ( ( rule__PrimaryExpression__Group_5__0 ) ) | ( ( rule__PrimaryExpression__Group_6__0 ) ) | ( ( rule__PrimaryExpression__Group_7__0 ) ) | ( ( rule__PrimaryExpression__Group_8__0 ) ) | ( ( rule__PrimaryExpression__Group_9__0 ) ) | ( ( rule__PrimaryExpression__Group_10__0 ) ) | ( ( rule__PrimaryExpression__Group_11__0 ) ) | ( ( rule__PrimaryExpression__Group_12__0 ) ) | ( ( rule__PrimaryExpression__Group_13__0 ) ) | ( ( rule__PrimaryExpression__Group_14__0 ) ) | ( ( rule__PrimaryExpression__Group_15__0 ) ) )
            int alt8=16;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalReseau.g:430:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalReseau.g:430:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalReseau.g:431:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // InternalReseau.g:432:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalReseau.g:432:4: rule__PrimaryExpression__Group_0__0
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
                    // InternalReseau.g:436:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalReseau.g:436:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalReseau.g:437:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // InternalReseau.g:438:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalReseau.g:438:4: rule__PrimaryExpression__Group_1__0
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
                    // InternalReseau.g:442:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalReseau.g:442:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalReseau.g:443:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalReseau.g:444:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalReseau.g:444:4: rule__PrimaryExpression__Group_2__0
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
                    // InternalReseau.g:448:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // InternalReseau.g:448:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // InternalReseau.g:449:3: ( rule__PrimaryExpression__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    // InternalReseau.g:450:3: ( rule__PrimaryExpression__Group_3__0 )
                    // InternalReseau.g:450:4: rule__PrimaryExpression__Group_3__0
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
                    // InternalReseau.g:454:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    {
                    // InternalReseau.g:454:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    // InternalReseau.g:455:3: ( rule__PrimaryExpression__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 
                    // InternalReseau.g:456:3: ( rule__PrimaryExpression__Group_4__0 )
                    // InternalReseau.g:456:4: rule__PrimaryExpression__Group_4__0
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
                    // InternalReseau.g:460:2: ( ( rule__PrimaryExpression__Group_5__0 ) )
                    {
                    // InternalReseau.g:460:2: ( ( rule__PrimaryExpression__Group_5__0 ) )
                    // InternalReseau.g:461:3: ( rule__PrimaryExpression__Group_5__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_5()); 
                    // InternalReseau.g:462:3: ( rule__PrimaryExpression__Group_5__0 )
                    // InternalReseau.g:462:4: rule__PrimaryExpression__Group_5__0
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
                    // InternalReseau.g:466:2: ( ( rule__PrimaryExpression__Group_6__0 ) )
                    {
                    // InternalReseau.g:466:2: ( ( rule__PrimaryExpression__Group_6__0 ) )
                    // InternalReseau.g:467:3: ( rule__PrimaryExpression__Group_6__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_6()); 
                    // InternalReseau.g:468:3: ( rule__PrimaryExpression__Group_6__0 )
                    // InternalReseau.g:468:4: rule__PrimaryExpression__Group_6__0
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
                    // InternalReseau.g:472:2: ( ( rule__PrimaryExpression__Group_7__0 ) )
                    {
                    // InternalReseau.g:472:2: ( ( rule__PrimaryExpression__Group_7__0 ) )
                    // InternalReseau.g:473:3: ( rule__PrimaryExpression__Group_7__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_7()); 
                    // InternalReseau.g:474:3: ( rule__PrimaryExpression__Group_7__0 )
                    // InternalReseau.g:474:4: rule__PrimaryExpression__Group_7__0
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
                    // InternalReseau.g:478:2: ( ( rule__PrimaryExpression__Group_8__0 ) )
                    {
                    // InternalReseau.g:478:2: ( ( rule__PrimaryExpression__Group_8__0 ) )
                    // InternalReseau.g:479:3: ( rule__PrimaryExpression__Group_8__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_8()); 
                    // InternalReseau.g:480:3: ( rule__PrimaryExpression__Group_8__0 )
                    // InternalReseau.g:480:4: rule__PrimaryExpression__Group_8__0
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
                    // InternalReseau.g:484:2: ( ( rule__PrimaryExpression__Group_9__0 ) )
                    {
                    // InternalReseau.g:484:2: ( ( rule__PrimaryExpression__Group_9__0 ) )
                    // InternalReseau.g:485:3: ( rule__PrimaryExpression__Group_9__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_9()); 
                    // InternalReseau.g:486:3: ( rule__PrimaryExpression__Group_9__0 )
                    // InternalReseau.g:486:4: rule__PrimaryExpression__Group_9__0
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
                    // InternalReseau.g:490:2: ( ( rule__PrimaryExpression__Group_10__0 ) )
                    {
                    // InternalReseau.g:490:2: ( ( rule__PrimaryExpression__Group_10__0 ) )
                    // InternalReseau.g:491:3: ( rule__PrimaryExpression__Group_10__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_10()); 
                    // InternalReseau.g:492:3: ( rule__PrimaryExpression__Group_10__0 )
                    // InternalReseau.g:492:4: rule__PrimaryExpression__Group_10__0
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
                    // InternalReseau.g:496:2: ( ( rule__PrimaryExpression__Group_11__0 ) )
                    {
                    // InternalReseau.g:496:2: ( ( rule__PrimaryExpression__Group_11__0 ) )
                    // InternalReseau.g:497:3: ( rule__PrimaryExpression__Group_11__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_11()); 
                    // InternalReseau.g:498:3: ( rule__PrimaryExpression__Group_11__0 )
                    // InternalReseau.g:498:4: rule__PrimaryExpression__Group_11__0
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
                    // InternalReseau.g:502:2: ( ( rule__PrimaryExpression__Group_12__0 ) )
                    {
                    // InternalReseau.g:502:2: ( ( rule__PrimaryExpression__Group_12__0 ) )
                    // InternalReseau.g:503:3: ( rule__PrimaryExpression__Group_12__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_12()); 
                    // InternalReseau.g:504:3: ( rule__PrimaryExpression__Group_12__0 )
                    // InternalReseau.g:504:4: rule__PrimaryExpression__Group_12__0
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
                    // InternalReseau.g:508:2: ( ( rule__PrimaryExpression__Group_13__0 ) )
                    {
                    // InternalReseau.g:508:2: ( ( rule__PrimaryExpression__Group_13__0 ) )
                    // InternalReseau.g:509:3: ( rule__PrimaryExpression__Group_13__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_13()); 
                    // InternalReseau.g:510:3: ( rule__PrimaryExpression__Group_13__0 )
                    // InternalReseau.g:510:4: rule__PrimaryExpression__Group_13__0
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
                    // InternalReseau.g:514:2: ( ( rule__PrimaryExpression__Group_14__0 ) )
                    {
                    // InternalReseau.g:514:2: ( ( rule__PrimaryExpression__Group_14__0 ) )
                    // InternalReseau.g:515:3: ( rule__PrimaryExpression__Group_14__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_14()); 
                    // InternalReseau.g:516:3: ( rule__PrimaryExpression__Group_14__0 )
                    // InternalReseau.g:516:4: rule__PrimaryExpression__Group_14__0
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
                    // InternalReseau.g:520:2: ( ( rule__PrimaryExpression__Group_15__0 ) )
                    {
                    // InternalReseau.g:520:2: ( ( rule__PrimaryExpression__Group_15__0 ) )
                    // InternalReseau.g:521:3: ( rule__PrimaryExpression__Group_15__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_15()); 
                    // InternalReseau.g:522:3: ( rule__PrimaryExpression__Group_15__0 )
                    // InternalReseau.g:522:4: rule__PrimaryExpression__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_15__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_15()); 

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


    // $ANTLR start "rule__SegmentPart__NextAlternatives_1_0"
    // InternalReseau.g:530:1: rule__SegmentPart__NextAlternatives_1_0 : ( ( ruleUnidir ) | ( ruleBidir ) );
    public final void rule__SegmentPart__NextAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:534:1: ( ( ruleUnidir ) | ( ruleBidir ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==38) ) {
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
                    // InternalReseau.g:535:2: ( ruleUnidir )
                    {
                    // InternalReseau.g:535:2: ( ruleUnidir )
                    // InternalReseau.g:536:3: ruleUnidir
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
                    // InternalReseau.g:541:2: ( ruleBidir )
                    {
                    // InternalReseau.g:541:2: ( ruleBidir )
                    // InternalReseau.g:542:3: ruleBidir
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
    // InternalReseau.g:551:1: rule__DeclarationPoint__Group__0 : rule__DeclarationPoint__Group__0__Impl rule__DeclarationPoint__Group__1 ;
    public final void rule__DeclarationPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:555:1: ( rule__DeclarationPoint__Group__0__Impl rule__DeclarationPoint__Group__1 )
            // InternalReseau.g:556:2: rule__DeclarationPoint__Group__0__Impl rule__DeclarationPoint__Group__1
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
    // InternalReseau.g:563:1: rule__DeclarationPoint__Group__0__Impl : ( ( rule__DeclarationPoint__NameAssignment_0 ) ) ;
    public final void rule__DeclarationPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:567:1: ( ( ( rule__DeclarationPoint__NameAssignment_0 ) ) )
            // InternalReseau.g:568:1: ( ( rule__DeclarationPoint__NameAssignment_0 ) )
            {
            // InternalReseau.g:568:1: ( ( rule__DeclarationPoint__NameAssignment_0 ) )
            // InternalReseau.g:569:2: ( rule__DeclarationPoint__NameAssignment_0 )
            {
             before(grammarAccess.getDeclarationPointAccess().getNameAssignment_0()); 
            // InternalReseau.g:570:2: ( rule__DeclarationPoint__NameAssignment_0 )
            // InternalReseau.g:570:3: rule__DeclarationPoint__NameAssignment_0
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
    // InternalReseau.g:578:1: rule__DeclarationPoint__Group__1 : rule__DeclarationPoint__Group__1__Impl rule__DeclarationPoint__Group__2 ;
    public final void rule__DeclarationPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:582:1: ( rule__DeclarationPoint__Group__1__Impl rule__DeclarationPoint__Group__2 )
            // InternalReseau.g:583:2: rule__DeclarationPoint__Group__1__Impl rule__DeclarationPoint__Group__2
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
    // InternalReseau.g:590:1: rule__DeclarationPoint__Group__1__Impl : ( '=' ) ;
    public final void rule__DeclarationPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:594:1: ( ( '=' ) )
            // InternalReseau.g:595:1: ( '=' )
            {
            // InternalReseau.g:595:1: ( '=' )
            // InternalReseau.g:596:2: '='
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
    // InternalReseau.g:605:1: rule__DeclarationPoint__Group__2 : rule__DeclarationPoint__Group__2__Impl rule__DeclarationPoint__Group__3 ;
    public final void rule__DeclarationPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:609:1: ( rule__DeclarationPoint__Group__2__Impl rule__DeclarationPoint__Group__3 )
            // InternalReseau.g:610:2: rule__DeclarationPoint__Group__2__Impl rule__DeclarationPoint__Group__3
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
    // InternalReseau.g:617:1: rule__DeclarationPoint__Group__2__Impl : ( ( rule__DeclarationPoint__XyAssignment_2 ) ) ;
    public final void rule__DeclarationPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:621:1: ( ( ( rule__DeclarationPoint__XyAssignment_2 ) ) )
            // InternalReseau.g:622:1: ( ( rule__DeclarationPoint__XyAssignment_2 ) )
            {
            // InternalReseau.g:622:1: ( ( rule__DeclarationPoint__XyAssignment_2 ) )
            // InternalReseau.g:623:2: ( rule__DeclarationPoint__XyAssignment_2 )
            {
             before(grammarAccess.getDeclarationPointAccess().getXyAssignment_2()); 
            // InternalReseau.g:624:2: ( rule__DeclarationPoint__XyAssignment_2 )
            // InternalReseau.g:624:3: rule__DeclarationPoint__XyAssignment_2
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
    // InternalReseau.g:632:1: rule__DeclarationPoint__Group__3 : rule__DeclarationPoint__Group__3__Impl ;
    public final void rule__DeclarationPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:636:1: ( rule__DeclarationPoint__Group__3__Impl )
            // InternalReseau.g:637:2: rule__DeclarationPoint__Group__3__Impl
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
    // InternalReseau.g:643:1: rule__DeclarationPoint__Group__3__Impl : ( ';' ) ;
    public final void rule__DeclarationPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:647:1: ( ( ';' ) )
            // InternalReseau.g:648:1: ( ';' )
            {
            // InternalReseau.g:648:1: ( ';' )
            // InternalReseau.g:649:2: ';'
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
    // InternalReseau.g:659:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:663:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalReseau.g:664:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
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
    // InternalReseau.g:671:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:675:1: ( ( ruleMultiplication ) )
            // InternalReseau.g:676:1: ( ruleMultiplication )
            {
            // InternalReseau.g:676:1: ( ruleMultiplication )
            // InternalReseau.g:677:2: ruleMultiplication
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
    // InternalReseau.g:686:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:690:1: ( rule__Addition__Group__1__Impl )
            // InternalReseau.g:691:2: rule__Addition__Group__1__Impl
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
    // InternalReseau.g:697:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:701:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalReseau.g:702:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalReseau.g:702:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalReseau.g:703:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalReseau.g:704:2: ( rule__Addition__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=14 && LA10_0<=15)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalReseau.g:704:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalReseau.g:713:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:717:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalReseau.g:718:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
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
    // InternalReseau.g:725:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:729:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // InternalReseau.g:730:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // InternalReseau.g:730:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // InternalReseau.g:731:2: ( rule__Addition__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            // InternalReseau.g:732:2: ( rule__Addition__Alternatives_1_0 )
            // InternalReseau.g:732:3: rule__Addition__Alternatives_1_0
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
    // InternalReseau.g:740:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:744:1: ( rule__Addition__Group_1__1__Impl )
            // InternalReseau.g:745:2: rule__Addition__Group_1__1__Impl
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
    // InternalReseau.g:751:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:755:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // InternalReseau.g:756:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // InternalReseau.g:756:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // InternalReseau.g:757:2: ( rule__Addition__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            // InternalReseau.g:758:2: ( rule__Addition__RightAssignment_1_1 )
            // InternalReseau.g:758:3: rule__Addition__RightAssignment_1_1
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
    // InternalReseau.g:767:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:771:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // InternalReseau.g:772:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
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
    // InternalReseau.g:779:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:783:1: ( ( () ) )
            // InternalReseau.g:784:1: ( () )
            {
            // InternalReseau.g:784:1: ( () )
            // InternalReseau.g:785:2: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalReseau.g:786:2: ()
            // InternalReseau.g:786:3: 
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
    // InternalReseau.g:794:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:798:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // InternalReseau.g:799:2: rule__Addition__Group_1_0_0__1__Impl
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
    // InternalReseau.g:805:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:809:1: ( ( '+' ) )
            // InternalReseau.g:810:1: ( '+' )
            {
            // InternalReseau.g:810:1: ( '+' )
            // InternalReseau.g:811:2: '+'
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
    // InternalReseau.g:821:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:825:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // InternalReseau.g:826:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
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
    // InternalReseau.g:833:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:837:1: ( ( () ) )
            // InternalReseau.g:838:1: ( () )
            {
            // InternalReseau.g:838:1: ( () )
            // InternalReseau.g:839:2: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalReseau.g:840:2: ()
            // InternalReseau.g:840:3: 
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
    // InternalReseau.g:848:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:852:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // InternalReseau.g:853:2: rule__Addition__Group_1_0_1__1__Impl
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
    // InternalReseau.g:859:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:863:1: ( ( '-' ) )
            // InternalReseau.g:864:1: ( '-' )
            {
            // InternalReseau.g:864:1: ( '-' )
            // InternalReseau.g:865:2: '-'
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
    // InternalReseau.g:875:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:879:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalReseau.g:880:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
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
    // InternalReseau.g:887:1: rule__Multiplication__Group__0__Impl : ( rulePuissance ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:891:1: ( ( rulePuissance ) )
            // InternalReseau.g:892:1: ( rulePuissance )
            {
            // InternalReseau.g:892:1: ( rulePuissance )
            // InternalReseau.g:893:2: rulePuissance
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
    // InternalReseau.g:902:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:906:1: ( rule__Multiplication__Group__1__Impl )
            // InternalReseau.g:907:2: rule__Multiplication__Group__1__Impl
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
    // InternalReseau.g:913:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:917:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalReseau.g:918:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalReseau.g:918:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalReseau.g:919:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalReseau.g:920:2: ( rule__Multiplication__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }
                else if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalReseau.g:920:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalReseau.g:929:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:933:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalReseau.g:934:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
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
    // InternalReseau.g:941:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:945:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // InternalReseau.g:946:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // InternalReseau.g:946:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // InternalReseau.g:947:2: ( rule__Multiplication__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            // InternalReseau.g:948:2: ( rule__Multiplication__Alternatives_1_0 )
            // InternalReseau.g:948:3: rule__Multiplication__Alternatives_1_0
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
    // InternalReseau.g:956:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:960:1: ( rule__Multiplication__Group_1__1__Impl )
            // InternalReseau.g:961:2: rule__Multiplication__Group_1__1__Impl
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
    // InternalReseau.g:967:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:971:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // InternalReseau.g:972:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // InternalReseau.g:972:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // InternalReseau.g:973:2: ( rule__Multiplication__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            // InternalReseau.g:974:2: ( rule__Multiplication__RightAssignment_1_1 )
            // InternalReseau.g:974:3: rule__Multiplication__RightAssignment_1_1
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
    // InternalReseau.g:983:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:987:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // InternalReseau.g:988:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
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
    // InternalReseau.g:995:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:999:1: ( ( () ) )
            // InternalReseau.g:1000:1: ( () )
            {
            // InternalReseau.g:1000:1: ( () )
            // InternalReseau.g:1001:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            // InternalReseau.g:1002:2: ()
            // InternalReseau.g:1002:3: 
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
    // InternalReseau.g:1010:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1014:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // InternalReseau.g:1015:2: rule__Multiplication__Group_1_0_0__1__Impl
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
    // InternalReseau.g:1021:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1025:1: ( ( '*' ) )
            // InternalReseau.g:1026:1: ( '*' )
            {
            // InternalReseau.g:1026:1: ( '*' )
            // InternalReseau.g:1027:2: '*'
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
    // InternalReseau.g:1037:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1041:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // InternalReseau.g:1042:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
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
    // InternalReseau.g:1049:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1053:1: ( ( () ) )
            // InternalReseau.g:1054:1: ( () )
            {
            // InternalReseau.g:1054:1: ( () )
            // InternalReseau.g:1055:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            // InternalReseau.g:1056:2: ()
            // InternalReseau.g:1056:3: 
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
    // InternalReseau.g:1064:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1068:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // InternalReseau.g:1069:2: rule__Multiplication__Group_1_0_1__1__Impl
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
    // InternalReseau.g:1075:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1079:1: ( ( '/' ) )
            // InternalReseau.g:1080:1: ( '/' )
            {
            // InternalReseau.g:1080:1: ( '/' )
            // InternalReseau.g:1081:2: '/'
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
    // InternalReseau.g:1091:1: rule__Puissance__Group__0 : rule__Puissance__Group__0__Impl rule__Puissance__Group__1 ;
    public final void rule__Puissance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1095:1: ( rule__Puissance__Group__0__Impl rule__Puissance__Group__1 )
            // InternalReseau.g:1096:2: rule__Puissance__Group__0__Impl rule__Puissance__Group__1
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
    // InternalReseau.g:1103:1: rule__Puissance__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Puissance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1107:1: ( ( rulePrimaryExpression ) )
            // InternalReseau.g:1108:1: ( rulePrimaryExpression )
            {
            // InternalReseau.g:1108:1: ( rulePrimaryExpression )
            // InternalReseau.g:1109:2: rulePrimaryExpression
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
    // InternalReseau.g:1118:1: rule__Puissance__Group__1 : rule__Puissance__Group__1__Impl ;
    public final void rule__Puissance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1122:1: ( rule__Puissance__Group__1__Impl )
            // InternalReseau.g:1123:2: rule__Puissance__Group__1__Impl
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
    // InternalReseau.g:1129:1: rule__Puissance__Group__1__Impl : ( ( rule__Puissance__Alternatives_1 )? ) ;
    public final void rule__Puissance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1133:1: ( ( ( rule__Puissance__Alternatives_1 )? ) )
            // InternalReseau.g:1134:1: ( ( rule__Puissance__Alternatives_1 )? )
            {
            // InternalReseau.g:1134:1: ( ( rule__Puissance__Alternatives_1 )? )
            // InternalReseau.g:1135:2: ( rule__Puissance__Alternatives_1 )?
            {
             before(grammarAccess.getPuissanceAccess().getAlternatives_1()); 
            // InternalReseau.g:1136:2: ( rule__Puissance__Alternatives_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=18 && LA12_0<=19)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalReseau.g:1136:3: rule__Puissance__Alternatives_1
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
    // InternalReseau.g:1145:1: rule__Puissance__Group_1_0__0 : rule__Puissance__Group_1_0__0__Impl rule__Puissance__Group_1_0__1 ;
    public final void rule__Puissance__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1149:1: ( rule__Puissance__Group_1_0__0__Impl rule__Puissance__Group_1_0__1 )
            // InternalReseau.g:1150:2: rule__Puissance__Group_1_0__0__Impl rule__Puissance__Group_1_0__1
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
    // InternalReseau.g:1157:1: rule__Puissance__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Puissance__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1161:1: ( ( () ) )
            // InternalReseau.g:1162:1: ( () )
            {
            // InternalReseau.g:1162:1: ( () )
            // InternalReseau.g:1163:2: ()
            {
             before(grammarAccess.getPuissanceAccess().getDegreeLeftAction_1_0_0()); 
            // InternalReseau.g:1164:2: ()
            // InternalReseau.g:1164:3: 
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
    // InternalReseau.g:1172:1: rule__Puissance__Group_1_0__1 : rule__Puissance__Group_1_0__1__Impl ;
    public final void rule__Puissance__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1176:1: ( rule__Puissance__Group_1_0__1__Impl )
            // InternalReseau.g:1177:2: rule__Puissance__Group_1_0__1__Impl
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
    // InternalReseau.g:1183:1: rule__Puissance__Group_1_0__1__Impl : ( '\\u00B0' ) ;
    public final void rule__Puissance__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1187:1: ( ( '\\u00B0' ) )
            // InternalReseau.g:1188:1: ( '\\u00B0' )
            {
            // InternalReseau.g:1188:1: ( '\\u00B0' )
            // InternalReseau.g:1189:2: '\\u00B0'
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
    // InternalReseau.g:1199:1: rule__Puissance__Group_1_1__0 : rule__Puissance__Group_1_1__0__Impl rule__Puissance__Group_1_1__1 ;
    public final void rule__Puissance__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1203:1: ( rule__Puissance__Group_1_1__0__Impl rule__Puissance__Group_1_1__1 )
            // InternalReseau.g:1204:2: rule__Puissance__Group_1_1__0__Impl rule__Puissance__Group_1_1__1
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
    // InternalReseau.g:1211:1: rule__Puissance__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Puissance__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1215:1: ( ( () ) )
            // InternalReseau.g:1216:1: ( () )
            {
            // InternalReseau.g:1216:1: ( () )
            // InternalReseau.g:1217:2: ()
            {
             before(grammarAccess.getPuissanceAccess().getPowLeftAction_1_1_0()); 
            // InternalReseau.g:1218:2: ()
            // InternalReseau.g:1218:3: 
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
    // InternalReseau.g:1226:1: rule__Puissance__Group_1_1__1 : rule__Puissance__Group_1_1__1__Impl rule__Puissance__Group_1_1__2 ;
    public final void rule__Puissance__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1230:1: ( rule__Puissance__Group_1_1__1__Impl rule__Puissance__Group_1_1__2 )
            // InternalReseau.g:1231:2: rule__Puissance__Group_1_1__1__Impl rule__Puissance__Group_1_1__2
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
    // InternalReseau.g:1238:1: rule__Puissance__Group_1_1__1__Impl : ( '^' ) ;
    public final void rule__Puissance__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1242:1: ( ( '^' ) )
            // InternalReseau.g:1243:1: ( '^' )
            {
            // InternalReseau.g:1243:1: ( '^' )
            // InternalReseau.g:1244:2: '^'
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
    // InternalReseau.g:1253:1: rule__Puissance__Group_1_1__2 : rule__Puissance__Group_1_1__2__Impl ;
    public final void rule__Puissance__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1257:1: ( rule__Puissance__Group_1_1__2__Impl )
            // InternalReseau.g:1258:2: rule__Puissance__Group_1_1__2__Impl
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
    // InternalReseau.g:1264:1: rule__Puissance__Group_1_1__2__Impl : ( ( rule__Puissance__RightAssignment_1_1_2 ) ) ;
    public final void rule__Puissance__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1268:1: ( ( ( rule__Puissance__RightAssignment_1_1_2 ) ) )
            // InternalReseau.g:1269:1: ( ( rule__Puissance__RightAssignment_1_1_2 ) )
            {
            // InternalReseau.g:1269:1: ( ( rule__Puissance__RightAssignment_1_1_2 ) )
            // InternalReseau.g:1270:2: ( rule__Puissance__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getPuissanceAccess().getRightAssignment_1_1_2()); 
            // InternalReseau.g:1271:2: ( rule__Puissance__RightAssignment_1_1_2 )
            // InternalReseau.g:1271:3: rule__Puissance__RightAssignment_1_1_2
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
    // InternalReseau.g:1280:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1284:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalReseau.g:1285:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
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
    // InternalReseau.g:1292:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1296:1: ( ( '(' ) )
            // InternalReseau.g:1297:1: ( '(' )
            {
            // InternalReseau.g:1297:1: ( '(' )
            // InternalReseau.g:1298:2: '('
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
    // InternalReseau.g:1307:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1311:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalReseau.g:1312:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
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
    // InternalReseau.g:1319:1: rule__PrimaryExpression__Group_0__1__Impl : ( rulePoint ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1323:1: ( ( rulePoint ) )
            // InternalReseau.g:1324:1: ( rulePoint )
            {
            // InternalReseau.g:1324:1: ( rulePoint )
            // InternalReseau.g:1325:2: rulePoint
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
    // InternalReseau.g:1334:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl rule__PrimaryExpression__Group_0__3 ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1338:1: ( rule__PrimaryExpression__Group_0__2__Impl rule__PrimaryExpression__Group_0__3 )
            // InternalReseau.g:1339:2: rule__PrimaryExpression__Group_0__2__Impl rule__PrimaryExpression__Group_0__3
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
    // InternalReseau.g:1346:1: rule__PrimaryExpression__Group_0__2__Impl : ( ( rule__PrimaryExpression__Group_0_2__0 )? ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1350:1: ( ( ( rule__PrimaryExpression__Group_0_2__0 )? ) )
            // InternalReseau.g:1351:1: ( ( rule__PrimaryExpression__Group_0_2__0 )? )
            {
            // InternalReseau.g:1351:1: ( ( rule__PrimaryExpression__Group_0_2__0 )? )
            // InternalReseau.g:1352:2: ( rule__PrimaryExpression__Group_0_2__0 )?
            {
             before(grammarAccess.getPrimaryExpressionAccess().getGroup_0_2()); 
            // InternalReseau.g:1353:2: ( rule__PrimaryExpression__Group_0_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalReseau.g:1353:3: rule__PrimaryExpression__Group_0_2__0
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
    // InternalReseau.g:1361:1: rule__PrimaryExpression__Group_0__3 : rule__PrimaryExpression__Group_0__3__Impl ;
    public final void rule__PrimaryExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1365:1: ( rule__PrimaryExpression__Group_0__3__Impl )
            // InternalReseau.g:1366:2: rule__PrimaryExpression__Group_0__3__Impl
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
    // InternalReseau.g:1372:1: rule__PrimaryExpression__Group_0__3__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1376:1: ( ( ')' ) )
            // InternalReseau.g:1377:1: ( ')' )
            {
            // InternalReseau.g:1377:1: ( ')' )
            // InternalReseau.g:1378:2: ')'
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
    // InternalReseau.g:1388:1: rule__PrimaryExpression__Group_0_2__0 : rule__PrimaryExpression__Group_0_2__0__Impl rule__PrimaryExpression__Group_0_2__1 ;
    public final void rule__PrimaryExpression__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1392:1: ( rule__PrimaryExpression__Group_0_2__0__Impl rule__PrimaryExpression__Group_0_2__1 )
            // InternalReseau.g:1393:2: rule__PrimaryExpression__Group_0_2__0__Impl rule__PrimaryExpression__Group_0_2__1
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
    // InternalReseau.g:1400:1: rule__PrimaryExpression__Group_0_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1404:1: ( ( () ) )
            // InternalReseau.g:1405:1: ( () )
            {
            // InternalReseau.g:1405:1: ( () )
            // InternalReseau.g:1406:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getCoordonneeLiteralLeftAction_0_2_0()); 
            // InternalReseau.g:1407:2: ()
            // InternalReseau.g:1407:3: 
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
    // InternalReseau.g:1415:1: rule__PrimaryExpression__Group_0_2__1 : rule__PrimaryExpression__Group_0_2__1__Impl rule__PrimaryExpression__Group_0_2__2 ;
    public final void rule__PrimaryExpression__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1419:1: ( rule__PrimaryExpression__Group_0_2__1__Impl rule__PrimaryExpression__Group_0_2__2 )
            // InternalReseau.g:1420:2: rule__PrimaryExpression__Group_0_2__1__Impl rule__PrimaryExpression__Group_0_2__2
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
    // InternalReseau.g:1427:1: rule__PrimaryExpression__Group_0_2__1__Impl : ( ',' ) ;
    public final void rule__PrimaryExpression__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1431:1: ( ( ',' ) )
            // InternalReseau.g:1432:1: ( ',' )
            {
            // InternalReseau.g:1432:1: ( ',' )
            // InternalReseau.g:1433:2: ','
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
    // InternalReseau.g:1442:1: rule__PrimaryExpression__Group_0_2__2 : rule__PrimaryExpression__Group_0_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1446:1: ( rule__PrimaryExpression__Group_0_2__2__Impl )
            // InternalReseau.g:1447:2: rule__PrimaryExpression__Group_0_2__2__Impl
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
    // InternalReseau.g:1453:1: rule__PrimaryExpression__Group_0_2__2__Impl : ( ( rule__PrimaryExpression__RightAssignment_0_2_2 ) ) ;
    public final void rule__PrimaryExpression__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1457:1: ( ( ( rule__PrimaryExpression__RightAssignment_0_2_2 ) ) )
            // InternalReseau.g:1458:1: ( ( rule__PrimaryExpression__RightAssignment_0_2_2 ) )
            {
            // InternalReseau.g:1458:1: ( ( rule__PrimaryExpression__RightAssignment_0_2_2 ) )
            // InternalReseau.g:1459:2: ( rule__PrimaryExpression__RightAssignment_0_2_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightAssignment_0_2_2()); 
            // InternalReseau.g:1460:2: ( rule__PrimaryExpression__RightAssignment_0_2_2 )
            // InternalReseau.g:1460:3: rule__PrimaryExpression__RightAssignment_0_2_2
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
    // InternalReseau.g:1469:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1473:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalReseau.g:1474:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
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
    // InternalReseau.g:1481:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1485:1: ( ( () ) )
            // InternalReseau.g:1486:1: ( () )
            {
            // InternalReseau.g:1486:1: ( () )
            // InternalReseau.g:1487:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0()); 
            // InternalReseau.g:1488:2: ()
            // InternalReseau.g:1488:3: 
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
    // InternalReseau.g:1496:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1500:1: ( rule__PrimaryExpression__Group_1__1__Impl )
            // InternalReseau.g:1501:2: rule__PrimaryExpression__Group_1__1__Impl
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
    // InternalReseau.g:1507:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1511:1: ( ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) )
            // InternalReseau.g:1512:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            {
            // InternalReseau.g:1512:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            // InternalReseau.g:1513:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 
            // InternalReseau.g:1514:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            // InternalReseau.g:1514:3: rule__PrimaryExpression__ValueAssignment_1_1
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
    // InternalReseau.g:1523:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1527:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalReseau.g:1528:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
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
    // InternalReseau.g:1535:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1539:1: ( ( () ) )
            // InternalReseau.g:1540:1: ( () )
            {
            // InternalReseau.g:1540:1: ( () )
            // InternalReseau.g:1541:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNegativeAction_2_0()); 
            // InternalReseau.g:1542:2: ()
            // InternalReseau.g:1542:3: 
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
    // InternalReseau.g:1550:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1554:1: ( rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 )
            // InternalReseau.g:1555:2: rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2
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
    // InternalReseau.g:1562:1: rule__PrimaryExpression__Group_2__1__Impl : ( '-' ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1566:1: ( ( '-' ) )
            // InternalReseau.g:1567:1: ( '-' )
            {
            // InternalReseau.g:1567:1: ( '-' )
            // InternalReseau.g:1568:2: '-'
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
    // InternalReseau.g:1577:1: rule__PrimaryExpression__Group_2__2 : rule__PrimaryExpression__Group_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1581:1: ( rule__PrimaryExpression__Group_2__2__Impl )
            // InternalReseau.g:1582:2: rule__PrimaryExpression__Group_2__2__Impl
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
    // InternalReseau.g:1588:1: rule__PrimaryExpression__Group_2__2__Impl : ( ( rule__PrimaryExpression__ValueAssignment_2_2 ) ) ;
    public final void rule__PrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1592:1: ( ( ( rule__PrimaryExpression__ValueAssignment_2_2 ) ) )
            // InternalReseau.g:1593:1: ( ( rule__PrimaryExpression__ValueAssignment_2_2 ) )
            {
            // InternalReseau.g:1593:1: ( ( rule__PrimaryExpression__ValueAssignment_2_2 ) )
            // InternalReseau.g:1594:2: ( rule__PrimaryExpression__ValueAssignment_2_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_2()); 
            // InternalReseau.g:1595:2: ( rule__PrimaryExpression__ValueAssignment_2_2 )
            // InternalReseau.g:1595:3: rule__PrimaryExpression__ValueAssignment_2_2
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
    // InternalReseau.g:1604:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1608:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // InternalReseau.g:1609:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
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
    // InternalReseau.g:1616:1: rule__PrimaryExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1620:1: ( ( () ) )
            // InternalReseau.g:1621:1: ( () )
            {
            // InternalReseau.g:1621:1: ( () )
            // InternalReseau.g:1622:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getDeclaredAction_3_0()); 
            // InternalReseau.g:1623:2: ()
            // InternalReseau.g:1623:3: 
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
    // InternalReseau.g:1631:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1635:1: ( rule__PrimaryExpression__Group_3__1__Impl )
            // InternalReseau.g:1636:2: rule__PrimaryExpression__Group_3__1__Impl
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
    // InternalReseau.g:1642:1: rule__PrimaryExpression__Group_3__1__Impl : ( ( rule__PrimaryExpression__DeclAssignment_3_1 ) ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1646:1: ( ( ( rule__PrimaryExpression__DeclAssignment_3_1 ) ) )
            // InternalReseau.g:1647:1: ( ( rule__PrimaryExpression__DeclAssignment_3_1 ) )
            {
            // InternalReseau.g:1647:1: ( ( rule__PrimaryExpression__DeclAssignment_3_1 ) )
            // InternalReseau.g:1648:2: ( rule__PrimaryExpression__DeclAssignment_3_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getDeclAssignment_3_1()); 
            // InternalReseau.g:1649:2: ( rule__PrimaryExpression__DeclAssignment_3_1 )
            // InternalReseau.g:1649:3: rule__PrimaryExpression__DeclAssignment_3_1
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
    // InternalReseau.g:1658:1: rule__PrimaryExpression__Group_4__0 : rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 ;
    public final void rule__PrimaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1662:1: ( rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 )
            // InternalReseau.g:1663:2: rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1
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
    // InternalReseau.g:1670:1: rule__PrimaryExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1674:1: ( ( () ) )
            // InternalReseau.g:1675:1: ( () )
            {
            // InternalReseau.g:1675:1: ( () )
            // InternalReseau.g:1676:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNordAction_4_0()); 
            // InternalReseau.g:1677:2: ()
            // InternalReseau.g:1677:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getNordAction_4_0()); 

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
    // InternalReseau.g:1685:1: rule__PrimaryExpression__Group_4__1 : rule__PrimaryExpression__Group_4__1__Impl ;
    public final void rule__PrimaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1689:1: ( rule__PrimaryExpression__Group_4__1__Impl )
            // InternalReseau.g:1690:2: rule__PrimaryExpression__Group_4__1__Impl
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
    // InternalReseau.g:1696:1: rule__PrimaryExpression__Group_4__1__Impl : ( 'nord' ) ;
    public final void rule__PrimaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1700:1: ( ( 'nord' ) )
            // InternalReseau.g:1701:1: ( 'nord' )
            {
            // InternalReseau.g:1701:1: ( 'nord' )
            // InternalReseau.g:1702:2: 'nord'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNordKeyword_4_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getNordKeyword_4_1()); 

            }


            }

        }
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
    // InternalReseau.g:1712:1: rule__PrimaryExpression__Group_5__0 : rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1 ;
    public final void rule__PrimaryExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1716:1: ( rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1 )
            // InternalReseau.g:1717:2: rule__PrimaryExpression__Group_5__0__Impl rule__PrimaryExpression__Group_5__1
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
    // InternalReseau.g:1724:1: rule__PrimaryExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1728:1: ( ( () ) )
            // InternalReseau.g:1729:1: ( () )
            {
            // InternalReseau.g:1729:1: ( () )
            // InternalReseau.g:1730:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getSudAction_5_0()); 
            // InternalReseau.g:1731:2: ()
            // InternalReseau.g:1731:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getSudAction_5_0()); 

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
    // InternalReseau.g:1739:1: rule__PrimaryExpression__Group_5__1 : rule__PrimaryExpression__Group_5__1__Impl ;
    public final void rule__PrimaryExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1743:1: ( rule__PrimaryExpression__Group_5__1__Impl )
            // InternalReseau.g:1744:2: rule__PrimaryExpression__Group_5__1__Impl
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
    // InternalReseau.g:1750:1: rule__PrimaryExpression__Group_5__1__Impl : ( 'sud' ) ;
    public final void rule__PrimaryExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1754:1: ( ( 'sud' ) )
            // InternalReseau.g:1755:1: ( 'sud' )
            {
            // InternalReseau.g:1755:1: ( 'sud' )
            // InternalReseau.g:1756:2: 'sud'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getSudKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getSudKeyword_5_1()); 

            }


            }

        }
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
    // InternalReseau.g:1766:1: rule__PrimaryExpression__Group_6__0 : rule__PrimaryExpression__Group_6__0__Impl rule__PrimaryExpression__Group_6__1 ;
    public final void rule__PrimaryExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1770:1: ( rule__PrimaryExpression__Group_6__0__Impl rule__PrimaryExpression__Group_6__1 )
            // InternalReseau.g:1771:2: rule__PrimaryExpression__Group_6__0__Impl rule__PrimaryExpression__Group_6__1
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
    // InternalReseau.g:1778:1: rule__PrimaryExpression__Group_6__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1782:1: ( ( () ) )
            // InternalReseau.g:1783:1: ( () )
            {
            // InternalReseau.g:1783:1: ( () )
            // InternalReseau.g:1784:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getEstAction_6_0()); 
            // InternalReseau.g:1785:2: ()
            // InternalReseau.g:1785:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getEstAction_6_0()); 

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
    // InternalReseau.g:1793:1: rule__PrimaryExpression__Group_6__1 : rule__PrimaryExpression__Group_6__1__Impl ;
    public final void rule__PrimaryExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1797:1: ( rule__PrimaryExpression__Group_6__1__Impl )
            // InternalReseau.g:1798:2: rule__PrimaryExpression__Group_6__1__Impl
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
    // InternalReseau.g:1804:1: rule__PrimaryExpression__Group_6__1__Impl : ( 'est' ) ;
    public final void rule__PrimaryExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1808:1: ( ( 'est' ) )
            // InternalReseau.g:1809:1: ( 'est' )
            {
            // InternalReseau.g:1809:1: ( 'est' )
            // InternalReseau.g:1810:2: 'est'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getEstKeyword_6_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getEstKeyword_6_1()); 

            }


            }

        }
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
    // InternalReseau.g:1820:1: rule__PrimaryExpression__Group_7__0 : rule__PrimaryExpression__Group_7__0__Impl rule__PrimaryExpression__Group_7__1 ;
    public final void rule__PrimaryExpression__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1824:1: ( rule__PrimaryExpression__Group_7__0__Impl rule__PrimaryExpression__Group_7__1 )
            // InternalReseau.g:1825:2: rule__PrimaryExpression__Group_7__0__Impl rule__PrimaryExpression__Group_7__1
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
    // InternalReseau.g:1832:1: rule__PrimaryExpression__Group_7__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1836:1: ( ( () ) )
            // InternalReseau.g:1837:1: ( () )
            {
            // InternalReseau.g:1837:1: ( () )
            // InternalReseau.g:1838:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOuestAction_7_0()); 
            // InternalReseau.g:1839:2: ()
            // InternalReseau.g:1839:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getOuestAction_7_0()); 

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
    // InternalReseau.g:1847:1: rule__PrimaryExpression__Group_7__1 : rule__PrimaryExpression__Group_7__1__Impl ;
    public final void rule__PrimaryExpression__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1851:1: ( rule__PrimaryExpression__Group_7__1__Impl )
            // InternalReseau.g:1852:2: rule__PrimaryExpression__Group_7__1__Impl
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
    // InternalReseau.g:1858:1: rule__PrimaryExpression__Group_7__1__Impl : ( 'ouest' ) ;
    public final void rule__PrimaryExpression__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1862:1: ( ( 'ouest' ) )
            // InternalReseau.g:1863:1: ( 'ouest' )
            {
            // InternalReseau.g:1863:1: ( 'ouest' )
            // InternalReseau.g:1864:2: 'ouest'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getOuestKeyword_7_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getOuestKeyword_7_1()); 

            }


            }

        }
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
    // InternalReseau.g:1874:1: rule__PrimaryExpression__Group_8__0 : rule__PrimaryExpression__Group_8__0__Impl rule__PrimaryExpression__Group_8__1 ;
    public final void rule__PrimaryExpression__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1878:1: ( rule__PrimaryExpression__Group_8__0__Impl rule__PrimaryExpression__Group_8__1 )
            // InternalReseau.g:1879:2: rule__PrimaryExpression__Group_8__0__Impl rule__PrimaryExpression__Group_8__1
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
    // InternalReseau.g:1886:1: rule__PrimaryExpression__Group_8__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1890:1: ( ( () ) )
            // InternalReseau.g:1891:1: ( () )
            {
            // InternalReseau.g:1891:1: ( () )
            // InternalReseau.g:1892:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getPiAction_8_0()); 
            // InternalReseau.g:1893:2: ()
            // InternalReseau.g:1893:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getPiAction_8_0()); 

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
    // InternalReseau.g:1901:1: rule__PrimaryExpression__Group_8__1 : rule__PrimaryExpression__Group_8__1__Impl ;
    public final void rule__PrimaryExpression__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1905:1: ( rule__PrimaryExpression__Group_8__1__Impl )
            // InternalReseau.g:1906:2: rule__PrimaryExpression__Group_8__1__Impl
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
    // InternalReseau.g:1912:1: rule__PrimaryExpression__Group_8__1__Impl : ( 'pi' ) ;
    public final void rule__PrimaryExpression__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1916:1: ( ( 'pi' ) )
            // InternalReseau.g:1917:1: ( 'pi' )
            {
            // InternalReseau.g:1917:1: ( 'pi' )
            // InternalReseau.g:1918:2: 'pi'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getPiKeyword_8_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getPiKeyword_8_1()); 

            }


            }

        }
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
    // InternalReseau.g:1928:1: rule__PrimaryExpression__Group_9__0 : rule__PrimaryExpression__Group_9__0__Impl rule__PrimaryExpression__Group_9__1 ;
    public final void rule__PrimaryExpression__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1932:1: ( rule__PrimaryExpression__Group_9__0__Impl rule__PrimaryExpression__Group_9__1 )
            // InternalReseau.g:1933:2: rule__PrimaryExpression__Group_9__0__Impl rule__PrimaryExpression__Group_9__1
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
    // InternalReseau.g:1940:1: rule__PrimaryExpression__Group_9__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1944:1: ( ( () ) )
            // InternalReseau.g:1945:1: ( () )
            {
            // InternalReseau.g:1945:1: ( () )
            // InternalReseau.g:1946:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getEulerAction_9_0()); 
            // InternalReseau.g:1947:2: ()
            // InternalReseau.g:1947:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getEulerAction_9_0()); 

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
    // InternalReseau.g:1955:1: rule__PrimaryExpression__Group_9__1 : rule__PrimaryExpression__Group_9__1__Impl ;
    public final void rule__PrimaryExpression__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1959:1: ( rule__PrimaryExpression__Group_9__1__Impl )
            // InternalReseau.g:1960:2: rule__PrimaryExpression__Group_9__1__Impl
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
    // InternalReseau.g:1966:1: rule__PrimaryExpression__Group_9__1__Impl : ( 'e' ) ;
    public final void rule__PrimaryExpression__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1970:1: ( ( 'e' ) )
            // InternalReseau.g:1971:1: ( 'e' )
            {
            // InternalReseau.g:1971:1: ( 'e' )
            // InternalReseau.g:1972:2: 'e'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getEKeyword_9_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getEKeyword_9_1()); 

            }


            }

        }
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
    // InternalReseau.g:1982:1: rule__PrimaryExpression__Group_10__0 : rule__PrimaryExpression__Group_10__0__Impl rule__PrimaryExpression__Group_10__1 ;
    public final void rule__PrimaryExpression__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1986:1: ( rule__PrimaryExpression__Group_10__0__Impl rule__PrimaryExpression__Group_10__1 )
            // InternalReseau.g:1987:2: rule__PrimaryExpression__Group_10__0__Impl rule__PrimaryExpression__Group_10__1
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
    // InternalReseau.g:1994:1: rule__PrimaryExpression__Group_10__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:1998:1: ( ( () ) )
            // InternalReseau.g:1999:1: ( () )
            {
            // InternalReseau.g:1999:1: ( () )
            // InternalReseau.g:2000:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getIAction_10_0()); 
            // InternalReseau.g:2001:2: ()
            // InternalReseau.g:2001:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getIAction_10_0()); 

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
    // InternalReseau.g:2009:1: rule__PrimaryExpression__Group_10__1 : rule__PrimaryExpression__Group_10__1__Impl ;
    public final void rule__PrimaryExpression__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2013:1: ( rule__PrimaryExpression__Group_10__1__Impl )
            // InternalReseau.g:2014:2: rule__PrimaryExpression__Group_10__1__Impl
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
    // InternalReseau.g:2020:1: rule__PrimaryExpression__Group_10__1__Impl : ( 'i' ) ;
    public final void rule__PrimaryExpression__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2024:1: ( ( 'i' ) )
            // InternalReseau.g:2025:1: ( 'i' )
            {
            // InternalReseau.g:2025:1: ( 'i' )
            // InternalReseau.g:2026:2: 'i'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getIKeyword_10_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getIKeyword_10_1()); 

            }


            }

        }
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
    // InternalReseau.g:2036:1: rule__PrimaryExpression__Group_11__0 : rule__PrimaryExpression__Group_11__0__Impl rule__PrimaryExpression__Group_11__1 ;
    public final void rule__PrimaryExpression__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2040:1: ( rule__PrimaryExpression__Group_11__0__Impl rule__PrimaryExpression__Group_11__1 )
            // InternalReseau.g:2041:2: rule__PrimaryExpression__Group_11__0__Impl rule__PrimaryExpression__Group_11__1
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
    // InternalReseau.g:2048:1: rule__PrimaryExpression__Group_11__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2052:1: ( ( () ) )
            // InternalReseau.g:2053:1: ( () )
            {
            // InternalReseau.g:2053:1: ( () )
            // InternalReseau.g:2054:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getXAction_11_0()); 
            // InternalReseau.g:2055:2: ()
            // InternalReseau.g:2055:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getXAction_11_0()); 

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
    // InternalReseau.g:2063:1: rule__PrimaryExpression__Group_11__1 : rule__PrimaryExpression__Group_11__1__Impl rule__PrimaryExpression__Group_11__2 ;
    public final void rule__PrimaryExpression__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2067:1: ( rule__PrimaryExpression__Group_11__1__Impl rule__PrimaryExpression__Group_11__2 )
            // InternalReseau.g:2068:2: rule__PrimaryExpression__Group_11__1__Impl rule__PrimaryExpression__Group_11__2
            {
            pushFollow(FOLLOW_30);
            rule__PrimaryExpression__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_11__2();

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
    // InternalReseau.g:2075:1: rule__PrimaryExpression__Group_11__1__Impl : ( 'x' ) ;
    public final void rule__PrimaryExpression__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2079:1: ( ( 'x' ) )
            // InternalReseau.g:2080:1: ( 'x' )
            {
            // InternalReseau.g:2080:1: ( 'x' )
            // InternalReseau.g:2081:2: 'x'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getXKeyword_11_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getXKeyword_11_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__PrimaryExpression__Group_11__2"
    // InternalReseau.g:2090:1: rule__PrimaryExpression__Group_11__2 : rule__PrimaryExpression__Group_11__2__Impl rule__PrimaryExpression__Group_11__3 ;
    public final void rule__PrimaryExpression__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2094:1: ( rule__PrimaryExpression__Group_11__2__Impl rule__PrimaryExpression__Group_11__3 )
            // InternalReseau.g:2095:2: rule__PrimaryExpression__Group_11__2__Impl rule__PrimaryExpression__Group_11__3
            {
            pushFollow(FOLLOW_7);
            rule__PrimaryExpression__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_11__3();

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
    // $ANTLR end "rule__PrimaryExpression__Group_11__2"


    // $ANTLR start "rule__PrimaryExpression__Group_11__2__Impl"
    // InternalReseau.g:2102:1: rule__PrimaryExpression__Group_11__2__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2106:1: ( ( '(' ) )
            // InternalReseau.g:2107:1: ( '(' )
            {
            // InternalReseau.g:2107:1: ( '(' )
            // InternalReseau.g:2108:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_11_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_11__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_11__3"
    // InternalReseau.g:2117:1: rule__PrimaryExpression__Group_11__3 : rule__PrimaryExpression__Group_11__3__Impl rule__PrimaryExpression__Group_11__4 ;
    public final void rule__PrimaryExpression__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2121:1: ( rule__PrimaryExpression__Group_11__3__Impl rule__PrimaryExpression__Group_11__4 )
            // InternalReseau.g:2122:2: rule__PrimaryExpression__Group_11__3__Impl rule__PrimaryExpression__Group_11__4
            {
            pushFollow(FOLLOW_31);
            rule__PrimaryExpression__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_11__4();

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
    // $ANTLR end "rule__PrimaryExpression__Group_11__3"


    // $ANTLR start "rule__PrimaryExpression__Group_11__3__Impl"
    // InternalReseau.g:2129:1: rule__PrimaryExpression__Group_11__3__Impl : ( ( rule__PrimaryExpression__ValueAssignment_11_3 ) ) ;
    public final void rule__PrimaryExpression__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2133:1: ( ( ( rule__PrimaryExpression__ValueAssignment_11_3 ) ) )
            // InternalReseau.g:2134:1: ( ( rule__PrimaryExpression__ValueAssignment_11_3 ) )
            {
            // InternalReseau.g:2134:1: ( ( rule__PrimaryExpression__ValueAssignment_11_3 ) )
            // InternalReseau.g:2135:2: ( rule__PrimaryExpression__ValueAssignment_11_3 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_11_3()); 
            // InternalReseau.g:2136:2: ( rule__PrimaryExpression__ValueAssignment_11_3 )
            // InternalReseau.g:2136:3: rule__PrimaryExpression__ValueAssignment_11_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ValueAssignment_11_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_11__3__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_11__4"
    // InternalReseau.g:2144:1: rule__PrimaryExpression__Group_11__4 : rule__PrimaryExpression__Group_11__4__Impl ;
    public final void rule__PrimaryExpression__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2148:1: ( rule__PrimaryExpression__Group_11__4__Impl )
            // InternalReseau.g:2149:2: rule__PrimaryExpression__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_11__4__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_11__4"


    // $ANTLR start "rule__PrimaryExpression__Group_11__4__Impl"
    // InternalReseau.g:2155:1: rule__PrimaryExpression__Group_11__4__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2159:1: ( ( ')' ) )
            // InternalReseau.g:2160:1: ( ')' )
            {
            // InternalReseau.g:2160:1: ( ')' )
            // InternalReseau.g:2161:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_11_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_11__4__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_12__0"
    // InternalReseau.g:2171:1: rule__PrimaryExpression__Group_12__0 : rule__PrimaryExpression__Group_12__0__Impl rule__PrimaryExpression__Group_12__1 ;
    public final void rule__PrimaryExpression__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2175:1: ( rule__PrimaryExpression__Group_12__0__Impl rule__PrimaryExpression__Group_12__1 )
            // InternalReseau.g:2176:2: rule__PrimaryExpression__Group_12__0__Impl rule__PrimaryExpression__Group_12__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalReseau.g:2183:1: rule__PrimaryExpression__Group_12__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2187:1: ( ( () ) )
            // InternalReseau.g:2188:1: ( () )
            {
            // InternalReseau.g:2188:1: ( () )
            // InternalReseau.g:2189:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getYAction_12_0()); 
            // InternalReseau.g:2190:2: ()
            // InternalReseau.g:2190:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getYAction_12_0()); 

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
    // InternalReseau.g:2198:1: rule__PrimaryExpression__Group_12__1 : rule__PrimaryExpression__Group_12__1__Impl rule__PrimaryExpression__Group_12__2 ;
    public final void rule__PrimaryExpression__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2202:1: ( rule__PrimaryExpression__Group_12__1__Impl rule__PrimaryExpression__Group_12__2 )
            // InternalReseau.g:2203:2: rule__PrimaryExpression__Group_12__1__Impl rule__PrimaryExpression__Group_12__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalReseau.g:2210:1: rule__PrimaryExpression__Group_12__1__Impl : ( 'y' ) ;
    public final void rule__PrimaryExpression__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2214:1: ( ( 'y' ) )
            // InternalReseau.g:2215:1: ( 'y' )
            {
            // InternalReseau.g:2215:1: ( 'y' )
            // InternalReseau.g:2216:2: 'y'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getYKeyword_12_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getYKeyword_12_1()); 

            }


            }

        }
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
    // InternalReseau.g:2225:1: rule__PrimaryExpression__Group_12__2 : rule__PrimaryExpression__Group_12__2__Impl rule__PrimaryExpression__Group_12__3 ;
    public final void rule__PrimaryExpression__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2229:1: ( rule__PrimaryExpression__Group_12__2__Impl rule__PrimaryExpression__Group_12__3 )
            // InternalReseau.g:2230:2: rule__PrimaryExpression__Group_12__2__Impl rule__PrimaryExpression__Group_12__3
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
    // InternalReseau.g:2237:1: rule__PrimaryExpression__Group_12__2__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2241:1: ( ( '(' ) )
            // InternalReseau.g:2242:1: ( '(' )
            {
            // InternalReseau.g:2242:1: ( '(' )
            // InternalReseau.g:2243:2: '('
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
    // InternalReseau.g:2252:1: rule__PrimaryExpression__Group_12__3 : rule__PrimaryExpression__Group_12__3__Impl rule__PrimaryExpression__Group_12__4 ;
    public final void rule__PrimaryExpression__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2256:1: ( rule__PrimaryExpression__Group_12__3__Impl rule__PrimaryExpression__Group_12__4 )
            // InternalReseau.g:2257:2: rule__PrimaryExpression__Group_12__3__Impl rule__PrimaryExpression__Group_12__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalReseau.g:2264:1: rule__PrimaryExpression__Group_12__3__Impl : ( ( rule__PrimaryExpression__ValueAssignment_12_3 ) ) ;
    public final void rule__PrimaryExpression__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2268:1: ( ( ( rule__PrimaryExpression__ValueAssignment_12_3 ) ) )
            // InternalReseau.g:2269:1: ( ( rule__PrimaryExpression__ValueAssignment_12_3 ) )
            {
            // InternalReseau.g:2269:1: ( ( rule__PrimaryExpression__ValueAssignment_12_3 ) )
            // InternalReseau.g:2270:2: ( rule__PrimaryExpression__ValueAssignment_12_3 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_12_3()); 
            // InternalReseau.g:2271:2: ( rule__PrimaryExpression__ValueAssignment_12_3 )
            // InternalReseau.g:2271:3: rule__PrimaryExpression__ValueAssignment_12_3
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
    // InternalReseau.g:2279:1: rule__PrimaryExpression__Group_12__4 : rule__PrimaryExpression__Group_12__4__Impl ;
    public final void rule__PrimaryExpression__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2283:1: ( rule__PrimaryExpression__Group_12__4__Impl )
            // InternalReseau.g:2284:2: rule__PrimaryExpression__Group_12__4__Impl
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
    // InternalReseau.g:2290:1: rule__PrimaryExpression__Group_12__4__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2294:1: ( ( ')' ) )
            // InternalReseau.g:2295:1: ( ')' )
            {
            // InternalReseau.g:2295:1: ( ')' )
            // InternalReseau.g:2296:2: ')'
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
    // InternalReseau.g:2306:1: rule__PrimaryExpression__Group_13__0 : rule__PrimaryExpression__Group_13__0__Impl rule__PrimaryExpression__Group_13__1 ;
    public final void rule__PrimaryExpression__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2310:1: ( rule__PrimaryExpression__Group_13__0__Impl rule__PrimaryExpression__Group_13__1 )
            // InternalReseau.g:2311:2: rule__PrimaryExpression__Group_13__0__Impl rule__PrimaryExpression__Group_13__1
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
    // InternalReseau.g:2318:1: rule__PrimaryExpression__Group_13__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2322:1: ( ( () ) )
            // InternalReseau.g:2323:1: ( () )
            {
            // InternalReseau.g:2323:1: ( () )
            // InternalReseau.g:2324:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLongueurAction_13_0()); 
            // InternalReseau.g:2325:2: ()
            // InternalReseau.g:2325:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getLongueurAction_13_0()); 

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
    // InternalReseau.g:2333:1: rule__PrimaryExpression__Group_13__1 : rule__PrimaryExpression__Group_13__1__Impl rule__PrimaryExpression__Group_13__2 ;
    public final void rule__PrimaryExpression__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2337:1: ( rule__PrimaryExpression__Group_13__1__Impl rule__PrimaryExpression__Group_13__2 )
            // InternalReseau.g:2338:2: rule__PrimaryExpression__Group_13__1__Impl rule__PrimaryExpression__Group_13__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalReseau.g:2345:1: rule__PrimaryExpression__Group_13__1__Impl : ( 'longueur' ) ;
    public final void rule__PrimaryExpression__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2349:1: ( ( 'longueur' ) )
            // InternalReseau.g:2350:1: ( 'longueur' )
            {
            // InternalReseau.g:2350:1: ( 'longueur' )
            // InternalReseau.g:2351:2: 'longueur'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLongueurKeyword_13_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLongueurKeyword_13_1()); 

            }


            }

        }
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
    // InternalReseau.g:2360:1: rule__PrimaryExpression__Group_13__2 : rule__PrimaryExpression__Group_13__2__Impl rule__PrimaryExpression__Group_13__3 ;
    public final void rule__PrimaryExpression__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2364:1: ( rule__PrimaryExpression__Group_13__2__Impl rule__PrimaryExpression__Group_13__3 )
            // InternalReseau.g:2365:2: rule__PrimaryExpression__Group_13__2__Impl rule__PrimaryExpression__Group_13__3
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
    // InternalReseau.g:2372:1: rule__PrimaryExpression__Group_13__2__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2376:1: ( ( '(' ) )
            // InternalReseau.g:2377:1: ( '(' )
            {
            // InternalReseau.g:2377:1: ( '(' )
            // InternalReseau.g:2378:2: '('
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
    // InternalReseau.g:2387:1: rule__PrimaryExpression__Group_13__3 : rule__PrimaryExpression__Group_13__3__Impl rule__PrimaryExpression__Group_13__4 ;
    public final void rule__PrimaryExpression__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2391:1: ( rule__PrimaryExpression__Group_13__3__Impl rule__PrimaryExpression__Group_13__4 )
            // InternalReseau.g:2392:2: rule__PrimaryExpression__Group_13__3__Impl rule__PrimaryExpression__Group_13__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalReseau.g:2399:1: rule__PrimaryExpression__Group_13__3__Impl : ( ( rule__PrimaryExpression__ValueAssignment_13_3 ) ) ;
    public final void rule__PrimaryExpression__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2403:1: ( ( ( rule__PrimaryExpression__ValueAssignment_13_3 ) ) )
            // InternalReseau.g:2404:1: ( ( rule__PrimaryExpression__ValueAssignment_13_3 ) )
            {
            // InternalReseau.g:2404:1: ( ( rule__PrimaryExpression__ValueAssignment_13_3 ) )
            // InternalReseau.g:2405:2: ( rule__PrimaryExpression__ValueAssignment_13_3 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_13_3()); 
            // InternalReseau.g:2406:2: ( rule__PrimaryExpression__ValueAssignment_13_3 )
            // InternalReseau.g:2406:3: rule__PrimaryExpression__ValueAssignment_13_3
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
    // InternalReseau.g:2414:1: rule__PrimaryExpression__Group_13__4 : rule__PrimaryExpression__Group_13__4__Impl ;
    public final void rule__PrimaryExpression__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2418:1: ( rule__PrimaryExpression__Group_13__4__Impl )
            // InternalReseau.g:2419:2: rule__PrimaryExpression__Group_13__4__Impl
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
    // InternalReseau.g:2425:1: rule__PrimaryExpression__Group_13__4__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2429:1: ( ( ')' ) )
            // InternalReseau.g:2430:1: ( ')' )
            {
            // InternalReseau.g:2430:1: ( ')' )
            // InternalReseau.g:2431:2: ')'
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
    // InternalReseau.g:2441:1: rule__PrimaryExpression__Group_14__0 : rule__PrimaryExpression__Group_14__0__Impl rule__PrimaryExpression__Group_14__1 ;
    public final void rule__PrimaryExpression__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2445:1: ( rule__PrimaryExpression__Group_14__0__Impl rule__PrimaryExpression__Group_14__1 )
            // InternalReseau.g:2446:2: rule__PrimaryExpression__Group_14__0__Impl rule__PrimaryExpression__Group_14__1
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
    // InternalReseau.g:2453:1: rule__PrimaryExpression__Group_14__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2457:1: ( ( () ) )
            // InternalReseau.g:2458:1: ( () )
            {
            // InternalReseau.g:2458:1: ( () )
            // InternalReseau.g:2459:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAngleAction_14_0()); 
            // InternalReseau.g:2460:2: ()
            // InternalReseau.g:2460:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getAngleAction_14_0()); 

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
    // InternalReseau.g:2468:1: rule__PrimaryExpression__Group_14__1 : rule__PrimaryExpression__Group_14__1__Impl rule__PrimaryExpression__Group_14__2 ;
    public final void rule__PrimaryExpression__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2472:1: ( rule__PrimaryExpression__Group_14__1__Impl rule__PrimaryExpression__Group_14__2 )
            // InternalReseau.g:2473:2: rule__PrimaryExpression__Group_14__1__Impl rule__PrimaryExpression__Group_14__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalReseau.g:2480:1: rule__PrimaryExpression__Group_14__1__Impl : ( 'angle' ) ;
    public final void rule__PrimaryExpression__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2484:1: ( ( 'angle' ) )
            // InternalReseau.g:2485:1: ( 'angle' )
            {
            // InternalReseau.g:2485:1: ( 'angle' )
            // InternalReseau.g:2486:2: 'angle'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAngleKeyword_14_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getAngleKeyword_14_1()); 

            }


            }

        }
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
    // InternalReseau.g:2495:1: rule__PrimaryExpression__Group_14__2 : rule__PrimaryExpression__Group_14__2__Impl rule__PrimaryExpression__Group_14__3 ;
    public final void rule__PrimaryExpression__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2499:1: ( rule__PrimaryExpression__Group_14__2__Impl rule__PrimaryExpression__Group_14__3 )
            // InternalReseau.g:2500:2: rule__PrimaryExpression__Group_14__2__Impl rule__PrimaryExpression__Group_14__3
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
    // InternalReseau.g:2507:1: rule__PrimaryExpression__Group_14__2__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2511:1: ( ( '(' ) )
            // InternalReseau.g:2512:1: ( '(' )
            {
            // InternalReseau.g:2512:1: ( '(' )
            // InternalReseau.g:2513:2: '('
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
    // InternalReseau.g:2522:1: rule__PrimaryExpression__Group_14__3 : rule__PrimaryExpression__Group_14__3__Impl rule__PrimaryExpression__Group_14__4 ;
    public final void rule__PrimaryExpression__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2526:1: ( rule__PrimaryExpression__Group_14__3__Impl rule__PrimaryExpression__Group_14__4 )
            // InternalReseau.g:2527:2: rule__PrimaryExpression__Group_14__3__Impl rule__PrimaryExpression__Group_14__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalReseau.g:2534:1: rule__PrimaryExpression__Group_14__3__Impl : ( ( rule__PrimaryExpression__ValueAssignment_14_3 ) ) ;
    public final void rule__PrimaryExpression__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2538:1: ( ( ( rule__PrimaryExpression__ValueAssignment_14_3 ) ) )
            // InternalReseau.g:2539:1: ( ( rule__PrimaryExpression__ValueAssignment_14_3 ) )
            {
            // InternalReseau.g:2539:1: ( ( rule__PrimaryExpression__ValueAssignment_14_3 ) )
            // InternalReseau.g:2540:2: ( rule__PrimaryExpression__ValueAssignment_14_3 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_14_3()); 
            // InternalReseau.g:2541:2: ( rule__PrimaryExpression__ValueAssignment_14_3 )
            // InternalReseau.g:2541:3: rule__PrimaryExpression__ValueAssignment_14_3
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
    // InternalReseau.g:2549:1: rule__PrimaryExpression__Group_14__4 : rule__PrimaryExpression__Group_14__4__Impl ;
    public final void rule__PrimaryExpression__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2553:1: ( rule__PrimaryExpression__Group_14__4__Impl )
            // InternalReseau.g:2554:2: rule__PrimaryExpression__Group_14__4__Impl
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
    // InternalReseau.g:2560:1: rule__PrimaryExpression__Group_14__4__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2564:1: ( ( ')' ) )
            // InternalReseau.g:2565:1: ( ')' )
            {
            // InternalReseau.g:2565:1: ( ')' )
            // InternalReseau.g:2566:2: ')'
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
    // InternalReseau.g:2576:1: rule__PrimaryExpression__Group_15__0 : rule__PrimaryExpression__Group_15__0__Impl rule__PrimaryExpression__Group_15__1 ;
    public final void rule__PrimaryExpression__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2580:1: ( rule__PrimaryExpression__Group_15__0__Impl rule__PrimaryExpression__Group_15__1 )
            // InternalReseau.g:2581:2: rule__PrimaryExpression__Group_15__0__Impl rule__PrimaryExpression__Group_15__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalReseau.g:2588:1: rule__PrimaryExpression__Group_15__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2592:1: ( ( () ) )
            // InternalReseau.g:2593:1: ( () )
            {
            // InternalReseau.g:2593:1: ( () )
            // InternalReseau.g:2594:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getArgumentAction_15_0()); 
            // InternalReseau.g:2595:2: ()
            // InternalReseau.g:2595:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getArgumentAction_15_0()); 

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
    // InternalReseau.g:2603:1: rule__PrimaryExpression__Group_15__1 : rule__PrimaryExpression__Group_15__1__Impl rule__PrimaryExpression__Group_15__2 ;
    public final void rule__PrimaryExpression__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2607:1: ( rule__PrimaryExpression__Group_15__1__Impl rule__PrimaryExpression__Group_15__2 )
            // InternalReseau.g:2608:2: rule__PrimaryExpression__Group_15__1__Impl rule__PrimaryExpression__Group_15__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalReseau.g:2615:1: rule__PrimaryExpression__Group_15__1__Impl : ( 'argument' ) ;
    public final void rule__PrimaryExpression__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2619:1: ( ( 'argument' ) )
            // InternalReseau.g:2620:1: ( 'argument' )
            {
            // InternalReseau.g:2620:1: ( 'argument' )
            // InternalReseau.g:2621:2: 'argument'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getArgumentKeyword_15_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getArgumentKeyword_15_1()); 

            }


            }

        }
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
    // InternalReseau.g:2630:1: rule__PrimaryExpression__Group_15__2 : rule__PrimaryExpression__Group_15__2__Impl rule__PrimaryExpression__Group_15__3 ;
    public final void rule__PrimaryExpression__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2634:1: ( rule__PrimaryExpression__Group_15__2__Impl rule__PrimaryExpression__Group_15__3 )
            // InternalReseau.g:2635:2: rule__PrimaryExpression__Group_15__2__Impl rule__PrimaryExpression__Group_15__3
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
    // InternalReseau.g:2642:1: rule__PrimaryExpression__Group_15__2__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2646:1: ( ( '(' ) )
            // InternalReseau.g:2647:1: ( '(' )
            {
            // InternalReseau.g:2647:1: ( '(' )
            // InternalReseau.g:2648:2: '('
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
    // InternalReseau.g:2657:1: rule__PrimaryExpression__Group_15__3 : rule__PrimaryExpression__Group_15__3__Impl rule__PrimaryExpression__Group_15__4 ;
    public final void rule__PrimaryExpression__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2661:1: ( rule__PrimaryExpression__Group_15__3__Impl rule__PrimaryExpression__Group_15__4 )
            // InternalReseau.g:2662:2: rule__PrimaryExpression__Group_15__3__Impl rule__PrimaryExpression__Group_15__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalReseau.g:2669:1: rule__PrimaryExpression__Group_15__3__Impl : ( ( rule__PrimaryExpression__ValueAssignment_15_3 ) ) ;
    public final void rule__PrimaryExpression__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2673:1: ( ( ( rule__PrimaryExpression__ValueAssignment_15_3 ) ) )
            // InternalReseau.g:2674:1: ( ( rule__PrimaryExpression__ValueAssignment_15_3 ) )
            {
            // InternalReseau.g:2674:1: ( ( rule__PrimaryExpression__ValueAssignment_15_3 ) )
            // InternalReseau.g:2675:2: ( rule__PrimaryExpression__ValueAssignment_15_3 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_15_3()); 
            // InternalReseau.g:2676:2: ( rule__PrimaryExpression__ValueAssignment_15_3 )
            // InternalReseau.g:2676:3: rule__PrimaryExpression__ValueAssignment_15_3
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
    // InternalReseau.g:2684:1: rule__PrimaryExpression__Group_15__4 : rule__PrimaryExpression__Group_15__4__Impl ;
    public final void rule__PrimaryExpression__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2688:1: ( rule__PrimaryExpression__Group_15__4__Impl )
            // InternalReseau.g:2689:2: rule__PrimaryExpression__Group_15__4__Impl
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
    // InternalReseau.g:2695:1: rule__PrimaryExpression__Group_15__4__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2699:1: ( ( ')' ) )
            // InternalReseau.g:2700:1: ( ')' )
            {
            // InternalReseau.g:2700:1: ( ')' )
            // InternalReseau.g:2701:2: ')'
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


    // $ANTLR start "rule__Segment__Group__0"
    // InternalReseau.g:2711:1: rule__Segment__Group__0 : rule__Segment__Group__0__Impl rule__Segment__Group__1 ;
    public final void rule__Segment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2715:1: ( rule__Segment__Group__0__Impl rule__Segment__Group__1 )
            // InternalReseau.g:2716:2: rule__Segment__Group__0__Impl rule__Segment__Group__1
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
    // InternalReseau.g:2723:1: rule__Segment__Group__0__Impl : ( 'segment' ) ;
    public final void rule__Segment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2727:1: ( ( 'segment' ) )
            // InternalReseau.g:2728:1: ( 'segment' )
            {
            // InternalReseau.g:2728:1: ( 'segment' )
            // InternalReseau.g:2729:2: 'segment'
            {
             before(grammarAccess.getSegmentAccess().getSegmentKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalReseau.g:2738:1: rule__Segment__Group__1 : rule__Segment__Group__1__Impl rule__Segment__Group__2 ;
    public final void rule__Segment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2742:1: ( rule__Segment__Group__1__Impl rule__Segment__Group__2 )
            // InternalReseau.g:2743:2: rule__Segment__Group__1__Impl rule__Segment__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalReseau.g:2750:1: rule__Segment__Group__1__Impl : ( ( rule__Segment__NameAssignment_1 ) ) ;
    public final void rule__Segment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2754:1: ( ( ( rule__Segment__NameAssignment_1 ) ) )
            // InternalReseau.g:2755:1: ( ( rule__Segment__NameAssignment_1 ) )
            {
            // InternalReseau.g:2755:1: ( ( rule__Segment__NameAssignment_1 ) )
            // InternalReseau.g:2756:2: ( rule__Segment__NameAssignment_1 )
            {
             before(grammarAccess.getSegmentAccess().getNameAssignment_1()); 
            // InternalReseau.g:2757:2: ( rule__Segment__NameAssignment_1 )
            // InternalReseau.g:2757:3: rule__Segment__NameAssignment_1
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
    // InternalReseau.g:2765:1: rule__Segment__Group__2 : rule__Segment__Group__2__Impl rule__Segment__Group__3 ;
    public final void rule__Segment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2769:1: ( rule__Segment__Group__2__Impl rule__Segment__Group__3 )
            // InternalReseau.g:2770:2: rule__Segment__Group__2__Impl rule__Segment__Group__3
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
    // InternalReseau.g:2777:1: rule__Segment__Group__2__Impl : ( '{' ) ;
    public final void rule__Segment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2781:1: ( ( '{' ) )
            // InternalReseau.g:2782:1: ( '{' )
            {
            // InternalReseau.g:2782:1: ( '{' )
            // InternalReseau.g:2783:2: '{'
            {
             before(grammarAccess.getSegmentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalReseau.g:2792:1: rule__Segment__Group__3 : rule__Segment__Group__3__Impl rule__Segment__Group__4 ;
    public final void rule__Segment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2796:1: ( rule__Segment__Group__3__Impl rule__Segment__Group__4 )
            // InternalReseau.g:2797:2: rule__Segment__Group__3__Impl rule__Segment__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalReseau.g:2804:1: rule__Segment__Group__3__Impl : ( ( ( rule__Segment__PartsAssignment_3 ) ) ( ( rule__Segment__PartsAssignment_3 )* ) ) ;
    public final void rule__Segment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2808:1: ( ( ( ( rule__Segment__PartsAssignment_3 ) ) ( ( rule__Segment__PartsAssignment_3 )* ) ) )
            // InternalReseau.g:2809:1: ( ( ( rule__Segment__PartsAssignment_3 ) ) ( ( rule__Segment__PartsAssignment_3 )* ) )
            {
            // InternalReseau.g:2809:1: ( ( ( rule__Segment__PartsAssignment_3 ) ) ( ( rule__Segment__PartsAssignment_3 )* ) )
            // InternalReseau.g:2810:2: ( ( rule__Segment__PartsAssignment_3 ) ) ( ( rule__Segment__PartsAssignment_3 )* )
            {
            // InternalReseau.g:2810:2: ( ( rule__Segment__PartsAssignment_3 ) )
            // InternalReseau.g:2811:3: ( rule__Segment__PartsAssignment_3 )
            {
             before(grammarAccess.getSegmentAccess().getPartsAssignment_3()); 
            // InternalReseau.g:2812:3: ( rule__Segment__PartsAssignment_3 )
            // InternalReseau.g:2812:4: rule__Segment__PartsAssignment_3
            {
            pushFollow(FOLLOW_37);
            rule__Segment__PartsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSegmentAccess().getPartsAssignment_3()); 

            }

            // InternalReseau.g:2815:2: ( ( rule__Segment__PartsAssignment_3 )* )
            // InternalReseau.g:2816:3: ( rule__Segment__PartsAssignment_3 )*
            {
             before(grammarAccess.getSegmentAccess().getPartsAssignment_3()); 
            // InternalReseau.g:2817:3: ( rule__Segment__PartsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_NUMBER)||LA14_0==15||LA14_0==20||(LA14_0>=23 && LA14_0<=34)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalReseau.g:2817:4: rule__Segment__PartsAssignment_3
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Segment__PartsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalReseau.g:2826:1: rule__Segment__Group__4 : rule__Segment__Group__4__Impl ;
    public final void rule__Segment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2830:1: ( rule__Segment__Group__4__Impl )
            // InternalReseau.g:2831:2: rule__Segment__Group__4__Impl
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
    // InternalReseau.g:2837:1: rule__Segment__Group__4__Impl : ( '}' ) ;
    public final void rule__Segment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2841:1: ( ( '}' ) )
            // InternalReseau.g:2842:1: ( '}' )
            {
            // InternalReseau.g:2842:1: ( '}' )
            // InternalReseau.g:2843:2: '}'
            {
             before(grammarAccess.getSegmentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalReseau.g:2853:1: rule__SegmentPart__Group__0 : rule__SegmentPart__Group__0__Impl rule__SegmentPart__Group__1 ;
    public final void rule__SegmentPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2857:1: ( rule__SegmentPart__Group__0__Impl rule__SegmentPart__Group__1 )
            // InternalReseau.g:2858:2: rule__SegmentPart__Group__0__Impl rule__SegmentPart__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalReseau.g:2865:1: rule__SegmentPart__Group__0__Impl : ( ( rule__SegmentPart__FstAssignment_0 ) ) ;
    public final void rule__SegmentPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2869:1: ( ( ( rule__SegmentPart__FstAssignment_0 ) ) )
            // InternalReseau.g:2870:1: ( ( rule__SegmentPart__FstAssignment_0 ) )
            {
            // InternalReseau.g:2870:1: ( ( rule__SegmentPart__FstAssignment_0 ) )
            // InternalReseau.g:2871:2: ( rule__SegmentPart__FstAssignment_0 )
            {
             before(grammarAccess.getSegmentPartAccess().getFstAssignment_0()); 
            // InternalReseau.g:2872:2: ( rule__SegmentPart__FstAssignment_0 )
            // InternalReseau.g:2872:3: rule__SegmentPart__FstAssignment_0
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
    // InternalReseau.g:2880:1: rule__SegmentPart__Group__1 : rule__SegmentPart__Group__1__Impl rule__SegmentPart__Group__2 ;
    public final void rule__SegmentPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2884:1: ( rule__SegmentPart__Group__1__Impl rule__SegmentPart__Group__2 )
            // InternalReseau.g:2885:2: rule__SegmentPart__Group__1__Impl rule__SegmentPart__Group__2
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
    // InternalReseau.g:2892:1: rule__SegmentPart__Group__1__Impl : ( ( rule__SegmentPart__NextAssignment_1 ) ) ;
    public final void rule__SegmentPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2896:1: ( ( ( rule__SegmentPart__NextAssignment_1 ) ) )
            // InternalReseau.g:2897:1: ( ( rule__SegmentPart__NextAssignment_1 ) )
            {
            // InternalReseau.g:2897:1: ( ( rule__SegmentPart__NextAssignment_1 ) )
            // InternalReseau.g:2898:2: ( rule__SegmentPart__NextAssignment_1 )
            {
             before(grammarAccess.getSegmentPartAccess().getNextAssignment_1()); 
            // InternalReseau.g:2899:2: ( rule__SegmentPart__NextAssignment_1 )
            // InternalReseau.g:2899:3: rule__SegmentPart__NextAssignment_1
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
    // InternalReseau.g:2907:1: rule__SegmentPart__Group__2 : rule__SegmentPart__Group__2__Impl ;
    public final void rule__SegmentPart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2911:1: ( rule__SegmentPart__Group__2__Impl )
            // InternalReseau.g:2912:2: rule__SegmentPart__Group__2__Impl
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
    // InternalReseau.g:2918:1: rule__SegmentPart__Group__2__Impl : ( ';' ) ;
    public final void rule__SegmentPart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2922:1: ( ( ';' ) )
            // InternalReseau.g:2923:1: ( ';' )
            {
            // InternalReseau.g:2923:1: ( ';' )
            // InternalReseau.g:2924:2: ';'
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
    // InternalReseau.g:2934:1: rule__Unidir__Group__0 : rule__Unidir__Group__0__Impl rule__Unidir__Group__1 ;
    public final void rule__Unidir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2938:1: ( rule__Unidir__Group__0__Impl rule__Unidir__Group__1 )
            // InternalReseau.g:2939:2: rule__Unidir__Group__0__Impl rule__Unidir__Group__1
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
    // InternalReseau.g:2946:1: rule__Unidir__Group__0__Impl : ( '->' ) ;
    public final void rule__Unidir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2950:1: ( ( '->' ) )
            // InternalReseau.g:2951:1: ( '->' )
            {
            // InternalReseau.g:2951:1: ( '->' )
            // InternalReseau.g:2952:2: '->'
            {
             before(grammarAccess.getUnidirAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalReseau.g:2961:1: rule__Unidir__Group__1 : rule__Unidir__Group__1__Impl ;
    public final void rule__Unidir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2965:1: ( rule__Unidir__Group__1__Impl )
            // InternalReseau.g:2966:2: rule__Unidir__Group__1__Impl
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
    // InternalReseau.g:2972:1: rule__Unidir__Group__1__Impl : ( ( rule__Unidir__PtsAssignment_1 ) ) ;
    public final void rule__Unidir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2976:1: ( ( ( rule__Unidir__PtsAssignment_1 ) ) )
            // InternalReseau.g:2977:1: ( ( rule__Unidir__PtsAssignment_1 ) )
            {
            // InternalReseau.g:2977:1: ( ( rule__Unidir__PtsAssignment_1 ) )
            // InternalReseau.g:2978:2: ( rule__Unidir__PtsAssignment_1 )
            {
             before(grammarAccess.getUnidirAccess().getPtsAssignment_1()); 
            // InternalReseau.g:2979:2: ( rule__Unidir__PtsAssignment_1 )
            // InternalReseau.g:2979:3: rule__Unidir__PtsAssignment_1
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
    // InternalReseau.g:2988:1: rule__Bidir__Group__0 : rule__Bidir__Group__0__Impl rule__Bidir__Group__1 ;
    public final void rule__Bidir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:2992:1: ( rule__Bidir__Group__0__Impl rule__Bidir__Group__1 )
            // InternalReseau.g:2993:2: rule__Bidir__Group__0__Impl rule__Bidir__Group__1
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
    // InternalReseau.g:3000:1: rule__Bidir__Group__0__Impl : ( '<->' ) ;
    public final void rule__Bidir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3004:1: ( ( '<->' ) )
            // InternalReseau.g:3005:1: ( '<->' )
            {
            // InternalReseau.g:3005:1: ( '<->' )
            // InternalReseau.g:3006:2: '<->'
            {
             before(grammarAccess.getBidirAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalReseau.g:3015:1: rule__Bidir__Group__1 : rule__Bidir__Group__1__Impl ;
    public final void rule__Bidir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3019:1: ( rule__Bidir__Group__1__Impl )
            // InternalReseau.g:3020:2: rule__Bidir__Group__1__Impl
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
    // InternalReseau.g:3026:1: rule__Bidir__Group__1__Impl : ( ( rule__Bidir__PtsAssignment_1 ) ) ;
    public final void rule__Bidir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3030:1: ( ( ( rule__Bidir__PtsAssignment_1 ) ) )
            // InternalReseau.g:3031:1: ( ( rule__Bidir__PtsAssignment_1 ) )
            {
            // InternalReseau.g:3031:1: ( ( rule__Bidir__PtsAssignment_1 ) )
            // InternalReseau.g:3032:2: ( rule__Bidir__PtsAssignment_1 )
            {
             before(grammarAccess.getBidirAccess().getPtsAssignment_1()); 
            // InternalReseau.g:3033:2: ( rule__Bidir__PtsAssignment_1 )
            // InternalReseau.g:3033:3: rule__Bidir__PtsAssignment_1
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
    // InternalReseau.g:3042:1: rule__Model__SegmentsAssignment_0 : ( ruleSegment ) ;
    public final void rule__Model__SegmentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3046:1: ( ( ruleSegment ) )
            // InternalReseau.g:3047:2: ( ruleSegment )
            {
            // InternalReseau.g:3047:2: ( ruleSegment )
            // InternalReseau.g:3048:3: ruleSegment
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
    // InternalReseau.g:3057:1: rule__Model__PointsLiaisonAssignment_1 : ( ruleDeclarationPoint ) ;
    public final void rule__Model__PointsLiaisonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3061:1: ( ( ruleDeclarationPoint ) )
            // InternalReseau.g:3062:2: ( ruleDeclarationPoint )
            {
            // InternalReseau.g:3062:2: ( ruleDeclarationPoint )
            // InternalReseau.g:3063:3: ruleDeclarationPoint
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
    // InternalReseau.g:3072:1: rule__DeclarationPoint__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DeclarationPoint__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3076:1: ( ( RULE_ID ) )
            // InternalReseau.g:3077:2: ( RULE_ID )
            {
            // InternalReseau.g:3077:2: ( RULE_ID )
            // InternalReseau.g:3078:3: RULE_ID
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
    // InternalReseau.g:3087:1: rule__DeclarationPoint__XyAssignment_2 : ( rulePoint ) ;
    public final void rule__DeclarationPoint__XyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3091:1: ( ( rulePoint ) )
            // InternalReseau.g:3092:2: ( rulePoint )
            {
            // InternalReseau.g:3092:2: ( rulePoint )
            // InternalReseau.g:3093:3: rulePoint
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
    // InternalReseau.g:3102:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3106:1: ( ( ruleMultiplication ) )
            // InternalReseau.g:3107:2: ( ruleMultiplication )
            {
            // InternalReseau.g:3107:2: ( ruleMultiplication )
            // InternalReseau.g:3108:3: ruleMultiplication
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
    // InternalReseau.g:3117:1: rule__Multiplication__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3121:1: ( ( ruleMultiplication ) )
            // InternalReseau.g:3122:2: ( ruleMultiplication )
            {
            // InternalReseau.g:3122:2: ( ruleMultiplication )
            // InternalReseau.g:3123:3: ruleMultiplication
            {
             before(grammarAccess.getMultiplicationAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightMultiplicationParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalReseau.g:3132:1: rule__Puissance__RightAssignment_1_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__Puissance__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3136:1: ( ( rulePrimaryExpression ) )
            // InternalReseau.g:3137:2: ( rulePrimaryExpression )
            {
            // InternalReseau.g:3137:2: ( rulePrimaryExpression )
            // InternalReseau.g:3138:3: rulePrimaryExpression
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
    // InternalReseau.g:3147:1: rule__PrimaryExpression__RightAssignment_0_2_2 : ( rulePoint ) ;
    public final void rule__PrimaryExpression__RightAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3151:1: ( ( rulePoint ) )
            // InternalReseau.g:3152:2: ( rulePoint )
            {
            // InternalReseau.g:3152:2: ( rulePoint )
            // InternalReseau.g:3153:3: rulePoint
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
    // InternalReseau.g:3162:1: rule__PrimaryExpression__ValueAssignment_1_1 : ( RULE_NUMBER ) ;
    public final void rule__PrimaryExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3166:1: ( ( RULE_NUMBER ) )
            // InternalReseau.g:3167:2: ( RULE_NUMBER )
            {
            // InternalReseau.g:3167:2: ( RULE_NUMBER )
            // InternalReseau.g:3168:3: RULE_NUMBER
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
    // InternalReseau.g:3177:1: rule__PrimaryExpression__ValueAssignment_2_2 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ValueAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3181:1: ( ( rulePrimaryExpression ) )
            // InternalReseau.g:3182:2: ( rulePrimaryExpression )
            {
            // InternalReseau.g:3182:2: ( rulePrimaryExpression )
            // InternalReseau.g:3183:3: rulePrimaryExpression
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
    // InternalReseau.g:3192:1: rule__PrimaryExpression__DeclAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryExpression__DeclAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3196:1: ( ( ( RULE_ID ) ) )
            // InternalReseau.g:3197:2: ( ( RULE_ID ) )
            {
            // InternalReseau.g:3197:2: ( ( RULE_ID ) )
            // InternalReseau.g:3198:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getDeclDeclarationPointCrossReference_3_1_0()); 
            // InternalReseau.g:3199:3: ( RULE_ID )
            // InternalReseau.g:3200:4: RULE_ID
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


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_11_3"
    // InternalReseau.g:3211:1: rule__PrimaryExpression__ValueAssignment_11_3 : ( rulePoint ) ;
    public final void rule__PrimaryExpression__ValueAssignment_11_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3215:1: ( ( rulePoint ) )
            // InternalReseau.g:3216:2: ( rulePoint )
            {
            // InternalReseau.g:3216:2: ( rulePoint )
            // InternalReseau.g:3217:3: rulePoint
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_11_3_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_11_3"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_12_3"
    // InternalReseau.g:3226:1: rule__PrimaryExpression__ValueAssignment_12_3 : ( rulePoint ) ;
    public final void rule__PrimaryExpression__ValueAssignment_12_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3230:1: ( ( rulePoint ) )
            // InternalReseau.g:3231:2: ( rulePoint )
            {
            // InternalReseau.g:3231:2: ( rulePoint )
            // InternalReseau.g:3232:3: rulePoint
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
    // InternalReseau.g:3241:1: rule__PrimaryExpression__ValueAssignment_13_3 : ( rulePoint ) ;
    public final void rule__PrimaryExpression__ValueAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3245:1: ( ( rulePoint ) )
            // InternalReseau.g:3246:2: ( rulePoint )
            {
            // InternalReseau.g:3246:2: ( rulePoint )
            // InternalReseau.g:3247:3: rulePoint
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
    // InternalReseau.g:3256:1: rule__PrimaryExpression__ValueAssignment_14_3 : ( rulePoint ) ;
    public final void rule__PrimaryExpression__ValueAssignment_14_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3260:1: ( ( rulePoint ) )
            // InternalReseau.g:3261:2: ( rulePoint )
            {
            // InternalReseau.g:3261:2: ( rulePoint )
            // InternalReseau.g:3262:3: rulePoint
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
    // InternalReseau.g:3271:1: rule__PrimaryExpression__ValueAssignment_15_3 : ( rulePoint ) ;
    public final void rule__PrimaryExpression__ValueAssignment_15_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3275:1: ( ( rulePoint ) )
            // InternalReseau.g:3276:2: ( rulePoint )
            {
            // InternalReseau.g:3276:2: ( rulePoint )
            // InternalReseau.g:3277:3: rulePoint
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


    // $ANTLR start "rule__Segment__NameAssignment_1"
    // InternalReseau.g:3286:1: rule__Segment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Segment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3290:1: ( ( RULE_ID ) )
            // InternalReseau.g:3291:2: ( RULE_ID )
            {
            // InternalReseau.g:3291:2: ( RULE_ID )
            // InternalReseau.g:3292:3: RULE_ID
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
    // InternalReseau.g:3301:1: rule__Segment__PartsAssignment_3 : ( ruleSegmentPart ) ;
    public final void rule__Segment__PartsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3305:1: ( ( ruleSegmentPart ) )
            // InternalReseau.g:3306:2: ( ruleSegmentPart )
            {
            // InternalReseau.g:3306:2: ( ruleSegmentPart )
            // InternalReseau.g:3307:3: ruleSegmentPart
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
    // InternalReseau.g:3316:1: rule__SegmentPart__FstAssignment_0 : ( rulePoint ) ;
    public final void rule__SegmentPart__FstAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3320:1: ( ( rulePoint ) )
            // InternalReseau.g:3321:2: ( rulePoint )
            {
            // InternalReseau.g:3321:2: ( rulePoint )
            // InternalReseau.g:3322:3: rulePoint
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
    // InternalReseau.g:3331:1: rule__SegmentPart__NextAssignment_1 : ( ( rule__SegmentPart__NextAlternatives_1_0 ) ) ;
    public final void rule__SegmentPart__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3335:1: ( ( ( rule__SegmentPart__NextAlternatives_1_0 ) ) )
            // InternalReseau.g:3336:2: ( ( rule__SegmentPart__NextAlternatives_1_0 ) )
            {
            // InternalReseau.g:3336:2: ( ( rule__SegmentPart__NextAlternatives_1_0 ) )
            // InternalReseau.g:3337:3: ( rule__SegmentPart__NextAlternatives_1_0 )
            {
             before(grammarAccess.getSegmentPartAccess().getNextAlternatives_1_0()); 
            // InternalReseau.g:3338:3: ( rule__SegmentPart__NextAlternatives_1_0 )
            // InternalReseau.g:3338:4: rule__SegmentPart__NextAlternatives_1_0
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
    // InternalReseau.g:3346:1: rule__Unidir__PtsAssignment_1 : ( rulePoint ) ;
    public final void rule__Unidir__PtsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3350:1: ( ( rulePoint ) )
            // InternalReseau.g:3351:2: ( rulePoint )
            {
            // InternalReseau.g:3351:2: ( rulePoint )
            // InternalReseau.g:3352:3: rulePoint
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
    // InternalReseau.g:3361:1: rule__Bidir__PtsAssignment_1 : ( rulePoint ) ;
    public final void rule__Bidir__PtsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReseau.g:3365:1: ( ( rulePoint ) )
            // InternalReseau.g:3366:2: ( rulePoint )
            {
            // InternalReseau.g:3366:2: ( rulePoint )
            // InternalReseau.g:3367:3: rulePoint
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000800000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000007FF908030L});
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
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000007FF908032L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000C000000000L});

}