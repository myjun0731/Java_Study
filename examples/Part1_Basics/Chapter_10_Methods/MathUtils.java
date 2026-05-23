public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int... values) {
        int sum = 0;
        for (int v : values) sum += v;
        return sum;
    }

    public static void printAll(String... items) {
        for (String s : items) System.out.print(s + " ");
        System.out.println();
    }

    public static int[] minMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int v : arr) {
            if (v < min) min = v;
            if (v > max) max = v;
        }
        return new int[]{min, max};
    }
}
