package src.main.java.estudio10.ExamenJuegosInvierno;

import java.util.ArrayList;

public class Equipo {
    private String pais;
    private ArrayList<Deportista> listaDeportistas;

    public Equipo(String pais){
        this.pais=pais;
        this.listaDeportistas = new ArrayList<Deportista>();
    }



    public void listaDeportistas(){
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Deportista> getListaDeportistas() {
        return listaDeportistas;
    }

    public void setListaDeportistas(ArrayList<Deportista> listaDeportistas) {
        this.listaDeportistas = listaDeportistas;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "pais='" + pais + '\'' +
                ", listaDeportistas=" + listaDeportistas +
                '}';
    }

}
