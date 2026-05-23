public class Main {
    public static void main(String[] args) {
        Book book = new Book("자바 기초", "홍길동", 20000);
        book.displayInfo();
    }
}

class Book {
    private final String title;
    private final String author;
    private final int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("가격: " + price);
    }
}
