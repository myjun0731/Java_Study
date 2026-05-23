import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("Java");
        arr.add("Kotlin");
        arr.add("Scala");
        arr.add(1, "Groovy");
        System.out.println("ArrayList : " + arr);
        System.out.println("get(2)    : " + arr.get(2));
        System.out.println("size      : " + arr.size());

        arr.remove("Scala");
        arr.set(0, "JAVA");
        System.out.println("modified  : " + arr);
        System.out.println("contains  : " + arr.contains("JAVA"));
        System.out.println("indexOf   : " + arr.indexOf("Kotlin"));

        List<Integer> linked = new LinkedList<>();
        for (int i = 1; i <= 5; i++) linked.add(i);
        Collections.reverse(linked);
        System.out.println("reversed  : " + linked);

        List<String> immutable = List.of("a", "b", "c");
        System.out.println("immutable : " + immutable);
    }
}
