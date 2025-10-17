import recursos.Base;
import recursos.Categorias;

public class Main {
    public static void main(String[] args) {
        Categorias c = new Categorias("Telefónos");
        Base base = new Base("Base");

        miMetodo(c);
    }

    public static void miMetodo(Base base){
        System.out.println(base.getName());
    }
}