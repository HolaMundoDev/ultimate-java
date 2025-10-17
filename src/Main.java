import recursos.Base;
import recursos.Categorias;

public class Main {
    public static void main(String[] args) {
        Categorias c = new Categorias("Telefónos");
        System.out.println(c.miMetodo());
    }

}