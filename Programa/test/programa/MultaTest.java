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
        boolean expResult = true;
        boolean result = instance.pagarMulta();
        assertEquals(expResult, result);
        assertEquals(true, instance.isIsPagada());
    }

    /**
     * Test of crearMulta method, of class Multa.
     */
    @Test
    public void testCrearMulta() {
        System.out.println("crearMulta");
        String razon = "violación del código del club por prestar la membresía";
        int monto = 20000;
        int refMensualdad = 1;
        Multa instance = new Multa();
        boolean expResult = true;
        boolean result = instance.crearMulta(razon, monto, refMensualdad);
        assertEquals(expResult, result);
        
        razon = "cuenta del restaurante";
        monto = 10000;
        refMensualdad = 1;
        instance = new Multa();
        expResult = true;
        result = instance.crearMulta(razon, monto, refMensualdad);
        assertEquals(expResult, result);
        
        razon = "fasfaseq";
        monto = 10000;
        refMensualdad = 1;
        instance = new Multa();
        expResult = false;
        result = instance.crearMulta(razon, monto, refMensualdad);
        assertEquals(expResult, result);
        
        razon = "cuenta del restaurante";
        monto = -1;
        refMensualdad = 1;
        instance = new Multa();
        expResult = false;
        result = instance.crearMulta(razon, monto, refMensualdad);
        assertEquals(expResult, result);
        
        razon = "cuenta del restaurante";
        monto = 10000;
        refMensualdad = -1;
        instance = new Multa();
        expResult = false;
        result = instance.crearMulta(razon, monto, refMensualdad);
        assertEquals(expResult, result);
        
        razon = "violación del código del club por prestar la membresía";
        monto = -1;
        refMensualdad = 1;
        instance = new Multa();
        expResult = false;
        result = instance.crearMulta(razon, monto, refMensualdad);
        assertEquals(expResult, result);
        
        razon = "violación del código del club por prestar la membresía";
        monto = 20000;
        refMensualdad = -1;
        instance = new Multa();
        expResult = false;
        result = instance.crearMulta(razon, monto, refMensualdad);
        assertEquals(expResult, result);
    }

    /**
     * Test of modificarMulta method, of class Multa.
     */
    @Test
    public void testModificarMulta() {
        System.out.println("modificarMulta");
        String razon = "violación del código del club por prestar la membresía";
        int monto = 20000;
        int refMensualdad = 1;
        Multa instance = new Multa();
        boolean expResult = true;
        boolean result = instance.modificarMulta(razon, monto, refMensualdad);
        assertEquals(razon, instance.getRazon());
        assertEquals(monto, instance.getMonto());
        assertEquals(refMensualdad, instance.getRefMensualidad());
    }
    
}
