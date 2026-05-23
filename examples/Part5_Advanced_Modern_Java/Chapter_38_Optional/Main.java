import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> present = Optional.of("Hello");
        Optional<String> empty = Optional.empty();
        Optional<String> nullable = Optional.ofNullable(null);

        System.out.println("isPresent : " + present.isPresent());
        System.out.println("isEmpty   : " + empty.isEmpty());
        System.out.println("orElse    : " + nullable.orElse("DEFAULT"));
        System.out.println("orElseGet : " + empty.orElseGet(() -> "lazy"));

        present.ifPresent(v -> System.out.println("got       : " + v));

        String mapped = present
            .map(String::toUpperCase)
            .filter(s -> s.length() > 3)
            .orElse("too short");
        System.out.println("chained   : " + mapped);

        System.out.println("findUser(1): " + findUser(1).map(User::name).orElse("none"));
        System.out.println("findUser(9): " + findUser(9).map(User::name).orElse("none"));

        try {
            empty.orElseThrow(() -> new IllegalStateException("missing!"));
        } catch (IllegalStateException e) {
            System.out.println("throw     : " + e.getMessage());
        }
    }

    static Optional<User> findUser(int id) {
        if (id == 1) return Optional.of(new User("Ava"));
        return Optional.empty();
    }
}
