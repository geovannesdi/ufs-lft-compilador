package jflex_plft5;

import java_cup.runtime.*;
import java.io.IOException;

import jflex_plft5.CodSym;
import static jflex_plft5.CodSym.*;

%%

%class CodLex

%unicode
%line
%column
%ignorecase

// %public
%final
// %abstract

%cupsym jflex_plft5.CodSym
%cup
// %cupdebug

%init{
	// TODO: code that goes to constructor
%init}
/*
%eofval{
	return new Symbol(EOF,new String("Fin del archivo"));
%eofval}
*/
%{
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
%}
%state  COMENTARIOS

caracter			=	[a-zA-Z]
digito				=	[0-9]
identificador		=	(({caracter} | _)+({caracter} | {digito} | _)*|;)
delimitador		 	= 	[\ \n\t\r]+										 //espaco, enter, tabulacao ...
numero_inteiro 		= 	[+\-]?{digito}+
numero_real			= 	{digito}+(\.{digito}+)?(e[+\-]?{digito}+)?
writeread 			=  	"("[^")"]*[^";"]*")" 							//ignora o que esta dentro write

%%

"PROGRAM"				{	return new Symbol(PROGRAM, yychar, yyline, yytext()); 								}
"BEGIN"				    {	return new Symbol(BEGIN,yychar, yyline, yytext());     							    }
"THEN"					{	return new Symbol(THEN,yychar, yyline, yytext());     								}
"ELSE"				    {	return new Symbol(ELSE,yychar, yyline, yytext());     								}
"END"				    {	return new Symbol(END,yychar, yyline, yytext());    								}
"DOWNTO"				{	return new Symbol(DOWNTO,yychar, yyline, yytext());    								}
"IN"				    {	return new Symbol(IN,yychar, yyline, yytext());    								    }
"PACKED"				{	return new Symbol(PACKED,yychar, yyline, yytext());     							}
"TO"					{	return new Symbol(TO,yychar, yyline, yytext());    								    }
"ARRAY"				    {	return new Symbol(ARRAY,yychar, yyline, yytext());    								}
"VAR"					{	return new Symbol(VAR,yychar, yyline, yytext());    								}
"INLINE"				{	return new Symbol(INLINE,yychar, yyline, yytext());    								}
"PROCEDURE"				{	return new Symbol(PROCEDURE,yychar, yyline, yytext());    						    }
"TYPE"					{	return new Symbol(TYPE,yychar, yyline, yytext());     								}
"ASM"					{	return new Symbol(ASM,yychar, yyline, yytext()); 									}
"INTERFACE"				{	return new Symbol(INTERFACE,yychar, yyline, yytext());     							}
"UNIT"					{	return new Symbol(UNIT,yychar, yyline, yytext()); 									}
"FILE"				    {	return new Symbol(FILE,yychar, yyline, yytext());     								}
"LABEL"					{	return new Symbol(LABEL,yychar, yyline, yytext());     								}
"RECORD"				{	return new Symbol(RECORD,yychar, yyline, yytext()); 								}
"UNTIL"				    {	return new Symbol(UNTIL,yychar, yyline, yytext());     								}
"CASE"				    {	return new Symbol(CASE,yychar, yyline, yytext());     								}
"FOR"					{	return new Symbol(FOR,yychar, yyline, yytext()); 									}
"MOD"				    {	return new Symbol(MOD,yychar, yyline, yytext());     								}
"REPEAT"				{	return new Symbol(REPEAT,yychar, yyline, yytext());     							}
"IF"				    {	return new Symbol(IF,yychar, yyline, yytext());     								}
"CONST"					{	return new Symbol(CONST,yychar, yyline, yytext()); 									}
"FOWARD"				{	return new Symbol(FOWARD,yychar, yyline, yytext());     							}
"NIL"				    {	return new Symbol(NIL,yychar, yyline, yytext());     								}
"SET"					{	return new Symbol(SET,yychar, yyline, yytext()); 									}
"USES"				    {	return new Symbol(USES,yychar, yyline, yytext());     								}
"AND"				    {	return new Symbol(AND,yychar, yyline, yytext());     								}
"CONSTRUCTOR"			{	return new Symbol(CONSTRUCTOR,yychar, yyline, yytext());     						}
"FUNCTION"				{	return new Symbol(FUNCTION,yychar, yyline, yytext()); 								}
"NOT"				    {	return new Symbol(NOT,yychar, yyline, yytext());     								}
"SHL"				    {	return new Symbol(SHL,yychar, yyline, yytext());     								}
"DESTRUCTOR"			{	return new Symbol(DESTRUCTOR,yychar, yyline, yytext());     						}
"GOTO"					{	return new Symbol(GOTO,yychar, yyline, yytext());     								}
"OBJECT"				{	return new Symbol(OBJECT,yychar, yyline, yytext()); 								}
"SHR"				    {	return new Symbol(SHR,yychar, yyline, yytext());     								}
"WHILE"				    {	return new Symbol(WHILE,yychar, yyline, yytext());     								}
"DIV"					{	return new Symbol(DIV,yychar, yyline, yytext()); 									}
"OF"					{	return new Symbol(OF,yychar, yyline, yytext());     								}
"STRING"				{	return new Symbol(STRING,yychar, yyline, yytext()); 								}
"WITH"				    {	return new Symbol(WITH,yychar, yyline, yytext());     								}
"DO"				    {	return new Symbol(DO,yychar, yyline, yytext());     								}
"IMPLEMENTATION"		{	return new Symbol(IMPLEMENTATION,yychar, yyline, yytext()); 						}
"OR"				    {	return new Symbol(OR,yychar, yyline, yytext());     								}
"XOR"					{	return new Symbol(XOR,yychar, yyline, yytext());									}
"WRITE"|"WRITELN"		{	return new Symbol(WRITE,yychar, yyline, yytext());     								}
"READ"|"READLN"			{	return new Symbol(READ,yychar, yyline, yytext()); 									}
"INTEGER"				{	return new Symbol(INTEGER,yychar, yyline, yytext());     							}
"REAL"					{	return new Symbol(REAL,yychar, yyline, yytext());     								}
"FLOAT"					{	return new Symbol(FLOAT,yychar, yyline, yytext());     								}
"DOUBLE"				{	return new Symbol(DOUBLE,yychar, yyline, yytext());     							}
"BOOLEAN"				{	return new Symbol(BOOLEAN,yychar, yyline, yytext());     							}
"TRUE"					{	return new Symbol(TRUE,yychar, yyline, yytext());     								}
"FALSE"					{	return new Symbol(FALSE,yychar, yyline, yytext());     								}
"CHAR"					{	return new Symbol(CHAR,yychar, yyline, yytext());  								    }
"["						{	return new Symbol(ABRECONCHETE,yychar, yyline, yytext());							}
"]"						{	return new Symbol(FECHACONCHETE,yychar, yyline, yytext());							}
"<"						{	return new Symbol(MENOR_QUE,yychar, yyline, yytext());								}
"<="					{	return new Symbol(MENORIGUAL,yychar, yyline, yytext());								}
"=>"					{	return new Symbol(MAIORIGUAL,yychar, yyline, yytext());								}
">"						{	return new Symbol(MAIOR_QUE,yychar, yyline, yytext());								}
":"						{	return new Symbol(DP,yychar, yyline, yytext());										}
";"						{   return new Symbol(PV,yychar, yyline, yytext());										}
"="						{   return new Symbol(IGUAL,yychar, yyline, yytext());									}
","						{	return new Symbol(VG,yychar, yyline, yytext());										}
"("						{	return new Symbol(AP,yychar, yyline, yytext());										}
")"						{	return new Symbol(FP,yychar, yyline, yytext());										}
"{"						{	return new Symbol(ACHAVE,yychar, yyline, yytext());									}
"}"						{	return new Symbol(FCHAVE,yychar, yyline, yytext());									}
":="					{	return new Symbol(ATRIBUICAO,yychar, yyline, yytext());								}
"|"						{	return new Symbol(PO,yychar, yyline, yytext());										}
"*"						{	return new Symbol(MULT,yychar, yyline, yytext());									}
"/"						{	return new Symbol(DIVR,yychar, yyline, yytext());									}
"+"						{	return new Symbol(SOMA,yychar, yyline, yytext());									}
"-"						{	return new Symbol(SUB,yychar, yyline, yytext());									}
"."						{	return new Symbol(PONTO,yychar, yyline, yytext());	                                }
"<>"					{	return new Symbol(DIFERENTE,yychar, yyline, yytext());			    				}
{identificador}			{	return new Symbol(IDENTIFICADOR,yychar, yyline, yytext());				            }
{numero_inteiro}		{	return new Symbol(NUMERO_INTEIRO,yychar, yyline, yytext());				            }
{numero_real}			{	return new Symbol(NUMERO_REAL,yychar, yyline, yytext());			    	        }
{delimitador}			{}
{writeread}				{}



