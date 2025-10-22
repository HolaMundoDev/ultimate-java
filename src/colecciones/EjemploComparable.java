package colecciones;

public class EjemploComparable implements Comparable<EjemploComparable> {
    private String nombre;

    public EjemploComparable(String nombre){
        this.nombre = nombre;
    }

    @Override
    public int compareTo(EjemploComparable otro) {
        return this.nombre.compareTo(otro.nombre);
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
