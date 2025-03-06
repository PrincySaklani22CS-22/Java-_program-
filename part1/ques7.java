package part1;
import java.util.Scanner;

public class ques7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input number of rows for Pascal's Triangle
        System.out.print("Enter the number of rows: ");
        int rows = scn.nextInt();

        // Printing Pascal's Triangle
        for (int i = 0; i < rows; i++) {
            // Print spaces for alignment
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Print numbers for the current row
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);  // Using Pascal's Triangle formula
            }
            
            System.out.println();  // Move to the next line
        }

        scn.close();
    }
}
