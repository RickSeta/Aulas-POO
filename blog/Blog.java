
package uff.ic.lleme.tcc00328.exercicios.blog;

import uff.ic.lleme.tcc00328.exercicios.blog.Controle.Controlador;
import uff.ic.lleme.tcc00328.exercicios.blog.Model.Usuario;

public class Blog {
    public static void main(String[] args) {
        
        String userid = "";
        String password = "";
        Usuario usuarioCorrente = Controlador.validarUsuario(userid, password);
    }
}
