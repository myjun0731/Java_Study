import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> name = findUserName(1);
        System.out.println("ID 1: " + name.orElse("이름 없음"));

        Optional<String> missing = findUserName(99);
        missing.ifPresentOrElse(
                value -> System.out.println("ID 99: " + value),
                () -> System.out.println("ID 99: 사용자를 찾을 수 없습니다.")
        );
    }

    static Optional<String> findUserName(int id) {
        if (id == 1) {
            return Optional.of("홍길동");
        }
        return Optional.empty();
    }
}
