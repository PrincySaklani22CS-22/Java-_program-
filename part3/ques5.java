package part3;

public class ques5 {

    public static void main(String[] args) {
        // Input string with leading zeros
        String input = "00000123569";
        
        // Remove leading zeros and print the result
        String result = removeLeadingZeros(input);
        System.out.println("Output: " + result);
    }

    // Method to remove leading zeros
    public static String removeLeadingZeros(String input) {
        // Regular expression to remove leading zeros
        input = input.replaceFirst("^0+", "");
        
        // If the string becomes empty (case where input was all zeros), return "0"
        return input.isEmpty() ? "0" : input;
    }
}
