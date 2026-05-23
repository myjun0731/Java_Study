public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Keyboard");
        Product p3 = new Product("Mouse", 29_900);
        Product p4 = new Product(p3);

        p1.print();
        p2.print();
        p3.print();
        p4.print();
    }
}
