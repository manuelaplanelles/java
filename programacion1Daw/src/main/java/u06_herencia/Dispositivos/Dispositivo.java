package u06_herencia.Dispositivos;

abstract class Dispositivo {
    String nombre;
    boolean estado;

    Dispositivo(String nombre) {
        this.nombre = nombre;
        this.estado = false;
    }
    abstract void encender();


    void apagar() {
        if (estado == false) {
            System.out.println(nombre + " ya está apagado.");
        } else {
            estado = false;
            System.out.println(nombre + " apagado.");
        }
    }
    void mostrarEstado() {
        if (estado) {
            System.out.println(nombre + " está encendido.");
        } else {
            System.out.println(nombre + " está apagado.");
        }
    }
}
