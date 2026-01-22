package u05_poo;

public class libro {
    private String libro;
    private String autor;
    private String id;
    private boolean disponible;

    private static int cantidadLibros =0;
    private static int librosDisponibles=0;

    public libro (String libro, String autor){
        this.libro=libro;
        this.autor=autor;


    }
    //calculo de id
    private String calcularId(){ //calculo de id
        return "LIB" + String.format("%000", cantidadLibros);
    }

}
