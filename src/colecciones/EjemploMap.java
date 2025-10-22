package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EjemploMap {
    public static void run(){
        List<User> users = new ArrayList<>();

        for(var user : users){
            if(user.getEmail().equals("chanchito@feliz.com")){
                System.out.println(user);
            }
        }
    }

    public static void map(){
        User u1 = new User("Felipe", "felipe@holamundo.io");
        User u2 = new User("Chanchito", "chanchito@holamundo.io");

        Map<String, User> users = new HashMap<>();
        users.put(u1.getEmail(), u1);
        users.put(u2.getEmail(), u2);

        User anonymous = new User("Anonymous", "");
        System.out.println(users.get(u1.getEmail()));
        System.out.println(users.getOrDefault("chanchittofeliz", anonymous));
        System.out.println(users.containsKey("chanchito@holamundo.io"));

        users.replace("felipe@holamundo.io", new User("Chanchito triste", "felipe@holamundo.io"));
        System.out.println(users.get("felipe@holamundo.io"));

//        for(var user: users.keySet()){
//            System.out.println(user);
//        }

//        for(var user: users.entrySet()){
//            System.out.println(user);
//        }

        for(var user: users.values()){
            System.out.println(user);
        }
    }
}
