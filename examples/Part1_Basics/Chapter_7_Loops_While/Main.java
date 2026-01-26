public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int count = 0;
        while (count < 3) {
            System.out.println("While count: " + count);
            count++;
        }

        int number = 0;
        do {
            number++;
            if (number == 2) {
                continue;
            }
            if (number > 4) {
                break;
            }
            System.out.println("Do-while number: " + number);
        } while (number < 5);
    }
}
