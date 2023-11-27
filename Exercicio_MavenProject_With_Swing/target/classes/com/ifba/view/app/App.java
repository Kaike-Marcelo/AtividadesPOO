package com.ifba.view.app;

import com.ifba.controller.BO.PessoaBO;
import migracao.TabelasDB;


public class App {

    public static void main(String[] args) {
    
        
        TabelasDB.criarTabelas();
        
        PessoaBO pessoaBo = new PessoaBO();
        
        //PessoaModel pessoa = new PessoaModel();
        
        /*
        // INSERIR
        
        pessoa.setNome("Andersson");
        pessoa.setEmail("andersson@gmail.com");
        pessoa.setSenha("senhaanderson");
    
        pessoaBo.incluir(pessoa);
        pessoaBo.consulta();*/
        
        /*
        // ALTERAR
        
        pessoa.setId(1);
        pessoa.setNome("Camilo Reinnam");
        pessoa.setEmail("Camilinha@gmail.com");
        
        pessoaBo.alterar(pessoa);*/
        
        
        /*
        // LISTAR
        
        List<PessoaModel> listaPessoa = pessoaBo.consulta();
        
        for (PessoaModel pessoa : listaPessoa) {
            System.out.println("Id: " + pessoa.getId());
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Email:  " + pessoa.getEmail());
            System.out.println("Senha: " + pessoa.getSenha());
        }*/
        
        
        /*
        // EXCLUIR
        
        pessoa.setId(1);
        
        pessoaBo.excluir(pessoa);
        pessoaBo.consulta();*/
    }
}