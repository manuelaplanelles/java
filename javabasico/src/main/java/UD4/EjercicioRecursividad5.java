package UD4;

public class EjercicioRecursividad5 {
    public static String decimalABinario(int n) {
        if (n == 0) {
            return "0";
        }
        String binario = "";

        while (n > 0) {
            int resto = n % 2;
            binario = resto + binario;
            n = n / 2;
        }
        return binario;
    }
}
