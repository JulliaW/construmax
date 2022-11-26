package br.com.construmax.rdn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    private String URL = "jdbc:sqlserver://localhost:1433;databaseName=db_construmax;trustServerCertificate=true;integratedSecurity=true;";
    
    public Connection getConnection(){
        try {
            return DriverManager.getConnection(this.URL);
        }
        catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
