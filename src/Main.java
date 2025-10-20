import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var numerosEnString = new String[]{"1", "2"};
        var textos = new ArrayList<String>();
        textos.addAll(Arrays.asList(numerosEnString));
        textos.add("Chanchito Feliz");
        textos.add("Felipe");
//        textos.add(1);
        var primer = textos.getFirst();
        var ultimo = textos.getLast();

        var el = textos.get(0);

        System.out.println("textos = " + textos);
        System.out.println("ultimo = " + ultimo);
        System.out.println("primer = " + primer);
    }
}