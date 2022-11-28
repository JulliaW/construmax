package br.com.construmax.rdn;

import br.com.construmax.modelo.Fornecedor;
import br.com.construmax.modelo.Endereco;

import java.util.ArrayList;
import java.util.List;

import java.sql.*;
import java.util.Calendar;

public class FornecedorRdn {

    public int inserirFornecedor(Fornecedor forn) {

        try {

            int linhasAfetadas = 0;

            StringBuilder str = new StringBuilder();

            str.append("INSERT INTO pessoa(                 ");
            str.append("            nome                    ");
            str.append("            ,dataNascimento         ");
            str.append("            ,documento              ");
            str.append("            ,representacao          ");
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

            PreparedStatement stmt = conn.prepareStatement(str.toString(), Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, forn.getNome());
            stmt.setDate(2, new java.sql.Date(forn.getDataNascimento().getTimeInMillis()));
            stmt.setString(3, forn.getDocumento());
            stmt.setString(4, forn.getRepresentacao());
            stmt.setString(5, forn.getTelefone());
            stmt.setString(6, forn.getEmail());
            stmt.setInt(7, 2);
                  
            int id = 0;
            
            linhasAfetadas =stmt.executeUpdate();      
            
            ResultSet rs = stmt.getGeneratedKeys();            
            if (rs.next()) {
                
               id = rs.getInt(1); //recuperar o id               
               
               EnderecoRdn endRdn = new EnderecoRdn();           
               Endereco end = forn.getEndereco();
               end.setIdPessoa(id);
               
               endRdn.inserirEndereco(end);
               
            }                                                

            stmt.close();
            conn.close();

            return linhasAfetadas;

        } catch (SQLException ex) {
            System.out.println("ERRO: " + ex.getMessage());
            return 0;
        }
    }

    public int alterarFornecedor(Fornecedor forn) {

        try {
            int linhasAfetadas = 0;
            StringBuilder str = new StringBuilder();

            str.append("UPDATE PESSOA SET NOME 			 = ?        ");
            str.append("                 ,DATANASCIMENTO         = ?        ");
            str.append("                 ,DOCUMENTO		 = ?        ");
            str.append("                 ,TELEFONE               = ?        ");
            str.append("                 ,EMAIL 		 = ?        ");
            str.append("                 ,REPRESENTACAO 	 = ?        ");
            str.append("WHERE	ID                               = ?        ");

            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString());

            stmt.setString(1, forn.getNome());
            stmt.setDate(2, new java.sql.Date(forn.getDataNascimento().getTimeInMillis()));
            stmt.setString(3, forn.getDocumento());
            stmt.setString(4, forn.getTelefone());
            stmt.setString(5, forn.getEmail());
            stmt.setString(6, forn.getRepresentacao());            
            stmt.setInt(7, forn.getId());

            linhasAfetadas = stmt.executeUpdate();
            
            EnderecoRdn endRdn = new EnderecoRdn();            
            endRdn.alterarEndereco(forn.getEndereco());
            
            stmt.close();
            conn.close();

            return linhasAfetadas;

        } catch (SQLException ex) {
            System.out.println("ERRO:" + ex.getMessage());
            return 0;
        }

    }

    public int deletarFornecedor(int idFornecedor) {
        try {

            int linhasAfetadas = 0;

            String str = "DELETE FROM PESSOA WHERE ID = ?";
            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString());
            stmt.setInt(1, idFornecedor);

            linhasAfetadas = stmt.executeUpdate();

            stmt.close();
            conn.close();

            return linhasAfetadas;

        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
            return 0;
        }

    }

    public List<Fornecedor> obterTodos() {
        try {

            List<Fornecedor> lstForn = new ArrayList<Fornecedor>();

            StringBuilder str = new StringBuilder();

            str.append("SELECT  ID               ");
            str.append("     ,NOME               ");
            str.append("     ,DATANASCIMENTO     ");
            str.append("     ,DOCUMENTO          ");
            str.append("     ,TELEFONE           ");
            str.append("     ,EMAIL              ");
            str.append("     ,REPRESENTACAO      ");
            str.append("FROM PESSOA              ");
            str.append(" WHERE TIPO = 2          ");

            //ABRE A CONEXÃO
            Connection conn = new ConnectionFactory().getConnection();

            //CRIAR NOSSO STATEMENT            
            Statement stmt = conn.createStatement();

            //RECEBER OS DADOS NO RESULTSET
            ResultSet rs = stmt.executeQuery(str.toString());

            //INSTANCIA DA CLASSE ENDERECO RDN
             EnderecoRdn endRdn = new EnderecoRdn();
             
            while (rs.next()) {

                Calendar calendar = Calendar.getInstance();
                calendar.setTime(rs.getDate("DATANASCIMENTO"));

              Endereco end = endRdn.obterPorIdPessoa(rs.getInt("ID"));
                
                
                Fornecedor cli = new Fornecedor(rs.getInt("ID"),
                        rs.getString("NOME"),
                        calendar,
                        rs.getString("DOCUMENTO"),
                        rs.getString("TELEFONE"),
                        rs.getString("EMAIL"),
                        end,
                        rs.getString("REPRESENTACAO"));

                lstForn.add(cli);

            }
            return lstForn;

        } catch (SQLException ex) {

            System.out.println("ERRO:" + ex.getMessage());
            return null;
        }
    }
    
    public Fornecedor obterPorId(int id) {
        try {

            Fornecedor ret = null;

            StringBuilder str = new StringBuilder();

            str.append("SELECT  ID               ");
            str.append("     ,NOME               ");
            str.append("     ,DATANASCIMENTO     ");
            str.append("     ,REPRESENTACAO      ");
            str.append("     ,DOCUMENTO          ");
            str.append("     ,TELEFONE           ");
            str.append("     ,EMAIL              ");
            str.append("FROM PESSOA              ");
            str.append(" WHERE TIPO = 2          ");
            str.append(" AND ID     = ?         ");

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

                Endereco end = endRdn.obterPorIdPessoa(rs.getInt("ID"));
                
                ret = new Fornecedor(rs.getInt("ID"),
                        rs.getString("NOME"),
                        calendar,
                        rs.getString("DOCUMENTO"),
                        rs.getString("TELEFONE"),
                        rs.getString("EMAIL"),
                        end,
                        rs.getString("REPRESENTACAO"));
                

            }
            return ret;

        } catch (SQLException ex) {

            System.out.println("ERRO:" + ex.getMessage());
            return null;
        }
    }

}

