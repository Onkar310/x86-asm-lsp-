// Generated from x86asm.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class x86asmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BYTE=1, WORD=2, DWORD=3, DSEG=4, CSEG=5, INCLUDE=6, TITLE=7, END=8, ORG=9, 
		ENDIF=10, IF=11, EQU=12, DW=13, DB=14, DD=15, PTR=16, OFFSET=17, RW=18, 
		RB=19, RS=20, LENGTH=21, EQ=22, NE=23, MOD=24, COMMENT=25, AH=26, AL=27, 
		BH=28, BL=29, CH=30, CL=31, DH=32, DL=33, AX=34, BX=35, CX=36, DX=37, 
		CI=38, DI=39, BP=40, SP=41, IP=42, CS=43, DS=44, ES=45, SS=46, AAA=47, 
		AAD=48, AAM=49, AAS=50, ADC=51, ADD=52, AND=53, CALL=54, CBW=55, CLC=56, 
		CLD=57, CLI=58, CMC=59, CMP=60, CMPSB=61, CMPSW=62, CWD=63, DAA=64, DAS=65, 
		DEC=66, DIV=67, ESC=68, HLT=69, IDIV=70, IMUL=71, IN=72, INC=73, INT=74, 
		INTO=75, IRET=76, JA=77, JAE=78, JB=79, JBE=80, JC=81, JE=82, JG=83, JGE=84, 
		JL=85, JLE=86, JNA=87, JNAE=88, JNB=89, JNBE=90, JNC=91, JNE=92, JNG=93, 
		JNGE=94, JNL=95, JNLE=96, JNO=97, JNP=98, JNS=99, JNZ=100, JO=101, JP=102, 
		JPE=103, JPO=104, JS=105, JZ=106, JCXZ=107, JMP=108, JMPS=109, JMPF=110, 
		LAHF=111, LDS=112, LEA=113, LES=114, LOCK=115, LODS=116, LODSB=117, LODSW=118, 
		LOOP=119, LOOPE=120, LOOPNE=121, LOOPNZ=122, LOOPZ=123, MOV=124, MOVS=125, 
		MOVSB=126, MOVSW=127, MUL=128, NEG=129, NOP=130, NOT=131, OR=132, OUT=133, 
		POP=134, POPF=135, PUSH=136, PUSHF=137, RCL=138, RCR=139, RET=140, RETN=141, 
		RETF=142, ROL=143, ROR=144, SAHF=145, SAL=146, SAR=147, SALC=148, SBB=149, 
		SCASB=150, SCASW=151, SHL=152, SHR=153, STC=154, STD=155, STI=156, STOSB=157, 
		STOSW=158, SUB=159, TEST=160, WAIT=161, XCHG=162, XLAT=163, XOR=164, REP=165, 
		REPE=166, REPNE=167, REPNZ=168, REPZ=169, STAR=170, SLASH=171, DOLLAR=172, 
		PLUS=173, MINUS=174, NOT_=175, COLON=176, DOT=177, RP=178, LP=179, COMMA=180, 
		SEMI=181, LB=182, RB_=183, NAME=184, NUMBER=185, STRING=186, EOL=187, 
		WS=188;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_instruction = 2, RULE_lbl = 3, RULE_assemblerdirective = 4, 
		RULE_rw = 5, RULE_rb = 6, RULE_rs = 7, RULE_cseg = 8, RULE_dseg = 9, RULE_dw = 10, 
		RULE_db = 11, RULE_dd = 12, RULE_equ = 13, RULE_if_ = 14, RULE_assemblerexpression = 15, 
		RULE_assemblerlogical = 16, RULE_assemblerterm = 17, RULE_endif_ = 18, 
		RULE_end = 19, RULE_org = 20, RULE_title = 21, RULE_include_ = 22, RULE_expressionlist = 23, 
		RULE_label = 24, RULE_expression = 25, RULE_multiplyingExpression = 26, 
		RULE_argument = 27, RULE_ptr = 28, RULE_dollar = 29, RULE_register_ = 30, 
		RULE_string_ = 31, RULE_name = 32, RULE_number = 33, RULE_opcode = 34, 
		RULE_rep = 35, RULE_sign = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "instruction", "lbl", "assemblerdirective", "rw", "rb", 
			"rs", "cseg", "dseg", "dw", "db", "dd", "equ", "if_", "assemblerexpression", 
			"assemblerlogical", "assemblerterm", "endif_", "end", "org", "title", 
			"include_", "expressionlist", "label", "expression", "multiplyingExpression", 
			"argument", "ptr", "dollar", "register_", "string_", "name", "number", 
			"opcode", "rep", "sign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'BYTE'", "'WORD'", "'DWORD'", "'DSEG'", "'CSEG'", "'INCLUDE'", 
			"'TITLE'", "'END'", "'ORG'", "'ENDIF'", "'IF'", "'EQU'", "'DW'", "'DB'", 
			"'DD'", "'PTR'", "'OFFSET'", "'RW'", "'RB'", "'RS'", "'LENGTH'", "'EQ'", 
			"'NE'", "'MOD'", null, "'AH'", "'AL'", "'BH'", "'BL'", "'CH'", "'CL'", 
			"'DH'", "'DL'", "'AX'", "'BX'", "'CX'", "'DX'", "'CI'", "'DI'", "'BP'", 
			"'SP'", "'IP'", "'CS'", "'DS'", "'ES'", "'SS'", "'AAA'", "'AAD'", "'AAM'", 
			"'AAS'", "'ADC'", "'ADD'", "'AND'", "'CALL'", "'CBW'", "'CLC'", "'CLD'", 
			"'CLI'", "'CMC'", "'CMP'", "'CMPSB'", "'CMPSW'", "'CWD'", "'DAA'", "'DAS'", 
			"'DEC'", "'DIV'", "'ESC'", "'HLT'", "'IDIV'", "'IMUL'", "'IN'", "'INC'", 
			"'INT'", "'INTO'", "'IRET'", "'JA'", "'JAE'", "'JB'", "'JBE'", "'JC'", 
			"'JE'", "'JG'", "'JGE'", "'JL'", "'JLE'", "'JNA'", "'JNAE'", "'JNB'", 
			"'JNBE'", "'JNC'", "'JNE'", "'JNG'", "'JNGE'", "'JNL'", "'JNLE'", "'JNO'", 
			"'JNP'", "'JNS'", "'JNZ'", "'JO'", "'JP'", "'JPE'", "'JPO'", "'JS'", 
			"'JZ'", "'JCXZ'", "'JMP'", "'JMPS'", "'JMPF'", "'LAHF'", "'LDS'", "'LEA'", 
			"'LES'", "'LOCK'", "'LODS'", "'LODSB'", "'LODSW'", "'LOOP'", "'LOOPE'", 
			"'LOOPNE'", "'LOOPNZ'", "'LOOPZ'", "'MOV'", "'MOVS'", "'MOVSB'", "'MOVSW'", 
			"'MUL'", "'NEG'", "'NOP'", "'NOT'", "'OR'", "'OUT'", "'POP'", "'POPF'", 
			"'PUSH'", "'PUSHF'", "'RCL'", "'RCR'", "'RET'", "'RETN'", "'RETF'", "'ROL'", 
			"'ROR'", "'SAHF'", "'SAL'", "'SAR'", "'SALC'", "'SBB'", "'SCASB'", "'SCASW'", 
			"'SHL'", "'SHR'", "'STC'", "'STD'", "'STI'", "'STOSB'", "'STOSW'", "'SUB'", 
			"'TEST'", "'WAIT'", "'XCHG'", "'XLAT'", "'XOR'", "'REP'", "'REPE'", "'REPNE'", 
			"'REPNZ'", "'REPZ'", "'*'", "'/'", "'$'", "'+'", "'-'", "'!'", "':'", 
			"'.'", "'('", "')'", "','", "';'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BYTE", "WORD", "DWORD", "DSEG", "CSEG", "INCLUDE", "TITLE", "END", 
			"ORG", "ENDIF", "IF", "EQU", "DW", "DB", "DD", "PTR", "OFFSET", "RW", 
			"RB", "RS", "LENGTH", "EQ", "NE", "MOD", "COMMENT", "AH", "AL", "BH", 
			"BL", "CH", "CL", "DH", "DL", "AX", "BX", "CX", "DX", "CI", "DI", "BP", 
			"SP", "IP", "CS", "DS", "ES", "SS", "AAA", "AAD", "AAM", "AAS", "ADC", 
			"ADD", "AND", "CALL", "CBW", "CLC", "CLD", "CLI", "CMC", "CMP", "CMPSB", 
			"CMPSW", "CWD", "DAA", "DAS", "DEC", "DIV", "ESC", "HLT", "IDIV", "IMUL", 
			"IN", "INC", "INT", "INTO", "IRET", "JA", "JAE", "JB", "JBE", "JC", "JE", 
			"JG", "JGE", "JL", "JLE", "JNA", "JNAE", "JNB", "JNBE", "JNC", "JNE", 
			"JNG", "JNGE", "JNL", "JNLE", "JNO", "JNP", "JNS", "JNZ", "JO", "JP", 
			"JPE", "JPO", "JS", "JZ", "JCXZ", "JMP", "JMPS", "JMPF", "LAHF", "LDS", 
			"LEA", "LES", "LOCK", "LODS", "LODSB", "LODSW", "LOOP", "LOOPE", "LOOPNE", 
			"LOOPNZ", "LOOPZ", "MOV", "MOVS", "MOVSB", "MOVSW", "MUL", "NEG", "NOP", 
			"NOT", "OR", "OUT", "POP", "POPF", "PUSH", "PUSHF", "RCL", "RCR", "RET", 
			"RETN", "RETF", "ROL", "ROR", "SAHF", "SAL", "SAR", "SALC", "SBB", "SCASB", 
			"SCASW", "SHL", "SHR", "STC", "STD", "STI", "STOSB", "STOSW", "SUB", 
			"TEST", "WAIT", "XCHG", "XLAT", "XOR", "REP", "REPE", "REPNE", "REPNZ", 
			"REPZ", "STAR", "SLASH", "DOLLAR", "PLUS", "MINUS", "NOT_", "COLON", 
			"DOT", "RP", "LP", "COMMA", "SEMI", "LB", "RB_", "NAME", "NUMBER", "STRING", 
			"EOL", "WS"
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
	public String getGrammarFileName() { return "x86asm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public x86asmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(x86asmParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -140737486458896L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 649226431829639167L) != 0)) {
				{
				{
				setState(74);
				line();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(x86asmParser.EOL, 0); }
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
		}
		public AssemblerdirectiveContext assemblerdirective() {
			return getRuleContext(AssemblerdirectiveContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> NOT_() { return getTokens(x86asmParser.NOT_); }
		public TerminalNode NOT_(int i) {
			return getToken(x86asmParser.NOT_, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(82);
				lbl();
				}
				break;
			}
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DSEG:
			case CSEG:
			case INCLUDE:
			case TITLE:
			case END:
			case ORG:
			case ENDIF:
			case IF:
			case DW:
			case DB:
			case DD:
			case RW:
			case RB:
			case RS:
			case DOT:
			case NAME:
				{
				setState(85);
				assemblerdirective();
				}
				break;
			case AAA:
			case AAD:
			case AAM:
			case AAS:
			case ADC:
			case ADD:
			case AND:
			case CALL:
			case CBW:
			case CLC:
			case CLD:
			case CLI:
			case CMC:
			case CMP:
			case CMPSB:
			case CMPSW:
			case CWD:
			case DAA:
			case DAS:
			case DEC:
			case DIV:
			case ESC:
			case HLT:
			case IDIV:
			case IMUL:
			case IN:
			case INC:
			case INT:
			case INTO:
			case IRET:
			case JA:
			case JAE:
			case JB:
			case JBE:
			case JC:
			case JE:
			case JG:
			case JGE:
			case JL:
			case JLE:
			case JNA:
			case JNAE:
			case JNB:
			case JNBE:
			case JNC:
			case JNE:
			case JNG:
			case JNGE:
			case JNL:
			case JNLE:
			case JNO:
			case JNP:
			case JNS:
			case JNZ:
			case JO:
			case JP:
			case JPE:
			case JPO:
			case JS:
			case JZ:
			case JCXZ:
			case JMP:
			case JMPS:
			case JMPF:
			case LAHF:
			case LDS:
			case LEA:
			case LES:
			case LOCK:
			case LODS:
			case LODSB:
			case LODSW:
			case LOOP:
			case LOOPE:
			case LOOPNE:
			case LOOPNZ:
			case LOOPZ:
			case MOV:
			case MOVS:
			case MOVSB:
			case MOVSW:
			case MUL:
			case NEG:
			case NOP:
			case NOT:
			case OR:
			case OUT:
			case POP:
			case POPF:
			case PUSH:
			case PUSHF:
			case RCL:
			case RCR:
			case RET:
			case RETN:
			case RETF:
			case ROL:
			case ROR:
			case SAHF:
			case SAL:
			case SAR:
			case SALC:
			case SBB:
			case SCASB:
			case SCASW:
			case SHL:
			case SHR:
			case STC:
			case STD:
			case STI:
			case STOSB:
			case STOSW:
			case SUB:
			case TEST:
			case WAIT:
			case XCHG:
			case XLAT:
			case XOR:
			case REP:
			case REPE:
			case REPNE:
			case REPNZ:
			case REPZ:
				{
				setState(86);
				instruction();
				}
				break;
			case NOT_:
			case EOL:
				break;
			default:
				break;
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT_) {
				{
				{
				setState(89);
				match(NOT_);
				setState(90);
				instruction();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(EOL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public OpcodeContext opcode() {
			return getRuleContext(OpcodeContext.class,0);
		}
		public RepContext rep() {
			return getRuleContext(RepContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & 31L) != 0)) {
				{
				setState(98);
				rep();
				}
			}

			setState(101);
			opcode();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140737423540238L) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 65458325248016385L) != 0)) {
				{
				setState(102);
				expressionlist();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LblContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(x86asmParser.COLON, 0); }
		public LblContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lbl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterLbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitLbl(this);
		}
	}

	public final LblContext lbl() throws RecognitionException {
		LblContext _localctx = new LblContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lbl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			label();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(106);
				match(COLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblerdirectiveContext extends ParserRuleContext {
		public OrgContext org() {
			return getRuleContext(OrgContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public Endif_Context endif_() {
			return getRuleContext(Endif_Context.class,0);
		}
		public EquContext equ() {
			return getRuleContext(EquContext.class,0);
		}
		public DbContext db() {
			return getRuleContext(DbContext.class,0);
		}
		public DwContext dw() {
			return getRuleContext(DwContext.class,0);
		}
		public CsegContext cseg() {
			return getRuleContext(CsegContext.class,0);
		}
		public DdContext dd() {
			return getRuleContext(DdContext.class,0);
		}
		public DsegContext dseg() {
			return getRuleContext(DsegContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public Include_Context include_() {
			return getRuleContext(Include_Context.class,0);
		}
		public RwContext rw() {
			return getRuleContext(RwContext.class,0);
		}
		public RbContext rb() {
			return getRuleContext(RbContext.class,0);
		}
		public RsContext rs() {
			return getRuleContext(RsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(x86asmParser.DOT, 0); }
		public AssemblerdirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblerdirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterAssemblerdirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitAssemblerdirective(this);
		}
	}

	public final AssemblerdirectiveContext assemblerdirective() throws RecognitionException {
		AssemblerdirectiveContext _localctx = new AssemblerdirectiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assemblerdirective);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				org();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				end();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				if_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				endif_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				equ();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				db();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(115);
				dw();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(116);
				cseg();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(117);
				dd();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(118);
				dseg();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(119);
				title();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(120);
				include_();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(121);
				rw();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(122);
				rb();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(123);
				rs();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(124);
				match(DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RwContext extends ParserRuleContext {
		public TerminalNode RW() { return getToken(x86asmParser.RW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public RwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterRw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitRw(this);
		}
	}

	public final RwContext rw() throws RecognitionException {
		RwContext _localctx = new RwContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(127);
				name();
				}
			}

			setState(130);
			match(RW);
			setState(131);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RbContext extends ParserRuleContext {
		public TerminalNode RB() { return getToken(x86asmParser.RB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public RbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterRb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitRb(this);
		}
	}

	public final RbContext rb() throws RecognitionException {
		RbContext _localctx = new RbContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(133);
				name();
				}
			}

			setState(136);
			match(RB);
			setState(137);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RsContext extends ParserRuleContext {
		public TerminalNode RS() { return getToken(x86asmParser.RS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public RsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterRs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitRs(this);
		}
	}

	public final RsContext rs() throws RecognitionException {
		RsContext _localctx = new RsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(139);
				name();
				}
			}

			setState(142);
			match(RS);
			setState(143);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CsegContext extends ParserRuleContext {
		public TerminalNode CSEG() { return getToken(x86asmParser.CSEG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CsegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cseg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterCseg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitCseg(this);
		}
	}

	public final CsegContext cseg() throws RecognitionException {
		CsegContext _localctx = new CsegContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cseg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(CSEG);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140737423540238L) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 65458325248016385L) != 0)) {
				{
				setState(146);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DsegContext extends ParserRuleContext {
		public TerminalNode DSEG() { return getToken(x86asmParser.DSEG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DsegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dseg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterDseg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitDseg(this);
		}
	}

	public final DsegContext dseg() throws RecognitionException {
		DsegContext _localctx = new DsegContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dseg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(DSEG);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140737423540238L) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 65458325248016385L) != 0)) {
				{
				setState(150);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DwContext extends ParserRuleContext {
		public TerminalNode DW() { return getToken(x86asmParser.DW, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public DwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterDw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitDw(this);
		}
	}

	public final DwContext dw() throws RecognitionException {
		DwContext _localctx = new DwContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(DW);
			setState(154);
			expressionlist();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DbContext extends ParserRuleContext {
		public TerminalNode DB() { return getToken(x86asmParser.DB, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public DbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterDb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitDb(this);
		}
	}

	public final DbContext db() throws RecognitionException {
		DbContext _localctx = new DbContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_db);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(DB);
			setState(157);
			expressionlist();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DdContext extends ParserRuleContext {
		public TerminalNode DD() { return getToken(x86asmParser.DD, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public DdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterDd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitDd(this);
		}
	}

	public final DdContext dd() throws RecognitionException {
		DdContext _localctx = new DdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(DD);
			setState(160);
			expressionlist();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EquContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQU() { return getToken(x86asmParser.EQU, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EquContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterEqu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitEqu(this);
		}
	}

	public final EquContext equ() throws RecognitionException {
		EquContext _localctx = new EquContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_equ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			name();
			setState(163);
			match(EQU);
			setState(164);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(x86asmParser.IF, 0); }
		public AssemblerexpressionContext assemblerexpression() {
			return getRuleContext(AssemblerexpressionContext.class,0);
		}
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterIf_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitIf_(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(IF);
			setState(167);
			assemblerexpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblerexpressionContext extends ParserRuleContext {
		public List<AssemblertermContext> assemblerterm() {
			return getRuleContexts(AssemblertermContext.class);
		}
		public AssemblertermContext assemblerterm(int i) {
			return getRuleContext(AssemblertermContext.class,i);
		}
		public List<AssemblerlogicalContext> assemblerlogical() {
			return getRuleContexts(AssemblerlogicalContext.class);
		}
		public AssemblerlogicalContext assemblerlogical(int i) {
			return getRuleContext(AssemblerlogicalContext.class,i);
		}
		public TerminalNode RP() { return getToken(x86asmParser.RP, 0); }
		public AssemblerexpressionContext assemblerexpression() {
			return getRuleContext(AssemblerexpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(x86asmParser.LP, 0); }
		public AssemblerexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblerexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterAssemblerexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitAssemblerexpression(this);
		}
	}

	public final AssemblerexpressionContext assemblerexpression() throws RecognitionException {
		AssemblerexpressionContext _localctx = new AssemblerexpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assemblerexpression);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case PLUS:
			case MINUS:
			case NAME:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				assemblerterm();
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EQ || _la==NE) {
					{
					{
					setState(170);
					assemblerlogical();
					setState(171);
					assemblerterm();
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RP:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(RP);
				setState(179);
				assemblerexpression();
				setState(180);
				match(LP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblerlogicalContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(x86asmParser.EQ, 0); }
		public TerminalNode NE() { return getToken(x86asmParser.NE, 0); }
		public AssemblerlogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblerlogical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterAssemblerlogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitAssemblerlogical(this);
		}
	}

	public final AssemblerlogicalContext assemblerlogical() throws RecognitionException {
		AssemblerlogicalContext _localctx = new AssemblerlogicalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assemblerlogical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !(_la==EQ || _la==NE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblertermContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode NOT() { return getToken(x86asmParser.NOT, 0); }
		public AssemblertermContext assemblerterm() {
			return getRuleContext(AssemblertermContext.class,0);
		}
		public AssemblertermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblerterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterAssemblerterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitAssemblerterm(this);
		}
	}

	public final AssemblertermContext assemblerterm() throws RecognitionException {
		AssemblertermContext _localctx = new AssemblertermContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assemblerterm);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				name();
				}
				break;
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				number();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(NOT);
				setState(189);
				assemblerterm();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Endif_Context extends ParserRuleContext {
		public TerminalNode ENDIF() { return getToken(x86asmParser.ENDIF, 0); }
		public Endif_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endif_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterEndif_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitEndif_(this);
		}
	}

	public final Endif_Context endif_() throws RecognitionException {
		Endif_Context _localctx = new Endif_Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_endif_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(ENDIF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EndContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(x86asmParser.END, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrgContext extends ParserRuleContext {
		public TerminalNode ORG() { return getToken(x86asmParser.ORG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_org; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterOrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitOrg(this);
		}
	}

	public final OrgContext org() throws RecognitionException {
		OrgContext _localctx = new OrgContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_org);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ORG);
			setState(197);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(x86asmParser.TITLE, 0); }
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitTitle(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(TITLE);
			setState(200);
			string_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Include_Context extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(x86asmParser.INCLUDE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Include_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterInclude_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitInclude_(this);
		}
	}

	public final Include_Context include_() throws RecognitionException {
		Include_Context _localctx = new Include_Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_include_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(INCLUDE);
			setState(203);
			name();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionlistContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(x86asmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(x86asmParser.COMMA, i);
		}
		public ExpressionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterExpressionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitExpressionlist(this);
		}
	}

	public final ExpressionlistContext expressionlist() throws RecognitionException {
		ExpressionlistContext _localctx = new ExpressionlistContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			expression();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(206);
				match(COMMA);
				setState(207);
				expression();
				}
				}
				setState(212);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LabelContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			name();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<MultiplyingExpressionContext> multiplyingExpression() {
			return getRuleContexts(MultiplyingExpressionContext.class);
		}
		public MultiplyingExpressionContext multiplyingExpression(int i) {
			return getRuleContext(MultiplyingExpressionContext.class,i);
		}
		public List<SignContext> sign() {
			return getRuleContexts(SignContext.class);
		}
		public SignContext sign(int i) {
			return getRuleContext(SignContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			multiplyingExpression();
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					sign();
					setState(217);
					multiplyingExpression();
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyingExpressionContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(x86asmParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(x86asmParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(x86asmParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(x86asmParser.SLASH, i);
		}
		public List<TerminalNode> MOD() { return getTokens(x86asmParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(x86asmParser.MOD, i);
		}
		public List<TerminalNode> AND() { return getTokens(x86asmParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(x86asmParser.AND, i);
		}
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterMultiplyingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitMultiplyingExpression(this);
		}
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_multiplyingExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			argument();
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					_la = _input.LA(1);
					if ( !(_la==MOD || _la==AND || _la==STAR || _la==SLASH) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(226);
					argument();
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DollarContext dollar() {
			return getRuleContext(DollarContext.class,0);
		}
		public Register_Context register_() {
			return getRuleContext(Register_Context.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public TerminalNode RP() { return getToken(x86asmParser.RP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(x86asmParser.LP, 0); }
		public TerminalNode LB() { return getToken(x86asmParser.LB, 0); }
		public TerminalNode RB_() { return getToken(x86asmParser.RB_, 0); }
		public PtrContext ptr() {
			return getRuleContext(PtrContext.class,0);
		}
		public TerminalNode NOT() { return getToken(x86asmParser.NOT, 0); }
		public TerminalNode OFFSET() { return getToken(x86asmParser.OFFSET, 0); }
		public TerminalNode LENGTH() { return getToken(x86asmParser.LENGTH, 0); }
		public TerminalNode COLON() { return getToken(x86asmParser.COLON, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_argument);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				dollar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				register_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				string_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
				match(RP);
				setState(238);
				expression();
				setState(239);
				match(LP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(243);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
				case MINUS:
				case NUMBER:
					{
					setState(241);
					number();
					}
					break;
				case NAME:
					{
					setState(242);
					name();
					}
					break;
				case LB:
					break;
				default:
					break;
				}
				setState(245);
				match(LB);
				setState(246);
				expression();
				setState(247);
				match(RB_);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(249);
				ptr();
				setState(250);
				expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(252);
				match(NOT);
				setState(253);
				expression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(254);
				match(OFFSET);
				setState(255);
				expression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(256);
				match(LENGTH);
				setState(257);
				expression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(258);
				register_();
				setState(259);
				match(COLON);
				setState(260);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PtrContext extends ParserRuleContext {
		public TerminalNode PTR() { return getToken(x86asmParser.PTR, 0); }
		public TerminalNode BYTE() { return getToken(x86asmParser.BYTE, 0); }
		public TerminalNode WORD() { return getToken(x86asmParser.WORD, 0); }
		public TerminalNode DWORD() { return getToken(x86asmParser.DWORD, 0); }
		public PtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterPtr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitPtr(this);
		}
	}

	public final PtrContext ptr() throws RecognitionException {
		PtrContext _localctx = new PtrContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ptr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
				{
				setState(264);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(267);
			match(PTR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DollarContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(x86asmParser.DOLLAR, 0); }
		public DollarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dollar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterDollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitDollar(this);
		}
	}

	public final DollarContext dollar() throws RecognitionException {
		DollarContext _localctx = new DollarContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_dollar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(DOLLAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Register_Context extends ParserRuleContext {
		public TerminalNode AH() { return getToken(x86asmParser.AH, 0); }
		public TerminalNode AL() { return getToken(x86asmParser.AL, 0); }
		public TerminalNode BH() { return getToken(x86asmParser.BH, 0); }
		public TerminalNode BL() { return getToken(x86asmParser.BL, 0); }
		public TerminalNode CH() { return getToken(x86asmParser.CH, 0); }
		public TerminalNode CL() { return getToken(x86asmParser.CL, 0); }
		public TerminalNode DH() { return getToken(x86asmParser.DH, 0); }
		public TerminalNode DL() { return getToken(x86asmParser.DL, 0); }
		public TerminalNode AX() { return getToken(x86asmParser.AX, 0); }
		public TerminalNode BX() { return getToken(x86asmParser.BX, 0); }
		public TerminalNode CX() { return getToken(x86asmParser.CX, 0); }
		public TerminalNode DX() { return getToken(x86asmParser.DX, 0); }
		public TerminalNode CI() { return getToken(x86asmParser.CI, 0); }
		public TerminalNode DI() { return getToken(x86asmParser.DI, 0); }
		public TerminalNode BP() { return getToken(x86asmParser.BP, 0); }
		public TerminalNode SP() { return getToken(x86asmParser.SP, 0); }
		public TerminalNode IP() { return getToken(x86asmParser.IP, 0); }
		public TerminalNode CS() { return getToken(x86asmParser.CS, 0); }
		public TerminalNode DS() { return getToken(x86asmParser.DS, 0); }
		public TerminalNode ES() { return getToken(x86asmParser.ES, 0); }
		public TerminalNode SS() { return getToken(x86asmParser.SS, 0); }
		public Register_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterRegister_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitRegister_(this);
		}
	}

	public final Register_Context register_() throws RecognitionException {
		Register_Context _localctx = new Register_Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_register_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 140737421246464L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class String_Context extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(x86asmParser.STRING, 0); }
		public String_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterString_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitString_(this);
		}
	}

	public final String_Context string_() throws RecognitionException {
		String_Context _localctx = new String_Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_string_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(x86asmParser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(NAME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(x86asmParser.NUMBER, 0); }
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(277);
				sign();
				}
			}

			setState(280);
			match(NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpcodeContext extends ParserRuleContext {
		public TerminalNode AAA() { return getToken(x86asmParser.AAA, 0); }
		public TerminalNode AAD() { return getToken(x86asmParser.AAD, 0); }
		public TerminalNode AAM() { return getToken(x86asmParser.AAM, 0); }
		public TerminalNode AAS() { return getToken(x86asmParser.AAS, 0); }
		public TerminalNode ADC() { return getToken(x86asmParser.ADC, 0); }
		public TerminalNode ADD() { return getToken(x86asmParser.ADD, 0); }
		public TerminalNode AND() { return getToken(x86asmParser.AND, 0); }
		public TerminalNode CALL() { return getToken(x86asmParser.CALL, 0); }
		public TerminalNode CBW() { return getToken(x86asmParser.CBW, 0); }
		public TerminalNode CLC() { return getToken(x86asmParser.CLC, 0); }
		public TerminalNode CLD() { return getToken(x86asmParser.CLD, 0); }
		public TerminalNode CLI() { return getToken(x86asmParser.CLI, 0); }
		public TerminalNode CMC() { return getToken(x86asmParser.CMC, 0); }
		public TerminalNode CMP() { return getToken(x86asmParser.CMP, 0); }
		public TerminalNode CMPSB() { return getToken(x86asmParser.CMPSB, 0); }
		public TerminalNode CMPSW() { return getToken(x86asmParser.CMPSW, 0); }
		public TerminalNode CWD() { return getToken(x86asmParser.CWD, 0); }
		public TerminalNode DAA() { return getToken(x86asmParser.DAA, 0); }
		public TerminalNode DAS() { return getToken(x86asmParser.DAS, 0); }
		public TerminalNode DEC() { return getToken(x86asmParser.DEC, 0); }
		public TerminalNode DIV() { return getToken(x86asmParser.DIV, 0); }
		public TerminalNode ESC() { return getToken(x86asmParser.ESC, 0); }
		public TerminalNode HLT() { return getToken(x86asmParser.HLT, 0); }
		public TerminalNode IDIV() { return getToken(x86asmParser.IDIV, 0); }
		public TerminalNode IMUL() { return getToken(x86asmParser.IMUL, 0); }
		public TerminalNode IN() { return getToken(x86asmParser.IN, 0); }
		public TerminalNode INC() { return getToken(x86asmParser.INC, 0); }
		public TerminalNode INT() { return getToken(x86asmParser.INT, 0); }
		public TerminalNode INTO() { return getToken(x86asmParser.INTO, 0); }
		public TerminalNode IRET() { return getToken(x86asmParser.IRET, 0); }
		public TerminalNode JA() { return getToken(x86asmParser.JA, 0); }
		public TerminalNode JAE() { return getToken(x86asmParser.JAE, 0); }
		public TerminalNode JB() { return getToken(x86asmParser.JB, 0); }
		public TerminalNode JBE() { return getToken(x86asmParser.JBE, 0); }
		public TerminalNode JC() { return getToken(x86asmParser.JC, 0); }
		public TerminalNode JE() { return getToken(x86asmParser.JE, 0); }
		public TerminalNode JG() { return getToken(x86asmParser.JG, 0); }
		public TerminalNode JGE() { return getToken(x86asmParser.JGE, 0); }
		public TerminalNode JL() { return getToken(x86asmParser.JL, 0); }
		public TerminalNode JLE() { return getToken(x86asmParser.JLE, 0); }
		public TerminalNode JNA() { return getToken(x86asmParser.JNA, 0); }
		public TerminalNode JNAE() { return getToken(x86asmParser.JNAE, 0); }
		public TerminalNode JNB() { return getToken(x86asmParser.JNB, 0); }
		public TerminalNode JNBE() { return getToken(x86asmParser.JNBE, 0); }
		public TerminalNode JNC() { return getToken(x86asmParser.JNC, 0); }
		public TerminalNode JNE() { return getToken(x86asmParser.JNE, 0); }
		public TerminalNode JNG() { return getToken(x86asmParser.JNG, 0); }
		public TerminalNode JNGE() { return getToken(x86asmParser.JNGE, 0); }
		public TerminalNode JNL() { return getToken(x86asmParser.JNL, 0); }
		public TerminalNode JNLE() { return getToken(x86asmParser.JNLE, 0); }
		public TerminalNode JNO() { return getToken(x86asmParser.JNO, 0); }
		public TerminalNode JNP() { return getToken(x86asmParser.JNP, 0); }
		public TerminalNode JNS() { return getToken(x86asmParser.JNS, 0); }
		public TerminalNode JNZ() { return getToken(x86asmParser.JNZ, 0); }
		public TerminalNode JO() { return getToken(x86asmParser.JO, 0); }
		public TerminalNode JP() { return getToken(x86asmParser.JP, 0); }
		public TerminalNode JPE() { return getToken(x86asmParser.JPE, 0); }
		public TerminalNode JPO() { return getToken(x86asmParser.JPO, 0); }
		public TerminalNode JS() { return getToken(x86asmParser.JS, 0); }
		public TerminalNode JZ() { return getToken(x86asmParser.JZ, 0); }
		public TerminalNode JCXZ() { return getToken(x86asmParser.JCXZ, 0); }
		public TerminalNode JMP() { return getToken(x86asmParser.JMP, 0); }
		public TerminalNode JMPS() { return getToken(x86asmParser.JMPS, 0); }
		public TerminalNode JMPF() { return getToken(x86asmParser.JMPF, 0); }
		public TerminalNode LAHF() { return getToken(x86asmParser.LAHF, 0); }
		public TerminalNode LDS() { return getToken(x86asmParser.LDS, 0); }
		public TerminalNode LEA() { return getToken(x86asmParser.LEA, 0); }
		public TerminalNode LES() { return getToken(x86asmParser.LES, 0); }
		public TerminalNode LOCK() { return getToken(x86asmParser.LOCK, 0); }
		public TerminalNode LODS() { return getToken(x86asmParser.LODS, 0); }
		public TerminalNode LODSB() { return getToken(x86asmParser.LODSB, 0); }
		public TerminalNode LODSW() { return getToken(x86asmParser.LODSW, 0); }
		public TerminalNode LOOP() { return getToken(x86asmParser.LOOP, 0); }
		public TerminalNode LOOPE() { return getToken(x86asmParser.LOOPE, 0); }
		public TerminalNode LOOPNE() { return getToken(x86asmParser.LOOPNE, 0); }
		public TerminalNode LOOPNZ() { return getToken(x86asmParser.LOOPNZ, 0); }
		public TerminalNode LOOPZ() { return getToken(x86asmParser.LOOPZ, 0); }
		public TerminalNode MOV() { return getToken(x86asmParser.MOV, 0); }
		public TerminalNode MOVS() { return getToken(x86asmParser.MOVS, 0); }
		public TerminalNode MOVSB() { return getToken(x86asmParser.MOVSB, 0); }
		public TerminalNode MOVSW() { return getToken(x86asmParser.MOVSW, 0); }
		public TerminalNode MUL() { return getToken(x86asmParser.MUL, 0); }
		public TerminalNode NEG() { return getToken(x86asmParser.NEG, 0); }
		public TerminalNode NOP() { return getToken(x86asmParser.NOP, 0); }
		public TerminalNode NOT() { return getToken(x86asmParser.NOT, 0); }
		public TerminalNode OR() { return getToken(x86asmParser.OR, 0); }
		public TerminalNode OUT() { return getToken(x86asmParser.OUT, 0); }
		public TerminalNode POP() { return getToken(x86asmParser.POP, 0); }
		public TerminalNode POPF() { return getToken(x86asmParser.POPF, 0); }
		public TerminalNode PUSH() { return getToken(x86asmParser.PUSH, 0); }
		public TerminalNode PUSHF() { return getToken(x86asmParser.PUSHF, 0); }
		public TerminalNode RCL() { return getToken(x86asmParser.RCL, 0); }
		public TerminalNode RCR() { return getToken(x86asmParser.RCR, 0); }
		public TerminalNode RET() { return getToken(x86asmParser.RET, 0); }
		public TerminalNode RETN() { return getToken(x86asmParser.RETN, 0); }
		public TerminalNode RETF() { return getToken(x86asmParser.RETF, 0); }
		public TerminalNode ROL() { return getToken(x86asmParser.ROL, 0); }
		public TerminalNode ROR() { return getToken(x86asmParser.ROR, 0); }
		public TerminalNode SAHF() { return getToken(x86asmParser.SAHF, 0); }
		public TerminalNode SAL() { return getToken(x86asmParser.SAL, 0); }
		public TerminalNode SAR() { return getToken(x86asmParser.SAR, 0); }
		public TerminalNode SALC() { return getToken(x86asmParser.SALC, 0); }
		public TerminalNode SBB() { return getToken(x86asmParser.SBB, 0); }
		public TerminalNode SCASB() { return getToken(x86asmParser.SCASB, 0); }
		public TerminalNode SCASW() { return getToken(x86asmParser.SCASW, 0); }
		public TerminalNode SHL() { return getToken(x86asmParser.SHL, 0); }
		public TerminalNode SHR() { return getToken(x86asmParser.SHR, 0); }
		public TerminalNode STC() { return getToken(x86asmParser.STC, 0); }
		public TerminalNode STD() { return getToken(x86asmParser.STD, 0); }
		public TerminalNode STI() { return getToken(x86asmParser.STI, 0); }
		public TerminalNode STOSB() { return getToken(x86asmParser.STOSB, 0); }
		public TerminalNode STOSW() { return getToken(x86asmParser.STOSW, 0); }
		public TerminalNode SUB() { return getToken(x86asmParser.SUB, 0); }
		public TerminalNode TEST() { return getToken(x86asmParser.TEST, 0); }
		public TerminalNode WAIT() { return getToken(x86asmParser.WAIT, 0); }
		public TerminalNode XCHG() { return getToken(x86asmParser.XCHG, 0); }
		public TerminalNode XLAT() { return getToken(x86asmParser.XLAT, 0); }
		public TerminalNode XOR() { return getToken(x86asmParser.XOR, 0); }
		public OpcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterOpcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitOpcode(this);
		}
	}

	public final OpcodeContext opcode() throws RecognitionException {
		OpcodeContext _localctx = new OpcodeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_opcode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & -1L) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & 18014398509481983L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepContext extends ParserRuleContext {
		public TerminalNode REP() { return getToken(x86asmParser.REP, 0); }
		public TerminalNode REPE() { return getToken(x86asmParser.REPE, 0); }
		public TerminalNode REPNE() { return getToken(x86asmParser.REPNE, 0); }
		public TerminalNode REPNZ() { return getToken(x86asmParser.REPNZ, 0); }
		public TerminalNode REPZ() { return getToken(x86asmParser.REPZ, 0); }
		public RepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterRep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitRep(this);
		}
	}

	public final RepContext rep() throws RecognitionException {
		RepContext _localctx = new RepContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_rep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !(((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & 31L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(x86asmParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(x86asmParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof x86asmListener ) ((x86asmListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u00bc\u0121\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0001\u0000\u0005\u0000L\b\u0000\n\u0000"+
		"\f\u0000O\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001T\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001X\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\\\b\u0001\n\u0001\f\u0001_\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0003\u0002d\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"h\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003l\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004~\b\u0004\u0001\u0005\u0003"+
		"\u0005\u0081\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003"+
		"\u0006\u0087\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0003"+
		"\u0007\u008d\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0003\b\u0094\b\b\u0001\t\u0001\t\u0003\t\u0098\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00ae\b\u000f\n\u000f"+
		"\f\u000f\u00b1\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00b7\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00bf\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u00d1\b\u0017\n\u0017\f\u0017\u00d4"+
		"\t\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u00dc\b\u0019\n\u0019\f\u0019\u00df\t\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u00e4\b\u001a\n\u001a\f\u001a\u00e7"+
		"\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u00f4\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u0107\b\u001b\u0001\u001c\u0003\u001c\u010a\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0003!\u0117\b!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0000\u0000%\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFH\u0000\u0007\u0001\u0000\u0016\u0017\u0003"+
		"\u0000\u0018\u001855\u00aa\u00ab\u0001\u0000\u0001\u0003\u0001\u0000\u001a"+
		".\u0001\u0000/\u00a4\u0001\u0000\u00a5\u00a9\u0001\u0000\u00ad\u00ae\u012d"+
		"\u0000M\u0001\u0000\u0000\u0000\u0002S\u0001\u0000\u0000\u0000\u0004c"+
		"\u0001\u0000\u0000\u0000\u0006i\u0001\u0000\u0000\u0000\b}\u0001\u0000"+
		"\u0000\u0000\n\u0080\u0001\u0000\u0000\u0000\f\u0086\u0001\u0000\u0000"+
		"\u0000\u000e\u008c\u0001\u0000\u0000\u0000\u0010\u0091\u0001\u0000\u0000"+
		"\u0000\u0012\u0095\u0001\u0000\u0000\u0000\u0014\u0099\u0001\u0000\u0000"+
		"\u0000\u0016\u009c\u0001\u0000\u0000\u0000\u0018\u009f\u0001\u0000\u0000"+
		"\u0000\u001a\u00a2\u0001\u0000\u0000\u0000\u001c\u00a6\u0001\u0000\u0000"+
		"\u0000\u001e\u00b6\u0001\u0000\u0000\u0000 \u00b8\u0001\u0000\u0000\u0000"+
		"\"\u00be\u0001\u0000\u0000\u0000$\u00c0\u0001\u0000\u0000\u0000&\u00c2"+
		"\u0001\u0000\u0000\u0000(\u00c4\u0001\u0000\u0000\u0000*\u00c7\u0001\u0000"+
		"\u0000\u0000,\u00ca\u0001\u0000\u0000\u0000.\u00cd\u0001\u0000\u0000\u0000"+
		"0\u00d5\u0001\u0000\u0000\u00002\u00d7\u0001\u0000\u0000\u00004\u00e0"+
		"\u0001\u0000\u0000\u00006\u0106\u0001\u0000\u0000\u00008\u0109\u0001\u0000"+
		"\u0000\u0000:\u010d\u0001\u0000\u0000\u0000<\u010f\u0001\u0000\u0000\u0000"+
		">\u0111\u0001\u0000\u0000\u0000@\u0113\u0001\u0000\u0000\u0000B\u0116"+
		"\u0001\u0000\u0000\u0000D\u011a\u0001\u0000\u0000\u0000F\u011c\u0001\u0000"+
		"\u0000\u0000H\u011e\u0001\u0000\u0000\u0000JL\u0003\u0002\u0001\u0000"+
		"KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000PQ\u0005\u0000\u0000\u0001Q\u0001\u0001\u0000\u0000\u0000"+
		"RT\u0003\u0006\u0003\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TW\u0001\u0000\u0000\u0000UX\u0003\b\u0004\u0000VX\u0003\u0004\u0002"+
		"\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000X]\u0001\u0000\u0000\u0000YZ\u0005\u00af\u0000\u0000Z\\\u0003"+
		"\u0004\u0002\u0000[Y\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000`a\u0005\u00bb\u0000\u0000a\u0003\u0001"+
		"\u0000\u0000\u0000bd\u0003F#\u0000cb\u0001\u0000\u0000\u0000cd\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0003D\"\u0000fh\u0003.\u0017"+
		"\u0000gf\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0005\u0001"+
		"\u0000\u0000\u0000ik\u00030\u0018\u0000jl\u0005\u00b0\u0000\u0000kj\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\u0007\u0001\u0000\u0000"+
		"\u0000m~\u0003(\u0014\u0000n~\u0003&\u0013\u0000o~\u0003\u001c\u000e\u0000"+
		"p~\u0003$\u0012\u0000q~\u0003\u001a\r\u0000r~\u0003\u0016\u000b\u0000"+
		"s~\u0003\u0014\n\u0000t~\u0003\u0010\b\u0000u~\u0003\u0018\f\u0000v~\u0003"+
		"\u0012\t\u0000w~\u0003*\u0015\u0000x~\u0003,\u0016\u0000y~\u0003\n\u0005"+
		"\u0000z~\u0003\f\u0006\u0000{~\u0003\u000e\u0007\u0000|~\u0005\u00b1\u0000"+
		"\u0000}m\u0001\u0000\u0000\u0000}n\u0001\u0000\u0000\u0000}o\u0001\u0000"+
		"\u0000\u0000}p\u0001\u0000\u0000\u0000}q\u0001\u0000\u0000\u0000}r\u0001"+
		"\u0000\u0000\u0000}s\u0001\u0000\u0000\u0000}t\u0001\u0000\u0000\u0000"+
		"}u\u0001\u0000\u0000\u0000}v\u0001\u0000\u0000\u0000}w\u0001\u0000\u0000"+
		"\u0000}x\u0001\u0000\u0000\u0000}y\u0001\u0000\u0000\u0000}z\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\t\u0001"+
		"\u0000\u0000\u0000\u007f\u0081\u0003@ \u0000\u0080\u007f\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005\u0012\u0000\u0000\u0083\u0084\u00032\u0019\u0000"+
		"\u0084\u000b\u0001\u0000\u0000\u0000\u0085\u0087\u0003@ \u0000\u0086\u0085"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0013\u0000\u0000\u0089\u008a"+
		"\u00032\u0019\u0000\u008a\r\u0001\u0000\u0000\u0000\u008b\u008d\u0003"+
		"@ \u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0014\u0000"+
		"\u0000\u008f\u0090\u00032\u0019\u0000\u0090\u000f\u0001\u0000\u0000\u0000"+
		"\u0091\u0093\u0005\u0005\u0000\u0000\u0092\u0094\u00032\u0019\u0000\u0093"+
		"\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"\u0011\u0001\u0000\u0000\u0000\u0095\u0097\u0005\u0004\u0000\u0000\u0096"+
		"\u0098\u00032\u0019\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0001\u0000\u0000\u0000\u0098\u0013\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0005\r\u0000\u0000\u009a\u009b\u0003.\u0017\u0000\u009b\u0015\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0005\u000e\u0000\u0000\u009d\u009e\u0003"+
		".\u0017\u0000\u009e\u0017\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u000f"+
		"\u0000\u0000\u00a0\u00a1\u0003.\u0017\u0000\u00a1\u0019\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0003@ \u0000\u00a3\u00a4\u0005\f\u0000\u0000\u00a4"+
		"\u00a5\u00032\u0019\u0000\u00a5\u001b\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005\u000b\u0000\u0000\u00a7\u00a8\u0003\u001e\u000f\u0000\u00a8\u001d"+
		"\u0001\u0000\u0000\u0000\u00a9\u00af\u0003\"\u0011\u0000\u00aa\u00ab\u0003"+
		" \u0010\u0000\u00ab\u00ac\u0003\"\u0011\u0000\u00ac\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ad\u00aa\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b7\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0005\u00b2\u0000\u0000\u00b3\u00b4\u0003\u001e"+
		"\u000f\u0000\u00b4\u00b5\u0005\u00b3\u0000\u0000\u00b5\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b6\u00a9\u0001\u0000\u0000\u0000\u00b6\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b7\u001f\u0001\u0000\u0000\u0000\u00b8\u00b9\u0007\u0000"+
		"\u0000\u0000\u00b9!\u0001\u0000\u0000\u0000\u00ba\u00bf\u0003@ \u0000"+
		"\u00bb\u00bf\u0003B!\u0000\u00bc\u00bd\u0005\u0083\u0000\u0000\u00bd\u00bf"+
		"\u0003\"\u0011\u0000\u00be\u00ba\u0001\u0000\u0000\u0000\u00be\u00bb\u0001"+
		"\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf#\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0005\n\u0000\u0000\u00c1%\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005\b\u0000\u0000\u00c3\'\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0005\t\u0000\u0000\u00c5\u00c6\u00032\u0019\u0000\u00c6"+
		")\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0007\u0000\u0000\u00c8\u00c9"+
		"\u0003>\u001f\u0000\u00c9+\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0006"+
		"\u0000\u0000\u00cb\u00cc\u0003@ \u0000\u00cc-\u0001\u0000\u0000\u0000"+
		"\u00cd\u00d2\u00032\u0019\u0000\u00ce\u00cf\u0005\u00b4\u0000\u0000\u00cf"+
		"\u00d1\u00032\u0019\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3/\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0003@ \u0000\u00d61\u0001\u0000\u0000"+
		"\u0000\u00d7\u00dd\u00034\u001a\u0000\u00d8\u00d9\u0003H$\u0000\u00d9"+
		"\u00da\u00034\u001a\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d8"+
		"\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de3\u0001"+
		"\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e5\u0003"+
		"6\u001b\u0000\u00e1\u00e2\u0007\u0001\u0000\u0000\u00e2\u00e4\u00036\u001b"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e65\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e8\u0107\u0003B!\u0000\u00e9\u0107\u0003:\u001d\u0000\u00ea\u0107"+
		"\u0003<\u001e\u0000\u00eb\u0107\u0003@ \u0000\u00ec\u0107\u0003>\u001f"+
		"\u0000\u00ed\u00ee\u0005\u00b2\u0000\u0000\u00ee\u00ef\u00032\u0019\u0000"+
		"\u00ef\u00f0\u0005\u00b3\u0000\u0000\u00f0\u0107\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f4\u0003B!\u0000\u00f2\u00f4\u0003@ \u0000\u00f3\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"\u00b6\u0000\u0000\u00f6\u00f7\u00032\u0019\u0000\u00f7\u00f8\u0005\u00b7"+
		"\u0000\u0000\u00f8\u0107\u0001\u0000\u0000\u0000\u00f9\u00fa\u00038\u001c"+
		"\u0000\u00fa\u00fb\u00032\u0019\u0000\u00fb\u0107\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0005\u0083\u0000\u0000\u00fd\u0107\u00032\u0019\u0000\u00fe"+
		"\u00ff\u0005\u0011\u0000\u0000\u00ff\u0107\u00032\u0019\u0000\u0100\u0101"+
		"\u0005\u0015\u0000\u0000\u0101\u0107\u00032\u0019\u0000\u0102\u0103\u0003"+
		"<\u001e\u0000\u0103\u0104\u0005\u00b0\u0000\u0000\u0104\u0105\u00032\u0019"+
		"\u0000\u0105\u0107\u0001\u0000\u0000\u0000\u0106\u00e8\u0001\u0000\u0000"+
		"\u0000\u0106\u00e9\u0001\u0000\u0000\u0000\u0106\u00ea\u0001\u0000\u0000"+
		"\u0000\u0106\u00eb\u0001\u0000\u0000\u0000\u0106\u00ec\u0001\u0000\u0000"+
		"\u0000\u0106\u00ed\u0001\u0000\u0000\u0000\u0106\u00f3\u0001\u0000\u0000"+
		"\u0000\u0106\u00f9\u0001\u0000\u0000\u0000\u0106\u00fc\u0001\u0000\u0000"+
		"\u0000\u0106\u00fe\u0001\u0000\u0000\u0000\u0106\u0100\u0001\u0000\u0000"+
		"\u0000\u0106\u0102\u0001\u0000\u0000\u0000\u01077\u0001\u0000\u0000\u0000"+
		"\u0108\u010a\u0007\u0002\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0005\u0010\u0000\u0000\u010c9\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0005\u00ac\u0000\u0000\u010e;\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0007\u0003\u0000\u0000\u0110=\u0001\u0000\u0000\u0000\u0111\u0112\u0005"+
		"\u00ba\u0000\u0000\u0112?\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u00b8"+
		"\u0000\u0000\u0114A\u0001\u0000\u0000\u0000\u0115\u0117\u0003H$\u0000"+
		"\u0116\u0115\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000"+
		"\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0005\u00b9\u0000\u0000"+
		"\u0119C\u0001\u0000\u0000\u0000\u011a\u011b\u0007\u0004\u0000\u0000\u011b"+
		"E\u0001\u0000\u0000\u0000\u011c\u011d\u0007\u0005\u0000\u0000\u011dG\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0007\u0006\u0000\u0000\u011fI\u0001\u0000"+
		"\u0000\u0000\u0017MSW]cgk}\u0080\u0086\u008c\u0093\u0097\u00af\u00b6\u00be"+
		"\u00d2\u00dd\u00e5\u00f3\u0106\u0109\u0116";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}