package colecciones;

import java.util.*;

public class EjemploSet {
    public static void run(){
        Set<String> conjunto = new HashSet<>(Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves","Viernes"));

        conjunto.add("Sábado");
        conjunto.add("Lunes");
        conjunto.remove("Sábado");
        System.out.println(conjunto);

//        Collections.addAll(conjunto, "Sábado", "Domingo");
//        System.out.println(conjunto);

        Set<String> conjunto2 = new HashSet<>(Arrays.asList("Viernes", "Sábado", "Domingo"));
        // Union
//        conjunto.addAll(conjunto2);
//        System.out.println(conjunto);
        // Diferencia
//        conjunto.removeAll(conjunto2);
//        System.out.println(conjunto);
        // Intersección
//        conjunto.retainAll(conjunto2);
//        System.out.println(conjunto);

    }
}
