import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Cora");
        names.add("Ava");
        names.add("Ben");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterating: " + iterator.next());
        }

        names.sort(Comparator.naturalOrder());
        System.out.println("Sorted: " + names);
    }
}
