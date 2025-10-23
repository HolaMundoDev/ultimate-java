package streams;

import java.util.List;
import java.util.Optional;

public class Reducers {
        public static void run() {
            List<User> users = List.of(
                    new User(14, "chanchito@holamundo.io"),
                    new User(14, "chanchito@holamundo.io"),
                    new User(10, "felipe@holamundo.io"),
                    new User(22, "gabriel@holamundo.io")
            );

            var y = users.stream()
                    .map(x -> x.email)
//                    .count()
//                    .allMatch(x -> )
//                    .noneMatch(x ->)
//                    .anyMatch(x -> x.length() > 3)
//                    .findFirst()
//                    .findAny()
//                    .min((a,b) -> a.compareTo(b))
                    .max((a, b) -> a.compareTo(b));

            y.get();
        }

        public static void comun(){
            List<User> users = List.of(
                    new User(14, "chanchito@holamundo.io"),
                    new User(14, "chanchito@holamundo.io"),
                    new User(10, "felipe@holamundo.io"),
                    new User(22, "gabriel@holamundo.io")
            );

//                Optional<String> emails = users.stream()
//                        .limit(2)
//                        .map(x -> x.email)
//                        .reduce((acc, el) -> acc + ", " + el);
//
//                var valor = emails.orElse("No hay correos...")
//                valor + "..."

        var ages = users.stream()
                .map(x -> x.age)
                .reduce(0, (acc, el) -> acc + el );

            System.out.println("ages/users.stream().count() = " + ages/users.stream().count());
    }
}

