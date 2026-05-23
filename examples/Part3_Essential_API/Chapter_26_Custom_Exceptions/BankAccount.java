public class BankAccount {
    private final String id;
    private int balance;

    public BankAccount(String id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                "withdraw " + amount + " from " + id, amount - balance);
        }
        balance -= amount;
    }
}
