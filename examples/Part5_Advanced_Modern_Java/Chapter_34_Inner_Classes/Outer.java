public class Outer {
    private final String name;

    public Outer(String name) {
        this.name = name;
    }

    public class Inner {
        public void show() {
            System.out.println("inner sees: " + name);
        }
    }

    public static class Nested {
        public void show() {
            System.out.println("static nested");
        }
    }

    public void runLocal() {
        class LocalGreeter {
            void hi() {
                System.out.println("local hi from " + name);
            }
        }
        new LocalGreeter().hi();
    }
}
