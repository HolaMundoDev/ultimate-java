package streams;

import java.util.List;

public class Demo {
    public static void run() {
        List<User> users = List.of(
                new User(14),
                new User(10),
                new User(22)
        );

        int count = 0;
        for(User user: users){
            if(user.age < 18){
                count++;
            }
        }

        var cantidad = users.stream()
                .filter(user -> user.age < 18)
                .count();

        System.out.println("cantidad = " + cantidad);
    }
}
