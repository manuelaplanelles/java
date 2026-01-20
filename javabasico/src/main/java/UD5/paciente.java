package UD5;

import java.util.Random;

public class paciente {
    private Random aleatorio = new Random();
    private static final char DEF_SEXO = 'X';

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private int altura;

    public Paciente (String nombre, int edad, char sexo, double peso, int altura){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Paciente (){
        this(null,0,DEF_SEXO,0,0);
    }

    public String generarDNI(){

        String dni = "";
        for (int i = 0; i < 8; i++) {
            int num = aleatorio.nextInt(10);
            dni = dni + num;
        }

        return dni;

    }
}
