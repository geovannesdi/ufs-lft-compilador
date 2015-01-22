/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalvarAbrirArquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ManterTexto {

    JFileChooser _jfc_arquivos;
    File _caminhoArquivoAberto = null;

    protected ManterTexto(JFileChooser jfc_arquivos, File caminho) {
        _jfc_arquivos = jfc_arquivos;
        _caminhoArquivoAberto = caminho;
    }

    public File salvarArquivoJanela(String texto) {
        String caminho = " ";
        File arquivo = null;

        int retorno = _jfc_arquivos.showSaveDialog(null); // showSaveDialog retorna um inteiro , e ele ira determinar que o chooser será para salvar.
        if (retorno == JFileChooser.APPROVE_OPTION) {
            caminho = _jfc_arquivos.getSelectedFile().getAbsolutePath();  // o getSelectedFile pega o arquivo e o getAbsolutePath retorna uma string contendo o endereço.
        }

        arquivo = new File(caminho + ".txt"); // o +".txt" é para ele salvar como txt . Para outro tipo de arquivo, mude a extensao final. se você nao mudar a extensao, ele vai criar como ".bin"

        //System.out.println(_caminhoArquivoAberto);
        try {
            StringBuilder stringb;

            FileWriter escrever = new FileWriter(arquivo, true);
            BufferedWriter adicionar = new BufferedWriter(escrever);

            //System.out.println("aki");
            ArrayList<StringBuilder> linhas = new ArrayList<StringBuilder>();

            adicionar.write(texto);

            adicionar.newLine();

            adicionar.close();
            escrever.close();
            return arquivo;
            //System.out.println("passou não");
        } catch (IOException e) {
            e.printStackTrace();
            return arquivo;
        }
        
    }

    public File AbrirArquivo() {
        FileReader fr = null;
        File file = null;
        int returnVal = _jfc_arquivos.showOpenDialog(this._jfc_arquivos);
        // seleciona pra salvar ou abrir
        if (returnVal == _jfc_arquivos.APPROVE_OPTION) {
            file = _jfc_arquivos.getSelectedFile();
            // if ("java".equals("java")) {
        
            System.out.print(file);
            System.out.println(file);
            System.out.println("problem accessing file" + file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }
        return file;
    }

   

}
