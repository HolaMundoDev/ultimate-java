import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a = 2 + 2;
        int b = 2 - 2;
        int c = 3 * 3;
        int m = 4 % 3;
//        double d = 10.0 / 3.0; // 3.3333333333333335
        float d = 10.0f / 3.0f; // 3.3333333

        int x = 5;
//        int y = x++;

//        x = x + 5;
        x += 5; // Es lo mismo que la linea anterior

        // x++ suma 1 a x, lo muestra en sout y luego lo suma
        // ++x suma 1 a x, le suma 1 y lo muestra sout

        System.out.println(x);
//        System.out.println(y);
    }
}