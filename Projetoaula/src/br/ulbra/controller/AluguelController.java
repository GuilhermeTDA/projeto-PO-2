/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ulbra.controller;

import br.ulbra.model.AluguelDAO;
import br.ulbra.model.Usuario;
import java.util.List;

/**
 *
 * @author S.Lucas
 */
public class AluguelController {
     private AluguelDAO livroUsuDAO;

    public AluguelController() {
        livroUsuDAO = new AluguelDAO();
    }
    
     public boolean alugarLivro(int usuarioid, int livroid) {
       
            return livroUsuDAO.alugarLivro(usuarioid,livroid);

        
    } 
     
      public boolean devolverLivro (int usu,int livro) {
             return livroUsuDAO.devolverLivro(int usu,int livro);
         }
      
       public List<Aluguel> readForDesc(String desc) {
        return livroUsuDAO.readForDesc(desc);
    }
      
     
}
