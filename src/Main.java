import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("salir")) {
            System.out.println("Ingresa comando: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        System.out.println("Termino el loop.");
    }
}