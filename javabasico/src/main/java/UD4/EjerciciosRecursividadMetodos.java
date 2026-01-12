package UD4;

public class EjerciciosRecursividadMetodos {
    public static void main(String[] args) {
        // EJERCICIO 1: Contar dígitos
        System.out.println("=== EJERCICIO 1 ===");
        System.out.println("Dígitos de 12345: " + contarDigitos(12345));
        System.out.println("Dígitos de 7: " + contarDigitos(7));

        // EJERCICIO 2: Potencia
        System.out.println("\n=== EJERCICIO 2 ===");
        System.out.println("2^4 = " + calcularPotencia(2, 4));
        System.out.println("3^3 = " + calcularPotencia(3, 3));

        // EJERCICIO 3: Invertir número
        System.out.println("\n=== EJERCICIO 3 ===");
        System.out.print("1234 invertido: ");
        invertirNumero(1234);
        System.out.println();

        // EJERCICIO 4: Es binario
        System.out.println("\n=== EJERCICIO 4 ===");
        System.out.println("¿1010 es binario? " + esBinario(1010));
        System.out.println("¿1234 es binario? " + esBinario(1234));

        // EJERCICIO 5: Decimal a binario
        System.out.println("\n=== EJERCICIO 5 ===");
        System.out.println("10 en binario: " + decimalABinario(10));
        System.out.println("25 en binario: " + decimalABinario(25));

        // EJERCICIO 6: Palabra ordenada
        System.out.println("\n=== EJERCICIO 6 ===");
        System.out.println("¿'abc' está ordenada? " + estaOrdenada("abc", 0));
        System.out.println("¿'casa' está ordenada? " + estaOrdenada("casa", 0));

        // EJERCICIO 7: Suma hasta N
        System.out.println("\n=== EJERCICIO 7 ===");
        System.out.print("Suma hasta 4: ");
        sumaHastaN(1, 4);
        System.out.println();
    }

    // ==================== EJERCICIO 1 ====================
    // Contar dígitos de un número (RECURSIVO)
    public static int contarDigitos(int numero) {
        // CASO BASE: si el número es menor que 10, tiene 1 dígito
        if (numero < 10) {
            return 1;
        } else {
            // CASO RECURSIVO: dividimos entre 10 y sumamos 1
            return 1 + contarDigitos(numero / 10);
        }
    }

    // ==================== EJERCICIO 2 ====================
    // Calcular potencia (base^exponente) (RECURSIVO)
    public static int calcularPotencia(int base, int exponente) {
        // CASO BASE: cualquier número elevado a 0 es 1
        if (exponente == 0) {
            return 1;
        } else {
            // CASO RECURSIVO: multiplicamos base por la potencia anterior
            return base * calcularPotencia(base, exponente - 1);
        }
    }

    // ==================== EJERCICIO 3 ====================
    // Invertir un número (RECURSIVO) - Imprime en pantalla
    public static void invertirNumero(int numero) {
        // CASO BASE: si es menor que 10, solo imprimimos el número
        if (numero < 10) {
            System.out.print(numero);
        } else {
            // CASO RECURSIVO: imprimimos el último dígito y llamamos con el resto
            System.out.print(numero % 10);
            invertirNumero(numero / 10);
        }
    }

    // Versión que devuelve el número invertido (RECURSIVO con AUXILIAR)
    public static int invertirNumeroValor(int numero) {
        return invertirAuxiliar(numero, 0);
    }

    private static int invertirAuxiliar(int numero, int invertido) {
        // CASO BASE: cuando el número llega a 0
        if (numero == 0) {
            return invertido;
        } else {
            // CASO RECURSIVO: vamos construyendo el número invertido
            int ultimoDigito = numero % 10;
            invertido = invertido * 10 + ultimoDigito;
            return invertirAuxiliar(numero / 10, invertido);
        }
    }

    // ==================== EJERCICIO 4 ====================
    // Comprobar si un número es binario (RECURSIVO)
    public static boolean esBinario(int numero) {
        // CASO BASE: si el número es 0 o 1, es binario
        if (numero == 0 || numero == 1) {
            return true;
        }

        // Si el último dígito no es 0 ni 1, NO es binario
        int ultimoDigito = numero % 10;
        if (ultimoDigito != 0 && ultimoDigito != 1) {
            return false;
        }

        // CASO RECURSIVO: comprobamos el resto del número
        return esBinario(numero / 10);
    }

    // ==================== EJERCICIO 5 ====================
    // Convertir decimal a binario (RECURSIVO)
    public static String decimalABinario(int numero) {
        // CASO BASE: si el número es 0 o 1
        if (numero == 0) {
            return "0";
        }
        if (numero == 1) {
            return "1";
        }

        // CASO RECURSIVO: dividimos entre 2 y guardamos el resto
        return decimalABinario(numero / 2) + (numero % 2);
    }

    // ==================== EJERCICIO 6 ====================
    // Comprobar si una palabra está ordenada alfabéticamente (RECURSIVO)
    public static boolean estaOrdenada(String palabra, int posicion) {
        // CASO BASE: si llegamos al penúltimo carácter, está ordenada
        if (posicion >= palabra.length() - 1) {
            return true;
        }

        // Comparamos el carácter actual con el siguiente
        char actual = palabra.charAt(posicion);
        char siguiente = palabra.charAt(posicion + 1);

        // Si el actual es mayor que el siguiente, NO está ordenada
        if (actual > siguiente) {
            return false;
        }

        // CASO RECURSIVO: comprobamos el resto de la palabra
        return estaOrdenada(palabra, posicion + 1);
    }

    // ==================== EJERCICIO 7 ====================
    // Suma de números desde 1 hasta N (RECURSIVO) - Imprime la cadena
    public static void sumaHastaN(int actual, int n) {
        // Imprimimos el número actual
        System.out.print(actual);

        // CASO BASE: si llegamos a N, imprimimos el resultado
        if (actual == n) {
            int suma = calcularSuma(n);
            System.out.print(" = " + suma);
        } else {
            // CASO RECURSIVO: imprimimos "+" y continuamos
            System.out.print("+");
            sumaHastaN(actual + 1, n);
        }
    }

    // Método auxiliar para calcular la suma (RECURSIVO)
    private static int calcularSuma(int n) {
        // CASO BASE: la suma hasta 0 es 0
        if (n == 0) {
            return 0;
        } else {
            // CASO RECURSIVO: sumamos n más la suma de los anteriores
            return n + calcularSuma(n - 1);
        }
    }
}
}
