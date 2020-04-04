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
public class SocioTest {
    
    public SocioTest() {
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
     * Test of crearSocio method, of class Socio.
     */
    @Test
    public void testCrearSocio() {
        System.out.println("crearSocio");
        String rut = "";
        String nombre = "";
        Socio instance = new Socio();
        boolean expResult = false;
        boolean result = instance.crearSocio(rut, nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarSocio method, of class Socio.
     */
    @Test
    public void testModificarSocio() {
        System.out.println("modificarSocio");
        String rut = "";
        String nombre = "";
        Socio instance = new Socio();
        boolean expResult = false;
        boolean result = instance.modificarSocio(rut, nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRut method, of class Socio.
     */
    @Test
    public void testGetRut() {
        System.out.println("getRut");
        Socio instance = new Socio();
        String expResult = "";
        String result = instance.getRut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Socio.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Socio instance = new Socio();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
