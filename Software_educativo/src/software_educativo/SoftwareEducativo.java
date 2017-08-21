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
    /*public static boolean prueba(){
        boolean comparacion;
        comparacion = (5>3 && 5<7);
        System.out.println(comparacion);
        return comparacion;
    }*/
    
    //3)
    public static boolean verificarMayusculaNumero(String contraseña1){
        String contraseña = contraseña1;
        boolean mayuscula = false;
        boolean numero = false;
        boolean mayusculaYnumero;
        char c;
        
          for (int i = 0; i < contraseña.length(); i++) {
            c = contraseña.charAt(i);
            if (c>='A' && c<='Z') {
                mayuscula = true;
            } else {
                    if ((c>='0'&& c<='9')) {
                        numero = true;
                }
            }
        }
          mayusculaYnumero = (mayuscula && numero);
          return mayusculaYnumero;
        
    }
    //4)
    public static boolean verificarLongitudContraseña(String contraseña1){
        String contraseña = contraseña1;
        
        if (contraseña.length()>6 && contraseña.length()<16) {
            return true;
        } else{
    return false;}
    }
    //5)
    public static boolean verificarContraseñaSinSimbolos(String contraseña1){
        String contraseña = contraseña1;
        char c;
        boolean valorRetorno = true;
        for (int i = 0; i < contraseña.length(); i++) {
            c = contraseña.charAt(i);
            if ((c>='0'&& c<='9') || (c>='a' && c<='z') || (c>='A' && c<='Z')) {
                valorRetorno = true;
            } else {
                valorRetorno = false;
                break;
            }
        }
        return valorRetorno;
    }
    }
    

