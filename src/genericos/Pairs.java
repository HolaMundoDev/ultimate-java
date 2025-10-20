package genericos;

public class Pairs<T, U> {
    private T key;
    private U value;

    public Pairs(T key, U value){
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return this.key;
    }

    public U getValue() {
        return this.value;
    }
}
