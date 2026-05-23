import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<String> sb = new Box<>("Hello");
        Box<Integer> ib = new Box<>(42);
        System.out.println(sb.get() + " / " + ib.get());

        Pair<String, Integer> age = new Pair<>("Ava", 28);
        System.out.println(age.first() + " is " + age.second());

        System.out.println("identity: " + Box.identity(3.14));

        List<Integer> ints = List.of(1, 2, 3, 4, 5);
        List<Double> doubles = List.of(1.5, 2.5, 3.5);
        System.out.println("sum ints    : " + sumOfNumbers(ints));
        System.out.println("sum doubles : " + sumOfNumbers(doubles));
    }

    static double sumOfNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) sum += n.doubleValue();
        return sum;
    }
}
