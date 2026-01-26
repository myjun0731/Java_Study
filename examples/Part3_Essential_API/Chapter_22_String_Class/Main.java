public class Main {
    public static void main(String[] args) {
        String greeting = "Hello";
        String extended = greeting.concat(", Java");

        System.out.println("Original: " + greeting);
        System.out.println("Extended: " + extended);

        System.out.println("Length: " + extended.length());
        System.out.println("Upper: " + extended.toUpperCase());
        System.out.println("Contains 'Java'? " + extended.contains("Java"));
    }
}
