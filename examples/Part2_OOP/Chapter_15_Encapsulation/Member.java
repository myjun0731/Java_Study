public class Member {
    private String name;
    private int age;
    private String password;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) return;
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkPassword(String input) {
        return password != null && password.equals(input);
    }
}
