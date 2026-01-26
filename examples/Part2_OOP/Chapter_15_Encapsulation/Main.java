public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setOwner("Ava");
        account.deposit(100);
        System.out.println(account.getOwner() + " balance: " + account.getBalance());
    }
}

class BankAccount {
    private String owner;
    private int balance;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
