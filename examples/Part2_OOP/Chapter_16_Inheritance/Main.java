public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.speak();
        dog.fetch();
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

    void fetch() {
        System.out.println(name + " fetches the ball.");
    }
}
