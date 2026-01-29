package miprimerjava;

public class StringsEjercicios {
    /*
    Concatena dos cadenas de texto.
    Muestra la longitud de una cadena de texto.
    Muestra el primer y último carácter de un string
    Convierte a mayúsculas y minúsculas un string
    Comprueba si una cadena de texto contiene una palabra concreta.
    Formatea un string con un entero
    Elimina los espacios en blanco al principio y final de un string
    Sustituye todos los espacios en blanco de un string por un guion
    Comprueba si dos strings son iguales.
    Comprueba si dos strings tienen la misma longitude.
     */
    static void main() {
        System.out.println("Hola, mundo" + " soy Manuela.");
        String name = "manuela";
        String subname = "planelles";
        System.out.println(subname.length());
        System.out.println(name.charAt(0) + " " + (name.charAt(name.length()-1)));
        System.out.println(name.toUpperCase() + " " + subname.toLowerCase() );
        System.out.println("Hola, soy Manuela.".contains("ela"));
        System.out.println(String.format("Hola, mundo soy %s.", name));
        System.out.println(" Hola, mundo soy Manuela. ".trim());
        System.out.println(" Hola, mundo soy Manuela. ".replace(" ", "-"));
        System.out.println(name.equals("Manuela"));
        System.out.println(name.equalsIgnoreCase("Manuela"));
        System.out.println(name.length() == subname.length());
    }
}
