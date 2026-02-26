package practicas.SistemaModernizacionMutxamel;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMantenimiento {
    static ArrayList<Masajista> listaMasajistas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Masajista m1 = new Masajista("Carlos",26,"Fisioterapeuta",5); //0
        Masajista m2 = new Masajista("Ramón",32,"Quiromasajista",7); //1
        Masajista m3 = new Masajista("José",45,"masajista Deportivo",20); //2
        listaMasajistas.add(m1);
        listaMasajistas.add(m2);
        listaMasajistas.add(m3);
        String opcion1;
        do {
            System.out.println("App de mantenimiento del MUTXAMEL FC");
            System.out.println();
            System.out.println("  [1]. Mantenimiento de jugadores");
            System.out.println("         Dentro podremos añadir jugadores, modificar datos y añadir acompañantes (sólo seniors).");
            System.out.println("  [2]. Mantenimiento de entrenadores (añadir-modificar-salir)");
            System.out.println("         Dentro podremos añadir entrenadores y modificar sus datos.");
            System.out.println("  [3]. Mantenimiento masajistas (añadir-modificar datos-salir)");
            System.out.println("         Dentro podremos añadir masajistas y modificar sus datos.");
            System.out.println("  [4]. Consultar equipos");
            System.out.println("         Dentro se deben listar los tipos de equipos del club y elegir uno.");
            System.out.println("  [x]. Salir");
            System.out.println();
            System.out.print("Selecciona una opción --> ");

            opcion1 = teclado.next().toLowerCase();

            switch (opcion1) {
                case "1":
                    System.out.println("Mantenimiento de Jugadores");
                    System.out.println("   [1]. Añadir nuevo jugador");
                    System.out.println("   [2]. Modificar datos de jugador existente");
                    System.out.println("   [3]. Crear acompañantes (sólo seniors)");
                    System.out.println("   [X]. Volver al menú principal");
                    System.out.println();
                    System.out.println("Selecciona una opción --> ");
                    break;

                case "2":
                    System.out.println("Mantenimiento de Entrenadores");
                    System.out.println("   [1]. Añadir nuevo entrenador");
                    System.out.println("   [2]. Modificar datos de entrenador existente");
                    System.out.println("   [X]. Volver al menú principal");
                    System.out.println();
                    System.out.println("Selecciona una opción --> ");
                    break;

                case "3":
                    menuMasajista();

                    break;

                case "4":
                    menuConsultarEquipos();
                    break;

                case "x":
                    System.out.println("Finalizando programa.");
                    break;
            }

        } while (!opcion1.matches("[1-4xX]"));
        {
            System.out.println("La opcion no es valida");
        }
    }
    public static void menuMasajista () {
        Scanner teclado = new Scanner(System.in);
        String opcion2;

        do {
            System.out.println("Mantenimiento de Entrenadores");
            System.out.println("   [1]. Añadir nuevo entrenador");
            System.out.println("   [2]. Modificar datos de entrenador existente");
            System.out.println("   [x]. Volver al menú principal");
            System.out.println();
            System.out.println("Selecciona una opción --> ");

            opcion2 = teclado.next().toLowerCase();
            switch (opcion2) {
                case "1": //Añadir nuevo entrenador
                    System.out.println("Introduce los datos del nuevo masajista1: ");
                    System.out.println("Nombre: ");
                    String nombre = teclado.next();

                    System.out.println("Edad: ");
                    int edad = teclado.nextInt();

                    System.out.println("Titulación: ");
                    String titulacion = teclado.next();

                    System.out.println("Años de experiencia: ");
                    int anyos = teclado.nextInt();

                    listaMasajistas.add(new Masajista(nombre, edad, titulacion, anyos));

                    System.out.println("¡Masajista añadido correctamente!");

                   for (int i = 0; i <listaMasajistas.size(); i++) {
                        Masajista m = listaMasajistas.get(i);
                       System.out.println("[" + i + ", "+ listaMasajistas.get(i).toString() );
                   }
                    break;

                    case "2": //Modificar datos de entrenador existente
                    System.out.println("¿De qué masajista quieres hacer cambios)");

                    for (int i = 0; i < listaMasajistas.size(); i++) {
                        System.out.println("[" + i + ", "+ listaMasajistas.get(i).toString() );
                    }

                    System.out.print("Selecciona una opción --> ");
                    int masajSelect = teclado.nextInt();

                    Masajista masajista = listaMasajistas.get(masajSelect);
                    System.out.print("¿Qué quieres modificar? [Nombre: " + masajista.getNombre() + ", Edad: " + masajista.getEdad() + ", Titulación: " + masajista.getTitulacion() + ", Años experiencia: " + masajista.getAnyosExperiencia() + "]: ");
                    String modificar = teclado.next().toLowerCase();

                    switch (modificar){
                        case "nombre":
                            String nomNuevo = teclado.next();
                            listaMasajistas.get(masajSelect).setNombre(nomNuevo);
                            break;
                        case "edad":
                            int edadNuevo = teclado.nextInt();
                            listaMasajistas.get(masajSelect).setEdad(edadNuevo);
                            break;
                        case "titulación":
                            String titNuevo = teclado.next();
                            listaMasajistas.get(masajSelect).setTitulacion(titNuevo);
                            break;
                        case "anyosExperiencia":
                            int anyosExpNuevo = teclado.nextInt();
                            listaMasajistas.get(masajSelect).setAnyosExperiencia(anyosExpNuevo);
                            break;
                    }
                    break;
                case "x": //Volver al menú principal
                    System.out.println("Volviendo al menú principal...");
                    break;
            }
        } while (!opcion2.matches("[1-2xX]"));
            System.out.println("La opcion no es valida");
    }
    public static void menuConsultarEquipos(){

    }
}

