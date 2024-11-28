import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class StreetTrees {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 나무의 개수 입력
        int num = Integer.parseInt(reader.readLine());

        // 첫 번째 나무 위치
        long firstTree = Long.parseLong(reader.readLine());
        long prevTree = firstTree;

        // 초기값 설정
        long gcd = 0;

        // 나무 간격을 기반으로 GCD 계산
        for (int i = 1; i < num; i++) {
            long currentTree = Long.parseLong(reader.readLine());
            long distance = currentTree - prevTree;
            gcd = (gcd == 0) ? distance : calculateGCD(gcd, distance);
            prevTree = currentTree;
        }

        // 전체 나무 사이의 간격
        long totalDistance = prevTree - firstTree;

        // 추가해야 할 나무 개수 계산
        long resultNum = totalDistance / gcd - (num - 1);
        System.out.println(resultNum);
    }

    // 최대 공약수 계산 함수
    private static long calculateGCD(long a, long b) {
        while (b != 0) {
            long remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
