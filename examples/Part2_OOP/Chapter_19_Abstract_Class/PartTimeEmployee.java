public class PartTimeEmployee extends Employee {
    private final int hourlyRate;
    private final int hoursWorked;

    public PartTimeEmployee(String name, int hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public int calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
