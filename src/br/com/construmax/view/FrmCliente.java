package br.com.construmax.view;

import br.com.construmax.modelo.Cliente;
import br.com.construmax.modelo.Endereco;
import br.com.construmax.rdn.ClienteRdn;
import br.com.construmax.rdn.EnderecoRdn;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FrmCliente extends javax.swing.JInternalFrame {

    ArrayList<Cliente> lstCliente;
    
    boolean modoAlterarDeletar = false;
    int id = 0;
    int indiceLista = 0;

    public FrmCliente() {

        lstCliente = new ArrayList<Cliente>();

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
        tableCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFidelidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtUf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        txtCep = new javax.swing.JFormattedTextField();
        btnCreditos = new javax.swing.JButton();

        jMenuItem1.setBackground(new java.awt.Color(255, 51, 51));
        jMenuItem1.setText("jMenuItem1");

        setClosable(true);
        setTitle("Cadastro de Clientes");

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

        tableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "DOCUMENTO", "TELEFONE", "NASCIMENTO", "EMAIL", "CARTAO FIDELIDADE", "LOGRADOURO", "BAIRRO", "CEP", "CIDADE", "NÚMERO", "UF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCliente);

        jLabel1.setText("Nome:");

        jLabel2.setText("Documento:");

        jLabel3.setText("E-mail:");

        jLabel4.setText("Telefone:");

        jLabel5.setText("Rua:");

        jLabel6.setText("N:º");

        jLabel7.setText("Cidade:");

        jLabel8.setText("Bairro:");

        jLabel9.setText("Cep:");

        jLabel10.setText("Fidelidade:");

        jLabel11.setText("Nascimento:");

        txtUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUfActionPerformed(evt);
            }
        });

        jLabel12.setText("UF:");

        txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnCreditos.setBackground(new java.awt.Color(248, 196, 96));
        btnCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/construmax/view/Imagens/Logo.png"))); // NOI18N
        btnCreditos.setBorder(null);
        btnCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditosActionPerformed(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtFidelidade, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                            .addComponent(txtEmail))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel11))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                    .addComponent(txtRua))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtCidade))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel12)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(38, 38, 38)
                        .addComponent(btnCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFidelidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(btnCreditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modoNovo() {
        txtNome.setText("");
        txtDocumento.setText("");
        txtEmail.setText("");
        txtFidelidade.setText("");
        txtTelefone.setText("");
        txtDataNascimento.setText("");
        txtCep.setText("");
        txtRua.setText("");
        txtCidade.setText("");
        txtBairro.setText("");
        txtNumero.setText("");
        txtUf.setText("");

        txtNome.setEnabled(false);
        txtNome.setEnabled(false);
        txtDocumento.setEnabled(false);
        txtEmail.setEnabled(false);
        txtFidelidade.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtDataNascimento.setEnabled(false);
        txtCep.setEnabled(false);
        txtRua.setEnabled(false);
        txtCidade.setEnabled(false);
        txtBairro.setEnabled(false);
        txtNumero.setEnabled(false);
        txtUf.setEnabled(false);

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnNovo.setEnabled(true);

    }

    private void habilitarCampos()
    {
        txtNome.setEnabled(true);
        txtDocumento.setEnabled(true);
        txtEmail.setEnabled(true);
        txtFidelidade.setEnabled(true);
        txtTelefone.setEnabled(true);
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
            Logger.getLogger(FrmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        int idCli = 0;

        if (this.modoAlterarDeletar == true) {
            idCli = this.id;

        } else {
            idCli = 0;
        }

        Endereco endereco = new Endereco(0, txtRua.getText(), txtCidade.getText(), txtNumero.getText(), txtUf.getText(),
                txtBairro.getText(), txtCep.getText(), idCli);
        
        Cliente cliente = new Cliente(idCli, txtNome.getText(), cal, txtDocumento.getText(), txtTelefone.getText(),
                txtEmail.getText(), endereco, txtFidelidade.getText());

        ClienteRdn cliRdn = new ClienteRdn();
        
        if(this.modoAlterarDeletar == true)
        {
            cliRdn.alterarCliente(cliente);
            btnNovo.setEnabled(true);
        }
        else
        {
            cliRdn.inserirCliente(cliente);
        }
        
        this.modoAlterarDeletar = false;
        this.carregarTabela();
        
        this.modoNovo();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClienteMouseClicked

        this.modoAlterarDeletar = true;
        
        int row = this.tableCliente.getSelectedRow();

        int idCliente = (int) this.tableCliente.getValueAt(row, 0);
        
        this.id = idCliente;

        //int indice = 0;
        ClienteRdn rdn = new ClienteRdn();
        
        Cliente cliente = rdn.obterPorId(id);
        
        /*for (int i = 0; i < lstCliente.size(); i++) {

            if(lstCliente.get(i).getId().equals(idCliente)){
                cliente = lstCliente.get(i);
                indice = i;
                break;
            }
        }        
        this.indiceLista = indice;*/
 
        txtNome.setText(cliente.getNome());
        txtEmail.setText(cliente.getEmail());
        txtFidelidade.setText(cliente.getCartaoFidelidade());
        txtTelefone.setText(cliente.getTelefone());
        txtDocumento.setText(cliente.getDocumento());

        DateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        txtDataNascimento.setText(formataData.format(cliente.getDataNascimento().getTime()));

        txtRua.setText(cliente.getEndereco().getLogradouro());
        txtNumero.setText(cliente.getEndereco().getNumero());
        txtBairro.setText(cliente.getEndereco().getBairro());
        txtCep.setText(cliente.getEndereco().getCep());

        txtUf.setText(cliente.getEndereco().getUf());
        txtCidade.setText(cliente.getEndereco().getCidade());

        this.habilitarCampos();

        btnSalvar.setEnabled(true);

        btnNovo.setEnabled(false);

        btnExcluir.setEnabled(true);
        
        btnSalvar.setText("Alterar");

    }//GEN-LAST:event_tableClienteMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        this.habilitarCampos();

        btnSalvar.setEnabled(true);
       
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        
        int input = JOptionPane.showConfirmDialog(null,
                "Deseja realmente excluir?", "Atenção!!!", JOptionPane.YES_NO_OPTION);

        if (input == 0) {

            EnderecoRdn endRdn = new EnderecoRdn();

            endRdn.deletarEnderecoPorPessoa(this.id);
            
            ClienteRdn rdn = new ClienteRdn();
            
            rdn.deletarCliente(this.id);
                    
            this.carregarTabela();

        }
        this.modoNovo();
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUfActionPerformed

    private void btnCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditosActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showConfirmDialog(null,
                "Jullia e Fernando", "Créditos", JOptionPane.CLOSED_OPTION);

    }//GEN-LAST:event_btnCreditosActionPerformed

    private void carregarTabela() {

        DefaultTableModel model = (DefaultTableModel) tableCliente.getModel();

        model.setRowCount(0);
        
        ClienteRdn cliRdn = new ClienteRdn();

        List<Cliente> lstCli = cliRdn.obterTodos();

        for (Cliente cli : lstCli) {

            DateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");

            model.addRow(new Object[]{
                cli.getId(),
                cli.getNome(),                      
                cli.getDocumento(),
                cli.getTelefone(),
                formataData.format(cli.getDataNascimento().getTime()),
                cli.getEmail(),
                cli.getCartaoFidelidade(),
                cli.getEndereco().getLogradouro(),
                cli.getEndereco().getBairro(),
                cli.getEndereco().getCep(),
                cli.getEndereco().getCidade(),
                cli.getEndereco().getNumero(),
                cli.getEndereco().getUf()               
            });
        }

        tableCliente.setModel(model);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreditos;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCliente;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFidelidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables
}
