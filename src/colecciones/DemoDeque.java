package colecciones;
import java.util.Deque;
import java.util.ArrayDeque;

public class DemoDeque {
    public static void run(){
        Deque<String> q = new ArrayDeque<>();
        q.addFirst("Goku");
        q.addFirst("Vegeta");
        q.addLast("Freezer");
        q.addLast("Cell");

//        System.out.println(q.removeFirst());
//        System.out.println(q.removeLast());

        System.out.println(q.pollFirst());
        System.out.println(q.pollLast());

        System.out.println(q);

    }
}
