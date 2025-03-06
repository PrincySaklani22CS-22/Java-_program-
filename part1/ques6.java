package part1;

import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter Principal amount: ");
        double principal = scn.nextDouble();

        System.out.print("Enter Rate of Interest (in %): ");
        double rate = scn.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = scn.nextDouble();

        // Calculating Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Displaying the result
        System.out.println("Simple Interest: " + simpleInterest);

        scn.close();
    }
}

