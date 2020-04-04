package programa;

/**
 * 
 * @author xebae
 */
public class Socio {
    
    private String rut;
    private String nombre;
    
    /**
     * Metodo encargador de crear un socio
     * Los parametros que se requieren son el rut y el nombre, 2 string
     * @param rut
     * @param nombre
     * @return 
     */
    public boolean crearSocio(String rut, String nombre){
        if(!(rut instanceof String)){
            return false;
        }
        if(!(nombre instanceof String)){
            return false;
        }
        if(nombre.equals("")){
            return false;
        }

        if(rut.split("\\.").length!=3){
            return false;
        }
        if(!"".equals(rut)){
            String[] guion = rut.split("-");
            if(guion.length == 2){
                char[] digVerificador = guion[1].toCharArray();
                if(digVerificador.length == 1){
                    if(!(( digVerificador[0] >=48 && digVerificador[0]<=57)  || digVerificador[0]==   107 || digVerificador[0] == 75 )){
                        return false;
                    }                                         
                }
                else{
                    return false;
                }                
                if( (guion[0].charAt(guion[0].length()-4 ) == '.')  && (guion[0].charAt(guion[0].length()-8 ) == '.') ){
                    String[] puntos = guion[0].split("\\.");
                    char[] puntos1 = puntos[0].toCharArray();
                    char[] puntos2 = puntos[1].toCharArray();
                    char[] puntos3 = puntos[2].toCharArray();
                    if(puntos.length == 3 && puntos2.length == 3 && puntos3.length ==3 && puntos1.length >=1 && puntos1.length <=3){                                  
                        char[] numeros = guion[0].replace(".","").toCharArray();                           
                        if(numeros.length >=7 && numeros.length <=9 && !guion[0].startsWith("0") && !guion[0].startsWith("00") && !guion[0].startsWith("000")){
                            for(char c:numeros){                                
                                if( !(c>=48 && c<=57) ){
                                    return false;
                                }
                            }
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    } 
                }   else{
                    return false;
                }
            }else{
                return false;
            }                
        }else{
            return false;
        }
        this.nombre=nombre;
        this.rut=rut;
        return true;
    }
    
    /**
     * Metodo encargado de modificar los campos de un socio
     * Los parametros que se requieren son el rut y el nombre, 2 string
     * @param rut
     * @param nombre
     * @return 
     */
    public boolean modificarSocio(String rut, String nombre){
        if(!(rut instanceof String)){
            return false;
        }
        if(!(nombre instanceof String)){
            return false;
        }
        if(nombre.equals("")){
            return false;
        }
        //Metodo sacado del codigo de EventTinder :)
        if(!"".equals(rut)){
            String[] guion = rut.split("-");
            if(guion.length == 2){
                char[] digVerificador = guion[1].toCharArray();
                if(digVerificador.length == 1){
                    if(!(( digVerificador[0] >=48 && digVerificador[0]<=57)  || digVerificador[0]==   107 || digVerificador[0] == 75 )){
                        return false;
                    }                                         
                }
                else{
                    return false;
                }                
                if( (guion[0].charAt(guion[0].length()-4 ) == '.')  && (guion[0].charAt(guion[0].length()-8 ) == '.') ){
                    String[] puntos = guion[0].split("\\.");
                    char[] puntos1 = puntos[0].toCharArray();
                    char[] puntos2 = puntos[1].toCharArray();
                    char[] puntos3 = puntos[2].toCharArray();
                    if(puntos.length == 3 && puntos2.length == 3 && puntos3.length ==3 && puntos1.length >=1 && puntos1.length <=3){                                  
                        char[] numeros = guion[0].replace(".","").toCharArray();                           
                        if(numeros.length >=7 && numeros.length <=9 && !guion[0].startsWith("0") && !guion[0].startsWith("00") && !guion[0].startsWith("000")){
                            for(char c:numeros){                                
                                if( !(c>=48 && c<=57) ){
                                    return false;
                                }
                            }
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    } 
                }   else{
                    return false;
                }
            }else{
                return false;
            }                
        }else{
            return false;
        }
        this.nombre=nombre;
        this.rut=rut;
        return true;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }
    
}
