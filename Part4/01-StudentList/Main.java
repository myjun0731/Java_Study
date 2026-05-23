import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("김철수");
        students.add("이영희");
        students.add("박민수");
        students.add("최지우");
        students.add("정하늘");

        students.remove("박민수");

        for (String student : students) {
            System.out.println("학생: " + student);
        }
    }
}
