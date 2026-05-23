import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Ava", 90);
        scores.put("Ben", 85);
        scores.put("Cora", 78);
        scores.put("Ava", 95);

        System.out.println("HashMap    : " + scores);
        System.out.println("get(Ava)   : " + scores.get("Ava"));
        System.out.println("contains Z : " + scores.containsKey("Z"));
        System.out.println("getOrElse  : " + scores.getOrDefault("Z", 0));

        for (Map.Entry<String, Integer> e : scores.entrySet()) {
            System.out.println(" - " + e.getKey() + " -> " + e.getValue());
        }

        Map<String, Integer> linked = new LinkedHashMap<>();
        linked.put("c", 3);
        linked.put("a", 1);
        linked.put("b", 2);
        System.out.println("LinkedHash : " + linked);

        Map<String, Integer> tree = new TreeMap<>(scores);
        System.out.println("TreeMap    : " + tree);

        scores.merge("Ben", 5, Integer::sum);
        System.out.println("after merge: " + scores);
    }
}
