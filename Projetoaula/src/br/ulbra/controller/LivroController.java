/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ulbra.controller;

import br.ulbra.model.Livro;
import br.ulbra.model.LivroDAO;
import java.util.List;
/**
 *
 * @author S.Lucas
 */
public class LivroController {
    
     private LivroDAO livroDAO;
    public LivroController() {
        livroDAO = new LivroDAO();
    }
    
    
      public boolean adicionarLivro (String nomelivro,String  genlivro,String lançlivro,int estoquelivro){
         return  livroDAO.adicionarLivro(nomelivro, genlivro, lançlivro, estoquelivro);
      }
    
      public List <Livro> readForDesc(String desc) {
          return livroDAO.readForDesc(desc);
      }
      
       public Livro readForPk (int pk) {
          return livroDAO.readForPk(pk);
      }
       
        public boolean alterarLivro(Livro l) {
            return livroDAO.alterarLivro(l);
        }
        
         public boolean excluirLivro (int pkLivro) {
             return livroDAO.excluirLivro(pkLivro);
         }
 
         
}
