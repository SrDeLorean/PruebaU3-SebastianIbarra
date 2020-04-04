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
        
        return false;
    }
    
    public boolean crearMulta(String razon, int monto, int refMensualdad){
        
       return false; 
    }
    
    public boolean modificarMulta(String razon, int monto, int refMensualdad){
        
        return false;
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
