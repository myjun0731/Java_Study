public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("홍길동", 10000);
        account.deposit(5000);
        account.withdraw(3000);
        account.withdraw(20000);
        account.displayBalance();
    }
}

class BankAccount {
    private final String owner;
    private int balance;

    public BankAccount(String owner, int initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원 입금되었습니다.");
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        balance -= amount;
        System.out.println(amount + "원 출금되었습니다.");
    }

    public void displayBalance() {
        System.out.println(owner + "님의 잔액: " + balance + "원");
    }
}
