package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MiColeccion {
    public static void run(){
        Collection<Number> colleccion = new ArrayList<>();
        colleccion.add(1);
        colleccion.add(2);
        Collections.addAll(colleccion, 3, 4, 5) ;
        colleccion.remove(3);
        System.out.println("Existe " + colleccion.contains(3));
        System.out.println(colleccion);

//        Number[] x = colleccion.toArray(new Number[4]);
        System.out.println(colleccion.isEmpty());
//        colleccion.clear();
        System.out.println("después de llamar a clear " + colleccion);

        Collection<Number> otra = new ArrayList<>();
        otra.add(6);
        otra.add(7);

        System.out.println(colleccion.equals(otra));
        colleccion.addAll(otra);
        System.out.println(colleccion);

        for (var elemento : colleccion){
            System.out.println("elemento = " + elemento);
        }
    }
}
