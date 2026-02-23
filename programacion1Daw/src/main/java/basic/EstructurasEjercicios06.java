package basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EstructurasEjercicios06 {
    /*
    Crea un HashSet con 2 valores diferentes.
    Añade un nuevo valor repetido y otro sin repetir al HashSet.
    Elimina uno de los elementos del HashSet.
    Crea un HashSet donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
    Modifica uno de los contactos y elimina otro.
    Dado un Array, transfórmalo en un ArrayList, a continuación en un HasthSet y finalmente en un HashMap con clave y valor iguales.
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        /*Crea un Array con 5 valores e imprime su longitud.
         */
        int[] num0 = {3, 5, 7, 10, 15};
        System.out.println(num0.length);


        /*Crea un Array vacío.
         */
            int[] vacio =new int[0];


        /*
        Declara un array de 5 Strings con nobres de ciudades. Imprime la primera y la última usando length.
        */
        String[] ciudades = {"Alicante", "Valencia", "Malaga", "Barcelona", "Madrid"};
        System.out.println(ciudades[0] + ", " + ciudades[ciudades.length-1]);


        /*
        Crea int[] nums = new int[6]. Sin inicializar, imprime todos sis valores. y explica por que.
         */
            int[] nums3 = new int[6];

        System.out.println(nums3.length + " vacio");
        for (int i = 0;i< nums3.length; i ++){
            System.out.println(nums3[i]);
        }


        /*
        Crea un array de 4 doubles inicializado directamente con {1.5,3.0,4.5,6.0}. Modifica el elemento del índice
        2 y muéstralo.
        */
        double[] numeros = {1.5,3.0,4.5,6.0};
        System.out.println(numeros[2]);
        numeros[2] = 5.0;
        System.out.println(numeros[2]);


        /*
        Array de 8 enteros aleatorios [0,500]. Usa Math.random() para generarlos. Calcula e imprime la suma.
        */
        Random random2 = new Random();
        int[] num1 = new int[8];
        int suma2 = 0;
        for(int i = 0; i < num1.length; i++){
            num1[i] = random2.nextInt(0, 500);
        }
        for(int num : num1){
            suma2 += num;
        }
        System.out.println("La suma es: " + suma2);


        /*
        Array de 5 Strings. Recorre con for-each imprimiendo cada cadena en mayúsculas (.toUpperCase()).
        */
        String[] nombres = {"Juan", "Laura", "Manuela", "Carmen","Jose"};
        for(String nombre : nombres){
            System.out.print(nombre.toUpperCase()+ ", ");
            System.out.println();
        }


        /*Array de 4 palabras. Recorre con for clásico e imprime: [0] Hola   [1] Mundo   [2] ...
         */
        String[] palabras = {"hola", "Mundo", "que", "tal"};
        for (int i = 0; i< palabras.length; i ++){
            System.out.println("["+i+"]"+ " " + palabras[i]);
        }

        /*
        Crea {1,2,3,4,5}. Inviértelo in-place (sin crear otro array). Imprime antes y después.
        */
        int[] nums4 = {1,2,3,4,5};
        int izq = 0;
        int dch = nums4.length-1;

        System.out.println(Arrays.toString(nums4));

        while (izq<dch){
            int aux = nums4[izq];
            nums4[izq] = nums4[dch];
            nums4[dch]  = aux;
            izq++;
            dch--;
        }
        System.out.println(Arrays.toString(nums4));


        /*
        Array de 25 enteros aleatorios [0,100]. Pide un número al usuario y muestra cuántas veces aparece.
         */
        Random random = new Random();
        int[] nums5 = new int[25];
        int contador = 0;


        for(int i = 0; i < nums5.length; i++){
            nums5[i] = random.nextInt(0, 100);
        }
        System.out.println(Arrays.toString(nums5));
        System.out.println("Intoduce un numero del 0 al 100: ");
        int numero = teclado.nextInt();
        for(int i = 0; i < nums5.length; i++){
            if(nums5[i] == numero){
                contador++;
            }
        }
        System.out.println("El numero; " + numero + " aparece " + contador + " veces.");
        /*
        Array de 10 enteros aleatorios. Muestra el máximo y el mínimo con sus posiciones.
         */

        /*
        Array {1,2,3,4,5}. Rótalo una posición a la derecha.
        */

        /*Añade 4 valores al ArrayList y elimina uno a continuación.
         */
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

            //Modifica uno de los valores de Array e imprime el valor del índice antes y después de modificsrlo.
            System.out.println(nom);
            nom.set(0,"Manue");
            System.out.println(nom);

    }
}
