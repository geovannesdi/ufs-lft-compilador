package tela_plft5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import SalvarAbrirArquivo.Salvar;
import java.util.logging.Level;
import java.util.logging.Logger;
import jflex_plft5.Teste;

/**
 *
 * @author Anderson Cunha
 * @author Antonio Douglas
 * @author Erivan Santana 
 * @author Geovanne Barreto
 *         
 */
public class AppTela extends javax.swing.JFrame {

    /**
     * Creates new form AppTela
     */  
	
	Salvar salvar;
        File _caminho;

	
    private int contadorPagina;
    public AppTela() {
        initComponents();
        contadorPagina=1;
        initTabComponent(0);
        salvar = new Salvar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jfc_arquivos = new javax.swing.JFileChooser();
        jToolBar1 = new javax.swing.JToolBar();
        jBNovoArquivo = new javax.swing.JButton();
        jBNovoProjeto = new javax.swing.JButton();
        jBAbrirProjeto = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jBALexico = new javax.swing.JButton();
        jBASintatico = new javax.swing.JButton();
        jBASemantico = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jBVoltar = new javax.swing.JButton();
        jBExecutar = new javax.swing.JButton();
        jBAvancar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAErros = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMINovo = new javax.swing.JMenuItem();
        jMIAbrir = new javax.swing.JMenuItem();
        jMNovo = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMAjuda = new javax.swing.JMenu();
        jMSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alpha");

        jToolBar1.setRollover(true);

        jBNovoArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/PNG-24/Create.png"))); // NOI18N
        jBNovoArquivo.setText("Novo");
        jBNovoArquivo.setBorder(null);
        jBNovoArquivo.setFocusable(false);
        jBNovoArquivo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBNovoArquivo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBNovoArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoArquivoActionPerformed(evt);
            }
        });
        jToolBar1.add(jBNovoArquivo);

        jBNovoProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/PNG-24/Software.png"))); // NOI18N
        jBNovoProjeto.setText("Novo Projeto");
        jBNovoProjeto.setFocusable(false);
        jBNovoProjeto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBNovoProjeto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBNovoProjeto);

        jBAbrirProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/PNG-24/Documents.png"))); // NOI18N
        jBAbrirProjeto.setText("Abrir Projeto");
        jBAbrirProjeto.setFocusable(false);
        jBAbrirProjeto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAbrirProjeto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBAbrirProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAbrirProjetoActionPerformed(evt);
            }
        });
        jToolBar1.add(jBAbrirProjeto);

        jBSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/PNG-24/Save.png"))); // NOI18N
        jBSalvar.setText("salvar");
        jBSalvar.setFocusable(false);
        jBSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBSalvar);
        jToolBar1.add(jSeparator2);

        jBALexico.setText("Analizador Lexico");
        jBALexico.setFocusable(false);
        jBALexico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBALexico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBALexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBALexicoActionPerformed(evt);
            }
        });
        jToolBar1.add(jBALexico);

        jBASintatico.setText("Analizador Sintatico");
        jBASintatico.setFocusable(false);
        jBASintatico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBASintatico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBASintatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBASintaticoActionPerformed(evt);
            }
        });
        jToolBar1.add(jBASintatico);

        jBASemantico.setText("Analizador Semantico");
        jBASemantico.setFocusable(false);
        jBASemantico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBASemantico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBASemantico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBASemanticoActionPerformed(evt);
            }
        });
        jToolBar1.add(jBASemantico);
        jToolBar1.add(jSeparator3);

        jBVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/PNG-24/Left.png"))); // NOI18N
        jBVoltar.setText("Voltar");
        jBVoltar.setFocusable(false);
        jBVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBVoltar);

        jBExecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/PNG-24/Shield.png"))); // NOI18N
        jBExecutar.setText("Executar");
        jBExecutar.setFocusable(false);
        jBExecutar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBExecutar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExecutarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBExecutar);

        jBAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/PNG-24/Next.png"))); // NOI18N
        jBAvancar.setText("Avançar");
        jBAvancar.setFocusable(false);
        jBAvancar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAvancar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBAvancar);

        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jTabbedPane2.addTab("novo 1", jScrollPane4);

        jTAErros.setEditable(false);
        jTAErros.setColumns(20);
        jTAErros.setForeground(new java.awt.Color(255, 0, 51));
        jTAErros.setRows(5);
        jTAErros.setBorder(javax.swing.BorderFactory.createTitledBorder("Erros:"));
        jScrollPane1.setViewportView(jTAErros);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Arquivos");

        jMINovo.setText("Novo");
        jMINovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMINovoActionPerformed(evt);
            }
        });
        jMenu1.add(jMINovo);

        jMIAbrir.setText("Abrir");
        jMenu1.add(jMIAbrir);

        jMenuBar1.add(jMenu1);

        jMNovo.setText("Novo");
        jMenuBar1.add(jMNovo);

        jMenu6.setText("Abrir");
        jMenuBar1.add(jMenu6);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Configurações");
        jMenuBar1.add(jMenu3);

        jMAjuda.setText("Ajuda");
        jMenuBar1.add(jMAjuda);

        jMSobre.setText("Sobre");
        jMSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMSobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMINovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMINovoActionPerformed
    	
    }//GEN-LAST:event_jMINovoActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
    	_caminho=salvar.ManterTexto(jfc_arquivos,_caminho).salvarArquivoJanela(jTextArea4.getText());
        jTabbedPane2.setTitleAt(0,_caminho.getName());
        this.setTitle(_caminho.getAbsolutePath());
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBNovoArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoArquivoActionPerformed
        //JOptionPane.showMessageDialog(null, "Evento Funcionando");
        String titulo = "novo "+ (++contadorPagina);
        jTabbedPane2.add(new JScrollPane(new JTextArea()),titulo);
        initTabComponent(jTabbedPane2.getTabCount()-1);

    }//GEN-LAST:event_jBNovoArquivoActionPerformed

    private void jMSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMSobreMouseClicked
             JOptionPane.showMessageDialog(null, "Estou no evento");    }//GEN-LAST:event_jMSobreMouseClicked

    private void jBALexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBALexicoActionPerformed
    	
    }//GEN-LAST:event_jBALexicoActionPerformed

    private void jBASintaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBASintaticoActionPerformed
         
    }//GEN-LAST:event_jBASintaticoActionPerformed

    private void jBASemanticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBASemanticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBASemanticoActionPerformed

    private void jBExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExecutarActionPerformed
            try {
                Teste obj = new Teste();
                                    
                jTAErros.setText(obj.resultado(_caminho.getAbsolutePath()));
                
            } catch (IOException ex) {
                Logger.getLogger(AppTela.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jBExecutarActionPerformed

    private void jBAbrirProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAbrirProjetoActionPerformed
       try {
            _caminho =salvar.ManterTexto(jfc_arquivos, _caminho).AbrirArquivo();
            if(_caminho!=null)
            {         
             jTextArea4.read(new FileReader(_caminho.getAbsolutePath()), null);
             jTabbedPane2.setTitleAt(0,_caminho.getName());
             this.setTitle(_caminho.getAbsolutePath());
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBAbrirProjetoActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void initTabComponent(int i) {
        jTabbedPane2.setTabComponentAt(i,
                 new ButtonTabComponent(jTabbedPane2));
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBALexico;
    private javax.swing.JButton jBASemantico;
    private javax.swing.JButton jBASintatico;
    private javax.swing.JButton jBAbrirProjeto;
    private javax.swing.JButton jBAvancar;
    private javax.swing.JButton jBExecutar;
    private javax.swing.JButton jBNovoArquivo;
    private javax.swing.JButton jBNovoProjeto;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JMenu jMAjuda;
    private javax.swing.JMenuItem jMIAbrir;
    private javax.swing.JMenuItem jMINovo;
    private javax.swing.JMenu jMNovo;
    private javax.swing.JMenu jMSobre;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JTextArea jTAErros;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JFileChooser jfc_arquivos;

    // End of variables declaration//GEN-END:variables
}
