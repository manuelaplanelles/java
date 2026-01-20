package UD5;

import org.w3c.dom.xpath.XPathResult;

public class pacienteApp {
    static void main() {
       /* paciente manuela = new paciente();
        System.out.println(manuela.getDni());
        paciente ivan = new paciente("ivan",20, 'H',100,170);
        System.out.println(manuela.esMayorDeEdad());
        System.out.println(ivan.esMayorDeEdad());
        System.out.println(ivan.getSexo());
        System.out.println(manuela.getSexo());
        */

        paciente paciente1 = new paciente("obj1",20, 'H',100,170);
        paciente paciente2 = new paciente("obj2",20, 'H',0,0);
        paciente paciente3 = new paciente();

        System.out.println(paciente1.setAltura());
        System.out.println(paciente1.setDni());
        System.out.println(paciente1.setEdad());
        System.out.println(paciente1.setPeso());
        System.out.println(paciente1.setNombre());

        System.out.println(paciente1.calcularIMC());
        System.out.println(paciente2.calcularIMC());
        System.out.println(paciente3.calcularIMC());

        System.out.println(paciente1.esMayorDeEdad());
        System.out.println(paciente2.esMayorDeEdad());
        System.out.println(paciente3.esMayorDeEdad());


    }
}
