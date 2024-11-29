package momosInterview;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 2, 3, 4, 4, 5};

        // 중복 제거 및 정렬
        Set<Integer> uniqueNums = Arrays.stream(nums)
                .collect(Collectors.toSet());

        // 결과를 [a, b, c, d, e] 형식으로 출력
        String result = uniqueNums.stream()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println(result);
    }
}
