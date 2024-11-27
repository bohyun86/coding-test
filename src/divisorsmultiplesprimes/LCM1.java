package divisorsmultiplesprimes;

import java.util.Arrays;
import java.util.Scanner;

public class LCM1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int denominator = input[0];
            int numerator = input[1];
            int remainder = Integer.MAX_VALUE;

            int GCD = getGCD(denominator, numerator, remainder);

            int LGM = denominator * numerator / GCD;

            System.out.println(LGM);

        }

    }


    private static int getGCD(int denominator, int numerator, int remainder) {
        while (remainder != 0) {
            remainder = numerator % denominator;
            numerator = denominator;
            denominator = remainder;
        }
        return numerator;
    }




}
