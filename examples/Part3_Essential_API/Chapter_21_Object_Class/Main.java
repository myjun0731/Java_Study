import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Notebook", 10);
        Item item2 = new Item("Notebook", 10);

        System.out.println(item1);
        System.out.println("Equals: " + item1.equals(item2));
        System.out.println("HashCodes: " + item1.hashCode() + ", " + item2.hashCode());
    }
}

class Item {
    private final String name;
    private final int quantity;

    Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item other = (Item) obj;
        return quantity == other.quantity && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantity);
    }

    @Override
    public String toString() {
        return "Item{name='" + name + "', quantity=" + quantity + "}";
    }
}
