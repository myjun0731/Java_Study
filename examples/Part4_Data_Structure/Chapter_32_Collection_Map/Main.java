import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Ava", 90);
        scores.put("Ben", 85);

        Map<String, Integer> sortedScores = new TreeMap<>(scores);

        System.out.println("HashMap: " + scores);
        System.out.println("TreeMap: " + sortedScores);
    }
}
