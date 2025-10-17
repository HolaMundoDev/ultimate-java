import recursos.Base;
import recursos.Categorias;

public class Main {
    public static void main(String[] args) {
        Categorias c = new Categorias("Telefónos");
        Base base = new Base("Base");
//        c.equals()
    }

    public static void miMetodo(Base base){
        if (base instanceof Categorias){
            var c = (Categorias)base;
            c.metodoCategoria();
        }

        System.out.println(base.getName());
    }
}