import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer boxed = 42;
        int unboxed = boxed;
        System.out.println("boxed=" + boxed + ", unboxed=" + unboxed);

        int parsed = Integer.parseInt("1234");
        double pi = Double.parseDouble("3.14");
        System.out.println("parsed=" + parsed + ", pi=" + pi);

        System.out.println("Integer.MAX = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN = " + Integer.MIN_VALUE);
        System.out.println("binary(10)  = " + Integer.toBinaryString(10));
        System.out.println("hex(255)    = " + Integer.toHexString(255));

        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 5; i++) nums.add(i);
        System.out.println("list: " + nums);

        Integer x = 127, y = 127;
        Integer p = 200, q = 200;
        System.out.println("127 == 127: " + (x == y));
        System.out.println("200 == 200: " + (p == q));
        System.out.println("200 equals: " + p.equals(q));
    }
}
