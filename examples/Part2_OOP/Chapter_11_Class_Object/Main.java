public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Clean Code";
        b1.author = "Robert C. Martin";
        b1.pages = 464;

        Book b2 = new Book();
        b2.title = "Effective Java";
        b2.author = "Joshua Bloch";
        b2.pages = 412;

        b1.describe();
        b2.describe();
        System.out.println("total books: " + Book.count);
    }
}
