/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import factory.ConnectionFactory;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import modelo.Aluno;
/**
 *
 * @author Juliano
 */
public class AlunoDAO {
    private Connection connection;
    
    public AlunoDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Aluno aluno){
        ConnectionFactory conector = new ConnectionFactory();
        Connection con = conector.getConnection();
        
        String sql = "INSERT INTO tbl_alunos(nome_aluno, cpf_aluno, nasc_aluno, altura_aluno, peso_aluno, imc_aluno) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            //String id_aux = Integer.toString(aluno.getNome();
            stmt.setString(1, aluno.getNome());
             stmt.setString(2, aluno.getCpf());
              stmt.setString(3, aluno.getNascimento());
               stmt.setString(4, aluno.getAltura());
                stmt.setString(5, aluno.getPeso());
                 stmt.setString(6, aluno.getImc());
            stmt.execute();
            stmt.close();
            }
        
        catch (SQLException u){
            throw new RuntimeException(u);
        }
        
    }
    
    
    public void seleciona(javax.swing.JTable tblregistro){
    
        DefaultTableModel modelo = (DefaultTableModel) tblregistro.getModel();
        modelo.setRowCount(0);
        ConnectionFactory conector = new ConnectionFactory();
        Connection con = conector.getConnection();
        
        String sql = "SELECT * FROM tbl_alunos; ";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            DefaultTableModel tbl = (DefaultTableModel)tblregistro.getModel();
            while (rs.next()) {
                int id_aluno = rs.getInt("id_aluno"); 
                String nome_aluno = rs.getString("nome_aluno"); 
                String cpf_aluno = rs.getString("cpf_aluno"); 
                String nasc_aluno = rs.getString("nasc_aluno");
                double altura_aluno = rs.getDouble("altura_aluno"); 
                double peso_aluno = rs.getDouble("peso_aluno");
                double imc_aluno = rs.getDouble("imc_aluno");   
                tbl.addRow(new Object[]{nome_aluno, cpf_aluno, nasc_aluno, altura_aluno, peso_aluno, imc_aluno});
            }   
            stmt.close();
            }
        
        catch (SQLException u){
            throw new RuntimeException(u);
        }
        
    }
    
    public void deleta (String cpf){
        ConnectionFactory conector = new ConnectionFactory();
        Connection con = conector.getConnection();
        
        String sql = "DELETE FROM tbl_alunos WHERE cpf_aluno = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            //String id_aux = Integer.toString(aluno.getNome();
            stmt.setString(1, cpf);
             
            stmt.execute();
            stmt.close();
            }
        
        catch (SQLException u){
            throw new RuntimeException(u);
        }
        
    }
    
     public void atualiza(Aluno aluno, String cpf){
        ConnectionFactory conector = new ConnectionFactory();
        Connection con = conector.getConnection();
        
        String sql = "UPDATE tbl_alunos SET nome_aluno = ?, cpf_aluno = ?, nasc_aluno = ?, altura_aluno = ?, peso_aluno = ?, imc_aluno = ? WHERE cpf_aluno = ?;";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            //String id_aux = Integer.toString(aluno.getNome();
            stmt.setString(1, aluno.getNome());
             stmt.setString(2, aluno.getCpf());
              stmt.setString(3, aluno.getNascimento());
               stmt.setString(4, aluno.getAltura());
                stmt.setString(5, aluno.getPeso());
                 stmt.setString(6, aluno.getImc());
                 stmt.setString(7, cpf);
            stmt.execute();
            stmt.close();
            }
        
        catch (SQLException u){
            throw new RuntimeException(u);
        }
        
    }
    
     
     
     
     
     
     
     
    }
    
    

