public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.name = "Nicolas";

        User user2 = new User();
        user2.name = "Felipe";
        
        user.saludar();
        user2.saludar();
    }
}