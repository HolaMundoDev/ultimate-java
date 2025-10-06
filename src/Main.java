import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r = suma(1, 2);
        int c = 25;
        System.out.println(r);
    }

    static int suma(int a, int b){
//        System.out.println(c); // Error
//        lala(); Error
        return a + b;
    }

    static void lala(){
        suma(1,2);
    }
}