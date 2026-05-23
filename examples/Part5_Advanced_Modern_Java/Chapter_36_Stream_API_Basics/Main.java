import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ava", "Ben", "Cora", "Chris", "Bella");

        List<String> upper = names.stream()
            .filter(n -> n.startsWith("C"))
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        System.out.println("upper: " + upper);

        long count = names.stream().filter(n -> n.length() > 3).count();
        System.out.println("len>3: " + count);

        List<Integer> doubled = Stream.of(1, 2, 3, 4, 5)
            .map(i -> i * 2)
            .collect(Collectors.toList());
        System.out.println("x2   : " + doubled);

        int sum = IntStream.rangeClosed(1, 10).sum();
        double avg = IntStream.rangeClosed(1, 10).average().orElse(0);
        System.out.println("sum  : " + sum + ", avg: " + avg);

        List<String> sorted = names.stream()
            .sorted()
            .distinct()
            .collect(Collectors.toList());
        System.out.println("sort : " + sorted);
    }
}
