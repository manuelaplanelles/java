package u06_herencia.Dispositivos;

public class ParlanteInteligente extends Dispositivo {

    public ParlanteInteligente(String nombre) {

        super(nombre);
    }

    @Override
    public void encender() {
        if (super.estado) {
            System.out.println("El parlante ya está encendido.");
        } else {
            super.estado = true;
            System.out.println("Activando parlante con comando de voz...");
        }
    }
}