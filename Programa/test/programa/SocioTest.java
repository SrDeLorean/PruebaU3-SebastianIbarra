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
        String rut = "19.392.599-5";
        String nombre = "Sebastian Ibarra";
        Socio instance = new Socio();
        boolean expResult = true;
        boolean result = instance.crearSocio(rut, nombre);
        assertEquals(expResult, result);
        
        rut = "19.392.599";
        nombre = "Sebastian Ibarra";
        instance = new Socio();
        expResult = false;
        result = instance.crearSocio(rut, nombre);
        assertEquals(expResult, result);
        
        rut = "392.599-5";
        nombre = "Sebastian Ibarra";
        instance = new Socio();
        expResult = false;
        result = instance.crearSocio(rut, nombre);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of modificarSocio method, of class Socio.
     */
    @Test
    public void testModificarSocio() {
        System.out.println("modificarSocio");
        String rut = "19.392.599-5";
        String nombre = "Sebastian Ibarra";
        Socio instance = new Socio();
        boolean expResult = true;
        boolean result = instance.modificarSocio(rut, nombre);
        assertEquals(expResult, result);
        assertEquals(rut, instance.getRut());
        assertEquals(nombre, instance.getNombre());
    }
    
}
