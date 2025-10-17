package recursos;

public class Categorias extends Base {
    public Categorias(String name){
        super(name);
        System.out.println("Soy categorias");
    }
    public String toString(){
        return this.name;
    }

    public String miMetodo(){
        String saludo = super.miMetodo();
        return "Chao mundo " + saludo;
    }
}
