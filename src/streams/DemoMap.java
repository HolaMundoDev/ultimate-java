package streams;

import java.util.List;
import java.util.stream.Stream;

public class DemoMap {
    public static void run(){
        List<User> users = List.of(
                new User(14, "chanchito@holamundo.io"),
                new User(10, "felipe@holamundo.io"),
                new User(22, "gabriel@holamundo.io")
        );

        users.stream()
                .map(u -> u.email )
                .map(email -> email + " activo")
                .forEach(email -> System.out.println(email));
    }

    public static void flatmap(){
        var stream = Stream.of(List.of(1,2,3), List.of(4,5));
        stream.flatMap(l -> l.stream())
                .forEach(i -> System.out.println(i));
    }
}
