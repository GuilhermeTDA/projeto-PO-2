/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ulbra.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author S.Lucas
 */
public class LivroUsuDAO {
 
      private GerenciadorConexao gerenciador;

    public LivroUsuDAO() {
        this.gerenciador = GerenciadorConexao.getInstancia();
    }
    
    public boolean alugarLivro( int idUsuario, int idLivro) {
         GerenciadorConexao gerenciador = GerenciadorConexao.getInstancia();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        try {
            // Insere um novo registro na tabela de aluguel
            String sql = "INSERT INTO aluguel (id_usuario, id_livro) VALUES (?, ?)";
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
    

}
