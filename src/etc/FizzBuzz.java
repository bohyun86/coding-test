package etc;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            String str = scanner.nextLine();
            if (str.matches("\\d+")) {
                int num = Integer.parseInt(str);
                num = num + (4 - i);

                if (num % 3 == 0 && num % 5 == 0) {
                    System.out.println("FizzBuzz");
                    return;
                } else if (num % 3 == 0) {
                    System.out.println("Fizz");
                    return;
                } else if (num % 5 == 0) {
                    System.out.println("Buzz");
                    return;
                } else {
                    System.out.println(num);
                    return;
                }
            }

        }

    }
}
