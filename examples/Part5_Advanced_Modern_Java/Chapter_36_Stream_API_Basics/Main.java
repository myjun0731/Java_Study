import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ava", "Ben", "Cora", "Dan");

        List<String> filtered = names.stream()
            .filter(name -> name.startsWith("C"))
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        System.out.println("Filtered: " + filtered);
    }
}
