/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import software_educativo.Alumno;
import software_educativo.EjercicioMatematico;
import software_educativo.SoftwareEducativo;
import software_educativo.Tutor;
import software_educativo.Usuario;

/**
 *
 * @author walter
 */
public class SoftwareEducativoTest {
    
    public SoftwareEducativoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
//Al multiplicar, verificar que los datos de entrada sean números enteros

    @Test
  public void testMultiplicacion() {
    int resultadoReal = SoftwareEducativo.multiplicacion(4, 50);
    int resultadoEsperado = 200;
    assertEquals(resultadoEsperado, resultadoReal);
    
  }

  @Test
  public void testSuma(){
      int resultado = SoftwareEducativo.suma(2, 3);
      int esperado=5;
      assertEquals(esperado, resultado);
  }
  @Test
   public void testResta(){
      int resultado = SoftwareEducativo.resta(12, 3);
      int esperado=9;
      assertEquals(esperado, resultado);
      
  }
   //3)Verificar que el registro de alumnos exija una contraseña con al menos una mayúscula, un número.
   @Test
   public void test_VerificarContraseñaAlumnosConUnaMayusculaYNumero(){
       boolean esCorrecto;
       esCorrecto = SoftwareEducativo.verificarMayusculaNumero("contraseñA1");
       assertTrue(esCorrecto);
   }
   //4)Verificar que la contraseña sea mayor a 6 caracteres y menor o igual a 15 caracteres de longitud 
   @Test
   public void test_verificacionLongitudContraseña(){
       boolean esValida;
       esValida= SoftwareEducativo.verificarLongitudContraseña("contraseña");
       assertTrue(esValida);
   }
   //5)Verificar que la contraseña no contenga símbolos.
   @Test
   public void test_verificarContraseñaSinSimbolos(){
       boolean esValida;
       esValida = SoftwareEducativo.verificarContraseñaSinSimbolos("contrasena");
       assertTrue(esValida);
   }
   @Test
   public void testVerificarUsuario(){
     boolean resultadoReal = SoftwareEducativo.verificarUsuario("dacanizzo");
     boolean resultadoEsperado = false; 
     assertEquals(resultadoEsperado, resultadoReal);
    }
   @Test(expected = ArithmeticException.class)
   public void testDivisionPorCero(){
      int numerador = 5;
      int divisor = 0;
      SoftwareEducativo.division(numerador, divisor);
      
}
   @Test
   public void testDivision(){
       int esperado=4;
       int resultado= SoftwareEducativo.division(8,2);
       assertEquals(esperado, resultado);
       System.out.println("Test división correcto");
   }

   @Test
    public void isUsuarioUnicoTest(){
        List<Usuario> baseDeDatosTest=new ArrayList<Usuario>();
        Usuario usuarioAValidar= new Usuario(new Long(1),"nicolas","nico@utn.com");
        Usuario u2=new Usuario(new Long(2),"walter","walter@utn.com");
        Usuario u3=new Usuario(new Long(3),"fausto","fausto@utn.com");
        baseDeDatosTest.add(usuarioAValidar);
        baseDeDatosTest.add(u2);
        baseDeDatosTest.add(u3);
        boolean resultado=Usuario.isUsuarioUnico(usuarioAValidar, baseDeDatosTest);
        assertEquals(true,resultado);
        
    }
    @Test
   public void testIsEjercicioUnico(){
       List<EjercicioMatematico> basededatos=new ArrayList<EjercicioMatematico>();
       EjercicioMatematico ejercicioValidar=new EjercicioMatematico(new Long(1),"x - 1 =");
       EjercicioMatematico ej2=new EjercicioMatematico(new Long(2),"x - 2 =");
       EjercicioMatematico ej3=new EjercicioMatematico(new Long(3),"x - 3 =");
       basededatos.add(ejercicioValidar);
       basededatos.add(ej2);
       basededatos.add(ej3);
       boolean resultado=EjercicioMatematico.isEjercicioUnico(ejercicioValidar, basededatos);
       assertEquals(true, resultado);
   }
   @Test
    public void test_verificarEmail(){
       boolean esValido;
       esValido = SoftwareEducativo.verificacionEmail("ingenieria_software@gmail.com");
       assertTrue(esValido);
   }
    //11) Verificar que por cada usuario niño haya un usuario tutor asociado.
    @Test
    public void test_verificarAlumnoTutor(){
        boolean esValido;
        Alumno al = new Alumno("2222", new Tutor ("Pedro"));
        esValido = SoftwareEducativo.alumnoTutor(al);
        assertTrue(esValido);
        
        
    }

}
