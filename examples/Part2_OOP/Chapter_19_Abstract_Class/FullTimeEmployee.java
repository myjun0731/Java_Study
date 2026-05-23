public class FullTimeEmployee extends Employee {
    private final int monthlySalary;

    public FullTimeEmployee(String name, int monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int calculatePay() {
        return monthlySalary;
    }
}
