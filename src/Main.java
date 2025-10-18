import recursos.Base;
import recursos.Categorias;

public class Main {
    public static void main(String[] args) {
        Categorias c = new Categorias("Telefónos");
        Categorias c2 = new Categorias("Telefónos");
        System.out.println(c.equals(c2));
//        Base base = new Base("Base");
//
//        miMetodo(c);
    }

    public static void miMetodo(Base base){
        if (base instanceof Categorias){
            var c = (Categorias)base;
            c.metodoCategoria();
        }

        System.out.println(base.getName());
    }
}