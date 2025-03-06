package part1;

import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input: number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scn.nextInt();

        // Loop for each row
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print stars (*)
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }

        scn.close();
    }
}
