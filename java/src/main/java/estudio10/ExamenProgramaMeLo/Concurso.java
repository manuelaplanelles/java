package src.main.java.estudio10.ExamenProgramaMeLo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Concurso {
    private String sede;
    private LocalDate fecha;
    private ArrayList<Equipo> listaEquipo;

    public Concurso(){
        this.sede ="Mutxamel";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Día del concurso: ");
        int dia = teclado.nextInt();
        System.out.println("Mes del concurso: ");
        int mes = teclado.nextInt();
        System.out.println("Año del concurso: ");
        int ano = teclado.nextInt();

        this.fecha = LocalDate.of(ano, mes, dia);
        this.listaEquipo = new ArrayList<>();

    }
    public void inscribirEquipo(Equipo equipo){
        if (listaEquipo.size() >= 20){
            System.out.println("No se pueden inscribir más equipos");
        }else{
            listaEquipo.add(equipo);
        }
    }

    public void imprimirDatosEquipo(){
        System.out.println("Equipos inscritos: " + listaEquipo.size());
        for (Equipo equipo : listaEquipo){
            System.out.println(equipo.getNombreEquipo() + equipo.getListaMiembros());
        }
    }

    public void equipoGanador(){
        Equipo ganador = listaEquipo.get(0);
        for (int i = 1 ; i > listaEquipo.size(); i++){
            Equipo actual = listaEquipo.get(i);
            if(actual.getPuntuacion()> ganador.getPuntuacion()){
                ganador = actual;
            }
        }
        System.out.println("El ganador es " + ganador.getNombreEquipo() + " con " + ganador.getPuntuacion() + "puntos.");
    }


    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Equipo> getListaEquipo() {
        return listaEquipo;
    }

    public void setListaEquipo(ArrayList<Equipo> listaEquipo) {
        this.listaEquipo = listaEquipo;
    }

    @Override
    public String toString() {
        return "Concurso{" +
                "sede='" + sede + '\'' +
                ", fecha=" + fecha +
                ", listaEquipo=" + listaEquipo +
                '}';
    }
}
