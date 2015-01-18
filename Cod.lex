
package jflex;

import java_cup.runtime.*;
import java.io.IOException;

import jflex.CodSym;
import static jflex.CodSym.*;

//Aqui coloca o que a pessoa quer que apareca no código.

%%

%class CodLex

%unicode
%line
%column

// %public
%final
// %abstract

%cupsym jflex.CodSym
%cup
// %cupdebug

%init{
	// TODO: code that goes to constructor
%init}

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
identificador		=	{caracter}+ (({caracter} | {digito} | _)*)


%%

"PROGRAM"				{	return sym(PROGRAM); 								}
"BEGIN"				    {	return sym(BEGIN);     								}
"THEN"					{	return sym(THEN);     								}
"ELSE"				    {	return sym(ELSE);     								}
"END"				    {	return sym(END);     								}
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
"XOR"					{	return sym(XOR);     								}
{identificador}			{	return sym(IDENTIFICADOR, yytext());				}
