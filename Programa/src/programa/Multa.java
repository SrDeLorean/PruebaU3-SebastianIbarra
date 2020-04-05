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
    
    /**
     * Metodo que se encarga de cambiar el estado de una multa de no pagado a pagado
     * @return 
     */
    public boolean pagarMulta(){
        this.isPagada=true;
        return this.isPagada;
    }
    
    /**
     * Metodo que se encarga de crear una multa
     * Recibe un string "razon", int "monto", int refMensualidad
     * Nota: la razon puede ser de 2 tipos:
     *    1._ violación del código del club por prestar la membresía
     *    2._ cuenta del restaurante
     * Nota2: cabe destacar que al ocupar la opcion 1 de arriba, si no ingresa 20000 no se lo guardara, es una revalidacion de la operacion
     * @param razon
     * @param monto
     * @param refMensualdad
     * @return 
     */
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
            }else{
                this.monto=monto;
            }
        }else{
            if(!razon.equals("cuenta del restaurante")){
                return false;
            }else{
                int valor = (int) (monto-(monto*0.1));
                this.monto=valor;
            }
        }
        this.razon=razon;
        this.refMensualidad=refMensualdad;
        return true; 
    }
    
    /**
     * Metodo que se encarga de modificar una multa
     * Recibe un string "razon", int "monto", int refMensualidad
     * Nota: la razon puede ser de 2 tipos:
     *    1._ violación del código del club por prestar la membresía
     *    2._ cuenta del restaurante
     * Nota2: cabe destacar que al ocupar la opcion 1 de arriba, si no ingresa 20000 no se lo guardara, es una revalidacion de la operacion
     * @param razon
     * @param monto
     * @param refMensualdad
     * @return 
     */
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
            }else{
                this.monto=monto;
            }
        }else{
            if(!razon.equals("cuenta del restaurante")){
                return false;
            }else{
                int valor = (int) (monto-(monto*0.1));
                this.monto=valor;
            }
        }
        this.razon=razon;
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
