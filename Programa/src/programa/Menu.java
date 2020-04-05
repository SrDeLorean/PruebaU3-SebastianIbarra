/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.util.HashMap;
import java.util.Map;

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
    
    /**
     * Metodo que registra un socio
     * @param nombre
     * @param rut
     * @return 
     */
    public boolean registrarSocio(String nombre, String rut){
        Socio socio = new Socio();
        socio.crearSocio(rut, nombre);
        socios.put(punteroSocio, socio);
        Mensualidad mensualidad = new Mensualidad();
        mensualidad.crearMensualidad("abril", punteroSocio);
        mensualidades.put(punteroMensualidades, mensualidad);
        System.out.println("Socio id:" + punteroSocio);
        System.out.println("Mensualidad id:" + punteroMensualidades);
        punteroSocio++;
        punteroMensualidades++;
        return true;
        
    }
    
    /**
     * Metodo que modifica un socio
     * @param idSocio
     * @param nombre
     * @param rut
     * @return 
     */
    public boolean modificarSocio(int idSocio,String nombre, String rut){
        Socio socio = socios.get(idSocio);
        socio.modificarSocio(rut, nombre);
        System.out.println("socio modificado");
        return true;
        
    }
    
    /**
     * Metodo que elimina un socio
     * @param idSocio
     * @return 
     */
    public boolean eliminarSocio(int idSocio){
        if(socios.containsKey(idSocio)){
            for(Map.Entry<Integer, Mensualidad> entry : mensualidades.entrySet()){
                Mensualidad mensualidad = entry.getValue();
                if(mensualidad.getRefSocio()==idSocio){
                    for(Map.Entry<Integer, Multa> entry2 : multas.entrySet()){
                        Multa multa = entry2.getValue();
                        if(multa.getRefMensualidad()==entry.getKey()){
                            multas.remove(entry2.getKey());
                        }
                    }
                    mensualidades.remove(entry.getKey());
                }
            }
            for(Map.Entry<Integer, Reserva> entry : reservas.entrySet()){
                Reserva reserva = entry.getValue();
                if(reserva.getRefSocio()==idSocio){
                    reservas.remove(entry.getKey());
                }
            }
            socios.remove(idSocio);
            System.out.println("socio eliminado");
            return true;
        }
        System.out.println("no se pudo eliminar el socio dado que no existe");
        return false;
    }
    
    /**
     * Metodo para pagar la mensualidad
     * @param idMensualidad
     * @return 
     */
    public boolean pagarMensualidad(int idMensualidad){
        if(mensualidades.containsKey(idMensualidad)){
            Mensualidad mensualidad = mensualidades.get(idMensualidad);
            int montoTotal=0;
            for(Map.Entry<Integer, Multa> entry : multas.entrySet()){
                Multa multa = entry.getValue();
                if(multa.getRefMensualidad()==idMensualidad && !multa.isIsPagada()){
                    montoTotal += multa.getMonto();
                }
            }
            mensualidad.modificarMensualidad(mensualidad.getMes(), montoTotal, true);
            System.out.println("mensualidad pagada con exito, total:" + montoTotal);
            return true;
        }
        System.out.println("no se pudo pagar la mensualdiad dado que no existe");
        return false;
        
    }
    
    /**
     * Metodo para pagar la mensualidad
     * Este metodo te permite simular el mes "para el testing giño giño"
     * @param idMensualidad
     * @param mesActual
     * @return 
     */
    public boolean pagarMensualidad(int idMensualidad, int mesActual){
        if(mensualidades.containsKey(idMensualidad)){
            Mensualidad mensualidad = mensualidades.get(idMensualidad);
            if(mensualidad.isIsPagada()){
                System.out.println("ya se encuentra pagada esta mensualidad");
                return false;
            }
            int montoTotal=0;
            for(Map.Entry<Integer, Multa> entry : multas.entrySet()){
                Multa multa = entry.getValue();
                if(multa.getRefMensualidad()==idMensualidad){
                    montoTotal += multa.getMonto();
                    
                }
            }
            if(!mensualidad.getMes().equals(mesActual)){
                montoTotal=(int) (montoTotal+(montoTotal*0.1));
                System.out.println("mensualidad pagada con exito, se le agrego un cobro de 10% por atraso, total:" + montoTotal);
            }else{
                System.out.println("mensualidad pagada con exito, total:" + montoTotal);
            }
            mensualidad.modificarMensualidad(mensualidad.getMes(), montoTotal, true);
            return true;
        }
        System.out.println("no se pudo registrar el pago dado que no existe esa mensualidad");
        return false;
    }
    
    /**
     * Metodo que crea una mensualidad
     * @param mes
     * @param refSocio
     * @return 
     */
    public boolean registrarMensualidad(String mes, int refSocio){
        for(Map.Entry<Integer, Mensualidad> entry : mensualidades.entrySet()){
            Mensualidad mensualidad = entry.getValue();
            if(mensualidad.getRefSocio()==refSocio){
                if(mensualidad.isIsPagada()==false){
                    System.out.println("no se pude registrar una nueva mensualidad dado que hay una que no se a pagado");
                    return false;
                }
            }
        }
        Mensualidad mensualidad = new Mensualidad();
        mensualidad.crearMensualidad(mes, refSocio);
        mensualidades.put(punteroMensualidades, mensualidad);
        punteroMensualidades++;
        System.out.println("mensualidad creada con exito");
        return true;
    }
    
    /**
     * Metodo que permite modificar la mensualidad que no esta pagada
     * @param mes
     * @param refSocio
     * @param ispagada
     * @return 
     */
    public boolean modificarMensualidad(String mes, int refSocio, boolean ispagada){
        for(Map.Entry<Integer, Mensualidad> entry : mensualidades.entrySet()){
            Mensualidad mensualidad = entry.getValue();
            if(mensualidad.getRefSocio()==refSocio){
                if(mensualidad.isIsPagada()==false){
                    mensualidad.modificarMensualidad(mes, refSocio, ispagada);
                    System.out.println("mensualidad modificada con exito");
                    return true;
                }
            }
        }
        System.out.println("no se encontro una mensualidad que no se encontrara pagada");
        return false;
    }
    
    /**
     * Metodo que se encarga de eliminar una mensualidad
     * @param idMensualidad
     * @return 
     */
    public boolean eliminarMensualidad(int idMensualidad){
        if(mensualidades.containsKey(idMensualidad)){
            mensualidades.remove(idMensualidad);
            System.out.println("se a eliminado la mensualidad con exito");
            return true;
        }
        System.out.println("esta mensualidad no existe");
        return false;
        
    }
    
    /**
     * Metodo que se encarga de pagar una multa
     * @param idMulta
     * @return 
     */
    public boolean pagarMulta(int idMulta){
        if(multas.containsKey(idMulta)){
            Multa multa = multas.get(idMulta);
            multa.pagarMulta();
            System.out.println("se a pagado la multa con exito");
            return true;
        }
        System.out.println("esta multa no existe");
        return false;
    }
    
    /**
     * 
     * @param razon
     * @param monto
     * @param refMensualidad
     * @param isSocio
     * @return 
     */
    public boolean registrarMultaMensualidad(String razon, int monto, int refMensualidad, boolean isSocio){
        if(mensualidades.containsKey(refMensualidad)){
            Multa multa = new Multa();
            multa.crearMulta(razon, monto, refMensualidad);
            multas.put(punteroMultas, multa);
            System.out.println("Multa id:" + punteroMultas);
            punteroMultas++;
            return true;
        }
        return false;
        
    }
    
    /**
     * Metodo que registra una multa
     * @param razon
     * @param monto
     * @param refsocio
     * @param isSocio
     * @return 
     */
    public boolean registrarMultaSocio(String razon, int monto, int refsocio, boolean isSocio){
        for(Map.Entry<Integer, Mensualidad> entry : mensualidades.entrySet()){
            Mensualidad mensualidad = entry.getValue();
            if(mensualidad.getRefSocio()==refsocio){
                if(mensualidad.isIsPagada()==false){
                    Multa multa = new Multa();
                    if(isSocio){
                        System.out.println("Se a registrar una multa al socio, posiblemente de comida");
                        multa.crearMulta(razon, monto, entry.getKey());
                    }else{
                        System.out.println("se a registrado una multa por incumplimiento a las normas .hacerse pasar por socio.");
                        multa.crearMulta(razon, 20000, entry.getKey());
                    }
                    multas.put(punteroMultas, multa);
                    System.out.println("Multa id:" + punteroMultas);
                    punteroMultas++;
                    return true;
                }
            }
        }
        return false;
        
    }
    
    /**
     * Metodo que modifica una multa de una mensualidad
     * @param razon
     * @param refMensualidad
     * @return 
     */
    public boolean modificarMultaMensualidad(String razon, int refMensualidad){
        return false;
    }
    
    /**
     * Metodo que modifica una multa de un socio
     * @param razon
     * @param refsocio
     * @return 
     */
    public boolean modificarMultaSocio(String razon, int refsocio){
        return false;
        
    }
    
    /**
     * Metodo que elimina una multa
     * @param idMulta
     * @return 
     */
    public boolean eliminarMulta(int idMulta){
        return false;
        
    }
    
    /**
     * Metodo que permite registrar una reserva
     * @param horario
     * @param dia
     * @param idCancha
     * @param refSocio
     * @param isSocio
     * @return 
     */
    public boolean registrarReserva(Horario horario, String dia, int idCancha, int refSocio, boolean isSocio){
        if(!isSocio){
            this.registrarMultaSocio("violación del código del club por prestar la membresía", 0, refSocio, isSocio);
            return false;
        }
        for(Map.Entry<Integer, Reserva> entry : reservas.entrySet()){
            Reserva reserva = entry.getValue();
            if(reserva.getIdCancha()==idCancha && reserva.getHorario().getInicio().equals(horario.getInicio())&& reserva.getHorario().getInicio().equals(horario.getInicio())){
                System.out.println("Hay una reserva de antelacion");
                return false;
            }
        }
        Reserva reserva = new Reserva();
        reserva.crearReserva(horario, dia, refSocio, refSocio);
        reservas.put(punteroReservas, reserva);
        System.out.println("Reserva id:" + punteroReservas);
        punteroReservas++;
        return true;
        
    }
    
    /**
     * Metodo que modifica una reserva
     * @param horario
     * @param dia
     * @return 
     */
    public boolean modificarReserva(Horario horario, String dia){
        return false;
        
    }
    
    /**
     * Metodo que elimina una reserva
     * @param idReserva
     * @return 
     */
    public boolean eliminarReserva(int idReserva){
        return false;
        
    }
}
