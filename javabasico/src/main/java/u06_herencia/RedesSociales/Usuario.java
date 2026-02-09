package u06_herencia.RedesSociales;

public class Usuario {
    private String nombre;
    private int edad;
    private String nomUsuario;
    private int seguidores;

    public Usuario(String nombre, int edad, String nomUsuario, int seguidores){
        this.nombre = nombre;
        this.edad = edad;
        this.nomUsuario = nomUsuario;
        this.seguidores = seguidores;

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

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nomUsuario='" + nomUsuario + '\'' +
                ", seguidores=" + seguidores +
                '}';
    }
}
