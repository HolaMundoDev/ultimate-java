package lambda;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo {
    private static String texto = "Imprimiendo de lambda: ";
    private static Notificable lambda = message ->
        System.out.println(texto + message);

    public Demo(String message){}
    public static void metodo(String message){

    }
    public void metodoInstancia(String message){}

    public static void run(){
        push(lambda);

        push(message -> metodo(message));

        push(Demo::metodo);
        push(System.out::println);

        Demo demo = new Demo("mi mensaje");
        push(demo::metodoInstancia);
        push(Demo::new);
    }

    public static void incluidas(){
        List<String> l = List.of("Hola", "Mundo");

//        l.forEach(Demo::sendPush);

        Consumer<String> notify = el -> System.out.println("Enviando a: " + el);
        Consumer<String> store = el -> System.out.println("Guardando: " + el);

        l.forEach(notify.andThen(store));

//        Supplier<LocalDate> ahora = () -> LocalDate.now();
        Supplier<LocalDate> ahora = LocalDate::now;
        LocalDate ahora2 = LocalDate.now();

        System.out.println(ahora.get());
    }

    public static void push(Notificable n){
        n.push("Chanchito feliz");
    }

    public static void sendPush(String id){
        System.out.println("Enviando notificación push " + id);
    }
}
