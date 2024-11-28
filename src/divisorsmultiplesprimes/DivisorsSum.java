package divisorsmultiplesprimes;

import java.util.Scanner;

public class DivisorsSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int numerator1 = scanner.nextInt();
        int denominator1 = scanner.nextInt();
        int numerator2 = scanner.nextInt();
        int denominator2 = scanner.nextInt();

        // 분수 합 계산
        Fraction result = addFractions(numerator1, denominator1, numerator2, denominator2);

        // 결과 출력
        System.out.println(result.numerator + " " + result.denominator);
    }

    // 두 분수를 더하고 기약 분수로 반환
    private static Fraction addFractions(int num1, int den1, int num2, int den2) {
        int gcd = calculateGCD(den1, den2);
        int lcm = den1 * den2 / gcd;

        int resultNumerator = num1 * (lcm / den1) + num2 * (lcm / den2);
        int resultDenominator = lcm;

        // 기약 분수로 변환
        int gcdResult = calculateGCD(resultNumerator, resultDenominator);
        resultNumerator /= gcdResult;
        resultDenominator /= gcdResult;

        return new Fraction(resultNumerator, resultDenominator);
    }

    // 최대 공약수 계산 (유클리드 알고리즘)
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    // 분수를 나타내는 클래스
    private static class Fraction {
        int numerator;
        int denominator;

        Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }
}
