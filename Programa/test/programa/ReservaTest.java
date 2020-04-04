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
public class ReservaTest {
    
    public ReservaTest() {
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
     * Test of crearReserva method, of class Reserva.
     */
    @Test
    public void testCrearReserva() {
        System.out.println("crearReserva");
        Horario horario = null;
        String dia = "";
        int idCancha = 0;
        int refSocio = 0;
        Reserva instance = new Reserva();
        boolean expResult = false;
        boolean result = instance.crearReserva(horario, dia, idCancha, refSocio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarReserva method, of class Reserva.
     */
    @Test
    public void testModificarReserva() {
        System.out.println("modificarReserva");
        Horario horario = null;
        String dia = "";
        Reserva instance = new Reserva();
        boolean expResult = false;
        boolean result = instance.modificarReserva(horario, dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHorario method, of class Reserva.
     */
    @Test
    public void testGetHorario() {
        System.out.println("getHorario");
        Reserva instance = new Reserva();
        Horario expResult = null;
        Horario result = instance.getHorario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDia method, of class Reserva.
     */
    @Test
    public void testGetDia() {
        System.out.println("getDia");
        Reserva instance = new Reserva();
        String expResult = "";
        String result = instance.getDia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdCancha method, of class Reserva.
     */
    @Test
    public void testGetIdCancha() {
        System.out.println("getIdCancha");
        Reserva instance = new Reserva();
        int expResult = 0;
        int result = instance.getIdCancha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRefSocio method, of class Reserva.
     */
    @Test
    public void testGetRefSocio() {
        System.out.println("getRefSocio");
        Reserva instance = new Reserva();
        int expResult = 0;
        int result = instance.getRefSocio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
