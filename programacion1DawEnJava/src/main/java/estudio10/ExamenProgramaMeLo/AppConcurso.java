package src.main.java.estudio10.ExamenProgramaMeLo;

public class AppConcurso {
    public static void main(String[] args) {

        Concurso iesmutxamel = new Concurso();

        Equipo E1 = new Equipo("Equipo 1.");
        iesmutxamel.inscribirEquipo(E1);
        E1.insertarMiembros("Manuela");
        E1.insertarMiembros("Juan");

        Equipo E2 = new Equipo("Equipo 2.");
        iesmutxamel.inscribirEquipo(E2);
        E2.insertarMiembros("Pepe");
        E2.insertarMiembros("Lola");
        iesmutxamel.imprimirDatosEquipo();

    }
}
