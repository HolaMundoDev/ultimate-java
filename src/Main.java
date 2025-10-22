
import colecciones.EjemploComparable;
import colecciones.Lista;
import colecciones.MiColeccion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


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
        EjemploComparable e2 = new EjemploComparable("Felipe");
        EjemploComparable e1 = new EjemploComparable("Chanchito Feliz");

        lista.add(e1);
        lista.add(e2);

        Collections.sort(lista);
        System.out.println(lista);
    }
}