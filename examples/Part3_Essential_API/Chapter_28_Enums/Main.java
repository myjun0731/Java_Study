public class Main {
    public static void main(String[] args) {
        Level level = Level.MEDIUM;
        System.out.println("Level: " + level);
        System.out.println("Priority: " + level.getPriority());
    }
}

enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private final int priority;

    Level(int priority) {
        this.priority = priority;
    }

    int getPriority() {
        return priority;
    }
}
