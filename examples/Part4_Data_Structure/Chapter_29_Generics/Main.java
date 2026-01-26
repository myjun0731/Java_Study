public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>("Hello");
        System.out.println("Boxed: " + box.getValue());

        Integer number = Box.identity(42);
        System.out.println("Identity: " + number);
    }
}

class Box<T> {
    private final T value;

    Box(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }

    static <T> T identity(T value) {
        return value;
    }
}
