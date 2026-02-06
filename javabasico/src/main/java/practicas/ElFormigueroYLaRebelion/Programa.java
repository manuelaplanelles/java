package practicas.ElFormigueroYLaRebelion;

import java.util.ArrayList;

public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;

    private ArrayList<Empleado>  listaEmpleado = new ArrayList<>();
    private ArrayList<Invitado> listaInvitado = new ArrayList<>();
    private Empleado director;

    public Programa(String nombre, Cadena cadena, int temporadas, ArrayList listaEmpleado, ArrayList listaInvitado) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        this.listaInvitado = listaInvitado;
        this.listaEmpleado = listaEmpleado;

        this.director = new Empleado("Leticia Sabater", "director", null);
        this.listaEmpleado.add(this.director);

        if (cadena != null) {
            cadena.agregarPrograma(this);
        }
    }
    public void añadirEmpleado(String nombre, String cargo, Empleado director) {
        if (!cargo.equalsIgnoreCase("director")) {
            director = this.director;
        }
        Empleado nuevoEmpleado = new Empleado(nombre, cargo, director);
        listaEmpleado.add(nuevoEmpleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        listaEmpleado.remove(empleado);
    }

    public void añadirInvitado(String nombre, String profesion, int temporada) {
        Invitado nuevoInvitado = new Invitado(nombre, profesion, temporada);
        listaInvitado.add(nuevoInvitado);
    }

    public void eliminarInvitado(Invitado invitado) {
        listaInvitado.remove(invitado);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
        if (this.cadena != null) {
            this.cadena.eliminarPrograma(this);
        }
        this.cadena = cadena;

        if (cadena != null) {
            cadena.agregarPrograma(this);
        }
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(ArrayList<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

    public ArrayList<Invitado> getListaInvitado() {
        return listaInvitado;
    }

    public void setListaInvitado(ArrayList<Invitado> listaInvitado) {
        this.listaInvitado = listaInvitado;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }
}
