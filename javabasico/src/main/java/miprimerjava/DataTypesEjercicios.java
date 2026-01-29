package miprimerjava;

public class DataTypesEjercicios {
    /*
    Declara una variable de tipo String y asígnale tu nombre.
    Crea una variable de tipo int y asígnale tu edad.
    Crea una variable double con tu altura en metros.
    Declara una variable de tipo boolean que indique si te gusta programar.
    Declara una constante con tu email.
    Crea una variable de tipo char y guárdale tu inicial.
    Declara una variable de tipo String con tu localidad y a continuación cambia su valor y vuelve a imprimirla
    Crea una variable int llamada a, otra b, e imprime la suma de ambas.
    Imprime el tipo de dos variables creadas anteriormente.
    Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
     */
    public static void main(String[] args) {


        String name = "Manuela";
        System.out.println(name);
        int edad = 35;
        System.out.println(edad);
        double altura = 1.73;
        System.out.println(altura);
        boolean programar =  true;
        System.out.println("Te gusta programar " + programar);
        final String EMAIL = "manuela@planelles.es";
        System.out.println(EMAIL);
        char inicial = 'M';
        System.out.println("La inicial de mi nombre es " + inicial);
        String ciudad = "Albacete";
        System.out.println(ciudad);
        ciudad = "Alicante";
        System.out.println(ciudad);
        int a = 5;
        int b = 2;
        int suma = a + b;
        System.out.println(suma);
        System.out.println("Soy " + name + " y tengo " + edad + " años.");
        String birth;
        birth = "7/8/1990";
        System.out.println(birth);
    }

}
