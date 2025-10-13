public class Main {
    public static void main(String[] args) {
        User user = new User("Nicolas");

        user.saludar();

        User.guardar(user);
    }
}