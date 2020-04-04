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
public class MultaTest {
    
    public MultaTest() {
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
     * Test of pagarMulta method, of class Multa.
     */
    @Test
    public void testPagarMulta() {
        System.out.println("pagarMulta");
        Multa instance = new Multa();
        boolean expResult = false;
        boolean result = instance.pagarMulta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearMulta method, of class Multa.
     */
    @Test
    public void testCrearMulta() {
        System.out.println("crearMulta");
        String razon = "";
        int monto = 0;
        int refMensualdad = 0;
        Multa instance = new Multa();
        boolean expResult = false;
        boolean result = instance.crearMulta(razon, monto, refMensualdad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarMulta method, of class Multa.
     */
    @Test
    public void testModificarMulta() {
        System.out.println("modificarMulta");
        String razon = "";
        int monto = 0;
        int refMensualdad = 0;
        Multa instance = new Multa();
        boolean expResult = false;
        boolean result = instance.modificarMulta(razon, monto, refMensualdad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRazon method, of class Multa.
     */
    @Test
    public void testGetRazon() {
        System.out.println("getRazon");
        Multa instance = new Multa();
        String expResult = "";
        String result = instance.getRazon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonto method, of class Multa.
     */
    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        Multa instance = new Multa();
        int expResult = 0;
        int result = instance.getMonto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsPagada method, of class Multa.
     */
    @Test
    public void testIsIsPagada() {
        System.out.println("isIsPagada");
        Multa instance = new Multa();
        boolean expResult = false;
        boolean result = instance.isIsPagada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRefMensualidad method, of class Multa.
     */
    @Test
    public void testGetRefMensualidad() {
        System.out.println("getRefMensualidad");
        Multa instance = new Multa();
        int expResult = 0;
        int result = instance.getRefMensualidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
