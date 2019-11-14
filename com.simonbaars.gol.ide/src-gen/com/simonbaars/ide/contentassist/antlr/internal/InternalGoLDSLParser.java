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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'&'", "'|'", "'Board:'", "'Shape'", "':'", "'('", "')'", "'Cells:'", "'Cell:'", "','", "'Rule:'", "'Create'", "'If'", "'Lives'", "'..'", "'<'", "'>'"
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

                if ( (LA1_0==14) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==RULE_ID) ) {
                        int LA1_4 = input.LA(3);

                        if ( (LA1_4==15) ) {
                            int LA1_5 = input.LA(4);

                            if ( (LA1_5==RULE_INT) ) {
                                alt1=1;
                            }


                        }


                    }


                }
                else if ( ((LA1_0>=18 && LA1_0<=19)) ) {
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

                if ( (LA2_0==16) ) {
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


    // $ANTLR start "entryRuleCellsDef"
    // InternalGoLDSL.g:192:1: entryRuleCellsDef : ruleCellsDef EOF ;
    public final void entryRuleCellsDef() throws RecognitionException {
        try {
            // InternalGoLDSL.g:193:1: ( ruleCellsDef EOF )
            // InternalGoLDSL.g:194:1: ruleCellsDef EOF
            {
             before(grammarAccess.getCellsDefRule()); 
            pushFollow(FOLLOW_1);
            ruleCellsDef();

            state._fsp--;

             after(grammarAccess.getCellsDefRule()); 
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
    // $ANTLR end "entryRuleCellsDef"


    // $ANTLR start "ruleCellsDef"
    // InternalGoLDSL.g:201:1: ruleCellsDef : ( ( rule__CellsDef__Group__0 ) ) ;
    public final void ruleCellsDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:205:2: ( ( ( rule__CellsDef__Group__0 ) ) )
            // InternalGoLDSL.g:206:2: ( ( rule__CellsDef__Group__0 ) )
            {
            // InternalGoLDSL.g:206:2: ( ( rule__CellsDef__Group__0 ) )
            // InternalGoLDSL.g:207:3: ( rule__CellsDef__Group__0 )
            {
             before(grammarAccess.getCellsDefAccess().getGroup()); 
            // InternalGoLDSL.g:208:3: ( rule__CellsDef__Group__0 )
            // InternalGoLDSL.g:208:4: rule__CellsDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CellsDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellsDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellsDef"


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


    // $ANTLR start "entryRuleLives"
    // InternalGoLDSL.g:417:1: entryRuleLives : ruleLives EOF ;
    public final void entryRuleLives() throws RecognitionException {
        try {
            // InternalGoLDSL.g:418:1: ( ruleLives EOF )
            // InternalGoLDSL.g:419:1: ruleLives EOF
            {
             before(grammarAccess.getLivesRule()); 
            pushFollow(FOLLOW_1);
            ruleLives();

            state._fsp--;

             after(grammarAccess.getLivesRule()); 
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
    // $ANTLR end "entryRuleLives"


    // $ANTLR start "ruleLives"
    // InternalGoLDSL.g:426:1: ruleLives : ( ( rule__Lives__Group__0 ) ) ;
    public final void ruleLives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:430:2: ( ( ( rule__Lives__Group__0 ) ) )
            // InternalGoLDSL.g:431:2: ( ( rule__Lives__Group__0 ) )
            {
            // InternalGoLDSL.g:431:2: ( ( rule__Lives__Group__0 ) )
            // InternalGoLDSL.g:432:3: ( rule__Lives__Group__0 )
            {
             before(grammarAccess.getLivesAccess().getGroup()); 
            // InternalGoLDSL.g:433:3: ( rule__Lives__Group__0 )
            // InternalGoLDSL.g:433:4: rule__Lives__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lives__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLivesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLives"


    // $ANTLR start "entryRuleRange"
    // InternalGoLDSL.g:442:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalGoLDSL.g:443:1: ( ruleRange EOF )
            // InternalGoLDSL.g:444:1: ruleRange EOF
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
    // InternalGoLDSL.g:451:1: ruleRange : ( ( rule__Range__Alternatives ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:455:2: ( ( ( rule__Range__Alternatives ) ) )
            // InternalGoLDSL.g:456:2: ( ( rule__Range__Alternatives ) )
            {
            // InternalGoLDSL.g:456:2: ( ( rule__Range__Alternatives ) )
            // InternalGoLDSL.g:457:3: ( rule__Range__Alternatives )
            {
             before(grammarAccess.getRangeAccess().getAlternatives()); 
            // InternalGoLDSL.g:458:3: ( rule__Range__Alternatives )
            // InternalGoLDSL.g:458:4: rule__Range__Alternatives
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
    // InternalGoLDSL.g:467:1: entryRuleBoundedRange : ruleBoundedRange EOF ;
    public final void entryRuleBoundedRange() throws RecognitionException {
        try {
            // InternalGoLDSL.g:468:1: ( ruleBoundedRange EOF )
            // InternalGoLDSL.g:469:1: ruleBoundedRange EOF
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
    // InternalGoLDSL.g:476:1: ruleBoundedRange : ( ( rule__BoundedRange__Group__0 ) ) ;
    public final void ruleBoundedRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:480:2: ( ( ( rule__BoundedRange__Group__0 ) ) )
            // InternalGoLDSL.g:481:2: ( ( rule__BoundedRange__Group__0 ) )
            {
            // InternalGoLDSL.g:481:2: ( ( rule__BoundedRange__Group__0 ) )
            // InternalGoLDSL.g:482:3: ( rule__BoundedRange__Group__0 )
            {
             before(grammarAccess.getBoundedRangeAccess().getGroup()); 
            // InternalGoLDSL.g:483:3: ( rule__BoundedRange__Group__0 )
            // InternalGoLDSL.g:483:4: rule__BoundedRange__Group__0
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
    // InternalGoLDSL.g:492:1: entryRuleUnboundedRange : ruleUnboundedRange EOF ;
    public final void entryRuleUnboundedRange() throws RecognitionException {
        try {
            // InternalGoLDSL.g:493:1: ( ruleUnboundedRange EOF )
            // InternalGoLDSL.g:494:1: ruleUnboundedRange EOF
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
    // InternalGoLDSL.g:501:1: ruleUnboundedRange : ( ( rule__UnboundedRange__Alternatives ) ) ;
    public final void ruleUnboundedRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:505:2: ( ( ( rule__UnboundedRange__Alternatives ) ) )
            // InternalGoLDSL.g:506:2: ( ( rule__UnboundedRange__Alternatives ) )
            {
            // InternalGoLDSL.g:506:2: ( ( rule__UnboundedRange__Alternatives ) )
            // InternalGoLDSL.g:507:3: ( rule__UnboundedRange__Alternatives )
            {
             before(grammarAccess.getUnboundedRangeAccess().getAlternatives()); 
            // InternalGoLDSL.g:508:3: ( rule__UnboundedRange__Alternatives )
            // InternalGoLDSL.g:508:4: rule__UnboundedRange__Alternatives
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
    // InternalGoLDSL.g:517:1: entryRuleLeftUnboundedRange : ruleLeftUnboundedRange EOF ;
    public final void entryRuleLeftUnboundedRange() throws RecognitionException {
        try {
            // InternalGoLDSL.g:518:1: ( ruleLeftUnboundedRange EOF )
            // InternalGoLDSL.g:519:1: ruleLeftUnboundedRange EOF
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
    // InternalGoLDSL.g:526:1: ruleLeftUnboundedRange : ( ( rule__LeftUnboundedRange__Group__0 ) ) ;
    public final void ruleLeftUnboundedRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:530:2: ( ( ( rule__LeftUnboundedRange__Group__0 ) ) )
            // InternalGoLDSL.g:531:2: ( ( rule__LeftUnboundedRange__Group__0 ) )
            {
            // InternalGoLDSL.g:531:2: ( ( rule__LeftUnboundedRange__Group__0 ) )
            // InternalGoLDSL.g:532:3: ( rule__LeftUnboundedRange__Group__0 )
            {
             before(grammarAccess.getLeftUnboundedRangeAccess().getGroup()); 
            // InternalGoLDSL.g:533:3: ( rule__LeftUnboundedRange__Group__0 )
            // InternalGoLDSL.g:533:4: rule__LeftUnboundedRange__Group__0
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
    // InternalGoLDSL.g:542:1: entryRuleRightUnboundedRange : ruleRightUnboundedRange EOF ;
    public final void entryRuleRightUnboundedRange() throws RecognitionException {
        try {
            // InternalGoLDSL.g:543:1: ( ruleRightUnboundedRange EOF )
            // InternalGoLDSL.g:544:1: ruleRightUnboundedRange EOF
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
    // InternalGoLDSL.g:551:1: ruleRightUnboundedRange : ( ( rule__RightUnboundedRange__Group__0 ) ) ;
    public final void ruleRightUnboundedRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:555:2: ( ( ( rule__RightUnboundedRange__Group__0 ) ) )
            // InternalGoLDSL.g:556:2: ( ( rule__RightUnboundedRange__Group__0 ) )
            {
            // InternalGoLDSL.g:556:2: ( ( rule__RightUnboundedRange__Group__0 ) )
            // InternalGoLDSL.g:557:3: ( rule__RightUnboundedRange__Group__0 )
            {
             before(grammarAccess.getRightUnboundedRangeAccess().getGroup()); 
            // InternalGoLDSL.g:558:3: ( rule__RightUnboundedRange__Group__0 )
            // InternalGoLDSL.g:558:4: rule__RightUnboundedRange__Group__0
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


    // $ANTLR start "ruleBoolOperator"
    // InternalGoLDSL.g:567:1: ruleBoolOperator : ( ( rule__BoolOperator__Alternatives ) ) ;
    public final void ruleBoolOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:571:1: ( ( ( rule__BoolOperator__Alternatives ) ) )
            // InternalGoLDSL.g:572:2: ( ( rule__BoolOperator__Alternatives ) )
            {
            // InternalGoLDSL.g:572:2: ( ( rule__BoolOperator__Alternatives ) )
            // InternalGoLDSL.g:573:3: ( rule__BoolOperator__Alternatives )
            {
             before(grammarAccess.getBoolOperatorAccess().getAlternatives()); 
            // InternalGoLDSL.g:574:3: ( rule__BoolOperator__Alternatives )
            // InternalGoLDSL.g:574:4: rule__BoolOperator__Alternatives
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


    // $ANTLR start "rule__DSL__Alternatives_1"
    // InternalGoLDSL.g:582:1: rule__DSL__Alternatives_1 : ( ( ( rule__DSL__RulesAssignment_1_0 ) ) | ( ( rule__DSL__ShapesAssignment_1_1 ) ) );
    public final void rule__DSL__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:586:1: ( ( ( rule__DSL__RulesAssignment_1_0 ) ) | ( ( rule__DSL__ShapesAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGoLDSL.g:587:2: ( ( rule__DSL__RulesAssignment_1_0 ) )
                    {
                    // InternalGoLDSL.g:587:2: ( ( rule__DSL__RulesAssignment_1_0 ) )
                    // InternalGoLDSL.g:588:3: ( rule__DSL__RulesAssignment_1_0 )
                    {
                     before(grammarAccess.getDSLAccess().getRulesAssignment_1_0()); 
                    // InternalGoLDSL.g:589:3: ( rule__DSL__RulesAssignment_1_0 )
                    // InternalGoLDSL.g:589:4: rule__DSL__RulesAssignment_1_0
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
                    // InternalGoLDSL.g:593:2: ( ( rule__DSL__ShapesAssignment_1_1 ) )
                    {
                    // InternalGoLDSL.g:593:2: ( ( rule__DSL__ShapesAssignment_1_1 ) )
                    // InternalGoLDSL.g:594:3: ( rule__DSL__ShapesAssignment_1_1 )
                    {
                     before(grammarAccess.getDSLAccess().getShapesAssignment_1_1()); 
                    // InternalGoLDSL.g:595:3: ( rule__DSL__ShapesAssignment_1_1 )
                    // InternalGoLDSL.g:595:4: rule__DSL__ShapesAssignment_1_1
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
    // InternalGoLDSL.g:603:1: rule__Objects__Alternatives : ( ( ( rule__Objects__ShapesAssignment_0 ) ) | ( ( rule__Objects__MoreCellAssignment_1 ) ) | ( ( rule__Objects__MoreCellsAssignment_2 ) ) );
    public final void rule__Objects__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:607:1: ( ( ( rule__Objects__ShapesAssignment_0 ) ) | ( ( rule__Objects__MoreCellAssignment_1 ) ) | ( ( rule__Objects__MoreCellsAssignment_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 18:
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
                    // InternalGoLDSL.g:608:2: ( ( rule__Objects__ShapesAssignment_0 ) )
                    {
                    // InternalGoLDSL.g:608:2: ( ( rule__Objects__ShapesAssignment_0 ) )
                    // InternalGoLDSL.g:609:3: ( rule__Objects__ShapesAssignment_0 )
                    {
                     before(grammarAccess.getObjectsAccess().getShapesAssignment_0()); 
                    // InternalGoLDSL.g:610:3: ( rule__Objects__ShapesAssignment_0 )
                    // InternalGoLDSL.g:610:4: rule__Objects__ShapesAssignment_0
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
                    // InternalGoLDSL.g:614:2: ( ( rule__Objects__MoreCellAssignment_1 ) )
                    {
                    // InternalGoLDSL.g:614:2: ( ( rule__Objects__MoreCellAssignment_1 ) )
                    // InternalGoLDSL.g:615:3: ( rule__Objects__MoreCellAssignment_1 )
                    {
                     before(grammarAccess.getObjectsAccess().getMoreCellAssignment_1()); 
                    // InternalGoLDSL.g:616:3: ( rule__Objects__MoreCellAssignment_1 )
                    // InternalGoLDSL.g:616:4: rule__Objects__MoreCellAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Objects__MoreCellAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectsAccess().getMoreCellAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGoLDSL.g:620:2: ( ( rule__Objects__MoreCellsAssignment_2 ) )
                    {
                    // InternalGoLDSL.g:620:2: ( ( rule__Objects__MoreCellsAssignment_2 ) )
                    // InternalGoLDSL.g:621:3: ( rule__Objects__MoreCellsAssignment_2 )
                    {
                     before(grammarAccess.getObjectsAccess().getMoreCellsAssignment_2()); 
                    // InternalGoLDSL.g:622:3: ( rule__Objects__MoreCellsAssignment_2 )
                    // InternalGoLDSL.g:622:4: rule__Objects__MoreCellsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Objects__MoreCellsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectsAccess().getMoreCellsAssignment_2()); 

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
    // InternalGoLDSL.g:630:1: rule__ConditionRule__Alternatives : ( ( ( rule__ConditionRule__NumberAssignment_0 ) ) | ( ( rule__ConditionRule__RangeAssignment_1 ) ) | ( ( rule__ConditionRule__LivesAssignment_2 ) ) );
    public final void rule__ConditionRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:634:1: ( ( ( rule__ConditionRule__NumberAssignment_0 ) ) | ( ( rule__ConditionRule__RangeAssignment_1 ) ) | ( ( rule__ConditionRule__LivesAssignment_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||(LA5_1>=11 && LA5_1<=12)||LA5_1==22) ) {
                    alt5=1;
                }
                else if ( (LA5_1==25) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
            case 27:
                {
                alt5=2;
                }
                break;
            case 24:
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
                    // InternalGoLDSL.g:635:2: ( ( rule__ConditionRule__NumberAssignment_0 ) )
                    {
                    // InternalGoLDSL.g:635:2: ( ( rule__ConditionRule__NumberAssignment_0 ) )
                    // InternalGoLDSL.g:636:3: ( rule__ConditionRule__NumberAssignment_0 )
                    {
                     before(grammarAccess.getConditionRuleAccess().getNumberAssignment_0()); 
                    // InternalGoLDSL.g:637:3: ( rule__ConditionRule__NumberAssignment_0 )
                    // InternalGoLDSL.g:637:4: rule__ConditionRule__NumberAssignment_0
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
                    // InternalGoLDSL.g:641:2: ( ( rule__ConditionRule__RangeAssignment_1 ) )
                    {
                    // InternalGoLDSL.g:641:2: ( ( rule__ConditionRule__RangeAssignment_1 ) )
                    // InternalGoLDSL.g:642:3: ( rule__ConditionRule__RangeAssignment_1 )
                    {
                     before(grammarAccess.getConditionRuleAccess().getRangeAssignment_1()); 
                    // InternalGoLDSL.g:643:3: ( rule__ConditionRule__RangeAssignment_1 )
                    // InternalGoLDSL.g:643:4: rule__ConditionRule__RangeAssignment_1
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
                    // InternalGoLDSL.g:647:2: ( ( rule__ConditionRule__LivesAssignment_2 ) )
                    {
                    // InternalGoLDSL.g:647:2: ( ( rule__ConditionRule__LivesAssignment_2 ) )
                    // InternalGoLDSL.g:648:3: ( rule__ConditionRule__LivesAssignment_2 )
                    {
                     before(grammarAccess.getConditionRuleAccess().getLivesAssignment_2()); 
                    // InternalGoLDSL.g:649:3: ( rule__ConditionRule__LivesAssignment_2 )
                    // InternalGoLDSL.g:649:4: rule__ConditionRule__LivesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionRule__LivesAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionRuleAccess().getLivesAssignment_2()); 

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
    // InternalGoLDSL.g:657:1: rule__Range__Alternatives : ( ( ruleBoundedRange ) | ( ruleUnboundedRange ) );
    public final void rule__Range__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:661:1: ( ( ruleBoundedRange ) | ( ruleUnboundedRange ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=26 && LA6_0<=27)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGoLDSL.g:662:2: ( ruleBoundedRange )
                    {
                    // InternalGoLDSL.g:662:2: ( ruleBoundedRange )
                    // InternalGoLDSL.g:663:3: ruleBoundedRange
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
                    // InternalGoLDSL.g:668:2: ( ruleUnboundedRange )
                    {
                    // InternalGoLDSL.g:668:2: ( ruleUnboundedRange )
                    // InternalGoLDSL.g:669:3: ruleUnboundedRange
                    {
                     before(grammarAccess.getRangeAccess().getUnboundedRangeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnboundedRange();

                    state._fsp--;

                     after(grammarAccess.getRangeAccess().getUnboundedRangeParserRuleCall_1()); 

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
    // InternalGoLDSL.g:678:1: rule__UnboundedRange__Alternatives : ( ( ruleLeftUnboundedRange ) | ( ruleRightUnboundedRange ) );
    public final void rule__UnboundedRange__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:682:1: ( ( ruleLeftUnboundedRange ) | ( ruleRightUnboundedRange ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGoLDSL.g:683:2: ( ruleLeftUnboundedRange )
                    {
                    // InternalGoLDSL.g:683:2: ( ruleLeftUnboundedRange )
                    // InternalGoLDSL.g:684:3: ruleLeftUnboundedRange
                    {
                     before(grammarAccess.getUnboundedRangeAccess().getLeftUnboundedRangeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLeftUnboundedRange();

                    state._fsp--;

                     after(grammarAccess.getUnboundedRangeAccess().getLeftUnboundedRangeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:689:2: ( ruleRightUnboundedRange )
                    {
                    // InternalGoLDSL.g:689:2: ( ruleRightUnboundedRange )
                    // InternalGoLDSL.g:690:3: ruleRightUnboundedRange
                    {
                     before(grammarAccess.getUnboundedRangeAccess().getRightUnboundedRangeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRightUnboundedRange();

                    state._fsp--;

                     after(grammarAccess.getUnboundedRangeAccess().getRightUnboundedRangeParserRuleCall_1()); 

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
    // InternalGoLDSL.g:699:1: rule__BoolOperator__Alternatives : ( ( ( '&' ) ) | ( ( '|' ) ) );
    public final void rule__BoolOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:703:1: ( ( ( '&' ) ) | ( ( '|' ) ) )
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
                    // InternalGoLDSL.g:704:2: ( ( '&' ) )
                    {
                    // InternalGoLDSL.g:704:2: ( ( '&' ) )
                    // InternalGoLDSL.g:705:3: ( '&' )
                    {
                     before(grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalGoLDSL.g:706:3: ( '&' )
                    // InternalGoLDSL.g:706:4: '&'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:710:2: ( ( '|' ) )
                    {
                    // InternalGoLDSL.g:710:2: ( ( '|' ) )
                    // InternalGoLDSL.g:711:3: ( '|' )
                    {
                     before(grammarAccess.getBoolOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalGoLDSL.g:712:3: ( '|' )
                    // InternalGoLDSL.g:712:4: '|'
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


    // $ANTLR start "rule__DSL__Group__0"
    // InternalGoLDSL.g:720:1: rule__DSL__Group__0 : rule__DSL__Group__0__Impl rule__DSL__Group__1 ;
    public final void rule__DSL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:724:1: ( rule__DSL__Group__0__Impl rule__DSL__Group__1 )
            // InternalGoLDSL.g:725:2: rule__DSL__Group__0__Impl rule__DSL__Group__1
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
    // InternalGoLDSL.g:732:1: rule__DSL__Group__0__Impl : ( ( rule__DSL__BoardAssignment_0 ) ) ;
    public final void rule__DSL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:736:1: ( ( ( rule__DSL__BoardAssignment_0 ) ) )
            // InternalGoLDSL.g:737:1: ( ( rule__DSL__BoardAssignment_0 ) )
            {
            // InternalGoLDSL.g:737:1: ( ( rule__DSL__BoardAssignment_0 ) )
            // InternalGoLDSL.g:738:2: ( rule__DSL__BoardAssignment_0 )
            {
             before(grammarAccess.getDSLAccess().getBoardAssignment_0()); 
            // InternalGoLDSL.g:739:2: ( rule__DSL__BoardAssignment_0 )
            // InternalGoLDSL.g:739:3: rule__DSL__BoardAssignment_0
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
    // InternalGoLDSL.g:747:1: rule__DSL__Group__1 : rule__DSL__Group__1__Impl ;
    public final void rule__DSL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:751:1: ( rule__DSL__Group__1__Impl )
            // InternalGoLDSL.g:752:2: rule__DSL__Group__1__Impl
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
    // InternalGoLDSL.g:758:1: rule__DSL__Group__1__Impl : ( ( rule__DSL__Alternatives_1 )* ) ;
    public final void rule__DSL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:762:1: ( ( ( rule__DSL__Alternatives_1 )* ) )
            // InternalGoLDSL.g:763:1: ( ( rule__DSL__Alternatives_1 )* )
            {
            // InternalGoLDSL.g:763:1: ( ( rule__DSL__Alternatives_1 )* )
            // InternalGoLDSL.g:764:2: ( rule__DSL__Alternatives_1 )*
            {
             before(grammarAccess.getDSLAccess().getAlternatives_1()); 
            // InternalGoLDSL.g:765:2: ( rule__DSL__Alternatives_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14||LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGoLDSL.g:765:3: rule__DSL__Alternatives_1
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
    // InternalGoLDSL.g:774:1: rule__Board__Group__0 : rule__Board__Group__0__Impl rule__Board__Group__1 ;
    public final void rule__Board__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:778:1: ( rule__Board__Group__0__Impl rule__Board__Group__1 )
            // InternalGoLDSL.g:779:2: rule__Board__Group__0__Impl rule__Board__Group__1
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
    // InternalGoLDSL.g:786:1: rule__Board__Group__0__Impl : ( 'Board:' ) ;
    public final void rule__Board__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:790:1: ( ( 'Board:' ) )
            // InternalGoLDSL.g:791:1: ( 'Board:' )
            {
            // InternalGoLDSL.g:791:1: ( 'Board:' )
            // InternalGoLDSL.g:792:2: 'Board:'
            {
             before(grammarAccess.getBoardAccess().getBoardKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalGoLDSL.g:801:1: rule__Board__Group__1 : rule__Board__Group__1__Impl ;
    public final void rule__Board__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:805:1: ( rule__Board__Group__1__Impl )
            // InternalGoLDSL.g:806:2: rule__Board__Group__1__Impl
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
    // InternalGoLDSL.g:812:1: rule__Board__Group__1__Impl : ( ( rule__Board__ObjectsAssignment_1 ) ) ;
    public final void rule__Board__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:816:1: ( ( ( rule__Board__ObjectsAssignment_1 ) ) )
            // InternalGoLDSL.g:817:1: ( ( rule__Board__ObjectsAssignment_1 ) )
            {
            // InternalGoLDSL.g:817:1: ( ( rule__Board__ObjectsAssignment_1 ) )
            // InternalGoLDSL.g:818:2: ( rule__Board__ObjectsAssignment_1 )
            {
             before(grammarAccess.getBoardAccess().getObjectsAssignment_1()); 
            // InternalGoLDSL.g:819:2: ( rule__Board__ObjectsAssignment_1 )
            // InternalGoLDSL.g:819:3: rule__Board__ObjectsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Board__ObjectsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getObjectsAssignment_1()); 

            }


            }

        }
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
    // InternalGoLDSL.g:828:1: rule__ShapeDef__Group__0 : rule__ShapeDef__Group__0__Impl rule__ShapeDef__Group__1 ;
    public final void rule__ShapeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:832:1: ( rule__ShapeDef__Group__0__Impl rule__ShapeDef__Group__1 )
            // InternalGoLDSL.g:833:2: rule__ShapeDef__Group__0__Impl rule__ShapeDef__Group__1
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
    // InternalGoLDSL.g:840:1: rule__ShapeDef__Group__0__Impl : ( 'Shape' ) ;
    public final void rule__ShapeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:844:1: ( ( 'Shape' ) )
            // InternalGoLDSL.g:845:1: ( 'Shape' )
            {
            // InternalGoLDSL.g:845:1: ( 'Shape' )
            // InternalGoLDSL.g:846:2: 'Shape'
            {
             before(grammarAccess.getShapeDefAccess().getShapeKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGoLDSL.g:855:1: rule__ShapeDef__Group__1 : rule__ShapeDef__Group__1__Impl rule__ShapeDef__Group__2 ;
    public final void rule__ShapeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:859:1: ( rule__ShapeDef__Group__1__Impl rule__ShapeDef__Group__2 )
            // InternalGoLDSL.g:860:2: rule__ShapeDef__Group__1__Impl rule__ShapeDef__Group__2
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
    // InternalGoLDSL.g:867:1: rule__ShapeDef__Group__1__Impl : ( ( rule__ShapeDef__NameAssignment_1 ) ) ;
    public final void rule__ShapeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:871:1: ( ( ( rule__ShapeDef__NameAssignment_1 ) ) )
            // InternalGoLDSL.g:872:1: ( ( rule__ShapeDef__NameAssignment_1 ) )
            {
            // InternalGoLDSL.g:872:1: ( ( rule__ShapeDef__NameAssignment_1 ) )
            // InternalGoLDSL.g:873:2: ( rule__ShapeDef__NameAssignment_1 )
            {
             before(grammarAccess.getShapeDefAccess().getNameAssignment_1()); 
            // InternalGoLDSL.g:874:2: ( rule__ShapeDef__NameAssignment_1 )
            // InternalGoLDSL.g:874:3: rule__ShapeDef__NameAssignment_1
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
    // InternalGoLDSL.g:882:1: rule__ShapeDef__Group__2 : rule__ShapeDef__Group__2__Impl rule__ShapeDef__Group__3 ;
    public final void rule__ShapeDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:886:1: ( rule__ShapeDef__Group__2__Impl rule__ShapeDef__Group__3 )
            // InternalGoLDSL.g:887:2: rule__ShapeDef__Group__2__Impl rule__ShapeDef__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalGoLDSL.g:894:1: rule__ShapeDef__Group__2__Impl : ( ':' ) ;
    public final void rule__ShapeDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:898:1: ( ( ':' ) )
            // InternalGoLDSL.g:899:1: ( ':' )
            {
            // InternalGoLDSL.g:899:1: ( ':' )
            // InternalGoLDSL.g:900:2: ':'
            {
             before(grammarAccess.getShapeDefAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalGoLDSL.g:909:1: rule__ShapeDef__Group__3 : rule__ShapeDef__Group__3__Impl ;
    public final void rule__ShapeDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:913:1: ( rule__ShapeDef__Group__3__Impl )
            // InternalGoLDSL.g:914:2: rule__ShapeDef__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeDef__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalGoLDSL.g:920:1: rule__ShapeDef__Group__3__Impl : ( ( rule__ShapeDef__ObjectsAssignment_3 ) ) ;
    public final void rule__ShapeDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:924:1: ( ( ( rule__ShapeDef__ObjectsAssignment_3 ) ) )
            // InternalGoLDSL.g:925:1: ( ( rule__ShapeDef__ObjectsAssignment_3 ) )
            {
            // InternalGoLDSL.g:925:1: ( ( rule__ShapeDef__ObjectsAssignment_3 ) )
            // InternalGoLDSL.g:926:2: ( rule__ShapeDef__ObjectsAssignment_3 )
            {
             before(grammarAccess.getShapeDefAccess().getObjectsAssignment_3()); 
            // InternalGoLDSL.g:927:2: ( rule__ShapeDef__ObjectsAssignment_3 )
            // InternalGoLDSL.g:927:3: rule__ShapeDef__ObjectsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ShapeDef__ObjectsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getShapeDefAccess().getObjectsAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__CellPairs__Group__0"
    // InternalGoLDSL.g:936:1: rule__CellPairs__Group__0 : rule__CellPairs__Group__0__Impl rule__CellPairs__Group__1 ;
    public final void rule__CellPairs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:940:1: ( rule__CellPairs__Group__0__Impl rule__CellPairs__Group__1 )
            // InternalGoLDSL.g:941:2: rule__CellPairs__Group__0__Impl rule__CellPairs__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalGoLDSL.g:948:1: rule__CellPairs__Group__0__Impl : ( '(' ) ;
    public final void rule__CellPairs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:952:1: ( ( '(' ) )
            // InternalGoLDSL.g:953:1: ( '(' )
            {
            // InternalGoLDSL.g:953:1: ( '(' )
            // InternalGoLDSL.g:954:2: '('
            {
             before(grammarAccess.getCellPairsAccess().getLeftParenthesisKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGoLDSL.g:963:1: rule__CellPairs__Group__1 : rule__CellPairs__Group__1__Impl rule__CellPairs__Group__2 ;
    public final void rule__CellPairs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:967:1: ( rule__CellPairs__Group__1__Impl rule__CellPairs__Group__2 )
            // InternalGoLDSL.g:968:2: rule__CellPairs__Group__1__Impl rule__CellPairs__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalGoLDSL.g:975:1: rule__CellPairs__Group__1__Impl : ( ( rule__CellPairs__CellsAssignment_1 ) ) ;
    public final void rule__CellPairs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:979:1: ( ( ( rule__CellPairs__CellsAssignment_1 ) ) )
            // InternalGoLDSL.g:980:1: ( ( rule__CellPairs__CellsAssignment_1 ) )
            {
            // InternalGoLDSL.g:980:1: ( ( rule__CellPairs__CellsAssignment_1 ) )
            // InternalGoLDSL.g:981:2: ( rule__CellPairs__CellsAssignment_1 )
            {
             before(grammarAccess.getCellPairsAccess().getCellsAssignment_1()); 
            // InternalGoLDSL.g:982:2: ( rule__CellPairs__CellsAssignment_1 )
            // InternalGoLDSL.g:982:3: rule__CellPairs__CellsAssignment_1
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
    // InternalGoLDSL.g:990:1: rule__CellPairs__Group__2 : rule__CellPairs__Group__2__Impl ;
    public final void rule__CellPairs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:994:1: ( rule__CellPairs__Group__2__Impl )
            // InternalGoLDSL.g:995:2: rule__CellPairs__Group__2__Impl
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
    // InternalGoLDSL.g:1001:1: rule__CellPairs__Group__2__Impl : ( ')' ) ;
    public final void rule__CellPairs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1005:1: ( ( ')' ) )
            // InternalGoLDSL.g:1006:1: ( ')' )
            {
            // InternalGoLDSL.g:1006:1: ( ')' )
            // InternalGoLDSL.g:1007:2: ')'
            {
             before(grammarAccess.getCellPairsAccess().getRightParenthesisKeyword_2()); 
            match(input,17,FOLLOW_2); 
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


    // $ANTLR start "rule__CellsDef__Group__0"
    // InternalGoLDSL.g:1017:1: rule__CellsDef__Group__0 : rule__CellsDef__Group__0__Impl rule__CellsDef__Group__1 ;
    public final void rule__CellsDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1021:1: ( rule__CellsDef__Group__0__Impl rule__CellsDef__Group__1 )
            // InternalGoLDSL.g:1022:2: rule__CellsDef__Group__0__Impl rule__CellsDef__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__CellsDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellsDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellsDef__Group__0"


    // $ANTLR start "rule__CellsDef__Group__0__Impl"
    // InternalGoLDSL.g:1029:1: rule__CellsDef__Group__0__Impl : ( 'Cells:' ) ;
    public final void rule__CellsDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1033:1: ( ( 'Cells:' ) )
            // InternalGoLDSL.g:1034:1: ( 'Cells:' )
            {
            // InternalGoLDSL.g:1034:1: ( 'Cells:' )
            // InternalGoLDSL.g:1035:2: 'Cells:'
            {
             before(grammarAccess.getCellsDefAccess().getCellsKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCellsDefAccess().getCellsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellsDef__Group__0__Impl"


    // $ANTLR start "rule__CellsDef__Group__1"
    // InternalGoLDSL.g:1044:1: rule__CellsDef__Group__1 : rule__CellsDef__Group__1__Impl ;
    public final void rule__CellsDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1048:1: ( rule__CellsDef__Group__1__Impl )
            // InternalGoLDSL.g:1049:2: rule__CellsDef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellsDef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellsDef__Group__1"


    // $ANTLR start "rule__CellsDef__Group__1__Impl"
    // InternalGoLDSL.g:1055:1: rule__CellsDef__Group__1__Impl : ( ruleCellPairs ) ;
    public final void rule__CellsDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1059:1: ( ( ruleCellPairs ) )
            // InternalGoLDSL.g:1060:1: ( ruleCellPairs )
            {
            // InternalGoLDSL.g:1060:1: ( ruleCellPairs )
            // InternalGoLDSL.g:1061:2: ruleCellPairs
            {
             before(grammarAccess.getCellsDefAccess().getCellPairsParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleCellPairs();

            state._fsp--;

             after(grammarAccess.getCellsDefAccess().getCellPairsParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellsDef__Group__1__Impl"


    // $ANTLR start "rule__CellDef__Group__0"
    // InternalGoLDSL.g:1071:1: rule__CellDef__Group__0 : rule__CellDef__Group__0__Impl rule__CellDef__Group__1 ;
    public final void rule__CellDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1075:1: ( rule__CellDef__Group__0__Impl rule__CellDef__Group__1 )
            // InternalGoLDSL.g:1076:2: rule__CellDef__Group__0__Impl rule__CellDef__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalGoLDSL.g:1083:1: rule__CellDef__Group__0__Impl : ( 'Cell:' ) ;
    public final void rule__CellDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1087:1: ( ( 'Cell:' ) )
            // InternalGoLDSL.g:1088:1: ( 'Cell:' )
            {
            // InternalGoLDSL.g:1088:1: ( 'Cell:' )
            // InternalGoLDSL.g:1089:2: 'Cell:'
            {
             before(grammarAccess.getCellDefAccess().getCellKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGoLDSL.g:1098:1: rule__CellDef__Group__1 : rule__CellDef__Group__1__Impl ;
    public final void rule__CellDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1102:1: ( rule__CellDef__Group__1__Impl )
            // InternalGoLDSL.g:1103:2: rule__CellDef__Group__1__Impl
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
    // InternalGoLDSL.g:1109:1: rule__CellDef__Group__1__Impl : ( ruleCell ) ;
    public final void rule__CellDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1113:1: ( ( ruleCell ) )
            // InternalGoLDSL.g:1114:1: ( ruleCell )
            {
            // InternalGoLDSL.g:1114:1: ( ruleCell )
            // InternalGoLDSL.g:1115:2: ruleCell
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
    // InternalGoLDSL.g:1125:1: rule__ShapeRef__Group__0 : rule__ShapeRef__Group__0__Impl rule__ShapeRef__Group__1 ;
    public final void rule__ShapeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1129:1: ( rule__ShapeRef__Group__0__Impl rule__ShapeRef__Group__1 )
            // InternalGoLDSL.g:1130:2: rule__ShapeRef__Group__0__Impl rule__ShapeRef__Group__1
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
    // InternalGoLDSL.g:1137:1: rule__ShapeRef__Group__0__Impl : ( 'Shape' ) ;
    public final void rule__ShapeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1141:1: ( ( 'Shape' ) )
            // InternalGoLDSL.g:1142:1: ( 'Shape' )
            {
            // InternalGoLDSL.g:1142:1: ( 'Shape' )
            // InternalGoLDSL.g:1143:2: 'Shape'
            {
             before(grammarAccess.getShapeRefAccess().getShapeKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGoLDSL.g:1152:1: rule__ShapeRef__Group__1 : rule__ShapeRef__Group__1__Impl rule__ShapeRef__Group__2 ;
    public final void rule__ShapeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1156:1: ( rule__ShapeRef__Group__1__Impl rule__ShapeRef__Group__2 )
            // InternalGoLDSL.g:1157:2: rule__ShapeRef__Group__1__Impl rule__ShapeRef__Group__2
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
    // InternalGoLDSL.g:1164:1: rule__ShapeRef__Group__1__Impl : ( ( rule__ShapeRef__NameAssignment_1 ) ) ;
    public final void rule__ShapeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1168:1: ( ( ( rule__ShapeRef__NameAssignment_1 ) ) )
            // InternalGoLDSL.g:1169:1: ( ( rule__ShapeRef__NameAssignment_1 ) )
            {
            // InternalGoLDSL.g:1169:1: ( ( rule__ShapeRef__NameAssignment_1 ) )
            // InternalGoLDSL.g:1170:2: ( rule__ShapeRef__NameAssignment_1 )
            {
             before(grammarAccess.getShapeRefAccess().getNameAssignment_1()); 
            // InternalGoLDSL.g:1171:2: ( rule__ShapeRef__NameAssignment_1 )
            // InternalGoLDSL.g:1171:3: rule__ShapeRef__NameAssignment_1
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
    // InternalGoLDSL.g:1179:1: rule__ShapeRef__Group__2 : rule__ShapeRef__Group__2__Impl rule__ShapeRef__Group__3 ;
    public final void rule__ShapeRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1183:1: ( rule__ShapeRef__Group__2__Impl rule__ShapeRef__Group__3 )
            // InternalGoLDSL.g:1184:2: rule__ShapeRef__Group__2__Impl rule__ShapeRef__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalGoLDSL.g:1191:1: rule__ShapeRef__Group__2__Impl : ( ':' ) ;
    public final void rule__ShapeRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1195:1: ( ( ':' ) )
            // InternalGoLDSL.g:1196:1: ( ':' )
            {
            // InternalGoLDSL.g:1196:1: ( ':' )
            // InternalGoLDSL.g:1197:2: ':'
            {
             before(grammarAccess.getShapeRefAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalGoLDSL.g:1206:1: rule__ShapeRef__Group__3 : rule__ShapeRef__Group__3__Impl rule__ShapeRef__Group__4 ;
    public final void rule__ShapeRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1210:1: ( rule__ShapeRef__Group__3__Impl rule__ShapeRef__Group__4 )
            // InternalGoLDSL.g:1211:2: rule__ShapeRef__Group__3__Impl rule__ShapeRef__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalGoLDSL.g:1218:1: rule__ShapeRef__Group__3__Impl : ( ( rule__ShapeRef__XAssignment_3 ) ) ;
    public final void rule__ShapeRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1222:1: ( ( ( rule__ShapeRef__XAssignment_3 ) ) )
            // InternalGoLDSL.g:1223:1: ( ( rule__ShapeRef__XAssignment_3 ) )
            {
            // InternalGoLDSL.g:1223:1: ( ( rule__ShapeRef__XAssignment_3 ) )
            // InternalGoLDSL.g:1224:2: ( rule__ShapeRef__XAssignment_3 )
            {
             before(grammarAccess.getShapeRefAccess().getXAssignment_3()); 
            // InternalGoLDSL.g:1225:2: ( rule__ShapeRef__XAssignment_3 )
            // InternalGoLDSL.g:1225:3: rule__ShapeRef__XAssignment_3
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
    // InternalGoLDSL.g:1233:1: rule__ShapeRef__Group__4 : rule__ShapeRef__Group__4__Impl rule__ShapeRef__Group__5 ;
    public final void rule__ShapeRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1237:1: ( rule__ShapeRef__Group__4__Impl rule__ShapeRef__Group__5 )
            // InternalGoLDSL.g:1238:2: rule__ShapeRef__Group__4__Impl rule__ShapeRef__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalGoLDSL.g:1245:1: rule__ShapeRef__Group__4__Impl : ( ',' ) ;
    public final void rule__ShapeRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1249:1: ( ( ',' ) )
            // InternalGoLDSL.g:1250:1: ( ',' )
            {
            // InternalGoLDSL.g:1250:1: ( ',' )
            // InternalGoLDSL.g:1251:2: ','
            {
             before(grammarAccess.getShapeRefAccess().getCommaKeyword_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGoLDSL.g:1260:1: rule__ShapeRef__Group__5 : rule__ShapeRef__Group__5__Impl ;
    public final void rule__ShapeRef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1264:1: ( rule__ShapeRef__Group__5__Impl )
            // InternalGoLDSL.g:1265:2: rule__ShapeRef__Group__5__Impl
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
    // InternalGoLDSL.g:1271:1: rule__ShapeRef__Group__5__Impl : ( ( rule__ShapeRef__YAssignment_5 ) ) ;
    public final void rule__ShapeRef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1275:1: ( ( ( rule__ShapeRef__YAssignment_5 ) ) )
            // InternalGoLDSL.g:1276:1: ( ( rule__ShapeRef__YAssignment_5 ) )
            {
            // InternalGoLDSL.g:1276:1: ( ( rule__ShapeRef__YAssignment_5 ) )
            // InternalGoLDSL.g:1277:2: ( rule__ShapeRef__YAssignment_5 )
            {
             before(grammarAccess.getShapeRefAccess().getYAssignment_5()); 
            // InternalGoLDSL.g:1278:2: ( rule__ShapeRef__YAssignment_5 )
            // InternalGoLDSL.g:1278:3: rule__ShapeRef__YAssignment_5
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
    // InternalGoLDSL.g:1287:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1291:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalGoLDSL.g:1292:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalGoLDSL.g:1299:1: rule__Cell__Group__0__Impl : ( ( rule__Cell__XAssignment_0 ) ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1303:1: ( ( ( rule__Cell__XAssignment_0 ) ) )
            // InternalGoLDSL.g:1304:1: ( ( rule__Cell__XAssignment_0 ) )
            {
            // InternalGoLDSL.g:1304:1: ( ( rule__Cell__XAssignment_0 ) )
            // InternalGoLDSL.g:1305:2: ( rule__Cell__XAssignment_0 )
            {
             before(grammarAccess.getCellAccess().getXAssignment_0()); 
            // InternalGoLDSL.g:1306:2: ( rule__Cell__XAssignment_0 )
            // InternalGoLDSL.g:1306:3: rule__Cell__XAssignment_0
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
    // InternalGoLDSL.g:1314:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl rule__Cell__Group__2 ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1318:1: ( rule__Cell__Group__1__Impl rule__Cell__Group__2 )
            // InternalGoLDSL.g:1319:2: rule__Cell__Group__1__Impl rule__Cell__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalGoLDSL.g:1326:1: rule__Cell__Group__1__Impl : ( ',' ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1330:1: ( ( ',' ) )
            // InternalGoLDSL.g:1331:1: ( ',' )
            {
            // InternalGoLDSL.g:1331:1: ( ',' )
            // InternalGoLDSL.g:1332:2: ','
            {
             before(grammarAccess.getCellAccess().getCommaKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGoLDSL.g:1341:1: rule__Cell__Group__2 : rule__Cell__Group__2__Impl ;
    public final void rule__Cell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1345:1: ( rule__Cell__Group__2__Impl )
            // InternalGoLDSL.g:1346:2: rule__Cell__Group__2__Impl
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
    // InternalGoLDSL.g:1352:1: rule__Cell__Group__2__Impl : ( ( rule__Cell__YAssignment_2 ) ) ;
    public final void rule__Cell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1356:1: ( ( ( rule__Cell__YAssignment_2 ) ) )
            // InternalGoLDSL.g:1357:1: ( ( rule__Cell__YAssignment_2 ) )
            {
            // InternalGoLDSL.g:1357:1: ( ( rule__Cell__YAssignment_2 ) )
            // InternalGoLDSL.g:1358:2: ( rule__Cell__YAssignment_2 )
            {
             before(grammarAccess.getCellAccess().getYAssignment_2()); 
            // InternalGoLDSL.g:1359:2: ( rule__Cell__YAssignment_2 )
            // InternalGoLDSL.g:1359:3: rule__Cell__YAssignment_2
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
    // InternalGoLDSL.g:1368:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1372:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalGoLDSL.g:1373:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalGoLDSL.g:1380:1: rule__Rule__Group__0__Impl : ( 'Rule:' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1384:1: ( ( 'Rule:' ) )
            // InternalGoLDSL.g:1385:1: ( 'Rule:' )
            {
            // InternalGoLDSL.g:1385:1: ( 'Rule:' )
            // InternalGoLDSL.g:1386:2: 'Rule:'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGoLDSL.g:1395:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1399:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalGoLDSL.g:1400:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalGoLDSL.g:1407:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__ConditionAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1411:1: ( ( ( rule__Rule__ConditionAssignment_1 ) ) )
            // InternalGoLDSL.g:1412:1: ( ( rule__Rule__ConditionAssignment_1 ) )
            {
            // InternalGoLDSL.g:1412:1: ( ( rule__Rule__ConditionAssignment_1 ) )
            // InternalGoLDSL.g:1413:2: ( rule__Rule__ConditionAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_1()); 
            // InternalGoLDSL.g:1414:2: ( rule__Rule__ConditionAssignment_1 )
            // InternalGoLDSL.g:1414:3: rule__Rule__ConditionAssignment_1
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
    // InternalGoLDSL.g:1422:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1426:1: ( rule__Rule__Group__2__Impl )
            // InternalGoLDSL.g:1427:2: rule__Rule__Group__2__Impl
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
    // InternalGoLDSL.g:1433:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ActionAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1437:1: ( ( ( rule__Rule__ActionAssignment_2 ) ) )
            // InternalGoLDSL.g:1438:1: ( ( rule__Rule__ActionAssignment_2 ) )
            {
            // InternalGoLDSL.g:1438:1: ( ( rule__Rule__ActionAssignment_2 ) )
            // InternalGoLDSL.g:1439:2: ( rule__Rule__ActionAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getActionAssignment_2()); 
            // InternalGoLDSL.g:1440:2: ( rule__Rule__ActionAssignment_2 )
            // InternalGoLDSL.g:1440:3: rule__Rule__ActionAssignment_2
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
    // InternalGoLDSL.g:1449:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1453:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalGoLDSL.g:1454:2: rule__Action__Group__0__Impl rule__Action__Group__1
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
    // InternalGoLDSL.g:1461:1: rule__Action__Group__0__Impl : ( 'Create' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1465:1: ( ( 'Create' ) )
            // InternalGoLDSL.g:1466:1: ( 'Create' )
            {
            // InternalGoLDSL.g:1466:1: ( 'Create' )
            // InternalGoLDSL.g:1467:2: 'Create'
            {
             before(grammarAccess.getActionAccess().getCreateKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGoLDSL.g:1476:1: rule__Action__Group__1 : rule__Action__Group__1__Impl ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1480:1: ( rule__Action__Group__1__Impl )
            // InternalGoLDSL.g:1481:2: rule__Action__Group__1__Impl
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
    // InternalGoLDSL.g:1487:1: rule__Action__Group__1__Impl : ( ( rule__Action__ObjectsAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1491:1: ( ( ( rule__Action__ObjectsAssignment_1 ) ) )
            // InternalGoLDSL.g:1492:1: ( ( rule__Action__ObjectsAssignment_1 ) )
            {
            // InternalGoLDSL.g:1492:1: ( ( rule__Action__ObjectsAssignment_1 ) )
            // InternalGoLDSL.g:1493:2: ( rule__Action__ObjectsAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getObjectsAssignment_1()); 
            // InternalGoLDSL.g:1494:2: ( rule__Action__ObjectsAssignment_1 )
            // InternalGoLDSL.g:1494:3: rule__Action__ObjectsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ObjectsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getObjectsAssignment_1()); 

            }


            }

        }
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
    // InternalGoLDSL.g:1503:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1507:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGoLDSL.g:1508:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoLDSL.g:1515:1: rule__Condition__Group__0__Impl : ( 'If' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1519:1: ( ( 'If' ) )
            // InternalGoLDSL.g:1520:1: ( 'If' )
            {
            // InternalGoLDSL.g:1520:1: ( 'If' )
            // InternalGoLDSL.g:1521:2: 'If'
            {
             before(grammarAccess.getConditionAccess().getIfKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGoLDSL.g:1530:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1534:1: ( rule__Condition__Group__1__Impl )
            // InternalGoLDSL.g:1535:2: rule__Condition__Group__1__Impl
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
    // InternalGoLDSL.g:1541:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ConditionsAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1545:1: ( ( ( rule__Condition__ConditionsAssignment_1 ) ) )
            // InternalGoLDSL.g:1546:1: ( ( rule__Condition__ConditionsAssignment_1 ) )
            {
            // InternalGoLDSL.g:1546:1: ( ( rule__Condition__ConditionsAssignment_1 ) )
            // InternalGoLDSL.g:1547:2: ( rule__Condition__ConditionsAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getConditionsAssignment_1()); 
            // InternalGoLDSL.g:1548:2: ( rule__Condition__ConditionsAssignment_1 )
            // InternalGoLDSL.g:1548:3: rule__Condition__ConditionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ConditionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getConditionsAssignment_1()); 

            }


            }

        }
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
    // InternalGoLDSL.g:1557:1: rule__ConditionRules__Group__0 : rule__ConditionRules__Group__0__Impl rule__ConditionRules__Group__1 ;
    public final void rule__ConditionRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1561:1: ( rule__ConditionRules__Group__0__Impl rule__ConditionRules__Group__1 )
            // InternalGoLDSL.g:1562:2: rule__ConditionRules__Group__0__Impl rule__ConditionRules__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalGoLDSL.g:1569:1: rule__ConditionRules__Group__0__Impl : ( ( rule__ConditionRules__Rule1Assignment_0 ) ) ;
    public final void rule__ConditionRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1573:1: ( ( ( rule__ConditionRules__Rule1Assignment_0 ) ) )
            // InternalGoLDSL.g:1574:1: ( ( rule__ConditionRules__Rule1Assignment_0 ) )
            {
            // InternalGoLDSL.g:1574:1: ( ( rule__ConditionRules__Rule1Assignment_0 ) )
            // InternalGoLDSL.g:1575:2: ( rule__ConditionRules__Rule1Assignment_0 )
            {
             before(grammarAccess.getConditionRulesAccess().getRule1Assignment_0()); 
            // InternalGoLDSL.g:1576:2: ( rule__ConditionRules__Rule1Assignment_0 )
            // InternalGoLDSL.g:1576:3: rule__ConditionRules__Rule1Assignment_0
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
    // InternalGoLDSL.g:1584:1: rule__ConditionRules__Group__1 : rule__ConditionRules__Group__1__Impl ;
    public final void rule__ConditionRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1588:1: ( rule__ConditionRules__Group__1__Impl )
            // InternalGoLDSL.g:1589:2: rule__ConditionRules__Group__1__Impl
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
    // InternalGoLDSL.g:1595:1: rule__ConditionRules__Group__1__Impl : ( ( rule__ConditionRules__Group_1__0 )? ) ;
    public final void rule__ConditionRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1599:1: ( ( ( rule__ConditionRules__Group_1__0 )? ) )
            // InternalGoLDSL.g:1600:1: ( ( rule__ConditionRules__Group_1__0 )? )
            {
            // InternalGoLDSL.g:1600:1: ( ( rule__ConditionRules__Group_1__0 )? )
            // InternalGoLDSL.g:1601:2: ( rule__ConditionRules__Group_1__0 )?
            {
             before(grammarAccess.getConditionRulesAccess().getGroup_1()); 
            // InternalGoLDSL.g:1602:2: ( rule__ConditionRules__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=11 && LA10_0<=12)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGoLDSL.g:1602:3: rule__ConditionRules__Group_1__0
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
    // InternalGoLDSL.g:1611:1: rule__ConditionRules__Group_1__0 : rule__ConditionRules__Group_1__0__Impl rule__ConditionRules__Group_1__1 ;
    public final void rule__ConditionRules__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1615:1: ( rule__ConditionRules__Group_1__0__Impl rule__ConditionRules__Group_1__1 )
            // InternalGoLDSL.g:1616:2: rule__ConditionRules__Group_1__0__Impl rule__ConditionRules__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalGoLDSL.g:1623:1: rule__ConditionRules__Group_1__0__Impl : ( ( rule__ConditionRules__OperatorAssignment_1_0 ) ) ;
    public final void rule__ConditionRules__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1627:1: ( ( ( rule__ConditionRules__OperatorAssignment_1_0 ) ) )
            // InternalGoLDSL.g:1628:1: ( ( rule__ConditionRules__OperatorAssignment_1_0 ) )
            {
            // InternalGoLDSL.g:1628:1: ( ( rule__ConditionRules__OperatorAssignment_1_0 ) )
            // InternalGoLDSL.g:1629:2: ( rule__ConditionRules__OperatorAssignment_1_0 )
            {
             before(grammarAccess.getConditionRulesAccess().getOperatorAssignment_1_0()); 
            // InternalGoLDSL.g:1630:2: ( rule__ConditionRules__OperatorAssignment_1_0 )
            // InternalGoLDSL.g:1630:3: rule__ConditionRules__OperatorAssignment_1_0
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
    // InternalGoLDSL.g:1638:1: rule__ConditionRules__Group_1__1 : rule__ConditionRules__Group_1__1__Impl ;
    public final void rule__ConditionRules__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1642:1: ( rule__ConditionRules__Group_1__1__Impl )
            // InternalGoLDSL.g:1643:2: rule__ConditionRules__Group_1__1__Impl
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
    // InternalGoLDSL.g:1649:1: rule__ConditionRules__Group_1__1__Impl : ( ( rule__ConditionRules__Rules2Assignment_1_1 ) ) ;
    public final void rule__ConditionRules__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1653:1: ( ( ( rule__ConditionRules__Rules2Assignment_1_1 ) ) )
            // InternalGoLDSL.g:1654:1: ( ( rule__ConditionRules__Rules2Assignment_1_1 ) )
            {
            // InternalGoLDSL.g:1654:1: ( ( rule__ConditionRules__Rules2Assignment_1_1 ) )
            // InternalGoLDSL.g:1655:2: ( rule__ConditionRules__Rules2Assignment_1_1 )
            {
             before(grammarAccess.getConditionRulesAccess().getRules2Assignment_1_1()); 
            // InternalGoLDSL.g:1656:2: ( rule__ConditionRules__Rules2Assignment_1_1 )
            // InternalGoLDSL.g:1656:3: rule__ConditionRules__Rules2Assignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionRules__Rules2Assignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionRulesAccess().getRules2Assignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Lives__Group__0"
    // InternalGoLDSL.g:1665:1: rule__Lives__Group__0 : rule__Lives__Group__0__Impl rule__Lives__Group__1 ;
    public final void rule__Lives__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1669:1: ( rule__Lives__Group__0__Impl rule__Lives__Group__1 )
            // InternalGoLDSL.g:1670:2: rule__Lives__Group__0__Impl rule__Lives__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Lives__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lives__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lives__Group__0"


    // $ANTLR start "rule__Lives__Group__0__Impl"
    // InternalGoLDSL.g:1677:1: rule__Lives__Group__0__Impl : ( 'Lives' ) ;
    public final void rule__Lives__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1681:1: ( ( 'Lives' ) )
            // InternalGoLDSL.g:1682:1: ( 'Lives' )
            {
            // InternalGoLDSL.g:1682:1: ( 'Lives' )
            // InternalGoLDSL.g:1683:2: 'Lives'
            {
             before(grammarAccess.getLivesAccess().getLivesKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLivesAccess().getLivesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lives__Group__0__Impl"


    // $ANTLR start "rule__Lives__Group__1"
    // InternalGoLDSL.g:1692:1: rule__Lives__Group__1 : rule__Lives__Group__1__Impl ;
    public final void rule__Lives__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1696:1: ( rule__Lives__Group__1__Impl )
            // InternalGoLDSL.g:1697:2: rule__Lives__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lives__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lives__Group__1"


    // $ANTLR start "rule__Lives__Group__1__Impl"
    // InternalGoLDSL.g:1703:1: rule__Lives__Group__1__Impl : ( ( rule__Lives__CellAssignment_1 ) ) ;
    public final void rule__Lives__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1707:1: ( ( ( rule__Lives__CellAssignment_1 ) ) )
            // InternalGoLDSL.g:1708:1: ( ( rule__Lives__CellAssignment_1 ) )
            {
            // InternalGoLDSL.g:1708:1: ( ( rule__Lives__CellAssignment_1 ) )
            // InternalGoLDSL.g:1709:2: ( rule__Lives__CellAssignment_1 )
            {
             before(grammarAccess.getLivesAccess().getCellAssignment_1()); 
            // InternalGoLDSL.g:1710:2: ( rule__Lives__CellAssignment_1 )
            // InternalGoLDSL.g:1710:3: rule__Lives__CellAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Lives__CellAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLivesAccess().getCellAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lives__Group__1__Impl"


    // $ANTLR start "rule__BoundedRange__Group__0"
    // InternalGoLDSL.g:1719:1: rule__BoundedRange__Group__0 : rule__BoundedRange__Group__0__Impl rule__BoundedRange__Group__1 ;
    public final void rule__BoundedRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1723:1: ( rule__BoundedRange__Group__0__Impl rule__BoundedRange__Group__1 )
            // InternalGoLDSL.g:1724:2: rule__BoundedRange__Group__0__Impl rule__BoundedRange__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalGoLDSL.g:1731:1: rule__BoundedRange__Group__0__Impl : ( ( rule__BoundedRange__LowerBoundAssignment_0 ) ) ;
    public final void rule__BoundedRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1735:1: ( ( ( rule__BoundedRange__LowerBoundAssignment_0 ) ) )
            // InternalGoLDSL.g:1736:1: ( ( rule__BoundedRange__LowerBoundAssignment_0 ) )
            {
            // InternalGoLDSL.g:1736:1: ( ( rule__BoundedRange__LowerBoundAssignment_0 ) )
            // InternalGoLDSL.g:1737:2: ( rule__BoundedRange__LowerBoundAssignment_0 )
            {
             before(grammarAccess.getBoundedRangeAccess().getLowerBoundAssignment_0()); 
            // InternalGoLDSL.g:1738:2: ( rule__BoundedRange__LowerBoundAssignment_0 )
            // InternalGoLDSL.g:1738:3: rule__BoundedRange__LowerBoundAssignment_0
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
    // InternalGoLDSL.g:1746:1: rule__BoundedRange__Group__1 : rule__BoundedRange__Group__1__Impl rule__BoundedRange__Group__2 ;
    public final void rule__BoundedRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1750:1: ( rule__BoundedRange__Group__1__Impl rule__BoundedRange__Group__2 )
            // InternalGoLDSL.g:1751:2: rule__BoundedRange__Group__1__Impl rule__BoundedRange__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalGoLDSL.g:1758:1: rule__BoundedRange__Group__1__Impl : ( '..' ) ;
    public final void rule__BoundedRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1762:1: ( ( '..' ) )
            // InternalGoLDSL.g:1763:1: ( '..' )
            {
            // InternalGoLDSL.g:1763:1: ( '..' )
            // InternalGoLDSL.g:1764:2: '..'
            {
             before(grammarAccess.getBoundedRangeAccess().getFullStopFullStopKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGoLDSL.g:1773:1: rule__BoundedRange__Group__2 : rule__BoundedRange__Group__2__Impl ;
    public final void rule__BoundedRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1777:1: ( rule__BoundedRange__Group__2__Impl )
            // InternalGoLDSL.g:1778:2: rule__BoundedRange__Group__2__Impl
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
    // InternalGoLDSL.g:1784:1: rule__BoundedRange__Group__2__Impl : ( ( rule__BoundedRange__HigherBoundAssignment_2 ) ) ;
    public final void rule__BoundedRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1788:1: ( ( ( rule__BoundedRange__HigherBoundAssignment_2 ) ) )
            // InternalGoLDSL.g:1789:1: ( ( rule__BoundedRange__HigherBoundAssignment_2 ) )
            {
            // InternalGoLDSL.g:1789:1: ( ( rule__BoundedRange__HigherBoundAssignment_2 ) )
            // InternalGoLDSL.g:1790:2: ( rule__BoundedRange__HigherBoundAssignment_2 )
            {
             before(grammarAccess.getBoundedRangeAccess().getHigherBoundAssignment_2()); 
            // InternalGoLDSL.g:1791:2: ( rule__BoundedRange__HigherBoundAssignment_2 )
            // InternalGoLDSL.g:1791:3: rule__BoundedRange__HigherBoundAssignment_2
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
    // InternalGoLDSL.g:1800:1: rule__LeftUnboundedRange__Group__0 : rule__LeftUnboundedRange__Group__0__Impl rule__LeftUnboundedRange__Group__1 ;
    public final void rule__LeftUnboundedRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1804:1: ( rule__LeftUnboundedRange__Group__0__Impl rule__LeftUnboundedRange__Group__1 )
            // InternalGoLDSL.g:1805:2: rule__LeftUnboundedRange__Group__0__Impl rule__LeftUnboundedRange__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalGoLDSL.g:1812:1: rule__LeftUnboundedRange__Group__0__Impl : ( '<' ) ;
    public final void rule__LeftUnboundedRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1816:1: ( ( '<' ) )
            // InternalGoLDSL.g:1817:1: ( '<' )
            {
            // InternalGoLDSL.g:1817:1: ( '<' )
            // InternalGoLDSL.g:1818:2: '<'
            {
             before(grammarAccess.getLeftUnboundedRangeAccess().getLessThanSignKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLeftUnboundedRangeAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
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
    // InternalGoLDSL.g:1827:1: rule__LeftUnboundedRange__Group__1 : rule__LeftUnboundedRange__Group__1__Impl ;
    public final void rule__LeftUnboundedRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1831:1: ( rule__LeftUnboundedRange__Group__1__Impl )
            // InternalGoLDSL.g:1832:2: rule__LeftUnboundedRange__Group__1__Impl
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
    // InternalGoLDSL.g:1838:1: rule__LeftUnboundedRange__Group__1__Impl : ( ( rule__LeftUnboundedRange__LowerBoundAssignment_1 ) ) ;
    public final void rule__LeftUnboundedRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1842:1: ( ( ( rule__LeftUnboundedRange__LowerBoundAssignment_1 ) ) )
            // InternalGoLDSL.g:1843:1: ( ( rule__LeftUnboundedRange__LowerBoundAssignment_1 ) )
            {
            // InternalGoLDSL.g:1843:1: ( ( rule__LeftUnboundedRange__LowerBoundAssignment_1 ) )
            // InternalGoLDSL.g:1844:2: ( rule__LeftUnboundedRange__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getLeftUnboundedRangeAccess().getLowerBoundAssignment_1()); 
            // InternalGoLDSL.g:1845:2: ( rule__LeftUnboundedRange__LowerBoundAssignment_1 )
            // InternalGoLDSL.g:1845:3: rule__LeftUnboundedRange__LowerBoundAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LeftUnboundedRange__LowerBoundAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLeftUnboundedRangeAccess().getLowerBoundAssignment_1()); 

            }


            }

        }
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
    // InternalGoLDSL.g:1854:1: rule__RightUnboundedRange__Group__0 : rule__RightUnboundedRange__Group__0__Impl rule__RightUnboundedRange__Group__1 ;
    public final void rule__RightUnboundedRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1858:1: ( rule__RightUnboundedRange__Group__0__Impl rule__RightUnboundedRange__Group__1 )
            // InternalGoLDSL.g:1859:2: rule__RightUnboundedRange__Group__0__Impl rule__RightUnboundedRange__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalGoLDSL.g:1866:1: rule__RightUnboundedRange__Group__0__Impl : ( '>' ) ;
    public final void rule__RightUnboundedRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1870:1: ( ( '>' ) )
            // InternalGoLDSL.g:1871:1: ( '>' )
            {
            // InternalGoLDSL.g:1871:1: ( '>' )
            // InternalGoLDSL.g:1872:2: '>'
            {
             before(grammarAccess.getRightUnboundedRangeAccess().getGreaterThanSignKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRightUnboundedRangeAccess().getGreaterThanSignKeyword_0()); 

            }


            }

        }
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
    // InternalGoLDSL.g:1881:1: rule__RightUnboundedRange__Group__1 : rule__RightUnboundedRange__Group__1__Impl ;
    public final void rule__RightUnboundedRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1885:1: ( rule__RightUnboundedRange__Group__1__Impl )
            // InternalGoLDSL.g:1886:2: rule__RightUnboundedRange__Group__1__Impl
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
    // InternalGoLDSL.g:1892:1: rule__RightUnboundedRange__Group__1__Impl : ( ( rule__RightUnboundedRange__HigherBoundAssignment_1 ) ) ;
    public final void rule__RightUnboundedRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1896:1: ( ( ( rule__RightUnboundedRange__HigherBoundAssignment_1 ) ) )
            // InternalGoLDSL.g:1897:1: ( ( rule__RightUnboundedRange__HigherBoundAssignment_1 ) )
            {
            // InternalGoLDSL.g:1897:1: ( ( rule__RightUnboundedRange__HigherBoundAssignment_1 ) )
            // InternalGoLDSL.g:1898:2: ( rule__RightUnboundedRange__HigherBoundAssignment_1 )
            {
             before(grammarAccess.getRightUnboundedRangeAccess().getHigherBoundAssignment_1()); 
            // InternalGoLDSL.g:1899:2: ( rule__RightUnboundedRange__HigherBoundAssignment_1 )
            // InternalGoLDSL.g:1899:3: rule__RightUnboundedRange__HigherBoundAssignment_1
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


    // $ANTLR start "rule__DSL__BoardAssignment_0"
    // InternalGoLDSL.g:1908:1: rule__DSL__BoardAssignment_0 : ( ruleBoard ) ;
    public final void rule__DSL__BoardAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1912:1: ( ( ruleBoard ) )
            // InternalGoLDSL.g:1913:2: ( ruleBoard )
            {
            // InternalGoLDSL.g:1913:2: ( ruleBoard )
            // InternalGoLDSL.g:1914:3: ruleBoard
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
    // InternalGoLDSL.g:1923:1: rule__DSL__RulesAssignment_1_0 : ( ruleRule ) ;
    public final void rule__DSL__RulesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1927:1: ( ( ruleRule ) )
            // InternalGoLDSL.g:1928:2: ( ruleRule )
            {
            // InternalGoLDSL.g:1928:2: ( ruleRule )
            // InternalGoLDSL.g:1929:3: ruleRule
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
    // InternalGoLDSL.g:1938:1: rule__DSL__ShapesAssignment_1_1 : ( ruleShapeDef ) ;
    public final void rule__DSL__ShapesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1942:1: ( ( ruleShapeDef ) )
            // InternalGoLDSL.g:1943:2: ( ruleShapeDef )
            {
            // InternalGoLDSL.g:1943:2: ( ruleShapeDef )
            // InternalGoLDSL.g:1944:3: ruleShapeDef
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


    // $ANTLR start "rule__Board__ObjectsAssignment_1"
    // InternalGoLDSL.g:1953:1: rule__Board__ObjectsAssignment_1 : ( ruleObjects ) ;
    public final void rule__Board__ObjectsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1957:1: ( ( ruleObjects ) )
            // InternalGoLDSL.g:1958:2: ( ruleObjects )
            {
            // InternalGoLDSL.g:1958:2: ( ruleObjects )
            // InternalGoLDSL.g:1959:3: ruleObjects
            {
             before(grammarAccess.getBoardAccess().getObjectsObjectsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjects();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getObjectsObjectsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__ObjectsAssignment_1"


    // $ANTLR start "rule__Objects__ShapesAssignment_0"
    // InternalGoLDSL.g:1968:1: rule__Objects__ShapesAssignment_0 : ( ruleShapeRef ) ;
    public final void rule__Objects__ShapesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1972:1: ( ( ruleShapeRef ) )
            // InternalGoLDSL.g:1973:2: ( ruleShapeRef )
            {
            // InternalGoLDSL.g:1973:2: ( ruleShapeRef )
            // InternalGoLDSL.g:1974:3: ruleShapeRef
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


    // $ANTLR start "rule__Objects__MoreCellAssignment_1"
    // InternalGoLDSL.g:1983:1: rule__Objects__MoreCellAssignment_1 : ( ruleCellDef ) ;
    public final void rule__Objects__MoreCellAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:1987:1: ( ( ruleCellDef ) )
            // InternalGoLDSL.g:1988:2: ( ruleCellDef )
            {
            // InternalGoLDSL.g:1988:2: ( ruleCellDef )
            // InternalGoLDSL.g:1989:3: ruleCellDef
            {
             before(grammarAccess.getObjectsAccess().getMoreCellCellDefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCellDef();

            state._fsp--;

             after(grammarAccess.getObjectsAccess().getMoreCellCellDefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objects__MoreCellAssignment_1"


    // $ANTLR start "rule__Objects__MoreCellsAssignment_2"
    // InternalGoLDSL.g:1998:1: rule__Objects__MoreCellsAssignment_2 : ( ruleCellsDef ) ;
    public final void rule__Objects__MoreCellsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2002:1: ( ( ruleCellsDef ) )
            // InternalGoLDSL.g:2003:2: ( ruleCellsDef )
            {
            // InternalGoLDSL.g:2003:2: ( ruleCellsDef )
            // InternalGoLDSL.g:2004:3: ruleCellsDef
            {
             before(grammarAccess.getObjectsAccess().getMoreCellsCellsDefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCellsDef();

            state._fsp--;

             after(grammarAccess.getObjectsAccess().getMoreCellsCellsDefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objects__MoreCellsAssignment_2"


    // $ANTLR start "rule__ShapeDef__NameAssignment_1"
    // InternalGoLDSL.g:2013:1: rule__ShapeDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ShapeDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2017:1: ( ( RULE_ID ) )
            // InternalGoLDSL.g:2018:2: ( RULE_ID )
            {
            // InternalGoLDSL.g:2018:2: ( RULE_ID )
            // InternalGoLDSL.g:2019:3: RULE_ID
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


    // $ANTLR start "rule__ShapeDef__ObjectsAssignment_3"
    // InternalGoLDSL.g:2028:1: rule__ShapeDef__ObjectsAssignment_3 : ( ruleObjects ) ;
    public final void rule__ShapeDef__ObjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2032:1: ( ( ruleObjects ) )
            // InternalGoLDSL.g:2033:2: ( ruleObjects )
            {
            // InternalGoLDSL.g:2033:2: ( ruleObjects )
            // InternalGoLDSL.g:2034:3: ruleObjects
            {
             before(grammarAccess.getShapeDefAccess().getObjectsObjectsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleObjects();

            state._fsp--;

             after(grammarAccess.getShapeDefAccess().getObjectsObjectsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeDef__ObjectsAssignment_3"


    // $ANTLR start "rule__CellPairs__CellsAssignment_1"
    // InternalGoLDSL.g:2043:1: rule__CellPairs__CellsAssignment_1 : ( ruleCell ) ;
    public final void rule__CellPairs__CellsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2047:1: ( ( ruleCell ) )
            // InternalGoLDSL.g:2048:2: ( ruleCell )
            {
            // InternalGoLDSL.g:2048:2: ( ruleCell )
            // InternalGoLDSL.g:2049:3: ruleCell
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
    // InternalGoLDSL.g:2058:1: rule__ShapeRef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ShapeRef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2062:1: ( ( RULE_ID ) )
            // InternalGoLDSL.g:2063:2: ( RULE_ID )
            {
            // InternalGoLDSL.g:2063:2: ( RULE_ID )
            // InternalGoLDSL.g:2064:3: RULE_ID
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
    // InternalGoLDSL.g:2073:1: rule__ShapeRef__XAssignment_3 : ( RULE_INT ) ;
    public final void rule__ShapeRef__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2077:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2078:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2078:2: ( RULE_INT )
            // InternalGoLDSL.g:2079:3: RULE_INT
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
    // InternalGoLDSL.g:2088:1: rule__ShapeRef__YAssignment_5 : ( RULE_INT ) ;
    public final void rule__ShapeRef__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2092:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2093:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2093:2: ( RULE_INT )
            // InternalGoLDSL.g:2094:3: RULE_INT
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
    // InternalGoLDSL.g:2103:1: rule__Cell__XAssignment_0 : ( RULE_INT ) ;
    public final void rule__Cell__XAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2107:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2108:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2108:2: ( RULE_INT )
            // InternalGoLDSL.g:2109:3: RULE_INT
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
    // InternalGoLDSL.g:2118:1: rule__Cell__YAssignment_2 : ( RULE_INT ) ;
    public final void rule__Cell__YAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2122:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2123:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2123:2: ( RULE_INT )
            // InternalGoLDSL.g:2124:3: RULE_INT
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
    // InternalGoLDSL.g:2133:1: rule__Rule__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2137:1: ( ( ruleCondition ) )
            // InternalGoLDSL.g:2138:2: ( ruleCondition )
            {
            // InternalGoLDSL.g:2138:2: ( ruleCondition )
            // InternalGoLDSL.g:2139:3: ruleCondition
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
    // InternalGoLDSL.g:2148:1: rule__Rule__ActionAssignment_2 : ( ruleAction ) ;
    public final void rule__Rule__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2152:1: ( ( ruleAction ) )
            // InternalGoLDSL.g:2153:2: ( ruleAction )
            {
            // InternalGoLDSL.g:2153:2: ( ruleAction )
            // InternalGoLDSL.g:2154:3: ruleAction
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


    // $ANTLR start "rule__Action__ObjectsAssignment_1"
    // InternalGoLDSL.g:2163:1: rule__Action__ObjectsAssignment_1 : ( ruleObjects ) ;
    public final void rule__Action__ObjectsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2167:1: ( ( ruleObjects ) )
            // InternalGoLDSL.g:2168:2: ( ruleObjects )
            {
            // InternalGoLDSL.g:2168:2: ( ruleObjects )
            // InternalGoLDSL.g:2169:3: ruleObjects
            {
             before(grammarAccess.getActionAccess().getObjectsObjectsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjects();

            state._fsp--;

             after(grammarAccess.getActionAccess().getObjectsObjectsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ObjectsAssignment_1"


    // $ANTLR start "rule__Condition__ConditionsAssignment_1"
    // InternalGoLDSL.g:2178:1: rule__Condition__ConditionsAssignment_1 : ( ruleConditionRules ) ;
    public final void rule__Condition__ConditionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2182:1: ( ( ruleConditionRules ) )
            // InternalGoLDSL.g:2183:2: ( ruleConditionRules )
            {
            // InternalGoLDSL.g:2183:2: ( ruleConditionRules )
            // InternalGoLDSL.g:2184:3: ruleConditionRules
            {
             before(grammarAccess.getConditionAccess().getConditionsConditionRulesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionRules();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getConditionsConditionRulesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ConditionsAssignment_1"


    // $ANTLR start "rule__ConditionRule__NumberAssignment_0"
    // InternalGoLDSL.g:2193:1: rule__ConditionRule__NumberAssignment_0 : ( RULE_INT ) ;
    public final void rule__ConditionRule__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2197:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2198:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2198:2: ( RULE_INT )
            // InternalGoLDSL.g:2199:3: RULE_INT
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
    // InternalGoLDSL.g:2208:1: rule__ConditionRule__RangeAssignment_1 : ( ruleRange ) ;
    public final void rule__ConditionRule__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2212:1: ( ( ruleRange ) )
            // InternalGoLDSL.g:2213:2: ( ruleRange )
            {
            // InternalGoLDSL.g:2213:2: ( ruleRange )
            // InternalGoLDSL.g:2214:3: ruleRange
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


    // $ANTLR start "rule__ConditionRule__LivesAssignment_2"
    // InternalGoLDSL.g:2223:1: rule__ConditionRule__LivesAssignment_2 : ( ruleLives ) ;
    public final void rule__ConditionRule__LivesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2227:1: ( ( ruleLives ) )
            // InternalGoLDSL.g:2228:2: ( ruleLives )
            {
            // InternalGoLDSL.g:2228:2: ( ruleLives )
            // InternalGoLDSL.g:2229:3: ruleLives
            {
             before(grammarAccess.getConditionRuleAccess().getLivesLivesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLives();

            state._fsp--;

             after(grammarAccess.getConditionRuleAccess().getLivesLivesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRule__LivesAssignment_2"


    // $ANTLR start "rule__ConditionRules__Rule1Assignment_0"
    // InternalGoLDSL.g:2238:1: rule__ConditionRules__Rule1Assignment_0 : ( ruleConditionRule ) ;
    public final void rule__ConditionRules__Rule1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2242:1: ( ( ruleConditionRule ) )
            // InternalGoLDSL.g:2243:2: ( ruleConditionRule )
            {
            // InternalGoLDSL.g:2243:2: ( ruleConditionRule )
            // InternalGoLDSL.g:2244:3: ruleConditionRule
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
    // InternalGoLDSL.g:2253:1: rule__ConditionRules__OperatorAssignment_1_0 : ( ruleBoolOperator ) ;
    public final void rule__ConditionRules__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2257:1: ( ( ruleBoolOperator ) )
            // InternalGoLDSL.g:2258:2: ( ruleBoolOperator )
            {
            // InternalGoLDSL.g:2258:2: ( ruleBoolOperator )
            // InternalGoLDSL.g:2259:3: ruleBoolOperator
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


    // $ANTLR start "rule__ConditionRules__Rules2Assignment_1_1"
    // InternalGoLDSL.g:2268:1: rule__ConditionRules__Rules2Assignment_1_1 : ( ruleConditionRules ) ;
    public final void rule__ConditionRules__Rules2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2272:1: ( ( ruleConditionRules ) )
            // InternalGoLDSL.g:2273:2: ( ruleConditionRules )
            {
            // InternalGoLDSL.g:2273:2: ( ruleConditionRules )
            // InternalGoLDSL.g:2274:3: ruleConditionRules
            {
             before(grammarAccess.getConditionRulesAccess().getRules2ConditionRulesParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionRules();

            state._fsp--;

             after(grammarAccess.getConditionRulesAccess().getRules2ConditionRulesParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionRules__Rules2Assignment_1_1"


    // $ANTLR start "rule__Lives__CellAssignment_1"
    // InternalGoLDSL.g:2283:1: rule__Lives__CellAssignment_1 : ( ruleCellPairs ) ;
    public final void rule__Lives__CellAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2287:1: ( ( ruleCellPairs ) )
            // InternalGoLDSL.g:2288:2: ( ruleCellPairs )
            {
            // InternalGoLDSL.g:2288:2: ( ruleCellPairs )
            // InternalGoLDSL.g:2289:3: ruleCellPairs
            {
             before(grammarAccess.getLivesAccess().getCellCellPairsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCellPairs();

            state._fsp--;

             after(grammarAccess.getLivesAccess().getCellCellPairsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lives__CellAssignment_1"


    // $ANTLR start "rule__BoundedRange__LowerBoundAssignment_0"
    // InternalGoLDSL.g:2298:1: rule__BoundedRange__LowerBoundAssignment_0 : ( RULE_INT ) ;
    public final void rule__BoundedRange__LowerBoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2302:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2303:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2303:2: ( RULE_INT )
            // InternalGoLDSL.g:2304:3: RULE_INT
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
    // InternalGoLDSL.g:2313:1: rule__BoundedRange__HigherBoundAssignment_2 : ( RULE_INT ) ;
    public final void rule__BoundedRange__HigherBoundAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2317:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2318:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2318:2: ( RULE_INT )
            // InternalGoLDSL.g:2319:3: RULE_INT
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


    // $ANTLR start "rule__LeftUnboundedRange__LowerBoundAssignment_1"
    // InternalGoLDSL.g:2328:1: rule__LeftUnboundedRange__LowerBoundAssignment_1 : ( RULE_INT ) ;
    public final void rule__LeftUnboundedRange__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2332:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2333:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2333:2: ( RULE_INT )
            // InternalGoLDSL.g:2334:3: RULE_INT
            {
             before(grammarAccess.getLeftUnboundedRangeAccess().getLowerBoundINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLeftUnboundedRangeAccess().getLowerBoundINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftUnboundedRange__LowerBoundAssignment_1"


    // $ANTLR start "rule__RightUnboundedRange__HigherBoundAssignment_1"
    // InternalGoLDSL.g:2343:1: rule__RightUnboundedRange__HigherBoundAssignment_1 : ( RULE_INT ) ;
    public final void rule__RightUnboundedRange__HigherBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoLDSL.g:2347:1: ( ( RULE_INT ) )
            // InternalGoLDSL.g:2348:2: ( RULE_INT )
            {
            // InternalGoLDSL.g:2348:2: ( RULE_INT )
            // InternalGoLDSL.g:2349:3: RULE_INT
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000C4002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000204002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C4000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000D000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});

}