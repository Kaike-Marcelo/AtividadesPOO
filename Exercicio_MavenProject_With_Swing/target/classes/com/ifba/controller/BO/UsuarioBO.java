package com.ifba.controller.BO;

import com.ifba.model.entity.Usuario;
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
