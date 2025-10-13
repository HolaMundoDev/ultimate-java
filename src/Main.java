public class Main {
    public static void main(String[] args) {
        User user = new User("Nicolas");

        user.login();

        String pass = user.getPassword();
        System.out.println(pass);
        user.setPassword("13134545");
        System.out.println(user.getPassword());

        User user2 = new User("Hola mundo", "chanchito@feliz.com");
    }
}