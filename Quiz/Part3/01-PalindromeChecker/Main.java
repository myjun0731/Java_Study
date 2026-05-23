public class Main {
    public static void main(String[] args) {
        String word = "level";
        String reversed = new StringBuilder(word).reverse().toString();
        boolean isPalindrome = word.equals(reversed);
        System.out.println(word + " -> 회문 여부: " + isPalindrome);
    }
}
