package recursos;

public class Base {
    String name;

    public Base(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String miMetodo(){
        return "Hola mundo";
    }

    public void guardar(){
    }
}
