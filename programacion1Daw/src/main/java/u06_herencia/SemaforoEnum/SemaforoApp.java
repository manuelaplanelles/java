package u06_herencia.SemaforoEnum;

public class SemaforoApp {
    public static void main(String[] args) {
        Semaforo inicio = Semaforo.AMARILLO;

        for(int i = 0; i < 10; i++){
            inicio = Semaforo.siguiente(inicio);
            System.out.println(inicio);
        }
    }
}

