package miprimerjava;

public class HelloWorldEjercicios {
    //1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!"
    //2. Imprime dos lieas: "Hola" y luego "Mundo" con un solo println.
    //3. Añade un comentario sobre lo que hace cada linea del programa.
    //4. Crea un comentario en varias lineas
    //5. Imprime tu edad, tu color favorito y tu ciudad.
    //6. Explora los diferentes System.xxx.println(); más alla de "out".
    //7. Utiliza varios println para imprimir una frase.
    //8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando simbolos)
    //9. Intenta ejecutar el programa sin el metodo main y observa el error.
    //10. Intente cambiar el nombre del archivo a uno diferete del de la clase y compilalo.

    public static void main(String[] args) {
        System.out.println("Mi nombre es Manuela"); // Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!"
        System.out.println("Hola\nMundo"); //Imprime dos lieas: "Hola" y luego "Mundo" con un solo println.

        /* estamos haciendo ejercicios de printeo para mejorar la ajilidad de
        clicar o teclear, con este ejercicio comprobamos comentarios en varias lineas.
         */

        System.out.println("tengo: 35 años," + " mi color favorito es el azul" + " y soy de alicante");
        System.out.println(".out recibe datos");
        System.err.print(".err este es un supuesto mensaje de error, y sale en otro color");
        //y el .in es para recibir Scanner teclado = new Scanner(System.in);
        System.gc();    //Sugerencia de limpieza de memoria.
        //System.exit(0);    //Cierra el programa por completo.
        System.out.println("frase de prueba numero uno");
        System.out.println("frase de prueba numero 2");
        System.out.println(":)");
        System.out.println("   ******   ");
       // System.out.println("  *      *  ");
        System.out.println(" *  o  o  *  ");
        System.out.println("  *   V   *  ");
        System.out.println("  * \\__/ *  ");
        System.out.println("   ******   ");
    }
}
