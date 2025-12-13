/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import java.awt.Color;

/**
 *
 * @author u05578596207
 */
public class JFrmPrincipal extends javax.swing.JFrame {

    public JFrmPrincipal() {
        initComponents();
        setTitle("Sistema");
        setExtendedState(MAXIMIZED_BOTH);
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jBinCliente = new javax.swing.JButton();
        jBtnProd = new javax.swing.JButton();
        jBtnVendedor = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jBtnClientePesquisaer = new javax.swing.JButton();
        jBtnVendasPesquisae = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMnuCadastros = new javax.swing.JMenu();
        jMnuProduto = new javax.swing.JMenuItem();
        jMnuVendedor = new javax.swing.JMenuItem();
        jMnuCliente = new javax.swing.JMenuItem();
        jMnuUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMnuSair = new javax.swing.JMenuItem();
        jMnuMovimentos = new javax.swing.JMenu();
        jMnuVendas = new javax.swing.JMenuItem();
        jMnuConsultas = new javax.swing.JMenu();
        jMnuConsutlaClientes = new javax.swing.JMenuItem();
        jMnuConsutlaVendedor = new javax.swing.JMenuItem();
        jMnuConsutlaProdutos = new javax.swing.JMenuItem();
        jMnuConsutlaVendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jBinCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jBinCliente.setFocusable(false);
        jBinCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBinCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBinCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinClienteActionPerformed(evt);
            }
        });
        jToolBar1.add(jBinCliente);

        jBtnProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produtos.png"))); // NOI18N
        jBtnProd.setFocusable(false);
        jBtnProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnProd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnProdActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnProd);

        jBtnVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vendedora.png"))); // NOI18N
        jBtnVendedor.setFocusable(false);
        jBtnVendedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnVendedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVendedorActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnVendedor);
        jToolBar1.add(jSeparator2);

        jBtnClientePesquisaer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jBtnClientePesquisaer.setFocusable(false);
        jBtnClientePesquisaer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnClientePesquisaer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnClientePesquisaer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClientePesquisaerActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnClientePesquisaer);

        jBtnVendasPesquisae.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vendas.png"))); // NOI18N
        jBtnVendasPesquisae.setFocusable(false);
        jBtnVendasPesquisae.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnVendasPesquisae.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnVendasPesquisae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVendasPesquisaeActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnVendasPesquisae);

        jMnuCadastros.setMnemonic('c');
        jMnuCadastros.setText("Cadastro");

        jMnuProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMnuProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produtos.png"))); // NOI18N
        jMnuProduto.setMnemonic('p');
        jMnuProduto.setText("Produto");
        jMnuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuProdutoActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuProduto);

        jMnuVendedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMnuVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vendedora.png"))); // NOI18N
        jMnuVendedor.setMnemonic('v');
        jMnuVendedor.setText("Vendedor");
        jMnuVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendedorActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuVendedor);

        jMnuCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMnuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMnuCliente.setMnemonic('c');
        jMnuCliente.setText("Cliente");
        jMnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuClienteActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuCliente);

        jMnuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuário.png"))); // NOI18N
        jMnuUsuarios.setMnemonic('u');
        jMnuUsuarios.setText("Usuário");
        jMnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuariosActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuUsuarios);
        jMnuCadastros.add(jSeparator1);

        jMnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        jMnuSair.setMnemonic('s');
        jMnuSair.setText("Sair");
        jMnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSairActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuSair);

        jMenuBar1.add(jMnuCadastros);

        jMnuMovimentos.setMnemonic('m');
        jMnuMovimentos.setText("Movimento");

        jMnuVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMnuVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vendas.png"))); // NOI18N
        jMnuVendas.setMnemonic('v');
        jMnuVendas.setText("Vendas");
        jMnuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendasActionPerformed(evt);
            }
        });
        jMnuMovimentos.add(jMnuVendas);

        jMenuBar1.add(jMnuMovimentos);

        jMnuConsultas.setText("Consulta");

        jMnuConsutlaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMnuConsutlaClientes.setText("Clientes");
        jMnuConsutlaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuConsutlaClientesActionPerformed(evt);
            }
        });
        jMnuConsultas.add(jMnuConsutlaClientes);

        jMnuConsutlaVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vendedora.png"))); // NOI18N
        jMnuConsutlaVendedor.setText("Vendedor");
        jMnuConsutlaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuConsutlaVendedorActionPerformed(evt);
            }
        });
        jMnuConsultas.add(jMnuConsutlaVendedor);

        jMnuConsutlaProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produtos.png"))); // NOI18N
        jMnuConsutlaProdutos.setText("Produtos");
        jMnuConsutlaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuConsutlaProdutosActionPerformed(evt);
            }
        });
        jMnuConsultas.add(jMnuConsutlaProdutos);

        jMnuConsutlaVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vendas.png"))); // NOI18N
        jMnuConsutlaVendas.setText("Vendas");
        jMnuConsutlaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuConsutlaVendasActionPerformed(evt);
            }
        });
        jMnuConsultas.add(jMnuConsutlaVendas);

        jMenuBar1.add(jMnuConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 252, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMnuSairActionPerformed

    private void jMnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuariosActionPerformed
        JDlgUsuarios jDlgUsuarios = new JDlgUsuarios(this, true);
        jDlgUsuarios.setVisible(true);
    }//GEN-LAST:event_jMnuUsuariosActionPerformed

    private void jMnuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuClienteActionPerformed
        JDlgCliente jDlgCliente = new JDlgCliente(this, true);
        jDlgCliente.setVisible(true);
    }//GEN-LAST:event_jMnuClienteActionPerformed

    private void jMnuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuProdutoActionPerformed
        JDlgProduto jDlgProduto = new JDlgProduto(this, true);
        jDlgProduto.setVisible(true);
    }//GEN-LAST:event_jMnuProdutoActionPerformed

    private void jMnuVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendedorActionPerformed
        JDlgVendedor jDlgVendedor = new JDlgVendedor(this, true);
        jDlgVendedor.setVisible(true);
    }//GEN-LAST:event_jMnuVendedorActionPerformed

    private void jMnuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendasActionPerformed
        JDlgVendas jDlgVendas = new JDlgVendas(this, true);
        jDlgVendas.setVisible(true);
    }//GEN-LAST:event_jMnuVendasActionPerformed

    private void jBinClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinClienteActionPerformed
        // TODO add your handling code here:
        jMnuClienteActionPerformed(null);
    }//GEN-LAST:event_jBinClienteActionPerformed

    private void jBtnProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnProdActionPerformed
        // TODO add your handling code here:
        jMnuProdutoActionPerformed(evt);
    }//GEN-LAST:event_jBtnProdActionPerformed

    private void jBtnVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVendedorActionPerformed
        // TODO add your handling code here:
        jMnuVendedorActionPerformed(null);
    }//GEN-LAST:event_jBtnVendedorActionPerformed

    private void jBtnClientePesquisaerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClientePesquisaerActionPerformed
        // TODO add your handling code here:
        jMnuConsutlaClientesActionPerformed(null);
    }//GEN-LAST:event_jBtnClientePesquisaerActionPerformed

    private void jMnuConsutlaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuConsutlaClientesActionPerformed
        // TODO add your handling code here:
        JDlgConsultaClientes jDlgCONClientes= new JDlgConsultaClientes(this, true);
        jDlgCONClientes.setVisible(true);
    }//GEN-LAST:event_jMnuConsutlaClientesActionPerformed

    private void jMnuConsutlaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuConsutlaVendedorActionPerformed
        // TODO add your handling code here:
        JDlgConsultaVendedores jDlgVendedores = new JDlgConsultaVendedores(this, true);
        jDlgVendedores.setVisible(true);
    }//GEN-LAST:event_jMnuConsutlaVendedorActionPerformed

    private void jMnuConsutlaVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuConsutlaVendasActionPerformed
        // TODO add your handling code here:
        JDlgConsultaVendas jDlgConsultaVendas = new JDlgConsultaVendas(this, true);
        jDlgConsultaVendas.setVisible(true);
    }//GEN-LAST:event_jMnuConsutlaVendasActionPerformed

    private void jBtnVendasPesquisaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVendasPesquisaeActionPerformed
        // TODO add your handling code here:
        jMnuConsutlaVendasActionPerformed(null);
    }//GEN-LAST:event_jBtnVendasPesquisaeActionPerformed

    private void jMnuConsutlaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuConsutlaProdutosActionPerformed
        // TODO add your handling code here:
        JDlgConsultaProdutos jDlgConsultaProdutos = new JDlgConsultaProdutos(this, true);
        jDlgConsultaProdutos.setVisible(true);
    }//GEN-LAST:event_jMnuConsutlaProdutosActionPerformed
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
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBinCliente;
    private javax.swing.JButton jBtnClientePesquisaer;
    private javax.swing.JButton jBtnProd;
    private javax.swing.JButton jBtnVendasPesquisae;
    private javax.swing.JButton jBtnVendedor;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMnuCadastros;
    private javax.swing.JMenuItem jMnuCliente;
    private javax.swing.JMenu jMnuConsultas;
    private javax.swing.JMenuItem jMnuConsutlaClientes;
    private javax.swing.JMenuItem jMnuConsutlaProdutos;
    private javax.swing.JMenuItem jMnuConsutlaVendas;
    private javax.swing.JMenuItem jMnuConsutlaVendedor;
    private javax.swing.JMenu jMnuMovimentos;
    private javax.swing.JMenuItem jMnuProduto;
    private javax.swing.JMenuItem jMnuSair;
    private javax.swing.JMenuItem jMnuUsuarios;
    private javax.swing.JMenuItem jMnuVendas;
    private javax.swing.JMenuItem jMnuVendedor;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
