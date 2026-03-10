package ra04_gestion_datos_y_aplicaciones.u07_coleccioneDinámicasDatos.E3_TareasFuncionario;

import java.util.Stack;

public class InformeApp {
    public static void main(String[] args) {
        Stack<Informe> pila_informes = new Stack<>();

        Informe documento1 = new Informe(1234,Descripcion.ADMINISTRATIVO);
        Informe documento2 = new Informe(4567,Descripcion.EMPRESARIAL);
        Informe documento3 = new Informe(7890,Descripcion.EMPRESARIAL);
        Informe documento4 = new Informe(2345,Descripcion.PERSONAL);
        Informe documento5 = new Informe(3456,Descripcion.ADMINISTRATIVO);

        pila_informes.add(documento1);
        pila_informes.add(documento2);
        pila_informes.add(documento3);
        pila_informes.add(documento4);
        pila_informes.add(documento5);
        System.out.println(pila_informes);

        while (!pila_informes.isEmpty()){
            System.out.println("El proximo documento a eliminar: "+pila_informes.peek());
            System.out.println("Documento eliminado: "+pila_informes.pop());
        }
    }
}
