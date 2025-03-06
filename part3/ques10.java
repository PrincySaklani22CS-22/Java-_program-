package part3;

public class ques10 {
    // Function to print the boundary elements of the matrix
    public static void printBoundary(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Print the top row
        for (int i = 0; i < cols; i++) {
            System.out.print(matrix[0][i] + " ");
        }
        System.out.println();

        // Print the right column, excluding the first and last elements
        for (int i = 1; i < rows - 1; i++) {
            System.out.print(matrix[i][cols - 1] + " ");
            System.out.println(); // Newline after each element in the right column
        }

        // Print the bottom row (if there are at least 2 rows)
        if (rows > 1) {
            for (int i = cols - 1; i >= 0; i--) {
                System.out.print(matrix[rows - 1][i] + " ");
            }
            System.out.println();
        }

        // Print the left column, excluding the first and last elements (if there are at least 2 columns)
        if (cols > 1) {
            for (int i = rows - 2; i > 0; i--) {
                System.out.print(matrix[i][0] + " ");
                System.out.println(); // Newline after each element in the left column
            }
        }
    }

    public static void main(String[] args) {
        // Input matrix
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // Print boundary elements
        printBoundary(matrix);
    }
}
