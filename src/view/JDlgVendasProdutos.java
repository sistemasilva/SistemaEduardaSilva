/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import bean.EcsProduto;
import bean.EcsVendasProdutos;
import dao.ProdutoDAO;
import java.util.List;
import tools.Util;

/**
 *
 * @author u05578596207
 */
public class JDlgVendasProdutos extends javax.swing.JDialog {

    JDlgVendas jDlgVendas;
    private boolean incluir;
    public JDlgVendasProdutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Vendas produtos");
        setLocationRelativeTo(null);
        jTxtQuantidade.setText("1");
        ProdutoDAO produtosDAO = new ProdutoDAO();
        List lista = (List) produtosDAO.listAll();
        for (Object object : lista) {
            jCboProdutos.addItem((EcsProduto) object);
        }
        Util.habilitar(false, jTxtValorUnitario, jTxtTotal);
    }

    public void setTelaAnterior(JDlgVendas jDlgVendas, EcsVendasProdutos vendasProd) {
        this.jDlgVendas = jDlgVendas;
        if (vendasProd != null) {
            incluir = false;
            jCboProdutos.setSelectedItem(vendasProd.getEcsProduto());
            jTxtQuantidade.setText(Util.intToStr(vendasProd.getEcsQuantidade()));
        } else {
            incluir = true;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCboProdutos = new javax.swing.JComboBox<EcsProduto>();
        jLabel2 = new javax.swing.JLabel();
        jTxtQuantidade = new javax.swing.JTextField();
        jTxtValorUnitario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jBtnOk = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Produtos");

        jCboProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboProdutosActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantidade");

        jTxtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtQuantidadeKeyReleased(evt);
            }
        });

        jTxtValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtValorUnitarioActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor Unitário");

        jLabel4.setText("Total");

        jBtnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); // NOI18N
        jBtnOk.setText("OK");
        jBtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOkActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jCboProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnOk)
                                .addGap(40, 40, 40)
                                .addComponent(jBtnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jTxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCboProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnOk)
                    .addComponent(jBtnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOkActionPerformed
        EcsVendasProdutos vendasProdutos = new EcsVendasProdutos();
        vendasProdutos.setEcsProduto((EcsProduto) jCboProdutos.getSelectedItem());
        vendasProdutos.setEcsQuantidade(Util.strToInt(jTxtQuantidade.getText()));
        vendasProdutos.setEcsValorUnitario(Util.strToDouble(jTxtValorUnitario.getText()));
        jDlgVendas.controllerVenProd.addBean(vendasProdutos);
        setVisible(false);
    }//GEN-LAST:event_jBtnOkActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jTxtValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtValorUnitarioActionPerformed

    private void jTxtQuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtQuantidadeKeyReleased
        if (jTxtQuantidade.getText().isEmpty() == false) {
            EcsProduto rpsProdutos = (EcsProduto) jCboProdutos.getSelectedItem();
            int quant = Util.strToInt(jTxtQuantidade.getText());
            jTxtTotal.setText(Util.doubleToStr(quant * rpsProdutos.getEcsValorUnitario()));
        } else {
            Util.limpar(jTxtTotal);
        }
    }//GEN-LAST:event_jTxtQuantidadeKeyReleased

    private void jCboProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboProdutosActionPerformed
        EcsProduto produtos = (EcsProduto) jCboProdutos.getSelectedItem();
        jTxtValorUnitario.setText(Util.doubleToStr(produtos.getEcsValorUnitario()));
        int quant = Util.strToInt(jTxtQuantidade.getText());
        jTxtTotal.setText(Util.doubleToStr(quant * produtos.getEcsValorUnitario()));
    }//GEN-LAST:event_jCboProdutosActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVendasProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendasProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendasProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendasProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVendasProdutos dialog = new JDlgVendasProdutos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnOk;
    private javax.swing.JComboBox<EcsProduto> jCboProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTxtQuantidade;
    private javax.swing.JTextField jTxtTotal;
    private javax.swing.JTextField jTxtValorUnitario;
    // End of variables declaration//GEN-END:variables
}
