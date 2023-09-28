/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ulbra.model;

/**
 *
 * @author S.Lucas
 */
public class Livro {
    private  int pkLivro;
    private String nomeLivro;
    private String genLivro;
    private String LançLivro;
    private  int estoqueLivro;

    public int getPkLivro() {
        return pkLivro;
    }

    public void setPkLivro(int pkLivro) {
        this.pkLivro = pkLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getGenLivro() {
        return genLivro;
    }

    public void setGenLivro(String genLivro) {
        this.genLivro = genLivro;
    }

    public String getLançLivro() {
        return LançLivro;
    }

    public void setLançLivro(String LançLivro) {
        this.LançLivro = LançLivro;
    }

    public int getEstoqueLivro() {
        return estoqueLivro;
    }

    public void setEstoqueLivro(int estoqueLivro) {
        this.estoqueLivro = estoqueLivro;
    }

      public String toString () {
       return "Usuário(" + "pkLivro" + pkLivro + ", nomeLivro" + nomeLivro
               + ", genLivro" + genLivro + ", LançamentoLivro" + LançLivro
               + ", estoqueLivro" + estoqueLivro + ')';
   }
    
    

}
