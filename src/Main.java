import excepciones.Demo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Demo.verificarEdad(-1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}