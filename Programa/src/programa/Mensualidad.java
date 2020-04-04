package programa;

/**
 *
 * @author xebae
 */
public class Mensualidad {
    
    private int monto=200000;
    private int montoTotal;
    private String mes;
    private boolean isPagada=false;
    private int refSocio;
    
    /**
     * Metodo que se encarga de cambiar la mensualidad de no pagada a pagada
     * @return 
     */
    public boolean pagarMensualidad(){
        this.isPagada=true;
        return isPagada;
    }
    
    /**
     * Metodo que se encarga en crear una mensualidad
     * Pide un string "mes" y un int refSocio
     * Ejemplo: lunes, 1 / martes, 2
     * @param mes
     * @param refSocio
     * @return 
     */
    public boolean crearMensualidad(String mes, int refSocio){
        if(!(mes instanceof String)){
            return false;
        }
        if(refSocio<0){
            return false;
        }
        if(!mes.equals("enero") && !mes.equals("febrero") && !mes.equals("marzo") && !mes.equals("abril") && !mes.equals("mayo") && !mes.equals("junio") && !mes.equals("julio") && !mes.equals("agosto") && !mes.equals("septiembre") && !mes.equals("octubre") && !mes.equals("noviembre") && !mes.equals("diciembre")){
            return false;
        }
        this.mes=mes;
        this.refSocio=refSocio;
        return true;
    }
    
    /**
     * Metodo que se encarga en modificar una mensualidad
     * Pide un string "mes", un int refSocio y un boolean pagada
     * Ejemplo: lunes, 1, true / martes, 2, false
     * @param mes
     * @param refSocio
     * @return 
     */
    public boolean modificarMensualidad(String mes, int refSocio, boolean isPagada){
        if(!(mes instanceof String)){
            return false;
        }
        if(refSocio<0){
            return false;
        }
        if(!mes.equals("enero") && !mes.equals("febrero") && !mes.equals("marzo") && !mes.equals("abril") && !mes.equals("mayo") && !mes.equals("junio") && !mes.equals("julio") && !mes.equals("agosto") && !mes.equals("septiembre") && !mes.equals("octubre") && !mes.equals("noviembre") && !mes.equals("diciembre")){
            return false;
        }
        this.mes=mes;
        this.refSocio=refSocio;
        this.isPagada=isPagada;
        return true;
    }

    public int getMonto() {
        return monto;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public String getMes() {
        return mes;
    }

    public boolean isIsPagada() {
        return isPagada;
    }

    public int getRefSocio() {
        return refSocio;
    }
    
}
