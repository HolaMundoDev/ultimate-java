class User {
    static String tableName = "user";
    double id = Math.random();
    String name;

    private String password = "15&^%@#(aoeu";

    User(String name){
        this.name = name;
    }

    public void login(){
        System.out.println("LLamando a base de datos");
    }

    private void validatePassword(){
        System.out.println("Verificar contraseña");
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        System.out.println("Encriptando clave");
        String encryptedPassword = password;
        this.password = encryptedPassword;
    }
}