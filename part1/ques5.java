package part1;

import java.util.Scanner;

class Complex {
    double real, imag;

    // Constructor
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    // Method to display the complex number
    public void display() {
        System.out.println(this.real + " + " + this.imag + "i");
    }
}

public class ques5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Taking input for first complex number
        System.out.print("Enter real part of first complex number: ");
        double real1 = scn.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double imag1 = scn.nextDouble();

        // Taking input for second complex number
        System.out.print("Enter real part of second complex number: ");
        double real2 = scn.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double imag2 = scn.nextDouble();

        // Creating complex number objects
        Complex c1 = new Complex(real1, imag1);
        Complex c2 = new Complex(real2, imag2);

        // Adding two complex numbers
        Complex sum = c1.add(c2);

        // Displaying the result
        System.out.print("Sum of the complex numbers: ");
        sum.display();

        scn.close();
    }
}
