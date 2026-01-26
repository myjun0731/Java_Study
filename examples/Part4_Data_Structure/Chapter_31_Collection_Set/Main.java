import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Ava");
        names.add("Ava");
        names.add("Ben");

        Set<String> sortedNames = new TreeSet<>(names);

        System.out.println("HashSet (no duplicates): " + names);
        System.out.println("TreeSet (sorted): " + sortedNames);
    }
}
