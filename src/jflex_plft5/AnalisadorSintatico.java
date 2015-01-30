
package jflex_plft5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java_cup.runtime.Symbol;

import javax.swing.JOptionPane;
public class AnalisadorSintatico {



	    private CodLex lexico;
	    private  Symbol atual;
	    private boolean statusErro;

	    public  AnalisadorSintatico(File file) throws Exception {
			// TODO Auto-generated constructor stub
	    		this.lexico = new CodLex(new FileInputStream(file));
	    		statusErro=false;
	           advance();
	      
	    }
	    
	    
	    
	    public boolean hasNext() {
	        if (atual != null) {
	            return true;
	        }
	        return false;
	    }

	    void advance() throws IOException {
	            atual=lexico.next_token();
	    	if (atual.sym == CodSym.EOF) {
	            
	               System.out.println("FIM");
	        }
	    
	    }
        
	    void fimArquivo(int token)
	    {
	    	
	    	if(statusErro)
	    		JOptionPane.showMessageDialog(null,"erro...");
	        else
	          	JOptionPane.showMessageDialog(null,"Analisa feita com Sucesso");
	    	
	    }
	    void eat(int token) throws IOException {
	        
	    	if (token==atual.sym) {
	            advance();
	        }else
	        {
	            JOptionPane.showConfirmDialog(null, "erro sintatico!!!");
	          statusErro=true;	
	        }
	        
	    }
   //validar estrutura do program
	  public  void S() throws Exception {
	        if (atual != null) {
	            switch (atual.sym) {
	                case CodSym.PROGRAM: {
	                	eat(CodSym.PROGRAM);
	                	eat(CodSym.IDENTIFICADOR);
	                    eat(CodSym.PV);
	                    V();
	                    fimArquivo(atual.sym);
	                    break;
	                }
	                default: {
	                    JOptionPane.showConfirmDialog(null, "OPERADOR LOGICO : [" + atual.toString() + "] NÃO ENCONTRADO!!!");
	                    break;
	                }
	            }
	        }
	    }
        
