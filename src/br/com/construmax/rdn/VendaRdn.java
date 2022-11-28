package br.com.construmax.rdn;

import br.com.construmax.modelo.Cliente;
import br.com.construmax.modelo.Funcionario;
import br.com.construmax.modelo.Venda;

import java.util.ArrayList;
import java.util.List;

import java.sql.*;
import java.util.Calendar;

public class VendaRdn {

    public int inserirVenda(Venda venda, Cliente cli, Funcionario func) {

        try {

            int linhasAfetadas = 0;

            StringBuilder str = new StringBuilder();

            str.append("INSERT INTO pessoa(                 ");
            str.append("            idCliente               ");
            str.append("            ,idFuncionario)         ");
            str.append("      VALUES(                       ");
            str.append("             ?                      ");
            str.append("            ,?                      ");
            str.append("         )                          ");                                              
           
            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString(), Statement.RETURN_GENERATED_KEYS);
            
            stmt.setInt(1, cli.getId());
            stmt.setInt(2, func.getId());
                  
            int id = 0;
            
            linhasAfetadas = stmt.executeUpdate();      
            
            ResultSet rs = stmt.getGeneratedKeys();            
            if (rs.next()) {
                
               id = rs.getInt(1); //recuperar o id               
               
               /*EnderecoRdn endRdn = new EnderecoRdn();           
               Endereco end = cli.getEndereco();
               end.setIdPessoa(id);
               
               endRdn.inserirEndereco(end);*/
               
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
    public int alterarVenda(Venda venda, Cliente cli, Funcionario func) {

        try {
            int linhasAfetadas = 0;
            StringBuilder str = new StringBuilder();

            str.append("UPDATE VENDA SET IDCLIENTE		 = ?        ");
            str.append("                  ,IDFUNCIONARIO         = ?        ");
            str.append("WHERE	ID                               = ?        ");

            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString());

            stmt.setInt(1, cli.getId());
            stmt.setInt(2, func.getId());
            stmt.setInt(3, venda.getIdVenda());

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
    
    public int deletarVenda(int idVenda) {
        try {

            int linhasAfetadas = 0;

            String str = "DELETE FROM VENDA WHERE ID = ?";
            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString());
            stmt.setInt(1, idVenda);

            linhasAfetadas = stmt.executeUpdate();

            stmt.close();
            conn.close();

            return linhasAfetadas;

        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
            return 0;
        }

    }
    
    public List<Venda> obterTodos() {
        try {

            List<Venda> lstVenda = new ArrayList<Venda>();

            StringBuilder str = new StringBuilder();

            str.append("SELECT  ID               ");
            str.append("     ,IDCLIENTE          ");
            str.append("     ,IDFUNCIONARIO      ");
            str.append("FROM VENDA               ");

            //ABRE A CONEXÃO
            Connection conn = new ConnectionFactory().getConnection();

            //CRIAR NOSSO STATEMENT            
            Statement stmt = conn.createStatement();

            //RECEBER OS DADOS NO RESULTSET
            ResultSet rs = stmt.executeQuery(str.toString());
            
            ClienteRdn cliRdn = new ClienteRdn();
            FuncionarioRdn funcRdn = new FuncionarioRdn();            
             
            while (rs.next()) {         
                
                Cliente cli = cliRdn.obterPorId(rs.getInt("ID"));
                Funcionario func = funcRdn.obterPorId(rs.getInt("ID"));
                
                
                Venda venda = new Venda(rs.getInt("ID"),
                        cli,
                        func);

                lstVenda.add(venda);

            }
            return lstVenda;

        } catch (SQLException ex) {

            System.out.println("ERRO:" + ex.getMessage());
            return null;
        }
    }
    
    public Venda obterPorId(int id) {
        try {

            Venda ret = null;

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
            
            ClienteRdn cliRdn = new ClienteRdn();
            FuncionarioRdn funcRdn = new FuncionarioRdn(); 
            
            if (rs.next()) {
                
                Cliente cli = cliRdn.obterPorId(rs.getInt("ID"));
                Funcionario func = funcRdn.obterPorId(rs.getInt("ID"));
                
                ret = new Venda(rs.getInt("ID"),
                        cli,
                        func);                
            }
            return ret;

        } catch (SQLException ex) {

            System.out.println("ERRO:" + ex.getMessage());
            return null;
        }
    }   
}

