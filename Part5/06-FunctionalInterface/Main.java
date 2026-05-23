import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Function<Integer, Integer> square = n -> n * n;

        numbers.stream()
                .filter(isEven)
                .map(square)
                .forEach(n -> System.out.println("제곱 결과: " + n));
    }
}
