public class Document implements Printable, Payable {
    private final String title;
    private final int pages;

    public Document(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    @Override
    public void print() {
        System.out.println("Printing: " + title + " (" + pages + " pages)");
    }

    @Override
    public int calculateFee() {
        return pages * RATE_PER_PAGE;
    }
}
