package br.com.construmax.rdn;

import br.com.construmax.modelo.Funcionario;
import br.com.construmax.modelo.Endereco;

import java.util.ArrayList;
import java.util.List;

import java.sql.*;
import java.util.Calendar;

public class FuncionarioRdn {

    public int inserirFuncionario(Funcionario func) {

        try {

            int linhasAfetadas = 0;

            StringBuilder str = new StringBuilder();

            str.append("INSERT INTO pessoa(                 ");
            str.append("            nome                    ");
            str.append("            ,dataNascimento         ");
            str.append("            ,documento              ");
            str.append("            ,cartaoponto            ");
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

            stmt.setString(1, func.getNome());
            stmt.setDate(2, new java.sql.Date(func.getDataNascimento().getTimeInMillis()));
            stmt.setString(3, func.getDocumento());
            stmt.setString(4, func.getNumeroCartaoPonto());
            stmt.setString(5, func.getTelefone());
            stmt.setString(6, func.getEmail());
            stmt.setInt(7, 3);
                  
            int id = 0;
            
            linhasAfetadas = stmt.executeUpdate();      
            
            ResultSet rs = stmt.getGeneratedKeys();            
            if (rs.next()) {
                
               id = rs.getInt(1); //recuperar o id               
               
               EnderecoRdn endRdn = new EnderecoRdn();           
               Endereco end = func.getEndereco();
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

    public int alterarFuncionario(Funcionario func) {

        try {
            int linhasAfetadas = 0;
            StringBuilder str = new StringBuilder();

            str.append("UPDATE PESSOA SET NOME 			 = ?        ");
            str.append("                  ,DATANASCIMENTO        = ?        ");
            str.append("                  ,DOCUMENTO		 = ?        ");
            str.append("                 ,TELEFONE               = ?        ");
            str.append("                 ,EMAIL 		 = ?        ");
            str.append("                 ,CARTAOPONTO   	 = ?        ");
            str.append("WHERE	ID                               = ?        ");

            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString());

            stmt.setString(1, func.getNome());
            stmt.setDate(2, new java.sql.Date(func.getDataNascimento().getTimeInMillis()));
            stmt.setString(3, func.getDocumento());
            stmt.setString(4, func.getTelefone());
            stmt.setString(5, func.getEmail());
            stmt.setString(6, func.getNumeroCartaoPonto());            
            stmt.setInt(7, func.getId());

            linhasAfetadas = stmt.executeUpdate();
            
            EnderecoRdn endRdn = new EnderecoRdn();            
            endRdn.alterarEndereco(func.getEndereco());
            
            //LIBERAR OS RECURSOS
            stmt.close();
            conn.close();

            return linhasAfetadas;

        } catch (SQLException ex) {
            System.out.println("ERRO:" + ex.getMessage());
            return 0;
        }

    }

    public int deletarFuncionario(int idFuncionario) {
        try {

            int linhasAfetadas = 0;

            String str = "DELETE FROM PESSOA WHERE ID = ?";
            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString());
            stmt.setInt(1, idFuncionario);

            linhasAfetadas = stmt.executeUpdate();

            stmt.close();
            conn.close();

            return linhasAfetadas;

        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
            return 0;
        }

    }

    public List<Funcionario> obterTodos() {
        try {

            List<Funcionario> lstFunc = new ArrayList<Funcionario>();

            StringBuilder str = new StringBuilder();

            str.append("SELECT  ID               ");
            str.append("     ,NOME               ");
            str.append("     ,DATANASCIMENTO     ");
            str.append("     ,DOCUMENTO          ");
            str.append("     ,TELEFONE           ");
            str.append("     ,EMAIL              ");
            str.append("     ,CARTAOPONTO        ");
            str.append("FROM PESSOA              ");
            str.append(" WHERE TIPO = 3          ");

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
               
              Endereco end = endRdn.obterPorIdPessoa(rs.getInt("ID"));                
                
                Funcionario func = new Funcionario(rs.getInt("ID"),
                        rs.getString("NOME"),
                        calendar,
                        rs.getString("DOCUMENTO"),
                        rs.getString("TELEFONE"),
                        rs.getString("EMAIL"),
                        end,
                        rs.getString("CARTAOPONTO"));

                lstFunc.add(func);

            }
            return lstFunc;

        } catch (SQLException ex) {

            System.out.println("ERRO:" + ex.getMessage());
            return null;
        }
    }
    
    public Funcionario obterPorId(int id) {
        try {

            Funcionario ret = null;

            StringBuilder str = new StringBuilder();

            str.append("SELECT  ID               ");
            str.append("     ,NOME               ");
            str.append("     ,DATANASCIMENTO     ");
            str.append("     ,CARTAOPONTO        ");
            str.append("     ,DOCUMENTO          ");
            str.append("     ,TELEFONE           ");
            str.append("     ,EMAIL              ");
            str.append("FROM PESSOA              ");
            str.append(" WHERE TIPO = 3          ");
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

                Endereco end = endRdn.obterPorIdPessoa(rs.getInt("ID"));
                
                ret = new Funcionario(rs.getInt("ID"),
                        rs.getString("NOME"),
                        calendar,
                        rs.getString("DOCUMENTO"),
                        rs.getString("TELEFONE"),
                        rs.getString("EMAIL"),
                        end,
                        rs.getString("CARTAOPONTO"));
                

            }
            return ret;

        } catch (SQLException ex) {

            System.out.println("ERRO:" + ex.getMessage());
            return null;
        }
    }

}

