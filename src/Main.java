import genericos.Lista;

public class Main {
    public static void main(String[] args) {
        Lista<Float> lista = new Lista<>();
        lista.add(12f);
        lista.add(32f);

        float elemento = lista.get(1);
    }
}