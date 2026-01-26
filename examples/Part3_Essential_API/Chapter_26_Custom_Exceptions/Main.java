public class Main {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (InvalidAgeException ex) {
            System.out.println("Validation error: " + ex.getMessage());
        }
    }

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
