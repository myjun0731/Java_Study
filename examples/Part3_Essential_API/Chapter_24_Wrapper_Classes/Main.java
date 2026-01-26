public class Main {
    public static void main(String[] args) {
        Integer boxed = 10; // auto-boxing
        int unboxed = boxed; // auto-unboxing

        Double pi = Double.valueOf(3.14159);
        System.out.println("Boxed int: " + boxed);
        System.out.println("Unboxed int: " + unboxed);
        System.out.println("Double value: " + pi);
    }
}
