public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello");
        builder.append(", ").append("Java");

        StringBuffer buffer = new StringBuffer("Thread-safe");
        buffer.append(" buffer");

        System.out.println(builder.toString());
        System.out.println(buffer.toString());
    }
}
