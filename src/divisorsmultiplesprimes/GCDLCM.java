package divisorsmultiplesprimes;

import java.util.Scanner;

public class GCDLCM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();

        int GCD = calculateGCD(Math.max(a, b), Math.min(a, b));
        int LCM = calculateLCM(a, b, GCD);
        System.out.println(GCD);
        System.out.println(LCM);

    }

    private static int calculateGCD(int a, int b) {

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    private static int calculateLCM(int a, int b, int GCD) {
        return a * b / GCD;
    }


}
