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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'&'", "'|'", "'+'", "'-'", "'Board:'", "'Shape'", "':'", "'('", "')'", "'Cells:'", "'Cell:'", "','", "'Rule:'", "'Create'", "'If'", "'..'", "'Grid:'", "'offset'", "'size'", "'IsAlive'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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


    // $ANTLR start "entryRuleUnboundedRange"
    // InternalGoLDSL.g:467:1: entryRuleUnboundedRange : ruleUnboundedRange EOF ;
    public final void entryRuleUnboundedRange() throws RecognitionException {
        try {
            // InternalGoLDSL.g:468:1: ( ruleUnboundedRange EOF )
            // InternalGoLDSL.g:469:1: ruleUnboundedRange EOF
            {
             before(grammarAccess.getUnboundedRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleUnboundedRange();

            state._fsp--;

             after(grammarAccess.getUnboundedRangeRule()); 
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
    // $ANTLR end "entryRuleUnboundedRange"


    // $ANTLR start "ruleUnboundedRange"
    // InternalGoLDSL.g:476:1: ruleUnboundedRange : ( ( rule__UnboundedRange__Alternatives ) ) ;
    public final void ruleUnboundedRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:480:2: ( ( ( rule__UnboundedRange__Alternatives ) ) )
            // InternalGoLDSL.g:481:2: ( ( rule__UnboundedRange__Alternatives ) )
            {
            // InternalGoLDSL.g:481:2: ( ( rule__UnboundedRange__Alternatives ) )
            // InternalGoLDSL.g:482:3: ( rule__UnboundedRange__Alternatives )
            {
             before(grammarAccess.getUnboundedRangeAccess().getAlternatives()); 
            // InternalGoLDSL.g:483:3: ( rule__UnboundedRange__Alternatives )
            // InternalGoLDSL.g:483:4: rule__UnboundedRange__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnboundedRange__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnboundedRangeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnboundedRange"


    // $ANTLR start "entryRuleLeftUnboundedRange"
    // InternalGoLDSL.g:492:1: entryRuleLeftUnboundedRange : ruleLeftUnboundedRange EOF ;
    public final void entryRuleLeftUnboundedRange() throws RecognitionException {
        try {
            // InternalGoLDSL.g:493:1: ( ruleLeftUnboundedRange EOF )
            // InternalGoLDSL.g:494:1: ruleLeftUnboundedRange EOF
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
    // InternalGoLDSL.g:501:1: ruleLeftUnboundedRange : ( ( rule__LeftUnboundedRange__Group__0 ) ) ;
    public final void ruleLeftUnboundedRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:505:2: ( ( ( rule__LeftUnboundedRange__Group__0 ) ) )
            // InternalGoLDSL.g:506:2: ( ( rule__LeftUnboundedRange__Group__0 ) )
            {
            // InternalGoLDSL.g:506:2: ( ( rule__LeftUnboundedRange__Group__0 ) )
            // InternalGoLDSL.g:507:3: ( rule__LeftUnboundedRange__Group__0 )
            {
             before(grammarAccess.getLeftUnboundedRangeAccess().getGroup()); 
            // InternalGoLDSL.g:508:3: ( rule__LeftUnboundedRange__Group__0 )
            // InternalGoLDSL.g:508:4: rule__LeftUnboundedRange__Group__0
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
    // InternalGoLDSL.g:517:1: entryRuleRightUnboundedRange : ruleRightUnboundedRange EOF ;
    public final void entryRuleRightUnboundedRange() throws RecognitionException {
        try {
            // InternalGoLDSL.g:518:1: ( ruleRightUnboundedRange EOF )
            // InternalGoLDSL.g:519:1: ruleRightUnboundedRange EOF
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
    // InternalGoLDSL.g:526:1: ruleRightUnboundedRange : ( ( rule__RightUnboundedRange__Group__0 ) ) ;
    public final void ruleRightUnboundedRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:530:2: ( ( ( rule__RightUnboundedRange__Group__0 ) ) )
            // InternalGoLDSL.g:531:2: ( ( rule__RightUnboundedRange__Group__0 ) )
            {
            // InternalGoLDSL.g:531:2: ( ( rule__RightUnboundedRange__Group__0 ) )
            // InternalGoLDSL.g:532:3: ( rule__RightUnboundedRange__Group__0 )
            {
             before(grammarAccess.getRightUnboundedRangeAccess().getGroup()); 
            // InternalGoLDSL.g:533:3: ( rule__RightUnboundedRange__Group__0 )
            // InternalGoLDSL.g:533:4: rule__RightUnboundedRange__Group__0
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
    // InternalGoLDSL.g:542:1: entryRuleGrid : ruleGrid EOF ;
    public final void entryRuleGrid() throws RecognitionException {
        try {
            // InternalGoLDSL.g:543:1: ( ruleGrid EOF )
            // InternalGoLDSL.g:544:1: ruleGrid EOF
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
    // InternalGoLDSL.g:551:1: ruleGrid : ( ( rule__Grid__Group__0 ) ) ;
    public final void ruleGrid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:555:2: ( ( ( rule__Grid__Group__0 ) ) )
            // InternalGoLDSL.g:556:2: ( ( rule__Grid__Group__0 ) )
            {
            // InternalGoLDSL.g:556:2: ( ( rule__Grid__Group__0 ) )
            // InternalGoLDSL.g:557:3: ( rule__Grid__Group__0 )
            {
             before(grammarAccess.getGridAccess().getGroup()); 
            // InternalGoLDSL.g:558:3: ( rule__Grid__Group__0 )
            // InternalGoLDSL.g:558:4: rule__Grid__Group__0
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
    // InternalGoLDSL.g:567:1: entryRuleOffset : ruleOffset EOF ;
    public final void entryRuleOffset() throws RecognitionException {
        try {
            // InternalGoLDSL.g:568:1: ( ruleOffset EOF )
            // InternalGoLDSL.g:569:1: ruleOffset EOF
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
    // InternalGoLDSL.g:576:1: ruleOffset : ( ( rule__Offset__Group__0 ) ) ;
    public final void ruleOffset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:580:2: ( ( ( rule__Offset__Group__0 ) ) )
            // InternalGoLDSL.g:581:2: ( ( rule__Offset__Group__0 ) )
            {
            // InternalGoLDSL.g:581:2: ( ( rule__Offset__Group__0 ) )
            // InternalGoLDSL.g:582:3: ( rule__Offset__Group__0 )
            {
             before(grammarAccess.getOffsetAccess().getGroup()); 
            // InternalGoLDSL.g:583:3: ( rule__Offset__Group__0 )
            // InternalGoLDSL.g:583:4: rule__Offset__Group__0
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
    // InternalGoLDSL.g:592:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // InternalGoLDSL.g:593:1: ( ruleSize EOF )
            // InternalGoLDSL.g:594:1: ruleSize EOF
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
    // InternalGoLDSL.g:601:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:605:2: ( ( ( rule__Size__Group__0 ) ) )
            // InternalGoLDSL.g:606:2: ( ( rule__Size__Group__0 ) )
            {
            // InternalGoLDSL.g:606:2: ( ( rule__Size__Group__0 ) )
            // InternalGoLDSL.g:607:3: ( rule__Size__Group__0 )
            {
             before(grammarAccess.getSizeAccess().getGroup()); 
            // InternalGoLDSL.g:608:3: ( rule__Size__Group__0 )
            // InternalGoLDSL.g:608:4: rule__Size__Group__0
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
    // InternalGoLDSL.g:617:1: ruleBoolOperator : ( ( rule__BoolOperator__Alternatives ) ) ;
    public final void ruleBoolOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:621:1: ( ( ( rule__BoolOperator__Alternatives ) ) )
            // InternalGoLDSL.g:622:2: ( ( rule__BoolOperator__Alternatives ) )
            {
            // InternalGoLDSL.g:622:2: ( ( rule__BoolOperator__Alternatives ) )
            // InternalGoLDSL.g:623:3: ( rule__BoolOperator__Alternatives )
            {
             before(grammarAccess.getBoolOperatorAccess().getAlternatives()); 
            // InternalGoLDSL.g:624:3: ( rule__BoolOperator__Alternatives )
            // InternalGoLDSL.g:624:4: rule__BoolOperator__Alternatives
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
    // InternalGoLDSL.g:633:1: ruleGridPart : ( ( rule__GridPart__Alternatives ) ) ;
    public final void ruleGridPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:637:1: ( ( ( rule__GridPart__Alternatives ) ) )
            // InternalGoLDSL.g:638:2: ( ( rule__GridPart__Alternatives ) )
            {
            // InternalGoLDSL.g:638:2: ( ( rule__GridPart__Alternatives ) )
            // InternalGoLDSL.g:639:3: ( rule__GridPart__Alternatives )
            {
             before(grammarAccess.getGridPartAccess().getAlternatives()); 
            // InternalGoLDSL.g:640:3: ( rule__GridPart__Alternatives )
            // InternalGoLDSL.g:640:4: rule__GridPart__Alternatives
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
    // InternalGoLDSL.g:648:1: rule__DSL__Alternatives_1 : ( ( ( rule__DSL__RulesAssignment_1_0 ) ) | ( ( rule__DSL__ShapesAssignment_1_1 ) ) );
    public final void rule__DSL__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:652:1: ( ( ( rule__DSL__RulesAssignment_1_0 ) ) | ( ( rule__DSL__ShapesAssignment_1_1 ) ) )
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
                    // InternalGoLDSL.g:653:2: ( ( rule__DSL__RulesAssignment_1_0 ) )
                    {
                    // InternalGoLDSL.g:653:2: ( ( rule__DSL__RulesAssignment_1_0 ) )
                    // InternalGoLDSL.g:654:3: ( rule__DSL__RulesAssignment_1_0 )
                    {
                     before(grammarAccess.getDSLAccess().getRulesAssignment_1_0()); 
                    // InternalGoLDSL.g:655:3: ( rule__DSL__RulesAssignment_1_0 )
                    // InternalGoLDSL.g:655:4: rule__DSL__RulesAssignment_1_0
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
                    // InternalGoLDSL.g:659:2: ( ( rule__DSL__ShapesAssignment_1_1 ) )
                    {
                    // InternalGoLDSL.g:659:2: ( ( rule__DSL__ShapesAssignment_1_1 ) )
                    // InternalGoLDSL.g:660:3: ( rule__DSL__ShapesAssignment_1_1 )
                    {
                     before(grammarAccess.getDSLAccess().getShapesAssignment_1_1()); 
                    // InternalGoLDSL.g:661:3: ( rule__DSL__ShapesAssignment_1_1 )
                    // InternalGoLDSL.g:661:4: rule__DSL__ShapesAssignment_1_1
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
    // InternalGoLDSL.g:669:1: rule__Objects__Alternatives : ( ( ( rule__Objects__ShapesAssignment_0 ) ) | ( ( rule__Objects__CellAssignment_1 ) ) | ( ( rule__Objects__CellsAssignment_2 ) ) | ( ( rule__Objects__GridsAssignment_3 ) ) );
    public final void rule__Objects__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:673:1: ( ( ( rule__Objects__ShapesAssignment_0 ) ) | ( ( rule__Objects__CellAssignment_1 ) ) | ( ( rule__Objects__CellsAssignment_2 ) ) | ( ( rule__Objects__GridsAssignment_3 ) ) )
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
                    // InternalGoLDSL.g:674:2: ( ( rule__Objects__ShapesAssignment_0 ) )
                    {
                    // InternalGoLDSL.g:674:2: ( ( rule__Objects__ShapesAssignment_0 ) )
                    // InternalGoLDSL.g:675:3: ( rule__Objects__ShapesAssignment_0 )
                    {
                     before(grammarAccess.getObjectsAccess().getShapesAssignment_0()); 
                    // InternalGoLDSL.g:676:3: ( rule__Objects__ShapesAssignment_0 )
                    // InternalGoLDSL.g:676:4: rule__Objects__ShapesAssignment_0
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
                    // InternalGoLDSL.g:680:2: ( ( rule__Objects__CellAssignment_1 ) )
                    {
                    // InternalGoLDSL.g:680:2: ( ( rule__Objects__CellAssignment_1 ) )
                    // InternalGoLDSL.g:681:3: ( rule__Objects__CellAssignment_1 )
                    {
                     before(grammarAccess.getObjectsAccess().getCellAssignment_1()); 
                    // InternalGoLDSL.g:682:3: ( rule__Objects__CellAssignment_1 )
                    // InternalGoLDSL.g:682:4: rule__Objects__CellAssignment_1
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
                    // InternalGoLDSL.g:686:2: ( ( rule__Objects__CellsAssignment_2 ) )
                    {
                    // InternalGoLDSL.g:686:2: ( ( rule__Objects__CellsAssignment_2 ) )
                    // InternalGoLDSL.g:687:3: ( rule__Objects__CellsAssignment_2 )
                    {
                     before(grammarAccess.getObjectsAccess().getCellsAssignment_2()); 
                    // InternalGoLDSL.g:688:3: ( rule__Objects__CellsAssignment_2 )
                    // InternalGoLDSL.g:688:4: rule__Objects__CellsAssignment_2
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
                    // InternalGoLDSL.g:692:2: ( ( rule__Objects__GridsAssignment_3 ) )
                    {
                    // InternalGoLDSL.g:692:2: ( ( rule__Objects__GridsAssignment_3 ) )
                    // InternalGoLDSL.g:693:3: ( rule__Objects__GridsAssignment_3 )
                    {
                     before(grammarAccess.getObjectsAccess().getGridsAssignment_3()); 
                    // InternalGoLDSL.g:694:3: ( rule__Objects__GridsAssignment_3 )
                    // InternalGoLDSL.g:694:4: rule__Objects__GridsAssignment_3
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
    // InternalGoLDSL.g:702:1: rule__ConditionRule__Alternatives : ( ( ( rule__ConditionRule__NumberAssignment_0 ) ) | ( ( rule__ConditionRule__RangeAssignment_1 ) ) | ( ( rule__ConditionRule__AliveAssignment_2 ) ) );
    public final void rule__ConditionRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:706:1: ( ( ( rule__ConditionRule__NumberAssignment_0 ) ) | ( ( rule__ConditionRule__RangeAssignment_1 ) ) | ( ( rule__ConditionRule__AliveAssignment_2 ) ) )
            int alt5=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGoLDSL.g:707:2: ( ( rule__ConditionRule__NumberAssignment_0 ) )
                    {
                    // InternalGoLDSL.g:707:2: ( ( rule__ConditionRule__NumberAssignment_0 ) )
                    // InternalGoLDSL.g:708:3: ( rule__ConditionRule__NumberAssignment_0 )
                    {
                     before(grammarAccess.getConditionRuleAccess().getNumberAssignment_0()); 
                    // InternalGoLDSL.g:709:3: ( rule__ConditionRule__NumberAssignment_0 )
                    // InternalGoLDSL.g:709:4: rule__ConditionRule__NumberAssignment_0
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
                    // InternalGoLDSL.g:713:2: ( ( rule__ConditionRule__RangeAssignment_1 ) )
                    {
                    // InternalGoLDSL.g:713:2: ( ( rule__ConditionRule__RangeAssignment_1 ) )
                    // InternalGoLDSL.g:714:3: ( rule__ConditionRule__RangeAssignment_1 )
                    {
                     before(grammarAccess.getConditionRuleAccess().getRangeAssignment_1()); 
                    // InternalGoLDSL.g:715:3: ( rule__ConditionRule__RangeAssignment_1 )
                    // InternalGoLDSL.g:715:4: rule__ConditionRule__RangeAssignment_1
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
                    // InternalGoLDSL.g:719:2: ( ( rule__ConditionRule__AliveAssignment_2 ) )
                    {
                    // InternalGoLDSL.g:719:2: ( ( rule__ConditionRule__AliveAssignment_2 ) )
                    // InternalGoLDSL.g:720:3: ( rule__ConditionRule__AliveAssignment_2 )
                    {
                     before(grammarAccess.getConditionRuleAccess().getAliveAssignment_2()); 
                    // InternalGoLDSL.g:721:3: ( rule__ConditionRule__AliveAssignment_2 )
                    // InternalGoLDSL.g:721:4: rule__ConditionRule__AliveAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionRule__AliveAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionRuleAccess().getAliveAssignment_2()); 

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
    // InternalGoLDSL.g:729:1: rule__Range__Alternatives : ( ( ( rule__Range__BoundedAssignment_0 ) ) | ( ( rule__Range__UnboundedAssignment_1 ) ) );
    public final void rule__Range__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:733:1: ( ( ( rule__Range__BoundedAssignment_0 ) ) | ( ( rule__Range__UnboundedAssignment_1 ) ) )
            int alt6=2;
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
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGoLDSL.g:734:2: ( ( rule__Range__BoundedAssignment_0 ) )
                    {
                    // InternalGoLDSL.g:734:2: ( ( rule__Range__BoundedAssignment_0 ) )
                    // InternalGoLDSL.g:735:3: ( rule__Range__BoundedAssignment_0 )
                    {
                     before(grammarAccess.getRangeAccess().getBoundedAssignment_0()); 
                    // InternalGoLDSL.g:736:3: ( rule__Range__BoundedAssignment_0 )
                    // InternalGoLDSL.g:736:4: rule__Range__BoundedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Range__BoundedAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRangeAccess().getBoundedAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:740:2: ( ( rule__Range__UnboundedAssignment_1 ) )
                    {
                    // InternalGoLDSL.g:740:2: ( ( rule__Range__UnboundedAssignment_1 ) )
                    // InternalGoLDSL.g:741:3: ( rule__Range__UnboundedAssignment_1 )
                    {
                     before(grammarAccess.getRangeAccess().getUnboundedAssignment_1()); 
                    // InternalGoLDSL.g:742:3: ( rule__Range__UnboundedAssignment_1 )
                    // InternalGoLDSL.g:742:4: rule__Range__UnboundedAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Range__UnboundedAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRangeAccess().getUnboundedAssignment_1()); 

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


    // $ANTLR start "rule__UnboundedRange__Alternatives"
    // InternalGoLDSL.g:750:1: rule__UnboundedRange__Alternatives : ( ( ( rule__UnboundedRange__LeftAssignment_0 ) ) | ( ( rule__UnboundedRange__RightAssignment_1 ) ) );
    public final void rule__UnboundedRange__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:754:1: ( ( ( rule__UnboundedRange__LeftAssignment_0 ) ) | ( ( rule__UnboundedRange__RightAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==26) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGoLDSL.g:755:2: ( ( rule__UnboundedRange__LeftAssignment_0 ) )
                    {
                    // InternalGoLDSL.g:755:2: ( ( rule__UnboundedRange__LeftAssignment_0 ) )
                    // InternalGoLDSL.g:756:3: ( rule__UnboundedRange__LeftAssignment_0 )
                    {
                     before(grammarAccess.getUnboundedRangeAccess().getLeftAssignment_0()); 
                    // InternalGoLDSL.g:757:3: ( rule__UnboundedRange__LeftAssignment_0 )
                    // InternalGoLDSL.g:757:4: rule__UnboundedRange__LeftAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnboundedRange__LeftAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnboundedRangeAccess().getLeftAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:761:2: ( ( rule__UnboundedRange__RightAssignment_1 ) )
                    {
                    // InternalGoLDSL.g:761:2: ( ( rule__UnboundedRange__RightAssignment_1 ) )
                    // InternalGoLDSL.g:762:3: ( rule__UnboundedRange__RightAssignment_1 )
                    {
                     before(grammarAccess.getUnboundedRangeAccess().getRightAssignment_1()); 
                    // InternalGoLDSL.g:763:3: ( rule__UnboundedRange__RightAssignment_1 )
                    // InternalGoLDSL.g:763:4: rule__UnboundedRange__RightAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnboundedRange__RightAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnboundedRangeAccess().getRightAssignment_1()); 

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
    // $ANTLR end "rule__UnboundedRange__Alternatives"


    // $ANTLR start "rule__BoolOperator__Alternatives"
    // InternalGoLDSL.g:771:1: rule__BoolOperator__Alternatives : ( ( ( '&' ) ) | ( ( '|' ) ) );
    public final void rule__BoolOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:775:1: ( ( ( '&' ) ) | ( ( '|' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            else if ( (LA8_0==12) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGoLDSL.g:776:2: ( ( '&' ) )
                    {
                    // InternalGoLDSL.g:776:2: ( ( '&' ) )
                    // InternalGoLDSL.g:777:3: ( '&' )
                    {
                     before(grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalGoLDSL.g:778:3: ( '&' )
                    // InternalGoLDSL.g:778:4: '&'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:782:2: ( ( '|' ) )
                    {
                    // InternalGoLDSL.g:782:2: ( ( '|' ) )
                    // InternalGoLDSL.g:783:3: ( '|' )
                    {
                     before(grammarAccess.getBoolOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalGoLDSL.g:784:3: ( '|' )
                    // InternalGoLDSL.g:784:4: '|'
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
    // InternalGoLDSL.g:792:1: rule__GridPart__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__GridPart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:796:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            else if ( (LA9_0==14) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGoLDSL.g:797:2: ( ( '+' ) )
                    {
                    // InternalGoLDSL.g:797:2: ( ( '+' ) )
                    // InternalGoLDSL.g:798:3: ( '+' )
                    {
                     before(grammarAccess.getGridPartAccess().getALIVEEnumLiteralDeclaration_0()); 
                    // InternalGoLDSL.g:799:3: ( '+' )
                    // InternalGoLDSL.g:799:4: '+'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getGridPartAccess().getALIVEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:803:2: ( ( '-' ) )
                    {
                    // InternalGoLDSL.g:803:2: ( ( '-' ) )
                    // InternalGoLDSL.g:804:3: ( '-' )
                    {
                     before(grammarAccess.getGridPartAccess().getDEADEnumLiteralDeclaration_1()); 
                    // InternalGoLDSL.g:805:3: ( '-' )
                    // InternalGoLDSL.g:805:4: '-'
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
    // InternalGoLDSL.g:813:1: rule__DSL__Group__0 : rule__DSL__Group__0__Impl rule__DSL__Group__1 ;
    public final void rule__DSL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:817:1: ( rule__DSL__Group__0__Impl rule__DSL__Group__1 )
            // InternalGoLDSL.g:818:2: rule__DSL__Group__0__Impl rule__DSL__Group__1
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
    // InternalGoLDSL.g:825:1: rule__DSL__Group__0__Impl : ( ( rule__DSL__BoardAssignment_0 ) ) ;
    public final void rule__DSL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:829:1: ( ( ( rule__DSL__BoardAssignment_0 ) ) )
            // InternalGoLDSL.g:830:1: ( ( rule__DSL__BoardAssignment_0 ) )
            {
            // InternalGoLDSL.g:830:1: ( ( rule__DSL__BoardAssignment_0 ) )
            // InternalGoLDSL.g:831:2: ( rule__DSL__BoardAssignment_0 )
            {
             before(grammarAccess.getDSLAccess().getBoardAssignment_0()); 
            // InternalGoLDSL.g:832:2: ( rule__DSL__BoardAssignment_0 )
            // InternalGoLDSL.g:832:3: rule__DSL__BoardAssignment_0
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
    // InternalGoLDSL.g:840:1: rule__DSL__Group__1 : rule__DSL__Group__1__Impl ;
    public final void rule__DSL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:844:1: ( rule__DSL__Group__1__Impl )
            // InternalGoLDSL.g:845:2: rule__DSL__Group__1__Impl
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
    // InternalGoLDSL.g:851:1: rule__DSL__Group__1__Impl : ( ( rule__DSL__Alternatives_1 )* ) ;
    public final void rule__DSL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:855:1: ( ( ( rule__DSL__Alternatives_1 )* ) )
            // InternalGoLDSL.g:856:1: ( ( rule__DSL__Alternatives_1 )* )
            {
            // InternalGoLDSL.g:856:1: ( ( rule__DSL__Alternatives_1 )* )
            // InternalGoLDSL.g:857:2: ( rule__DSL__Alternatives_1 )*
            {
             before(grammarAccess.getDSLAccess().getAlternatives_1()); 
            // InternalGoLDSL.g:858:2: ( rule__DSL__Alternatives_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16||LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGoLDSL.g:858:3: rule__DSL__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DSL__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalGoLDSL.g:867:1: rule__Board__Group__0 : rule__Board__Group__0__Impl rule__Board__Group__1 ;
    public final void rule__Board__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:871:1: ( rule__Board__Group__0__Impl rule__Board__Group__1 )
            // InternalGoLDSL.g:872:2: rule__Board__Group__0__Impl rule__Board__Group__1
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
    // InternalGoLDSL.g:879:1: rule__Board__Group__0__Impl : ( 'Board:' ) ;
    public final void rule__Board__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:883:1: ( ( 'Board:' ) )
            // InternalGoLDSL.g:884:1: ( 'Board:' )
            {
            // InternalGoLDSL.g:884:1: ( 'Board:' )
            // InternalGoLDSL.g:885:2: 'Board:'
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
    // InternalGoLDSL.g:894:1: rule__Board__Group__1 : rule__Board__Group__1__Impl ;
    public final void rule__Board__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:898:1: ( rule__Board__Group__1__Impl )
            // InternalGoLDSL.g:899:2: rule__Board__Group__1__Impl
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
    // InternalGoLDSL.g:905:1: rule__Board__Group__1__Impl : ( ruleObjects ) ;
    public final void rule__Board__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:909:1: ( ( ruleObjects ) )
            // InternalGoLDSL.g:910:1: ( ruleObjects )
            {
            // InternalGoLDSL.g:910:1: ( ruleObjects )
            // InternalGoLDSL.g:911:2: ruleObjects
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
    // InternalGoLDSL.g:921:1: rule__ShapeDef__Group__0 : rule__ShapeDef__Group__0__Impl rule__ShapeDef__Group__1 ;
    public final void rule__ShapeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:925:1: ( rule__ShapeDef__Group__0__Impl rule__ShapeDef__Group__1 )
            // InternalGoLDSL.g:926:2: rule__ShapeDef__Group__0__Impl rule__ShapeDef__Group__1
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
    // InternalGoLDSL.g:933:1: rule__ShapeDef__Group__0__Impl : ( 'Shape' ) ;
    public final void rule__ShapeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:937:1: ( ( 'Shape' ) )
            // InternalGoLDSL.g:938:1: ( 'Shape' )
            {
            // InternalGoLDSL.g:938:1: ( 'Shape' )
            // InternalGoLDSL.g:939:2: 'Shape'
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
    // InternalGoLDSL.g:948:1: rule__ShapeDef__Group__1 : rule__ShapeDef__Group__1__Impl rule__ShapeDef__Group__2 ;
    public final void rule__ShapeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:952:1: ( rule__ShapeDef__Group__1__Impl rule__ShapeDef__Group__2 )
            // InternalGoLDSL.g:953:2: rule__ShapeDef__Group__1__Impl rule__ShapeDef__Group__2
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
    // InternalGoLDSL.g:960:1: rule__ShapeDef__Group__1__Impl : ( ( rule__ShapeDef__NameAssignment_1 ) ) ;
    public final void rule__ShapeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:964:1: ( ( ( rule__ShapeDef__NameAssignment_1 ) ) )
            // InternalGoLDSL.g:965:1: ( ( rule__ShapeDef__NameAssignment_1 ) )
            {
            // InternalGoLDSL.g:965:1: ( ( rule__ShapeDef__NameAssignment_1 ) )
            // InternalGoLDSL.g:966:2: ( rule__ShapeDef__NameAssignment_1 )
            {
             before(grammarAccess.getShapeDefAccess().getNameAssignment_1()); 
            // InternalGoLDSL.g:967:2: ( rule__ShapeDef__NameAssignment_1 )
            // InternalGoLDSL.g:967:3: rule__ShapeDef__NameAssignment_1
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
    // InternalGoLDSL.g:975:1: rule__ShapeDef__Group__2 : rule__ShapeDef__Group__2__Impl rule__ShapeDef__Group__3 ;
    public final void rule__ShapeDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:979:1: ( rule__ShapeDef__Group__2__Impl rule__ShapeDef__Group__3 )
            // InternalGoLDSL.g:980:2: rule__ShapeDef__Group__2__Impl rule__ShapeDef__Group__3
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
    // InternalGoLDSL.g:987:1: rule__ShapeDef__Group__2__Impl : ( ':' ) ;
    public final void rule__ShapeDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:991:1: ( ( ':' ) )
            // InternalGoLDSL.g:992:1: ( ':' )
            {
            // InternalGoLDSL.g:992:1: ( ':' )
            // InternalGoLDSL.g:993:2: ':'
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
    // InternalGoLDSL.g:1002:1: rule__ShapeDef__Group__3 : rule__ShapeDef__Group__3__Impl rule__ShapeDef__Group__4 ;
    public final void rule__ShapeDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1006:1: ( rule__ShapeDef__Group__3__Impl rule__ShapeDef__Group__4 )
            // InternalGoLDSL.g:1007:2: rule__ShapeDef__Group__3__Impl rule__ShapeDef__Group__4
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
    // InternalGoLDSL.g:1014:1: rule__ShapeDef__Group__3__Impl : ( ( rule__ShapeDef__OffsetAssignment_3 )? ) ;
    public final void rule__ShapeDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1018:1: ( ( ( rule__ShapeDef__OffsetAssignment_3 )? ) )
            // InternalGoLDSL.g:1019:1: ( ( rule__ShapeDef__OffsetAssignment_3 )? )
            {
            // InternalGoLDSL.g:1019:1: ( ( rule__ShapeDef__OffsetAssignment_3 )? )
            // InternalGoLDSL.g:1020:2: ( rule__ShapeDef__OffsetAssignment_3 )?
            {
             before(grammarAccess.getShapeDefAccess().getOffsetAssignment_3()); 
            // InternalGoLDSL.g:1021:2: ( rule__ShapeDef__OffsetAssignment_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGoLDSL.g:1021:3: rule__ShapeDef__OffsetAssignment_3
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
    // InternalGoLDSL.g:1029:1: rule__ShapeDef__Group__4 : rule__ShapeDef__Group__4__Impl ;
    public final void rule__ShapeDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1033:1: ( rule__ShapeDef__Group__4__Impl )
            // InternalGoLDSL.g:1034:2: rule__ShapeDef__Group__4__Impl
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
    // InternalGoLDSL.g:1040:1: rule__ShapeDef__Group__4__Impl : ( ( rule__ShapeDef__ObjectsAssignment_4 ) ) ;
    public final void rule__ShapeDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1044:1: ( ( ( rule__ShapeDef__ObjectsAssignment_4 ) ) )
            // InternalGoLDSL.g:1045:1: ( ( rule__ShapeDef__ObjectsAssignment_4 ) )
            {
            // InternalGoLDSL.g:1045:1: ( ( rule__ShapeDef__ObjectsAssignment_4 ) )
            // InternalGoLDSL.g:1046:2: ( rule__ShapeDef__ObjectsAssignment_4 )
            {
             before(grammarAccess.getShapeDefAccess().getObjectsAssignment_4()); 
            // InternalGoLDSL.g:1047:2: ( rule__ShapeDef__ObjectsAssignment_4 )
            // InternalGoLDSL.g:1047:3: rule__ShapeDef__ObjectsAssignment_4
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
    // InternalGoLDSL.g:1056:1: rule__CellPairs__Group__0 : rule__CellPairs__Group__0__Impl rule__CellPairs__Group__1 ;
    public final void rule__CellPairs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1060:1: ( rule__CellPairs__Group__0__Impl rule__CellPairs__Group__1 )
            // InternalGoLDSL.g:1061:2: rule__CellPairs__Group__0__Impl rule__CellPairs__Group__1
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
    // InternalGoLDSL.g:1068:1: rule__CellPairs__Group__0__Impl : ( '(' ) ;
    public final void rule__CellPairs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1072:1: ( ( '(' ) )
            // InternalGoLDSL.g:1073:1: ( '(' )
            {
            // InternalGoLDSL.g:1073:1: ( '(' )
            // InternalGoLDSL.g:1074:2: '('
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
    // InternalGoLDSL.g:1083:1: rule__CellPairs__Group__1 : rule__CellPairs__Group__1__Impl rule__CellPairs__Group__2 ;
    public final void rule__CellPairs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1087:1: ( rule__CellPairs__Group__1__Impl rule__CellPairs__Group__2 )
            // InternalGoLDSL.g:1088:2: rule__CellPairs__Group__1__Impl rule__CellPairs__Group__2
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
    // InternalGoLDSL.g:1095:1: rule__CellPairs__Group__1__Impl : ( ( rule__CellPairs__CellsAssignment_1 ) ) ;
    public final void rule__CellPairs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1099:1: ( ( ( rule__CellPairs__CellsAssignment_1 ) ) )
            // InternalGoLDSL.g:1100:1: ( ( rule__CellPairs__CellsAssignment_1 ) )
            {
            // InternalGoLDSL.g:1100:1: ( ( rule__CellPairs__CellsAssignment_1 ) )
            // InternalGoLDSL.g:1101:2: ( rule__CellPairs__CellsAssignment_1 )
            {
             before(grammarAccess.getCellPairsAccess().getCellsAssignment_1()); 
            // InternalGoLDSL.g:1102:2: ( rule__CellPairs__CellsAssignment_1 )
            // InternalGoLDSL.g:1102:3: rule__CellPairs__CellsAssignment_1
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
    // InternalGoLDSL.g:1110:1: rule__CellPairs__Group__2 : rule__CellPairs__Group__2__Impl ;
    public final void rule__CellPairs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1114:1: ( rule__CellPairs__Group__2__Impl )
            // InternalGoLDSL.g:1115:2: rule__CellPairs__Group__2__Impl
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
    // InternalGoLDSL.g:1121:1: rule__CellPairs__Group__2__Impl : ( ')' ) ;
    public final void rule__CellPairs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1125:1: ( ( ')' ) )
            // InternalGoLDSL.g:1126:1: ( ')' )
            {
            // InternalGoLDSL.g:1126:1: ( ')' )
            // InternalGoLDSL.g:1127:2: ')'
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
    // InternalGoLDSL.g:1137:1: rule__Cells__Group__0 : rule__Cells__Group__0__Impl rule__Cells__Group__1 ;
    public final void rule__Cells__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1141:1: ( rule__Cells__Group__0__Impl rule__Cells__Group__1 )
            // InternalGoLDSL.g:1142:2: rule__Cells__Group__0__Impl rule__Cells__Group__1
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
    // InternalGoLDSL.g:1149:1: rule__Cells__Group__0__Impl : ( 'Cells:' ) ;
    public final void rule__Cells__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1153:1: ( ( 'Cells:' ) )
            // InternalGoLDSL.g:1154:1: ( 'Cells:' )
            {
            // InternalGoLDSL.g:1154:1: ( 'Cells:' )
            // InternalGoLDSL.g:1155:2: 'Cells:'
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
    // InternalGoLDSL.g:1164:1: rule__Cells__Group__1 : rule__Cells__Group__1__Impl ;
    public final void rule__Cells__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1168:1: ( rule__Cells__Group__1__Impl )
            // InternalGoLDSL.g:1169:2: rule__Cells__Group__1__Impl
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
    // InternalGoLDSL.g:1175:1: rule__Cells__Group__1__Impl : ( ruleCellPairs ) ;
    public final void rule__Cells__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1179:1: ( ( ruleCellPairs ) )
            // InternalGoLDSL.g:1180:1: ( ruleCellPairs )
            {
            // InternalGoLDSL.g:1180:1: ( ruleCellPairs )
            // InternalGoLDSL.g:1181:2: ruleCellPairs
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
    // InternalGoLDSL.g:1191:1: rule__CellDef__Group__0 : rule__CellDef__Group__0__Impl rule__CellDef__Group__1 ;
    public final void rule__CellDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1195:1: ( rule__CellDef__Group__0__Impl rule__CellDef__Group__1 )
            // InternalGoLDSL.g:1196:2: rule__CellDef__Group__0__Impl rule__CellDef__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalGoLDSL.g:1203:1: rule__CellDef__Group__0__Impl : ( 'Cell:' ) ;
    public final void rule__CellDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1207:1: ( ( 'Cell:' ) )
            // InternalGoLDSL.g:1208:1: ( 'Cell:' )
            {
            // InternalGoLDSL.g:1208:1: ( 'Cell:' )
            // InternalGoLDSL.g:1209:2: 'Cell:'
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
    // InternalGoLDSL.g:1218:1: rule__CellDef__Group__1 : rule__CellDef__Group__1__Impl ;
    public final void rule__CellDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1222:1: ( rule__CellDef__Group__1__Impl )
            // InternalGoLDSL.g:1223:2: rule__CellDef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellDef__Group__1__Impl();

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
    // InternalGoLDSL.g:1229:1: rule__CellDef__Group__1__Impl : ( ruleCell ) ;
    public final void rule__CellDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1233:1: ( ( ruleCell ) )
            // InternalGoLDSL.g:1234:1: ( ruleCell )
            {
            // InternalGoLDSL.g:1234:1: ( ruleCell )
            // InternalGoLDSL.g:1235:2: ruleCell
            {
             before(grammarAccess.getCellDefAccess().getCellParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getCellDefAccess().getCellParserRuleCall_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ShapeRef__Group__0"
    // InternalGoLDSL.g:1245:1: rule__ShapeRef__Group__0 : rule__ShapeRef__Group__0__Impl rule__ShapeRef__Group__1 ;
    public final void rule__ShapeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1249:1: ( rule__ShapeRef__Group__0__Impl rule__ShapeRef__Group__1 )
            // InternalGoLDSL.g:1250:2: rule__ShapeRef__Group__0__Impl rule__ShapeRef__Group__1
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
    // InternalGoLDSL.g:1257:1: rule__ShapeRef__Group__0__Impl : ( 'Shape' ) ;
    public final void rule__ShapeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1261:1: ( ( 'Shape' ) )
            // InternalGoLDSL.g:1262:1: ( 'Shape' )
            {
            // InternalGoLDSL.g:1262:1: ( 'Shape' )
            // InternalGoLDSL.g:1263:2: 'Shape'
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
    // InternalGoLDSL.g:1272:1: rule__ShapeRef__Group__1 : rule__ShapeRef__Group__1__Impl rule__ShapeRef__Group__2 ;
    public final void rule__ShapeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1276:1: ( rule__ShapeRef__Group__1__Impl rule__ShapeRef__Group__2 )
            // InternalGoLDSL.g:1277:2: rule__ShapeRef__Group__1__Impl rule__ShapeRef__Group__2
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
    // InternalGoLDSL.g:1284:1: rule__ShapeRef__Group__1__Impl : ( ( rule__ShapeRef__NameAssignment_1 ) ) ;
    public final void rule__ShapeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1288:1: ( ( ( rule__ShapeRef__NameAssignment_1 ) ) )
            // InternalGoLDSL.g:1289:1: ( ( rule__ShapeRef__NameAssignment_1 ) )
            {
            // InternalGoLDSL.g:1289:1: ( ( rule__ShapeRef__NameAssignment_1 ) )
            // InternalGoLDSL.g:1290:2: ( rule__ShapeRef__NameAssignment_1 )
            {
             before(grammarAccess.getShapeRefAccess().getNameAssignment_1()); 
            // InternalGoLDSL.g:1291:2: ( rule__ShapeRef__NameAssignment_1 )
            // InternalGoLDSL.g:1291:3: rule__ShapeRef__NameAssignment_1
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
    // InternalGoLDSL.g:1299:1: rule__ShapeRef__Group__2 : rule__ShapeRef__Group__2__Impl rule__ShapeRef__Group__3 ;
    public final void rule__ShapeRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1303:1: ( rule__ShapeRef__Group__2__Impl rule__ShapeRef__Group__3 )
            // InternalGoLDSL.g:1304:2: rule__ShapeRef__Group__2__Impl rule__ShapeRef__Group__3
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
    // InternalGoLDSL.g:1311:1: rule__ShapeRef__Group__2__Impl : ( ':' ) ;
    public final void rule__ShapeRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1315:1: ( ( ':' ) )
            // InternalGoLDSL.g:1316:1: ( ':' )
            {
            // InternalGoLDSL.g:1316:1: ( ':' )
            // InternalGoLDSL.g:1317:2: ':'
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
    // InternalGoLDSL.g:1326:1: rule__ShapeRef__Group__3 : rule__ShapeRef__Group__3__Impl rule__ShapeRef__Group__4 ;
    public final void rule__ShapeRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1330:1: ( rule__ShapeRef__Group__3__Impl rule__ShapeRef__Group__4 )
            // InternalGoLDSL.g:1331:2: rule__ShapeRef__Group__3__Impl rule__ShapeRef__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalGoLDSL.g:1338:1: rule__ShapeRef__Group__3__Impl : ( ( rule__ShapeRef__XAssignment_3 ) ) ;
    public final void rule__ShapeRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1342:1: ( ( ( rule__ShapeRef__XAssignment_3 ) ) )
            // InternalGoLDSL.g:1343:1: ( ( rule__ShapeRef__XAssignment_3 ) )
            {
            // InternalGoLDSL.g:1343:1: ( ( rule__ShapeRef__XAssignment_3 ) )
            // InternalGoLDSL.g:1344:2: ( rule__ShapeRef__XAssignment_3 )
            {
             before(grammarAccess.getShapeRefAccess().getXAssignment_3()); 
            // InternalGoLDSL.g:1345:2: ( rule__ShapeRef__XAssignment_3 )
            // InternalGoLDSL.g:1345:3: rule__ShapeRef__XAssignment_3
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
    // InternalGoLDSL.g:1353:1: rule__ShapeRef__Group__4 : rule__ShapeRef__Group__4__Impl rule__ShapeRef__Group__5 ;
    public final void rule__ShapeRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1357:1: ( rule__ShapeRef__Group__4__Impl rule__ShapeRef__Group__5 )
            // InternalGoLDSL.g:1358:2: rule__ShapeRef__Group__4__Impl rule__ShapeRef__Group__5
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
    // InternalGoLDSL.g:1365:1: rule__ShapeRef__Group__4__Impl : ( ',' ) ;
    public final void rule__ShapeRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1369:1: ( ( ',' ) )
            // InternalGoLDSL.g:1370:1: ( ',' )
            {
            // InternalGoLDSL.g:1370:1: ( ',' )
            // InternalGoLDSL.g:1371:2: ','
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
    // InternalGoLDSL.g:1380:1: rule__ShapeRef__Group__5 : rule__ShapeRef__Group__5__Impl ;
    public final void rule__ShapeRef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1384:1: ( rule__ShapeRef__Group__5__Impl )
            // InternalGoLDSL.g:1385:2: rule__ShapeRef__Group__5__Impl
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
    // InternalGoLDSL.g:1391:1: rule__ShapeRef__Group__5__Impl : ( ( rule__ShapeRef__YAssignment_5 ) ) ;
    public final void rule__ShapeRef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1395:1: ( ( ( rule__ShapeRef__YAssignment_5 ) ) )
            // InternalGoLDSL.g:1396:1: ( ( rule__ShapeRef__YAssignment_5 ) )
            {
            // InternalGoLDSL.g:1396:1: ( ( rule__ShapeRef__YAssignment_5 ) )
            // InternalGoLDSL.g:1397:2: ( rule__ShapeRef__YAssignment_5 )
            {
             before(grammarAccess.getShapeRefAccess().getYAssignment_5()); 
            // InternalGoLDSL.g:1398:2: ( rule__ShapeRef__YAssignment_5 )
            // InternalGoLDSL.g:1398:3: rule__ShapeRef__YAssignment_5
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
    // InternalGoLDSL.g:1407:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1411:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalGoLDSL.g:1412:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalGoLDSL.g:1419:1: rule__Cell__Group__0__Impl : ( ( rule__Cell__XAssignment_0 ) ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1423:1: ( ( ( rule__Cell__XAssignment_0 ) ) )
            // InternalGoLDSL.g:1424:1: ( ( rule__Cell__XAssignment_0 ) )
            {
            // InternalGoLDSL.g:1424:1: ( ( rule__Cell__XAssignment_0 ) )
            // InternalGoLDSL.g:1425:2: ( rule__Cell__XAssignment_0 )
            {
             before(grammarAccess.getCellAccess().getXAssignment_0()); 
            // InternalGoLDSL.g:1426:2: ( rule__Cell__XAssignment_0 )
            // InternalGoLDSL.g:1426:3: rule__Cell__XAssignment_0
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
    // InternalGoLDSL.g:1434:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl rule__Cell__Group__2 ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1438:1: ( rule__Cell__Group__1__Impl rule__Cell__Group__2 )
            // InternalGoLDSL.g:1439:2: rule__Cell__Group__1__Impl rule__Cell__Group__2
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
    // InternalGoLDSL.g:1446:1: rule__Cell__Group__1__Impl : ( ',' ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1450:1: ( ( ',' ) )
            // InternalGoLDSL.g:1451:1: ( ',' )
            {
            // InternalGoLDSL.g:1451:1: ( ',' )
            // InternalGoLDSL.g:1452:2: ','
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
    // InternalGoLDSL.g:1461:1: rule__Cell__Group__2 : rule__Cell__Group__2__Impl ;
    public final void rule__Cell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1465:1: ( rule__Cell__Group__2__Impl )
            // InternalGoLDSL.g:1466:2: rule__Cell__Group__2__Impl
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
    // InternalGoLDSL.g:1472:1: rule__Cell__Group__2__Impl : ( ( rule__Cell__YAssignment_2 ) ) ;
    public final void rule__Cell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1476:1: ( ( ( rule__Cell__YAssignment_2 ) ) )
            // InternalGoLDSL.g:1477:1: ( ( rule__Cell__YAssignment_2 ) )
            {
            // InternalGoLDSL.g:1477:1: ( ( rule__Cell__YAssignment_2 ) )
            // InternalGoLDSL.g:1478:2: ( rule__Cell__YAssignment_2 )
            {
             before(grammarAccess.getCellAccess().getYAssignment_2()); 
            // InternalGoLDSL.g:1479:2: ( rule__Cell__YAssignment_2 )
            // InternalGoLDSL.g:1479:3: rule__Cell__YAssignment_2
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
    // InternalGoLDSL.g:1488:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1492:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalGoLDSL.g:1493:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalGoLDSL.g:1500:1: rule__Rule__Group__0__Impl : ( 'Rule:' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1504:1: ( ( 'Rule:' ) )
            // InternalGoLDSL.g:1505:1: ( 'Rule:' )
            {
            // InternalGoLDSL.g:1505:1: ( 'Rule:' )
            // InternalGoLDSL.g:1506:2: 'Rule:'
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
    // InternalGoLDSL.g:1515:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1519:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalGoLDSL.g:1520:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoLDSL.g:1527:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__ConditionAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1531:1: ( ( ( rule__Rule__ConditionAssignment_1 ) ) )
            // InternalGoLDSL.g:1532:1: ( ( rule__Rule__ConditionAssignment_1 ) )
            {
            // InternalGoLDSL.g:1532:1: ( ( rule__Rule__ConditionAssignment_1 ) )
            // InternalGoLDSL.g:1533:2: ( rule__Rule__ConditionAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_1()); 
            // InternalGoLDSL.g:1534:2: ( rule__Rule__ConditionAssignment_1 )
            // InternalGoLDSL.g:1534:3: rule__Rule__ConditionAssignment_1
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
    // InternalGoLDSL.g:1542:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1546:1: ( rule__Rule__Group__2__Impl )
            // InternalGoLDSL.g:1547:2: rule__Rule__Group__2__Impl
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
    // InternalGoLDSL.g:1553:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ActionAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1557:1: ( ( ( rule__Rule__ActionAssignment_2 ) ) )
            // InternalGoLDSL.g:1558:1: ( ( rule__Rule__ActionAssignment_2 ) )
            {
            // InternalGoLDSL.g:1558:1: ( ( rule__Rule__ActionAssignment_2 ) )
            // InternalGoLDSL.g:1559:2: ( rule__Rule__ActionAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getActionAssignment_2()); 
            // InternalGoLDSL.g:1560:2: ( rule__Rule__ActionAssignment_2 )
            // InternalGoLDSL.g:1560:3: rule__Rule__ActionAssignment_2
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
    // InternalGoLDSL.g:1569:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1573:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalGoLDSL.g:1574:2: rule__Action__Group__0__Impl rule__Action__Group__1
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
    // InternalGoLDSL.g:1581:1: rule__Action__Group__0__Impl : ( 'Create' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1585:1: ( ( 'Create' ) )
            // InternalGoLDSL.g:1586:1: ( 'Create' )
            {
            // InternalGoLDSL.g:1586:1: ( 'Create' )
            // InternalGoLDSL.g:1587:2: 'Create'
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
    // InternalGoLDSL.g:1596:1: rule__Action__Group__1 : rule__Action__Group__1__Impl ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1600:1: ( rule__Action__Group__1__Impl )
            // InternalGoLDSL.g:1601:2: rule__Action__Group__1__Impl
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
    // InternalGoLDSL.g:1607:1: rule__Action__Group__1__Impl : ( ruleObjects ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1611:1: ( ( ruleObjects ) )
            // InternalGoLDSL.g:1612:1: ( ruleObjects )
            {
            // InternalGoLDSL.g:1612:1: ( ruleObjects )
            // InternalGoLDSL.g:1613:2: ruleObjects
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
    // InternalGoLDSL.g:1623:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1627:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGoLDSL.g:1628:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalGoLDSL.g:1635:1: rule__Condition__Group__0__Impl : ( 'If' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1639:1: ( ( 'If' ) )
            // InternalGoLDSL.g:1640:1: ( 'If' )
            {
            // InternalGoLDSL.g:1640:1: ( 'If' )
            // InternalGoLDSL.g:1641:2: 'If'
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
    // InternalGoLDSL.g:1650:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1654:1: ( rule__Condition__Group__1__Impl )
            // InternalGoLDSL.g:1655:2: rule__Condition__Group__1__Impl
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
    // InternalGoLDSL.g:1661:1: rule__Condition__Group__1__Impl : ( ruleConditionRules ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1665:1: ( ( ruleConditionRules ) )
            // InternalGoLDSL.g:1666:1: ( ruleConditionRules )
            {
            // InternalGoLDSL.g:1666:1: ( ruleConditionRules )
            // InternalGoLDSL.g:1667:2: ruleConditionRules
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
    // InternalGoLDSL.g:1677:1: rule__ConditionRules__Group__0 : rule__ConditionRules__Group__0__Impl rule__ConditionRules__Group__1 ;
    public final void rule__ConditionRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1681:1: ( rule__ConditionRules__Group__0__Impl rule__ConditionRules__Group__1 )
            // InternalGoLDSL.g:1682:2: rule__ConditionRules__Group__0__Impl rule__ConditionRules__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalGoLDSL.g:1689:1: rule__ConditionRules__Group__0__Impl : ( ( rule__ConditionRules__Rule1Assignment_0 ) ) ;
    public final void rule__ConditionRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1693:1: ( ( ( rule__ConditionRules__Rule1Assignment_0 ) ) )
            // InternalGoLDSL.g:1694:1: ( ( rule__ConditionRules__Rule1Assignment_0 ) )
            {
            // InternalGoLDSL.g:1694:1: ( ( rule__ConditionRules__Rule1Assignment_0 ) )
            // InternalGoLDSL.g:1695:2: ( rule__ConditionRules__Rule1Assignment_0 )
            {
             before(grammarAccess.getConditionRulesAccess().getRule1Assignment_0()); 
            // InternalGoLDSL.g:1696:2: ( rule__ConditionRules__Rule1Assignment_0 )
            // InternalGoLDSL.g:1696:3: rule__ConditionRules__Rule1Assignment_0
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
    // InternalGoLDSL.g:1704:1: rule__ConditionRules__Group__1 : rule__ConditionRules__Group__1__Impl ;
    public final void rule__ConditionRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1708:1: ( rule__ConditionRules__Group__1__Impl )
            // InternalGoLDSL.g:1709:2: rule__ConditionRules__Group__1__Impl
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
    // InternalGoLDSL.g:1715:1: rule__ConditionRules__Group__1__Impl : ( ( rule__ConditionRules__Group_1__0 )? ) ;
    public final void rule__ConditionRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1719:1: ( ( ( rule__ConditionRules__Group_1__0 )? ) )
            // InternalGoLDSL.g:1720:1: ( ( rule__ConditionRules__Group_1__0 )? )
            {
            // InternalGoLDSL.g:1720:1: ( ( rule__ConditionRules__Group_1__0 )? )
            // InternalGoLDSL.g:1721:2: ( rule__ConditionRules__Group_1__0 )?
            {
             before(grammarAccess.getConditionRulesAccess().getGroup_1()); 
            // InternalGoLDSL.g:1722:2: ( rule__ConditionRules__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=12)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGoLDSL.g:1722:3: rule__ConditionRules__Group_1__0
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
    // InternalGoLDSL.g:1731:1: rule__ConditionRules__Group_1__0 : rule__ConditionRules__Group_1__0__Impl rule__ConditionRules__Group_1__1 ;
    public final void rule__ConditionRules__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1735:1: ( rule__ConditionRules__Group_1__0__Impl rule__ConditionRules__Group_1__1 )
            // InternalGoLDSL.g:1736:2: rule__ConditionRules__Group_1__0__Impl rule__ConditionRules__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalGoLDSL.g:1743:1: rule__ConditionRules__Group_1__0__Impl : ( ( rule__ConditionRules__OperatorAssignment_1_0 ) ) ;
    public final void rule__ConditionRules__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1747:1: ( ( ( rule__ConditionRules__OperatorAssignment_1_0 ) ) )
            // InternalGoLDSL.g:1748:1: ( ( rule__ConditionRules__OperatorAssignment_1_0 ) )
            {
            // InternalGoLDSL.g:1748:1: ( ( rule__ConditionRules__OperatorAssignment_1_0 ) )
            // InternalGoLDSL.g:1749:2: ( rule__ConditionRules__OperatorAssignment_1_0 )
            {
             before(grammarAccess.getConditionRulesAccess().getOperatorAssignment_1_0()); 
            // InternalGoLDSL.g:1750:2: ( rule__ConditionRules__OperatorAssignment_1_0 )
            // InternalGoLDSL.g:1750:3: rule__ConditionRules__OperatorAssignment_1_0
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
    // InternalGoLDSL.g:1758:1: rule__ConditionRules__Group_1__1 : rule__ConditionRules__Group_1__1__Impl ;
    public final void rule__ConditionRules__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1762:1: ( rule__ConditionRules__Group_1__1__Impl )
            // InternalGoLDSL.g:1763:2: rule__ConditionRules__Group_1__1__Impl
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
    // InternalGoLDSL.g:1769:1: rule__ConditionRules__Group_1__1__Impl : ( ( rule__ConditionRules__Rule2Assignment_1_1 ) ) ;
    public final void rule__ConditionRules__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1773:1: ( ( ( rule__ConditionRules__Rule2Assignment_1_1 ) ) )
            // InternalGoLDSL.g:1774:1: ( ( rule__ConditionRules__Rule2Assignment_1_1 ) )
            {
            // InternalGoLDSL.g:1774:1: ( ( rule__ConditionRules__Rule2Assignment_1_1 ) )
            // InternalGoLDSL.g:1775:2: ( rule__ConditionRules__Rule2Assignment_1_1 )
            {
             before(grammarAccess.getConditionRulesAccess().getRule2Assignment_1_1()); 
            // InternalGoLDSL.g:1776:2: ( rule__ConditionRules__Rule2Assignment_1_1 )
            // InternalGoLDSL.g:1776:3: rule__ConditionRules__Rule2Assignment_1_1
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
    // InternalGoLDSL.g:1785:1: rule__BoundedRange__Group__0 : rule__BoundedRange__Group__0__Impl rule__BoundedRange__Group__1 ;
    public final void rule__BoundedRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1789:1: ( rule__BoundedRange__Group__0__Impl rule__BoundedRange__Group__1 )
            // InternalGoLDSL.g:1790:2: rule__BoundedRange__Group__0__Impl rule__BoundedRange__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalGoLDSL.g:1797:1: rule__BoundedRange__Group__0__Impl : ( ( rule__BoundedRange__LowerBoundAssignment_0 ) ) ;
    public final void rule__BoundedRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1801:1: ( ( ( rule__BoundedRange__LowerBoundAssignment_0 ) ) )
            // InternalGoLDSL.g:1802:1: ( ( rule__BoundedRange__LowerBoundAssignment_0 ) )
            {
            // InternalGoLDSL.g:1802:1: ( ( rule__BoundedRange__LowerBoundAssignment_0 ) )
            // InternalGoLDSL.g:1803:2: ( rule__BoundedRange__LowerBoundAssignment_0 )
            {
             before(grammarAccess.getBoundedRangeAccess().getLowerBoundAssignment_0()); 
            // InternalGoLDSL.g:1804:2: ( rule__BoundedRange__LowerBoundAssignment_0 )
            // InternalGoLDSL.g:1804:3: rule__BoundedRange__LowerBoundAssignment_0
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
    // InternalGoLDSL.g:1812:1: rule__BoundedRange__Group__1 : rule__BoundedRange__Group__1__Impl rule__BoundedRange__Group__2 ;
    public final void rule__BoundedRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1816:1: ( rule__BoundedRange__Group__1__Impl rule__BoundedRange__Group__2 )
            // InternalGoLDSL.g:1817:2: rule__BoundedRange__Group__1__Impl rule__BoundedRange__Group__2
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
    // InternalGoLDSL.g:1824:1: rule__BoundedRange__Group__1__Impl : ( '..' ) ;
    public final void rule__BoundedRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1828:1: ( ( '..' ) )
            // InternalGoLDSL.g:1829:1: ( '..' )
            {
            // InternalGoLDSL.g:1829:1: ( '..' )
            // InternalGoLDSL.g:1830:2: '..'
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
    // InternalGoLDSL.g:1839:1: rule__BoundedRange__Group__2 : rule__BoundedRange__Group__2__Impl ;
    public final void rule__BoundedRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1843:1: ( rule__BoundedRange__Group__2__Impl )
            // InternalGoLDSL.g:1844:2: rule__BoundedRange__Group__2__Impl
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
    // InternalGoLDSL.g:1850:1: rule__BoundedRange__Group__2__Impl : ( ( rule__BoundedRange__HigherBoundAssignment_2 ) ) ;
    public final void rule__BoundedRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1854:1: ( ( ( rule__BoundedRange__HigherBoundAssignment_2 ) ) )
            // InternalGoLDSL.g:1855:1: ( ( rule__BoundedRange__HigherBoundAssignment_2 ) )
            {
            // InternalGoLDSL.g:1855:1: ( ( rule__BoundedRange__HigherBoundAssignment_2 ) )
            // InternalGoLDSL.g:1856:2: ( rule__BoundedRange__HigherBoundAssignment_2 )
            {
             before(grammarAccess.getBoundedRangeAccess().getHigherBoundAssignment_2()); 
            // InternalGoLDSL.g:1857:2: ( rule__BoundedRange__HigherBoundAssignment_2 )
            // InternalGoLDSL.g:1857:3: rule__BoundedRange__HigherBoundAssignment_2
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
    // InternalGoLDSL.g:1866:1: rule__LeftUnboundedRange__Group__0 : rule__LeftUnboundedRange__Group__0__Impl rule__LeftUnboundedRange__Group__1 ;
    public final void rule__LeftUnboundedRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1870:1: ( rule__LeftUnboundedRange__Group__0__Impl rule__LeftUnboundedRange__Group__1 )
            // InternalGoLDSL.g:1871:2: rule__LeftUnboundedRange__Group__0__Impl rule__LeftUnboundedRange__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalGoLDSL.g:1878:1: rule__LeftUnboundedRange__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__LeftUnboundedRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1882:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:1883:1: ( RULE_INT )
            {
            // InternalGoLDSL.g:1883:1: ( RULE_INT )
            // InternalGoLDSL.g:1884:2: RULE_INT
            {
             before(grammarAccess.getLeftUnboundedRangeAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLeftUnboundedRangeAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalGoLDSL.g:1893:1: rule__LeftUnboundedRange__Group__1 : rule__LeftUnboundedRange__Group__1__Impl ;
    public final void rule__LeftUnboundedRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1897:1: ( rule__LeftUnboundedRange__Group__1__Impl )
            // InternalGoLDSL.g:1898:2: rule__LeftUnboundedRange__Group__1__Impl
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
    // InternalGoLDSL.g:1904:1: rule__LeftUnboundedRange__Group__1__Impl : ( '..' ) ;
    public final void rule__LeftUnboundedRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1908:1: ( ( '..' ) )
            // InternalGoLDSL.g:1909:1: ( '..' )
            {
            // InternalGoLDSL.g:1909:1: ( '..' )
            // InternalGoLDSL.g:1910:2: '..'
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
    // InternalGoLDSL.g:1920:1: rule__RightUnboundedRange__Group__0 : rule__RightUnboundedRange__Group__0__Impl rule__RightUnboundedRange__Group__1 ;
    public final void rule__RightUnboundedRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1924:1: ( rule__RightUnboundedRange__Group__0__Impl rule__RightUnboundedRange__Group__1 )
            // InternalGoLDSL.g:1925:2: rule__RightUnboundedRange__Group__0__Impl rule__RightUnboundedRange__Group__1
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
    // InternalGoLDSL.g:1932:1: rule__RightUnboundedRange__Group__0__Impl : ( '..' ) ;
    public final void rule__RightUnboundedRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1936:1: ( ( '..' ) )
            // InternalGoLDSL.g:1937:1: ( '..' )
            {
            // InternalGoLDSL.g:1937:1: ( '..' )
            // InternalGoLDSL.g:1938:2: '..'
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
    // InternalGoLDSL.g:1947:1: rule__RightUnboundedRange__Group__1 : rule__RightUnboundedRange__Group__1__Impl ;
    public final void rule__RightUnboundedRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1951:1: ( rule__RightUnboundedRange__Group__1__Impl )
            // InternalGoLDSL.g:1952:2: rule__RightUnboundedRange__Group__1__Impl
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
    // InternalGoLDSL.g:1958:1: rule__RightUnboundedRange__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__RightUnboundedRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1962:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:1963:1: ( RULE_INT )
            {
            // InternalGoLDSL.g:1963:1: ( RULE_INT )
            // InternalGoLDSL.g:1964:2: RULE_INT
            {
             before(grammarAccess.getRightUnboundedRangeAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRightUnboundedRangeAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
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
    // InternalGoLDSL.g:1974:1: rule__Grid__Group__0 : rule__Grid__Group__0__Impl rule__Grid__Group__1 ;
    public final void rule__Grid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1978:1: ( rule__Grid__Group__0__Impl rule__Grid__Group__1 )
            // InternalGoLDSL.g:1979:2: rule__Grid__Group__0__Impl rule__Grid__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalGoLDSL.g:1986:1: rule__Grid__Group__0__Impl : ( 'Grid:' ) ;
    public final void rule__Grid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1990:1: ( ( 'Grid:' ) )
            // InternalGoLDSL.g:1991:1: ( 'Grid:' )
            {
            // InternalGoLDSL.g:1991:1: ( 'Grid:' )
            // InternalGoLDSL.g:1992:2: 'Grid:'
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
    // InternalGoLDSL.g:2001:1: rule__Grid__Group__1 : rule__Grid__Group__1__Impl rule__Grid__Group__2 ;
    public final void rule__Grid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2005:1: ( rule__Grid__Group__1__Impl rule__Grid__Group__2 )
            // InternalGoLDSL.g:2006:2: rule__Grid__Group__1__Impl rule__Grid__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalGoLDSL.g:2013:1: rule__Grid__Group__1__Impl : ( ( rule__Grid__SizeAssignment_1 ) ) ;
    public final void rule__Grid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2017:1: ( ( ( rule__Grid__SizeAssignment_1 ) ) )
            // InternalGoLDSL.g:2018:1: ( ( rule__Grid__SizeAssignment_1 ) )
            {
            // InternalGoLDSL.g:2018:1: ( ( rule__Grid__SizeAssignment_1 ) )
            // InternalGoLDSL.g:2019:2: ( rule__Grid__SizeAssignment_1 )
            {
             before(grammarAccess.getGridAccess().getSizeAssignment_1()); 
            // InternalGoLDSL.g:2020:2: ( rule__Grid__SizeAssignment_1 )
            // InternalGoLDSL.g:2020:3: rule__Grid__SizeAssignment_1
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
    // InternalGoLDSL.g:2028:1: rule__Grid__Group__2 : rule__Grid__Group__2__Impl ;
    public final void rule__Grid__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2032:1: ( rule__Grid__Group__2__Impl )
            // InternalGoLDSL.g:2033:2: rule__Grid__Group__2__Impl
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
    // InternalGoLDSL.g:2039:1: rule__Grid__Group__2__Impl : ( ( ( rule__Grid__PartsAssignment_2 ) ) ( ( rule__Grid__PartsAssignment_2 )* ) ) ;
    public final void rule__Grid__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2043:1: ( ( ( ( rule__Grid__PartsAssignment_2 ) ) ( ( rule__Grid__PartsAssignment_2 )* ) ) )
            // InternalGoLDSL.g:2044:1: ( ( ( rule__Grid__PartsAssignment_2 ) ) ( ( rule__Grid__PartsAssignment_2 )* ) )
            {
            // InternalGoLDSL.g:2044:1: ( ( ( rule__Grid__PartsAssignment_2 ) ) ( ( rule__Grid__PartsAssignment_2 )* ) )
            // InternalGoLDSL.g:2045:2: ( ( rule__Grid__PartsAssignment_2 ) ) ( ( rule__Grid__PartsAssignment_2 )* )
            {
            // InternalGoLDSL.g:2045:2: ( ( rule__Grid__PartsAssignment_2 ) )
            // InternalGoLDSL.g:2046:3: ( rule__Grid__PartsAssignment_2 )
            {
             before(grammarAccess.getGridAccess().getPartsAssignment_2()); 
            // InternalGoLDSL.g:2047:3: ( rule__Grid__PartsAssignment_2 )
            // InternalGoLDSL.g:2047:4: rule__Grid__PartsAssignment_2
            {
            pushFollow(FOLLOW_22);
            rule__Grid__PartsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getPartsAssignment_2()); 

            }

            // InternalGoLDSL.g:2050:2: ( ( rule__Grid__PartsAssignment_2 )* )
            // InternalGoLDSL.g:2051:3: ( rule__Grid__PartsAssignment_2 )*
            {
             before(grammarAccess.getGridAccess().getPartsAssignment_2()); 
            // InternalGoLDSL.g:2052:3: ( rule__Grid__PartsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=13 && LA13_0<=14)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGoLDSL.g:2052:4: rule__Grid__PartsAssignment_2
            	    {
            	    pushFollow(FOLLOW_22);
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
    // InternalGoLDSL.g:2062:1: rule__Offset__Group__0 : rule__Offset__Group__0__Impl rule__Offset__Group__1 ;
    public final void rule__Offset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2066:1: ( rule__Offset__Group__0__Impl rule__Offset__Group__1 )
            // InternalGoLDSL.g:2067:2: rule__Offset__Group__0__Impl rule__Offset__Group__1
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
    // InternalGoLDSL.g:2074:1: rule__Offset__Group__0__Impl : ( 'offset' ) ;
    public final void rule__Offset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2078:1: ( ( 'offset' ) )
            // InternalGoLDSL.g:2079:1: ( 'offset' )
            {
            // InternalGoLDSL.g:2079:1: ( 'offset' )
            // InternalGoLDSL.g:2080:2: 'offset'
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
    // InternalGoLDSL.g:2089:1: rule__Offset__Group__1 : rule__Offset__Group__1__Impl rule__Offset__Group__2 ;
    public final void rule__Offset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2093:1: ( rule__Offset__Group__1__Impl rule__Offset__Group__2 )
            // InternalGoLDSL.g:2094:2: rule__Offset__Group__1__Impl rule__Offset__Group__2
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
    // InternalGoLDSL.g:2101:1: rule__Offset__Group__1__Impl : ( ( rule__Offset__XAssignment_1 ) ) ;
    public final void rule__Offset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2105:1: ( ( ( rule__Offset__XAssignment_1 ) ) )
            // InternalGoLDSL.g:2106:1: ( ( rule__Offset__XAssignment_1 ) )
            {
            // InternalGoLDSL.g:2106:1: ( ( rule__Offset__XAssignment_1 ) )
            // InternalGoLDSL.g:2107:2: ( rule__Offset__XAssignment_1 )
            {
             before(grammarAccess.getOffsetAccess().getXAssignment_1()); 
            // InternalGoLDSL.g:2108:2: ( rule__Offset__XAssignment_1 )
            // InternalGoLDSL.g:2108:3: rule__Offset__XAssignment_1
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
    // InternalGoLDSL.g:2116:1: rule__Offset__Group__2 : rule__Offset__Group__2__Impl ;
    public final void rule__Offset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2120:1: ( rule__Offset__Group__2__Impl )
            // InternalGoLDSL.g:2121:2: rule__Offset__Group__2__Impl
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
    // InternalGoLDSL.g:2127:1: rule__Offset__Group__2__Impl : ( ( rule__Offset__YAssignment_2 ) ) ;
    public final void rule__Offset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2131:1: ( ( ( rule__Offset__YAssignment_2 ) ) )
            // InternalGoLDSL.g:2132:1: ( ( rule__Offset__YAssignment_2 ) )
            {
            // InternalGoLDSL.g:2132:1: ( ( rule__Offset__YAssignment_2 ) )
            // InternalGoLDSL.g:2133:2: ( rule__Offset__YAssignment_2 )
            {
             before(grammarAccess.getOffsetAccess().getYAssignment_2()); 
            // InternalGoLDSL.g:2134:2: ( rule__Offset__YAssignment_2 )
            // InternalGoLDSL.g:2134:3: rule__Offset__YAssignment_2
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
    // InternalGoLDSL.g:2143:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2147:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // InternalGoLDSL.g:2148:2: rule__Size__Group__0__Impl rule__Size__Group__1
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
    // InternalGoLDSL.g:2155:1: rule__Size__Group__0__Impl : ( 'size' ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2159:1: ( ( 'size' ) )
            // InternalGoLDSL.g:2160:1: ( 'size' )
            {
            // InternalGoLDSL.g:2160:1: ( 'size' )
            // InternalGoLDSL.g:2161:2: 'size'
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
    // InternalGoLDSL.g:2170:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2174:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // InternalGoLDSL.g:2175:2: rule__Size__Group__1__Impl rule__Size__Group__2
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
    // InternalGoLDSL.g:2182:1: rule__Size__Group__1__Impl : ( ( rule__Size__WidthAssignment_1 ) ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2186:1: ( ( ( rule__Size__WidthAssignment_1 ) ) )
            // InternalGoLDSL.g:2187:1: ( ( rule__Size__WidthAssignment_1 ) )
            {
            // InternalGoLDSL.g:2187:1: ( ( rule__Size__WidthAssignment_1 ) )
            // InternalGoLDSL.g:2188:2: ( rule__Size__WidthAssignment_1 )
            {
             before(grammarAccess.getSizeAccess().getWidthAssignment_1()); 
            // InternalGoLDSL.g:2189:2: ( rule__Size__WidthAssignment_1 )
            // InternalGoLDSL.g:2189:3: rule__Size__WidthAssignment_1
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
    // InternalGoLDSL.g:2197:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2201:1: ( rule__Size__Group__2__Impl )
            // InternalGoLDSL.g:2202:2: rule__Size__Group__2__Impl
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
    // InternalGoLDSL.g:2208:1: rule__Size__Group__2__Impl : ( ( rule__Size__HeightAssignment_2 ) ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2212:1: ( ( ( rule__Size__HeightAssignment_2 ) ) )
            // InternalGoLDSL.g:2213:1: ( ( rule__Size__HeightAssignment_2 ) )
            {
            // InternalGoLDSL.g:2213:1: ( ( rule__Size__HeightAssignment_2 ) )
            // InternalGoLDSL.g:2214:2: ( rule__Size__HeightAssignment_2 )
            {
             before(grammarAccess.getSizeAccess().getHeightAssignment_2()); 
            // InternalGoLDSL.g:2215:2: ( rule__Size__HeightAssignment_2 )
            // InternalGoLDSL.g:2215:3: rule__Size__HeightAssignment_2
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
    // InternalGoLDSL.g:2224:1: rule__DSL__BoardAssignment_0 : ( ruleBoard ) ;
    public final void rule__DSL__BoardAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2228:1: ( ( ruleBoard ) )
            // InternalGoLDSL.g:2229:2: ( ruleBoard )
            {
            // InternalGoLDSL.g:2229:2: ( ruleBoard )
            // InternalGoLDSL.g:2230:3: ruleBoard
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
    // InternalGoLDSL.g:2239:1: rule__DSL__RulesAssignment_1_0 : ( ruleRule ) ;
    public final void rule__DSL__RulesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2243:1: ( ( ruleRule ) )
            // InternalGoLDSL.g:2244:2: ( ruleRule )
            {
            // InternalGoLDSL.g:2244:2: ( ruleRule )
            // InternalGoLDSL.g:2245:3: ruleRule
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
    // InternalGoLDSL.g:2254:1: rule__DSL__ShapesAssignment_1_1 : ( ruleShapeDef ) ;
    public final void rule__DSL__ShapesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2258:1: ( ( ruleShapeDef ) )
            // InternalGoLDSL.g:2259:2: ( ruleShapeDef )
            {
            // InternalGoLDSL.g:2259:2: ( ruleShapeDef )
            // InternalGoLDSL.g:2260:3: ruleShapeDef
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
    // InternalGoLDSL.g:2269:1: rule__Objects__ShapesAssignment_0 : ( ruleShapeRef ) ;
    public final void rule__Objects__ShapesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2273:1: ( ( ruleShapeRef ) )
            // InternalGoLDSL.g:2274:2: ( ruleShapeRef )
            {
            // InternalGoLDSL.g:2274:2: ( ruleShapeRef )
            // InternalGoLDSL.g:2275:3: ruleShapeRef
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
    // InternalGoLDSL.g:2284:1: rule__Objects__CellAssignment_1 : ( ruleCellDef ) ;
    public final void rule__Objects__CellAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2288:1: ( ( ruleCellDef ) )
            // InternalGoLDSL.g:2289:2: ( ruleCellDef )
            {
            // InternalGoLDSL.g:2289:2: ( ruleCellDef )
            // InternalGoLDSL.g:2290:3: ruleCellDef
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
    // InternalGoLDSL.g:2299:1: rule__Objects__CellsAssignment_2 : ( ruleCells ) ;
    public final void rule__Objects__CellsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2303:1: ( ( ruleCells ) )
            // InternalGoLDSL.g:2304:2: ( ruleCells )
            {
            // InternalGoLDSL.g:2304:2: ( ruleCells )
            // InternalGoLDSL.g:2305:3: ruleCells
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
    // InternalGoLDSL.g:2314:1: rule__Objects__GridsAssignment_3 : ( ruleGrid ) ;
    public final void rule__Objects__GridsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2318:1: ( ( ruleGrid ) )
            // InternalGoLDSL.g:2319:2: ( ruleGrid )
            {
            // InternalGoLDSL.g:2319:2: ( ruleGrid )
            // InternalGoLDSL.g:2320:3: ruleGrid
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
    // InternalGoLDSL.g:2329:1: rule__ShapeDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ShapeDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2333:1: ( ( RULE_ID ) )
            // InternalGoLDSL.g:2334:2: ( RULE_ID )
            {
            // InternalGoLDSL.g:2334:2: ( RULE_ID )
            // InternalGoLDSL.g:2335:3: RULE_ID
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
    // InternalGoLDSL.g:2344:1: rule__ShapeDef__OffsetAssignment_3 : ( ruleOffset ) ;
    public final void rule__ShapeDef__OffsetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2348:1: ( ( ruleOffset ) )
            // InternalGoLDSL.g:2349:2: ( ruleOffset )
            {
            // InternalGoLDSL.g:2349:2: ( ruleOffset )
            // InternalGoLDSL.g:2350:3: ruleOffset
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
    // InternalGoLDSL.g:2359:1: rule__ShapeDef__ObjectsAssignment_4 : ( ruleObjects ) ;
    public final void rule__ShapeDef__ObjectsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2363:1: ( ( ruleObjects ) )
            // InternalGoLDSL.g:2364:2: ( ruleObjects )
            {
            // InternalGoLDSL.g:2364:2: ( ruleObjects )
            // InternalGoLDSL.g:2365:3: ruleObjects
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
    // InternalGoLDSL.g:2374:1: rule__CellPairs__CellsAssignment_1 : ( ruleCell ) ;
    public final void rule__CellPairs__CellsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2378:1: ( ( ruleCell ) )
            // InternalGoLDSL.g:2379:2: ( ruleCell )
            {
            // InternalGoLDSL.g:2379:2: ( ruleCell )
            // InternalGoLDSL.g:2380:3: ruleCell
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


    // $ANTLR start "rule__ShapeRef__NameAssignment_1"
    // InternalGoLDSL.g:2389:1: rule__ShapeRef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ShapeRef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2393:1: ( ( RULE_ID ) )
            // InternalGoLDSL.g:2394:2: ( RULE_ID )
            {
            // InternalGoLDSL.g:2394:2: ( RULE_ID )
            // InternalGoLDSL.g:2395:3: RULE_ID
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
    // InternalGoLDSL.g:2404:1: rule__ShapeRef__XAssignment_3 : ( RULE_INT ) ;
    public final void rule__ShapeRef__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2408:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2409:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2409:2: ( RULE_INT )
            // InternalGoLDSL.g:2410:3: RULE_INT
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
    // InternalGoLDSL.g:2419:1: rule__ShapeRef__YAssignment_5 : ( RULE_INT ) ;
    public final void rule__ShapeRef__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2423:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2424:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2424:2: ( RULE_INT )
            // InternalGoLDSL.g:2425:3: RULE_INT
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
    // InternalGoLDSL.g:2434:1: rule__Cell__XAssignment_0 : ( RULE_INT ) ;
    public final void rule__Cell__XAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2438:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2439:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2439:2: ( RULE_INT )
            // InternalGoLDSL.g:2440:3: RULE_INT
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
    // InternalGoLDSL.g:2449:1: rule__Cell__YAssignment_2 : ( RULE_INT ) ;
    public final void rule__Cell__YAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2453:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2454:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2454:2: ( RULE_INT )
            // InternalGoLDSL.g:2455:3: RULE_INT
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
    // InternalGoLDSL.g:2464:1: rule__Rule__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2468:1: ( ( ruleCondition ) )
            // InternalGoLDSL.g:2469:2: ( ruleCondition )
            {
            // InternalGoLDSL.g:2469:2: ( ruleCondition )
            // InternalGoLDSL.g:2470:3: ruleCondition
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
    // InternalGoLDSL.g:2479:1: rule__Rule__ActionAssignment_2 : ( ruleAction ) ;
    public final void rule__Rule__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2483:1: ( ( ruleAction ) )
            // InternalGoLDSL.g:2484:2: ( ruleAction )
            {
            // InternalGoLDSL.g:2484:2: ( ruleAction )
            // InternalGoLDSL.g:2485:3: ruleAction
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
    // InternalGoLDSL.g:2494:1: rule__ConditionRule__NumberAssignment_0 : ( RULE_INT ) ;
    public final void rule__ConditionRule__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2498:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2499:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2499:2: ( RULE_INT )
            // InternalGoLDSL.g:2500:3: RULE_INT
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
    // InternalGoLDSL.g:2509:1: rule__ConditionRule__RangeAssignment_1 : ( ruleRange ) ;
    public final void rule__ConditionRule__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2513:1: ( ( ruleRange ) )
            // InternalGoLDSL.g:2514:2: ( ruleRange )
            {
            // InternalGoLDSL.g:2514:2: ( ruleRange )
            // InternalGoLDSL.g:2515:3: ruleRange
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
    // InternalGoLDSL.g:2524:1: rule__ConditionRule__AliveAssignment_2 : ( ( 'IsAlive' ) ) ;
    public final void rule__ConditionRule__AliveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2528:1: ( ( ( 'IsAlive' ) ) )
            // InternalGoLDSL.g:2529:2: ( ( 'IsAlive' ) )
            {
            // InternalGoLDSL.g:2529:2: ( ( 'IsAlive' ) )
            // InternalGoLDSL.g:2530:3: ( 'IsAlive' )
            {
             before(grammarAccess.getConditionRuleAccess().getAliveIsAliveKeyword_2_0()); 
            // InternalGoLDSL.g:2531:3: ( 'IsAlive' )
            // InternalGoLDSL.g:2532:4: 'IsAlive'
            {
             before(grammarAccess.getConditionRuleAccess().getAliveIsAliveKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConditionRuleAccess().getAliveIsAliveKeyword_2_0()); 

            }

             after(grammarAccess.getConditionRuleAccess().getAliveIsAliveKeyword_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ConditionRules__Rule1Assignment_0"
    // InternalGoLDSL.g:2543:1: rule__ConditionRules__Rule1Assignment_0 : ( ruleConditionRule ) ;
    public final void rule__ConditionRules__Rule1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2547:1: ( ( ruleConditionRule ) )
            // InternalGoLDSL.g:2548:2: ( ruleConditionRule )
            {
            // InternalGoLDSL.g:2548:2: ( ruleConditionRule )
            // InternalGoLDSL.g:2549:3: ruleConditionRule
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
    // InternalGoLDSL.g:2558:1: rule__ConditionRules__OperatorAssignment_1_0 : ( ruleBoolOperator ) ;
    public final void rule__ConditionRules__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2562:1: ( ( ruleBoolOperator ) )
            // InternalGoLDSL.g:2563:2: ( ruleBoolOperator )
            {
            // InternalGoLDSL.g:2563:2: ( ruleBoolOperator )
            // InternalGoLDSL.g:2564:3: ruleBoolOperator
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
    // InternalGoLDSL.g:2573:1: rule__ConditionRules__Rule2Assignment_1_1 : ( ruleConditionRules ) ;
    public final void rule__ConditionRules__Rule2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2577:1: ( ( ruleConditionRules ) )
            // InternalGoLDSL.g:2578:2: ( ruleConditionRules )
            {
            // InternalGoLDSL.g:2578:2: ( ruleConditionRules )
            // InternalGoLDSL.g:2579:3: ruleConditionRules
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


    // $ANTLR start "rule__Range__BoundedAssignment_0"
    // InternalGoLDSL.g:2588:1: rule__Range__BoundedAssignment_0 : ( ruleBoundedRange ) ;
    public final void rule__Range__BoundedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2592:1: ( ( ruleBoundedRange ) )
            // InternalGoLDSL.g:2593:2: ( ruleBoundedRange )
            {
            // InternalGoLDSL.g:2593:2: ( ruleBoundedRange )
            // InternalGoLDSL.g:2594:3: ruleBoundedRange
            {
             before(grammarAccess.getRangeAccess().getBoundedBoundedRangeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBoundedRange();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getBoundedBoundedRangeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__BoundedAssignment_0"


    // $ANTLR start "rule__Range__UnboundedAssignment_1"
    // InternalGoLDSL.g:2603:1: rule__Range__UnboundedAssignment_1 : ( ruleUnboundedRange ) ;
    public final void rule__Range__UnboundedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2607:1: ( ( ruleUnboundedRange ) )
            // InternalGoLDSL.g:2608:2: ( ruleUnboundedRange )
            {
            // InternalGoLDSL.g:2608:2: ( ruleUnboundedRange )
            // InternalGoLDSL.g:2609:3: ruleUnboundedRange
            {
             before(grammarAccess.getRangeAccess().getUnboundedUnboundedRangeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnboundedRange();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getUnboundedUnboundedRangeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__UnboundedAssignment_1"


    // $ANTLR start "rule__BoundedRange__LowerBoundAssignment_0"
    // InternalGoLDSL.g:2618:1: rule__BoundedRange__LowerBoundAssignment_0 : ( RULE_INT ) ;
    public final void rule__BoundedRange__LowerBoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2622:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2623:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2623:2: ( RULE_INT )
            // InternalGoLDSL.g:2624:3: RULE_INT
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
    // InternalGoLDSL.g:2633:1: rule__BoundedRange__HigherBoundAssignment_2 : ( RULE_INT ) ;
    public final void rule__BoundedRange__HigherBoundAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2637:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2638:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2638:2: ( RULE_INT )
            // InternalGoLDSL.g:2639:3: RULE_INT
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


    // $ANTLR start "rule__UnboundedRange__LeftAssignment_0"
    // InternalGoLDSL.g:2648:1: rule__UnboundedRange__LeftAssignment_0 : ( ruleLeftUnboundedRange ) ;
    public final void rule__UnboundedRange__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2652:1: ( ( ruleLeftUnboundedRange ) )
            // InternalGoLDSL.g:2653:2: ( ruleLeftUnboundedRange )
            {
            // InternalGoLDSL.g:2653:2: ( ruleLeftUnboundedRange )
            // InternalGoLDSL.g:2654:3: ruleLeftUnboundedRange
            {
             before(grammarAccess.getUnboundedRangeAccess().getLeftLeftUnboundedRangeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLeftUnboundedRange();

            state._fsp--;

             after(grammarAccess.getUnboundedRangeAccess().getLeftLeftUnboundedRangeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnboundedRange__LeftAssignment_0"


    // $ANTLR start "rule__UnboundedRange__RightAssignment_1"
    // InternalGoLDSL.g:2663:1: rule__UnboundedRange__RightAssignment_1 : ( ruleRightUnboundedRange ) ;
    public final void rule__UnboundedRange__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2667:1: ( ( ruleRightUnboundedRange ) )
            // InternalGoLDSL.g:2668:2: ( ruleRightUnboundedRange )
            {
            // InternalGoLDSL.g:2668:2: ( ruleRightUnboundedRange )
            // InternalGoLDSL.g:2669:3: ruleRightUnboundedRange
            {
             before(grammarAccess.getUnboundedRangeAccess().getRightRightUnboundedRangeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRightUnboundedRange();

            state._fsp--;

             after(grammarAccess.getUnboundedRangeAccess().getRightRightUnboundedRangeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnboundedRange__RightAssignment_1"


    // $ANTLR start "rule__Grid__SizeAssignment_1"
    // InternalGoLDSL.g:2678:1: rule__Grid__SizeAssignment_1 : ( ruleSize ) ;
    public final void rule__Grid__SizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2682:1: ( ( ruleSize ) )
            // InternalGoLDSL.g:2683:2: ( ruleSize )
            {
            // InternalGoLDSL.g:2683:2: ( ruleSize )
            // InternalGoLDSL.g:2684:3: ruleSize
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
    // InternalGoLDSL.g:2693:1: rule__Grid__PartsAssignment_2 : ( ruleGridPart ) ;
    public final void rule__Grid__PartsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2697:1: ( ( ruleGridPart ) )
            // InternalGoLDSL.g:2698:2: ( ruleGridPart )
            {
            // InternalGoLDSL.g:2698:2: ( ruleGridPart )
            // InternalGoLDSL.g:2699:3: ruleGridPart
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
    // InternalGoLDSL.g:2708:1: rule__Offset__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Offset__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2712:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2713:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2713:2: ( RULE_INT )
            // InternalGoLDSL.g:2714:3: RULE_INT
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
    // InternalGoLDSL.g:2723:1: rule__Offset__YAssignment_2 : ( RULE_INT ) ;
    public final void rule__Offset__YAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2727:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2728:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2728:2: ( RULE_INT )
            // InternalGoLDSL.g:2729:3: RULE_INT
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
    // InternalGoLDSL.g:2738:1: rule__Size__WidthAssignment_1 : ( RULE_INT ) ;
    public final void rule__Size__WidthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2742:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2743:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2743:2: ( RULE_INT )
            // InternalGoLDSL.g:2744:3: RULE_INT
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
    // InternalGoLDSL.g:2753:1: rule__Size__HeightAssignment_2 : ( RULE_INT ) ;
    public final void rule__Size__HeightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2757:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2758:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2758:2: ( RULE_INT )
            // InternalGoLDSL.g:2759:3: RULE_INT
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000018310000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000044000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000006002L});

}