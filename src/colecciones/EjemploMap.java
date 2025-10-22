package colecciones;

import java.util.ArrayList;
import java.util.List;

public class EjemploMap {
    public static run(){
        List<User> users = new ArrayList<>();

        for(var user : users){
            if(user.getEmail().equals("chanchito@feliz.com")){
                System.out.println(user);
            }
        }
    }
}
