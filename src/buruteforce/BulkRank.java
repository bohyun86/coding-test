package buruteforce;

import java.util.Scanner;

public class BulkRank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력: 사람 수
        int N = scanner.nextInt();
        int[][] people = new int[N][2];
        int[] ranks = new int[N];

        // 사람들의 몸무게와 키 입력받기
        for (int i = 0; i < N; i++) {
            people[i][0] = scanner.nextInt(); // 몸무게
            people[i][1] = scanner.nextInt(); // 키
        }

        // 덩치 등수 계산
        for (int i = 0; i < N; i++) {
            int rank = 1; // 기본 등수는 1
            for (int j = 0; j < N; j++) {
                if (i != j && people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    rank++; // 자신보다 더 큰 덩치가 있으면 등수 증가
                }
            }
            ranks[i] = rank;
        }

        // 결과 출력
        for (int rank : ranks) {
            System.out.print(rank + " ");
        }
    }
}
