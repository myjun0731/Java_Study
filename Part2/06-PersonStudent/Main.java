public class Main {
    public static void main(String[] args) {
        Student student = new Student("김민지", 21, "컴퓨터공학");
        student.introduce();
    }
}

class Person {
    protected final String name;
    protected final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }
}

class Student extends Person {
    private final String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("전공: " + major);
    }
}
