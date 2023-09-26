/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ulbra.controller;

import br.ulbra.model.Livro;
import br.ulbra.model.LivroUsuDAO;
import br.ulbra.model.Usuario;

/**
 *
 * @author S.Lucas
 */
public class LivroUsuController {
     private LivroUsuDAO livroUsuDAO;

    public LivroUsuController() {
        livroUsuDAO = new LivroUsuDAO();
    }
    
     public boolean alugarLivro(int usuarioid, int livroid) {
       
            return livroUsuDAO.alugarLivro(usuarioid,livroid);

        
    }
}
