class User {
    double id = Math.random();
    String name;

    User(String name){
        this.name = name;
    }
    public void saludar(){
        System.out.println("Hola mundo! soy " + this.name);
    }
}