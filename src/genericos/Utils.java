package genericos;

public class Utils {
    public static <T extends Number> T max(T a, T b){
        return a.doubleValue() > b.doubleValue() ? a : b;
    }
}
