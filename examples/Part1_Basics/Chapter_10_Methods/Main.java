public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int sum = add(4, 6);
        System.out.println("Sum: " + sum);

        greet("Ava");
        greet("Ben", 2);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    static void greet(String name, int times) {
        for (int i = 0; i < times; i++) {
            greet(name);
        }
    }
}
