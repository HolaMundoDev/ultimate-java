class User {
    static String tableName = "user";
    double id = Math.random();
    String name;
    private int edad;

    User(String name, int edad){
        this.name = name;
        this.edad = edad;
    }
    public int saludar(){
        System.out.println("Hola mundo! soy " + tableName);
        System.out.println(this.edad);

        int edad = this.metodoPrivado();

        return edad;
    }

    private int metodoPrivado(){
        System.out.println("Procesando datos...");
        return this.edad;
    }
}