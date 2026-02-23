package practicas.SistemaModernizacionMutxamel;

import java.util.Scanner;

public class AppMantenimiento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion1 ;
        do {
            System.out.println("=== App de mantenimiento del MUTXAMEL FC ===");
            System.out.println();
            System.out.println("  [1]. Mantenimiento de jugadores");
            System.out.println("         Dentro podremos añadir jugadores, modificar datos y añadir acompañantes (sólo seniors).");

            System.out.println("  [2]. Mantenimiento de entrenadores (añadir-modificar-salir)");
            System.out.println("         Dentro podremos añadir entrenadores y modificar sus datos.");

            System.out.println("  [3]. Mantenimiento masajistas (añadir-modificar datos-salir)");
            System.out.println("         Dentro podremos añadir masajistas y modificar sus datos.");

            System.out.println("  [4]. Consultar equipos");
            System.out.println("         Dentro se deben listar los tipos de equipos del club y elegir uno.");

            System.out.println("  [X]. Salir");
            System.out.println();

            System.out.println("==============================================");
            System.out.println();

            System.out.print("Selecciona una opción --> ");

            opcion1 = teclado.next();

            switch (opcion1) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;

                case "4":

                    break;

                    case "x":
                        System.out.println("Finalizando programa.");
                    break;
            }

        }while (!opcion1.matches("[1-4xX]"));{
            System.out.println("La opcion no es valida");
        }
    }
}
