package UD4;

public class Recursividad {

    static int limite = 10;
    static String frase ="Hola soy una frase al reves";
    static char[]  frase_char = frase.toCharArray() ;
    static String frase2 ="Hola soy una frase en orden alfabético";
    static char[]  frase_char2 = frase2.toCharArray() ;
    static void main(){
        //imprimir(1);
        //System.out.println(suma(10));

        System.out.println("*** Batería de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
        System.out.println();
        System.out.println("1 - Dígitos");
        System.out.println("2 - Potencias");
        System.out.println("3 - Del Revés");
        System.out.println("4 - Binario");
        System.out.println("5 - A binario");
        System.out.println("6 - Orden alfabético");
        System.out.println("7 - Mostrar suma");
        System.out.println();
    }

   /*public static void imprimir(int num){
        if (num<=limite){
            System.out.println(num);
            imprimir(num+1);
            return;
        }
    }
    public static int suma (int nums){
        if (nums == 0) {
            return 0;
        }else{
            return nums + suma(nums-1);
        }
    }*/


    public static int digitos (int num){
        if (num <10){
            return 1;
        }else{
            return digitos(num/10);
        }
    }
    public static int potencia (int base, int exponente){
        if (exponente == 0){
            return 1;
        }else{
            return base*potencia(base,exponente-1);
        }
    }
    public static void del_reves (int num){
        if (num<10){
            System.out.println(num);
        }else {
            System.out.println(num%10);
            del_reves(num/10);
        }
    }
    public static void del_reves_char(int posicion){
        if (posicion>=0){
            System.out.println(frase_char[posicion]);
            del_reves_char(posicion-1);
        }
    }
    public static void del_reves_char_sin_vector(int posicion){
        if (posicion<=0){
            System.out.println(frase_char2[posicion]);
            del_reves_char_sin_vector(posicion-1);
        }
    }

}


