package Part2;

import java.util.Scanner;

public class ques1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input: number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scn.nextInt();

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }

        scn.close();
    }
}
