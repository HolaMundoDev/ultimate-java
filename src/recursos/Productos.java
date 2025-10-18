package recursos;

public final class Productos extends Base {
    public Productos(String name){
        super(name);
        System.out.println("Soy productos");
    }

    public void guardar(){
        System.out.println("Guardando producto");
    }
}
