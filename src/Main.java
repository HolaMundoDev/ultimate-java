import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        miMetodo("Nicolas", 25);
        miMetodo("Chanchito feliz", 30);
    }

    static void miMetodo(String nombre, int edad){
        System.out.println("Hola " + nombre + ", tu edad es: " + edad);
    }
}
