/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.modelo;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author cleberlira
 */
public class UsuarioBO {
    
    
     public List<Usuario> consulta(){
      
         
          
          List<Usuario> usuarios =  new ArrayList<Usuario>();
          
          Usuario usuario1 = new Usuario();
          
          usuario1.setIdUsuario(1);
          usuario1.setNome("Cleber");
          
          usuarios.add(usuario1);
         
           Usuario usuario2 = new Usuario();
         
          
          usuario2.setIdUsuario(2);
          usuario2.setNome("Maria");
          
          usuarios.add(usuario2);
          
          
          
          return usuarios;
          
          
      }
}
