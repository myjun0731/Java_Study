import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator mul = (a, b) -> a * b;
        System.out.println("3 + 4 = " + add.apply(3, 4));
        System.out.println("3 * 4 = " + mul.apply(3, 4));

        Function<Integer, Integer> square = x -> x * x;
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Consumer<String> printer = s -> System.out.println(">> " + s);
        Supplier<String> hello = () -> "hello";
        BiFunction<Integer, Integer, Integer> max = Math::max;

        System.out.println("square(5)   : " + square.apply(5));
        System.out.println("isEven(7)   : " + isEven.test(7));
        printer.accept(hello.get());
        System.out.println("max(3, 8)   : " + max.apply(3, 8));

        List<String> names = Arrays.asList("Cora", "Ava", "Ben");
        names.sort((a, b) -> a.compareToIgnoreCase(b));
        names.forEach(printer);
    }
}
