package com.simonbaars.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoLDSLLexer extends Lexer {
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

    public InternalGoLDSLLexer() {;} 
    public InternalGoLDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGoLDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGoLDSL.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:11:7: ( '&' )
            // InternalGoLDSL.g:11:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:12:7: ( '|' )
            // InternalGoLDSL.g:12:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:13:7: ( '+' )
            // InternalGoLDSL.g:13:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:14:7: ( '-' )
            // InternalGoLDSL.g:14:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:15:7: ( 'Board:' )
            // InternalGoLDSL.g:15:9: 'Board:'
            {
            match("Board:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:16:7: ( 'Shape' )
            // InternalGoLDSL.g:16:9: 'Shape'
            {
            match("Shape"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:17:7: ( ':' )
            // InternalGoLDSL.g:17:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:18:7: ( '(' )
            // InternalGoLDSL.g:18:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:19:7: ( ')' )
            // InternalGoLDSL.g:19:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:20:7: ( 'Cells:' )
            // InternalGoLDSL.g:20:9: 'Cells:'
            {
            match("Cells:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:21:7: ( 'Cell:' )
            // InternalGoLDSL.g:21:9: 'Cell:'
            {
            match("Cell:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:22:7: ( ',' )
            // InternalGoLDSL.g:22:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:23:7: ( 'Rule:' )
            // InternalGoLDSL.g:23:9: 'Rule:'
            {
            match("Rule:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:24:7: ( 'Create' )
            // InternalGoLDSL.g:24:9: 'Create'
            {
            match("Create"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:25:7: ( 'If' )
            // InternalGoLDSL.g:25:9: 'If'
            {
            match("If"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:26:7: ( '..' )
            // InternalGoLDSL.g:26:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:27:7: ( 'Grid:' )
            // InternalGoLDSL.g:27:9: 'Grid:'
            {
            match("Grid:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:28:7: ( 'offset' )
            // InternalGoLDSL.g:28:9: 'offset'
            {
            match("offset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:29:7: ( 'size' )
            // InternalGoLDSL.g:29:9: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:30:7: ( 'IsAlive' )
            // InternalGoLDSL.g:30:9: 'IsAlive'
            {
            match("IsAlive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:2768:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGoLDSL.g:2768:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGoLDSL.g:2768:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGoLDSL.g:2768:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGoLDSL.g:2768:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGoLDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:2770:10: ( ( '0' .. '9' )+ )
            // InternalGoLDSL.g:2770:12: ( '0' .. '9' )+
            {
            // InternalGoLDSL.g:2770:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGoLDSL.g:2770:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:2772:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGoLDSL.g:2772:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGoLDSL.g:2772:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGoLDSL.g:2772:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGoLDSL.g:2772:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalGoLDSL.g:2772:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGoLDSL.g:2772:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGoLDSL.g:2772:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGoLDSL.g:2772:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGoLDSL.g:2772:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGoLDSL.g:2772:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:2774:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGoLDSL.g:2774:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGoLDSL.g:2774:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGoLDSL.g:2774:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:2776:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGoLDSL.g:2776:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGoLDSL.g:2776:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGoLDSL.g:2776:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalGoLDSL.g:2776:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGoLDSL.g:2776:41: ( '\\r' )? '\\n'
                    {
                    // InternalGoLDSL.g:2776:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalGoLDSL.g:2776:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:2778:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGoLDSL.g:2778:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGoLDSL.g:2778:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGoLDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGoLDSL.g:2780:16: ( . )
            // InternalGoLDSL.g:2780:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalGoLDSL.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=27;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalGoLDSL.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalGoLDSL.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalGoLDSL.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalGoLDSL.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalGoLDSL.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalGoLDSL.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalGoLDSL.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalGoLDSL.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalGoLDSL.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalGoLDSL.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalGoLDSL.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalGoLDSL.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalGoLDSL.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalGoLDSL.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalGoLDSL.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalGoLDSL.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalGoLDSL.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalGoLDSL.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalGoLDSL.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalGoLDSL.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalGoLDSL.g:1:130: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // InternalGoLDSL.g:1:138: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 23 :
                // InternalGoLDSL.g:1:147: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 24 :
                // InternalGoLDSL.g:1:159: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 25 :
                // InternalGoLDSL.g:1:175: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 26 :
                // InternalGoLDSL.g:1:191: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 27 :
                // InternalGoLDSL.g:1:199: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\5\uffff\2\37\3\uffff\1\37\1\uffff\2\37\1\31\3\37\1\31\2\uffff\3\31\6\uffff\1\37\1\uffff\1\37\3\uffff\2\37\1\uffff\1\37\1\70\1\37\1\uffff\3\37\5\uffff\5\37\1\uffff\14\37\1\117\1\37\1\121\1\37\1\uffff\1\37\1\uffff\1\37\1\uffff\1\37\4\uffff\1\126\1\37\1\130\1\uffff\1\131\2\uffff";
    static final String DFA12_eofS =
        "\132\uffff";
    static final String DFA12_minS =
        "\1\0\4\uffff\1\157\1\150\3\uffff\1\145\1\uffff\1\165\1\146\1\56\1\162\1\146\1\151\1\101\2\uffff\2\0\1\52\6\uffff\1\141\1\uffff\1\141\3\uffff\1\154\1\145\1\uffff\1\154\1\60\1\101\1\uffff\1\151\1\146\1\172\5\uffff\1\162\1\160\1\154\1\141\1\145\1\uffff\1\154\1\144\1\163\1\145\1\144\1\145\1\72\1\164\1\72\1\151\1\72\1\145\1\60\1\72\1\60\1\72\1\uffff\1\145\1\uffff\1\166\1\uffff\1\164\4\uffff\1\60\1\145\1\60\1\uffff\1\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\4\uffff\1\157\1\150\3\uffff\1\162\1\uffff\1\165\1\163\1\56\1\162\1\146\1\151\1\172\2\uffff\2\uffff\1\57\6\uffff\1\141\1\uffff\1\141\3\uffff\1\154\1\145\1\uffff\1\154\1\172\1\101\1\uffff\1\151\1\146\1\172\5\uffff\1\162\1\160\1\154\1\141\1\145\1\uffff\1\154\1\144\1\163\1\145\1\144\1\145\1\163\1\164\1\72\1\151\1\72\1\145\1\172\1\72\1\172\1\72\1\uffff\1\145\1\uffff\1\166\1\uffff\1\164\4\uffff\1\172\1\145\1\172\1\uffff\1\172\2\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\7\1\10\1\11\1\uffff\1\14\7\uffff\1\25\1\26\3\uffff\1\32\1\33\1\1\1\2\1\3\1\4\1\uffff\1\25\1\uffff\1\7\1\10\1\11\2\uffff\1\14\3\uffff\1\20\3\uffff\1\26\1\27\1\30\1\31\1\32\5\uffff\1\17\20\uffff\1\13\1\uffff\1\15\1\uffff\1\21\1\uffff\1\23\1\5\1\6\1\12\3\uffff\1\16\1\uffff\1\22\1\24";
    static final String DFA12_specialS =
        "\1\0\24\uffff\1\1\1\2\103\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\31\2\30\2\31\1\30\22\31\1\30\1\31\1\25\3\31\1\1\1\26\1\10\1\11\1\31\1\3\1\13\1\4\1\16\1\27\12\24\1\7\6\31\1\23\1\5\1\12\3\23\1\17\1\23\1\15\10\23\1\14\1\6\7\23\3\31\1\22\1\23\1\31\16\23\1\20\3\23\1\21\7\23\1\31\1\2\uff83\31",
            "",
            "",
            "",
            "",
            "\1\36",
            "\1\40",
            "",
            "",
            "",
            "\1\44\14\uffff\1\45",
            "",
            "\1\47",
            "\1\50\14\uffff\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\0\57",
            "\0\57",
            "\1\60\4\uffff\1\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "",
            "\1\64",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "",
            "\1\67",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\71",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "",
            "",
            "",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\111\70\uffff\1\110",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\120",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\122",
            "",
            "\1\123",
            "",
            "\1\124",
            "",
            "\1\125",
            "",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\127",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='&') ) {s = 1;}

                        else if ( (LA12_0=='|') ) {s = 2;}

                        else if ( (LA12_0=='+') ) {s = 3;}

                        else if ( (LA12_0=='-') ) {s = 4;}

                        else if ( (LA12_0=='B') ) {s = 5;}

                        else if ( (LA12_0=='S') ) {s = 6;}

                        else if ( (LA12_0==':') ) {s = 7;}

                        else if ( (LA12_0=='(') ) {s = 8;}

                        else if ( (LA12_0==')') ) {s = 9;}

                        else if ( (LA12_0=='C') ) {s = 10;}

                        else if ( (LA12_0==',') ) {s = 11;}

                        else if ( (LA12_0=='R') ) {s = 12;}

                        else if ( (LA12_0=='I') ) {s = 13;}

                        else if ( (LA12_0=='.') ) {s = 14;}

                        else if ( (LA12_0=='G') ) {s = 15;}

                        else if ( (LA12_0=='o') ) {s = 16;}

                        else if ( (LA12_0=='s') ) {s = 17;}

                        else if ( (LA12_0=='^') ) {s = 18;}

                        else if ( (LA12_0=='A'||(LA12_0>='D' && LA12_0<='F')||LA12_0=='H'||(LA12_0>='J' && LA12_0<='Q')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='n')||(LA12_0>='p' && LA12_0<='r')||(LA12_0>='t' && LA12_0<='z')) ) {s = 19;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 20;}

                        else if ( (LA12_0=='\"') ) {s = 21;}

                        else if ( (LA12_0=='\'') ) {s = 22;}

                        else if ( (LA12_0=='/') ) {s = 23;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 24;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='%')||LA12_0=='*'||(LA12_0>=';' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='{'||(LA12_0>='}' && LA12_0<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_21 = input.LA(1);

                        s = -1;
                        if ( ((LA12_21>='\u0000' && LA12_21<='\uFFFF')) ) {s = 47;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_22 = input.LA(1);

                        s = -1;
                        if ( ((LA12_22>='\u0000' && LA12_22<='\uFFFF')) ) {s = 47;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}