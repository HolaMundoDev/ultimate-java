package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Creacion {
    public static void creacion(){
        ArrayList<Integer> al = new ArrayList<>();
//        al.stream().
        int[] xs = {1,2,3};
//        Arrays.stream(xs).
//        Stream.of(1,2,3);
        var s = Stream.iterate(0, x -> x + 1);
//        s.limit(5).forEach(x -> System.out.println(x));

        Stream.generate(() -> (int) (Math.random() * 100))
                .limit(5)
                .forEach(x -> System.out.println(x));
    }
}
