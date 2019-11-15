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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Board:'", "'Shape'", "':'", "'('", "')'", "'Cells:'", "'Cell:'", "','", "'Rule:'", "'Create'", "'If'", "'Lives'", "'..'", "'<'", "'>'", "'Grid:'", "'offset'", "'size'", "'&'", "'|'", "'+'", "'-'"
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
    public static final int T__31=31;
    public static final int T__32=32;
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
    // InternalGoLDSL.g:193:1: ruleObjects returns [EObject current=null] : ( ( (lv_shapes_0_0= ruleShapeRef ) ) | ( (lv_cell_1_0= ruleCellDef ) ) | ( (lv_cells_2_0= ruleCells ) ) | ( (lv_grids_3_0= ruleGrid ) ) )+ ;
    public final EObject ruleObjects() throws RecognitionException {
        EObject current = null;

        EObject lv_shapes_0_0 = null;

        EObject lv_cell_1_0 = null;

        EObject lv_cells_2_0 = null;

        EObject lv_grids_3_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:199:2: ( ( ( (lv_shapes_0_0= ruleShapeRef ) ) | ( (lv_cell_1_0= ruleCellDef ) ) | ( (lv_cells_2_0= ruleCells ) ) | ( (lv_grids_3_0= ruleGrid ) ) )+ )
            // InternalGoLDSL.g:200:2: ( ( (lv_shapes_0_0= ruleShapeRef ) ) | ( (lv_cell_1_0= ruleCellDef ) ) | ( (lv_cells_2_0= ruleCells ) ) | ( (lv_grids_3_0= ruleGrid ) ) )+
            {
            // InternalGoLDSL.g:200:2: ( ( (lv_shapes_0_0= ruleShapeRef ) ) | ( (lv_cell_1_0= ruleCellDef ) ) | ( (lv_cells_2_0= ruleCells ) ) | ( (lv_grids_3_0= ruleGrid ) ) )+
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
                case 26:
                    {
                    alt2=4;
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
            	    // InternalGoLDSL.g:221:3: ( (lv_cell_1_0= ruleCellDef ) )
            	    {
            	    // InternalGoLDSL.g:221:3: ( (lv_cell_1_0= ruleCellDef ) )
            	    // InternalGoLDSL.g:222:4: (lv_cell_1_0= ruleCellDef )
            	    {
            	    // InternalGoLDSL.g:222:4: (lv_cell_1_0= ruleCellDef )
            	    // InternalGoLDSL.g:223:5: lv_cell_1_0= ruleCellDef
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
            	    // InternalGoLDSL.g:241:3: ( (lv_cells_2_0= ruleCells ) )
            	    {
            	    // InternalGoLDSL.g:241:3: ( (lv_cells_2_0= ruleCells ) )
            	    // InternalGoLDSL.g:242:4: (lv_cells_2_0= ruleCells )
            	    {
            	    // InternalGoLDSL.g:242:4: (lv_cells_2_0= ruleCells )
            	    // InternalGoLDSL.g:243:5: lv_cells_2_0= ruleCells
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
            	    // InternalGoLDSL.g:261:3: ( (lv_grids_3_0= ruleGrid ) )
            	    {
            	    // InternalGoLDSL.g:261:3: ( (lv_grids_3_0= ruleGrid ) )
            	    // InternalGoLDSL.g:262:4: (lv_grids_3_0= ruleGrid )
            	    {
            	    // InternalGoLDSL.g:262:4: (lv_grids_3_0= ruleGrid )
            	    // InternalGoLDSL.g:263:5: lv_grids_3_0= ruleGrid
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
    // InternalGoLDSL.g:284:1: entryRuleShapeDef returns [EObject current=null] : iv_ruleShapeDef= ruleShapeDef EOF ;
    public final EObject entryRuleShapeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeDef = null;


        try {
            // InternalGoLDSL.g:284:49: (iv_ruleShapeDef= ruleShapeDef EOF )
            // InternalGoLDSL.g:285:2: iv_ruleShapeDef= ruleShapeDef EOF
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
    // InternalGoLDSL.g:291:1: ruleShapeDef returns [EObject current=null] : (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_offset_3_0= ruleGridOffset ) )? ( (lv_objects_4_0= ruleObjects ) ) ) ;
    public final EObject ruleShapeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_offset_3_0 = null;

        EObject lv_objects_4_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:297:2: ( (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_offset_3_0= ruleGridOffset ) )? ( (lv_objects_4_0= ruleObjects ) ) ) )
            // InternalGoLDSL.g:298:2: (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_offset_3_0= ruleGridOffset ) )? ( (lv_objects_4_0= ruleObjects ) ) )
            {
            // InternalGoLDSL.g:298:2: (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_offset_3_0= ruleGridOffset ) )? ( (lv_objects_4_0= ruleObjects ) ) )
            // InternalGoLDSL.g:299:3: otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_offset_3_0= ruleGridOffset ) )? ( (lv_objects_4_0= ruleObjects ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getShapeDefAccess().getShapeKeyword_0());
            		
            // InternalGoLDSL.g:303:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoLDSL.g:304:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoLDSL.g:304:4: (lv_name_1_0= RULE_ID )
            // InternalGoLDSL.g:305:5: lv_name_1_0= RULE_ID
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
            		
            // InternalGoLDSL.g:325:3: ( (lv_offset_3_0= ruleGridOffset ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGoLDSL.g:326:4: (lv_offset_3_0= ruleGridOffset )
                    {
                    // InternalGoLDSL.g:326:4: (lv_offset_3_0= ruleGridOffset )
                    // InternalGoLDSL.g:327:5: lv_offset_3_0= ruleGridOffset
                    {

                    					newCompositeNode(grammarAccess.getShapeDefAccess().getOffsetGridOffsetParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_offset_3_0=ruleGridOffset();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShapeDefRule());
                    					}
                    					set(
                    						current,
                    						"offset",
                    						lv_offset_3_0,
                    						"com.simonbaars.GoLDSL.GridOffset");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGoLDSL.g:344:3: ( (lv_objects_4_0= ruleObjects ) )
            // InternalGoLDSL.g:345:4: (lv_objects_4_0= ruleObjects )
            {
            // InternalGoLDSL.g:345:4: (lv_objects_4_0= ruleObjects )
            // InternalGoLDSL.g:346:5: lv_objects_4_0= ruleObjects
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
    // InternalGoLDSL.g:367:1: entryRuleCellPairs returns [EObject current=null] : iv_ruleCellPairs= ruleCellPairs EOF ;
    public final EObject entryRuleCellPairs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellPairs = null;


        try {
            // InternalGoLDSL.g:367:50: (iv_ruleCellPairs= ruleCellPairs EOF )
            // InternalGoLDSL.g:368:2: iv_ruleCellPairs= ruleCellPairs EOF
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
    // InternalGoLDSL.g:374:1: ruleCellPairs returns [EObject current=null] : (otherlv_0= '(' ( (lv_cells_1_0= ruleCell ) ) otherlv_2= ')' )+ ;
    public final EObject ruleCellPairs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_cells_1_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:380:2: ( (otherlv_0= '(' ( (lv_cells_1_0= ruleCell ) ) otherlv_2= ')' )+ )
            // InternalGoLDSL.g:381:2: (otherlv_0= '(' ( (lv_cells_1_0= ruleCell ) ) otherlv_2= ')' )+
            {
            // InternalGoLDSL.g:381:2: (otherlv_0= '(' ( (lv_cells_1_0= ruleCell ) ) otherlv_2= ')' )+
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
            	    // InternalGoLDSL.g:382:3: otherlv_0= '(' ( (lv_cells_1_0= ruleCell ) ) otherlv_2= ')'
            	    {
            	    otherlv_0=(Token)match(input,14,FOLLOW_9); 

            	    			newLeafNode(otherlv_0, grammarAccess.getCellPairsAccess().getLeftParenthesisKeyword_0());
            	    		
            	    // InternalGoLDSL.g:386:3: ( (lv_cells_1_0= ruleCell ) )
            	    // InternalGoLDSL.g:387:4: (lv_cells_1_0= ruleCell )
            	    {
            	    // InternalGoLDSL.g:387:4: (lv_cells_1_0= ruleCell )
            	    // InternalGoLDSL.g:388:5: lv_cells_1_0= ruleCell
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
    // InternalGoLDSL.g:413:1: entryRuleCells returns [EObject current=null] : iv_ruleCells= ruleCells EOF ;
    public final EObject entryRuleCells() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCells = null;


        try {
            // InternalGoLDSL.g:413:46: (iv_ruleCells= ruleCells EOF )
            // InternalGoLDSL.g:414:2: iv_ruleCells= ruleCells EOF
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
    // InternalGoLDSL.g:420:1: ruleCells returns [EObject current=null] : (otherlv_0= 'Cells:' this_CellPairs_1= ruleCellPairs ) ;
    public final EObject ruleCells() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_CellPairs_1 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:426:2: ( (otherlv_0= 'Cells:' this_CellPairs_1= ruleCellPairs ) )
            // InternalGoLDSL.g:427:2: (otherlv_0= 'Cells:' this_CellPairs_1= ruleCellPairs )
            {
            // InternalGoLDSL.g:427:2: (otherlv_0= 'Cells:' this_CellPairs_1= ruleCellPairs )
            // InternalGoLDSL.g:428:3: otherlv_0= 'Cells:' this_CellPairs_1= ruleCellPairs
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
    // InternalGoLDSL.g:444:1: entryRuleCellDef returns [EObject current=null] : iv_ruleCellDef= ruleCellDef EOF ;
    public final EObject entryRuleCellDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellDef = null;


        try {
            // InternalGoLDSL.g:444:48: (iv_ruleCellDef= ruleCellDef EOF )
            // InternalGoLDSL.g:445:2: iv_ruleCellDef= ruleCellDef EOF
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
    // InternalGoLDSL.g:451:1: ruleCellDef returns [EObject current=null] : (otherlv_0= 'Cell:' this_Cell_1= ruleCell ) ;
    public final EObject ruleCellDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Cell_1 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:457:2: ( (otherlv_0= 'Cell:' this_Cell_1= ruleCell ) )
            // InternalGoLDSL.g:458:2: (otherlv_0= 'Cell:' this_Cell_1= ruleCell )
            {
            // InternalGoLDSL.g:458:2: (otherlv_0= 'Cell:' this_Cell_1= ruleCell )
            // InternalGoLDSL.g:459:3: otherlv_0= 'Cell:' this_Cell_1= ruleCell
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
    // InternalGoLDSL.g:475:1: entryRuleShapeRef returns [EObject current=null] : iv_ruleShapeRef= ruleShapeRef EOF ;
    public final EObject entryRuleShapeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeRef = null;


        try {
            // InternalGoLDSL.g:475:49: (iv_ruleShapeRef= ruleShapeRef EOF )
            // InternalGoLDSL.g:476:2: iv_ruleShapeRef= ruleShapeRef EOF
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
    // InternalGoLDSL.g:482:1: ruleShapeRef returns [EObject current=null] : (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) ) ;
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
            // InternalGoLDSL.g:488:2: ( (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) ) )
            // InternalGoLDSL.g:489:2: (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) )
            {
            // InternalGoLDSL.g:489:2: (otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) ) )
            // InternalGoLDSL.g:490:3: otherlv_0= 'Shape' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_x_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_y_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getShapeRefAccess().getShapeKeyword_0());
            		
            // InternalGoLDSL.g:494:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoLDSL.g:495:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoLDSL.g:495:4: (lv_name_1_0= RULE_ID )
            // InternalGoLDSL.g:496:5: lv_name_1_0= RULE_ID
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
            		
            // InternalGoLDSL.g:516:3: ( (lv_x_3_0= RULE_INT ) )
            // InternalGoLDSL.g:517:4: (lv_x_3_0= RULE_INT )
            {
            // InternalGoLDSL.g:517:4: (lv_x_3_0= RULE_INT )
            // InternalGoLDSL.g:518:5: lv_x_3_0= RULE_INT
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
            		
            // InternalGoLDSL.g:538:3: ( (lv_y_5_0= RULE_INT ) )
            // InternalGoLDSL.g:539:4: (lv_y_5_0= RULE_INT )
            {
            // InternalGoLDSL.g:539:4: (lv_y_5_0= RULE_INT )
            // InternalGoLDSL.g:540:5: lv_y_5_0= RULE_INT
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
    // InternalGoLDSL.g:560:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalGoLDSL.g:560:45: (iv_ruleCell= ruleCell EOF )
            // InternalGoLDSL.g:561:2: iv_ruleCell= ruleCell EOF
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
    // InternalGoLDSL.g:567:1: ruleCell returns [EObject current=null] : ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_0=null;
        Token otherlv_1=null;
        Token lv_y_2_0=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:573:2: ( ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) ) )
            // InternalGoLDSL.g:574:2: ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) )
            {
            // InternalGoLDSL.g:574:2: ( ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) ) )
            // InternalGoLDSL.g:575:3: ( (lv_x_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_INT ) )
            {
            // InternalGoLDSL.g:575:3: ( (lv_x_0_0= RULE_INT ) )
            // InternalGoLDSL.g:576:4: (lv_x_0_0= RULE_INT )
            {
            // InternalGoLDSL.g:576:4: (lv_x_0_0= RULE_INT )
            // InternalGoLDSL.g:577:5: lv_x_0_0= RULE_INT
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
            		
            // InternalGoLDSL.g:597:3: ( (lv_y_2_0= RULE_INT ) )
            // InternalGoLDSL.g:598:4: (lv_y_2_0= RULE_INT )
            {
            // InternalGoLDSL.g:598:4: (lv_y_2_0= RULE_INT )
            // InternalGoLDSL.g:599:5: lv_y_2_0= RULE_INT
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
    // InternalGoLDSL.g:619:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalGoLDSL.g:619:45: (iv_ruleRule= ruleRule EOF )
            // InternalGoLDSL.g:620:2: iv_ruleRule= ruleRule EOF
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
    // InternalGoLDSL.g:626:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Rule:' ( (lv_condition_1_0= ruleCondition ) ) ( (lv_action_2_0= ruleAction ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_condition_1_0 = null;

        EObject lv_action_2_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:632:2: ( (otherlv_0= 'Rule:' ( (lv_condition_1_0= ruleCondition ) ) ( (lv_action_2_0= ruleAction ) ) ) )
            // InternalGoLDSL.g:633:2: (otherlv_0= 'Rule:' ( (lv_condition_1_0= ruleCondition ) ) ( (lv_action_2_0= ruleAction ) ) )
            {
            // InternalGoLDSL.g:633:2: (otherlv_0= 'Rule:' ( (lv_condition_1_0= ruleCondition ) ) ( (lv_action_2_0= ruleAction ) ) )
            // InternalGoLDSL.g:634:3: otherlv_0= 'Rule:' ( (lv_condition_1_0= ruleCondition ) ) ( (lv_action_2_0= ruleAction ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalGoLDSL.g:638:3: ( (lv_condition_1_0= ruleCondition ) )
            // InternalGoLDSL.g:639:4: (lv_condition_1_0= ruleCondition )
            {
            // InternalGoLDSL.g:639:4: (lv_condition_1_0= ruleCondition )
            // InternalGoLDSL.g:640:5: lv_condition_1_0= ruleCondition
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

            // InternalGoLDSL.g:657:3: ( (lv_action_2_0= ruleAction ) )
            // InternalGoLDSL.g:658:4: (lv_action_2_0= ruleAction )
            {
            // InternalGoLDSL.g:658:4: (lv_action_2_0= ruleAction )
            // InternalGoLDSL.g:659:5: lv_action_2_0= ruleAction
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
    // InternalGoLDSL.g:680:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalGoLDSL.g:680:47: (iv_ruleAction= ruleAction EOF )
            // InternalGoLDSL.g:681:2: iv_ruleAction= ruleAction EOF
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
    // InternalGoLDSL.g:687:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Create' ( (lv_objects_1_0= ruleObjects ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_objects_1_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:693:2: ( (otherlv_0= 'Create' ( (lv_objects_1_0= ruleObjects ) ) ) )
            // InternalGoLDSL.g:694:2: (otherlv_0= 'Create' ( (lv_objects_1_0= ruleObjects ) ) )
            {
            // InternalGoLDSL.g:694:2: (otherlv_0= 'Create' ( (lv_objects_1_0= ruleObjects ) ) )
            // InternalGoLDSL.g:695:3: otherlv_0= 'Create' ( (lv_objects_1_0= ruleObjects ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getCreateKeyword_0());
            		
            // InternalGoLDSL.g:699:3: ( (lv_objects_1_0= ruleObjects ) )
            // InternalGoLDSL.g:700:4: (lv_objects_1_0= ruleObjects )
            {
            // InternalGoLDSL.g:700:4: (lv_objects_1_0= ruleObjects )
            // InternalGoLDSL.g:701:5: lv_objects_1_0= ruleObjects
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
    // InternalGoLDSL.g:722:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGoLDSL.g:722:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGoLDSL.g:723:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalGoLDSL.g:729:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'If' ( (lv_conditions_1_0= ruleConditionRules ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_conditions_1_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:735:2: ( (otherlv_0= 'If' ( (lv_conditions_1_0= ruleConditionRules ) ) ) )
            // InternalGoLDSL.g:736:2: (otherlv_0= 'If' ( (lv_conditions_1_0= ruleConditionRules ) ) )
            {
            // InternalGoLDSL.g:736:2: (otherlv_0= 'If' ( (lv_conditions_1_0= ruleConditionRules ) ) )
            // InternalGoLDSL.g:737:3: otherlv_0= 'If' ( (lv_conditions_1_0= ruleConditionRules ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0());
            		
            // InternalGoLDSL.g:741:3: ( (lv_conditions_1_0= ruleConditionRules ) )
            // InternalGoLDSL.g:742:4: (lv_conditions_1_0= ruleConditionRules )
            {
            // InternalGoLDSL.g:742:4: (lv_conditions_1_0= ruleConditionRules )
            // InternalGoLDSL.g:743:5: lv_conditions_1_0= ruleConditionRules
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
    // InternalGoLDSL.g:764:1: entryRuleConditionRule returns [EObject current=null] : iv_ruleConditionRule= ruleConditionRule EOF ;
    public final EObject entryRuleConditionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionRule = null;


        try {
            // InternalGoLDSL.g:764:54: (iv_ruleConditionRule= ruleConditionRule EOF )
            // InternalGoLDSL.g:765:2: iv_ruleConditionRule= ruleConditionRule EOF
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
    // InternalGoLDSL.g:771:1: ruleConditionRule returns [EObject current=null] : ( ( (lv_number_0_0= RULE_INT ) ) | ( (lv_range_1_0= ruleRange ) ) | ( (lv_lives_2_0= ruleLives ) ) ) ;
    public final EObject ruleConditionRule() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        EObject lv_range_1_0 = null;

        EObject lv_lives_2_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:777:2: ( ( ( (lv_number_0_0= RULE_INT ) ) | ( (lv_range_1_0= ruleRange ) ) | ( (lv_lives_2_0= ruleLives ) ) ) )
            // InternalGoLDSL.g:778:2: ( ( (lv_number_0_0= RULE_INT ) ) | ( (lv_range_1_0= ruleRange ) ) | ( (lv_lives_2_0= ruleLives ) ) )
            {
            // InternalGoLDSL.g:778:2: ( ( (lv_number_0_0= RULE_INT ) ) | ( (lv_range_1_0= ruleRange ) ) | ( (lv_lives_2_0= ruleLives ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==20||(LA5_1>=29 && LA5_1<=30)) ) {
                    alt5=1;
                }
                else if ( (LA5_1==23) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 24:
            case 25:
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
                    // InternalGoLDSL.g:779:3: ( (lv_number_0_0= RULE_INT ) )
                    {
                    // InternalGoLDSL.g:779:3: ( (lv_number_0_0= RULE_INT ) )
                    // InternalGoLDSL.g:780:4: (lv_number_0_0= RULE_INT )
                    {
                    // InternalGoLDSL.g:780:4: (lv_number_0_0= RULE_INT )
                    // InternalGoLDSL.g:781:5: lv_number_0_0= RULE_INT
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
                    // InternalGoLDSL.g:798:3: ( (lv_range_1_0= ruleRange ) )
                    {
                    // InternalGoLDSL.g:798:3: ( (lv_range_1_0= ruleRange ) )
                    // InternalGoLDSL.g:799:4: (lv_range_1_0= ruleRange )
                    {
                    // InternalGoLDSL.g:799:4: (lv_range_1_0= ruleRange )
                    // InternalGoLDSL.g:800:5: lv_range_1_0= ruleRange
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
                    // InternalGoLDSL.g:818:3: ( (lv_lives_2_0= ruleLives ) )
                    {
                    // InternalGoLDSL.g:818:3: ( (lv_lives_2_0= ruleLives ) )
                    // InternalGoLDSL.g:819:4: (lv_lives_2_0= ruleLives )
                    {
                    // InternalGoLDSL.g:819:4: (lv_lives_2_0= ruleLives )
                    // InternalGoLDSL.g:820:5: lv_lives_2_0= ruleLives
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
    // InternalGoLDSL.g:841:1: entryRuleConditionRules returns [EObject current=null] : iv_ruleConditionRules= ruleConditionRules EOF ;
    public final EObject entryRuleConditionRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionRules = null;


        try {
            // InternalGoLDSL.g:841:55: (iv_ruleConditionRules= ruleConditionRules EOF )
            // InternalGoLDSL.g:842:2: iv_ruleConditionRules= ruleConditionRules EOF
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
    // InternalGoLDSL.g:848:1: ruleConditionRules returns [EObject current=null] : ( ( (lv_rule1_0_0= ruleConditionRule ) ) ( ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rules2_2_0= ruleConditionRules ) ) )? ) ;
    public final EObject ruleConditionRules() throws RecognitionException {
        EObject current = null;

        EObject lv_rule1_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_rules2_2_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:854:2: ( ( ( (lv_rule1_0_0= ruleConditionRule ) ) ( ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rules2_2_0= ruleConditionRules ) ) )? ) )
            // InternalGoLDSL.g:855:2: ( ( (lv_rule1_0_0= ruleConditionRule ) ) ( ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rules2_2_0= ruleConditionRules ) ) )? )
            {
            // InternalGoLDSL.g:855:2: ( ( (lv_rule1_0_0= ruleConditionRule ) ) ( ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rules2_2_0= ruleConditionRules ) ) )? )
            // InternalGoLDSL.g:856:3: ( (lv_rule1_0_0= ruleConditionRule ) ) ( ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rules2_2_0= ruleConditionRules ) ) )?
            {
            // InternalGoLDSL.g:856:3: ( (lv_rule1_0_0= ruleConditionRule ) )
            // InternalGoLDSL.g:857:4: (lv_rule1_0_0= ruleConditionRule )
            {
            // InternalGoLDSL.g:857:4: (lv_rule1_0_0= ruleConditionRule )
            // InternalGoLDSL.g:858:5: lv_rule1_0_0= ruleConditionRule
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

            // InternalGoLDSL.g:875:3: ( ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rules2_2_0= ruleConditionRules ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=29 && LA6_0<=30)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGoLDSL.g:876:4: ( (lv_operator_1_0= ruleBoolOperator ) ) ( (lv_rules2_2_0= ruleConditionRules ) )
                    {
                    // InternalGoLDSL.g:876:4: ( (lv_operator_1_0= ruleBoolOperator ) )
                    // InternalGoLDSL.g:877:5: (lv_operator_1_0= ruleBoolOperator )
                    {
                    // InternalGoLDSL.g:877:5: (lv_operator_1_0= ruleBoolOperator )
                    // InternalGoLDSL.g:878:6: lv_operator_1_0= ruleBoolOperator
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

                    // InternalGoLDSL.g:895:4: ( (lv_rules2_2_0= ruleConditionRules ) )
                    // InternalGoLDSL.g:896:5: (lv_rules2_2_0= ruleConditionRules )
                    {
                    // InternalGoLDSL.g:896:5: (lv_rules2_2_0= ruleConditionRules )
                    // InternalGoLDSL.g:897:6: lv_rules2_2_0= ruleConditionRules
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
    // InternalGoLDSL.g:919:1: entryRuleLives returns [EObject current=null] : iv_ruleLives= ruleLives EOF ;
    public final EObject entryRuleLives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLives = null;


        try {
            // InternalGoLDSL.g:919:46: (iv_ruleLives= ruleLives EOF )
            // InternalGoLDSL.g:920:2: iv_ruleLives= ruleLives EOF
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
    // InternalGoLDSL.g:926:1: ruleLives returns [EObject current=null] : (otherlv_0= 'Lives' ( (lv_cell_1_0= ruleCellPairs ) ) ) ;
    public final EObject ruleLives() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cell_1_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:932:2: ( (otherlv_0= 'Lives' ( (lv_cell_1_0= ruleCellPairs ) ) ) )
            // InternalGoLDSL.g:933:2: (otherlv_0= 'Lives' ( (lv_cell_1_0= ruleCellPairs ) ) )
            {
            // InternalGoLDSL.g:933:2: (otherlv_0= 'Lives' ( (lv_cell_1_0= ruleCellPairs ) ) )
            // InternalGoLDSL.g:934:3: otherlv_0= 'Lives' ( (lv_cell_1_0= ruleCellPairs ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getLivesAccess().getLivesKeyword_0());
            		
            // InternalGoLDSL.g:938:3: ( (lv_cell_1_0= ruleCellPairs ) )
            // InternalGoLDSL.g:939:4: (lv_cell_1_0= ruleCellPairs )
            {
            // InternalGoLDSL.g:939:4: (lv_cell_1_0= ruleCellPairs )
            // InternalGoLDSL.g:940:5: lv_cell_1_0= ruleCellPairs
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
    // InternalGoLDSL.g:961:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalGoLDSL.g:961:46: (iv_ruleRange= ruleRange EOF )
            // InternalGoLDSL.g:962:2: iv_ruleRange= ruleRange EOF
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
    // InternalGoLDSL.g:968:1: ruleRange returns [EObject current=null] : (this_BoundedRange_0= ruleBoundedRange | this_UnboundedRange_1= ruleUnboundedRange ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        EObject this_BoundedRange_0 = null;

        EObject this_UnboundedRange_1 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:974:2: ( (this_BoundedRange_0= ruleBoundedRange | this_UnboundedRange_1= ruleUnboundedRange ) )
            // InternalGoLDSL.g:975:2: (this_BoundedRange_0= ruleBoundedRange | this_UnboundedRange_1= ruleUnboundedRange )
            {
            // InternalGoLDSL.g:975:2: (this_BoundedRange_0= ruleBoundedRange | this_UnboundedRange_1= ruleUnboundedRange )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=24 && LA7_0<=25)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGoLDSL.g:976:3: this_BoundedRange_0= ruleBoundedRange
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
                    // InternalGoLDSL.g:985:3: this_UnboundedRange_1= ruleUnboundedRange
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
    // InternalGoLDSL.g:997:1: entryRuleBoundedRange returns [EObject current=null] : iv_ruleBoundedRange= ruleBoundedRange EOF ;
    public final EObject entryRuleBoundedRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundedRange = null;


        try {
            // InternalGoLDSL.g:997:53: (iv_ruleBoundedRange= ruleBoundedRange EOF )
            // InternalGoLDSL.g:998:2: iv_ruleBoundedRange= ruleBoundedRange EOF
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
    // InternalGoLDSL.g:1004:1: ruleBoundedRange returns [EObject current=null] : ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_higherBound_2_0= RULE_INT ) ) ) ;
    public final EObject ruleBoundedRange() throws RecognitionException {
        EObject current = null;

        Token lv_lowerBound_0_0=null;
        Token otherlv_1=null;
        Token lv_higherBound_2_0=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:1010:2: ( ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_higherBound_2_0= RULE_INT ) ) ) )
            // InternalGoLDSL.g:1011:2: ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_higherBound_2_0= RULE_INT ) ) )
            {
            // InternalGoLDSL.g:1011:2: ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_higherBound_2_0= RULE_INT ) ) )
            // InternalGoLDSL.g:1012:3: ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_higherBound_2_0= RULE_INT ) )
            {
            // InternalGoLDSL.g:1012:3: ( (lv_lowerBound_0_0= RULE_INT ) )
            // InternalGoLDSL.g:1013:4: (lv_lowerBound_0_0= RULE_INT )
            {
            // InternalGoLDSL.g:1013:4: (lv_lowerBound_0_0= RULE_INT )
            // InternalGoLDSL.g:1014:5: lv_lowerBound_0_0= RULE_INT
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
            		
            // InternalGoLDSL.g:1034:3: ( (lv_higherBound_2_0= RULE_INT ) )
            // InternalGoLDSL.g:1035:4: (lv_higherBound_2_0= RULE_INT )
            {
            // InternalGoLDSL.g:1035:4: (lv_higherBound_2_0= RULE_INT )
            // InternalGoLDSL.g:1036:5: lv_higherBound_2_0= RULE_INT
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
    // InternalGoLDSL.g:1056:1: entryRuleUnboundedRange returns [EObject current=null] : iv_ruleUnboundedRange= ruleUnboundedRange EOF ;
    public final EObject entryRuleUnboundedRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnboundedRange = null;


        try {
            // InternalGoLDSL.g:1056:55: (iv_ruleUnboundedRange= ruleUnboundedRange EOF )
            // InternalGoLDSL.g:1057:2: iv_ruleUnboundedRange= ruleUnboundedRange EOF
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
    // InternalGoLDSL.g:1063:1: ruleUnboundedRange returns [EObject current=null] : (this_LeftUnboundedRange_0= ruleLeftUnboundedRange | this_RightUnboundedRange_1= ruleRightUnboundedRange ) ;
    public final EObject ruleUnboundedRange() throws RecognitionException {
        EObject current = null;

        EObject this_LeftUnboundedRange_0 = null;

        EObject this_RightUnboundedRange_1 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:1069:2: ( (this_LeftUnboundedRange_0= ruleLeftUnboundedRange | this_RightUnboundedRange_1= ruleRightUnboundedRange ) )
            // InternalGoLDSL.g:1070:2: (this_LeftUnboundedRange_0= ruleLeftUnboundedRange | this_RightUnboundedRange_1= ruleRightUnboundedRange )
            {
            // InternalGoLDSL.g:1070:2: (this_LeftUnboundedRange_0= ruleLeftUnboundedRange | this_RightUnboundedRange_1= ruleRightUnboundedRange )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGoLDSL.g:1071:3: this_LeftUnboundedRange_0= ruleLeftUnboundedRange
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
                    // InternalGoLDSL.g:1080:3: this_RightUnboundedRange_1= ruleRightUnboundedRange
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
    // InternalGoLDSL.g:1092:1: entryRuleLeftUnboundedRange returns [EObject current=null] : iv_ruleLeftUnboundedRange= ruleLeftUnboundedRange EOF ;
    public final EObject entryRuleLeftUnboundedRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftUnboundedRange = null;


        try {
            // InternalGoLDSL.g:1092:59: (iv_ruleLeftUnboundedRange= ruleLeftUnboundedRange EOF )
            // InternalGoLDSL.g:1093:2: iv_ruleLeftUnboundedRange= ruleLeftUnboundedRange EOF
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
    // InternalGoLDSL.g:1099:1: ruleLeftUnboundedRange returns [EObject current=null] : (otherlv_0= '<' ( (lv_lowerBound_1_0= RULE_INT ) ) ) ;
    public final EObject ruleLeftUnboundedRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lowerBound_1_0=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:1105:2: ( (otherlv_0= '<' ( (lv_lowerBound_1_0= RULE_INT ) ) ) )
            // InternalGoLDSL.g:1106:2: (otherlv_0= '<' ( (lv_lowerBound_1_0= RULE_INT ) ) )
            {
            // InternalGoLDSL.g:1106:2: (otherlv_0= '<' ( (lv_lowerBound_1_0= RULE_INT ) ) )
            // InternalGoLDSL.g:1107:3: otherlv_0= '<' ( (lv_lowerBound_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLeftUnboundedRangeAccess().getLessThanSignKeyword_0());
            		
            // InternalGoLDSL.g:1111:3: ( (lv_lowerBound_1_0= RULE_INT ) )
            // InternalGoLDSL.g:1112:4: (lv_lowerBound_1_0= RULE_INT )
            {
            // InternalGoLDSL.g:1112:4: (lv_lowerBound_1_0= RULE_INT )
            // InternalGoLDSL.g:1113:5: lv_lowerBound_1_0= RULE_INT
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
    // InternalGoLDSL.g:1133:1: entryRuleRightUnboundedRange returns [EObject current=null] : iv_ruleRightUnboundedRange= ruleRightUnboundedRange EOF ;
    public final EObject entryRuleRightUnboundedRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightUnboundedRange = null;


        try {
            // InternalGoLDSL.g:1133:60: (iv_ruleRightUnboundedRange= ruleRightUnboundedRange EOF )
            // InternalGoLDSL.g:1134:2: iv_ruleRightUnboundedRange= ruleRightUnboundedRange EOF
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
    // InternalGoLDSL.g:1140:1: ruleRightUnboundedRange returns [EObject current=null] : (otherlv_0= '>' ( (lv_higherBound_1_0= RULE_INT ) ) ) ;
    public final EObject ruleRightUnboundedRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_higherBound_1_0=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:1146:2: ( (otherlv_0= '>' ( (lv_higherBound_1_0= RULE_INT ) ) ) )
            // InternalGoLDSL.g:1147:2: (otherlv_0= '>' ( (lv_higherBound_1_0= RULE_INT ) ) )
            {
            // InternalGoLDSL.g:1147:2: (otherlv_0= '>' ( (lv_higherBound_1_0= RULE_INT ) ) )
            // InternalGoLDSL.g:1148:3: otherlv_0= '>' ( (lv_higherBound_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRightUnboundedRangeAccess().getGreaterThanSignKeyword_0());
            		
            // InternalGoLDSL.g:1152:3: ( (lv_higherBound_1_0= RULE_INT ) )
            // InternalGoLDSL.g:1153:4: (lv_higherBound_1_0= RULE_INT )
            {
            // InternalGoLDSL.g:1153:4: (lv_higherBound_1_0= RULE_INT )
            // InternalGoLDSL.g:1154:5: lv_higherBound_1_0= RULE_INT
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
    // InternalGoLDSL.g:1174:1: entryRuleGrid returns [EObject current=null] : iv_ruleGrid= ruleGrid EOF ;
    public final EObject entryRuleGrid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrid = null;


        try {
            // InternalGoLDSL.g:1174:45: (iv_ruleGrid= ruleGrid EOF )
            // InternalGoLDSL.g:1175:2: iv_ruleGrid= ruleGrid EOF
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
    // InternalGoLDSL.g:1181:1: ruleGrid returns [EObject current=null] : (otherlv_0= 'Grid:' ( (lv_size_1_0= ruleSize ) )? ( (lv_parts_2_0= ruleGridPart ) )+ ) ;
    public final EObject ruleGrid() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_size_1_0 = null;

        Enumerator lv_parts_2_0 = null;



        	enterRule();

        try {
            // InternalGoLDSL.g:1187:2: ( (otherlv_0= 'Grid:' ( (lv_size_1_0= ruleSize ) )? ( (lv_parts_2_0= ruleGridPart ) )+ ) )
            // InternalGoLDSL.g:1188:2: (otherlv_0= 'Grid:' ( (lv_size_1_0= ruleSize ) )? ( (lv_parts_2_0= ruleGridPart ) )+ )
            {
            // InternalGoLDSL.g:1188:2: (otherlv_0= 'Grid:' ( (lv_size_1_0= ruleSize ) )? ( (lv_parts_2_0= ruleGridPart ) )+ )
            // InternalGoLDSL.g:1189:3: otherlv_0= 'Grid:' ( (lv_size_1_0= ruleSize ) )? ( (lv_parts_2_0= ruleGridPart ) )+
            {
            otherlv_0=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getGridAccess().getGridKeyword_0());
            		
            // InternalGoLDSL.g:1193:3: ( (lv_size_1_0= ruleSize ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGoLDSL.g:1194:4: (lv_size_1_0= ruleSize )
                    {
                    // InternalGoLDSL.g:1194:4: (lv_size_1_0= ruleSize )
                    // InternalGoLDSL.g:1195:5: lv_size_1_0= ruleSize
                    {

                    					newCompositeNode(grammarAccess.getGridAccess().getSizeSizeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_19);
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
                    break;

            }

            // InternalGoLDSL.g:1212:3: ( (lv_parts_2_0= ruleGridPart ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=31 && LA10_0<=32)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGoLDSL.g:1213:4: (lv_parts_2_0= ruleGridPart )
            	    {
            	    // InternalGoLDSL.g:1213:4: (lv_parts_2_0= ruleGridPart )
            	    // InternalGoLDSL.g:1214:5: lv_parts_2_0= ruleGridPart
            	    {

            	    					newCompositeNode(grammarAccess.getGridAccess().getPartsGridPartEnumRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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


    // $ANTLR start "entryRuleGridOffset"
    // InternalGoLDSL.g:1235:1: entryRuleGridOffset returns [EObject current=null] : iv_ruleGridOffset= ruleGridOffset EOF ;
    public final EObject entryRuleGridOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGridOffset = null;


        try {
            // InternalGoLDSL.g:1235:51: (iv_ruleGridOffset= ruleGridOffset EOF )
            // InternalGoLDSL.g:1236:2: iv_ruleGridOffset= ruleGridOffset EOF
            {
             newCompositeNode(grammarAccess.getGridOffsetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGridOffset=ruleGridOffset();

            state._fsp--;

             current =iv_ruleGridOffset; 
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
    // $ANTLR end "entryRuleGridOffset"


    // $ANTLR start "ruleGridOffset"
    // InternalGoLDSL.g:1242:1: ruleGridOffset returns [EObject current=null] : (otherlv_0= 'offset' ( (lv_offset_1_0= RULE_INT ) ) ) ;
    public final EObject ruleGridOffset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_offset_1_0=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:1248:2: ( (otherlv_0= 'offset' ( (lv_offset_1_0= RULE_INT ) ) ) )
            // InternalGoLDSL.g:1249:2: (otherlv_0= 'offset' ( (lv_offset_1_0= RULE_INT ) ) )
            {
            // InternalGoLDSL.g:1249:2: (otherlv_0= 'offset' ( (lv_offset_1_0= RULE_INT ) ) )
            // InternalGoLDSL.g:1250:3: otherlv_0= 'offset' ( (lv_offset_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getGridOffsetAccess().getOffsetKeyword_0());
            		
            // InternalGoLDSL.g:1254:3: ( (lv_offset_1_0= RULE_INT ) )
            // InternalGoLDSL.g:1255:4: (lv_offset_1_0= RULE_INT )
            {
            // InternalGoLDSL.g:1255:4: (lv_offset_1_0= RULE_INT )
            // InternalGoLDSL.g:1256:5: lv_offset_1_0= RULE_INT
            {
            lv_offset_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_offset_1_0, grammarAccess.getGridOffsetAccess().getOffsetINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGridOffsetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"offset",
            						lv_offset_1_0,
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
    // $ANTLR end "ruleGridOffset"


    // $ANTLR start "entryRuleSize"
    // InternalGoLDSL.g:1276:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalGoLDSL.g:1276:45: (iv_ruleSize= ruleSize EOF )
            // InternalGoLDSL.g:1277:2: iv_ruleSize= ruleSize EOF
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
    // InternalGoLDSL.g:1283:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_height_2_0= RULE_INT ) ) ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_width_1_0=null;
        Token lv_height_2_0=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:1289:2: ( (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_height_2_0= RULE_INT ) ) ) )
            // InternalGoLDSL.g:1290:2: (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_height_2_0= RULE_INT ) ) )
            {
            // InternalGoLDSL.g:1290:2: (otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_height_2_0= RULE_INT ) ) )
            // InternalGoLDSL.g:1291:3: otherlv_0= 'size' ( (lv_width_1_0= RULE_INT ) ) ( (lv_height_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
            		
            // InternalGoLDSL.g:1295:3: ( (lv_width_1_0= RULE_INT ) )
            // InternalGoLDSL.g:1296:4: (lv_width_1_0= RULE_INT )
            {
            // InternalGoLDSL.g:1296:4: (lv_width_1_0= RULE_INT )
            // InternalGoLDSL.g:1297:5: lv_width_1_0= RULE_INT
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

            // InternalGoLDSL.g:1313:3: ( (lv_height_2_0= RULE_INT ) )
            // InternalGoLDSL.g:1314:4: (lv_height_2_0= RULE_INT )
            {
            // InternalGoLDSL.g:1314:4: (lv_height_2_0= RULE_INT )
            // InternalGoLDSL.g:1315:5: lv_height_2_0= RULE_INT
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
    // InternalGoLDSL.g:1335:1: ruleBoolOperator returns [Enumerator current=null] : ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) ;
    public final Enumerator ruleBoolOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:1341:2: ( ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) )
            // InternalGoLDSL.g:1342:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            {
            // InternalGoLDSL.g:1342:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            else if ( (LA11_0==30) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGoLDSL.g:1343:3: (enumLiteral_0= '&' )
                    {
                    // InternalGoLDSL.g:1343:3: (enumLiteral_0= '&' )
                    // InternalGoLDSL.g:1344:4: enumLiteral_0= '&'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:1351:3: (enumLiteral_1= '|' )
                    {
                    // InternalGoLDSL.g:1351:3: (enumLiteral_1= '|' )
                    // InternalGoLDSL.g:1352:4: enumLiteral_1= '|'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

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
    // InternalGoLDSL.g:1362:1: ruleGridPart returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleGridPart() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGoLDSL.g:1368:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalGoLDSL.g:1369:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalGoLDSL.g:1369:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            else if ( (LA12_0==32) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGoLDSL.g:1370:3: (enumLiteral_0= '+' )
                    {
                    // InternalGoLDSL.g:1370:3: (enumLiteral_0= '+' )
                    // InternalGoLDSL.g:1371:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getGridPartAccess().getALIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGridPartAccess().getALIVEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:1378:3: (enumLiteral_1= '-' )
                    {
                    // InternalGoLDSL.g:1378:3: (enumLiteral_1= '-' )
                    // InternalGoLDSL.g:1379:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004031000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004031002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000C031000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003400020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000190000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000190000002L});

}