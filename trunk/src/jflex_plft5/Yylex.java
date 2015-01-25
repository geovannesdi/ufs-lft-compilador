/* The following code was generated by JFlex 1.4.3 on 25/01/15 13:15 */

package jflex_plft5;

import java_cup.runtime.*;
import java.io.IOException;

import jflex_plft5.CodSym;
import static jflex_plft5.CodSym.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 25/01/15 13:15 from the specification file
 * <tt>D:/workspace/ufs-lft-compilador/Cod.lex</tt>
 */
final class Yylex implements java_cup.runtime.Scanner, java_cup.runtime.Scanner {

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
    "\11\0\1\3\1\7\2\0\1\3\22\0\1\3\12\0\1\4\1\0"+
    "\1\4\1\5\1\0\12\2\1\37\1\0\1\41\1\40\1\42\2\0"+
    "\1\14\1\16\1\27\1\25\1\6\1\34\1\13\1\22\1\17\1\35"+
    "\1\30\1\23\1\15\1\20\1\12\1\10\1\1\1\11\1\24\1\21"+
    "\1\33\1\32\1\26\1\36\1\31\1\1\4\0\1\1\1\0\1\14"+
    "\1\16\1\27\1\25\1\6\1\34\1\13\1\22\1\17\1\35\1\30"+
    "\1\23\1\15\1\20\1\12\1\10\1\1\1\11\1\24\1\21\1\33"+
    "\1\32\1\26\1\36\1\31\1\1\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\6\1\1\2\25\1\1\3\1\4\2\0\1\4"+
    "\5\3\1\5\1\3\1\6\10\3\1\7\1\10\4\3"+
    "\1\11\7\3\1\12\20\3\1\13\1\14\2\15\1\0"+
    "\1\16\11\3\1\17\1\20\1\21\5\3\1\22\1\23"+
    "\5\3\1\24\1\3\1\25\1\26\3\3\1\27\6\3"+
    "\1\30\3\3\1\31\5\3\1\32\1\33\4\3\1\34"+
    "\1\35\2\3\1\36\6\3\1\37\1\40\1\41\1\42"+
    "\6\3\1\43\2\3\1\44\1\45\1\46\1\3\1\47"+
    "\2\3\1\50\10\3\1\51\1\52\5\3\1\53\4\3"+
    "\1\54\1\55\1\56\1\57\1\3\1\60\1\61\3\3"+
    "\1\62\1\63\1\64\1\65\4\3\1\66\1\67\1\3"+
    "\1\70\1\71\1\3\1\72\1\3\1\73\1\3\1\74"+
    "\2\3\1\75\10\3\1\76\1\77\1\3\1\100\3\3"+
    "\1\101\2\3\1\102\2\3\1\103";

