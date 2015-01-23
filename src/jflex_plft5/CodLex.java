/* The following code was generated by JFlex 1.4.3 on 23/01/15 13:26 */

package jflex_plft5;

import java_cup.runtime.*;
import java.io.IOException;

import jflex_plft5.CodSym;
import static jflex_plft5.CodSym.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 23/01/15 13:26 from the specification file
 * <tt>D:/workspace/ufs-lft-compilador/Cod.lex</tt>
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
    "\11\0\1\3\1\7\2\0\1\3\22\0\1\3\12\0\1\4\1\0"+
    "\1\4\1\5\1\0\12\2\7\0\1\14\1\16\1\27\1\25\1\6"+
    "\1\34\1\13\1\22\1\17\1\35\1\30\1\23\1\15\1\20\1\12"+
    "\1\10\1\1\1\11\1\24\1\21\1\33\1\32\1\26\1\36\1\31"+
    "\1\1\4\0\1\1\1\0\1\14\1\16\1\27\1\25\1\6\1\34"+
    "\1\13\1\22\1\17\1\35\1\30\1\23\1\15\1\20\1\12\1\10"+
    "\1\1\1\11\1\24\1\21\1\33\1\32\1\26\1\36\1\31\1\1"+
    "\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\6\1\1\2\23\1\1\3\1\4\2\0\1\4"+
    "\5\3\1\5\1\3\1\6\10\3\1\7\1\10\3\3"+
    "\1\11\7\3\1\12\20\3\2\13\1\0\1\14\11\3"+
    "\1\15\1\16\1\17\5\3\1\20\1\21\4\3\1\22"+
    "\1\3\1\23\1\24\3\3\1\25\6\3\1\26\3\3"+
    "\1\27\5\3\1\30\1\31\4\3\1\32\1\33\2\3"+
    "\1\34\6\3\1\35\1\36\1\37\6\3\1\40\2\3"+
    "\1\41\1\42\1\43\1\3\1\44\2\3\1\45\10\3"+
    "\1\46\1\47\5\3\1\50\4\3\1\51\1\52\1\53"+
    "\1\54\1\3\1\55\1\56\3\3\1\57\1\60\1\61"+
    "\1\62\4\3\1\63\1\64\1\3\1\65\1\66\1\3"+
    "\1\67\1\3\1\70\1\3\1\71\2\3\1\72\10\3"+
    "\1\73\1\74\1\3\1\75\3\3\1\76\2\3\1\77"+
    "\2\3\1\100";

  private static int [] zzUnpackAction() {
    int [] result = new int[240];
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
    "\0\0\0\37\0\76\0\135\0\174\0\233\0\272\0\174"+
    "\0\331\0\370\0\u0117\0\u0136\0\u0155\0\u0174\0\u0193\0\u01b2"+
    "\0\u01d1\0\u01f0\0\u020f\0\u022e\0\u024d\0\u026c\0\u028b\0\u02aa"+
    "\0\u02c9\0\u02e8\0\u0307\0\76\0\135\0\u0326\0\u0345\0\233"+
    "\0\u0364\0\u0383\0\u03a2\0\u03c1\0\u03e0\0\76\0\u03ff\0\76"+
    "\0\u041e\0\u043d\0\u045c\0\u047b\0\u049a\0\u04b9\0\u04d8\0\u04f7"+
    "\0\u0516\0\76\0\u0535\0\u0554\0\u0573\0\76\0\u0592\0\u05b1"+
    "\0\u05d0\0\u05ef\0\u060e\0\u062d\0\u064c\0\u066b\0\u068a\0\u06a9"+
    "\0\u06c8\0\u06e7\0\u0706\0\u0725\0\u0744\0\u0763\0\u0782\0\u07a1"+
    "\0\u07c0\0\u07df\0\u07fe\0\u081d\0\u083c\0\u085b\0\u087a\0\u0899"+
    "\0\u0899\0\76\0\u08b8\0\u08d7\0\u08f6\0\u0915\0\u0934\0\u0953"+
    "\0\u0972\0\u0991\0\u09b0\0\76\0\76\0\76\0\u09cf\0\u09ee"+
    "\0\u0a0d\0\u0a2c\0\u0a4b\0\76\0\76\0\u0a6a\0\u0a89\0\u0aa8"+
    "\0\u0ac7\0\76\0\u0ae6\0\76\0\76\0\u0b05\0\u0b24\0\u0b43"+
    "\0\76\0\u0b62\0\u0b81\0\u0ba0\0\u0bbf\0\u0bde\0\u0bfd\0\76"+
    "\0\u0c1c\0\u0c3b\0\u0c5a\0\76\0\u0c79\0\u0c98\0\u0cb7\0\u0cd6"+
    "\0\u0cf5\0\76\0\76\0\u0d14\0\u0d33\0\u0d52\0\u0d71\0\76"+
    "\0\76\0\u0d90\0\u0daf\0\76\0\u0dce\0\u0ded\0\u0e0c\0\u0e2b"+
    "\0\u0e4a\0\u0e69\0\76\0\76\0\76\0\u0e88\0\u0ea7\0\u0ec6"+
    "\0\u0ee5\0\u0f04\0\u0f23\0\76\0\u0f42\0\u0f61\0\76\0\76"+
    "\0\76\0\u0f80\0\76\0\u0f9f\0\u0fbe\0\76\0\u0fdd\0\u0ffc"+
    "\0\u101b\0\u103a\0\u1059\0\u1078\0\u1097\0\u10b6\0\76\0\76"+
    "\0\u10d5\0\u10f4\0\u1113\0\u1132\0\u1151\0\76\0\u1170\0\u118f"+
    "\0\u11ae\0\u11cd\0\76\0\76\0\u11ec\0\76\0\u120b\0\76"+
    "\0\76\0\u122a\0\u1249\0\u1268\0\76\0\76\0\76\0\76"+
    "\0\u1287\0\u12a6\0\u12c5\0\u12e4\0\76\0\76\0\u1303\0\76"+
    "\0\76\0\u1322\0\76\0\u1341\0\76\0\u1360\0\76\0\u137f"+
    "\0\u139e\0\76\0\u13bd\0\u13dc\0\u13fb\0\u141a\0\u1439\0\u1458"+
    "\0\u1477\0\u1496\0\76\0\76\0\u14b5\0\76\0\u14d4\0\u14f3"+
    "\0\u1512\0\76\0\u1531\0\u1550\0\76\0\u156f\0\u158e\0\76";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[240];
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
    "\2\3\1\30\1\31\1\32\1\3\1\33\40\0\2\34"+
    "\3\0\1\34\1\0\27\34\2\0\1\35\2\0\1\36"+
    "\1\37\33\0\1\10\3\0\1\10\31\0\1\40\35\0"+
    "\2\34\3\0\1\34\1\0\10\34\1\41\2\34\1\42"+
    "\13\34\1\0\2\34\3\0\1\34\1\0\1\34\1\43"+
    "\2\34\1\44\22\34\1\0\2\34\3\0\1\45\1\0"+
    "\27\34\1\0\2\34\3\0\1\34\1\0\1\34\1\46"+
    "\4\34\1\47\15\34\1\50\2\34\1\0\2\34\3\0"+
    "\1\34\1\0\2\34\1\51\24\34\1\0\2\34\3\0"+
    "\1\34\1\0\1\34\1\52\6\34\1\53\3\34\1\54"+
    "\12\34\1\0\2\34\3\0\1\34\1\0\2\34\1\55"+
    "\24\34\1\0\2\34\3\0\1\56\1\0\2\34\1\57"+
    "\24\34\1\0\2\34\3\0\1\34\1\0\5\34\1\60"+
    "\2\34\1\61\13\34\1\62\2\34\1\0\2\34\3\0"+
    "\1\34\1\0\2\34\1\63\4\34\1\64\17\34\1\0"+
    "\2\34\3\0\1\34\1\0\1\34\1\65\1\66\7\34"+
    "\1\67\6\34\1\70\5\34\1\0\2\34\3\0\1\34"+
    "\1\0\4\34\1\71\22\34\1\0\2\34\3\0\1\72"+
    "\1\0\11\34\1\73\1\74\14\34\1\0\2\34\3\0"+
    "\1\75\1\0\2\34\1\76\4\34\1\77\17\34\1\0"+
    "\2\34\3\0\1\34\1\0\1\34\1\100\5\34\1\101"+
    "\2\34\1\102\14\34\1\0\2\34\3\0\1\34\1\0"+
    "\2\34\1\103\1\34\1\104\5\34\1\105\14\34\1\0"+
    "\2\34\3\0\1\34\1\0\4\34\1\106\22\34\1\0"+
    "\2\34\3\0\1\34\1\0\10\34\1\107\3\34\1\110"+
    "\12\34\1\0\2\34\3\0\1\34\1\0\2\34\1\111"+
    "\1\34\1\112\2\34\1\113\3\34\1\114\7\34\1\115"+
    "\3\34\1\0\2\34\3\0\1\34\1\0\2\34\1\116"+
    "\24\34\2\0\1\117\36\0\1\120\1\0\1\121\33\0"+
    "\2\34\3\0\1\34\1\0\15\34\1\122\11\34\1\0"+
    "\2\34\3\0\1\34\1\0\14\34\1\123\12\34\1\0"+
    "\2\34\3\0\1\34\1\0\2\34\1\124\24\34\1\0"+
    "\2\34\3\0\1\34\1\0\17\34\1\125\7\34\1\0"+
    "\2\34\3\0\1\34\1\0\1\126\3\34\1\127\12\34"+
    "\1\130\7\34\1\0\2\34\3\0\1\34\1\0\25\34"+
    "\1\131\1\34\1\0\2\34\3\0\1\34\1\0\11\34"+
    "\1\132\15\34\1\0\2\34\3\0\1\34\1\0\1\34"+
    "\1\133\25\34\1\0\2\34\3\0\1\34\1\0\15\34"+
    "\1\134\11\34\1\0\2\34\3\0\1\34\1\0\5\34"+
    "\1\135\21\34\1\0\2\34\3\0\1\34\1\0\15\34"+
    "\1\136\11\34\1\0\2\34\3\0\1\34\1\0\3\34"+
    "\1\137\23\34\1\0\2\34\3\0\1\34\1\0\2\34"+
    "\1\140\24\34\1\0\2\34\3\0\1\34\1\0\1\141"+
    "\26\34\1\0\2\34\3\0\1\34\1\0\11\34\1\142"+
    "\1\34\1\143\13\34\1\0\2\34\3\0\1\34\1\0"+
    "\11\34\1\144\15\34\1\0\2\34\3\0\1\34\1\0"+
    "\13\34\1\145\13\34\1\0\2\34\3\0\1\34\1\0"+
    "\23\34\1\146\3\34\1\0\2\34\3\0\1\147\1\0"+
    "\27\34\1\0\2\34\3\0\1\34\1\0\1\150\26\34"+
    "\1\0\2\34\3\0\1\34\1\0\6\34\1\151\20\34"+
    "\1\0\2\34\3\0\1\34\1\0\11\34\1\152\15\34"+
    "\1\0\2\34\3\0\1\34\1\0\1\34\1\153\25\34"+
    "\1\0\2\34\3\0\1\34\1\0\1\34\1\154\11\34"+
    "\1\155\13\34\1\0\2\34\3\0\1\34\1\0\14\34"+
    "\1\156\12\34\1\0\2\34\3\0\1\34\1\0\16\34"+
    "\1\157\4\34\1\160\3\34\1\0\2\34\3\0\1\34"+
    "\1\0\22\34\1\161\4\34\1\0\2\34\3\0\1\34"+
    "\1\0\7\34\1\162\17\34\1\0\2\34\3\0\1\34"+
    "\1\0\11\34\1\163\15\34\1\0\2\34\3\0\1\34"+
    "\1\0\7\34\1\164\17\34\1\0\2\34\3\0\1\34"+
    "\1\0\10\34\1\165\16\34\1\0\2\34\3\0\1\34"+
    "\1\0\14\34\1\166\12\34\1\0\2\34\3\0\1\34"+
    "\1\0\4\34\1\167\22\34\1\0\2\34\3\0\1\34"+
    "\1\0\1\34\1\170\25\34\1\0\2\34\3\0\1\34"+
    "\1\0\7\34\1\171\1\34\1\172\15\34\1\0\2\34"+
    "\3\0\1\173\1\0\27\34\1\0\2\34\3\0\1\34"+
    "\1\0\1\34\1\174\14\34\1\175\10\34\1\0\2\34"+
    "\3\0\1\34\1\0\13\34\1\176\13\34\1\0\2\34"+
    "\3\0\1\34\1\0\13\34\1\177\13\34\1\0\2\34"+
    "\3\0\1\34\1\0\2\34\1\200\24\34\1\0\2\34"+
    "\3\0\1\34\1\0\10\34\1\201\16\34\1\0\2\34"+
    "\3\0\1\34\1\0\1\34\1\202\25\34\2\0\1\117"+
    "\3\0\1\37\32\0\1\120\35\0\2\34\3\0\1\203"+
    "\1\0\27\34\1\0\2\34\3\0\1\34\1\0\3\34"+
    "\1\204\13\34\1\205\7\34\1\0\2\34\3\0\1\34"+
    "\1\0\20\34\1\206\6\34\1\0\2\34\3\0\1\207"+
    "\1\0\27\34\1\0\2\34\3\0\1\34\1\0\13\34"+
    "\1\210\1\34\1\211\11\34\1\0\2\34\3\0\1\34"+
    "\1\0\2\34\1\212\24\34\1\0\2\34\3\0\1\213"+
    "\1\0\27\34\1\0\2\34\3\0\1\34\1\0\2\34"+
    "\1\214\24\34\1\0\2\34\3\0\1\34\1\0\4\34"+
    "\1\215\22\34\1\0\2\34\3\0\1\34\1\0\7\34"+
    "\1\216\17\34\1\0\2\34\3\0\1\34\1\0\13\34"+
    "\1\217\13\34\1\0\2\34\3\0\1\34\1\0\13\34"+
    "\1\220\13\34\1\0\2\34\3\0\1\221\1\0\27\34"+
    "\1\0\2\34\3\0\1\34\1\0\7\34\1\222\17\34"+
    "\1\0\2\34\3\0\1\223\1\0\27\34\1\0\2\34"+
    "\3\0\1\34\1\0\10\34\1\224\16\34\1\0\2\34"+
    "\3\0\1\225\1\0\27\34\1\0\2\34\3\0\1\226"+
    "\1\0\27\34\1\0\2\34\3\0\1\34\1\0\7\34"+
    "\1\227\17\34\1\0\2\34\3\0\1\34\1\0\11\34"+
    "\1\230\15\34\1\0\2\34\3\0\1\34\1\0\10\34"+
    "\1\231\16\34\1\0\2\34\3\0\1\34\1\0\6\34"+
    "\1\232\20\34\1\0\2\34\3\0\1\34\1\0\11\34"+
    "\1\233\15\34\1\0\2\34\3\0\1\34\1\0\12\34"+
    "\1\234\14\34\1\0\2\34\3\0\1\34\1\0\13\34"+
    "\1\235\13\34\1\0\2\34\3\0\1\34\1\0\14\34"+
    "\1\236\12\34\1\0\2\34\3\0\1\237\1\0\27\34"+
    "\1\0\2\34\3\0\1\34\1\0\1\34\1\240\25\34"+
    "\1\0\2\34\3\0\1\34\1\0\11\34\1\241\15\34"+
    "\1\0\2\34\3\0\1\34\1\0\7\34\1\242\17\34"+
    "\1\0\2\34\3\0\1\34\1\0\14\34\1\243\12\34"+
    "\1\0\2\34\3\0\1\34\1\0\4\34\1\244\22\34"+
    "\1\0\2\34\3\0\1\34\1\0\14\34\1\245\12\34"+
    "\1\0\2\34\3\0\1\246\1\0\27\34\1\0\2\34"+
    "\3\0\1\34\1\0\4\34\1\247\22\34\1\0\2\34"+
    "\3\0\1\34\1\0\17\34\1\250\7\34\1\0\2\34"+
    "\3\0\1\34\1\0\1\34\1\251\25\34\1\0\2\34"+
    "\3\0\1\252\1\0\27\34\1\0\2\34\3\0\1\253"+
    "\1\0\27\34\1\0\2\34\3\0\1\34\1\0\4\34"+
    "\1\254\22\34\1\0\2\34\3\0\1\34\1\0\1\34"+
    "\1\255\25\34\1\0\2\34\3\0\1\34\1\0\17\34"+
    "\1\256\7\34\1\0\2\34\3\0\1\34\1\0\21\34"+
    "\1\257\5\34\1\0\2\34\3\0\1\34\1\0\10\34"+
    "\1\260\16\34\1\0\2\34\3\0\1\261\1\0\27\34"+
    "\1\0\2\34\3\0\1\262\1\0\27\34\1\0\2\34"+
    "\3\0\1\34\1\0\1\34\1\263\1\34\1\264\23\34"+
    "\1\0\2\34\3\0\1\34\1\0\10\34\1\265\16\34"+
    "\1\0\2\34\3\0\1\34\1\0\13\34\1\266\13\34"+
    "\1\0\2\34\3\0\1\34\1\0\10\34\1\267\16\34"+
    "\1\0\2\34\3\0\1\34\1\0\1\34\1\270\25\34"+
    "\1\0\2\34\3\0\1\34\1\0\11\34\1\271\15\34"+
    "\1\0\2\34\3\0\1\34\1\0\13\34\1\272\13\34"+
    "\1\0\2\34\3\0\1\273\1\0\27\34\1\0\2\34"+
    "\3\0\1\274\1\0\27\34\1\0\2\34\3\0\1\34"+
    "\1\0\11\34\1\275\15\34\1\0\2\34\3\0\1\34"+
    "\1\0\13\34\1\276\13\34\1\0\2\34\3\0\1\34"+
    "\1\0\1\34\1\277\25\34\1\0\2\34\3\0\1\300"+
    "\1\0\27\34\1\0\2\34\3\0\1\34\1\0\11\34"+
    "\1\301\15\34\1\0\2\34\3\0\1\34\1\0\11\34"+
    "\1\302\15\34\1\0\2\34\3\0\1\34\1\0\4\34"+
    "\1\303\22\34\1\0\2\34\3\0\1\34\1\0\15\34"+
    "\1\304\11\34\1\0\2\34\3\0\1\34\1\0\15\34"+
    "\1\305\11\34\1\0\2\34\3\0\1\34\1\0\11\34"+
    "\1\306\15\34\1\0\2\34\3\0\1\34\1\0\15\34"+
    "\1\307\11\34\1\0\2\34\3\0\1\34\1\0\11\34"+
    "\1\310\15\34\1\0\2\34\3\0\1\34\1\0\4\34"+
    "\1\311\22\34\1\0\2\34\3\0\1\34\1\0\5\34"+
    "\1\312\21\34\1\0\2\34\3\0\1\34\1\0\24\34"+
    "\1\313\2\34\1\0\2\34\3\0\1\314\1\0\27\34"+
    "\1\0\2\34\3\0\1\315\1\0\27\34\1\0\2\34"+
    "\3\0\1\34\1\0\3\34\1\316\23\34\1\0\2\34"+
    "\3\0\1\34\1\0\23\34\1\317\3\34\1\0\2\34"+
    "\3\0\1\34\1\0\2\34\1\320\24\34\1\0\2\34"+
    "\3\0\1\321\1\0\27\34\1\0\2\34\3\0\1\34"+
    "\1\0\1\34\1\322\25\34\1\0\2\34\3\0\1\34"+
    "\1\0\15\34\1\323\11\34\1\0\2\34\3\0\1\34"+
    "\1\0\7\34\1\324\17\34\1\0\2\34\3\0\1\34"+
    "\1\0\5\34\1\325\21\34\1\0\2\34\3\0\1\34"+
    "\1\0\23\34\1\326\3\34\1\0\2\34\3\0\1\34"+
    "\1\0\10\34\1\327\16\34\1\0\2\34\3\0\1\330"+
    "\1\0\27\34\1\0\2\34\3\0\1\34\1\0\4\34"+
    "\1\331\22\34\1\0\2\34\3\0\1\34\1\0\1\34"+
    "\1\332\25\34\1\0\2\34\3\0\1\34\1\0\17\34"+
    "\1\333\7\34\1\0\2\34\3\0\1\34\1\0\23\34"+
    "\1\334\3\34\1\0\2\34\3\0\1\34\1\0\2\34"+
    "\1\335\24\34\1\0\2\34\3\0\1\34\1\0\1\34"+
    "\1\336\25\34\1\0\2\34\3\0\1\34\1\0\10\34"+
    "\1\337\16\34\1\0\2\34\3\0\1\34\1\0\17\34"+
    "\1\340\7\34\1\0\2\34\3\0\1\34\1\0\11\34"+
    "\1\341\15\34\1\0\2\34\3\0\1\34\1\0\17\34"+
    "\1\342\7\34\1\0\2\34\3\0\1\34\1\0\10\34"+
    "\1\343\16\34\1\0\2\34\3\0\1\344\1\0\27\34"+
    "\1\0\2\34\3\0\1\34\1\0\11\34\1\345\15\34"+
    "\1\0\2\34\3\0\1\346\1\0\27\34\1\0\2\34"+
    "\3\0\1\34\1\0\2\34\1\347\24\34\1\0\2\34"+
    "\3\0\1\34\1\0\11\34\1\350\15\34\1\0\2\34"+
    "\3\0\1\34\1\0\4\34\1\351\22\34\1\0\2\34"+
    "\3\0\1\34\1\0\1\34\1\352\25\34\1\0\2\34"+
    "\3\0\1\34\1\0\2\34\1\353\24\34\1\0\2\34"+
    "\3\0\1\34\1\0\11\34\1\354\15\34\1\0\2\34"+
    "\3\0\1\34\1\0\1\34\1\355\25\34\1\0\2\34"+
    "\3\0\1\34\1\0\7\34\1\356\17\34\1\0\2\34"+
    "\3\0\1\34\1\0\2\34\1\357\24\34\1\0\2\34"+
    "\3\0\1\34\1\0\10\34\1\360\16\34";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5549];
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
    "\1\0\1\11\33\1\2\0\61\1\1\0\237\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[240];
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
    while (i < 142) {
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
        case 41: 
          { return sym(WRITE);
          }
        case 65: break;
        case 22: 
          { return sym(VAR);
          }
        case 66: break;
        case 60: 
          { return sym(PROCEDURE);
          }
        case 67: break;
        case 49: 
          { return sym(RECORD);
          }
        case 68: break;
        case 56: 
          { return sym(PROGRAM);
          }
        case 69: break;
        case 53: 
          { return sym(DOWNTO);
          }
        case 70: break;
        case 35: 
          { return sym(UNIT);
          }
        case 71: break;
        case 50: 
          { return sym(OBJECT);
          }
        case 72: break;
        case 40: 
          { return sym(LABEL);
          }
        case 73: break;
        case 23: 
          { return sym(FOR);
          }
        case 74: break;
        case 29: 
          { return sym(TRUE);
          }
        case 75: break;
        case 17: 
          { return sym(NIL);
          }
        case 76: break;
        case 39: 
          { return sym(BEGIN);
          }
        case 77: break;
        case 31: 
          { return sym(TYPE);
          }
        case 78: break;
        case 4: 
          { return sym(NUMERO_INTEIRO, yytext());
          }
        case 79: break;
        case 36: 
          { return sym(USES);
          }
        case 80: break;
        case 24: 
          { return sym(XOR);
          }
        case 81: break;
        case 33: 
          { return sym(CASE);
          }
        case 82: break;
        case 54: 
          { return sym(DOUBLE);
          }
        case 83: break;
        case 18: 
          { return sym(SET);
          }
        case 84: break;
        case 25: 
          { return sym(ELSE);
          }
        case 85: break;
        case 55: 
          { return sym(FOWARD);
          }
        case 86: break;
        case 1: 
          { return sym(ANY);
          }
        case 87: break;
        case 30: 
          { return sym(THEN);
          }
        case 88: break;
        case 10: 
          { return sym(DO);
          }
        case 89: break;
        case 3: 
          { return sym(IDENTIFICADOR, yytext());
          }
        case 90: break;
        case 38: 
          { return sym(ARRAY);
          }
        case 91: break;
        case 62: 
          { return sym(DESTRUCTOR);
          }
        case 92: break;
        case 20: 
          { return sym(SHL);
          }
        case 93: break;
        case 8: 
          { return sym(IF);
          }
        case 94: break;
        case 34: 
          { return sym(CHAR);
          }
        case 95: break;
        case 32: 
          { return sym(WITH);
          }
        case 96: break;
        case 64: 
          { return sym(IMPLEMENTATION);
          }
        case 97: break;
        case 59: 
          { return sym(FUNCTION);
          }
        case 98: break;
        case 5: 
          { return sym(OR);
          }
        case 99: break;
        case 7: 
          { return sym(IN);
          }
        case 100: break;
        case 63: 
          { return sym(CONSTRUCTOR);
          }
        case 101: break;
        case 42: 
          { return sym(WHILE);
          }
        case 102: break;
        case 52: 
          { return sym(STRING);
          }
        case 103: break;
        case 44: 
          { return sym(UNTIL);
          }
        case 104: break;
        case 27: 
          { return sym(READ);
          }
        case 105: break;
        case 12: 
          { return sym(END);
          }
        case 106: break;
        case 47: 
          { return sym(PACKED);
          }
        case 107: break;
        case 48: 
          { return sym(REPEAT);
          }
        case 108: break;
        case 46: 
          { return sym(FLOAT);
          }
        case 109: break;
        case 26: 
          { return sym(REAL);
          }
        case 110: break;
        case 37: 
          { return sym(FILE);
          }
        case 111: break;
        case 28: 
          { return sym(GOTO);
          }
        case 112: break;
        case 19: 
          { return sym(SHR);
          }
        case 113: break;
        case 16: 
          { return sym(NOT);
          }
        case 114: break;
        case 13: 
          { return sym(AND);
          }
        case 115: break;
        case 14: 
          { return sym(ASM);
          }
        case 116: break;
        case 21: 
          { return sym(DIV);
          }
        case 117: break;
        case 61: 
          { return sym(INTERFACE);
          }
        case 118: break;
        case 15: 
          { return sym(MOD);
          }
        case 119: break;
        case 51: 
          { return sym(INLINE);
          }
        case 120: break;
        case 43: 
          { return sym(CONST);
          }
        case 121: break;
        case 6: 
          { return sym(OF);
          }
        case 122: break;
        case 58: 
          { return sym(INTEGER);
          }
        case 123: break;
        case 9: 
          { return sym(TO);
          }
        case 124: break;
        case 57: 
          { return sym(BOOLEAN);
          }
        case 125: break;
        case 45: 
          { return sym(FALSE);
          }
        case 126: break;
        case 11: 
          { return sym(NUMERO_REAL, yytext());
          }
        case 127: break;
        case 2: 
          { 
          }
        case 128: break;
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
