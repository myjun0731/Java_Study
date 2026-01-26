public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println("matrix[" + row + "][" + col + "] = " + matrix[row][col]);
            }
        }
    }
}
