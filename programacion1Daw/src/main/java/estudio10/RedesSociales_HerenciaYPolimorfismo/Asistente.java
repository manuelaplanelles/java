package estudio10.RedesSociales_HerenciaYPolimorfismo;

public class Asistente extends Personas{
    public String tipoEntrada;

    public Asistente(String nombre, int edad, String tipoEntrada) {
        super(nombre, edad);
        this.tipoEntrada=tipoEntrada;

    }
@Override
public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println(tipoEntrada);
}
@Override
public void accederEvento(){
        System.out.println("Accediendo como Asistente: Buscando asiento");
}



    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    @Override
    public String toString() {
        return "Asistente{" +
                "tipoEntrada='" + tipoEntrada + '\'' +
                '}';
    }
}
