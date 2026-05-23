public class Counter {
    private static int totalCount = 0;
    private int value;

    public Counter() {
        this.value = 0;
        totalCount++;
    }

    public void increment() {
        int step = 1;
        value += step;
    }

    public void print() {
        System.out.println("value = " + value);
    }

    public static int created() {
        return totalCount;
    }
}
