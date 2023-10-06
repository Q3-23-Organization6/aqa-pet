package Homework5;
public class task5 {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, -3, 2},
                {-4, 2, 9},
                {1, -8, -7}
        };
        int l = matrix.length;
        int sum = 0;
        int count = 0;
        for (int i = 1; i < l; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] < 0) {
                    count++;
                }
            }
        }
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (matrix[i][j] % 2 != 0) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Count of negative numbers below diagonal = " + count);
        System.out.println("Sum of odd numbers higher diagonal = " + sum);
    }
}