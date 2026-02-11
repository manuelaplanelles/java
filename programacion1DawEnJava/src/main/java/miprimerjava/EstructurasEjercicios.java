package miprimerjava;

import java.util.ArrayList;
import java.util.Arrays;

public class EstructurasEjercicios {
    /*
    Crea un Array con 5 valores e imprime su longitud.
    Modifica uno de los valores de Array e imprime el valor del índice antes y después de modificsrlo.
    Crea un Array vacío.
    Añade 4 valores al ArrayList y elimina uno a continuación.
    Crea un HashSet con 2 valores diferentes.
    Añade un nuevo valor repetido y otro sin repetir al HashSet.
    Elimina uno de los elementos del HashSet.
    Crea un HashSet donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
    Modifica uno de los contactos y elimina otro.
    Dado un Array, transfórmalo en un ArrayList, a continuación en un HasthSet y finalmente en un HashMap con clave y valor iguales.
     */
    static void main() {

        int[] num = {3, 5, 7, 10, 15};
        System.out.println(num.length);

        int[] vacio =new int[0];

        ArrayList<String> nom =new ArrayList<String>();
        System.out.println(nom.size());

        nom.add("Manuela");
        nom.add("Planelles");
        nom.add("Lucas");
        nom.add("Alicante");
        System.out.println(nom);
        System.out.println(nom.size());

        nom.remove("Alicante");
        System.out.println(nom);
        System.out.println(nom.size());










    }
}
