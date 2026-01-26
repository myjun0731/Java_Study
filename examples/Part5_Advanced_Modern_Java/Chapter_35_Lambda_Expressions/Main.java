import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Running a lambda.");
        task.run();

        List<String> names = Arrays.asList("Cora", "Ava", "Ben");
        names.sort((a, b) -> a.compareToIgnoreCase(b));
        System.out.println("Sorted: " + names);
    }
}
