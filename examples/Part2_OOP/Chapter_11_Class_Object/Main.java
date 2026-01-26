public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Ava";
        person.age = 20;
        person.introduce();
    }
}

class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("Hello, I'm " + name + " and I'm " + age + " years old.");
    }
}
