package dynamic;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();

            int[][] apartment = new int[k + 1][n + 1];

            for (int j = 0; j <= n; j++) {
                apartment[0][j] = j;
            }

            for (int j = 1; j <= k; j++) {
                for (int l = 1; l <= n; l++) {
                    apartment[j][l] = apartment[j][l - 1] + apartment[j - 1][l];
                }
            }

            System.out.println(apartment[k][n]);

        }

    }
}
