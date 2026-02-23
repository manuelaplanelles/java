package practicas.SistemaModernizacionMutxamel;

public class Masajista extends MutxamelFC{
    private String titulacion;
    private int anyosExperiencia;

    public Masajista(String nombre, int edad,String titulacion, int anyosExperiencia){
        super(nombre, edad);
        this.titulacion=titulacion;
        this.anyosExperiencia=anyosExperiencia;
    }



    public void darMasaje(Jugador jugador){
        System.out.println(this.nombre + " esta recubiendo un masaje.");
    }


    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
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
