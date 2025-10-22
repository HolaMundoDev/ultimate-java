package colecciones;

public class EjemploComparable implements Comparable<EjemploComparable> {
    private String nombre;
    private Integer edad;

    public EjemploComparable(String nombre, Integer edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(EjemploComparable otro) {
        return this.nombre.compareTo(otro.nombre);
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    public Integer getEdad() {
        return this.edad;
    }
}
