
package uff.ic.lleme.tcc00328.exercicios.blog.Controle;

import java.util.ArrayList;
import java.util.List;
import uff.ic.lleme.tcc00328.exercicios.blog.Model.Usuario;

public class BD {
    
    private static List<Usuario> usuarios = new ArrayList<>();
    
    public static Usuario consultarUsuario(String userid, String password) {
        for(Usuario u : usuarios){
           if(u.nome == userid ){
               return u;
           }
        }return null;
    }
}
