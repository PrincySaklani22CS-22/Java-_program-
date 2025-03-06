package part3;

public class ques13
{
    // Function to move all zeroes to the end of the array
    public static void moveZeroes(int[] arr) {
        int nonZeroIndex = 0; // Index to place the non-zero elements

        // Traverse the array and move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                // If the element is non-zero, move it to the 'nonZeroIndex'
                if (i != nonZeroIndex) {
                    arr[i] = 0; // Set the current position to zero
                }
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        // Input array
        int[] arr = {1, 2, 0, 0, 0, 3, 6};

        // Print the original array
        System.out.println("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Move zeroes to the end
        moveZeroes(arr);

        // Print the modified array
        System.out.println("Array after moving zeroes to the end: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
