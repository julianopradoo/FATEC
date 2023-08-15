/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory;

import java.io.IOException;
import java.sql.*;

/**
 *
 * @author Juliano
 */
public class TestaConexao {

    /**
     * @param args the command line arguments
     * @throws factory.TestaConexao.SQLException
     * @throws factory.SQLException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws SQLException, IOException, java.sql.SQLException {
        // TODO code application logic here
        Connection connection = new ConnectionFactory().getConnection();
        System.out.print("Conexão aberta");
        connection.close();
    }

    private static class SQLException extends Exception {

        public SQLException() {
        }
    }
    
}
