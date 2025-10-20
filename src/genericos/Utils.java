package genericos;

public class Utils {
    public static <T extends Number> T max(T a, T b){
        return a.doubleValue() > b.doubleValue() ? a : b;
    }

//    public static <T extends Garzon> Lista<T> sorted(Lista<T> lista){
//        return lista;
//    }

//    public static void sorted(Lista<? extends Garzon> lista){
//        lista.get(0);
//        lista.add(new Garzon(3)); // Error
//    }

    public static void sorted(Lista<? super Garzon> lista){
//        Garzon x = lista.get(0); // Error
        lista.add(new Garzon(3));
    }
}
