/* The following code was generated by JFlex 1.4.3 on 25/01/15 20:14 */


package jflex_plft5;

import java_cup.runtime.*;
import java.io.IOException;

import jflex_plft5.CodSym;
import static jflex_plft5.CodSym.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 25/01/15 20:14 from the specification file
 * <tt>F:/UFS2014.2/workspace/ufs-lft-compilador/Cod.lex</tt>
 */
final class CodLex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 2;
  public static final int YYINITIAL = 0;
  public static final int COMENTARIOS = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  0,  0,  0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\2\4\2\0\1\4\22\0\1\4\7\0\1\10\1\11\1\53"+
    "\1\55\1\47\1\5\1\6\1\54\12\2\1\46\1\3\1\43\1\44"+
    "\1\45\2\0\1\16\1\20\1\31\1\27\1\7\1\36\1\15\1\24"+
    "\1\21\1\37\1\32\1\25\1\17\1\22\1\14\1\12\1\1\1\13"+
    "\1\26\1\23\1\35\1\34\1\30\1\40\1\33\1\1\1\41\1\0"+
    "\1\42\1\0\1\1\1\0\1\16\1\20\1\31\1\27\1\7\1\36"+
    "\1\15\1\24\1\21\1\37\1\32\1\25\1\17\1\22\1\14\1\12"+
    "\1\1\1\13\1\26\1\23\1\35\1\34\1\30\1\40\1\33\1\1"+
    "\1\50\1\52\1\51\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\1"+
    "\1\7\1\10\23\1\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\2\0\1\2\2\1\1\0\1\4\3\1\1\26\1\1"+
    "\1\27\10\1\1\30\1\31\3\1\1\32\7\1\1\33"+
    "\20\1\1\34\1\35\1\36\1\37\2\40\1\0\1\41"+
    "\1\1\1\0\10\1\1\42\1\43\1\44\5\1\1\45"+
    "\1\46\4\1\1\47\1\1\1\50\1\51\3\1\1\52"+
    "\6\1\1\53\3\1\1\54\5\1\1\55\1\56\4\1"+
    "\1\57\1\60\2\1\1\61\6\1\1\62\1\63\1\64"+
    "\6\1\1\65\2\1\1\66\1\67\1\70\1\1\1\71"+
    "\2\1\1\72\11\1\1\73\1\74\5\1\1\75\4\1"+
    "\1\76\1\77\1\100\1\101\1\1\1\102\1\103\3\1"+
    "\1\104\1\105\1\60\1\106\1\107\4\1\1\110\1\111"+
    "\1\1\1\112\1\113\2\1\1\114\1\1\1\115\1\1"+
    "\1\116\2\1\1\117\1\1\1\76\7\1\1\120\1\121"+
    "\1\1\1\122\3\1\1\123\2\1\1\124\2\1\1\125";

  private static int [] zzUnpackAction() {
    int [] result = new int[264];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\212\0\270\0\346\0\212\0\u0114"+
    "\0\u0142\0\212\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228\0\u0256"+
    "\0\u0284\0\u02b2\0\u02e0\0\u030e\0\u033c\0\u036a\0\u0398\0\u03c6"+
    "\0\u03f4\0\u0422\0\u0450\0\u047e\0\u04ac\0\212\0\212\0\u04da"+
    "\0\u0508\0\212\0\u0536\0\212\0\212\0\212\0\212\0\212"+
    "\0\212\0\346\0\u0564\0\u0592\0\346\0\u05c0\0\u05ee\0\u0142"+
    "\0\u061c\0\u064a\0\u0678\0\u06a6\0\56\0\u06d4\0\56\0\u0702"+
    "\0\u0730\0\u075e\0\u078c\0\u07ba\0\u07e8\0\u0816\0\u0844\0\u0872"+
    "\0\56\0\u08a0\0\u08ce\0\u08fc\0\56\0\u092a\0\u0958\0\u0986"+
    "\0\u09b4\0\u09e2\0\u0a10\0\u0a3e\0\u0a6c\0\u0a9a\0\u0ac8\0\u0af6"+
    "\0\u0b24\0\u0b52\0\u0b80\0\u0bae\0\u0bdc\0\u0c0a\0\u0c38\0\u0c66"+
    "\0\u0c94\0\u0cc2\0\u0cf0\0\u0d1e\0\u0d4c\0\212\0\212\0\212"+
    "\0\212\0\u0d7a\0\u0da8\0\u0da8\0\56\0\u0dd6\0\u061c\0\u0e04"+
    "\0\u0e32\0\u0e60\0\u0e8e\0\u0ebc\0\u0eea\0\u0f18\0\u0f46\0\56"+
    "\0\56\0\56\0\u0f74\0\u0fa2\0\u0fd0\0\u0ffe\0\u102c\0\56"+
    "\0\56\0\u105a\0\u1088\0\u10b6\0\u10e4\0\56\0\u1112\0\56"+
    "\0\56\0\u1140\0\u116e\0\u119c\0\56\0\u11ca\0\u11f8\0\u1226"+
    "\0\u1254\0\u1282\0\u12b0\0\56\0\u12de\0\u130c\0\u133a\0\56"+
    "\0\u1368\0\u1396\0\u13c4\0\u13f2\0\u1420\0\56\0\56\0\u144e"+
    "\0\u147c\0\u14aa\0\u14d8\0\56\0\u1506\0\u1534\0\u1562\0\56"+
    "\0\u1590\0\u15be\0\u15ec\0\u161a\0\u1648\0\u1676\0\56\0\56"+
    "\0\56\0\u16a4\0\u16d2\0\u1700\0\u172e\0\u175c\0\u178a\0\56"+
    "\0\u17b8\0\u17e6\0\56\0\56\0\56\0\u1814\0\56\0\u1842"+
    "\0\u1870\0\56\0\u189e\0\u18cc\0\u18fa\0\u1928\0\u1956\0\u1984"+
    "\0\u19b2\0\u19e0\0\u1a0e\0\56\0\56\0\u1a3c\0\u1a6a\0\u1a98"+
    "\0\u1ac6\0\u1af4\0\56\0\u1b22\0\u1b50\0\u1b7e\0\u1bac\0\u1bda"+
    "\0\56\0\u1c08\0\56\0\u1c36\0\56\0\56\0\u1c64\0\u1c92"+
    "\0\u1cc0\0\56\0\56\0\56\0\56\0\56\0\u1cee\0\u1d1c"+
    "\0\u1d4a\0\u1d78\0\56\0\56\0\u1da6\0\56\0\56\0\u1dd4"+
    "\0\u1e02\0\56\0\u1e30\0\56\0\u1e5e\0\56\0\u1e8c\0\u1eba"+
    "\0\56\0\u1ee8\0\56\0\u1f16\0\u1f44\0\u1f72\0\u1fa0\0\u1fce"+
    "\0\u1ffc\0\u202a\0\56\0\56\0\u2058\0\56\0\u2086\0\u20b4"+
    "\0\u20e2\0\56\0\u2110\0\u213e\0\56\0\u216c\0\u219a\0\56";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[264];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\2\1\3\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\2\1\25\1\26\1\27"+
    "\1\30\1\31\2\2\1\32\1\33\1\34\1\2\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\0\2\2\4\0"+
    "\1\2\2\0\27\2\17\0\1\3\3\0\1\53\1\54"+
    "\130\0\1\5\53\0\1\55\54\0\2\2\4\0\1\2"+
    "\2\0\10\2\1\56\2\2\1\57\13\2\15\0\11\60"+
    "\1\61\44\60\1\0\2\2\4\0\1\2\2\0\1\2"+
    "\1\62\2\2\1\63\22\2\16\0\2\2\4\0\1\64"+
    "\2\0\27\2\16\0\2\2\4\0\1\2\2\0\1\2"+
    "\1\65\4\2\1\66\15\2\1\67\2\2\16\0\2\2"+
    "\4\0\1\2\2\0\2\2\1\70\24\2\16\0\2\2"+
    "\4\0\1\2\2\0\1\2\1\71\6\2\1\72\3\2"+
    "\1\73\12\2\16\0\2\2\4\0\1\2\2\0\2\2"+
    "\1\74\24\2\16\0\2\2\4\0\1\75\2\0\2\2"+
    "\1\76\24\2\16\0\2\2\4\0\1\2\2\0\5\2"+
    "\1\77\2\2\1\100\13\2\1\101\2\2\16\0\2\2"+
    "\4\0\1\2\2\0\2\2\1\102\4\2\1\103\17\2"+
    "\16\0\2\2\4\0\1\2\2\0\1\2\1\104\1\105"+
    "\7\2\1\106\6\2\1\107\5\2\16\0\2\2\4\0"+
    "\1\2\2\0\4\2\1\110\22\2\16\0\2\2\4\0"+
    "\1\111\2\0\11\2\1\112\1\113\14\2\16\0\2\2"+
    "\4\0\1\114\2\0\2\2\1\115\4\2\1\116\17\2"+
    "\16\0\2\2\4\0\1\2\2\0\1\2\1\117\5\2"+
    "\1\120\2\2\1\121\14\2\16\0\2\2\4\0\1\2"+
    "\2\0\2\2\1\122\1\2\1\123\5\2\1\124\14\2"+
    "\16\0\2\2\4\0\1\2\2\0\4\2\1\125\22\2"+
    "\16\0\2\2\4\0\1\2\2\0\10\2\1\126\3\2"+
    "\1\127\12\2\16\0\2\2\4\0\1\2\2\0\2\2"+
    "\1\130\1\2\1\131\2\2\1\132\3\2\1\133\7\2"+
    "\1\134\3\2\16\0\2\2\4\0\1\2\2\0\2\2"+
    "\1\135\24\2\61\0\1\136\1\137\55\0\1\140\54\0"+
    "\1\141\13\0\1\142\55\0\1\143\2\0\1\144\47\0"+
    "\1\144\1\0\2\2\4\0\1\2\2\0\15\2\1\145"+
    "\11\2\16\0\2\2\4\0\1\2\2\0\14\2\1\146"+
    "\12\2\15\0\3\147\1\0\5\147\1\61\44\147\1\0"+
    "\2\2\4\0\1\2\2\0\2\2\1\150\24\2\16\0"+
    "\2\2\4\0\1\2\2\0\17\2\1\151\7\2\16\0"+
    "\2\2\4\0\1\2\2\0\1\152\3\2\1\153\12\2"+
    "\1\154\7\2\16\0\2\2\4\0\1\2\2\0\25\2"+
    "\1\155\1\2\16\0\2\2\4\0\1\2\2\0\11\2"+
    "\1\156\15\2\16\0\2\2\4\0\1\2\2\0\1\2"+
    "\1\157\25\2\16\0\2\2\4\0\1\2\2\0\15\2"+
    "\1\160\11\2\16\0\2\2\4\0\1\2\2\0\5\2"+
    "\1\161\21\2\16\0\2\2\4\0\1\2\2\0\15\2"+
    "\1\162\11\2\16\0\2\2\4\0\1\2\2\0\3\2"+
    "\1\163\23\2\16\0\2\2\4\0\1\2\2\0\2\2"+
    "\1\164\24\2\16\0\2\2\4\0\1\2\2\0\1\165"+
    "\26\2\16\0\2\2\4\0\1\2\2\0\11\2\1\166"+
    "\1\2\1\167\13\2\16\0\2\2\4\0\1\2\2\0"+
    "\11\2\1\170\15\2\16\0\2\2\4\0\1\2\2\0"+
    "\13\2\1\171\13\2\16\0\2\2\4\0\1\2\2\0"+
    "\23\2\1\172\3\2\16\0\2\2\4\0\1\173\2\0"+
    "\27\2\16\0\2\2\4\0\1\2\2\0\1\174\26\2"+
    "\16\0\2\2\4\0\1\2\2\0\6\2\1\175\20\2"+
    "\16\0\2\2\4\0\1\2\2\0\11\2\1\176\15\2"+
    "\16\0\2\2\4\0\1\2\2\0\1\2\1\177\25\2"+
    "\16\0\2\2\4\0\1\2\2\0\1\2\1\200\11\2"+
    "\1\201\13\2\16\0\2\2\4\0\1\2\2\0\14\2"+
    "\1\202\12\2\16\0\2\2\4\0\1\2\2\0\16\2"+
    "\1\203\4\2\1\204\3\2\16\0\2\2\4\0\1\2"+
    "\2\0\22\2\1\205\4\2\16\0\2\2\4\0\1\2"+
    "\2\0\7\2\1\206\17\2\16\0\2\2\4\0\1\2"+
    "\2\0\11\2\1\207\15\2\16\0\2\2\4\0\1\2"+
    "\2\0\7\2\1\210\17\2\16\0\2\2\4\0\1\2"+
    "\2\0\10\2\1\211\16\2\16\0\2\2\4\0\1\2"+
    "\2\0\14\2\1\212\12\2\16\0\2\2\4\0\1\2"+
    "\2\0\4\2\1\213\22\2\16\0\2\2\4\0\1\2"+
    "\2\0\1\2\1\214\25\2\16\0\2\2\4\0\1\2"+
    "\2\0\7\2\1\215\1\2\1\216\15\2\16\0\2\2"+
    "\4\0\1\217\2\0\27\2\16\0\2\2\4\0\1\2"+
    "\2\0\1\2\1\220\14\2\1\221\10\2\16\0\2\2"+
    "\4\0\1\2\2\0\13\2\1\222\13\2\16\0\2\2"+
    "\4\0\1\2\2\0\13\2\1\223\13\2\16\0\2\2"+
    "\4\0\1\2\2\0\2\2\1\224\24\2\16\0\2\2"+
    "\4\0\1\2\2\0\10\2\1\225\16\2\16\0\2\2"+
    "\4\0\1\2\2\0\1\2\1\226\25\2\17\0\1\142"+
    "\4\0\1\54\50\0\1\143\54\0\2\2\4\0\1\227"+
    "\2\0\27\2\16\0\2\2\4\0\1\2\2\0\3\2"+
    "\1\230\13\2\1\231\7\2\16\0\2\2\4\0\1\2"+
    "\2\0\20\2\1\232\6\2\16\0\2\2\4\0\1\233"+
    "\2\0\27\2\16\0\2\2\4\0\1\2\2\0\13\2"+
    "\1\234\1\2\1\235\11\2\16\0\2\2\4\0\1\2"+
    "\2\0\2\2\1\236\24\2\16\0\2\2\4\0\1\237"+
    "\2\0\27\2\16\0\2\2\4\0\1\2\2\0\2\2"+
    "\1\240\24\2\16\0\2\2\4\0\1\2\2\0\4\2"+
    "\1\241\22\2\16\0\2\2\4\0\1\2\2\0\7\2"+
    "\1\242\17\2\16\0\2\2\4\0\1\2\2\0\13\2"+
    "\1\243\13\2\16\0\2\2\4\0\1\2\2\0\13\2"+
    "\1\244\13\2\16\0\2\2\4\0\1\245\2\0\27\2"+
    "\16\0\2\2\4\0\1\2\2\0\7\2\1\246\17\2"+
    "\16\0\2\2\4\0\1\247\2\0\27\2\16\0\2\2"+
    "\4\0\1\2\2\0\10\2\1\250\16\2\16\0\2\2"+
    "\4\0\1\251\2\0\27\2\16\0\2\2\4\0\1\252"+
    "\2\0\27\2\16\0\2\2\4\0\1\2\2\0\7\2"+
    "\1\253\17\2\16\0\2\2\4\0\1\2\2\0\11\2"+
    "\1\254\15\2\16\0\2\2\4\0\1\2\2\0\10\2"+
    "\1\255\16\2\16\0\2\2\4\0\1\2\2\0\6\2"+
    "\1\256\20\2\16\0\2\2\4\0\1\2\2\0\11\2"+
    "\1\257\15\2\16\0\2\2\4\0\1\2\2\0\12\2"+
    "\1\260\14\2\16\0\2\2\4\0\1\2\2\0\13\2"+
    "\1\261\13\2\16\0\2\2\4\0\1\2\2\0\14\2"+
    "\1\262\12\2\16\0\2\2\4\0\1\263\2\0\27\2"+
    "\16\0\2\2\4\0\1\2\2\0\1\2\1\264\25\2"+
    "\16\0\2\2\4\0\1\2\2\0\11\2\1\265\15\2"+
    "\16\0\2\2\4\0\1\2\2\0\7\2\1\266\17\2"+
    "\16\0\2\2\4\0\1\2\2\0\14\2\1\267\12\2"+
    "\16\0\2\2\4\0\1\2\2\0\4\2\1\270\22\2"+
    "\16\0\2\2\4\0\1\2\2\0\14\2\1\271\12\2"+
    "\16\0\2\2\4\0\1\272\2\0\27\2\16\0\2\2"+
    "\4\0\1\2\2\0\4\2\1\273\22\2\16\0\2\2"+
    "\4\0\1\2\2\0\17\2\1\274\7\2\16\0\2\2"+
    "\4\0\1\2\2\0\1\2\1\275\25\2\16\0\2\2"+
    "\4\0\1\276\2\0\27\2\16\0\2\2\4\0\1\277"+
    "\2\0\27\2\16\0\2\2\4\0\1\2\2\0\4\2"+
    "\1\300\22\2\16\0\2\2\4\0\1\2\2\0\13\2"+
    "\1\301\13\2\16\0\2\2\4\0\1\2\2\0\1\2"+
    "\1\302\25\2\16\0\2\2\4\0\1\2\2\0\17\2"+
    "\1\303\7\2\16\0\2\2\4\0\1\2\2\0\21\2"+
    "\1\304\5\2\16\0\2\2\4\0\1\2\2\0\10\2"+
    "\1\305\16\2\16\0\2\2\4\0\1\306\2\0\27\2"+
    "\16\0\2\2\4\0\1\307\2\0\27\2\16\0\2\2"+
    "\4\0\1\2\2\0\1\2\1\310\1\2\1\311\23\2"+
    "\16\0\2\2\4\0\1\2\2\0\10\2\1\312\16\2"+
    "\16\0\2\2\4\0\1\2\2\0\13\2\1\313\13\2"+
    "\16\0\2\2\4\0\1\2\2\0\10\2\1\314\16\2"+
    "\16\0\2\2\4\0\1\2\2\0\1\2\1\315\25\2"+
    "\16\0\2\2\4\0\1\2\2\0\11\2\1\316\15\2"+
    "\16\0\2\2\4\0\1\2\2\0\13\2\1\317\13\2"+
    "\16\0\2\2\4\0\1\320\2\0\27\2\16\0\2\2"+
    "\4\0\1\321\2\0\27\2\16\0\2\2\4\0\1\2"+
    "\2\0\11\2\1\322\15\2\16\0\2\2\4\0\1\2"+
    "\2\0\13\2\1\323\13\2\16\0\2\2\4\0\1\2"+
    "\2\0\1\2\1\324\25\2\16\0\2\2\4\0\1\325"+
    "\2\0\27\2\16\0\2\2\4\0\1\2\2\0\11\2"+
    "\1\326\15\2\16\0\2\2\4\0\1\2\2\0\11\2"+
    "\1\327\15\2\16\0\2\2\4\0\1\2\2\0\4\2"+
    "\1\330\22\2\16\0\2\2\4\0\1\2\2\0\15\2"+
    "\1\331\11\2\16\0\2\2\4\0\1\2\2\0\15\2"+
    "\1\332\11\2\16\0\2\2\4\0\1\2\2\0\11\2"+
    "\1\333\15\2\16\0\2\2\4\0\1\2\2\0\10\2"+
    "\1\334\16\2\16\0\2\2\4\0\1\2\2\0\15\2"+
    "\1\335\11\2\16\0\2\2\4\0\1\2\2\0\11\2"+
    "\1\336\15\2\16\0\2\2\4\0\1\2\2\0\4\2"+
    "\1\337\22\2\16\0\2\2\4\0\1\2\2\0\5\2"+
    "\1\340\21\2\16\0\2\2\4\0\1\2\2\0\24\2"+
    "\1\341\2\2\16\0\2\2\4\0\1\342\2\0\27\2"+
    "\16\0\2\2\4\0\1\343\2\0\27\2\16\0\2\2"+
    "\4\0\1\2\2\0\3\2\1\344\23\2\16\0\2\2"+
    "\4\0\1\2\2\0\23\2\1\345\3\2\16\0\2\2"+
    "\4\0\1\2\2\0\2\2\1\346\24\2\16\0\2\2"+
    "\4\0\1\347\2\0\27\2\16\0\2\2\4\0\1\2"+
    "\2\0\13\2\1\350\13\2\16\0\2\2\4\0\1\2"+
    "\2\0\1\2\1\351\25\2\16\0\2\2\4\0\1\2"+
    "\2\0\15\2\1\352\11\2\16\0\2\2\4\0\1\2"+
    "\2\0\7\2\1\353\17\2\16\0\2\2\4\0\1\2"+
    "\2\0\5\2\1\354\21\2\16\0\2\2\4\0\1\2"+
    "\2\0\23\2\1\355\3\2\16\0\2\2\4\0\1\2"+
    "\2\0\10\2\1\356\16\2\16\0\2\2\4\0\1\357"+
    "\2\0\27\2\16\0\2\2\4\0\1\2\2\0\4\2"+
    "\1\360\22\2\16\0\2\2\4\0\1\2\2\0\1\2"+
    "\1\361\25\2\16\0\2\2\4\0\1\2\2\0\17\2"+
    "\1\362\7\2\16\0\2\2\4\0\1\2\2\0\10\2"+
    "\1\363\16\2\16\0\2\2\4\0\1\2\2\0\23\2"+
    "\1\364\3\2\16\0\2\2\4\0\1\2\2\0\2\2"+
    "\1\365\24\2\16\0\2\2\4\0\1\2\2\0\1\2"+
    "\1\366\25\2\16\0\2\2\4\0\1\2\2\0\10\2"+
    "\1\367\16\2\16\0\2\2\4\0\1\2\2\0\17\2"+
    "\1\370\7\2\16\0\2\2\4\0\1\2\2\0\11\2"+
    "\1\371\15\2\16\0\2\2\4\0\1\2\2\0\17\2"+
    "\1\372\7\2\16\0\2\2\4\0\1\2\2\0\10\2"+
    "\1\373\16\2\16\0\2\2\4\0\1\374\2\0\27\2"+
    "\16\0\2\2\4\0\1\2\2\0\11\2\1\375\15\2"+
    "\16\0\2\2\4\0\1\376\2\0\27\2\16\0\2\2"+
    "\4\0\1\2\2\0\2\2\1\377\24\2\16\0\2\2"+
    "\4\0\1\2\2\0\11\2\1\u0100\15\2\16\0\2\2"+
    "\4\0\1\2\2\0\4\2\1\u0101\22\2\16\0\2\2"+
    "\4\0\1\2\2\0\1\2\1\u0102\25\2\16\0\2\2"+
    "\4\0\1\2\2\0\2\2\1\u0103\24\2\16\0\2\2"+
    "\4\0\1\2\2\0\11\2\1\u0104\15\2\16\0\2\2"+
    "\4\0\1\2\2\0\1\2\1\u0105\25\2\16\0\2\2"+
    "\4\0\1\2\2\0\7\2\1\u0106\17\2\16\0\2\2"+
    "\4\0\1\2\2\0\2\2\1\u0107\24\2\16\0\2\2"+
    "\4\0\1\2\2\0\10\2\1\u0108\16\2\15\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8648];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\1\1\11\2\1\1\11\2\1\1\11\23\1"+
    "\2\11\2\1\1\11\1\1\6\11\1\1\2\0\3\1"+
    "\1\0\55\1\4\11\2\1\1\0\2\1\1\0\241\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[264];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

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
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	private Symbol sym(int type)
	{
		return sym(type, yytext());
	}

	private Symbol sym(int type, Object value)
	{
		return new Symbol(type, yyline, yycolumn, value);
	}

	private void error()
	throws IOException
	{
		throw new IOException("illegal text at line = "+yyline+", column = "+yycolumn+", text = '"+yytext()+"'");
	}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  CodLex(java.io.Reader in) {
  	// TODO: code that goes to constructor
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  CodLex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 168) {
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
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
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
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
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
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 65: 
          { return sym(UNTIL);
          }
        case 86: break;
        case 31: 
          { return sym(ATRIBUICAO);
          }
        case 87: break;
        case 37: 
          { return sym(NOT);
          }
        case 88: break;
        case 50: 
          { return sym(TRUE);
          }
        case 89: break;
        case 76: 
          { return sym(FOWARD);
          }
        case 90: break;
        case 63: 
          { return sym(WHILE);
          }
        case 91: break;
        case 84: 
          { return sym(CONSTRUCTOR);
          }
        case 92: break;
        case 53: 
          { return sym(WITH);
          }
        case 93: break;
        case 15: 
          { return sym(VG);
          }
        case 94: break;
        case 38: 
          { return sym(NIL);
          }
        case 95: break;
        case 83: 
          { return sym(DESTRUCTOR);
          }
        case 96: break;
        case 32: 
          { return sym(NUMERO_REAL, yytext());
          }
        case 97: break;
        case 81: 
          { return sym(PROCEDURE);
          }
        case 98: break;
        case 77: 
          { return sym(PROGRAM);
          }
        case 99: break;
        case 57: 
          { return sym(USES);
          }
        case 100: break;
        case 41: 
          { return sym(SHL);
          }
        case 101: break;
        case 85: 
          { return sym(IMPLEMENTATION);
          }
        case 102: break;
        case 56: 
          { return sym(UNIT);
          }
        case 103: break;
        case 33: 
          { return sym(END);
          }
        case 104: break;
        case 45: 
          { return sym(XOR);
          }
        case 105: break;
        case 10: 
          { return sym(FECHACONCHETE);
          }
        case 106: break;
        case 43: 
          { return sym(VAR);
          }
        case 107: break;
        case 49: 
          { return sym(GOTO);
          }
        case 108: break;
        case 51: 
          { return sym(THEN);
          }
        case 109: break;
        case 9: 
          { return sym(ABRECONCHETE);
          }
        case 110: break;
        case 72: 
          { return sym(INLINE);
          }
        case 111: break;
        case 7: 
          { return sym(AP);
          }
        case 112: break;
        case 74: 
          { return sym(DOWNTO);
          }
        case 113: break;
        case 58: 
          { return sym(FILE);
          }
        case 114: break;
        case 55: 
          { return sym(CHAR);
          }
        case 115: break;
        case 75: 
          { return sym(DOUBLE);
          }
        case 116: break;
        case 21: 
          { return sym(SOMA);
          }
        case 117: break;
        case 14: 
          { return sym(DP);
          }
        case 118: break;
        case 6: 
          { return sym(PONTO);
          }
        case 119: break;
        case 60: 
          { return sym(BEGIN);
          }
        case 120: break;
        case 27: 
          { return sym(DO);
          }
        case 121: break;
        case 8: 
          { return sym(FP);
          }
        case 122: break;
        case 78: 
          { return sym(BOOLEAN);
          }
        case 123: break;
        case 47: 
          { return sym(REAL);
          }
        case 124: break;
        case 64: 
          { return sym(CONST);
          }
        case 125: break;
        case 30: 
          { return sym(MAIORIGUAL);
          }
        case 126: break;
        case 3: 
          { return sym(PV);
          }
        case 127: break;
        case 54: 
          { return sym(CASE);
          }
        case 128: break;
        case 13: 
          { return sym(MAIOR_QUE);
          }
        case 129: break;
        case 24: 
          { return sym(IN);
          }
        case 130: break;
        case 80: 
          { return sym(FUNCTION);
          }
        case 131: break;
        case 16: 
          { return sym(ACHAVE);
          }
        case 132: break;
        case 69: 
          { return sym(REPEAT);
          }
        case 133: break;
        case 22: 
          { return sym(OR);
          }
        case 134: break;
        case 52: 
          { return sym(TYPE);
          }
        case 135: break;
        case 44: 
          { return sym(FOR);
          }
        case 136: break;
        case 70: 
          { return sym(RECORD);
          }
        case 137: break;
        case 66: 
          { return sym(FALSE);
          }
        case 138: break;
        case 28: 
          { return sym(MENORIGUAL);
          }
        case 139: break;
        case 29: 
          { return sym(DIFERENTE);
          }
        case 140: break;
        case 12: 
          { return sym(IGUAL);
          }
        case 141: break;
        case 19: 
          { return sym(MULT);
          }
        case 142: break;
        case 73: 
          { return sym(STRING);
          }
        case 143: break;
        case 48: 
          { return sym(READ);
          }
        case 144: break;
        case 42: 
          { return sym(DIV);
          }
        case 145: break;
        case 1: 
          { return sym(IDENTIFICADOR, yytext());
          }
        case 146: break;
        case 18: 
          { return sym(PO);
          }
        case 147: break;
        case 36: 
          { return sym(MOD);
          }
        case 148: break;
        case 2: 
          { return sym(NUMERO_INTEIRO, yytext());
          }
        case 149: break;
        case 46: 
          { return sym(ELSE);
          }
        case 150: break;
        case 68: 
          { return sym(PACKED);
          }
        case 151: break;
        case 79: 
          { return sym(INTEGER);
          }
        case 152: break;
        case 61: 
          { return sym(LABEL);
          }
        case 153: break;
        case 35: 
          { return sym(ASM);
          }
        case 154: break;
        case 5: 
          { return sym(SUB);
          }
        case 155: break;
        case 25: 
          { return sym(IF);
          }
        case 156: break;
        case 26: 
          { return sym(TO);
          }
        case 157: break;
        case 39: 
          { return sym(SET);
          }
        case 158: break;
        case 67: 
          { return sym(FLOAT);
          }
        case 159: break;
        case 20: 
          { return sym(DIVR);
          }
        case 160: break;
        case 62: 
          { return sym(WRITE);
          }
        case 161: break;
        case 71: 
          { return sym(OBJECT);
          }
        case 162: break;
        case 17: 
          { return sym(FCHAVE);
          }
        case 163: break;
        case 82: 
          { return sym(INTERFACE);
          }
        case 164: break;
        case 11: 
          { return sym(MENOR_QUE);
          }
        case 165: break;
        case 59: 
          { return sym(ARRAY);
          }
        case 166: break;
        case 34: 
          { return sym(AND);
          }
        case 167: break;
        case 23: 
          { return sym(OF);
          }
        case 168: break;
        case 40: 
          { return sym(SHR);
          }
        case 169: break;
        case 4: 
          { 
          }
        case 170: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(jflex_plft5.CodSym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
