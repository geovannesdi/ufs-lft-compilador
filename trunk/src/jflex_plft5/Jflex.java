package jflex_plft5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;

import java_cup.runtime.Symbol;


public class Jflex {

    
    public String resultado = null;
    private CodLex lexico;
    
    

                public String resultadoLexico(String enderecoArquivo) throws IOException
                {
                    
                                    
                    resultado="";   
                    CodLex lexico = new CodLex(new FileInputStream(new File(enderecoArquivo)));
                                                Symbol token = lexico.next_token();
                                                
                                                while(token.sym !=0)
                                                {
                                                        resultado += (token.sym + " - " + token.value.toString())+"\n";
                                                        token = lexico.next_token();
                                                }
                        return resultado;
                }

                
                public static void main(String[] args) {
                    // TODO code application logic here
                    try {
                        CodCup sintatico = new CodCup(new CodLex(new StringReader("dfds")));
                        sintatico.parse();
                    }
                    catch(Exception e) { System.out.println(e.getMessage());}
                }



}
