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
    
    public boolean pagarMensualidad(){
        this.isPagada=true;
        return isPagada;
    }
    
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
