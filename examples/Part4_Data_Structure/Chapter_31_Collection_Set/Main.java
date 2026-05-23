import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> hash = new HashSet<>();
        hash.add("apple");
        hash.add("banana");
        hash.add("apple");
        hash.add("cherry");
        System.out.println("HashSet       : " + hash + " size=" + hash.size());

        Set<String> linked = new LinkedHashSet<>();
        linked.add("c");
        linked.add("a");
        linked.add("b");
        System.out.println("LinkedHashSet : " + linked);

        Set<Integer> tree = new TreeSet<>();
        tree.add(30);
        tree.add(10);
        tree.add(20);
        tree.add(10);
        System.out.println("TreeSet       : " + tree);

        Set<Integer> a = Set.of(1, 2, 3, 4);
        Set<Integer> b = Set.of(3, 4, 5, 6);
        Set<Integer> intersect = new HashSet<>(a);
        intersect.retainAll(b);
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("intersect : " + intersect);
        System.out.println("union     : " + union);
    }
}
