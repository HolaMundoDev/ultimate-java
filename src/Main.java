import genericos.Lista;

public class Main {
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>();
        lista.add(12);
        lista.add(32);

        float elemento = lista.get(1);
    }
}