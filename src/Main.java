import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Crear una calculadora que reciba
         * 2 números y luego imprima el resultado de la
         * suma de estos dos números
         */
        System.out.println("Esta es una aplicación de calculadora.");
        System.out.println("Ingrese el primer número: ");
        Scanner scanner = new Scanner(System.in);
        int valorA = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int valorB = scanner.nextInt();
        System.out.println("El resultado de la suma es: ");
        System.out.println(valorA + valorB);
    }
}