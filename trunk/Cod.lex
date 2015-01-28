
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

%eofval{
	return new Symbol(EOF,new String("Fin del archivo"));
%eofval}

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
%state STRING, COMENTARIOS

caracter			=	[a-zA-Z]
digito				=	[0-9]
identificador		=	(({caracter} | _)+({caracter} | {digito} | _)*|;)
delimitador		 	= 	[\ \n\t\r]+										 //espaco, enter, tabulacao ...
numero_inteiro 		= 	[+\-]?{digito}+
numero_real			= 	{digito}+(\.{digito}+)?(e[+\-]?{digito}+)?
writeread 			=  	"("[^")"]*[^";"]*")" 							//ignora o que esta dentro write

%%

"PROGRAM"				{	return new Symbol (PROGRAM, yychar, yyline, yytext()); 								}
"BEGIN"				    {	return new Symbol (BEGIN,yychar, yyline, yytext());     								}
"THEN"					{	return new Symbol(THEN,yychar, yyline, yytext());     								}
"ELSE"				    {	return sym(ELSE);     								}
"END"				    {	return new Symbol(END,yychar, yyline, yytext());     								}
"DOWNTO"				{	return sym(DOWNTO); 								}
"IN"				    {	return sym(IN);     								}
"PACKED"				{	return sym(PACKED);     							}
"TO"					{	return sym(TO); 									}
"ARRAY"				    {	return sym(ARRAY);     								}
"VAR"					{	return sym(VAR); 									}
"INLINE"				{	return sym(INLINE); 								}
"PROCEDURE"				{	return sym(PROCEDURE);     							}
"TYPE"					{	return sym(TYPE);     								}
"ASM"					{	return sym(ASM); 									}
"INTERFACE"				{	return sym(INTERFACE);     							}
"UNIT"					{	return sym(UNIT); 									}
"FILE"				    {	return sym(FILE);     								}
"LABEL"					{	return sym(LABEL);     								}
"RECORD"				{	return sym(RECORD); 								}
"UNTIL"				    {	return sym(UNTIL);     								}
"CASE"				    {	return sym(CASE);     								}
"FOR"					{	return sym(FOR); 									}
"MOD"				    {	return sym(MOD);     								}
"REPEAT"				{	return sym(REPEAT);     							}
"IF"				    {	return sym(IF);     								}
"CONST"					{	return sym(CONST); 									}
"FOWARD"				{	return sym(FOWARD);     							}
"NIL"				    {	return sym(NIL);     								}
"SET"					{	return sym(SET); 									}
"USES"				    {	return sym(USES);     								}
"AND"				    {	return sym(AND);     								}
"CONSTRUCTOR"			{	return sym(CONSTRUCTOR);     						}
"FUNCTION"				{	return sym(FUNCTION); 								}
"NOT"				    {	return sym(NOT);     								}
"SHL"				    {	return sym(SHL);     								}
"DESTRUCTOR"			{	return sym(DESTRUCTOR);     						}
"GOTO"					{	return sym(GOTO);     								}
"OBJECT"				{	return sym(OBJECT); 								}
"SHR"				    {	return sym(SHR);     								}
"WHILE"				    {	return sym(WHILE);     								}
"DIV"					{	return sym(DIV); 									}
"OF"					{	return sym(OF);     								}
"STRING"				{	return sym(STRING); 								}
"WITH"				    {	return sym(WITH);     								}
"DO"				    {	return sym(DO);     								}
"IMPLEMENTATION"		{	return sym(IMPLEMENTATION); 						}
"OR"				    {	return sym(OR);     								}
"XOR"					{	return sym(XOR);									}
"WRITE"|"WRITELN"		{	return sym(WRITE);     								}
"READ"|"READLN"			{	return sym(READ); 									}
"INTEGER"				{	return sym(INTEGER);     							}
"REAL"					{	return sym(REAL);     								}
"FLOAT"					{	return sym(FLOAT);     								}
"DOUBLE"				{	return sym(DOUBLE);     							}
"BOOLEAN"				{	return sym(BOOLEAN);     							}
"TRUE"					{	return sym(TRUE);     								}
"FALSE"					{	return sym(FALSE);     								}
"CHAR"					{	return sym(CHAR);  								    }
"["						{	return sym(ABRECONCHETE);							}
"]"						{	return sym(FECHACONCHETE);							}
"<"						{	return sym(MENOR_QUE);								}
"<="					{	return sym(MENORIGUAL);								}
"=>"					{	return sym(MAIORIGUAL);								}
">"						{	return sym(MAIOR_QUE);								}
":"						{	return sym(DP);										}
";"						{   return sym(PV);										}
"="						{   return sym(IGUAL);									}
","						{	return sym(VG);										}
"("						{	return sym(AP);										}
")"						{	return sym(FP);										}
"{"						{	return sym(ACHAVE);									}
"}"						{	return sym(FCHAVE);									}
":="					{	return sym(ATRIBUICAO);								}
"|"						{	return sym(PO);										}
"*"						{	return sym(MULT);									}
"/"						{	return sym(DIVR);									}
"+"						{	return sym(SOMA);									}
"-"						{	return sym(SUB);									}
"."						{	return new Symbol (PONTO,yychar, yyline, yytext());									}
"<>"					{	return sym(DIFERENTE);			    				}
{identificador}			{	return sym(IDENTIFICADOR, yytext());				}
{numero_inteiro}		{	return sym(NUMERO_INTEIRO, yytext());				}
{numero_real}			{	return sym(NUMERO_REAL, yytext());			    	}
{delimitador}			{}
{writeread}				{}



