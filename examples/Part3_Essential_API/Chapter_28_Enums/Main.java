public class Main {
    public static void main(String[] args) {
        Priority p = Priority.HIGH;
        System.out.println("name    : " + p.name());
        System.out.println("ordinal : " + p.ordinal());
        System.out.println("level   : " + p.getLevel());

        for (Priority value : Priority.values()) {
            System.out.println(" - " + value + " (" + value.getLevel() + ")");
        }

        String msg = switch (p) {
            case LOW -> "can wait";
            case MEDIUM -> "do soon";
            case HIGH -> "do now";
            case CRITICAL -> "drop everything";
        };
        System.out.println("action  : " + msg);

        Priority parsed = Priority.valueOf("MEDIUM");
        System.out.println("parsed  : " + parsed);
    }
}
