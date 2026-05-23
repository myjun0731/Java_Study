public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(", ");
        sb.append("Java");
        sb.insert(0, ">> ");
        sb.reverse();
        System.out.println("reversed: " + sb);
        sb.reverse();
        sb.replace(0, 3, "** ");
        System.out.println("replaced: " + sb);
        System.out.println("len     : " + sb.length());

        StringBuffer buf = new StringBuffer("thread-safe");
        buf.append(" buffer");
        System.out.println("buffer  : " + buf);

        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < 5000; i++) s += "x";
        long t1 = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < 5000; i++) b.append("x");
        long t2 = System.nanoTime() - start;

        System.out.println("String + : " + t1 / 1_000_000.0 + " ms");
        System.out.println("Builder  : " + t2 / 1_000_000.0 + " ms");
    }
}
