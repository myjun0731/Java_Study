public class Main {
    public static void main(String[] args) {
        try {
            checkAge(15);
            checkAge(25);
        } catch (InvalidAgeException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 19) {
            throw new InvalidAgeException("19세 미만은 가입할 수 없습니다. 입력 나이: " + age);
        }
        System.out.println(age + "세, 가입 가능합니다.");
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
