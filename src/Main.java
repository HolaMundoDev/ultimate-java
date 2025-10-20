import genericos.Lista;

public class Main {
    public static void main(String[] args) {
//        Lista<String> lista = new Lista<>();
//        lista.add("Hola mundo");
//        lista.add("Felipe");
        Lista<Integer> lista = new Lista<>();
        lista.add(12);
        lista.add(32);

        var elemento = lista.get(1);
    }
}