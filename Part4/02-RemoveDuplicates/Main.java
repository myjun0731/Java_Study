import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 20, 40, 50};
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        System.out.println("중복 제거 결과: " + uniqueNumbers);
    }
}
