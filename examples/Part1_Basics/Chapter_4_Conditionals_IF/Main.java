public class Main {
    public static void main(String[] args) {
        int score = 82;

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }

        System.out.println(classify(15));
        System.out.println(classify(0));
        System.out.println(classify(-7));
    }

    static String classify(int n) {
        if (n > 0) return "positive";
        if (n < 0) return "negative";
        return "zero";
    }
}
