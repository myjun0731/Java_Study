import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();

        System.out.println("date: " + today);
        System.out.println("time: " + now);
        System.out.println("dt  : " + dt);

        LocalDate birth = LocalDate.of(1995, 7, 23);
        Period age = Period.between(birth, today);
        System.out.println("age : " + age.getYears() + "y " + age.getMonths() + "m");

        LocalDate next = today.plusDays(30).minusWeeks(2);
        System.out.println("next: " + next);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("fmt : " + dt.format(fmt));

        LocalDate parsed = LocalDate.parse("2026-12-31");
        System.out.println("parsed: " + parsed);

        LocalTime t1 = LocalTime.of(9, 0);
        LocalTime t2 = LocalTime.of(17, 30);
        Duration d = Duration.between(t1, t2);
        System.out.println("work: " + d.toHours() + "h " + d.toMinutesPart() + "m");
    }
}
