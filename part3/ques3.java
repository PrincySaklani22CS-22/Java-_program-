package part3;

import java.util.ArrayList;

public class ques3 {

    public static void main(String[] args) {
      
        int[] arr = {1, 2, 1, 3, 5, 1};
        int key = 1;

        // Print the original array
        System.out.println("Original Array:");
        printArray(arr);

        int[] result = removeOccurrences(arr, key);

      
        System.out.println("Array After Removing Occurrences of " + key + ":");
        printArray(result);
    }

    
    public static int[] removeOccurrences(int[] arr, int key) {
    
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (num != key) {
                list.add(num);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

