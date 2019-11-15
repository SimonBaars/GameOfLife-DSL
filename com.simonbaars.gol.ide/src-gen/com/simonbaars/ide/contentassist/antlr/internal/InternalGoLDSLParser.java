package com.simonbaars.ide.contentassist.antlr.internal;

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
import com.simonbaars.services.GoLDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoLDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'&'", "'|'", "'+'", "'-'", "'Board:'", "'Shape'", "':'", "'('", "')'", "'Cells:'", "'Cell:'", "','", "'Rule:'", "'Create'", "'If'", "'..'", "'Grid:'", "'offset'", "'size'", "'Alive'", "'Dead'"
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

    	public void setGrammarAccess(GoLDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDSL"
    // InternalGoLDSL.g:53:1: entryRuleDSL : ruleDSL EOF ;
    public final void entryRuleDSL() throws RecognitionException {
        try {
            // InternalGoLDSL.g:54:1: ( ruleDSL EOF )
            // InternalGoLDSL.g:55:1: ruleDSL EOF
            {
             before(grammarAccess.getDSLRule()); 
            pushFollow(FOLLOW_1);
            ruleDSL();

            state._fsp--;

             after(grammarAccess.getDSLRule()); 
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
    // $ANTLR end "entryRuleDSL"


    // $ANTLR start "ruleDSL"
    // InternalGoLDSL.g:62:1: ruleDSL : ( ( rule__DSL__Group__0 ) ) ;
    public final void ruleDSL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:66:2: ( ( ( rule__DSL__Group__0 ) ) )
            // InternalGoLDSL.g:67:2: ( ( rule__DSL__Group__0 ) )
            {
            // InternalGoLDSL.g:67:2: ( ( rule__DSL__Group__0 ) )
            // InternalGoLDSL.g:68:3: ( rule__DSL__Group__0 )
            {
             before(grammarAccess.getDSLAccess().getGroup()); 
            // InternalGoLDSL.g:69:3: ( rule__DSL__Group__0 )
            // InternalGoLDSL.g:69:4: rule__DSL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSL"


    // $ANTLR start "entryRuleBoard"
    // InternalGoLDSL.g:78:1: entryRuleBoard : ruleBoard EOF ;
    public final void entryRuleBoard() throws RecognitionException {
        try {
            // InternalGoLDSL.g:79:1: ( ruleBoard EOF )
            // InternalGoLDSL.g:80:1: ruleBoard EOF
            {
             before(grammarAccess.getBoardRule()); 
            pushFollow(FOLLOW_1);
            ruleBoard();

            state._fsp--;

             after(grammarAccess.getBoardRule()); 
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
    // $ANTLR end "entryRuleBoard"


    // $ANTLR start "ruleBoard"
    // InternalGoLDSL.g:87:1: ruleBoard : ( ( rule__Board__Group__0 ) ) ;
    public final void ruleBoard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:91:2: ( ( ( rule__Board__Group__0 ) ) )
            // InternalGoLDSL.g:92:2: ( ( rule__Board__Group__0 ) )
            {
            // InternalGoLDSL.g:92:2: ( ( rule__Board__Group__0 ) )
            // InternalGoLDSL.g:93:3: ( rule__Board__Group__0 )
            {
             before(grammarAccess.getBoardAccess().getGroup()); 
            // InternalGoLDSL.g:94:3: ( rule__Board__Group__0 )
            // InternalGoLDSL.g:94:4: rule__Board__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRuleObjects"
    // InternalGoLDSL.g:103:1: entryRuleObjects : ruleObjects EOF ;
    public final void entryRuleObjects() throws RecognitionException {
        try {
            // InternalGoLDSL.g:104:1: ( ruleObjects EOF )
            // InternalGoLDSL.g:105:1: ruleObjects EOF
            {
             before(grammarAccess.getObjectsRule()); 
            pushFollow(FOLLOW_1);
            ruleObjects();

            state._fsp--;

             after(grammarAccess.getObjectsRule()); 
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
    // $ANTLR end "entryRuleObjects"


    // $ANTLR start "ruleObjects"
    // InternalGoLDSL.g:112:1: ruleObjects : ( ( ( rule__Objects__Alternatives ) ) ( ( rule__Objects__Alternatives )* ) ) ;
    public final void ruleObjects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:116:2: ( ( ( ( rule__Objects__Alternatives ) ) ( ( rule__Objects__Alternatives )* ) ) )
            // InternalGoLDSL.g:117:2: ( ( ( rule__Objects__Alternatives ) ) ( ( rule__Objects__Alternatives )* ) )
            {
            // InternalGoLDSL.g:117:2: ( ( ( rule__Objects__Alternatives ) ) ( ( rule__Objects__Alternatives )* ) )
            // InternalGoLDSL.g:118:3: ( ( rule__Objects__Alternatives ) ) ( ( rule__Objects__Alternatives )* )
            {
            // InternalGoLDSL.g:118:3: ( ( rule__Objects__Alternatives ) )
            // InternalGoLDSL.g:119:4: ( rule__Objects__Alternatives )
            {
             before(grammarAccess.getObjectsAccess().getAlternatives()); 
            // InternalGoLDSL.g:120:4: ( rule__Objects__Alternatives )
            // InternalGoLDSL.g:120:5: rule__Objects__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__Objects__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getObjectsAccess().getAlternatives()); 

            }

            // InternalGoLDSL.g:123:3: ( ( rule__Objects__Alternatives )* )
            // InternalGoLDSL.g:124:4: ( rule__Objects__Alternatives )*
            {
             before(grammarAccess.getObjectsAccess().getAlternatives()); 
            // InternalGoLDSL.g:125:4: ( rule__Objects__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==RULE_ID) ) {
                        int LA1_4 = input.LA(3);

                        if ( (LA1_4==17) ) {
                            int LA1_5 = input.LA(4);

                            if ( (LA1_5==RULE_INT) ) {
                                alt1=1;
                            }


                        }


                    }


                }
                else if ( ((LA1_0>=20 && LA1_0<=21)||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGoLDSL.g:125:5: rule__Objects__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Objects__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getObjectsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleObjects"


    // $ANTLR start "entryRuleShapeDef"
    // InternalGoLDSL.g:135:1: entryRuleShapeDef : ruleShapeDef EOF ;
    public final void entryRuleShapeDef() throws RecognitionException {
        try {
            // InternalGoLDSL.g:136:1: ( ruleShapeDef EOF )
            // InternalGoLDSL.g:137:1: ruleShapeDef EOF
            {
             before(grammarAccess.getShapeDefRule()); 
            pushFollow(FOLLOW_1);
            ruleShapeDef();

            state._fsp--;

             after(grammarAccess.getShapeDefRule()); 
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
    // $ANTLR end "entryRuleShapeDef"


    // $ANTLR start "ruleShapeDef"
    // InternalGoLDSL.g:144:1: ruleShapeDef : ( ( rule__ShapeDef__Group__0 ) ) ;
    public final void ruleShapeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:148:2: ( ( ( rule__ShapeDef__Group__0 ) ) )
            // InternalGoLDSL.g:149:2: ( ( rule__ShapeDef__Group__0 ) )
            {
            // InternalGoLDSL.g:149:2: ( ( rule__ShapeDef__Group__0 ) )
            // InternalGoLDSL.g:150:3: ( rule__ShapeDef__Group__0 )
            {
             before(grammarAccess.getShapeDefAccess().getGroup()); 
            // InternalGoLDSL.g:151:3: ( rule__ShapeDef__Group__0 )
            // InternalGoLDSL.g:151:4: rule__ShapeDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShapeDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShapeDef"


    // $ANTLR start "entryRuleCellPairs"
    // InternalGoLDSL.g:160:1: entryRuleCellPairs : ruleCellPairs EOF ;
    public final void entryRuleCellPairs() throws RecognitionException {
        try {
            // InternalGoLDSL.g:161:1: ( ruleCellPairs EOF )
            // InternalGoLDSL.g:162:1: ruleCellPairs EOF
            {
             before(grammarAccess.getCellPairsRule()); 
            pushFollow(FOLLOW_1);
            ruleCellPairs();

            state._fsp--;

             after(grammarAccess.getCellPairsRule()); 
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
    // $ANTLR end "entryRuleCellPairs"


    // $ANTLR start "ruleCellPairs"
    // InternalGoLDSL.g:169:1: ruleCellPairs : ( ( ( rule__CellPairs__Group__0 ) ) ( ( rule__CellPairs__Group__0 )* ) ) ;
    public final void ruleCellPairs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:173:2: ( ( ( ( rule__CellPairs__Group__0 ) ) ( ( rule__CellPairs__Group__0 )* ) ) )
            // InternalGoLDSL.g:174:2: ( ( ( rule__CellPairs__Group__0 ) ) ( ( rule__CellPairs__Group__0 )* ) )
            {
            // InternalGoLDSL.g:174:2: ( ( ( rule__CellPairs__Group__0 ) ) ( ( rule__CellPairs__Group__0 )* ) )
            // InternalGoLDSL.g:175:3: ( ( rule__CellPairs__Group__0 ) ) ( ( rule__CellPairs__Group__0 )* )
            {
            // InternalGoLDSL.g:175:3: ( ( rule__CellPairs__Group__0 ) )
            // InternalGoLDSL.g:176:4: ( rule__CellPairs__Group__0 )
            {
             before(grammarAccess.getCellPairsAccess().getGroup()); 
            // InternalGoLDSL.g:177:4: ( rule__CellPairs__Group__0 )
            // InternalGoLDSL.g:177:5: rule__CellPairs__Group__0
            {
            pushFollow(FOLLOW_4);
            rule__CellPairs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellPairsAccess().getGroup()); 

            }

            // InternalGoLDSL.g:180:3: ( ( rule__CellPairs__Group__0 )* )
            // InternalGoLDSL.g:181:4: ( rule__CellPairs__Group__0 )*
            {
             before(grammarAccess.getCellPairsAccess().getGroup()); 
            // InternalGoLDSL.g:182:4: ( rule__CellPairs__Group__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGoLDSL.g:182:5: rule__CellPairs__Group__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__CellPairs__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getCellPairsAccess().getGroup()); 

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
    // $ANTLR end "ruleCellPairs"


    // $ANTLR start "entryRuleCells"
    // InternalGoLDSL.g:192:1: entryRuleCells : ruleCells EOF ;
    public final void entryRuleCells() throws RecognitionException {
        try {
            // InternalGoLDSL.g:193:1: ( ruleCells EOF )
            // InternalGoLDSL.g:194:1: ruleCells EOF
            {
             before(grammarAccess.getCellsRule()); 
            pushFollow(FOLLOW_1);
            ruleCells();

            state._fsp--;

             after(grammarAccess.getCellsRule()); 
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
    // $ANTLR end "entryRuleCells"


    // $ANTLR start "ruleCells"
    // InternalGoLDSL.g:201:1: ruleCells : ( ( rule__Cells__Group__0 ) ) ;
    public final void ruleCells() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:205:2: ( ( ( rule__Cells__Group__0 ) ) )
            // InternalGoLDSL.g:206:2: ( ( rule__Cells__Group__0 ) )
            {
            // InternalGoLDSL.g:206:2: ( ( rule__Cells__Group__0 ) )
            // InternalGoLDSL.g:207:3: ( rule__Cells__Group__0 )
            {
             before(grammarAccess.getCellsAccess().getGroup()); 
            // InternalGoLDSL.g:208:3: ( rule__Cells__Group__0 )
            // InternalGoLDSL.g:208:4: rule__Cells__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cells__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCells"


    // $ANTLR start "entryRuleCellDef"
    // InternalGoLDSL.g:217:1: entryRuleCellDef : ruleCellDef EOF ;
    public final void entryRuleCellDef() throws RecognitionException {
        try {
            // InternalGoLDSL.g:218:1: ( ruleCellDef EOF )
            // InternalGoLDSL.g:219:1: ruleCellDef EOF
            {
             before(grammarAccess.getCellDefRule()); 
            pushFollow(FOLLOW_1);
            ruleCellDef();

            state._fsp--;

             after(grammarAccess.getCellDefRule()); 
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
    // $ANTLR end "entryRuleCellDef"


    // $ANTLR start "ruleCellDef"
    // InternalGoLDSL.g:226:1: ruleCellDef : ( ( rule__CellDef__Group__0 ) ) ;
    public final void ruleCellDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:230:2: ( ( ( rule__CellDef__Group__0 ) ) )
            // InternalGoLDSL.g:231:2: ( ( rule__CellDef__Group__0 ) )
            {
            // InternalGoLDSL.g:231:2: ( ( rule__CellDef__Group__0 ) )
            // InternalGoLDSL.g:232:3: ( rule__CellDef__Group__0 )
            {
             before(grammarAccess.getCellDefAccess().getGroup()); 
            // InternalGoLDSL.g:233:3: ( rule__CellDef__Group__0 )
            // InternalGoLDSL.g:233:4: rule__CellDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CellDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellDef"


    // $ANTLR start "entryRuleShapeRef"
    // InternalGoLDSL.g:242:1: entryRuleShapeRef : ruleShapeRef EOF ;
    public final void entryRuleShapeRef() throws RecognitionException {
        try {
            // InternalGoLDSL.g:243:1: ( ruleShapeRef EOF )
            // InternalGoLDSL.g:244:1: ruleShapeRef EOF
            {
             before(grammarAccess.getShapeRefRule()); 
            pushFollow(FOLLOW_1);
            ruleShapeRef();

            state._fsp--;

             after(grammarAccess.getShapeRefRule()); 
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
    // $ANTLR end "entryRuleShapeRef"


    // $ANTLR start "ruleShapeRef"
    // InternalGoLDSL.g:251:1: ruleShapeRef : ( ( rule__ShapeRef__Group__0 ) ) ;
    public final void ruleShapeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:255:2: ( ( ( rule__ShapeRef__Group__0 ) ) )
            // InternalGoLDSL.g:256:2: ( ( rule__ShapeRef__Group__0 ) )
            {
            // InternalGoLDSL.g:256:2: ( ( rule__ShapeRef__Group__0 ) )
            // InternalGoLDSL.g:257:3: ( rule__ShapeRef__Group__0 )
            {
             before(grammarAccess.getShapeRefAccess().getGroup()); 
            // InternalGoLDSL.g:258:3: ( rule__ShapeRef__Group__0 )
            // InternalGoLDSL.g:258:4: rule__ShapeRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShapeRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShapeRef"


    // $ANTLR start "entryRuleCell"
    // InternalGoLDSL.g:267:1: entryRuleCell : ruleCell EOF ;
    public final void entryRuleCell() throws RecognitionException {
        try {
            // InternalGoLDSL.g:268:1: ( ruleCell EOF )
            // InternalGoLDSL.g:269:1: ruleCell EOF
            {
             before(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getCellRule()); 
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
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalGoLDSL.g:276:1: ruleCell : ( ( rule__Cell__Group__0 ) ) ;
    public final void ruleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:280:2: ( ( ( rule__Cell__Group__0 ) ) )
            // InternalGoLDSL.g:281:2: ( ( rule__Cell__Group__0 ) )
            {
            // InternalGoLDSL.g:281:2: ( ( rule__Cell__Group__0 ) )
            // InternalGoLDSL.g:282:3: ( rule__Cell__Group__0 )
            {
             before(grammarAccess.getCellAccess().getGroup()); 
            // InternalGoLDSL.g:283:3: ( rule__Cell__Group__0 )
            // InternalGoLDSL.g:283:4: rule__Cell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCell"


    // $ANTLR start "entryRuleRule"
    // InternalGoLDSL.g:292:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalGoLDSL.g:293:1: ( ruleRule EOF )
            // InternalGoLDSL.g:294:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalGoLDSL.g:301:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:305:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalGoLDSL.g:306:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalGoLDSL.g:306:2: ( ( rule__Rule__Group__0 ) )
            // InternalGoLDSL.g:307:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalGoLDSL.g:308:3: ( rule__Rule__Group__0 )
            // InternalGoLDSL.g:308:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleAction"
    // InternalGoLDSL.g:317:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalGoLDSL.g:318:1: ( ruleAction EOF )
            // InternalGoLDSL.g:319:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalGoLDSL.g:326:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:330:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalGoLDSL.g:331:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalGoLDSL.g:331:2: ( ( rule__Action__Group__0 ) )
            // InternalGoLDSL.g:332:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalGoLDSL.g:333:3: ( rule__Action__Group__0 )
            // InternalGoLDSL.g:333:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCondition"
    // InternalGoLDSL.g:342:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalGoLDSL.g:343:1: ( ruleCondition EOF )
            // InternalGoLDSL.g:344:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGoLDSL.g:351:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:355:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalGoLDSL.g:356:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalGoLDSL.g:356:2: ( ( rule__Condition__Group__0 ) )
            // InternalGoLDSL.g:357:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalGoLDSL.g:358:3: ( rule__Condition__Group__0 )
            // InternalGoLDSL.g:358:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConditionRule"
    // InternalGoLDSL.g:367:1: entryRuleConditionRule : ruleConditionRule EOF ;
    public final void entryRuleConditionRule() throws RecognitionException {
        try {
            // InternalGoLDSL.g:368:1: ( ruleConditionRule EOF )
            // InternalGoLDSL.g:369:1: ruleConditionRule EOF
            {
             before(grammarAccess.getConditionRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionRule();

            state._fsp--;

             after(grammarAccess.getConditionRuleRule()); 
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
    // $ANTLR end "entryRuleConditionRule"


    // $ANTLR start "ruleConditionRule"
    // InternalGoLDSL.g:376:1: ruleConditionRule : ( ( rule__ConditionRule__Alternatives ) ) ;
    public final void ruleConditionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:380:2: ( ( ( rule__ConditionRule__Alternatives ) ) )
            // InternalGoLDSL.g:381:2: ( ( rule__ConditionRule__Alternatives ) )
            {
            // InternalGoLDSL.g:381:2: ( ( rule__ConditionRule__Alternatives ) )
            // InternalGoLDSL.g:382:3: ( rule__ConditionRule__Alternatives )
            {
             before(grammarAccess.getConditionRuleAccess().getAlternatives()); 
            // InternalGoLDSL.g:383:3: ( rule__ConditionRule__Alternatives )
            // InternalGoLDSL.g:383:4: rule__ConditionRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConditionRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionRule"


    // $ANTLR start "entryRuleConditionRules"
    // InternalGoLDSL.g:392:1: entryRuleConditionRules : ruleConditionRules EOF ;
    public final void entryRuleConditionRules() throws RecognitionException {
        try {
            // InternalGoLDSL.g:393:1: ( ruleConditionRules EOF )
            // InternalGoLDSL.g:394:1: ruleConditionRules EOF
            {
             before(grammarAccess.getConditionRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionRules();

            state._fsp--;

             after(grammarAccess.getConditionRulesRule()); 
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
    // $ANTLR end "entryRuleConditionRules"


    // $ANTLR start "ruleConditionRules"
    // InternalGoLDSL.g:401:1: ruleConditionRules : ( ( rule__ConditionRules__Group__0 ) ) ;
    public final void ruleConditionRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:405:2: ( ( ( rule__ConditionRules__Group__0 ) ) )
            // InternalGoLDSL.g:406:2: ( ( rule__ConditionRules__Group__0 ) )
            {
            // InternalGoLDSL.g:406:2: ( ( rule__ConditionRules__Group__0 ) )
            // InternalGoLDSL.g:407:3: ( rule__ConditionRules__Group__0 )
            {
             before(grammarAccess.getConditionRulesAccess().getGroup()); 
            // InternalGoLDSL.g:408:3: ( rule__ConditionRules__Group__0 )
            // InternalGoLDSL.g:408:4: rule__ConditionRules__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionRules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionRulesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionRules"


    // $ANTLR start "entryRuleRange"
    // InternalGoLDSL.g:417:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalGoLDSL.g:418:1: ( ruleRange EOF )
            // InternalGoLDSL.g:419:1: ruleRange EOF
            {
             before(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getRangeRule()); 
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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalGoLDSL.g:426:1: ruleRange : ( ( rule__Range__Alternatives ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:430:2: ( ( ( rule__Range__Alternatives ) ) )
            // InternalGoLDSL.g:431:2: ( ( rule__Range__Alternatives ) )
            {
            // InternalGoLDSL.g:431:2: ( ( rule__Range__Alternatives ) )
            // InternalGoLDSL.g:432:3: ( rule__Range__Alternatives )
            {
             before(grammarAccess.getRangeAccess().getAlternatives()); 
            // InternalGoLDSL.g:433:3: ( rule__Range__Alternatives )
            // InternalGoLDSL.g:433:4: rule__Range__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Range__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleBoundedRange"
    // InternalGoLDSL.g:442:1: entryRuleBoundedRange : ruleBoundedRange EOF ;
    public final void entryRuleBoundedRange() throws RecognitionException {
        try {
            // InternalGoLDSL.g:443:1: ( ruleBoundedRange EOF )
            // InternalGoLDSL.g:444:1: ruleBoundedRange EOF
            {
             before(grammarAccess.getBoundedRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleBoundedRange();

            state._fsp--;

             after(grammarAccess.getBoundedRangeRule()); 
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
    // $ANTLR end "entryRuleBoundedRange"


    // $ANTLR start "ruleBoundedRange"
    // InternalGoLDSL.g:451:1: ruleBoundedRange : ( ( rule__BoundedRange__Group__0 ) ) ;
    public final void ruleBoundedRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:455:2: ( ( ( rule__BoundedRange__Group__0 ) ) )
            // InternalGoLDSL.g:456:2: ( ( rule__BoundedRange__Group__0 ) )
            {
            // InternalGoLDSL.g:456:2: ( ( rule__BoundedRange__Group__0 ) )
            // InternalGoLDSL.g:457:3: ( rule__BoundedRange__Group__0 )
            {
             before(grammarAccess.getBoundedRangeAccess().getGroup()); 
            // InternalGoLDSL.g:458:3: ( rule__BoundedRange__Group__0 )
            // InternalGoLDSL.g:458:4: rule__BoundedRange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoundedRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoundedRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoundedRange"


    // $ANTLR start "entryRuleLeftUnboundedRange"
    // InternalGoLDSL.g:467:1: entryRuleLeftUnboundedRange : ruleLeftUnboundedRange EOF ;
    public final void entryRuleLeftUnboundedRange() throws RecognitionException {
        try {
            // InternalGoLDSL.g:468:1: ( ruleLeftUnboundedRange EOF )
            // InternalGoLDSL.g:469:1: ruleLeftUnboundedRange EOF
            {
             before(grammarAccess.getLeftUnboundedRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleLeftUnboundedRange();

            state._fsp--;

             after(grammarAccess.getLeftUnboundedRangeRule()); 
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
    // $ANTLR end "entryRuleLeftUnboundedRange"


    // $ANTLR start "ruleLeftUnboundedRange"
    // InternalGoLDSL.g:476:1: ruleLeftUnboundedRange : ( ( rule__LeftUnboundedRange__Group__0 ) ) ;
    public final void ruleLeftUnboundedRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:480:2: ( ( ( rule__LeftUnboundedRange__Group__0 ) ) )
            // InternalGoLDSL.g:481:2: ( ( rule__LeftUnboundedRange__Group__0 ) )
            {
            // InternalGoLDSL.g:481:2: ( ( rule__LeftUnboundedRange__Group__0 ) )
            // InternalGoLDSL.g:482:3: ( rule__LeftUnboundedRange__Group__0 )
            {
             before(grammarAccess.getLeftUnboundedRangeAccess().getGroup()); 
            // InternalGoLDSL.g:483:3: ( rule__LeftUnboundedRange__Group__0 )
            // InternalGoLDSL.g:483:4: rule__LeftUnboundedRange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LeftUnboundedRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeftUnboundedRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeftUnboundedRange"


    // $ANTLR start "entryRuleRightUnboundedRange"
    // InternalGoLDSL.g:492:1: entryRuleRightUnboundedRange : ruleRightUnboundedRange EOF ;
    public final void entryRuleRightUnboundedRange() throws RecognitionException {
        try {
            // InternalGoLDSL.g:493:1: ( ruleRightUnboundedRange EOF )
            // InternalGoLDSL.g:494:1: ruleRightUnboundedRange EOF
            {
             before(grammarAccess.getRightUnboundedRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleRightUnboundedRange();

            state._fsp--;

             after(grammarAccess.getRightUnboundedRangeRule()); 
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
    // $ANTLR end "entryRuleRightUnboundedRange"


    // $ANTLR start "ruleRightUnboundedRange"
    // InternalGoLDSL.g:501:1: ruleRightUnboundedRange : ( ( rule__RightUnboundedRange__Group__0 ) ) ;
    public final void ruleRightUnboundedRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:505:2: ( ( ( rule__RightUnboundedRange__Group__0 ) ) )
            // InternalGoLDSL.g:506:2: ( ( rule__RightUnboundedRange__Group__0 ) )
            {
            // InternalGoLDSL.g:506:2: ( ( rule__RightUnboundedRange__Group__0 ) )
            // InternalGoLDSL.g:507:3: ( rule__RightUnboundedRange__Group__0 )
            {
             before(grammarAccess.getRightUnboundedRangeAccess().getGroup()); 
            // InternalGoLDSL.g:508:3: ( rule__RightUnboundedRange__Group__0 )
            // InternalGoLDSL.g:508:4: rule__RightUnboundedRange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RightUnboundedRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightUnboundedRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRightUnboundedRange"


    // $ANTLR start "entryRuleGrid"
    // InternalGoLDSL.g:517:1: entryRuleGrid : ruleGrid EOF ;
    public final void entryRuleGrid() throws RecognitionException {
        try {
            // InternalGoLDSL.g:518:1: ( ruleGrid EOF )
            // InternalGoLDSL.g:519:1: ruleGrid EOF
            {
             before(grammarAccess.getGridRule()); 
            pushFollow(FOLLOW_1);
            ruleGrid();

            state._fsp--;

             after(grammarAccess.getGridRule()); 
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
    // $ANTLR end "entryRuleGrid"


    // $ANTLR start "ruleGrid"
    // InternalGoLDSL.g:526:1: ruleGrid : ( ( rule__Grid__Group__0 ) ) ;
    public final void ruleGrid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:530:2: ( ( ( rule__Grid__Group__0 ) ) )
            // InternalGoLDSL.g:531:2: ( ( rule__Grid__Group__0 ) )
            {
            // InternalGoLDSL.g:531:2: ( ( rule__Grid__Group__0 ) )
            // InternalGoLDSL.g:532:3: ( rule__Grid__Group__0 )
            {
             before(grammarAccess.getGridAccess().getGroup()); 
            // InternalGoLDSL.g:533:3: ( rule__Grid__Group__0 )
            // InternalGoLDSL.g:533:4: rule__Grid__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrid"


    // $ANTLR start "entryRuleOffset"
    // InternalGoLDSL.g:542:1: entryRuleOffset : ruleOffset EOF ;
    public final void entryRuleOffset() throws RecognitionException {
        try {
            // InternalGoLDSL.g:543:1: ( ruleOffset EOF )
            // InternalGoLDSL.g:544:1: ruleOffset EOF
            {
             before(grammarAccess.getOffsetRule()); 
            pushFollow(FOLLOW_1);
            ruleOffset();

            state._fsp--;

             after(grammarAccess.getOffsetRule()); 
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
    // $ANTLR end "entryRuleOffset"


    // $ANTLR start "ruleOffset"
    // InternalGoLDSL.g:551:1: ruleOffset : ( ( rule__Offset__Group__0 ) ) ;
    public final void ruleOffset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:555:2: ( ( ( rule__Offset__Group__0 ) ) )
            // InternalGoLDSL.g:556:2: ( ( rule__Offset__Group__0 ) )
            {
            // InternalGoLDSL.g:556:2: ( ( rule__Offset__Group__0 ) )
            // InternalGoLDSL.g:557:3: ( rule__Offset__Group__0 )
            {
             before(grammarAccess.getOffsetAccess().getGroup()); 
            // InternalGoLDSL.g:558:3: ( rule__Offset__Group__0 )
            // InternalGoLDSL.g:558:4: rule__Offset__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Offset__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOffsetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOffset"


    // $ANTLR start "entryRuleSize"
    // InternalGoLDSL.g:567:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // InternalGoLDSL.g:568:1: ( ruleSize EOF )
            // InternalGoLDSL.g:569:1: ruleSize EOF
            {
             before(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getSizeRule()); 
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
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // InternalGoLDSL.g:576:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:580:2: ( ( ( rule__Size__Group__0 ) ) )
            // InternalGoLDSL.g:581:2: ( ( rule__Size__Group__0 ) )
            {
            // InternalGoLDSL.g:581:2: ( ( rule__Size__Group__0 ) )
            // InternalGoLDSL.g:582:3: ( rule__Size__Group__0 )
            {
             before(grammarAccess.getSizeAccess().getGroup()); 
            // InternalGoLDSL.g:583:3: ( rule__Size__Group__0 )
            // InternalGoLDSL.g:583:4: rule__Size__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSize"


    // $ANTLR start "ruleBoolOperator"
    // InternalGoLDSL.g:592:1: ruleBoolOperator : ( ( rule__BoolOperator__Alternatives ) ) ;
    public final void ruleBoolOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:596:1: ( ( ( rule__BoolOperator__Alternatives ) ) )
            // InternalGoLDSL.g:597:2: ( ( rule__BoolOperator__Alternatives ) )
            {
            // InternalGoLDSL.g:597:2: ( ( rule__BoolOperator__Alternatives ) )
            // InternalGoLDSL.g:598:3: ( rule__BoolOperator__Alternatives )
            {
             before(grammarAccess.getBoolOperatorAccess().getAlternatives()); 
            // InternalGoLDSL.g:599:3: ( rule__BoolOperator__Alternatives )
            // InternalGoLDSL.g:599:4: rule__BoolOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolOperator"


    // $ANTLR start "ruleGridPart"
    // InternalGoLDSL.g:608:1: ruleGridPart : ( ( rule__GridPart__Alternatives ) ) ;
    public final void ruleGridPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:612:1: ( ( ( rule__GridPart__Alternatives ) ) )
            // InternalGoLDSL.g:613:2: ( ( rule__GridPart__Alternatives ) )
            {
            // InternalGoLDSL.g:613:2: ( ( rule__GridPart__Alternatives ) )
            // InternalGoLDSL.g:614:3: ( rule__GridPart__Alternatives )
            {
             before(grammarAccess.getGridPartAccess().getAlternatives()); 
            // InternalGoLDSL.g:615:3: ( rule__GridPart__Alternatives )
            // InternalGoLDSL.g:615:4: rule__GridPart__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GridPart__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGridPartAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGridPart"


    // $ANTLR start "rule__DSL__Alternatives_1"
    // InternalGoLDSL.g:623:1: rule__DSL__Alternatives_1 : ( ( ( rule__DSL__RulesAssignment_1_0 ) ) | ( ( rule__DSL__ShapesAssignment_1_1 ) ) );
    public final void rule__DSL__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:627:1: ( ( ( rule__DSL__RulesAssignment_1_0 ) ) | ( ( rule__DSL__ShapesAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGoLDSL.g:628:2: ( ( rule__DSL__RulesAssignment_1_0 ) )
                    {
                    // InternalGoLDSL.g:628:2: ( ( rule__DSL__RulesAssignment_1_0 ) )
                    // InternalGoLDSL.g:629:3: ( rule__DSL__RulesAssignment_1_0 )
                    {
                     before(grammarAccess.getDSLAccess().getRulesAssignment_1_0()); 
                    // InternalGoLDSL.g:630:3: ( rule__DSL__RulesAssignment_1_0 )
                    // InternalGoLDSL.g:630:4: rule__DSL__RulesAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DSL__RulesAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDSLAccess().getRulesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:634:2: ( ( rule__DSL__ShapesAssignment_1_1 ) )
                    {
                    // InternalGoLDSL.g:634:2: ( ( rule__DSL__ShapesAssignment_1_1 ) )
                    // InternalGoLDSL.g:635:3: ( rule__DSL__ShapesAssignment_1_1 )
                    {
                     before(grammarAccess.getDSLAccess().getShapesAssignment_1_1()); 
                    // InternalGoLDSL.g:636:3: ( rule__DSL__ShapesAssignment_1_1 )
                    // InternalGoLDSL.g:636:4: rule__DSL__ShapesAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DSL__ShapesAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDSLAccess().getShapesAssignment_1_1()); 

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
    // $ANTLR end "rule__DSL__Alternatives_1"


    // $ANTLR start "rule__Objects__Alternatives"
    // InternalGoLDSL.g:644:1: rule__Objects__Alternatives : ( ( ( rule__Objects__ShapesAssignment_0 ) ) | ( ( rule__Objects__CellAssignment_1 ) ) | ( ( rule__Objects__CellsAssignment_2 ) ) | ( ( rule__Objects__GridsAssignment_3 ) ) );
    public final void rule__Objects__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:648:1: ( ( ( rule__Objects__ShapesAssignment_0 ) ) | ( ( rule__Objects__CellAssignment_1 ) ) | ( ( rule__Objects__CellsAssignment_2 ) ) | ( ( rule__Objects__GridsAssignment_3 ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            case 27:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGoLDSL.g:649:2: ( ( rule__Objects__ShapesAssignment_0 ) )
                    {
                    // InternalGoLDSL.g:649:2: ( ( rule__Objects__ShapesAssignment_0 ) )
                    // InternalGoLDSL.g:650:3: ( rule__Objects__ShapesAssignment_0 )
                    {
                     before(grammarAccess.getObjectsAccess().getShapesAssignment_0()); 
                    // InternalGoLDSL.g:651:3: ( rule__Objects__ShapesAssignment_0 )
                    // InternalGoLDSL.g:651:4: rule__Objects__ShapesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Objects__ShapesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectsAccess().getShapesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:655:2: ( ( rule__Objects__CellAssignment_1 ) )
                    {
                    // InternalGoLDSL.g:655:2: ( ( rule__Objects__CellAssignment_1 ) )
                    // InternalGoLDSL.g:656:3: ( rule__Objects__CellAssignment_1 )
                    {
                     before(grammarAccess.getObjectsAccess().getCellAssignment_1()); 
                    // InternalGoLDSL.g:657:3: ( rule__Objects__CellAssignment_1 )
                    // InternalGoLDSL.g:657:4: rule__Objects__CellAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Objects__CellAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectsAccess().getCellAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGoLDSL.g:661:2: ( ( rule__Objects__CellsAssignment_2 ) )
                    {
                    // InternalGoLDSL.g:661:2: ( ( rule__Objects__CellsAssignment_2 ) )
                    // InternalGoLDSL.g:662:3: ( rule__Objects__CellsAssignment_2 )
                    {
                     before(grammarAccess.getObjectsAccess().getCellsAssignment_2()); 
                    // InternalGoLDSL.g:663:3: ( rule__Objects__CellsAssignment_2 )
                    // InternalGoLDSL.g:663:4: rule__Objects__CellsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Objects__CellsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectsAccess().getCellsAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGoLDSL.g:667:2: ( ( rule__Objects__GridsAssignment_3 ) )
                    {
                    // InternalGoLDSL.g:667:2: ( ( rule__Objects__GridsAssignment_3 ) )
                    // InternalGoLDSL.g:668:3: ( rule__Objects__GridsAssignment_3 )
                    {
                     before(grammarAccess.getObjectsAccess().getGridsAssignment_3()); 
                    // InternalGoLDSL.g:669:3: ( rule__Objects__GridsAssignment_3 )
                    // InternalGoLDSL.g:669:4: rule__Objects__GridsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Objects__GridsAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectsAccess().getGridsAssignment_3()); 

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
    // $ANTLR end "rule__Objects__Alternatives"


    // $ANTLR start "rule__ConditionRule__Alternatives"
    // InternalGoLDSL.g:677:1: rule__ConditionRule__Alternatives : ( ( ( rule__ConditionRule__NumberAssignment_0 ) ) | ( ( rule__ConditionRule__RangeAssignment_1 ) ) | ( ( rule__ConditionRule__AliveAssignment_2 ) ) | ( ( rule__ConditionRule__DeadAssignment_3 ) ) );
    public final void rule__ConditionRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:681:1: ( ( ( rule__ConditionRule__NumberAssignment_0 ) ) | ( ( rule__ConditionRule__RangeAssignment_1 ) ) | ( ( rule__ConditionRule__AliveAssignment_2 ) ) | ( ( rule__ConditionRule__DeadAssignment_3 ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==26) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||(LA5_1>=11 && LA5_1<=12)||LA5_1==24) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt5=2;
                }
                break;
            case 30:
                {
                alt5=3;
                }
                break;
            case 31:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGoLDSL.g:682:2: ( ( rule__ConditionRule__NumberAssignment_0 ) )
                    {
                    // InternalGoLDSL.g:682:2: ( ( rule__ConditionRule__NumberAssignment_0 ) )
                    // InternalGoLDSL.g:683:3: ( rule__ConditionRule__NumberAssignment_0 )
                    {
                     before(grammarAccess.getConditionRuleAccess().getNumberAssignment_0()); 
                    // InternalGoLDSL.g:684:3: ( rule__ConditionRule__NumberAssignment_0 )
                    // InternalGoLDSL.g:684:4: rule__ConditionRule__NumberAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionRule__NumberAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionRuleAccess().getNumberAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:688:2: ( ( rule__ConditionRule__RangeAssignment_1 ) )
                    {
                    // InternalGoLDSL.g:688:2: ( ( rule__ConditionRule__RangeAssignment_1 ) )
                    // InternalGoLDSL.g:689:3: ( rule__ConditionRule__RangeAssignment_1 )
                    {
                     before(grammarAccess.getConditionRuleAccess().getRangeAssignment_1()); 
                    // InternalGoLDSL.g:690:3: ( rule__ConditionRule__RangeAssignment_1 )
                    // InternalGoLDSL.g:690:4: rule__ConditionRule__RangeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionRule__RangeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionRuleAccess().getRangeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGoLDSL.g:694:2: ( ( rule__ConditionRule__AliveAssignment_2 ) )
                    {
                    // InternalGoLDSL.g:694:2: ( ( rule__ConditionRule__AliveAssignment_2 ) )
                    // InternalGoLDSL.g:695:3: ( rule__ConditionRule__AliveAssignment_2 )
                    {
                     before(grammarAccess.getConditionRuleAccess().getAliveAssignment_2()); 
                    // InternalGoLDSL.g:696:3: ( rule__ConditionRule__AliveAssignment_2 )
                    // InternalGoLDSL.g:696:4: rule__ConditionRule__AliveAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionRule__AliveAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionRuleAccess().getAliveAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGoLDSL.g:700:2: ( ( rule__ConditionRule__DeadAssignment_3 ) )
                    {
                    // InternalGoLDSL.g:700:2: ( ( rule__ConditionRule__DeadAssignment_3 ) )
                    // InternalGoLDSL.g:701:3: ( rule__ConditionRule__DeadAssignment_3 )
                    {
                     before(grammarAccess.getConditionRuleAccess().getDeadAssignment_3()); 
                    // InternalGoLDSL.g:702:3: ( rule__ConditionRule__DeadAssignment_3 )
                    // InternalGoLDSL.g:702:4: rule__ConditionRule__DeadAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionRule__DeadAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionRuleAccess().getDeadAssignment_3()); 

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
    // $ANTLR end "rule__ConditionRule__Alternatives"


    // $ANTLR start "rule__Range__Alternatives"
    // InternalGoLDSL.g:710:1: rule__Range__Alternatives : ( ( ruleBoundedRange ) | ( ruleLeftUnboundedRange ) | ( ruleRightUnboundedRange ) );
    public final void rule__Range__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:714:1: ( ( ruleBoundedRange ) | ( ruleLeftUnboundedRange ) | ( ruleRightUnboundedRange ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==26) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==EOF||(LA6_3>=11 && LA6_3<=12)||LA6_3==24) ) {
                        alt6=2;
                    }
                    else if ( (LA6_3==RULE_INT) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==26) ) {
                alt6=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGoLDSL.g:715:2: ( ruleBoundedRange )
                    {
                    // InternalGoLDSL.g:715:2: ( ruleBoundedRange )
                    // InternalGoLDSL.g:716:3: ruleBoundedRange
                    {
                     before(grammarAccess.getRangeAccess().getBoundedRangeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBoundedRange();

                    state._fsp--;

                     after(grammarAccess.getRangeAccess().getBoundedRangeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:721:2: ( ruleLeftUnboundedRange )
                    {
                    // InternalGoLDSL.g:721:2: ( ruleLeftUnboundedRange )
                    // InternalGoLDSL.g:722:3: ruleLeftUnboundedRange
                    {
                     before(grammarAccess.getRangeAccess().getLeftUnboundedRangeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLeftUnboundedRange();

                    state._fsp--;

                     after(grammarAccess.getRangeAccess().getLeftUnboundedRangeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGoLDSL.g:727:2: ( ruleRightUnboundedRange )
                    {
                    // InternalGoLDSL.g:727:2: ( ruleRightUnboundedRange )
                    // InternalGoLDSL.g:728:3: ruleRightUnboundedRange
                    {
                     before(grammarAccess.getRangeAccess().getRightUnboundedRangeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRightUnboundedRange();

                    state._fsp--;

                     after(grammarAccess.getRangeAccess().getRightUnboundedRangeParserRuleCall_2()); 

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
    // $ANTLR end "rule__Range__Alternatives"


    // $ANTLR start "rule__BoolOperator__Alternatives"
    // InternalGoLDSL.g:737:1: rule__BoolOperator__Alternatives : ( ( ( '&' ) ) | ( ( '|' ) ) );
    public final void rule__BoolOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:741:1: ( ( ( '&' ) ) | ( ( '|' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGoLDSL.g:742:2: ( ( '&' ) )
                    {
                    // InternalGoLDSL.g:742:2: ( ( '&' ) )
                    // InternalGoLDSL.g:743:3: ( '&' )
                    {
                     before(grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalGoLDSL.g:744:3: ( '&' )
                    // InternalGoLDSL.g:744:4: '&'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:748:2: ( ( '|' ) )
                    {
                    // InternalGoLDSL.g:748:2: ( ( '|' ) )
                    // InternalGoLDSL.g:749:3: ( '|' )
                    {
                     before(grammarAccess.getBoolOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalGoLDSL.g:750:3: ( '|' )
                    // InternalGoLDSL.g:750:4: '|'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getBoolOperatorAccess().getOREnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__BoolOperator__Alternatives"


    // $ANTLR start "rule__GridPart__Alternatives"
    // InternalGoLDSL.g:758:1: rule__GridPart__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__GridPart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:762:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            else if ( (LA8_0==14) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGoLDSL.g:763:2: ( ( '+' ) )
                    {
                    // InternalGoLDSL.g:763:2: ( ( '+' ) )
                    // InternalGoLDSL.g:764:3: ( '+' )
                    {
                     before(grammarAccess.getGridPartAccess().getALIVEEnumLiteralDeclaration_0()); 
                    // InternalGoLDSL.g:765:3: ( '+' )
                    // InternalGoLDSL.g:765:4: '+'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getGridPartAccess().getALIVEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:769:2: ( ( '-' ) )
                    {
                    // InternalGoLDSL.g:769:2: ( ( '-' ) )
                    // InternalGoLDSL.g:770:3: ( '-' )
                    {
                     before(grammarAccess.getGridPartAccess().getDEADEnumLiteralDeclaration_1()); 
                    // InternalGoLDSL.g:771:3: ( '-' )
                    // InternalGoLDSL.g:771:4: '-'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getGridPartAccess().getDEADEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__GridPart__Alternatives"


    // $ANTLR start "rule__DSL__Group__0"
    // InternalGoLDSL.g:779:1: rule__DSL__Group__0 : rule__DSL__Group__0__Impl rule__DSL__Group__1 ;
    public final void rule__DSL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:783:1: ( rule__DSL__Group__0__Impl rule__DSL__Group__1 )
            // InternalGoLDSL.g:784:2: rule__DSL__Group__0__Impl rule__DSL__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DSL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSL__Group__1();

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
    // $ANTLR end "rule__DSL__Group__0"


    // $ANTLR start "rule__DSL__Group__0__Impl"
    // InternalGoLDSL.g:791:1: rule__DSL__Group__0__Impl : ( ( rule__DSL__BoardAssignment_0 ) ) ;
    public final void rule__DSL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:795:1: ( ( ( rule__DSL__BoardAssignment_0 ) ) )
            // InternalGoLDSL.g:796:1: ( ( rule__DSL__BoardAssignment_0 ) )
            {
            // InternalGoLDSL.g:796:1: ( ( rule__DSL__BoardAssignment_0 ) )
            // InternalGoLDSL.g:797:2: ( rule__DSL__BoardAssignment_0 )
            {
             before(grammarAccess.getDSLAccess().getBoardAssignment_0()); 
            // InternalGoLDSL.g:798:2: ( rule__DSL__BoardAssignment_0 )
            // InternalGoLDSL.g:798:3: rule__DSL__BoardAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DSL__BoardAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDSLAccess().getBoardAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSL__Group__0__Impl"


    // $ANTLR start "rule__DSL__Group__1"
    // InternalGoLDSL.g:806:1: rule__DSL__Group__1 : rule__DSL__Group__1__Impl ;
    public final void rule__DSL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:810:1: ( rule__DSL__Group__1__Impl )
            // InternalGoLDSL.g:811:2: rule__DSL__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSL__Group__1__Impl();

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
    // $ANTLR end "rule__DSL__Group__1"


    // $ANTLR start "rule__DSL__Group__1__Impl"
    // InternalGoLDSL.g:817:1: rule__DSL__Group__1__Impl : ( ( rule__DSL__Alternatives_1 )* ) ;
    public final void rule__DSL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:821:1: ( ( ( rule__DSL__Alternatives_1 )* ) )
            // InternalGoLDSL.g:822:1: ( ( rule__DSL__Alternatives_1 )* )
            {
            // InternalGoLDSL.g:822:1: ( ( rule__DSL__Alternatives_1 )* )
            // InternalGoLDSL.g:823:2: ( rule__DSL__Alternatives_1 )*
            {
             before(grammarAccess.getDSLAccess().getAlternatives_1()); 
            // InternalGoLDSL.g:824:2: ( rule__DSL__Alternatives_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16||LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGoLDSL.g:824:3: rule__DSL__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DSL__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDSLAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSL__Group__1__Impl"


    // $ANTLR start "rule__Board__Group__0"
    // InternalGoLDSL.g:833:1: rule__Board__Group__0 : rule__Board__Group__0__Impl rule__Board__Group__1 ;
    public final void rule__Board__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:837:1: ( rule__Board__Group__0__Impl rule__Board__Group__1 )
            // InternalGoLDSL.g:838:2: rule__Board__Group__0__Impl rule__Board__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Board__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__1();

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
    // $ANTLR end "rule__Board__Group__0"


    // $ANTLR start "rule__Board__Group__0__Impl"
    // InternalGoLDSL.g:845:1: rule__Board__Group__0__Impl : ( 'Board:' ) ;
    public final void rule__Board__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:849:1: ( ( 'Board:' ) )
            // InternalGoLDSL.g:850:1: ( 'Board:' )
            {
            // InternalGoLDSL.g:850:1: ( 'Board:' )
            // InternalGoLDSL.g:851:2: 'Board:'
            {
             before(grammarAccess.getBoardAccess().getBoardKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getBoardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__0__Impl"


    // $ANTLR start "rule__Board__Group__1"
    // InternalGoLDSL.g:860:1: rule__Board__Group__1 : rule__Board__Group__1__Impl ;
    public final void rule__Board__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:864:1: ( rule__Board__Group__1__Impl )
            // InternalGoLDSL.g:865:2: rule__Board__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group__1__Impl();

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
    // $ANTLR end "rule__Board__Group__1"


    // $ANTLR start "rule__Board__Group__1__Impl"
    // InternalGoLDSL.g:871:1: rule__Board__Group__1__Impl : ( ruleObjects ) ;
    public final void rule__Board__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:875:1: ( ( ruleObjects ) )
            // InternalGoLDSL.g:876:1: ( ruleObjects )
            {
            // InternalGoLDSL.g:876:1: ( ruleObjects )
            // InternalGoLDSL.g:877:2: ruleObjects
            {
             before(grammarAccess.getBoardAccess().getObjectsParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleObjects();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getObjectsParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__1__Impl"


    // $ANTLR start "rule__ShapeDef__Group__0"
    // InternalGoLDSL.g:887:1: rule__ShapeDef__Group__0 : rule__ShapeDef__Group__0__Impl rule__ShapeDef__Group__1 ;
    public final void rule__ShapeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:891:1: ( rule__ShapeDef__Group__0__Impl rule__ShapeDef__Group__1 )
            // InternalGoLDSL.g:892:2: rule__ShapeDef__Group__0__Impl rule__ShapeDef__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ShapeDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeDef__Group__1();

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
    // $ANTLR end "rule__ShapeDef__Group__0"


    // $ANTLR start "rule__ShapeDef__Group__0__Impl"
    // InternalGoLDSL.g:899:1: rule__ShapeDef__Group__0__Impl : ( 'Shape' ) ;
    public final void rule__ShapeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:903:1: ( ( 'Shape' ) )
            // InternalGoLDSL.g:904:1: ( 'Shape' )
            {
            // InternalGoLDSL.g:904:1: ( 'Shape' )
            // InternalGoLDSL.g:905:2: 'Shape'
            {
             before(grammarAccess.getShapeDefAccess().getShapeKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getShapeDefAccess().getShapeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeDef__Group__0__Impl"


    // $ANTLR start "rule__ShapeDef__Group__1"
    // InternalGoLDSL.g:914:1: rule__ShapeDef__Group__1 : rule__ShapeDef__Group__1__Impl rule__ShapeDef__Group__2 ;
    public final void rule__ShapeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:918:1: ( rule__ShapeDef__Group__1__Impl rule__ShapeDef__Group__2 )
            // InternalGoLDSL.g:919:2: rule__ShapeDef__Group__1__Impl rule__ShapeDef__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ShapeDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeDef__Group__2();

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
    // $ANTLR end "rule__ShapeDef__Group__1"


    // $ANTLR start "rule__ShapeDef__Group__1__Impl"
    // InternalGoLDSL.g:926:1: rule__ShapeDef__Group__1__Impl : ( ( rule__ShapeDef__NameAssignment_1 ) ) ;
    public final void rule__ShapeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:930:1: ( ( ( rule__ShapeDef__NameAssignment_1 ) ) )
            // InternalGoLDSL.g:931:1: ( ( rule__ShapeDef__NameAssignment_1 ) )
            {
            // InternalGoLDSL.g:931:1: ( ( rule__ShapeDef__NameAssignment_1 ) )
            // InternalGoLDSL.g:932:2: ( rule__ShapeDef__NameAssignment_1 )
            {
             before(grammarAccess.getShapeDefAccess().getNameAssignment_1()); 
            // InternalGoLDSL.g:933:2: ( rule__ShapeDef__NameAssignment_1 )
            // InternalGoLDSL.g:933:3: rule__ShapeDef__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ShapeDef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getShapeDefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeDef__Group__1__Impl"


    // $ANTLR start "rule__ShapeDef__Group__2"
    // InternalGoLDSL.g:941:1: rule__ShapeDef__Group__2 : rule__ShapeDef__Group__2__Impl rule__ShapeDef__Group__3 ;
    public final void rule__ShapeDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:945:1: ( rule__ShapeDef__Group__2__Impl rule__ShapeDef__Group__3 )
            // InternalGoLDSL.g:946:2: rule__ShapeDef__Group__2__Impl rule__ShapeDef__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ShapeDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeDef__Group__3();

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
    // $ANTLR end "rule__ShapeDef__Group__2"


    // $ANTLR start "rule__ShapeDef__Group__2__Impl"
    // InternalGoLDSL.g:953:1: rule__ShapeDef__Group__2__Impl : ( ':' ) ;
    public final void rule__ShapeDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:957:1: ( ( ':' ) )
            // InternalGoLDSL.g:958:1: ( ':' )
            {
            // InternalGoLDSL.g:958:1: ( ':' )
            // InternalGoLDSL.g:959:2: ':'
            {
             before(grammarAccess.getShapeDefAccess().getColonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getShapeDefAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeDef__Group__2__Impl"


    // $ANTLR start "rule__ShapeDef__Group__3"
    // InternalGoLDSL.g:968:1: rule__ShapeDef__Group__3 : rule__ShapeDef__Group__3__Impl rule__ShapeDef__Group__4 ;
    public final void rule__ShapeDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:972:1: ( rule__ShapeDef__Group__3__Impl rule__ShapeDef__Group__4 )
            // InternalGoLDSL.g:973:2: rule__ShapeDef__Group__3__Impl rule__ShapeDef__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ShapeDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeDef__Group__4();

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
    // $ANTLR end "rule__ShapeDef__Group__3"


    // $ANTLR start "rule__ShapeDef__Group__3__Impl"
    // InternalGoLDSL.g:980:1: rule__ShapeDef__Group__3__Impl : ( ( rule__ShapeDef__OffsetAssignment_3 )? ) ;
    public final void rule__ShapeDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:984:1: ( ( ( rule__ShapeDef__OffsetAssignment_3 )? ) )
            // InternalGoLDSL.g:985:1: ( ( rule__ShapeDef__OffsetAssignment_3 )? )
            {
            // InternalGoLDSL.g:985:1: ( ( rule__ShapeDef__OffsetAssignment_3 )? )
            // InternalGoLDSL.g:986:2: ( rule__ShapeDef__OffsetAssignment_3 )?
            {
             before(grammarAccess.getShapeDefAccess().getOffsetAssignment_3()); 
            // InternalGoLDSL.g:987:2: ( rule__ShapeDef__OffsetAssignment_3 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGoLDSL.g:987:3: rule__ShapeDef__OffsetAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeDef__OffsetAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getShapeDefAccess().getOffsetAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeDef__Group__3__Impl"


    // $ANTLR start "rule__ShapeDef__Group__4"
    // InternalGoLDSL.g:995:1: rule__ShapeDef__Group__4 : rule__ShapeDef__Group__4__Impl ;
    public final void rule__ShapeDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:999:1: ( rule__ShapeDef__Group__4__Impl )
            // InternalGoLDSL.g:1000:2: rule__ShapeDef__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeDef__Group__4__Impl();

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
    // $ANTLR end "rule__ShapeDef__Group__4"


    // $ANTLR start "rule__ShapeDef__Group__4__Impl"
    // InternalGoLDSL.g:1006:1: rule__ShapeDef__Group__4__Impl : ( ( rule__ShapeDef__ObjectsAssignment_4 ) ) ;
    public final void rule__ShapeDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1010:1: ( ( ( rule__ShapeDef__ObjectsAssignment_4 ) ) )
            // InternalGoLDSL.g:1011:1: ( ( rule__ShapeDef__ObjectsAssignment_4 ) )
            {
            // InternalGoLDSL.g:1011:1: ( ( rule__ShapeDef__ObjectsAssignment_4 ) )
            // InternalGoLDSL.g:1012:2: ( rule__ShapeDef__ObjectsAssignment_4 )
            {
             before(grammarAccess.getShapeDefAccess().getObjectsAssignment_4()); 
            // InternalGoLDSL.g:1013:2: ( rule__ShapeDef__ObjectsAssignment_4 )
            // InternalGoLDSL.g:1013:3: rule__ShapeDef__ObjectsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ShapeDef__ObjectsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getShapeDefAccess().getObjectsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeDef__Group__4__Impl"


    // $ANTLR start "rule__CellPairs__Group__0"
    // InternalGoLDSL.g:1022:1: rule__CellPairs__Group__0 : rule__CellPairs__Group__0__Impl rule__CellPairs__Group__1 ;
    public final void rule__CellPairs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1026:1: ( rule__CellPairs__Group__0__Impl rule__CellPairs__Group__1 )
            // InternalGoLDSL.g:1027:2: rule__CellPairs__Group__0__Impl rule__CellPairs__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__CellPairs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellPairs__Group__1();

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
    // $ANTLR end "rule__CellPairs__Group__0"


    // $ANTLR start "rule__CellPairs__Group__0__Impl"
    // InternalGoLDSL.g:1034:1: rule__CellPairs__Group__0__Impl : ( '(' ) ;
    public final void rule__CellPairs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1038:1: ( ( '(' ) )
            // InternalGoLDSL.g:1039:1: ( '(' )
            {
            // InternalGoLDSL.g:1039:1: ( '(' )
            // InternalGoLDSL.g:1040:2: '('
            {
             before(grammarAccess.getCellPairsAccess().getLeftParenthesisKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCellPairsAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellPairs__Group__0__Impl"


    // $ANTLR start "rule__CellPairs__Group__1"
    // InternalGoLDSL.g:1049:1: rule__CellPairs__Group__1 : rule__CellPairs__Group__1__Impl rule__CellPairs__Group__2 ;
    public final void rule__CellPairs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1053:1: ( rule__CellPairs__Group__1__Impl rule__CellPairs__Group__2 )
            // InternalGoLDSL.g:1054:2: rule__CellPairs__Group__1__Impl rule__CellPairs__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__CellPairs__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellPairs__Group__2();

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
    // $ANTLR end "rule__CellPairs__Group__1"


    // $ANTLR start "rule__CellPairs__Group__1__Impl"
    // InternalGoLDSL.g:1061:1: rule__CellPairs__Group__1__Impl : ( ( rule__CellPairs__CellsAssignment_1 ) ) ;
    public final void rule__CellPairs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1065:1: ( ( ( rule__CellPairs__CellsAssignment_1 ) ) )
            // InternalGoLDSL.g:1066:1: ( ( rule__CellPairs__CellsAssignment_1 ) )
            {
            // InternalGoLDSL.g:1066:1: ( ( rule__CellPairs__CellsAssignment_1 ) )
            // InternalGoLDSL.g:1067:2: ( rule__CellPairs__CellsAssignment_1 )
            {
             before(grammarAccess.getCellPairsAccess().getCellsAssignment_1()); 
            // InternalGoLDSL.g:1068:2: ( rule__CellPairs__CellsAssignment_1 )
            // InternalGoLDSL.g:1068:3: rule__CellPairs__CellsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CellPairs__CellsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCellPairsAccess().getCellsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellPairs__Group__1__Impl"


    // $ANTLR start "rule__CellPairs__Group__2"
    // InternalGoLDSL.g:1076:1: rule__CellPairs__Group__2 : rule__CellPairs__Group__2__Impl ;
    public final void rule__CellPairs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1080:1: ( rule__CellPairs__Group__2__Impl )
            // InternalGoLDSL.g:1081:2: rule__CellPairs__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellPairs__Group__2__Impl();

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
    // $ANTLR end "rule__CellPairs__Group__2"


    // $ANTLR start "rule__CellPairs__Group__2__Impl"
    // InternalGoLDSL.g:1087:1: rule__CellPairs__Group__2__Impl : ( ')' ) ;
    public final void rule__CellPairs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1091:1: ( ( ')' ) )
            // InternalGoLDSL.g:1092:1: ( ')' )
            {
            // InternalGoLDSL.g:1092:1: ( ')' )
            // InternalGoLDSL.g:1093:2: ')'
            {
             before(grammarAccess.getCellPairsAccess().getRightParenthesisKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCellPairsAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellPairs__Group__2__Impl"


    // $ANTLR start "rule__Cells__Group__0"
    // InternalGoLDSL.g:1103:1: rule__Cells__Group__0 : rule__Cells__Group__0__Impl rule__Cells__Group__1 ;
    public final void rule__Cells__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1107:1: ( rule__Cells__Group__0__Impl rule__Cells__Group__1 )
            // InternalGoLDSL.g:1108:2: rule__Cells__Group__0__Impl rule__Cells__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Cells__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cells__Group__1();

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
    // $ANTLR end "rule__Cells__Group__0"


    // $ANTLR start "rule__Cells__Group__0__Impl"
    // InternalGoLDSL.g:1115:1: rule__Cells__Group__0__Impl : ( 'Cells:' ) ;
    public final void rule__Cells__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1119:1: ( ( 'Cells:' ) )
            // InternalGoLDSL.g:1120:1: ( 'Cells:' )
            {
            // InternalGoLDSL.g:1120:1: ( 'Cells:' )
            // InternalGoLDSL.g:1121:2: 'Cells:'
            {
             before(grammarAccess.getCellsAccess().getCellsKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCellsAccess().getCellsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cells__Group__0__Impl"


    // $ANTLR start "rule__Cells__Group__1"
    // InternalGoLDSL.g:1130:1: rule__Cells__Group__1 : rule__Cells__Group__1__Impl ;
    public final void rule__Cells__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1134:1: ( rule__Cells__Group__1__Impl )
            // InternalGoLDSL.g:1135:2: rule__Cells__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cells__Group__1__Impl();

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
    // $ANTLR end "rule__Cells__Group__1"


    // $ANTLR start "rule__Cells__Group__1__Impl"
    // InternalGoLDSL.g:1141:1: rule__Cells__Group__1__Impl : ( ruleCellPairs ) ;
    public final void rule__Cells__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1145:1: ( ( ruleCellPairs ) )
            // InternalGoLDSL.g:1146:1: ( ruleCellPairs )
            {
            // InternalGoLDSL.g:1146:1: ( ruleCellPairs )
            // InternalGoLDSL.g:1147:2: ruleCellPairs
            {
             before(grammarAccess.getCellsAccess().getCellPairsParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleCellPairs();

            state._fsp--;

             after(grammarAccess.getCellsAccess().getCellPairsParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cells__Group__1__Impl"


    // $ANTLR start "rule__CellDef__Group__0"
    // InternalGoLDSL.g:1157:1: rule__CellDef__Group__0 : rule__CellDef__Group__0__Impl rule__CellDef__Group__1 ;
    public final void rule__CellDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1161:1: ( rule__CellDef__Group__0__Impl rule__CellDef__Group__1 )
            // InternalGoLDSL.g:1162:2: rule__CellDef__Group__0__Impl rule__CellDef__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__CellDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellDef__Group__1();

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
    // $ANTLR end "rule__CellDef__Group__0"


    // $ANTLR start "rule__CellDef__Group__0__Impl"
    // InternalGoLDSL.g:1169:1: rule__CellDef__Group__0__Impl : ( 'Cell:' ) ;
    public final void rule__CellDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1173:1: ( ( 'Cell:' ) )
            // InternalGoLDSL.g:1174:1: ( 'Cell:' )
            {
            // InternalGoLDSL.g:1174:1: ( 'Cell:' )
            // InternalGoLDSL.g:1175:2: 'Cell:'
            {
             before(grammarAccess.getCellDefAccess().getCellKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCellDefAccess().getCellKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDef__Group__0__Impl"


    // $ANTLR start "rule__CellDef__Group__1"
    // InternalGoLDSL.g:1184:1: rule__CellDef__Group__1 : rule__CellDef__Group__1__Impl rule__CellDef__Group__2 ;
    public final void rule__CellDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1188:1: ( rule__CellDef__Group__1__Impl rule__CellDef__Group__2 )
            // InternalGoLDSL.g:1189:2: rule__CellDef__Group__1__Impl rule__CellDef__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__CellDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellDef__Group__2();

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
    // $ANTLR end "rule__CellDef__Group__1"


    // $ANTLR start "rule__CellDef__Group__1__Impl"
    // InternalGoLDSL.g:1196:1: rule__CellDef__Group__1__Impl : ( ( rule__CellDef__OffsetAssignment_1 )? ) ;
    public final void rule__CellDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1200:1: ( ( ( rule__CellDef__OffsetAssignment_1 )? ) )
            // InternalGoLDSL.g:1201:1: ( ( rule__CellDef__OffsetAssignment_1 )? )
            {
            // InternalGoLDSL.g:1201:1: ( ( rule__CellDef__OffsetAssignment_1 )? )
            // InternalGoLDSL.g:1202:2: ( rule__CellDef__OffsetAssignment_1 )?
            {
             before(grammarAccess.getCellDefAccess().getOffsetAssignment_1()); 
            // InternalGoLDSL.g:1203:2: ( rule__CellDef__OffsetAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGoLDSL.g:1203:3: rule__CellDef__OffsetAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CellDef__OffsetAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCellDefAccess().getOffsetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDef__Group__1__Impl"


    // $ANTLR start "rule__CellDef__Group__2"
    // InternalGoLDSL.g:1211:1: rule__CellDef__Group__2 : rule__CellDef__Group__2__Impl ;
    public final void rule__CellDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1215:1: ( rule__CellDef__Group__2__Impl )
            // InternalGoLDSL.g:1216:2: rule__CellDef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellDef__Group__2__Impl();

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
    // $ANTLR end "rule__CellDef__Group__2"


    // $ANTLR start "rule__CellDef__Group__2__Impl"
    // InternalGoLDSL.g:1222:1: rule__CellDef__Group__2__Impl : ( ( rule__CellDef__CellAssignment_2 ) ) ;
    public final void rule__CellDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1226:1: ( ( ( rule__CellDef__CellAssignment_2 ) ) )
            // InternalGoLDSL.g:1227:1: ( ( rule__CellDef__CellAssignment_2 ) )
            {
            // InternalGoLDSL.g:1227:1: ( ( rule__CellDef__CellAssignment_2 ) )
            // InternalGoLDSL.g:1228:2: ( rule__CellDef__CellAssignment_2 )
            {
             before(grammarAccess.getCellDefAccess().getCellAssignment_2()); 
            // InternalGoLDSL.g:1229:2: ( rule__CellDef__CellAssignment_2 )
            // InternalGoLDSL.g:1229:3: rule__CellDef__CellAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CellDef__CellAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCellDefAccess().getCellAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDef__Group__2__Impl"


    // $ANTLR start "rule__ShapeRef__Group__0"
    // InternalGoLDSL.g:1238:1: rule__ShapeRef__Group__0 : rule__ShapeRef__Group__0__Impl rule__ShapeRef__Group__1 ;
    public final void rule__ShapeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1242:1: ( rule__ShapeRef__Group__0__Impl rule__ShapeRef__Group__1 )
            // InternalGoLDSL.g:1243:2: rule__ShapeRef__Group__0__Impl rule__ShapeRef__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ShapeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeRef__Group__1();

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
    // $ANTLR end "rule__ShapeRef__Group__0"


    // $ANTLR start "rule__ShapeRef__Group__0__Impl"
    // InternalGoLDSL.g:1250:1: rule__ShapeRef__Group__0__Impl : ( 'Shape' ) ;
    public final void rule__ShapeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1254:1: ( ( 'Shape' ) )
            // InternalGoLDSL.g:1255:1: ( 'Shape' )
            {
            // InternalGoLDSL.g:1255:1: ( 'Shape' )
            // InternalGoLDSL.g:1256:2: 'Shape'
            {
             before(grammarAccess.getShapeRefAccess().getShapeKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getShapeRefAccess().getShapeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeRef__Group__0__Impl"


    // $ANTLR start "rule__ShapeRef__Group__1"
    // InternalGoLDSL.g:1265:1: rule__ShapeRef__Group__1 : rule__ShapeRef__Group__1__Impl rule__ShapeRef__Group__2 ;
    public final void rule__ShapeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1269:1: ( rule__ShapeRef__Group__1__Impl rule__ShapeRef__Group__2 )
            // InternalGoLDSL.g:1270:2: rule__ShapeRef__Group__1__Impl rule__ShapeRef__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ShapeRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeRef__Group__2();

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
    // $ANTLR end "rule__ShapeRef__Group__1"


    // $ANTLR start "rule__ShapeRef__Group__1__Impl"
    // InternalGoLDSL.g:1277:1: rule__ShapeRef__Group__1__Impl : ( ( rule__ShapeRef__NameAssignment_1 ) ) ;
    public final void rule__ShapeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1281:1: ( ( ( rule__ShapeRef__NameAssignment_1 ) ) )
            // InternalGoLDSL.g:1282:1: ( ( rule__ShapeRef__NameAssignment_1 ) )
            {
            // InternalGoLDSL.g:1282:1: ( ( rule__ShapeRef__NameAssignment_1 ) )
            // InternalGoLDSL.g:1283:2: ( rule__ShapeRef__NameAssignment_1 )
            {
             before(grammarAccess.getShapeRefAccess().getNameAssignment_1()); 
            // InternalGoLDSL.g:1284:2: ( rule__ShapeRef__NameAssignment_1 )
            // InternalGoLDSL.g:1284:3: rule__ShapeRef__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ShapeRef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getShapeRefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeRef__Group__1__Impl"


    // $ANTLR start "rule__ShapeRef__Group__2"
    // InternalGoLDSL.g:1292:1: rule__ShapeRef__Group__2 : rule__ShapeRef__Group__2__Impl rule__ShapeRef__Group__3 ;
    public final void rule__ShapeRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1296:1: ( rule__ShapeRef__Group__2__Impl rule__ShapeRef__Group__3 )
            // InternalGoLDSL.g:1297:2: rule__ShapeRef__Group__2__Impl rule__ShapeRef__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ShapeRef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeRef__Group__3();

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
    // $ANTLR end "rule__ShapeRef__Group__2"


    // $ANTLR start "rule__ShapeRef__Group__2__Impl"
    // InternalGoLDSL.g:1304:1: rule__ShapeRef__Group__2__Impl : ( ':' ) ;
    public final void rule__ShapeRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1308:1: ( ( ':' ) )
            // InternalGoLDSL.g:1309:1: ( ':' )
            {
            // InternalGoLDSL.g:1309:1: ( ':' )
            // InternalGoLDSL.g:1310:2: ':'
            {
             before(grammarAccess.getShapeRefAccess().getColonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getShapeRefAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeRef__Group__2__Impl"


    // $ANTLR start "rule__ShapeRef__Group__3"
    // InternalGoLDSL.g:1319:1: rule__ShapeRef__Group__3 : rule__ShapeRef__Group__3__Impl rule__ShapeRef__Group__4 ;
    public final void rule__ShapeRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1323:1: ( rule__ShapeRef__Group__3__Impl rule__ShapeRef__Group__4 )
            // InternalGoLDSL.g:1324:2: rule__ShapeRef__Group__3__Impl rule__ShapeRef__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ShapeRef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeRef__Group__4();

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
    // $ANTLR end "rule__ShapeRef__Group__3"


    // $ANTLR start "rule__ShapeRef__Group__3__Impl"
    // InternalGoLDSL.g:1331:1: rule__ShapeRef__Group__3__Impl : ( ( rule__ShapeRef__XAssignment_3 ) ) ;
    public final void rule__ShapeRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1335:1: ( ( ( rule__ShapeRef__XAssignment_3 ) ) )
            // InternalGoLDSL.g:1336:1: ( ( rule__ShapeRef__XAssignment_3 ) )
            {
            // InternalGoLDSL.g:1336:1: ( ( rule__ShapeRef__XAssignment_3 ) )
            // InternalGoLDSL.g:1337:2: ( rule__ShapeRef__XAssignment_3 )
            {
             before(grammarAccess.getShapeRefAccess().getXAssignment_3()); 
            // InternalGoLDSL.g:1338:2: ( rule__ShapeRef__XAssignment_3 )
            // InternalGoLDSL.g:1338:3: rule__ShapeRef__XAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ShapeRef__XAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getShapeRefAccess().getXAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeRef__Group__3__Impl"


    // $ANTLR start "rule__ShapeRef__Group__4"
    // InternalGoLDSL.g:1346:1: rule__ShapeRef__Group__4 : rule__ShapeRef__Group__4__Impl rule__ShapeRef__Group__5 ;
    public final void rule__ShapeRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1350:1: ( rule__ShapeRef__Group__4__Impl rule__ShapeRef__Group__5 )
            // InternalGoLDSL.g:1351:2: rule__ShapeRef__Group__4__Impl rule__ShapeRef__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__ShapeRef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeRef__Group__5();

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
    // $ANTLR end "rule__ShapeRef__Group__4"


    // $ANTLR start "rule__ShapeRef__Group__4__Impl"
    // InternalGoLDSL.g:1358:1: rule__ShapeRef__Group__4__Impl : ( ',' ) ;
    public final void rule__ShapeRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1362:1: ( ( ',' ) )
            // InternalGoLDSL.g:1363:1: ( ',' )
            {
            // InternalGoLDSL.g:1363:1: ( ',' )
            // InternalGoLDSL.g:1364:2: ','
            {
             before(grammarAccess.getShapeRefAccess().getCommaKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getShapeRefAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeRef__Group__4__Impl"


    // $ANTLR start "rule__ShapeRef__Group__5"
    // InternalGoLDSL.g:1373:1: rule__ShapeRef__Group__5 : rule__ShapeRef__Group__5__Impl ;
    public final void rule__ShapeRef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1377:1: ( rule__ShapeRef__Group__5__Impl )
            // InternalGoLDSL.g:1378:2: rule__ShapeRef__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeRef__Group__5__Impl();

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
    // $ANTLR end "rule__ShapeRef__Group__5"


    // $ANTLR start "rule__ShapeRef__Group__5__Impl"
    // InternalGoLDSL.g:1384:1: rule__ShapeRef__Group__5__Impl : ( ( rule__ShapeRef__YAssignment_5 ) ) ;
    public final void rule__ShapeRef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1388:1: ( ( ( rule__ShapeRef__YAssignment_5 ) ) )
            // InternalGoLDSL.g:1389:1: ( ( rule__ShapeRef__YAssignment_5 ) )
            {
            // InternalGoLDSL.g:1389:1: ( ( rule__ShapeRef__YAssignment_5 ) )
            // InternalGoLDSL.g:1390:2: ( rule__ShapeRef__YAssignment_5 )
            {
             before(grammarAccess.getShapeRefAccess().getYAssignment_5()); 
            // InternalGoLDSL.g:1391:2: ( rule__ShapeRef__YAssignment_5 )
            // InternalGoLDSL.g:1391:3: rule__ShapeRef__YAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ShapeRef__YAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getShapeRefAccess().getYAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeRef__Group__5__Impl"


    // $ANTLR start "rule__Cell__Group__0"
    // InternalGoLDSL.g:1400:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1404:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalGoLDSL.g:1405:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Cell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__1();

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
    // $ANTLR end "rule__Cell__Group__0"


    // $ANTLR start "rule__Cell__Group__0__Impl"
    // InternalGoLDSL.g:1412:1: rule__Cell__Group__0__Impl : ( ( rule__Cell__XAssignment_0 ) ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1416:1: ( ( ( rule__Cell__XAssignment_0 ) ) )
            // InternalGoLDSL.g:1417:1: ( ( rule__Cell__XAssignment_0 ) )
            {
            // InternalGoLDSL.g:1417:1: ( ( rule__Cell__XAssignment_0 ) )
            // InternalGoLDSL.g:1418:2: ( rule__Cell__XAssignment_0 )
            {
             before(grammarAccess.getCellAccess().getXAssignment_0()); 
            // InternalGoLDSL.g:1419:2: ( rule__Cell__XAssignment_0 )
            // InternalGoLDSL.g:1419:3: rule__Cell__XAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Cell__XAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getXAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__0__Impl"


    // $ANTLR start "rule__Cell__Group__1"
    // InternalGoLDSL.g:1427:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl rule__Cell__Group__2 ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1431:1: ( rule__Cell__Group__1__Impl rule__Cell__Group__2 )
            // InternalGoLDSL.g:1432:2: rule__Cell__Group__1__Impl rule__Cell__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Cell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__2();

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
    // $ANTLR end "rule__Cell__Group__1"


    // $ANTLR start "rule__Cell__Group__1__Impl"
    // InternalGoLDSL.g:1439:1: rule__Cell__Group__1__Impl : ( ',' ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1443:1: ( ( ',' ) )
            // InternalGoLDSL.g:1444:1: ( ',' )
            {
            // InternalGoLDSL.g:1444:1: ( ',' )
            // InternalGoLDSL.g:1445:2: ','
            {
             before(grammarAccess.getCellAccess().getCommaKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__1__Impl"


    // $ANTLR start "rule__Cell__Group__2"
    // InternalGoLDSL.g:1454:1: rule__Cell__Group__2 : rule__Cell__Group__2__Impl ;
    public final void rule__Cell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1458:1: ( rule__Cell__Group__2__Impl )
            // InternalGoLDSL.g:1459:2: rule__Cell__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group__2__Impl();

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
    // $ANTLR end "rule__Cell__Group__2"


    // $ANTLR start "rule__Cell__Group__2__Impl"
    // InternalGoLDSL.g:1465:1: rule__Cell__Group__2__Impl : ( ( rule__Cell__YAssignment_2 ) ) ;
    public final void rule__Cell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1469:1: ( ( ( rule__Cell__YAssignment_2 ) ) )
            // InternalGoLDSL.g:1470:1: ( ( rule__Cell__YAssignment_2 ) )
            {
            // InternalGoLDSL.g:1470:1: ( ( rule__Cell__YAssignment_2 ) )
            // InternalGoLDSL.g:1471:2: ( rule__Cell__YAssignment_2 )
            {
             before(grammarAccess.getCellAccess().getYAssignment_2()); 
            // InternalGoLDSL.g:1472:2: ( rule__Cell__YAssignment_2 )
            // InternalGoLDSL.g:1472:3: rule__Cell__YAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Cell__YAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getYAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalGoLDSL.g:1481:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1485:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalGoLDSL.g:1486:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalGoLDSL.g:1493:1: rule__Rule__Group__0__Impl : ( 'Rule:' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1497:1: ( ( 'Rule:' ) )
            // InternalGoLDSL.g:1498:1: ( 'Rule:' )
            {
            // InternalGoLDSL.g:1498:1: ( 'Rule:' )
            // InternalGoLDSL.g:1499:2: 'Rule:'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalGoLDSL.g:1508:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1512:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalGoLDSL.g:1513:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalGoLDSL.g:1520:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__ConditionAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1524:1: ( ( ( rule__Rule__ConditionAssignment_1 ) ) )
            // InternalGoLDSL.g:1525:1: ( ( rule__Rule__ConditionAssignment_1 ) )
            {
            // InternalGoLDSL.g:1525:1: ( ( rule__Rule__ConditionAssignment_1 ) )
            // InternalGoLDSL.g:1526:2: ( rule__Rule__ConditionAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_1()); 
            // InternalGoLDSL.g:1527:2: ( rule__Rule__ConditionAssignment_1 )
            // InternalGoLDSL.g:1527:3: rule__Rule__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalGoLDSL.g:1535:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1539:1: ( rule__Rule__Group__2__Impl )
            // InternalGoLDSL.g:1540:2: rule__Rule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__2__Impl();

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalGoLDSL.g:1546:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ActionAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1550:1: ( ( ( rule__Rule__ActionAssignment_2 ) ) )
            // InternalGoLDSL.g:1551:1: ( ( rule__Rule__ActionAssignment_2 ) )
            {
            // InternalGoLDSL.g:1551:1: ( ( rule__Rule__ActionAssignment_2 ) )
            // InternalGoLDSL.g:1552:2: ( rule__Rule__ActionAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getActionAssignment_2()); 
            // InternalGoLDSL.g:1553:2: ( rule__Rule__ActionAssignment_2 )
            // InternalGoLDSL.g:1553:3: rule__Rule__ActionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ActionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getActionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalGoLDSL.g:1562:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1566:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalGoLDSL.g:1567:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

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
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalGoLDSL.g:1574:1: rule__Action__Group__0__Impl : ( 'Create' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1578:1: ( ( 'Create' ) )
            // InternalGoLDSL.g:1579:1: ( 'Create' )
            {
            // InternalGoLDSL.g:1579:1: ( 'Create' )
            // InternalGoLDSL.g:1580:2: 'Create'
            {
             before(grammarAccess.getActionAccess().getCreateKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getCreateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalGoLDSL.g:1589:1: rule__Action__Group__1 : rule__Action__Group__1__Impl ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1593:1: ( rule__Action__Group__1__Impl )
            // InternalGoLDSL.g:1594:2: rule__Action__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__1__Impl();

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
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalGoLDSL.g:1600:1: rule__Action__Group__1__Impl : ( ruleObjects ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1604:1: ( ( ruleObjects ) )
            // InternalGoLDSL.g:1605:1: ( ruleObjects )
            {
            // InternalGoLDSL.g:1605:1: ( ruleObjects )
            // InternalGoLDSL.g:1606:2: ruleObjects
            {
             before(grammarAccess.getActionAccess().getObjectsParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleObjects();

            state._fsp--;

             after(grammarAccess.getActionAccess().getObjectsParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalGoLDSL.g:1616:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1620:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGoLDSL.g:1621:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

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
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalGoLDSL.g:1628:1: rule__Condition__Group__0__Impl : ( 'If' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1632:1: ( ( 'If' ) )
            // InternalGoLDSL.g:1633:1: ( 'If' )
            {
            // InternalGoLDSL.g:1633:1: ( 'If' )
            // InternalGoLDSL.g:1634:2: 'If'
            {
             before(grammarAccess.getConditionAccess().getIfKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalGoLDSL.g:1643:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1647:1: ( rule__Condition__Group__1__Impl )
            // InternalGoLDSL.g:1648:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

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
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalGoLDSL.g:1654:1: rule__Condition__Group__1__Impl : ( ruleConditionRules ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1658:1: ( ( ruleConditionRules ) )
            // InternalGoLDSL.g:1659:1: ( ruleConditionRules )
            {
            // InternalGoLDSL.g:1659:1: ( ruleConditionRules )
            // InternalGoLDSL.g:1660:2: ruleConditionRules
            {
             before(grammarAccess.getConditionAccess().getConditionRulesParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleConditionRules();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getConditionRulesParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__ConditionRules__Group__0"
    // InternalGoLDSL.g:1670:1: rule__ConditionRules__Group__0 : rule__ConditionRules__Group__0__Impl rule__ConditionRules__Group__1 ;
    public final void rule__ConditionRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1674:1: ( rule__ConditionRules__Group__0__Impl rule__ConditionRules__Group__1 )
            // InternalGoLDSL.g:1675:2: rule__ConditionRules__Group__0__Impl rule__ConditionRules__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ConditionRules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionRules__Group__1();

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
    // $ANTLR end "rule__ConditionRules__Group__0"


    // $ANTLR start "rule__ConditionRules__Group__0__Impl"
    // InternalGoLDSL.g:1682:1: rule__ConditionRules__Group__0__Impl : ( ( rule__ConditionRules__Rule1Assignment_0 ) ) ;
    public final void rule__ConditionRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1686:1: ( ( ( rule__ConditionRules__Rule1Assignment_0 ) ) )
            // InternalGoLDSL.g:1687:1: ( ( rule__ConditionRules__Rule1Assignment_0 ) )
            {
            // InternalGoLDSL.g:1687:1: ( ( rule__ConditionRules__Rule1Assignment_0 ) )
            // InternalGoLDSL.g:1688:2: ( rule__ConditionRules__Rule1Assignment_0 )
            {
             before(grammarAccess.getConditionRulesAccess().getRule1Assignment_0()); 
            // InternalGoLDSL.g:1689:2: ( rule__ConditionRules__Rule1Assignment_0 )
            // InternalGoLDSL.g:1689:3: rule__ConditionRules__Rule1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionRules__Rule1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionRulesAccess().getRule1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRules__Group__0__Impl"


    // $ANTLR start "rule__ConditionRules__Group__1"
    // InternalGoLDSL.g:1697:1: rule__ConditionRules__Group__1 : rule__ConditionRules__Group__1__Impl ;
    public final void rule__ConditionRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1701:1: ( rule__ConditionRules__Group__1__Impl )
            // InternalGoLDSL.g:1702:2: rule__ConditionRules__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionRules__Group__1__Impl();

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
    // $ANTLR end "rule__ConditionRules__Group__1"


    // $ANTLR start "rule__ConditionRules__Group__1__Impl"
    // InternalGoLDSL.g:1708:1: rule__ConditionRules__Group__1__Impl : ( ( rule__ConditionRules__Group_1__0 )? ) ;
    public final void rule__ConditionRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1712:1: ( ( ( rule__ConditionRules__Group_1__0 )? ) )
            // InternalGoLDSL.g:1713:1: ( ( rule__ConditionRules__Group_1__0 )? )
            {
            // InternalGoLDSL.g:1713:1: ( ( rule__ConditionRules__Group_1__0 )? )
            // InternalGoLDSL.g:1714:2: ( rule__ConditionRules__Group_1__0 )?
            {
             before(grammarAccess.getConditionRulesAccess().getGroup_1()); 
            // InternalGoLDSL.g:1715:2: ( rule__ConditionRules__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=12)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGoLDSL.g:1715:3: rule__ConditionRules__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionRules__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionRulesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRules__Group__1__Impl"


    // $ANTLR start "rule__ConditionRules__Group_1__0"
    // InternalGoLDSL.g:1724:1: rule__ConditionRules__Group_1__0 : rule__ConditionRules__Group_1__0__Impl rule__ConditionRules__Group_1__1 ;
    public final void rule__ConditionRules__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1728:1: ( rule__ConditionRules__Group_1__0__Impl rule__ConditionRules__Group_1__1 )
            // InternalGoLDSL.g:1729:2: rule__ConditionRules__Group_1__0__Impl rule__ConditionRules__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__ConditionRules__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionRules__Group_1__1();

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
    // $ANTLR end "rule__ConditionRules__Group_1__0"


    // $ANTLR start "rule__ConditionRules__Group_1__0__Impl"
    // InternalGoLDSL.g:1736:1: rule__ConditionRules__Group_1__0__Impl : ( ( rule__ConditionRules__OperatorAssignment_1_0 ) ) ;
    public final void rule__ConditionRules__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1740:1: ( ( ( rule__ConditionRules__OperatorAssignment_1_0 ) ) )
            // InternalGoLDSL.g:1741:1: ( ( rule__ConditionRules__OperatorAssignment_1_0 ) )
            {
            // InternalGoLDSL.g:1741:1: ( ( rule__ConditionRules__OperatorAssignment_1_0 ) )
            // InternalGoLDSL.g:1742:2: ( rule__ConditionRules__OperatorAssignment_1_0 )
            {
             before(grammarAccess.getConditionRulesAccess().getOperatorAssignment_1_0()); 
            // InternalGoLDSL.g:1743:2: ( rule__ConditionRules__OperatorAssignment_1_0 )
            // InternalGoLDSL.g:1743:3: rule__ConditionRules__OperatorAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionRules__OperatorAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionRulesAccess().getOperatorAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRules__Group_1__0__Impl"


    // $ANTLR start "rule__ConditionRules__Group_1__1"
    // InternalGoLDSL.g:1751:1: rule__ConditionRules__Group_1__1 : rule__ConditionRules__Group_1__1__Impl ;
    public final void rule__ConditionRules__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1755:1: ( rule__ConditionRules__Group_1__1__Impl )
            // InternalGoLDSL.g:1756:2: rule__ConditionRules__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionRules__Group_1__1__Impl();

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
    // $ANTLR end "rule__ConditionRules__Group_1__1"


    // $ANTLR start "rule__ConditionRules__Group_1__1__Impl"
    // InternalGoLDSL.g:1762:1: rule__ConditionRules__Group_1__1__Impl : ( ( rule__ConditionRules__Rule2Assignment_1_1 ) ) ;
    public final void rule__ConditionRules__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1766:1: ( ( ( rule__ConditionRules__Rule2Assignment_1_1 ) ) )
            // InternalGoLDSL.g:1767:1: ( ( rule__ConditionRules__Rule2Assignment_1_1 ) )
            {
            // InternalGoLDSL.g:1767:1: ( ( rule__ConditionRules__Rule2Assignment_1_1 ) )
            // InternalGoLDSL.g:1768:2: ( rule__ConditionRules__Rule2Assignment_1_1 )
            {
             before(grammarAccess.getConditionRulesAccess().getRule2Assignment_1_1()); 
            // InternalGoLDSL.g:1769:2: ( rule__ConditionRules__Rule2Assignment_1_1 )
            // InternalGoLDSL.g:1769:3: rule__ConditionRules__Rule2Assignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionRules__Rule2Assignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionRulesAccess().getRule2Assignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRules__Group_1__1__Impl"


    // $ANTLR start "rule__BoundedRange__Group__0"
    // InternalGoLDSL.g:1778:1: rule__BoundedRange__Group__0 : rule__BoundedRange__Group__0__Impl rule__BoundedRange__Group__1 ;
    public final void rule__BoundedRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1782:1: ( rule__BoundedRange__Group__0__Impl rule__BoundedRange__Group__1 )
            // InternalGoLDSL.g:1783:2: rule__BoundedRange__Group__0__Impl rule__BoundedRange__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__BoundedRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundedRange__Group__1();

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
    // $ANTLR end "rule__BoundedRange__Group__0"


    // $ANTLR start "rule__BoundedRange__Group__0__Impl"
    // InternalGoLDSL.g:1790:1: rule__BoundedRange__Group__0__Impl : ( ( rule__BoundedRange__LowerBoundAssignment_0 ) ) ;
    public final void rule__BoundedRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1794:1: ( ( ( rule__BoundedRange__LowerBoundAssignment_0 ) ) )
            // InternalGoLDSL.g:1795:1: ( ( rule__BoundedRange__LowerBoundAssignment_0 ) )
            {
            // InternalGoLDSL.g:1795:1: ( ( rule__BoundedRange__LowerBoundAssignment_0 ) )
            // InternalGoLDSL.g:1796:2: ( rule__BoundedRange__LowerBoundAssignment_0 )
            {
             before(grammarAccess.getBoundedRangeAccess().getLowerBoundAssignment_0()); 
            // InternalGoLDSL.g:1797:2: ( rule__BoundedRange__LowerBoundAssignment_0 )
            // InternalGoLDSL.g:1797:3: rule__BoundedRange__LowerBoundAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BoundedRange__LowerBoundAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBoundedRangeAccess().getLowerBoundAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundedRange__Group__0__Impl"


    // $ANTLR start "rule__BoundedRange__Group__1"
    // InternalGoLDSL.g:1805:1: rule__BoundedRange__Group__1 : rule__BoundedRange__Group__1__Impl rule__BoundedRange__Group__2 ;
    public final void rule__BoundedRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1809:1: ( rule__BoundedRange__Group__1__Impl rule__BoundedRange__Group__2 )
            // InternalGoLDSL.g:1810:2: rule__BoundedRange__Group__1__Impl rule__BoundedRange__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__BoundedRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoundedRange__Group__2();

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
    // $ANTLR end "rule__BoundedRange__Group__1"


    // $ANTLR start "rule__BoundedRange__Group__1__Impl"
    // InternalGoLDSL.g:1817:1: rule__BoundedRange__Group__1__Impl : ( '..' ) ;
    public final void rule__BoundedRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1821:1: ( ( '..' ) )
            // InternalGoLDSL.g:1822:1: ( '..' )
            {
            // InternalGoLDSL.g:1822:1: ( '..' )
            // InternalGoLDSL.g:1823:2: '..'
            {
             before(grammarAccess.getBoundedRangeAccess().getFullStopFullStopKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBoundedRangeAccess().getFullStopFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundedRange__Group__1__Impl"


    // $ANTLR start "rule__BoundedRange__Group__2"
    // InternalGoLDSL.g:1832:1: rule__BoundedRange__Group__2 : rule__BoundedRange__Group__2__Impl ;
    public final void rule__BoundedRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1836:1: ( rule__BoundedRange__Group__2__Impl )
            // InternalGoLDSL.g:1837:2: rule__BoundedRange__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundedRange__Group__2__Impl();

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
    // $ANTLR end "rule__BoundedRange__Group__2"


    // $ANTLR start "rule__BoundedRange__Group__2__Impl"
    // InternalGoLDSL.g:1843:1: rule__BoundedRange__Group__2__Impl : ( ( rule__BoundedRange__HigherBoundAssignment_2 ) ) ;
    public final void rule__BoundedRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1847:1: ( ( ( rule__BoundedRange__HigherBoundAssignment_2 ) ) )
            // InternalGoLDSL.g:1848:1: ( ( rule__BoundedRange__HigherBoundAssignment_2 ) )
            {
            // InternalGoLDSL.g:1848:1: ( ( rule__BoundedRange__HigherBoundAssignment_2 ) )
            // InternalGoLDSL.g:1849:2: ( rule__BoundedRange__HigherBoundAssignment_2 )
            {
             before(grammarAccess.getBoundedRangeAccess().getHigherBoundAssignment_2()); 
            // InternalGoLDSL.g:1850:2: ( rule__BoundedRange__HigherBoundAssignment_2 )
            // InternalGoLDSL.g:1850:3: rule__BoundedRange__HigherBoundAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BoundedRange__HigherBoundAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBoundedRangeAccess().getHigherBoundAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundedRange__Group__2__Impl"


    // $ANTLR start "rule__LeftUnboundedRange__Group__0"
    // InternalGoLDSL.g:1859:1: rule__LeftUnboundedRange__Group__0 : rule__LeftUnboundedRange__Group__0__Impl rule__LeftUnboundedRange__Group__1 ;
    public final void rule__LeftUnboundedRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1863:1: ( rule__LeftUnboundedRange__Group__0__Impl rule__LeftUnboundedRange__Group__1 )
            // InternalGoLDSL.g:1864:2: rule__LeftUnboundedRange__Group__0__Impl rule__LeftUnboundedRange__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__LeftUnboundedRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftUnboundedRange__Group__1();

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
    // $ANTLR end "rule__LeftUnboundedRange__Group__0"


    // $ANTLR start "rule__LeftUnboundedRange__Group__0__Impl"
    // InternalGoLDSL.g:1871:1: rule__LeftUnboundedRange__Group__0__Impl : ( ( rule__LeftUnboundedRange__LowerBoundAssignment_0 ) ) ;
    public final void rule__LeftUnboundedRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1875:1: ( ( ( rule__LeftUnboundedRange__LowerBoundAssignment_0 ) ) )
            // InternalGoLDSL.g:1876:1: ( ( rule__LeftUnboundedRange__LowerBoundAssignment_0 ) )
            {
            // InternalGoLDSL.g:1876:1: ( ( rule__LeftUnboundedRange__LowerBoundAssignment_0 ) )
            // InternalGoLDSL.g:1877:2: ( rule__LeftUnboundedRange__LowerBoundAssignment_0 )
            {
             before(grammarAccess.getLeftUnboundedRangeAccess().getLowerBoundAssignment_0()); 
            // InternalGoLDSL.g:1878:2: ( rule__LeftUnboundedRange__LowerBoundAssignment_0 )
            // InternalGoLDSL.g:1878:3: rule__LeftUnboundedRange__LowerBoundAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LeftUnboundedRange__LowerBoundAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLeftUnboundedRangeAccess().getLowerBoundAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftUnboundedRange__Group__0__Impl"


    // $ANTLR start "rule__LeftUnboundedRange__Group__1"
    // InternalGoLDSL.g:1886:1: rule__LeftUnboundedRange__Group__1 : rule__LeftUnboundedRange__Group__1__Impl ;
    public final void rule__LeftUnboundedRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1890:1: ( rule__LeftUnboundedRange__Group__1__Impl )
            // InternalGoLDSL.g:1891:2: rule__LeftUnboundedRange__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeftUnboundedRange__Group__1__Impl();

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
    // $ANTLR end "rule__LeftUnboundedRange__Group__1"


    // $ANTLR start "rule__LeftUnboundedRange__Group__1__Impl"
    // InternalGoLDSL.g:1897:1: rule__LeftUnboundedRange__Group__1__Impl : ( '..' ) ;
    public final void rule__LeftUnboundedRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1901:1: ( ( '..' ) )
            // InternalGoLDSL.g:1902:1: ( '..' )
            {
            // InternalGoLDSL.g:1902:1: ( '..' )
            // InternalGoLDSL.g:1903:2: '..'
            {
             before(grammarAccess.getLeftUnboundedRangeAccess().getFullStopFullStopKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLeftUnboundedRangeAccess().getFullStopFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftUnboundedRange__Group__1__Impl"


    // $ANTLR start "rule__RightUnboundedRange__Group__0"
    // InternalGoLDSL.g:1913:1: rule__RightUnboundedRange__Group__0 : rule__RightUnboundedRange__Group__0__Impl rule__RightUnboundedRange__Group__1 ;
    public final void rule__RightUnboundedRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1917:1: ( rule__RightUnboundedRange__Group__0__Impl rule__RightUnboundedRange__Group__1 )
            // InternalGoLDSL.g:1918:2: rule__RightUnboundedRange__Group__0__Impl rule__RightUnboundedRange__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RightUnboundedRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightUnboundedRange__Group__1();

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
    // $ANTLR end "rule__RightUnboundedRange__Group__0"


    // $ANTLR start "rule__RightUnboundedRange__Group__0__Impl"
    // InternalGoLDSL.g:1925:1: rule__RightUnboundedRange__Group__0__Impl : ( '..' ) ;
    public final void rule__RightUnboundedRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1929:1: ( ( '..' ) )
            // InternalGoLDSL.g:1930:1: ( '..' )
            {
            // InternalGoLDSL.g:1930:1: ( '..' )
            // InternalGoLDSL.g:1931:2: '..'
            {
             before(grammarAccess.getRightUnboundedRangeAccess().getFullStopFullStopKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRightUnboundedRangeAccess().getFullStopFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightUnboundedRange__Group__0__Impl"


    // $ANTLR start "rule__RightUnboundedRange__Group__1"
    // InternalGoLDSL.g:1940:1: rule__RightUnboundedRange__Group__1 : rule__RightUnboundedRange__Group__1__Impl ;
    public final void rule__RightUnboundedRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1944:1: ( rule__RightUnboundedRange__Group__1__Impl )
            // InternalGoLDSL.g:1945:2: rule__RightUnboundedRange__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RightUnboundedRange__Group__1__Impl();

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
    // $ANTLR end "rule__RightUnboundedRange__Group__1"


    // $ANTLR start "rule__RightUnboundedRange__Group__1__Impl"
    // InternalGoLDSL.g:1951:1: rule__RightUnboundedRange__Group__1__Impl : ( ( rule__RightUnboundedRange__HigherBoundAssignment_1 ) ) ;
    public final void rule__RightUnboundedRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1955:1: ( ( ( rule__RightUnboundedRange__HigherBoundAssignment_1 ) ) )
            // InternalGoLDSL.g:1956:1: ( ( rule__RightUnboundedRange__HigherBoundAssignment_1 ) )
            {
            // InternalGoLDSL.g:1956:1: ( ( rule__RightUnboundedRange__HigherBoundAssignment_1 ) )
            // InternalGoLDSL.g:1957:2: ( rule__RightUnboundedRange__HigherBoundAssignment_1 )
            {
             before(grammarAccess.getRightUnboundedRangeAccess().getHigherBoundAssignment_1()); 
            // InternalGoLDSL.g:1958:2: ( rule__RightUnboundedRange__HigherBoundAssignment_1 )
            // InternalGoLDSL.g:1958:3: rule__RightUnboundedRange__HigherBoundAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RightUnboundedRange__HigherBoundAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRightUnboundedRangeAccess().getHigherBoundAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightUnboundedRange__Group__1__Impl"


    // $ANTLR start "rule__Grid__Group__0"
    // InternalGoLDSL.g:1967:1: rule__Grid__Group__0 : rule__Grid__Group__0__Impl rule__Grid__Group__1 ;
    public final void rule__Grid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1971:1: ( rule__Grid__Group__0__Impl rule__Grid__Group__1 )
            // InternalGoLDSL.g:1972:2: rule__Grid__Group__0__Impl rule__Grid__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Grid__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__1();

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
    // $ANTLR end "rule__Grid__Group__0"


    // $ANTLR start "rule__Grid__Group__0__Impl"
    // InternalGoLDSL.g:1979:1: rule__Grid__Group__0__Impl : ( 'Grid:' ) ;
    public final void rule__Grid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1983:1: ( ( 'Grid:' ) )
            // InternalGoLDSL.g:1984:1: ( 'Grid:' )
            {
            // InternalGoLDSL.g:1984:1: ( 'Grid:' )
            // InternalGoLDSL.g:1985:2: 'Grid:'
            {
             before(grammarAccess.getGridAccess().getGridKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getGridKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__0__Impl"


    // $ANTLR start "rule__Grid__Group__1"
    // InternalGoLDSL.g:1994:1: rule__Grid__Group__1 : rule__Grid__Group__1__Impl rule__Grid__Group__2 ;
    public final void rule__Grid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1998:1: ( rule__Grid__Group__1__Impl rule__Grid__Group__2 )
            // InternalGoLDSL.g:1999:2: rule__Grid__Group__1__Impl rule__Grid__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Grid__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__2();

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
    // $ANTLR end "rule__Grid__Group__1"


    // $ANTLR start "rule__Grid__Group__1__Impl"
    // InternalGoLDSL.g:2006:1: rule__Grid__Group__1__Impl : ( ( rule__Grid__SizeAssignment_1 ) ) ;
    public final void rule__Grid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2010:1: ( ( ( rule__Grid__SizeAssignment_1 ) ) )
            // InternalGoLDSL.g:2011:1: ( ( rule__Grid__SizeAssignment_1 ) )
            {
            // InternalGoLDSL.g:2011:1: ( ( rule__Grid__SizeAssignment_1 ) )
            // InternalGoLDSL.g:2012:2: ( rule__Grid__SizeAssignment_1 )
            {
             before(grammarAccess.getGridAccess().getSizeAssignment_1()); 
            // InternalGoLDSL.g:2013:2: ( rule__Grid__SizeAssignment_1 )
            // InternalGoLDSL.g:2013:3: rule__Grid__SizeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Grid__SizeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getSizeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__1__Impl"


    // $ANTLR start "rule__Grid__Group__2"
    // InternalGoLDSL.g:2021:1: rule__Grid__Group__2 : rule__Grid__Group__2__Impl ;
    public final void rule__Grid__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2025:1: ( rule__Grid__Group__2__Impl )
            // InternalGoLDSL.g:2026:2: rule__Grid__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group__2__Impl();

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
    // $ANTLR end "rule__Grid__Group__2"


    // $ANTLR start "rule__Grid__Group__2__Impl"
    // InternalGoLDSL.g:2032:1: rule__Grid__Group__2__Impl : ( ( ( rule__Grid__PartsAssignment_2 ) ) ( ( rule__Grid__PartsAssignment_2 )* ) ) ;
    public final void rule__Grid__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2036:1: ( ( ( ( rule__Grid__PartsAssignment_2 ) ) ( ( rule__Grid__PartsAssignment_2 )* ) ) )
            // InternalGoLDSL.g:2037:1: ( ( ( rule__Grid__PartsAssignment_2 ) ) ( ( rule__Grid__PartsAssignment_2 )* ) )
            {
            // InternalGoLDSL.g:2037:1: ( ( ( rule__Grid__PartsAssignment_2 ) ) ( ( rule__Grid__PartsAssignment_2 )* ) )
            // InternalGoLDSL.g:2038:2: ( ( rule__Grid__PartsAssignment_2 ) ) ( ( rule__Grid__PartsAssignment_2 )* )
            {
            // InternalGoLDSL.g:2038:2: ( ( rule__Grid__PartsAssignment_2 ) )
            // InternalGoLDSL.g:2039:3: ( rule__Grid__PartsAssignment_2 )
            {
             before(grammarAccess.getGridAccess().getPartsAssignment_2()); 
            // InternalGoLDSL.g:2040:3: ( rule__Grid__PartsAssignment_2 )
            // InternalGoLDSL.g:2040:4: rule__Grid__PartsAssignment_2
            {
            pushFollow(FOLLOW_23);
            rule__Grid__PartsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getPartsAssignment_2()); 

            }

            // InternalGoLDSL.g:2043:2: ( ( rule__Grid__PartsAssignment_2 )* )
            // InternalGoLDSL.g:2044:3: ( rule__Grid__PartsAssignment_2 )*
            {
             before(grammarAccess.getGridAccess().getPartsAssignment_2()); 
            // InternalGoLDSL.g:2045:3: ( rule__Grid__PartsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=13 && LA13_0<=14)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGoLDSL.g:2045:4: rule__Grid__PartsAssignment_2
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Grid__PartsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getGridAccess().getPartsAssignment_2()); 

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
    // $ANTLR end "rule__Grid__Group__2__Impl"


    // $ANTLR start "rule__Offset__Group__0"
    // InternalGoLDSL.g:2055:1: rule__Offset__Group__0 : rule__Offset__Group__0__Impl rule__Offset__Group__1 ;
    public final void rule__Offset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2059:1: ( rule__Offset__Group__0__Impl rule__Offset__Group__1 )
            // InternalGoLDSL.g:2060:2: rule__Offset__Group__0__Impl rule__Offset__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Offset__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Offset__Group__1();

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
    // $ANTLR end "rule__Offset__Group__0"


    // $ANTLR start "rule__Offset__Group__0__Impl"
    // InternalGoLDSL.g:2067:1: rule__Offset__Group__0__Impl : ( 'offset' ) ;
    public final void rule__Offset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2071:1: ( ( 'offset' ) )
            // InternalGoLDSL.g:2072:1: ( 'offset' )
            {
            // InternalGoLDSL.g:2072:1: ( 'offset' )
            // InternalGoLDSL.g:2073:2: 'offset'
            {
             before(grammarAccess.getOffsetAccess().getOffsetKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getOffsetAccess().getOffsetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Offset__Group__0__Impl"


    // $ANTLR start "rule__Offset__Group__1"
    // InternalGoLDSL.g:2082:1: rule__Offset__Group__1 : rule__Offset__Group__1__Impl rule__Offset__Group__2 ;
    public final void rule__Offset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2086:1: ( rule__Offset__Group__1__Impl rule__Offset__Group__2 )
            // InternalGoLDSL.g:2087:2: rule__Offset__Group__1__Impl rule__Offset__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Offset__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Offset__Group__2();

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
    // $ANTLR end "rule__Offset__Group__1"


    // $ANTLR start "rule__Offset__Group__1__Impl"
    // InternalGoLDSL.g:2094:1: rule__Offset__Group__1__Impl : ( ( rule__Offset__XAssignment_1 ) ) ;
    public final void rule__Offset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2098:1: ( ( ( rule__Offset__XAssignment_1 ) ) )
            // InternalGoLDSL.g:2099:1: ( ( rule__Offset__XAssignment_1 ) )
            {
            // InternalGoLDSL.g:2099:1: ( ( rule__Offset__XAssignment_1 ) )
            // InternalGoLDSL.g:2100:2: ( rule__Offset__XAssignment_1 )
            {
             before(grammarAccess.getOffsetAccess().getXAssignment_1()); 
            // InternalGoLDSL.g:2101:2: ( rule__Offset__XAssignment_1 )
            // InternalGoLDSL.g:2101:3: rule__Offset__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Offset__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOffsetAccess().getXAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Offset__Group__1__Impl"


    // $ANTLR start "rule__Offset__Group__2"
    // InternalGoLDSL.g:2109:1: rule__Offset__Group__2 : rule__Offset__Group__2__Impl ;
    public final void rule__Offset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2113:1: ( rule__Offset__Group__2__Impl )
            // InternalGoLDSL.g:2114:2: rule__Offset__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Offset__Group__2__Impl();

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
    // $ANTLR end "rule__Offset__Group__2"


    // $ANTLR start "rule__Offset__Group__2__Impl"
    // InternalGoLDSL.g:2120:1: rule__Offset__Group__2__Impl : ( ( rule__Offset__YAssignment_2 ) ) ;
    public final void rule__Offset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2124:1: ( ( ( rule__Offset__YAssignment_2 ) ) )
            // InternalGoLDSL.g:2125:1: ( ( rule__Offset__YAssignment_2 ) )
            {
            // InternalGoLDSL.g:2125:1: ( ( rule__Offset__YAssignment_2 ) )
            // InternalGoLDSL.g:2126:2: ( rule__Offset__YAssignment_2 )
            {
             before(grammarAccess.getOffsetAccess().getYAssignment_2()); 
            // InternalGoLDSL.g:2127:2: ( rule__Offset__YAssignment_2 )
            // InternalGoLDSL.g:2127:3: rule__Offset__YAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Offset__YAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOffsetAccess().getYAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Offset__Group__2__Impl"


    // $ANTLR start "rule__Size__Group__0"
    // InternalGoLDSL.g:2136:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2140:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // InternalGoLDSL.g:2141:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Size__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group__1();

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
    // $ANTLR end "rule__Size__Group__0"


    // $ANTLR start "rule__Size__Group__0__Impl"
    // InternalGoLDSL.g:2148:1: rule__Size__Group__0__Impl : ( 'size' ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2152:1: ( ( 'size' ) )
            // InternalGoLDSL.g:2153:1: ( 'size' )
            {
            // InternalGoLDSL.g:2153:1: ( 'size' )
            // InternalGoLDSL.g:2154:2: 'size'
            {
             before(grammarAccess.getSizeAccess().getSizeKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getSizeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__0__Impl"


    // $ANTLR start "rule__Size__Group__1"
    // InternalGoLDSL.g:2163:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2167:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // InternalGoLDSL.g:2168:2: rule__Size__Group__1__Impl rule__Size__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Size__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group__2();

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
    // $ANTLR end "rule__Size__Group__1"


    // $ANTLR start "rule__Size__Group__1__Impl"
    // InternalGoLDSL.g:2175:1: rule__Size__Group__1__Impl : ( ( rule__Size__WidthAssignment_1 ) ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2179:1: ( ( ( rule__Size__WidthAssignment_1 ) ) )
            // InternalGoLDSL.g:2180:1: ( ( rule__Size__WidthAssignment_1 ) )
            {
            // InternalGoLDSL.g:2180:1: ( ( rule__Size__WidthAssignment_1 ) )
            // InternalGoLDSL.g:2181:2: ( rule__Size__WidthAssignment_1 )
            {
             before(grammarAccess.getSizeAccess().getWidthAssignment_1()); 
            // InternalGoLDSL.g:2182:2: ( rule__Size__WidthAssignment_1 )
            // InternalGoLDSL.g:2182:3: rule__Size__WidthAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Size__WidthAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getWidthAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__1__Impl"


    // $ANTLR start "rule__Size__Group__2"
    // InternalGoLDSL.g:2190:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2194:1: ( rule__Size__Group__2__Impl )
            // InternalGoLDSL.g:2195:2: rule__Size__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group__2__Impl();

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
    // $ANTLR end "rule__Size__Group__2"


    // $ANTLR start "rule__Size__Group__2__Impl"
    // InternalGoLDSL.g:2201:1: rule__Size__Group__2__Impl : ( ( rule__Size__HeightAssignment_2 ) ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2205:1: ( ( ( rule__Size__HeightAssignment_2 ) ) )
            // InternalGoLDSL.g:2206:1: ( ( rule__Size__HeightAssignment_2 ) )
            {
            // InternalGoLDSL.g:2206:1: ( ( rule__Size__HeightAssignment_2 ) )
            // InternalGoLDSL.g:2207:2: ( rule__Size__HeightAssignment_2 )
            {
             before(grammarAccess.getSizeAccess().getHeightAssignment_2()); 
            // InternalGoLDSL.g:2208:2: ( rule__Size__HeightAssignment_2 )
            // InternalGoLDSL.g:2208:3: rule__Size__HeightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Size__HeightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getHeightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__2__Impl"


    // $ANTLR start "rule__DSL__BoardAssignment_0"
    // InternalGoLDSL.g:2217:1: rule__DSL__BoardAssignment_0 : ( ruleBoard ) ;
    public final void rule__DSL__BoardAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2221:1: ( ( ruleBoard ) )
            // InternalGoLDSL.g:2222:2: ( ruleBoard )
            {
            // InternalGoLDSL.g:2222:2: ( ruleBoard )
            // InternalGoLDSL.g:2223:3: ruleBoard
            {
             before(grammarAccess.getDSLAccess().getBoardBoardParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBoard();

            state._fsp--;

             after(grammarAccess.getDSLAccess().getBoardBoardParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSL__BoardAssignment_0"


    // $ANTLR start "rule__DSL__RulesAssignment_1_0"
    // InternalGoLDSL.g:2232:1: rule__DSL__RulesAssignment_1_0 : ( ruleRule ) ;
    public final void rule__DSL__RulesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2236:1: ( ( ruleRule ) )
            // InternalGoLDSL.g:2237:2: ( ruleRule )
            {
            // InternalGoLDSL.g:2237:2: ( ruleRule )
            // InternalGoLDSL.g:2238:3: ruleRule
            {
             before(grammarAccess.getDSLAccess().getRulesRuleParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getDSLAccess().getRulesRuleParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSL__RulesAssignment_1_0"


    // $ANTLR start "rule__DSL__ShapesAssignment_1_1"
    // InternalGoLDSL.g:2247:1: rule__DSL__ShapesAssignment_1_1 : ( ruleShapeDef ) ;
    public final void rule__DSL__ShapesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2251:1: ( ( ruleShapeDef ) )
            // InternalGoLDSL.g:2252:2: ( ruleShapeDef )
            {
            // InternalGoLDSL.g:2252:2: ( ruleShapeDef )
            // InternalGoLDSL.g:2253:3: ruleShapeDef
            {
             before(grammarAccess.getDSLAccess().getShapesShapeDefParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleShapeDef();

            state._fsp--;

             after(grammarAccess.getDSLAccess().getShapesShapeDefParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSL__ShapesAssignment_1_1"


    // $ANTLR start "rule__Objects__ShapesAssignment_0"
    // InternalGoLDSL.g:2262:1: rule__Objects__ShapesAssignment_0 : ( ruleShapeRef ) ;
    public final void rule__Objects__ShapesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2266:1: ( ( ruleShapeRef ) )
            // InternalGoLDSL.g:2267:2: ( ruleShapeRef )
            {
            // InternalGoLDSL.g:2267:2: ( ruleShapeRef )
            // InternalGoLDSL.g:2268:3: ruleShapeRef
            {
             before(grammarAccess.getObjectsAccess().getShapesShapeRefParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleShapeRef();

            state._fsp--;

             after(grammarAccess.getObjectsAccess().getShapesShapeRefParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objects__ShapesAssignment_0"


    // $ANTLR start "rule__Objects__CellAssignment_1"
    // InternalGoLDSL.g:2277:1: rule__Objects__CellAssignment_1 : ( ruleCellDef ) ;
    public final void rule__Objects__CellAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2281:1: ( ( ruleCellDef ) )
            // InternalGoLDSL.g:2282:2: ( ruleCellDef )
            {
            // InternalGoLDSL.g:2282:2: ( ruleCellDef )
            // InternalGoLDSL.g:2283:3: ruleCellDef
            {
             before(grammarAccess.getObjectsAccess().getCellCellDefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCellDef();

            state._fsp--;

             after(grammarAccess.getObjectsAccess().getCellCellDefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objects__CellAssignment_1"


    // $ANTLR start "rule__Objects__CellsAssignment_2"
    // InternalGoLDSL.g:2292:1: rule__Objects__CellsAssignment_2 : ( ruleCells ) ;
    public final void rule__Objects__CellsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2296:1: ( ( ruleCells ) )
            // InternalGoLDSL.g:2297:2: ( ruleCells )
            {
            // InternalGoLDSL.g:2297:2: ( ruleCells )
            // InternalGoLDSL.g:2298:3: ruleCells
            {
             before(grammarAccess.getObjectsAccess().getCellsCellsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCells();

            state._fsp--;

             after(grammarAccess.getObjectsAccess().getCellsCellsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objects__CellsAssignment_2"


    // $ANTLR start "rule__Objects__GridsAssignment_3"
    // InternalGoLDSL.g:2307:1: rule__Objects__GridsAssignment_3 : ( ruleGrid ) ;
    public final void rule__Objects__GridsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2311:1: ( ( ruleGrid ) )
            // InternalGoLDSL.g:2312:2: ( ruleGrid )
            {
            // InternalGoLDSL.g:2312:2: ( ruleGrid )
            // InternalGoLDSL.g:2313:3: ruleGrid
            {
             before(grammarAccess.getObjectsAccess().getGridsGridParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGrid();

            state._fsp--;

             after(grammarAccess.getObjectsAccess().getGridsGridParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objects__GridsAssignment_3"


    // $ANTLR start "rule__ShapeDef__NameAssignment_1"
    // InternalGoLDSL.g:2322:1: rule__ShapeDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ShapeDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2326:1: ( ( RULE_ID ) )
            // InternalGoLDSL.g:2327:2: ( RULE_ID )
            {
            // InternalGoLDSL.g:2327:2: ( RULE_ID )
            // InternalGoLDSL.g:2328:3: RULE_ID
            {
             before(grammarAccess.getShapeDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getShapeDefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeDef__NameAssignment_1"


    // $ANTLR start "rule__ShapeDef__OffsetAssignment_3"
    // InternalGoLDSL.g:2337:1: rule__ShapeDef__OffsetAssignment_3 : ( ruleOffset ) ;
    public final void rule__ShapeDef__OffsetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2341:1: ( ( ruleOffset ) )
            // InternalGoLDSL.g:2342:2: ( ruleOffset )
            {
            // InternalGoLDSL.g:2342:2: ( ruleOffset )
            // InternalGoLDSL.g:2343:3: ruleOffset
            {
             before(grammarAccess.getShapeDefAccess().getOffsetOffsetParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOffset();

            state._fsp--;

             after(grammarAccess.getShapeDefAccess().getOffsetOffsetParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeDef__OffsetAssignment_3"


    // $ANTLR start "rule__ShapeDef__ObjectsAssignment_4"
    // InternalGoLDSL.g:2352:1: rule__ShapeDef__ObjectsAssignment_4 : ( ruleObjects ) ;
    public final void rule__ShapeDef__ObjectsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2356:1: ( ( ruleObjects ) )
            // InternalGoLDSL.g:2357:2: ( ruleObjects )
            {
            // InternalGoLDSL.g:2357:2: ( ruleObjects )
            // InternalGoLDSL.g:2358:3: ruleObjects
            {
             before(grammarAccess.getShapeDefAccess().getObjectsObjectsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleObjects();

            state._fsp--;

             after(grammarAccess.getShapeDefAccess().getObjectsObjectsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeDef__ObjectsAssignment_4"


    // $ANTLR start "rule__CellPairs__CellsAssignment_1"
    // InternalGoLDSL.g:2367:1: rule__CellPairs__CellsAssignment_1 : ( ruleCell ) ;
    public final void rule__CellPairs__CellsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2371:1: ( ( ruleCell ) )
            // InternalGoLDSL.g:2372:2: ( ruleCell )
            {
            // InternalGoLDSL.g:2372:2: ( ruleCell )
            // InternalGoLDSL.g:2373:3: ruleCell
            {
             before(grammarAccess.getCellPairsAccess().getCellsCellParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getCellPairsAccess().getCellsCellParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellPairs__CellsAssignment_1"


    // $ANTLR start "rule__CellDef__OffsetAssignment_1"
    // InternalGoLDSL.g:2382:1: rule__CellDef__OffsetAssignment_1 : ( ruleOffset ) ;
    public final void rule__CellDef__OffsetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2386:1: ( ( ruleOffset ) )
            // InternalGoLDSL.g:2387:2: ( ruleOffset )
            {
            // InternalGoLDSL.g:2387:2: ( ruleOffset )
            // InternalGoLDSL.g:2388:3: ruleOffset
            {
             before(grammarAccess.getCellDefAccess().getOffsetOffsetParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOffset();

            state._fsp--;

             after(grammarAccess.getCellDefAccess().getOffsetOffsetParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDef__OffsetAssignment_1"


    // $ANTLR start "rule__CellDef__CellAssignment_2"
    // InternalGoLDSL.g:2397:1: rule__CellDef__CellAssignment_2 : ( ruleCell ) ;
    public final void rule__CellDef__CellAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2401:1: ( ( ruleCell ) )
            // InternalGoLDSL.g:2402:2: ( ruleCell )
            {
            // InternalGoLDSL.g:2402:2: ( ruleCell )
            // InternalGoLDSL.g:2403:3: ruleCell
            {
             before(grammarAccess.getCellDefAccess().getCellCellParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getCellDefAccess().getCellCellParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDef__CellAssignment_2"


    // $ANTLR start "rule__ShapeRef__NameAssignment_1"
    // InternalGoLDSL.g:2412:1: rule__ShapeRef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ShapeRef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2416:1: ( ( RULE_ID ) )
            // InternalGoLDSL.g:2417:2: ( RULE_ID )
            {
            // InternalGoLDSL.g:2417:2: ( RULE_ID )
            // InternalGoLDSL.g:2418:3: RULE_ID
            {
             before(grammarAccess.getShapeRefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getShapeRefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeRef__NameAssignment_1"


    // $ANTLR start "rule__ShapeRef__XAssignment_3"
    // InternalGoLDSL.g:2427:1: rule__ShapeRef__XAssignment_3 : ( RULE_INT ) ;
    public final void rule__ShapeRef__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2431:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2432:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2432:2: ( RULE_INT )
            // InternalGoLDSL.g:2433:3: RULE_INT
            {
             before(grammarAccess.getShapeRefAccess().getXINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getShapeRefAccess().getXINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeRef__XAssignment_3"


    // $ANTLR start "rule__ShapeRef__YAssignment_5"
    // InternalGoLDSL.g:2442:1: rule__ShapeRef__YAssignment_5 : ( RULE_INT ) ;
    public final void rule__ShapeRef__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2446:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2447:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2447:2: ( RULE_INT )
            // InternalGoLDSL.g:2448:3: RULE_INT
            {
             before(grammarAccess.getShapeRefAccess().getYINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getShapeRefAccess().getYINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeRef__YAssignment_5"


    // $ANTLR start "rule__Cell__XAssignment_0"
    // InternalGoLDSL.g:2457:1: rule__Cell__XAssignment_0 : ( RULE_INT ) ;
    public final void rule__Cell__XAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2461:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2462:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2462:2: ( RULE_INT )
            // InternalGoLDSL.g:2463:3: RULE_INT
            {
             before(grammarAccess.getCellAccess().getXINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getXINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__XAssignment_0"


    // $ANTLR start "rule__Cell__YAssignment_2"
    // InternalGoLDSL.g:2472:1: rule__Cell__YAssignment_2 : ( RULE_INT ) ;
    public final void rule__Cell__YAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2476:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2477:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2477:2: ( RULE_INT )
            // InternalGoLDSL.g:2478:3: RULE_INT
            {
             before(grammarAccess.getCellAccess().getYINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getYINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__YAssignment_2"


    // $ANTLR start "rule__Rule__ConditionAssignment_1"
    // InternalGoLDSL.g:2487:1: rule__Rule__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2491:1: ( ( ruleCondition ) )
            // InternalGoLDSL.g:2492:2: ( ruleCondition )
            {
            // InternalGoLDSL.g:2492:2: ( ruleCondition )
            // InternalGoLDSL.g:2493:3: ruleCondition
            {
             before(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConditionAssignment_1"


    // $ANTLR start "rule__Rule__ActionAssignment_2"
    // InternalGoLDSL.g:2502:1: rule__Rule__ActionAssignment_2 : ( ruleAction ) ;
    public final void rule__Rule__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2506:1: ( ( ruleAction ) )
            // InternalGoLDSL.g:2507:2: ( ruleAction )
            {
            // InternalGoLDSL.g:2507:2: ( ruleAction )
            // InternalGoLDSL.g:2508:3: ruleAction
            {
             before(grammarAccess.getRuleAccess().getActionActionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getActionActionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ActionAssignment_2"


    // $ANTLR start "rule__ConditionRule__NumberAssignment_0"
    // InternalGoLDSL.g:2517:1: rule__ConditionRule__NumberAssignment_0 : ( RULE_INT ) ;
    public final void rule__ConditionRule__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2521:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2522:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2522:2: ( RULE_INT )
            // InternalGoLDSL.g:2523:3: RULE_INT
            {
             before(grammarAccess.getConditionRuleAccess().getNumberINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConditionRuleAccess().getNumberINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRule__NumberAssignment_0"


    // $ANTLR start "rule__ConditionRule__RangeAssignment_1"
    // InternalGoLDSL.g:2532:1: rule__ConditionRule__RangeAssignment_1 : ( ruleRange ) ;
    public final void rule__ConditionRule__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2536:1: ( ( ruleRange ) )
            // InternalGoLDSL.g:2537:2: ( ruleRange )
            {
            // InternalGoLDSL.g:2537:2: ( ruleRange )
            // InternalGoLDSL.g:2538:3: ruleRange
            {
             before(grammarAccess.getConditionRuleAccess().getRangeRangeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getConditionRuleAccess().getRangeRangeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRule__RangeAssignment_1"


    // $ANTLR start "rule__ConditionRule__AliveAssignment_2"
    // InternalGoLDSL.g:2547:1: rule__ConditionRule__AliveAssignment_2 : ( ( 'Alive' ) ) ;
    public final void rule__ConditionRule__AliveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2551:1: ( ( ( 'Alive' ) ) )
            // InternalGoLDSL.g:2552:2: ( ( 'Alive' ) )
            {
            // InternalGoLDSL.g:2552:2: ( ( 'Alive' ) )
            // InternalGoLDSL.g:2553:3: ( 'Alive' )
            {
             before(grammarAccess.getConditionRuleAccess().getAliveAliveKeyword_2_0()); 
            // InternalGoLDSL.g:2554:3: ( 'Alive' )
            // InternalGoLDSL.g:2555:4: 'Alive'
            {
             before(grammarAccess.getConditionRuleAccess().getAliveAliveKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConditionRuleAccess().getAliveAliveKeyword_2_0()); 

            }

             after(grammarAccess.getConditionRuleAccess().getAliveAliveKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRule__AliveAssignment_2"


    // $ANTLR start "rule__ConditionRule__DeadAssignment_3"
    // InternalGoLDSL.g:2566:1: rule__ConditionRule__DeadAssignment_3 : ( ( 'Dead' ) ) ;
    public final void rule__ConditionRule__DeadAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2570:1: ( ( ( 'Dead' ) ) )
            // InternalGoLDSL.g:2571:2: ( ( 'Dead' ) )
            {
            // InternalGoLDSL.g:2571:2: ( ( 'Dead' ) )
            // InternalGoLDSL.g:2572:3: ( 'Dead' )
            {
             before(grammarAccess.getConditionRuleAccess().getDeadDeadKeyword_3_0()); 
            // InternalGoLDSL.g:2573:3: ( 'Dead' )
            // InternalGoLDSL.g:2574:4: 'Dead'
            {
             before(grammarAccess.getConditionRuleAccess().getDeadDeadKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getConditionRuleAccess().getDeadDeadKeyword_3_0()); 

            }

             after(grammarAccess.getConditionRuleAccess().getDeadDeadKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRule__DeadAssignment_3"


    // $ANTLR start "rule__ConditionRules__Rule1Assignment_0"
    // InternalGoLDSL.g:2585:1: rule__ConditionRules__Rule1Assignment_0 : ( ruleConditionRule ) ;
    public final void rule__ConditionRules__Rule1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2589:1: ( ( ruleConditionRule ) )
            // InternalGoLDSL.g:2590:2: ( ruleConditionRule )
            {
            // InternalGoLDSL.g:2590:2: ( ruleConditionRule )
            // InternalGoLDSL.g:2591:3: ruleConditionRule
            {
             before(grammarAccess.getConditionRulesAccess().getRule1ConditionRuleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionRule();

            state._fsp--;

             after(grammarAccess.getConditionRulesAccess().getRule1ConditionRuleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRules__Rule1Assignment_0"


    // $ANTLR start "rule__ConditionRules__OperatorAssignment_1_0"
    // InternalGoLDSL.g:2600:1: rule__ConditionRules__OperatorAssignment_1_0 : ( ruleBoolOperator ) ;
    public final void rule__ConditionRules__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2604:1: ( ( ruleBoolOperator ) )
            // InternalGoLDSL.g:2605:2: ( ruleBoolOperator )
            {
            // InternalGoLDSL.g:2605:2: ( ruleBoolOperator )
            // InternalGoLDSL.g:2606:3: ruleBoolOperator
            {
             before(grammarAccess.getConditionRulesAccess().getOperatorBoolOperatorEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolOperator();

            state._fsp--;

             after(grammarAccess.getConditionRulesAccess().getOperatorBoolOperatorEnumRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRules__OperatorAssignment_1_0"


    // $ANTLR start "rule__ConditionRules__Rule2Assignment_1_1"
    // InternalGoLDSL.g:2615:1: rule__ConditionRules__Rule2Assignment_1_1 : ( ruleConditionRules ) ;
    public final void rule__ConditionRules__Rule2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2619:1: ( ( ruleConditionRules ) )
            // InternalGoLDSL.g:2620:2: ( ruleConditionRules )
            {
            // InternalGoLDSL.g:2620:2: ( ruleConditionRules )
            // InternalGoLDSL.g:2621:3: ruleConditionRules
            {
             before(grammarAccess.getConditionRulesAccess().getRule2ConditionRulesParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionRules();

            state._fsp--;

             after(grammarAccess.getConditionRulesAccess().getRule2ConditionRulesParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRules__Rule2Assignment_1_1"


    // $ANTLR start "rule__BoundedRange__LowerBoundAssignment_0"
    // InternalGoLDSL.g:2630:1: rule__BoundedRange__LowerBoundAssignment_0 : ( RULE_INT ) ;
    public final void rule__BoundedRange__LowerBoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2634:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2635:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2635:2: ( RULE_INT )
            // InternalGoLDSL.g:2636:3: RULE_INT
            {
             before(grammarAccess.getBoundedRangeAccess().getLowerBoundINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBoundedRangeAccess().getLowerBoundINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundedRange__LowerBoundAssignment_0"


    // $ANTLR start "rule__BoundedRange__HigherBoundAssignment_2"
    // InternalGoLDSL.g:2645:1: rule__BoundedRange__HigherBoundAssignment_2 : ( RULE_INT ) ;
    public final void rule__BoundedRange__HigherBoundAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2649:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2650:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2650:2: ( RULE_INT )
            // InternalGoLDSL.g:2651:3: RULE_INT
            {
             before(grammarAccess.getBoundedRangeAccess().getHigherBoundINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBoundedRangeAccess().getHigherBoundINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundedRange__HigherBoundAssignment_2"


    // $ANTLR start "rule__LeftUnboundedRange__LowerBoundAssignment_0"
    // InternalGoLDSL.g:2660:1: rule__LeftUnboundedRange__LowerBoundAssignment_0 : ( RULE_INT ) ;
    public final void rule__LeftUnboundedRange__LowerBoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2664:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2665:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2665:2: ( RULE_INT )
            // InternalGoLDSL.g:2666:3: RULE_INT
            {
             before(grammarAccess.getLeftUnboundedRangeAccess().getLowerBoundINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLeftUnboundedRangeAccess().getLowerBoundINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftUnboundedRange__LowerBoundAssignment_0"


    // $ANTLR start "rule__RightUnboundedRange__HigherBoundAssignment_1"
    // InternalGoLDSL.g:2675:1: rule__RightUnboundedRange__HigherBoundAssignment_1 : ( RULE_INT ) ;
    public final void rule__RightUnboundedRange__HigherBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2679:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2680:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2680:2: ( RULE_INT )
            // InternalGoLDSL.g:2681:3: RULE_INT
            {
             before(grammarAccess.getRightUnboundedRangeAccess().getHigherBoundINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRightUnboundedRangeAccess().getHigherBoundINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightUnboundedRange__HigherBoundAssignment_1"


    // $ANTLR start "rule__Grid__SizeAssignment_1"
    // InternalGoLDSL.g:2690:1: rule__Grid__SizeAssignment_1 : ( ruleSize ) ;
    public final void rule__Grid__SizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2694:1: ( ( ruleSize ) )
            // InternalGoLDSL.g:2695:2: ( ruleSize )
            {
            // InternalGoLDSL.g:2695:2: ( ruleSize )
            // InternalGoLDSL.g:2696:3: ruleSize
            {
             before(grammarAccess.getGridAccess().getSizeSizeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getGridAccess().getSizeSizeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__SizeAssignment_1"


    // $ANTLR start "rule__Grid__PartsAssignment_2"
    // InternalGoLDSL.g:2705:1: rule__Grid__PartsAssignment_2 : ( ruleGridPart ) ;
    public final void rule__Grid__PartsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2709:1: ( ( ruleGridPart ) )
            // InternalGoLDSL.g:2710:2: ( ruleGridPart )
            {
            // InternalGoLDSL.g:2710:2: ( ruleGridPart )
            // InternalGoLDSL.g:2711:3: ruleGridPart
            {
             before(grammarAccess.getGridAccess().getPartsGridPartEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGridPart();

            state._fsp--;

             after(grammarAccess.getGridAccess().getPartsGridPartEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__PartsAssignment_2"


    // $ANTLR start "rule__Offset__XAssignment_1"
    // InternalGoLDSL.g:2720:1: rule__Offset__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Offset__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2724:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2725:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2725:2: ( RULE_INT )
            // InternalGoLDSL.g:2726:3: RULE_INT
            {
             before(grammarAccess.getOffsetAccess().getXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOffsetAccess().getXINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Offset__XAssignment_1"


    // $ANTLR start "rule__Offset__YAssignment_2"
    // InternalGoLDSL.g:2735:1: rule__Offset__YAssignment_2 : ( RULE_INT ) ;
    public final void rule__Offset__YAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2739:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2740:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2740:2: ( RULE_INT )
            // InternalGoLDSL.g:2741:3: RULE_INT
            {
             before(grammarAccess.getOffsetAccess().getYINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOffsetAccess().getYINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Offset__YAssignment_2"


    // $ANTLR start "rule__Size__WidthAssignment_1"
    // InternalGoLDSL.g:2750:1: rule__Size__WidthAssignment_1 : ( RULE_INT ) ;
    public final void rule__Size__WidthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2754:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2755:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2755:2: ( RULE_INT )
            // InternalGoLDSL.g:2756:3: RULE_INT
            {
             before(grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__WidthAssignment_1"


    // $ANTLR start "rule__Size__HeightAssignment_2"
    // InternalGoLDSL.g:2765:1: rule__Size__HeightAssignment_2 : ( RULE_INT ) ;
    public final void rule__Size__HeightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2769:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2770:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2770:2: ( RULE_INT )
            // InternalGoLDSL.g:2771:3: RULE_INT
            {
             before(grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__HeightAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008310002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000810002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008310000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000018310000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000C4000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000006002L});

}