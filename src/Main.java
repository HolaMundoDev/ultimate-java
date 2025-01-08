import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale locale = Locale.forLanguageTag("es-CL");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String result = numberFormat.format(1099.90);
        System.out.println(result);

        NumberFormat porcentaje = NumberFormat.getPercentInstance();
        System.out.println(porcentaje.format(0.15));
    }
}