package Part2;

public class ques2 {

    public static void main(String[] args) {
        // Input array
        int[] array = {2, 4, 6, 7, 9};

        // Variable to store the sum
        int sum = 0;

        // Loop through the array to calculate the sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i]; // Add each element to the sum
        }

        // Output the sum
        System.out.println("Sum of array elements: " + sum);
    }
}
