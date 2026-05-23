public class Main {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 5) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();

        int dice;
        int tries = 0;
        do {
            dice = (int) (Math.random() * 6) + 1;
            tries++;
        } while (dice != 6 && tries < 20);
        System.out.println("got 6 after " + tries + " tries");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            if (i > 7) break;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
