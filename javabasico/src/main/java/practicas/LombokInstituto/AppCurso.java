package practicas.LombokInstituto;

public class AppCurso {
    public static void main(String[] args) {

        Instituto instSinNombre = new Instituto(null);
        System.out.println("Nombre asignado: " + instSinNombre.getNombre());
        instSinNombre.agregarEstudiante(null);
        instSinNombre.getListaCursos(null);


    }
}
