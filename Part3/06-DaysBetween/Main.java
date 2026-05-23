import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 31);

        long days = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println(startDate + " 부터 " + endDate + " 까지: " + days + "일");
    }
}
