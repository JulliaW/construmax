package br.com.construmax.rdn;

import br.com.construmax.modelo.Cliente;
import br.com.construmax.modelo.Endereco;

import java.util.ArrayList;
import java.util.List;

import java.sql.*;
import java.util.Calendar;

public class ClienteRdn {

    public int inserirCliente(Cliente cli) {

        try {

            int linhasAfetadas = 0;

            StringBuilder str = new StringBuilder();

            str.append("INSERT INTO pessoa(                 ");
            str.append("            nome                    ");
            str.append("            ,dataNascimento         ");
            str.append("            ,documento              ");
            str.append("            ,cartaofidelidade       ");
            str.append("            ,telefone               ");
            str.append("            ,email                  ");
            str.append("            ,tipo)                  ");
            str.append("      VALUES(                       ");
            str.append("             ?                      ");
            str.append("            ,?                      ");
            str.append("            ,?                      ");
            str.append("            ,?                      ");
            str.append("            ,?                      ");
            str.append("            ,?                      ");
            str.append("            ,?                      ");
            str.append("         )                          ");                                              
           
            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

            
            //CRIA O STATMENT JÁ PREPARADO PARA OBTER O ID CLIENTE GERADO
            PreparedStatement stmt = conn.prepareStatement(str.toString(), Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, cli.getNome());
            stmt.setDate(2, new java.sql.Date(cli.getDataNascimento().getTimeInMillis()));
            stmt.setString(3, cli.getDocumento());
            stmt.setString(4, cli.getCartaoFidelidade());
            stmt.setString(5, cli.getTelefone());
            stmt.setString(6, cli.getEmail());
            stmt.setInt(7, 1);
                  
            int id = 0;
            
            linhasAfetadas =stmt.executeUpdate();      
            
            ResultSet rs = stmt.getGeneratedKeys();            
            if (rs.next()) {
                //RECUPERA O IDCLIENTE
                
               id = rs.getInt(1); //recuperar o id               
               
               EnderecoRdn endRdn = new EnderecoRdn();           
               Endereco end = cli.getEndereco();
               end.setIdPessoa(id);
               
               endRdn.inserirEndereco(end);
               
            }                                                

            //LIBERAR OS RECURSOS
            stmt.close();
            conn.close();

            return linhasAfetadas;

        } catch (SQLException ex) {
            System.out.println("ERRO: " + ex.getMessage());
            return 0;
        }
    }

