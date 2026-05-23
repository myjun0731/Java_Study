public class Main {
    public static void main(String[] args) {
        System.out.println("add(3, 4) = " + MathUtils.add(3, 4));
        System.out.println("add(1.5, 2.5) = " + MathUtils.add(1.5, 2.5));
        System.out.println("add(1,2,3,4,5) = " + MathUtils.add(1, 2, 3, 4, 5));

        MathUtils.printAll("a", "b", "c");

        int[] result = MathUtils.minMax(new int[]{3, 9, 1, 7, 5});
        System.out.println("min=" + result[0] + ", max=" + result[1]);
    }
}
