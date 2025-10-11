import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.name = "Nicolas";

        User user2 = new User();
        user2.name = "Felipe";

        System.out.println(user.id);
        System.out.println(user2.id);
    }
}