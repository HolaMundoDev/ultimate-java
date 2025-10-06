import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r = suma(new int[] {1,2,3,4,5});
        System.out.println(r);
    }

    static int suma(int[] numeros){
        int resultado = 0;
        for(int numero: numeros){
            resultado += numero;
        }

        return resultado;
    }
}