package genericos;

public class Lista<T extends Atendible & Comparable> {
    private T[] data = (T[]) new Object[50];
    private int length = 0;

    public void add(T t){
//        t.atender();
//        t.compareTo()
        data[length++] = t;
    }

    public T get(int index){
        return data[index];
    }
}
