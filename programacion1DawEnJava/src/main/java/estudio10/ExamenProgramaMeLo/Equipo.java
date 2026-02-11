package src.main.java.estudio10.ExamenProgramaMeLo;

import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private ArrayList<String> listaMiembros;
    private int probemasResueltos;
    private  int puntuacion;

    public Equipo(String nombreEquipo){
        this.nombreEquipo = nombreEquipo;
        this.listaMiembros = new ArrayList<>();
        this.probemasResueltos = 0;
        this.puntuacion = 0;
    }
    public void insertarMiembros(String nombre){
            if (listaMiembros.size()>= 4){
                System.out.println("No se puede inscribir mas de 4 miembros por equipo.");
            }else{
                listaMiembros.add(nombre);
            }
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getProbemasResueltos() {
        return probemasResueltos;
    }

    public void setProbemasResueltos(int probemasResueltos) {
        this.probemasResueltos = probemasResueltos;
    }

    public ArrayList<String> getListaMiembros() {
        return listaMiembros;
    }

    public void setListaMiembros(ArrayList<String> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", listaMiembros=" + listaMiembros +
                ", probemasResueltos=" + probemasResueltos +
                ", puntuacion=" + puntuacion +
                '}';
    }
}
