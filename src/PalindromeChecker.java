/**
 * PalindromeChecker App
 * Version: 1.0
 * UC6: Queue + Stack Based Palindrome Check
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "radar";

        // Create a Queue (FIFO) and Stack (LIFO)
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);    // enqueue
            stack.push(ch);   // push
        }

        // Compare dequeue (queue) vs pop (stack)
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();  // dequeue
            char fromStack = stack.pop();     // pop

            if (fromQueue != fromStack) {
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