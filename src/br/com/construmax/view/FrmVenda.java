package br.com.construmax.view;

import br.com.construmax.modelo.Venda;
import br.com.construmax.modelo.Produto;
import br.com.construmax.rdn.ProdutoRdn;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmVenda extends javax.swing.JInternalFrame {

    ArrayList<Venda> lstVenda; 
    
    String produtosVenda = "";
    
    boolean modoAlterarDeletar = false;
    int id = 0;
    int indiceLista = 0;

    public FrmVenda() {

        lstVenda = new ArrayList<Venda>();

        initComponents();

        this.modoNovo();
        
        this.carregarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduto = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        btnNovo1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        jMenuItem1.setBackground(new java.awt.Color(255, 51, 51));
        jMenuItem1.setText("jMenuItem1");

        setClosable(true);
        setTitle("Cadastro de Produtos");

        jPanel1.setBackground(new java.awt.Color(248, 196, 96));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNovo.setBackground(new java.awt.Color(255, 151, 0));
        btnNovo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(255, 151, 0));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 151, 0));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir))
                .addContainerGap())
        );

        tableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProduto);

        jButton2.setBackground(new java.awt.Color(248, 196, 96));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/construmax/view/Imagens/Logo.png"))); // NOI18N
        jButton2.setBorder(null);

        jLabel11.setText("Quantidade:");

        txtQuantidade.setName("txtQuantidade"); // NOI18N

        btnNovo1.setBackground(new java.awt.Color(255, 151, 0));
        btnNovo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNovo1.setText("Adicionar");
        btnNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome Cliente:");

        jLabel3.setText("Cód. Cliente:");

        jTextField1.setName("txtCodProd"); // NOI18N

        jLabel4.setText("Descrição:");

        jLabel7.setText("Cod. Prod.:");

        jTextField2.setName("txtCodCliente"); // NOI18N

        jLabel2.setText("Nome Funcionário:");

        txtNome1.setName("txtFuncionario"); // NOI18N

        jLabel5.setText("Cód. Func.:");

        jTextField3.setName("txtCodFunci"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(jTextField1)
                                            .addComponent(jTextField3)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addGap(18, 18, Short.MAX_VALUE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                                        .addGap(24, 24, 24)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(39, 39, 39)
                                                        .addComponent(btnNovo1))
                                                    .addComponent(jLabel11))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNovo1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modoNovo() {
        
        jTextField1.setText("");
        txtNome.setText("");
        jTextField2.setText("");
        txtDescricao.setText("");
        txtQuantidade.setText("");   
        jTextField3.setText("");        
        txtNome1.setText("");
        
        jTextField1.setEnabled(false);        
        txtNome.setEnabled(false);        
        jTextField2.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtQuantidade.setEnabled(false);
        jTextField3.setEnabled(false);      
        txtNome1.setEnabled(false);
        
        btnSalvar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnNovo.setEnabled(true);

    }

    private void habilitarCampos()
    {
        jTextField1.setEnabled(true);        
        txtNome.setEnabled(true);        
        jTextField2.setEnabled(true);
        txtDescricao.setEnabled(true);
        txtQuantidade.setEnabled(true);
        jTextField3.setEnabled(true);        
        txtNome1.setEnabled(true);
    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        int idVenda = 0;

        if (this.modoAlterarDeletar == true) {
            idVenda = this.id;

        } else {
            idVenda = 0;
        }       
        
        ProdutoRdn prodRdn = new ProdutoRdn();
        
        if(this.modoAlterarDeletar == true)
        {
            //lstProduto.set(this.indiceLista, produto);
            //prodRdn.alterarProduto(produto);
            btnNovo.setEnabled(true);
        }
        else
        {
            //prodRdn.inserirProduto(produto);
        }
        
        this.modoAlterarDeletar = false;
        this.carregarTabela();

        this.modoNovo();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutoMouseClicked

        this.modoAlterarDeletar = true;
        
        int row = this.tableProduto.getSelectedRow();

        int idProduto = (int) this.tableProduto.getValueAt(row, 0);
        
        this.id = idProduto;

        //int indice = 0;
        ProdutoRdn rdn = new ProdutoRdn();
        
        Produto produto = rdn.obterPorId(id);
        
        /*for (int i = 0; i < lstProduto.size(); i++) {

            if(lstProduto.get(i).getId().equals(idProduto)){
                produto = lstProduto.get(i);
                indice = i;
                break;
            }
        }
        
        this.indiceLista = indice;*/
 
        txtDescricao.setText(produto.getDescricao());
        //txtCodBarras.setText(produto.getCodigoDeBarras());
       // txtPreco.setText(produto.getPreco());
       // txtMarca.setText(produto.getMarca());
        txtQuantidade.setText(produto.getQuantidade());
        
//        txtFornecedor.setText(produto.getFornecedor().getNome());
        
        this.habilitarCampos();

        btnSalvar.setEnabled(true);

        btnNovo.setEnabled(false);

        btnExcluir.setEnabled(true);
    }//GEN-LAST:event_tableProdutoMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        this.habilitarCampos();

        btnSalvar.setEnabled(true);
       
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        
         int input = JOptionPane.showConfirmDialog(null,
                "Deseja realmente excluir?", "Atenção!!!", JOptionPane.YES_NO_OPTION);

        if (input == 0) {

            ProdutoRdn rdn = new ProdutoRdn();
            
            rdn.deletarProduto(this.id);

            this.carregarTabela();

        }
        this.modoNovo();
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovo1ActionPerformed

    private void carregarTabela() {

        DefaultTableModel model = (DefaultTableModel) tableProduto.getModel();

        model.setRowCount(0);
        
        ProdutoRdn rdn = new ProdutoRdn();
        
        List<Produto> lstCli = rdn.obterTodos();

        /*for (Produto produto : lstProduto) {

            DateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");

            //adicionar a linha
            model.addRow(new Object[]{
                produto.getId(),
                produto.getDescricao(),
                produto.getCodigoDeBarras(),
                produto.getPreco(),
                produto.getMarca(),
                produto.getQuantidade()
//                produto.getFornecedor().getNome()
                
            });
        }

        tableProduto.setModel(model);*/

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnNovo1;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tableProduto;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
