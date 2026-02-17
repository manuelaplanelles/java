package u06_herencia.Dispositivos;

class ParlanteInteligente extends Dispositivo {

    ParlanteInteligente(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        if (estado) {
            System.out.println("El parlante ya está encendido.");
        } else {
            estado = true;
            System.out.println("Activando parlante con comando de voz...");
        }
    }
}