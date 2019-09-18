
package uff.ic.lleme.tcc00328.exercicios.blog.Controle;

import uff.ic.lleme.tcc00328.exercicios.blog.Model.Usuario;

public abstract class Controlador {

    public static Usuario validarUsuario(String userid, String password) {
        return BD.consultarUsuario(userid,password);
    }
    
}
