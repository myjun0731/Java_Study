public class Main {
    public static void main(String[] args) {
        Counter a = new Counter();
        Counter b = new Counter();
        Counter c = new Counter();

        a.increment();
        a.increment();
        b.increment();

        a.print();
        b.print();
        c.print();
        System.out.println("created: " + Counter.created());
    }
}
