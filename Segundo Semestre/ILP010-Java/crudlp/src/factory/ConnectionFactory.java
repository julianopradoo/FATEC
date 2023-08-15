/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;
import java.sql.Connection; //conexão sql para java
import java.sql.DriverManager; //Driver de conexão SQL para java
import java.sql.SQLException; //classe para tratamento de exceções
/**
 *
 * @author Juliano
 */
public class ConnectionFactory {
    public Connection getConnection(){
        Connection con = null;
        try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/db_alunos", "root", "fatec");
                return con;
            }
        catch(SQLException excecao){
            throw new RuntimeException(excecao);
        }
    
    }
    
    
    
    
    
    
    
}
