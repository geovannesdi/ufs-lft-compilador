package jflex_plft5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java_cup.runtime.Symbol;


public class Jflex {

    
    public String resultado = null;
    
    

                public String resultado(String enderecoArquivo) throws IOException
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

}
