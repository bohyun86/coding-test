package hash;

import java.util.Scanner;

public class Hash1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력값 받기
        int num = Integer.parseInt(scanner.nextLine());
        char[] list = scanner.nextLine().toCharArray();

        // 상수 정의
        int r = 31;
        int m = 1234567891;

        long hash = 0;
        long power = 1;

        // 해시 값 계산
        for (int i = 0; i < num; i++) {
            int value = list[i] - 'a' + 1;
            hash = (hash + value * power) % m;
            power = (power * r) % m;
        }

        System.out.println(hash);
    }
}
