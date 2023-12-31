/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.controller.LivroController;
import br.ulbra.model.Livro;
import br.ulbra.utils.Utils;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class FRUpdLivros extends javax.swing.JDialog {

    /**
     * Creates new form JTUpdLivros
     */
    public FRUpdLivros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    
    private int pk;

    public void setPkLivro(int pk) {
        this.pk = pk;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtGen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLançamento = new javax.swing.JTextField();
        bdVoltar = new javax.swing.JToggleButton();
        chkAtivo = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        bdExcluir = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bdAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/livros.png"))); // NOI18N
        jLabel1.setText("Livros");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Nome");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Gênero");

        txtGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Data de Lançamento");

        txtLançamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLançamentoActionPerformed(evt);
            }
        });

        bdVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/back.png"))); // NOI18N
        bdVoltar.setText("CANCELAR");
        bdVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bdVoltarMouseClicked(evt);
            }
        });
        bdVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdVoltarActionPerformed(evt);
            }
        });

        chkAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAtivoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("No Estoque");

        bdExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bdExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/trash.png"))); // NOI18N
        bdExcluir.setText("Excluir");
        bdExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bdExcluirMouseClicked(evt);
            }
        });
        bdExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdExcluirActionPerformed(evt);
            }
        });

        txtCodigo.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Codigo");

        bdAlterar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bdAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/edit.png"))); // NOI18N
        bdAlterar.setText("Alterar");
        bdAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bdAlterarMouseClicked(evt);
            }
        });
        bdAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtGen)
                        .addComponent(jLabel3)
                        .addComponent(txtNome)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtLançamento, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkAtivo)
                            .addGap(41, 41, 41))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bdExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1)
                                .addComponent(bdAlterar))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bdVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(14, 14, 14)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtGen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtLançamento, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAtivo, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bdExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private boolean verificarCampos() {
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "campo 'Nome' em branco");
            return false;
        }
        if (!txtNome.getText().matches("^[\\p{L}0-9 ]+$")) {
            JOptionPane.showMessageDialog(null, "campo 'Nome' possui caracteres inválidos");
            return false;
        }

        if (txtGen.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "campo 'Gênero' em branco");
            return false;
        }

        if (!txtLançamento.getText().matches("^[0-9]{2}/[0-9]{2}/[0-9]{4}$")) {
            JOptionPane.showMessageDialog(null, "campo 'Lançamento' inválido."
                    + "Ex: 01/01/2000");
            return false;
        }
        return true;
    }

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenActionPerformed

    private void txtLançamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLançamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLançamentoActionPerformed

    private void bdVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdVoltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_bdVoltarMouseClicked

    private void bdVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bdVoltarActionPerformed

    private void chkAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAtivoActionPerformed

    private void bdExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdExcluirMouseClicked
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja excluir o livro?",
                "confirmação", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            LivroController controller = new LivroController();
            if (controller.excluirLivro(pk)) {
                this.dispose();
            }
        }
    }//GEN-LAST:event_bdExcluirMouseClicked

    private void bdExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bdExcluirActionPerformed

    private void bdAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdAlterarMouseClicked
        if (!verificarCampos()) {
            return;
        }
        LivroController controller = new LivroController();
        Livro livro = new Livro();
        livro.setPkLivro(pk);
        livro.setNomeLivro(txtNome.getText());
        livro.setGenLivro(txtGen.getText());
        livro.setEstoqueLivro(Utils.salvarBoolean(chkAtivo.isSelected()));
        livro.setLançLivro(txtLançamento.getText());
        if (controller.alterarLivro(livro)) {
            this.dispose();

        }
        

        
    }//GEN-LAST:event_bdAlterarMouseClicked

    private void bdAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bdAlterarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FRUpdLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRUpdLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRUpdLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRUpdLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FRUpdLivros dialog = new FRUpdLivros(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bdAlterar;
    private javax.swing.JButton bdExcluir;
    private javax.swing.JToggleButton bdVoltar;
    private javax.swing.JCheckBox chkAtivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtGen;
    private javax.swing.JTextField txtLançamento;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
