import excepciones.Demo;

public class Main {
    public static void main(String[] args) {
        try {
            Demo.start();
        } catch (Throwable e) {
//            e.printStackTrace();
            var cause = e.getCause();
            cause.printStackTrace();
//            System.out.println("Ocurrio un error " + e.getMessage());
        }
    }
}