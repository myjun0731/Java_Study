public class InsufficientFundsException extends Exception {
    private final int shortage;

    public InsufficientFundsException(String message, int shortage) {
        super(message);
        this.shortage = shortage;
    }

    public int getShortage() {
        return shortage;
    }
}
