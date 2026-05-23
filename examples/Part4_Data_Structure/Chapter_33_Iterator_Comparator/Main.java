import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Cora", 78));
        students.add(new Student("Ava", 92));
        students.add(new Student("Ben", 85));

        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            System.out.println("iter: " + it.next());
        }

        students.sort(Comparator.comparingInt(Student::score));
        System.out.println("by score asc :");
        students.forEach(s -> System.out.println("  " + s));

        students.sort(Comparator.comparingInt(Student::score).reversed());
        System.out.println("by score desc:");
        students.forEach(s -> System.out.println("  " + s));

        students.sort(Comparator.comparing(Student::name));
        System.out.println("by name      :");
        students.forEach(s -> System.out.println("  " + s));
    }
}
