public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Beagle");
        Cat cat = new Cat("Nala");

        dog.eat();
        dog.bark();
        dog.describe();

        cat.eat();
        cat.scratch();
    }
}