	    void V() throws Exception {
	        if (atual != null) {
	            switch (atual.sym) {
	               
	                case CodSym.VAR: {
	                	eat(CodSym.VAR);
	                    I();
	                    if(statusErro)
	                    	break;
	                    eat(CodSym.DP);
	                    eat(CodSym.STRING);
	                    eat(CodSym.PV);
	                    I();
	                    eat(CodSym.DP);
	                    eat(CodSym.STRING);
	                    eat(CodSym.PV);
	                   break;
	                }
	                
	                
	            
	            }
	            }
	    }
	    //identificadores
	    void I() throws Exception
	    {
	    	  if (atual != null) {
		            switch (atual.sym) {
		               
		                case CodSym.IDENTIFICADOR:
		                {
		                	eat(CodSym.IDENTIFICADOR);
		                    while(atual.sym== CodSym.VG)
		                    {
		                	   eat(CodSym.VG);
		                	   eat(CodSym.IDENTIFICADOR);
		                    }   
		                    
		                   break;
		                }
		              
		        	            
		        }
	    	
	    	
	    	
	    	
	    }
	    /*
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    void TO() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case F_CHAVE: {
	                    return;
	                }
	                case WHILE: {
	                    eat(Token.WHILE);
	                    eat(Token.A_PARENTESE);
	                    E();
	                    eat(Token.F_PARENTESE);
	                    STATEMENT();
	                    TO();
	                    break;
	                }
	                case ID: {
	                    eat(Token.ID);
	                    ID();
	                    TO();
	                    break;
	                }
	                case IF: {
	                    eat(Token.IF);
	                    eat(Token.A_PARENTESE);
	                    E();
	                    eat(Token.F_PARENTESE);
	                    IF_INTERNO();
	                    TO();
	                    break;
	                }
	                case FOR: {
	                    FOR();
	                    TO();
	                    break;
	                }
	            }
	        }
	    }

	    //Valida OPERADOR_LOGICO
	    void MICROEXP() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case ID: {

	                    break;
	                }
	            }
	        }
	    }

	    void NOINTATRIBUICAO() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case NUMERO: {
	                    eat(Token.NUMERO);

	                    break;
	                }
	                case ID: {
	                    eat(Token.ID);

	                    break;
	                }

	                default: {
	                    JOptionPane.showConfirmDialog(null, "INFORMACAO [" + atual.toString() + "] NAO SE ENCAIXA!!!");
	                    break;
	                }
	            }
	        }

	    }

	    void NOIN() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case PRIMITIVO: {
	                    eat(Token.PRIMITIVO);
	                    NOIN2();
	                    NOIN3();

	                    break;
	                }
	            }
	        }

	    }

	    void NOIN2() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case OPERADOR_ATRIBUICAO: {
	                    eat(Token.OPERADOR_ATRIBUICAO);
	                    NOINTATRIBUICAO();

	                    break;
	                }
	                case PONTO_VIRGULA: {
	                    break;
	                }
	                default: {
	                    JOptionPane.showConfirmDialog(null, "INFORMACAO [" + atual.toString() + "] NAO SE ENCAIXA!!!");
	                    break;
	                }

	            }
	        }
	    }

	    void NOIN3() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case VIRGULA: {
	                    eat(Token.VIRGULA);
	                    NOIN();
	                    break;
	                }
	            }
	        }
	    }

	    void NOIN4() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case PONTO_VIRGULA: {
	                    break;
	                }
	                default: {
	                    E();
	                    break;
	                }
	            }
	        }
	    }

	    void NOIN5() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case F_PARENTESE: {
	                    break;
	                }
	                default: {
	                    E();
	                    break;
	                }
	            }
	        }
	    }

	    void FOR() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case FOR: {
	                    eat(Token.FOR);
	                    eat(Token.A_PARENTESE);
	                    NOIN();

	                    eat(Token.PONTO_VIRGULA);

	                    NOIN4();

	                    eat(Token.PONTO_VIRGULA);
	                    NOIN5();
	                    eat(Token.F_PARENTESE);

	                    STATEMENT();

	                    break;
	                }
	            }
	        }

	    }

	    void E() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case OPERADOR_BOOLEANO: {
	                    eat(Token.OPERADOR_BOOLEANO);
	                    E2();
	                    break;
	                }

	                case ID: {
	                    eat(Token.ID);

	                    E2();

	                    break;
	                }

	                case NUMERO: {
	                    eat(Token.NUMERO);
	                    eat(Token.OPERADOR_LOGICO);
	                    E3();
	                    E2();
	                    break;
	                }

	                case A_PARENTESE: {
	                    eat(Token.A_PARENTESE);
	                    E();
	                    eat(Token.F_PARENTESE);
	                    EXP_OPCIONAL();
	                    break;
	                }
	                default: {
	                    JOptionPane.showConfirmDialog(null, "OPERADOR LOGICO : [" + atual.toString() + "] NÃO ENCONTRADO!!!");
	                    break;
	                }
	            }
	        }
	    }

	    // Ajuda o Metodo E e E2 A Valida OPERADOR_LOGICO USANDO EM CASOS DE ENCONTRAR ID OU OPERADOR_BOOLEANO
	    void E2() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case F_PARENTESE: {
	                    return;
	                }
	                case OPERADOR_LOGICO: {
	                    eat(Token.OPERADOR_LOGICO);
	                    E3();
	                    E2();
	                    break;
	                }
	            }
	        }
	    }

	    // Ajuda o Metodo E e E2 A Valida OPERADOR_LOGICO
	    void E3() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case NUMERO: {
	                    eat(Token.NUMERO);
	                    break;
	                }
	                case ID: {
	                    eat(Token.ID);
	                    break;
	                }
	                case OPERADOR_BOOLEANO: {
	                    eat(Token.OPERADOR_BOOLEANO);
	                    break;
	                }
	            }
	        }
	    }

	    void EXP_OPCIONAL() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case F_PARENTESE: {
	                    return;
	                }
	                case OPERADOR_LOGICO: {
	                    eat(Token.OPERADOR_LOGICO);
	                    E();
	                    break;
	                }
	            }
	        }
	    }

	    void UNICO() throws IOException {
	        if (atual != null) {
	            switch (atual) {

	                case WHILE: {
	                    eat(Token.WHILE);
	                    eat(Token.A_PARENTESE);
	                    E();
	                    eat(Token.F_PARENTESE);
	                    STATEMENT();
	                    TO();
	                    break;
	                }
	                case ID: {
	                    eat(Token.ID);
	                    ID();
	                    TO();
	                    break;
	                }
	                case IF: {
	                    eat(Token.IF);
	                    eat(Token.A_PARENTESE);
	                    E();
	                    eat(Token.F_PARENTESE);
	                    IF_INTERNO();
	                    TO();
	                    break;
	                }
	                case FOR: {
	                    FOR();
	                    TO();
	                    break;
	                }
	                default: {
	                    JOptionPane.showConfirmDialog(null, "OPERADOR LOGICO : [" + atual.toString() + "] NÃO ENCONTRADO!!!");
	                    break;
	                }
	            }
	        }
	    }

	    void STATEMENT() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case A_CHAVE: {
	                    eat(Token.A_CHAVE);
	                    TO();
	                    eat(Token.F_CHAVE);
	                    break;
	                }
	                default: {
	                    UNICO();
	                    break;
	                }

	            }
	        }
	    }

	    void IF_INTERNO() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case A_CHAVE: {
	                    eat(Token.A_CHAVE);
	                    TO();
	                    eat(Token.F_CHAVE);
	                    ELSE();
	                    break;
	                }
	                default: {
	                    UNICO();
	                    ELSE();
	                    break;
	                }

	            }
	        }
	    }

	    void ELSE() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case ELSE: {
	                    eat(Token.ELSE);
	                    STATEMENT();
	                    break;
	                }
	            }
	        }
	    }

	    void F() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case ID: {
	                    eat(Token.ID);
	                    F1();
	                    break;
	                }
	            }
	        }
	    }

	    void F1() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case VIRGULA: {
	                    eat(Token.VIRGULA);
	                    eat(Token.ID);
	                    F1();
	                    break;
	                }
	            }
	        }
	    }

	    void CONTINUAR_ID() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case OPERADOR_ARITMETICO: {
	                    eat(Token.OPERADOR_ARITMETICO);
	                    ID2();
	                    break;

	                }

	            }
	        }
	    }

	    void ID() throws IOException {
	        if (atual != null) {
	            switch (atual) {

	                case A_PARENTESE: {
	                    eat(Token.A_PARENTESE);
	                    F();
	                    eat(Token.F_PARENTESE);

	                    VIRG();
	                    break;
	                }
	                case PONTO_VIRGULA: {
	                    eat(Token.PONTO_VIRGULA);
	                    break;
	                }
	                case OPERADOR_ATRIBUICAO_ESPECIAL: {
	                    eat(Token.OPERADOR_ATRIBUICAO_ESPECIAL);
	                    VIRG();
	                    break;
	                }
	                case OPERADOR_ATRIBUICAO_DESLOCAMENTO: {
	                    eat(Token.OPERADOR_ATRIBUICAO_DESLOCAMENTO);
	                    ID2();
	                    break;
	                }
	                case OPERADOR_ATRIBUICAO: {
	                    eat(Token.OPERADOR_ATRIBUICAO);
	                    ID2();
	                    break;
	                }
	            }
	        }
	    }
	// SEMENTE PARA GARANTE O PONTO E VIRGULA, O MESMO AS VEZES NÃO EH OBRIGATORIO

	    void VIRG() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case PONTO_VIRGULA: {
	                    eat(Token.PONTO_VIRGULA);
	                    break;
	                }
	            }
	        }
	    }

	    void ID2() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case A_PARENTESE: {
	                    eat(Token.A_PARENTESE);
	                    ID2();
	                    eat(Token.F_PARENTESE);
	                    CONTINUAR_ID();
	                    VIRG();
	                    break;
	                }
	                case ID: {
	                    eat(Token.ID);
	                    ID3();
	                    break;
	                }
	                case NUMERO: {
	                    eat(Token.NUMERO);
	                    ID3();
	                    break;
	                }
	                default: {
	                    JOptionPane.showConfirmDialog(null, "OPERADOR ARITMETICO :" + atual.toString() + " NÃO ENCONTRADO!!!");
	                    break;
	                }
	            }
	        }
	    }

	    void ID3() throws IOException {
	        if (atual != null) {
	            switch (atual) {
	                case PONTO_VIRGULA: {
	                    eat(Token.PONTO_VIRGULA);
	                    break;
	                }
	                case OPERADOR_ARITMETICO: {
	                    eat(Token.OPERADOR_ARITMETICO);
	                    ID2();
	                    break;
	                }
	            }
	        }
	    }
	}
	
	
	*/
	
	    }
	
}
