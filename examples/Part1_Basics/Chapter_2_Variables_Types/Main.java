public class Main {
    public static void main(String[] args) {
        byte b = 127;
        short s = 32_000;
        int i = 1_000_000;
        long l = 9_000_000_000L;

        float f = 3.14f;
        double d = 3.141592653589793;

        char c = 'A';
        boolean flag = true;

        int fromDouble = (int) 9.7;
        double toDouble = i;

        var name = "Alice";
        var age = 25;

        System.out.println(b + " " + s + " " + i + " " + l);
        System.out.println(f + " " + d);
        System.out.println(c + " " + flag);
        System.out.println("cast: " + fromDouble + " / " + toDouble);
        System.out.println(name + " (" + age + ")");
    }
}
