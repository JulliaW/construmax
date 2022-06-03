package br.com.construmax.view;

import br.com.construmax.modelo.Endereco;
import br.com.construmax.modelo.Produto;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class FrmProduto extends javax.swing.JInternalFrame {

    ArrayList<Produto> lstProduto;
    
    boolean modoAlterarDeletar = false;
    String id = "";
    int indiceLista = 0;

    public FrmProduto() {

        lstProduto = new ArrayList<Produto>();

        initComponents();

        this.modoNovo();
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
        jLabel1 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodBarras = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtQuantidade = new javax.swing.JTextField();

        jMenuItem1.setBackground(new java.awt.Color(255, 51, 51));
        jMenuItem1.setText("jMenuItem1");

        setClosable(true);
        setTitle("Cadastro de Cliente");

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
                "ID", "NOME", "TELEFONE", "NASCIMENTO", "EMAIL", "CARTÃO FIDELIDADE", "LOGRADOURO", "BAIRRO", "CEP", "CIDADE", "COMPLEMENTO", "NÚMERO", "UF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
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

        jLabel1.setText("Descrição:");

        jLabel3.setText("Cód. Barras:");

        jLabel4.setText("Marca:");

        jLabel10.setText("Preço:");

        jLabel11.setText("Quantidade:");

        jButton2.setBackground(new java.awt.Color(248, 196, 96));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/construmax/view/Imagens/Logo.png"))); // NOI18N
        jButton2.setBorder(null);

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
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(txtDescricao))
                        .addGap(38, 38, 38)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modoNovo() {
        txtDescricao.setText("");
        txtDocumento.setText("");
        txtCodBarras.setText("");
        txtPreco.setText("");
        txtMarca.setText("");
        txtDataNascimento.setText("");
        txtCep.setText("");
        txtRua.setText("");
        txtCidade.setText("");
        txtBairro.setText("");
        txtNumero.setText("");
        txtUf.setText("");

        txtDescricao.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtDocumento.setEnabled(false);
        txtCodBarras.setEnabled(false);
        txtPreco.setEnabled(false);
        txtMarca.setEnabled(false);
        txtDataNascimento.setEnabled(false);
        txtCep.setEnabled(false);
        txtRua.setEnabled(false);
        txtCidade.setEnabled(false);
        txtBairro.setEnabled(false);
        txtNumero.setEnabled(false);
        txtUf.setEnabled(false);

        btnSalvar.setEnabled(false);
        btnExcluir.setEnabled(false);

    }

    private void habilitarCampos()
    {
        txtDescricao.setEnabled(true);
        txtDescricao.setEnabled(true);
        txtDocumento.setEnabled(true);
        txtCodBarras.setEnabled(true);
        txtPreco.setEnabled(true);
        txtMarca.setEnabled(true);
        txtDataNascimento.setEnabled(true);
        txtCep.setEnabled(true);
        txtRua.setEnabled(true);
        txtCidade.setEnabled(true);
        txtBairro.setEnabled(true);
        txtNumero.setEnabled(true);
        txtUf.setEnabled(true);
    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        Calendar cal = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {

            cal.setTime(sdf.parse(txtDataNascimento.getText()));

        } catch (ParseException ex) {
            Logger.getLogger(FrmProduto.class.getName()).log(Level.SEVERE, null, ex);
        }

        Endereco endereco = new Endereco(txtRua.getText(), txtCidade.getText(), txtNumero.getText(), txtUf.getText(),
                txtBairro.getText(), txtCep.getText());

        UUID id = java.util.UUID.randomUUID();

        Cliente cliente = new Cliente(id.toString(), txtDescricao.getText(), cal, txtDocumento.getText(), txtMarca.getText(),
                txtCodBarras.getText(), endereco, txtPreco.getText());

        this.modoNovo();
        
        if(this.modoAlterarDeletar == true)
        {
            lstCliente.set(this.indiceLista, cliente);
            btnNovo.setEnabled(true);
        }
        else
        {
            lstCliente.add(cliente);
        }
        
        this.carregarTabela();

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutoMouseClicked

        this.modoAlterarDeletar = true;

        btnSalvar.setEnabled(true);
        
        btnNovo.setEnabled(false);
        
        //PEGA A LINHA SELECIONADA
        int row = this.tableProduto.getSelectedRow();

        //RECUPERA O VALOr DA COLUNA ID ESTA NA 0
        String idCliente = (String) this.tableProduto.getValueAt(row, 0);
        
        this.id = idCliente;

        int indice = 0;

        //RECUPERAR POR ID
        Cliente cliente = null;
        for (int i = 0; i < lstCliente.size(); i++) {

            if(lstCliente.get(i).getId().equals(idCliente)){
                cliente = lstCliente.get(i);
                indice = i;
                break;
            }
        }
 
        txtDescricao.setText(cliente.getNome());
        txtCodBarras.setText(cliente.getEmail());
        txtPreco.setText(cliente.getCartaoFidelidade());
        txtMarca.setText(cliente.getTelefone());

        DateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        txtDataNascimento.setText(formataData.format(cliente.getDataNascimento().getTime()));

        txtRua.setText(cliente.getEndereco().getLogradouro());
        txtNumero.setText(cliente.getEndereco().getNumero());
        txtBairro.setText(cliente.getEndereco().getBairro());
        txtCep.setText(cliente.getEndereco().getCep());

        txtUf.setText(cliente.getEndereco().getUf());
        txtCidade.setText(cliente.getEndereco().getCidade());

    }//GEN-LAST:event_tableProdutoMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        this.habilitarCampos();

        btnSalvar.setEnabled(true);
       
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void carregarTabela() {

        DefaultTableModel model = (DefaultTableModel) tableProduto.getModel();

        model.setRowCount(0);

        for (Cliente cliente : lstCliente) {

            DateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");

            //adicionar a linha
            model.addRow(new Object[]{
                cliente.getId(),
                cliente.getNome(),
                cliente.getTelefone(),
                formataData.format(cliente.getDataNascimento().getTime()),
                cliente.getEmail(),
                cliente.getRepresentacao(),
                cliente.getEndereco().getLogradouro(),
                cliente.getEndereco().getBairro(),
                cliente.getEndereco().getCep(),
                cliente.getEndereco().getCidade(),
                cliente.getEndereco().getNumero(),
                cliente.getEndereco().getUf()
            });
        }

        tableProduto.setModel(model);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProduto;
    private javax.swing.JTextField txtCodBarras;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
