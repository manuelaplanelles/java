package estudio10.RedesSociales_HerenciaYPolimorfismo;

public class Artistas extends Personas{
    public String generoMusical;

    public Artistas(String nombre, int edad,String generoMusical) {
        super(nombre, edad);
        this.generoMusical=generoMusical;
    }
@Override
public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println(generoMusical);
    }

    @Override
    public void accederEvento(){
        System.out.println("Accediendo como Artiste: Preparando el show.");
    }




    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    @Override
    public String toString() {
        return "Artistas{" +
                "generoMusical='" + generoMusical + '\'' +
                '}';
    }
}