  private static int [] zzUnpackAction() {
    int [] result = new int[247];
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
    "\0\0\0\43\0\106\0\151\0\214\0\257\0\322\0\214"+
    "\0\365\0\u0118\0\u013b\0\u015e\0\u0181\0\u01a4\0\u01c7\0\u01ea"+
    "\0\u020d\0\u0230\0\u0253\0\u0276\0\u0299\0\u02bc\0\u02df\0\u0302"+
    "\0\u0325\0\u0348\0\u036b\0\u038e\0\u03b1\0\106\0\151\0\u03d4"+
    "\0\u03f7\0\257\0\u041a\0\u043d\0\u0460\0\u0483\0\u04a6\0\106"+
    "\0\u04c9\0\106\0\u04ec\0\u050f\0\u0532\0\u0555\0\u0578\0\u059b"+
    "\0\u05be\0\u05e1\0\u0604\0\106\0\u0627\0\u064a\0\u066d\0\u0690"+
    "\0\106\0\u06b3\0\u06d6\0\u06f9\0\u071c\0\u073f\0\u0762\0\u0785"+
    "\0\u07a8\0\u07cb\0\u07ee\0\u0811\0\u0834\0\u0857\0\u087a\0\u089d"+
    "\0\u08c0\0\u08e3\0\u0906\0\u0929\0\u094c\0\u096f\0\u0992\0\u09b5"+
    "\0\u09d8\0\43\0\43\0\u09fb\0\u0a1e\0\u0a1e\0\106\0\u0a41"+
    "\0\u0a64\0\u0a87\0\u0aaa\0\u0acd\0\u0af0\0\u0b13\0\u0b36\0\u0b59"+
    "\0\106\0\106\0\106\0\u0b7c\0\u0b9f\0\u0bc2\0\u0be5\0\u0c08"+
    "\0\106\0\106\0\u0c2b\0\u0c4e\0\u0c71\0\u0c94\0\u0cb7\0\106"+
    "\0\u0cda\0\106\0\106\0\u0cfd\0\u0d20\0\u0d43\0\106\0\u0d66"+
    "\0\u0d89\0\u0dac\0\u0dcf\0\u0df2\0\u0e15\0\106\0\u0e38\0\u0e5b"+
    "\0\u0e7e\0\106\0\u0ea1\0\u0ec4\0\u0ee7\0\u0f0a\0\u0f2d\0\106"+
    "\0\106\0\u0f50\0\u0f73\0\u0f96\0\u0fb9\0\106\0\106\0\u0fdc"+
    "\0\u0fff\0\106\0\u1022\0\u1045\0\u1068\0\u108b\0\u10ae\0\u10d1"+
    "\0\106\0\106\0\106\0\106\0\u10f4\0\u1117\0\u113a\0\u115d"+
    "\0\u1180\0\u11a3\0\106\0\u11c6\0\u11e9\0\106\0\106\0\106"+
    "\0\u120c\0\106\0\u122f\0\u1252\0\106\0\u1275\0\u1298\0\u12bb"+
    "\0\u12de\0\u1301\0\u1324\0\u1347\0\u136a\0\106\0\106\0\u138d"+
    "\0\u13b0\0\u13d3\0\u13f6\0\u1419\0\106\0\u143c\0\u145f\0\u1482"+
    "\0\u14a5\0\106\0\106\0\u14c8\0\106\0\u14eb\0\106\0\106"+
    "\0\u150e\0\u1531\0\u1554\0\106\0\106\0\106\0\106\0\u1577"+
    "\0\u159a\0\u15bd\0\u15e0\0\106\0\106\0\u1603\0\106\0\106"+
    "\0\u1626\0\106\0\u1649\0\106\0\u166c\0\106\0\u168f\0\u16b2"+
    "\0\106\0\u16d5\0\u16f8\0\u171b\0\u173e\0\u1761\0\u1784\0\u17a7"+
    "\0\u17ca\0\106\0\106\0\u17ed\0\106\0\u1810\0\u1833\0\u1856"+
    "\0\106\0\u1879\0\u189c\0\106\0\u18bf\0\u18e2\0\106";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[247];
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
    "\1\2\1\3\1\4\1\5\1\6\1\2\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\3\1\23\1\24\1\25\1\26\1\27"+
    "\2\3\1\30\1\31\1\32\1\3\1\33\1\34\1\2"+
    "\1\35\1\2\44\0\2\36\3\0\1\36\1\0\27\36"+
    "\6\0\1\37\2\0\1\40\1\41\37\0\1\10\3\0"+
    "\1\10\35\0\1\42\41\0\2\36\3\0\1\36\1\0"+
    "\10\36\1\43\2\36\1\44\13\36\5\0\2\36\3\0"+
    "\1\36\1\0\1\36\1\45\2\36\1\46\22\36\5\0"+
    "\2\36\3\0\1\47\1\0\27\36\5\0\2\36\3\0"+
    "\1\36\1\0\1\36\1\50\4\36\1\51\15\36\1\52"+
    "\2\36\5\0\2\36\3\0\1\36\1\0\2\36\1\53"+
    "\24\36\5\0\2\36\3\0\1\36\1\0\1\36\1\54"+
    "\6\36\1\55\3\36\1\56\12\36\5\0\2\36\3\0"+
    "\1\36\1\0\2\36\1\57\24\36\5\0\2\36\3\0"+
    "\1\60\1\0\2\36\1\61\24\36\5\0\2\36\3\0"+
    "\1\36\1\0\5\36\1\62\2\36\1\63\13\36\1\64"+
    "\2\36\5\0\2\36\3\0\1\36\1\0\2\36\1\65"+
    "\4\36\1\66\17\36\5\0\2\36\3\0\1\67\1\0"+
    "\1\36\1\70\1\71\7\36\1\72\6\36\1\73\5\36"+
    "\5\0\2\36\3\0\1\36\1\0\4\36\1\74\22\36"+
    "\5\0\2\36\3\0\1\75\1\0\11\36\1\76\1\77"+
    "\14\36\5\0\2\36\3\0\1\100\1\0\2\36\1\101"+
    "\4\36\1\102\17\36\5\0\2\36\3\0\1\36\1\0"+
    "\1\36\1\103\5\36\1\104\2\36\1\105\14\36\5\0"+
    "\2\36\3\0\1\36\1\0\2\36\1\106\1\36\1\107"+
    "\5\36\1\110\14\36\5\0\2\36\3\0\1\36\1\0"+
    "\4\36\1\111\22\36\5\0\2\36\3\0\1\36\1\0"+
    "\10\36\1\112\3\36\1\113\12\36\5\0\2\36\3\0"+
    "\1\36\1\0\2\36\1\114\1\36\1\115\2\36\1\116"+
    "\3\36\1\117\7\36\1\120\3\36\5\0\2\36\3\0"+
    "\1\36\1\0\2\36\1\121\24\36\44\0\1\122\44\0"+
    "\1\123\2\0\1\124\42\0\1\125\1\0\1\126\37\0"+
    "\2\36\3\0\1\36\1\0\15\36\1\127\11\36\5\0"+
    "\2\36\3\0\1\36\1\0\14\36\1\130\12\36\5\0"+
    "\2\36\3\0\1\36\1\0\2\36\1\131\24\36\5\0"+
    "\2\36\3\0\1\36\1\0\17\36\1\132\7\36\5\0"+
    "\2\36\3\0\1\36\1\0\1\133\3\36\1\134\12\36"+
    "\1\135\7\36\5\0\2\36\3\0\1\36\1\0\25\36"+
    "\1\136\1\36\5\0\2\36\3\0\1\36\1\0\11\36"+
    "\1\137\15\36\5\0\2\36\3\0\1\36\1\0\1\36"+
    "\1\140\25\36\5\0\2\36\3\0\1\36\1\0\15\36"+
    "\1\141\11\36\5\0\2\36\3\0\1\36\1\0\5\36"+
    "\1\142\21\36\5\0\2\36\3\0\1\36\1\0\15\36"+
    "\1\143\11\36\5\0\2\36\3\0\1\36\1\0\3\36"+
    "\1\144\23\36\5\0\2\36\3\0\1\36\1\0\2\36"+
    "\1\145\24\36\5\0\2\36\3\0\1\36\1\0\1\146"+
    "\26\36\5\0\2\36\3\0\1\36\1\0\11\36\1\147"+
    "\1\36\1\150\13\36\5\0\2\36\3\0\1\36\1\0"+
    "\11\36\1\151\15\36\5\0\2\36\3\0\1\36\1\0"+
    "\13\36\1\152\13\36\5\0\2\36\3\0\1\36\1\0"+
    "\14\36\1\153\12\36\5\0\2\36\3\0\1\36\1\0"+
    "\23\36\1\154\3\36\5\0\2\36\3\0\1\155\1\0"+
    "\27\36\5\0\2\36\3\0\1\36\1\0\1\156\26\36"+
    "\5\0\2\36\3\0\1\36\1\0\6\36\1\157\20\36"+
    "\5\0\2\36\3\0\1\36\1\0\11\36\1\160\15\36"+
    "\5\0\2\36\3\0\1\36\1\0\1\36\1\161\25\36"+
    "\5\0\2\36\3\0\1\36\1\0\1\36\1\162\11\36"+
    "\1\163\13\36\5\0\2\36\3\0\1\36\1\0\14\36"+
    "\1\164\12\36\5\0\2\36\3\0\1\36\1\0\16\36"+
    "\1\165\4\36\1\166\3\36\5\0\2\36\3\0\1\36"+
    "\1\0\22\36\1\167\4\36\5\0\2\36\3\0\1\36"+
    "\1\0\7\36\1\170\17\36\5\0\2\36\3\0\1\36"+
    "\1\0\11\36\1\171\15\36\5\0\2\36\3\0\1\36"+
    "\1\0\7\36\1\172\17\36\5\0\2\36\3\0\1\36"+
    "\1\0\10\36\1\173\16\36\5\0\2\36\3\0\1\36"+
    "\1\0\14\36\1\174\12\36\5\0\2\36\3\0\1\36"+
    "\1\0\4\36\1\175\22\36\5\0\2\36\3\0\1\36"+
    "\1\0\1\36\1\176\25\36\5\0\2\36\3\0\1\36"+
    "\1\0\7\36\1\177\1\36\1\200\15\36\5\0\2\36"+
    "\3\0\1\201\1\0\27\36\5\0\2\36\3\0\1\36"+
    "\1\0\1\36\1\202\14\36\1\203\10\36\5\0\2\36"+
    "\3\0\1\36\1\0\13\36\1\204\13\36\5\0\2\36"+
    "\3\0\1\36\1\0\13\36\1\205\13\36\5\0\2\36"+
    "\3\0\1\36\1\0\2\36\1\206\24\36\5\0\2\36"+
    "\3\0\1\36\1\0\10\36\1\207\16\36\5\0\2\36"+
    "\3\0\1\36\1\0\1\36\1\210\25\36\6\0\1\124"+
    "\3\0\1\41\36\0\1\125\41\0\2\36\3\0\1\211"+
    "\1\0\27\36\5\0\2\36\3\0\1\36\1\0\3\36"+
    "\1\212\13\36\1\213\7\36\5\0\2\36\3\0\1\36"+
    "\1\0\20\36\1\214\6\36\5\0\2\36\3\0\1\215"+
    "\1\0\27\36\5\0\2\36\3\0\1\36\1\0\13\36"+
    "\1\216\1\36\1\217\11\36\5\0\2\36\3\0\1\36"+
    "\1\0\2\36\1\220\24\36\5\0\2\36\3\0\1\221"+
    "\1\0\27\36\5\0\2\36\3\0\1\36\1\0\2\36"+
    "\1\222\24\36\5\0\2\36\3\0\1\36\1\0\4\36"+
    "\1\223\22\36\5\0\2\36\3\0\1\36\1\0\7\36"+
    "\1\224\17\36\5\0\2\36\3\0\1\36\1\0\13\36"+
    "\1\225\13\36\5\0\2\36\3\0\1\36\1\0\13\36"+
    "\1\226\13\36\5\0\2\36\3\0\1\227\1\0\27\36"+
    "\5\0\2\36\3\0\1\36\1\0\7\36\1\230\17\36"+
    "\5\0\2\36\3\0\1\36\1\0\11\36\1\231\15\36"+
    "\5\0\2\36\3\0\1\232\1\0\27\36\5\0\2\36"+
    "\3\0\1\36\1\0\10\36\1\233\16\36\5\0\2\36"+
    "\3\0\1\234\1\0\27\36\5\0\2\36\3\0\1\235"+
    "\1\0\27\36\5\0\2\36\3\0\1\36\1\0\7\36"+
    "\1\236\17\36\5\0\2\36\3\0\1\36\1\0\11\36"+
    "\1\237\15\36\5\0\2\36\3\0\1\36\1\0\10\36"+
    "\1\240\16\36\5\0\2\36\3\0\1\36\1\0\6\36"+
    "\1\241\20\36\5\0\2\36\3\0\1\36\1\0\11\36"+
    "\1\242\15\36\5\0\2\36\3\0\1\36\1\0\12\36"+
    "\1\243\14\36\5\0\2\36\3\0\1\36\1\0\13\36"+
    "\1\244\13\36\5\0\2\36\3\0\1\36\1\0\14\36"+
    "\1\245\12\36\5\0\2\36\3\0\1\246\1\0\27\36"+
    "\5\0\2\36\3\0\1\36\1\0\1\36\1\247\25\36"+
    "\5\0\2\36\3\0\1\36\1\0\11\36\1\250\15\36"+
    "\5\0\2\36\3\0\1\36\1\0\7\36\1\251\17\36"+
    "\5\0\2\36\3\0\1\36\1\0\14\36\1\252\12\36"+
    "\5\0\2\36\3\0\1\36\1\0\4\36\1\253\22\36"+
    "\5\0\2\36\3\0\1\36\1\0\14\36\1\254\12\36"+
    "\5\0\2\36\3\0\1\255\1\0\27\36\5\0\2\36"+
    "\3\0\1\36\1\0\4\36\1\256\22\36\5\0\2\36"+
    "\3\0\1\36\1\0\17\36\1\257\7\36\5\0\2\36"+
    "\3\0\1\36\1\0\1\36\1\260\25\36\5\0\2\36"+
    "\3\0\1\261\1\0\27\36\5\0\2\36\3\0\1\262"+
    "\1\0\27\36\5\0\2\36\3\0\1\36\1\0\4\36"+
    "\1\263\22\36\5\0\2\36\3\0\1\36\1\0\1\36"+
    "\1\264\25\36\5\0\2\36\3\0\1\36\1\0\17\36"+
    "\1\265\7\36\5\0\2\36\3\0\1\36\1\0\21\36"+
    "\1\266\5\36\5\0\2\36\3\0\1\36\1\0\10\36"+
    "\1\267\16\36\5\0\2\36\3\0\1\270\1\0\27\36"+
    "\5\0\2\36\3\0\1\271\1\0\27\36\5\0\2\36"+
    "\3\0\1\36\1\0\1\36\1\272\1\36\1\273\23\36"+
    "\5\0\2\36\3\0\1\36\1\0\10\36\1\274\16\36"+
    "\5\0\2\36\3\0\1\36\1\0\13\36\1\275\13\36"+
    "\5\0\2\36\3\0\1\36\1\0\10\36\1\276\16\36"+
    "\5\0\2\36\3\0\1\36\1\0\1\36\1\277\25\36"+
    "\5\0\2\36\3\0\1\36\1\0\11\36\1\300\15\36"+
    "\5\0\2\36\3\0\1\36\1\0\13\36\1\301\13\36"+
    "\5\0\2\36\3\0\1\302\1\0\27\36\5\0\2\36"+
    "\3\0\1\303\1\0\27\36\5\0\2\36\3\0\1\36"+
    "\1\0\11\36\1\304\15\36\5\0\2\36\3\0\1\36"+
    "\1\0\13\36\1\305\13\36\5\0\2\36\3\0\1\36"+
    "\1\0\1\36\1\306\25\36\5\0\2\36\3\0\1\307"+
    "\1\0\27\36\5\0\2\36\3\0\1\36\1\0\11\36"+
    "\1\310\15\36\5\0\2\36\3\0\1\36\1\0\11\36"+
    "\1\311\15\36\5\0\2\36\3\0\1\36\1\0\4\36"+
    "\1\312\22\36\5\0\2\36\3\0\1\36\1\0\15\36"+
    "\1\313\11\36\5\0\2\36\3\0\1\36\1\0\15\36"+
    "\1\314\11\36\5\0\2\36\3\0\1\36\1\0\11\36"+
    "\1\315\15\36\5\0\2\36\3\0\1\36\1\0\15\36"+
    "\1\316\11\36\5\0\2\36\3\0\1\36\1\0\11\36"+
    "\1\317\15\36\5\0\2\36\3\0\1\36\1\0\4\36"+
    "\1\320\22\36\5\0\2\36\3\0\1\36\1\0\5\36"+
    "\1\321\21\36\5\0\2\36\3\0\1\36\1\0\24\36"+
    "\1\322\2\36\5\0\2\36\3\0\1\323\1\0\27\36"+
    "\5\0\2\36\3\0\1\324\1\0\27\36\5\0\2\36"+
    "\3\0\1\36\1\0\3\36\1\325\23\36\5\0\2\36"+
    "\3\0\1\36\1\0\23\36\1\326\3\36\5\0\2\36"+
    "\3\0\1\36\1\0\2\36\1\327\24\36\5\0\2\36"+
    "\3\0\1\330\1\0\27\36\5\0\2\36\3\0\1\36"+
    "\1\0\1\36\1\331\25\36\5\0\2\36\3\0\1\36"+
    "\1\0\15\36\1\332\11\36\5\0\2\36\3\0\1\36"+
    "\1\0\7\36\1\333\17\36\5\0\2\36\3\0\1\36"+
    "\1\0\5\36\1\334\21\36\5\0\2\36\3\0\1\36"+
    "\1\0\23\36\1\335\3\36\5\0\2\36\3\0\1\36"+
    "\1\0\10\36\1\336\16\36\5\0\2\36\3\0\1\337"+
    "\1\0\27\36\5\0\2\36\3\0\1\36\1\0\4\36"+
    "\1\340\22\36\5\0\2\36\3\0\1\36\1\0\1\36"+
    "\1\341\25\36\5\0\2\36\3\0\1\36\1\0\17\36"+
    "\1\342\7\36\5\0\2\36\3\0\1\36\1\0\23\36"+
    "\1\343\3\36\5\0\2\36\3\0\1\36\1\0\2\36"+
    "\1\344\24\36\5\0\2\36\3\0\1\36\1\0\1\36"+
    "\1\345\25\36\5\0\2\36\3\0\1\36\1\0\10\36"+
    "\1\346\16\36\5\0\2\36\3\0\1\36\1\0\17\36"+
    "\1\347\7\36\5\0\2\36\3\0\1\36\1\0\11\36"+
    "\1\350\15\36\5\0\2\36\3\0\1\36\1\0\17\36"+
    "\1\351\7\36\5\0\2\36\3\0\1\36\1\0\10\36"+
    "\1\352\16\36\5\0\2\36\3\0\1\353\1\0\27\36"+
    "\5\0\2\36\3\0\1\36\1\0\11\36\1\354\15\36"+
    "\5\0\2\36\3\0\1\355\1\0\27\36\5\0\2\36"+
    "\3\0\1\36\1\0\2\36\1\356\24\36\5\0\2\36"+
    "\3\0\1\36\1\0\11\36\1\357\15\36\5\0\2\36"+
    "\3\0\1\36\1\0\4\36\1\360\22\36\5\0\2\36"+
    "\3\0\1\36\1\0\1\36\1\361\25\36\5\0\2\36"+
    "\3\0\1\36\1\0\2\36\1\362\24\36\5\0\2\36"+
    "\3\0\1\36\1\0\11\36\1\363\15\36\5\0\2\36"+
    "\3\0\1\36\1\0\1\36\1\364\25\36\5\0\2\36"+
    "\3\0\1\36\1\0\7\36\1\365\17\36\5\0\2\36"+
    "\3\0\1\36\1\0\2\36\1\366\24\36\5\0\2\36"+
    "\3\0\1\36\1\0\10\36\1\367\16\36\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6405];
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
    "\1\0\1\11\35\1\2\0\60\1\2\11\2\1\1\0"+
    "\241\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[247];
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
  Yylex(java.io.Reader in) {
  	// TODO: code that goes to constructor
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
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
    while (i < 152) {
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
        case 44: 
          { return sym(WRITE);
          }
        case 68: break;
        case 24: 
          { return sym(VAR);
          }
        case 69: break;
        case 63: 
          { return sym(PROCEDURE);
          }
        case 70: break;
        case 52: 
          { return sym(RECORD);
          }
        case 71: break;
        case 59: 
          { return sym(PROGRAM);
          }
        case 72: break;
        case 56: 
          { return sym(DOWNTO);
          }
        case 73: break;
        case 38: 
          { return sym(UNIT);
          }
        case 74: break;
        case 53: 
          { return sym(OBJECT);
          }
        case 75: break;
        case 43: 
          { return sym(LABEL);
          }
        case 76: break;
        case 25: 
          { return sym(FOR);
          }
        case 77: break;
        case 32: 
          { return sym(TRUE);
          }
        case 78: break;
        case 31: 
          { return sym(TEST);
          }
        case 79: break;
        case 19: 
          { return sym(NIL);
          }
        case 80: break;
        case 42: 
          { return sym(BEGIN);
          }
        case 81: break;
        case 34: 
          { return sym(TYPE);
          }
        case 82: break;
        case 4: 
          { return sym(NUMERO_INTEIRO, yytext());
          }
        case 83: break;
        case 39: 
          { return sym(USES);
          }
        case 84: break;
        case 26: 
          { return sym(XOR);
          }
        case 85: break;
        case 36: 
          { return sym(CASE);
          }
        case 86: break;
        case 57: 
          { return sym(DOUBLE);
          }
        case 87: break;
        case 20: 
          { return sym(SET);
          }
        case 88: break;
        case 27: 
          { return sym(ELSE);
          }
        case 89: break;
        case 58: 
          { return sym(FOWARD);
          }
        case 90: break;
        case 1: 
          { return sym(ANY);
          }
        case 91: break;
        case 33: 
          { return sym(THEN);
          }
        case 92: break;
        case 10: 
          { return sym(DO);
          }
        case 93: break;
        case 3: 
          { return sym(IDENTIFICADOR, yytext());
          }
        case 94: break;
        case 41: 
          { return sym(ARRAY);
          }
        case 95: break;
        case 65: 
          { return sym(DESTRUCTOR);
          }
        case 96: break;
        case 22: 
          { return sym(SHL);
          }
        case 97: break;
        case 8: 
          { return sym(IF);
          }
        case 98: break;
        case 37: 
          { return sym(CHAR);
          }
        case 99: break;
        case 35: 
          { return sym(WITH);
          }
        case 100: break;
        case 67: 
          { return sym(IMPLEMENTATION);
          }
        case 101: break;
        case 62: 
          { return sym(FUNCTION);
          }
        case 102: break;
        case 5: 
          { return sym(OR);
          }
        case 103: break;
        case 7: 
          { return sym(IN);
          }
        case 104: break;
        case 66: 
          { return sym(CONSTRUCTOR);
          }
        case 105: break;
        case 12: 
          { return sym(DIFERENTE);
          }
        case 106: break;
        case 45: 
          { return sym(WHILE);
          }
        case 107: break;
        case 11: 
          { return sym(ATRIBUICAO);
          }
        case 108: break;
        case 55: 
          { return sym(STRING);
          }
        case 109: break;
        case 47: 
          { return sym(UNTIL);
          }
        case 110: break;
        case 29: 
          { return sym(READ);
          }
        case 111: break;
        case 14: 
          { return sym(END);
          }
        case 112: break;
        case 50: 
          { return sym(PACKED);
          }
        case 113: break;
        case 51: 
          { return sym(REPEAT);
          }
        case 114: break;
        case 49: 
          { return sym(FLOAT);
          }
        case 115: break;
        case 28: 
          { return sym(REAL);
          }
        case 116: break;
        case 40: 
          { return sym(FILE);
          }
        case 117: break;
        case 30: 
          { return sym(GOTO);
          }
        case 118: break;
        case 21: 
          { return sym(SHR);
          }
        case 119: break;
        case 18: 
          { return sym(NOT);
          }
        case 120: break;
        case 15: 
          { return sym(AND);
          }
        case 121: break;
        case 16: 
          { return sym(ASM);
          }
        case 122: break;
        case 23: 
          { return sym(DIV);
          }
        case 123: break;
        case 64: 
          { return sym(INTERFACE);
          }
        case 124: break;
        case 17: 
          { return sym(MOD);
          }
        case 125: break;
        case 54: 
          { return sym(INLINE);
          }
        case 126: break;
        case 46: 
          { return sym(CONST);
          }
        case 127: break;
        case 6: 
          { return sym(OF);
          }
        case 128: break;
        case 61: 
          { return sym(INTEGER);
          }
        case 129: break;
        case 9: 
          { return sym(TO);
          }
        case 130: break;
        case 60: 
          { return sym(BOOLEAN);
          }
        case 131: break;
        case 48: 
          { return sym(FALSE);
          }
        case 132: break;
        case 13: 
          { return sym(NUMERO_REAL, yytext());
          }
        case 133: break;
        case 2: 
          { 
          }
        case 134: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}