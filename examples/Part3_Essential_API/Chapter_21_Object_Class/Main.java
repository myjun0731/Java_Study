import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("alice", 28);
        User u2 = new User("alice", 28);
        User u3 = new User("bob", 31);

        System.out.println(u1);
        System.out.println("u1.equals(u2): " + u1.equals(u2));
        System.out.println("u1.equals(u3): " + u1.equals(u3));
        System.out.println("hash u1=" + u1.hashCode() + ", u2=" + u2.hashCode());

        Set<User> set = new HashSet<>();
        set.add(u1);
        set.add(u2);
        set.add(u3);
        System.out.println("set size = " + set.size());
    }
}
