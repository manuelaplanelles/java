package practicas.SistemaModernizacionMutxamel;

public class Jugador extends MutxamelFC implements AccionesDeportivas{
    private Equipos categoria;
    private int dorsal;
    private Posiciones posiciones;

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posiciones){
        super(nombre, edad);
        this.categoria=categoria;
        this.dorsal=dorsal;
        this.posiciones=posiciones;
    }
    public void calentar(){
        System.out.println(this.nombre + " esta calentando para salir al campo.");
    }
    public void descansar(){
        System.out.println(this.nombre + "le toca descansar este partido.");
    }
    public void marcarGol(){
        System.out.println(this.nombre + " levanata los brazos y grita ¡GOOOLL!");
    }



    public Posiciones getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(Posiciones posiciones) {
        this.posiciones = posiciones;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }


    @Override
    public void entrenar() {
        System.out.println( this.nombre + "esta entrenando para la posción " + posiciones);
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println(this.nombre + " jugara el partido con el dorsal "+ dorsal);
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
