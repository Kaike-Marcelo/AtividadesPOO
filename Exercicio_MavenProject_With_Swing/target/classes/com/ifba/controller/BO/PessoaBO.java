/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.controller.BO;

import com.ifba.model.dao.PessoaDAO;
import com.ifba.model.entity.PessoaModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kaike Marcelo
 */
 public class PessoaBO {
    
    public boolean incluir(PessoaModel pessoaM) {

        try {
            if (!pessoaM.getEmail().isBlank() && !pessoaM.getNome().isBlank()) {
                PessoaDAO pessoaDao = new PessoaDAO();
                pessoaDao.incluir(pessoaM);
                
                return true;
            } //else {
                //System.out.println("Erro! Email e Nome devem ser preenchidos.");
            //}

        } catch (NullPointerException ex) {
            ex.printStackTrace();

            System.out.println("Erro ao incluir pessoa." + ex.getMessage());
        }
        return false;
    }

    
    
    
    
    public boolean alterar(PessoaModel pessoaM){
        
        try {
            if (!pessoaM.getEmail().isBlank() && !pessoaM.getNome().isBlank()) {
                PessoaDAO pessoaDao = new PessoaDAO();
                pessoaDao.alterar(pessoaM);
                
                return true;
            } /*else {
                System.out.println("Erro! Nome e Email devem ser preenchidos.");
            }*/
            
        } catch (NullPointerException e) {
            System.out.println("Erro ao alterar pessoa. " + e.getMessage());
        }
        
        return false;
    }
    
    
    
    
    public boolean excluir(PessoaModel pessoaM) {
        
        try {
            
            PessoaDAO pessoaDao = new PessoaDAO();
            pessoaDao.excluir(pessoaM);
            
            return true;

        } catch (NullPointerException e) {
            System.out.println("Erro ao excluir pessoa. " + e.getMessage());
        }
        return false;
    }
    
    
    
    
    public List<PessoaModel> consulta(){
       
        List<PessoaModel> listaPessoas = new ArrayList<PessoaModel>();
        
        try{

            PessoaDAO pessoaDao = new PessoaDAO();
            listaPessoas = pessoaDao.consulta(listaPessoas);


        }catch (NullPointerException ex){
            System.out.println("Erro ao fazer consulta de pessoa. " + ex.getMessage());
        }
       
      return listaPessoas;
   }
}
