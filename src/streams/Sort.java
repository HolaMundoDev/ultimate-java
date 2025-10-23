package streams;

import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void run(){
        List<User> users = List.of(
                new User(14, "chanchito@holamundo.io"),
                new User(10, "felipe@holamundo.io"),
                new User(22, "gabriel@holamundo.io")
        );

        users.stream()
//                .sorted((a,b) -> a.email.compareTo(b.email));
                .sorted(Comparator.comparing(a -> a.email))
                .forEach(x -> System.out.println(x));
    }
}
