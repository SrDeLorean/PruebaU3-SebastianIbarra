/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.util.HashMap;

/**
 *
 * @author xebae
 */
public class Menu {
    
    private HashMap<Integer,Socio> socios;
    private HashMap<Integer,Mensualidad> mensualidades;
    private HashMap<Integer, Multa> multas;
    private HashMap<Integer, Reserva> reservas;
    private int punteroSocio=0;
    private int punteroMensualidades=0;
    private int punteroMultas=0;
    private int punteroReservas=0;
    private int costoMenbresia=0;
    
    public Menu(){
        socios=new HashMap();
        mensualidades=new HashMap();
        multas=new HashMap();
        reservas=new HashMap();
    }
    
    public boolean registrarSocio(String nombre, String rut, boolean isSocio){
        return false;
        
    }
    
    public boolean modificarSocio(String nombre, String rut){
        return false;
        
    }
    
    public boolean eliminarSocio(int idSocio){
        return false;
        
    }
    
    public boolean pagarMensualidad(int idMensualidad){
        return false;
        
    }
    
    public boolean  registrarMensualidad(String mes, int refSocio){
        return false;
        
    }
    
    public boolean modificarMensualidad(String mes, int refSocio, boolean ispagada){
        return false;
        
    }
    
    public boolean eliminarMensualidad(int idMensualidad){
        return false;
        
    }
    
    public boolean pagarMulta(int idMulta){
        return false;
        
    }
    
    public boolean registrarMultaMensualidad(String razon, int monto, int refMensualidad, boolean isSocio){
        return false;
        
    }
    
    public boolean registrarMultaSocio(String razon, int monto, int refsocio, boolean isSocio){
        return false;
        
    }
    
    public boolean modificarMultaMensualidad(String razon, int refMensualidad){
        return false;
        
    }
    
    public boolean modificarMultaSocio(String razon, int refsocio){
        return false;
        
    }
    
    public boolean eliminarMulta(int idMulta){
        return false;
        
    }
    
    public boolean registrarReserva(Horario horario, String dia, int refSocio, boolean isSocio){
        return false;
        
    }
    
    public boolean modificarReserva(Horario horario, String dia){
        return false;
        
    }
    
    public boolean eliminarReserva(int idReserva){
        return false;
        
    }
}
