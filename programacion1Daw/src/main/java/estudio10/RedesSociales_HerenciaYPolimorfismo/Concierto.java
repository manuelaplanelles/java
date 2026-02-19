package estudio10.RedesSociales_HerenciaYPolimorfismo;

public class Concierto {

    public static void mostrarAcceso(Personas personas){
        personas.accederEvento();
    }

    public static void main(String[] args) {
        Personas a1 = new Artistas("Manuela", 35, "vip");
        Personas a2 = new Asistente("Nadia", 35, "pop");


        a1.mostrarInfo();
        a2.mostrarInfo();
        mostrarAcceso(a1);
        mostrarAcceso(a2);

    }
}
