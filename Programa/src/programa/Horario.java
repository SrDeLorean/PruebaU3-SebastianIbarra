package programa;

/**
 *
 * @author xebae
 */
public class Horario {
    
    private String inicio;
    private String termino;

    public boolean crearHorario(String inicio, String termino) {
        String[] ini = inicio.split(":");
        String[] ter = termino.split(":");
        if(!ini[1].equals("00") || !ter[1].equals("00")){
            System.out.println("cai aca 1");
            return false;
        }
        int numIni = Integer.parseInt(ini[0]);
        int numTer = Integer.parseInt(ter[0]);
        if(numTer-numIni!=1){
            System.out.println("cai aca 2");
            return false;
        }
        if(numIni<8 || numIni>22){
            System.out.println("cai aca 3");
            return false;
        }
        this.inicio=inicio;
        this.termino=termino;
        return true;
    }
    
    public boolean modificarHorario(String inicio, String termino){
        String[] ini = inicio.split(":");
        String[] ter = termino.split(":");
        if(!ini[1].equals("00") || !ter[1].equals("00")){
            System.out.println("cai aca 1");
            return false;
        }
        int numIni = Integer.parseInt(ini[0]);
        int numTer = Integer.parseInt(ter[0]);
        if(numTer-numIni!=1){
            System.out.println("cai aca 2");
            return false;
        }
        if(numIni<8 || numIni>22){
            System.out.println("cai aca 3");
            return false;
        }
        this.inicio=inicio;
        this.termino=termino;
        return true;
    }

    public String getInicio() {
        return inicio;
    }

    public String getTermino() {
        return termino;
    }
    
}
