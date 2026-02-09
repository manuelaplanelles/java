package u06_herencia.RedesSociales;

import u05_poo.chalet.Habitacion;

import java.util.ArrayList;

public class Influencer extends Usuario {

    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String nomUsuario, int seguidores, ArrayList colaboraciones) {
        super(nombre, edad, nomUsuario, seguidores);
        colaboraciones = new ArrayList<>();
    }

    public ArrayList<String> getColaboraciones() {
        return colaboraciones;
    }

    public void setColaboraciones(ArrayList<String> colaboraciones) {
        this.colaboraciones = colaboraciones;
    }

    @Override
    public String toString() {
        return "Influencer{" +
                "colaboraciones=" + colaboraciones +
                '}';
    }
}
