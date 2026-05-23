public class Account {
    public String publicId;
    String packageOwner;
    protected String protectedType = "SAVINGS";
    private int balance;

    public Account(String id, String owner, int balance) {
        this.publicId = id;
        this.packageOwner = owner;
        this.balance = balance;
    }

    public void showBalance() {
        System.out.println(publicId + " / " + packageOwner + " / balance=" + balance);
    }
}
