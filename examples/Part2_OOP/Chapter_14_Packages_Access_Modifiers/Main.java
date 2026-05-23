public class Main {
    public static void main(String[] args) {
        Account acc = new Account("ACC-001", "Ava", 1000);

        System.out.println(acc.publicId);
        System.out.println(acc.packageOwner);
        System.out.println(acc.protectedType);

        acc.showBalance();
    }
}
