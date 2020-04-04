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
public class HorarioTest {
    
    public HorarioTest() {
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
     * Test of crearHorario method, of class Horario.
     */
    @Test
    public void testCrearHorario() {
        System.out.println("crearHorario");
        String inicio = "";
        String termino = "";
        Horario instance = new Horario();
        boolean expResult = false;
        boolean result = instance.crearHorario(inicio, termino);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarHorario method, of class Horario.
     */
    @Test
    public void testModificarHorario() {
        System.out.println("modificarHorario");
        String inicio = "";
        String termino = "";
        Horario instance = new Horario();
        boolean expResult = false;
        boolean result = instance.modificarHorario(inicio, termino);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInicio method, of class Horario.
     */
    @Test
    public void testGetInicio() {
        System.out.println("getInicio");
        Horario instance = new Horario();
        String expResult = "";
        String result = instance.getInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTermino method, of class Horario.
     */
    @Test
    public void testGetTermino() {
        System.out.println("getTermino");
        Horario instance = new Horario();
        String expResult = "";
        String result = instance.getTermino();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
