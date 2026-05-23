public class Main {
    public static void main(String[] args) {
        String sentence = "Java is fun and powerful";
        String[] words = sentence.split(" ");

        System.out.println("총 단어 수: " + words.length);
        for (int i = 0; i < words.length; i++) {
            System.out.println((i + 1) + "번째 단어: " + words[i]);
        }
    }
}
