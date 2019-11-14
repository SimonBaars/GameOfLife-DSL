package com.simonbaars.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.simonbaars.services.GoLDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoLDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Board:'", "'Shape'", "':'", "'('", "')'", "'Cells:'", "'Cell:'", "','", "'Rule:'", "'Create'", "'If'", "'Lives'", "'..'", "'<'", "'>'", "'&'", "'|'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGoLDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGoLDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGoLDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGoLDSL.g"; }



     	private GoLDSLGrammarAccess grammarAccess;

        public InternalGoLDSLParser(TokenStream input, GoLDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DSL";
       	}

       	@Override
       	protected GoLDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDSL"
    // InternalGoLDSL.g:65:1: entryRuleDSL returns [EObject current=null] : iv_ruleDSL= ruleDSL EOF ;
    public final EObject entryRuleDSL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL = null;


        try {
            // InternalGoLDSL.g:65:44: (iv_ruleDSL= ruleDSL EOF )
            // InternalGoLDSL.g:66:2: iv_ruleDSL= ruleDSL EOF
            {
             newCompositeNode(grammarAccess.getDSLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSL=ruleDSL();

            state._fsp--;

             current =iv_ruleDSL; 
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
    // $ANTLR end "entryRuleDSL"


    // $ANTLR start "ruleDSL"
    // InternalGoLDSL.g:72:1: ruleDSL returns [EObject current=null] : ( ( (lv_board_0_0= ruleBoard ) ) ( ( (lv_rules_1_0= ruleRule ) ) | ( (lv_shapes_2_0= ruleShapeDef ) ) )* ) ;
    public final EObject ruleDSL() throws RecognitionException {
        EObject current = null;

        EObject lv_board_0_0 = null;

        EObject lv_rules_1_0 = null;

        EObject lv_shapes_2_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:78:2: ( ( ( (lv_board_0_0= ruleBoard ) ) ( ( (lv_rules_1_0= ruleRule ) ) | ( (lv_shapes_2_0= ruleShapeDef ) ) )* ) )
            // InternalGoLDSL.g:79:2: ( ( (lv_board_0_0= ruleBoard ) ) ( ( (lv_rules_1_0= ruleRule ) ) | ( (lv_shapes_2_0= ruleShapeDef ) ) )* )
            {
            // InternalGoLDSL.g:79:2: ( ( (lv_board_0_0= ruleBoard ) ) ( ( (lv_rules_1_0= ruleRule ) ) | ( (lv_shapes_2_0= ruleShapeDef ) ) )* )
            // InternalGoLDSL.g:80:3: ( (lv_board_0_0= ruleBoard ) ) ( ( (lv_rules_1_0= ruleRule ) ) | ( (lv_shapes_2_0= ruleShapeDef ) ) )*
            {
            // InternalGoLDSL.g:80:3: ( (lv_board_0_0= ruleBoard ) )
            // InternalGoLDSL.g:81:4: (lv_board_0_0= ruleBoard )
            {
            // InternalGoLDSL.g:81:4: (lv_board_0_0= ruleBoard )
            // InternalGoLDSL.g:82:5: lv_board_0_0= ruleBoard
            {

            					newCompositeNode(grammarAccess.getDSLAccess().getBoardBoardParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_board_0_0=ruleBoard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDSLRule());
            					}
            					set(
            						current,
            						"board",
            						lv_board_0_0,
            						"com.simonbaars.GoLDSL.Board");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGoLDSL.g:99:3: ( ( (lv_rules_1_0= ruleRule ) ) | ( (lv_shapes_2_0= ruleShapeDef ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }
                else if ( (LA1_0==12) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGoLDSL.g:100:4: ( (lv_rules_1_0= ruleRule ) )
            	    {
            	    // InternalGoLDSL.g:100:4: ( (lv_rules_1_0= ruleRule ) )
            	    // InternalGoLDSL.g:101:5: (lv_rules_1_0= ruleRule )
            	    {
            	    // InternalGoLDSL.g:101:5: (lv_rules_1_0= ruleRule )
            	    // InternalGoLDSL.g:102:6: lv_rules_1_0= ruleRule
            	    {

            	    						newCompositeNode(grammarAccess.getDSLAccess().getRulesRuleParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_rules_1_0=ruleRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDSLRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_1_0,
            	    							"com.simonbaars.GoLDSL.Rule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGoLDSL.g:120:4: ( (lv_shapes_2_0= ruleShapeDef ) )
            	    {
            	    // InternalGoLDSL.g:120:4: ( (lv_shapes_2_0= ruleShapeDef ) )
            	    // InternalGoLDSL.g:121:5: (lv_shapes_2_0= ruleShapeDef )
            	    {
            	    // InternalGoLDSL.g:121:5: (lv_shapes_2_0= ruleShapeDef )
            	    // InternalGoLDSL.g:122:6: lv_shapes_2_0= ruleShapeDef
            	    {

            	    						newCompositeNode(grammarAccess.getDSLAccess().getShapesShapeDefParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_shapes_2_0=ruleShapeDef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDSLRule());
            	    						}
            	    						add(
            	    							current,
            	    							"shapes",
            	    							lv_shapes_2_0,
            	    							"com.simonbaars.GoLDSL.ShapeDef");
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
    // $ANTLR end "ruleDSL"


    // $ANTLR start "entryRuleBoard"
    // InternalGoLDSL.g:144:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // InternalGoLDSL.g:144:46: (iv_ruleBoard= ruleBoard EOF )
            // InternalGoLDSL.g:145:2: iv_ruleBoard= ruleBoard EOF
            {
             newCompositeNode(grammarAccess.getBoardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoard=ruleBoard();

            state._fsp--;

             current =iv_ruleBoard; 
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
    // $ANTLR end "entryRuleBoard"


    // $ANTLR start "ruleBoard"
    // InternalGoLDSL.g:151:1: ruleBoard returns [EObject current=null] : (otherlv_0= 'Board:' ( (lv_objects_1_0= ruleObjects ) ) ) ;
    public final EObject ruleBoard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_objects_1_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:157:2: ( (otherlv_0= 'Board:' ( (lv_objects_1_0= ruleObjects ) ) ) )
            // InternalGoLDSL.g:158:2: (otherlv_0= 'Board:' ( (lv_objects_1_0= ruleObjects ) ) )
            {
            // InternalGoLDSL.g:158:2: (otherlv_0= 'Board:' ( (lv_objects_1_0= ruleObjects ) ) )
            // InternalGoLDSL.g:159:3: otherlv_0= 'Board:' ( (lv_objects_1_0= ruleObjects ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBoardAccess().getBoardKeyword_0());
            		
            // InternalGoLDSL.g:163:3: ( (lv_objects_1_0= ruleObjects ) )
            // InternalGoLDSL.g:164:4: (lv_objects_1_0= ruleObjects )
            {
            // InternalGoLDSL.g:164:4: (lv_objects_1_0= ruleObjects )
            // InternalGoLDSL.g:165:5: lv_objects_1_0= ruleObjects
            {

            					newCompositeNode(grammarAccess.getBoardAccess().getObjectsObjectsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_objects_1_0=ruleObjects();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoardRule());
            					}
            					set(
            						current,
            						"objects",
            						lv_objects_1_0,
            						"com.simonbaars.GoLDSL.Objects");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRuleObjects"
    // InternalGoLDSL.g:186:1: entryRuleObjects returns [EObject current=null] : iv_ruleObjects= ruleObjects EOF ;
    public final EObject entryRuleObjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjects = null;


        try {
            // InternalGoLDSL.g:186:48: (iv_ruleObjects= ruleObjects EOF )
            // InternalGoLDSL.g:187:2: iv_ruleObjects= ruleObjects EOF
            {
             newCompositeNode(grammarAccess.getObjectsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjects=ruleObjects();

            state._fsp--;

             current =iv_ruleObjects; 
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
    // $ANTLR end "entryRuleObjects"


    // $ANTLR start "ruleObjects"
    // InternalGoLDSL.g:193:1: ruleObjects returns [EObject current=null] : ( ( (lv_shapes_0_0= ruleShapeRef ) ) | ( (lv_moreCell_1_0= ruleCellDef ) ) | ( (lv_moreCells_2_0= ruleCellsDef ) ) )+ ;
    public final EObject ruleObjects() throws RecognitionException {
        EObject current = null;

        EObject lv_shapes_0_0 = null;

        EObject lv_moreCell_1_0 = null;

        EObject lv_moreCells_2_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:199:2: ( ( ( (lv_shapes_0_0= ruleShapeRef ) ) | ( (lv_moreCell_1_0= ruleCellDef ) ) | ( (lv_moreCells_2_0= ruleCellsDef ) ) )+ )
            // InternalGoLDSL.g:200:2: ( ( (lv_shapes_0_0= ruleShapeRef ) ) | ( (lv_moreCell_1_0= ruleCellDef ) ) | ( (lv_moreCells_2_0= ruleCellsDef ) ) )+
            {
            // InternalGoLDSL.g:200:2: ( ( (lv_shapes_0_0= ruleShapeRef ) ) | ( (lv_moreCell_1_0= ruleCellDef ) ) | ( (lv_moreCells_2_0= ruleCellsDef ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==RULE_ID) ) {
                        int LA2_5 = input.LA(3);

                        if ( (LA2_5==13) ) {
                            int LA2_6 = input.LA(4);

                            if ( (LA2_6==RULE_INT) ) {
                                alt2=1;
                            }


                        }


                    }


                    }
                    break;
                case 17:
                    {
                    alt2=2;
                    }
                    break;
                case 16:
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalGoLDSL.g:201:3: ( (lv_shapes_0_0= ruleShapeRef ) )
            	    {
            	    // InternalGoLDSL.g:201:3: ( (lv_shapes_0_0= ruleShapeRef ) )
            	    // InternalGoLDSL.g:202:4: (lv_shapes_0_0= ruleShapeRef )
            	    {
            	    // InternalGoLDSL.g:202:4: (lv_shapes_0_0= ruleShapeRef )
            	    // InternalGoLDSL.g:203:5: lv_shapes_0_0= ruleShapeRef
            	    {

            	    					newCompositeNode(grammarAccess.getObjectsAccess().getShapesShapeRefParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_shapes_0_0=ruleShapeRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"shapes",
            	    						lv_shapes_0_0,
            	    						"com.simonbaars.GoLDSL.ShapeRef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGoLDSL.g:221:3: ( (lv_moreCell_1_0= ruleCellDef ) )
            	    {
            	    // InternalGoLDSL.g:221:3: ( (lv_moreCell_1_0= ruleCellDef ) )
            	    // InternalGoLDSL.g:222:4: (lv_moreCell_1_0= ruleCellDef )
            	    {
            	    // InternalGoLDSL.g:222:4: (lv_moreCell_1_0= ruleCellDef )
            	    // InternalGoLDSL.g:223:5: lv_moreCell_1_0= ruleCellDef
            	    {

            	    					newCompositeNode(grammarAccess.getObjectsAccess().getMoreCellCellDefParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_moreCell_1_0=ruleCellDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"moreCell",
            	    						lv_moreCell_1_0,
            	    						"com.simonbaars.GoLDSL.CellDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalGoLDSL.g:241:3: ( (lv_moreCells_2_0= ruleCellsDef ) )
            	    {
            	    // InternalGoLDSL.g:241:3: ( (lv_moreCells_2_0= ruleCellsDef ) )
            	    // InternalGoLDSL.g:242:4: (lv_moreCells_2_0= ruleCellsDef )
            	    {
            	    // InternalGoLDSL.g:242:4: (lv_moreCells_2_0= ruleCellsDef )
            	    // InternalGoLDSL.g:243:5: lv_moreCells_2_0= ruleCellsDef
            	    {

            	    					newCompositeNode(grammarAccess.getObjectsAccess().getMoreCellsCellsDefParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_moreCells_2_0=ruleCellsDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"moreCells",
            	    						lv_moreCells_2_0,
            	    						"com.simonbaars.GoLDSL.CellsDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleObjects"


    // $ANTLR start "entryRuleShapeDef"
    // InternalGoLDSL.g:264:1: entryRuleShapeDef returns [EObject current=null] : iv_ruleShapeDef= ruleShapeDef EOF ;
    public final EObject entryRuleShapeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeDef = null;


        try {
            // InternalGoLDSL.g:264:49: (iv_ruleShapeDef= ruleShapeDef EOF )
            // InternalGoLDSL.g:265:2: iv_ruleShapeDef= ruleShapeDef EOF
            {
             newCompositeNode(grammarAccess.getShapeDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShapeDef=ruleShapeDef();

            state._fsp--;

             current =iv_ruleShapeDef; 
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
    // $ANTLR end "entryRuleShapeDef"


    // $ANTLR start "ruleShapeDef"
    // InternalGoLDSL.g:271:1: ruleShapeDef returns [EObject current=null] : (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_objects_3_0= ruleObjects ) ) ) ;
    public final EObject ruleShapeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_objects_3_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:277:2: ( (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_objects_3_0= ruleObjects ) ) ) )
            // InternalGoLDSL.g:278:2: (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_objects_3_0= ruleObjects ) ) )
            {
            // InternalGoLDSL.g:278:2: (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_objects_3_0= ruleObjects ) ) )
            // InternalGoLDSL.g:279:3: otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_objects_3_0= ruleObjects ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getShapeDefAccess().getShapeKeyword_0());
            		
            // InternalGoLDSL.g:283:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoLDSL.g:284:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoLDSL.g:284:4: (lv_name_1_0= RULE_ID )
            // InternalGoLDSL.g:285:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getShapeDefAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShapeDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getShapeDefAccess().getColonKeyword_2());
            		
            // InternalGoLDSL.g:305:3: ( (lv_objects_3_0= ruleObjects ) )
            // InternalGoLDSL.g:306:4: (lv_objects_3_0= ruleObjects )
            {
            // InternalGoLDSL.g:306:4: (lv_objects_3_0= ruleObjects )
            // InternalGoLDSL.g:307:5: lv_objects_3_0= ruleObjects
            {

            					newCompositeNode(grammarAccess.getShapeDefAccess().getObjectsObjectsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_objects_3_0=ruleObjects();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShapeDefRule());
            					}
            					set(
            						current,
            						"objects",
            						lv_objects_3_0,
            						"com.simonbaars.GoLDSL.Objects");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleShapeDef"


    // $ANTLR start "entryRuleCellPairs"
    // InternalGoLDSL.g:328:1: entryRuleCellPairs returns [EObject current=null] : iv_ruleCellPairs= ruleCellPairs EOF ;
    public final EObject entryRuleCellPairs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellPairs = null;


        try {
            // InternalGoLDSL.g:328:50: (iv_ruleCellPairs= ruleCellPairs EOF )
            // InternalGoLDSL.g:329:2: iv_ruleCellPairs= ruleCellPairs EOF
            {
             newCompositeNode(grammarAccess.getCellPairsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellPairs=ruleCellPairs();

            state._fsp--;

             current =iv_ruleCellPairs; 
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
    // $ANTLR end "entryRuleCellPairs"


    // $ANTLR start "ruleCellPairs"
    // InternalGoLDSL.g:335:1: ruleCellPairs returns [EObject current=null] : (otherlv_0= '(' ( (lv_cells_1_0= ruleCell ) ) otherlv_2= ')' )+ ;
    public final EObject ruleCellPairs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_cells_1_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:341:2: ( (otherlv_0= '(' ( (lv_cells_1_0= ruleCell ) ) otherlv_2= ')' )+ )
            // InternalGoLDSL.g:342:2: (otherlv_0= '(' ( (lv_cells_1_0= ruleCell ) ) otherlv_2= ')' )+
            {
            // InternalGoLDSL.g:342:2: (otherlv_0= '(' ( (lv_cells_1_0= ruleCell ) ) otherlv_2= ')' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGoLDSL.g:343:3: otherlv_0= '(' ( (lv_cells_1_0= ruleCell ) ) otherlv_2= ')'
            	    {
            	    otherlv_0=(Token)match(input,14,FOLLOW_8); 

            	    			newLeafNode(otherlv_0, grammarAccess.getCellPairsAccess().getLeftParenthesisKeyword_0());
            	    		
            	    // InternalGoLDSL.g:347:3: ( (lv_cells_1_0= ruleCell ) )
            	    // InternalGoLDSL.g:348:4: (lv_cells_1_0= ruleCell )
            	    {
            	    // InternalGoLDSL.g:348:4: (lv_cells_1_0= ruleCell )
            	    // InternalGoLDSL.g:349:5: lv_cells_1_0= ruleCell
            	    {

            	    					newCompositeNode(grammarAccess.getCellPairsAccess().getCellsCellParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_cells_1_0=ruleCell();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCellPairsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cells",
            	    						lv_cells_1_0,
            	    						"com.simonbaars.GoLDSL.Cell");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_10); 

            	    			newLeafNode(otherlv_2, grammarAccess.getCellPairsAccess().getRightParenthesisKeyword_2());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "ruleCellPairs"


    // $ANTLR start "entryRuleCellsDef"
    // InternalGoLDSL.g:374:1: entryRuleCellsDef returns [EObject current=null] : iv_ruleCellsDef= ruleCellsDef EOF ;
    public final EObject entryRuleCellsDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellsDef = null;


        try {
            // InternalGoLDSL.g:374:49: (iv_ruleCellsDef= ruleCellsDef EOF )
            // InternalGoLDSL.g:375:2: iv_ruleCellsDef= ruleCellsDef EOF
            {
             newCompositeNode(grammarAccess.getCellsDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellsDef=ruleCellsDef();

            state._fsp--;

             current =iv_ruleCellsDef; 
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
    // $ANTLR end "entryRuleCellsDef"


    // $ANTLR start "ruleCellsDef"
    // InternalGoLDSL.g:381:1: ruleCellsDef returns [EObject current=null] : (otherlv_0= 'Cells:' this_CellPairs_1= ruleCellPairs ) ;
    public final EObject ruleCellsDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_CellPairs_1 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:387:2: ( (otherlv_0= 'Cells:' this_CellPairs_1= ruleCellPairs ) )
            // InternalGoLDSL.g:388:2: (otherlv_0= 'Cells:' this_CellPairs_1= ruleCellPairs )
            {
            // InternalGoLDSL.g:388:2: (otherlv_0= 'Cells:' this_CellPairs_1= ruleCellPairs )
            // InternalGoLDSL.g:389:3: otherlv_0= 'Cells:' this_CellPairs_1= ruleCellPairs
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCellsDefAccess().getCellsKeyword_0());
            		

            			newCompositeNode(grammarAccess.getCellsDefAccess().getCellPairsParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_CellPairs_1=ruleCellPairs();

            state._fsp--;


            			current = this_CellPairs_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleCellsDef"


    // $ANTLR start "entryRuleCellDef"
    // InternalGoLDSL.g:405:1: entryRuleCellDef returns [EObject current=null] : iv_ruleCellDef= ruleCellDef EOF ;
    public final EObject entryRuleCellDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellDef = null;


        try {
            // InternalGoLDSL.g:405:48: (iv_ruleCellDef= ruleCellDef EOF )
            // InternalGoLDSL.g:406:2: iv_ruleCellDef= ruleCellDef EOF
            {
             newCompositeNode(grammarAccess.getCellDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellDef=ruleCellDef();

            state._fsp--;

             current =iv_ruleCellDef; 
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
    // $ANTLR end "entryRuleCellDef"


    // $ANTLR start "ruleCellDef"
    // InternalGoLDSL.g:412:1: ruleCellDef returns [EObject current=null] : (otherlv_0= 'Cell:' this_Cell_1= ruleCell ) ;
    public final EObject ruleCellDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Cell_1 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:418:2: ( (otherlv_0= 'Cell:' this_Cell_1= ruleCell ) )
            // InternalGoLDSL.g:419:2: (otherlv_0= 'Cell:' this_Cell_1= ruleCell )
            {
            // InternalGoLDSL.g:419:2: (otherlv_0= 'Cell:' this_Cell_1= ruleCell )
            // InternalGoLDSL.g:420:3: otherlv_0= 'Cell:' this_Cell_1= ruleCell
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCellDefAccess().getCellKeyword_0());
            		

            			newCompositeNode(grammarAccess.getCellDefAccess().getCellParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Cell_1=ruleCell();

            state._fsp--;


            			current = this_Cell_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleCellDef"


    // $ANTLR start "entryRuleShapeRef"
    // InternalGoLDSL.g:436:1: entryRuleShapeRef returns [EObject current=null] : iv_ruleShapeRef= ruleShapeRef EOF ;
    public final EObject entryRuleShapeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeRef = null;


        try {
            // InternalGoLDSL.g:436:49: (iv_ruleShapeRef= ruleShapeRef EOF )
            // InternalGoLDSL.g:437:2: iv_ruleShapeRef= ruleShapeRef EOF
            {
             newCompositeNode(grammarAccess.getShapeRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShapeRef=ruleShapeRef();

            state._fsp--;

             current =iv_ruleShapeRef; 
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
    // $ANTLR end "entryRuleShapeRef"


    // $ANTLR start "ruleShapeRef"
    // InternalGoLDSL.g:443:1: ruleShapeRef returns [EObject current=null] : (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) ) ;
    public final EObject ruleShapeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_x_3_0=null;
        Token otherlv_4=null;
        Token lv_y_5_0=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:449:2: ( (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) ) )
            // InternalGoLDSL.g:450:2: (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) )
            {
            // InternalGoLDSL.g:450:2: (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) )
            // InternalGoLDSL.g:451:3: otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getShapeRefAccess().getShapeKeyword_0());
            		
            // InternalGoLDSL.g:455:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoLDSL.g:456:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoLDSL.g:456:4: (lv_name_1_0= RULE_ID )
            // InternalGoLDSL.g:457:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getShapeRefAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShapeRefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getShapeRefAccess().getColonKeyword_2());
            		
            // InternalGoLDSL.g:477:3: ( (lv_x_3_0= RULE_INT ) )
            // InternalGoLDSL.g:478:4: (lv_x_3_0= RULE_INT )
            {
            // InternalGoLDSL.g:478:4: (lv_x_3_0= RULE_INT )
            // InternalGoLDSL.g:479:5: lv_x_3_0= RULE_INT
            {
            lv_x_3_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_x_3_0, grammarAccess.getShapeRefAccess().getXINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShapeRefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getShapeRefAccess().getCommaKeyword_4());
            		
            // InternalGoLDSL.g:499:3: ( (lv_y_5_0= RULE_INT ) )
            // InternalGoLDSL.g:500:4: (lv_y_5_0= RULE_INT )
            {
            // InternalGoLDSL.g:500:4: (lv_y_5_0= RULE_INT )
            // InternalGoLDSL.g:501:5: lv_y_5_0= RULE_INT
            {
            lv_y_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_y_5_0, grammarAccess.getShapeRefAccess().getYINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShapeRefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleShapeRef"


    // $ANTLR start "entryRuleCell"
    // InternalGoLDSL.g:521:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalGoLDSL.g:521:45: (iv_ruleCell= ruleCell EOF )
            // InternalGoLDSL.g:522:2: iv_ruleCell= ruleCell EOF
            {
             newCompositeNode(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCell=ruleCell();

            state._fsp--;

             current =iv_ruleCell; 
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
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalGoLDSL.g:528:1: ruleCell returns [EObject current=null] : ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_0=null;
        Token otherlv_1=null;
        Token lv_y_2_0=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:534:2: ( ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) ) )
            // InternalGoLDSL.g:535:2: ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) )
            {
            // InternalGoLDSL.g:535:2: ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) )
            // InternalGoLDSL.g:536:3: ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) )
            {
            // InternalGoLDSL.g:536:3: ( (lv_x_0_0= RULE_INT ) )
            // InternalGoLDSL.g:537:4: (lv_x_0_0= RULE_INT )
            {
            // InternalGoLDSL.g:537:4: (lv_x_0_0= RULE_INT )
            // InternalGoLDSL.g:538:5: lv_x_0_0= RULE_INT
            {
            lv_x_0_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_x_0_0, grammarAccess.getCellAccess().getXINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getCellAccess().getCommaKeyword_1());
            		
            // InternalGoLDSL.g:558:3: ( (lv_y_2_0= RULE_INT ) )
            // InternalGoLDSL.g:559:4: (lv_y_2_0= RULE_INT )
            {
            // InternalGoLDSL.g:559:4: (lv_y_2_0= RULE_INT )
            // InternalGoLDSL.g:560:5: lv_y_2_0= RULE_INT
            {
            lv_y_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_y_2_0, grammarAccess.getCellAccess().getYINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleCell"


    // $ANTLR start "entryRuleRule"
    // InternalGoLDSL.g:580:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalGoLDSL.g:580:45: (iv_ruleRule= ruleRule EOF )
            // InternalGoLDSL.g:581:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalGoLDSL.g:587:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Rule:' ( (lv_condition_1_0= ruleCondition ) ) ( (lv_action_2_0= ruleAction ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_condition_1_0 = null;

        EObject lv_action_2_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:593:2: ( (otherlv_0= 'Rule:' ( (lv_condition_1_0= ruleCondition ) ) ( (lv_action_2_0= ruleAction ) ) ) )
            // InternalGoLDSL.g:594:2: (otherlv_0= 'Rule:' ( (lv_condition_1_0= ruleCondition ) ) ( (lv_action_2_0= ruleAction ) ) )
            {
            // InternalGoLDSL.g:594:2: (otherlv_0= 'Rule:' ( (lv_condition_1_0= ruleCondition ) ) ( (lv_action_2_0= ruleAction ) ) )
            // InternalGoLDSL.g:595:3: otherlv_0= 'Rule:' ( (lv_condition_1_0= ruleCondition ) ) ( (lv_action_2_0= ruleAction ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalGoLDSL.g:599:3: ( (lv_condition_1_0= ruleCondition ) )
            // InternalGoLDSL.g:600:4: (lv_condition_1_0= ruleCondition )
            {
            // InternalGoLDSL.g:600:4: (lv_condition_1_0= ruleCondition )
            // InternalGoLDSL.g:601:5: lv_condition_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_condition_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"com.simonbaars.GoLDSL.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGoLDSL.g:618:3: ( (lv_action_2_0= ruleAction ) )
            // InternalGoLDSL.g:619:4: (lv_action_2_0= ruleAction )
            {
            // InternalGoLDSL.g:619:4: (lv_action_2_0= ruleAction )
            // InternalGoLDSL.g:620:5: lv_action_2_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getActionActionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_2_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_2_0,
            						"com.simonbaars.GoLDSL.Action");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleAction"
    // InternalGoLDSL.g:641:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalGoLDSL.g:641:47: (iv_ruleAction= ruleAction EOF )
            // InternalGoLDSL.g:642:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalGoLDSL.g:648:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Create' ( (lv_objects_1_0= ruleObjects ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_objects_1_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:654:2: ( (otherlv_0= 'Create' ( (lv_objects_1_0= ruleObjects ) ) ) )
            // InternalGoLDSL.g:655:2: (otherlv_0= 'Create' ( (lv_objects_1_0= ruleObjects ) ) )
            {
            // InternalGoLDSL.g:655:2: (otherlv_0= 'Create' ( (lv_objects_1_0= ruleObjects ) ) )
            // InternalGoLDSL.g:656:3: otherlv_0= 'Create' ( (lv_objects_1_0= ruleObjects ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getCreateKeyword_0());
            		
            // InternalGoLDSL.g:660:3: ( (lv_objects_1_0= ruleObjects ) )
            // InternalGoLDSL.g:661:4: (lv_objects_1_0= ruleObjects )
            {
            // InternalGoLDSL.g:661:4: (lv_objects_1_0= ruleObjects )
            // InternalGoLDSL.g:662:5: lv_objects_1_0= ruleObjects
            {

            					newCompositeNode(grammarAccess.getActionAccess().getObjectsObjectsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_objects_1_0=ruleObjects();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"objects",
            						lv_objects_1_0,
            						"com.simonbaars.GoLDSL.Objects");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCondition"
    // InternalGoLDSL.g:683:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGoLDSL.g:683:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGoLDSL.g:684:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGoLDSL.g:690:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'If' ( (lv_conditions_1_0= ruleConditionRules ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_conditions_1_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:696:2: ( (otherlv_0= 'If' ( (lv_conditions_1_0= ruleConditionRules ) ) ) )
            // InternalGoLDSL.g:697:2: (otherlv_0= 'If' ( (lv_conditions_1_0= ruleConditionRules ) ) )
            {
            // InternalGoLDSL.g:697:2: (otherlv_0= 'If' ( (lv_conditions_1_0= ruleConditionRules ) ) )
            // InternalGoLDSL.g:698:3: otherlv_0= 'If' ( (lv_conditions_1_0= ruleConditionRules ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0());
            		
            // InternalGoLDSL.g:702:3: ( (lv_conditions_1_0= ruleConditionRules ) )
            // InternalGoLDSL.g:703:4: (lv_conditions_1_0= ruleConditionRules )
            {
            // InternalGoLDSL.g:703:4: (lv_conditions_1_0= ruleConditionRules )
            // InternalGoLDSL.g:704:5: lv_conditions_1_0= ruleConditionRules
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getConditionsConditionRulesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_conditions_1_0=ruleConditionRules();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"conditions",
            						lv_conditions_1_0,
            						"com.simonbaars.GoLDSL.ConditionRules");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConditionRule"
    // InternalGoLDSL.g:725:1: entryRuleConditionRule returns [EObject current=null] : iv_ruleConditionRule= ruleConditionRule EOF ;
    public final EObject entryRuleConditionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionRule = null;


        try {
            // InternalGoLDSL.g:725:54: (iv_ruleConditionRule= ruleConditionRule EOF )
            // InternalGoLDSL.g:726:2: iv_ruleConditionRule= ruleConditionRule EOF
            {
             newCompositeNode(grammarAccess.getConditionRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionRule=ruleConditionRule();

            state._fsp--;

             current =iv_ruleConditionRule; 
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
    // $ANTLR end "entryRuleConditionRule"


    // $ANTLR start "ruleConditionRule"
    // InternalGoLDSL.g:732:1: ruleConditionRule returns [EObject current=null] : ( ( (lv_number_0_0= RULE_INT ) ) | ( (lv_range_1_0= ruleRange ) ) | ( (lv_lives_2_0= ruleLives ) ) ) ;
    public final EObject ruleConditionRule() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        EObject lv_range_1_0 = null;

        EObject lv_lives_2_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:738:2: ( ( ( (lv_number_0_0= RULE_INT ) ) | ( (lv_range_1_0= ruleRange ) ) | ( (lv_lives_2_0= ruleLives ) ) ) )
            // InternalGoLDSL.g:739:2: ( ( (lv_number_0_0= RULE_INT ) ) | ( (lv_range_1_0= ruleRange ) ) | ( (lv_lives_2_0= ruleLives ) ) )
            {
            // InternalGoLDSL.g:739:2: ( ( (lv_number_0_0= RULE_INT ) ) | ( (lv_range_1_0= ruleRange ) ) | ( (lv_lives_2_0= ruleLives ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==20||(LA4_1>=26 && LA4_1<=27)) ) {
                    alt4=1;
                }
                else if ( (LA4_1==23) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 24:
            case 25:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGoLDSL.g:740:3: ( (lv_number_0_0= RULE_INT ) )
                    {
                    // InternalGoLDSL.g:740:3: ( (lv_number_0_0= RULE_INT ) )
                    // InternalGoLDSL.g:741:4: (lv_number_0_0= RULE_INT )
                    {
                    // InternalGoLDSL.g:741:4: (lv_number_0_0= RULE_INT )
                    // InternalGoLDSL.g:742:5: lv_number_0_0= RULE_INT
                    {
                    lv_number_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_number_0_0, grammarAccess.getConditionRuleAccess().getNumberINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConditionRuleRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"number",
                    						lv_number_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:759:3: ( (lv_range_1_0= ruleRange ) )
                    {
                    // InternalGoLDSL.g:759:3: ( (lv_range_1_0= ruleRange ) )
                    // InternalGoLDSL.g:760:4: (lv_range_1_0= ruleRange )
                    {
                    // InternalGoLDSL.g:760:4: (lv_range_1_0= ruleRange )
                    // InternalGoLDSL.g:761:5: lv_range_1_0= ruleRange
                    {

                    					newCompositeNode(grammarAccess.getConditionRuleAccess().getRangeRangeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_range_1_0=ruleRange();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionRuleRule());
                    					}
                    					set(
                    						current,
                    						"range",
                    						lv_range_1_0,
                    						"com.simonbaars.GoLDSL.Range");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGoLDSL.g:779:3: ( (lv_lives_2_0= ruleLives ) )
                    {
                    // InternalGoLDSL.g:779:3: ( (lv_lives_2_0= ruleLives ) )
                    // InternalGoLDSL.g:780:4: (lv_lives_2_0= ruleLives )
                    {
                    // InternalGoLDSL.g:780:4: (lv_lives_2_0= ruleLives )
                    // InternalGoLDSL.g:781:5: lv_lives_2_0= ruleLives
                    {

                    					newCompositeNode(grammarAccess.getConditionRuleAccess().getLivesLivesParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_lives_2_0=ruleLives();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionRuleRule());
                    					}
                    					set(
                    						current,
                    						"lives",
                    						lv_lives_2_0,
                    						"com.simonbaars.GoLDSL.Lives");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleConditionRule"


    // $ANTLR start "entryRuleConditionRules"
    // InternalGoLDSL.g:802:1: entryRuleConditionRules returns [EObject current=null] : iv_ruleConditionRules= ruleConditionRules EOF ;
    public final EObject entryRuleConditionRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionRules = null;


        try {
            // InternalGoLDSL.g:802:55: (iv_ruleConditionRules= ruleConditionRules EOF )
            // InternalGoLDSL.g:803:2: iv_ruleConditionRules= ruleConditionRules EOF
            {
             newCompositeNode(grammarAccess.getConditionRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionRules=ruleConditionRules();

            state._fsp--;

             current =iv_ruleConditionRules; 
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
    // $ANTLR end "entryRuleConditionRules"


    // $ANTLR start "ruleConditionRules"
    // InternalGoLDSL.g:809:1: ruleConditionRules returns [EObject current=null] : ( ( (lv_rule1_0_0= ruleConditionRule ) ) ( ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rules2_2_0= ruleConditionRules ) ) )? ) ;
    public final EObject ruleConditionRules() throws RecognitionException {
        EObject current = null;

        EObject lv_rule1_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_rules2_2_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:815:2: ( ( ( (lv_rule1_0_0= ruleConditionRule ) ) ( ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rules2_2_0= ruleConditionRules ) ) )? ) )
            // InternalGoLDSL.g:816:2: ( ( (lv_rule1_0_0= ruleConditionRule ) ) ( ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rules2_2_0= ruleConditionRules ) ) )? )
            {
            // InternalGoLDSL.g:816:2: ( ( (lv_rule1_0_0= ruleConditionRule ) ) ( ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rules2_2_0= ruleConditionRules ) ) )? )
            // InternalGoLDSL.g:817:3: ( (lv_rule1_0_0= ruleConditionRule ) ) ( ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rules2_2_0= ruleConditionRules ) ) )?
            {
            // InternalGoLDSL.g:817:3: ( (lv_rule1_0_0= ruleConditionRule ) )
            // InternalGoLDSL.g:818:4: (lv_rule1_0_0= ruleConditionRule )
            {
            // InternalGoLDSL.g:818:4: (lv_rule1_0_0= ruleConditionRule )
            // InternalGoLDSL.g:819:5: lv_rule1_0_0= ruleConditionRule
            {

            					newCompositeNode(grammarAccess.getConditionRulesAccess().getRule1ConditionRuleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_rule1_0_0=ruleConditionRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRulesRule());
            					}
            					set(
            						current,
            						"rule1",
            						lv_rule1_0_0,
            						"com.simonbaars.GoLDSL.ConditionRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGoLDSL.g:836:3: ( ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rules2_2_0= ruleConditionRules ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=26 && LA5_0<=27)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGoLDSL.g:837:4: ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rules2_2_0= ruleConditionRules ) )
                    {
                    // InternalGoLDSL.g:837:4: ( (lv_operator_1_0= ruleBoolOperator ) )
                    // InternalGoLDSL.g:838:5: (lv_operator_1_0= ruleBoolOperator )
                    {
                    // InternalGoLDSL.g:838:5: (lv_operator_1_0= ruleBoolOperator )
                    // InternalGoLDSL.g:839:6: lv_operator_1_0= ruleBoolOperator
                    {

                    						newCompositeNode(grammarAccess.getConditionRulesAccess().getOperatorBoolOperatorEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_operator_1_0=ruleBoolOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRulesRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_1_0,
                    							"com.simonbaars.GoLDSL.BoolOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGoLDSL.g:856:4: ( (lv_rules2_2_0= ruleConditionRules ) )
                    // InternalGoLDSL.g:857:5: (lv_rules2_2_0= ruleConditionRules )
                    {
                    // InternalGoLDSL.g:857:5: (lv_rules2_2_0= ruleConditionRules )
                    // InternalGoLDSL.g:858:6: lv_rules2_2_0= ruleConditionRules
                    {

                    						newCompositeNode(grammarAccess.getConditionRulesAccess().getRules2ConditionRulesParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rules2_2_0=ruleConditionRules();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRulesRule());
                    						}
                    						set(
                    							current,
                    							"rules2",
                    							lv_rules2_2_0,
                    							"com.simonbaars.GoLDSL.ConditionRules");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleConditionRules"


    // $ANTLR start "entryRuleLives"
    // InternalGoLDSL.g:880:1: entryRuleLives returns [EObject current=null] : iv_ruleLives= ruleLives EOF ;
    public final EObject entryRuleLives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLives = null;


        try {
            // InternalGoLDSL.g:880:46: (iv_ruleLives= ruleLives EOF )
            // InternalGoLDSL.g:881:2: iv_ruleLives= ruleLives EOF
            {
             newCompositeNode(grammarAccess.getLivesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLives=ruleLives();

            state._fsp--;

             current =iv_ruleLives; 
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
    // $ANTLR end "entryRuleLives"


    // $ANTLR start "ruleLives"
    // InternalGoLDSL.g:887:1: ruleLives returns [EObject current=null] : (otherlv_0= 'Lives' ( (lv_cell_1_0= ruleCellPairs ) ) ) ;
    public final EObject ruleLives() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cell_1_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:893:2: ( (otherlv_0= 'Lives' ( (lv_cell_1_0= ruleCellPairs ) ) ) )
            // InternalGoLDSL.g:894:2: (otherlv_0= 'Lives' ( (lv_cell_1_0= ruleCellPairs ) ) )
            {
            // InternalGoLDSL.g:894:2: (otherlv_0= 'Lives' ( (lv_cell_1_0= ruleCellPairs ) ) )
            // InternalGoLDSL.g:895:3: otherlv_0= 'Lives' ( (lv_cell_1_0= ruleCellPairs ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLivesAccess().getLivesKeyword_0());
            		
            // InternalGoLDSL.g:899:3: ( (lv_cell_1_0= ruleCellPairs ) )
            // InternalGoLDSL.g:900:4: (lv_cell_1_0= ruleCellPairs )
            {
            // InternalGoLDSL.g:900:4: (lv_cell_1_0= ruleCellPairs )
            // InternalGoLDSL.g:901:5: lv_cell_1_0= ruleCellPairs
            {

            					newCompositeNode(grammarAccess.getLivesAccess().getCellCellPairsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_cell_1_0=ruleCellPairs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLivesRule());
            					}
            					set(
            						current,
            						"cell",
            						lv_cell_1_0,
            						"com.simonbaars.GoLDSL.CellPairs");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleLives"


    // $ANTLR start "entryRuleRange"
    // InternalGoLDSL.g:922:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalGoLDSL.g:922:46: (iv_ruleRange= ruleRange EOF )
            // InternalGoLDSL.g:923:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalGoLDSL.g:929:1: ruleRange returns [EObject current=null] : (this_BoundedRange_0= ruleBoundedRange | this_UnboundedRange_1= ruleUnboundedRange ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        EObject this_BoundedRange_0 = null;

        EObject this_UnboundedRange_1 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:935:2: ( (this_BoundedRange_0= ruleBoundedRange | this_UnboundedRange_1= ruleUnboundedRange ) )
            // InternalGoLDSL.g:936:2: (this_BoundedRange_0= ruleBoundedRange | this_UnboundedRange_1= ruleUnboundedRange )
            {
            // InternalGoLDSL.g:936:2: (this_BoundedRange_0= ruleBoundedRange | this_UnboundedRange_1= ruleUnboundedRange )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=24 && LA6_0<=25)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGoLDSL.g:937:3: this_BoundedRange_0= ruleBoundedRange
                    {

                    			newCompositeNode(grammarAccess.getRangeAccess().getBoundedRangeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoundedRange_0=ruleBoundedRange();

                    state._fsp--;


                    			current = this_BoundedRange_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:946:3: this_UnboundedRange_1= ruleUnboundedRange
                    {

                    			newCompositeNode(grammarAccess.getRangeAccess().getUnboundedRangeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnboundedRange_1=ruleUnboundedRange();

                    state._fsp--;


                    			current = this_UnboundedRange_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleBoundedRange"
    // InternalGoLDSL.g:958:1: entryRuleBoundedRange returns [EObject current=null] : iv_ruleBoundedRange= ruleBoundedRange EOF ;
    public final EObject entryRuleBoundedRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundedRange = null;


        try {
            // InternalGoLDSL.g:958:53: (iv_ruleBoundedRange= ruleBoundedRange EOF )
            // InternalGoLDSL.g:959:2: iv_ruleBoundedRange= ruleBoundedRange EOF
            {
             newCompositeNode(grammarAccess.getBoundedRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundedRange=ruleBoundedRange();

            state._fsp--;

             current =iv_ruleBoundedRange; 
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
    // $ANTLR end "entryRuleBoundedRange"


    // $ANTLR start "ruleBoundedRange"
    // InternalGoLDSL.g:965:1: ruleBoundedRange returns [EObject current=null] : ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_higherBound_2_0= RULE_INT ) ) ) ;
    public final EObject ruleBoundedRange() throws RecognitionException {
        EObject current = null;

        Token lv_lowerBound_0_0=null;
        Token otherlv_1=null;
        Token lv_higherBound_2_0=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:971:2: ( ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_higherBound_2_0= RULE_INT ) ) ) )
            // InternalGoLDSL.g:972:2: ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_higherBound_2_0= RULE_INT ) ) )
            {
            // InternalGoLDSL.g:972:2: ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_higherBound_2_0= RULE_INT ) ) )
            // InternalGoLDSL.g:973:3: ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_higherBound_2_0= RULE_INT ) )
            {
            // InternalGoLDSL.g:973:3: ( (lv_lowerBound_0_0= RULE_INT ) )
            // InternalGoLDSL.g:974:4: (lv_lowerBound_0_0= RULE_INT )
            {
            // InternalGoLDSL.g:974:4: (lv_lowerBound_0_0= RULE_INT )
            // InternalGoLDSL.g:975:5: lv_lowerBound_0_0= RULE_INT
            {
            lv_lowerBound_0_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_lowerBound_0_0, grammarAccess.getBoundedRangeAccess().getLowerBoundINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoundedRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lowerBound",
            						lv_lowerBound_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBoundedRangeAccess().getFullStopFullStopKeyword_1());
            		
            // InternalGoLDSL.g:995:3: ( (lv_higherBound_2_0= RULE_INT ) )
            // InternalGoLDSL.g:996:4: (lv_higherBound_2_0= RULE_INT )
            {
            // InternalGoLDSL.g:996:4: (lv_higherBound_2_0= RULE_INT )
            // InternalGoLDSL.g:997:5: lv_higherBound_2_0= RULE_INT
            {
            lv_higherBound_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_higherBound_2_0, grammarAccess.getBoundedRangeAccess().getHigherBoundINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoundedRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"higherBound",
            						lv_higherBound_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleBoundedRange"


    // $ANTLR start "entryRuleUnboundedRange"
    // InternalGoLDSL.g:1017:1: entryRuleUnboundedRange returns [EObject current=null] : iv_ruleUnboundedRange= ruleUnboundedRange EOF ;
    public final EObject entryRuleUnboundedRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnboundedRange = null;


        try {
            // InternalGoLDSL.g:1017:55: (iv_ruleUnboundedRange= ruleUnboundedRange EOF )
            // InternalGoLDSL.g:1018:2: iv_ruleUnboundedRange= ruleUnboundedRange EOF
            {
             newCompositeNode(grammarAccess.getUnboundedRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnboundedRange=ruleUnboundedRange();

            state._fsp--;

             current =iv_ruleUnboundedRange; 
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
    // $ANTLR end "entryRuleUnboundedRange"


    // $ANTLR start "ruleUnboundedRange"
    // InternalGoLDSL.g:1024:1: ruleUnboundedRange returns [EObject current=null] : (this_LeftUnboundedRange_0= ruleLeftUnboundedRange | this_RightUnboundedRange_1= ruleRightUnboundedRange ) ;
    public final EObject ruleUnboundedRange() throws RecognitionException {
        EObject current = null;

        EObject this_LeftUnboundedRange_0 = null;

        EObject this_RightUnboundedRange_1 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:1030:2: ( (this_LeftUnboundedRange_0= ruleLeftUnboundedRange | this_RightUnboundedRange_1= ruleRightUnboundedRange ) )
            // InternalGoLDSL.g:1031:2: (this_LeftUnboundedRange_0= ruleLeftUnboundedRange | this_RightUnboundedRange_1= ruleRightUnboundedRange )
            {
            // InternalGoLDSL.g:1031:2: (this_LeftUnboundedRange_0= ruleLeftUnboundedRange | this_RightUnboundedRange_1= ruleRightUnboundedRange )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGoLDSL.g:1032:3: this_LeftUnboundedRange_0= ruleLeftUnboundedRange
                    {

                    			newCompositeNode(grammarAccess.getUnboundedRangeAccess().getLeftUnboundedRangeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LeftUnboundedRange_0=ruleLeftUnboundedRange();

                    state._fsp--;


                    			current = this_LeftUnboundedRange_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:1041:3: this_RightUnboundedRange_1= ruleRightUnboundedRange
                    {

                    			newCompositeNode(grammarAccess.getUnboundedRangeAccess().getRightUnboundedRangeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RightUnboundedRange_1=ruleRightUnboundedRange();

                    state._fsp--;


                    			current = this_RightUnboundedRange_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleUnboundedRange"


    // $ANTLR start "entryRuleLeftUnboundedRange"
    // InternalGoLDSL.g:1053:1: entryRuleLeftUnboundedRange returns [EObject current=null] : iv_ruleLeftUnboundedRange= ruleLeftUnboundedRange EOF ;
    public final EObject entryRuleLeftUnboundedRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftUnboundedRange = null;


        try {
            // InternalGoLDSL.g:1053:59: (iv_ruleLeftUnboundedRange= ruleLeftUnboundedRange EOF )
            // InternalGoLDSL.g:1054:2: iv_ruleLeftUnboundedRange= ruleLeftUnboundedRange EOF
            {
             newCompositeNode(grammarAccess.getLeftUnboundedRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftUnboundedRange=ruleLeftUnboundedRange();

            state._fsp--;

             current =iv_ruleLeftUnboundedRange; 
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
    // $ANTLR end "entryRuleLeftUnboundedRange"


    // $ANTLR start "ruleLeftUnboundedRange"
    // InternalGoLDSL.g:1060:1: ruleLeftUnboundedRange returns [EObject current=null] : (otherlv_0= '<' ( (lv_lowerBound_1_0= RULE_INT ) ) ) ;
    public final EObject ruleLeftUnboundedRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lowerBound_1_0=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:1066:2: ( (otherlv_0= '<' ( (lv_lowerBound_1_0= RULE_INT ) ) ) )
            // InternalGoLDSL.g:1067:2: (otherlv_0= '<' ( (lv_lowerBound_1_0= RULE_INT ) ) )
            {
            // InternalGoLDSL.g:1067:2: (otherlv_0= '<' ( (lv_lowerBound_1_0= RULE_INT ) ) )
            // InternalGoLDSL.g:1068:3: otherlv_0= '<' ( (lv_lowerBound_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getLeftUnboundedRangeAccess().getLessThanSignKeyword_0());
            		
            // InternalGoLDSL.g:1072:3: ( (lv_lowerBound_1_0= RULE_INT ) )
            // InternalGoLDSL.g:1073:4: (lv_lowerBound_1_0= RULE_INT )
            {
            // InternalGoLDSL.g:1073:4: (lv_lowerBound_1_0= RULE_INT )
            // InternalGoLDSL.g:1074:5: lv_lowerBound_1_0= RULE_INT
            {
            lv_lowerBound_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_lowerBound_1_0, grammarAccess.getLeftUnboundedRangeAccess().getLowerBoundINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLeftUnboundedRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lowerBound",
            						lv_lowerBound_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleLeftUnboundedRange"


    // $ANTLR start "entryRuleRightUnboundedRange"
    // InternalGoLDSL.g:1094:1: entryRuleRightUnboundedRange returns [EObject current=null] : iv_ruleRightUnboundedRange= ruleRightUnboundedRange EOF ;
    public final EObject entryRuleRightUnboundedRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightUnboundedRange = null;


        try {
            // InternalGoLDSL.g:1094:60: (iv_ruleRightUnboundedRange= ruleRightUnboundedRange EOF )
            // InternalGoLDSL.g:1095:2: iv_ruleRightUnboundedRange= ruleRightUnboundedRange EOF
            {
             newCompositeNode(grammarAccess.getRightUnboundedRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightUnboundedRange=ruleRightUnboundedRange();

            state._fsp--;

             current =iv_ruleRightUnboundedRange; 
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
    // $ANTLR end "entryRuleRightUnboundedRange"


    // $ANTLR start "ruleRightUnboundedRange"
    // InternalGoLDSL.g:1101:1: ruleRightUnboundedRange returns [EObject current=null] : (otherlv_0= '>' ( (lv_higherBound_1_0= RULE_INT ) ) ) ;
    public final EObject ruleRightUnboundedRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_higherBound_1_0=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:1107:2: ( (otherlv_0= '>' ( (lv_higherBound_1_0= RULE_INT ) ) ) )
            // InternalGoLDSL.g:1108:2: (otherlv_0= '>' ( (lv_higherBound_1_0= RULE_INT ) ) )
            {
            // InternalGoLDSL.g:1108:2: (otherlv_0= '>' ( (lv_higherBound_1_0= RULE_INT ) ) )
            // InternalGoLDSL.g:1109:3: otherlv_0= '>' ( (lv_higherBound_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRightUnboundedRangeAccess().getGreaterThanSignKeyword_0());
            		
            // InternalGoLDSL.g:1113:3: ( (lv_higherBound_1_0= RULE_INT ) )
            // InternalGoLDSL.g:1114:4: (lv_higherBound_1_0= RULE_INT )
            {
            // InternalGoLDSL.g:1114:4: (lv_higherBound_1_0= RULE_INT )
            // InternalGoLDSL.g:1115:5: lv_higherBound_1_0= RULE_INT
            {
            lv_higherBound_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_higherBound_1_0, grammarAccess.getRightUnboundedRangeAccess().getHigherBoundINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRightUnboundedRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"higherBound",
            						lv_higherBound_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleRightUnboundedRange"


    // $ANTLR start "ruleBoolOperator"
    // InternalGoLDSL.g:1135:1: ruleBoolOperator returns [Enumerator current=null] : ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) ;
    public final Enumerator ruleBoolOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:1141:2: ( ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) )
            // InternalGoLDSL.g:1142:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            {
            // InternalGoLDSL.g:1142:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGoLDSL.g:1143:3: (enumLiteral_0= '&' )
                    {
                    // InternalGoLDSL.g:1143:3: (enumLiteral_0= '&' )
                    // InternalGoLDSL.g:1144:4: enumLiteral_0= '&'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:1151:3: (enumLiteral_1= '|' )
                    {
                    // InternalGoLDSL.g:1151:3: (enumLiteral_1= '|' )
                    // InternalGoLDSL.g:1152:4: enumLiteral_1= '|'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBoolOperatorAccess().getOREnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBoolOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000031000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000031002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003400020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});

}