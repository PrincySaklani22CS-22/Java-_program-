package part1;
import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Choose 1: Decimal to Binary");
        System.out.println("Choose 2: Binary to Decimal");
        int a = scn.nextInt(); // User choice

        System.out.print("Enter the value: ");
        int b = scn.nextInt(); // User input number

        if (a == 1) {  // Decimal to Binary
            System.out.println("Binary equivalent: " + Integer.toBinaryString(b));
        } else if (a == 2) {  // Binary to Decimal
            try {
                int decimal = Integer.parseInt(String.valueOf(b), 2);
                System.out.println("Decimal equivalent: " + decimal);
            } catch (NumberFormatException e) {
                System.out.println("Invalid binary number.");
            }
        } else {
            System.out.println("Invalid choice.");
        }

        scn.close();
    }
}
