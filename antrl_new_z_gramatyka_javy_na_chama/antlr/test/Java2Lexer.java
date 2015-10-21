// Generated from Java2.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		ClassOrInterfaceModifier=17, Identifier=18, Letter=19, Digit=20, Sign=21, 
		WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'"
	};
	public static final String[] ruleNames = {
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "ClassOrInterfaceModifier", 
		"Identifier", "Letter", "Digit", "Sign", "WS"
	};


	public Java2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Java2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00b3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u009d\n\22\3\23\3\23\3\23\7\23\u00a2\n\23\f\23\16\23\u00a5\13\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\6\27\u00ae\n\27\r\27\16\27\u00af\3\27\3"+
		"\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\6\4\2C\\c|\3\2\62;\b"+
		"\2$$*+..>@]]__\5\2\13\f\16\17\"\"\u00ba\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5:\3\2\2\2\7=\3\2\2\2\tC\3\2"+
		"\2\2\13E\3\2\2\2\rG\3\2\2\2\17I\3\2\2\2\21K\3\2\2\2\23M\3\2\2\2\25U\3"+
		"\2\2\2\27\\\3\2\2\2\31^\3\2\2\2\33f\3\2\2\2\35h\3\2\2\2\37j\3\2\2\2!q"+
		"\3\2\2\2#\u009c\3\2\2\2%\u009e\3\2\2\2\'\u00a6\3\2\2\2)\u00a8\3\2\2\2"+
		"+\u00aa\3\2\2\2-\u00ad\3\2\2\2/\60\7k\2\2\60\61\7o\2\2\61\62\7r\2\2\62"+
		"\63\7n\2\2\63\64\7g\2\2\64\65\7o\2\2\65\66\7g\2\2\66\67\7p\2\2\678\7v"+
		"\2\289\7u\2\29\4\3\2\2\2:;\7\60\2\2;<\7,\2\2<\6\3\2\2\2=>\7e\2\2>?\7n"+
		"\2\2?@\7c\2\2@A\7u\2\2AB\7u\2\2B\b\3\2\2\2CD\7]\2\2D\n\3\2\2\2EF\7}\2"+
		"\2F\f\3\2\2\2GH\7=\2\2H\16\3\2\2\2IJ\7_\2\2J\20\3\2\2\2KL\7\177\2\2L\22"+
		"\3\2\2\2MN\7g\2\2NO\7z\2\2OP\7v\2\2PQ\7g\2\2QR\7p\2\2RS\7f\2\2ST\7u\2"+
		"\2T\24\3\2\2\2UV\7u\2\2VW\7v\2\2WX\7c\2\2XY\7v\2\2YZ\7k\2\2Z[\7e\2\2["+
		"\26\3\2\2\2\\]\7*\2\2]\30\3\2\2\2^_\7r\2\2_`\7c\2\2`a\7e\2\2ab\7m\2\2"+
		"bc\7c\2\2cd\7i\2\2de\7g\2\2e\32\3\2\2\2fg\7+\2\2g\34\3\2\2\2hi\7.\2\2"+
		"i\36\3\2\2\2jk\7k\2\2kl\7o\2\2lm\7r\2\2mn\7q\2\2no\7t\2\2op\7v\2\2p \3"+
		"\2\2\2qr\7\60\2\2r\"\3\2\2\2st\7r\2\2tu\7w\2\2uv\7d\2\2vw\7n\2\2wx\7k"+
		"\2\2x\u009d\7e\2\2yz\7r\2\2z{\7t\2\2{|\7q\2\2|}\7v\2\2}~\7g\2\2~\177\7"+
		"e\2\2\177\u0080\7v\2\2\u0080\u0081\7g\2\2\u0081\u009d\7f\2\2\u0082\u0083"+
		"\7r\2\2\u0083\u0084\7t\2\2\u0084\u0085\7k\2\2\u0085\u0086\7x\2\2\u0086"+
		"\u0087\7c\2\2\u0087\u0088\7v\2\2\u0088\u009d\7g\2\2\u0089\u008a\7c\2\2"+
		"\u008a\u008b\7d\2\2\u008b\u008c\7u\2\2\u008c\u008d\7v\2\2\u008d\u008e"+
		"\7t\2\2\u008e\u008f\7c\2\2\u008f\u0090\7e\2\2\u0090\u009d\7v\2\2\u0091"+
		"\u0092\7u\2\2\u0092\u0093\7v\2\2\u0093\u0094\7c\2\2\u0094\u0095\7v\2\2"+
		"\u0095\u0096\7k\2\2\u0096\u009d\7e\2\2\u0097\u0098\7h\2\2\u0098\u0099"+
		"\7k\2\2\u0099\u009a\7p\2\2\u009a\u009b\7c\2\2\u009b\u009d\7n\2\2\u009c"+
		"s\3\2\2\2\u009cy\3\2\2\2\u009c\u0082\3\2\2\2\u009c\u0089\3\2\2\2\u009c"+
		"\u0091\3\2\2\2\u009c\u0097\3\2\2\2\u009d$\3\2\2\2\u009e\u00a3\5\'\24\2"+
		"\u009f\u00a2\5\'\24\2\u00a0\u00a2\5)\25\2\u00a1\u009f\3\2\2\2\u00a1\u00a0"+
		"\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"&\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\t\2\2\2\u00a7(\3\2\2\2\u00a8"+
		"\u00a9\t\3\2\2\u00a9*\3\2\2\2\u00aa\u00ab\t\4\2\2\u00ab,\3\2\2\2\u00ac"+
		"\u00ae\t\5\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\27\2\2\u00b2"+
		".\3\2\2\2\7\2\u009c\u00a1\u00a3\u00af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}