package estudio10.RedesSociales_HerenciaYPolimorfismo;

public class Personas {
   private String nombre;
   private int edad;

public void mostrarInfo(){
    System.out.println(nombre);
    System.out.println(edad);
}

public void accederEvento(){
    System.out.println("Accediendo al evento...");
}


    public Personas(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
