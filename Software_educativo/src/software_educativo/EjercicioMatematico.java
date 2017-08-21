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
public class EjercicioMatematico {
    Long id;
    String descripcion;

    public EjercicioMatematico(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    
    public static boolean isEjercicioUnico(EjercicioMatematico ej, List baseDatos){
        if (baseDatos.contains(ej)){
            return false;
        }
        else {
            return true;
        }
    }

}
