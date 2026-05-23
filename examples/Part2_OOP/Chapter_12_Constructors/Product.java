public class Product {
    private String name;
    private int price;

    public Product() {
        this("Unnamed", 0);
    }

    public Product(String name) {
        this(name, 0);
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product(Product other) {
        this(other.name, other.price);
    }

    public void print() {
        System.out.println(name + " : " + price + " KRW");
    }
}
