import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Banana", "Avocado", "Cherry", "Apricot");
        words.stream()
                .filter(word -> word.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
