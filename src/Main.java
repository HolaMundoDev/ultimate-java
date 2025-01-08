import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.abs(-15));
        System.out.println(Math.ceil(10.0001));
        System.out.println(Math.floor(10.9999));

        System.out.println(Math.max(15, 25));
        System.out.println(Math.min(15, 25));

        System.out.println(Math.round(15.5));

        double random = Math.random();
        System.out.println((int)(random * 100));
    }
}