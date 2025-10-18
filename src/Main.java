import recursos.*;

public class Main {
    public static void main(String[] args) {
        Restaurante r = new Restaurante();

        Garzon g1 = new Garzon();
        Garzon g2 = new Garzon();
        Garzon g3 = new Garzon();
        Cocinero c = new Cocinero();

        r.llevarCervezas(new Atendible[]{g1, g2, g3, c});
        Cocinable cs = new Cocinero();
    }
}