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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'&'", "'|'", "'+'", "'-'", "'Board:'", "'Shape'", "':'", "'('", "')'", "'Cells:'", "'Cell:'", "','", "'Rule:'", "'Create'", "'If'", "'..'", "'Grid:'", "'offset'", "'size'", "'IsAlive'"
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
    // InternalGoLDSL.g:677:1: rule__ConditionRule__Alternatives : ( ( ( rule__ConditionRule__NumberAssignment_0 ) ) | ( ( rule__ConditionRule__RangeAssignment_1 ) ) | ( ( rule__ConditionRule__AliveAssignment_2 ) ) );
    public final void rule__ConditionRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:681:1: ( ( ( rule__ConditionRule__NumberAssignment_0 ) ) | ( ( rule__ConditionRule__RangeAssignment_1 ) ) | ( ( rule__ConditionRule__AliveAssignment_2 ) ) )
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

            }
        }
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
    // InternalGoLDSL.g:704:1: rule__Range__Alternatives : ( ( ruleBoundedRange ) | ( ruleLeftUnboundedRange ) | ( ruleRightUnboundedRange ) );
    public final void rule__Range__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:708:1: ( ( ruleBoundedRange ) | ( ruleLeftUnboundedRange ) | ( ruleRightUnboundedRange ) )
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
                    // InternalGoLDSL.g:709:2: ( ruleBoundedRange )
                    {
                    // InternalGoLDSL.g:709:2: ( ruleBoundedRange )
                    // InternalGoLDSL.g:710:3: ruleBoundedRange
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
                    // InternalGoLDSL.g:715:2: ( ruleLeftUnboundedRange )
                    {
                    // InternalGoLDSL.g:715:2: ( ruleLeftUnboundedRange )
                    // InternalGoLDSL.g:716:3: ruleLeftUnboundedRange
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
                    // InternalGoLDSL.g:721:2: ( ruleRightUnboundedRange )
                    {
                    // InternalGoLDSL.g:721:2: ( ruleRightUnboundedRange )
                    // InternalGoLDSL.g:722:3: ruleRightUnboundedRange
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
    // InternalGoLDSL.g:731:1: rule__BoolOperator__Alternatives : ( ( ( '&' ) ) | ( ( '|' ) ) );
    public final void rule__BoolOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:735:1: ( ( ( '&' ) ) | ( ( '|' ) ) )
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
                    // InternalGoLDSL.g:736:2: ( ( '&' ) )
                    {
                    // InternalGoLDSL.g:736:2: ( ( '&' ) )
                    // InternalGoLDSL.g:737:3: ( '&' )
                    {
                     before(grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalGoLDSL.g:738:3: ( '&' )
                    // InternalGoLDSL.g:738:4: '&'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:742:2: ( ( '|' ) )
                    {
                    // InternalGoLDSL.g:742:2: ( ( '|' ) )
                    // InternalGoLDSL.g:743:3: ( '|' )
                    {
                     before(grammarAccess.getBoolOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalGoLDSL.g:744:3: ( '|' )
                    // InternalGoLDSL.g:744:4: '|'
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
    // InternalGoLDSL.g:752:1: rule__GridPart__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__GridPart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:756:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
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
                    // InternalGoLDSL.g:757:2: ( ( '+' ) )
                    {
                    // InternalGoLDSL.g:757:2: ( ( '+' ) )
                    // InternalGoLDSL.g:758:3: ( '+' )
                    {
                     before(grammarAccess.getGridPartAccess().getALIVEEnumLiteralDeclaration_0()); 
                    // InternalGoLDSL.g:759:3: ( '+' )
                    // InternalGoLDSL.g:759:4: '+'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getGridPartAccess().getALIVEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:763:2: ( ( '-' ) )
                    {
                    // InternalGoLDSL.g:763:2: ( ( '-' ) )
                    // InternalGoLDSL.g:764:3: ( '-' )
                    {
                     before(grammarAccess.getGridPartAccess().getDEADEnumLiteralDeclaration_1()); 
                    // InternalGoLDSL.g:765:3: ( '-' )
                    // InternalGoLDSL.g:765:4: '-'
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
    // InternalGoLDSL.g:773:1: rule__DSL__Group__0 : rule__DSL__Group__0__Impl rule__DSL__Group__1 ;
    public final void rule__DSL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:777:1: ( rule__DSL__Group__0__Impl rule__DSL__Group__1 )
            // InternalGoLDSL.g:778:2: rule__DSL__Group__0__Impl rule__DSL__Group__1
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
    // InternalGoLDSL.g:785:1: rule__DSL__Group__0__Impl : ( ( rule__DSL__BoardAssignment_0 ) ) ;
    public final void rule__DSL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:789:1: ( ( ( rule__DSL__BoardAssignment_0 ) ) )
            // InternalGoLDSL.g:790:1: ( ( rule__DSL__BoardAssignment_0 ) )
            {
            // InternalGoLDSL.g:790:1: ( ( rule__DSL__BoardAssignment_0 ) )
            // InternalGoLDSL.g:791:2: ( rule__DSL__BoardAssignment_0 )
            {
             before(grammarAccess.getDSLAccess().getBoardAssignment_0()); 
            // InternalGoLDSL.g:792:2: ( rule__DSL__BoardAssignment_0 )
            // InternalGoLDSL.g:792:3: rule__DSL__BoardAssignment_0
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
    // InternalGoLDSL.g:800:1: rule__DSL__Group__1 : rule__DSL__Group__1__Impl ;
    public final void rule__DSL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:804:1: ( rule__DSL__Group__1__Impl )
            // InternalGoLDSL.g:805:2: rule__DSL__Group__1__Impl
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
    // InternalGoLDSL.g:811:1: rule__DSL__Group__1__Impl : ( ( rule__DSL__Alternatives_1 )* ) ;
    public final void rule__DSL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:815:1: ( ( ( rule__DSL__Alternatives_1 )* ) )
            // InternalGoLDSL.g:816:1: ( ( rule__DSL__Alternatives_1 )* )
            {
            // InternalGoLDSL.g:816:1: ( ( rule__DSL__Alternatives_1 )* )
            // InternalGoLDSL.g:817:2: ( rule__DSL__Alternatives_1 )*
            {
             before(grammarAccess.getDSLAccess().getAlternatives_1()); 
            // InternalGoLDSL.g:818:2: ( rule__DSL__Alternatives_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16||LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGoLDSL.g:818:3: rule__DSL__Alternatives_1
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
    // InternalGoLDSL.g:827:1: rule__Board__Group__0 : rule__Board__Group__0__Impl rule__Board__Group__1 ;
    public final void rule__Board__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:831:1: ( rule__Board__Group__0__Impl rule__Board__Group__1 )
            // InternalGoLDSL.g:832:2: rule__Board__Group__0__Impl rule__Board__Group__1
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
    // InternalGoLDSL.g:839:1: rule__Board__Group__0__Impl : ( 'Board:' ) ;
    public final void rule__Board__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:843:1: ( ( 'Board:' ) )
            // InternalGoLDSL.g:844:1: ( 'Board:' )
            {
            // InternalGoLDSL.g:844:1: ( 'Board:' )
            // InternalGoLDSL.g:845:2: 'Board:'
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
    // InternalGoLDSL.g:854:1: rule__Board__Group__1 : rule__Board__Group__1__Impl ;
    public final void rule__Board__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:858:1: ( rule__Board__Group__1__Impl )
            // InternalGoLDSL.g:859:2: rule__Board__Group__1__Impl
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
    // InternalGoLDSL.g:865:1: rule__Board__Group__1__Impl : ( ruleObjects ) ;
    public final void rule__Board__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:869:1: ( ( ruleObjects ) )
            // InternalGoLDSL.g:870:1: ( ruleObjects )
            {
            // InternalGoLDSL.g:870:1: ( ruleObjects )
            // InternalGoLDSL.g:871:2: ruleObjects
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
    // InternalGoLDSL.g:881:1: rule__ShapeDef__Group__0 : rule__ShapeDef__Group__0__Impl rule__ShapeDef__Group__1 ;
    public final void rule__ShapeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:885:1: ( rule__ShapeDef__Group__0__Impl rule__ShapeDef__Group__1 )
            // InternalGoLDSL.g:886:2: rule__ShapeDef__Group__0__Impl rule__ShapeDef__Group__1
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
    // InternalGoLDSL.g:893:1: rule__ShapeDef__Group__0__Impl : ( 'Shape' ) ;
    public final void rule__ShapeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:897:1: ( ( 'Shape' ) )
            // InternalGoLDSL.g:898:1: ( 'Shape' )
            {
            // InternalGoLDSL.g:898:1: ( 'Shape' )
            // InternalGoLDSL.g:899:2: 'Shape'
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
    // InternalGoLDSL.g:908:1: rule__ShapeDef__Group__1 : rule__ShapeDef__Group__1__Impl rule__ShapeDef__Group__2 ;
    public final void rule__ShapeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:912:1: ( rule__ShapeDef__Group__1__Impl rule__ShapeDef__Group__2 )
            // InternalGoLDSL.g:913:2: rule__ShapeDef__Group__1__Impl rule__ShapeDef__Group__2
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
    // InternalGoLDSL.g:920:1: rule__ShapeDef__Group__1__Impl : ( ( rule__ShapeDef__NameAssignment_1 ) ) ;
    public final void rule__ShapeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:924:1: ( ( ( rule__ShapeDef__NameAssignment_1 ) ) )
            // InternalGoLDSL.g:925:1: ( ( rule__ShapeDef__NameAssignment_1 ) )
            {
            // InternalGoLDSL.g:925:1: ( ( rule__ShapeDef__NameAssignment_1 ) )
            // InternalGoLDSL.g:926:2: ( rule__ShapeDef__NameAssignment_1 )
            {
             before(grammarAccess.getShapeDefAccess().getNameAssignment_1()); 
            // InternalGoLDSL.g:927:2: ( rule__ShapeDef__NameAssignment_1 )
            // InternalGoLDSL.g:927:3: rule__ShapeDef__NameAssignment_1
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
    // InternalGoLDSL.g:935:1: rule__ShapeDef__Group__2 : rule__ShapeDef__Group__2__Impl rule__ShapeDef__Group__3 ;
    public final void rule__ShapeDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:939:1: ( rule__ShapeDef__Group__2__Impl rule__ShapeDef__Group__3 )
            // InternalGoLDSL.g:940:2: rule__ShapeDef__Group__2__Impl rule__ShapeDef__Group__3
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
    // InternalGoLDSL.g:947:1: rule__ShapeDef__Group__2__Impl : ( ':' ) ;
    public final void rule__ShapeDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:951:1: ( ( ':' ) )
            // InternalGoLDSL.g:952:1: ( ':' )
            {
            // InternalGoLDSL.g:952:1: ( ':' )
            // InternalGoLDSL.g:953:2: ':'
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
    // InternalGoLDSL.g:962:1: rule__ShapeDef__Group__3 : rule__ShapeDef__Group__3__Impl rule__ShapeDef__Group__4 ;
    public final void rule__ShapeDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:966:1: ( rule__ShapeDef__Group__3__Impl rule__ShapeDef__Group__4 )
            // InternalGoLDSL.g:967:2: rule__ShapeDef__Group__3__Impl rule__ShapeDef__Group__4
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
    // InternalGoLDSL.g:974:1: rule__ShapeDef__Group__3__Impl : ( ( rule__ShapeDef__OffsetAssignment_3 )? ) ;
    public final void rule__ShapeDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:978:1: ( ( ( rule__ShapeDef__OffsetAssignment_3 )? ) )
            // InternalGoLDSL.g:979:1: ( ( rule__ShapeDef__OffsetAssignment_3 )? )
            {
            // InternalGoLDSL.g:979:1: ( ( rule__ShapeDef__OffsetAssignment_3 )? )
            // InternalGoLDSL.g:980:2: ( rule__ShapeDef__OffsetAssignment_3 )?
            {
             before(grammarAccess.getShapeDefAccess().getOffsetAssignment_3()); 
            // InternalGoLDSL.g:981:2: ( rule__ShapeDef__OffsetAssignment_3 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGoLDSL.g:981:3: rule__ShapeDef__OffsetAssignment_3
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
    // InternalGoLDSL.g:989:1: rule__ShapeDef__Group__4 : rule__ShapeDef__Group__4__Impl ;
    public final void rule__ShapeDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:993:1: ( rule__ShapeDef__Group__4__Impl )
            // InternalGoLDSL.g:994:2: rule__ShapeDef__Group__4__Impl
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
    // InternalGoLDSL.g:1000:1: rule__ShapeDef__Group__4__Impl : ( ( rule__ShapeDef__ObjectsAssignment_4 ) ) ;
    public final void rule__ShapeDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1004:1: ( ( ( rule__ShapeDef__ObjectsAssignment_4 ) ) )
            // InternalGoLDSL.g:1005:1: ( ( rule__ShapeDef__ObjectsAssignment_4 ) )
            {
            // InternalGoLDSL.g:1005:1: ( ( rule__ShapeDef__ObjectsAssignment_4 ) )
            // InternalGoLDSL.g:1006:2: ( rule__ShapeDef__ObjectsAssignment_4 )
            {
             before(grammarAccess.getShapeDefAccess().getObjectsAssignment_4()); 
            // InternalGoLDSL.g:1007:2: ( rule__ShapeDef__ObjectsAssignment_4 )
            // InternalGoLDSL.g:1007:3: rule__ShapeDef__ObjectsAssignment_4
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
    // InternalGoLDSL.g:1016:1: rule__CellPairs__Group__0 : rule__CellPairs__Group__0__Impl rule__CellPairs__Group__1 ;
    public final void rule__CellPairs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1020:1: ( rule__CellPairs__Group__0__Impl rule__CellPairs__Group__1 )
            // InternalGoLDSL.g:1021:2: rule__CellPairs__Group__0__Impl rule__CellPairs__Group__1
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
    // InternalGoLDSL.g:1028:1: rule__CellPairs__Group__0__Impl : ( '(' ) ;
    public final void rule__CellPairs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1032:1: ( ( '(' ) )
            // InternalGoLDSL.g:1033:1: ( '(' )
            {
            // InternalGoLDSL.g:1033:1: ( '(' )
            // InternalGoLDSL.g:1034:2: '('
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
    // InternalGoLDSL.g:1043:1: rule__CellPairs__Group__1 : rule__CellPairs__Group__1__Impl rule__CellPairs__Group__2 ;
    public final void rule__CellPairs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1047:1: ( rule__CellPairs__Group__1__Impl rule__CellPairs__Group__2 )
            // InternalGoLDSL.g:1048:2: rule__CellPairs__Group__1__Impl rule__CellPairs__Group__2
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
    // InternalGoLDSL.g:1055:1: rule__CellPairs__Group__1__Impl : ( ( rule__CellPairs__CellsAssignment_1 ) ) ;
    public final void rule__CellPairs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1059:1: ( ( ( rule__CellPairs__CellsAssignment_1 ) ) )
            // InternalGoLDSL.g:1060:1: ( ( rule__CellPairs__CellsAssignment_1 ) )
            {
            // InternalGoLDSL.g:1060:1: ( ( rule__CellPairs__CellsAssignment_1 ) )
            // InternalGoLDSL.g:1061:2: ( rule__CellPairs__CellsAssignment_1 )
            {
             before(grammarAccess.getCellPairsAccess().getCellsAssignment_1()); 
            // InternalGoLDSL.g:1062:2: ( rule__CellPairs__CellsAssignment_1 )
            // InternalGoLDSL.g:1062:3: rule__CellPairs__CellsAssignment_1
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
    // InternalGoLDSL.g:1070:1: rule__CellPairs__Group__2 : rule__CellPairs__Group__2__Impl ;
    public final void rule__CellPairs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1074:1: ( rule__CellPairs__Group__2__Impl )
            // InternalGoLDSL.g:1075:2: rule__CellPairs__Group__2__Impl
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
    // InternalGoLDSL.g:1081:1: rule__CellPairs__Group__2__Impl : ( ')' ) ;
    public final void rule__CellPairs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1085:1: ( ( ')' ) )
            // InternalGoLDSL.g:1086:1: ( ')' )
            {
            // InternalGoLDSL.g:1086:1: ( ')' )
            // InternalGoLDSL.g:1087:2: ')'
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
    // InternalGoLDSL.g:1097:1: rule__Cells__Group__0 : rule__Cells__Group__0__Impl rule__Cells__Group__1 ;
    public final void rule__Cells__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1101:1: ( rule__Cells__Group__0__Impl rule__Cells__Group__1 )
            // InternalGoLDSL.g:1102:2: rule__Cells__Group__0__Impl rule__Cells__Group__1
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
    // InternalGoLDSL.g:1109:1: rule__Cells__Group__0__Impl : ( 'Cells:' ) ;
    public final void rule__Cells__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1113:1: ( ( 'Cells:' ) )
            // InternalGoLDSL.g:1114:1: ( 'Cells:' )
            {
            // InternalGoLDSL.g:1114:1: ( 'Cells:' )
            // InternalGoLDSL.g:1115:2: 'Cells:'
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
    // InternalGoLDSL.g:1124:1: rule__Cells__Group__1 : rule__Cells__Group__1__Impl ;
    public final void rule__Cells__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1128:1: ( rule__Cells__Group__1__Impl )
            // InternalGoLDSL.g:1129:2: rule__Cells__Group__1__Impl
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
    // InternalGoLDSL.g:1135:1: rule__Cells__Group__1__Impl : ( ruleCellPairs ) ;
    public final void rule__Cells__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1139:1: ( ( ruleCellPairs ) )
            // InternalGoLDSL.g:1140:1: ( ruleCellPairs )
            {
            // InternalGoLDSL.g:1140:1: ( ruleCellPairs )
            // InternalGoLDSL.g:1141:2: ruleCellPairs
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
    // InternalGoLDSL.g:1151:1: rule__CellDef__Group__0 : rule__CellDef__Group__0__Impl rule__CellDef__Group__1 ;
    public final void rule__CellDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1155:1: ( rule__CellDef__Group__0__Impl rule__CellDef__Group__1 )
            // InternalGoLDSL.g:1156:2: rule__CellDef__Group__0__Impl rule__CellDef__Group__1
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
    // InternalGoLDSL.g:1163:1: rule__CellDef__Group__0__Impl : ( 'Cell:' ) ;
    public final void rule__CellDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1167:1: ( ( 'Cell:' ) )
            // InternalGoLDSL.g:1168:1: ( 'Cell:' )
            {
            // InternalGoLDSL.g:1168:1: ( 'Cell:' )
            // InternalGoLDSL.g:1169:2: 'Cell:'
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
    // InternalGoLDSL.g:1178:1: rule__CellDef__Group__1 : rule__CellDef__Group__1__Impl ;
    public final void rule__CellDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1182:1: ( rule__CellDef__Group__1__Impl )
            // InternalGoLDSL.g:1183:2: rule__CellDef__Group__1__Impl
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
    // InternalGoLDSL.g:1189:1: rule__CellDef__Group__1__Impl : ( ruleCell ) ;
    public final void rule__CellDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1193:1: ( ( ruleCell ) )
            // InternalGoLDSL.g:1194:1: ( ruleCell )
            {
            // InternalGoLDSL.g:1194:1: ( ruleCell )
            // InternalGoLDSL.g:1195:2: ruleCell
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
    // InternalGoLDSL.g:1205:1: rule__ShapeRef__Group__0 : rule__ShapeRef__Group__0__Impl rule__ShapeRef__Group__1 ;
    public final void rule__ShapeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1209:1: ( rule__ShapeRef__Group__0__Impl rule__ShapeRef__Group__1 )
            // InternalGoLDSL.g:1210:2: rule__ShapeRef__Group__0__Impl rule__ShapeRef__Group__1
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
    // InternalGoLDSL.g:1217:1: rule__ShapeRef__Group__0__Impl : ( 'Shape' ) ;
    public final void rule__ShapeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1221:1: ( ( 'Shape' ) )
            // InternalGoLDSL.g:1222:1: ( 'Shape' )
            {
            // InternalGoLDSL.g:1222:1: ( 'Shape' )
            // InternalGoLDSL.g:1223:2: 'Shape'
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
    // InternalGoLDSL.g:1232:1: rule__ShapeRef__Group__1 : rule__ShapeRef__Group__1__Impl rule__ShapeRef__Group__2 ;
    public final void rule__ShapeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1236:1: ( rule__ShapeRef__Group__1__Impl rule__ShapeRef__Group__2 )
            // InternalGoLDSL.g:1237:2: rule__ShapeRef__Group__1__Impl rule__ShapeRef__Group__2
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
    // InternalGoLDSL.g:1244:1: rule__ShapeRef__Group__1__Impl : ( ( rule__ShapeRef__NameAssignment_1 ) ) ;
    public final void rule__ShapeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1248:1: ( ( ( rule__ShapeRef__NameAssignment_1 ) ) )
            // InternalGoLDSL.g:1249:1: ( ( rule__ShapeRef__NameAssignment_1 ) )
            {
            // InternalGoLDSL.g:1249:1: ( ( rule__ShapeRef__NameAssignment_1 ) )
            // InternalGoLDSL.g:1250:2: ( rule__ShapeRef__NameAssignment_1 )
            {
             before(grammarAccess.getShapeRefAccess().getNameAssignment_1()); 
            // InternalGoLDSL.g:1251:2: ( rule__ShapeRef__NameAssignment_1 )
            // InternalGoLDSL.g:1251:3: rule__ShapeRef__NameAssignment_1
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
    // InternalGoLDSL.g:1259:1: rule__ShapeRef__Group__2 : rule__ShapeRef__Group__2__Impl rule__ShapeRef__Group__3 ;
    public final void rule__ShapeRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1263:1: ( rule__ShapeRef__Group__2__Impl rule__ShapeRef__Group__3 )
            // InternalGoLDSL.g:1264:2: rule__ShapeRef__Group__2__Impl rule__ShapeRef__Group__3
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
    // InternalGoLDSL.g:1271:1: rule__ShapeRef__Group__2__Impl : ( ':' ) ;
    public final void rule__ShapeRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1275:1: ( ( ':' ) )
            // InternalGoLDSL.g:1276:1: ( ':' )
            {
            // InternalGoLDSL.g:1276:1: ( ':' )
            // InternalGoLDSL.g:1277:2: ':'
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
    // InternalGoLDSL.g:1286:1: rule__ShapeRef__Group__3 : rule__ShapeRef__Group__3__Impl rule__ShapeRef__Group__4 ;
    public final void rule__ShapeRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1290:1: ( rule__ShapeRef__Group__3__Impl rule__ShapeRef__Group__4 )
            // InternalGoLDSL.g:1291:2: rule__ShapeRef__Group__3__Impl rule__ShapeRef__Group__4
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
    // InternalGoLDSL.g:1298:1: rule__ShapeRef__Group__3__Impl : ( ( rule__ShapeRef__XAssignment_3 ) ) ;
    public final void rule__ShapeRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1302:1: ( ( ( rule__ShapeRef__XAssignment_3 ) ) )
            // InternalGoLDSL.g:1303:1: ( ( rule__ShapeRef__XAssignment_3 ) )
            {
            // InternalGoLDSL.g:1303:1: ( ( rule__ShapeRef__XAssignment_3 ) )
            // InternalGoLDSL.g:1304:2: ( rule__ShapeRef__XAssignment_3 )
            {
             before(grammarAccess.getShapeRefAccess().getXAssignment_3()); 
            // InternalGoLDSL.g:1305:2: ( rule__ShapeRef__XAssignment_3 )
            // InternalGoLDSL.g:1305:3: rule__ShapeRef__XAssignment_3
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
    // InternalGoLDSL.g:1313:1: rule__ShapeRef__Group__4 : rule__ShapeRef__Group__4__Impl rule__ShapeRef__Group__5 ;
    public final void rule__ShapeRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1317:1: ( rule__ShapeRef__Group__4__Impl rule__ShapeRef__Group__5 )
            // InternalGoLDSL.g:1318:2: rule__ShapeRef__Group__4__Impl rule__ShapeRef__Group__5
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
    // InternalGoLDSL.g:1325:1: rule__ShapeRef__Group__4__Impl : ( ',' ) ;
    public final void rule__ShapeRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1329:1: ( ( ',' ) )
            // InternalGoLDSL.g:1330:1: ( ',' )
            {
            // InternalGoLDSL.g:1330:1: ( ',' )
            // InternalGoLDSL.g:1331:2: ','
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
    // InternalGoLDSL.g:1340:1: rule__ShapeRef__Group__5 : rule__ShapeRef__Group__5__Impl ;
    public final void rule__ShapeRef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1344:1: ( rule__ShapeRef__Group__5__Impl )
            // InternalGoLDSL.g:1345:2: rule__ShapeRef__Group__5__Impl
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
    // InternalGoLDSL.g:1351:1: rule__ShapeRef__Group__5__Impl : ( ( rule__ShapeRef__YAssignment_5 ) ) ;
    public final void rule__ShapeRef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1355:1: ( ( ( rule__ShapeRef__YAssignment_5 ) ) )
            // InternalGoLDSL.g:1356:1: ( ( rule__ShapeRef__YAssignment_5 ) )
            {
            // InternalGoLDSL.g:1356:1: ( ( rule__ShapeRef__YAssignment_5 ) )
            // InternalGoLDSL.g:1357:2: ( rule__ShapeRef__YAssignment_5 )
            {
             before(grammarAccess.getShapeRefAccess().getYAssignment_5()); 
            // InternalGoLDSL.g:1358:2: ( rule__ShapeRef__YAssignment_5 )
            // InternalGoLDSL.g:1358:3: rule__ShapeRef__YAssignment_5
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
    // InternalGoLDSL.g:1367:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1371:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalGoLDSL.g:1372:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
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
    // InternalGoLDSL.g:1379:1: rule__Cell__Group__0__Impl : ( ( rule__Cell__XAssignment_0 ) ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1383:1: ( ( ( rule__Cell__XAssignment_0 ) ) )
            // InternalGoLDSL.g:1384:1: ( ( rule__Cell__XAssignment_0 ) )
            {
            // InternalGoLDSL.g:1384:1: ( ( rule__Cell__XAssignment_0 ) )
            // InternalGoLDSL.g:1385:2: ( rule__Cell__XAssignment_0 )
            {
             before(grammarAccess.getCellAccess().getXAssignment_0()); 
            // InternalGoLDSL.g:1386:2: ( rule__Cell__XAssignment_0 )
            // InternalGoLDSL.g:1386:3: rule__Cell__XAssignment_0
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
    // InternalGoLDSL.g:1394:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl rule__Cell__Group__2 ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1398:1: ( rule__Cell__Group__1__Impl rule__Cell__Group__2 )
            // InternalGoLDSL.g:1399:2: rule__Cell__Group__1__Impl rule__Cell__Group__2
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
    // InternalGoLDSL.g:1406:1: rule__Cell__Group__1__Impl : ( ',' ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1410:1: ( ( ',' ) )
            // InternalGoLDSL.g:1411:1: ( ',' )
            {
            // InternalGoLDSL.g:1411:1: ( ',' )
            // InternalGoLDSL.g:1412:2: ','
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
    // InternalGoLDSL.g:1421:1: rule__Cell__Group__2 : rule__Cell__Group__2__Impl ;
    public final void rule__Cell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1425:1: ( rule__Cell__Group__2__Impl )
            // InternalGoLDSL.g:1426:2: rule__Cell__Group__2__Impl
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
    // InternalGoLDSL.g:1432:1: rule__Cell__Group__2__Impl : ( ( rule__Cell__YAssignment_2 ) ) ;
    public final void rule__Cell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1436:1: ( ( ( rule__Cell__YAssignment_2 ) ) )
            // InternalGoLDSL.g:1437:1: ( ( rule__Cell__YAssignment_2 ) )
            {
            // InternalGoLDSL.g:1437:1: ( ( rule__Cell__YAssignment_2 ) )
            // InternalGoLDSL.g:1438:2: ( rule__Cell__YAssignment_2 )
            {
             before(grammarAccess.getCellAccess().getYAssignment_2()); 
            // InternalGoLDSL.g:1439:2: ( rule__Cell__YAssignment_2 )
            // InternalGoLDSL.g:1439:3: rule__Cell__YAssignment_2
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
    // InternalGoLDSL.g:1448:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1452:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalGoLDSL.g:1453:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalGoLDSL.g:1460:1: rule__Rule__Group__0__Impl : ( 'Rule:' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1464:1: ( ( 'Rule:' ) )
            // InternalGoLDSL.g:1465:1: ( 'Rule:' )
            {
            // InternalGoLDSL.g:1465:1: ( 'Rule:' )
            // InternalGoLDSL.g:1466:2: 'Rule:'
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
    // InternalGoLDSL.g:1475:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1479:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalGoLDSL.g:1480:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalGoLDSL.g:1487:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__ConditionAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1491:1: ( ( ( rule__Rule__ConditionAssignment_1 ) ) )
            // InternalGoLDSL.g:1492:1: ( ( rule__Rule__ConditionAssignment_1 ) )
            {
            // InternalGoLDSL.g:1492:1: ( ( rule__Rule__ConditionAssignment_1 ) )
            // InternalGoLDSL.g:1493:2: ( rule__Rule__ConditionAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_1()); 
            // InternalGoLDSL.g:1494:2: ( rule__Rule__ConditionAssignment_1 )
            // InternalGoLDSL.g:1494:3: rule__Rule__ConditionAssignment_1
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
    // InternalGoLDSL.g:1502:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1506:1: ( rule__Rule__Group__2__Impl )
            // InternalGoLDSL.g:1507:2: rule__Rule__Group__2__Impl
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
    // InternalGoLDSL.g:1513:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ActionAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1517:1: ( ( ( rule__Rule__ActionAssignment_2 ) ) )
            // InternalGoLDSL.g:1518:1: ( ( rule__Rule__ActionAssignment_2 ) )
            {
            // InternalGoLDSL.g:1518:1: ( ( rule__Rule__ActionAssignment_2 ) )
            // InternalGoLDSL.g:1519:2: ( rule__Rule__ActionAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getActionAssignment_2()); 
            // InternalGoLDSL.g:1520:2: ( rule__Rule__ActionAssignment_2 )
            // InternalGoLDSL.g:1520:3: rule__Rule__ActionAssignment_2
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
    // InternalGoLDSL.g:1529:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1533:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalGoLDSL.g:1534:2: rule__Action__Group__0__Impl rule__Action__Group__1
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
    // InternalGoLDSL.g:1541:1: rule__Action__Group__0__Impl : ( 'Create' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1545:1: ( ( 'Create' ) )
            // InternalGoLDSL.g:1546:1: ( 'Create' )
            {
            // InternalGoLDSL.g:1546:1: ( 'Create' )
            // InternalGoLDSL.g:1547:2: 'Create'
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
    // InternalGoLDSL.g:1556:1: rule__Action__Group__1 : rule__Action__Group__1__Impl ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1560:1: ( rule__Action__Group__1__Impl )
            // InternalGoLDSL.g:1561:2: rule__Action__Group__1__Impl
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
    // InternalGoLDSL.g:1567:1: rule__Action__Group__1__Impl : ( ruleObjects ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1571:1: ( ( ruleObjects ) )
            // InternalGoLDSL.g:1572:1: ( ruleObjects )
            {
            // InternalGoLDSL.g:1572:1: ( ruleObjects )
            // InternalGoLDSL.g:1573:2: ruleObjects
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
    // InternalGoLDSL.g:1583:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1587:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGoLDSL.g:1588:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalGoLDSL.g:1595:1: rule__Condition__Group__0__Impl : ( 'If' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1599:1: ( ( 'If' ) )
            // InternalGoLDSL.g:1600:1: ( 'If' )
            {
            // InternalGoLDSL.g:1600:1: ( 'If' )
            // InternalGoLDSL.g:1601:2: 'If'
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
    // InternalGoLDSL.g:1610:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1614:1: ( rule__Condition__Group__1__Impl )
            // InternalGoLDSL.g:1615:2: rule__Condition__Group__1__Impl
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
    // InternalGoLDSL.g:1621:1: rule__Condition__Group__1__Impl : ( ruleConditionRules ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1625:1: ( ( ruleConditionRules ) )
            // InternalGoLDSL.g:1626:1: ( ruleConditionRules )
            {
            // InternalGoLDSL.g:1626:1: ( ruleConditionRules )
            // InternalGoLDSL.g:1627:2: ruleConditionRules
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
    // InternalGoLDSL.g:1637:1: rule__ConditionRules__Group__0 : rule__ConditionRules__Group__0__Impl rule__ConditionRules__Group__1 ;
    public final void rule__ConditionRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1641:1: ( rule__ConditionRules__Group__0__Impl rule__ConditionRules__Group__1 )
            // InternalGoLDSL.g:1642:2: rule__ConditionRules__Group__0__Impl rule__ConditionRules__Group__1
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
    // InternalGoLDSL.g:1649:1: rule__ConditionRules__Group__0__Impl : ( ( rule__ConditionRules__Rule1Assignment_0 ) ) ;
    public final void rule__ConditionRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1653:1: ( ( ( rule__ConditionRules__Rule1Assignment_0 ) ) )
            // InternalGoLDSL.g:1654:1: ( ( rule__ConditionRules__Rule1Assignment_0 ) )
            {
            // InternalGoLDSL.g:1654:1: ( ( rule__ConditionRules__Rule1Assignment_0 ) )
            // InternalGoLDSL.g:1655:2: ( rule__ConditionRules__Rule1Assignment_0 )
            {
             before(grammarAccess.getConditionRulesAccess().getRule1Assignment_0()); 
            // InternalGoLDSL.g:1656:2: ( rule__ConditionRules__Rule1Assignment_0 )
            // InternalGoLDSL.g:1656:3: rule__ConditionRules__Rule1Assignment_0
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
    // InternalGoLDSL.g:1664:1: rule__ConditionRules__Group__1 : rule__ConditionRules__Group__1__Impl ;
    public final void rule__ConditionRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1668:1: ( rule__ConditionRules__Group__1__Impl )
            // InternalGoLDSL.g:1669:2: rule__ConditionRules__Group__1__Impl
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
    // InternalGoLDSL.g:1675:1: rule__ConditionRules__Group__1__Impl : ( ( rule__ConditionRules__Group_1__0 )? ) ;
    public final void rule__ConditionRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1679:1: ( ( ( rule__ConditionRules__Group_1__0 )? ) )
            // InternalGoLDSL.g:1680:1: ( ( rule__ConditionRules__Group_1__0 )? )
            {
            // InternalGoLDSL.g:1680:1: ( ( rule__ConditionRules__Group_1__0 )? )
            // InternalGoLDSL.g:1681:2: ( rule__ConditionRules__Group_1__0 )?
            {
             before(grammarAccess.getConditionRulesAccess().getGroup_1()); 
            // InternalGoLDSL.g:1682:2: ( rule__ConditionRules__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=11 && LA11_0<=12)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGoLDSL.g:1682:3: rule__ConditionRules__Group_1__0
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
    // InternalGoLDSL.g:1691:1: rule__ConditionRules__Group_1__0 : rule__ConditionRules__Group_1__0__Impl rule__ConditionRules__Group_1__1 ;
    public final void rule__ConditionRules__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1695:1: ( rule__ConditionRules__Group_1__0__Impl rule__ConditionRules__Group_1__1 )
            // InternalGoLDSL.g:1696:2: rule__ConditionRules__Group_1__0__Impl rule__ConditionRules__Group_1__1
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
    // InternalGoLDSL.g:1703:1: rule__ConditionRules__Group_1__0__Impl : ( ( rule__ConditionRules__OperatorAssignment_1_0 ) ) ;
    public final void rule__ConditionRules__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1707:1: ( ( ( rule__ConditionRules__OperatorAssignment_1_0 ) ) )
            // InternalGoLDSL.g:1708:1: ( ( rule__ConditionRules__OperatorAssignment_1_0 ) )
            {
            // InternalGoLDSL.g:1708:1: ( ( rule__ConditionRules__OperatorAssignment_1_0 ) )
            // InternalGoLDSL.g:1709:2: ( rule__ConditionRules__OperatorAssignment_1_0 )
            {
             before(grammarAccess.getConditionRulesAccess().getOperatorAssignment_1_0()); 
            // InternalGoLDSL.g:1710:2: ( rule__ConditionRules__OperatorAssignment_1_0 )
            // InternalGoLDSL.g:1710:3: rule__ConditionRules__OperatorAssignment_1_0
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
    // InternalGoLDSL.g:1718:1: rule__ConditionRules__Group_1__1 : rule__ConditionRules__Group_1__1__Impl ;
    public final void rule__ConditionRules__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1722:1: ( rule__ConditionRules__Group_1__1__Impl )
            // InternalGoLDSL.g:1723:2: rule__ConditionRules__Group_1__1__Impl
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
    // InternalGoLDSL.g:1729:1: rule__ConditionRules__Group_1__1__Impl : ( ( rule__ConditionRules__Rule2Assignment_1_1 ) ) ;
    public final void rule__ConditionRules__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1733:1: ( ( ( rule__ConditionRules__Rule2Assignment_1_1 ) ) )
            // InternalGoLDSL.g:1734:1: ( ( rule__ConditionRules__Rule2Assignment_1_1 ) )
            {
            // InternalGoLDSL.g:1734:1: ( ( rule__ConditionRules__Rule2Assignment_1_1 ) )
            // InternalGoLDSL.g:1735:2: ( rule__ConditionRules__Rule2Assignment_1_1 )
            {
             before(grammarAccess.getConditionRulesAccess().getRule2Assignment_1_1()); 
            // InternalGoLDSL.g:1736:2: ( rule__ConditionRules__Rule2Assignment_1_1 )
            // InternalGoLDSL.g:1736:3: rule__ConditionRules__Rule2Assignment_1_1
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
    // InternalGoLDSL.g:1745:1: rule__BoundedRange__Group__0 : rule__BoundedRange__Group__0__Impl rule__BoundedRange__Group__1 ;
    public final void rule__BoundedRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1749:1: ( rule__BoundedRange__Group__0__Impl rule__BoundedRange__Group__1 )
            // InternalGoLDSL.g:1750:2: rule__BoundedRange__Group__0__Impl rule__BoundedRange__Group__1
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
    // InternalGoLDSL.g:1757:1: rule__BoundedRange__Group__0__Impl : ( ( rule__BoundedRange__LowerBoundAssignment_0 ) ) ;
    public final void rule__BoundedRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1761:1: ( ( ( rule__BoundedRange__LowerBoundAssignment_0 ) ) )
            // InternalGoLDSL.g:1762:1: ( ( rule__BoundedRange__LowerBoundAssignment_0 ) )
            {
            // InternalGoLDSL.g:1762:1: ( ( rule__BoundedRange__LowerBoundAssignment_0 ) )
            // InternalGoLDSL.g:1763:2: ( rule__BoundedRange__LowerBoundAssignment_0 )
            {
             before(grammarAccess.getBoundedRangeAccess().getLowerBoundAssignment_0()); 
            // InternalGoLDSL.g:1764:2: ( rule__BoundedRange__LowerBoundAssignment_0 )
            // InternalGoLDSL.g:1764:3: rule__BoundedRange__LowerBoundAssignment_0
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
    // InternalGoLDSL.g:1772:1: rule__BoundedRange__Group__1 : rule__BoundedRange__Group__1__Impl rule__BoundedRange__Group__2 ;
    public final void rule__BoundedRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1776:1: ( rule__BoundedRange__Group__1__Impl rule__BoundedRange__Group__2 )
            // InternalGoLDSL.g:1777:2: rule__BoundedRange__Group__1__Impl rule__BoundedRange__Group__2
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
    // InternalGoLDSL.g:1784:1: rule__BoundedRange__Group__1__Impl : ( '..' ) ;
    public final void rule__BoundedRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1788:1: ( ( '..' ) )
            // InternalGoLDSL.g:1789:1: ( '..' )
            {
            // InternalGoLDSL.g:1789:1: ( '..' )
            // InternalGoLDSL.g:1790:2: '..'
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
    // InternalGoLDSL.g:1799:1: rule__BoundedRange__Group__2 : rule__BoundedRange__Group__2__Impl ;
    public final void rule__BoundedRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1803:1: ( rule__BoundedRange__Group__2__Impl )
            // InternalGoLDSL.g:1804:2: rule__BoundedRange__Group__2__Impl
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
    // InternalGoLDSL.g:1810:1: rule__BoundedRange__Group__2__Impl : ( ( rule__BoundedRange__HigherBoundAssignment_2 ) ) ;
    public final void rule__BoundedRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1814:1: ( ( ( rule__BoundedRange__HigherBoundAssignment_2 ) ) )
            // InternalGoLDSL.g:1815:1: ( ( rule__BoundedRange__HigherBoundAssignment_2 ) )
            {
            // InternalGoLDSL.g:1815:1: ( ( rule__BoundedRange__HigherBoundAssignment_2 ) )
            // InternalGoLDSL.g:1816:2: ( rule__BoundedRange__HigherBoundAssignment_2 )
            {
             before(grammarAccess.getBoundedRangeAccess().getHigherBoundAssignment_2()); 
            // InternalGoLDSL.g:1817:2: ( rule__BoundedRange__HigherBoundAssignment_2 )
            // InternalGoLDSL.g:1817:3: rule__BoundedRange__HigherBoundAssignment_2
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
    // InternalGoLDSL.g:1826:1: rule__LeftUnboundedRange__Group__0 : rule__LeftUnboundedRange__Group__0__Impl rule__LeftUnboundedRange__Group__1 ;
    public final void rule__LeftUnboundedRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1830:1: ( rule__LeftUnboundedRange__Group__0__Impl rule__LeftUnboundedRange__Group__1 )
            // InternalGoLDSL.g:1831:2: rule__LeftUnboundedRange__Group__0__Impl rule__LeftUnboundedRange__Group__1
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
    // InternalGoLDSL.g:1838:1: rule__LeftUnboundedRange__Group__0__Impl : ( ( rule__LeftUnboundedRange__LowerBoundAssignment_0 ) ) ;
    public final void rule__LeftUnboundedRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1842:1: ( ( ( rule__LeftUnboundedRange__LowerBoundAssignment_0 ) ) )
            // InternalGoLDSL.g:1843:1: ( ( rule__LeftUnboundedRange__LowerBoundAssignment_0 ) )
            {
            // InternalGoLDSL.g:1843:1: ( ( rule__LeftUnboundedRange__LowerBoundAssignment_0 ) )
            // InternalGoLDSL.g:1844:2: ( rule__LeftUnboundedRange__LowerBoundAssignment_0 )
            {
             before(grammarAccess.getLeftUnboundedRangeAccess().getLowerBoundAssignment_0()); 
            // InternalGoLDSL.g:1845:2: ( rule__LeftUnboundedRange__LowerBoundAssignment_0 )
            // InternalGoLDSL.g:1845:3: rule__LeftUnboundedRange__LowerBoundAssignment_0
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
    // InternalGoLDSL.g:1853:1: rule__LeftUnboundedRange__Group__1 : rule__LeftUnboundedRange__Group__1__Impl ;
    public final void rule__LeftUnboundedRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1857:1: ( rule__LeftUnboundedRange__Group__1__Impl )
            // InternalGoLDSL.g:1858:2: rule__LeftUnboundedRange__Group__1__Impl
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
    // InternalGoLDSL.g:1864:1: rule__LeftUnboundedRange__Group__1__Impl : ( '..' ) ;
    public final void rule__LeftUnboundedRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1868:1: ( ( '..' ) )
            // InternalGoLDSL.g:1869:1: ( '..' )
            {
            // InternalGoLDSL.g:1869:1: ( '..' )
            // InternalGoLDSL.g:1870:2: '..'
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
    // InternalGoLDSL.g:1880:1: rule__RightUnboundedRange__Group__0 : rule__RightUnboundedRange__Group__0__Impl rule__RightUnboundedRange__Group__1 ;
    public final void rule__RightUnboundedRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1884:1: ( rule__RightUnboundedRange__Group__0__Impl rule__RightUnboundedRange__Group__1 )
            // InternalGoLDSL.g:1885:2: rule__RightUnboundedRange__Group__0__Impl rule__RightUnboundedRange__Group__1
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
    // InternalGoLDSL.g:1892:1: rule__RightUnboundedRange__Group__0__Impl : ( '..' ) ;
    public final void rule__RightUnboundedRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1896:1: ( ( '..' ) )
            // InternalGoLDSL.g:1897:1: ( '..' )
            {
            // InternalGoLDSL.g:1897:1: ( '..' )
            // InternalGoLDSL.g:1898:2: '..'
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
    // InternalGoLDSL.g:1907:1: rule__RightUnboundedRange__Group__1 : rule__RightUnboundedRange__Group__1__Impl ;
    public final void rule__RightUnboundedRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1911:1: ( rule__RightUnboundedRange__Group__1__Impl )
            // InternalGoLDSL.g:1912:2: rule__RightUnboundedRange__Group__1__Impl
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
    // InternalGoLDSL.g:1918:1: rule__RightUnboundedRange__Group__1__Impl : ( ( rule__RightUnboundedRange__HigherBoundAssignment_1 ) ) ;
    public final void rule__RightUnboundedRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1922:1: ( ( ( rule__RightUnboundedRange__HigherBoundAssignment_1 ) ) )
            // InternalGoLDSL.g:1923:1: ( ( rule__RightUnboundedRange__HigherBoundAssignment_1 ) )
            {
            // InternalGoLDSL.g:1923:1: ( ( rule__RightUnboundedRange__HigherBoundAssignment_1 ) )
            // InternalGoLDSL.g:1924:2: ( rule__RightUnboundedRange__HigherBoundAssignment_1 )
            {
             before(grammarAccess.getRightUnboundedRangeAccess().getHigherBoundAssignment_1()); 
            // InternalGoLDSL.g:1925:2: ( rule__RightUnboundedRange__HigherBoundAssignment_1 )
            // InternalGoLDSL.g:1925:3: rule__RightUnboundedRange__HigherBoundAssignment_1
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
    // InternalGoLDSL.g:1934:1: rule__Grid__Group__0 : rule__Grid__Group__0__Impl rule__Grid__Group__1 ;
    public final void rule__Grid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1938:1: ( rule__Grid__Group__0__Impl rule__Grid__Group__1 )
            // InternalGoLDSL.g:1939:2: rule__Grid__Group__0__Impl rule__Grid__Group__1
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
    // InternalGoLDSL.g:1946:1: rule__Grid__Group__0__Impl : ( 'Grid:' ) ;
    public final void rule__Grid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1950:1: ( ( 'Grid:' ) )
            // InternalGoLDSL.g:1951:1: ( 'Grid:' )
            {
            // InternalGoLDSL.g:1951:1: ( 'Grid:' )
            // InternalGoLDSL.g:1952:2: 'Grid:'
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
    // InternalGoLDSL.g:1961:1: rule__Grid__Group__1 : rule__Grid__Group__1__Impl rule__Grid__Group__2 ;
    public final void rule__Grid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1965:1: ( rule__Grid__Group__1__Impl rule__Grid__Group__2 )
            // InternalGoLDSL.g:1966:2: rule__Grid__Group__1__Impl rule__Grid__Group__2
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
    // InternalGoLDSL.g:1973:1: rule__Grid__Group__1__Impl : ( ( rule__Grid__SizeAssignment_1 ) ) ;
    public final void rule__Grid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1977:1: ( ( ( rule__Grid__SizeAssignment_1 ) ) )
            // InternalGoLDSL.g:1978:1: ( ( rule__Grid__SizeAssignment_1 ) )
            {
            // InternalGoLDSL.g:1978:1: ( ( rule__Grid__SizeAssignment_1 ) )
            // InternalGoLDSL.g:1979:2: ( rule__Grid__SizeAssignment_1 )
            {
             before(grammarAccess.getGridAccess().getSizeAssignment_1()); 
            // InternalGoLDSL.g:1980:2: ( rule__Grid__SizeAssignment_1 )
            // InternalGoLDSL.g:1980:3: rule__Grid__SizeAssignment_1
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
    // InternalGoLDSL.g:1988:1: rule__Grid__Group__2 : rule__Grid__Group__2__Impl ;
    public final void rule__Grid__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1992:1: ( rule__Grid__Group__2__Impl )
            // InternalGoLDSL.g:1993:2: rule__Grid__Group__2__Impl
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
    // InternalGoLDSL.g:1999:1: rule__Grid__Group__2__Impl : ( ( ( rule__Grid__PartsAssignment_2 ) ) ( ( rule__Grid__PartsAssignment_2 )* ) ) ;
    public final void rule__Grid__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2003:1: ( ( ( ( rule__Grid__PartsAssignment_2 ) ) ( ( rule__Grid__PartsAssignment_2 )* ) ) )
            // InternalGoLDSL.g:2004:1: ( ( ( rule__Grid__PartsAssignment_2 ) ) ( ( rule__Grid__PartsAssignment_2 )* ) )
            {
            // InternalGoLDSL.g:2004:1: ( ( ( rule__Grid__PartsAssignment_2 ) ) ( ( rule__Grid__PartsAssignment_2 )* ) )
            // InternalGoLDSL.g:2005:2: ( ( rule__Grid__PartsAssignment_2 ) ) ( ( rule__Grid__PartsAssignment_2 )* )
            {
            // InternalGoLDSL.g:2005:2: ( ( rule__Grid__PartsAssignment_2 ) )
            // InternalGoLDSL.g:2006:3: ( rule__Grid__PartsAssignment_2 )
            {
             before(grammarAccess.getGridAccess().getPartsAssignment_2()); 
            // InternalGoLDSL.g:2007:3: ( rule__Grid__PartsAssignment_2 )
            // InternalGoLDSL.g:2007:4: rule__Grid__PartsAssignment_2
            {
            pushFollow(FOLLOW_22);
            rule__Grid__PartsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getPartsAssignment_2()); 

            }

            // InternalGoLDSL.g:2010:2: ( ( rule__Grid__PartsAssignment_2 )* )
            // InternalGoLDSL.g:2011:3: ( rule__Grid__PartsAssignment_2 )*
            {
             before(grammarAccess.getGridAccess().getPartsAssignment_2()); 
            // InternalGoLDSL.g:2012:3: ( rule__Grid__PartsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=13 && LA12_0<=14)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGoLDSL.g:2012:4: rule__Grid__PartsAssignment_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Grid__PartsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalGoLDSL.g:2022:1: rule__Offset__Group__0 : rule__Offset__Group__0__Impl rule__Offset__Group__1 ;
    public final void rule__Offset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2026:1: ( rule__Offset__Group__0__Impl rule__Offset__Group__1 )
            // InternalGoLDSL.g:2027:2: rule__Offset__Group__0__Impl rule__Offset__Group__1
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
    // InternalGoLDSL.g:2034:1: rule__Offset__Group__0__Impl : ( 'offset' ) ;
    public final void rule__Offset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2038:1: ( ( 'offset' ) )
            // InternalGoLDSL.g:2039:1: ( 'offset' )
            {
            // InternalGoLDSL.g:2039:1: ( 'offset' )
            // InternalGoLDSL.g:2040:2: 'offset'
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
    // InternalGoLDSL.g:2049:1: rule__Offset__Group__1 : rule__Offset__Group__1__Impl rule__Offset__Group__2 ;
    public final void rule__Offset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2053:1: ( rule__Offset__Group__1__Impl rule__Offset__Group__2 )
            // InternalGoLDSL.g:2054:2: rule__Offset__Group__1__Impl rule__Offset__Group__2
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
    // InternalGoLDSL.g:2061:1: rule__Offset__Group__1__Impl : ( ( rule__Offset__XAssignment_1 ) ) ;
    public final void rule__Offset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2065:1: ( ( ( rule__Offset__XAssignment_1 ) ) )
            // InternalGoLDSL.g:2066:1: ( ( rule__Offset__XAssignment_1 ) )
            {
            // InternalGoLDSL.g:2066:1: ( ( rule__Offset__XAssignment_1 ) )
            // InternalGoLDSL.g:2067:2: ( rule__Offset__XAssignment_1 )
            {
             before(grammarAccess.getOffsetAccess().getXAssignment_1()); 
            // InternalGoLDSL.g:2068:2: ( rule__Offset__XAssignment_1 )
            // InternalGoLDSL.g:2068:3: rule__Offset__XAssignment_1
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
    // InternalGoLDSL.g:2076:1: rule__Offset__Group__2 : rule__Offset__Group__2__Impl ;
    public final void rule__Offset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2080:1: ( rule__Offset__Group__2__Impl )
            // InternalGoLDSL.g:2081:2: rule__Offset__Group__2__Impl
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
    // InternalGoLDSL.g:2087:1: rule__Offset__Group__2__Impl : ( ( rule__Offset__YAssignment_2 ) ) ;
    public final void rule__Offset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2091:1: ( ( ( rule__Offset__YAssignment_2 ) ) )
            // InternalGoLDSL.g:2092:1: ( ( rule__Offset__YAssignment_2 ) )
            {
            // InternalGoLDSL.g:2092:1: ( ( rule__Offset__YAssignment_2 ) )
            // InternalGoLDSL.g:2093:2: ( rule__Offset__YAssignment_2 )
            {
             before(grammarAccess.getOffsetAccess().getYAssignment_2()); 
            // InternalGoLDSL.g:2094:2: ( rule__Offset__YAssignment_2 )
            // InternalGoLDSL.g:2094:3: rule__Offset__YAssignment_2
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
    // InternalGoLDSL.g:2103:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2107:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // InternalGoLDSL.g:2108:2: rule__Size__Group__0__Impl rule__Size__Group__1
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
    // InternalGoLDSL.g:2115:1: rule__Size__Group__0__Impl : ( 'size' ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2119:1: ( ( 'size' ) )
            // InternalGoLDSL.g:2120:1: ( 'size' )
            {
            // InternalGoLDSL.g:2120:1: ( 'size' )
            // InternalGoLDSL.g:2121:2: 'size'
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
    // InternalGoLDSL.g:2130:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2134:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // InternalGoLDSL.g:2135:2: rule__Size__Group__1__Impl rule__Size__Group__2
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
    // InternalGoLDSL.g:2142:1: rule__Size__Group__1__Impl : ( ( rule__Size__WidthAssignment_1 ) ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2146:1: ( ( ( rule__Size__WidthAssignment_1 ) ) )
            // InternalGoLDSL.g:2147:1: ( ( rule__Size__WidthAssignment_1 ) )
            {
            // InternalGoLDSL.g:2147:1: ( ( rule__Size__WidthAssignment_1 ) )
            // InternalGoLDSL.g:2148:2: ( rule__Size__WidthAssignment_1 )
            {
             before(grammarAccess.getSizeAccess().getWidthAssignment_1()); 
            // InternalGoLDSL.g:2149:2: ( rule__Size__WidthAssignment_1 )
            // InternalGoLDSL.g:2149:3: rule__Size__WidthAssignment_1
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
    // InternalGoLDSL.g:2157:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2161:1: ( rule__Size__Group__2__Impl )
            // InternalGoLDSL.g:2162:2: rule__Size__Group__2__Impl
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
    // InternalGoLDSL.g:2168:1: rule__Size__Group__2__Impl : ( ( rule__Size__HeightAssignment_2 ) ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2172:1: ( ( ( rule__Size__HeightAssignment_2 ) ) )
            // InternalGoLDSL.g:2173:1: ( ( rule__Size__HeightAssignment_2 ) )
            {
            // InternalGoLDSL.g:2173:1: ( ( rule__Size__HeightAssignment_2 ) )
            // InternalGoLDSL.g:2174:2: ( rule__Size__HeightAssignment_2 )
            {
             before(grammarAccess.getSizeAccess().getHeightAssignment_2()); 
            // InternalGoLDSL.g:2175:2: ( rule__Size__HeightAssignment_2 )
            // InternalGoLDSL.g:2175:3: rule__Size__HeightAssignment_2
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
    // InternalGoLDSL.g:2184:1: rule__DSL__BoardAssignment_0 : ( ruleBoard ) ;
    public final void rule__DSL__BoardAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2188:1: ( ( ruleBoard ) )
            // InternalGoLDSL.g:2189:2: ( ruleBoard )
            {
            // InternalGoLDSL.g:2189:2: ( ruleBoard )
            // InternalGoLDSL.g:2190:3: ruleBoard
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
    // InternalGoLDSL.g:2199:1: rule__DSL__RulesAssignment_1_0 : ( ruleRule ) ;
    public final void rule__DSL__RulesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2203:1: ( ( ruleRule ) )
            // InternalGoLDSL.g:2204:2: ( ruleRule )
            {
            // InternalGoLDSL.g:2204:2: ( ruleRule )
            // InternalGoLDSL.g:2205:3: ruleRule
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
    // InternalGoLDSL.g:2214:1: rule__DSL__ShapesAssignment_1_1 : ( ruleShapeDef ) ;
    public final void rule__DSL__ShapesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2218:1: ( ( ruleShapeDef ) )
            // InternalGoLDSL.g:2219:2: ( ruleShapeDef )
            {
            // InternalGoLDSL.g:2219:2: ( ruleShapeDef )
            // InternalGoLDSL.g:2220:3: ruleShapeDef
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
    // InternalGoLDSL.g:2229:1: rule__Objects__ShapesAssignment_0 : ( ruleShapeRef ) ;
    public final void rule__Objects__ShapesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2233:1: ( ( ruleShapeRef ) )
            // InternalGoLDSL.g:2234:2: ( ruleShapeRef )
            {
            // InternalGoLDSL.g:2234:2: ( ruleShapeRef )
            // InternalGoLDSL.g:2235:3: ruleShapeRef
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
    // InternalGoLDSL.g:2244:1: rule__Objects__CellAssignment_1 : ( ruleCellDef ) ;
    public final void rule__Objects__CellAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2248:1: ( ( ruleCellDef ) )
            // InternalGoLDSL.g:2249:2: ( ruleCellDef )
            {
            // InternalGoLDSL.g:2249:2: ( ruleCellDef )
            // InternalGoLDSL.g:2250:3: ruleCellDef
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
    // InternalGoLDSL.g:2259:1: rule__Objects__CellsAssignment_2 : ( ruleCells ) ;
    public final void rule__Objects__CellsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2263:1: ( ( ruleCells ) )
            // InternalGoLDSL.g:2264:2: ( ruleCells )
            {
            // InternalGoLDSL.g:2264:2: ( ruleCells )
            // InternalGoLDSL.g:2265:3: ruleCells
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
    // InternalGoLDSL.g:2274:1: rule__Objects__GridsAssignment_3 : ( ruleGrid ) ;
    public final void rule__Objects__GridsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2278:1: ( ( ruleGrid ) )
            // InternalGoLDSL.g:2279:2: ( ruleGrid )
            {
            // InternalGoLDSL.g:2279:2: ( ruleGrid )
            // InternalGoLDSL.g:2280:3: ruleGrid
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
    // InternalGoLDSL.g:2289:1: rule__ShapeDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ShapeDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2293:1: ( ( RULE_ID ) )
            // InternalGoLDSL.g:2294:2: ( RULE_ID )
            {
            // InternalGoLDSL.g:2294:2: ( RULE_ID )
            // InternalGoLDSL.g:2295:3: RULE_ID
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
    // InternalGoLDSL.g:2304:1: rule__ShapeDef__OffsetAssignment_3 : ( ruleOffset ) ;
    public final void rule__ShapeDef__OffsetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2308:1: ( ( ruleOffset ) )
            // InternalGoLDSL.g:2309:2: ( ruleOffset )
            {
            // InternalGoLDSL.g:2309:2: ( ruleOffset )
            // InternalGoLDSL.g:2310:3: ruleOffset
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
    // InternalGoLDSL.g:2319:1: rule__ShapeDef__ObjectsAssignment_4 : ( ruleObjects ) ;
    public final void rule__ShapeDef__ObjectsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2323:1: ( ( ruleObjects ) )
            // InternalGoLDSL.g:2324:2: ( ruleObjects )
            {
            // InternalGoLDSL.g:2324:2: ( ruleObjects )
            // InternalGoLDSL.g:2325:3: ruleObjects
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
    // InternalGoLDSL.g:2334:1: rule__CellPairs__CellsAssignment_1 : ( ruleCell ) ;
    public final void rule__CellPairs__CellsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2338:1: ( ( ruleCell ) )
            // InternalGoLDSL.g:2339:2: ( ruleCell )
            {
            // InternalGoLDSL.g:2339:2: ( ruleCell )
            // InternalGoLDSL.g:2340:3: ruleCell
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
    // InternalGoLDSL.g:2349:1: rule__ShapeRef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ShapeRef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2353:1: ( ( RULE_ID ) )
            // InternalGoLDSL.g:2354:2: ( RULE_ID )
            {
            // InternalGoLDSL.g:2354:2: ( RULE_ID )
            // InternalGoLDSL.g:2355:3: RULE_ID
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
    // InternalGoLDSL.g:2364:1: rule__ShapeRef__XAssignment_3 : ( RULE_INT ) ;
    public final void rule__ShapeRef__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2368:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2369:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2369:2: ( RULE_INT )
            // InternalGoLDSL.g:2370:3: RULE_INT
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
    // InternalGoLDSL.g:2379:1: rule__ShapeRef__YAssignment_5 : ( RULE_INT ) ;
    public final void rule__ShapeRef__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2383:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2384:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2384:2: ( RULE_INT )
            // InternalGoLDSL.g:2385:3: RULE_INT
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
    // InternalGoLDSL.g:2394:1: rule__Cell__XAssignment_0 : ( RULE_INT ) ;
    public final void rule__Cell__XAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2398:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2399:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2399:2: ( RULE_INT )
            // InternalGoLDSL.g:2400:3: RULE_INT
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
    // InternalGoLDSL.g:2409:1: rule__Cell__YAssignment_2 : ( RULE_INT ) ;
    public final void rule__Cell__YAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2413:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2414:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2414:2: ( RULE_INT )
            // InternalGoLDSL.g:2415:3: RULE_INT
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
    // InternalGoLDSL.g:2424:1: rule__Rule__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2428:1: ( ( ruleCondition ) )
            // InternalGoLDSL.g:2429:2: ( ruleCondition )
            {
            // InternalGoLDSL.g:2429:2: ( ruleCondition )
            // InternalGoLDSL.g:2430:3: ruleCondition
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
    // InternalGoLDSL.g:2439:1: rule__Rule__ActionAssignment_2 : ( ruleAction ) ;
    public final void rule__Rule__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2443:1: ( ( ruleAction ) )
            // InternalGoLDSL.g:2444:2: ( ruleAction )
            {
            // InternalGoLDSL.g:2444:2: ( ruleAction )
            // InternalGoLDSL.g:2445:3: ruleAction
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
    // InternalGoLDSL.g:2454:1: rule__ConditionRule__NumberAssignment_0 : ( RULE_INT ) ;
    public final void rule__ConditionRule__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2458:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2459:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2459:2: ( RULE_INT )
            // InternalGoLDSL.g:2460:3: RULE_INT
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
    // InternalGoLDSL.g:2469:1: rule__ConditionRule__RangeAssignment_1 : ( ruleRange ) ;
    public final void rule__ConditionRule__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2473:1: ( ( ruleRange ) )
            // InternalGoLDSL.g:2474:2: ( ruleRange )
            {
            // InternalGoLDSL.g:2474:2: ( ruleRange )
            // InternalGoLDSL.g:2475:3: ruleRange
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
    // InternalGoLDSL.g:2484:1: rule__ConditionRule__AliveAssignment_2 : ( ( 'IsAlive' ) ) ;
    public final void rule__ConditionRule__AliveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2488:1: ( ( ( 'IsAlive' ) ) )
            // InternalGoLDSL.g:2489:2: ( ( 'IsAlive' ) )
            {
            // InternalGoLDSL.g:2489:2: ( ( 'IsAlive' ) )
            // InternalGoLDSL.g:2490:3: ( 'IsAlive' )
            {
             before(grammarAccess.getConditionRuleAccess().getAliveIsAliveKeyword_2_0()); 
            // InternalGoLDSL.g:2491:3: ( 'IsAlive' )
            // InternalGoLDSL.g:2492:4: 'IsAlive'
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
    // InternalGoLDSL.g:2503:1: rule__ConditionRules__Rule1Assignment_0 : ( ruleConditionRule ) ;
    public final void rule__ConditionRules__Rule1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2507:1: ( ( ruleConditionRule ) )
            // InternalGoLDSL.g:2508:2: ( ruleConditionRule )
            {
            // InternalGoLDSL.g:2508:2: ( ruleConditionRule )
            // InternalGoLDSL.g:2509:3: ruleConditionRule
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
    // InternalGoLDSL.g:2518:1: rule__ConditionRules__OperatorAssignment_1_0 : ( ruleBoolOperator ) ;
    public final void rule__ConditionRules__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2522:1: ( ( ruleBoolOperator ) )
            // InternalGoLDSL.g:2523:2: ( ruleBoolOperator )
            {
            // InternalGoLDSL.g:2523:2: ( ruleBoolOperator )
            // InternalGoLDSL.g:2524:3: ruleBoolOperator
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
    // InternalGoLDSL.g:2533:1: rule__ConditionRules__Rule2Assignment_1_1 : ( ruleConditionRules ) ;
    public final void rule__ConditionRules__Rule2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2537:1: ( ( ruleConditionRules ) )
            // InternalGoLDSL.g:2538:2: ( ruleConditionRules )
            {
            // InternalGoLDSL.g:2538:2: ( ruleConditionRules )
            // InternalGoLDSL.g:2539:3: ruleConditionRules
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
    // InternalGoLDSL.g:2548:1: rule__BoundedRange__LowerBoundAssignment_0 : ( RULE_INT ) ;
    public final void rule__BoundedRange__LowerBoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2552:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2553:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2553:2: ( RULE_INT )
            // InternalGoLDSL.g:2554:3: RULE_INT
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
    // InternalGoLDSL.g:2563:1: rule__BoundedRange__HigherBoundAssignment_2 : ( RULE_INT ) ;
    public final void rule__BoundedRange__HigherBoundAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2567:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2568:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2568:2: ( RULE_INT )
            // InternalGoLDSL.g:2569:3: RULE_INT
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
    // InternalGoLDSL.g:2578:1: rule__LeftUnboundedRange__LowerBoundAssignment_0 : ( RULE_INT ) ;
    public final void rule__LeftUnboundedRange__LowerBoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2582:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2583:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2583:2: ( RULE_INT )
            // InternalGoLDSL.g:2584:3: RULE_INT
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
    // InternalGoLDSL.g:2593:1: rule__RightUnboundedRange__HigherBoundAssignment_1 : ( RULE_INT ) ;
    public final void rule__RightUnboundedRange__HigherBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2597:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2598:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2598:2: ( RULE_INT )
            // InternalGoLDSL.g:2599:3: RULE_INT
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
    // InternalGoLDSL.g:2608:1: rule__Grid__SizeAssignment_1 : ( ruleSize ) ;
    public final void rule__Grid__SizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2612:1: ( ( ruleSize ) )
            // InternalGoLDSL.g:2613:2: ( ruleSize )
            {
            // InternalGoLDSL.g:2613:2: ( ruleSize )
            // InternalGoLDSL.g:2614:3: ruleSize
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
    // InternalGoLDSL.g:2623:1: rule__Grid__PartsAssignment_2 : ( ruleGridPart ) ;
    public final void rule__Grid__PartsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2627:1: ( ( ruleGridPart ) )
            // InternalGoLDSL.g:2628:2: ( ruleGridPart )
            {
            // InternalGoLDSL.g:2628:2: ( ruleGridPart )
            // InternalGoLDSL.g:2629:3: ruleGridPart
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
    // InternalGoLDSL.g:2638:1: rule__Offset__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Offset__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2642:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2643:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2643:2: ( RULE_INT )
            // InternalGoLDSL.g:2644:3: RULE_INT
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
    // InternalGoLDSL.g:2653:1: rule__Offset__YAssignment_2 : ( RULE_INT ) ;
    public final void rule__Offset__YAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2657:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2658:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2658:2: ( RULE_INT )
            // InternalGoLDSL.g:2659:3: RULE_INT
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
    // InternalGoLDSL.g:2668:1: rule__Size__WidthAssignment_1 : ( RULE_INT ) ;
    public final void rule__Size__WidthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2672:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2673:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2673:2: ( RULE_INT )
            // InternalGoLDSL.g:2674:3: RULE_INT
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
    // InternalGoLDSL.g:2683:1: rule__Size__HeightAssignment_2 : ( RULE_INT ) ;
    public final void rule__Size__HeightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2687:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2688:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2688:2: ( RULE_INT )
            // InternalGoLDSL.g:2689:3: RULE_INT
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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000044000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000006002L});

}