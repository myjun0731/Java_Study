public class Main {
    public static void main(String[] args) {
        Member m = new Member("Ava", 28);

        System.out.println(m.getName() + " / " + m.getAge());

        m.setAge(30);
        m.setAge(-5);
        System.out.println("after setAge: " + m.getAge());

        m.setPassword("1234");
        System.out.println("login(1234): " + m.checkPassword("1234"));
        System.out.println("login(abcd): " + m.checkPassword("abcd"));
    }
}
