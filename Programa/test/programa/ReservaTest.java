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
        Horario horario = new Horario();
        String dia = "lunes";
        int idCancha = 1;
        int refSocio = 1;
        Reserva instance = new Reserva();
        boolean expResult = true;
        boolean result = instance.crearReserva(horario, dia, idCancha, refSocio);
        assertEquals(expResult, result);
       
        dia = "dadasdas";
        idCancha = 1;
        refSocio = 1;
        instance = new Reserva();
        expResult = false;
        result = instance.crearReserva(horario, dia, idCancha, refSocio);
        assertEquals(expResult, result);
        
        dia = "lunes";
        idCancha = 5;
        refSocio = 1;
        instance = new Reserva();
        expResult = false;
        result = instance.crearReserva(horario, dia, idCancha, refSocio);
        assertEquals(expResult, result);
        
        dia = "lunes";
        idCancha = -1;
        refSocio = 1;
        instance = new Reserva();
        expResult = false;
        result = instance.crearReserva(horario, dia, idCancha, refSocio);
        assertEquals(expResult, result);
        
        dia = "lunes";
        idCancha = 1;
        refSocio = -1;
        instance = new Reserva();
        expResult = false;
        result = instance.crearReserva(horario, dia, idCancha, refSocio);
        assertEquals(expResult, result);
        
        
        
    }

    /**
     * Test of modificarReserva method, of class Reserva.
     */
    @Test
    public void testModificarReserva() {
        System.out.println("modificarReserva");
        Horario horario = new Horario();
        String dia = "lunes";
        Reserva instance = new Reserva();
        boolean expResult = true;
        boolean result = instance.modificarReserva(horario, dia);
        assertEquals(expResult, result);
        assertEquals(dia, instance.getDia());
    }
    
}
