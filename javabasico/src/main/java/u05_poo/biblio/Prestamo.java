package u05_poo.biblio;

import java.time.LocalDateTime;

public class Prestamo {
    private Estudiante estudiante;
    private Libro Libro;
    private LocalDateTime fecha;

    public Prestamo (Estudiante estudiante, Libro libro){
        fecha = LocalDateTime.now();
        this.estudiante=estudiante;
        this.Libro=libro;
    }
    
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Libro getLibro() {
        return Libro;
    }

    public void setLibro(Libro libro) {
        Libro = libro;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "estudiante=" + estudiante +
                ", Libro=" + Libro +
                ", fecha=" + fecha +
                '}';
    }
}
