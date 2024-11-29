package momosInterview;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string containing brackets:");
        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("Invalid input: String is empty.");
            return;
        }

        boolean isValid = validateBrackets(input);
        System.out.println(isValid ? "Valid" : "Invalid");
    }

    private static boolean validateBrackets(String input) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            switch (ch) {
                case '(', '{', '[' -> stack.addLast(ch); // Push opening brackets
                case ')' -> {
                    if (stack.isEmpty() || stack.removeLast() != '(') return false;
                }
                case '}' -> {
                    if (stack.isEmpty() || stack.removeLast() != '{') return false;
                }
                case ']' -> {
                    if (stack.isEmpty() || stack.removeLast() != '[') return false;
                }
                default -> {
                    // Ignore non-bracket characters
                }
            }
        }

        // If stack is empty, all brackets were matched
        return stack.isEmpty();
    }
}
