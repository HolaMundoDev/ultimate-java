package streams;

import java.util.List;

public class Reducers {
        public static void run(){
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
                    .max((a,b) -> a.compareTo(b));

            y.get();
        }
    }
}
