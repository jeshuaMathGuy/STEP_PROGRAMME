/**
 * PalindromeChecker App
 * Version: 1.0
 * UC4: Character Array Based Palindrome Check
 */

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "racecar";

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Two-pointer technique
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // Exit early if mismatch found
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}