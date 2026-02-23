package practicas.SistemaModernizacionMutxamel;

public class Entrenador extends MutxamelFC implements AccionesDeportivas{
    private Equipos equipos;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipos, String formacionPreferida){
        super(nombre, edad);
        this.equipos = equipos;
        this.formacionPreferida=formacionPreferida;
    }

    public void planificarEntrenamiento(){

    }
    public void hacerCambios(){

    }




    public Equipos getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    @Override
    public void entrenar() {

    }

    @Override
    public void jugarPartido(String rival) {

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
