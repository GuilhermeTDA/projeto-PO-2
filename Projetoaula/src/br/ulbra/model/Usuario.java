/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;

/**
 *
 * @author aluno.saolucas
 */
public class Usuario {
    
    private  int pkUsuario;
    private String nomeUsu;
    private String emailUsu;
    private String dataNascUsu;
    private  int ativoUsu;
    private String  senhaUsu;

    public int getPkUsuario() {
        return pkUsuario;
    }

    public void setPkUsuario(int pkUsuario) {
        this.pkUsuario = pkUsuario;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getDataNascUsu() {
        return dataNascUsu;
    }

    public void setDataNascUsu(String dataNascUsu) {
        this.dataNascUsu = dataNascUsu;
    }

    public int getAtivoUSu() {
        return ativoUsu;
    }

    public void setAtivoUSu(int ativoUSu) {
        this.ativoUsu = ativoUSu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }
    
      public String ativoToString(){
       if (this.ativoUsu == 1)
           return "Ativo";
       else 
           return "Inativo";
   }
    
   @Override
   public String toString () {
       return "Usuário(" + "pkUsuario" + pkUsuario + ", nomeUsu" + nomeUsu
               + ", emailUsu" + emailUsu + ", dataNascuUsu" + dataNascUsu
               + ", ativoUsu" + ativoUsu + ", senhaUsu" + senhaUsu + ')';
   }
    
 
   
 
    
}
