import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Path path = Path.of("test.txt");

        try {
            Files.writeString(path, "Hello Java");
            String content = Files.readString(path);
            System.out.println("파일 내용: " + content);
        } catch (IOException e) {
            System.out.println("파일 처리 중 오류가 발생했습니다.");
        }
    }
}
