public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.cry();

        Animal dog = new Dog();
        dog.cry();
    }
}

class Animal {
    public void cry() {
        System.out.println("동물이 웁니다");
    }
}

class Cat extends Animal {
    @Override
    public void cry() {
        System.out.println("야옹");
    }
}

class Dog extends Animal {
    @Override
    public void cry() {
        System.out.println("멍멍");
    }
}
