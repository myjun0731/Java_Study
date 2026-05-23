public class Main {
    public static void main(String[] args) {
        try {
            int r = divide(10, 0);
            System.out.println("r=" + r);
        } catch (ArithmeticException e) {
            System.out.println("arithmetic: " + e.getMessage());
        } finally {
            System.out.println("finally always runs");
        }

        try {
            parse("abc");
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("multi-catch: " + e.getClass().getSimpleName());
        }

        try {
            risky();
        } catch (Exception e) {
            System.out.println("caught: " + e.getMessage());
        }
    }

    static int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("divide by zero");
        return a / b;
    }

    static int parse(String s) {
        return Integer.parseInt(s);
    }

    static void risky() throws Exception {
        throw new Exception("something bad");
    }
}
