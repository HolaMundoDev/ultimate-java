public class Main {
    public static void main(String[] args) {
        User user = new User("Nicolas");
        User user2 = new User("Felipe");

        user.saludar();
        user2.saludar();

//        user.tableName = "Chanchito feliz";
//        System.out.println(user2.tableName);

        System.out.println(User.tableName);
    }
}