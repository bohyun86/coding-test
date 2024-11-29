package momosInterview;

import java.util.Scanner;

public class Test4_1 {

    // 동적 프로그래밍 방식으로 해결

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = Integer.parseInt(scanner.nextLine().trim());

        if (n <= 0) {
            System.out.println("Invalid input: n must be a positive integer.");
            return;
        }

        System.out.println("Fibonacci number at position " + n + ": " + getFibonacci(n));
    }

    private static int getFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        // 배열을 사용한 동적 프로그래밍 방식
        int[] fib = new int[n + 1];
        fib[1] = 1;
        fib[2] = 1;

        for (int i = 3; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }
}
