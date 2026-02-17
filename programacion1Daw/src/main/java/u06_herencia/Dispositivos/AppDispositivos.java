package u06_herencia.Dispositivos;

import java.util.ArrayList;

public class AppDispositivos {

    public static void main(String[] args) {

        ArrayList<Dispositivo> listaDispositivo = new ArrayList<>();

        listaDispositivo.add(new Televisor("LG Smart"));
        listaDispositivo.add(new ParlanteInteligente("Alexa"));

        for (Dispositivo dispositivo : listaDispositivo){
            dispositivo.encender();
            if(dispositivo instanceof ControlRemoto){
                ((ControlRemoto) dispositivo).sincronizar();
            }
            dispositivo.mostrarEstado();
            dispositivo.apagar();
        }
    }
}
