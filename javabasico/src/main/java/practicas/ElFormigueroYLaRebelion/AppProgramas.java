package practicas.ElFormigueroYLaRebelion;

public class AppProgramas {
    public static void main(String[] args) {
        Empleado director = new Empleado("Director1", "director", null);
        Empleado empleado1 = new Empleado("María García", "actor", director);
        System.out.println(empleado1);
        Empleado empleado2 = new Empleado("Pedro Sánchez", "director", director);
        System.out.println(empleado2);
        Empleado empleado3 = new Empleado("Luis Martínez", "", director);
        System.out.println(empleado3);

        Invitado inv1 = new Invitado("Aitana", "cantante", 1);
        System.out.println(inv1.getNombre());
        System.out.println(inv1.getFecha_visita());
        System.out.println(inv1);

        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);


    }
}
