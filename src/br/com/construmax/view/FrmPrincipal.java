/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package br.com.construmax.view;

/**
 *
 * @author NB004
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public FrmPrincipal() {
        initComponents();

        //desktopPane.setSize(900,500);
    }

    boolean frmClienteAbertoFechado = false;
    boolean frmFornAbertoFechado = false;
    boolean frmFuncAbertoFechado = false;
    boolean frmProdAbertoFechado = false;
    FrmCliente frmCliente = new FrmCliente();
    FrmFornecedor frmFornecedor = new FrmFornecedor();
    FrmFuncionario frmFuncionario = new FrmFuncionario();
    FrmProduto frmProduto = new FrmProduto();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnFuncionario = new javax.swing.JToggleButton();
        btnFornecedor = new javax.swing.JToggleButton();
        btnProduto = new javax.swing.JToggleButton();
        btnCliente = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        painel = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 74, 173));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("CONSTRUMAX");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        desktopPane.add(jPanel3);
        jPanel3.setBounds(200, 0, 880, 80);

        jPanel1.setBackground(new java.awt.Color(0, 74, 173));

        btnFuncionario.setBackground(new java.awt.Color(255, 151, 0));
        btnFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFuncionario.setText("Funcionário");
        btnFuncionario.setToolTipText("");
        btnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioActionPerformed(evt);
            }
        });

        btnFornecedor.setBackground(new java.awt.Color(255, 151, 0));
        btnFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFornecedor.setText("Fornecedor");
        btnFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorActionPerformed(evt);
            }
        });

        btnProduto.setBackground(new java.awt.Color(255, 151, 0));
        btnProduto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnProduto.setText("Produto");
        btnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoActionPerformed(evt);
            }
        });

        btnCliente.setBackground(new java.awt.Color(255, 151, 0));
        btnCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCliente.setSelected(true);
        btnCliente.setText("Cliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(248, 196, 96));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/construmax/view/Imagens/Logo.png"))); // NOI18N
        jButton2.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(btnFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        desktopPane.add(jPanel1);
        jPanel1.setBounds(0, 0, 200, 650);

        painel.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        desktopPane.add(painel);
        painel.setBounds(200, 80, 880, 470);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Cadastros");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Clientes");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
        FrmCliente frmCliente = new FrmCliente();
        desktopPane.add(frmCliente);
        frmCliente.show();

    }//GEN-LAST:event_openMenuItemActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        // TODO add your handling code here:
        if (frmFuncAbertoFechado == true || frmProdAbertoFechado == true || frmFornAbertoFechado == true) {
            frmFuncionario.hide();
            frmFuncAbertoFechado = false;
            
            frmProduto.hide();
            frmProdAbertoFechado = false;
            
            frmFornecedor.hide();
            frmFornAbertoFechado = false;
            
            painel.add(frmCliente);
            frmCliente.show();
            frmClienteAbertoFechado = true;

        } 
        else {
            painel.add(frmCliente);
            frmCliente.show();
            frmClienteAbertoFechado = true;
        }
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorActionPerformed
        // TODO add your handling code here:
        if (frmFuncAbertoFechado == true || frmProdAbertoFechado == true || frmClienteAbertoFechado == true) {
            
            frmFuncionario.hide();
            frmFuncAbertoFechado = false;
            
            frmProduto.hide();
            frmProdAbertoFechado = false;
            
            frmCliente.hide();
            frmClienteAbertoFechado = false; 
            
            painel.add(frmFornecedor);
            frmFornecedor.show();
            frmFornAbertoFechado = true;

        } 
        else {
            painel.add(frmFornecedor);
            frmFornecedor.show();
            frmFornAbertoFechado = true;
        }
    }//GEN-LAST:event_btnFornecedorActionPerformed

    private void btnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioActionPerformed
        // TODO add your handling code here:
        if (frmClienteAbertoFechado == true || frmProdAbertoFechado == true || frmFornAbertoFechado == true) {
            frmCliente.hide();
            frmClienteAbertoFechado = false;
            
            frmProduto.hide();
            frmProdAbertoFechado = false;
            
            frmFornecedor.hide();
            frmFornAbertoFechado = false;
            
            painel.add(frmFuncionario);
            frmFuncionario.show();
            frmFuncAbertoFechado = true;

        } 
        else {
            painel.add(frmFuncionario);
            frmFuncionario.show();
            frmFuncAbertoFechado = true;
        }
    }//GEN-LAST:event_btnFuncionarioActionPerformed

    private void btnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoActionPerformed
        // TODO add your handling code here:
        if (frmClienteAbertoFechado == true || frmFuncAbertoFechado == true || frmFornAbertoFechado == true) {
            frmCliente.hide();
            frmClienteAbertoFechado = false;
            
            frmFuncionario.hide();
            frmFuncAbertoFechado = false;
            
            frmFornecedor.hide();
            frmFornAbertoFechado = false;
            
            painel.add(frmProduto);
            frmProduto.show();
            frmProdAbertoFechado = true;

        } 
        else {
            painel.add(frmProduto);
            frmProduto.show();
            frmProdAbertoFechado = true;
        }
    }//GEN-LAST:event_btnProdutoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JToggleButton btnCliente;
    private javax.swing.JToggleButton btnFornecedor;
    private javax.swing.JToggleButton btnFuncionario;
    private javax.swing.JToggleButton btnProduto;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JPanel painel;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
