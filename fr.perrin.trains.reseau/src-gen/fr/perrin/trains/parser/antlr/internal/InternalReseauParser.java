package fr.perrin.trains.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.perrin.trains.services.ReseauGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReseauParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "';'", "'+'", "'-'", "'*'", "'/'", "'\\u00B0'", "'^'", "'('", "','", "')'", "'nord'", "'sud'", "'est'", "'ouest'", "'pi'", "'e'", "'i'", "'x'", "'y'", "'longueur'", "'angle'", "'argument'", "'segment'", "'{'", "'}'", "'->'", "'<->'"
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

        public InternalReseauParser(TokenStream input, ReseauGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ReseauGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalReseau.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalReseau.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalReseau.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalReseau.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_segments_0_0= ruleSegment ) ) | ( (lv_pointsLiaison_1_0= ruleDeclarationPoint ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_segments_0_0 = null;

        EObject lv_pointsLiaison_1_0 = null;



        	enterRule();

        try {
            // InternalReseau.g:77:2: ( ( ( (lv_segments_0_0= ruleSegment ) ) | ( (lv_pointsLiaison_1_0= ruleDeclarationPoint ) ) )* )
            // InternalReseau.g:78:2: ( ( (lv_segments_0_0= ruleSegment ) ) | ( (lv_pointsLiaison_1_0= ruleDeclarationPoint ) ) )*
            {
            // InternalReseau.g:78:2: ( ( (lv_segments_0_0= ruleSegment ) ) | ( (lv_pointsLiaison_1_0= ruleDeclarationPoint ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==35) ) {
                    alt1=1;
                }
                else if ( (LA1_0==RULE_ID) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReseau.g:79:3: ( (lv_segments_0_0= ruleSegment ) )
            	    {
            	    // InternalReseau.g:79:3: ( (lv_segments_0_0= ruleSegment ) )
            	    // InternalReseau.g:80:4: (lv_segments_0_0= ruleSegment )
            	    {
            	    // InternalReseau.g:80:4: (lv_segments_0_0= ruleSegment )
            	    // InternalReseau.g:81:5: lv_segments_0_0= ruleSegment
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSegmentsSegmentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_segments_0_0=ruleSegment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"segments",
            	    						lv_segments_0_0,
            	    						"fr.perrin.trains.Reseau.Segment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalReseau.g:99:3: ( (lv_pointsLiaison_1_0= ruleDeclarationPoint ) )
            	    {
            	    // InternalReseau.g:99:3: ( (lv_pointsLiaison_1_0= ruleDeclarationPoint ) )
            	    // InternalReseau.g:100:4: (lv_pointsLiaison_1_0= ruleDeclarationPoint )
            	    {
            	    // InternalReseau.g:100:4: (lv_pointsLiaison_1_0= ruleDeclarationPoint )
            	    // InternalReseau.g:101:5: lv_pointsLiaison_1_0= ruleDeclarationPoint
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getPointsLiaisonDeclarationPointParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_pointsLiaison_1_0=ruleDeclarationPoint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pointsLiaison",
            	    						lv_pointsLiaison_1_0,
            	    						"fr.perrin.trains.Reseau.DeclarationPoint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDeclarationPoint"
    // InternalReseau.g:122:1: entryRuleDeclarationPoint returns [EObject current=null] : iv_ruleDeclarationPoint= ruleDeclarationPoint EOF ;
    public final EObject entryRuleDeclarationPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarationPoint = null;


        try {
            // InternalReseau.g:122:57: (iv_ruleDeclarationPoint= ruleDeclarationPoint EOF )
            // InternalReseau.g:123:2: iv_ruleDeclarationPoint= ruleDeclarationPoint EOF
            {
             newCompositeNode(grammarAccess.getDeclarationPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarationPoint=ruleDeclarationPoint();

            state._fsp--;

             current =iv_ruleDeclarationPoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarationPoint"


    // $ANTLR start "ruleDeclarationPoint"
    // InternalReseau.g:129:1: ruleDeclarationPoint returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_xy_2_0= rulePoint ) ) otherlv_3= ';' ) ;
    public final EObject ruleDeclarationPoint() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_xy_2_0 = null;



        	enterRule();

        try {
            // InternalReseau.g:135:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_xy_2_0= rulePoint ) ) otherlv_3= ';' ) )
            // InternalReseau.g:136:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_xy_2_0= rulePoint ) ) otherlv_3= ';' )
            {
            // InternalReseau.g:136:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_xy_2_0= rulePoint ) ) otherlv_3= ';' )
            // InternalReseau.g:137:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_xy_2_0= rulePoint ) ) otherlv_3= ';'
            {
            // InternalReseau.g:137:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalReseau.g:138:4: (lv_name_0_0= RULE_ID )
            {
            // InternalReseau.g:138:4: (lv_name_0_0= RULE_ID )
            // InternalReseau.g:139:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDeclarationPointAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarationPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclarationPointAccess().getEqualsSignKeyword_1());
            		
            // InternalReseau.g:159:3: ( (lv_xy_2_0= rulePoint ) )
            // InternalReseau.g:160:4: (lv_xy_2_0= rulePoint )
            {
            // InternalReseau.g:160:4: (lv_xy_2_0= rulePoint )
            // InternalReseau.g:161:5: lv_xy_2_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getDeclarationPointAccess().getXyPointParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_xy_2_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarationPointRule());
            					}
            					set(
            						current,
            						"xy",
            						lv_xy_2_0,
            						"fr.perrin.trains.Reseau.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDeclarationPointAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarationPoint"


    // $ANTLR start "entryRulePoint"
    // InternalReseau.g:186:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalReseau.g:186:46: (iv_rulePoint= rulePoint EOF )
            // InternalReseau.g:187:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalReseau.g:193:1: rulePoint returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;



        	enterRule();

        try {
            // InternalReseau.g:199:2: (this_Addition_0= ruleAddition )
            // InternalReseau.g:200:2: this_Addition_0= ruleAddition
            {

            		newCompositeNode(grammarAccess.getPointAccess().getAdditionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Addition_0=ruleAddition();

            state._fsp--;


            		current = this_Addition_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleAddition"
    // InternalReseau.g:211:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalReseau.g:211:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalReseau.g:212:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalReseau.g:218:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalReseau.g:224:2: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // InternalReseau.g:225:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // InternalReseau.g:225:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // InternalReseau.g:226:3: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalReseau.g:234:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=14 && LA3_0<=15)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalReseau.g:235:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // InternalReseau.g:235:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==14) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==15) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalReseau.g:236:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalReseau.g:236:5: ( () otherlv_2= '+' )
            	            // InternalReseau.g:237:6: () otherlv_2= '+'
            	            {
            	            // InternalReseau.g:237:6: ()
            	            // InternalReseau.g:238:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            	            						newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalReseau.g:250:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalReseau.g:250:5: ( () otherlv_4= '-' )
            	            // InternalReseau.g:251:6: () otherlv_4= '-'
            	            {
            	            // InternalReseau.g:251:6: ()
            	            // InternalReseau.g:252:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,15,FOLLOW_5); 

            	            						newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalReseau.g:264:4: ( (lv_right_5_0= ruleMultiplication ) )
            	    // InternalReseau.g:265:5: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // InternalReseau.g:265:5: (lv_right_5_0= ruleMultiplication )
            	    // InternalReseau.g:266:6: lv_right_5_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"fr.perrin.trains.Reseau.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalReseau.g:288:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalReseau.g:288:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalReseau.g:289:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalReseau.g:295:1: ruleMultiplication returns [EObject current=null] : (this_Puissance_0= rulePuissance ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Puissance_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalReseau.g:301:2: ( (this_Puissance_0= rulePuissance ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // InternalReseau.g:302:2: (this_Puissance_0= rulePuissance ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // InternalReseau.g:302:2: (this_Puissance_0= rulePuissance ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // InternalReseau.g:303:3: this_Puissance_0= rulePuissance ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPuissanceParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Puissance_0=rulePuissance();

            state._fsp--;


            			current = this_Puissance_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalReseau.g:311:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }
                else if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalReseau.g:312:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // InternalReseau.g:312:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==16) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==17) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalReseau.g:313:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalReseau.g:313:5: ( () otherlv_2= '*' )
            	            // InternalReseau.g:314:6: () otherlv_2= '*'
            	            {
            	            // InternalReseau.g:314:6: ()
            	            // InternalReseau.g:315:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            	            						newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalReseau.g:327:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalReseau.g:327:5: ( () otherlv_4= '/' )
            	            // InternalReseau.g:328:6: () otherlv_4= '/'
            	            {
            	            // InternalReseau.g:328:6: ()
            	            // InternalReseau.g:329:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,17,FOLLOW_5); 

            	            						newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalReseau.g:341:4: ( (lv_right_5_0= ruleMultiplication ) )
            	    // InternalReseau.g:342:5: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // InternalReseau.g:342:5: (lv_right_5_0= ruleMultiplication )
            	    // InternalReseau.g:343:6: lv_right_5_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightMultiplicationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"fr.perrin.trains.Reseau.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePuissance"
    // InternalReseau.g:365:1: entryRulePuissance returns [EObject current=null] : iv_rulePuissance= rulePuissance EOF ;
    public final EObject entryRulePuissance() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePuissance = null;


        try {
            // InternalReseau.g:365:50: (iv_rulePuissance= rulePuissance EOF )
            // InternalReseau.g:366:2: iv_rulePuissance= rulePuissance EOF
            {
             newCompositeNode(grammarAccess.getPuissanceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePuissance=rulePuissance();

            state._fsp--;

             current =iv_rulePuissance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePuissance"


    // $ANTLR start "rulePuissance"
    // InternalReseau.g:372:1: rulePuissance returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '\\u00B0' ) | ( () otherlv_4= '^' ( (lv_right_5_0= rulePrimaryExpression ) ) ) )? ) ;
    public final EObject rulePuissance() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalReseau.g:378:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '\\u00B0' ) | ( () otherlv_4= '^' ( (lv_right_5_0= rulePrimaryExpression ) ) ) )? ) )
            // InternalReseau.g:379:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '\\u00B0' ) | ( () otherlv_4= '^' ( (lv_right_5_0= rulePrimaryExpression ) ) ) )? )
            {
            // InternalReseau.g:379:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '\\u00B0' ) | ( () otherlv_4= '^' ( (lv_right_5_0= rulePrimaryExpression ) ) ) )? )
            // InternalReseau.g:380:3: this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '\\u00B0' ) | ( () otherlv_4= '^' ( (lv_right_5_0= rulePrimaryExpression ) ) ) )?
            {

            			newCompositeNode(grammarAccess.getPuissanceAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalReseau.g:388:3: ( ( () otherlv_2= '\\u00B0' ) | ( () otherlv_4= '^' ( (lv_right_5_0= rulePrimaryExpression ) ) ) )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // InternalReseau.g:389:4: ( () otherlv_2= '\\u00B0' )
                    {
                    // InternalReseau.g:389:4: ( () otherlv_2= '\\u00B0' )
                    // InternalReseau.g:390:5: () otherlv_2= '\\u00B0'
                    {
                    // InternalReseau.g:390:5: ()
                    // InternalReseau.g:391:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getPuissanceAccess().getDegreeLeftAction_1_0_0(),
                    							current);
                    					

                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(otherlv_2, grammarAccess.getPuissanceAccess().getDegreeSignKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalReseau.g:403:4: ( () otherlv_4= '^' ( (lv_right_5_0= rulePrimaryExpression ) ) )
                    {
                    // InternalReseau.g:403:4: ( () otherlv_4= '^' ( (lv_right_5_0= rulePrimaryExpression ) ) )
                    // InternalReseau.g:404:5: () otherlv_4= '^' ( (lv_right_5_0= rulePrimaryExpression ) )
                    {
                    // InternalReseau.g:404:5: ()
                    // InternalReseau.g:405:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getPuissanceAccess().getPowLeftAction_1_1_0(),
                    							current);
                    					

                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_5); 

                    					newLeafNode(otherlv_4, grammarAccess.getPuissanceAccess().getCircumflexAccentKeyword_1_1_1());
                    				
                    // InternalReseau.g:415:5: ( (lv_right_5_0= rulePrimaryExpression ) )
                    // InternalReseau.g:416:6: (lv_right_5_0= rulePrimaryExpression )
                    {
                    // InternalReseau.g:416:6: (lv_right_5_0= rulePrimaryExpression )
                    // InternalReseau.g:417:7: lv_right_5_0= rulePrimaryExpression
                    {

                    							newCompositeNode(grammarAccess.getPuissanceAccess().getRightPrimaryExpressionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_right_5_0=rulePrimaryExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPuissanceRule());
                    							}
                    							set(
                    								current,
                    								"right",
                    								lv_right_5_0,
                    								"fr.perrin.trains.Reseau.PrimaryExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePuissance"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalReseau.g:440:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalReseau.g:440:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalReseau.g:441:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalReseau.g:447:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Point_1= rulePoint ( () otherlv_3= ',' ( (lv_right_4_0= rulePoint ) ) )? otherlv_5= ')' ) | ( () ( (lv_value_7_0= RULE_NUMBER ) ) ) | ( () otherlv_9= '-' ( (lv_value_10_0= rulePrimaryExpression ) ) ) | ( () ( (otherlv_12= RULE_ID ) ) ) | ( () otherlv_14= 'nord' ) | ( () otherlv_16= 'sud' ) | ( () otherlv_18= 'est' ) | ( () otherlv_20= 'ouest' ) | ( () otherlv_22= 'pi' ) | ( () otherlv_24= 'e' ) | ( () otherlv_26= 'i' ) | ( () otherlv_28= 'x' otherlv_29= '(' ( (lv_value_30_0= rulePoint ) ) otherlv_31= ')' ) | ( () otherlv_33= 'y' otherlv_34= '(' ( (lv_value_35_0= rulePoint ) ) otherlv_36= ')' ) | ( () otherlv_38= 'longueur' otherlv_39= '(' ( (lv_value_40_0= rulePoint ) ) otherlv_41= ')' ) | ( () otherlv_43= 'angle' otherlv_44= '(' ( (lv_value_45_0= rulePoint ) ) otherlv_46= ')' ) | ( () otherlv_48= 'argument' otherlv_49= '(' ( (lv_value_50_0= rulePoint ) ) otherlv_51= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_value_7_0=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        EObject this_Point_1 = null;

        EObject lv_right_4_0 = null;

        EObject lv_value_10_0 = null;

        EObject lv_value_30_0 = null;

        EObject lv_value_35_0 = null;

        EObject lv_value_40_0 = null;

        EObject lv_value_45_0 = null;

        EObject lv_value_50_0 = null;



        	enterRule();

        try {
            // InternalReseau.g:453:2: ( ( (otherlv_0= '(' this_Point_1= rulePoint ( () otherlv_3= ',' ( (lv_right_4_0= rulePoint ) ) )? otherlv_5= ')' ) | ( () ( (lv_value_7_0= RULE_NUMBER ) ) ) | ( () otherlv_9= '-' ( (lv_value_10_0= rulePrimaryExpression ) ) ) | ( () ( (otherlv_12= RULE_ID ) ) ) | ( () otherlv_14= 'nord' ) | ( () otherlv_16= 'sud' ) | ( () otherlv_18= 'est' ) | ( () otherlv_20= 'ouest' ) | ( () otherlv_22= 'pi' ) | ( () otherlv_24= 'e' ) | ( () otherlv_26= 'i' ) | ( () otherlv_28= 'x' otherlv_29= '(' ( (lv_value_30_0= rulePoint ) ) otherlv_31= ')' ) | ( () otherlv_33= 'y' otherlv_34= '(' ( (lv_value_35_0= rulePoint ) ) otherlv_36= ')' ) | ( () otherlv_38= 'longueur' otherlv_39= '(' ( (lv_value_40_0= rulePoint ) ) otherlv_41= ')' ) | ( () otherlv_43= 'angle' otherlv_44= '(' ( (lv_value_45_0= rulePoint ) ) otherlv_46= ')' ) | ( () otherlv_48= 'argument' otherlv_49= '(' ( (lv_value_50_0= rulePoint ) ) otherlv_51= ')' ) ) )
            // InternalReseau.g:454:2: ( (otherlv_0= '(' this_Point_1= rulePoint ( () otherlv_3= ',' ( (lv_right_4_0= rulePoint ) ) )? otherlv_5= ')' ) | ( () ( (lv_value_7_0= RULE_NUMBER ) ) ) | ( () otherlv_9= '-' ( (lv_value_10_0= rulePrimaryExpression ) ) ) | ( () ( (otherlv_12= RULE_ID ) ) ) | ( () otherlv_14= 'nord' ) | ( () otherlv_16= 'sud' ) | ( () otherlv_18= 'est' ) | ( () otherlv_20= 'ouest' ) | ( () otherlv_22= 'pi' ) | ( () otherlv_24= 'e' ) | ( () otherlv_26= 'i' ) | ( () otherlv_28= 'x' otherlv_29= '(' ( (lv_value_30_0= rulePoint ) ) otherlv_31= ')' ) | ( () otherlv_33= 'y' otherlv_34= '(' ( (lv_value_35_0= rulePoint ) ) otherlv_36= ')' ) | ( () otherlv_38= 'longueur' otherlv_39= '(' ( (lv_value_40_0= rulePoint ) ) otherlv_41= ')' ) | ( () otherlv_43= 'angle' otherlv_44= '(' ( (lv_value_45_0= rulePoint ) ) otherlv_46= ')' ) | ( () otherlv_48= 'argument' otherlv_49= '(' ( (lv_value_50_0= rulePoint ) ) otherlv_51= ')' ) )
            {
            // InternalReseau.g:454:2: ( (otherlv_0= '(' this_Point_1= rulePoint ( () otherlv_3= ',' ( (lv_right_4_0= rulePoint ) ) )? otherlv_5= ')' ) | ( () ( (lv_value_7_0= RULE_NUMBER ) ) ) | ( () otherlv_9= '-' ( (lv_value_10_0= rulePrimaryExpression ) ) ) | ( () ( (otherlv_12= RULE_ID ) ) ) | ( () otherlv_14= 'nord' ) | ( () otherlv_16= 'sud' ) | ( () otherlv_18= 'est' ) | ( () otherlv_20= 'ouest' ) | ( () otherlv_22= 'pi' ) | ( () otherlv_24= 'e' ) | ( () otherlv_26= 'i' ) | ( () otherlv_28= 'x' otherlv_29= '(' ( (lv_value_30_0= rulePoint ) ) otherlv_31= ')' ) | ( () otherlv_33= 'y' otherlv_34= '(' ( (lv_value_35_0= rulePoint ) ) otherlv_36= ')' ) | ( () otherlv_38= 'longueur' otherlv_39= '(' ( (lv_value_40_0= rulePoint ) ) otherlv_41= ')' ) | ( () otherlv_43= 'angle' otherlv_44= '(' ( (lv_value_45_0= rulePoint ) ) otherlv_46= ')' ) | ( () otherlv_48= 'argument' otherlv_49= '(' ( (lv_value_50_0= rulePoint ) ) otherlv_51= ')' ) )
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
                    // InternalReseau.g:455:3: (otherlv_0= '(' this_Point_1= rulePoint ( () otherlv_3= ',' ( (lv_right_4_0= rulePoint ) ) )? otherlv_5= ')' )
                    {
                    // InternalReseau.g:455:3: (otherlv_0= '(' this_Point_1= rulePoint ( () otherlv_3= ',' ( (lv_right_4_0= rulePoint ) ) )? otherlv_5= ')' )
                    // InternalReseau.g:456:4: otherlv_0= '(' this_Point_1= rulePoint ( () otherlv_3= ',' ( (lv_right_4_0= rulePoint ) ) )? otherlv_5= ')'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPointParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_Point_1=rulePoint();

                    state._fsp--;


                    				current = this_Point_1;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalReseau.g:468:4: ( () otherlv_3= ',' ( (lv_right_4_0= rulePoint ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==21) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalReseau.g:469:5: () otherlv_3= ',' ( (lv_right_4_0= rulePoint ) )
                            {
                            // InternalReseau.g:469:5: ()
                            // InternalReseau.g:470:6: 
                            {

                            						current = forceCreateModelElementAndSet(
                            							grammarAccess.getPrimaryExpressionAccess().getCoordonneeLiteralLeftAction_0_2_0(),
                            							current);
                            					

                            }

                            otherlv_3=(Token)match(input,21,FOLLOW_5); 

                            					newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_0_2_1());
                            				
                            // InternalReseau.g:480:5: ( (lv_right_4_0= rulePoint ) )
                            // InternalReseau.g:481:6: (lv_right_4_0= rulePoint )
                            {
                            // InternalReseau.g:481:6: (lv_right_4_0= rulePoint )
                            // InternalReseau.g:482:7: lv_right_4_0= rulePoint
                            {

                            							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getRightPointParserRuleCall_0_2_2_0());
                            						
                            pushFollow(FOLLOW_11);
                            lv_right_4_0=rulePoint();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            							}
                            							set(
                            								current,
                            								"right",
                            								lv_right_4_0,
                            								"fr.perrin.trains.Reseau.Point");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReseau.g:506:3: ( () ( (lv_value_7_0= RULE_NUMBER ) ) )
                    {
                    // InternalReseau.g:506:3: ( () ( (lv_value_7_0= RULE_NUMBER ) ) )
                    // InternalReseau.g:507:4: () ( (lv_value_7_0= RULE_NUMBER ) )
                    {
                    // InternalReseau.g:507:4: ()
                    // InternalReseau.g:508:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalReseau.g:514:4: ( (lv_value_7_0= RULE_NUMBER ) )
                    // InternalReseau.g:515:5: (lv_value_7_0= RULE_NUMBER )
                    {
                    // InternalReseau.g:515:5: (lv_value_7_0= RULE_NUMBER )
                    // InternalReseau.g:516:6: lv_value_7_0= RULE_NUMBER
                    {
                    lv_value_7_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

                    						newLeafNode(lv_value_7_0, grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"fr.perrin.trains.Reseau.NUMBER");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalReseau.g:534:3: ( () otherlv_9= '-' ( (lv_value_10_0= rulePrimaryExpression ) ) )
                    {
                    // InternalReseau.g:534:3: ( () otherlv_9= '-' ( (lv_value_10_0= rulePrimaryExpression ) ) )
                    // InternalReseau.g:535:4: () otherlv_9= '-' ( (lv_value_10_0= rulePrimaryExpression ) )
                    {
                    // InternalReseau.g:535:4: ()
                    // InternalReseau.g:536:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getNegativeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getHyphenMinusKeyword_2_1());
                    			
                    // InternalReseau.g:546:4: ( (lv_value_10_0= rulePrimaryExpression ) )
                    // InternalReseau.g:547:5: (lv_value_10_0= rulePrimaryExpression )
                    {
                    // InternalReseau.g:547:5: (lv_value_10_0= rulePrimaryExpression )
                    // InternalReseau.g:548:6: lv_value_10_0= rulePrimaryExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValuePrimaryExpressionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_10_0=rulePrimaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_10_0,
                    							"fr.perrin.trains.Reseau.PrimaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalReseau.g:567:3: ( () ( (otherlv_12= RULE_ID ) ) )
                    {
                    // InternalReseau.g:567:3: ( () ( (otherlv_12= RULE_ID ) ) )
                    // InternalReseau.g:568:4: () ( (otherlv_12= RULE_ID ) )
                    {
                    // InternalReseau.g:568:4: ()
                    // InternalReseau.g:569:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getDeclaredAction_3_0(),
                    						current);
                    				

                    }

                    // InternalReseau.g:575:4: ( (otherlv_12= RULE_ID ) )
                    // InternalReseau.g:576:5: (otherlv_12= RULE_ID )
                    {
                    // InternalReseau.g:576:5: (otherlv_12= RULE_ID )
                    // InternalReseau.g:577:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_12, grammarAccess.getPrimaryExpressionAccess().getDeclDeclarationPointCrossReference_3_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalReseau.g:590:3: ( () otherlv_14= 'nord' )
                    {
                    // InternalReseau.g:590:3: ( () otherlv_14= 'nord' )
                    // InternalReseau.g:591:4: () otherlv_14= 'nord'
                    {
                    // InternalReseau.g:591:4: ()
                    // InternalReseau.g:592:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getNordAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_14=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getPrimaryExpressionAccess().getNordKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalReseau.g:604:3: ( () otherlv_16= 'sud' )
                    {
                    // InternalReseau.g:604:3: ( () otherlv_16= 'sud' )
                    // InternalReseau.g:605:4: () otherlv_16= 'sud'
                    {
                    // InternalReseau.g:605:4: ()
                    // InternalReseau.g:606:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getSudAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_16=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getPrimaryExpressionAccess().getSudKeyword_5_1());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalReseau.g:618:3: ( () otherlv_18= 'est' )
                    {
                    // InternalReseau.g:618:3: ( () otherlv_18= 'est' )
                    // InternalReseau.g:619:4: () otherlv_18= 'est'
                    {
                    // InternalReseau.g:619:4: ()
                    // InternalReseau.g:620:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getEstAction_6_0(),
                    						current);
                    				

                    }

                    otherlv_18=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getPrimaryExpressionAccess().getEstKeyword_6_1());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalReseau.g:632:3: ( () otherlv_20= 'ouest' )
                    {
                    // InternalReseau.g:632:3: ( () otherlv_20= 'ouest' )
                    // InternalReseau.g:633:4: () otherlv_20= 'ouest'
                    {
                    // InternalReseau.g:633:4: ()
                    // InternalReseau.g:634:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getOuestAction_7_0(),
                    						current);
                    				

                    }

                    otherlv_20=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_20, grammarAccess.getPrimaryExpressionAccess().getOuestKeyword_7_1());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalReseau.g:646:3: ( () otherlv_22= 'pi' )
                    {
                    // InternalReseau.g:646:3: ( () otherlv_22= 'pi' )
                    // InternalReseau.g:647:4: () otherlv_22= 'pi'
                    {
                    // InternalReseau.g:647:4: ()
                    // InternalReseau.g:648:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getPiAction_8_0(),
                    						current);
                    				

                    }

                    otherlv_22=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_22, grammarAccess.getPrimaryExpressionAccess().getPiKeyword_8_1());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalReseau.g:660:3: ( () otherlv_24= 'e' )
                    {
                    // InternalReseau.g:660:3: ( () otherlv_24= 'e' )
                    // InternalReseau.g:661:4: () otherlv_24= 'e'
                    {
                    // InternalReseau.g:661:4: ()
                    // InternalReseau.g:662:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getEulerAction_9_0(),
                    						current);
                    				

                    }

                    otherlv_24=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_24, grammarAccess.getPrimaryExpressionAccess().getEKeyword_9_1());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalReseau.g:674:3: ( () otherlv_26= 'i' )
                    {
                    // InternalReseau.g:674:3: ( () otherlv_26= 'i' )
                    // InternalReseau.g:675:4: () otherlv_26= 'i'
                    {
                    // InternalReseau.g:675:4: ()
                    // InternalReseau.g:676:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getIAction_10_0(),
                    						current);
                    				

                    }

                    otherlv_26=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_26, grammarAccess.getPrimaryExpressionAccess().getIKeyword_10_1());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalReseau.g:688:3: ( () otherlv_28= 'x' otherlv_29= '(' ( (lv_value_30_0= rulePoint ) ) otherlv_31= ')' )
                    {
                    // InternalReseau.g:688:3: ( () otherlv_28= 'x' otherlv_29= '(' ( (lv_value_30_0= rulePoint ) ) otherlv_31= ')' )
                    // InternalReseau.g:689:4: () otherlv_28= 'x' otherlv_29= '(' ( (lv_value_30_0= rulePoint ) ) otherlv_31= ')'
                    {
                    // InternalReseau.g:689:4: ()
                    // InternalReseau.g:690:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getXAction_11_0(),
                    						current);
                    				

                    }

                    otherlv_28=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_28, grammarAccess.getPrimaryExpressionAccess().getXKeyword_11_1());
                    			
                    otherlv_29=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_29, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_11_2());
                    			
                    // InternalReseau.g:704:4: ( (lv_value_30_0= rulePoint ) )
                    // InternalReseau.g:705:5: (lv_value_30_0= rulePoint )
                    {
                    // InternalReseau.g:705:5: (lv_value_30_0= rulePoint )
                    // InternalReseau.g:706:6: lv_value_30_0= rulePoint
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_11_3_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_value_30_0=rulePoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_30_0,
                    							"fr.perrin.trains.Reseau.Point");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_31, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_11_4());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalReseau.g:729:3: ( () otherlv_33= 'y' otherlv_34= '(' ( (lv_value_35_0= rulePoint ) ) otherlv_36= ')' )
                    {
                    // InternalReseau.g:729:3: ( () otherlv_33= 'y' otherlv_34= '(' ( (lv_value_35_0= rulePoint ) ) otherlv_36= ')' )
                    // InternalReseau.g:730:4: () otherlv_33= 'y' otherlv_34= '(' ( (lv_value_35_0= rulePoint ) ) otherlv_36= ')'
                    {
                    // InternalReseau.g:730:4: ()
                    // InternalReseau.g:731:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getYAction_12_0(),
                    						current);
                    				

                    }

                    otherlv_33=(Token)match(input,31,FOLLOW_12); 

                    				newLeafNode(otherlv_33, grammarAccess.getPrimaryExpressionAccess().getYKeyword_12_1());
                    			
                    otherlv_34=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_34, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_12_2());
                    			
                    // InternalReseau.g:745:4: ( (lv_value_35_0= rulePoint ) )
                    // InternalReseau.g:746:5: (lv_value_35_0= rulePoint )
                    {
                    // InternalReseau.g:746:5: (lv_value_35_0= rulePoint )
                    // InternalReseau.g:747:6: lv_value_35_0= rulePoint
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_12_3_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_value_35_0=rulePoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_35_0,
                    							"fr.perrin.trains.Reseau.Point");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_36=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_36, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_12_4());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalReseau.g:770:3: ( () otherlv_38= 'longueur' otherlv_39= '(' ( (lv_value_40_0= rulePoint ) ) otherlv_41= ')' )
                    {
                    // InternalReseau.g:770:3: ( () otherlv_38= 'longueur' otherlv_39= '(' ( (lv_value_40_0= rulePoint ) ) otherlv_41= ')' )
                    // InternalReseau.g:771:4: () otherlv_38= 'longueur' otherlv_39= '(' ( (lv_value_40_0= rulePoint ) ) otherlv_41= ')'
                    {
                    // InternalReseau.g:771:4: ()
                    // InternalReseau.g:772:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getLongueurAction_13_0(),
                    						current);
                    				

                    }

                    otherlv_38=(Token)match(input,32,FOLLOW_12); 

                    				newLeafNode(otherlv_38, grammarAccess.getPrimaryExpressionAccess().getLongueurKeyword_13_1());
                    			
                    otherlv_39=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_39, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_13_2());
                    			
                    // InternalReseau.g:786:4: ( (lv_value_40_0= rulePoint ) )
                    // InternalReseau.g:787:5: (lv_value_40_0= rulePoint )
                    {
                    // InternalReseau.g:787:5: (lv_value_40_0= rulePoint )
                    // InternalReseau.g:788:6: lv_value_40_0= rulePoint
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_13_3_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_value_40_0=rulePoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_40_0,
                    							"fr.perrin.trains.Reseau.Point");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_41=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_41, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_13_4());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalReseau.g:811:3: ( () otherlv_43= 'angle' otherlv_44= '(' ( (lv_value_45_0= rulePoint ) ) otherlv_46= ')' )
                    {
                    // InternalReseau.g:811:3: ( () otherlv_43= 'angle' otherlv_44= '(' ( (lv_value_45_0= rulePoint ) ) otherlv_46= ')' )
                    // InternalReseau.g:812:4: () otherlv_43= 'angle' otherlv_44= '(' ( (lv_value_45_0= rulePoint ) ) otherlv_46= ')'
                    {
                    // InternalReseau.g:812:4: ()
                    // InternalReseau.g:813:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getAngleAction_14_0(),
                    						current);
                    				

                    }

                    otherlv_43=(Token)match(input,33,FOLLOW_12); 

                    				newLeafNode(otherlv_43, grammarAccess.getPrimaryExpressionAccess().getAngleKeyword_14_1());
                    			
                    otherlv_44=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_44, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_14_2());
                    			
                    // InternalReseau.g:827:4: ( (lv_value_45_0= rulePoint ) )
                    // InternalReseau.g:828:5: (lv_value_45_0= rulePoint )
                    {
                    // InternalReseau.g:828:5: (lv_value_45_0= rulePoint )
                    // InternalReseau.g:829:6: lv_value_45_0= rulePoint
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_14_3_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_value_45_0=rulePoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_45_0,
                    							"fr.perrin.trains.Reseau.Point");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_46=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_46, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_14_4());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalReseau.g:852:3: ( () otherlv_48= 'argument' otherlv_49= '(' ( (lv_value_50_0= rulePoint ) ) otherlv_51= ')' )
                    {
                    // InternalReseau.g:852:3: ( () otherlv_48= 'argument' otherlv_49= '(' ( (lv_value_50_0= rulePoint ) ) otherlv_51= ')' )
                    // InternalReseau.g:853:4: () otherlv_48= 'argument' otherlv_49= '(' ( (lv_value_50_0= rulePoint ) ) otherlv_51= ')'
                    {
                    // InternalReseau.g:853:4: ()
                    // InternalReseau.g:854:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getArgumentAction_15_0(),
                    						current);
                    				

                    }

                    otherlv_48=(Token)match(input,34,FOLLOW_12); 

                    				newLeafNode(otherlv_48, grammarAccess.getPrimaryExpressionAccess().getArgumentKeyword_15_1());
                    			
                    otherlv_49=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_49, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_15_2());
                    			
                    // InternalReseau.g:868:4: ( (lv_value_50_0= rulePoint ) )
                    // InternalReseau.g:869:5: (lv_value_50_0= rulePoint )
                    {
                    // InternalReseau.g:869:5: (lv_value_50_0= rulePoint )
                    // InternalReseau.g:870:6: lv_value_50_0= rulePoint
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValuePointParserRuleCall_15_3_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_value_50_0=rulePoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_50_0,
                    							"fr.perrin.trains.Reseau.Point");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_51=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_51, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_15_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleSegment"
    // InternalReseau.g:896:1: entryRuleSegment returns [EObject current=null] : iv_ruleSegment= ruleSegment EOF ;
    public final EObject entryRuleSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSegment = null;


        try {
            // InternalReseau.g:896:48: (iv_ruleSegment= ruleSegment EOF )
            // InternalReseau.g:897:2: iv_ruleSegment= ruleSegment EOF
            {
             newCompositeNode(grammarAccess.getSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSegment=ruleSegment();

            state._fsp--;

             current =iv_ruleSegment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSegment"


    // $ANTLR start "ruleSegment"
    // InternalReseau.g:903:1: ruleSegment returns [EObject current=null] : (otherlv_0= 'segment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parts_3_0= ruleSegmentPart ) )+ otherlv_4= '}' ) ;
    public final EObject ruleSegment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parts_3_0 = null;



        	enterRule();

        try {
            // InternalReseau.g:909:2: ( (otherlv_0= 'segment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parts_3_0= ruleSegmentPart ) )+ otherlv_4= '}' ) )
            // InternalReseau.g:910:2: (otherlv_0= 'segment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parts_3_0= ruleSegmentPart ) )+ otherlv_4= '}' )
            {
            // InternalReseau.g:910:2: (otherlv_0= 'segment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parts_3_0= ruleSegmentPart ) )+ otherlv_4= '}' )
            // InternalReseau.g:911:3: otherlv_0= 'segment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parts_3_0= ruleSegmentPart ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSegmentAccess().getSegmentKeyword_0());
            		
            // InternalReseau.g:915:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReseau.g:916:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReseau.g:916:4: (lv_name_1_0= RULE_ID )
            // InternalReseau.g:917:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSegmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSegmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalReseau.g:937:3: ( (lv_parts_3_0= ruleSegmentPart ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_NUMBER)||LA9_0==15||LA9_0==20||(LA9_0>=23 && LA9_0<=34)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalReseau.g:938:4: (lv_parts_3_0= ruleSegmentPart )
            	    {
            	    // InternalReseau.g:938:4: (lv_parts_3_0= ruleSegmentPart )
            	    // InternalReseau.g:939:5: lv_parts_3_0= ruleSegmentPart
            	    {

            	    					newCompositeNode(grammarAccess.getSegmentAccess().getPartsSegmentPartParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_parts_3_0=ruleSegmentPart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSegmentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parts",
            	    						lv_parts_3_0,
            	    						"fr.perrin.trains.Reseau.SegmentPart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_4=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSegmentAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSegment"


    // $ANTLR start "entryRuleSegmentPart"
    // InternalReseau.g:964:1: entryRuleSegmentPart returns [EObject current=null] : iv_ruleSegmentPart= ruleSegmentPart EOF ;
    public final EObject entryRuleSegmentPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSegmentPart = null;


        try {
            // InternalReseau.g:964:52: (iv_ruleSegmentPart= ruleSegmentPart EOF )
            // InternalReseau.g:965:2: iv_ruleSegmentPart= ruleSegmentPart EOF
            {
             newCompositeNode(grammarAccess.getSegmentPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSegmentPart=ruleSegmentPart();

            state._fsp--;

             current =iv_ruleSegmentPart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSegmentPart"


    // $ANTLR start "ruleSegmentPart"
    // InternalReseau.g:971:1: ruleSegmentPart returns [EObject current=null] : ( ( (lv_fst_0_0= rulePoint ) ) ( ( (lv_next_1_1= ruleUnidir | lv_next_1_2= ruleBidir ) ) ) otherlv_2= ';' ) ;
    public final EObject ruleSegmentPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_fst_0_0 = null;

        EObject lv_next_1_1 = null;

        EObject lv_next_1_2 = null;



        	enterRule();

        try {
            // InternalReseau.g:977:2: ( ( ( (lv_fst_0_0= rulePoint ) ) ( ( (lv_next_1_1= ruleUnidir | lv_next_1_2= ruleBidir ) ) ) otherlv_2= ';' ) )
            // InternalReseau.g:978:2: ( ( (lv_fst_0_0= rulePoint ) ) ( ( (lv_next_1_1= ruleUnidir | lv_next_1_2= ruleBidir ) ) ) otherlv_2= ';' )
            {
            // InternalReseau.g:978:2: ( ( (lv_fst_0_0= rulePoint ) ) ( ( (lv_next_1_1= ruleUnidir | lv_next_1_2= ruleBidir ) ) ) otherlv_2= ';' )
            // InternalReseau.g:979:3: ( (lv_fst_0_0= rulePoint ) ) ( ( (lv_next_1_1= ruleUnidir | lv_next_1_2= ruleBidir ) ) ) otherlv_2= ';'
            {
            // InternalReseau.g:979:3: ( (lv_fst_0_0= rulePoint ) )
            // InternalReseau.g:980:4: (lv_fst_0_0= rulePoint )
            {
            // InternalReseau.g:980:4: (lv_fst_0_0= rulePoint )
            // InternalReseau.g:981:5: lv_fst_0_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getSegmentPartAccess().getFstPointParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_fst_0_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSegmentPartRule());
            					}
            					set(
            						current,
            						"fst",
            						lv_fst_0_0,
            						"fr.perrin.trains.Reseau.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReseau.g:998:3: ( ( (lv_next_1_1= ruleUnidir | lv_next_1_2= ruleBidir ) ) )
            // InternalReseau.g:999:4: ( (lv_next_1_1= ruleUnidir | lv_next_1_2= ruleBidir ) )
            {
            // InternalReseau.g:999:4: ( (lv_next_1_1= ruleUnidir | lv_next_1_2= ruleBidir ) )
            // InternalReseau.g:1000:5: (lv_next_1_1= ruleUnidir | lv_next_1_2= ruleBidir )
            {
            // InternalReseau.g:1000:5: (lv_next_1_1= ruleUnidir | lv_next_1_2= ruleBidir )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==38) ) {
                alt10=1;
            }
            else if ( (LA10_0==39) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalReseau.g:1001:6: lv_next_1_1= ruleUnidir
                    {

                    						newCompositeNode(grammarAccess.getSegmentPartAccess().getNextUnidirParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_next_1_1=ruleUnidir();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSegmentPartRule());
                    						}
                    						set(
                    							current,
                    							"next",
                    							lv_next_1_1,
                    							"fr.perrin.trains.Reseau.Unidir");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalReseau.g:1017:6: lv_next_1_2= ruleBidir
                    {

                    						newCompositeNode(grammarAccess.getSegmentPartAccess().getNextBidirParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_6);
                    lv_next_1_2=ruleBidir();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSegmentPartRule());
                    						}
                    						set(
                    							current,
                    							"next",
                    							lv_next_1_2,
                    							"fr.perrin.trains.Reseau.Bidir");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSegmentPartAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSegmentPart"


    // $ANTLR start "entryRuleUnidir"
    // InternalReseau.g:1043:1: entryRuleUnidir returns [EObject current=null] : iv_ruleUnidir= ruleUnidir EOF ;
    public final EObject entryRuleUnidir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnidir = null;


        try {
            // InternalReseau.g:1043:47: (iv_ruleUnidir= ruleUnidir EOF )
            // InternalReseau.g:1044:2: iv_ruleUnidir= ruleUnidir EOF
            {
             newCompositeNode(grammarAccess.getUnidirRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnidir=ruleUnidir();

            state._fsp--;

             current =iv_ruleUnidir; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnidir"


    // $ANTLR start "ruleUnidir"
    // InternalReseau.g:1050:1: ruleUnidir returns [EObject current=null] : (otherlv_0= '->' ( (lv_pts_1_0= rulePoint ) ) )+ ;
    public final EObject ruleUnidir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pts_1_0 = null;



        	enterRule();

        try {
            // InternalReseau.g:1056:2: ( (otherlv_0= '->' ( (lv_pts_1_0= rulePoint ) ) )+ )
            // InternalReseau.g:1057:2: (otherlv_0= '->' ( (lv_pts_1_0= rulePoint ) ) )+
            {
            // InternalReseau.g:1057:2: (otherlv_0= '->' ( (lv_pts_1_0= rulePoint ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==38) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalReseau.g:1058:3: otherlv_0= '->' ( (lv_pts_1_0= rulePoint ) )
            	    {
            	    otherlv_0=(Token)match(input,38,FOLLOW_5); 

            	    			newLeafNode(otherlv_0, grammarAccess.getUnidirAccess().getHyphenMinusGreaterThanSignKeyword_0());
            	    		
            	    // InternalReseau.g:1062:3: ( (lv_pts_1_0= rulePoint ) )
            	    // InternalReseau.g:1063:4: (lv_pts_1_0= rulePoint )
            	    {
            	    // InternalReseau.g:1063:4: (lv_pts_1_0= rulePoint )
            	    // InternalReseau.g:1064:5: lv_pts_1_0= rulePoint
            	    {

            	    					newCompositeNode(grammarAccess.getUnidirAccess().getPtsPointParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_pts_1_0=rulePoint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUnidirRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pts",
            	    						lv_pts_1_0,
            	    						"fr.perrin.trains.Reseau.Point");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnidir"


    // $ANTLR start "entryRuleBidir"
    // InternalReseau.g:1085:1: entryRuleBidir returns [EObject current=null] : iv_ruleBidir= ruleBidir EOF ;
    public final EObject entryRuleBidir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBidir = null;


        try {
            // InternalReseau.g:1085:46: (iv_ruleBidir= ruleBidir EOF )
            // InternalReseau.g:1086:2: iv_ruleBidir= ruleBidir EOF
            {
             newCompositeNode(grammarAccess.getBidirRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBidir=ruleBidir();

            state._fsp--;

             current =iv_ruleBidir; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBidir"


    // $ANTLR start "ruleBidir"
    // InternalReseau.g:1092:1: ruleBidir returns [EObject current=null] : (otherlv_0= '<->' ( (lv_pts_1_0= rulePoint ) ) )+ ;
    public final EObject ruleBidir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pts_1_0 = null;



        	enterRule();

        try {
            // InternalReseau.g:1098:2: ( (otherlv_0= '<->' ( (lv_pts_1_0= rulePoint ) ) )+ )
            // InternalReseau.g:1099:2: (otherlv_0= '<->' ( (lv_pts_1_0= rulePoint ) ) )+
            {
            // InternalReseau.g:1099:2: (otherlv_0= '<->' ( (lv_pts_1_0= rulePoint ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalReseau.g:1100:3: otherlv_0= '<->' ( (lv_pts_1_0= rulePoint ) )
            	    {
            	    otherlv_0=(Token)match(input,39,FOLLOW_5); 

            	    			newLeafNode(otherlv_0, grammarAccess.getBidirAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_0());
            	    		
            	    // InternalReseau.g:1104:3: ( (lv_pts_1_0= rulePoint ) )
            	    // InternalReseau.g:1105:4: (lv_pts_1_0= rulePoint )
            	    {
            	    // InternalReseau.g:1105:4: (lv_pts_1_0= rulePoint )
            	    // InternalReseau.g:1106:5: lv_pts_1_0= rulePoint
            	    {

            	    					newCompositeNode(grammarAccess.getBidirAccess().getPtsPointParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_pts_1_0=rulePoint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBidirRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pts",
            	    						lv_pts_1_0,
            	    						"fr.perrin.trains.Reseau.Point");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBidir"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000800000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000007FF908030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000027FF908030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000002L});

}