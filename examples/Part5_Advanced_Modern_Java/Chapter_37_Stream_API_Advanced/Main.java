import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ava", "Ben", "Cora", "Chris", "Bella");

        Map<Character, Long> grouped = names.stream()
            .collect(Collectors.groupingBy(name -> name.charAt(0), Collectors.counting()));

        int totalLength = names.stream()
            .map(String::length)
            .reduce(0, Integer::sum);

        System.out.println("Grouped counts: " + grouped);
        System.out.println("Total length: " + totalLength);
    }
}
