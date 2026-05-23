public class Main {
    public static void main(String[] args) {
        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("a > b : " + (a > b));
        System.out.println("a == b: " + (a == b));

        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x    : " + !x);

        int score = 75;
        String grade = (score >= 60) ? "PASS" : "FAIL";
        System.out.println("grade : " + grade);

        System.out.println("5 & 3 = " + (5 & 3));
        System.out.println("5 | 3 = " + (5 | 3));
        System.out.println("5 ^ 3 = " + (5 ^ 3));
        System.out.println("1 << 3 = " + (1 << 3));
    }
}
