package lambda;

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

    public static void push(Notificable n){
        n.push("Chanchito feliz");
    }
}
