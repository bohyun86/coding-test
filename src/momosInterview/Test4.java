package momosInterview;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(getResult(n));

    }

    private static int getResult(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return getResult(n - 2) + getResult(n - 1);
    }
}
