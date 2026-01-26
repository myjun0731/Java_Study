import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("apple", "사과");
        dictionary.put("banana", "바나나");
        dictionary.put("cherry", "체리");

        String meaning = dictionary.get("apple");
        System.out.println("apple의 뜻: " + meaning);
    }
}
