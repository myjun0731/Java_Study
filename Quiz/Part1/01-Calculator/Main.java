import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        int a = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int b = scanner.nextInt();
        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        String operator = scanner.next();

        int result;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("지원하지 않는 연산자입니다.");
                return;
        }

        System.out.println("결과: " + result);
    }
}
