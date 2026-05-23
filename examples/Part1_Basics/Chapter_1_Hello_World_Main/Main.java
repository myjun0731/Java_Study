public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.print("Java ");
        System.out.print("Study");
        System.out.println();
        System.out.printf("%s v%d%n", "Java", 21);

        if (args.length > 0) {
            System.out.println("First argument: " + args[0]);
        }
    }
}
