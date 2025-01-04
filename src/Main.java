import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][][] numeros = new int[3][2][2];
        numeros[0][0][0] = 5;
        System.out.println(Arrays.deepToString(numeros));
    }
}