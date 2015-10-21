// Generated from Java2.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		ClassOrInterfaceModifier=17, Identifier=18, Letter=19, Digit=20, Sign=21, 
		WS=22;
	public static final String[] tokenNames = {
		"<INVALID>", "'implements'", "'.*'", "'class'", "'['", "'{'", "';'", "']'", 
		"'}'", "'extends'", "'static'", "'('", "'package'", "')'", "','", "'import'", 
		"'.'", "ClassOrInterfaceModifier", "Identifier", "Letter", "Digit", "Sign", 
		"WS"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_classTotal = 4, RULE_classDeclaration = 5, 
		RULE_classBody = 6, RULE_field = 7, RULE_method = 8, RULE_qualifiedName = 9, 
		RULE_anychar = 10;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"classTotal", "classDeclaration", "classBody", "field", "method", "qualifiedName", 
		"anychar"
	};

	@Override
	public String getGrammarFileName() { return "Java2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Java2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(Java2Parser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(22); packageDeclaration();
				}
			}

			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(25); importDeclaration();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31); typeDeclaration();
			setState(32); match(EOF);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(T__4);
			setState(35); qualifiedName();
			setState(36); match(T__10);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(T__1);
			setState(40);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(39); match(T__6);
				}
			}

			setState(42); qualifiedName();
			setState(44);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(43); match(T__14);
				}
			}

			setState(46); match(T__10);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TerminalNode ClassOrInterfaceModifier(int i) {
			return getToken(Java2Parser.ClassOrInterfaceModifier, i);
		}
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public List<TerminalNode> ClassOrInterfaceModifier() { return getTokens(Java2Parser.ClassOrInterfaceModifier); }
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ClassOrInterfaceModifier) {
				{
				{
				setState(48); match(ClassOrInterfaceModifier);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54); match(T__13);
			setState(55); qualifiedName();
			setState(58);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(56); match(T__7);
				setState(57); qualifiedName();
				}
			}

			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(60); match(T__15);
				setState(61); qualifiedName();
				}
				}
				setState(66);
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

	public static class ClassTotalContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassTotalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTotal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).enterClassTotal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).exitClassTotal(this);
		}
	}

	public final ClassTotalContext classTotal() throws RecognitionException {
		ClassTotalContext _localctx = new ClassTotalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classTotal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); classDeclaration();
			setState(68); classBody();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(T__13);
			setState(71); qualifiedName();
			setState(74);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(72); match(T__7);
				setState(73); qualifiedName();
				}
			}

			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(76); match(T__15);
				setState(77); qualifiedName();
				}
				}
				setState(82);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java2Parser.Identifier, i);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(T__11);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ClassOrInterfaceModifier || _la==Identifier) {
				{
				setState(87);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(84); field();
					}
					break;
				case 2:
					{
					setState(85); method();
					}
					break;
				case 3:
					{
					setState(86); match(Identifier);
					}
					break;
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92); match(T__8);
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

	public static class FieldContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java2Parser.Identifier, i);
		}
		public TerminalNode ClassOrInterfaceModifier(int i) {
			return getToken(Java2Parser.ClassOrInterfaceModifier, i);
		}
		public AnycharContext anychar() {
			return getRuleContext(AnycharContext.class,0);
		}
		public List<TerminalNode> ClassOrInterfaceModifier() { return getTokens(Java2Parser.ClassOrInterfaceModifier); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ClassOrInterfaceModifier) {
				{
				{
				setState(94); match(ClassOrInterfaceModifier);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100); match(Identifier);
			setState(101); match(Identifier);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(102); match(T__12);
				setState(103); match(T__9);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109); anychar();
			setState(110); match(T__10);
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

	public static class MethodContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java2Parser.Identifier, i);
		}
		public TerminalNode ClassOrInterfaceModifier(int i) {
			return getToken(Java2Parser.ClassOrInterfaceModifier, i);
		}
		public AnycharContext anychar(int i) {
			return getRuleContext(AnycharContext.class,i);
		}
		public List<TerminalNode> ClassOrInterfaceModifier() { return getTokens(Java2Parser.ClassOrInterfaceModifier); }
		public List<AnycharContext> anychar() {
			return getRuleContexts(AnycharContext.class);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ClassOrInterfaceModifier) {
				{
				{
				setState(112); match(ClassOrInterfaceModifier);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118); match(Identifier);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(119); match(T__12);
				setState(120); match(T__9);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126); match(Identifier);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(127); match(T__12);
				setState(128); match(T__9);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134); match(T__5);
			setState(135); match(Identifier);
			setState(136); match(Identifier);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(137); match(T__12);
				setState(138); match(T__9);
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(144); match(Identifier);
				setState(145); match(Identifier);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(146); match(T__12);
					setState(147); match(T__9);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153); match(T__2);
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159); match(T__3);
			setState(160); match(T__11);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << Letter) | (1L << Digit) | (1L << Sign))) != 0)) {
				{
				setState(163);
				switch (_input.LA(1)) {
				case Letter:
				case Digit:
				case Sign:
					{
					setState(161); anychar();
					}
					break;
				case T__10:
					{
					setState(162); match(T__10);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168); match(T__8);
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java2Parser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(Identifier);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(171); match(T__0);
				setState(172); match(Identifier);
				}
				}
				setState(177);
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

	public static class AnycharContext extends ParserRuleContext {
		public TerminalNode Letter() { return getToken(Java2Parser.Letter, 0); }
		public TerminalNode Digit() { return getToken(Java2Parser.Digit, 0); }
		public TerminalNode Sign() { return getToken(Java2Parser.Sign, 0); }
		public AnycharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anychar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).enterAnychar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java2Listener ) ((Java2Listener)listener).exitAnychar(this);
		}
	}

	public final AnycharContext anychar() throws RecognitionException {
		AnycharContext _localctx = new AnycharContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_anychar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Letter) | (1L << Digit) | (1L << Sign))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u00b7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\5\2\32\n\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\5\4+\n\4\3\4\3\4\5\4/\n\4\3\4\3\4\3\5\7\5\64"+
		"\n\5\f\5\16\5\67\13\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\5\3\5\7\5A\n\5\f\5\16"+
		"\5D\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7M\n\7\3\7\3\7\7\7Q\n\7\f\7\16"+
		"\7T\13\7\3\b\3\b\3\b\3\b\7\bZ\n\b\f\b\16\b]\13\b\3\b\3\b\3\t\7\tb\n\t"+
		"\f\t\16\te\13\t\3\t\3\t\3\t\3\t\7\tk\n\t\f\t\16\tn\13\t\3\t\3\t\3\t\3"+
		"\n\7\nt\n\n\f\n\16\nw\13\n\3\n\3\n\3\n\7\n|\n\n\f\n\16\n\177\13\n\3\n"+
		"\3\n\3\n\7\n\u0084\n\n\f\n\16\n\u0087\13\n\3\n\3\n\3\n\3\n\3\n\7\n\u008e"+
		"\n\n\f\n\16\n\u0091\13\n\3\n\3\n\3\n\3\n\7\n\u0097\n\n\f\n\16\n\u009a"+
		"\13\n\3\n\7\n\u009d\n\n\f\n\16\n\u00a0\13\n\3\n\3\n\3\n\3\n\7\n\u00a6"+
		"\n\n\f\n\16\n\u00a9\13\n\3\n\3\n\3\13\3\13\3\13\7\13\u00b0\n\13\f\13\16"+
		"\13\u00b3\13\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3\2\25"+
		"\27\u00c2\2\31\3\2\2\2\4$\3\2\2\2\6(\3\2\2\2\b\65\3\2\2\2\nE\3\2\2\2\f"+
		"H\3\2\2\2\16U\3\2\2\2\20c\3\2\2\2\22u\3\2\2\2\24\u00ac\3\2\2\2\26\u00b4"+
		"\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\31\32\3\2\2\2\32\36\3\2\2\2\33\35"+
		"\5\6\4\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2"+
		"\2\2 \36\3\2\2\2!\"\5\b\5\2\"#\7\2\2\3#\3\3\2\2\2$%\7\16\2\2%&\5\24\13"+
		"\2&\'\7\b\2\2\'\5\3\2\2\2(*\7\21\2\2)+\7\f\2\2*)\3\2\2\2*+\3\2\2\2+,\3"+
		"\2\2\2,.\5\24\13\2-/\7\4\2\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7\b"+
		"\2\2\61\7\3\2\2\2\62\64\7\23\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2"+
		"\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\5\2\29<\5\24\13\2:;\7"+
		"\13\2\2;=\5\24\13\2<:\3\2\2\2<=\3\2\2\2=B\3\2\2\2>?\7\3\2\2?A\5\24\13"+
		"\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\t\3\2\2\2DB\3\2\2\2EF\5\f"+
		"\7\2FG\5\16\b\2G\13\3\2\2\2HI\7\5\2\2IL\5\24\13\2JK\7\13\2\2KM\5\24\13"+
		"\2LJ\3\2\2\2LM\3\2\2\2MR\3\2\2\2NO\7\3\2\2OQ\5\24\13\2PN\3\2\2\2QT\3\2"+
		"\2\2RP\3\2\2\2RS\3\2\2\2S\r\3\2\2\2TR\3\2\2\2U[\7\7\2\2VZ\5\20\t\2WZ\5"+
		"\22\n\2XZ\7\24\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2["+
		"\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\n\2\2_\17\3\2\2\2`b\7\23\2\2a`\3\2"+
		"\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\24\2\2gl\7"+
		"\24\2\2hi\7\6\2\2ik\7\t\2\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo"+
		"\3\2\2\2nl\3\2\2\2op\5\26\f\2pq\7\b\2\2q\21\3\2\2\2rt\7\23\2\2sr\3\2\2"+
		"\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2x}\7\24\2\2yz\7\6"+
		"\2\2z|\7\t\2\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2"+
		"\2\177}\3\2\2\2\u0080\u0085\7\24\2\2\u0081\u0082\7\6\2\2\u0082\u0084\7"+
		"\t\2\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\r"+
		"\2\2\u0089\u008a\7\24\2\2\u008a\u008f\7\24\2\2\u008b\u008c\7\6\2\2\u008c"+
		"\u008e\7\t\2\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u009e\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0093\7\24\2\2\u0093\u0098\7\24\2\2\u0094\u0095\7\6\2\2\u0095\u0097\7"+
		"\t\2\2\u0096\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\7\20"+
		"\2\2\u009c\u0092\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\17"+
		"\2\2\u00a2\u00a7\7\7\2\2\u00a3\u00a6\5\26\f\2\u00a4\u00a6\7\b\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ab\7\n\2\2\u00ab\23\3\2\2\2\u00ac\u00b1\7\24\2\2\u00ad\u00ae\7\22"+
		"\2\2\u00ae\u00b0\7\24\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\25\3\2\2\2\u00b3\u00b1\3\2\2"+
		"\2\u00b4\u00b5\t\2\2\2\u00b5\27\3\2\2\2\30\31\36*.\65<BLRY[clu}\u0085"+
		"\u008f\u0098\u009e\u00a5\u00a7\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}