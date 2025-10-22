
import colecciones.EdadComparator;
import colecciones.EjemploComparable;
import colecciones.Lista;
import colecciones.MiColeccion;

import java.util.*;


public class Main {
    public static void main(String[] args) {
//        MiColeccion.run();
//
//        var lista = new Lista<>();
//        lista.add(1);
//        lista.add(2);
//
//
//        for (Object elemento : lista) {
//            System.out.println("Iterando... " + elemento);
//        }

//        List<Integer> lista = new ArrayList<>();
//        Collections.addAll(lista, 1,2,3,4,50);
//
//        var elemento = lista.get(2);
//        lista.set(2, 50);
//
//        System.out.println(lista.indexOf(50));
//        System.out.println(lista.indexOf(49));
//
//        System.out.println(lista.lastIndexOf(50));
//
//        System.out.println(lista.subList(0, 3));
//        System.out.println(lista);

        List<EjemploComparable> lista = new ArrayList<EjemploComparable>();
        EjemploComparable e2 = new EjemploComparable("Felipe", 15);
        EjemploComparable e1 = new EjemploComparable("Chanchito Feliz", 22);

        lista.add(e1);
        lista.add(e2);

        Collections.sort(lista, new EdadComparator());
        System.out.println(lista);
    }
}