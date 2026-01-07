package lesson3;

public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int len = matrix.length;

        int mainDiagonalSum = 0;
        int helperDiagonalSum = 0;

        for (int i = 0; i < len; i++) {
            mainDiagonalSum += matrix[i][i];
            helperDiagonalSum += matrix[i][len - 1 - i];
        }

        System.out.println("Sum of main diagonal: " + mainDiagonalSum);
        System.out.println("Sum of helper diagonal: " + helperDiagonalSum);
    }
}
