public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 33, 47, 52, 68, 79, 81, 94, 100};
        int sum = 0;
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            if (number > max) {
                max = number;
            }
        }

        System.out.println("합계: " + sum);
        System.out.println("최대값: " + max);
    }
}
