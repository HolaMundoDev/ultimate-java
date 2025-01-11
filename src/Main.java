import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");
        Byte valor = scanner.nextByte();
        System.out.println("Tu edad es:");
        System.out.println(valor);
    }
}