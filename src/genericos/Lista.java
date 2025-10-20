package genericos;

public class Lista<T extends Atendible & Comparable> {
    private T[] data = (T[]) new Object[50];
    private int length = 0;

    public Lista<T> add(T t){
        data[length++] = t;

        return this;
    }

    public T get(int index){
        return data[index];
    }
}
