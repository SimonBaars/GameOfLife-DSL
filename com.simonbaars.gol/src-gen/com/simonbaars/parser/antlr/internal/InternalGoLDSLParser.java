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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Board:'", "'Shape'", "':'", "'('", "')'", "'Cells:'", "'Cell:'", "','", "'Rule:'", "'Create'", "'If'", "'IsAlive'", "'..'", "'Grid:'", "'offset'", "'size'", "'&'", "'|'", "'+'", "'-'"
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
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
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
    // InternalGoLDSL.g:151:1: ruleBoard returns [EObject current=null] : (otherlv_0= 'Board:' this_Objects_1= ruleObjects ) ;
    public final EObject ruleBoard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Objects_1 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:157:2: ( (otherlv_0= 'Board:' this_Objects_1= ruleObjects ) )
            // InternalGoLDSL.g:158:2: (otherlv_0= 'Board:' this_Objects_1= ruleObjects )
            {
            // InternalGoLDSL.g:158:2: (otherlv_0= 'Board:' this_Objects_1= ruleObjects )
            // InternalGoLDSL.g:159:3: otherlv_0= 'Board:' this_Objects_1= ruleObjects
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBoardAccess().getBoardKeyword_0());
            		

            			newCompositeNode(grammarAccess.getBoardAccess().getObjectsParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Objects_1=ruleObjects();

            state._fsp--;


            			current = this_Objects_1;
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
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRuleObjects"
    // InternalGoLDSL.g:175:1: entryRuleObjects returns [EObject current=null] : iv_ruleObjects= ruleObjects EOF ;
    public final EObject entryRuleObjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjects = null;


        try {
            // InternalGoLDSL.g:175:48: (iv_ruleObjects= ruleObjects EOF )
            // InternalGoLDSL.g:176:2: iv_ruleObjects= ruleObjects EOF
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
    // InternalGoLDSL.g:182:1: ruleObjects returns [EObject current=null] : ( ( (lv_shapes_0_0= ruleShapeRef ) ) | ( (lv_cell_1_0= ruleCellDef ) ) | ( (lv_cells_2_0= ruleCells ) ) | ( (lv_grids_3_0= ruleGrid ) ) )+ ;
    public final EObject ruleObjects() throws RecognitionException {
        EObject current = null;

        EObject lv_shapes_0_0 = null;

        EObject lv_cell_1_0 = null;

        EObject lv_cells_2_0 = null;

        EObject lv_grids_3_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:188:2: ( ( ( (lv_shapes_0_0= ruleShapeRef ) ) | ( (lv_cell_1_0= ruleCellDef ) ) | ( (lv_cells_2_0= ruleCells ) ) | ( (lv_grids_3_0= ruleGrid ) ) )+ )
            // InternalGoLDSL.g:189:2: ( ( (lv_shapes_0_0= ruleShapeRef ) ) | ( (lv_cell_1_0= ruleCellDef ) ) | ( (lv_cells_2_0= ruleCells ) ) | ( (lv_grids_3_0= ruleGrid ) ) )+
            {
            // InternalGoLDSL.g:189:2: ( ( (lv_shapes_0_0= ruleShapeRef ) ) | ( (lv_cell_1_0= ruleCellDef ) ) | ( (lv_cells_2_0= ruleCells ) ) | ( (lv_grids_3_0= ruleGrid ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=5;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==RULE_ID) ) {
                        int LA2_6 = input.LA(3);

                        if ( (LA2_6==13) ) {
                            int LA2_7 = input.LA(4);

                            if ( (LA2_7==RULE_INT) ) {
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
                case 24:
                    {
                    alt2=4;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalGoLDSL.g:190:3: ( (lv_shapes_0_0= ruleShapeRef ) )
            	    {
            	    // InternalGoLDSL.g:190:3: ( (lv_shapes_0_0= ruleShapeRef ) )
            	    // InternalGoLDSL.g:191:4: (lv_shapes_0_0= ruleShapeRef )
            	    {
            	    // InternalGoLDSL.g:191:4: (lv_shapes_0_0= ruleShapeRef )
            	    // InternalGoLDSL.g:192:5: lv_shapes_0_0= ruleShapeRef
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
            	    // InternalGoLDSL.g:210:3: ( (lv_cell_1_0= ruleCellDef ) )
            	    {
            	    // InternalGoLDSL.g:210:3: ( (lv_cell_1_0= ruleCellDef ) )
            	    // InternalGoLDSL.g:211:4: (lv_cell_1_0= ruleCellDef )
            	    {
            	    // InternalGoLDSL.g:211:4: (lv_cell_1_0= ruleCellDef )
            	    // InternalGoLDSL.g:212:5: lv_cell_1_0= ruleCellDef
            	    {

            	    					newCompositeNode(grammarAccess.getObjectsAccess().getCellCellDefParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_cell_1_0=ruleCellDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cell",
            	    						lv_cell_1_0,
            	    						"com.simonbaars.GoLDSL.CellDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalGoLDSL.g:230:3: ( (lv_cells_2_0= ruleCells ) )
            	    {
            	    // InternalGoLDSL.g:230:3: ( (lv_cells_2_0= ruleCells ) )
            	    // InternalGoLDSL.g:231:4: (lv_cells_2_0= ruleCells )
            	    {
            	    // InternalGoLDSL.g:231:4: (lv_cells_2_0= ruleCells )
            	    // InternalGoLDSL.g:232:5: lv_cells_2_0= ruleCells
            	    {

            	    					newCompositeNode(grammarAccess.getObjectsAccess().getCellsCellsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_cells_2_0=ruleCells();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cells",
            	    						lv_cells_2_0,
            	    						"com.simonbaars.GoLDSL.Cells");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalGoLDSL.g:250:3: ( (lv_grids_3_0= ruleGrid ) )
            	    {
            	    // InternalGoLDSL.g:250:3: ( (lv_grids_3_0= ruleGrid ) )
            	    // InternalGoLDSL.g:251:4: (lv_grids_3_0= ruleGrid )
            	    {
            	    // InternalGoLDSL.g:251:4: (lv_grids_3_0= ruleGrid )
            	    // InternalGoLDSL.g:252:5: lv_grids_3_0= ruleGrid
            	    {

            	    					newCompositeNode(grammarAccess.getObjectsAccess().getGridsGridParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_grids_3_0=ruleGrid();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"grids",
            	    						lv_grids_3_0,
            	    						"com.simonbaars.GoLDSL.Grid");
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
    // InternalGoLDSL.g:273:1: entryRuleShapeDef returns [EObject current=null] : iv_ruleShapeDef= ruleShapeDef EOF ;
    public final EObject entryRuleShapeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeDef = null;


        try {
            // InternalGoLDSL.g:273:49: (iv_ruleShapeDef= ruleShapeDef EOF )
            // InternalGoLDSL.g:274:2: iv_ruleShapeDef= ruleShapeDef EOF
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
    // InternalGoLDSL.g:280:1: ruleShapeDef returns [EObject current=null] : (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_offset_3_0= ruleOffset ) )? ( (lv_objects_4_0= ruleObjects ) ) ) ;
    public final EObject ruleShapeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_offset_3_0 = null;

        EObject lv_objects_4_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:286:2: ( (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_offset_3_0= ruleOffset ) )? ( (lv_objects_4_0= ruleObjects ) ) ) )
            // InternalGoLDSL.g:287:2: (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_offset_3_0= ruleOffset ) )? ( (lv_objects_4_0= ruleObjects ) ) )
            {
            // InternalGoLDSL.g:287:2: (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_offset_3_0= ruleOffset ) )? ( (lv_objects_4_0= ruleObjects ) ) )
            // InternalGoLDSL.g:288:3: otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_offset_3_0= ruleOffset ) )? ( (lv_objects_4_0= ruleObjects ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getShapeDefAccess().getShapeKeyword_0());
            		
            // InternalGoLDSL.g:292:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoLDSL.g:293:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoLDSL.g:293:4: (lv_name_1_0= RULE_ID )
            // InternalGoLDSL.g:294:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getShapeDefAccess().getColonKeyword_2());
            		
            // InternalGoLDSL.g:314:3: ( (lv_offset_3_0= ruleOffset ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGoLDSL.g:315:4: (lv_offset_3_0= ruleOffset )
                    {
                    // InternalGoLDSL.g:315:4: (lv_offset_3_0= ruleOffset )
                    // InternalGoLDSL.g:316:5: lv_offset_3_0= ruleOffset
                    {

                    					newCompositeNode(grammarAccess.getShapeDefAccess().getOffsetOffsetParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_offset_3_0=ruleOffset();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShapeDefRule());
                    					}
                    					set(
                    						current,
                    						"offset",
                    						lv_offset_3_0,
                    						"com.simonbaars.GoLDSL.Offset");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGoLDSL.g:333:3: ( (lv_objects_4_0= ruleObjects ) )
            // InternalGoLDSL.g:334:4: (lv_objects_4_0= ruleObjects )
            {
            // InternalGoLDSL.g:334:4: (lv_objects_4_0= ruleObjects )
            // InternalGoLDSL.g:335:5: lv_objects_4_0= ruleObjects
            {

            					newCompositeNode(grammarAccess.getShapeDefAccess().getObjectsObjectsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_objects_4_0=ruleObjects();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShapeDefRule());
            					}
            					set(
            						current,
            						"objects",
            						lv_objects_4_0,
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
    // InternalGoLDSL.g:356:1: entryRuleCellPairs returns [EObject current=null] : iv_ruleCellPairs= ruleCellPairs EOF ;
    public final EObject entryRuleCellPairs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellPairs = null;


        try {
            // InternalGoLDSL.g:356:50: (iv_ruleCellPairs= ruleCellPairs EOF )
            // InternalGoLDSL.g:357:2: iv_ruleCellPairs= ruleCellPairs EOF
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
    // InternalGoLDSL.g:363:1: ruleCellPairs returns [EObject current=null] : (otherlv_0= '(' ( (lv_cells_1_0= ruleCell ) ) otherlv_2= ')' )+ ;
    public final EObject ruleCellPairs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_cells_1_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:369:2: ( (otherlv_0= '(' ( (lv_cells_1_0= ruleCell ) ) otherlv_2= ')' )+ )
            // InternalGoLDSL.g:370:2: (otherlv_0= '(' ( (lv_cells_1_0= ruleCell ) ) otherlv_2= ')' )+
            {
            // InternalGoLDSL.g:370:2: (otherlv_0= '(' ( (lv_cells_1_0= ruleCell ) ) otherlv_2= ')' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGoLDSL.g:371:3: otherlv_0= '(' ( (lv_cells_1_0= ruleCell ) ) otherlv_2= ')'
            	    {
            	    otherlv_0=(Token)match(input,14,FOLLOW_9); 

            	    			newLeafNode(otherlv_0, grammarAccess.getCellPairsAccess().getLeftParenthesisKeyword_0());
            	    		
            	    // InternalGoLDSL.g:375:3: ( (lv_cells_1_0= ruleCell ) )
            	    // InternalGoLDSL.g:376:4: (lv_cells_1_0= ruleCell )
            	    {
            	    // InternalGoLDSL.g:376:4: (lv_cells_1_0= ruleCell )
            	    // InternalGoLDSL.g:377:5: lv_cells_1_0= ruleCell
            	    {

            	    					newCompositeNode(grammarAccess.getCellPairsAccess().getCellsCellParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
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

            	    otherlv_2=(Token)match(input,15,FOLLOW_11); 

            	    			newLeafNode(otherlv_2, grammarAccess.getCellPairsAccess().getRightParenthesisKeyword_2());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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


    // $ANTLR start "entryRuleCells"
    // InternalGoLDSL.g:402:1: entryRuleCells returns [EObject current=null] : iv_ruleCells= ruleCells EOF ;
    public final EObject entryRuleCells() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCells = null;


        try {
            // InternalGoLDSL.g:402:46: (iv_ruleCells= ruleCells EOF )
            // InternalGoLDSL.g:403:2: iv_ruleCells= ruleCells EOF
            {
             newCompositeNode(grammarAccess.getCellsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCells=ruleCells();

            state._fsp--;

             current =iv_ruleCells; 
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
    // $ANTLR end "entryRuleCells"


    // $ANTLR start "ruleCells"
    // InternalGoLDSL.g:409:1: ruleCells returns [EObject current=null] : (otherlv_0= 'Cells:' this_CellPairs_1= ruleCellPairs ) ;
    public final EObject ruleCells() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_CellPairs_1 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:415:2: ( (otherlv_0= 'Cells:' this_CellPairs_1= ruleCellPairs ) )
            // InternalGoLDSL.g:416:2: (otherlv_0= 'Cells:' this_CellPairs_1= ruleCellPairs )
            {
            // InternalGoLDSL.g:416:2: (otherlv_0= 'Cells:' this_CellPairs_1= ruleCellPairs )
            // InternalGoLDSL.g:417:3: otherlv_0= 'Cells:' this_CellPairs_1= ruleCellPairs
            {
            otherlv_0=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getCellsAccess().getCellsKeyword_0());
            		

            			newCompositeNode(grammarAccess.getCellsAccess().getCellPairsParserRuleCall_1());
            		
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
    // $ANTLR end "ruleCells"


    // $ANTLR start "entryRuleCellDef"
    // InternalGoLDSL.g:433:1: entryRuleCellDef returns [EObject current=null] : iv_ruleCellDef= ruleCellDef EOF ;
    public final EObject entryRuleCellDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellDef = null;


        try {
            // InternalGoLDSL.g:433:48: (iv_ruleCellDef= ruleCellDef EOF )
            // InternalGoLDSL.g:434:2: iv_ruleCellDef= ruleCellDef EOF
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
    // InternalGoLDSL.g:440:1: ruleCellDef returns [EObject current=null] : (otherlv_0= 'Cell:' this_Cell_1= ruleCell ) ;
    public final EObject ruleCellDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Cell_1 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:446:2: ( (otherlv_0= 'Cell:' this_Cell_1= ruleCell ) )
            // InternalGoLDSL.g:447:2: (otherlv_0= 'Cell:' this_Cell_1= ruleCell )
            {
            // InternalGoLDSL.g:447:2: (otherlv_0= 'Cell:' this_Cell_1= ruleCell )
            // InternalGoLDSL.g:448:3: otherlv_0= 'Cell:' this_Cell_1= ruleCell
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

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
    // InternalGoLDSL.g:464:1: entryRuleShapeRef returns [EObject current=null] : iv_ruleShapeRef= ruleShapeRef EOF ;
    public final EObject entryRuleShapeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeRef = null;


        try {
            // InternalGoLDSL.g:464:49: (iv_ruleShapeRef= ruleShapeRef EOF )
            // InternalGoLDSL.g:465:2: iv_ruleShapeRef= ruleShapeRef EOF
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
    // InternalGoLDSL.g:471:1: ruleShapeRef returns [EObject current=null] : (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) ) ;
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
            // InternalGoLDSL.g:477:2: ( (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) ) )
            // InternalGoLDSL.g:478:2: (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) )
            {
            // InternalGoLDSL.g:478:2: (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) )
            // InternalGoLDSL.g:479:3: otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getShapeRefAccess().getShapeKeyword_0());
            		
            // InternalGoLDSL.g:483:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoLDSL.g:484:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoLDSL.g:484:4: (lv_name_1_0= RULE_ID )
            // InternalGoLDSL.g:485:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getShapeRefAccess().getColonKeyword_2());
            		
            // InternalGoLDSL.g:505:3: ( (lv_x_3_0= RULE_INT ) )
            // InternalGoLDSL.g:506:4: (lv_x_3_0= RULE_INT )
            {
            // InternalGoLDSL.g:506:4: (lv_x_3_0= RULE_INT )
            // InternalGoLDSL.g:507:5: lv_x_3_0= RULE_INT
            {
            lv_x_3_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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

            otherlv_4=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getShapeRefAccess().getCommaKeyword_4());
            		
            // InternalGoLDSL.g:527:3: ( (lv_y_5_0= RULE_INT ) )
            // InternalGoLDSL.g:528:4: (lv_y_5_0= RULE_INT )
            {
            // InternalGoLDSL.g:528:4: (lv_y_5_0= RULE_INT )
            // InternalGoLDSL.g:529:5: lv_y_5_0= RULE_INT
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
    // InternalGoLDSL.g:549:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalGoLDSL.g:549:45: (iv_ruleCell= ruleCell EOF )
            // InternalGoLDSL.g:550:2: iv_ruleCell= ruleCell EOF
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
    // InternalGoLDSL.g:556:1: ruleCell returns [EObject current=null] : ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_0=null;
        Token otherlv_1=null;
        Token lv_y_2_0=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:562:2: ( ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) ) )
            // InternalGoLDSL.g:563:2: ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) )
            {
            // InternalGoLDSL.g:563:2: ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) )
            // InternalGoLDSL.g:564:3: ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) )
            {
            // InternalGoLDSL.g:564:3: ( (lv_x_0_0= RULE_INT ) )
            // InternalGoLDSL.g:565:4: (lv_x_0_0= RULE_INT )
            {
            // InternalGoLDSL.g:565:4: (lv_x_0_0= RULE_INT )
            // InternalGoLDSL.g:566:5: lv_x_0_0= RULE_INT
            {
            lv_x_0_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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

            otherlv_1=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getCellAccess().getCommaKeyword_1());
            		
            // InternalGoLDSL.g:586:3: ( (lv_y_2_0= RULE_INT ) )
            // InternalGoLDSL.g:587:4: (lv_y_2_0= RULE_INT )
            {
            // InternalGoLDSL.g:587:4: (lv_y_2_0= RULE_INT )
            // InternalGoLDSL.g:588:5: lv_y_2_0= RULE_INT
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
    // InternalGoLDSL.g:608:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalGoLDSL.g:608:45: (iv_ruleRule= ruleRule EOF )
            // InternalGoLDSL.g:609:2: iv_ruleRule= ruleRule EOF
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
    // InternalGoLDSL.g:615:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Rule:' ( (lv_condition_1_0= ruleCondition ) ) ( (lv_action_2_0= ruleAction ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_condition_1_0 = null;

        EObject lv_action_2_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:621:2: ( (otherlv_0= 'Rule:' ( (lv_condition_1_0= ruleCondition ) ) ( (lv_action_2_0= ruleAction ) ) ) )
            // InternalGoLDSL.g:622:2: (otherlv_0= 'Rule:' ( (lv_condition_1_0= ruleCondition ) ) ( (lv_action_2_0= ruleAction ) ) )
            {
            // InternalGoLDSL.g:622:2: (otherlv_0= 'Rule:' ( (lv_condition_1_0= ruleCondition ) ) ( (lv_action_2_0= ruleAction ) ) )
            // InternalGoLDSL.g:623:3: otherlv_0= 'Rule:' ( (lv_condition_1_0= ruleCondition ) ) ( (lv_action_2_0= ruleAction ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalGoLDSL.g:627:3: ( (lv_condition_1_0= ruleCondition ) )
            // InternalGoLDSL.g:628:4: (lv_condition_1_0= ruleCondition )
            {
            // InternalGoLDSL.g:628:4: (lv_condition_1_0= ruleCondition )
            // InternalGoLDSL.g:629:5: lv_condition_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalGoLDSL.g:646:3: ( (lv_action_2_0= ruleAction ) )
            // InternalGoLDSL.g:647:4: (lv_action_2_0= ruleAction )
            {
            // InternalGoLDSL.g:647:4: (lv_action_2_0= ruleAction )
            // InternalGoLDSL.g:648:5: lv_action_2_0= ruleAction
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
    // InternalGoLDSL.g:669:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalGoLDSL.g:669:47: (iv_ruleAction= ruleAction EOF )
            // InternalGoLDSL.g:670:2: iv_ruleAction= ruleAction EOF
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
    // InternalGoLDSL.g:676:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Create' this_Objects_1= ruleObjects ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Objects_1 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:682:2: ( (otherlv_0= 'Create' this_Objects_1= ruleObjects ) )
            // InternalGoLDSL.g:683:2: (otherlv_0= 'Create' this_Objects_1= ruleObjects )
            {
            // InternalGoLDSL.g:683:2: (otherlv_0= 'Create' this_Objects_1= ruleObjects )
            // InternalGoLDSL.g:684:3: otherlv_0= 'Create' this_Objects_1= ruleObjects
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getCreateKeyword_0());
            		

            			newCompositeNode(grammarAccess.getActionAccess().getObjectsParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Objects_1=ruleObjects();

            state._fsp--;


            			current = this_Objects_1;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCondition"
    // InternalGoLDSL.g:700:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGoLDSL.g:700:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGoLDSL.g:701:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalGoLDSL.g:707:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'If' this_ConditionRules_1= ruleConditionRules ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ConditionRules_1 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:713:2: ( (otherlv_0= 'If' this_ConditionRules_1= ruleConditionRules ) )
            // InternalGoLDSL.g:714:2: (otherlv_0= 'If' this_ConditionRules_1= ruleConditionRules )
            {
            // InternalGoLDSL.g:714:2: (otherlv_0= 'If' this_ConditionRules_1= ruleConditionRules )
            // InternalGoLDSL.g:715:3: otherlv_0= 'If' this_ConditionRules_1= ruleConditionRules
            {
            otherlv_0=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0());
            		

            			newCompositeNode(grammarAccess.getConditionAccess().getConditionRulesParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_ConditionRules_1=ruleConditionRules();

            state._fsp--;


            			current = this_ConditionRules_1;
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConditionRule"
    // InternalGoLDSL.g:731:1: entryRuleConditionRule returns [EObject current=null] : iv_ruleConditionRule= ruleConditionRule EOF ;
    public final EObject entryRuleConditionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionRule = null;


        try {
            // InternalGoLDSL.g:731:54: (iv_ruleConditionRule= ruleConditionRule EOF )
            // InternalGoLDSL.g:732:2: iv_ruleConditionRule= ruleConditionRule EOF
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
    // InternalGoLDSL.g:738:1: ruleConditionRule returns [EObject current=null] : ( ( (lv_number_0_0= RULE_INT ) ) | ( (lv_range_1_0= ruleRange ) ) | ( (lv_alive_2_0= 'IsAlive' ) ) ) ;
    public final EObject ruleConditionRule() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_alive_2_0=null;
        EObject lv_range_1_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:744:2: ( ( ( (lv_number_0_0= RULE_INT ) ) | ( (lv_range_1_0= ruleRange ) ) | ( (lv_alive_2_0= 'IsAlive' ) ) ) )
            // InternalGoLDSL.g:745:2: ( ( (lv_number_0_0= RULE_INT ) ) | ( (lv_range_1_0= ruleRange ) ) | ( (lv_alive_2_0= 'IsAlive' ) ) )
            {
            // InternalGoLDSL.g:745:2: ( ( (lv_number_0_0= RULE_INT ) ) | ( (lv_range_1_0= ruleRange ) ) | ( (lv_alive_2_0= 'IsAlive' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==23) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||LA5_1==20||(LA5_1>=27 && LA5_1<=28)) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGoLDSL.g:746:3: ( (lv_number_0_0= RULE_INT ) )
                    {
                    // InternalGoLDSL.g:746:3: ( (lv_number_0_0= RULE_INT ) )
                    // InternalGoLDSL.g:747:4: (lv_number_0_0= RULE_INT )
                    {
                    // InternalGoLDSL.g:747:4: (lv_number_0_0= RULE_INT )
                    // InternalGoLDSL.g:748:5: lv_number_0_0= RULE_INT
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
                    // InternalGoLDSL.g:765:3: ( (lv_range_1_0= ruleRange ) )
                    {
                    // InternalGoLDSL.g:765:3: ( (lv_range_1_0= ruleRange ) )
                    // InternalGoLDSL.g:766:4: (lv_range_1_0= ruleRange )
                    {
                    // InternalGoLDSL.g:766:4: (lv_range_1_0= ruleRange )
                    // InternalGoLDSL.g:767:5: lv_range_1_0= ruleRange
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
                    // InternalGoLDSL.g:785:3: ( (lv_alive_2_0= 'IsAlive' ) )
                    {
                    // InternalGoLDSL.g:785:3: ( (lv_alive_2_0= 'IsAlive' ) )
                    // InternalGoLDSL.g:786:4: (lv_alive_2_0= 'IsAlive' )
                    {
                    // InternalGoLDSL.g:786:4: (lv_alive_2_0= 'IsAlive' )
                    // InternalGoLDSL.g:787:5: lv_alive_2_0= 'IsAlive'
                    {
                    lv_alive_2_0=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_alive_2_0, grammarAccess.getConditionRuleAccess().getAliveIsAliveKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConditionRuleRule());
                    					}
                    					setWithLastConsumed(current, "alive", lv_alive_2_0, "IsAlive");
                    				

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
    // InternalGoLDSL.g:803:1: entryRuleConditionRules returns [EObject current=null] : iv_ruleConditionRules= ruleConditionRules EOF ;
    public final EObject entryRuleConditionRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionRules = null;


        try {
            // InternalGoLDSL.g:803:55: (iv_ruleConditionRules= ruleConditionRules EOF )
            // InternalGoLDSL.g:804:2: iv_ruleConditionRules= ruleConditionRules EOF
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
    // InternalGoLDSL.g:810:1: ruleConditionRules returns [EObject current=null] : ( ( (lv_rule1_0_0= ruleConditionRule ) ) ( ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rule2_2_0= ruleConditionRules ) ) )? ) ;
    public final EObject ruleConditionRules() throws RecognitionException {
        EObject current = null;

        EObject lv_rule1_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_rule2_2_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:816:2: ( ( ( (lv_rule1_0_0= ruleConditionRule ) ) ( ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rule2_2_0= ruleConditionRules ) ) )? ) )
            // InternalGoLDSL.g:817:2: ( ( (lv_rule1_0_0= ruleConditionRule ) ) ( ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rule2_2_0= ruleConditionRules ) ) )? )
            {
            // InternalGoLDSL.g:817:2: ( ( (lv_rule1_0_0= ruleConditionRule ) ) ( ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rule2_2_0= ruleConditionRules ) ) )? )
            // InternalGoLDSL.g:818:3: ( (lv_rule1_0_0= ruleConditionRule ) ) ( ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rule2_2_0= ruleConditionRules ) ) )?
            {
            // InternalGoLDSL.g:818:3: ( (lv_rule1_0_0= ruleConditionRule ) )
            // InternalGoLDSL.g:819:4: (lv_rule1_0_0= ruleConditionRule )
            {
            // InternalGoLDSL.g:819:4: (lv_rule1_0_0= ruleConditionRule )
            // InternalGoLDSL.g:820:5: lv_rule1_0_0= ruleConditionRule
            {

            					newCompositeNode(grammarAccess.getConditionRulesAccess().getRule1ConditionRuleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalGoLDSL.g:837:3: ( ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rule2_2_0= ruleConditionRules ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=27 && LA6_0<=28)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGoLDSL.g:838:4: ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rule2_2_0= ruleConditionRules ) )
                    {
                    // InternalGoLDSL.g:838:4: ( (lv_operator_1_0= ruleBoolOperator ) )
                    // InternalGoLDSL.g:839:5: (lv_operator_1_0= ruleBoolOperator )
                    {
                    // InternalGoLDSL.g:839:5: (lv_operator_1_0= ruleBoolOperator )
                    // InternalGoLDSL.g:840:6: lv_operator_1_0= ruleBoolOperator
                    {

                    						newCompositeNode(grammarAccess.getConditionRulesAccess().getOperatorBoolOperatorEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    // InternalGoLDSL.g:857:4: ( (lv_rule2_2_0= ruleConditionRules ) )
                    // InternalGoLDSL.g:858:5: (lv_rule2_2_0= ruleConditionRules )
                    {
                    // InternalGoLDSL.g:858:5: (lv_rule2_2_0= ruleConditionRules )
                    // InternalGoLDSL.g:859:6: lv_rule2_2_0= ruleConditionRules
                    {

                    						newCompositeNode(grammarAccess.getConditionRulesAccess().getRule2ConditionRulesParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rule2_2_0=ruleConditionRules();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRulesRule());
                    						}
                    						set(
                    							current,
                    							"rule2",
                    							lv_rule2_2_0,
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


    // $ANTLR start "entryRuleRange"
    // InternalGoLDSL.g:881:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalGoLDSL.g:881:46: (iv_ruleRange= ruleRange EOF )
            // InternalGoLDSL.g:882:2: iv_ruleRange= ruleRange EOF
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
    // InternalGoLDSL.g:888:1: ruleRange returns [EObject current=null] : (this_BoundedRange_0= ruleBoundedRange | this_LeftUnboundedRange_1= ruleLeftUnboundedRange | this_RightUnboundedRange_2= ruleRightUnboundedRange ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        EObject this_BoundedRange_0 = null;

        EObject this_LeftUnboundedRange_1 = null;

        EObject this_RightUnboundedRange_2 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:894:2: ( (this_BoundedRange_0= ruleBoundedRange | this_LeftUnboundedRange_1= ruleLeftUnboundedRange | this_RightUnboundedRange_2= ruleRightUnboundedRange ) )
            // InternalGoLDSL.g:895:2: (this_BoundedRange_0= ruleBoundedRange | this_LeftUnboundedRange_1= ruleLeftUnboundedRange | this_RightUnboundedRange_2= ruleRightUnboundedRange )
            {
            // InternalGoLDSL.g:895:2: (this_BoundedRange_0= ruleBoundedRange | this_LeftUnboundedRange_1= ruleLeftUnboundedRange | this_RightUnboundedRange_2= ruleRightUnboundedRange )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==23) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==EOF||LA7_3==20||(LA7_3>=27 && LA7_3<=28)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_3==RULE_INT) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==23) ) {
                alt7=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGoLDSL.g:896:3: this_BoundedRange_0= ruleBoundedRange
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
                    // InternalGoLDSL.g:905:3: this_LeftUnboundedRange_1= ruleLeftUnboundedRange
                    {

                    			newCompositeNode(grammarAccess.getRangeAccess().getLeftUnboundedRangeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LeftUnboundedRange_1=ruleLeftUnboundedRange();

                    state._fsp--;


                    			current = this_LeftUnboundedRange_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGoLDSL.g:914:3: this_RightUnboundedRange_2= ruleRightUnboundedRange
                    {

                    			newCompositeNode(grammarAccess.getRangeAccess().getRightUnboundedRangeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RightUnboundedRange_2=ruleRightUnboundedRange();

                    state._fsp--;


                    			current = this_RightUnboundedRange_2;
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
    // InternalGoLDSL.g:926:1: entryRuleBoundedRange returns [EObject current=null] : iv_ruleBoundedRange= ruleBoundedRange EOF ;
    public final EObject entryRuleBoundedRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundedRange = null;


        try {
            // InternalGoLDSL.g:926:53: (iv_ruleBoundedRange= ruleBoundedRange EOF )
            // InternalGoLDSL.g:927:2: iv_ruleBoundedRange= ruleBoundedRange EOF
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
    // InternalGoLDSL.g:933:1: ruleBoundedRange returns [EObject current=null] : ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_higherBound_2_0= RULE_INT ) ) ) ;
    public final EObject ruleBoundedRange() throws RecognitionException {
        EObject current = null;

        Token lv_lowerBound_0_0=null;
        Token otherlv_1=null;
        Token lv_higherBound_2_0=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:939:2: ( ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_higherBound_2_0= RULE_INT ) ) ) )
            // InternalGoLDSL.g:940:2: ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_higherBound_2_0= RULE_INT ) ) )
            {
            // InternalGoLDSL.g:940:2: ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_higherBound_2_0= RULE_INT ) ) )
            // InternalGoLDSL.g:941:3: ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_higherBound_2_0= RULE_INT ) )
            {
            // InternalGoLDSL.g:941:3: ( (lv_lowerBound_0_0= RULE_INT ) )
            // InternalGoLDSL.g:942:4: (lv_lowerBound_0_0= RULE_INT )
            {
            // InternalGoLDSL.g:942:4: (lv_lowerBound_0_0= RULE_INT )
            // InternalGoLDSL.g:943:5: lv_lowerBound_0_0= RULE_INT
            {
            lv_lowerBound_0_0=(Token)match(input,RULE_INT,FOLLOW_18); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getBoundedRangeAccess().getFullStopFullStopKeyword_1());
            		
            // InternalGoLDSL.g:963:3: ( (lv_higherBound_2_0= RULE_INT ) )
            // InternalGoLDSL.g:964:4: (lv_higherBound_2_0= RULE_INT )
            {
            // InternalGoLDSL.g:964:4: (lv_higherBound_2_0= RULE_INT )
            // InternalGoLDSL.g:965:5: lv_higherBound_2_0= RULE_INT
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


    // $ANTLR start "entryRuleLeftUnboundedRange"
    // InternalGoLDSL.g:985:1: entryRuleLeftUnboundedRange returns [EObject current=null] : iv_ruleLeftUnboundedRange= ruleLeftUnboundedRange EOF ;
    public final EObject entryRuleLeftUnboundedRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftUnboundedRange = null;


        try {
            // InternalGoLDSL.g:985:59: (iv_ruleLeftUnboundedRange= ruleLeftUnboundedRange EOF )
            // InternalGoLDSL.g:986:2: iv_ruleLeftUnboundedRange= ruleLeftUnboundedRange EOF
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
    // InternalGoLDSL.g:992:1: ruleLeftUnboundedRange returns [EObject current=null] : ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ) ;
    public final EObject ruleLeftUnboundedRange() throws RecognitionException {
        EObject current = null;

        Token lv_lowerBound_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:998:2: ( ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ) )
            // InternalGoLDSL.g:999:2: ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' )
            {
            // InternalGoLDSL.g:999:2: ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' )
            // InternalGoLDSL.g:1000:3: ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..'
            {
            // InternalGoLDSL.g:1000:3: ( (lv_lowerBound_0_0= RULE_INT ) )
            // InternalGoLDSL.g:1001:4: (lv_lowerBound_0_0= RULE_INT )
            {
            // InternalGoLDSL.g:1001:4: (lv_lowerBound_0_0= RULE_INT )
            // InternalGoLDSL.g:1002:5: lv_lowerBound_0_0= RULE_INT
            {
            lv_lowerBound_0_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_lowerBound_0_0, grammarAccess.getLeftUnboundedRangeAccess().getLowerBoundINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLeftUnboundedRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lowerBound",
            						lv_lowerBound_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftUnboundedRangeAccess().getFullStopFullStopKeyword_1());
            		

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
    // InternalGoLDSL.g:1026:1: entryRuleRightUnboundedRange returns [EObject current=null] : iv_ruleRightUnboundedRange= ruleRightUnboundedRange EOF ;
    public final EObject entryRuleRightUnboundedRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightUnboundedRange = null;


        try {
            // InternalGoLDSL.g:1026:60: (iv_ruleRightUnboundedRange= ruleRightUnboundedRange EOF )
            // InternalGoLDSL.g:1027:2: iv_ruleRightUnboundedRange= ruleRightUnboundedRange EOF
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
    // InternalGoLDSL.g:1033:1: ruleRightUnboundedRange returns [EObject current=null] : (otherlv_0= '..' ( (lv_higherBound_1_0= RULE_INT ) ) ) ;
    public final EObject ruleRightUnboundedRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_higherBound_1_0=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:1039:2: ( (otherlv_0= '..' ( (lv_higherBound_1_0= RULE_INT ) ) ) )
            // InternalGoLDSL.g:1040:2: (otherlv_0= '..' ( (lv_higherBound_1_0= RULE_INT ) ) )
            {
            // InternalGoLDSL.g:1040:2: (otherlv_0= '..' ( (lv_higherBound_1_0= RULE_INT ) ) )
            // InternalGoLDSL.g:1041:3: otherlv_0= '..' ( (lv_higherBound_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRightUnboundedRangeAccess().getFullStopFullStopKeyword_0());
            		
            // InternalGoLDSL.g:1045:3: ( (lv_higherBound_1_0= RULE_INT ) )
            // InternalGoLDSL.g:1046:4: (lv_higherBound_1_0= RULE_INT )
            {
            // InternalGoLDSL.g:1046:4: (lv_higherBound_1_0= RULE_INT )
            // InternalGoLDSL.g:1047:5: lv_higherBound_1_0= RULE_INT
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


    // $ANTLR start "entryRuleGrid"
    // InternalGoLDSL.g:1067:1: entryRuleGrid returns [EObject current=null] : iv_ruleGrid= ruleGrid EOF ;
    public final EObject entryRuleGrid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrid = null;


        try {
            // InternalGoLDSL.g:1067:45: (iv_ruleGrid= ruleGrid EOF )
            // InternalGoLDSL.g:1068:2: iv_ruleGrid= ruleGrid EOF
            {
             newCompositeNode(grammarAccess.getGridRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrid=ruleGrid();

            state._fsp--;

             current =iv_ruleGrid; 
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
    // $ANTLR end "entryRuleGrid"


    // $ANTLR start "ruleGrid"
    // InternalGoLDSL.g:1074:1: ruleGrid returns [EObject current=null] : (otherlv_0= 'Grid:' ( (lv_size_1_0= ruleSize ) ) ( (lv_parts_2_0= ruleGridPart ) )+ ) ;
    public final EObject ruleGrid() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_size_1_0 = null;

        Enumerator lv_parts_2_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:1080:2: ( (otherlv_0= 'Grid:' ( (lv_size_1_0= ruleSize ) ) ( (lv_parts_2_0= ruleGridPart ) )+ ) )
            // InternalGoLDSL.g:1081:2: (otherlv_0= 'Grid:' ( (lv_size_1_0= ruleSize ) ) ( (lv_parts_2_0= ruleGridPart ) )+ )
            {
            // InternalGoLDSL.g:1081:2: (otherlv_0= 'Grid:' ( (lv_size_1_0= ruleSize ) ) ( (lv_parts_2_0= ruleGridPart ) )+ )
            // InternalGoLDSL.g:1082:3: otherlv_0= 'Grid:' ( (lv_size_1_0= ruleSize ) ) ( (lv_parts_2_0= ruleGridPart ) )+
            {
            otherlv_0=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getGridAccess().getGridKeyword_0());
            		
            // InternalGoLDSL.g:1086:3: ( (lv_size_1_0= ruleSize ) )
            // InternalGoLDSL.g:1087:4: (lv_size_1_0= ruleSize )
            {
            // InternalGoLDSL.g:1087:4: (lv_size_1_0= ruleSize )
            // InternalGoLDSL.g:1088:5: lv_size_1_0= ruleSize
            {

            					newCompositeNode(grammarAccess.getGridAccess().getSizeSizeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_size_1_0=ruleSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGridRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_1_0,
            						"com.simonbaars.GoLDSL.Size");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGoLDSL.g:1105:3: ( (lv_parts_2_0= ruleGridPart ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=29 && LA8_0<=30)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGoLDSL.g:1106:4: (lv_parts_2_0= ruleGridPart )
            	    {
            	    // InternalGoLDSL.g:1106:4: (lv_parts_2_0= ruleGridPart )
            	    // InternalGoLDSL.g:1107:5: lv_parts_2_0= ruleGridPart
            	    {

            	    					newCompositeNode(grammarAccess.getGridAccess().getPartsGridPartEnumRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_parts_2_0=ruleGridPart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGridRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parts",
            	    						lv_parts_2_0,
            	    						"com.simonbaars.GoLDSL.GridPart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // $ANTLR end "ruleGrid"


    // $ANTLR start "entryRuleOffset"
    // InternalGoLDSL.g:1128:1: entryRuleOffset returns [EObject current=null] : iv_ruleOffset= ruleOffset EOF ;
    public final EObject entryRuleOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOffset = null;


        try {
            // InternalGoLDSL.g:1128:47: (iv_ruleOffset= ruleOffset EOF )
            // InternalGoLDSL.g:1129:2: iv_ruleOffset= ruleOffset EOF
            {
             newCompositeNode(grammarAccess.getOffsetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOffset=ruleOffset();

            state._fsp--;

             current =iv_ruleOffset; 
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
    // $ANTLR end "entryRuleOffset"


    // $ANTLR start "ruleOffset"
    // InternalGoLDSL.g:1135:1: ruleOffset returns [EObject current=null] : (otherlv_0= 'offset' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ) ;
    public final EObject ruleOffset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token lv_y_2_0=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:1141:2: ( (otherlv_0= 'offset' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ) )
            // InternalGoLDSL.g:1142:2: (otherlv_0= 'offset' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) )
            {
            // InternalGoLDSL.g:1142:2: (otherlv_0= 'offset' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) )
            // InternalGoLDSL.g:1143:3: otherlv_0= 'offset' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getOffsetAccess().getOffsetKeyword_0());
            		
            // InternalGoLDSL.g:1147:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalGoLDSL.g:1148:4: (lv_x_1_0= RULE_INT )
            {
            // InternalGoLDSL.g:1148:4: (lv_x_1_0= RULE_INT )
            // InternalGoLDSL.g:1149:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_x_1_0, grammarAccess.getOffsetAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOffsetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGoLDSL.g:1165:3: ( (lv_y_2_0= RULE_INT ) )
            // InternalGoLDSL.g:1166:4: (lv_y_2_0= RULE_INT )
            {
            // InternalGoLDSL.g:1166:4: (lv_y_2_0= RULE_INT )
            // InternalGoLDSL.g:1167:5: lv_y_2_0= RULE_INT
            {
            lv_y_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_y_2_0, grammarAccess.getOffsetAccess().getYINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOffsetRule());
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
    // $ANTLR end "ruleOffset"


    // $ANTLR start "entryRuleSize"
    // InternalGoLDSL.g:1187:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalGoLDSL.g:1187:45: (iv_ruleSize= ruleSize EOF )
            // InternalGoLDSL.g:1188:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
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
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // InternalGoLDSL.g:1194:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_height_2_0= RULE_INT ) ) ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_width_1_0=null;
        Token lv_height_2_0=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:1200:2: ( (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_height_2_0= RULE_INT ) ) ) )
            // InternalGoLDSL.g:1201:2: (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_height_2_0= RULE_INT ) ) )
            {
            // InternalGoLDSL.g:1201:2: (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_height_2_0= RULE_INT ) ) )
            // InternalGoLDSL.g:1202:3: otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_height_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
            		
            // InternalGoLDSL.g:1206:3: ( (lv_width_1_0= RULE_INT ) )
            // InternalGoLDSL.g:1207:4: (lv_width_1_0= RULE_INT )
            {
            // InternalGoLDSL.g:1207:4: (lv_width_1_0= RULE_INT )
            // InternalGoLDSL.g:1208:5: lv_width_1_0= RULE_INT
            {
            lv_width_1_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_width_1_0, grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGoLDSL.g:1224:3: ( (lv_height_2_0= RULE_INT ) )
            // InternalGoLDSL.g:1225:4: (lv_height_2_0= RULE_INT )
            {
            // InternalGoLDSL.g:1225:4: (lv_height_2_0= RULE_INT )
            // InternalGoLDSL.g:1226:5: lv_height_2_0= RULE_INT
            {
            lv_height_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_height_2_0, grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"height",
            						lv_height_2_0,
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
    // $ANTLR end "ruleSize"


    // $ANTLR start "ruleBoolOperator"
    // InternalGoLDSL.g:1246:1: ruleBoolOperator returns [Enumerator current=null] : ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) ;
    public final Enumerator ruleBoolOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:1252:2: ( ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) )
            // InternalGoLDSL.g:1253:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            {
            // InternalGoLDSL.g:1253:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==28) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGoLDSL.g:1254:3: (enumLiteral_0= '&' )
                    {
                    // InternalGoLDSL.g:1254:3: (enumLiteral_0= '&' )
                    // InternalGoLDSL.g:1255:4: enumLiteral_0= '&'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:1262:3: (enumLiteral_1= '|' )
                    {
                    // InternalGoLDSL.g:1262:3: (enumLiteral_1= '|' )
                    // InternalGoLDSL.g:1263:4: enumLiteral_1= '|'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

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


    // $ANTLR start "ruleGridPart"
    // InternalGoLDSL.g:1273:1: ruleGridPart returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleGridPart() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:1279:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalGoLDSL.g:1280:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalGoLDSL.g:1280:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            else if ( (LA10_0==30) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGoLDSL.g:1281:3: (enumLiteral_0= '+' )
                    {
                    // InternalGoLDSL.g:1281:3: (enumLiteral_0= '+' )
                    // InternalGoLDSL.g:1282:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getGridPartAccess().getALIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGridPartAccess().getALIVEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:1289:3: (enumLiteral_1= '-' )
                    {
                    // InternalGoLDSL.g:1289:3: (enumLiteral_1= '-' )
                    // InternalGoLDSL.g:1290:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getGridPartAccess().getDEADEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGridPartAccess().getDEADEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleGridPart"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001031000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001031002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003031000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000060000002L});

}