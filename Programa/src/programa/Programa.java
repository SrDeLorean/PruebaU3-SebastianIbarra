/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

/**
 *
 * @author xebae
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu menu = new Menu();
        //Crear un socio
        menu.registrarSocio("Sebastian Ibarra", "19.392.599-5");
        menu.registrarSocio("Hola mundo", "11.111.111-1");
        //Crear reserva
        Horario horario = new Horario();
        horario.crearHorario("12:00", "13:00");
        //es socio
        menu.registrarReserva(horario, "lunes", 1, 0, true);
        menu.registrarReserva(horario, "lunes", 1, 1, true);
        //no es socio
        menu.registrarReserva(horario, "lunes", 1, 0, false);
        
        
    }
    
}
