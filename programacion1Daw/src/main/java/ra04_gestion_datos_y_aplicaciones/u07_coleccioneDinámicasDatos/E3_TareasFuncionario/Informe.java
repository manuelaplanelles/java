package ra04_gestion_datos_y_aplicaciones.u07_coleccioneDinámicasDatos.E3_TareasFuncionario;

public class Informe {
    private int codigo;
    private Descripcion descripcion;

    public Informe(int codigo, Descripcion descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Descripcion descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Informe{" +
                "codigo=" + codigo +
                ", descripcion=" + descripcion +
                '}';
    }
}
