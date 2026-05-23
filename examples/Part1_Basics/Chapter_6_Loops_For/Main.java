public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1..100 sum = " + sum);

        int[] scores = {88, 92, 75, 60, 100};
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        System.out.println("avg = " + (total / scores.length));

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
