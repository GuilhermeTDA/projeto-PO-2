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
            // Insere um novo registro na tabela de aluguel
            String sql = "INSERT INTO aluguel (pkusuario, pklivro) VALUES (?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, idUsuario);
            statement.setInt(2, idLivro);

            // Executa a inserção
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Livro alugado com sucesso!");
                return true;
            } else {
                System.out.println("Não foi possível alugar o livro.");
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

                Aluguel usuario = new Usuario();

                usuario.setPk(rs.getInt("pkusuario"));
                usuario.setNome(rs.getString("nomeusu"));
                usuario.setEmail(rs.getString("emailusu"));
                usuario.setSenha(rs.getString("senhausu"));
                usuario.setDataNasc(rs.getString("datanascusu"));
                usuario.setAtivo(rs.getInt("ativousu"));
                usuarios.add(usuario);

            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            GerenciadorConexao.closeConnection(con, stmt, rs);
        }
        return usuarios;

    }
    
    

}
