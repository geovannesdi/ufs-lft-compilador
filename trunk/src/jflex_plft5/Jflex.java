package jflex_plft5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import javax.swing.SingleSelectionModel;
import java_cup.runtime.Symbol;

/**
*
* @author Anderson Cunha
* @author Antonio Douglas
* @author Erivan Santana 
* @author Geovanne Barreto
*         
*/

public class Jflex {

	public static ArrayList<String> resul = new ArrayList<>();
	public String resultado;
	private String enderecoArquivo;
	private CodLex lexico;
	private CodCup sintatico;
	private ArrayList<Symbol> aToken, aSintatico;

	public Jflex() {

		lexico = null;
		sintatico = null;
		aToken = null;
		aSintatico = null;
		enderecoArquivo = "";

	}

	public static void errorSintatico(String resul) {

		Jflex.resul.add(resul);

	}

	public String resultadoLexico(File file) throws IOException {

		resultado = "";

		lexico = new CodLex(new FileInputStream(file));
		aToken = new ArrayList<>();
		Symbol token = lexico.next_token();
		aToken.add(token);
		while (token.sym != 0) {
			resultado += (token.sym + " - " + token.value.toString()) + "\n";
			token = lexico.next_token();
			aToken.add(token);
		}
		return resultado;
	}

	public void resultadoSintatico(String enderecoArquivo) throws Exception {
		lexico = new CodLex(new FileInputStream(new File(enderecoArquivo)));
		sintatico = new CodCup(lexico);

		sintatico.parse();

	}

}