import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("sample.txt");

        Files.write(path, List.of("line 1", "line 2", "line 3"));

        List<String> lines = Files.readAllLines(path);
        System.out.println("readAllLines:");
        lines.forEach(l -> System.out.println("  " + l));

        try (BufferedWriter w = Files.newBufferedWriter(path)) {
            w.write("written via BufferedWriter\n");
            w.write("second line\n");
        }

        try (BufferedReader r = Files.newBufferedReader(path)) {
            String line;
            System.out.println("BufferedReader:");
            while ((line = r.readLine()) != null) {
                System.out.println("  " + line);
            }
        }

        try (Stream<String> stream = Files.lines(path)) {
            long count = stream.count();
            System.out.println("line count: " + count);
        }

        System.out.println("exists : " + Files.exists(path));
        System.out.println("size   : " + Files.size(path) + " bytes");

        Files.deleteIfExists(path);
        System.out.println("after del: " + Files.exists(path));
    }
}
