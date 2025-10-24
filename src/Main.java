import streams.Collector;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        Collector.grouping();
        IntStream.rangeClosed(1,5).forEach(System.out::println);
    }
}