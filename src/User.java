class User {
    static String tableName = "user";
    double id = Math.random();
    String name;

    private String password = "123456";

    User(String name){
        this.name = name;
    }

    public void login(){
        System.out.println("LLamando a base de datos");
    }

    private void validatePassword(){
        System.out.println("Verificar contraseña");
    }
}