package momosInterview;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            // 사용자로부터 리스트 입력 받기
            System.out.println("Enter integers separated by spaces:");
            int[] numbers = Arrays.stream(scanner.nextLine().trim().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            // 타겟 숫자 입력 받기
            System.out.println("Enter target number:");
            int target = scanner.nextInt();

            // 두 수의 합이 타겟과 같은 인덱스를 찾기
            findPairs(numbers, target, bufferedWriter);

        } catch (NumberFormatException e) {
            bufferedWriter.write("Invalid input. Please enter valid integers.\n");
        } finally {
            bufferedWriter.flush();
            scanner.close();
            bufferedWriter.close();
        }
    }

    private static void findPairs(int[] numbers, int target, BufferedWriter bufferedWriter) throws IOException {
        boolean foundPair = false;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < target && numbers[j] < target && numbers[i] + numbers[j] == target) {
                    bufferedWriter.write("[" + i + ", " + j + "]\n");
                    foundPair = true;
                }
            }
        }

        if (!foundPair) {
            bufferedWriter.write("No pairs found.\n");
        }
    }
}
