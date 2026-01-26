public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ava", 20);
        Person defaultPerson = new Person();

        person.introduce();
        defaultPerson.introduce();
    }
}

class Person {
    String name;
    int age;

    Person() {
        this("Unknown", 0);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("Hello, I'm " + name + " and I'm " + age + " years old.");
    }
}
