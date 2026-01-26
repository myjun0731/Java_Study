import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나눗셈의 분자를 입력하세요: ");
        int numerator = scanner.nextInt();
        System.out.print("나눗셈의 분모를 입력하세요: ");
        int denominator = scanner.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println("나눗셈 결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다");
        }
    }
}
