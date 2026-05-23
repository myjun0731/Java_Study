public class Box<T> {
    private final T value;

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public static <T> T identity(T value) {
        return value;
    }
}
