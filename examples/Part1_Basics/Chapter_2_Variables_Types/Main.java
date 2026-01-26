public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int age = 25;
        double height = 175.5;
        char grade = 'A';
        boolean isStudent = true;

        int roundedHeight = (int) height; // type casting

        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " (rounded: " + roundedHeight + ")");
        System.out.println("Grade: " + grade + ", Student: " + isStudent);
    }
}
