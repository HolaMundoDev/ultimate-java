
import colecciones.Lista;
import colecciones.MiColeccion;


public class Main {
    public static void main(String[] args) {
        MiColeccion.run();

        var lista = new Lista<>();
        lista.add(1);
        lista.add(2);


        for (Object elemento : lista) {
            System.out.println("Iterando... " + elemento);
        }
    }
}