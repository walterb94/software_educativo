/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import software_educativo.SoftwareEducativo;

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
    /*int x = SoftwareEducativo.multiplicacion.resultado;
    float resultadoReal = EmpleadoBR.calculaSalarioBruto(
                           TipoEmpleado.vendedor, 2000.0f, 8.0f);
    float resultadoEsperado = 1360.0f;
    assertEquals(resultadoEsperado, resultadoReal, 0.01);*/
  }
//
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
