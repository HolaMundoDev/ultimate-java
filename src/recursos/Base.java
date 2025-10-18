package recursos;

public abstract class Base {
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

    public abstract void guardar();
}
