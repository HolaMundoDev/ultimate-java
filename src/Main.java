import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int resultado = suma(12, 25, 45);
        int resultado2 = suma(1,2);
        System.out.println(resultado);

        String texto = suma();
    }
    static int suma(int a, int b){
        return a + b;
    }

    static int suma(int a, int b, int c){
        return a + b + c;
    }

    static  String suma(){
        return "Hola mundo";
    }
}