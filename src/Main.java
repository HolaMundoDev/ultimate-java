import genericos.Garzon;
import genericos.Lista;

public class Main {
    public static void main(String[] args) {
        Lista<Garzon> lista = new Lista<>();
        lista.add(new Garzon());
        lista.add(new Garzon());

        Garzon elemento = lista.get(1);
    }
}