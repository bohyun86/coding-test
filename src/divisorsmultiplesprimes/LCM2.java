package divisorsmultiplesprimes;

import java.util.Scanner;

public class LCM2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long denominator = scanner.nextLong();
        long numerator = scanner.nextLong();
        long remainder = Integer.MAX_VALUE;

        long GCD = getGCD(denominator, numerator, remainder);

        long LGM = denominator * numerator / GCD;

        System.out.println(LGM);


    }


    private static long getGCD(long denominator, long numerator, long remainder) {
        while (remainder != 0) {
            remainder = numerator % denominator;
            numerator = denominator;
            denominator = remainder;
        }
        return numerator;
    }

}
