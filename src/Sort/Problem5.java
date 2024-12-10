package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 첫 번째 배열 크기
        int numA = Integer.parseInt(scanner.nextLine());

        // 첫 번째 배열 입력 및 정렬
        int[] arrayA = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        // 두 번째 배열 크기
        int numB = Integer.parseInt(scanner.nextLine());

        // 두 번째 배열 입력
        int[] arrayB = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // 두 번째 배열의 각 값을 첫 번째 배열에서 이진 탐색
        for (int i : arrayB) {
            System.out.println(binarySearch(arrayA, i));
        }
    }

    static int binarySearch(int[] array, int target) {

        int a = 0; // 시작 인덱스
        int b = array.length - 1; // 끝 인덱스

        // 이진 탐색
        while (a <= b) {
            int mid = (a + b) / 2; // 중간 인덱스 계산

            if (array[mid] == target) {
                return 1; // 값을 찾음
            } else if (target < array[mid]) {
                b = mid - 1; // 중간값보다 작으면 상한선 조정
            } else {
                a = mid + 1; // 중간값보다 크면 하한선 조정
            }
        }

        return 0; // 값을 찾지 못함
    }
}
