public class Main {
    public static void main(String[] args) {
        String s = "Hello, Java World";

        System.out.println("length     : " + s.length());
        System.out.println("upper      : " + s.toUpperCase());
        System.out.println("lower      : " + s.toLowerCase());
        System.out.println("contains   : " + s.contains("Java"));
        System.out.println("indexOf    : " + s.indexOf("Java"));
        System.out.println("substring  : " + s.substring(7, 11));
        System.out.println("replace    : " + s.replace("Java", "Kotlin"));
        System.out.println("startsWith : " + s.startsWith("Hello"));

        String csv = "apple,banana,cherry";
        for (String token : csv.split(",")) {
            System.out.println("token: " + token);
        }

        String a = "java";
        String b = "java";
        String c = new String("java");
        System.out.println("a == b      : " + (a == b));
        System.out.println("a == c      : " + (a == c));
        System.out.println("a.equals(c) : " + a.equals(c));

        String joined = String.join("-", "2026", "05", "23");
        System.out.println("join       : " + joined);
        System.out.println("format     : " + String.format("%s is %d", "Ava", 28));
    }
}
