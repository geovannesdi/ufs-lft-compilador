/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalvarAbrirArquivo;

import java.io.File;

import javax.swing.JFileChooser;

import static javax.swing.UIManager.get;
import static oracle.jrockit.jfr.JFR.get;

/**
 *
 * @author Alan
 */
public class Salvar {

    public Salvar() {

    }


    public ManterTexto ManterTexto(JFileChooser _jfc_arquivos, File caminho) {
        Class<? extends Salvar> aClass = getClass();
        {
            return new ManterTexto(_jfc_arquivos,caminho);
        }
    
    }
}
