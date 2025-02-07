import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();

        if(numero % 2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }


        if (numero % 3 == 0 && numero % 4 == 0){
            System.out.println("El número es divisible por 3 y por 4");
        } else if (numero % 3 == 0){
            System.out.println("El número es divisible por 3");
        } else if (numero % 4 == 0) {
            System.out.println("El número es divisible por 4");
        }
    }
}