/**
 * PalindromeChecker App
 * Version: 1.0
 * UC7: Deque-Based Optimized Palindrome Checker
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "level";

        // Create a Deque (double-ended queue)
        Deque<Character> deque = new ArrayDeque<>();

        // Insert all characters into the deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        // Compare front and rear characters
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char front = deque.removeFirst();  // remove from front
            char rear = deque.removeLast();    // remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}