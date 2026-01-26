public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog("Buddy");
        animal.speak();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.fetch();
        }
    }
}

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void speak() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println(name + " barks.");
    }

    void fetch() {
        System.out.println(name + " fetches the ball.");
    }
}
