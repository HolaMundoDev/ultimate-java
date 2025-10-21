import excepciones.Demo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Demo.start();
        } catch (IOException e) {
            System.out.println("Ocurrio un error " + e.getMessage());
        }
    }
}