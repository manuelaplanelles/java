package ra04_gestion_datos_y_aplicaciones.u07_coleccioneDinámicasDatos;

import java.util.ArrayList;
import java.util.ListIterator;

import static ra04_gestion_datos_y_aplicaciones.u07_coleccioneDinámicasDatos.Ejemplo_ListaIt.teclado;


// Asume fichero llamado solution.java
    public class solution {

        static java.util.Scanner in;
        static String palabra= teclado.nextLine();
        public static boolean casoDePrueba() {
            if (!in.hasNext())
                return false;
            else {
                ArrayList<Character> lista = new ArrayList<>();
                ListIterator<Character> it = lista.listIterator();

                for (Character caracter : palabra.toCharArray()){
                    switch (caracter){
                        case '-':
                            if(it.hasPrevious()){
                                it.previous();
                            }
                            break;
                        case '+':
                            if(it.hasNext()){
                                it.next();
                            }
                            break;
                        case '*':
                            if(it.hasPrevious()){
                                it.previous();
                                it.remove();
                            }
                            break;
                        default:
                            it.add(caracter);
                    }
                }
                for(Character caracter : lista){
                    System.out.println(caracter);
                }
                return true;
            }
        } // casoDePrueba

        public static void main(String[] args) {
            in = new java.util.Scanner(System.in);
            while (casoDePrueba()) {
            }
        } // main

    } // class solution
