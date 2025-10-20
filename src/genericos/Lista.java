package genericos;

public class Lista<T> {
    private T[] data = (T[]) new Object[50];
    private int length = 0;

    public void add(T t){
        data[length++] = t;
    }

    public T get(int index){
        return data[index];
    }
}
