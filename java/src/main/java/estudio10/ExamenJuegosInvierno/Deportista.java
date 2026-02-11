package src.main.java.estudio10.ExamenJuegosInvierno;

import java.time.LocalDate;
import java.util.ArrayList;

public class Deportista {
    private String nombre;
    private LocalDate fechaNacimiento;
    private int medallas;
    private Equipo equipo;
    private ArrayList<String> listaModalidades;

    public Deportista(String nombre, String pais, int dia, int mes, int ano){
        this.nombre = nombre;
        this.fechaNacimiento = LocalDate.of (ano, mes, dia);
        this.medallas = 0;
        this.equipo= new Equipo(pais);
        this.listaModalidades=new ArrayList<>();
    }

    public void listaModalidades (){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public ArrayList<String> getListaModalidades() {
        return listaModalidades;
    }

    public void setListaModalidades(ArrayList<String> listaModalidades) {
        this.listaModalidades = listaModalidades;
    }

    @Override
    public String toString() {
        return "Deportista{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", medallas=" + medallas +
                ", equipo=" + equipo +
                ", listaModalidades=" + listaModalidades +
                '}';
    }
}
