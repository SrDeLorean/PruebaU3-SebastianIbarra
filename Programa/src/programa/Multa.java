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
public class Multa {
    
    private String razon;
    private int monto;
    private boolean isPagada;
    private int refMensualidad;
    
    public boolean pagarMulta(){
        this.isPagada=true;
        return this.isPagada;
    }
    
    public boolean crearMulta(String razon, int monto, int refMensualdad){
        if(!(razon instanceof String)){
            return false;
        }
        if(!(Integer.class.isInstance(monto) && Integer.class.isInstance(refMensualdad))){
            return false;
        }
        if(monto<=0 || refMensualdad<0){
            return false;
        }
        if(razon.equals("violación del código del club por prestar la membresía")){
            if(monto!=20000){
                return false;
            }
        }else{
            if(!razon.equals("cuenta del restaurante")){
                return false;
            }
        }
        this.razon=razon;
        this.monto=monto;
        this.refMensualidad=refMensualdad;
        return true; 
    }
    
    public boolean modificarMulta(String razon, int monto, int refMensualdad){
        if(!(razon instanceof String)){
            return false;
        }
        if(!(Integer.class.isInstance(monto) && Integer.class.isInstance(refMensualdad))){
            return false;
        }
        if(monto<=0 || refMensualdad<0){
            return false;
        }
        if(razon.equals("violación del código del club por prestar la membresía")){
            if(monto!=20000){
                return false;
            }
        }else{
            if(!razon.equals("cuenta del restaurante")){
                return false;
            }
        }
        this.razon=razon;
        this.monto=monto;
        this.refMensualidad=refMensualdad;
        return true; 
    }

    public String getRazon() {
        return razon;
    }

    public int getMonto() {
        return monto;
    }

    public boolean isIsPagada() {
        return isPagada;
    }

    public int getRefMensualidad() {
        return refMensualidad;
    }
    
}
