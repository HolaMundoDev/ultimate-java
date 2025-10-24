package streams;

import java.util.List;
import java.util.stream.Collectors;

public class Collector {
    public static void  run(){
        List<User> users = List.of(
                new User(14, "chanchito@holamundo.io"),
                new User(10, "felipe@holamundo.io"),
                new User(22, "gabriel@holamundo.io")
        );

        var resultado = users.stream()
//                .map(x -> x.age)
//                .collect(Collectors.joining(", "));
//                .collect(Collectors.summingInt(x -> x));
//                .map(x -> x.age).mapToInt(x -> x).sum();
//                .collect(Collectors.summarizingInt(x -> x));
//                .collect(Collectors.toSet());
                .collect(Collectors.toMap(x-> x.email, x -> x));

        System.out.println("resultado = " + resultado);
    }

    public static void particionado(){
        List<User> users = List.of(
                new User(14, "chanchito@holamundo.io"),
                new User(10, "felipe@holamundo.io"),
                new User(22, "gabriel@holamundo.io")
        );

        var particion = users.stream()
                .collect(Collectors.partitioningBy(x -> x.age > 17));

        System.out.println(particion.get(false));
    }
}
