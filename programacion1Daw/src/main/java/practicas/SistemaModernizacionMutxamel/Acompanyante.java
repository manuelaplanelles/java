package practicas.SistemaModernizacionMutxamel;

public class Acompanyante extends MutxamelFC {
    private Jugador integrante;
    private String parentesco;

     public Acompanyante(String nombre, int edad, Jugador integrante,String parentesco){
         super(nombre,edad);
         this.integrante=integrante;
         this.parentesco=parentesco;
     }
     public void animarEquipo(){

     }

    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public void concentrarse() {
        System.out.println(nombre + " se esta concentrando.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(nombre + " viaja a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println(nombre + " grita ¡GOOOL!");
    }

}
