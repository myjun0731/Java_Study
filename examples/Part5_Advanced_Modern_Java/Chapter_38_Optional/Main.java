import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String name = null;
        Optional<String> optionalName = Optional.ofNullable(name);

        String result = optionalName
            .map(String::toUpperCase)
            .orElse("DEFAULT");

        System.out.println("Result: " + result);
    }
}
