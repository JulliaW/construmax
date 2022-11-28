package br.com.construmax.rdn;

import br.com.construmax.modelo.Endereco;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EnderecoRdn {
    
    public int inserirEndereco(Endereco end) {

        try {

            int linhasAfetadas = 0;

            StringBuilder str = new StringBuilder();

            str.append("INSERT INTO endereco (               ");
            str.append("            logradouro               ");
            str.append("            ,numero                  ");
            str.append("            ,uf                      ");
            str.append("            ,bairro                  ");
            str.append("            ,cep                     ");
            str.append("            ,cidade                  ");
            str.append("            ,idPessoa)               ");
            str.append("      VALUES(                        ");
            str.append("             ?                       ");
            str.append("            ,?                       ");
            str.append("            ,?                       ");
            str.append("            ,?                       ");
            str.append("            ,?                       ");
            str.append("            ,?                       ");
            str.append("            ,?                       ");
            str.append("          )                          ");

            Connection conn = new ConnectionFactory().getConnection();
            PreparedStatement stmt = conn.prepareStatement(str.toString());

            stmt.setString(1, end.getLogradouro());
            stmt.setString(2, end.getNumero());
            stmt.setString(3, end.getUf());
            stmt.setString(4, end.getBairro());
            stmt.setString(5, end.getCep());
            stmt.setString(6, end.getCidade());           
            stmt.setInt(7, end.getIdPessoa());
            
            
            
            linhasAfetadas = stmt.executeUpdate();

            return linhasAfetadas;

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
            return 0;
        }
    }

    public int alterarEndereco(Endereco end) {

        try {

            int linhasAfetadas = 0;

            StringBuilder str = new StringBuilder();

            str.append("UPDATE ENDERECO  SET NUMERO  = ? ");
            str.append("           ,LOGRADOURO       = ? ");
            str.append("           ,uf               = ? ");
            str.append("           ,bairro           = ? ");
            str.append("           ,cep              = ? ");
            str.append("           ,cidade           = ? ");
            str.append("WHERE IDPESSOA               = ?   ");

            Connection conn = new ConnectionFactory().getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString());
            stmt.setString(1, end.getNumero());
            stmt.setString(2, end.getLogradouro());
            stmt.setString(3, end.getUf());
            stmt.setString(4, end.getBairro());
            stmt.setString(5, end.getCep());
            stmt.setString(6, end.getCidade());
            stmt.setInt(7, end.getIdPessoa());

            linhasAfetadas = stmt.executeUpdate();
            stmt.close();
            conn.close();

            return linhasAfetadas;

        } catch (SQLException ex) {

            System.out.println("Erro: " + ex.getMessage());

            return 0;

        }

    }

    public int deletarEnderecoPorPessoa(int idPessoa) {

        try {

            int linhasAfetadas;

            String str = "DELETE FROM ENDERECO WHERE IDPESSOA = ?";

            Connection conn = new ConnectionFactory().getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString());
            stmt.setInt(1, idPessoa);
            linhasAfetadas = stmt.executeUpdate();

            stmt.close();
            conn.close();
            return linhasAfetadas;

        } catch (Exception ex) {

            System.out.println("Erro: " + ex.getMessage());

            return 0;

        }

    }

    public Endereco obterPorIdPessoa(int id) {

        try {

            Endereco ret = null;

            StringBuilder str = new StringBuilder();

            str.append("SELECT  ID              ");
            str.append("        ,LOGRADOURO      ");
            str.append("        ,NUMERO          ");
            str.append("        ,UF              ");
            str.append("        ,BAIRRO          ");
            str.append("        ,CEP             ");
            str.append("        ,IDPESSOA        ");
            str.append("        ,CIDADE         ");
            str.append("        ,IDPESSOA        ");
            str.append("FROM ENDERECO            ");
            str.append("WHERE IDPESSOA = ?       ");

            Connection conn = new ConnectionFactory().getConnection();
            PreparedStatement stmt = conn.prepareStatement(str.toString());

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                    Endereco end = new Endereco(
                        rs.getInt("ID"),
                        rs.getString("LOGRADOURO"),
                        rs.getString("CIDADE"),
                        rs.getString("NUMERO"),
                        rs.getString("UF"),
                        rs.getString("BAIRRO"),
                        rs.getString("CEP"),
                         rs.getInt("IDPESSOA"));
                    ret = end;
                    

            }

            stmt.close();
            conn.close();
            return ret;

        } catch (Exception ex) {

            System.out.println("Erro: " + ex.getMessage());

            return null;

        }

    }
    
}
