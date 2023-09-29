/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ulbra.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author S.Lucas
 */
public class AluguelDAO {
 
      private GerenciadorConexao gerenciador;

    public AluguelDAO() {
        this.gerenciador = GerenciadorConexao.getInstancia();
    }
    
    public boolean alugarLivro( int idUsuario, int idLivro) {
         GerenciadorConexao gerenciador = GerenciadorConexao.getInstancia();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        try {
            String sql = "INSERT INTO aluguel (fkusuario, fklivro,acao) VALUES (?,?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, idUsuario);
            statement.setInt(2, idLivro);
            statement.setInt(3, 1);
  
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Livro alugado com sucesso!");
                 alterarStatusLivro(idLivro,1);
                return true;
            } else {
                System.out.println("Não foi possível alugar o livro.");
            }
  
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            GerenciadorConexao.closeConnection(con,stmt );
        }
        return false;
        
    }
    
     public boolean devolverLivro( int idUsuario, int idLivro) {
        GerenciadorConexao gerenciador = GerenciadorConexao.getInstancia();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        try {
            String sql = "INSERT INTO aluguel (fkusuario, fklivro,acao) VALUES (?,?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, idUsuario);
            statement.setInt(2, idLivro);
            statement.setInt(3, 0);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Livro devolvido com sucesso!");
                alterarStatusLivro(idLivro,0);
                return true;
            } else {
                System.out.println("Não foi possível devolver o livro.");
            }

            // Fecha a declaração
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            GerenciadorConexao.closeConnection(con,stmt );
        }
        return false;
        
    }
    public List<Aluguel> readForDesc(String desc) {
        String sql = "SELECT * FROM aluguel WHERE id_aluguel LIKE ?";
        GerenciadorConexao gerenciador = GerenciadorConexao.getInstancia();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Aluguel> alugueis = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + desc + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Aluguel aluguel = new Aluguel();

                aluguel.setId_aluguel(rs.getInt("id_aluguel"));
                aluguel.setfklivro(rs.getInt("fklivro"));
                aluguel.setfkusuario(rs.getInt("fkusuario"));
                aluguel.setAcao(rs.getInt("acao"));
               
                alugueis.add(aluguel);

            }

        } catch (SQLException ex) {
            Logger.getLogger(AluguelDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            GerenciadorConexao.closeConnection(con, stmt, rs);
        }
        return alugueis;

    }
      public boolean alterarStatusLivro(int fklivro, int status) {
        GerenciadorConexao gerenciador = GerenciadorConexao.getInstancia();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE tblivro SET "
                    + " estoquelivro = ? WHERE pkLivro = ?");
            stmt.setInt(1, status);
            stmt.setInt(2, fklivro);

            stmt.executeUpdate();

           
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            GerenciadorConexao.closeConnection(con, stmt);
        }
        return false;
    }

    

}
