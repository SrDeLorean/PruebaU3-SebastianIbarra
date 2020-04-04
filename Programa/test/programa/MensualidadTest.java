/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author xebae
 */
public class MensualidadTest {
    
    public MensualidadTest() {
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

    /**
     * Test of pagarMensualidad method, of class Mensualidad.
     */
    @Test
    public void testPagarMensualidad() {
        System.out.println("pagarMensualidad");
        Mensualidad instance = new Mensualidad();
        boolean expResult = true;
        boolean result = instance.pagarMensualidad();
        assertEquals(expResult, result);
        assertEquals(true, instance.isIsPagada());
    }

    /**
     * Test of crearMensualidad method, of class Mensualidad.
     */
    @Test
    public void testCrearMensualidad() {
        System.out.println("crearMensualidad");
        Mensualidad instance = new Mensualidad();
        String mes= "enero";
        int refSocio = 1;
        boolean expResult = true;
        boolean result = instance.crearMensualidad(mes, refSocio);
        assertEquals(expResult, result);
        
        mes= "gqwease";
        refSocio = 1;
        expResult = false;
        result = instance.crearMensualidad(mes, refSocio);
        assertEquals(expResult, result);
        
        mes= "enero";
        refSocio = -1;
        expResult = false;
        result = instance.crearMensualidad(mes, refSocio);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of modificarMensualidad method, of class Mensualidad.
     */
    @Test
    public void testModificarMensualidad() {
        System.out.println("modificarMensualidad");
        Mensualidad instance = new Mensualidad();
        String mes= "enero";
        int refSocio = 1;
        boolean isPagada = true;
        boolean expResult = true;
        boolean result = instance.modificarMensualidad(mes, refSocio, isPagada);
        assertEquals(expResult, result);
        assertEquals(mes, instance.getMes());
        assertEquals(refSocio, instance.getRefSocio());
        assertEquals(isPagada, instance.isIsPagada());
    }

}
