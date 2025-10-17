import recursos.Base;
import recursos.Categorias;
import recursos.Productos;

public class Main {
    public static void main(String[] args) {
        Categorias c = new Categorias();
        Productos p = new Productos();

        Base b = new Base();
        Base b2 = new Base();
        b.equals(b2);
        System.out.println(b.toString());
    }
}