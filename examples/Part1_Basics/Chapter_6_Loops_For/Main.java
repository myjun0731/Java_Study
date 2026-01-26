public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        int[] scores = {90, 85, 88};
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        System.out.println("Total score: " + total);
    }
}
