/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_educativo;

/**
 *
 * @author walter
 */
public class SoftwareEducativo {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static int multiplicacion (int nroUno,int nroDos){        
        int resultado = nroUno*nroDos;
        return resultado;
    }
    public static int resta (int num1, int num2){
        int resultado = num1 - num2;
        return resultado;        
    }
    public static int suma (int num1, int num2){
        int resultado = num1 + num2;
        return resultado;
    }
    @SuppressWarnings("empty-statement")
    public static int division (int nominador,int denominador){        
        if(denominador == 0) { 
            System.out.println("No puede dividir por cero");    
            throw new ArithmeticException();
        }
        int resultado = nominador/denominador;
        return resultado;
    }
    class Usuario {
    String usuario;
    String contraseña;
    TipoUsuario tipo;

        public Usuario() {
        }

        public String getUsuario() {
            return usuario;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public String getContraseña() {
            return contraseña;
        }

        public void setContraseña(String contraseña) {
            this.contraseña = contraseña;
        }

        public TipoUsuario getTipo() {
            return tipo;
        }

        public void setTipo(TipoUsuario tipo) {
            this.tipo = tipo;
        }
    
    
    }
    class TipoUsuario {
    String nombre;

        public TipoUsuario() {
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
    }
    
    }
    

