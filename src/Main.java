import recursos.Garzon;
import recursos.Restaurante;

public class Main {
    public static void main(String[] args) {
        Restaurante r = new Restaurante();

        Garzon g1 = new Garzon();
        Garzon g2 = new Garzon();
        Garzon g3 = new Garzon();

        r.llevarCervezas(new Garzon[]{g1,g2,g3});
    }
}