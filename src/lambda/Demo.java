package lambda;

import java.util.List;

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

//        l.forEach(el -> System.out.println(el));
//        l.forEach(System.out::println);
        l.forEach(Demo::sendPush);
    }

    public static void push(Notificable n){
        n.push("Chanchito feliz");
    }

    public static void sendPush(String id){
        System.out.println("Enviando notificación push " + id);
    }
}
