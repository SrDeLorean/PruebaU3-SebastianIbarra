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
        
        Horario instance = new Horario();
        boolean result = instance.crearHorario("12:00", "13:00");
        assertEquals(true, result);
        
        instance = new Horario();
        result = instance.crearHorario("12:00", "13:30");
        assertEquals(false, result);
        
        instance = new Horario();
        result = instance.crearHorario("12:00", "14:00");
        assertEquals(false, result);
        
        instance = new Horario();
        result = instance.crearHorario("23:00", "24:00");
        assertEquals(false, result);
        
        instance = new Horario();
        result = instance.crearHorario("12:30", "13:30");
        assertEquals(false, result);
        
        instance = new Horario();
        result = instance.crearHorario("00:00", "00:00");
        assertEquals(false, result);
    }

    /**
     * Test of modificarHorario method, of class Horario.
     */
    @Test
    public void testModificarHorario() {
        System.out.println("modificarHorario");
        Horario instance = new Horario();
        boolean expResult = true;
        boolean result = instance.modificarHorario("12:00", "13:00");
        assertEquals(expResult, result);
        assertEquals(instance.getInicio(), "12:00");
        assertEquals(instance.getTermino(), "13:00");
    }
    
}
