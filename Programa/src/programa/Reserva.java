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
        if(!(horario instanceof Horario)){
            return false;
        }
        if(!(dia instanceof String)){
            return false;
        }
        if(!(Integer.class.isInstance(idCancha) && Integer.class.isInstance(refSocio))){
            return false;
        }
        if((idCancha<1 || idCancha>4) || refSocio<0){
            return false;
        }
        if(!dia.equals("lunes") && !dia.equals("martes") && !dia.equals("miercoles") && !dia.equals("jueves") && !dia.equals("viernes") && !dia.equals("sabado") &&!dia.equals("domingo")){            
            return false;
        }
        this.horario=horario;
        this.dia=dia;
        this.idCancha=idCancha;
        this.refSocio=refSocio;
        return true;
    }
    
    public boolean modificarReserva(Horario horario, String dia) {
        if(!(horario instanceof Horario)){
            return false;
        }
        if(!(dia instanceof String)){
            return false;
        }
        if(!dia.equals("lunes") && !dia.equals("martes") && !dia.equals("miercoles") && !dia.equals("jueves") && !dia.equals("viernes") && !dia.equals("sabado") &&!dia.equals("domingo")){
            return false;
        }
        this.horario=horario;
        this.dia=dia;
        return true;
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
