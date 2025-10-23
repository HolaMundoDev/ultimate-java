package streams;

import java.util.List;

public class Duplicates {
    public static void run(){
        List<User> users = List.of(
                new User(14, "chanchito@holamundo.io"),
                new User(14, "chanchito@holamundo.io"),
                new User(10, "felipe@holamundo.io"),
                new User(22, "gabriel@holamundo.io")
        );

        users.stream()
                .map(x -> x.email)
                .peek(x -> System.out.println(x))
                .distinct()
                .peek(x -> System.out.println(x))
                .forEach(System.out::println);
    }
}
