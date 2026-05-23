public class Main {
    public static void main(String[] args) {
        Employee[] team = {
            new FullTimeEmployee("Ava", 4_000_000),
            new PartTimeEmployee("Ben", 12_000, 80)
        };

        for (Employee e : team) {
            e.work();
            System.out.println(e.getName() + " pay = " + e.calculatePay());
        }
    }
}
