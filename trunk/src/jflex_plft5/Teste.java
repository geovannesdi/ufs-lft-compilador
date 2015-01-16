package jflex_plft5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java_cup.runtime.Symbol;


public class Teste {

	public void setarTexto(String entrada) {
			
		try {
		
			CodLex lexico = new CodLex(new FileInputStream(new File("lft-ufs-teste-arquivo.txt")));
			Symbol token = lexico.next_token();
			while(token.sym != CodLex.YYEOF){
				System.out.println(token.sym + " - " + token.value.toString());
				token = lexico.next_token();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}
}