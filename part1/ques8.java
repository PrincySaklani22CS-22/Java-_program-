package part1;

import java.util.Scanner;

public class ques8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = fibonacciSum(n);
        System.out.println("Sum of Fibonacci series up to " + n + " terms is: " + sum);

        scn.close();
    }

    public static int fibonacciSum(int n) {
        if (n <= 0) {
            return 0; // If n is 0 or negative, return 0
        }

        int a = 0, b = 1, sum = a + b;

        for (int i = 2; i < n; i++) {
            int next = a + b;
            sum += next;
            a = b;
            b = next;
        }

        return sum;
    }
}