    public int alterarCliente(Cliente cli) {

        try {
            int linhasAfetadas = 0;
            StringBuilder str = new StringBuilder();

            str.append("UPDATE PESSOA SET NOME 			 = ?        ");
            str.append("                  ,DATANASCIMENTO        = ?        ");
            str.append("                  ,DOCUMENTO		 = ?        ");
            str.append("                 ,TELEFONE               = ?        ");
            str.append("                 ,EMAIL 		 = ?        ");
            str.append("                 ,CARTAOFIDELIDADE	 = ?        ");
            str.append("WHERE	ID                               = ?        ");

            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString());

            stmt.setString(1, cli.getNome());
            stmt.setDate(2, new java.sql.Date(cli.getDataNascimento().getTimeInMillis()));
            stmt.setString(3, cli.getDocumento());
            stmt.setString(4, cli.getTelefone());
            stmt.setString(5, cli.getEmail());
            stmt.setString(6, cli.getCartaoFidelidade());            
            stmt.setInt(7, cli.getId());

            linhasAfetadas = stmt.executeUpdate();

            
            EnderecoRdn endRdn = new EnderecoRdn();            
            endRdn.alterarEndereco(cli.getEndereco());
            
            //LIBERAR OS RECURSOS
            stmt.close();
            conn.close();

            return linhasAfetadas;

        } catch (SQLException ex) {
            System.out.println("ERRO:" + ex.getMessage());
            return 0;
        }

    }

    public int deletarCliente(int idCliente) {
        try {

            int linhasAfetadas = 0;

            String str = "DELETE FROM PESSOA WHERE ID = ?";
            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString());
            stmt.setInt(1, idCliente);

            linhasAfetadas = stmt.executeUpdate();

            stmt.close();
            conn.close();

            return linhasAfetadas;

        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
            return 0;
        }

    }

    public List<Cliente> obterTodos() {
        try {

            List<Cliente> lstCli = new ArrayList<Cliente>();

            StringBuilder str = new StringBuilder();

            str.append("SELECT  ID               ");
            str.append("     ,NOME               ");
            str.append("     ,DATANASCIMENTO     ");
            str.append("     ,DOCUMENTO          ");
            str.append("     ,TELEFONE           ");
            str.append("     ,EMAIL              ");
            str.append("     ,CARTAOFIDELIDADE   ");
            str.append("FROM PESSOA              ");
            str.append(" WHERE TIPO = 1           ");

            //ABRE A CONEXÃO
            Connection conn = new ConnectionFactory().getConnection();

            //CRIAR NOSSO STATEMENT            
            Statement stmt = conn.createStatement();

            //RECEBER OS DADOS NO RESULTSET
            ResultSet rs = stmt.executeQuery(str.toString());

            //INSTANCIA DA CLASSE ENDERECO RDN
             EnderecoRdn endRdn = new EnderecoRdn();
             
            while (rs.next()) {

                //CONVERTER SQL DATE TO CALENDAR
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(rs.getDate("DATANASCIMENTO"));

                /*              
                public Cliente(int id, String nome, Calendar dataNascimento, String documento, 
                String telefone, String email, Endereco endereco, String cartaoFidelidade)
                 */
               
              Endereco end = endRdn.obterPorIdPessoa(rs.getInt("ID"));
                
                
                Cliente cli = new Cliente(rs.getInt("ID"),
                        rs.getString("NOME"),
                        calendar,
                        rs.getString("DOCUMENTO"),
                        rs.getString("TELEFONE"),
                        rs.getString("EMAIL"),
                        end,
                        rs.getString("CARTAOFIDELIDADE"));

                lstCli.add(cli);

            }
            return lstCli;

        } catch (SQLException ex) {

            System.out.println("ERRO:" + ex.getMessage());
            return null;
        }
    }
    
    public Cliente obterPorId(int id) {
        try {

            Cliente ret = null;

            StringBuilder str = new StringBuilder();

            str.append("SELECT  ID               ");
            str.append("     ,NOME               ");
            str.append("     ,DATANASCIMENTO     ");
            str.append("     ,CARTAOFIDELIDADE   ");
            str.append("     ,DOCUMENTO          ");
            str.append("     ,TELEFONE           ");
            str.append("     ,EMAIL              ");
            str.append("FROM PESSOA              ");
            str.append(" WHERE TIPO = 1          ");
            str.append(" AND ID      = ?         ");

            //ABRE A CONEXÃO
            Connection conn = new ConnectionFactory().getConnection();

            //CRIAR NOSSO STATEMENT            
            PreparedStatement stmt = conn.prepareStatement(str.toString());

          
            stmt.setInt(1, id);
            
            //RECEBER OS DADOS NO RESULTSET
            ResultSet rs = stmt.executeQuery();

            //INSTANCIA DA CLASSE ENDERECO RDN
            EnderecoRdn endRdn = new EnderecoRdn();
            
            if (rs.next()) {

                //CONVERTER SQL DATE TO CALENDAR
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(rs.getDate("DATANASCIMENTO"));

                /*              
                public Cliente(int id, String nome, Calendar dataNascimento, String documento, 
                String telefone, String email, Endereco endereco, String cartaoFidelidade)
                 */
                Endereco end = endRdn.obterPorIdPessoa(rs.getInt("ID"));
                
                ret = new Cliente(rs.getInt("ID"),
                        rs.getString("NOME"),
                        calendar,
                        rs.getString("DOCUMENTO"),
                        rs.getString("TELEFONE"),
                        rs.getString("EMAIL"),
                        end,
                        rs.getString("CARTAOFIDELIDADE"));
                

            }
            return ret;

        } catch (SQLException ex) {

            System.out.println("ERRO:" + ex.getMessage());
            return null;
        }
    }

}

