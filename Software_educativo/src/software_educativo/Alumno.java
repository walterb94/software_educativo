/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_educativo;

/**
 *
 * @author User
 */
public class Alumno {
    private String legajo;
    private Tutor tutor;

    public Alumno() {
    }

    public Alumno(String legajo, Tutor tutor) {
       
        this.legajo = legajo;
        this.tutor = tutor;
    }
    
    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

}
