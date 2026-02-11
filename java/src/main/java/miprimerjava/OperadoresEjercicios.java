package miprimerjava;

public class OperadoresEjercicios {
    /*
    Crea una variable con el resultado de cada operación aritmetica.
    Crea una variable para cada tipo de operación de asignación
    Imprime 3 comparaciones verdades con diferentes operadores de comparación.
    Imprime 3 comparaciones falsas con diferentes opradores de comparación.
    Utiliza el operador lógico and
    Utiliza el operador lógico or.
    Combina ambos operadores lógicos
    Añade alguna negación
    Imprime 3 ejemplos de uso de operadores unarios.
    Combina operadores aritmeticos, de comparavción y lógicos.
     */
    public static void main(String[] args) {
        int a =  5 + 4; // 9
        System.out.println(a);
        int b = 10 - 1; // 9
        System.out.println(b);
        float c = 5 * 4; // 20
        System.out.println(c);
        int d = 5 / 4; // 1
        System.out.println(d);

         a = b; //9
        System.out.println(a);
        c -= 3; //9
        System.out.println(b);
        b += 1; // 17
        System.out.println(c);
        d *= 3; //3
        System.out.println(d);
        b /= 2; //17
        System.out.println(c);

        System.out.println(a > d);
        System.out.println(a > b);
        System.out.println(b < c);

        System.out.println((a > d)&&(a > b));
        System.out.println((a != d)||(a > b));
        System.out.println((a != d) && (a > b) || (a > b));
    }
}
