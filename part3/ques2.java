package part3;

import java.util.HashSet;
import java.util.Set;

public class ques2 {

    public static void main(String[] args) {
   
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5};

      
        System.out.println("Original Array:");
        printArray(arr);

        int[] result = removeDuplicates(arr);

        System.out.println("Array After Removing Duplicates:");
        printArray(result);
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
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
