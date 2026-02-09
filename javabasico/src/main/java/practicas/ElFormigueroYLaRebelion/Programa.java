package practicas.ElFormigueroYLaRebelion;

import java.util.ArrayList;

public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;

    private ArrayList<Empleado>  listaEmpleado = new ArrayList<>();
    private ArrayList<Invitado> listaInvitado = new ArrayList<>();
    private Empleado director;

    public Programa(String nombre, Cadena cadena, String nombreDirector) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;

        this.director = new Empleado(nombreDirector, "director", null);
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
    public void invitadosTemporada(int temporada) {
        int contador = 0;

        System.out.println("Invitados de la temporada " + temporada );

        for (Invitado invitado : listaInvitado) {
            if (invitado.getTemporada() == temporada) {
                contador++;
                System.out.println("- " + invitado.getNombre() + " (" + invitado.getProfesion() + ")");
            }
        }

        System.out.println("Total de invitados en temporada " + temporada + ": " + contador);
    }
    public int vecesInvitado(String nombre) {
        int veces = 0;

        for (Invitado invitado : listaInvitado) {
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                veces++;
            }
        }

        return veces;
    }
    public void rastrearInvitado(String nombre) {
        int veces = vecesInvitado(nombre);

        System.out.println("Rastreo de " + nombre);
        System.out.println("Ha visitado el programa " + veces + " veces");

        if (veces > 0) {
            System.out.println("Detalles de las visitas:");
            for (Invitado invitado : listaInvitado) {
                if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("- Fecha: " + invitado.getFecha_visita() +
                            ", Temporada: " + invitado.getTemporada());
                }
            }
        } else {
            System.out.println(nombre + " no ha visitado el programa.");
        }
    }
    public boolean buscarInvitado(String nombre) {
        for (Invitado invitado : listaInvitado) {
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
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

    @Override
    public String toString() {
        String nombreCadena = (cadena != null) ? cadena.getNombre() : "Sin cadena";
        return "Programa: " + nombre + "\n" +
                "Cadena: " + nombreCadena + "\n" +
                "Temporadas: " + temporadas + "\n" +
                "Director: " + director.getNombre() + "\n" +
                "Empleados: " + listaEmpleado.size() + "\n" +
                "Invitados: " + listaInvitado.size() + "\n";
    }
}
