package map;

import java.util.*;

public class Map4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalNum = scanner.nextInt();
        int sampleNum = scanner.nextInt();
        scanner.nextLine();

        // 순서가 중요한 경우 LinkedHashMap 사용
        Map<String, String> dogam = new LinkedHashMap<>();
        List<String> samples = new ArrayList<>();

        for (int i = 0; i < totalNum; i++) {
            dogam.put(scanner.nextLine(), String.valueOf(i + 1));
        }

        for (int i = 0; i < sampleNum; i++) {
            samples.add(scanner.nextLine());
        }

        List<String> keys = new ArrayList<>(dogam.keySet());

        samples.stream().map(str -> {
            // 문자열이 숫자인지 여부를 확인
            if (dogam.containsKey(str)) {
                // 키가 있는 경우 해당 값을 반환
                return dogam.get(str);
            } else {
                try {
                    // 키가 없으면 숫자로 파싱 시도
                    int index = Integer.parseInt(str);
                    // 인덱스 유효성 검사 (1-based index를 고려)
                    if (index >= 1 && index <= keys.size()) {
                        return keys.get(index - 1);
                    } else {
                        return "잘못된 인덱스: " + str;
                    }
                } catch (NumberFormatException e) {
                    // 숫자로 파싱할 수 없으면 잘못된 입력 처리
                    return "잘못된 입력: " + str;
                }
            }
        }).forEach(System.out::println);
    }
}
