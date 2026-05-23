import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = List.of(
            new Order("Ava", "BOOK", 12_000),
            new Order("Ben", "BOOK", 15_000),
            new Order("Ava", "FOOD", 8_000),
            new Order("Cora", "FOOD", 11_000),
            new Order("Ava", "TECH", 230_000),
            new Order("Ben", "TECH", 99_000)
        );

        int total = orders.stream().mapToInt(Order::amount).sum();
        System.out.println("total : " + total);

        Map<String, Integer> byUser = orders.stream()
            .collect(Collectors.groupingBy(Order::user, Collectors.summingInt(Order::amount)));
        System.out.println("byUser   : " + byUser);

        Map<String, Long> countByCat = orders.stream()
            .collect(Collectors.groupingBy(Order::category, Collectors.counting()));
        System.out.println("count/cat: " + countByCat);

        Map<Boolean, List<Order>> partitioned = orders.stream()
            .collect(Collectors.partitioningBy(o -> o.amount() >= 50_000));
        System.out.println("big     : " + partitioned.get(true).size());
        System.out.println("small   : " + partitioned.get(false).size());

        String joined = orders.stream()
            .map(Order::user)
            .distinct()
            .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("users   : " + joined);

        Order maxOrder = orders.stream()
            .max((a, b) -> Integer.compare(a.amount(), b.amount()))
            .orElseThrow();
        System.out.println("max     : " + maxOrder);
    }
}
