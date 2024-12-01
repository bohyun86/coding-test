package dynamic;

import java.util.Scanner;

public class BinomialCoefficient {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[][] binomialCoefficientList = new int[n + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || j == i) {
                    binomialCoefficientList[i][j] = 1;
                } else {
                    binomialCoefficientList[i][j] = binomialCoefficientList[i - 1][j - 1] + binomialCoefficientList[i - 1][j];
                }
            }
        }

        System.out.println(binomialCoefficientList[n][k]);
    }
}
