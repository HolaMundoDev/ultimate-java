import colecciones.Lista;
import colecciones.MiColeccion;

public class Main {
    public static void main(String[] args) {
        MiColeccion.run();

        var lista = new Lista<>();

//        while(iterator.hasNext()){
//            var elemento = iterator.next();
//            System.out.println(elemento);
//        }

        for (Object elemento : lista) {
            System.out.println(elemento);
        }
    }
}