import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("charlie");
        names.add("alice");
        names.add("bob");
        names.add("alice");
        names.add("david");

        System.out.println("정렬된 이름 목록:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
