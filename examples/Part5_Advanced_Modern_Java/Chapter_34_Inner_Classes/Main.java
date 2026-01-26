public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer("OuterValue");
        Outer.Inner inner = outer.new Inner();
        inner.show();

        Outer.StaticNested nested = new Outer.StaticNested();
        nested.show();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous inner class running.");
            }
        };
        runnable.run();
    }
}

class Outer {
    private final String name;

    Outer(String name) {
        this.name = name;
    }

    class Inner {
        void show() {
            System.out.println("Inner sees: " + name);
        }
    }

    static class StaticNested {
        void show() {
            System.out.println("Static nested class.");
        }
    }
}
