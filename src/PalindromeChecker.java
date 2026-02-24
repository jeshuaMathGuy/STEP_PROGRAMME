/**
 * PalindromeChecker App
 * Version: 1.0
 * UC2: Hardcoded Palindrome Check
 */

public class PalindromeChecker {

    public static void main(String[] args) {

        // Hardcoded string literal
        String word = "madam";

        // Reverse the string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Check palindrome condition using if-else
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
    }
}