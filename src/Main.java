import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Conversión implícita.
        byte a = 1;
        double b = 15.15;
        double c = a + b;
        System.out.println(c);

        // Conversión explícita.
        int x = 15;
        double y = 15.015;
        // int z = x + (int)y;
         int z = (int)(x + y);
        System.out.println(z);

        String j = "1.1";
        int k = 5;
        double l = Double.parseDouble(j) + k;
        System.out.println(l);
    }
}