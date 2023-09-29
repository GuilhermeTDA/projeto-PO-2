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
import javax.swing.JOptionPane;
import java.util.logging.Logger;

/**
 *
 * @author S.Lucas
 */
public class LivroDAO {

    private GerenciadorConexao gerenciador;

    public LivroDAO() {
        this.gerenciador = GerenciadorConexao.getInstancia();
    }

    public boolean adicionarLivro(String nome, String genero, String lançamento, int estoque) {
        String sql = "INSERT into tblivro (nomeLivro,genLivro,lançLivro,estoqueLivro) "
                + "VALUES (?,?,?,?)";

        try {
            PreparedStatement stmt = gerenciador.getConexao().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, genero);
            stmt.setString(3, lançamento);
            stmt.setInt(4, estoque);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Livro: " + nome + " inserido com sucesso");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        }
        return false;
    }

    public List<Livro> read() {
        String sql = "SELECT * FROM tblivro";
        List<Livro> livros = new ArrayList<>();

        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Livro livro = new Livro();

                livro.setPkLivro(rs.getInt("pklivro"));
                livro.setNomeLivro(rs.getString("nomelivro"));
                livro.setLançLivro(rs.getString("lançlivro"));
                livro.setGenLivro(rs.getString("genlivro"));
                livro.setEstoqueLivro(rs.getInt("estoquelivro"));

                livros.add(livro);

            }
        } catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            GerenciadorConexao.closeConnection(con, stmt, rs);
        }
        return livros;
    }

    public List<Livro> readForDesc(String desc) {
        String sql = "SELECT * FROM tblivro WHERE nomelivro LIKE ?";
        GerenciadorConexao gerenciador = GerenciadorConexao.getInstancia();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Livro> livros = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + desc + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Livro livro = new Livro();

                livro.setPkLivro(rs.getInt("pklivro"));
                livro.setNomeLivro(rs.getString("nomelivro"));
                livro.setLançLivro(rs.getString("lançlivro"));
                livro.setGenLivro(rs.getString("genlivro"));
                livro.setEstoqueLivro(rs.getInt("estoquelivro"));

                livros.add(livro);
            }

        } catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            GerenciadorConexao.closeConnection(con, stmt, rs);
        }
        return livros;

    }

    public Livro readForPk(int pk) {
        String sql = "SELECT * FROM tbulivro WHERE pklivro = ?";
        GerenciadorConexao gerenciador = GerenciadorConexao.getInstancia();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Livro livro = new Livro();

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, pk);

            rs = stmt.executeQuery();

            while (rs.next()) {

                livro.setPkLivro(rs.getInt("pklivro"));
                livro.setNomeLivro(rs.getString("nomelivro"));
                livro.setLançLivro(rs.getString("lançlivro"));
                livro.setGenLivro(rs.getString("genlivro"));
                livro.setEstoqueLivro(rs.getInt("estoquelivro"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            GerenciadorConexao.closeConnection(con, stmt, rs);
        }
        return livro;
    }

    public boolean alterarLivro(Livro l) {
        GerenciadorConexao gerenciador = GerenciadorConexao.getInstancia();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE tblivro SET nomelivro = ?, "
                    + " genlivro = ?,lançlivro = ?, "
                    + " estoquelivro = ? WHERE pkLivro = ?");
            stmt.setString(1, l.getNomeLivro());
            stmt.setString(2, l.getLançLivro());
            stmt.setString(3, l.getGenLivro());
            stmt.setInt(4, l.getEstoqueLivro());
            stmt.setInt(5, l.getPkLivro());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            GerenciadorConexao.closeConnection(con, stmt);
        }
        return false;
    }

    public boolean excluirLivro(int pkLivro) {
        GerenciadorConexao gerenciador = GerenciadorConexao.getInstancia();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tblivro WHERE pklivro = ?");
            stmt.setInt(1, pkLivro);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            GerenciadorConexao.closeConnection(con, stmt);
        }
        return false;
    }
}
