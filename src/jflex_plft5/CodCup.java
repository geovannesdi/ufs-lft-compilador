
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Thu Jan 29 16:35:54 GMT-03:00 2015
//----------------------------------------------------

package jflex_plft5;

import java.io.*;
import java_cup.runtime.*;
import java.util.ArrayList;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Thu Jan 29 16:35:54 GMT-03:00 2015
  */
public class CodCup extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public CodCup() {super();}

  /** Constructor which sets the default scanner. */
  public CodCup(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public CodCup(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\006\000\002\002\006\000\002\002\004\000\002\007" +
    "\004\000\002\007\004\000\002\007\004\000\002\007\005" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\020\000\004\005\005\001\002\000\004\002\022\001" +
    "\002\000\004\126\006\001\002\000\004\107\007\001\002" +
    "\000\004\006\013\001\002\000\004\107\021\001\002\000" +
    "\004\107\020\001\002\000\004\002\001\001\002\000\002" +
    "\001\002\000\004\107\015\001\002\000\004\002\uffff\001" +
    "\002\000\004\011\017\001\002\000\004\002\ufffc\001\002" +
    "\000\004\002\ufffe\001\002\000\004\002\ufffd\001\002\000" +
    "\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\020\000\004\002\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\012\003\013\004\010" +
    "\005\007\007\011\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\006\015\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$CodCup$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$CodCup$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$CodCup$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	
	
	
	
	public static void main(String args[]) throws Exception{
		//new parser(new Yylex(new FileInputStream(args[0]))).parse();
		new CodCup(new CodLex(System.in)).parse();
	}
	
		
	public void syntax_error(Symbol s){
	    
	    String resul = "Erro de Sintaica. Linha: " + (s.right + 1) + " Coluna: " + s.left + ". Texto: \"" + s.value + "\"";				
		Jflex.resul.add(resul);
		report_error(resul,null);
		
	}
	
	
	

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$CodCup$actions {


    String resul="";
          

  private final CodCup parser;

  /** Constructor */
  CUP$CodCup$actions(CodCup parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$CodCup$do_action(
    int                        CUP$CodCup$act_num,
    java_cup.runtime.lr_parser CUP$CodCup$parser,
    java.util.Stack            CUP$CodCup$stack,
    int                        CUP$CodCup$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$CodCup$result;

      /* select the action based on the action number */
      switch (CUP$CodCup$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // bloco ::= BEGIN comandos END 
            {
              Object RESULT =null;

              CUP$CodCup$result = parser.getSymbolFactory().newSymbol("bloco",5, ((java_cup.runtime.Symbol)CUP$CodCup$stack.elementAt(CUP$CodCup$top-2)), ((java_cup.runtime.Symbol)CUP$CodCup$stack.peek()), RESULT);
            }
          return CUP$CodCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // bloco ::= variavel PV 
            {
              Object RESULT =null;

              CUP$CodCup$result = parser.getSymbolFactory().newSymbol("bloco",5, ((java_cup.runtime.Symbol)CUP$CodCup$stack.elementAt(CUP$CodCup$top-1)), ((java_cup.runtime.Symbol)CUP$CodCup$stack.peek()), RESULT);
            }
          return CUP$CodCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // bloco ::= tipo PV 
            {
              Object RESULT =null;

              CUP$CodCup$result = parser.getSymbolFactory().newSymbol("bloco",5, ((java_cup.runtime.Symbol)CUP$CodCup$stack.elementAt(CUP$CodCup$top-1)), ((java_cup.runtime.Symbol)CUP$CodCup$stack.peek()), RESULT);
            }
          return CUP$CodCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // bloco ::= constante PV 
            {
              Object RESULT =null;

              CUP$CodCup$result = parser.getSymbolFactory().newSymbol("bloco",5, ((java_cup.runtime.Symbol)CUP$CodCup$stack.elementAt(CUP$CodCup$top-1)), ((java_cup.runtime.Symbol)CUP$CodCup$stack.peek()), RESULT);
            }
          return CUP$CodCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= programPascal EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$CodCup$stack.elementAt(CUP$CodCup$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$CodCup$stack.elementAt(CUP$CodCup$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$CodCup$stack.elementAt(CUP$CodCup$top-1)).value;
		RESULT = start_val;
              CUP$CodCup$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$CodCup$stack.elementAt(CUP$CodCup$top-1)), ((java_cup.runtime.Symbol)CUP$CodCup$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$CodCup$parser.done_parsing();
          return CUP$CodCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // programPascal ::= PROGRAM IDENTIFICADOR PV bloco 
            {
              Object RESULT =null;

              CUP$CodCup$result = parser.getSymbolFactory().newSymbol("programPascal",0, ((java_cup.runtime.Symbol)CUP$CodCup$stack.elementAt(CUP$CodCup$top-3)), ((java_cup.runtime.Symbol)CUP$CodCup$stack.peek()), RESULT);
            }
          return CUP$CodCup$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

