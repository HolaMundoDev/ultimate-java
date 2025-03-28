import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        terminal: while(true){
            System.out.println("Ingresa una opción: ");
            System.out.println("1. Calculadora");
            System.out.println("2. Hackear la nasa");
            System.out.println("3. Salir");

            input = scanner.next().toLowerCase();

            switch (input){
                case "1":
                    System.out.println("Ingrese un número: ");
                    int a = scanner.nextInt();
                    System.out.println("Ingrese segundo número: ");
                    int b = scanner.nextInt();
                    System.out.println("El rusultado es: ");
                    System.out.println(a + b);
                    break;
                case "2":
                    System.out.println("Hackeando la nasa 😎");
                    System.out.println("#");
                    System.out.println("##");
                    System.out.println("###");
                    System.out.println("####");
                    System.out.println("Nasa hackeada, eres hackerman!");
                    break;
                case "3":
                    System.out.println("Chao mundo");
                    break terminal;
            }
        }
    }
}