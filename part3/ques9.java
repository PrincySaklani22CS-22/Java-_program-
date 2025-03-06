package part3;

public class ques9 {
    // Function to compute the sum of the primary and secondary diagonals
    public static void computeDiagonalSum(int[][] matrix) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int n = matrix.length; // assuming the matrix is square

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += matrix[i][i]; // Primary diagonal: matrix[i][i]
            secondaryDiagonalSum += matrix[i][n - 1 - i]; // Secondary diagonal: matrix[i][n-1-i]
        }

        System.out.println("Primary Diagonal Sum: " + primaryDiagonalSum);
        System.out.println("Secondary Diagonal Sum: " + secondaryDiagonalSum);
    }

    public static void main(String[] args) {
        // Input matrix
        int[][] matrix = {
            {1, 2, -3},
            {4, 5, 6},
            {7, 8, -9}
        };

        // Compute diagonal sums
        computeDiagonalSum(matrix);
    }
}
