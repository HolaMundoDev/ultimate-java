package lambda;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
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

        Function<Integer, Double> mitad = x -> x / 2.0;
        Function<Double, Double> aumenta = x -> x + 2;

        var y = mitad
//                .andThen(aumenta)
                .andThen(x -> x + 2)
                .andThen(x -> x * 5)
                .apply(10);

        y = mitad
                .compose((Integer x) -> x + 2)
                .compose((Integer x) -> x * 5)
                .apply(10);

        System.out.println(y);

        Predicate<String> masDeTres = x -> x.length() > 3;
        var resultado = masDeTres.test("chanchitofeliz");
        System.out.println("resultado = " + resultado);

        List<String> miLista = new ArrayList<>();
        Collections.addAll(miLista,"Felipe", "Chanchito", "ac");
        var filtrado = miLista.stream().filter(masDeTres);
        System.out.println("filtrado = " + filtrado.toList());
    }

    public static void push(Notificable n){
        n.push("Chanchito feliz");
    }

    public static void sendPush(String id){
        System.out.println("Enviando notificación push " + id);
    }
}
