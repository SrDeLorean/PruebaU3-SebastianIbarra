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
    private int costo;

    /**
     * Metodo que se encarga de crear un recerva
     * Pide un horario "horario", string "dia", int "idCancha", int refSocio
     * Cabe descatar que los dias son de lunes a domingo
     * Ejemplo: crearReserva(new Horario().crearHorario(12:00, 13:00), "lunes", 1, 1 );
     * @param horario
     * @param dia
     * @param idCancha
     * @param refSocio
     * @return 
     */
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
        if(horario.getInicio().equals("18:00") || horario.getInicio().equals("19:00") || horario.getInicio().equals("20:00") || horario.getInicio().equals("21:00") || horario.getInicio().equals("22:00")){
            if(dia.equals("sabado") || dia.equals("domingo")){
                this.costo=6000;
            }else{
                this.costo=4000;
            }
        }else{
            if(dia.equals("sabado") || dia.equals("domingo")){
                this.costo=7000;
            }else{
                this.costo=5000;
            }
        }
        this.horario=horario;
        this.dia=dia;
        this.idCancha=idCancha;
        this.refSocio=refSocio;
        return true;
    }
    
    /**
     * Metodo que se encarga de crear un recerva
     * Pide un horario "horario", string "dia"
     * Cabe descatar que los dias son de lunes a domingo
     * Ejemplo: modificarReserva(new Horario().crearHorario(12:00, 13:00), "lunes");
     * @param horario
     * @param dia
     * @return 
     */
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

    public int getCosto() {
        return costo;
    }
    
}
