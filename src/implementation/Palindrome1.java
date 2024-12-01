package implementation;

import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                return;
            }

            String reversed = new StringBuilder(input).reverse().toString();
            if (input.equals(reversed)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
