package basic;

public class EjerciciosFunciones08 {
    public static void main(String[] args) {
        bienvenida();
        String nombre = "Manuela";
        saludo(nombre);
        int num1 = 3;
        int num2 = 4;
        resta(num1, num2);
        cuadrado(num1);
        parImpar(num1);
        int edad = 16;
        System.out.println(mayorEdad(edad));
    }
    //Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde 0!"
    public static void bienvenida(){
        System.out.println("¡Te doy la bienvenida al curso de Java desde 0!");
    }
    // Crea una función que reciba un nombre como parámetro y salude a esa persona.
    public static void saludo(String nombre){
        System.out.println("Hola " + nombre);
    }
    //Haz un método que reciba dos números y devuelva su resta.
    public static int resta(int num1, int num2){
        int restaSol = num1 - num2;
        System.out.println("La resta  de " + num1 +  " y  " + num2 + " es " +  restaSol);
        return restaSol;
    }
    //Crea un método que calcule el cuadrado de un número (n*n).
    public static int cuadrado(int num1){
        int numCuadrado1 = num1*num1;
        System.out.println("El nº " + num1 + " al cuadrado es: " + numCuadrado1);
        return numCuadrado1;
    }
    //Escribe una función que reciba un número y diga si es par o impar.
    public static void parImpar(int num1){
        if (num1%2==0){
            System.out.println("El nº" + num1+ " es par");
        }else {
            System.out.println("El nº" + num1+ " es impar");
        }
    }
    //Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario)
    public static boolean mayorEdad (int edad){
        boolean esMayor = true;
        if (edad>18){
            esMayor = true;
        }else{
            esMayor = false;
        }
        return esMayor;
    }

     /*
    Imprime una función que reciba una cadena y retorne su longitud.
    Crea un metodo que reciba un array de enteros, calcula su media y lo retorna.
    Escribe un metodo que reciba un número y retorna su factorial.
    Crea un duncion que reciba un ArrayList<String> y lo recorra mostrando cada elemento
     */
}
