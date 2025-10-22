package colecciones;

import java.util.Comparator;

public class EdadComparator implements Comparator<EjemploComparable> {
    @Override
    public int compare(EjemploComparable o1, EjemploComparable o2) {
        return o1.getEdad().compareTo(o2.getEdad());
    }
}
