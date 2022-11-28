package br.com.construmax.rdn;

import br.com.construmax.modelo.Produto;
import br.com.construmax.modelo.Endereco;

import java.util.ArrayList;
import java.util.List;

import java.sql.*;
import java.util.Calendar;

public class ProdutoRdn {

    public int inserirProduto(Produto prod) {

        try {

            int linhasAfetadas = 0;

            StringBuilder str = new StringBuilder();
            
            str.append("INSERT INTO produto(                ");
            str.append("            descricao               ");
            str.append("            preco                   ");
            str.append("            ,codigoBarra            ");
            str.append("            ,quantidade             ");
            str.append("            ,marca)                 ");
            str.append("      VALUES(                       ");
            str.append("             ?                      ");
            str.append("            ,?                      ");
            str.append("            ,?                      ");
            str.append("            ,?                      ");            
            str.append("            ,?                      ");
            str.append("         )                          ");                                              
           
            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();
            
            PreparedStatement stmt = conn.prepareStatement(str.toString(), Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, prod.getDescricao());
            stmt.setString(2, prod.getPreco());            
            stmt.setString(3, prod.getCodigoDeBarras());
            stmt.setString(4, prod.getQuantidade());
            stmt.setString(5, prod.getMarca());
                  
            int id = 0;
            
            linhasAfetadas =stmt.executeUpdate();      
            
            ResultSet rs = stmt.getGeneratedKeys();            
            if (rs.next()) {
                
               id = rs.getInt(1); //recuperar o id 
               
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

    public int alterarProduto(Produto prod) {

        try {
            int linhasAfetadas = 0;
            StringBuilder str = new StringBuilder();         
            
            str.append("UPDATE PRODUTO SET descricao             = ?        ");            
            str.append("                  ,preco                 = ?        ");           
            str.append("                  ,quantidade            = ?        ");
            str.append("                  ,codigoBarra		 = ?        ");
            str.append("                  ,quantidade            = ?        ");
            str.append("                  ,marca 		 = ?        ");
            str.append("WHERE	ID                               = ?        ");

            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString());

            stmt.setString(1, prod.getDescricao());
            stmt.setString(2, prod.getPreco());
            stmt.setString(3, prod.getCodigoDeBarras());
            stmt.setString(4, prod.getQuantidade());
            stmt.setString(5, prod.getMarca());

            linhasAfetadas = stmt.executeUpdate();            
            
            //LIBERAR OS RECURSOS
            stmt.close();
            conn.close();

            return linhasAfetadas;

        } catch (SQLException ex) {
            System.out.println("ERRO:" + ex.getMessage());
            return 0;
        }

    }

    public int deletarProduto(int idProduto) {
        try {

            int linhasAfetadas = 0;

            String str = "DELETE FROM PRODUTO WHERE ID = ?";
            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString());
            stmt.setInt(1, idProduto);

            linhasAfetadas = stmt.executeUpdate();

            stmt.close();
            conn.close();

            return linhasAfetadas;

        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
            return 0;
        }

    }

    public List<Produto> obterTodos() {
        try {

            List<Produto> lstProd = new ArrayList<Produto>();

            StringBuilder str = new StringBuilder();

            str.append("SELECT id                       ");           
            str.append("       ,descricao               ");
            str.append("       ,preco                   ");
            str.append("       ,codigoBarra             ");
            str.append("       ,quantidade              ");
            str.append("       ,marca                   ");
            str.append("FROM PRODUTO                    ");

            //ABRE A CONEXÃO
            Connection conn = new ConnectionFactory().getConnection();

            //CRIAR NOSSO STATEMENT            
            Statement stmt = conn.createStatement();

            //RECEBER OS DADOS NO RESULTSET
            ResultSet rs = stmt.executeQuery(str.toString());
             
            while (rs.next()) {                            
                
                Produto prod = new Produto(rs.getInt("ID"),
                        rs.getString("DESCRICAO"),
                        rs.getString("PRECO"),
                        rs.getString("CODIGOBARRA"),
                        rs.getString("QUANTIDADE"),
                        rs.getString("MARCA"));
                        
                lstProd.add(prod);
            }
            return lstProd;

        } catch (SQLException ex) {

            System.out.println("ERRO:" + ex.getMessage());
            return null;
        }
    }
    
    public Produto obterPorId(int id) {
        try {

            Produto ret = null;

            StringBuilder str = new StringBuilder();

            str.append("SELECT id                       ");           
            str.append("       ,descricao               ");
            str.append("       ,preco                   ");
            str.append("       ,codigoBarra             ");
            str.append("       ,quantidade              ");
            str.append("       ,marca                   ");
            str.append("FROM PRODUTO                    ");
            str.append("WHERE ID = ?                    ");

            //ABRE A CONEXÃO
            Connection conn = new ConnectionFactory().getConnection();

            //CRIAR NOSSO STATEMENT            
            PreparedStatement stmt = conn.prepareStatement(str.toString());
          
            stmt.setInt(1, id);
            
            //RECEBER OS DADOS NO RESULTSET
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                
                Produto prod = new Produto(rs.getInt("ID"),
                        rs.getString("DESCRICAO"),
                        rs.getString("PRECO"),
                        rs.getString("CODIGOBARRA"),
                        rs.getString("QUANTIDADE"),
                        rs.getString("MARCA"));             

            }
            return ret;

        } catch (SQLException ex) {

            System.out.println("ERRO:" + ex.getMessage());
            return null;
        }
    }

}

