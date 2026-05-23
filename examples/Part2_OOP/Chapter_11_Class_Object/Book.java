public class Book {
    public static int count = 0;

    public String title;
    public String author;
    public int pages;

    public Book() {
        count++;
    }

    public void describe() {
        System.out.println("[" + title + "] by " + author + " (" + pages + "p)");
    }
}
