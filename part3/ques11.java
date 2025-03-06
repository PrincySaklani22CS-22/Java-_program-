package part3;

import java.util.Arrays;
import java.util.Comparator;

public class ques11 {
    // Function to sort the 2D array by a specific column
    public static void sortByColumn(int[][] arr, int col) {
        Arrays.sort(arr, new Comparator<int[]>() {
            // Compare function for sorting based on the given column index
            public int compare(int[] row1, int[] row2) {
                return Integer.compare(row1[col], row2[col]);
            }
        });
    }

    public static void main(String[] args) {
        // Input 2D array
        int[][] arr = {
            {39, 27, 11, 42},
            {10, 93, 91, 90},
            {54, 78, 56, 89},
            {24, 64, 20, 65}
        };
        
        int col = 3;  // The column index to sort by (0-based index)

        // Print original array
        System.out.println("Original Array:");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

        // Sort the array by the specified column
        sortByColumn(arr, col);

        // Print sorted array
        System.out.println("\nSorted Array by column " + col + ":");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
