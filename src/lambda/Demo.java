package lambda;

public class Demo {
    public static void run(){
        push(new Notificable() {
            @Override
            public void push(String message) {
                System.out.println("Enviando desde clase anónima: " + message);
            }
        });

        push(message ->
            System.out.println("Imprimiendo de lambda " + message)
        );
    }

    public static void push(Notificable n){
        n.push("Chanchito feliz");
    }
}
