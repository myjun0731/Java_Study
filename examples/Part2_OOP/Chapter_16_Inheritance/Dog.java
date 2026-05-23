public class Dog extends Animal {
    private final String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " barks: woof!");
    }

    public void describe() {
        System.out.println(name + " is a " + breed);
    }
}
