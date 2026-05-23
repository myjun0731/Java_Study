public class Main {
    public static void main(String[] args) {
        Document doc = new Document("Report.pdf", 1500);
        doc.print();
        System.out.println("fee = " + doc.calculateFee());

        Printable p = doc;
        p.print();

        Payable pay = doc;
        System.out.println("via Payable: " + pay.calculateFee());
    }
}
