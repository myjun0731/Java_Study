public class Main {
    public static void main(String[] args) {
        AccessSample sample = new AccessSample();
        sample.publicMessage();
        sample.showDefaultMessage();
        sample.showProtectedMessage();
    }
}

class AccessSample {
    private String privateMessage = "Private";
    String defaultMessage = "Default"; // package-private
    protected String protectedMessage = "Protected";
    public String publicMessage = "Public";

    public void publicMessage() {
        System.out.println("Public: " + publicMessage);
        System.out.println("Private: " + privateMessage);
    }

    void showDefaultMessage() {
        System.out.println("Default: " + defaultMessage);
    }

    protected void showProtectedMessage() {
        System.out.println("Protected: " + protectedMessage);
    }
}
