public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        Vehicle ref = c;

        v.run();
        c.run();
        ref.run();

        c.run(120);

        System.out.println("--- parent vs child ---");
        c.callSuperRun();
    }
}
