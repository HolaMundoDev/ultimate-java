import genericos.Garzon;
import genericos.Lista;
import genericos.Pairs;

public class Main {
    public static void main(String[] args) {
        Lista<Garzon> lista = new Lista<>();
        lista
            .add(new Garzon())
            .add(new Garzon());

        Garzon elemento = lista.get(1);

        Pairs<Integer, String> p = new Pairs<>(1, "Chanchito feliz");
        var key = p.getKey();
        var value = p.getValue();
    }
}