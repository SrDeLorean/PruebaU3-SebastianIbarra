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
        boolean expResult = false;
        boolean result = instance.pagarMensualidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearMensualidad method, of class Mensualidad.
     */
    @Test
    public void testCrearMensualidad() {
        System.out.println("crearMensualidad");
        Mensualidad instance = new Mensualidad();
        boolean expResult = false;
        boolean result = instance.crearMensualidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarMensualidad method, of class Mensualidad.
     */
    @Test
    public void testModificarMensualidad() {
        System.out.println("modificarMensualidad");
        Mensualidad instance = new Mensualidad();
        boolean expResult = false;
        boolean result = instance.modificarMensualidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonto method, of class Mensualidad.
     */
    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        Mensualidad instance = new Mensualidad();
        int expResult = 0;
        int result = instance.getMonto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMontoTotal method, of class Mensualidad.
     */
    @Test
    public void testGetMontoTotal() {
        System.out.println("getMontoTotal");
        Mensualidad instance = new Mensualidad();
        int expResult = 0;
        int result = instance.getMontoTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMes method, of class Mensualidad.
     */
    @Test
    public void testGetMes() {
        System.out.println("getMes");
        Mensualidad instance = new Mensualidad();
        String expResult = "";
        String result = instance.getMes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsPagada method, of class Mensualidad.
     */
    @Test
    public void testIsIsPagada() {
        System.out.println("isIsPagada");
        Mensualidad instance = new Mensualidad();
        boolean expResult = false;
        boolean result = instance.isIsPagada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRefSocio method, of class Mensualidad.
     */
    @Test
    public void testGetRefSocio() {
        System.out.println("getRefSocio");
        Mensualidad instance = new Mensualidad();
        int expResult = 0;
        int result = instance.getRefSocio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
