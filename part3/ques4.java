package part3;

import java.util.Arrays;

public class ques4 {

    public static void main(String[] args) {
        // Input strings
        String str1 = "Silent";
        String str2 = "Listen";

        // Check if the strings are anagram
        if (areAnagrams(str1, str2)) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are not Anagram");
        }
    }

    // Method to check if two strings are anagram
    public static boolean areAnagrams(String str1, String str2) {
        // If lengths are not the same, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert both strings to lowercase to make the comparison case-insensitive
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Convert the strings to char arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare the sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}
