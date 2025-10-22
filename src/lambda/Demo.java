package lambda;

public class Demo {
    private static String texto = "Imprimiendo de lambda: ";
//    private String texto = "Imprimiendo de lambda: ";
    private static Notificable lambda = message ->
        System.out.println(texto + message);

    public static void run(){
//        var texto = "Imprimiendo de lambda: ";
//        Notificable lambda = message ->
//            System.out.println(texto + message);
//        ;

//        Notificable lambda = message -> {
//                var texto = "Imprimiendo de lambda: ";
//                System.out.println(texto + message);
//        };
        push(lambda);
    }

    public static void push(Notificable n){
        n.push("Chanchito feliz");
    }
}
