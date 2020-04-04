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
public class Reserva {
    
    private Horario horario;
    private String dia;
    private int idCancha;
    private int refSocio;

    public boolean crearReserva(Horario horario, String dia, int idCancha, int refSocio) {
        
        return false;
    }
    
    public boolean modificarReserva(Horario horario, String dia) {
        
        return false;
    }

    public Horario getHorario() {
        return horario;
    }

    public String getDia() {
        return dia;
    }

    public int getIdCancha() {
        return idCancha;
    }

    public int getRefSocio() {
        return refSocio;
    }
    
}
