/* The following code was generated by JFlex 1.3.5 on 27/11/15 17:51 */

package cup.example;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.3.5
 * on 27/11/15 17:51 from the specification file
 * <tt>file:/C:/Users/jpms2/Desktop/CompiladorMiniJava/compilator/comp/Compiladores_Syntax/CompiladoresMJSyntax/lexer.jflex</tt>
 */
public class Lexer implements sym, java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  final public static int YYEOF = -1;

  /** initial size of the lookahead buffer */
  final private static int YY_BUFFERSIZE = 16384;

  /** lexical states */
  final public static int CODESEG = 1;
  final public static int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  final private static String yycmap_packed = 
    "\11\0\1\11\1\1\2\0\1\2\22\0\1\11\1\44\4\0\1\41"+
    "\1\0\1\50\1\53\1\4\1\43\1\47\1\10\1\7\1\3\12\6"+
    "\1\0\1\46\1\42\1\45\3\0\4\5\1\5\15\5\1\31\7\5"+
    "\1\51\1\0\1\54\1\0\1\5\1\0\1\14\1\20\1\12\1\26"+
    "\1\22\1\36\1\33\1\35\1\21\2\5\1\13\1\40\1\25\1\30"+
    "\1\16\1\5\1\32\1\15\1\24\1\17\1\27\1\34\1\23\1\37"+
    "\1\5\1\52\1\0\1\55\uff82\0";

  /** 
   * Translates characters to character classes
   */
  final private static char [] yycmap = yy_unpack_cmap(yycmap_packed);

  /** 
   * Translates a state to a row index in the transition table
   */
  final private static int yy_rowMap [] = { 
        0,    46,    92,    92,   138,    92,   184,   230,    92,    92, 
      276,   322,   368,   414,   460,   506,   552,   598,   644,   690, 
      736,   782,   828,   874,   920,   966,    92,    92,    92,    92, 
       92,    92,    92,    92,    92,    92,    92,    92,  1012,  1058, 
     1104,  1150,  1196,  1242,  1288,  1334,   184,  1380,  1426,  1472, 
     1518,  1564,  1610,  1656,  1702,  1748,  1794,  1840,  1886,    92, 
     1932,  1978,  2024,  2070,  2116,  2162,  2208,   184,  2254,  2300, 
     2346,  2392,   184,  2438,  2484,  2530,  2576,  2622,  2668,  2714, 
     2760,  2806,  2852,  2898,  2944,   184,  2990,   184,   184,   184, 
     3036,  3082,  3128,  3174,  3220,   184,   184,  3266,  3312,  3358, 
     3404,  3450,  3496,  3542,  3588,   184,   184,   184,   184,   184, 
     3634,  3680,   184,  3726,   184,   184,   184,  3772,  3818,  3864, 
     3910,  3956,  4002,  4048,  4094,  4140,  4186,  4232,    92
  };

  /** 
   * The packed transition table of the DFA (part 0)
   */
  final private static String yy_packed0 = 
    "\1\3\2\4\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\4\1\13\1\14\1\7\1\15\1\16\1\7\1\17"+
    "\1\20\1\21\1\7\1\22\1\23\1\7\1\24\1\7"+
    "\1\25\1\26\1\7\1\27\1\7\1\30\1\7\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\3\1\0\54\3"+
    "\61\0\1\47\1\50\56\0\2\7\3\0\27\7\23\0"+
    "\1\10\54\0\2\7\3\0\1\7\1\51\25\7\22\0"+
    "\2\7\3\0\10\7\1\52\16\7\22\0\2\7\3\0"+
    "\12\7\1\53\14\7\22\0\2\7\3\0\5\7\1\54"+
    "\21\7\22\0\2\7\3\0\16\7\1\55\10\7\22\0"+
    "\2\7\3\0\13\7\1\56\10\7\1\57\2\7\22\0"+
    "\2\7\3\0\1\7\1\60\7\7\1\61\15\7\22\0"+
    "\2\7\3\0\20\7\1\62\2\7\1\63\3\7\22\0"+
    "\2\7\3\0\10\7\1\64\16\7\22\0\2\7\3\0"+
    "\16\7\1\65\10\7\22\0\2\7\3\0\12\7\1\66"+
    "\12\7\1\67\1\7\22\0\2\7\3\0\10\7\1\70"+
    "\16\7\22\0\2\7\3\0\23\7\1\71\3\7\22\0"+
    "\2\7\3\0\2\7\1\72\24\7\22\0\2\7\3\0"+
    "\2\7\1\73\24\7\56\0\1\74\14\0\1\47\1\4"+
    "\1\75\53\47\3\50\1\76\52\50\5\0\2\7\3\0"+
    "\2\7\1\77\24\7\22\0\2\7\3\0\13\7\1\100"+
    "\13\7\22\0\2\7\3\0\2\7\1\101\24\7\22\0"+
    "\2\7\3\0\6\7\1\102\20\7\22\0\2\7\3\0"+
    "\16\7\1\103\10\7\22\0\2\7\3\0\12\7\1\104"+
    "\14\7\22\0\2\7\3\0\3\7\1\105\23\7\22\0"+
    "\2\7\3\0\12\7\1\106\14\7\22\0\2\7\3\0"+
    "\5\7\1\107\21\7\22\0\2\7\3\0\7\7\1\110"+
    "\17\7\22\0\2\7\3\0\22\7\1\111\4\7\22\0"+
    "\2\7\3\0\7\7\1\112\17\7\22\0\2\7\3\0"+
    "\20\7\1\113\6\7\22\0\2\7\3\0\3\7\1\114"+
    "\23\7\22\0\2\7\3\0\12\7\1\115\14\7\22\0"+
    "\2\7\3\0\7\7\1\116\17\7\22\0\2\7\3\0"+
    "\1\7\1\117\25\7\22\0\2\7\3\0\7\7\1\120"+
    "\17\7\16\0\1\4\54\0\3\50\1\76\1\4\51\50"+
    "\5\0\2\7\3\0\3\7\1\121\23\7\22\0\2\7"+
    "\3\0\21\7\1\122\5\7\22\0\2\7\3\0\12\7"+
    "\1\123\14\7\22\0\2\7\3\0\1\7\1\124\25\7"+
    "\22\0\2\7\3\0\1\7\1\125\25\7\22\0\2\7"+
    "\3\0\10\7\1\126\16\7\22\0\2\7\3\0\10\7"+
    "\1\127\16\7\22\0\2\7\3\0\10\7\1\130\16\7"+
    "\22\0\2\7\3\0\3\7\1\131\23\7\22\0\2\7"+
    "\3\0\14\7\1\132\12\7\22\0\2\7\3\0\7\7"+
    "\1\133\17\7\22\0\2\7\3\0\12\7\1\134\14\7"+
    "\22\0\2\7\3\0\5\7\1\135\21\7\22\0\2\7"+
    "\3\0\1\7\1\136\25\7\22\0\2\7\3\0\3\7"+
    "\1\137\23\7\22\0\2\7\3\0\13\7\1\140\13\7"+
    "\22\0\2\7\3\0\3\7\1\141\23\7\22\0\2\7"+
    "\3\0\12\7\1\142\14\7\22\0\2\7\3\0\7\7"+
    "\1\143\17\7\22\0\2\7\3\0\7\7\1\144\17\7"+
    "\22\0\2\7\3\0\10\7\1\145\16\7\22\0\2\7"+
    "\3\0\13\7\1\146\13\7\22\0\2\7\3\0\13\7"+
    "\1\147\13\7\22\0\2\7\3\0\10\7\1\150\16\7"+
    "\22\0\2\7\3\0\20\7\1\151\6\7\22\0\2\7"+
    "\3\0\10\7\1\152\16\7\22\0\2\7\3\0\10\7"+
    "\1\153\16\7\22\0\2\7\3\0\23\7\1\154\3\7"+
    "\22\0\2\7\3\0\1\155\26\7\22\0\2\7\3\0"+
    "\1\156\26\7\22\0\2\7\3\0\2\7\1\157\24\7"+
    "\22\0\2\7\3\0\14\7\1\160\12\7\22\0\2\7"+
    "\3\0\21\7\1\161\5\7\22\0\2\7\3\0\26\7"+
    "\1\162\22\0\2\7\3\0\13\7\1\163\13\7\22\0"+
    "\2\7\3\0\13\7\1\164\13\7\22\0\2\7\3\0"+
    "\3\7\1\165\23\7\22\0\2\7\1\166\2\0\27\7"+
    "\45\0\1\167\44\0\1\170\62\0\1\171\40\0\1\172"+
    "\64\0\1\173\71\0\1\174\44\0\1\175\61\0\1\176"+
    "\54\0\1\177\44\0\1\200\67\0\1\201\30\0";

  /** 
   * The transition table of the DFA
   */
  final private static int yytrans [] = yy_unpack();


  /* error codes */
  final private static int YY_UNKNOWN_ERROR = 0;
  final private static int YY_ILLEGAL_STATE = 1;
  final private static int YY_NO_MATCH = 2;
  final private static int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  final private static String YY_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Internal error: unknown state",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private final static byte YY_ATTRIBUTE[] = {
     0,  0,  9,  9,  1,  9,  1,  1,  9,  9,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  9,  9,  9,  9,  9,  9, 
     9,  9,  9,  9,  9,  9,  1,  0,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  9,  1,  0,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  9
  };

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char yy_buffer[] = new char[YY_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int yy_endRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn; 

  /** 
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL = true;

  /** yy_atEOF == true <=> the scanner is at the EOF */
  private boolean yy_atEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean yy_eof_done;

  /* user code: */
	

    public Lexer(ComplexSymbolFactory sf, java.io.InputStream is){
		this(is);
        symbolFactory = sf;
    }
	public Lexer(ComplexSymbolFactory sf, java.io.Reader reader){
		this(reader);
        symbolFactory = sf;
    }
    
    private StringBuffer sb;
    private ComplexSymbolFactory symbolFactory;
    private int csline,cscolumn;

    public Symbol symbol(String name, int code){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1,yycolumn+1, yychar), // -yylength()
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength())
				);
    }
    public Symbol symbol(String name, int code, String lexem){
	return symbolFactory.newSymbol(name, code, 
						new Location(yyline+1, yycolumn +1, yychar), 
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength()), lexem);
    }
    
    protected void emit_warning(String message){
    	System.out.println("scanner warning: " + message + " at : 2 "+ 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
    
    protected void emit_error(String message){
    	System.out.println("scanner error: " + message + " at : 2" + 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the split, compressed DFA transition table.
   *
   * @return the unpacked transition table
   */
  private static int [] yy_unpack() {
    int [] trans = new int[4278];
    int offset = 0;
    offset = yy_unpack(yy_packed0, offset, trans);
    return trans;
  }

  /** 
   * Unpacks the compressed DFA transition table.
   *
   * @param packed   the packed transition table
   * @return         the index of the last entry
   */
  private static int yy_unpack(String packed, int offset, int [] trans) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do trans[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] yy_unpack_cmap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 130) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   IOException  if any I/O-Error occurs
   */
  private boolean yy_refill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, 
                       yy_buffer, 0, 
                       yy_endRead-yy_startRead);

      /* translate stored positions */
      yy_endRead-= yy_startRead;
      yy_currentPos-= yy_startRead;
      yy_markedPos-= yy_startRead;
      yy_pushbackPos-= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos*2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, 
                                            yy_buffer.length-yy_endRead);

    if (numRead < 0) {
      return true;
    }
    else {
      yy_endRead+= numRead;  
      return false;
    }
  }


  /**
   * Closes the input stream.
   */
  final public void yyclose() throws java.io.IOException {
    yy_atEOF = true;            /* indicate end of file */
    yy_endRead = yy_startRead;  /* invalidate buffer    */

    if (yy_reader != null)
      yy_reader.close();
  }


  /**
   * Closes the current stream, and resets the
   * scanner to read from a new input stream.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>YY_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  final public void yyreset(java.io.Reader reader) throws java.io.IOException {
    yyclose();
    yy_reader = reader;
    yy_atBOL  = true;
    yy_atEOF  = false;
    yy_endRead = yy_startRead = 0;
    yy_currentPos = yy_markedPos = yy_pushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    yy_lexical_state = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  final public int yystate() {
    return yy_lexical_state;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  final public void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  final public String yytext() {
    return new String( yy_buffer, yy_startRead, yy_markedPos-yy_startRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  final public char yycharat(int pos) {
    return yy_buffer[yy_startRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  final public int yylength() {
    return yy_markedPos-yy_startRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void yy_ScanError(int errorCode) {
    String message;
    try {
      message = YY_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = YY_ERROR_MSG[YY_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  private void yypushback(int number)  {
    if ( number > yylength() )
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void yy_do_eof() throws java.io.IOException {
    if (!yy_eof_done) {
      yy_eof_done = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;

    // cached fields:
    int yy_currentPos_l;
    int yy_startRead_l;
    int yy_markedPos_l;
    int yy_endRead_l = yy_endRead;
    char [] yy_buffer_l = yy_buffer;
    char [] yycmap_l = yycmap;

    int [] yytrans_l = yytrans;
    int [] yy_rowMap_l = yy_rowMap;
    byte [] yy_attr_l = YY_ATTRIBUTE;

    while (true) {
      yy_markedPos_l = yy_markedPos;

      yychar+= yy_markedPos_l-yy_startRead;

      boolean yy_r = false;
      for (yy_currentPos_l = yy_startRead; yy_currentPos_l < yy_markedPos_l;
                                                             yy_currentPos_l++) {
        switch (yy_buffer_l[yy_currentPos_l]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          yy_r = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          yy_r = true;
          break;
        case '\n':
          if (yy_r)
            yy_r = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          yy_r = false;
          yycolumn++;
        }
      }

      if (yy_r) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean yy_peek;
        if (yy_markedPos_l < yy_endRead_l)
          yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        else if (yy_atEOF)
          yy_peek = false;
        else {
          boolean eof = yy_refill();
          yy_markedPos_l = yy_markedPos;
          yy_buffer_l = yy_buffer;
          if (eof) 
            yy_peek = false;
          else 
            yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        }
        if (yy_peek) yyline--;
      }
      yy_action = -1;

      yy_startRead_l = yy_currentPos_l = yy_currentPos = 
                       yy_startRead = yy_markedPos_l;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          if (yy_currentPos_l < yy_endRead_l)
            yy_input = yy_buffer_l[yy_currentPos_l++];
          else if (yy_atEOF) {
            yy_input = YYEOF;
            break yy_forAction;
          }
          else {
            // store back cached positions
            yy_currentPos  = yy_currentPos_l;
            yy_markedPos   = yy_markedPos_l;
            boolean eof = yy_refill();
            // get translated positions and possibly new buffer
            yy_currentPos_l  = yy_currentPos;
            yy_markedPos_l   = yy_markedPos;
            yy_buffer_l      = yy_buffer;
            yy_endRead_l     = yy_endRead;
            if (eof) {
              yy_input = YYEOF;
              break yy_forAction;
            }
            else {
              yy_input = yy_buffer_l[yy_currentPos_l++];
            }
          }
          int yy_next = yytrans_l[ yy_rowMap_l[yy_state] + yycmap_l[yy_input] ];
          if (yy_next == -1) break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = yy_attr_l[yy_state];
          if ( (yy_attributes & 1) == 1 ) {
            yy_action = yy_state; 
            yy_markedPos_l = yy_currentPos_l; 
            if ( (yy_attributes & 8) == 8 ) break yy_forAction;
          }

        }
      }

      // store back cached position
      yy_markedPos = yy_markedPos_l;

      switch (yy_action) {

        case 28: 
          {  return symbolFactory.newSymbol ("!", NOT); }
        case 130: break;
        case 8: 
          {  return symbolFactory.newSymbol (".", DOT); }
        case 131: break;
        case 26: 
          {  return symbolFactory.newSymbol ("<", LT); }
        case 132: break;
        case 46: 
          {  return symbolFactory.newSymbol ("if", IF); }
        case 133: break;
        case 7: 
          {  return symbolFactory.newSymbol ("INT LITERAL" , NUMBER_LIT, Integer.parseInt(yytext()));  }
        case 134: break;
        case 2: 
        case 4: 
        case 25: 
          {  System.out.println("Illegal char, '" + yytext() +
                        "' line: " + yyline + ", column: " + yycolumn);  }
        case 135: break;
        case 115: 
          {  return symbolFactory.newSymbol ("boolean", BOOLEAN); }
        case 136: break;
        case 35: 
          {  return symbolFactory.newSymbol (")", PARENTHRIGHT); }
        case 137: break;
        case 33: 
          {  return symbolFactory.newSymbol ("[", BRACKETSLEFT); }
        case 138: break;
        case 36: 
          {  return symbolFactory.newSymbol ("]", BRACKETSRIGHT); }
        case 139: break;
        case 108: 
          {  return symbolFactory.newSymbol ("static", STATIC);  }
        case 140: break;
        case 109: 
          {  return symbolFactory.newSymbol ("public", PUBLIC);  }
        case 141: break;
        case 128: 
          {  return symbolFactory.newSymbol ("SysOut", SYSO); }
        case 142: break;
        case 30: 
          {  return symbolFactory.newSymbol (";", SEMICOLON); }
        case 143: break;
        case 105: 
          {  return symbolFactory.newSymbol ("while", WHILE); }
        case 144: break;
        case 106: 
          {  return symbolFactory.newSymbol ("false", FALSE); }
        case 145: break;
        case 31: 
          {  return symbolFactory.newSymbol (",", COMMA); }
        case 146: break;
        case 27: 
          {  return symbolFactory.newSymbol ("+", PLUS); }
        case 147: break;
        case 5: 
          {  return symbolFactory.newSymbol ("*", MULT); }
        case 148: break;
        case 9: 
          {  return symbolFactory.newSymbol ("-", MINUS); }
        case 149: break;
        case 59: 
          {  return symbolFactory.newSymbol ("&&", AND); }
        case 150: break;
        case 67: 
          {  return symbolFactory.newSymbol ("int", INT); }
        case 151: break;
        case 72: 
          {  return symbolFactory.newSymbol ("new", NEW); }
        case 152: break;
        case 116: 
          {  return symbolFactory.newSymbol ("extends", EXTENDS);  }
        case 153: break;
        case 29: 
          {  return symbolFactory.newSymbol ("=", ASSIGN); }
        case 154: break;
        case 85: 
          {  return symbolFactory.newSymbol ("else", ELSE); }
        case 155: break;
        case 87: 
          {  return symbolFactory.newSymbol ("true", TRUE); }
        case 156: break;
        case 88: 
          {  return symbolFactory.newSymbol ("this", THIS); }
        case 157: break;
        case 89: 
          {  return symbolFactory.newSymbol ("void", VOID); }
        case 158: break;
        case 95: 
          {  return symbolFactory.newSymbol ("main", MAIN); }
        case 159: break;
        case 34: 
          {  return symbolFactory.newSymbol ("{", CURLBRACKETSLEFT); }
        case 160: break;
        case 37: 
          {  return symbolFactory.newSymbol ("}", CURLBRACKETSRIGHT); }
        case 161: break;
        case 114: 
          {  return symbolFactory.newSymbol ("return", RETURN); }
        case 162: break;
        case 112: 
          {  return symbolFactory.newSymbol ("string", STRING); }
        case 163: break;
        case 32: 
          {  return symbolFactory.newSymbol ("(", PARENTHLEFT); }
        case 164: break;
        case 96: 
          {  return symbolFactory.newSymbol ("class", CLASS);  }
        case 165: break;
        case 107: 
          {  return symbolFactory.newSymbol ("length", LENGTH); }
        case 166: break;
        case 6: 
        case 10: 
        case 11: 
        case 12: 
        case 13: 
        case 14: 
        case 15: 
        case 16: 
        case 17: 
        case 18: 
        case 19: 
        case 20: 
        case 21: 
        case 22: 
        case 23: 
        case 24: 
        case 40: 
        case 41: 
        case 42: 
        case 43: 
        case 44: 
        case 45: 
        case 47: 
        case 48: 
        case 49: 
        case 50: 
        case 51: 
        case 52: 
        case 53: 
        case 54: 
        case 55: 
        case 56: 
        case 57: 
        case 58: 
        case 62: 
        case 63: 
        case 64: 
        case 65: 
        case 66: 
        case 68: 
        case 69: 
        case 70: 
        case 71: 
        case 73: 
        case 74: 
        case 75: 
        case 76: 
        case 77: 
        case 78: 
        case 79: 
        case 80: 
        case 81: 
        case 82: 
        case 83: 
        case 84: 
        case 86: 
        case 90: 
        case 91: 
        case 92: 
        case 93: 
        case 94: 
        case 97: 
        case 98: 
        case 99: 
        case 100: 
        case 101: 
        case 102: 
        case 103: 
        case 104: 
        case 110: 
        case 111: 
        case 113: 
          {  return symbolFactory.newSymbol ("IDENTIFIER " + yytext(), IDENTIFIER, yytext());  }
        case 167: break;
        case 3: 
          {  }
        case 168: break;
        case 38: 
        case 60: 
          {  }
        case 169: break;
        default: 
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
            yy_do_eof();
              {     return symbolFactory.newSymbol("EOF",sym.EOF);
 }
          } 
          else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }


}
