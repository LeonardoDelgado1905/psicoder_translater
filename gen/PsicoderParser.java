// Generated from R:/Documentos/Unal/7mo Semestre/TradIntrp/grammar\Psicoder.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PsicoderParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, COMMENT=2, LINE_COMMENT=3, WS=4, FUNCION_PRINCIPAL=5, FIN_PRINCIPAL=6, 
		ESTRUCTURA=7, FIN_ESTRUCTURA=8, RETURN=9, BOOLEANO=10, CARACTER=11, ENTERO=12, 
		REAL=13, CADENA=14, FUNCION=15, FIN_FUNCION=16, HACER=17, COMA=18, PYC=19, 
		DOS_P=20, LEER=21, IMPRIMIR=22, SI=23, ENTONCES=24, SI_NO=25, FIN_SI=26, 
		MIENTRAS=27, PAR_IZQ=28, PAR_DER=29, FIN_MIENTRAS=30, PARA=31, FIN_PARA=32, 
		SELECCIONAR=33, CASO=34, DEFECTO=35, ROMPER=36, FIN_SELECCIONAR=37, ASIG=38, 
		MAS=39, MENOS=40, MULT=41, DIV=42, MOD=43, MENOR=44, MAYOR=45, MENOR_IGUAL=46, 
		MAYOR_IGUAL=47, IGUAL=48, Y=49, O=50, DIF=51, NEG=52, ID=53, DATA_ENTERO=54, 
		DATA_REAL=55, DATA_CARACTER=56, DATA_CADENA=57, FALSO=58, VERDADERO=59;
	public static final int
		RULE_start = 0, RULE_main = 1, RULE_estructura = 2, RULE_estruct_body = 3, 
		RULE_function = 4, RULE_parameters = 5, RULE_return_ = 6, RULE_commands = 7, 
		RULE_command = 8, RULE_read = 9, RULE_print = 10, RULE_if_ = 11, RULE_else_ = 12, 
		RULE_while_ = 13, RULE_do_while_ = 14, RULE_for_ = 15, RULE_switch_ = 16, 
		RULE_caso = 17, RULE_defect = 18, RULE_assign = 19, RULE_declaration = 20, 
		RULE_call_function = 21, RULE_send_parameters = 22, RULE_expr = 23, RULE_data = 24, 
		RULE_operator = 25, RULE_data_type = 26, RULE_id_c = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "main", "estructura", "estruct_body", "function", "parameters", 
			"return_", "commands", "command", "read", "print", "if_", "else_", "while_", 
			"do_while_", "for_", "switch_", "caso", "defect", "assign", "declaration", 
			"call_function", "send_parameters", "expr", "data", "operator", "data_type", 
			"id_c"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", null, null, null, "'funcion_principal'", "'fin_principal'", 
			"'estructura'", "'fin_estructura'", "'retornar'", "'booleano'", "'caracter'", 
			"'entero'", "'real'", "'cadena'", "'funcion'", "'fin_funcion'", "'hacer'", 
			"','", "';'", "':'", "'leer'", "'imprimir'", "'si'", "'entonces'", "'si_no'", 
			"'fin_si'", "'mientras'", "'('", "')'", "'fin_mientras'", "'para'", "'fin_para'", 
			"'seleccionar'", "'caso'", "'defecto'", "'romper'", "'fin_seleccionar'", 
			"'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'&&'", "'||'", "'!='", "'!'", null, null, null, null, null, 
			"'falso'", "'verdadero'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "COMMENT", "LINE_COMMENT", "WS", "FUNCION_PRINCIPAL", "FIN_PRINCIPAL", 
			"ESTRUCTURA", "FIN_ESTRUCTURA", "RETURN", "BOOLEANO", "CARACTER", "ENTERO", 
			"REAL", "CADENA", "FUNCION", "FIN_FUNCION", "HACER", "COMA", "PYC", "DOS_P", 
			"LEER", "IMPRIMIR", "SI", "ENTONCES", "SI_NO", "FIN_SI", "MIENTRAS", 
			"PAR_IZQ", "PAR_DER", "FIN_MIENTRAS", "PARA", "FIN_PARA", "SELECCIONAR", 
			"CASO", "DEFECTO", "ROMPER", "FIN_SELECCIONAR", "ASIG", "MAS", "MENOS", 
			"MULT", "DIV", "MOD", "MENOR", "MAYOR", "MENOR_IGUAL", "MAYOR_IGUAL", 
			"IGUAL", "Y", "O", "DIF", "NEG", "ID", "DATA_ENTERO", "DATA_REAL", "DATA_CARACTER", 
			"DATA_CADENA", "FALSO", "VERDADERO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Psicoder.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PsicoderParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PsicoderParser.EOF, 0); }
		public List<EstructuraContext> estructura() {
			return getRuleContexts(EstructuraContext.class);
		}
		public EstructuraContext estructura(int i) {
			return getRuleContext(EstructuraContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESTRUCTURA || _la==FUNCION) {
				{
				setState(58);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ESTRUCTURA:
					{
					setState(56);
					estructura();
					}
					break;
				case FUNCION:
					{
					setState(57);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			main();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESTRUCTURA || _la==FUNCION) {
				{
				setState(66);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ESTRUCTURA:
					{
					setState(64);
					estructura();
					}
					break;
				case FUNCION:
					{
					setState(65);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode FUNCION_PRINCIPAL() { return getToken(PsicoderParser.FUNCION_PRINCIPAL, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode FIN_PRINCIPAL() { return getToken(PsicoderParser.FIN_PRINCIPAL, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(FUNCION_PRINCIPAL);
			setState(74);
			commands();
			setState(75);
			match(FIN_PRINCIPAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstructuraContext extends ParserRuleContext {
		public TerminalNode ESTRUCTURA() { return getToken(PsicoderParser.ESTRUCTURA, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public Estruct_bodyContext estruct_body() {
			return getRuleContext(Estruct_bodyContext.class,0);
		}
		public TerminalNode FIN_ESTRUCTURA() { return getToken(PsicoderParser.FIN_ESTRUCTURA, 0); }
		public EstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitEstructura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitEstructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstructuraContext estructura() throws RecognitionException {
		EstructuraContext _localctx = new EstructuraContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_estructura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ESTRUCTURA);
			setState(78);
			match(ID);
			setState(79);
			estruct_body();
			setState(80);
			match(FIN_ESTRUCTURA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Estruct_bodyContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode PYC() { return getToken(PsicoderParser.PYC, 0); }
		public Estruct_bodyContext estruct_body() {
			return getRuleContext(Estruct_bodyContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PsicoderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PsicoderParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(PsicoderParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PsicoderParser.COMA, i);
		}
		public Estruct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruct_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterEstruct_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitEstruct_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitEstruct_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Estruct_bodyContext estruct_body() throws RecognitionException {
		Estruct_bodyContext _localctx = new Estruct_bodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_estruct_body);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEANO:
			case CARACTER:
			case ENTERO:
			case REAL:
			case CADENA:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				data_type();
				{
				setState(83);
				match(ID);
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(84);
					match(COMA);
					setState(85);
					match(ID);
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				match(PYC);
				setState(92);
				estruct_body();
				}
				break;
			case FIN_ESTRUCTURA:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(PsicoderParser.FUNCION, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode PAR_IZQ() { return getToken(PsicoderParser.PAR_IZQ, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(PsicoderParser.PAR_DER, 0); }
		public TerminalNode HACER() { return getToken(PsicoderParser.HACER, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public Return_Context return_() {
			return getRuleContext(Return_Context.class,0);
		}
		public TerminalNode FIN_FUNCION() { return getToken(PsicoderParser.FIN_FUNCION, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(FUNCION);
			setState(98);
			data_type();
			setState(99);
			match(ID);
			setState(100);
			match(PAR_IZQ);
			setState(101);
			parameters();
			setState(102);
			match(PAR_DER);
			setState(103);
			match(HACER);
			setState(104);
			commands();
			setState(105);
			return_();
			setState(106);
			match(FIN_FUNCION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}
		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PsicoderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PsicoderParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(PsicoderParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PsicoderParser.COMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEANO:
			case CARACTER:
			case ENTERO:
			case REAL:
			case CADENA:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(108);
				data_type();
				setState(109);
				match(ID);
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(111);
					match(COMA);
					setState(112);
					data_type();
					setState(113);
					match(ID);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PAR_DER:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_Context extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PsicoderParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PYC() { return getToken(PsicoderParser.PYC, 0); }
		public Return_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterReturn_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitReturn_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitReturn_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_Context return_() throws RecognitionException {
		Return_Context _localctx = new Return_Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_return_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(RETURN);
			setState(124);
			expr();
			setState(125);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandsContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_commands);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				command();
				setState(128);
				commands();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public Do_while_Context do_while_() {
			return getRuleContext(Do_while_Context.class,0);
		}
		public For_Context for_() {
			return getRuleContext(For_Context.class,0);
		}
		public Switch_Context switch_() {
			return getRuleContext(Switch_Context.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode PYC() { return getToken(PsicoderParser.PYC, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_command);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				read();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				print();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				if_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				while_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				do_while_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				for_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				switch_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(140);
				assign();
				setState(141);
				match(PYC);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(143);
				declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(144);
				call_function();
				setState(145);
				match(PYC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(PsicoderParser.LEER, 0); }
		public TerminalNode PAR_IZQ() { return getToken(PsicoderParser.PAR_IZQ, 0); }
		public Id_cContext id_c() {
			return getRuleContext(Id_cContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(PsicoderParser.PAR_DER, 0); }
		public TerminalNode PYC() { return getToken(PsicoderParser.PYC, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(LEER);
			setState(150);
			match(PAR_IZQ);
			setState(151);
			id_c();
			setState(152);
			match(PAR_DER);
			setState(153);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR() { return getToken(PsicoderParser.IMPRIMIR, 0); }
		public TerminalNode PAR_IZQ() { return getToken(PsicoderParser.PAR_IZQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PAR_DER() { return getToken(PsicoderParser.PAR_DER, 0); }
		public TerminalNode PYC() { return getToken(PsicoderParser.PYC, 0); }
		public List<TerminalNode> COMA() { return getTokens(PsicoderParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PsicoderParser.COMA, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(IMPRIMIR);
			setState(156);
			match(PAR_IZQ);
			setState(157);
			expr();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(158);
				match(COMA);
				setState(159);
				expr();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(PAR_DER);
			setState(166);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_Context extends ParserRuleContext {
		public TerminalNode SI() { return getToken(PsicoderParser.SI, 0); }
		public TerminalNode PAR_IZQ() { return getToken(PsicoderParser.PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(PsicoderParser.PAR_DER, 0); }
		public TerminalNode ENTONCES() { return getToken(PsicoderParser.ENTONCES, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public Else_Context else_() {
			return getRuleContext(Else_Context.class,0);
		}
		public TerminalNode FIN_SI() { return getToken(PsicoderParser.FIN_SI, 0); }
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterIf_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitIf_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitIf_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(SI);
			setState(169);
			match(PAR_IZQ);
			setState(170);
			expr();
			setState(171);
			match(PAR_DER);
			setState(172);
			match(ENTONCES);
			setState(173);
			commands();
			setState(174);
			else_();
			setState(175);
			match(FIN_SI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_Context extends ParserRuleContext {
		public TerminalNode SI_NO() { return getToken(PsicoderParser.SI_NO, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public Else_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterElse_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitElse_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitElse_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_Context else_() throws RecognitionException {
		Else_Context _localctx = new Else_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_else_);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SI_NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(SI_NO);
				setState(178);
				commands();
				}
				break;
			case FIN_SI:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_Context extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(PsicoderParser.MIENTRAS, 0); }
		public TerminalNode PAR_IZQ() { return getToken(PsicoderParser.PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(PsicoderParser.PAR_DER, 0); }
		public TerminalNode HACER() { return getToken(PsicoderParser.HACER, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode FIN_MIENTRAS() { return getToken(PsicoderParser.FIN_MIENTRAS, 0); }
		public While_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterWhile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitWhile_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitWhile_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_while_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(MIENTRAS);
			setState(183);
			match(PAR_IZQ);
			setState(184);
			expr();
			setState(185);
			match(PAR_DER);
			setState(186);
			match(HACER);
			setState(187);
			commands();
			setState(188);
			match(FIN_MIENTRAS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_Context extends ParserRuleContext {
		public TerminalNode HACER() { return getToken(PsicoderParser.HACER, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode MIENTRAS() { return getToken(PsicoderParser.MIENTRAS, 0); }
		public TerminalNode PAR_IZQ() { return getToken(PsicoderParser.PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(PsicoderParser.PAR_DER, 0); }
		public TerminalNode PYC() { return getToken(PsicoderParser.PYC, 0); }
		public Do_while_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterDo_while_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitDo_while_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitDo_while_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_Context do_while_() throws RecognitionException {
		Do_while_Context _localctx = new Do_while_Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_do_while_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(HACER);
			setState(191);
			commands();
			setState(192);
			match(MIENTRAS);
			setState(193);
			match(PAR_IZQ);
			setState(194);
			expr();
			setState(195);
			match(PAR_DER);
			setState(196);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_Context extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(PsicoderParser.PARA, 0); }
		public TerminalNode PAR_IZQ() { return getToken(PsicoderParser.PAR_IZQ, 0); }
		public List<TerminalNode> PYC() { return getTokens(PsicoderParser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(PsicoderParser.PYC, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PAR_DER() { return getToken(PsicoderParser.PAR_DER, 0); }
		public TerminalNode HACER() { return getToken(PsicoderParser.HACER, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode FIN_PARA() { return getToken(PsicoderParser.FIN_PARA, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public For_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterFor_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitFor_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitFor_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_Context for_() throws RecognitionException {
		For_Context _localctx = new For_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(PARA);
			setState(199);
			match(PAR_IZQ);
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(200);
				assign();
				}
				break;
			case 2:
				{
				setState(201);
				declaration();
				}
				break;
			}
			setState(204);
			match(PYC);
			setState(205);
			expr();
			setState(206);
			match(PYC);
			setState(207);
			expr();
			setState(208);
			match(PAR_DER);
			setState(209);
			match(HACER);
			setState(210);
			commands();
			setState(211);
			match(FIN_PARA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_Context extends ParserRuleContext {
		public TerminalNode SELECCIONAR() { return getToken(PsicoderParser.SELECCIONAR, 0); }
		public TerminalNode PAR_IZQ() { return getToken(PsicoderParser.PAR_IZQ, 0); }
		public Id_cContext id_c() {
			return getRuleContext(Id_cContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(PsicoderParser.PAR_DER, 0); }
		public TerminalNode ENTONCES() { return getToken(PsicoderParser.ENTONCES, 0); }
		public TerminalNode FIN_SELECCIONAR() { return getToken(PsicoderParser.FIN_SELECCIONAR, 0); }
		public DefectContext defect() {
			return getRuleContext(DefectContext.class,0);
		}
		public List<CasoContext> caso() {
			return getRuleContexts(CasoContext.class);
		}
		public CasoContext caso(int i) {
			return getRuleContext(CasoContext.class,i);
		}
		public Switch_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterSwitch_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitSwitch_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitSwitch_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_Context switch_() throws RecognitionException {
		Switch_Context _localctx = new Switch_Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_switch_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(SELECCIONAR);
			setState(214);
			match(PAR_IZQ);
			setState(215);
			id_c();
			setState(216);
			match(PAR_DER);
			setState(217);
			match(ENTONCES);
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFECTO:
				{
				setState(218);
				defect();
				}
				break;
			case CASO:
				{
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(219);
					caso();
					}
					}
					setState(222); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CASO );
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFECTO) {
					{
					setState(224);
					defect();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(229);
			match(FIN_SELECCIONAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasoContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(PsicoderParser.CASO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOS_P() { return getToken(PsicoderParser.DOS_P, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode ROMPER() { return getToken(PsicoderParser.ROMPER, 0); }
		public TerminalNode PYC() { return getToken(PsicoderParser.PYC, 0); }
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_caso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(CASO);
			setState(232);
			expr();
			setState(233);
			match(DOS_P);
			setState(234);
			commands();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROMPER) {
				{
				setState(235);
				match(ROMPER);
				setState(236);
				match(PYC);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefectContext extends ParserRuleContext {
		public TerminalNode DEFECTO() { return getToken(PsicoderParser.DEFECTO, 0); }
		public TerminalNode DOS_P() { return getToken(PsicoderParser.DOS_P, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode ROMPER() { return getToken(PsicoderParser.ROMPER, 0); }
		public TerminalNode PYC() { return getToken(PsicoderParser.PYC, 0); }
		public DefectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterDefect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitDefect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitDefect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefectContext defect() throws RecognitionException {
		DefectContext _localctx = new DefectContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_defect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(DEFECTO);
			setState(240);
			match(DOS_P);
			setState(241);
			commands();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROMPER) {
				{
				setState(242);
				match(ROMPER);
				setState(243);
				match(PYC);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public Id_cContext id_c() {
			return getRuleContext(Id_cContext.class,0);
		}
		public TerminalNode ASIG() { return getToken(PsicoderParser.ASIG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			id_c();
			setState(247);
			match(ASIG);
			setState(248);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode PYC() { return getToken(PsicoderParser.PYC, 0); }
		public List<TerminalNode> ID() { return getTokens(PsicoderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PsicoderParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(PsicoderParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PsicoderParser.COMA, i);
		}
		public List<TerminalNode> ASIG() { return getTokens(PsicoderParser.ASIG); }
		public TerminalNode ASIG(int i) {
			return getToken(PsicoderParser.ASIG, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			data_type();
			{
			setState(251);
			match(ID);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASIG) {
				{
				setState(252);
				match(ASIG);
				setState(253);
				expr();
				}
			}

			}
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(256);
				match(COMA);
				setState(257);
				match(ID);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASIG) {
					{
					setState(258);
					match(ASIG);
					setState(259);
					expr();
					}
				}

				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_functionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode PAR_IZQ() { return getToken(PsicoderParser.PAR_IZQ, 0); }
		public Send_parametersContext send_parameters() {
			return getRuleContext(Send_parametersContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(PsicoderParser.PAR_DER, 0); }
		public Call_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterCall_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitCall_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitCall_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_functionContext call_function() throws RecognitionException {
		Call_functionContext _localctx = new Call_functionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_call_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(ID);
			setState(270);
			match(PAR_IZQ);
			setState(271);
			send_parameters();
			setState(272);
			match(PAR_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Send_parametersContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(PsicoderParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PsicoderParser.COMA, i);
		}
		public Send_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_send_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterSend_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitSend_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitSend_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Send_parametersContext send_parameters() throws RecognitionException {
		Send_parametersContext _localctx = new Send_parametersContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_send_parameters);
		int _la;
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAR_IZQ:
			case MENOS:
			case NEG:
			case ID:
			case DATA_ENTERO:
			case DATA_REAL:
			case DATA_CARACTER:
			case DATA_CADENA:
			case FALSO:
			case VERDADERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				expr();
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(275);
					match(COMA);
					setState(276);
					expr();
					}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PAR_DER:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MENOS() { return getToken(PsicoderParser.MENOS, 0); }
		public TerminalNode NEG() { return getToken(PsicoderParser.NEG, 0); }
		public TerminalNode PAR_IZQ() { return getToken(PsicoderParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(PsicoderParser.PAR_DER, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr);
		int _la;
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case DATA_ENTERO:
			case DATA_REAL:
			case DATA_CARACTER:
			case DATA_CADENA:
			case FALSO:
			case VERDADERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				data();
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAS) | (1L << MENOS) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << MENOR) | (1L << MAYOR) | (1L << MENOR_IGUAL) | (1L << MAYOR_IGUAL) | (1L << IGUAL) | (1L << Y) | (1L << O) | (1L << DIF) | (1L << NEG))) != 0)) {
					{
					setState(286);
					operator();
					setState(287);
					expr();
					}
				}

				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(MENOS);
				setState(292);
				expr();
				}
				break;
			case NEG:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(NEG);
				setState(294);
				expr();
				}
				break;
			case PAR_IZQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				match(PAR_IZQ);
				setState(296);
				expr();
				setState(297);
				match(PAR_DER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataContext extends ParserRuleContext {
		public TerminalNode DATA_ENTERO() { return getToken(PsicoderParser.DATA_ENTERO, 0); }
		public TerminalNode DATA_REAL() { return getToken(PsicoderParser.DATA_REAL, 0); }
		public TerminalNode DATA_CARACTER() { return getToken(PsicoderParser.DATA_CARACTER, 0); }
		public TerminalNode DATA_CADENA() { return getToken(PsicoderParser.DATA_CADENA, 0); }
		public TerminalNode FALSO() { return getToken(PsicoderParser.FALSO, 0); }
		public TerminalNode VERDADERO() { return getToken(PsicoderParser.VERDADERO, 0); }
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Id_cContext id_c() {
			return getRuleContext(Id_cContext.class,0);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_data);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(DATA_ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(DATA_REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				match(DATA_CARACTER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				match(DATA_CADENA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(305);
				match(FALSO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(306);
				match(VERDADERO);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(307);
				call_function();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(308);
				id_c();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(PsicoderParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(PsicoderParser.MENOS, 0); }
		public TerminalNode MULT() { return getToken(PsicoderParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(PsicoderParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PsicoderParser.MOD, 0); }
		public TerminalNode MENOR() { return getToken(PsicoderParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(PsicoderParser.MAYOR, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(PsicoderParser.MENOR_IGUAL, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(PsicoderParser.MAYOR_IGUAL, 0); }
		public TerminalNode IGUAL() { return getToken(PsicoderParser.IGUAL, 0); }
		public TerminalNode Y() { return getToken(PsicoderParser.Y, 0); }
		public TerminalNode O() { return getToken(PsicoderParser.O, 0); }
		public TerminalNode DIF() { return getToken(PsicoderParser.DIF, 0); }
		public TerminalNode NEG() { return getToken(PsicoderParser.NEG, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAS) | (1L << MENOS) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << MENOR) | (1L << MAYOR) | (1L << MENOR_IGUAL) | (1L << MAYOR_IGUAL) | (1L << IGUAL) | (1L << Y) | (1L << O) | (1L << DIF) | (1L << NEG))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode BOOLEANO() { return getToken(PsicoderParser.BOOLEANO, 0); }
		public TerminalNode CARACTER() { return getToken(PsicoderParser.CARACTER, 0); }
		public TerminalNode ENTERO() { return getToken(PsicoderParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(PsicoderParser.REAL, 0); }
		public TerminalNode CADENA() { return getToken(PsicoderParser.CADENA, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANO) | (1L << CARACTER) | (1L << ENTERO) | (1L << REAL) | (1L << CADENA) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_cContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PsicoderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PsicoderParser.ID, i);
		}
		public Id_cContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterId_c(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitId_c(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitId_c(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_cContext id_c() throws RecognitionException {
		Id_cContext _localctx = new Id_cContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_id_c);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(ID);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(316);
				match(T__0);
				setState(317);
				match(ID);
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u0146\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\7\2=\n\2\f\2\16\2@\13"+
		"\2\3\2\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\5\3\5\3\5\3\5"+
		"\5\5b\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7v\n\7\f\7\16\7y\13\7\3\7\5\7|\n\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\5\t\u0086\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0096\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u00a3\n\f\f\f\16\f\u00a6\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00b7\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\5\21\u00cd\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\6\22\u00df\n\22\r\22\16\22\u00e0\3"+
		"\22\5\22\u00e4\n\22\5\22\u00e6\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00f0\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u00f7\n\24\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0101\n\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0107\n\26\7\26\u0109\n\26\f\26\16\26\u010c\13\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u0118\n\30\f\30\16\30\u011b\13"+
		"\30\3\30\5\30\u011e\n\30\3\31\3\31\3\31\3\31\5\31\u0124\n\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u012e\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0138\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\7\35"+
		"\u0141\n\35\f\35\16\35\u0144\13\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\4\3\2)\66\4\2\f\20\67\67\2\u0154"+
		"\2>\3\2\2\2\4K\3\2\2\2\6O\3\2\2\2\ba\3\2\2\2\nc\3\2\2\2\f{\3\2\2\2\16"+
		"}\3\2\2\2\20\u0085\3\2\2\2\22\u0095\3\2\2\2\24\u0097\3\2\2\2\26\u009d"+
		"\3\2\2\2\30\u00aa\3\2\2\2\32\u00b6\3\2\2\2\34\u00b8\3\2\2\2\36\u00c0\3"+
		"\2\2\2 \u00c8\3\2\2\2\"\u00d7\3\2\2\2$\u00e9\3\2\2\2&\u00f1\3\2\2\2(\u00f8"+
		"\3\2\2\2*\u00fc\3\2\2\2,\u010f\3\2\2\2.\u011d\3\2\2\2\60\u012d\3\2\2\2"+
		"\62\u0137\3\2\2\2\64\u0139\3\2\2\2\66\u013b\3\2\2\28\u013d\3\2\2\2:=\5"+
		"\6\4\2;=\5\n\6\2<:\3\2\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3"+
		"\2\2\2@>\3\2\2\2AF\5\4\3\2BE\5\6\4\2CE\5\n\6\2DB\3\2\2\2DC\3\2\2\2EH\3"+
		"\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\2\2\3J\3\3\2\2\2KL"+
		"\7\7\2\2LM\5\20\t\2MN\7\b\2\2N\5\3\2\2\2OP\7\t\2\2PQ\7\67\2\2QR\5\b\5"+
		"\2RS\7\n\2\2S\7\3\2\2\2TU\5\66\34\2UZ\7\67\2\2VW\7\24\2\2WY\7\67\2\2X"+
		"V\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\25\2"+
		"\2^_\5\b\5\2_b\3\2\2\2`b\3\2\2\2aT\3\2\2\2a`\3\2\2\2b\t\3\2\2\2cd\7\21"+
		"\2\2de\5\66\34\2ef\7\67\2\2fg\7\36\2\2gh\5\f\7\2hi\7\37\2\2ij\7\23\2\2"+
		"jk\5\20\t\2kl\5\16\b\2lm\7\22\2\2m\13\3\2\2\2no\5\66\34\2op\7\67\2\2p"+
		"w\3\2\2\2qr\7\24\2\2rs\5\66\34\2st\7\67\2\2tv\3\2\2\2uq\3\2\2\2vy\3\2"+
		"\2\2wu\3\2\2\2wx\3\2\2\2x|\3\2\2\2yw\3\2\2\2z|\3\2\2\2{n\3\2\2\2{z\3\2"+
		"\2\2|\r\3\2\2\2}~\7\13\2\2~\177\5\60\31\2\177\u0080\7\25\2\2\u0080\17"+
		"\3\2\2\2\u0081\u0082\5\22\n\2\u0082\u0083\5\20\t\2\u0083\u0086\3\2\2\2"+
		"\u0084\u0086\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0084\3\2\2\2\u0086\21"+
		"\3\2\2\2\u0087\u0096\5\24\13\2\u0088\u0096\5\26\f\2\u0089\u0096\5\30\r"+
		"\2\u008a\u0096\5\34\17\2\u008b\u0096\5\36\20\2\u008c\u0096\5 \21\2\u008d"+
		"\u0096\5\"\22\2\u008e\u008f\5(\25\2\u008f\u0090\7\25\2\2\u0090\u0096\3"+
		"\2\2\2\u0091\u0096\5*\26\2\u0092\u0093\5,\27\2\u0093\u0094\7\25\2\2\u0094"+
		"\u0096\3\2\2\2\u0095\u0087\3\2\2\2\u0095\u0088\3\2\2\2\u0095\u0089\3\2"+
		"\2\2\u0095\u008a\3\2\2\2\u0095\u008b\3\2\2\2\u0095\u008c\3\2\2\2\u0095"+
		"\u008d\3\2\2\2\u0095\u008e\3\2\2\2\u0095\u0091\3\2\2\2\u0095\u0092\3\2"+
		"\2\2\u0096\23\3\2\2\2\u0097\u0098\7\27\2\2\u0098\u0099\7\36\2\2\u0099"+
		"\u009a\58\35\2\u009a\u009b\7\37\2\2\u009b\u009c\7\25\2\2\u009c\25\3\2"+
		"\2\2\u009d\u009e\7\30\2\2\u009e\u009f\7\36\2\2\u009f\u00a4\5\60\31\2\u00a0"+
		"\u00a1\7\24\2\2\u00a1\u00a3\5\60\31\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00a8\7\37\2\2\u00a8\u00a9\7\25\2\2\u00a9\27\3\2"+
		"\2\2\u00aa\u00ab\7\31\2\2\u00ab\u00ac\7\36\2\2\u00ac\u00ad\5\60\31\2\u00ad"+
		"\u00ae\7\37\2\2\u00ae\u00af\7\32\2\2\u00af\u00b0\5\20\t\2\u00b0\u00b1"+
		"\5\32\16\2\u00b1\u00b2\7\34\2\2\u00b2\31\3\2\2\2\u00b3\u00b4\7\33\2\2"+
		"\u00b4\u00b7\5\20\t\2\u00b5\u00b7\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b5"+
		"\3\2\2\2\u00b7\33\3\2\2\2\u00b8\u00b9\7\35\2\2\u00b9\u00ba\7\36\2\2\u00ba"+
		"\u00bb\5\60\31\2\u00bb\u00bc\7\37\2\2\u00bc\u00bd\7\23\2\2\u00bd\u00be"+
		"\5\20\t\2\u00be\u00bf\7 \2\2\u00bf\35\3\2\2\2\u00c0\u00c1\7\23\2\2\u00c1"+
		"\u00c2\5\20\t\2\u00c2\u00c3\7\35\2\2\u00c3\u00c4\7\36\2\2\u00c4\u00c5"+
		"\5\60\31\2\u00c5\u00c6\7\37\2\2\u00c6\u00c7\7\25\2\2\u00c7\37\3\2\2\2"+
		"\u00c8\u00c9\7!\2\2\u00c9\u00cc\7\36\2\2\u00ca\u00cd\5(\25\2\u00cb\u00cd"+
		"\5*\26\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\7\25\2\2\u00cf\u00d0\5\60\31\2\u00d0\u00d1\7\25\2\2\u00d1\u00d2"+
		"\5\60\31\2\u00d2\u00d3\7\37\2\2\u00d3\u00d4\7\23\2\2\u00d4\u00d5\5\20"+
		"\t\2\u00d5\u00d6\7\"\2\2\u00d6!\3\2\2\2\u00d7\u00d8\7#\2\2\u00d8\u00d9"+
		"\7\36\2\2\u00d9\u00da\58\35\2\u00da\u00db\7\37\2\2\u00db\u00e5\7\32\2"+
		"\2\u00dc\u00e6\5&\24\2\u00dd\u00df\5$\23\2\u00de\u00dd\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00e4\5&\24\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2"+
		"\2\2\u00e5\u00dc\3\2\2\2\u00e5\u00de\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\7\'\2\2\u00e8#\3\2\2\2\u00e9\u00ea\7$\2\2\u00ea\u00eb\5\60\31\2"+
		"\u00eb\u00ec\7\26\2\2\u00ec\u00ef\5\20\t\2\u00ed\u00ee\7&\2\2\u00ee\u00f0"+
		"\7\25\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0%\3\2\2\2\u00f1"+
		"\u00f2\7%\2\2\u00f2\u00f3\7\26\2\2\u00f3\u00f6\5\20\t\2\u00f4\u00f5\7"+
		"&\2\2\u00f5\u00f7\7\25\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\'\3\2\2\2\u00f8\u00f9\58\35\2\u00f9\u00fa\7(\2\2\u00fa\u00fb\5\60\31"+
		"\2\u00fb)\3\2\2\2\u00fc\u00fd\5\66\34\2\u00fd\u0100\7\67\2\2\u00fe\u00ff"+
		"\7(\2\2\u00ff\u0101\5\60\31\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2"+
		"\u0101\u010a\3\2\2\2\u0102\u0103\7\24\2\2\u0103\u0106\7\67\2\2\u0104\u0105"+
		"\7(\2\2\u0105\u0107\5\60\31\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2"+
		"\u0107\u0109\3\2\2\2\u0108\u0102\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u010e\7\25\2\2\u010e+\3\2\2\2\u010f\u0110\7\67\2\2\u0110\u0111\7\36\2"+
		"\2\u0111\u0112\5.\30\2\u0112\u0113\7\37\2\2\u0113-\3\2\2\2\u0114\u0119"+
		"\5\60\31\2\u0115\u0116\7\24\2\2\u0116\u0118\5\60\31\2\u0117\u0115\3\2"+
		"\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011e\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u0114\3\2"+
		"\2\2\u011d\u011c\3\2\2\2\u011e/\3\2\2\2\u011f\u0123\5\62\32\2\u0120\u0121"+
		"\5\64\33\2\u0121\u0122\5\60\31\2\u0122\u0124\3\2\2\2\u0123\u0120\3\2\2"+
		"\2\u0123\u0124\3\2\2\2\u0124\u012e\3\2\2\2\u0125\u0126\7*\2\2\u0126\u012e"+
		"\5\60\31\2\u0127\u0128\7\66\2\2\u0128\u012e\5\60\31\2\u0129\u012a\7\36"+
		"\2\2\u012a\u012b\5\60\31\2\u012b\u012c\7\37\2\2\u012c\u012e\3\2\2\2\u012d"+
		"\u011f\3\2\2\2\u012d\u0125\3\2\2\2\u012d\u0127\3\2\2\2\u012d\u0129\3\2"+
		"\2\2\u012e\61\3\2\2\2\u012f\u0138\78\2\2\u0130\u0138\79\2\2\u0131\u0138"+
		"\7:\2\2\u0132\u0138\7;\2\2\u0133\u0138\7<\2\2\u0134\u0138\7=\2\2\u0135"+
		"\u0138\5,\27\2\u0136\u0138\58\35\2\u0137\u012f\3\2\2\2\u0137\u0130\3\2"+
		"\2\2\u0137\u0131\3\2\2\2\u0137\u0132\3\2\2\2\u0137\u0133\3\2\2\2\u0137"+
		"\u0134\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\63\3\2\2"+
		"\2\u0139\u013a\t\2\2\2\u013a\65\3\2\2\2\u013b\u013c\t\3\2\2\u013c\67\3"+
		"\2\2\2\u013d\u0142\7\67\2\2\u013e\u013f\7\3\2\2\u013f\u0141\7\67\2\2\u0140"+
		"\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u01439\3\2\2\2\u0144\u0142\3\2\2\2\35<>DFZaw{\u0085\u0095\u00a4\u00b6"+
		"\u00cc\u00e0\u00e3\u00e5\u00ef\u00f6\u0100\u0106\u010a\u0119\u011d\u0123"+
		"\u012d\u0137\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}