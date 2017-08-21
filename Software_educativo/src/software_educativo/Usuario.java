/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_educativo;

import java.util.List;

/**
 *
 * @author User
 */
public class Usuario {
    Long id;
    String username;
    String mail;
   
    public static boolean isUsuarioUnico(Usuario u, List baseDatosUsuarios){
        if (baseDatosUsuarios.contains(u)){
            return false;
        }
        else {
            return true;
        }
    }

    public Usuario(Long id, String username, String mail) {
        this.id = id;
        this.username = username;
        this.mail = mail;
    }
}

