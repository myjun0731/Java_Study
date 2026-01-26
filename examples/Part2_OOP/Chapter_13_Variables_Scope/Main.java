public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        counter1.increment();
        counter2.increment();

        System.out.println("Counter1 value: " + counter1.value);
        System.out.println("Counter2 value: " + counter2.value);
        System.out.println("Total counters created: " + Counter.totalCounters);
    }
}

class Counter {
    static int totalCounters = 0; // static (class) variable
    int value = 0; // instance variable

    Counter() {
        totalCounters++;
    }

    void increment() {
        int step = 1; // local variable
        value += step;
    }
}
