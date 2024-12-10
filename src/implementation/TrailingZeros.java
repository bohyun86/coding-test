package implementation;

import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = 0;

        for (int i = 5; i <= num; i *= 5) {
            count += num / i;
        }

        System.out.println(count);
    }
}
