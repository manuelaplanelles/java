package miprimerjava;

public class CondicionalesEjercicios {
    /*
    Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
    Declara dos números y muestra cuál es mayor, o si son iguales.
    Dado un número, verifica si es positivo, negativo o cero.
    Crea un programa que diga si un número es par o impar.
    Verifica si un número está en el rango de 1 a 100.
    Declara una variable con el día de la semana (1-7) y muestra su nombre con un switch.
    Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o Suspenso según la nota (0 a 100)
    Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
    Crea un programa que diga si una letra es vocal o consonante (char).
    Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
     */

    static void main() {
        int edad = 15;

        if (edad >= 18){
            System.out.println("Puedes votar.");
        }else{
            System.out.println("Eres menor de edad, no puedes votar.");
        }

        int num1 = 5;
        int num2 = 5;

        if (num1 > num2){
            System.out.println("El numero " + num1 + " es mayor que " + num2);
        }else if (num1 < num2){
            System.out.println("El numero " + num2 + " es mayor que " + num1);
        }else{
            System.out.println("Los numeros son iguales.");
        }

        num1 = 0;
        if (num1 > 0){
            System.out.println("El " + num1 + " es positivo");
        } else if (num1 < 0){
            System.out.println("El " + num1 + " es negativo");
        }else{
            System.out.println("El numero es " + num1);
        }

        num2 = 13;

        if (num2 % 2 == 0){
            System.out.println("El " + num2 + " es par");
        }else{
            System.out.println("El " + num2 + " es impar");
        }

        num2 = 105;
        if (num2 >= 1 && num2 <= 100){
            System.out.println("El " + num2 + " esta entre 0 y 100");
        }else{
            System.out.println("El " + num2 + " no esta entre 0 y 100");
        }

        int dia = 9;
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No es ningún día de la semana.");
        }
        var nota = 105;
        if (nota >= 0 && nota < 50) {
            System.out.println("Suspenso");
        } else if (nota >= 50 && nota <= 80) {
            System.out.println("Aprobado");
        } else{
            System.out.println("Sobresaliente");
        }

    }
}
