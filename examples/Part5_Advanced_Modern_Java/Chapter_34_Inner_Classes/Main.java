public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer("OUTER");

        Outer.Inner inner = outer.new Inner();
        inner.show();

        Outer.Nested nested = new Outer.Nested();
        nested.show();

        outer.runLocal();

        Runnable anon = new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymous run");
            }
        };
        anon.run();

        Runnable lambda = () -> System.out.println("lambda run");
        lambda.run();
    }
}
