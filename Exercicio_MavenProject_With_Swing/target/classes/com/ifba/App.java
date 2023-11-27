package com.ifba;

import com.ifba.controller.BO.PessoaBO;
import com.ifba.view.TelaPrincipal;
import migracao.TabelasDB;


public class App {

    public static void main(String[] args) {
    
        
        TabelasDB.criarTabelas();
        
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
    }
}