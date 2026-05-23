public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC-1", 10_000);

        try {
            acc.withdraw(3_000);
            System.out.println("balance: " + acc.getBalance());
            acc.withdraw(20_000);
        } catch (InsufficientFundsException e) {
            System.out.println("error: " + e.getMessage() + " (short " + e.getShortage() + ")");
        }
    }
}
