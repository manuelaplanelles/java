package u06_herencia.Dispositivos;

class Televisor extends Dispositivo implements ControlRemoto {

    Televisor(String nombre) {
        super(nombre); // llama al constructor del padre (Dispositivo)
    }
    @Override
    public void encender() {
        if (estado) {
            System.out.println("El televisor ya está encendido.");
        } else {
            estado = true;
            System.out.println("Encendiendo televisor...");
        }
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando televisor con control remoto...");
    }
}
