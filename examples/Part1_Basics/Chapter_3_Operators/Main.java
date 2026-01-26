public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int a = 10;
        int b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        boolean isEqual = (a == b);
        boolean isGreater = (a > b);
        boolean isInRange = (a > 5 && b < 5);

        String result = isGreater ? "a is greater" : "a is not greater";

        System.out.println("a == b? " + isEqual);
        System.out.println("a > b? " + isGreater);
        System.out.println("Is in range? " + isInRange);
        System.out.println(result);
    }
}
