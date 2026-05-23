public class Main {
    public static void main(String[] args) {
        String day = "WED";

        switch (day) {
            case "MON":
            case "TUE":
            case "WED":
            case "THU":
            case "FRI":
                System.out.println("Weekday");
                break;
            case "SAT":
            case "SUN":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Unknown");
        }

        String label = switch (day) {
            case "MON", "TUE", "WED", "THU", "FRI" -> "Weekday";
            case "SAT", "SUN" -> "Weekend";
            default -> "Unknown";
        };
        System.out.println("label: " + label);

        int month = 5;
        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> throw new IllegalArgumentException("invalid month");
        };
        System.out.println("days: " + days);
    }
}
