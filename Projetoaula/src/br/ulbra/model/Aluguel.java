/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ulbra.model;

/**
 *
 * @author S.Lucas
 */
public class Aluguel {

    private int id_aluguel;
    private int fklivro;
    private int fkusuario;
    private int acao;

    public int getAcao() {
        return acao;
    }

    public void setAcao(int acao) {
        this.acao = acao;
    }

    public int getId_aluguel() {
        return id_aluguel;
    }

    public void setId_aluguel(int id_aluguel) {
        this.id_aluguel = id_aluguel;
    }

    public int getfklivro() {
        return fklivro;
    }

    public void setfklivro(int fklivro) {
        this.fklivro = fklivro;
    }

    public int getfkusuario() {
        return fkusuario;
    }

    public void setfkusuario(int fkusuario) {
        this.fkusuario = fkusuario;
    }

    public String toString() {
        return "Aluguel(" + "fkusuario" + getfkusuario() + ", fklivro" + getfklivro()
                + ", id_aluguel" + getId_aluguel() + ", acao" + getAcao() + ')';
    }

    public String acaoToString() {
        if (this.acao == 1) {
            return "Alugado";
        } else {
            return "Devolvido";
        }
    }
}
